package p289u3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u3.g0 */
/* loaded from: classes.dex */
public class C4818g0 {
    /* renamed from: a */
    public static List<byte[]> m19069a(byte[] bArr) {
        long m19076h = m19076h(m19074f(bArr));
        long m19076h2 = m19076h(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m19070b(m19076h));
        arrayList.add(m19070b(m19076h2));
        return arrayList;
    }

    /* renamed from: b */
    public static byte[] m19070b(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }

    /* renamed from: c */
    public static int m19071c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* renamed from: d */
    public static long m19072d(byte b10, byte b11) {
        int i10 = b10 & 255;
        int i11 = i10 & 3;
        int i12 = 2;
        if (i11 == 0) {
            i12 = 1;
        } else if (i11 != 1 && i11 != 2) {
            i12 = b11 & 63;
        }
        int i13 = i10 >> 3;
        return i12 * (i13 >= 16 ? 2500 << r0 : i13 >= 12 ? 10000 << (r0 & 1) : (i13 & 3) == 3 ? 60000 : 10000 << r0);
    }

    /* renamed from: e */
    public static long m19073e(byte[] bArr) {
        return m19072d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    /* renamed from: f */
    public static int m19074f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* renamed from: g */
    public static int m19075g(ByteBuffer byteBuffer) {
        return (int) ((m19072d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    /* renamed from: h */
    public static long m19076h(long j10) {
        return (j10 * 1000000000) / 48000;
    }
}
