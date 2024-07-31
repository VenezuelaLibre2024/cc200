package p116he;

import ae.C0107m;
import p079f6.C1841a;

/* renamed from: he.o0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2544o0 {
    /* renamed from: a */
    public static final int m10135a(String str, int i10, int i11, int i12) {
        return (int) C2540m0.m10114c(str, i10, i11, i12);
    }

    /* renamed from: b */
    public static final long m10136b(String str, long j10, long j11, long j12) {
        String m10115d = C2540m0.m10115d(str);
        if (m10115d == null) {
            return j10;
        }
        Long m422h = C0107m.m422h(m10115d);
        if (m422h == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + m10115d + '\'').toString());
        }
        long longValue = m422h.longValue();
        boolean z10 = false;
        if (j11 <= longValue && longValue <= j12) {
            z10 = true;
        }
        if (z10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
    }

    /* renamed from: c */
    public static final String m10137c(String str, String str2) {
        String m10115d = C2540m0.m10115d(str);
        return m10115d == null ? str2 : m10115d;
    }

    /* renamed from: d */
    public static final boolean m10138d(String str, boolean z10) {
        String m10115d = C2540m0.m10115d(str);
        return m10115d != null ? Boolean.parseBoolean(m10115d) : z10;
    }

    /* renamed from: e */
    public static /* synthetic */ int m10139e(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = C1841a.e.API_PRIORITY_OTHER;
        }
        return C2540m0.m10113b(str, i10, i11, i12);
    }

    /* renamed from: f */
    public static /* synthetic */ long m10140f(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return C2540m0.m10114c(str, j10, j13, j12);
    }
}
