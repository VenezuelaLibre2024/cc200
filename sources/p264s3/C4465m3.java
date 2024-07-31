package p264s3;

import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: s3.m3 */
/* loaded from: classes.dex */
public final class C4465m3 {

    /* renamed from: c */
    public static final C4465m3 f16549c;

    /* renamed from: d */
    public static final C4465m3 f16550d;

    /* renamed from: e */
    public static final C4465m3 f16551e;

    /* renamed from: f */
    public static final C4465m3 f16552f;

    /* renamed from: g */
    public static final C4465m3 f16553g;

    /* renamed from: a */
    public final long f16554a;

    /* renamed from: b */
    public final long f16555b;

    static {
        C4465m3 c4465m3 = new C4465m3(0L, 0L);
        f16549c = c4465m3;
        f16550d = new C4465m3(Long.MAX_VALUE, Long.MAX_VALUE);
        f16551e = new C4465m3(Long.MAX_VALUE, 0L);
        f16552f = new C4465m3(0L, Long.MAX_VALUE);
        f16553g = c4465m3;
    }

    public C4465m3(long j10, long j11) {
        C4014a.m15195a(j10 >= 0);
        C4014a.m15195a(j11 >= 0);
        this.f16554a = j10;
        this.f16555b = j11;
    }

    /* renamed from: a */
    public long m17482a(long j10, long j11, long j12) {
        long j13 = this.f16554a;
        if (j13 == 0 && this.f16555b == 0) {
            return j10;
        }
        long m15432T0 = C4041n0.m15432T0(j10, j13, Long.MIN_VALUE);
        long m15447b = C4041n0.m15447b(j10, this.f16555b, Long.MAX_VALUE);
        boolean z10 = m15432T0 <= j11 && j11 <= m15447b;
        boolean z11 = m15432T0 <= j12 && j12 <= m15447b;
        return (z10 && z11) ? Math.abs(j11 - j10) <= Math.abs(j12 - j10) ? j11 : j12 : z10 ? j11 : z11 ? j12 : m15432T0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4465m3.class != obj.getClass()) {
            return false;
        }
        C4465m3 c4465m3 = (C4465m3) obj;
        return this.f16554a == c4465m3.f16554a && this.f16555b == c4465m3.f16555b;
    }

    public int hashCode() {
        return (((int) this.f16554a) * 31) + ((int) this.f16555b);
    }
}
