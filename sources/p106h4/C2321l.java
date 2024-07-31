package p106h4;

import java.util.Collections;
import java.util.List;
import p106h4.InterfaceC2316i0;
import p222p5.C4015a0;
import p264s3.C4463m1;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.l */
/* loaded from: classes.dex */
public final class C2321l implements InterfaceC2322m {

    /* renamed from: a */
    public final List<InterfaceC2316i0.a> f9378a;

    /* renamed from: b */
    public final InterfaceC5559b0[] f9379b;

    /* renamed from: c */
    public boolean f9380c;

    /* renamed from: d */
    public int f9381d;

    /* renamed from: e */
    public int f9382e;

    /* renamed from: f */
    public long f9383f = -9223372036854775807L;

    public C2321l(List<InterfaceC2316i0.a> list) {
        this.f9378a = list;
        this.f9379b = new InterfaceC5559b0[list.size()];
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        if (this.f9380c) {
            if (this.f9381d != 2 || m9429b(c4015a0, 32)) {
                if (this.f9381d != 1 || m9429b(c4015a0, 0)) {
                    int m15231f = c4015a0.m15231f();
                    int m15226a = c4015a0.m15226a();
                    for (InterfaceC5559b0 interfaceC5559b0 : this.f9379b) {
                        c4015a0.m15223T(m15231f);
                        interfaceC5559b0.m22408e(c4015a0, m15226a);
                    }
                    this.f9382e += m15226a;
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m9429b(C4015a0 c4015a0, int i10) {
        if (c4015a0.m15226a() == 0) {
            return false;
        }
        if (c4015a0.m15210G() != i10) {
            this.f9380c = false;
        }
        this.f9381d--;
        return this.f9380c;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        this.f9380c = false;
        this.f9383f = -9223372036854775807L;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
        if (this.f9380c) {
            if (this.f9383f != -9223372036854775807L) {
                for (InterfaceC5559b0 interfaceC5559b0 : this.f9379b) {
                    interfaceC5559b0.mo4851a(this.f9383f, 1, this.f9382e, 0, null);
                }
            }
            this.f9380c = false;
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        for (int i10 = 0; i10 < this.f9379b.length; i10++) {
            InterfaceC2316i0.a aVar = this.f9378a.get(i10);
            dVar.m9412a();
            InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(dVar.m9414c(), 3);
            mo3032e.mo4852b(new C4463m1.b().m17462U(dVar.m9413b()).m17474g0("application/dvbsubs").m17463V(Collections.singletonList(aVar.f9353c)).m17465X(aVar.f9351a).m17448G());
            this.f9379b[i10] = mo3032e;
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f9380c = true;
        if (j10 != -9223372036854775807L) {
            this.f9383f = j10;
        }
        this.f9382e = 0;
        this.f9381d = 2;
    }
}
