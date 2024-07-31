package p365z4;

import p222p5.C4014a;
import p264s3.C4468n1;
import p290u4.InterfaceC4869m0;
import p304v3.C5110g;

/* renamed from: z4.m */
/* loaded from: classes.dex */
public final class C5982m implements InterfaceC4869m0 {

    /* renamed from: h */
    public final int f22278h;

    /* renamed from: i */
    public final C5986q f22279i;

    /* renamed from: j */
    public int f22280j = -1;

    public C5982m(C5986q c5986q, int i10) {
        this.f22279i = c5986q;
        this.f22278h = i10;
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: a */
    public void mo19250a() {
        int i10 = this.f22280j;
        if (i10 == -2) {
            throw new C5988s(this.f22279i.m24046s().m19452b(this.f22278h).m19444b(0).f16506s);
        }
        if (i10 == -1) {
            this.f22279i.m24021T();
        } else if (i10 != -3) {
            this.f22279i.m24022U(i10);
        }
    }

    /* renamed from: b */
    public void m23997b() {
        C4014a.m15195a(this.f22280j == -1);
        this.f22280j = this.f22279i.m24049x(this.f22278h);
    }

    /* renamed from: c */
    public final boolean m23998c() {
        int i10 = this.f22280j;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    /* renamed from: d */
    public void m23999d() {
        if (this.f22280j != -1) {
            this.f22279i.m24044o0(this.f22278h);
            this.f22280j = -1;
        }
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: e */
    public boolean mo19252e() {
        return this.f22280j == -3 || (m23998c() && this.f22279i.m24017P(this.f22280j));
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: j */
    public int mo19253j(C4468n1 c4468n1, C5110g c5110g, int i10) {
        if (this.f22280j == -3) {
            c5110g.m20743i(4);
            return -4;
        }
        if (m23998c()) {
            return this.f22279i.m24032d0(this.f22280j, c4468n1, c5110g, i10);
        }
        return -3;
    }

    @Override // p290u4.InterfaceC4869m0
    /* renamed from: n */
    public int mo19254n(long j10) {
        if (m23998c()) {
            return this.f22279i.m24043n0(this.f22280j, j10);
        }
        return 0;
    }
}
