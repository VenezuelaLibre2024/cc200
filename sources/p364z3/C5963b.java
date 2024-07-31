package p364z3;

import java.util.ArrayList;
import p126i7.AbstractC2617d1;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4046r;
import p222p5.C4050v;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p333x3.C5569i;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5586z;

/* renamed from: z3.b */
/* loaded from: classes.dex */
public final class C5963b implements InterfaceC5571k {

    /* renamed from: c */
    public int f22131c;

    /* renamed from: e */
    public C5964c f22133e;

    /* renamed from: h */
    public long f22136h;

    /* renamed from: i */
    public C5966e f22137i;

    /* renamed from: m */
    public int f22141m;

    /* renamed from: n */
    public boolean f22142n;

    /* renamed from: a */
    public final C4015a0 f22129a = new C4015a0(12);

    /* renamed from: b */
    public final c f22130b = new c();

    /* renamed from: d */
    public InterfaceC5573m f22132d = new C5569i();

    /* renamed from: g */
    public C5966e[] f22135g = new C5966e[0];

    /* renamed from: k */
    public long f22139k = -1;

    /* renamed from: l */
    public long f22140l = -1;

    /* renamed from: j */
    public int f22138j = -1;

    /* renamed from: f */
    public long f22134f = -9223372036854775807L;

    /* renamed from: z3.b$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC5586z {

        /* renamed from: a */
        public final long f22143a;

        public b(long j10) {
            this.f22143a = j10;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: d */
        public long mo3035d() {
            return this.f22143a;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: f */
        public boolean mo3036f() {
            return true;
        }

        @Override // p333x3.InterfaceC5586z
        /* renamed from: i */
        public InterfaceC5586z.a mo3037i(long j10) {
            InterfaceC5586z.a m23906i = C5963b.this.f22135g[0].m23906i(j10);
            for (int i10 = 1; i10 < C5963b.this.f22135g.length; i10++) {
                InterfaceC5586z.a m23906i2 = C5963b.this.f22135g[i10].m23906i(j10);
                if (m23906i2.f20963a.f20852b < m23906i.f20963a.f20852b) {
                    m23906i = m23906i2;
                }
            }
            return m23906i;
        }
    }

    /* renamed from: z3.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public int f22145a;

        /* renamed from: b */
        public int f22146b;

        /* renamed from: c */
        public int f22147c;

        public c() {
        }

        /* renamed from: a */
        public void m23891a(C4015a0 c4015a0) {
            this.f22145a = c4015a0.m15245t();
            this.f22146b = c4015a0.m15245t();
            this.f22147c = 0;
        }

        /* renamed from: b */
        public void m23892b(C4015a0 c4015a0) {
            m23891a(c4015a0);
            if (this.f22145a == 1414744396) {
                this.f22147c = c4015a0.m15245t();
                return;
            }
            throw C4499t2.m17594a("LIST expected, found: " + this.f22145a, null);
        }
    }

