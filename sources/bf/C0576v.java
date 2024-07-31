package bf;

import java.nio.charset.Charset;

/* renamed from: bf.v */
/* loaded from: classes2.dex */
public final class C0576v {

    /* renamed from: a */
    public static final Charset f2555a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static boolean m2920a(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            if (bArr[i13 + i10] != bArr2[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static void m2921b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(j12)));
        }
    }

    /* renamed from: c */
    public static int m2922c(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    /* renamed from: d */
    public static short m2923d(short s10) {
        int i10 = s10 & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    /* renamed from: e */
    public static void m2924e(Throwable th) {
        m2925f(th);
    }

    /* renamed from: f */
    public static <T extends Throwable> void m2925f(Throwable th) {
        throw th;
    }
}
