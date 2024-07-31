package p071ef;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: ef.a */
/* loaded from: classes2.dex */
public class C1788a {
    /* renamed from: a */
    public static void m7224a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    public static String m7225b(Context context, Uri uri, String str, String[] strArr) {
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndexOrThrow("_data"));
                        query.close();
                        return string;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (query != null) {
                query.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m7226d(android.content.Context r4, android.net.Uri r5) {
        /*
            r0 = 0
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L45
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L45
            java.lang.String r2 = "image_picker"
            java.lang.String r3 = "jpg"
            java.io.File r4 = r4.getCacheDir()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            java.io.File r4 = java.io.File.createTempFile(r2, r3, r4)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L31
            r2.<init>(r4)     // Catch: java.io.IOException -> L2f java.lang.Throwable -> L31
            if (r5 == 0) goto L24
            m7224a(r5, r2)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L48
            r3 = 1
            goto L25
        L22:
            r4 = move-exception
            goto L33
        L24:
            r3 = r0
        L25:
            if (r5 == 0) goto L2a
            r5.close()     // Catch: java.io.IOException -> L2a
        L2a:
            r2.close()     // Catch: java.io.IOException -> L52
            r0 = r3
            goto L52
        L2f:
            r2 = r1
            goto L48
        L31:
            r4 = move-exception
            r2 = r1
        L33:
            r1 = r5
            goto L3a
        L35:
            r4 = r1
            r2 = r4
            goto L48
        L38:
            r4 = move-exception
            r2 = r1
        L3a:
            if (r1 == 0) goto L3f
            r1.close()     // Catch: java.io.IOException -> L3f
        L3f:
            if (r2 == 0) goto L44
            r2.close()     // Catch: java.io.IOException -> L44
        L44:
            throw r4
        L45:
            r4 = r1
            r5 = r4
            r2 = r5
        L48:
            if (r5 == 0) goto L4d
            r5.close()     // Catch: java.io.IOException -> L4d
        L4d:
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L52
        L52:
            if (r0 == 0) goto L58
            java.lang.String r1 = r4.getPath()
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p071ef.C1788a.m7226d(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* renamed from: f */
    public static boolean m7227f(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: g */
    public static boolean m7228g(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: h */
    public static boolean m7229h(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    /* renamed from: i */
    public static boolean m7230i(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public final String m7231c(Context context, Uri uri) {
        Uri uri2 = null;
        if ((Build.VERSION.SDK_INT >= 19) && DocumentsContract.isDocumentUri(context, uri)) {
            if (m7228g(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + split[1];
                }
            } else if (m7227f(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return m7225b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException unused) {
                        return null;
                    }
                }
            } else if (m7230i(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return m7225b(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return m7229h(uri) ? uri.getLastPathSegment() : m7225b(context, uri, null, null);
            }
            if (Constants.FILE.equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    /* renamed from: e */
    public String m7232e(Context context, Uri uri) {
        String m7231c = m7231c(context, uri);
        return m7231c == null ? m7226d(context, uri) : m7231c;
    }
}
