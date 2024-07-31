package p222p5;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: p5.e */
/* loaded from: classes.dex */
public final class C4022e {

    /* renamed from: a */
    public static final byte[] f14463a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f14464b = {"", "A", "B", "C"};

    /* renamed from: a */
    public static String m15277a(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    /* renamed from: b */
    public static List<byte[]> m15278b(boolean z10) {
        return Collections.singletonList(z10 ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m15279c(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        Object[] objArr = new Object[5];
        objArr[0] = f14464b[i10];
        objArr[1] = Integer.valueOf(i11);
        objArr[2] = Integer.valueOf(i12);
        objArr[3] = Character.valueOf(z10 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i13);
        StringBuilder sb2 = new StringBuilder(C4041n0.m15397C("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static byte[] m15280d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f14463a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    /* renamed from: e */
    public static int m15281e(byte[] bArr, int i10) {
        int length = bArr.length - f14463a.length;
        while (i10 <= length) {
            if (m15282f(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m15282f(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f14463a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f14463a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m15283g(byte[] bArr) {
        C4015a0 c4015a0 = new C4015a0(bArr);
        c4015a0.m15223T(9);
        int m15210G = c4015a0.m15210G();
        c4015a0.m15223T(20);
        return Pair.create(Integer.valueOf(c4015a0.m15214K()), Integer.valueOf(m15210G));
    }

    /* renamed from: h */
    public static boolean m15284h(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    /* renamed from: i */
    public static byte[][] m15285i(byte[] bArr) {
        if (!m15282f(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        do {
            arrayList.add(Integer.valueOf(i10));
            i10 = m15281e(bArr, i10 + f14463a.length);
        } while (i10 != -1);
        byte[][] bArr2 = new byte[arrayList.size()];
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i11)).intValue();
            int intValue2 = (i11 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i11 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i11] = bArr3;
            i11++;
        }
        return bArr2;
    }
}
