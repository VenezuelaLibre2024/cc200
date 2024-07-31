package p108h6;

/* renamed from: h6.t */
/* loaded from: classes.dex */
public final class C2397t {

    /* renamed from: b */
    public static C2397t f9698b;

    /* renamed from: c */
    public static final C2400u f9699c = new C2400u(0, false, false, 0, 0);

    /* renamed from: a */
    public C2400u f9700a;

    /* renamed from: b */
    public static synchronized C2397t m9625b() {
        C2397t c2397t;
        synchronized (C2397t.class) {
            if (f9698b == null) {
                f9698b = new C2397t();
            }
            c2397t = f9698b;
        }
        return c2397t;
    }

    /* renamed from: a */
    public C2400u m9626a() {
        return this.f9700a;
    }

    /* renamed from: c */
    public final synchronized void m9627c(C2400u c2400u) {
        if (c2400u == null) {
            this.f9700a = f9699c;
            return;
        }
        C2400u c2400u2 = this.f9700a;
        if (c2400u2 == null || c2400u2.m9639M() < c2400u.m9639M()) {
            this.f9700a = c2400u;
        }
    }
}
