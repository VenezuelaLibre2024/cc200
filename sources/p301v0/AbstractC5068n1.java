package p301v0;

/* renamed from: v0.n1 */
/* loaded from: classes.dex */
public abstract class AbstractC5068n1<T, B> {
    /* renamed from: a */
    public abstract void mo20376a(B b10, int i10, int i11);

    /* renamed from: b */
    public abstract void mo20377b(B b10, int i10, long j10);

    /* renamed from: c */
    public abstract void mo20378c(B b10, int i10, T t10);

    /* renamed from: d */
    public abstract void mo20379d(B b10, int i10, AbstractC5048h abstractC5048h);

    /* renamed from: e */
    public abstract void mo20380e(B b10, int i10, long j10);

    /* renamed from: f */
    public abstract B mo20381f(Object obj);

    /* renamed from: g */
    public abstract T mo20382g(Object obj);

    /* renamed from: h */
    public abstract int mo20383h(T t10);

    /* renamed from: i */
    public abstract int mo20384i(T t10);

    /* renamed from: j */
    public abstract void mo20385j(Object obj);

    /* renamed from: k */
    public abstract T mo20386k(T t10, T t11);

    /* renamed from: l */
    public final void m20387l(B b10, InterfaceC5044f1 interfaceC5044f1) {
        while (interfaceC5044f1.mo19842C() != Integer.MAX_VALUE && m20388m(b10, interfaceC5044f1)) {
        }
    }

    /* renamed from: m */
    public final boolean m20388m(B b10, InterfaceC5044f1 interfaceC5044f1) {
        int mo19900v = interfaceC5044f1.mo19900v();
        int m20575a = C5086t1.m20575a(mo19900v);
        int m20576b = C5086t1.m20576b(mo19900v);
        if (m20576b == 0) {
            mo20380e(b10, m20575a, interfaceC5044f1.mo19852M());
            return true;
        }
        if (m20576b == 1) {
            mo20377b(b10, m20575a, interfaceC5044f1.mo19869c());
            return true;
        }
        if (m20576b == 2) {
            mo20379d(b10, m20575a, interfaceC5044f1.mo19845F());
            return true;
        }
        if (m20576b != 3) {
            if (m20576b == 4) {
                return false;
            }
            if (m20576b != 5) {
                throw C5031b0.m19813d();
            }
            mo20376a(b10, m20575a, interfaceC5044f1.mo19877g());
            return true;
        }
        B mo20389n = mo20389n();
        int m20577c = C5086t1.m20577c(m20575a, 4);
        m20387l(mo20389n, interfaceC5044f1);
        if (m20577c != interfaceC5044f1.mo19900v()) {
            throw C5031b0.m19810a();
        }
        mo20378c(b10, m20575a, mo20393r(mo20389n));
        return true;
    }

    /* renamed from: n */
    public abstract B mo20389n();

    /* renamed from: o */
    public abstract void mo20390o(Object obj, B b10);

    /* renamed from: p */
    public abstract void mo20391p(Object obj, T t10);

    /* renamed from: q */
    public abstract boolean mo20392q(InterfaceC5044f1 interfaceC5044f1);

    /* renamed from: r */
    public abstract T mo20393r(B b10);

    /* renamed from: s */
    public abstract void mo20394s(T t10, InterfaceC5089u1 interfaceC5089u1);

    /* renamed from: t */
    public abstract void mo20395t(T t10, InterfaceC5089u1 interfaceC5089u1);
}
