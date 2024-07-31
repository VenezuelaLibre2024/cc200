package p210o9;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2238l;
import gd.C2245s;
import p038ce.C1058j;
import p038ce.InterfaceC1085p0;
import p087fe.C1908d;
import p087fe.InterfaceC1906b;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.AbstractC3470d;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p246r0.InterfaceC4262f;
import p286u0.AbstractC4782d;
import p286u0.C4779a;
import p286u0.C4784f;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;

/* renamed from: o9.g */
/* loaded from: classes.dex */
public final class C3962g {

    /* renamed from: c */
    public static final b f14255c = new b(null);

    /* renamed from: d */
    @Deprecated
    public static final AbstractC4782d.a<Boolean> f14256d = C4784f.m18795a("firebase_sessions_enabled");

    /* renamed from: e */
    @Deprecated
    public static final AbstractC4782d.a<Double> f14257e = C4784f.m18796b("firebase_sessions_sampling_rate");

    /* renamed from: f */
    @Deprecated
    public static final AbstractC4782d.a<Integer> f14258f = C4784f.m18798d("firebase_sessions_restart_timeout");

    /* renamed from: g */
    @Deprecated
    public static final AbstractC4782d.a<Integer> f14259g = C4784f.m18798d("firebase_sessions_cache_duration");

    /* renamed from: h */
    @Deprecated
    public static final AbstractC4782d.a<Long> f14260h = C4784f.m18799e("firebase_sessions_cache_updated_time");

    /* renamed from: a */
    public final InterfaceC4262f<AbstractC4782d> f14261a;

    /* renamed from: b */
    public C3960e f14262b;

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.settings.SettingsCache$1", m12917f = "SettingsCache.kt", m12918l = {C1417R.styleable.AppCompatTheme_buttonStyle}, m12919m = "invokeSuspend")
    /* renamed from: o9.g$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public Object f14263h;

        /* renamed from: i */
        public int f14264i;

