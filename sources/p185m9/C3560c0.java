package p185m9;

import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2245s;
import p038ce.C1063k;
import p038ce.C1089q0;
import p038ce.InterfaceC1085p0;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p173ld.AbstractC3470d;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p195n7.C3767g;
import p210o9.C3961f;
import p369z8.InterfaceC6084h;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;

/* renamed from: m9.c0 */
/* loaded from: classes.dex */
public final class C3560c0 implements InterfaceC3558b0 {

    /* renamed from: g */
    public static final a f12506g = new a(null);

    /* renamed from: h */
    public static final double f12507h = Math.random();

    /* renamed from: b */
    public final C3767g f12508b;

    /* renamed from: c */
    public final InterfaceC6084h f12509c;

    /* renamed from: d */
    public final C3961f f12510d;

    /* renamed from: e */
    public final InterfaceC3569h f12511e;

    /* renamed from: f */
    public final InterfaceC3284g f12512f;

    /* renamed from: m9.c0$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m12917f = "SessionFirelogPublisher.kt", m12918l = {C1417R.styleable.AppCompatTheme_textColorSearchUrl}, m12919m = "getFirebaseInstallationId")
    /* renamed from: m9.c0$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3470d {

        /* renamed from: h */
        public /* synthetic */ Object f12513h;

        /* renamed from: j */
        public int f12515j;

        public b(InterfaceC3281d<? super b> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f12513h = obj;
            this.f12515j |= Integer.MIN_VALUE;
            return C3560c0.this.m13231h(this);
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", m12917f = "SessionFirelogPublisher.kt", m12918l = {C1417R.styleable.AppCompatTheme_dividerHorizontal, C1417R.styleable.AppCompatTheme_editTextStyle, C1417R.styleable.AppCompatTheme_homeAsUpIndicator}, m12919m = "invokeSuspend")
    /* renamed from: m9.c0$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public Object f12516h;

        /* renamed from: i */
        public Object f12517i;

        /* renamed from: j */
        public Object f12518j;

        /* renamed from: k */
        public Object f12519k;

        /* renamed from: l */
        public Object f12520l;

        /* renamed from: m */
        public Object f12521m;

        /* renamed from: n */
        public int f12522n;

        /* renamed from: p */
        public final /* synthetic */ C3590y f12524p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3590y c3590y, InterfaceC3281d<? super c> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f12524p = c3590y;
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            return new c(this.f12524p, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((c) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00b2 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
        @Override // p173ld.AbstractC3467a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p185m9.C3560c0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m12917f = "SessionFirelogPublisher.kt", m12918l = {C1417R.styleable.AppCompatTheme_ratingBarStyleIndicator}, m12919m = "shouldLogSession")
    /* renamed from: m9.c0$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC3470d {

        /* renamed from: h */
        public Object f12525h;

        /* renamed from: i */
        public /* synthetic */ Object f12526i;

        /* renamed from: k */
        public int f12528k;

        public d(InterfaceC3281d<? super d> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f12526i = obj;
            this.f12528k |= Integer.MIN_VALUE;
            return C3560c0.this.m13233j(this);
        }
    }

    public C3560c0(C3767g c3767g, InterfaceC6084h interfaceC6084h, C3961f c3961f, InterfaceC3569h interfaceC3569h, InterfaceC3284g interfaceC3284g) {
        C4753m.m18653f(c3767g, "firebaseApp");
        C4753m.m18653f(interfaceC6084h, "firebaseInstallations");
        C4753m.m18653f(c3961f, "sessionSettings");
        C4753m.m18653f(interfaceC3569h, "eventGDTLogger");
        C4753m.m18653f(interfaceC3284g, "backgroundDispatcher");
        this.f12508b = c3767g;
        this.f12509c = interfaceC6084h;
        this.f12510d = c3961f;
        this.f12511e = interfaceC3569h;
        this.f12512f = interfaceC3284g;
    }

    @Override // p185m9.InterfaceC3558b0
    /* renamed from: a */
    public void mo13217a(C3590y c3590y) {
        C4753m.m18653f(c3590y, "sessionDetails");
        C1063k.m4457d(C1089q0.m4557a(this.f12512f), null, null, new c(c3590y, null), 3, null);
    }

    /* renamed from: g */
    public final void m13230g(C3591z c3591z) {
        try {
            this.f12511e.mo13268a(c3591z);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event: " + c3591z.m13316c().m13248e());
        } catch (RuntimeException e10) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m13231h(p146jd.InterfaceC3281d<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p185m9.C3560c0.b
            if (r0 == 0) goto L13
            r0 = r5
            m9.c0$b r0 = (p185m9.C3560c0.b) r0
            int r1 = r0.f12515j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12515j = r1
            goto L18
        L13:
            m9.c0$b r0 = new m9.c0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f12513h
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f12515j
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            gd.C2238l.m8975b(r5)     // Catch: java.lang.Exception -> L29
            goto L4a
        L29:
            r5 = move-exception
            goto L4d
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            gd.C2238l.m8975b(r5)
            z8.h r5 = r4.f12509c     // Catch: java.lang.Exception -> L29
            com.google.android.gms.tasks.Task r5 = r5.getId()     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = "firebaseInstallations.id"
            td.C4753m.m18652e(r5, r2)     // Catch: java.lang.Exception -> L29
            r0.f12515j = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = me.C3614b.m13369a(r5, r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L29
            goto L56
        L4d:
            java.lang.String r0 = "SessionFirelogPublisher"
            java.lang.String r1 = "Error getting Firebase Installation ID. Using an empty ID"
            android.util.Log.e(r0, r1, r5)
            java.lang.String r5 = ""
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p185m9.C3560c0.m13231h(jd.d):java.lang.Object");
    }

    /* renamed from: i */
    public final boolean m13232i() {
        return f12507h <= this.f12510d.m14993b();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m13233j(p146jd.InterfaceC3281d<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof p185m9.C3560c0.d
            if (r0 == 0) goto L13
            r0 = r6
            m9.c0$d r0 = (p185m9.C3560c0.d) r0
            int r1 = r0.f12528k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12528k = r1
            goto L18
        L13:
            m9.c0$d r0 = new m9.c0$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f12526i
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f12528k
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f12525h
            m9.c0 r0 = (p185m9.C3560c0) r0
            gd.C2238l.m8975b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            gd.C2238l.m8975b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            o9.f r6 = r5.f12510d
            r0.f12525h = r5
            r0.f12528k = r4
            java.lang.Object r6 = r6.m14998g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            o9.f r6 = r0.f12510d
            boolean r6 = r6.m14995d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
        L58:
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = p173ld.C3468b.m12913a(r1)
            return r6
        L60:
            boolean r6 = r0.m13232i()
            if (r6 != 0) goto L69
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            goto L58
        L69:
            java.lang.Boolean r6 = p173ld.C3468b.m12913a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p185m9.C3560c0.m13233j(jd.d):java.lang.Object");
    }
}
