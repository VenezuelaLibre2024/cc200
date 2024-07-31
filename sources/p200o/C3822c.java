package p200o;

import java.util.concurrent.Executor;

/* renamed from: o.c */
/* loaded from: classes.dex */
public class C3822c extends AbstractC3824e {

    /* renamed from: c */
    public static volatile C3822c f13749c;

    /* renamed from: d */
    public static final Executor f13750d = new Executor() { // from class: o.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C3822c.m14530h(runnable);
        }
    };

    /* renamed from: e */
    public static final Executor f13751e = new Executor() { // from class: o.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C3822c.m14531i(runnable);
        }
    };

    /* renamed from: a */
    public AbstractC3824e f13752a;

    /* renamed from: b */
    public final AbstractC3824e f13753b;

    public C3822c() {
        C3823d c3823d = new C3823d();
        this.f13753b = c3823d;
        this.f13752a = c3823d;
    }

    /* renamed from: f */
    public static Executor m14528f() {
        return f13751e;
    }

    /* renamed from: g */
    public static C3822c m14529g() {
        if (f13749c != null) {
            return f13749c;
        }
        synchronized (C3822c.class) {
            if (f13749c == null) {
                f13749c = new C3822c();
            }
        }
        return f13749c;
    }

    /* renamed from: h */
    public static /* synthetic */ void m14530h(Runnable runnable) {
        m14529g().mo14534c(runnable);
    }

    /* renamed from: i */
    public static /* synthetic */ void m14531i(Runnable runnable) {
        m14529g().mo14532a(runnable);
    }

    @Override // p200o.AbstractC3824e
    /* renamed from: a */
    public void mo14532a(Runnable runnable) {
        this.f13752a.mo14532a(runnable);
    }

    @Override // p200o.AbstractC3824e
    /* renamed from: b */
    public boolean mo14533b() {
        return this.f13752a.mo14533b();
    }

    @Override // p200o.AbstractC3824e
    /* renamed from: c */
    public void mo14534c(Runnable runnable) {
        this.f13752a.mo14534c(runnable);
    }
}
