package p210o9;

import android.content.Context;
import android.util.Log;
import be.C0550a;
import be.C0552c;
import be.EnumC0553d;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;
import p185m9.C3557b;
import p185m9.C3586u;
import p185m9.C3587v;
import p195n7.C3763c;
import p195n7.C3774n;
import p246r0.C4257a;
import p246r0.InterfaceC4262f;
import p261s0.C4386b;
import p272t0.C4601a;
import p286u0.AbstractC4782d;
import p286u0.C4783e;
import p298ud.InterfaceC5012a;
import p359yd.InterfaceC5918h;
import p369z8.InterfaceC6084h;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4747g;
import td.C4753m;
import td.C4759s;
import td.C4764x;

/* renamed from: o9.f */
/* loaded from: classes.dex */
public final class C3961f {

    /* renamed from: c */
    public static final b f14245c = new b(null);

    /* renamed from: d */
    public static final InterfaceC5012a<Context, InterfaceC4262f<AbstractC4782d>> f14246d = C4601a.m18128b(C3587v.f12606a.m13292b(), new C4386b(a.f14249h), null, null, 12, null);

    /* renamed from: a */
    public final InterfaceC3963h f14247a;

    /* renamed from: b */
    public final InterfaceC3963h f14248b;

    /* renamed from: o9.f$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<C4257a, AbstractC4782d> {

        /* renamed from: h */
        public static final a f14249h = new a();

        public a() {
            super(1);
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a */
        public final AbstractC4782d invoke(C4257a c4257a) {
            C4753m.m18653f(c4257a, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + C3586u.f12605a.m13290e() + '.', c4257a);
            return C4783e.m18793a();
        }
    }

    /* renamed from: o9.f$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public static final /* synthetic */ InterfaceC5918h<Object>[] f14250a = {C4764x.m18675e(new C4759s(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }

        /* renamed from: b */
        public final InterfaceC4262f<AbstractC4782d> m15001b(Context context) {
            return (InterfaceC4262f) C3961f.f14246d.mo18132a(context, f14250a[0]);
        }

        /* renamed from: c */
        public final C3961f m15002c() {
            Object m14348k = C3774n.m14361a(C3763c.f13574a).m14348k(C3961f.class);
            C4753m.m18652e(m14348k, "Firebase.app[SessionsSettings::class.java]");
            return (C3961f) m14348k;
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.settings.SessionsSettings", m12917f = "SessionsSettings.kt", m12918l = {138, 139}, m12919m = "updateSettings")
    /* renamed from: o9.f$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC3470d {

        /* renamed from: h */
        public Object f14251h;

        /* renamed from: i */
        public /* synthetic */ Object f14252i;

        /* renamed from: k */
        public int f14254k;

        public c(InterfaceC3281d<? super c> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f14252i = obj;
            this.f14254k |= Integer.MIN_VALUE;
            return C3961f.this.m14998g(this);
        }
    }

    public C3961f(Context context, InterfaceC3284g interfaceC3284g, InterfaceC3284g interfaceC3284g2, InterfaceC6084h interfaceC6084h, C3557b c3557b) {
        this(new C3957b(context), new C3958c(interfaceC3284g2, interfaceC6084h, c3557b, new C3959d(c3557b, interfaceC3284g, null, 4, null), f14245c.m15001b(context)));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3961f(p195n7.C3767g r8, p146jd.InterfaceC3284g r9, p146jd.InterfaceC3284g r10, p369z8.InterfaceC6084h r11) {
        /*
            r7 = this;
            java.lang.String r0 = "firebaseApp"
            td.C4753m.m18653f(r8, r0)
            java.lang.String r0 = "blockingDispatcher"
            td.C4753m.m18653f(r9, r0)
            java.lang.String r0 = "backgroundDispatcher"
            td.C4753m.m18653f(r10, r0)
            java.lang.String r0 = "firebaseInstallationsApi"
            td.C4753m.m18653f(r11, r0)
            android.content.Context r2 = r8.m14349m()
            java.lang.String r0 = "firebaseApp.applicationContext"
            td.C4753m.m18652e(r2, r0)
            m9.a0 r0 = p185m9.C3556a0.f12461a
            m9.b r6 = r0.m13208b(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p210o9.C3961f.<init>(n7.g, jd.g, jd.g, z8.h):void");
    }

    public C3961f(InterfaceC3963h interfaceC3963h, InterfaceC3963h interfaceC3963h2) {
        C4753m.m18653f(interfaceC3963h, "localOverrideSettings");
        C4753m.m18653f(interfaceC3963h2, "remoteSettings");
        this.f14247a = interfaceC3963h;
        this.f14248b = interfaceC3963h2;
    }

    /* renamed from: b */
    public final double m14993b() {
        Double mo14979c = this.f14247a.mo14979c();
        if (mo14979c != null) {
            double doubleValue = mo14979c.doubleValue();
            if (m14996e(doubleValue)) {
                return doubleValue;
            }
        }
        Double mo14979c2 = this.f14248b.mo14979c();
        if (mo14979c2 == null) {
            return 1.0d;
        }
        double doubleValue2 = mo14979c2.doubleValue();
        if (m14996e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    /* renamed from: c */
    public final long m14994c() {
        C0550a mo14978b = this.f14247a.mo14978b();
        if (mo14978b != null) {
            long m2770I = mo14978b.m2770I();
            if (m14997f(m2770I)) {
                return m2770I;
            }
        }
        C0550a mo14978b2 = this.f14248b.mo14978b();
        if (mo14978b2 != null) {
            long m2770I2 = mo14978b2.m2770I();
            if (m14997f(m2770I2)) {
                return m2770I2;
            }
        }
        C0550a.a aVar = C0550a.f2478i;
        return C0552c.m2780h(30, EnumC0553d.MINUTES);
    }

    /* renamed from: d */
    public final boolean m14995d() {
        Boolean mo14977a = this.f14247a.mo14977a();
        if (mo14977a != null) {
            return mo14977a.booleanValue();
        }
        Boolean mo14977a2 = this.f14248b.mo14977a();
        if (mo14977a2 != null) {
            return mo14977a2.booleanValue();
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m14996e(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    /* renamed from: f */
    public final boolean m14997f(long j10) {
        return C0550a.m2747E(j10) && C0550a.m2769z(j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m14998g(p146jd.InterfaceC3281d<? super gd.C2245s> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p210o9.C3961f.c
            if (r0 == 0) goto L13
            r0 = r6
            o9.f$c r0 = (p210o9.C3961f.c) r0
            int r1 = r0.f14254k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14254k = r1
            goto L18
        L13:
            o9.f$c r0 = new o9.f$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14252i
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f14254k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            gd.C2238l.m8975b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f14251h
            o9.f r2 = (p210o9.C3961f) r2
            gd.C2238l.m8975b(r6)
            goto L4d
        L3c:
            gd.C2238l.m8975b(r6)
            o9.h r6 = r5.f14247a
            r0.f14251h = r5
            r0.f14254k = r4
            java.lang.Object r6 = r6.mo14980d(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            o9.h r6 = r2.f14248b
            r2 = 0
            r0.f14251h = r2
            r0.f14254k = r3
            java.lang.Object r6 = r6.mo14980d(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            gd.s r6 = gd.C2245s.f8873a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p210o9.C3961f.m14998g(jd.d):java.lang.Object");
    }
}
