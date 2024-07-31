package p106h4;

import p106h4.InterfaceC2316i0;
import p222p5.C4015a0;
import p289u3.C4809c;
import p333x3.C5585y;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: h4.e */
/* loaded from: classes.dex */
public final class C2307e implements InterfaceC5571k {

    /* renamed from: d */
    public static final InterfaceC5576p f9257d = new InterfaceC5576p() { // from class: h4.d
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m9347d;
            m9347d = C2307e.m9347d();
            return m9347d;
        }
    };

    /* renamed from: a */
    public final C2309f f9258a = new C2309f();

    /* renamed from: b */
    public final C4015a0 f9259b = new C4015a0(16384);

    /* renamed from: c */
    public boolean f9260c;

    /* renamed from: d */
    public static /* synthetic */ InterfaceC5571k[] m9347d() {
        return new InterfaceC5571k[]{new C2307e()};
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f9258a.mo9337e(interfaceC5573m, new InterfaceC2316i0.d(0, 1));
        interfaceC5573m.mo3034n();
        interfaceC5573m.mo3033j(new InterfaceC5586z.b(-9223372036854775807L));
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        this.f9260c = false;
        this.f9258a.mo9335c();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        int mo14769c = interfaceC5572l.mo14769c(this.f9259b.m15230e(), 0, 16384);
        if (mo14769c == -1) {
            return -1;
        }
        this.f9259b.m15223T(0);
        this.f9259b.m15222S(mo14769c);
        if (!this.f9260c) {
            this.f9258a.mo9338f(0L, 4);
            this.f9260c = true;
        }
        this.f9258a.mo9333a(this.f9259b);
        return 0;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        C4015a0 c4015a0 = new C4015a0(10);
        int i10 = 0;
        while (true) {
            interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, 10);
            c4015a0.m15223T(0);
            if (c4015a0.m15213J() != 4801587) {
                break;
            }
            c4015a0.m15224U(3);
            int m15209F = c4015a0.m15209F();
            i10 += m15209F + 10;
            interfaceC5572l.mo22425h(m15209F);
        }
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22425h(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC5572l.mo22430p(c4015a0.m15230e(), 0, 7);
            c4015a0.m15223T(0);
            int m15216M = c4015a0.m15216M();
            if (m15216M == 44096 || m15216M == 44097) {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int m18999e = C4809c.m18999e(c4015a0.m15230e(), m15216M);
                if (m18999e == -1) {
                    return false;
                }
                interfaceC5572l.mo22425h(m18999e - 7);
            } else {
                interfaceC5572l.mo22427l();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC5572l.mo22425h(i12);
                i11 = 0;
            }
        }
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
