package p062e4;

import p222p5.C4041n0;
import p222p5.C4047s;
import p333x3.C5557a0;
import p333x3.InterfaceC5586z;

/* renamed from: e4.b */
/* loaded from: classes.dex */
public final class C1651b implements InterfaceC1656g {

    /* renamed from: a */
    public final long f6085a;

    /* renamed from: b */
    public final C4047s f6086b;

    /* renamed from: c */
    public final C4047s f6087c;

    /* renamed from: d */
    public long f6088d;

    public C1651b(long j10, long j11, long j12) {
        this.f6088d = j10;
        this.f6085a = j12;
        C4047s c4047s = new C4047s();
        this.f6086b = c4047s;
        C4047s c4047s2 = new C4047s();
        this.f6087c = c4047s2;
        c4047s.m15535a(0L);
        c4047s2.m15535a(j11);
    }

    @Override // p062e4.InterfaceC1656g
    /* renamed from: a */
    public long mo6550a(long j10) {
        return this.f6086b.m15536b(C4041n0.m15457g(this.f6087c, j10, true, true));
    }

    /* renamed from: b */
    public boolean m6552b(long j10) {
        C4047s c4047s = this.f6086b;
        return j10 - c4047s.m15536b(c4047s.m15537c() - 1) < 100000;
    }

    /* renamed from: c */
    public void m6553c(long j10, long j11) {
        if (m6552b(j10)) {
            return;
        }
        this.f6086b.m15535a(j10);
        this.f6087c.m15535a(j11);
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f6088d;
    }

    @Override // p062e4.InterfaceC1656g
    /* renamed from: e */
    public long mo6551e() {
        return this.f6085a;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return true;
    }

    /* renamed from: g */
    public void m6554g(long j10) {
        this.f6088d = j10;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        int m15457g = C4041n0.m15457g(this.f6086b, j10, true, true);
        C5557a0 c5557a0 = new C5557a0(this.f6086b.m15536b(m15457g), this.f6087c.m15536b(m15457g));
        if (c5557a0.f20851a == j10 || m15457g == this.f6086b.m15537c() - 1) {
            return new InterfaceC5586z.a(c5557a0);
        }
        int i10 = m15457g + 1;
        return new InterfaceC5586z.a(c5557a0, new C5557a0(this.f6086b.m15536b(i10), this.f6087c.m15536b(i10)));
    }
}
