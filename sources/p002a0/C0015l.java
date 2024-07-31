package p002a0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p102h0.C2279g;

/* renamed from: a0.l */
/* loaded from: classes.dex */
public class C0015l {

    /* renamed from: a0.l$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static ParcelFileDescriptor m96a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    /* renamed from: a */
    public static void m88a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static ByteBuffer m89b(Context context, Resources resources, int i10) {
        File m92e = m92e(context);
        if (m92e == null) {
            return null;
        }
        try {
            if (m90c(m92e, resources, i10)) {
                return m94g(m92e);
            }
            return null;
        } finally {
            m92e.delete();
        }
    }

    /* renamed from: c */
    public static boolean m90c(File file, Resources resources, int i10) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i10);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean m91d = m91d(file, inputStream);
            m88a(inputStream);
            return m91d;
        } catch (Throwable th2) {
            th = th2;
            m88a(inputStream);
            throw th;
        }
    }

    /* renamed from: d */
    public static boolean m91d(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            m88a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    }
                } catch (IOException e10) {
                    e = e10;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    m88a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    m88a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e11) {
            e = e11;
        }
    }

    /* renamed from: e */
    public static File m92e(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i10 = 0; i10 < 100; i10++) {
            File file = new File(cacheDir, str + i10);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static ByteBuffer m93f(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor m96a = a.m96a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (m96a == null) {
                if (m96a != null) {
                    m96a.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(m96a.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    m96a.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static ByteBuffer m94g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: h */
    public static Map<Uri, ByteBuffer> m95h(Context context, C2279g.b[] bVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (C2279g.b bVar : bVarArr) {
            if (bVar.m9271b() == 0) {
                Uri m9273d = bVar.m9273d();
                if (!hashMap.containsKey(m9273d)) {
                    hashMap.put(m9273d, m93f(context, cancellationSignal, m9273d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
