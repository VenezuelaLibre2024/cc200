package p094g4;

import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5586z;

/* renamed from: g4.i */
/* loaded from: classes.dex */
public abstract class AbstractC1994i {

    /* renamed from: b */
    public InterfaceC5559b0 f7945b;

    /* renamed from: c */
    public InterfaceC5573m f7946c;

    /* renamed from: d */
    public InterfaceC1992g f7947d;

    /* renamed from: e */
    public long f7948e;

    /* renamed from: f */
    public long f7949f;

    /* renamed from: g */
    public long f7950g;

    /* renamed from: h */
    public int f7951h;

    /* renamed from: i */
    public int f7952i;

    /* renamed from: k */
    public long f7954k;

    /* renamed from: l */
    public boolean f7955l;

    /* renamed from: m */
    public boolean f7956m;

    /* renamed from: a */
    public final C1990e f7944a = new C1990e();

    /* renamed from: j */
    public b f7953j = new b();

    /* renamed from: g4.i$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public C4463m1 f7957a;

        /* renamed from: b */
        public InterfaceC1992g f7958b;
    }

    /* renamed from: g4.i$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC1992g {
        public c() {
        }

        @Override // p094g4.InterfaceC1992g
        /* renamed from: a */
        public long mo8019a(InterfaceC5572l interfaceC5572l) {
            return -1L;
        }

        @Override // p094g4.InterfaceC1992g
        /* renamed from: b */
        public InterfaceC5586z mo8020b() {
            return new InterfaceC5586z.b(-9223372036854775807L);
        }

        @Override // p094g4.InterfaceC1992g
        /* renamed from: c */
        public void mo8021c(long j10) {
        }
    }

    /* renamed from: a */
    public final void m8049a() {
        C4014a.m15202h(this.f7945b);
        C4041n0.m15463j(this.f7946c);
    }

    /* renamed from: b */
    public long m8050b(long j10) {
        return (j10 * 1000000) / this.f7952i;
    }

    /* renamed from: c */
    public long m8051c(long j10) {
        return (this.f7952i * j10) / 1000000;
    }

    /* renamed from: d */
    public void m8052d(InterfaceC5573m interfaceC5573m, InterfaceC5559b0 interfaceC5559b0) {
        this.f7946c = interfaceC5573m;
        this.f7945b = interfaceC5559b0;
        mo8030l(true);
    }

    /* renamed from: e */
    public void mo8053e(long j10) {
        this.f7950g = j10;
    }

    /* renamed from: f */
    public abstract long mo8028f(C4015a0 c4015a0);

    /* renamed from: g */
    public final int m8054g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        m8049a();
        int i10 = this.f7951h;
        if (i10 == 0) {
            return m8056j(interfaceC5572l);
        }
        if (i10 == 1) {
            interfaceC5572l.mo22428m((int) this.f7949f);
            this.f7951h = 2;
            return 0;
        }
        if (i10 == 2) {
            C4041n0.m15463j(this.f7947d);
            return m8057k(interfaceC5572l, c5585y);
        }
        if (i10 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public abstract boolean mo8029h(C4015a0 c4015a0, long j10, b bVar);

    /* renamed from: i */
    public final boolean m8055i(InterfaceC5572l interfaceC5572l) {
        while (this.f7944a.m8040d(interfaceC5572l)) {
            this.f7954k = interfaceC5572l.getPosition() - this.f7949f;
            if (!mo8029h(this.f7944a.m8039c(), this.f7949f, this.f7953j)) {
                return true;
            }
            this.f7949f = interfaceC5572l.getPosition();
        }
        this.f7951h = 3;
        return false;
    }

    /* renamed from: j */
    public final int m8056j(InterfaceC5572l interfaceC5572l) {
        if (!m8055i(interfaceC5572l)) {
            return -1;
        }
        C4463m1 c4463m1 = this.f7953j.f7957a;
        this.f7952i = c4463m1.f16486G;
        if (!this.f7956m) {
            this.f7945b.mo4852b(c4463m1);
            this.f7956m = true;
        }
        InterfaceC1992g interfaceC1992g = this.f7953j.f7958b;
        if (interfaceC1992g == null) {
            if (interfaceC5572l.mo3029b() != -1) {
                C1991f m8038b = this.f7944a.m8038b();
                this.f7947d = new C1986a(this, this.f7949f, interfaceC5572l.mo3029b(), m8038b.f7937h + m8038b.f7938i, m8038b.f7932c, (m8038b.f7931b & 4) != 0);
                this.f7951h = 2;
                this.f7944a.m8042f();
                return 0;
            }
            interfaceC1992g = new c();
        }
        this.f7947d = interfaceC1992g;
        this.f7951h = 2;
        this.f7944a.m8042f();
        return 0;
    }

    /* renamed from: k */
    public final int m8057k(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        long mo8019a = this.f7947d.mo8019a(interfaceC5572l);
        if (mo8019a >= 0) {
            c5585y.f20962a = mo8019a;
            return 1;
        }
        if (mo8019a < -1) {
            mo8053e(-(mo8019a + 2));
        }
        if (!this.f7955l) {
            this.f7946c.mo3033j((InterfaceC5586z) C4014a.m15202h(this.f7947d.mo8020b()));
            this.f7955l = true;
        }
        if (this.f7954k <= 0 && !this.f7944a.m8040d(interfaceC5572l)) {
            this.f7951h = 3;
            return -1;
        }
        this.f7954k = 0L;
        C4015a0 m8039c = this.f7944a.m8039c();
        long mo8028f = mo8028f(m8039c);
        if (mo8028f >= 0) {
            long j10 = this.f7950g;
            if (j10 + mo8028f >= this.f7948e) {
                long m8050b = m8050b(j10);
                this.f7945b.m22408e(m8039c, m8039c.m15232g());
                this.f7945b.mo4851a(m8050b, 1, m8039c.m15232g(), 0, null);
                this.f7948e = -1L;
            }
        }
        this.f7950g += mo8028f;
        return 0;
    }

    /* renamed from: l */
    public void mo8030l(boolean z10) {
        int i10;
        if (z10) {
            this.f7953j = new b();
            this.f7949f = 0L;
            i10 = 0;
        } else {
            i10 = 1;
        }
        this.f7951h = i10;
        this.f7948e = -1L;
        this.f7950g = 0L;
    }

    /* renamed from: m */
    public final void m8058m(long j10, long j11) {
        this.f7944a.m8041e();
        if (j10 == 0) {
            mo8030l(!this.f7955l);
        } else if (this.f7951h != 0) {
            this.f7948e = m8051c(j11);
            ((InterfaceC1992g) C4041n0.m15463j(this.f7947d)).mo8021c(this.f7948e);
            this.f7951h = 2;
        }
    }
}
