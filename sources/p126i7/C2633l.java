package p126i7;

import java.util.Arrays;
import p109h7.C2428k;

/* renamed from: i7.l */
/* loaded from: classes.dex */
public final class C2633l {
    /* renamed from: a */
    public static Object m10689a(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i10);
    }

    /* renamed from: b */
    public static int m10690b(int i10, int i11) {
        return i10 & (~i11);
    }

    /* renamed from: c */
    public static int m10691c(int i10, int i11) {
        return i10 & i11;
    }

    /* renamed from: d */
    public static int m10692d(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    /* renamed from: e */
    public static int m10693e(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    /* renamed from: f */
    public static int m10694f(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int m10735c = C2645r.m10735c(obj);
        int i13 = m10735c & i10;
        int m10696h = m10696h(obj3, i13);
        if (m10696h == 0) {
            return -1;
        }
        int m10690b = m10690b(m10735c, i10);
        int i14 = -1;
        while (true) {
            i11 = m10696h - 1;
            i12 = iArr[i11];
            if (m10690b(i12, i10) != m10690b || !C2428k.m9688a(obj, objArr[i11]) || (objArr2 != null && !C2428k.m9688a(obj2, objArr2[i11]))) {
                int m10691c = m10691c(i12, i10);
                if (m10691c == 0) {
                    return -1;
                }
                i14 = i11;
                m10696h = m10691c;
            }
        }
        int m10691c2 = m10691c(i12, i10);
        if (i14 == -1) {
            m10697i(obj3, i13, m10691c2);
        } else {
            iArr[i14] = m10692d(iArr[i14], m10691c2, i10);
        }
        return i11;
    }

    /* renamed from: g */
    public static void m10695g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: h */
    public static int m10696h(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & 255 : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    /* renamed from: i */
    public static void m10697i(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    /* renamed from: j */
    public static int m10698j(int i10) {
        return Math.max(4, C2645r.m10733a(i10 + 1, 1.0d));
    }
}
