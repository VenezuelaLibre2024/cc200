package p210o9;

import ae.C0099e;
import android.util.Log;
import be.C0550a;
import be.C0552c;
import be.EnumC0553d;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2238l;
import gd.C2245s;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import org.json.JSONObject;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.AbstractC3470d;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import p174le.C3481c;
import p174le.InterfaceC3479a;
import p185m9.C3557b;
import p246r0.InterfaceC4262f;
import p286u0.AbstractC4782d;
import p369z8.InterfaceC6084h;
import sd.InterfaceC4584p;
import td.C4747g;
import td.C4753m;

/* renamed from: o9.c */
/* loaded from: classes.dex */
public final class C3958c implements InterfaceC3963h {

    /* renamed from: g */
    public static final a f14212g = new a(null);

    /* renamed from: a */
    public final InterfaceC3284g f14213a;

    /* renamed from: b */
    public final InterfaceC6084h f14214b;

    /* renamed from: c */
    public final C3557b f14215c;

    /* renamed from: d */
    public final InterfaceC3956a f14216d;

    /* renamed from: e */
    public final C3962g f14217e;

    /* renamed from: f */
    public final InterfaceC3479a f14218f;

    /* renamed from: o9.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.settings.RemoteSettings", m12917f = "RemoteSettings.kt", m12918l = {170, C1417R.styleable.AppCompatTheme_listDividerAlertDialog, C1417R.styleable.AppCompatTheme_ratingBarStyleSmall}, m12919m = "updateSettings")
    /* renamed from: o9.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3470d {

        /* renamed from: h */
        public Object f14219h;

        /* renamed from: i */
        public Object f14220i;

        /* renamed from: j */
        public /* synthetic */ Object f14221j;

        /* renamed from: l */
        public int f14223l;

        public b(InterfaceC3281d<? super b> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f14221j = obj;
            this.f14223l |= Integer.MIN_VALUE;
            return C3958c.this.mo14980d(this);
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", m12917f = "RemoteSettings.kt", m12918l = {125, 128, 131, 133, 134, 136}, m12919m = "invokeSuspend")
    /* renamed from: o9.c$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC3478l implements InterfaceC4584p<JSONObject, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public Object f14224h;

        /* renamed from: i */
        public Object f14225i;

        /* renamed from: j */
        public int f14226j;

        /* renamed from: k */
        public /* synthetic */ Object f14227k;

        public c(InterfaceC3281d<? super c> interfaceC3281d) {
            super(2, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(JSONObject jSONObject, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((c) create(jSONObject, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            c cVar = new c(interfaceC3281d);
            cVar.f14227k = obj;
            return cVar;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x019f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0165  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00f4  */
        /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // p173ld.AbstractC3467a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 438
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p210o9.C3958c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC3472f(m12916c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m12917f = "RemoteSettings.kt", m12918l = {}, m12919m = "invokeSuspend")
    /* renamed from: o9.c$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC3478l implements InterfaceC4584p<String, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public int f14229h;

        /* renamed from: i */
        public /* synthetic */ Object f14230i;

        public d(InterfaceC3281d<? super d> interfaceC3281d) {
            super(2, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(String str, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((d) create(str, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            d dVar = new d(interfaceC3281d);
            dVar.f14230i = obj;
            return dVar;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            C3385c.m12581c();
            if (this.f14229h != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2238l.m8975b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f14230i));
            return C2245s.f8873a;
        }
    }

    public C3958c(InterfaceC3284g interfaceC3284g, InterfaceC6084h interfaceC6084h, C3557b c3557b, InterfaceC3956a interfaceC3956a, InterfaceC4262f<AbstractC4782d> interfaceC4262f) {
        C4753m.m18653f(interfaceC3284g, "backgroundDispatcher");
        C4753m.m18653f(interfaceC6084h, "firebaseInstallationsApi");
        C4753m.m18653f(c3557b, "appInfo");
        C4753m.m18653f(interfaceC3956a, "configsFetcher");
        C4753m.m18653f(interfaceC4262f, "dataStore");
        this.f14213a = interfaceC3284g;
        this.f14214b = interfaceC6084h;
        this.f14215c = c3557b;
        this.f14216d = interfaceC3956a;
        this.f14217e = new C3962g(interfaceC4262f);
        this.f14218f = C3481c.m12947b(false, 1, null);
    }

    @Override // p210o9.InterfaceC3963h
    /* renamed from: a */
    public Boolean mo14977a() {
        return this.f14217e.m15009g();
    }

    @Override // p210o9.InterfaceC3963h
    /* renamed from: b */
    public C0550a mo14978b() {
        Integer m15007e = this.f14217e.m15007e();
        if (m15007e == null) {
            return null;
        }
        C0550a.a aVar = C0550a.f2478i;
        return C0550a.m2752c(C0552c.m2780h(m15007e.intValue(), EnumC0553d.SECONDS));
    }

    @Override // p210o9.InterfaceC3963h
    /* renamed from: c */
    public Double mo14979c() {
        return this.f14217e.m15008f();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0091 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #0 {all -> 0x0052, blocks: (B:26:0x004e, B:27:0x00b4, B:29:0x00b8, B:33:0x00c4, B:38:0x0089, B:40:0x0091, B:43:0x009c), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // p210o9.InterfaceC3963h
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo14980d(p146jd.InterfaceC3281d<? super gd.C2245s> r17) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p210o9.C3958c.mo14980d(jd.d):java.lang.Object");
    }

    /* renamed from: f */
    public final String m14982f(String str) {
        return new C0099e(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE).m411b(str, "");
    }
}
