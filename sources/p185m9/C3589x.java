package p185m9;

import android.content.Context;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2238l;
import gd.C2245s;
import java.util.concurrent.atomic.AtomicReference;
import p038ce.C1063k;
import p038ce.C1089q0;
import p038ce.InterfaceC1085p0;
import p087fe.C1908d;
import p087fe.InterfaceC1906b;
import p087fe.InterfaceC1907c;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.AbstractC3470d;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p246r0.C4257a;
import p246r0.InterfaceC4262f;
import p261s0.C4386b;
import p272t0.C4601a;
import p286u0.AbstractC4782d;
import p286u0.C4779a;
import p286u0.C4783e;
import p286u0.C4784f;
import p286u0.C4785g;
import p298ud.InterfaceC5012a;
import p359yd.InterfaceC5918h;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import sd.InterfaceC4585q;
import td.AbstractC4754n;
import td.C4747g;
import td.C4753m;
import td.C4759s;
import td.C4764x;

/* renamed from: m9.x */
/* loaded from: classes.dex */
public final class C3589x implements InterfaceC3588w {

    /* renamed from: f */
    public static final c f12612f = new c(null);

    /* renamed from: g */
    @Deprecated
    public static final InterfaceC5012a<Context, InterfaceC4262f<AbstractC4782d>> f12613g = C4601a.m18128b(C3587v.f12606a.m13291a(), new C4386b(b.f12621h), null, null, 12, null);

    /* renamed from: b */
    public final Context f12614b;

    /* renamed from: c */
    public final InterfaceC3284g f12615c;

    /* renamed from: d */
    public final AtomicReference<C3577l> f12616d;

    /* renamed from: e */
    public final InterfaceC1906b<C3577l> f12617e;

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionDatastoreImpl$1", m12917f = "SessionDatastore.kt", m12918l = {C1417R.styleable.AppCompatTheme_listPreferredItemHeightSmall}, m12919m = "invokeSuspend")
    /* renamed from: m9.x$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f12618h;

        /* renamed from: m9.x$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C6195a<T> implements InterfaceC1907c {

            /* renamed from: h */
            public final /* synthetic */ C3589x f12620h;

            public C6195a(C3589x c3589x) {
                this.f12620h = c3589x;
            }

