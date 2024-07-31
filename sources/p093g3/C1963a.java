package p093g3;

import io.flutter.plugins.firebase.crashlytics.Constants;
import p136j3.C3216a;
import p136j3.C3217b;
import p136j3.C3218c;
import p136j3.C3219d;
import p136j3.C3220e;
import p136j3.C3221f;
import p239q8.C4205d;
import p239q8.InterfaceC4206e;
import p239q8.InterfaceC4207f;
import p254r8.InterfaceC4322a;
import p254r8.InterfaceC4323b;
import p280t8.C4724a;

/* renamed from: g3.a */
/* loaded from: classes.dex */
public final class C1963a implements InterfaceC4322a {

    /* renamed from: a */
    public static final InterfaceC4322a f7812a = new C1963a();

    /* renamed from: g3.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4206e<C3216a> {

        /* renamed from: a */
        public static final a f7813a = new a();

        /* renamed from: b */
        public static final C4205d f7814b = C4205d.m16196a("window").m16201b(C4724a.m18567b().m18569c(1).m18568a()).m16200a();

        /* renamed from: c */
        public static final C4205d f7815c = C4205d.m16196a("logSourceMetrics").m16201b(C4724a.m18567b().m18569c(2).m18568a()).m16200a();

        /* renamed from: d */
        public static final C4205d f7816d = C4205d.m16196a("globalMetrics").m16201b(C4724a.m18567b().m18569c(3).m18568a()).m16200a();

        /* renamed from: e */
        public static final C4205d f7817e = C4205d.m16196a("appNamespace").m16201b(C4724a.m18567b().m18569c(4).m18568a()).m16200a();

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7324a(C3216a c3216a, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f7814b, c3216a.m11450d());
            interfaceC4207f.mo16205e(f7815c, c3216a.m11449c());
            interfaceC4207f.mo16205e(f7816d, c3216a.m11448b());
            interfaceC4207f.mo16205e(f7817e, c3216a.m11447a());
        }
    }

    /* renamed from: g3.a$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC4206e<C3217b> {

        /* renamed from: a */
        public static final b f7818a = new b();

        /* renamed from: b */
        public static final C4205d f7819b = C4205d.m16196a("storageMetrics").m16201b(C4724a.m18567b().m18569c(1).m18568a()).m16200a();

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7324a(C3217b c3217b, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f7819b, c3217b.m11458a());
        }
    }

    /* renamed from: g3.a$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC4206e<C3218c> {

        /* renamed from: a */
        public static final c f7820a = new c();

        /* renamed from: b */
        public static final C4205d f7821b = C4205d.m16196a("eventsDroppedCount").m16201b(C4724a.m18567b().m18569c(1).m18568a()).m16200a();

        /* renamed from: c */
        public static final C4205d f7822c = C4205d.m16196a(Constants.REASON).m16201b(C4724a.m18567b().m18569c(3).m18568a()).m16200a();

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7324a(C3218c c3218c, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16203b(f7821b, c3218c.m11462a());
            interfaceC4207f.mo16205e(f7822c, c3218c.m11463b());
        }
    }

    /* renamed from: g3.a$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC4206e<C3219d> {

        /* renamed from: a */
        public static final d f7823a = new d();

        /* renamed from: b */
        public static final C4205d f7824b = C4205d.m16196a("logSource").m16201b(C4724a.m18567b().m18569c(1).m18568a()).m16200a();

        /* renamed from: c */
        public static final C4205d f7825c = C4205d.m16196a("logEventDropped").m16201b(C4724a.m18567b().m18569c(2).m18568a()).m16200a();

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7324a(C3219d c3219d, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f7824b, c3219d.m11469b());
            interfaceC4207f.mo16205e(f7825c, c3219d.m11468a());
        }
    }

    /* renamed from: g3.a$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC4206e<AbstractC1975m> {

        /* renamed from: a */
        public static final e f7826a = new e();

        /* renamed from: b */
        public static final C4205d f7827b = C4205d.m16197d("clientMetrics");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7324a(AbstractC1975m abstractC1975m, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f7827b, abstractC1975m.m7996b());
        }
    }

    /* renamed from: g3.a$f */
    /* loaded from: classes.dex */
    public static final class f implements InterfaceC4206e<C3220e> {

        /* renamed from: a */
        public static final f f7828a = new f();

        /* renamed from: b */
        public static final C4205d f7829b = C4205d.m16196a("currentCacheSizeBytes").m16201b(C4724a.m18567b().m18569c(1).m18568a()).m16200a();

        /* renamed from: c */
        public static final C4205d f7830c = C4205d.m16196a("maxCacheSizeBytes").m16201b(C4724a.m18567b().m18569c(2).m18568a()).m16200a();

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7324a(C3220e c3220e, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16203b(f7829b, c3220e.m11474a());
            interfaceC4207f.mo16203b(f7830c, c3220e.m11475b());
        }
    }

    /* renamed from: g3.a$g */
    /* loaded from: classes.dex */
    public static final class g implements InterfaceC4206e<C3221f> {

        /* renamed from: a */
        public static final g f7831a = new g();

        /* renamed from: b */
        public static final C4205d f7832b = C4205d.m16196a("startMs").m16201b(C4724a.m18567b().m18569c(1).m18568a()).m16200a();

        /* renamed from: c */
        public static final C4205d f7833c = C4205d.m16196a("endMs").m16201b(C4724a.m18567b().m18569c(2).m18568a()).m16200a();

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo7324a(C3221f c3221f, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16203b(f7832b, c3221f.m11481b());
            interfaceC4207f.mo16203b(f7833c, c3221f.m11480a());
        }
    }

    @Override // p254r8.InterfaceC4322a
    /* renamed from: a */
    public void mo7323a(InterfaceC4323b<?> interfaceC4323b) {
        interfaceC4323b.mo16576a(AbstractC1975m.class, e.f7826a);
        interfaceC4323b.mo16576a(C3216a.class, a.f7813a);
        interfaceC4323b.mo16576a(C3221f.class, g.f7831a);
        interfaceC4323b.mo16576a(C3219d.class, d.f7823a);
        interfaceC4323b.mo16576a(C3218c.class, c.f7820a);
        interfaceC4323b.mo16576a(C3217b.class, b.f7818a);
        interfaceC4323b.mo16576a(C3220e.class, f.f7828a);
    }
}
