package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.v */
/* loaded from: classes.dex */
public final class C2331v implements InterfaceC2302b0 {

    /* renamed from: a */
    public C4463m1 f9552a;

    /* renamed from: b */
    public C4033j0 f9553b;

    /* renamed from: c */
    public InterfaceC5559b0 f9554c;

    public C2331v(String str) {
        this.f9552a = new C4463m1.b().m17474g0(str).m17448G();
    }

    @Override // p106h4.InterfaceC2302b0
    /* renamed from: a */
    public void mo9331a(C4015a0 c4015a0) {
        m9488c();
        long m15365d = this.f9553b.m15365d();
        long m15366e = this.f9553b.m15366e();
        if (m15365d == -9223372036854775807L || m15366e == -9223372036854775807L) {
            return;
        }
        C4463m1 c4463m1 = this.f9552a;
        if (m15366e != c4463m1.f16510w) {
            C4463m1 m17448G = c4463m1.m17411b().m17478k0(m15366e).m17448G();
            this.f9552a = m17448G;
            this.f9554c.mo4852b(m17448G);
        }
        int m15226a = c4015a0.m15226a();
        this.f9554c.m22408e(c4015a0, m15226a);
        this.f9554c.mo4851a(m15365d, 1, m15226a, 0, null);
    }

    @Override // p106h4.InterfaceC2302b0
    /* renamed from: b */
    public void mo9332b(C4033j0 c4033j0, InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        this.f9553b = c4033j0;
        dVar.m9412a();
        InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(dVar.m9414c(), 5);
        this.f9554c = mo3032e;
        mo3032e.mo4852b(this.f9552a);
    }

    /* renamed from: c */
    public final void m9488c() {
        C4014a.m15202h(this.f9553b);
        C4041n0.m15463j(this.f9554c);
    }
}
