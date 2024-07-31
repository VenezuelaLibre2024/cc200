package com.mr.flutter.plugin.filepicker;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.mr.flutter.plugin.filepicker.C1396a;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: com.mr.flutter.plugin.filepicker.c */
/* loaded from: classes.dex */
public class C1398c {
    /* renamed from: a */
    public static boolean m5987a(Context context) {
        try {
            File[] listFiles = new File(context.getCacheDir() + "/file_picker/").listFiles();
            if (listFiles == null) {
                return true;
            }
            for (File file : listFiles) {
                file.delete();
            }
            return true;
        } catch (Exception e10) {
            Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e10.toString());
            return false;
        }
    }

    /* renamed from: b */
    public static Uri m5988b(Uri uri, int i10, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            try {
                File m5989c = m5989c();
                Bitmap decodeStream = BitmapFactory.decodeStream(openInputStream);
                FileOutputStream fileOutputStream = new FileOutputStream(m5989c);
                decodeStream.compress(Bitmap.CompressFormat.JPEG, i10, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                Uri fromFile = Uri.fromFile(m5989c);
                if (openInputStream != null) {
                    openInputStream.close();
                }
                return fromFile;
            } finally {
            }
        } catch (FileNotFoundException e10) {
            throw new RuntimeException(e10);
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* renamed from: c */
    public static File m5989c() {
        return File.createTempFile("JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_", ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    /* renamed from: d */
    public static String m5990d(Class<?> cls, Object obj) {
        if (Build.VERSION.SDK_INT < 30) {
            return (String) cls.getMethod("getPath", new Class[0]).invoke(obj, new Object[0]);
        }
        File file = (File) cls.getMethod("getDirectory", new Class[0]).invoke(obj, new Object[0]);
        if (file != null) {
            return file.getPath();
        }
        return null;
    }

    @TargetApi(21)
    /* renamed from: e */
    public static String m5991e(Uri uri) {
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        return (split.length < 2 || split[1] == null) ? File.separator : split[1];
    }

    /* renamed from: f */
    public static String m5992f(Uri uri, Context context) {
        String str = null;
        try {
            if (uri.getScheme().equals("content")) {
                Cursor query = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                        }
                    } finally {
                        query.close();
                    }
                }
            }
            if (str != null) {
                return str;
            }
            String path = uri.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        } catch (Exception e10) {
            Log.e("FilePickerUtils", "Failed to handle file name: " + e10.toString());
            return null;
        }
    }

    /* renamed from: g */
    public static String m5993g(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 30 && m5997k(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (documentId.equals("downloads")) {
                return path;
            }
            if (!documentId.matches("^ms[df]\\:.*")) {
                if (documentId.startsWith("raw:")) {
                    return documentId.split(":")[1];
                }
                return null;
            }
            return path + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + m5992f(uri, context);
        }
        String m5996j = m5996j(m5995i(uri), context);
        new C1396a.a();
        if (m5996j == null) {
            return File.separator;
        }
        String str = File.separator;
        if (m5996j.endsWith(str)) {
            m5996j = m5996j.substring(0, m5996j.length() - 1);
        }
        String m5991e = m5991e(uri);
        if (m5991e.endsWith(str)) {
            m5991e = m5991e.substring(0, m5991e.length() - 1);
        }
        if (m5991e.length() <= 0) {
            return m5996j;
        }
        if (m5991e.startsWith(str)) {
            return m5996j + m5991e;
        }
        return m5996j + str + m5991e;
    }

    /* renamed from: h */
    public static String[] m5994h(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(arrayList.get(i10));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type " + arrayList.get(i10) + " is unsupported and will be ignored.");
            } else {
                arrayList2.add(mimeTypeFromExtension);
            }
        }
        Log.d("FilePickerUtils", "Allowed file extensions mimes: " + arrayList2);
        return (String[]) arrayList2.toArray(new String[0]);
    }

    @TargetApi(21)
    /* renamed from: i */
    public static String m5995i(Uri uri) {
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    /* renamed from: j */
    public static String m5996j(String str, Context context) {
        Class<?> cls;
        Method method;
        Method method2;
        Object invoke;
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            cls = Class.forName("android.os.storage.StorageVolume");
            Method method3 = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            method = cls.getMethod("getUuid", new Class[0]);
            method2 = cls.getMethod("isPrimary", new Class[0]);
            invoke = method3.invoke(storageManager, new Object[0]);
        } catch (Exception unused) {
        }
        if (invoke == null) {
            return null;
        }
        int length = Array.getLength(invoke);
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = Array.get(invoke, i10);
            String str2 = (String) method.invoke(obj, new Object[0]);
            if (((Boolean) method2.invoke(obj, new Object[0])) != null && "primary".equals(str)) {
                return m5990d(cls, obj);
            }
            if (str2 != null && str2.equals(str)) {
                return m5990d(cls, obj);
            }
        }
        return null;
    }

    /* renamed from: k */
    public static boolean m5997k(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: l */
    public static void m5998l(File file, C1396a.a aVar) {
        String str;
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
            } catch (FileNotFoundException e10) {
                str = "File not found: " + e10.getMessage();
                Log.e("FilePickerUtils", str, null);
                aVar.m5963b(bArr);
            } catch (IOException e11) {
                str = "Failed to close file streams: " + e11.getMessage();
                Log.e("FilePickerUtils", str, null);
                aVar.m5963b(bArr);
            }
            aVar.m5963b(bArr);
        } catch (Exception e12) {
            Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e12.toString() + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
        }
    }

    /* renamed from: m */
    public static C1396a m5999m(Context context, Uri uri, boolean z10) {
        FileOutputStream fileOutputStream;
        StringBuilder sb2;
        String str;
        Log.i("FilePickerUtils", "Caching from URI: " + uri.toString());
        C1396a.a aVar = new C1396a.a();
        String m5992f = m5992f(uri, context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getCacheDir().getAbsolutePath());
        sb3.append("/file_picker/");
        sb3.append(System.currentTimeMillis());
        sb3.append(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
        sb3.append(m5992f != null ? m5992f : "unamed");
        String sb4 = sb3.toString();
        File file = new File(sb4);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            try {
                fileOutputStream = new FileOutputStream(sb4);
                try {
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        fileOutputStream.getFD().sync();
                    } catch (Exception e10) {
                        e = e10;
                        try {
                            fileOutputStream.close();
                            sb2 = new StringBuilder();
                            str = "Failed to retrieve path: ";
                        } catch (IOException | NullPointerException unused) {
                            sb2 = new StringBuilder();
                            str = "Failed to close file streams: ";
                        }
                        sb2.append(str);
                        sb2.append(e.getMessage());
                        Log.e("FilePickerUtils", sb2.toString(), null);
                        return null;
                    }
                } catch (Throwable th) {
                    fileOutputStream.getFD().sync();
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            }
        }
        Log.d("FilePickerUtils", "File loaded and cached at:" + sb4);
        if (z10) {
            m5998l(file, aVar);
        }
        aVar.m5965d(sb4).m5964c(m5992f).m5967f(uri).m5966e(Long.parseLong(String.valueOf(file.length())));
        return aVar.m5962a();
    }
}
