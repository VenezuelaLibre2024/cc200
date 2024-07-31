package p297uc;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p346y0.C5787a;

/* renamed from: uc.f */
/* loaded from: classes2.dex */
public class C5008f {

    /* renamed from: b */
    public static final byte[] f18728b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    public static final int[] f18729c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    public final b f18730a;

    /* renamed from: uc.f$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public final ByteBuffer f18731a;

        public a(byte[] bArr, int i10) {
            this.f18731a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        /* renamed from: a */
        public short m19632a(int i10) {
            return this.f18731a.getShort(i10);
        }

        /* renamed from: b */
        public int m19633b(int i10) {
            return this.f18731a.getInt(i10);
        }

        /* renamed from: c */
        public int m19634c() {
            return this.f18731a.remaining();
        }

        /* renamed from: d */
        public void m19635d(ByteOrder byteOrder) {
            this.f18731a.order(byteOrder);
        }
    }

    /* renamed from: uc.f$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        int mo19636a();

        /* renamed from: b */
        int mo19637b(byte[] bArr, int i10);

        /* renamed from: c */
        short mo19638c();

        /* renamed from: e */
        long mo19639e(long j10);
    }

    /* renamed from: uc.f$c */
    /* loaded from: classes2.dex */
    public static class c implements b {

        /* renamed from: a */
        public final InputStream f18732a;

        public c(InputStream inputStream) {
            this.f18732a = inputStream;
        }

        @Override // p297uc.C5008f.b
        /* renamed from: a */
        public int mo19636a() {
            return ((this.f18732a.read() << 8) & 65280) | (this.f18732a.read() & 255);
        }

        @Override // p297uc.C5008f.b
        /* renamed from: b */
        public int mo19637b(byte[] bArr, int i10) {
            int i11 = i10;
            while (i11 > 0) {
                int read = this.f18732a.read(bArr, i10 - i11, i11);
                if (read == -1) {
                    break;
                }
                i11 -= read;
            }
            return i10 - i11;
        }

        @Override // p297uc.C5008f.b
        /* renamed from: c */
        public short mo19638c() {
            return (short) (this.f18732a.read() & 255);
        }

        @Override // p297uc.C5008f.b
        /* renamed from: e */
        public long mo19639e(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f18732a.skip(j11);
                if (skip <= 0) {
                    if (this.f18732a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    public C5008f(InputStream inputStream) {
        this.f18730a = new c(inputStream);
    }

    /* renamed from: a */
    public static int m19620a(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0069 -> B:13:0x0070). Please report as a decompilation issue!!! */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m19621b(android.content.Context r4, int r5, int r6, android.net.Uri r7, android.net.Uri r8) {
        /*
            java.lang.String r0 = "ImageHeaderParser"
            if (r4 != 0) goto La
            java.lang.String r4 = "context is null"
            android.util.Log.d(r0, r4)
            return
        La:
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            java.io.InputStream r7 = r2.openInputStream(r7)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4b
            y0.a r2 = new y0.a     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.lang.String r3 = "rw"
            android.os.ParcelFileDescriptor r1 = r4.openFileDescriptor(r8, r3)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            y0.a r4 = new y0.a     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            java.io.FileDescriptor r8 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            m19625f(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            if (r7 == 0) goto L3c
            r7.close()     // Catch: java.io.IOException -> L34
            goto L3c
        L34:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L3c:
            r1.close()     // Catch: java.io.IOException -> L68
            goto L70
        L40:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L72
        L44:
            r4 = move-exception
            r5 = r1
            r1 = r7
            goto L4d
        L48:
            r4 = move-exception
            r5 = r1
            goto L72
        L4b:
            r4 = move-exception
            r5 = r1
        L4d:
            java.lang.String r6 = r4.getMessage()     // Catch: java.lang.Throwable -> L71
            android.util.Log.d(r0, r6, r4)     // Catch: java.lang.Throwable -> L71
            if (r1 == 0) goto L62
            r1.close()     // Catch: java.io.IOException -> L5a
            goto L62
        L5a:
            r4 = move-exception
            java.lang.String r6 = r4.getMessage()
            android.util.Log.d(r0, r6, r4)
        L62:
            if (r5 == 0) goto L70
            r5.close()     // Catch: java.io.IOException -> L68
            goto L70
        L68:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            android.util.Log.d(r0, r5, r4)
        L70:
            return
        L71:
            r4 = move-exception
        L72:
            if (r1 == 0) goto L80
            r1.close()     // Catch: java.io.IOException -> L78
            goto L80
        L78:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            android.util.Log.d(r0, r7, r6)
        L80:
            if (r5 == 0) goto L8e
            r5.close()     // Catch: java.io.IOException -> L86
            goto L8e
        L86:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            android.util.Log.d(r0, r6, r5)
        L8e:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p297uc.C5008f.m19621b(android.content.Context, int, int, android.net.Uri, android.net.Uri):void");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0037 -> B:11:0x003e). Please report as a decompilation issue!!! */
    /* renamed from: c */
    public static void m19622c(Context context, int i10, int i11, Uri uri, String str) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = context.getContentResolver().openInputStream(uri);
                    m19625f(new C5787a(inputStream), new C5787a(str), i10, i11);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e10) {
                            Log.d("ImageHeaderParser", e10.getMessage(), e10);
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                Log.d("ImageHeaderParser", e11.getMessage(), e11);
            }
        } catch (IOException e12) {
            Log.d("ImageHeaderParser", e12.getMessage(), e12);
            if (inputStream == null) {
            } else {
                inputStream.close();
            }
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0036 -> B:10:0x003d). Please report as a decompilation issue!!! */
    /* renamed from: d */
    public static void m19623d(Context context, C5787a c5787a, int i10, int i11, Uri uri) {
        if (context == null) {
            Log.d("ImageHeaderParser", "context is null");
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                try {
                    parcelFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
                    m19625f(c5787a, new C5787a(parcelFileDescriptor.getFileDescriptor()), i10, i11);
                    parcelFileDescriptor.close();
                } catch (Throwable th) {
                    if (parcelFileDescriptor != null) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e10) {
                            Log.d("ImageHeaderParser", e10.getMessage(), e10);
                        }
                    }
                    throw th;
                }
            } catch (IOException e11) {
                Log.d("ImageHeaderParser", e11.getMessage());
                if (parcelFileDescriptor == null) {
                } else {
                    parcelFileDescriptor.close();
                }
            }
        } catch (IOException e12) {
            Log.d("ImageHeaderParser", e12.getMessage(), e12);
        }
    }

    /* renamed from: e */
    public static void m19624e(C5787a c5787a, int i10, int i11, String str) {
        try {
            m19625f(c5787a, new C5787a(str), i10, i11);
        } catch (IOException e10) {
            Log.d("ImageHeaderParser", e10.getMessage());
        }
    }

    /* renamed from: f */
    public static void m19625f(C5787a c5787a, C5787a c5787a2, int i10, int i11) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i12 = 0; i12 < 22; i12++) {
            String str = strArr[i12];
            String m23129d = c5787a.m23129d(str);
            if (!TextUtils.isEmpty(m23129d)) {
                c5787a2.m23120U(str, m23129d);
            }
        }
        c5787a2.m23120U("ImageWidth", String.valueOf(i10));
        c5787a2.m23120U("ImageLength", String.valueOf(i11));
        c5787a2.m23120U("Orientation", "0");
        c5787a2.m23116Q();
    }

    /* renamed from: h */
    public static boolean m19626h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m19627k(p297uc.C5008f.a r12) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p297uc.C5008f.m19627k(uc.f$a):int");
    }

    /* renamed from: g */
    public int m19628g() {
        int mo19636a = this.f18730a.mo19636a();
        if (m19626h(mo19636a)) {
            int m19630j = m19630j();
            if (m19630j != -1) {
                return m19631l(new byte[m19630j], m19630j);
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + mo19636a);
        }
        return -1;
    }

    /* renamed from: i */
    public final boolean m19629i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f18728b.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f18728b;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    /* renamed from: j */
    public final int m19630j() {
        short mo19638c;
        int mo19636a;
        long j10;
        long mo19639e;
        do {
            short mo19638c2 = this.f18730a.mo19638c();
            if (mo19638c2 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) mo19638c2));
                }
                return -1;
            }
            mo19638c = this.f18730a.mo19638c();
            if (mo19638c == 218) {
                return -1;
            }
            if (mo19638c == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            mo19636a = this.f18730a.mo19636a() - 2;
            if (mo19638c == 225) {
                return mo19636a;
            }
            j10 = mo19636a;
            mo19639e = this.f18730a.mo19639e(j10);
        } while (mo19639e == j10);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) mo19638c) + ", wanted to skip: " + mo19636a + ", but actually skipped: " + mo19639e);
        }
        return -1;
    }

    /* renamed from: l */
    public final int m19631l(byte[] bArr, int i10) {
        int mo19637b = this.f18730a.mo19637b(bArr, i10);
        if (mo19637b == i10) {
            if (m19629i(bArr, i10)) {
                return m19627k(new a(bArr, i10));
            }
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + mo19637b);
        }
        return -1;
    }
}
