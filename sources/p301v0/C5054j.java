package p301v0;

import java.util.List;
import p079f6.C1841a;
import p301v0.C5086t1;

/* renamed from: v0.j */
/* loaded from: classes.dex */
public final class C5054j implements InterfaceC5044f1 {

    /* renamed from: a */
    public final AbstractC5051i f18966a;

    /* renamed from: b */
    public int f18967b;

    /* renamed from: c */
    public int f18968c;

    /* renamed from: d */
    public int f18969d = 0;

    /* renamed from: v0.j$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18970a;

        static {
            int[] iArr = new int[C5086t1.b.values().length];
            f18970a = iArr;
            try {
                iArr[C5086t1.b.f19093q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18970a[C5086t1.b.f19097u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18970a[C5086t1.b.f19086j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18970a[C5086t1.b.f19099w.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18970a[C5086t1.b.f19092p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18970a[C5086t1.b.f19091o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18970a[C5086t1.b.f19087k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18970a[C5086t1.b.f19090n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18970a[C5086t1.b.f19088l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18970a[C5086t1.b.f19096t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18970a[C5086t1.b.f19100x.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f18970a[C5086t1.b.f19101y.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f18970a[C5086t1.b.f19102z.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f18970a[C5086t1.b.f19084A.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f18970a[C5086t1.b.f19094r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f18970a[C5086t1.b.f19098v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f18970a[C5086t1.b.f19089m.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C5054j(AbstractC5051i abstractC5051i) {
        AbstractC5051i abstractC5051i2 = (AbstractC5051i) C5028a0.m19790b(abstractC5051i, "input");
        this.f18966a = abstractC5051i2;
        abstractC5051i2.f18939d = this;
    }

    /* renamed from: Q */
    public static C5054j m20121Q(AbstractC5051i abstractC5051i) {
        C5054j c5054j = abstractC5051i.f18939d;
        return c5054j != null ? c5054j : new C5054j(abstractC5051i);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: A */
    public void mo19840A(List<Boolean> list) {
        int mo19996B;
        int mo20001d;
        int mo19996B2;
        if (!(list instanceof C5042f)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 0) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
                do {
                    list.add(Boolean.valueOf(this.f18966a.mo20005m()));
                } while (this.f18966a.mo20001d() < mo20001d);
            }
            do {
                list.add(Boolean.valueOf(this.f18966a.mo20005m()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5042f c5042f = (C5042f) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 0) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
            do {
                c5042f.m19918e(this.f18966a.mo20005m());
            } while (this.f18966a.mo20001d() < mo20001d);
        }
        do {
            c5042f.m19918e(this.f18966a.mo20005m());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
        return;
        m20126V(mo20001d);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: B */
    public String mo19841B() {
        m20127W(2);
        return this.f18966a.mo20018z();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: C */
    public int mo19842C() {
        int i10 = this.f18969d;
        if (i10 != 0) {
            this.f18967b = i10;
            this.f18969d = 0;
        } else {
            this.f18967b = this.f18966a.mo19996B();
        }
        int i11 = this.f18967b;
        return (i11 == 0 || i11 == this.f18968c) ? C1841a.e.API_PRIORITY_OTHER : C5086t1.m20575a(i11);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: D */
    public void mo19843D(List<String> list) {
        m20125U(list, false);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: E */
    public void mo19844E(List<String> list) {
        m20125U(list, true);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: F */
    public AbstractC5048h mo19845F() {
        m20127W(2);
        return this.f18966a.mo20006n();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: G */
    public void mo19846G(List<Float> list) {
        int mo19996B;
        int mo19996B2;
        if (!(list instanceof C5092w)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b == 2) {
                int mo19997C = this.f18966a.mo19997C();
                m20128X(mo19997C);
                int mo20001d = this.f18966a.mo20001d() + mo19997C;
                do {
                    list.add(Float.valueOf(this.f18966a.mo20011s()));
                } while (this.f18966a.mo20001d() < mo20001d);
                return;
            }
            if (m20576b != 5) {
                throw C5031b0.m19813d();
            }
            do {
                list.add(Float.valueOf(this.f18966a.mo20011s()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5092w c5092w = (C5092w) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 == 2) {
            int mo19997C2 = this.f18966a.mo19997C();
            m20128X(mo19997C2);
            int mo20001d2 = this.f18966a.mo20001d() + mo19997C2;
            do {
                c5092w.m20679d(this.f18966a.mo20011s());
            } while (this.f18966a.mo20001d() < mo20001d2);
            return;
        }
        if (m20576b2 != 5) {
            throw C5031b0.m19813d();
        }
        do {
            c5092w.m20679d(this.f18966a.mo20011s());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: H */
    public int mo19847H() {
        m20127W(0);
        return this.f18966a.mo20012t();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: I */
    public boolean mo19848I() {
        int i10;
        if (this.f18966a.mo20002e() || (i10 = this.f18967b) == this.f18968c) {
            return false;
        }
        return this.f18966a.mo19999E(i10);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: J */
    public int mo19849J() {
        m20127W(5);
        return this.f18966a.mo20014v();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: K */
    public void mo19850K(List<AbstractC5048h> list) {
        int mo19996B;
        if (C5086t1.m20576b(this.f18967b) != 2) {
            throw C5031b0.m19813d();
        }
        do {
            list.add(mo19845F());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B = this.f18966a.mo19996B();
            }
        } while (mo19996B == this.f18967b);
        this.f18969d = mo19996B;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: L */
    public void mo19851L(List<Double> list) {
        int mo19996B;
        int mo19996B2;
        if (!(list instanceof C5063m)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 1) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                int mo19997C = this.f18966a.mo19997C();
                m20129Y(mo19997C);
                int mo20001d = this.f18966a.mo20001d() + mo19997C;
                do {
                    list.add(Double.valueOf(this.f18966a.mo20007o()));
                } while (this.f18966a.mo20001d() < mo20001d);
                return;
            }
            do {
                list.add(Double.valueOf(this.f18966a.mo20007o()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5063m c5063m = (C5063m) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 1) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            int mo19997C2 = this.f18966a.mo19997C();
            m20129Y(mo19997C2);
            int mo20001d2 = this.f18966a.mo20001d() + mo19997C2;
            do {
                c5063m.m20355d(this.f18966a.mo20007o());
            } while (this.f18966a.mo20001d() < mo20001d2);
            return;
        }
        do {
            c5063m.m20355d(this.f18966a.mo20007o());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: M */
    public long mo19852M() {
        m20127W(0);
        return this.f18966a.mo20013u();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: N */
    public String mo19853N() {
        m20127W(2);
        return this.f18966a.mo19995A();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: O */
    public void mo19854O(List<Long> list) {
        int mo19996B;
        int mo19996B2;
        if (!(list instanceof C5052i0)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 1) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                int mo19997C = this.f18966a.mo19997C();
                m20129Y(mo19997C);
                int mo20001d = this.f18966a.mo20001d() + mo19997C;
                do {
                    list.add(Long.valueOf(this.f18966a.mo20010r()));
                } while (this.f18966a.mo20001d() < mo20001d);
                return;
            }
            do {
                list.add(Long.valueOf(this.f18966a.mo20010r()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5052i0 c5052i0 = (C5052i0) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 1) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            int mo19997C2 = this.f18966a.mo19997C();
            m20129Y(mo19997C2);
            int mo20001d2 = this.f18966a.mo20001d() + mo19997C2;
            do {
                c5052i0.m20055e(this.f18966a.mo20010r());
            } while (this.f18966a.mo20001d() < mo20001d2);
            return;
        }
        do {
            c5052i0.m20055e(this.f18966a.mo20010r());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: P */
    public <T> T mo19855P(InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
        m20127W(2);
        return (T) m20124T(interfaceC5047g1, c5072p);
    }

    /* renamed from: R */
    public final Object m20122R(C5086t1.b bVar, Class<?> cls, C5072p c5072p) {
        switch (a.f18970a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(mo19879h());
            case 2:
                return mo19845F();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(mo19899u());
            case 5:
                return Integer.valueOf(mo19877g());
            case 6:
                return Long.valueOf(mo19869c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(mo19847H());
            case 9:
                return Long.valueOf(mo19852M());
            case 10:
                return mo19894p(cls, c5072p);
            case 11:
                return Integer.valueOf(mo19849J());
            case 12:
                return Long.valueOf(mo19881i());
            case 13:
                return Integer.valueOf(mo19903y());
            case 14:
                return Long.valueOf(mo19904z());
            case 15:
                return mo19853N();
            case 16:
                return Integer.valueOf(mo19887l());
            case 17:
                return Long.valueOf(mo19867b());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* renamed from: S */
    public final <T> T m20123S(InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
        int i10 = this.f18968c;
        this.f18968c = C5086t1.m20577c(C5086t1.m20575a(this.f18967b), 4);
        try {
            T mo19945h = interfaceC5047g1.mo19945h();
            interfaceC5047g1.mo19942e(mo19945h, this, c5072p);
            interfaceC5047g1.mo19939b(mo19945h);
            if (this.f18967b == this.f18968c) {
                return mo19945h;
            }
            throw C5031b0.m19816g();
        } finally {
            this.f18968c = i10;
        }
    }

    /* renamed from: T */
    public final <T> T m20124T(InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
        int mo19997C = this.f18966a.mo19997C();
        AbstractC5051i abstractC5051i = this.f18966a;
        if (abstractC5051i.f18936a >= abstractC5051i.f18937b) {
            throw C5031b0.m19817h();
        }
        int mo20004l = abstractC5051i.mo20004l(mo19997C);
        T mo19945h = interfaceC5047g1.mo19945h();
        this.f18966a.f18936a++;
        interfaceC5047g1.mo19942e(mo19945h, this, c5072p);
        interfaceC5047g1.mo19939b(mo19945h);
        this.f18966a.mo20000a(0);
        r5.f18936a--;
        this.f18966a.mo20003k(mo20004l);
        return mo19945h;
    }

    /* renamed from: U */
    public void m20125U(List<String> list, boolean z10) {
        int mo19996B;
        int mo19996B2;
        if (C5086t1.m20576b(this.f18967b) != 2) {
            throw C5031b0.m19813d();
        }
        if (!(list instanceof InterfaceC5046g0) || z10) {
            do {
                list.add(z10 ? mo19853N() : mo19841B());
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        InterfaceC5046g0 interfaceC5046g0 = (InterfaceC5046g0) list;
        do {
            interfaceC5046g0.mo19935l(mo19845F());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
    }

    /* renamed from: V */
    public final void m20126V(int i10) {
        if (this.f18966a.mo20001d() != i10) {
            throw C5031b0.m19819k();
        }
    }

    /* renamed from: W */
    public final void m20127W(int i10) {
        if (C5086t1.m20576b(this.f18967b) != i10) {
            throw C5031b0.m19813d();
        }
    }

    /* renamed from: X */
    public final void m20128X(int i10) {
        if ((i10 & 3) != 0) {
            throw C5031b0.m19816g();
        }
    }

    /* renamed from: Y */
    public final void m20129Y(int i10) {
        if ((i10 & 7) != 0) {
            throw C5031b0.m19816g();
        }
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: a */
    public void mo19865a(List<Integer> list) {
        int mo19996B;
        int mo20001d;
        int mo19996B2;
        if (!(list instanceof C5098z)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 0) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
                do {
                    list.add(Integer.valueOf(this.f18966a.mo20016x()));
                } while (this.f18966a.mo20001d() < mo20001d);
            }
            do {
                list.add(Integer.valueOf(this.f18966a.mo20016x()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5098z c5098z = (C5098z) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 0) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
            do {
                c5098z.m20731d(this.f18966a.mo20016x());
            } while (this.f18966a.mo20001d() < mo20001d);
        }
        do {
            c5098z.m20731d(this.f18966a.mo20016x());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
        return;
        m20126V(mo20001d);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: b */
    public long mo19867b() {
        m20127W(0);
        return this.f18966a.mo19998D();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: c */
    public long mo19869c() {
        m20127W(1);
        return this.f18966a.mo20010r();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: d */
    public void mo19871d(List<Integer> list) {
        int mo19996B;
        int mo19996B2;
        if (!(list instanceof C5098z)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b == 2) {
                int mo19997C = this.f18966a.mo19997C();
                m20128X(mo19997C);
                int mo20001d = this.f18966a.mo20001d() + mo19997C;
                do {
                    list.add(Integer.valueOf(this.f18966a.mo20014v()));
                } while (this.f18966a.mo20001d() < mo20001d);
                return;
            }
            if (m20576b != 5) {
                throw C5031b0.m19813d();
            }
            do {
                list.add(Integer.valueOf(this.f18966a.mo20014v()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5098z c5098z = (C5098z) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 == 2) {
            int mo19997C2 = this.f18966a.mo19997C();
            m20128X(mo19997C2);
            int mo20001d2 = this.f18966a.mo20001d() + mo19997C2;
            do {
                c5098z.m20731d(this.f18966a.mo20014v());
            } while (this.f18966a.mo20001d() < mo20001d2);
            return;
        }
        if (m20576b2 != 5) {
            throw C5031b0.m19813d();
        }
        do {
            c5098z.m20731d(this.f18966a.mo20014v());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: e */
    public void mo19873e(List<Long> list) {
        int mo19996B;
        int mo20001d;
        int mo19996B2;
        if (!(list instanceof C5052i0)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 0) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
                do {
                    list.add(Long.valueOf(this.f18966a.mo20017y()));
                } while (this.f18966a.mo20001d() < mo20001d);
            }
            do {
                list.add(Long.valueOf(this.f18966a.mo20017y()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5052i0 c5052i0 = (C5052i0) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 0) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
            do {
                c5052i0.m20055e(this.f18966a.mo20017y());
            } while (this.f18966a.mo20001d() < mo20001d);
        }
        do {
            c5052i0.m20055e(this.f18966a.mo20017y());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
        return;
        m20126V(mo20001d);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: f */
    public void mo19875f(List<Integer> list) {
        int mo19996B;
        int mo20001d;
        int mo19996B2;
        if (!(list instanceof C5098z)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 0) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
                do {
                    list.add(Integer.valueOf(this.f18966a.mo19997C()));
                } while (this.f18966a.mo20001d() < mo20001d);
            }
            do {
                list.add(Integer.valueOf(this.f18966a.mo19997C()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5098z c5098z = (C5098z) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 0) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
            do {
                c5098z.m20731d(this.f18966a.mo19997C());
            } while (this.f18966a.mo20001d() < mo20001d);
        }
        do {
            c5098z.m20731d(this.f18966a.mo19997C());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
        return;
        m20126V(mo20001d);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: g */
    public int mo19877g() {
        m20127W(5);
        return this.f18966a.mo20009q();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: h */
    public boolean mo19879h() {
        m20127W(0);
        return this.f18966a.mo20005m();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: i */
    public long mo19881i() {
        m20127W(1);
        return this.f18966a.mo20015w();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: j */
    public void mo19883j(List<Long> list) {
        int mo19996B;
        int mo20001d;
        int mo19996B2;
        if (!(list instanceof C5052i0)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 0) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
                do {
                    list.add(Long.valueOf(this.f18966a.mo19998D()));
                } while (this.f18966a.mo20001d() < mo20001d);
            }
            do {
                list.add(Long.valueOf(this.f18966a.mo19998D()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5052i0 c5052i0 = (C5052i0) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 0) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
            do {
                c5052i0.m20055e(this.f18966a.mo19998D());
            } while (this.f18966a.mo20001d() < mo20001d);
        }
        do {
            c5052i0.m20055e(this.f18966a.mo19998D());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
        return;
        m20126V(mo20001d);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: k */
    public <T> T mo19885k(Class<T> cls, C5072p c5072p) {
        m20127W(3);
        return (T) m20123S(C5035c1.m19823a().m19826d(cls), c5072p);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: l */
    public int mo19887l() {
        m20127W(0);
        return this.f18966a.mo19997C();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p301v0.InterfaceC5044f1
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <K, V> void mo19889m(java.util.Map<K, V> r8, p301v0.C5058k0.a<K, V> r9, p301v0.C5072p r10) {
        /*
            r7 = this;
            r0 = 2
            r7.m20127W(r0)
            v0.i r1 = r7.f18966a
            int r1 = r1.mo19997C()
            v0.i r2 = r7.f18966a
            int r1 = r2.mo20004l(r1)
            K r2 = r9.f19012b
            V r3 = r9.f19014d
        L14:
            int r4 = r7.mo19842C()     // Catch: java.lang.Throwable -> L65
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5c
            v0.i r5 = r7.f18966a     // Catch: java.lang.Throwable -> L65
            boolean r5 = r5.mo20002e()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L26
            goto L5c
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L47
            if (r4 == r0) goto L3a
            boolean r4 = r7.mo19848I()     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            if (r4 == 0) goto L34
            goto L14
        L34:
            v0.b0 r4 = new v0.b0     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            r4.<init>(r6)     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            throw r4     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
        L3a:
            v0.t1$b r4 = r9.f19013c     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            V r5 = r9.f19014d     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Class r5 = r5.getClass()     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            java.lang.Object r3 = r7.m20122R(r4, r5, r10)     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L47:
            v0.t1$b r4 = r9.f19011a     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            r5 = 0
            java.lang.Object r2 = r7.m20122R(r4, r5, r5)     // Catch: p301v0.C5031b0.a -> L4f java.lang.Throwable -> L65
            goto L14
        L4f:
            boolean r4 = r7.mo19848I()     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L56
            goto L14
        L56:
            v0.b0 r8 = new v0.b0     // Catch: java.lang.Throwable -> L65
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L65
        L5c:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L65
            v0.i r8 = r7.f18966a
            r8.mo20003k(r1)
            return
        L65:
            r8 = move-exception
            v0.i r9 = r7.f18966a
            r9.mo20003k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p301v0.C5054j.mo19889m(java.util.Map, v0.k0$a, v0.p):void");
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: n */
    public void mo19891n(List<Long> list) {
        int mo19996B;
        int mo20001d;
        int mo19996B2;
        if (!(list instanceof C5052i0)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 0) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
                do {
                    list.add(Long.valueOf(this.f18966a.mo20013u()));
                } while (this.f18966a.mo20001d() < mo20001d);
            }
            do {
                list.add(Long.valueOf(this.f18966a.mo20013u()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5052i0 c5052i0 = (C5052i0) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 0) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
            do {
                c5052i0.m20055e(this.f18966a.mo20013u());
            } while (this.f18966a.mo20001d() < mo20001d);
        }
        do {
            c5052i0.m20055e(this.f18966a.mo20013u());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
        return;
        m20126V(mo20001d);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: o */
    public void mo19893o(List<Long> list) {
        int mo19996B;
        int mo19996B2;
        if (!(list instanceof C5052i0)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 1) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                int mo19997C = this.f18966a.mo19997C();
                m20129Y(mo19997C);
                int mo20001d = this.f18966a.mo20001d() + mo19997C;
                do {
                    list.add(Long.valueOf(this.f18966a.mo20015w()));
                } while (this.f18966a.mo20001d() < mo20001d);
                return;
            }
            do {
                list.add(Long.valueOf(this.f18966a.mo20015w()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5052i0 c5052i0 = (C5052i0) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 1) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            int mo19997C2 = this.f18966a.mo19997C();
            m20129Y(mo19997C2);
            int mo20001d2 = this.f18966a.mo20001d() + mo19997C2;
            do {
                c5052i0.m20055e(this.f18966a.mo20015w());
            } while (this.f18966a.mo20001d() < mo20001d2);
            return;
        }
        do {
            c5052i0.m20055e(this.f18966a.mo20015w());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: p */
    public <T> T mo19894p(Class<T> cls, C5072p c5072p) {
        m20127W(2);
        return (T) m20124T(C5035c1.m19823a().m19826d(cls), c5072p);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: q */
    public <T> T mo19895q(InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
        m20127W(3);
        return (T) m20123S(interfaceC5047g1, c5072p);
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: r */
    public void mo19896r(List<Integer> list) {
        int mo19996B;
        int mo20001d;
        int mo19996B2;
        if (!(list instanceof C5098z)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 0) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
                do {
                    list.add(Integer.valueOf(this.f18966a.mo20012t()));
                } while (this.f18966a.mo20001d() < mo20001d);
            }
            do {
                list.add(Integer.valueOf(this.f18966a.mo20012t()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5098z c5098z = (C5098z) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 0) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
            do {
                c5098z.m20731d(this.f18966a.mo20012t());
            } while (this.f18966a.mo20001d() < mo20001d);
        }
        do {
            c5098z.m20731d(this.f18966a.mo20012t());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
        return;
        m20126V(mo20001d);
    }

    @Override // p301v0.InterfaceC5044f1
    public double readDouble() {
        m20127W(1);
        return this.f18966a.mo20007o();
    }

    @Override // p301v0.InterfaceC5044f1
    public float readFloat() {
        m20127W(5);
        return this.f18966a.mo20011s();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: s */
    public void mo19897s(List<Integer> list) {
        int mo19996B;
        int mo20001d;
        int mo19996B2;
        if (!(list instanceof C5098z)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b != 0) {
                if (m20576b != 2) {
                    throw C5031b0.m19813d();
                }
                mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
                do {
                    list.add(Integer.valueOf(this.f18966a.mo20008p()));
                } while (this.f18966a.mo20001d() < mo20001d);
            }
            do {
                list.add(Integer.valueOf(this.f18966a.mo20008p()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5098z c5098z = (C5098z) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 != 0) {
            if (m20576b2 != 2) {
                throw C5031b0.m19813d();
            }
            mo20001d = this.f18966a.mo20001d() + this.f18966a.mo19997C();
            do {
                c5098z.m20731d(this.f18966a.mo20008p());
            } while (this.f18966a.mo20001d() < mo20001d);
        }
        do {
            c5098z.m20731d(this.f18966a.mo20008p());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
        return;
        m20126V(mo20001d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p301v0.InterfaceC5044f1
    /* renamed from: t */
    public <T> void mo19898t(List<T> list, InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
        int mo19996B;
        if (C5086t1.m20576b(this.f18967b) != 2) {
            throw C5031b0.m19813d();
        }
        int i10 = this.f18967b;
        do {
            list.add(m20124T(interfaceC5047g1, c5072p));
            if (this.f18966a.mo20002e() || this.f18969d != 0) {
                return;
            } else {
                mo19996B = this.f18966a.mo19996B();
            }
        } while (mo19996B == i10);
        this.f18969d = mo19996B;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: u */
    public int mo19899u() {
        m20127W(0);
        return this.f18966a.mo20008p();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: v */
    public int mo19900v() {
        return this.f18967b;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: w */
    public void mo19901w(List<Integer> list) {
        int mo19996B;
        int mo19996B2;
        if (!(list instanceof C5098z)) {
            int m20576b = C5086t1.m20576b(this.f18967b);
            if (m20576b == 2) {
                int mo19997C = this.f18966a.mo19997C();
                m20128X(mo19997C);
                int mo20001d = this.f18966a.mo20001d() + mo19997C;
                do {
                    list.add(Integer.valueOf(this.f18966a.mo20009q()));
                } while (this.f18966a.mo20001d() < mo20001d);
                return;
            }
            if (m20576b != 5) {
                throw C5031b0.m19813d();
            }
            do {
                list.add(Integer.valueOf(this.f18966a.mo20009q()));
                if (this.f18966a.mo20002e()) {
                    return;
                } else {
                    mo19996B = this.f18966a.mo19996B();
                }
            } while (mo19996B == this.f18967b);
            this.f18969d = mo19996B;
            return;
        }
        C5098z c5098z = (C5098z) list;
        int m20576b2 = C5086t1.m20576b(this.f18967b);
        if (m20576b2 == 2) {
            int mo19997C2 = this.f18966a.mo19997C();
            m20128X(mo19997C2);
            int mo20001d2 = this.f18966a.mo20001d() + mo19997C2;
            do {
                c5098z.m20731d(this.f18966a.mo20009q());
            } while (this.f18966a.mo20001d() < mo20001d2);
            return;
        }
        if (m20576b2 != 5) {
            throw C5031b0.m19813d();
        }
        do {
            c5098z.m20731d(this.f18966a.mo20009q());
            if (this.f18966a.mo20002e()) {
                return;
            } else {
                mo19996B2 = this.f18966a.mo19996B();
            }
        } while (mo19996B2 == this.f18967b);
        this.f18969d = mo19996B2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p301v0.InterfaceC5044f1
    /* renamed from: x */
    public <T> void mo19902x(List<T> list, InterfaceC5047g1<T> interfaceC5047g1, C5072p c5072p) {
        int mo19996B;
        if (C5086t1.m20576b(this.f18967b) != 3) {
            throw C5031b0.m19813d();
        }
        int i10 = this.f18967b;
        do {
            list.add(m20123S(interfaceC5047g1, c5072p));
            if (this.f18966a.mo20002e() || this.f18969d != 0) {
                return;
            } else {
                mo19996B = this.f18966a.mo19996B();
            }
        } while (mo19996B == i10);
        this.f18969d = mo19996B;
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: y */
    public int mo19903y() {
        m20127W(0);
        return this.f18966a.mo20016x();
    }

    @Override // p301v0.InterfaceC5044f1
    /* renamed from: z */
    public long mo19904z() {
        m20127W(0);
        return this.f18966a.mo20017y();
    }
}
