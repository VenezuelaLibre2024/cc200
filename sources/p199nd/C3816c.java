package p199nd;

/* renamed from: nd.c */
/* loaded from: classes2.dex */
public final class C3816c {
    /* renamed from: a */
    public static final int m14515a(int i10, int i11, int i12) {
        return m14519e(m14519e(i10, i12) - m14519e(i11, i12), i12);
    }

    /* renamed from: b */
    public static final long m14516b(long j10, long j11, long j12) {
        return m14520f(m14520f(j10, j12) - m14520f(j11, j12), j12);
    }

    /* renamed from: c */
    public static final int m14517c(int i10, int i11, int i12) {
        if (i12 > 0) {
            return i10 >= i11 ? i11 : i11 - m14515a(i11, i10, i12);
        }
        if (i12 < 0) {
            return i10 <= i11 ? i11 : i11 + m14515a(i10, i11, -i12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: d */
    public static final long m14518d(long j10, long j11, long j12) {
        if (j12 > 0) {
            return j10 >= j11 ? j11 : j11 - m14516b(j11, j10, j12);
        }
        if (j12 < 0) {
            return j10 <= j11 ? j11 : j11 + m14516b(j10, j11, -j12);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: e */
    public static final int m14519e(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    /* renamed from: f */
    public static final long m14520f(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}
