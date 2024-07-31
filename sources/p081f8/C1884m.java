package p081f8;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p066e8.C1733i;
import p066e8.C1743n;
import p081f8.C1884m;
import p098g8.AbstractC2135f0;
import p141j8.C3262f;

/* renamed from: f8.m */
/* loaded from: classes.dex */
public class C1884m {

    /* renamed from: a */
    public final C1877f f7117a;

    /* renamed from: b */
    public final C1743n f7118b;

    /* renamed from: c */
    public String f7119c;

    /* renamed from: d */
    public final a f7120d = new a(false);

    /* renamed from: e */
    public final a f7121e = new a(true);

    /* renamed from: f */
    public final C1881j f7122f = new C1881j(128);

    /* renamed from: g */
    public final AtomicMarkableReference<String> f7123g = new AtomicMarkableReference<>(null, false);

    /* renamed from: f8.m$a */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        public final AtomicMarkableReference<C1875d> f7124a;

        /* renamed from: b */
        public final AtomicReference<Callable<Void>> f7125b = new AtomicReference<>(null);

        /* renamed from: c */
        public final boolean f7126c;

        public a(boolean z10) {
            this.f7126c = z10;
            this.f7124a = new AtomicMarkableReference<>(new C1875d(64, z10 ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Void m7712c() {
            this.f7125b.set(null);
            m7715e();
            return null;
        }

        /* renamed from: b */
        public Map<String, String> m7713b() {
            return this.f7124a.getReference().m7628a();
        }

        /* renamed from: d */
        public final void m7714d() {
            Callable<Void> callable = new Callable() { // from class: f8.l
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void m7712c;
                    m7712c = C1884m.a.this.m7712c();
                    return m7712c;
                }
            };
            if (this.f7125b.compareAndSet(null, callable)) {
                C1884m.this.f7118b.m6887h(callable);
            }
        }

        /* renamed from: e */
        public final void m7715e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f7124a.isMarked()) {
                    map = this.f7124a.getReference().m7628a();
                    AtomicMarkableReference<C1875d> atomicMarkableReference = this.f7124a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                C1884m.this.f7117a.m7655q(C1884m.this.f7119c, map, this.f7126c);
            }
        }

        /* renamed from: f */
        public boolean m7716f(String str, String str2) {
            synchronized (this) {
                if (!this.f7124a.getReference().m7630d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<C1875d> atomicMarkableReference = this.f7124a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                m7714d();
                return true;
            }
        }
    }

    public C1884m(String str, C3262f c3262f, C1743n c1743n) {
        this.f7119c = str;
        this.f7117a = new C1877f(c3262f);
        this.f7118b = c1743n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object m7699i() {
        m7706l();
        return null;
    }

    /* renamed from: j */
    public static C1884m m7700j(String str, C3262f c3262f, C1743n c1743n) {
        C1877f c1877f = new C1877f(c3262f);
        C1884m c1884m = new C1884m(str, c3262f, c1743n);
        c1884m.f7120d.f7124a.getReference().m7631e(c1877f.m7651i(str, false));
        c1884m.f7121e.f7124a.getReference().m7631e(c1877f.m7651i(str, true));
        c1884m.f7123g.set(c1877f.m7653k(str), false);
        c1884m.f7122f.m7694c(c1877f.m7652j(str));
        return c1884m;
    }

    /* renamed from: k */
    public static String m7701k(String str, C3262f c3262f) {
        return new C1877f(c3262f).m7653k(str);
    }

    /* renamed from: e */
    public Map<String, String> m7702e() {
        return this.f7120d.m7713b();
    }

    /* renamed from: f */
    public Map<String, String> m7703f() {
        return this.f7121e.m7713b();
    }

    /* renamed from: g */
    public List<AbstractC2135f0.e.d.AbstractC6180e> m7704g() {
        return this.f7122f.m7692a();
    }

    /* renamed from: h */
    public String m7705h() {
        return this.f7123g.getReference();
    }

    /* renamed from: l */
    public final void m7706l() {
        boolean z10;
        String str;
        synchronized (this.f7123g) {
            z10 = false;
            if (this.f7123g.isMarked()) {
                str = m7705h();
                this.f7123g.set(str, false);
                z10 = true;
            } else {
                str = null;
            }
        }
        if (z10) {
            this.f7117a.m7657s(this.f7119c, str);
        }
    }

    /* renamed from: m */
    public boolean m7707m(String str, String str2) {
        return this.f7120d.m7716f(str, str2);
    }

    /* renamed from: n */
    public boolean m7708n(String str, String str2) {
        return this.f7121e.m7716f(str, str2);
    }

    /* renamed from: o */
    public void m7709o(String str) {
        synchronized (this.f7119c) {
            this.f7119c = str;
            Map<String, String> m7713b = this.f7120d.m7713b();
            List<AbstractC1880i> m7693b = this.f7122f.m7693b();
            if (m7705h() != null) {
                this.f7117a.m7657s(str, m7705h());
            }
            if (!m7713b.isEmpty()) {
                this.f7117a.m7654p(str, m7713b);
            }
            if (!m7693b.isEmpty()) {
                this.f7117a.m7656r(str, m7693b);
            }
        }
    }

    /* renamed from: p */
    public void m7710p(String str) {
        String m7627c = C1875d.m7627c(str, 1024);
        synchronized (this.f7123g) {
            if (C1733i.m6837y(m7627c, this.f7123g.getReference())) {
                return;
            }
            this.f7123g.set(m7627c, true);
            this.f7118b.m6887h(new Callable() { // from class: f8.k
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object m7699i;
                    m7699i = C1884m.this.m7699i();
                    return m7699i;
                }
            });
        }
    }
}
