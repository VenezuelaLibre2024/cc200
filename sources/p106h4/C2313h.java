package p106h4;

import java.io.EOFException;
import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4054z;
import p264s3.C4499t2;
import p333x3.C5562d;
import p333x3.C5585y;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: h4.h */
/* loaded from: classes.dex */
public final class C2313h implements InterfaceC5571k {

    /* renamed from: m */
    public static final InterfaceC5576p f9289m = C2311g.f9287b;

    /* renamed from: a */
    public final int f9290a;

    /* renamed from: b */
    public final C2315i f9291b;

    /* renamed from: c */
    public final C4015a0 f9292c;

    /* renamed from: d */
    public final C4015a0 f9293d;

    /* renamed from: e */
    public final C4054z f9294e;

    /* renamed from: f */
    public InterfaceC5573m f9295f;

    /* renamed from: g */
    public long f9296g;

    /* renamed from: h */
    public long f9297h;

    /* renamed from: i */
    public int f9298i;

    /* renamed from: j */
    public boolean f9299j;

    /* renamed from: k */
    public boolean f9300k;

    /* renamed from: l */
    public boolean f9301l;

    public C2313h() {
        this(0);
    }

    public C2313h(int i10) {
        this.f9290a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f9291b = new C2315i(true);
        this.f9292c = new C4015a0(2048);
        this.f9298i = -1;
        this.f9297h = -1L;
        C4015a0 c4015a0 = new C4015a0(10);
        this.f9293d = c4015a0;
        this.f9294e = new C4054z(c4015a0.m15230e());
    }

    /* renamed from: e */
    public static int m9363e(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    /* renamed from: i */
    public static /* synthetic */ InterfaceC5571k[] m9364i() {
        return new InterfaceC5571k[]{new C2313h()};
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f9295f = interfaceC5573m;
        this.f9291b.mo9337e(interfaceC5573m, new InterfaceC2316i0.d(0, 1));
        interfaceC5573m.mo3034n();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        this.f9300k = false;
        this.f9291b.mo9335c();
        this.f9296g = j11;
    }

    /* renamed from: d */
    public final void m9365d(InterfaceC5572l interfaceC5572l) {
        if (this.f9299j) {
            return;
        }
        this.f9298i = -1;
        interfaceC5572l.mo22427l();
        long j10 = 0;
        if (interfaceC5572l.getPosition() == 0) {
            m9368k(interfaceC5572l);
        }
        int i10 = 0;
        int i11 = 0;
        while (interfaceC5572l.mo22424e(this.f9293d.m15230e(), 0, 2, true)) {
            try {
                this.f9293d.m15223T(0);
                if (!C2315i.m9392m(this.f9293d.m15216M())) {
                    break;
                }
                if (!interfaceC5572l.mo22424e(this.f9293d.m15230e(), 0, 4, true)) {
                    break;
                }
                this.f9294e.m15609p(14);
                int m15601h = this.f9294e.m15601h(13);
                if (m15601h <= 6) {
                    this.f9299j = true;
                    throw C4499t2.m17594a("Malformed ADTS stream", null);
                }
                j10 += m15601h;
                i11++;
                if (i11 != 1000 && interfaceC5572l.mo22429n(m15601h - 6, true)) {
                }
                break;
            } catch (EOFException unused) {
            }
        }
        i10 = i11;
        interfaceC5572l.mo22427l();
        if (i10 > 0) {
            this.f9298i = (int) (j10 / i10);
        } else {
            this.f9298i = -1;
        }
        this.f9299j = true;
    }

    /* renamed from: f */
    public final InterfaceC5586z m9366f(long j10, boolean z10) {
        return new C5562d(j10, this.f9297h, m9363e(this.f9298i, this.f9291b.m9398k()), this.f9298i, z10);
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        C4014a.m15202h(this.f9295f);
        long mo3029b = interfaceC5572l.mo3029b();
        int i10 = this.f9290a;
        if (((i10 & 2) == 0 && ((i10 & 1) == 0 || mo3029b == -1)) ? false : true) {
            m9365d(interfaceC5572l);
        }
        int mo14769c = interfaceC5572l.mo14769c(this.f9292c.m15230e(), 0, 2048);
        boolean z10 = mo14769c == -1;
        m9367j(mo3029b, z10);
        if (z10) {
            return -1;
        }
        this.f9292c.m15223T(0);
        this.f9292c.m15222S(mo14769c);
        if (!this.f9300k) {
            this.f9291b.mo9338f(this.f9296g, 4);
            this.f9300k = true;
        }
        this.f9291b.mo9333a(this.f9292c);
        return 0;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        int m9368k = m9368k(interfaceC5572l);
        int i10 = m9368k;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC5572l.mo22430p(this.f9293d.m15230e(), 0, 2);
            this.f9293d.m15223T(0);
            if (C2315i.m9392m(this.f9293d.m15216M())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC5572l.mo22430p(this.f9293d.m15230e(), 0, 4);
                this.f9294e.m15609p(14);
                int m15601h = this.f9294e.m15601h(13);
                if (m15601h > 6) {
                    interfaceC5572l.mo22425h(m15601h - 6);
                    i12 += m15601h;
                }
            }
            i10++;
            interfaceC5572l.mo22427l();
            interfaceC5572l.mo22425h(i10);
            i11 = 0;
            i12 = 0;
        } while (i10 - m9368k < 8192);
        return false;
    }

    /* renamed from: j */
    public final void m9367j(long j10, boolean z10) {
        if (this.f9301l) {
            return;
        }
        boolean z11 = (this.f9290a & 1) != 0 && this.f9298i > 0;
        if (z11 && this.f9291b.m9398k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f9291b.m9398k() == -9223372036854775807L) {
            this.f9295f.mo3033j(new InterfaceC5586z.b(-9223372036854775807L));
        } else {
            this.f9295f.mo3033j(m9366f(j10, (this.f9290a & 2) != 0));
        }
        this.f9301l = true;
    }

    /* renamed from: k */
    public final int m9368k(InterfaceC5572l interfaceC5572l) {
        int i10 = 0;
        while (true) {
            interfaceC5572l.mo22430p(this.f9293d.m15230e(), 0, 10);
            this.f9293d.m15223T(0);
            if (this.f9293d.m15213J() != 4801587) {
                break;
            }
            this.f9293d.m15224U(3);
            int m15209F = this.f9293d.m15209F();
            i10 += m15209F + 10;
            interfaceC5572l.mo22425h(m15209F);
        }
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22425h(i10);
        if (this.f9297h == -1) {
            this.f9297h = i10;
        }
        return i10;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
