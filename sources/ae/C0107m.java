package ae;

import td.C4753m;

/* renamed from: ae.m */
/* loaded from: classes2.dex */
public class C0107m extends C0106l {
    /* renamed from: f */
    public static final Integer m420f(String str) {
        C4753m.m18653f(str, "<this>");
        return m421g(str, 10);
    }

    /* renamed from: g */
    public static final Integer m421g(String str, int i10) {
        boolean z10;
        int i11;
        C4753m.m18653f(str, "<this>");
        C0095a.m400a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        int i13 = -2147483647;
        int i14 = 1;
        if (C4753m.m18655h(charAt, 48) >= 0) {
            z10 = false;
            i14 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                i13 = Integer.MIN_VALUE;
                z10 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z10 = false;
            }
        }
        int i15 = -59652323;
        while (i14 < length) {
            int m401b = C0095a.m401b(str.charAt(i14), i10);
            if (m401b < 0) {
                return null;
            }
            if ((i12 < i15 && (i15 != -59652323 || i12 < (i15 = i13 / i10))) || (i11 = i12 * i10) < i13 + m401b) {
                return null;
            }
            i12 = i11 - m401b;
            i14++;
        }
        return z10 ? Integer.valueOf(i12) : Integer.valueOf(-i12);
    }

    /* renamed from: h */
    public static final Long m422h(String str) {
        C4753m.m18653f(str, "<this>");
        return m423i(str, 10);
    }

    /* renamed from: i */
    public static final Long m423i(String str, int i10) {
        C4753m.m18653f(str, "<this>");
        C0095a.m400a(i10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i11 = 0;
        char charAt = str.charAt(0);
        long j10 = -9223372036854775807L;
        boolean z10 = true;
        if (C4753m.m18655h(charAt, 48) >= 0) {
            z10 = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                j10 = Long.MIN_VALUE;
                i11 = 1;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z10 = false;
                i11 = 1;
            }
        }
        long j11 = -256204778801521550L;
        long j12 = 0;
        long j13 = -256204778801521550L;
        while (i11 < length) {
            int m401b = C0095a.m401b(str.charAt(i11), i10);
            if (m401b < 0) {
                return null;
            }
            if (j12 < j13) {
                if (j13 == j11) {
                    j13 = j10 / i10;
                    if (j12 < j13) {
                    }
                }
                return null;
            }
            long j14 = j12 * i10;
            long j15 = m401b;
            if (j14 < j10 + j15) {
                return null;
            }
            j12 = j14 - j15;
            i11++;
            j11 = -256204778801521550L;
        }
        return z10 ? Long.valueOf(j12) : Long.valueOf(-j12);
    }
}
