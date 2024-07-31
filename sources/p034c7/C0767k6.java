package p034c7;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzgv;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzok;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import p108h6.C2394s;
import p207o6.C3938g;
import p207o6.InterfaceC3935d;
import p237q6.C4195c;

/* renamed from: c7.k6 */
/* loaded from: classes.dex */
public class C0767k6 implements InterfaceC0782l7 {

    /* renamed from: I */
    public static volatile C0767k6 f3215I;

    /* renamed from: A */
    public volatile Boolean f3216A;

    /* renamed from: B */
    public Boolean f3217B;

    /* renamed from: C */
    public Boolean f3218C;

    /* renamed from: D */
    public volatile boolean f3219D;

    /* renamed from: E */
    public int f3220E;

    /* renamed from: F */
    public int f3221F;

    /* renamed from: H */
    public final long f3223H;

    /* renamed from: a */
    public final Context f3224a;

    /* renamed from: b */
    public final String f3225b;

    /* renamed from: c */
    public final String f3226c;

    /* renamed from: d */
    public final String f3227d;

    /* renamed from: e */
    public final boolean f3228e;

    /* renamed from: f */
    public final C0647c f3229f;

    /* renamed from: g */
    public final C0718h f3230g;

    /* renamed from: h */
    public final C0738i5 f3231h;

    /* renamed from: i */
    public final C0919v4 f3232i;

    /* renamed from: j */
    public final C0669d6 f3233j;

    /* renamed from: k */
    public final C0716gb f3234k;

    /* renamed from: l */
    public final C0857qc f3235l;

    /* renamed from: m */
    public final C0905u4 f3236m;

    /* renamed from: n */
    public final InterfaceC3935d f3237n;

    /* renamed from: o */
    public final C0840p9 f3238o;

    /* renamed from: p */
    public final C0936w7 f3239p;

    /* renamed from: q */
    public final C0633b0 f3240q;

    /* renamed from: r */
    public final C0770k9 f3241r;

    /* renamed from: s */
    public final String f3242s;

    /* renamed from: t */
    public C0877s4 f3243t;

    /* renamed from: u */
    public C0966y9 f3244u;

    /* renamed from: v */
    public C0970z f3245v;

    /* renamed from: w */
    public C0835p4 f3246w;

    /* renamed from: y */
    public Boolean f3248y;

    /* renamed from: z */
    public long f3249z;

    /* renamed from: x */
    public boolean f3247x = false;

    /* renamed from: G */
    public AtomicInteger f3222G = new AtomicInteger(0);

