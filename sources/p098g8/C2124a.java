package p098g8;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import p098g8.AbstractC2135f0;
import p239q8.C4205d;
import p239q8.InterfaceC4206e;
import p239q8.InterfaceC4207f;
import p254r8.InterfaceC4322a;
import p254r8.InterfaceC4323b;

/* renamed from: g8.a */
/* loaded from: classes.dex */
public final class C2124a implements InterfaceC4322a {

    /* renamed from: a */
    public static final InterfaceC4322a f8225a = new C2124a();

    /* renamed from: g8.a$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4206e<AbstractC2135f0.a.AbstractC6164a> {

        /* renamed from: a */
        public static final a f8226a = new a();

        /* renamed from: b */
        public static final C4205d f8227b = C4205d.m16197d("arch");

        /* renamed from: c */
        public static final C4205d f8228c = C4205d.m16197d("libraryName");

        /* renamed from: d */
        public static final C4205d f8229d = C4205d.m16197d(Constants.BUILD_ID);

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.a.AbstractC6164a abstractC6164a, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8227b, abstractC6164a.mo8421b());
            interfaceC4207f.mo16205e(f8228c, abstractC6164a.mo8423d());
            interfaceC4207f.mo16205e(f8229d, abstractC6164a.mo8422c());
        }
    }

    /* renamed from: g8.a$b */
    /* loaded from: classes.dex */
    public static final class b implements InterfaceC4206e<AbstractC2135f0.a> {

        /* renamed from: a */
        public static final b f8230a = new b();

        /* renamed from: b */
        public static final C4205d f8231b = C4205d.m16197d("pid");

        /* renamed from: c */
        public static final C4205d f8232c = C4205d.m16197d("processName");

        /* renamed from: d */
        public static final C4205d f8233d = C4205d.m16197d("reasonCode");

        /* renamed from: e */
        public static final C4205d f8234e = C4205d.m16197d("importance");

        /* renamed from: f */
        public static final C4205d f8235f = C4205d.m16197d("pss");

        /* renamed from: g */
        public static final C4205d f8236g = C4205d.m16197d("rss");

        /* renamed from: h */
        public static final C4205d f8237h = C4205d.m16197d(Constants.TIMESTAMP);

        /* renamed from: i */
        public static final C4205d f8238i = C4205d.m16197d("traceFile");

        /* renamed from: j */
        public static final C4205d f8239j = C4205d.m16197d("buildIdMappingForArch");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.a aVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16202a(f8231b, aVar.mo8398d());
            interfaceC4207f.mo16205e(f8232c, aVar.mo8399e());
            interfaceC4207f.mo16202a(f8233d, aVar.mo8401g());
            interfaceC4207f.mo16202a(f8234e, aVar.mo8397c());
            interfaceC4207f.mo16203b(f8235f, aVar.mo8400f());
            interfaceC4207f.mo16203b(f8236g, aVar.mo8402h());
            interfaceC4207f.mo16203b(f8237h, aVar.mo8403i());
            interfaceC4207f.mo16205e(f8238i, aVar.mo8404j());
            interfaceC4207f.mo16205e(f8239j, aVar.mo8396b());
        }
    }

    /* renamed from: g8.a$c */
    /* loaded from: classes.dex */
    public static final class c implements InterfaceC4206e<AbstractC2135f0.c> {

        /* renamed from: a */
        public static final c f8240a = new c();

        /* renamed from: b */
        public static final C4205d f8241b = C4205d.m16197d(Constants.KEY);

        /* renamed from: c */
        public static final C4205d f8242c = C4205d.m16197d("value");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.c cVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8241b, cVar.mo8437b());
            interfaceC4207f.mo16205e(f8242c, cVar.mo8438c());
        }
    }

    /* renamed from: g8.a$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC4206e<AbstractC2135f0> {

        /* renamed from: a */
        public static final d f8243a = new d();

        /* renamed from: b */
        public static final C4205d f8244b = C4205d.m16197d("sdkVersion");

        /* renamed from: c */
        public static final C4205d f8245c = C4205d.m16197d("gmpAppId");

        /* renamed from: d */
        public static final C4205d f8246d = C4205d.m16197d("platform");

        /* renamed from: e */
        public static final C4205d f8247e = C4205d.m16197d("installationUuid");

        /* renamed from: f */
        public static final C4205d f8248f = C4205d.m16197d("firebaseInstallationId");

        /* renamed from: g */
        public static final C4205d f8249g = C4205d.m16197d("appQualitySessionId");

        /* renamed from: h */
        public static final C4205d f8250h = C4205d.m16197d("buildVersion");

        /* renamed from: i */
        public static final C4205d f8251i = C4205d.m16197d("displayVersion");

        /* renamed from: j */
        public static final C4205d f8252j = C4205d.m16197d("session");

        /* renamed from: k */
        public static final C4205d f8253k = C4205d.m16197d("ndkPayload");

        /* renamed from: l */
        public static final C4205d f8254l = C4205d.m16197d("appExitInfo");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0 abstractC2135f0, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8244b, abstractC2135f0.mo8378l());
            interfaceC4207f.mo16205e(f8245c, abstractC2135f0.mo8374h());
            interfaceC4207f.mo16202a(f8246d, abstractC2135f0.mo8377k());
            interfaceC4207f.mo16205e(f8247e, abstractC2135f0.mo8375i());
            interfaceC4207f.mo16205e(f8248f, abstractC2135f0.mo8373g());
            interfaceC4207f.mo16205e(f8249g, abstractC2135f0.mo8370d());
            interfaceC4207f.mo16205e(f8250h, abstractC2135f0.mo8371e());
            interfaceC4207f.mo16205e(f8251i, abstractC2135f0.mo8372f());
            interfaceC4207f.mo16205e(f8252j, abstractC2135f0.mo8379m());
            interfaceC4207f.mo16205e(f8253k, abstractC2135f0.mo8376j());
            interfaceC4207f.mo16205e(f8254l, abstractC2135f0.mo8369c());
        }
    }

    /* renamed from: g8.a$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC4206e<AbstractC2135f0.d> {

        /* renamed from: a */
        public static final e f8255a = new e();

        /* renamed from: b */
        public static final C4205d f8256b = C4205d.m16197d("files");

        /* renamed from: c */
        public static final C4205d f8257c = C4205d.m16197d("orgId");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.d dVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8256b, dVar.mo8445b());
            interfaceC4207f.mo16205e(f8257c, dVar.mo8446c());
        }
    }

    /* renamed from: g8.a$f */
    /* loaded from: classes.dex */
    public static final class f implements InterfaceC4206e<AbstractC2135f0.d.b> {

        /* renamed from: a */
        public static final f f8258a = new f();

        /* renamed from: b */
        public static final C4205d f8259b = C4205d.m16197d("filename");

        /* renamed from: c */
        public static final C4205d f8260c = C4205d.m16197d("contents");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.d.b bVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8259b, bVar.mo8464c());
            interfaceC4207f.mo16205e(f8260c, bVar.mo8463b());
        }
    }

    /* renamed from: g8.a$g */
    /* loaded from: classes.dex */
    public static final class g implements InterfaceC4206e<AbstractC2135f0.e.a> {

        /* renamed from: a */
        public static final g f8261a = new g();

        /* renamed from: b */
        public static final C4205d f8262b = C4205d.m16197d(Constants.IDENTIFIER);

        /* renamed from: c */
        public static final C4205d f8263c = C4205d.m16197d("version");

        /* renamed from: d */
        public static final C4205d f8264d = C4205d.m16197d("displayVersion");

        /* renamed from: e */
        public static final C4205d f8265e = C4205d.m16197d("organization");

        /* renamed from: f */
        public static final C4205d f8266f = C4205d.m16197d("installationUuid");

        /* renamed from: g */
        public static final C4205d f8267g = C4205d.m16197d("developmentPlatform");

        /* renamed from: h */
        public static final C4205d f8268h = C4205d.m16197d("developmentPlatformVersion");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.a aVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8262b, aVar.mo8490e());
            interfaceC4207f.mo16205e(f8263c, aVar.mo8493h());
            interfaceC4207f.mo16205e(f8264d, aVar.mo8489d());
            interfaceC4207f.mo16205e(f8265e, aVar.mo8492g());
            interfaceC4207f.mo16205e(f8266f, aVar.mo8491f());
            interfaceC4207f.mo16205e(f8267g, aVar.mo8487b());
            interfaceC4207f.mo16205e(f8268h, aVar.mo8488c());
        }
    }

    /* renamed from: g8.a$h */
    /* loaded from: classes.dex */
    public static final class h implements InterfaceC4206e<AbstractC2135f0.e.a.b> {

        /* renamed from: a */
        public static final h f8269a = new h();

        /* renamed from: b */
        public static final C4205d f8270b = C4205d.m16197d("clsId");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.a.b bVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8270b, bVar.mo8501a());
        }
    }

    /* renamed from: g8.a$i */
    /* loaded from: classes.dex */
    public static final class i implements InterfaceC4206e<AbstractC2135f0.e.c> {

        /* renamed from: a */
        public static final i f8271a = new i();

        /* renamed from: b */
        public static final C4205d f8272b = C4205d.m16197d("arch");

        /* renamed from: c */
        public static final C4205d f8273c = C4205d.m16197d("model");

        /* renamed from: d */
        public static final C4205d f8274d = C4205d.m16197d("cores");

        /* renamed from: e */
        public static final C4205d f8275e = C4205d.m16197d("ram");

        /* renamed from: f */
        public static final C4205d f8276f = C4205d.m16197d("diskSpace");

        /* renamed from: g */
        public static final C4205d f8277g = C4205d.m16197d("simulator");

        /* renamed from: h */
        public static final C4205d f8278h = C4205d.m16197d("state");

        /* renamed from: i */
        public static final C4205d f8279i = C4205d.m16197d("manufacturer");

        /* renamed from: j */
        public static final C4205d f8280j = C4205d.m16197d("modelClass");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.c cVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16202a(f8272b, cVar.mo8517b());
            interfaceC4207f.mo16205e(f8273c, cVar.mo8521f());
            interfaceC4207f.mo16202a(f8274d, cVar.mo8518c());
            interfaceC4207f.mo16203b(f8275e, cVar.mo8523h());
            interfaceC4207f.mo16203b(f8276f, cVar.mo8519d());
            interfaceC4207f.mo16206g(f8277g, cVar.mo8525j());
            interfaceC4207f.mo16202a(f8278h, cVar.mo8524i());
            interfaceC4207f.mo16205e(f8279i, cVar.mo8520e());
            interfaceC4207f.mo16205e(f8280j, cVar.mo8522g());
        }
    }

    /* renamed from: g8.a$j */
    /* loaded from: classes.dex */
    public static final class j implements InterfaceC4206e<AbstractC2135f0.e> {

        /* renamed from: a */
        public static final j f8281a = new j();

        /* renamed from: b */
        public static final C4205d f8282b = C4205d.m16197d("generator");

        /* renamed from: c */
        public static final C4205d f8283c = C4205d.m16197d(Constants.IDENTIFIER);

        /* renamed from: d */
        public static final C4205d f8284d = C4205d.m16197d("appQualitySessionId");

        /* renamed from: e */
        public static final C4205d f8285e = C4205d.m16197d("startedAt");

        /* renamed from: f */
        public static final C4205d f8286f = C4205d.m16197d("endedAt");

        /* renamed from: g */
        public static final C4205d f8287g = C4205d.m16197d("crashed");

        /* renamed from: h */
        public static final C4205d f8288h = C4205d.m16197d("app");

        /* renamed from: i */
        public static final C4205d f8289i = C4205d.m16197d(io.flutter.plugins.firebase.auth.Constants.USER);

        /* renamed from: j */
        public static final C4205d f8290j = C4205d.m16197d("os");

        /* renamed from: k */
        public static final C4205d f8291k = C4205d.m16197d("device");

        /* renamed from: l */
        public static final C4205d f8292l = C4205d.m16197d("events");

        /* renamed from: m */
        public static final C4205d f8293m = C4205d.m16197d("generatorType");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e eVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8282b, eVar.mo8474g());
            interfaceC4207f.mo16205e(f8283c, eVar.m8477j());
            interfaceC4207f.mo16205e(f8284d, eVar.mo8470c());
            interfaceC4207f.mo16203b(f8285e, eVar.mo8479l());
            interfaceC4207f.mo16205e(f8286f, eVar.mo8472e());
            interfaceC4207f.mo16206g(f8287g, eVar.mo8481n());
            interfaceC4207f.mo16205e(f8288h, eVar.mo8469b());
            interfaceC4207f.mo16205e(f8289i, eVar.mo8480m());
            interfaceC4207f.mo16205e(f8290j, eVar.mo8478k());
            interfaceC4207f.mo16205e(f8291k, eVar.mo8471d());
            interfaceC4207f.mo16205e(f8292l, eVar.mo8473f());
            interfaceC4207f.mo16202a(f8293m, eVar.mo8475h());
        }
    }

    /* renamed from: g8.a$k */
    /* loaded from: classes.dex */
    public static final class k implements InterfaceC4206e<AbstractC2135f0.e.d.a> {

        /* renamed from: a */
        public static final k f8294a = new k();

        /* renamed from: b */
        public static final C4205d f8295b = C4205d.m16197d("execution");

        /* renamed from: c */
        public static final C4205d f8296c = C4205d.m16197d("customAttributes");

        /* renamed from: d */
        public static final C4205d f8297d = C4205d.m16197d("internalKeys");

        /* renamed from: e */
        public static final C4205d f8298e = C4205d.m16197d("background");

        /* renamed from: f */
        public static final C4205d f8299f = C4205d.m16197d("currentProcessDetails");

        /* renamed from: g */
        public static final C4205d f8300g = C4205d.m16197d("appProcessDetails");

        /* renamed from: h */
        public static final C4205d f8301h = C4205d.m16197d("uiOrientation");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.a aVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8295b, aVar.mo8549f());
            interfaceC4207f.mo16205e(f8296c, aVar.mo8548e());
            interfaceC4207f.mo16205e(f8297d, aVar.mo8550g());
            interfaceC4207f.mo16205e(f8298e, aVar.mo8546c());
            interfaceC4207f.mo16205e(f8299f, aVar.mo8547d());
            interfaceC4207f.mo16205e(f8300g, aVar.mo8545b());
            interfaceC4207f.mo16202a(f8301h, aVar.mo8551h());
        }
    }

    /* renamed from: g8.a$l */
    /* loaded from: classes.dex */
    public static final class l implements InterfaceC4206e<AbstractC2135f0.e.d.a.b.AbstractC6168a> {

        /* renamed from: a */
        public static final l f8302a = new l();

        /* renamed from: b */
        public static final C4205d f8303b = C4205d.m16197d("baseAddress");

        /* renamed from: c */
        public static final C4205d f8304c = C4205d.m16197d("size");

        /* renamed from: d */
        public static final C4205d f8305d = C4205d.m16197d("name");

        /* renamed from: e */
        public static final C4205d f8306e = C4205d.m16197d("uuid");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.a.b.AbstractC6168a abstractC6168a, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16203b(f8303b, abstractC6168a.mo8568b());
            interfaceC4207f.mo16203b(f8304c, abstractC6168a.mo8570d());
            interfaceC4207f.mo16205e(f8305d, abstractC6168a.mo8569c());
            interfaceC4207f.mo16205e(f8306e, abstractC6168a.m8572f());
        }
    }

    /* renamed from: g8.a$m */
    /* loaded from: classes.dex */
    public static final class m implements InterfaceC4206e<AbstractC2135f0.e.d.a.b> {

        /* renamed from: a */
        public static final m f8307a = new m();

        /* renamed from: b */
        public static final C4205d f8308b = C4205d.m16197d("threads");

        /* renamed from: c */
        public static final C4205d f8309c = C4205d.m16197d(Constants.EXCEPTION);

        /* renamed from: d */
        public static final C4205d f8310d = C4205d.m16197d("appExitInfo");

        /* renamed from: e */
        public static final C4205d f8311e = C4205d.m16197d("signal");

        /* renamed from: f */
        public static final C4205d f8312f = C4205d.m16197d("binaries");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.a.b bVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8308b, bVar.mo8566f());
            interfaceC4207f.mo16205e(f8309c, bVar.mo8564d());
            interfaceC4207f.mo16205e(f8310d, bVar.mo8562b());
            interfaceC4207f.mo16205e(f8311e, bVar.mo8565e());
            interfaceC4207f.mo16205e(f8312f, bVar.mo8563c());
        }
    }

    /* renamed from: g8.a$n */
    /* loaded from: classes.dex */
    public static final class n implements InterfaceC4206e<AbstractC2135f0.e.d.a.b.c> {

        /* renamed from: a */
        public static final n f8313a = new n();

        /* renamed from: b */
        public static final C4205d f8314b = C4205d.m16197d(ImagePickerCache.MAP_KEY_TYPE);

        /* renamed from: c */
        public static final C4205d f8315c = C4205d.m16197d(Constants.REASON);

        /* renamed from: d */
        public static final C4205d f8316d = C4205d.m16197d("frames");

        /* renamed from: e */
        public static final C4205d f8317e = C4205d.m16197d("causedBy");

        /* renamed from: f */
        public static final C4205d f8318f = C4205d.m16197d("overflowCount");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.a.b.c cVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8314b, cVar.mo8590f());
            interfaceC4207f.mo16205e(f8315c, cVar.mo8589e());
            interfaceC4207f.mo16205e(f8316d, cVar.mo8587c());
            interfaceC4207f.mo16205e(f8317e, cVar.mo8586b());
            interfaceC4207f.mo16202a(f8318f, cVar.mo8588d());
        }
    }

    /* renamed from: g8.a$o */
    /* loaded from: classes.dex */
    public static final class o implements InterfaceC4206e<AbstractC2135f0.e.d.a.b.AbstractC6172d> {

        /* renamed from: a */
        public static final o f8319a = new o();

        /* renamed from: b */
        public static final C4205d f8320b = C4205d.m16197d("name");

        /* renamed from: c */
        public static final C4205d f8321c = C4205d.m16197d("code");

        /* renamed from: d */
        public static final C4205d f8322d = C4205d.m16197d("address");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.a.b.AbstractC6172d abstractC6172d, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8320b, abstractC6172d.mo8600d());
            interfaceC4207f.mo16205e(f8321c, abstractC6172d.mo8599c());
            interfaceC4207f.mo16203b(f8322d, abstractC6172d.mo8598b());
        }
    }

    /* renamed from: g8.a$p */
    /* loaded from: classes.dex */
    public static final class p implements InterfaceC4206e<AbstractC2135f0.e.d.a.b.AbstractC6174e> {

        /* renamed from: a */
        public static final p f8323a = new p();

        /* renamed from: b */
        public static final C4205d f8324b = C4205d.m16197d("name");

        /* renamed from: c */
        public static final C4205d f8325c = C4205d.m16197d("importance");

        /* renamed from: d */
        public static final C4205d f8326d = C4205d.m16197d("frames");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.a.b.AbstractC6174e abstractC6174e, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8324b, abstractC6174e.mo8608d());
            interfaceC4207f.mo16202a(f8325c, abstractC6174e.mo8607c());
            interfaceC4207f.mo16205e(f8326d, abstractC6174e.mo8606b());
        }
    }

    /* renamed from: g8.a$q */
    /* loaded from: classes.dex */
    public static final class q implements InterfaceC4206e<AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b> {

        /* renamed from: a */
        public static final q f8327a = new q();

        /* renamed from: b */
        public static final C4205d f8328b = C4205d.m16197d("pc");

        /* renamed from: c */
        public static final C4205d f8329c = C4205d.m16197d("symbol");

        /* renamed from: d */
        public static final C4205d f8330d = C4205d.m16197d(Constants.FILE);

        /* renamed from: e */
        public static final C4205d f8331e = C4205d.m16197d("offset");

        /* renamed from: f */
        public static final C4205d f8332f = C4205d.m16197d("importance");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b abstractC6176b, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16203b(f8328b, abstractC6176b.mo8617e());
            interfaceC4207f.mo16205e(f8329c, abstractC6176b.mo8618f());
            interfaceC4207f.mo16205e(f8330d, abstractC6176b.mo8614b());
            interfaceC4207f.mo16203b(f8331e, abstractC6176b.mo8616d());
            interfaceC4207f.mo16202a(f8332f, abstractC6176b.mo8615c());
        }
    }

    /* renamed from: g8.a$r */
    /* loaded from: classes.dex */
    public static final class r implements InterfaceC4206e<AbstractC2135f0.e.d.a.c> {

        /* renamed from: a */
        public static final r f8333a = new r();

        /* renamed from: b */
        public static final C4205d f8334b = C4205d.m16197d("processName");

        /* renamed from: c */
        public static final C4205d f8335c = C4205d.m16197d("pid");

        /* renamed from: d */
        public static final C4205d f8336d = C4205d.m16197d("importance");

        /* renamed from: e */
        public static final C4205d f8337e = C4205d.m16197d("defaultProcess");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.a.c cVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8334b, cVar.mo8628d());
            interfaceC4207f.mo16202a(f8335c, cVar.mo8627c());
            interfaceC4207f.mo16202a(f8336d, cVar.mo8626b());
            interfaceC4207f.mo16206g(f8337e, cVar.mo8629e());
        }
    }

    /* renamed from: g8.a$s */
    /* loaded from: classes.dex */
    public static final class s implements InterfaceC4206e<AbstractC2135f0.e.d.c> {

        /* renamed from: a */
        public static final s f8338a = new s();

        /* renamed from: b */
        public static final C4205d f8339b = C4205d.m16197d("batteryLevel");

        /* renamed from: c */
        public static final C4205d f8340c = C4205d.m16197d("batteryVelocity");

        /* renamed from: d */
        public static final C4205d f8341d = C4205d.m16197d("proximityOn");

        /* renamed from: e */
        public static final C4205d f8342e = C4205d.m16197d("orientation");

        /* renamed from: f */
        public static final C4205d f8343f = C4205d.m16197d("ramUsed");

        /* renamed from: g */
        public static final C4205d f8344g = C4205d.m16197d("diskUsed");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.c cVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8339b, cVar.mo8643b());
            interfaceC4207f.mo16202a(f8340c, cVar.mo8644c());
            interfaceC4207f.mo16206g(f8341d, cVar.mo8648g());
            interfaceC4207f.mo16202a(f8342e, cVar.mo8646e());
            interfaceC4207f.mo16203b(f8343f, cVar.mo8647f());
            interfaceC4207f.mo16203b(f8344g, cVar.mo8645d());
        }
    }

    /* renamed from: g8.a$t */
    /* loaded from: classes.dex */
    public static final class t implements InterfaceC4206e<AbstractC2135f0.e.d> {

        /* renamed from: a */
        public static final t f8345a = new t();

        /* renamed from: b */
        public static final C4205d f8346b = C4205d.m16197d(Constants.TIMESTAMP);

        /* renamed from: c */
        public static final C4205d f8347c = C4205d.m16197d(ImagePickerCache.MAP_KEY_TYPE);

        /* renamed from: d */
        public static final C4205d f8348d = C4205d.m16197d("app");

        /* renamed from: e */
        public static final C4205d f8349e = C4205d.m16197d("device");

        /* renamed from: f */
        public static final C4205d f8350f = C4205d.m16197d("log");

        /* renamed from: g */
        public static final C4205d f8351g = C4205d.m16197d("rollouts");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d dVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16203b(f8346b, dVar.mo8541f());
            interfaceC4207f.mo16205e(f8347c, dVar.mo8542g());
            interfaceC4207f.mo16205e(f8348d, dVar.mo8537b());
            interfaceC4207f.mo16205e(f8349e, dVar.mo8538c());
            interfaceC4207f.mo16205e(f8350f, dVar.mo8539d());
            interfaceC4207f.mo16205e(f8351g, dVar.mo8540e());
        }
    }

    /* renamed from: g8.a$u */
    /* loaded from: classes.dex */
    public static final class u implements InterfaceC4206e<AbstractC2135f0.e.d.AbstractC6179d> {

        /* renamed from: a */
        public static final u f8352a = new u();

        /* renamed from: b */
        public static final C4205d f8353b = C4205d.m16197d("content");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.AbstractC6179d abstractC6179d, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8353b, abstractC6179d.mo8657b());
        }
    }

    /* renamed from: g8.a$v */
    /* loaded from: classes.dex */
    public static final class v implements InterfaceC4206e<AbstractC2135f0.e.d.AbstractC6180e> {

        /* renamed from: a */
        public static final v f8354a = new v();

        /* renamed from: b */
        public static final C4205d f8355b = C4205d.m16197d("rolloutVariant");

        /* renamed from: c */
        public static final C4205d f8356c = C4205d.m16197d("parameterKey");

        /* renamed from: d */
        public static final C4205d f8357d = C4205d.m16197d("parameterValue");

        /* renamed from: e */
        public static final C4205d f8358e = C4205d.m16197d("templateVersion");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.AbstractC6180e abstractC6180e, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8355b, abstractC6180e.mo8663d());
            interfaceC4207f.mo16205e(f8356c, abstractC6180e.mo8661b());
            interfaceC4207f.mo16205e(f8357d, abstractC6180e.mo8662c());
            interfaceC4207f.mo16203b(f8358e, abstractC6180e.mo8664e());
        }
    }

    /* renamed from: g8.a$w */
    /* loaded from: classes.dex */
    public static final class w implements InterfaceC4206e<AbstractC2135f0.e.d.AbstractC6180e.b> {

        /* renamed from: a */
        public static final w f8359a = new w();

        /* renamed from: b */
        public static final C4205d f8360b = C4205d.m16197d("rolloutId");

        /* renamed from: c */
        public static final C4205d f8361c = C4205d.m16197d("variantId");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.AbstractC6180e.b bVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8360b, bVar.mo8671b());
            interfaceC4207f.mo16205e(f8361c, bVar.mo8672c());
        }
    }

    /* renamed from: g8.a$x */
    /* loaded from: classes.dex */
    public static final class x implements InterfaceC4206e<AbstractC2135f0.e.d.f> {

        /* renamed from: a */
        public static final x f8362a = new x();

        /* renamed from: b */
        public static final C4205d f8363b = C4205d.m16197d("assignments");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.d.f fVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8363b, fVar.mo8677b());
        }
    }

    /* renamed from: g8.a$y */
    /* loaded from: classes.dex */
    public static final class y implements InterfaceC4206e<AbstractC2135f0.e.AbstractC6181e> {

        /* renamed from: a */
        public static final y f8364a = new y();

        /* renamed from: b */
        public static final C4205d f8365b = C4205d.m16197d("platform");

        /* renamed from: c */
        public static final C4205d f8366c = C4205d.m16197d("version");

        /* renamed from: d */
        public static final C4205d f8367d = C4205d.m16197d("buildVersion");

        /* renamed from: e */
        public static final C4205d f8368e = C4205d.m16197d("jailbroken");

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.AbstractC6181e abstractC6181e, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16202a(f8365b, abstractC6181e.mo8682c());
            interfaceC4207f.mo16205e(f8366c, abstractC6181e.mo8683d());
            interfaceC4207f.mo16205e(f8367d, abstractC6181e.mo8681b());
            interfaceC4207f.mo16206g(f8368e, abstractC6181e.mo8684e());
        }
    }

    /* renamed from: g8.a$z */
    /* loaded from: classes.dex */
    public static final class z implements InterfaceC4206e<AbstractC2135f0.e.f> {

        /* renamed from: a */
        public static final z f8369a = new z();

        /* renamed from: b */
        public static final C4205d f8370b = C4205d.m16197d(Constants.IDENTIFIER);

        @Override // p239q8.InterfaceC4203b
        /* renamed from: b */
        public void mo7324a(AbstractC2135f0.e.f fVar, InterfaceC4207f interfaceC4207f) {
            interfaceC4207f.mo16205e(f8370b, fVar.mo8366b());
        }
    }

    @Override // p254r8.InterfaceC4322a
    /* renamed from: a */
    public void mo7323a(InterfaceC4323b<?> interfaceC4323b) {
        d dVar = d.f8243a;
        interfaceC4323b.mo16576a(AbstractC2135f0.class, dVar);
        interfaceC4323b.mo16576a(C2126b.class, dVar);
        j jVar = j.f8281a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.class, jVar);
        interfaceC4323b.mo16576a(C2138h.class, jVar);
        g gVar = g.f8261a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.a.class, gVar);
        interfaceC4323b.mo16576a(C2139i.class, gVar);
        h hVar = h.f8269a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.a.b.class, hVar);
        interfaceC4323b.mo16576a(C2140j.class, hVar);
        z zVar = z.f8369a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.f.class, zVar);
        interfaceC4323b.mo16576a(C2125a0.class, zVar);
        y yVar = y.f8364a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.AbstractC6181e.class, yVar);
        interfaceC4323b.mo16576a(C2156z.class, yVar);
        i iVar = i.f8271a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.c.class, iVar);
        interfaceC4323b.mo16576a(C2141k.class, iVar);
        t tVar = t.f8345a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.class, tVar);
        interfaceC4323b.mo16576a(C2142l.class, tVar);
        k kVar = k.f8294a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.a.class, kVar);
        interfaceC4323b.mo16576a(C2143m.class, kVar);
        m mVar = m.f8307a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.a.b.class, mVar);
        interfaceC4323b.mo16576a(C2144n.class, mVar);
        p pVar = p.f8323a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.a.b.AbstractC6174e.class, pVar);
        interfaceC4323b.mo16576a(C2148r.class, pVar);
        q qVar = q.f8327a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.class, qVar);
        interfaceC4323b.mo16576a(C2149s.class, qVar);
        n nVar = n.f8313a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.a.b.c.class, nVar);
        interfaceC4323b.mo16576a(C2146p.class, nVar);
        b bVar = b.f8230a;
        interfaceC4323b.mo16576a(AbstractC2135f0.a.class, bVar);
        interfaceC4323b.mo16576a(C2128c.class, bVar);
        a aVar = a.f8226a;
        interfaceC4323b.mo16576a(AbstractC2135f0.a.AbstractC6164a.class, aVar);
        interfaceC4323b.mo16576a(C2130d.class, aVar);
        o oVar = o.f8319a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.a.b.AbstractC6172d.class, oVar);
        interfaceC4323b.mo16576a(C2147q.class, oVar);
        l lVar = l.f8302a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.a.b.AbstractC6168a.class, lVar);
        interfaceC4323b.mo16576a(C2145o.class, lVar);
        c cVar = c.f8240a;
        interfaceC4323b.mo16576a(AbstractC2135f0.c.class, cVar);
        interfaceC4323b.mo16576a(C2132e.class, cVar);
        r rVar = r.f8333a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.a.c.class, rVar);
        interfaceC4323b.mo16576a(C2150t.class, rVar);
        s sVar = s.f8338a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.c.class, sVar);
        interfaceC4323b.mo16576a(C2151u.class, sVar);
        u uVar = u.f8352a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.AbstractC6179d.class, uVar);
        interfaceC4323b.mo16576a(C2152v.class, uVar);
        x xVar = x.f8362a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.f.class, xVar);
        interfaceC4323b.mo16576a(C2155y.class, xVar);
        v vVar = v.f8354a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.AbstractC6180e.class, vVar);
        interfaceC4323b.mo16576a(C2153w.class, vVar);
        w wVar = w.f8359a;
        interfaceC4323b.mo16576a(AbstractC2135f0.e.d.AbstractC6180e.b.class, wVar);
        interfaceC4323b.mo16576a(C2154x.class, wVar);
        e eVar = e.f8255a;
        interfaceC4323b.mo16576a(AbstractC2135f0.d.class, eVar);
        interfaceC4323b.mo16576a(C2134f.class, eVar);
        f fVar = f.f8258a;
        interfaceC4323b.mo16576a(AbstractC2135f0.d.b.class, fVar);
        interfaceC4323b.mo16576a(C2136g.class, fVar);
    }
}
