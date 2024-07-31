package p318w4;

import p206o5.C3915l0;
import p206o5.C3916m;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p264s3.C4463m1;
import p318w4.InterfaceC5267g;
import p333x3.C5564e;

/* renamed from: w4.m */
/* loaded from: classes.dex */
public final class C5273m extends AbstractC5266f {

    /* renamed from: j */
    public final InterfaceC5267g f20013j;

    /* renamed from: k */
    public InterfaceC5267g.b f20014k;

    /* renamed from: l */
    public long f20015l;

    /* renamed from: m */
    public volatile boolean f20016m;

    public C5273m(InterfaceC3910j interfaceC3910j, C3918n c3918n, C4463m1 c4463m1, int i10, Object obj, InterfaceC5267g interfaceC5267g) {
        super(interfaceC3910j, c3918n, 2, c4463m1, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f20013j = interfaceC5267g;
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: b */
    public void mo14817b() {
        if (this.f20015l == 0) {
            this.f20013j.mo21314b(this.f20014k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C3918n m14856e = this.f19967b.m14856e(this.f20015l);
            C3915l0 c3915l0 = this.f19974i;
            C5564e c5564e = new C5564e(c3915l0, m14856e.f14077g, c3915l0.mo14770k(m14856e));
            while (!this.f20016m && this.f20013j.mo21313a(c5564e)) {
                try {
                } finally {
                    this.f20015l = c5564e.getPosition() - this.f19967b.f14077g;
                }
            }
        } finally {
            C3916m.m14847a(this.f19974i);
        }
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: c */
    public void mo14818c() {
        this.f20016m = true;
    }

    /* renamed from: g */
    public void m21358g(InterfaceC5267g.b bVar) {
        this.f20014k = bVar;
    }
}
