package p094g4;

import p222p5.C4014a;
import p222p5.C4015a0;
import p264s3.C4499t2;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;

/* renamed from: g4.d */
/* loaded from: classes.dex */
public class C1989d implements InterfaceC5571k {

    /* renamed from: d */
    public static final InterfaceC5576p f7921d = new InterfaceC5576p() { // from class: g4.c
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m8034d;
            m8034d = C1989d.m8034d();
            return m8034d;
        }
    };

    /* renamed from: a */
    public InterfaceC5573m f7922a;

    /* renamed from: b */
    public AbstractC1994i f7923b;

    /* renamed from: c */
    public boolean f7924c;

    /* renamed from: d */
    public static /* synthetic */ InterfaceC5571k[] m8034d() {
        return new InterfaceC5571k[]{new C1989d()};
    }

    /* renamed from: e */
    public static C4015a0 m8035e(C4015a0 c4015a0) {
        c4015a0.m15223T(0);
        return c4015a0;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f7922a = interfaceC5573m;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        AbstractC1994i abstractC1994i = this.f7923b;
        if (abstractC1994i != null) {
            abstractC1994i.m8058m(j10, j11);
        }
    }

    /* renamed from: f */
    public final boolean m8036f(InterfaceC5572l interfaceC5572l) {
        AbstractC1994i c1993h;
        C1991f c1991f = new C1991f();
        if (c1991f.m8043a(interfaceC5572l, true) && (c1991f.f7931b & 2) == 2) {
            int min = Math.min(c1991f.f7938i, 8);
            C4015a0 c4015a0 = new C4015a0(min);
            interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, min);
            if (C1987b.m8027p(m8035e(c4015a0))) {
                c1993h = new C1987b();
            } else if (C1995j.m8062r(m8035e(c4015a0))) {
                c1993h = new C1995j();
            } else if (C1993h.m8048o(m8035e(c4015a0))) {
                c1993h = new C1993h();
            }
            this.f7923b = c1993h;
            return true;
        }
        return false;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        C4014a.m15202h(this.f7922a);
        if (this.f7923b == null) {
            if (!m8036f(interfaceC5572l)) {
                throw C4499t2.m17594a("Failed to determine bitstream type", null);
            }
            interfaceC5572l.mo22427l();
        }
        if (!this.f7924c) {
            InterfaceC5559b0 mo3032e = this.f7922a.mo3032e(0, 1);
            this.f7922a.mo3034n();
            this.f7923b.m8052d(this.f7922a, mo3032e);
            this.f7924c = true;
        }
        return this.f7923b.m8054g(interfaceC5572l, c5585y);
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        try {
            return m8036f(interfaceC5572l);
        } catch (C4499t2 unused) {
            return false;
        }
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