            @Override // p087fe.InterfaceC1907c
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C3577l c3577l, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                this.f12620h.f12616d.set(c3577l);
                return C2245s.f8873a;
            }
        }

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
            Object m12581c = C3385c.m12581c();
            int i10 = this.f12618h;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                InterfaceC1906b interfaceC1906b = C3589x.this.f12617e;
                C6195a c6195a = new C6195a(C3589x.this);
                this.f12618h = 1;
                if (interfaceC1906b.mo7781a(c6195a, this) == m12581c) {
                    return m12581c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2238l.m8975b(obj);
            }
            return C2245s.f8873a;
        }
    }

    /* renamed from: m9.x$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC4754n implements InterfaceC4580l<C4257a, AbstractC4782d> {

        /* renamed from: h */
        public static final b f12621h = new b();

        public b() {
            super(1);
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC4782d invoke(C4257a c4257a) {
            C4753m.m18653f(c4257a, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + C3586u.f12605a.m13290e() + '.', c4257a);
            return C4783e.m18793a();
        }
    }

    /* renamed from: m9.x$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final /* synthetic */ InterfaceC5918h<Object>[] f12622a = {C4764x.m18675e(new C4759s(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public c() {
        }

        public /* synthetic */ c(C4747g c4747g) {
            this();
        }

        /* renamed from: b */
        public final InterfaceC4262f<AbstractC4782d> m13306b(Context context) {
            return (InterfaceC4262f) C3589x.f12613g.mo18132a(context, f12622a[0]);
        }
    }

    /* renamed from: m9.x$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f12623a = new d();

        /* renamed from: b */
        public static final AbstractC4782d.a<String> f12624b = C4784f.m18800f("session_id");

        /* renamed from: a */
        public final AbstractC4782d.a<String> m13307a() {
            return f12624b;
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", m12917f = "SessionDatastore.kt", m12918l = {C1417R.styleable.AppCompatTheme_listChoiceIndicatorSingleAnimated}, m12919m = "invokeSuspend")
    /* renamed from: m9.x$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC3478l implements InterfaceC4585q<InterfaceC1907c<? super AbstractC4782d>, Throwable, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f12625h;

        /* renamed from: i */
        public /* synthetic */ Object f12626i;

        /* renamed from: j */
        public /* synthetic */ Object f12627j;

        public e(InterfaceC3281d<? super e> interfaceC3281d) {
            super(3, interfaceC3281d);
        }

        @Override // sd.InterfaceC4585q
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo7159b(InterfaceC1907c<? super AbstractC4782d> interfaceC1907c, Throwable th, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            e eVar = new e(interfaceC3281d);
            eVar.f12626i = interfaceC1907c;
            eVar.f12627j = th;
            return eVar.invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            Object m12581c = C3385c.m12581c();
            int i10 = this.f12625h;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                InterfaceC1907c interfaceC1907c = (InterfaceC1907c) this.f12626i;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f12627j);
                AbstractC4782d m18793a = C4783e.m18793a();
                this.f12626i = null;
                this.f12625h = 1;
                if (interfaceC1907c.emit(m18793a, this) == m12581c) {
                    return m12581c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2238l.m8975b(obj);
            }
            return C2245s.f8873a;
        }
    }

    /* renamed from: m9.x$f */
    /* loaded from: classes.dex */
    public static final class f implements InterfaceC1906b<C3577l> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC1906b f12628h;

        /* renamed from: i */
        public final /* synthetic */ C3589x f12629i;

        /* renamed from: m9.x$f$a */
        /* loaded from: classes.dex */
        public static final class a<T> implements InterfaceC1907c {

            /* renamed from: h */
            public final /* synthetic */ InterfaceC1907c f12630h;

            /* renamed from: i */
            public final /* synthetic */ C3589x f12631i;

            @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", m12917f = "SessionDatastore.kt", m12918l = {224}, m12919m = "emit")
            /* renamed from: m9.x$f$a$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C6196a extends AbstractC3470d {

                /* renamed from: h */
                public /* synthetic */ Object f12632h;

                /* renamed from: i */
                public int f12633i;

                public C6196a(InterfaceC3281d interfaceC3281d) {
                    super(interfaceC3281d);
                }

                @Override // p173ld.AbstractC3467a
                public final Object invokeSuspend(Object obj) {
                    this.f12632h = obj;
                    this.f12633i |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC1907c interfaceC1907c, C3589x c3589x) {
                this.f12630h = interfaceC1907c;
                this.f12631i = c3589x;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // p087fe.InterfaceC1907c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r5, p146jd.InterfaceC3281d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof p185m9.C3589x.f.a.C6196a
                    if (r0 == 0) goto L13
                    r0 = r6
                    m9.x$f$a$a r0 = (p185m9.C3589x.f.a.C6196a) r0
                    int r1 = r0.f12633i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f12633i = r1
                    goto L18
                L13:
                    m9.x$f$a$a r0 = new m9.x$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f12632h
                    java.lang.Object r1 = p161kd.C3385c.m12581c()
                    int r2 = r0.f12633i
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    gd.C2238l.m8975b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    gd.C2238l.m8975b(r6)
                    fe.c r6 = r4.f12630h
                    u0.d r5 = (p286u0.AbstractC4782d) r5
                    m9.x r2 = r4.f12631i
                    m9.l r5 = p185m9.C3589x.m13301h(r2, r5)
                    r0.f12633i = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    gd.s r5 = gd.C2245s.f8873a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: p185m9.C3589x.f.a.emit(java.lang.Object, jd.d):java.lang.Object");
            }
        }

        public f(InterfaceC1906b interfaceC1906b, C3589x c3589x) {
            this.f12628h = interfaceC1906b;
            this.f12629i = c3589x;
        }

        @Override // p087fe.InterfaceC1906b
        /* renamed from: a */
        public Object mo7781a(InterfaceC1907c<? super C3577l> interfaceC1907c, InterfaceC3281d interfaceC3281d) {
            Object mo7781a = this.f12628h.mo7781a(new a(interfaceC1907c, this.f12629i), interfaceC3281d);
            return mo7781a == C3385c.m12581c() ? mo7781a : C2245s.f8873a;
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", m12917f = "SessionDatastore.kt", m12918l = {C1417R.styleable.AppCompatTheme_panelMenuListTheme}, m12919m = "invokeSuspend")
    /* renamed from: m9.x$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f12635h;

        /* renamed from: j */
        public final /* synthetic */ String f12637j;

        @InterfaceC3472f(m12916c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", m12917f = "SessionDatastore.kt", m12918l = {}, m12919m = "invokeSuspend")
        /* renamed from: m9.x$g$a */
        /* loaded from: classes.dex */
        public static final class a extends AbstractC3478l implements InterfaceC4584p<C4779a, InterfaceC3281d<? super C2245s>, Object> {

            /* renamed from: h */
            public int f12638h;

            /* renamed from: i */
            public /* synthetic */ Object f12639i;

            /* renamed from: j */
            public final /* synthetic */ String f12640j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, InterfaceC3281d<? super a> interfaceC3281d) {
                super(2, interfaceC3281d);
                this.f12640j = str;
            }

            @Override // sd.InterfaceC4584p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C4779a c4779a, InterfaceC3281d<? super C2245s> interfaceC3281d) {
                return ((a) create(c4779a, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
            }

            @Override // p173ld.AbstractC3467a
            public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
                a aVar = new a(this.f12640j, interfaceC3281d);
                aVar.f12639i = obj;
                return aVar;
            }

            @Override // p173ld.AbstractC3467a
            public final Object invokeSuspend(Object obj) {
                C3385c.m12581c();
                if (this.f12638h != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2238l.m8975b(obj);
                ((C4779a) this.f12639i).m18782i(d.f12623a.m13307a(), this.f12640j);
                return C2245s.f8873a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, InterfaceC3281d<? super g> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f12637j = str;
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            return new g(this.f12637j, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((g) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            Object m12581c = C3385c.m12581c();
            int i10 = this.f12635h;
            if (i10 == 0) {
                C2238l.m8975b(obj);
                InterfaceC4262f m13306b = C3589x.f12612f.m13306b(C3589x.this.f12614b);
                a aVar = new a(this.f12637j, null);
                this.f12635h = 1;
                if (C4785g.m18802a(m13306b, aVar, this) == m12581c) {
                    return m12581c;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2238l.m8975b(obj);
            }
            return C2245s.f8873a;
        }
    }

    public C3589x(Context context, InterfaceC3284g interfaceC3284g) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(interfaceC3284g, "backgroundDispatcher");
        this.f12614b = context;
        this.f12615c = interfaceC3284g;
        this.f12616d = new AtomicReference<>();
        this.f12617e = new f(C1908d.m7783a(f12612f.m13306b(context).getData(), new e(null)), this);
        C1063k.m4457d(C1089q0.m4557a(interfaceC3284g), null, null, new a(null), 3, null);
    }

    @Override // p185m9.InterfaceC3588w
    /* renamed from: a */
    public String mo13293a() {
        C3577l c3577l = this.f12616d.get();
        if (c3577l != null) {
            return c3577l.m13280a();
        }
        return null;
    }

    @Override // p185m9.InterfaceC3588w
    /* renamed from: b */
    public void mo13294b(String str) {
        C4753m.m18653f(str, "sessionId");
        C1063k.m4457d(C1089q0.m4557a(this.f12615c), null, null, new g(str, null), 3, null);
    }

    /* renamed from: i */
    public final C3577l m13302i(AbstractC4782d abstractC4782d) {
        return new C3577l((String) abstractC4782d.mo18777b(d.f12623a.m13307a()));
    }
}