    /* renamed from: d */
    public static void m23883d(InterfaceC5572l interfaceC5572l) {
        if ((interfaceC5572l.getPosition() & 1) == 1) {
            interfaceC5572l.mo22428m(1);
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f22131c = 0;
        this.f22132d = interfaceC5573m;
        this.f22136h = -1L;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        this.f22136h = -1L;
        this.f22137i = null;
        for (C5966e c5966e : this.f22135g) {
            c5966e.m23912o(j10);
        }
        if (j10 != 0) {
            this.f22131c = 6;
        } else if (this.f22135g.length == 0) {
            this.f22131c = 0;
        } else {
            this.f22131c = 3;
        }
    }

    /* renamed from: e */
    public final C5966e m23884e(int i10) {
        for (C5966e c5966e : this.f22135g) {
            if (c5966e.m23907j(i10)) {
                return c5966e;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m23885f(C4015a0 c4015a0) {
        C5967f m23914c = C5967f.m23914c(1819436136, c4015a0);
        if (m23914c.getType() != 1819436136) {
            throw C4499t2.m17594a("Unexpected header list type " + m23914c.getType(), null);
        }
        C5964c c5964c = (C5964c) m23914c.m23915b(C5964c.class);
        if (c5964c == null) {
            throw C4499t2.m17594a("AviHeader not found", null);
        }
        this.f22133e = c5964c;
        this.f22134f = c5964c.f22150c * c5964c.f22148a;
        ArrayList arrayList = new ArrayList();
        AbstractC2617d1<InterfaceC5962a> it = m23914c.f22170a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            InterfaceC5962a next = it.next();
            if (next.getType() == 1819440243) {
                int i11 = i10 + 1;
                C5966e m23888k = m23888k((C5967f) next, i10);
                if (m23888k != null) {
                    arrayList.add(m23888k);
                }
                i10 = i11;
            }
        }
        this.f22135g = (C5966e[]) arrayList.toArray(new C5966e[0]);
        this.f22132d.mo3034n();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        if (m23890m(interfaceC5572l, c5585y)) {
            return 1;
        }
        switch (this.f22131c) {
            case 0:
                if (!mo170h(interfaceC5572l)) {
                    throw C4499t2.m17594a("AVI Header List not found", null);
                }
                interfaceC5572l.mo22428m(12);
                this.f22131c = 1;
                return 0;
            case 1:
                interfaceC5572l.readFully(this.f22129a.m15230e(), 0, 12);
                this.f22129a.m15223T(0);
                this.f22130b.m23892b(this.f22129a);
                c cVar = this.f22130b;
                if (cVar.f22147c == 1819436136) {
                    this.f22138j = cVar.f22146b;
                    this.f22131c = 2;
                    return 0;
                }
                throw C4499t2.m17594a("hdrl expected, found: " + this.f22130b.f22147c, null);
            case 2:
                int i10 = this.f22138j - 4;
                C4015a0 c4015a0 = new C4015a0(i10);
                interfaceC5572l.readFully(c4015a0.m15230e(), 0, i10);
                m23885f(c4015a0);
                this.f22131c = 3;
                return 0;
            case 3:
                if (this.f22139k != -1) {
                    long position = interfaceC5572l.getPosition();
                    long j10 = this.f22139k;
                    if (position != j10) {
                        this.f22136h = j10;
                        return 0;
                    }
                }
                interfaceC5572l.mo22430p(this.f22129a.m15230e(), 0, 12);
                interfaceC5572l.mo22427l();
                this.f22129a.m15223T(0);
                this.f22130b.m23891a(this.f22129a);
                int m15245t = this.f22129a.m15245t();
                int i11 = this.f22130b.f22145a;
                if (i11 == 1179011410) {
                    interfaceC5572l.mo22428m(12);
                    return 0;
                }
                if (i11 != 1414744396 || m15245t != 1769369453) {
                    this.f22136h = interfaceC5572l.getPosition() + this.f22130b.f22146b + 8;
                    return 0;
                }
                long position2 = interfaceC5572l.getPosition();
                this.f22139k = position2;
                this.f22140l = position2 + this.f22130b.f22146b + 8;
                if (!this.f22142n) {
                    if (((C5964c) C4014a.m15199e(this.f22133e)).m23894a()) {
                        this.f22131c = 4;
                        this.f22136h = this.f22140l;
                        return 0;
                    }
                    this.f22132d.mo3033j(new InterfaceC5586z.b(this.f22134f));
                    this.f22142n = true;
                }
                this.f22136h = interfaceC5572l.getPosition() + 12;
                this.f22131c = 6;
                return 0;
            case 4:
                interfaceC5572l.readFully(this.f22129a.m15230e(), 0, 8);
                this.f22129a.m15223T(0);
                int m15245t2 = this.f22129a.m15245t();
                int m15245t3 = this.f22129a.m15245t();
                if (m15245t2 == 829973609) {
                    this.f22131c = 5;
                    this.f22141m = m15245t3;
                } else {
                    this.f22136h = interfaceC5572l.getPosition() + m15245t3;
                }
                return 0;
            case 5:
                C4015a0 c4015a02 = new C4015a0(this.f22141m);
                interfaceC5572l.readFully(c4015a02.m15230e(), 0, this.f22141m);
                m23886i(c4015a02);
                this.f22131c = 6;
                this.f22136h = this.f22139k;
                return 0;
            case 6:
                return m23889l(interfaceC5572l);
            default:
                throw new AssertionError();
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22430p(this.f22129a.m15230e(), 0, 12);
        this.f22129a.m15223T(0);
        if (this.f22129a.m15245t() != 1179011410) {
            return false;
        }
        this.f22129a.m15224U(4);
        return this.f22129a.m15245t() == 541677121;
    }

    /* renamed from: i */
    public final void m23886i(C4015a0 c4015a0) {
        long m23887j = m23887j(c4015a0);
        while (c4015a0.m15226a() >= 16) {
            int m15245t = c4015a0.m15245t();
            int m15245t2 = c4015a0.m15245t();
            long m15245t3 = c4015a0.m15245t() + m23887j;
            c4015a0.m15245t();
            C5966e m23884e = m23884e(m15245t);
            if (m23884e != null) {
                if ((m15245t2 & 16) == 16) {
                    m23884e.m23900b(m15245t3);
                }
                m23884e.m23908k();
            }
        }
        for (C5966e c5966e : this.f22135g) {
            c5966e.m23901c();
        }
        this.f22142n = true;
        this.f22132d.mo3033j(new b(this.f22134f));
    }

    /* renamed from: j */
    public final long m23887j(C4015a0 c4015a0) {
        if (c4015a0.m15226a() < 16) {
            return 0L;
        }
        int m15231f = c4015a0.m15231f();
        c4015a0.m15224U(8);
        long m15245t = c4015a0.m15245t();
        long j10 = this.f22139k;
        long j11 = m15245t <= j10 ? 8 + j10 : 0L;
        c4015a0.m15223T(m15231f);
        return j11;
    }

    /* renamed from: k */
    public final C5966e m23888k(C5967f c5967f, int i10) {
        String str;
        C5965d c5965d = (C5965d) c5967f.m23915b(C5965d.class);
        C5968g c5968g = (C5968g) c5967f.m23915b(C5968g.class);
        if (c5965d == null) {
            str = "Missing Stream Header";
        } else {
            if (c5968g != null) {
                long m23896a = c5965d.m23896a();
                C4463m1 c4463m1 = c5968g.f22172a;
                C4463m1.b m17411b = c4463m1.m17411b();
                m17411b.m17461T(i10);
                int i11 = c5965d.f22157f;
                if (i11 != 0) {
                    m17411b.m17466Y(i11);
                }
                C5969h c5969h = (C5969h) c5967f.m23915b(C5969h.class);
                if (c5969h != null) {
                    m17411b.m17464W(c5969h.f22173a);
                }
                int m15554k = C4050v.m15554k(c4463m1.f16506s);
                if (m15554k != 1 && m15554k != 2) {
                    return null;
                }
                InterfaceC5559b0 mo3032e = this.f22132d.mo3032e(i10, m15554k);
                mo3032e.mo4852b(m17411b.m17448G());
                C5966e c5966e = new C5966e(i10, m15554k, m23896a, c5965d.f22156e, mo3032e);
                this.f22134f = m23896a;
                return c5966e;
            }
            str = "Missing Stream Format";
        }
        C4046r.m15529i("AviExtractor", str);
        return null;
    }

    /* renamed from: l */
    public final int m23889l(InterfaceC5572l interfaceC5572l) {
        if (interfaceC5572l.getPosition() >= this.f22140l) {
            return -1;
        }
        C5966e c5966e = this.f22137i;
        if (c5966e == null) {
            m23883d(interfaceC5572l);
            interfaceC5572l.mo22430p(this.f22129a.m15230e(), 0, 12);
            this.f22129a.m15223T(0);
            int m15245t = this.f22129a.m15245t();
            if (m15245t == 1414744396) {
                this.f22129a.m15223T(8);
                interfaceC5572l.mo22428m(this.f22129a.m15245t() != 1769369453 ? 8 : 12);
                interfaceC5572l.mo22427l();
                return 0;
            }
            int m15245t2 = this.f22129a.m15245t();
            if (m15245t == 1263424842) {
                this.f22136h = interfaceC5572l.getPosition() + m15245t2 + 8;
                return 0;
            }
            interfaceC5572l.mo22428m(8);
            interfaceC5572l.mo22427l();
            C5966e m23884e = m23884e(m15245t);
            if (m23884e == null) {
                this.f22136h = interfaceC5572l.getPosition() + m15245t2;
                return 0;
            }
            m23884e.m23911n(m15245t2);
            this.f22137i = m23884e;
        } else if (c5966e.m23910m(interfaceC5572l)) {
            this.f22137i = null;
        }
        return 0;
    }

    /* renamed from: m */
    public final boolean m23890m(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        boolean z10;
        if (this.f22136h != -1) {
            long position = interfaceC5572l.getPosition();
            long j10 = this.f22136h;
            if (j10 < position || j10 > 262144 + position) {
                c5585y.f20962a = j10;
                z10 = true;
                this.f22136h = -1L;
                return z10;
            }
            interfaceC5572l.mo22428m((int) (j10 - position));
        }
        z10 = false;
        this.f22136h = -1L;
        return z10;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
