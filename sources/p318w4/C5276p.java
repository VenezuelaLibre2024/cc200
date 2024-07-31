package p318w4;

import p079f6.C1841a;
import p206o5.C3916m;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p264s3.C4463m1;
import p333x3.C5564e;
import p333x3.InterfaceC5559b0;

/* renamed from: w4.p */
/* loaded from: classes.dex */
public final class C5276p extends AbstractC5261a {

    /* renamed from: o */
    public final int f20019o;

    /* renamed from: p */
    public final C4463m1 f20020p;

    /* renamed from: q */
    public long f20021q;

    /* renamed from: r */
    public boolean f20022r;

    public C5276p(InterfaceC3910j interfaceC3910j, C3918n c3918n, C4463m1 c4463m1, int i10, Object obj, long j10, long j11, long j12, int i11, C4463m1 c4463m12) {
        super(interfaceC3910j, c3918n, c4463m1, i10, obj, j10, j11, -9223372036854775807L, -9223372036854775807L, j12);
        this.f20019o = i11;
        this.f20020p = c4463m12;
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: b */
    public void mo14817b() {
        C5263c m21301j = m21301j();
        m21301j.m21308b(0L);
        InterfaceC5559b0 mo21309e = m21301j.mo21309e(0, this.f20019o);
        mo21309e.mo4852b(this.f20020p);
        try {
            long mo14770k = this.f19974i.mo14770k(this.f19967b.m14856e(this.f20021q));
            if (mo14770k != -1) {
                mo14770k += this.f20021q;
            }
            C5564e c5564e = new C5564e(this.f19974i, this.f20021q, mo14770k);
            for (int i10 = 0; i10 != -1; i10 = mo21309e.m22407c(c5564e, C1841a.e.API_PRIORITY_OTHER, true)) {
                this.f20021q += i10;
            }
            mo21309e.mo4851a(this.f19972g, 1, (int) this.f20021q, 0, null);
            C3916m.m14847a(this.f19974i);
            this.f20022r = true;
        } catch (Throwable th) {
            C3916m.m14847a(this.f19974i);
            throw th;
        }
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: c */
    public void mo14818c() {
    }

    @Override // p318w4.AbstractC5274n
    /* renamed from: h */
    public boolean mo21353h() {
        return this.f20022r;
    }
}
