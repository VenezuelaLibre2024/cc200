package p346y0;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.Os;
import android.util.Log;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: y0.b */
/* loaded from: classes.dex */
public class C5788b {

    /* renamed from: y0.b$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m23185a(FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }

        /* renamed from: b */
        public static FileDescriptor m23186b(FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }

        /* renamed from: c */
        public static long m23187c(FileDescriptor fileDescriptor, long j10, int i10) {
            return Os.lseek(fileDescriptor, j10, i10);
        }
    }

    /* renamed from: y0.b$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static void m23188a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

    /* renamed from: a */
    public static void m23179a(FileDescriptor fileDescriptor) {
        String str;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                a.m23185a(fileDescriptor);
                return;
            } catch (Exception unused) {
                str = "Error closing fd.";
            }
        } else {
            str = "closeFileDescriptor is called in API < 21, which must be wrong.";
        }
        Log.e("ExifInterfaceUtils", str);
    }

    /* renamed from: b */
    public static void m23180b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    public static long[] m23181c(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            jArr[i10] = iArr[i10];
        }
        return jArr;
    }

    /* renamed from: d */
    public static int m23182d(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i10;
            }
            i10 += read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: e */
    public static void m23183e(InputStream inputStream, OutputStream outputStream, int i10) {
        byte[] bArr = new byte[8192];
        while (i10 > 0) {
            int min = Math.min(i10, 8192);
            int read = inputStream.read(bArr, 0, min);
            if (read != min) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i10 -= read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: f */
    public static boolean m23184f(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr2.length; i10++) {
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }
}