        public a(InterfaceC3281d<? super a> interfaceC3281d) {
            super(2, interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            return new a(interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((a) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            C3962g c3962g;
            Object m12581c = C3385c.m12581c();
            int i10 = this.f14264i;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                C3962g c3962g2 = C3962g.this;
                InterfaceC1906b data = c3962g2.f14261a.getData();
                this.f14263h = c3962g2;
                this.f14264i = 1;
                Object m7788f = C1908d.m7788f(data, this);
                if (m7788f == m12581c) {
                    return m12581c;
                }
                c3962g = c3962g2;
                obj = m7788f;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3962g = (C3962g) this.f14263h;
                C2238l.m8975b(obj);
            }
            c3962g.m15014l(((AbstractC4782d) obj).m18789d());
            return C2245s.f8873a;
        }
    }

    /* renamed from: o9.g$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.settings.SettingsCache", m12917f = "SettingsCache.kt", m12918l = {C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle}, m12919m = "updateConfigValue")
    /* renamed from: o9.g$c */
    /* loaded from: classes.dex */
    public static final class c<T> extends AbstractC3470d {

        /* renamed from: h */
        public /* synthetic */ Object f14266h;

        /* renamed from: j */
        public int f14268j;

        public c(InterfaceC3281d<? super c> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f14266h = obj;
            this.f14268j |= Integer.MIN_VALUE;
            return C3962g.this.m15010h(null, null, this);
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", m12917f = "SettingsCache.kt", m12918l = {}, m12919m = "invokeSuspend")
    /* renamed from: o9.g$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC3478l implements InterfaceC4584p<C4779a, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f14269h;

        /* renamed from: i */
        public /* synthetic */ Object f14270i;

        /* renamed from: j */
        public final /* synthetic */ T f14271j;

        /* renamed from: k */
        public final /* synthetic */ AbstractC4782d.a<T> f14272k;

        /* renamed from: l */
        public final /* synthetic */ C3962g f14273l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(T t10, AbstractC4782d.a<T> aVar, C3962g c3962g, InterfaceC3281d<? super d> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f14271j = t10;
            this.f14272k = aVar;
            this.f14273l = c3962g;
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C4779a c4779a, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((d) create(c4779a, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            d dVar = new d(this.f14271j, this.f14272k, this.f14273l, interfaceC3281d);
            dVar.f14270i = obj;
            return dVar;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            C3385c.m12581c();
            if (this.f14269h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2238l.m8975b(obj);
            C4779a c4779a = (C4779a) this.f14270i;
            T t10 = this.f14271j;
            if (t10 != 0) {
                c4779a.m18782i(this.f14272k, t10);
            } else {
                c4779a.m18781h(this.f14272k);
            }
            this.f14273l.m15014l(c4779a);
            return C2245s.f8873a;
        }
    }

    public C3962g(InterfaceC4262f<AbstractC4782d> interfaceC4262f) {
        C4753m.m18653f(interfaceC4262f, "dataStore");
        this.f14261a = interfaceC4262f;
        C1058j.m4372b(null, new a(null), 1, null);
    }

    /* renamed from: d */
    public final boolean m15006d() {
        C3960e c3960e = this.f14262b;
        C3960e c3960e2 = null;
        if (c3960e == null) {
            C4753m.m18667t("sessionConfigs");
            c3960e = null;
        }
        Long m14988b = c3960e.m14988b();
        C3960e c3960e3 = this.f14262b;
        if (c3960e3 == null) {
            C4753m.m18667t("sessionConfigs");
        } else {
            c3960e2 = c3960e3;
        }
        Integer m14987a = c3960e2.m14987a();
        return m14988b == null || m14987a == null || (System.currentTimeMillis() - m14988b.longValue()) / ((long) 1000) >= ((long) m14987a.intValue());
    }

    /* renamed from: e */
    public final Integer m15007e() {
        C3960e c3960e = this.f14262b;
        if (c3960e == null) {
            C4753m.m18667t("sessionConfigs");
            c3960e = null;
        }
        return c3960e.m14990d();
    }

    /* renamed from: f */
    public final Double m15008f() {
        C3960e c3960e = this.f14262b;
        if (c3960e == null) {
            C4753m.m18667t("sessionConfigs");
            c3960e = null;
        }
        return c3960e.m14991e();
    }

    /* renamed from: g */
    public final Boolean m15009g() {
        C3960e c3960e = this.f14262b;
        if (c3960e == null) {
            C4753m.m18667t("sessionConfigs");
            c3960e = null;
        }
        return c3960e.m14989c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object m15010h(p286u0.AbstractC4782d.a<T> r6, T r7, p146jd.InterfaceC3281d<? super gd.C2245s> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof p210o9.C3962g.c
            if (r0 == 0) goto L13
            r0 = r8
            o9.g$c r0 = (p210o9.C3962g.c) r0
            int r1 = r0.f14268j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14268j = r1
            goto L18
        L13:
            o9.g$c r0 = new o9.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14266h
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f14268j
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            gd.C2238l.m8975b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            gd.C2238l.m8975b(r8)
            r0.f<u0.d> r8 = r5.f14261a     // Catch: java.io.IOException -> L29
            o9.g$d r2 = new o9.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f14268j = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = p286u0.C4785g.m18802a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            gd.s r6 = gd.C2245s.f8873a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p210o9.C3962g.m15010h(u0.d$a, java.lang.Object, jd.d):java.lang.Object");
    }

    /* renamed from: i */
    public final Object m15011i(Double d10, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Object m15010h = m15010h(f14257e, d10, interfaceC3281d);
        return m15010h == C3385c.m12581c() ? m15010h : C2245s.f8873a;
    }

    /* renamed from: j */
    public final Object m15012j(Integer num, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Object m15010h = m15010h(f14259g, num, interfaceC3281d);
        return m15010h == C3385c.m12581c() ? m15010h : C2245s.f8873a;
    }

    /* renamed from: k */
    public final Object m15013k(Long l10, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Object m15010h = m15010h(f14260h, l10, interfaceC3281d);
        return m15010h == C3385c.m12581c() ? m15010h : C2245s.f8873a;
    }

    /* renamed from: l */
    public final void m15014l(AbstractC4782d abstractC4782d) {
        this.f14262b = new C3960e((Boolean) abstractC4782d.mo18777b(f14256d), (Double) abstractC4782d.mo18777b(f14257e), (Integer) abstractC4782d.mo18777b(f14258f), (Integer) abstractC4782d.mo18777b(f14259g), (Long) abstractC4782d.mo18777b(f14260h));
    }

    /* renamed from: m */
    public final Object m15015m(Integer num, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Object m15010h = m15010h(f14258f, num, interfaceC3281d);
        return m15010h == C3385c.m12581c() ? m15010h : C2245s.f8873a;
    }

    /* renamed from: n */
    public final Object m15016n(Boolean bool, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        Object m15010h = m15010h(f14256d, bool, interfaceC3281d);
        return m15010h == C3385c.m12581c() ? m15010h : C2245s.f8873a;
    }
}
