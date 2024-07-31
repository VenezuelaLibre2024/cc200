package p031c4;

import p077f4.C1830k;
import p152k4.C3348a;
import p222p5.C4014a;
import p222p5.C4015a0;
import p235q4.C4164b;
import p264s3.C4463m1;
import p333x3.C5585y;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5586z;

/* renamed from: c4.a */
/* loaded from: classes.dex */
public final class C0608a implements InterfaceC5571k {

    /* renamed from: b */
    public InterfaceC5573m f2653b;

    /* renamed from: c */
    public int f2654c;

    /* renamed from: d */
    public int f2655d;

    /* renamed from: e */
    public int f2656e;

    /* renamed from: g */
    public C4164b f2658g;

    /* renamed from: h */
    public InterfaceC5572l f2659h;

    /* renamed from: i */
    public C0610c f2660i;

    /* renamed from: j */
    public C1830k f2661j;

    /* renamed from: a */
    public final C4015a0 f2652a = new C4015a0(6);

    /* renamed from: f */
    public long f2657f = -1;

    /* renamed from: e */
    public static C4164b m3018e(String str, long j10) {
        C0609b m3038a;
        if (j10 == -1 || (m3038a = C0612e.m3038a(str)) == null) {
            return null;
        }
        return m3038a.m3028a(j10);
    }

    /* renamed from: a */
    public final void m3019a(InterfaceC5572l interfaceC5572l) {
        this.f2652a.m15219P(2);
        interfaceC5572l.mo22430p(this.f2652a.m15230e(), 0, 2);
        interfaceC5572l.mo22425h(this.f2652a.m15216M() - 2);
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f2653b = interfaceC5573m;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        if (j10 == 0) {
            this.f2654c = 0;
            this.f2661j = null;
        } else if (this.f2654c == 5) {
            ((C1830k) C4014a.m15199e(this.f2661j)).mo165c(j10, j11);
        }
    }

    /* renamed from: d */
    public final void m3020d() {
        m3021f(new C3348a.b[0]);
        ((InterfaceC5573m) C4014a.m15199e(this.f2653b)).mo3034n();
        this.f2653b.mo3033j(new InterfaceC5586z.b(-9223372036854775807L));
        this.f2654c = 6;
    }

    /* renamed from: f */
    public final void m3021f(C3348a.b... bVarArr) {
        ((InterfaceC5573m) C4014a.m15199e(this.f2653b)).mo3032e(1024, 4).mo4852b(new C4463m1.b().m17454M("image/jpeg").m17467Z(new C3348a(bVarArr)).m17448G());
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        int i10 = this.f2654c;
        if (i10 == 0) {
            m3023j(interfaceC5572l);
            return 0;
        }
        if (i10 == 1) {
            m3025l(interfaceC5572l);
            return 0;
        }
        if (i10 == 2) {
            m3024k(interfaceC5572l);
            return 0;
        }
        if (i10 == 4) {
            long position = interfaceC5572l.getPosition();
            long j10 = this.f2657f;
            if (position != j10) {
                c5585y.f20962a = j10;
                return 1;
            }
            m3026m(interfaceC5572l);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f2660i == null || interfaceC5572l != this.f2659h) {
            this.f2659h = interfaceC5572l;
            this.f2660i = new C0610c(interfaceC5572l, this.f2657f);
        }
        int mo169g = ((C1830k) C4014a.m15199e(this.f2661j)).mo169g(this.f2660i, c5585y);
        if (mo169g == 1) {
            c5585y.f20962a += this.f2657f;
        }
        return mo169g;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        if (m3022i(interfaceC5572l) != 65496) {
            return false;
        }
        int m3022i = m3022i(interfaceC5572l);
        this.f2655d = m3022i;
        if (m3022i == 65504) {
            m3019a(interfaceC5572l);
            this.f2655d = m3022i(interfaceC5572l);
        }
        if (this.f2655d != 65505) {
            return false;
        }
        interfaceC5572l.mo22425h(2);
        this.f2652a.m15219P(6);
        interfaceC5572l.mo22430p(this.f2652a.m15230e(), 0, 6);
        return this.f2652a.m15212I() == 1165519206 && this.f2652a.m15216M() == 0;
    }

    /* renamed from: i */
    public final int m3022i(InterfaceC5572l interfaceC5572l) {
        this.f2652a.m15219P(2);
        interfaceC5572l.mo22430p(this.f2652a.m15230e(), 0, 2);
        return this.f2652a.m15216M();
    }

    /* renamed from: j */
    public final void m3023j(InterfaceC5572l interfaceC5572l) {
        int i10;
        this.f2652a.m15219P(2);
        interfaceC5572l.readFully(this.f2652a.m15230e(), 0, 2);
        int m15216M = this.f2652a.m15216M();
        this.f2655d = m15216M;
        if (m15216M == 65498) {
            if (this.f2657f == -1) {
                m3020d();
                return;
            }
            i10 = 4;
        } else if ((m15216M >= 65488 && m15216M <= 65497) || m15216M == 65281) {
            return;
        } else {
            i10 = 1;
        }
        this.f2654c = i10;
    }

    /* renamed from: k */
    public final void m3024k(InterfaceC5572l interfaceC5572l) {
        String m15204A;
        if (this.f2655d == 65505) {
            C4015a0 c4015a0 = new C4015a0(this.f2656e);
            interfaceC5572l.readFully(c4015a0.m15230e(), 0, this.f2656e);
            if (this.f2658g == null && "http://ns.adobe.com/xap/1.0/".equals(c4015a0.m15204A()) && (m15204A = c4015a0.m15204A()) != null) {
                C4164b m3018e = m3018e(m15204A, interfaceC5572l.mo3029b());
                this.f2658g = m3018e;
                if (m3018e != null) {
                    this.f2657f = m3018e.f14967k;
                }
            }
        } else {
            interfaceC5572l.mo22428m(this.f2656e);
        }
        this.f2654c = 0;
    }

    /* renamed from: l */
    public final void m3025l(InterfaceC5572l interfaceC5572l) {
        this.f2652a.m15219P(2);
        interfaceC5572l.readFully(this.f2652a.m15230e(), 0, 2);
        this.f2656e = this.f2652a.m15216M() - 2;
        this.f2654c = 2;
    }

    /* renamed from: m */
    public final void m3026m(InterfaceC5572l interfaceC5572l) {
        if (interfaceC5572l.mo22424e(this.f2652a.m15230e(), 0, 1, true)) {
            interfaceC5572l.mo22427l();
            if (this.f2661j == null) {
                this.f2661j = new C1830k();
            }
            C0610c c0610c = new C0610c(interfaceC5572l, this.f2657f);
            this.f2660i = c0610c;
            if (this.f2661j.mo170h(c0610c)) {
                this.f2661j.mo164b(new C0611d(this.f2657f, (InterfaceC5573m) C4014a.m15199e(this.f2653b)));
                m3027n();
                return;
            }
        }
        m3020d();
    }

    /* renamed from: n */
    public final void m3027n() {
        m3021f((C3348a.b) C4014a.m15199e(this.f2658g));
        this.f2654c = 5;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
        C1830k c1830k = this.f2661j;
        if (c1830k != null) {
            c1830k.release();
        }
    }
}
