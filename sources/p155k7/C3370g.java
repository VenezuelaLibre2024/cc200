package p155k7;

import p109h7.C2432o;

/* renamed from: k7.g */
/* loaded from: classes.dex */
public final class C3370g {
    /* renamed from: a */
    public static int m12537a(long j10, long j11) {
        if (j10 < j11) {
            return -1;
        }
        return j10 > j11 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m12538b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* renamed from: c */
    public static long m12539c(long... jArr) {
        C2432o.m9698d(jArr.length > 0);
        long j10 = jArr[0];
        for (int i10 = 1; i10 < jArr.length; i10++) {
            if (jArr[i10] > j10) {
                j10 = jArr[i10];
            }
        }
        return j10;
    }
}