    public C0767k6(C0908u7 c0908u7) {
        C0947x4 m3919G;
        String str;
        Bundle bundle;
        boolean z10 = false;
        C2394s.m9619l(c0908u7);
        C0647c c0647c = new C0647c(c0908u7.f3628a);
        this.f3229f = c0647c;
        C0751j4.f3194a = c0647c;
        Context context = c0908u7.f3628a;
        this.f3224a = context;
        this.f3225b = c0908u7.f3629b;
        this.f3226c = c0908u7.f3630c;
        this.f3227d = c0908u7.f3631d;
        this.f3228e = c0908u7.f3635h;
        this.f3216A = c0908u7.f3632e;
        this.f3242s = c0908u7.f3637j;
        this.f3219D = true;
        zzdd zzddVar = c0908u7.f3634g;
        if (zzddVar != null && (bundle = zzddVar.zzg) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f3217B = (Boolean) obj;
            }
            Object obj2 = zzddVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f3218C = (Boolean) obj2;
            }
        }
        zzgv.zzb(context);
        InterfaceC3935d m14938d = C3938g.m14938d();
        this.f3237n = m14938d;
        Long l10 = c0908u7.f3636i;
        this.f3223H = l10 != null ? l10.longValue() : m14938d.mo14932a();
        this.f3230g = new C0718h(this);
        C0738i5 c0738i5 = new C0738i5(this);
        c0738i5.m3431l();
        this.f3231h = c0738i5;
        C0919v4 c0919v4 = new C0919v4(this);
        c0919v4.m3431l();
        this.f3232i = c0919v4;
        C0857qc c0857qc = new C0857qc(this);
        c0857qc.m3431l();
        this.f3235l = c0857qc;
        this.f3236m = new C0905u4(new C0894t7(c0908u7, this));
        this.f3240q = new C0633b0(this);
        C0840p9 c0840p9 = new C0840p9(this);
        c0840p9.m3156r();
        this.f3238o = c0840p9;
        C0936w7 c0936w7 = new C0936w7(this);
        c0936w7.m3156r();
        this.f3239p = c0936w7;
        C0716gb c0716gb = new C0716gb(this);
        c0716gb.m3156r();
        this.f3234k = c0716gb;
        C0770k9 c0770k9 = new C0770k9(this);
        c0770k9.m3431l();
        this.f3241r = c0770k9;
        C0669d6 c0669d6 = new C0669d6(this);
        c0669d6.m3431l();
        this.f3233j = c0669d6;
        zzdd zzddVar2 = c0908u7.f3634g;
        if (zzddVar2 != null && zzddVar2.zzb != 0) {
            z10 = true;
        }
        boolean z11 = !z10;
        if (context.getApplicationContext() instanceof Application) {
            C0936w7 m3487C = m3487C();
            if (m3487C.zza().getApplicationContext() instanceof Application) {
                Application application = (Application) m3487C.zza().getApplicationContext();
                if (m3487C.f3697c == null) {
                    m3487C.f3697c = new C0686e9(m3487C);
                }
                if (z11) {
                    application.unregisterActivityLifecycleCallbacks(m3487C.f3697c);
                    application.registerActivityLifecycleCallbacks(m3487C.f3697c);
                    m3919G = m3487C.zzj().m3918F();
                    str = "Registered activity lifecycle callback";
                }
            }
            c0669d6.m3152y(new RunnableC0781l6(this, c0908u7));
        }
        m3919G = zzj().m3919G();
        str = "Application context is not an Application";
        m3919G.m3995a(str);
        c0669d6.m3152y(new RunnableC0781l6(this, c0908u7));
    }

    /* renamed from: a */
    public static C0767k6 m3480a(Context context, zzdd zzddVar, Long l10) {
        Bundle bundle;
        if (zzddVar != null && (zzddVar.zze == null || zzddVar.zzf == null)) {
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, zzddVar.zzd, null, null, zzddVar.zzg, null);
        }
        C2394s.m9619l(context);
        C2394s.m9619l(context.getApplicationContext());
        if (f3215I == null) {
            synchronized (C0767k6.class) {
                if (f3215I == null) {
                    f3215I = new C0767k6(new C0908u7(context, zzddVar, l10));
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzg) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            C2394s.m9619l(f3215I);
            f3215I.m3500h(zzddVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        C2394s.m9619l(f3215I);
        return f3215I;
    }

    /* renamed from: b */
    public static void m3481b(AbstractC0680e3 abstractC0680e3) {
        if (abstractC0680e3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC0680e3.m3159u()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC0680e3.getClass()));
    }

    /* renamed from: c */
    public static /* synthetic */ void m3482c(C0767k6 c0767k6, C0908u7 c0908u7) {
        c0767k6.zzl().mo3099i();
        C0970z c0970z = new C0970z(c0767k6);
        c0970z.m3431l();
        c0767k6.f3245v = c0970z;
        C0835p4 c0835p4 = new C0835p4(c0767k6, c0908u7.f3633f);
        c0835p4.m3156r();
        c0767k6.f3246w = c0835p4;
        C0877s4 c0877s4 = new C0877s4(c0767k6);
        c0877s4.m3156r();
        c0767k6.f3243t = c0877s4;
        C0966y9 c0966y9 = new C0966y9(c0767k6);
        c0966y9.m3156r();
        c0767k6.f3244u = c0966y9;
        c0767k6.f3235l.m3432m();
        c0767k6.f3231h.m3432m();
        c0767k6.f3246w.m3157s();
        c0767k6.zzj().m3917E().m3996b("App measurement initialized, version", 84002L);
        c0767k6.zzj().m3917E().m3995a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String m3697A = c0835p4.m3697A();
        if (TextUtils.isEmpty(c0767k6.f3225b)) {
            if (c0767k6.m3491G().m3765A0(m3697A)) {
                c0767k6.zzj().m3917E().m3995a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                c0767k6.zzj().m3917E().m3995a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + m3697A);
            }
        }
        c0767k6.zzj().m3913A().m3995a("Debug-level message logging enabled");
        if (c0767k6.f3220E != c0767k6.f3222G.get()) {
            c0767k6.zzj().m3914B().m3997c("Not all components initialized", Integer.valueOf(c0767k6.f3220E), Integer.valueOf(c0767k6.f3222G.get()));
        }
        c0767k6.f3247x = true;
    }

    /* renamed from: d */
    public static void m3483d(AbstractC0740i7 abstractC0740i7) {
        if (abstractC0740i7 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (abstractC0740i7.m3433n()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(abstractC0740i7.getClass()));
    }

    /* renamed from: e */
    public static void m3484e(C0754j7 c0754j7) {
        if (c0754j7 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* renamed from: A */
    public final C0738i5 m3485A() {
        m3484e(this.f3231h);
        return this.f3231h;
    }

    /* renamed from: B */
    public final C0669d6 m3486B() {
        return this.f3233j;
    }

    /* renamed from: C */
    public final C0936w7 m3487C() {
        m3481b(this.f3239p);
        return this.f3239p;
    }

    /* renamed from: D */
    public final C0840p9 m3488D() {
        m3481b(this.f3238o);
        return this.f3238o;
    }

    /* renamed from: E */
    public final C0966y9 m3489E() {
        m3481b(this.f3244u);
        return this.f3244u;
    }

    /* renamed from: F */
    public final C0716gb m3490F() {
        m3481b(this.f3234k);
        return this.f3234k;
    }

    /* renamed from: G */
    public final C0857qc m3491G() {
        m3484e(this.f3235l);
        return this.f3235l;
    }

    /* renamed from: H */
    public final String m3492H() {
        return this.f3225b;
    }

    /* renamed from: I */
    public final String m3493I() {
        return this.f3226c;
    }

    /* renamed from: J */
    public final String m3494J() {
        return this.f3227d;
    }

    /* renamed from: K */
    public final String m3495K() {
        return this.f3242s;
    }

    /* renamed from: L */
    public final void m3496L() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* renamed from: M */
    public final void m3497M() {
        this.f3222G.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x00d8, code lost:
    
        if (r1.m3645z() != false) goto L177;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3498f(com.google.android.gms.internal.measurement.zzdd r10) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0767k6.m3498f(com.google.android.gms.internal.measurement.zzdd):void");
    }

    /* renamed from: g */
    public final /* synthetic */ void m3499g(String str, int i10, Throwable th, byte[] bArr, Map map) {
        if (!((i10 == 200 || i10 == 204 || i10 == 304) && th == null)) {
            zzj().m3919G().m3997c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th);
            return;
        }
        m3485A().f3168v.m3527a(true);
        if (bArr == null || bArr.length == 0) {
            zzj().m3913A().m3995a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            double optDouble = jSONObject.optDouble(Constants.TIMESTAMP, 0.0d);
            if (TextUtils.isEmpty(optString)) {
                zzj().m3913A().m3995a("Deferred Deep Link is empty.");
                return;
            }
            Bundle bundle = new Bundle();
            if (zzok.zza() && this.f3230g.m3281o(C0733i0.f3082W0)) {
                if (!m3491G().m3771F0(optString)) {
                    zzj().m3919G().m3998d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                bundle.putString("gbraid", optString3);
            } else if (!m3491G().m3771F0(optString)) {
                zzj().m3919G().m3997c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.f3239p.m3989x0("auto", "_cmp", bundle);
            C0857qc m3491G = m3491G();
            if (TextUtils.isEmpty(optString) || !m3491G.m3795d0(optString, optDouble)) {
                return;
            }
            m3491G.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e10) {
            zzj().m3914B().m3996b("Failed to parse the Deferred Deep Link response. exception", e10);
        }
    }

    /* renamed from: h */
    public final void m3500h(boolean z10) {
        this.f3216A = Boolean.valueOf(z10);
    }

    /* renamed from: i */
    public final void m3501i() {
        this.f3220E++;
    }

    /* renamed from: j */
    public final boolean m3502j() {
        return this.f3216A != null && this.f3216A.booleanValue();
    }

    /* renamed from: k */
    public final boolean m3503k() {
        return m3511s() == 0;
    }

    /* renamed from: l */
    public final boolean m3504l() {
        zzl().mo3099i();
        return this.f3219D;
    }

    /* renamed from: m */
    public final boolean m3505m() {
        return TextUtils.isEmpty(this.f3225b);
    }

    /* renamed from: n */
    public final boolean m3506n() {
        if (!this.f3247x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().mo3099i();
        Boolean bool = this.f3248y;
        if (bool == null || this.f3249z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f3237n.mo14933b() - this.f3249z) > 1000)) {
            this.f3249z = this.f3237n.mo14933b();
            boolean z10 = true;
            Boolean valueOf = Boolean.valueOf(m3491G().m3815z0("android.permission.INTERNET") && m3491G().m3815z0("android.permission.ACCESS_NETWORK_STATE") && (C4195c.m16183a(this.f3224a).m16181f() || this.f3230g.m3272O() || (C0857qc.m3746Y(this.f3224a) && C0857qc.m3747Z(this.f3224a, false))));
            this.f3248y = valueOf;
            if (valueOf.booleanValue()) {
                if (!m3491G().m3797f0(m3515w().m3698B(), m3515w().m3706z()) && TextUtils.isEmpty(m3515w().m3706z())) {
                    z10 = false;
                }
                this.f3248y = Boolean.valueOf(z10);
            }
        }
        return this.f3248y.booleanValue();
    }

    /* renamed from: o */
    public final boolean m3507o() {
        return this.f3228e;
    }

    /* renamed from: p */
    public final boolean m3508p() {
        zzl().mo3099i();
        m3483d(m3509q());
        String m3697A = m3515w().m3697A();
        Pair<String, Boolean> m3419p = m3485A().m3419p(m3697A);
        if (!this.f3230g.m3269L() || ((Boolean) m3419p.second).booleanValue() || TextUtils.isEmpty((CharSequence) m3419p.first)) {
            zzj().m3913A().m3995a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!m3509q().m3523r()) {
            zzj().m3919G().m3995a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        if (zzns.zza() && this.f3230g.m3281o(C0733i0.f3072R0)) {
            C0966y9 m3489E = m3489E();
            m3489E.mo3099i();
            m3489E.m3155q();
            if (!m3489E.m4040a0() || m3489E.mo3096f().m3766B0() >= 234200) {
                C0936w7 m3487C = m3487C();
                m3487C.mo3099i();
                C0760k m4030Q = m3487C.mo3105o().m4030Q();
                Bundle bundle = m4030Q != null ? m4030Q.f3206h : null;
                if (bundle == null) {
                    int i10 = this.f3221F;
                    this.f3221F = i10 + 1;
                    boolean z10 = i10 < 10;
                    zzj().m3913A().m3996b("Failed to retrieve DMA consent from the service, " + (z10 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f3221F));
                    return z10;
                }
                C0810n7 m3621c = C0810n7.m3621c(bundle, 100);
                sb2.append("&gcs=");
                sb2.append(m3621c.m3641v());
                C0928w m3927b = C0928w.m3927b(bundle, 100);
                sb2.append("&dma=");
                sb2.append(m3927b.m3933g() == Boolean.FALSE ? 0 : 1);
                if (!TextUtils.isEmpty(m3927b.m3934h())) {
                    sb2.append("&dma_cps=");
                    sb2.append(m3927b.m3934h());
                }
                int i11 = C0928w.m3929d(bundle) == Boolean.TRUE ? 0 : 1;
                sb2.append("&npa=");
                sb2.append(i11);
                zzj().m3918F().m3996b("Consent query parameters to Bow", sb2);
            }
        }
        C0857qc m3491G = m3491G();
        m3515w();
        URL m3770F = m3491G.m3770F(84002L, m3697A, (String) m3419p.first, m3485A().f3169w.m3618a() - 1, sb2.toString());
        if (m3770F != null) {
            C0770k9 m3509q = m3509q();
            C0795m6 c0795m6 = new InterfaceC0756j9() { // from class: c7.m6
                public /* synthetic */ C0795m6() {
                }

                @Override // p034c7.InterfaceC0756j9
                /* renamed from: a */
                public final void mo3476a(String str, int i12, Throwable th, byte[] bArr, Map map) {
                    C0767k6.this.m3499g(str, i12, th, bArr, map);
                }
            };
            m3509q.mo3099i();
            m3509q.m3430k();
            C2394s.m9619l(m3770F);
            C2394s.m9619l(c0795m6);
            m3509q.zzl().m3150u(new RunnableC0798m9(m3509q, m3697A, m3770F, null, null, c0795m6));
        }
        return false;
    }

    /* renamed from: q */
    public final C0770k9 m3509q() {
        m3483d(this.f3241r);
        return this.f3241r;
    }

    /* renamed from: r */
    public final void m3510r(boolean z10) {
        zzl().mo3099i();
        this.f3219D = z10;
    }

    /* renamed from: s */
    public final int m3511s() {
        zzl().mo3099i();
        if (this.f3230g.m3271N()) {
            return 1;
        }
        Boolean bool = this.f3218C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!m3504l()) {
            return 8;
        }
        Boolean m3413J = m3485A().m3413J();
        if (m3413J != null) {
            return m3413J.booleanValue() ? 0 : 3;
        }
        Boolean m3290x = this.f3230g.m3290x("firebase_analytics_collection_enabled");
        if (m3290x != null) {
            return m3290x.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f3217B;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f3216A == null || this.f3216A.booleanValue()) ? 0 : 7;
    }

    /* renamed from: t */
    public final C0633b0 m3512t() {
        C0633b0 c0633b0 = this.f3240q;
        if (c0633b0 != null) {
            return c0633b0;
        }
        throw new IllegalStateException("Component not created");
    }

    /* renamed from: u */
    public final C0718h m3513u() {
        return this.f3230g;
    }

    /* renamed from: v */
    public final C0970z m3514v() {
        m3483d(this.f3245v);
        return this.f3245v;
    }

    /* renamed from: w */
    public final C0835p4 m3515w() {
        m3481b(this.f3246w);
        return this.f3246w;
    }

    /* renamed from: x */
    public final C0877s4 m3516x() {
        m3481b(this.f3243t);
        return this.f3243t;
    }

    /* renamed from: y */
    public final C0905u4 m3517y() {
        return this.f3236m;
    }

    /* renamed from: z */
    public final C0919v4 m3518z() {
        C0919v4 c0919v4 = this.f3232i;
        if (c0919v4 == null || !c0919v4.m3433n()) {
            return null;
        }
        return this.f3232i;
    }

    @Override // p034c7.InterfaceC0782l7
    public final Context zza() {
        return this.f3224a;
    }

    @Override // p034c7.InterfaceC0782l7
    public final InterfaceC3935d zzb() {
        return this.f3237n;
    }

    @Override // p034c7.InterfaceC0782l7
    public final C0647c zzd() {
        return this.f3229f;
    }

    @Override // p034c7.InterfaceC0782l7
    public final C0919v4 zzj() {
        m3483d(this.f3232i);
        return this.f3232i;
    }

    @Override // p034c7.InterfaceC0782l7
    public final C0669d6 zzl() {
        m3483d(this.f3233j);
        return this.f3233j;
    }
}
