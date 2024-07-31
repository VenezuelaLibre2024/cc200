package p034c7;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.zzny;
import p034c7.C0810n7;
import p108h6.C2394s;
import p266s5.C4532a;

/* renamed from: c7.i5 */
/* loaded from: classes.dex */
public final class C0738i5 extends AbstractC0740i7 {

    /* renamed from: B */
    public static final Pair<String, Long> f3147B = new Pair<>("", 0L);

    /* renamed from: A */
    public final C0766k5 f3148A;

    /* renamed from: c */
    public SharedPreferences f3149c;

    /* renamed from: d */
    public Object f3150d;

    /* renamed from: e */
    public SharedPreferences f3151e;

    /* renamed from: f */
    public C0794m5 f3152f;

    /* renamed from: g */
    public final C0808n5 f3153g;

    /* renamed from: h */
    public final C0808n5 f3154h;

    /* renamed from: i */
    public final C0822o5 f3155i;

    /* renamed from: j */
    public String f3156j;

    /* renamed from: k */
    public boolean f3157k;

    /* renamed from: l */
    public long f3158l;

    /* renamed from: m */
    public final C0808n5 f3159m;

    /* renamed from: n */
    public final C0780l5 f3160n;

    /* renamed from: o */
    public final C0822o5 f3161o;

    /* renamed from: p */
    public final C0766k5 f3162p;

    /* renamed from: q */
    public final C0780l5 f3163q;

    /* renamed from: r */
    public final C0808n5 f3164r;

    /* renamed from: s */
    public final C0808n5 f3165s;

    /* renamed from: t */
    public boolean f3166t;

    /* renamed from: u */
    public C0780l5 f3167u;

    /* renamed from: v */
    public C0780l5 f3168v;

    /* renamed from: w */
    public C0808n5 f3169w;

    /* renamed from: x */
    public final C0822o5 f3170x;

    /* renamed from: y */
    public final C0822o5 f3171y;

    /* renamed from: z */
    public final C0808n5 f3172z;

    public C0738i5(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3150d = new Object();
        this.f3159m = new C0808n5(this, "session_timeout", 1800000L);
        this.f3160n = new C0780l5(this, "start_new_session", true);
        this.f3164r = new C0808n5(this, "last_pause_time", 0L);
        this.f3165s = new C0808n5(this, "session_id", 0L);
        this.f3161o = new C0822o5(this, "non_personalized_ads", null);
        this.f3162p = new C0766k5(this, "last_received_uri_timestamps_by_source", null);
        this.f3163q = new C0780l5(this, "allow_remote_dynamite", false);
        this.f3153g = new C0808n5(this, "first_open_time", 0L);
        this.f3154h = new C0808n5(this, "app_install_time", 0L);
        this.f3155i = new C0822o5(this, "app_instance_id", null);
        this.f3167u = new C0780l5(this, "app_backgrounded", false);
        this.f3168v = new C0780l5(this, "deep_link_retrieval_complete", false);
        this.f3169w = new C0808n5(this, "deep_link_retrieval_attempts", 0L);
        this.f3170x = new C0822o5(this, "firebase_feature_rollouts", null);
        this.f3171y = new C0822o5(this, "deferred_attribution_cache", null);
        this.f3172z = new C0808n5(this, "deferred_attribution_cache_timestamp", 0L);
        this.f3148A = new C0766k5(this, "default_event_parameters", null);
    }

