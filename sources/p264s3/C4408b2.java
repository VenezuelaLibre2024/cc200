package p264s3;

import p222p5.C4014a;
import p222p5.C4041n0;
import p290u4.InterfaceC4882t;

/* renamed from: s3.b2 */
/* loaded from: classes.dex */
public final class C4408b2 {

    /* renamed from: a */
    public final InterfaceC4882t.b f16168a;

    /* renamed from: b */
    public final long f16169b;

    /* renamed from: c */
    public final long f16170c;

    /* renamed from: d */
    public final long f16171d;

    /* renamed from: e */
    public final long f16172e;

    /* renamed from: f */
    public final boolean f16173f;

    /* renamed from: g */
    public final boolean f16174g;

    /* renamed from: h */
    public final boolean f16175h;

    /* renamed from: i */
    public final boolean f16176i;

    public C4408b2(InterfaceC4882t.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        C4014a.m15195a(!z13 || z11);
        C4014a.m15195a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        C4014a.m15195a(z14);
        this.f16168a = bVar;
        this.f16169b = j10;
        this.f16170c = j11;
        this.f16171d = j12;
        this.f16172e = j13;
        this.f16173f = z10;
        this.f16174g = z11;
        this.f16175h = z12;
        this.f16176i = z13;
    }

    /* renamed from: a */
    public C4408b2 m17070a(long j10) {
        return j10 == this.f16170c ? this : new C4408b2(this.f16168a, this.f16169b, j10, this.f16171d, this.f16172e, this.f16173f, this.f16174g, this.f16175h, this.f16176i);
    }

    /* renamed from: b */
    public C4408b2 m17071b(long j10) {
        return j10 == this.f16169b ? this : new C4408b2(this.f16168a, j10, this.f16170c, this.f16171d, this.f16172e, this.f16173f, this.f16174g, this.f16175h, this.f16176i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4408b2.class != obj.getClass()) {
            return false;
        }
        C4408b2 c4408b2 = (C4408b2) obj;
        return this.f16169b == c4408b2.f16169b && this.f16170c == c4408b2.f16170c && this.f16171d == c4408b2.f16171d && this.f16172e == c4408b2.f16172e && this.f16173f == c4408b2.f16173f && this.f16174g == c4408b2.f16174g && this.f16175h == c4408b2.f16175h && this.f16176i == c4408b2.f16176i && C4041n0.m15449c(this.f16168a, c4408b2.f16168a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f16168a.hashCode()) * 31) + ((int) this.f16169b)) * 31) + ((int) this.f16170c)) * 31) + ((int) this.f16171d)) * 31) + ((int) this.f16172e)) * 31) + (this.f16173f ? 1 : 0)) * 31) + (this.f16174g ? 1 : 0)) * 31) + (this.f16175h ? 1 : 0)) * 31) + (this.f16176i ? 1 : 0);
    }
}
