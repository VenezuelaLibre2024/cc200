package p343xd;

/* renamed from: xd.k */
/* loaded from: classes2.dex */
public class C5767k extends C5766j {
    /* renamed from: a */
    public static final int m22904a(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    /* renamed from: b */
    public static final long m22905b(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    /* renamed from: c */
    public static final int m22906c(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    /* renamed from: d */
    public static final long m22907d(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    /* renamed from: e */
    public static final int m22908e(int i10, int i11, int i12) {
        if (i11 <= i12) {
            return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i12 + " is less than minimum " + i11 + '.');
    }

    /* renamed from: f */
    public static final long m22909f(long j10, long j11, long j12) {
        if (j11 <= j12) {
            return j10 < j11 ? j11 : j10 > j12 ? j12 : j10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j12 + " is less than minimum " + j11 + '.');
    }

    /* renamed from: g */
    public static final C5760d m22910g(int i10, int i11) {
        return C5760d.f21333k.m22894a(i10, i11, -1);
    }

    /* renamed from: h */
    public static final C5762f m22911h(int i10, int i11) {
        return i11 <= Integer.MIN_VALUE ? C5762f.f21341l.m22899a() : new C5762f(i10, i11 - 1);
    }
}
