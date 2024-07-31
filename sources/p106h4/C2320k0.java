package p106h4;

import java.util.List;
import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p264s3.C4463m1;
import p333x3.C5558b;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.k0 */
/* loaded from: classes.dex */
public final class C2320k0 {

    /* renamed from: a */
    public final List<C4463m1> f9376a;

    /* renamed from: b */
    public final InterfaceC5559b0[] f9377b;

    public C2320k0(List<C4463m1> list) {
        this.f9376a = list;
        this.f9377b = new InterfaceC5559b0[list.size()];
    }

    /* renamed from: a */
    public void m9427a(long j10, C4015a0 c4015a0) {
        if (c4015a0.m15226a() < 9) {
            return;
        }
        int m15241p = c4015a0.m15241p();
        int m15241p2 = c4015a0.m15241p();
        int m15210G = c4015a0.m15210G();
        if (m15241p == 434 && m15241p2 == 1195456820 && m15210G == 3) {
            C5558b.m22405b(j10, c4015a0, this.f9377b);
        }
    }

    /* renamed from: b */
    public void m9428b(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        for (int i10 = 0; i10 < this.f9377b.length; i10++) {
            dVar.m9412a();
            InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(dVar.m9414c(), 3);
            C4463m1 c4463m1 = this.f9376a.get(i10);
            String str = c4463m1.f16506s;
            C4014a.m15196b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            mo3032e.mo4852b(new C4463m1.b().m17462U(dVar.m9413b()).m17474g0(str).m17476i0(c4463m1.f16498k).m17465X(c4463m1.f16497j).m17449H(c4463m1.f16490K).m17463V(c4463m1.f16508u).m17448G());
            this.f9377b[i10] = mo3032e;
        }
    }
}