    /* renamed from: A */
    public final void m3404A(boolean z10) {
        mo3099i();
        zzj().m3918F().m3996b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = m3407D().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* renamed from: B */
    public final SharedPreferences m3405B() {
        mo3099i();
        m3430k();
        if (this.f3151e == null) {
            synchronized (this.f3150d) {
                if (this.f3151e == null) {
                    this.f3151e = zza().getSharedPreferences(zza().getPackageName() + "_preferences", 0);
                }
            }
        }
        return this.f3151e;
    }

    /* renamed from: C */
    public final void m3406C(String str) {
        mo3099i();
        SharedPreferences.Editor edit = m3407D().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* renamed from: D */
    public final SharedPreferences m3407D() {
        mo3099i();
        m3430k();
        C2394s.m9619l(this.f3149c);
        return this.f3149c;
    }

    /* renamed from: E */
    public final SparseArray<Long> m3408E() {
        Bundle m3477a = this.f3162p.m3477a();
        if (m3477a == null) {
            return new SparseArray<>();
        }
        int[] intArray = m3477a.getIntArray("uriSources");
        long[] longArray = m3477a.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            zzj().m3914B().m3995a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    /* renamed from: F */
    public final C0928w m3409F() {
        mo3099i();
        return C0928w.m3928c(m3407D().getString("dma_consent_settings", null));
    }

    /* renamed from: G */
    public final C0810n7 m3410G() {
        mo3099i();
        return C0810n7.m3623f(m3407D().getString("consent_settings", "G1"), m3407D().getInt("consent_source", 100));
    }

    /* renamed from: H */
    public final Boolean m3411H() {
        mo3099i();
        if (m3407D().contains("use_service")) {
            return Boolean.valueOf(m3407D().getBoolean("use_service", false));
        }
        return null;
    }

    /* renamed from: I */
    public final Boolean m3412I() {
        mo3099i();
        if (m3407D().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(m3407D().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* renamed from: J */
    public final Boolean m3413J() {
        mo3099i();
        if (m3407D().contains("measurement_enabled")) {
            return Boolean.valueOf(m3407D().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* renamed from: K */
    public final String m3414K() {
        mo3099i();
        String string = m3407D().getString("previous_os_version", null);
        mo3093c().m3430k();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = m3407D().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* renamed from: L */
    public final String m3415L() {
        mo3099i();
        return m3407D().getString("admob_app_id", null);
    }

    /* renamed from: M */
    public final String m3416M() {
        mo3099i();
        return m3407D().getString("gmp_app_id", null);
    }

    /* renamed from: N */
    public final void m3417N() {
        mo3099i();
        Boolean m3413J = m3413J();
        SharedPreferences.Editor edit = m3407D().edit();
        edit.clear();
        edit.apply();
        if (m3413J != null) {
            m3420q(m3413J);
        }
    }

    @Override // p034c7.AbstractC0740i7
    /* renamed from: j */
    public final void mo3418j() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f3149c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f3166t = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f3149c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f3152f = new C0794m5(this, "health_monitor", Math.max(0L, C0733i0.f3099e.m3607a(null).longValue()));
    }

    @Override // p034c7.AbstractC0740i7
    /* renamed from: o */
    public final boolean mo3146o() {
        return true;
    }

    /* renamed from: p */
    public final Pair<String, Boolean> m3419p(String str) {
        mo3099i();
        if (zzny.zza() && mo3092a().m3281o(C0733i0.f3066O0) && !m3410G().m3633l(C0810n7.a.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long mo14933b = zzb().mo14933b();
        if (this.f3156j != null && mo14933b < this.f3158l) {
            return new Pair<>(this.f3156j, Boolean.valueOf(this.f3157k));
        }
        this.f3158l = mo14933b + mo3092a().m3288v(str);
        C4532a.m17957b(true);
        try {
            C4532a.a m17956a = C4532a.m17956a(zza());
            this.f3156j = "";
            String m17963a = m17956a.m17963a();
            if (m17963a != null) {
                this.f3156j = m17963a;
            }
            this.f3157k = m17956a.m17964b();
        } catch (Exception e10) {
            zzj().m3913A().m3996b("Unable to get advertising id", e10);
            this.f3156j = "";
        }
        C4532a.m17957b(false);
        return new Pair<>(this.f3156j, Boolean.valueOf(this.f3157k));
    }

    /* renamed from: q */
    public final void m3420q(Boolean bool) {
        mo3099i();
        SharedPreferences.Editor edit = m3407D().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* renamed from: r */
    public final void m3421r(boolean z10) {
        mo3099i();
        SharedPreferences.Editor edit = m3407D().edit();
        edit.putBoolean("use_service", z10);
        edit.apply();
    }

    /* renamed from: s */
    public final boolean m3422s(int i10) {
        return C0810n7.m3628k(i10, m3407D().getInt("consent_source", 100));
    }

    /* renamed from: t */
    public final boolean m3423t(long j10) {
        return j10 - this.f3159m.m3618a() > this.f3164r.m3618a();
    }

    /* renamed from: u */
    public final boolean m3424u(C0928w c0928w) {
        mo3099i();
        if (!C0810n7.m3628k(c0928w.m3930a(), m3409F().m3930a())) {
            return false;
        }
        SharedPreferences.Editor edit = m3407D().edit();
        edit.putString("dma_consent_settings", c0928w.m3935i());
        edit.apply();
        return true;
    }

    /* renamed from: v */
    public final boolean m3425v(C0810n7 c0810n7) {
        mo3099i();
        int m3631b = c0810n7.m3631b();
        if (!m3422s(m3631b)) {
            return false;
        }
        SharedPreferences.Editor edit = m3407D().edit();
        edit.putString("consent_settings", c0810n7.m3641v());
        edit.putInt("consent_source", m3631b);
        edit.apply();
        return true;
    }

    /* renamed from: w */
    public final boolean m3426w(C0828ob c0828ob) {
        mo3099i();
        String string = m3407D().getString("stored_tcf_param", "");
        String m3693g = c0828ob.m3693g();
        if (m3693g.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = m3407D().edit();
        edit.putString("stored_tcf_param", m3693g);
        edit.apply();
        return true;
    }

    /* renamed from: x */
    public final boolean m3427x() {
        SharedPreferences sharedPreferences = this.f3149c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* renamed from: y */
    public final void m3428y(Boolean bool) {
        mo3099i();
        SharedPreferences.Editor edit = m3407D().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* renamed from: z */
    public final void m3429z(String str) {
        mo3099i();
        SharedPreferences.Editor edit = m3407D().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }
}
