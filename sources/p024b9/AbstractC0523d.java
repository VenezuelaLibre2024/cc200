package p024b9;

import com.google.auto.value.AutoValue;
import p024b9.C0520a;
import p024b9.C0522c;

@AutoValue
/* renamed from: b9.d */
/* loaded from: classes.dex */
public abstract class AbstractC0523d {

    /* renamed from: a */
    public static AbstractC0523d f2346a = m2532a().mo2511a();

    @AutoValue.Builder
    /* renamed from: b9.d$a */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC0523d mo2511a();

        /* renamed from: b */
        public abstract a mo2512b(String str);

        /* renamed from: c */
        public abstract a mo2513c(long j10);

        /* renamed from: d */
        public abstract a mo2514d(String str);

        /* renamed from: e */
        public abstract a mo2515e(String str);

        /* renamed from: f */
        public abstract a mo2516f(String str);

        /* renamed from: g */
        public abstract a mo2517g(C0522c.a aVar);

        /* renamed from: h */
        public abstract a mo2518h(long j10);
    }

    /* renamed from: a */
    public static a m2532a() {
        return new C0520a.b().mo2518h(0L).mo2517g(C0522c.a.ATTEMPT_MIGRATION).mo2513c(0L);
    }

    /* renamed from: b */
    public abstract String mo2503b();

    /* renamed from: c */
    public abstract long mo2504c();

    /* renamed from: d */
    public abstract String mo2505d();

    /* renamed from: e */
    public abstract String mo2506e();

    /* renamed from: f */
    public abstract String mo2507f();

    /* renamed from: g */
    public abstract C0522c.a mo2508g();

    /* renamed from: h */
    public abstract long mo2509h();

    /* renamed from: i */
    public boolean m2533i() {
        return mo2508g() == C0522c.a.REGISTER_ERROR;
    }

    /* renamed from: j */
    public boolean m2534j() {
        return mo2508g() == C0522c.a.NOT_GENERATED || mo2508g() == C0522c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: k */
    public boolean m2535k() {
        return mo2508g() == C0522c.a.REGISTERED;
    }

    /* renamed from: l */
    public boolean m2536l() {
        return mo2508g() == C0522c.a.UNREGISTERED;
    }

    /* renamed from: m */
    public boolean m2537m() {
        return mo2508g() == C0522c.a.ATTEMPT_MIGRATION;
    }

    /* renamed from: n */
    public abstract a mo2510n();

    /* renamed from: o */
    public AbstractC0523d m2538o(String str, long j10, long j11) {
        return mo2510n().mo2512b(str).mo2513c(j10).mo2518h(j11).mo2511a();
    }

    /* renamed from: p */
    public AbstractC0523d m2539p() {
        return mo2510n().mo2512b(null).mo2511a();
    }

    /* renamed from: q */
    public AbstractC0523d m2540q(String str) {
        return mo2510n().mo2515e(str).mo2517g(C0522c.a.REGISTER_ERROR).mo2511a();
    }

    /* renamed from: r */
    public AbstractC0523d m2541r() {
        return mo2510n().mo2517g(C0522c.a.NOT_GENERATED).mo2511a();
    }

    /* renamed from: s */
    public AbstractC0523d m2542s(String str, String str2, long j10, String str3, long j11) {
        return mo2510n().mo2514d(str).mo2517g(C0522c.a.REGISTERED).mo2512b(str3).mo2516f(str2).mo2513c(j11).mo2518h(j10).mo2511a();
    }

    /* renamed from: t */
    public AbstractC0523d m2543t(String str) {
        return mo2510n().mo2514d(str).mo2517g(C0522c.a.UNREGISTERED).mo2511a();
    }
}
