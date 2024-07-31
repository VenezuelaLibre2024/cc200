package p034c7;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p108h6.C2394s;
import p207o6.InterfaceC3935d;

/* renamed from: c7.p9 */
/* loaded from: classes.dex */
public final class C0840p9 extends AbstractC0680e3 {

    /* renamed from: c */
    public volatile C0854q9 f3443c;

    /* renamed from: d */
    public volatile C0854q9 f3444d;

    /* renamed from: e */
    public C0854q9 f3445e;

    /* renamed from: f */
    public final Map<Activity, C0854q9> f3446f;

    /* renamed from: g */
    public Activity f3447g;

    /* renamed from: h */
    public volatile boolean f3448h;

    /* renamed from: i */
    public volatile C0854q9 f3449i;

    /* renamed from: j */
    public C0854q9 f3450j;

    /* renamed from: k */
    public boolean f3451k;

    /* renamed from: l */
    public final Object f3452l;

    public C0840p9(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3452l = new Object();
        this.f3446f = new ConcurrentHashMap();
    }

    /* renamed from: E */
    public static /* synthetic */ void m3708E(C0840p9 c0840p9, Bundle bundle, C0854q9 c0854q9, C0854q9 c0854q92, long j10) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        c0840p9.m3717I(c0854q9, c0854q92, j10, true, c0840p9.mo3096f().m3764A(null, "screen_view", bundle, null, false));
    }

    /* renamed from: A */
    public final void m3713A(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!mo3092a().m3270M() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f3446f.put(activity, new C0854q9(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    /* renamed from: B */
    public final void m3714B(Activity activity, C0854q9 c0854q9, boolean z10) {
        C0854q9 c0854q92;
        C0854q9 c0854q93 = this.f3443c == null ? this.f3444d : this.f3443c;
        if (c0854q9.f3474b == null) {
            c0854q92 = new C0854q9(c0854q9.f3473a, activity != null ? m3725y(activity.getClass(), "Activity") : null, c0854q9.f3475c, c0854q9.f3477e, c0854q9.f3478f);
        } else {
            c0854q92 = c0854q9;
        }
        this.f3444d = this.f3443c;
        this.f3443c = c0854q92;
        zzl().m3152y(new RunnableC0868r9(this, c0854q92, c0854q93, zzb().mo14933b(), z10));
    }

    @Deprecated
    /* renamed from: C */
    public final void m3715C(Activity activity, String str, String str2) {
        if (!mo3092a().m3270M()) {
            zzj().m3920H().m3995a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C0854q9 c0854q9 = this.f3443c;
        if (c0854q9 == null) {
            zzj().m3920H().m3995a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        if (this.f3446f.get(activity) == null) {
            zzj().m3920H().m3995a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = m3725y(activity.getClass(), "Activity");
        }
        boolean equals = Objects.equals(c0854q9.f3474b, str2);
        boolean equals2 = Objects.equals(c0854q9.f3473a, str);
        if (equals && equals2) {
            zzj().m3920H().m3995a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > mo3092a().m3279m(null, false))) {
            zzj().m3920H().m3996b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > mo3092a().m3279m(null, false))) {
            zzj().m3920H().m3996b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        zzj().m3918F().m3997c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C0854q9 c0854q92 = new C0854q9(str, str2, mo3096f().m3778K0());
        this.f3446f.put(activity, c0854q92);
        m3714B(activity, c0854q92, true);
    }

    /* renamed from: D */
    public final void m3716D(Bundle bundle, long j10) {
        String str;
        synchronized (this.f3452l) {
            if (!this.f3451k) {
                zzj().m3920H().m3995a("Cannot log screen view event when the app is in the background.");
                return;
            }
            String str2 = null;
            if (bundle != null) {
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > mo3092a().m3279m(null, false))) {
                    zzj().m3920H().m3996b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > mo3092a().m3279m(null, false))) {
                    zzj().m3920H().m3996b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                } else {
                    str = string;
                    str2 = string2;
                }
            } else {
                str = null;
            }
            if (str2 == null) {
                Activity activity = this.f3447g;
                str2 = activity != null ? m3725y(activity.getClass(), "Activity") : "Activity";
            }
            String str3 = str2;
            C0854q9 c0854q9 = this.f3443c;
            if (this.f3448h && c0854q9 != null) {
                this.f3448h = false;
                boolean equals = Objects.equals(c0854q9.f3474b, str3);
                boolean equals2 = Objects.equals(c0854q9.f3473a, str);
                if (equals && equals2) {
                    zzj().m3920H().m3995a("Ignoring call to log screen view event with duplicate parameters.");
                    return;
                }
            }
            zzj().m3918F().m3997c("Logging screen view with name, class", str == null ? "null" : str, str3 == null ? "null" : str3);
            C0854q9 c0854q92 = this.f3443c == null ? this.f3444d : this.f3443c;
            C0854q9 c0854q93 = new C0854q9(str, str3, mo3096f().m3778K0(), true, j10);
            this.f3443c = c0854q93;
            this.f3444d = c0854q92;
            this.f3449i = c0854q93;
            zzl().m3152y(new RunnableC0882s9(this, bundle, c0854q93, c0854q92, zzb().mo14933b()));
        }
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.os.Bundle, long] */
    /* renamed from: I */
    public final void m3717I(C0854q9 c0854q9, C0854q9 c0854q92, long j10, boolean z10, Bundle bundle) {
        long j11;
        mo3099i();
        boolean z11 = false;
        boolean z12 = (c0854q92 != null && c0854q92.f3475c == c0854q9.f3475c && Objects.equals(c0854q92.f3474b, c0854q9.f3474b) && Objects.equals(c0854q92.f3473a, c0854q9.f3473a)) ? false : true;
        if (z10 && this.f3445e != null) {
            z11 = true;
        }
        if (z12) {
            C0857qc.m3741L(c0854q9, bundle != null ? new Bundle(bundle) : new Bundle(), true);
            if (c0854q92 != null) {
                String str = c0854q92.f3473a;
                if (str != null) {
                    "_pn".putString("_pn", str);
                }
                String str2 = c0854q92.f3474b;
                if (str2 != null) {
                    "_pc".putString("_pc", str2);
                }
                ?? r82 = c0854q92.f3475c;
                r82.putLong("_pi", r82);
            }
            ?? r83 = 0;
            if (z11) {
                long m3648a = mo3106p().f3002f.m3648a(j10);
                if (m3648a > 0) {
                    mo3096f().m3772H(null, m3648a);
                }
            }
            if (!mo3092a().m3270M()) {
                r83.putLong("_mst", 1L);
            }
            String str3 = c0854q9.f3477e ? "app" : "auto";
            long mo14932a = zzb().mo14932a();
            if (c0854q9.f3477e) {
                mo14932a = c0854q9.f3478f;
                if (mo14932a != 0) {
                    j11 = mo14932a;
                    mo3103m().m3956Q(str3, "_vs", j11, null);
                }
            }
            j11 = mo14932a;
            mo3103m().m3956Q(str3, "_vs", j11, null);
        }
        if (z11) {
            m3718J(this.f3445e, true, j10);
        }
        this.f3445e = c0854q9;
        if (c0854q9.f3477e) {
            this.f3450j = c0854q9;
        }
        mo3105o().m4018C(c0854q9);
    }

    /* renamed from: J */
    public final void m3718J(C0854q9 c0854q9, boolean z10, long j10) {
        mo3100j().m3107q(zzb().mo14933b());
        if (!mo3106p().m3257z(c0854q9 != null && c0854q9.f3476d, z10, j10) || c0854q9 == null) {
            return;
        }
        c0854q9.f3476d = false;
    }

    /* renamed from: K */
    public final C0854q9 m3719K() {
        return this.f3443c;
    }

    /* renamed from: L */
    public final void m3720L(Activity activity) {
        synchronized (this.f3452l) {
            this.f3451k = false;
            this.f3448h = true;
        }
        long mo14933b = zzb().mo14933b();
        if (!mo3092a().m3270M()) {
            this.f3443c = null;
            zzl().m3152y(new RunnableC0896t9(this, mo14933b));
        } else {
            C0854q9 m3723O = m3723O(activity);
            this.f3444d = this.f3443c;
            this.f3443c = null;
            zzl().m3152y(new RunnableC0938w9(this, m3723O, mo14933b));
        }
    }

    /* renamed from: M */
    public final void m3721M(Activity activity, Bundle bundle) {
        C0854q9 c0854q9;
        if (!mo3092a().m3270M() || bundle == null || (c0854q9 = this.f3446f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c0854q9.f3475c);
        bundle2.putString("name", c0854q9.f3473a);
        bundle2.putString("referrer_name", c0854q9.f3474b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    /* renamed from: N */
    public final void m3722N(Activity activity) {
        synchronized (this.f3452l) {
            this.f3451k = true;
            if (activity != this.f3447g) {
                synchronized (this.f3452l) {
                    this.f3447g = activity;
                    this.f3448h = false;
                }
                if (mo3092a().m3270M()) {
                    this.f3449i = null;
                    zzl().m3152y(new RunnableC0924v9(this));
                }
            }
        }
        if (!mo3092a().m3270M()) {
            this.f3443c = this.f3449i;
            zzl().m3152y(new RunnableC0910u9(this));
        } else {
            m3714B(activity, m3723O(activity), false);
            C0633b0 mo3100j = mo3100j();
            mo3100j.zzl().m3152y(new RunnableC0649c1(mo3100j, mo3100j.zzb().mo14933b()));
        }
    }

    /* renamed from: O */
    public final C0854q9 m3723O(Activity activity) {
        C2394s.m9619l(activity);
        C0854q9 c0854q9 = this.f3446f.get(activity);
        if (c0854q9 == null) {
            C0854q9 c0854q92 = new C0854q9(null, m3725y(activity.getClass(), "Activity"), mo3096f().m3778K0());
            this.f3446f.put(activity, c0854q92);
            c0854q9 = c0854q92;
        }
        return this.f3449i != null ? this.f3449i : c0854q9;
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    @Override // p034c7.C0754j7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0970z mo3093c() {
        return super.mo3093c();
    }

    @Override // p034c7.C0754j7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C0905u4 mo3094d() {
        return super.mo3094d();
    }

    @Override // p034c7.C0754j7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0738i5 mo3095e() {
        return super.mo3095e();
    }

    @Override // p034c7.C0754j7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0857qc mo3096f() {
        return super.mo3096f();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    @Override // p034c7.C0695f4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0633b0 mo3100j() {
        return super.mo3100j();
    }

    @Override // p034c7.C0695f4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C0835p4 mo3101k() {
        return super.mo3101k();
    }

    @Override // p034c7.C0695f4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C0877s4 mo3102l() {
        return super.mo3102l();
    }

    @Override // p034c7.C0695f4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0936w7 mo3103m() {
        return super.mo3103m();
    }

    @Override // p034c7.C0695f4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C0840p9 mo3104n() {
        return super.mo3104n();
    }

    @Override // p034c7.C0695f4
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C0966y9 mo3105o() {
        return super.mo3105o();
    }

    @Override // p034c7.C0695f4
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C0716gb mo3106p() {
        return super.mo3106p();
    }

    @Override // p034c7.AbstractC0680e3
    /* renamed from: v */
    public final boolean mo3160v() {
        return false;
    }

    /* renamed from: x */
    public final C0854q9 m3724x(boolean z10) {
        m3155q();
        mo3099i();
        if (!z10) {
            return this.f3445e;
        }
        C0854q9 c0854q9 = this.f3445e;
        return c0854q9 != null ? c0854q9 : this.f3450j;
    }

    /* renamed from: y */
    public final String m3725y(Class<?> cls, String str) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return str;
        }
        String[] split = canonicalName.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > mo3092a().m3279m(null, false) ? str2.substring(0, mo3092a().m3279m(null, false)) : str2;
    }

    /* renamed from: z */
    public final void m3726z(Activity activity) {
        synchronized (this.f3452l) {
            if (activity == this.f3447g) {
                this.f3447g = null;
            }
        }
        if (mo3092a().m3270M()) {
            this.f3446f.remove(activity);
        }
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ InterfaceC3935d zzb() {
        return super.zzb();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0647c zzd() {
        return super.zzd();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0919v4 zzj() {
        return super.zzj();
    }

    @Override // p034c7.C0754j7, p034c7.InterfaceC0782l7
    public final /* bridge */ /* synthetic */ C0669d6 zzl() {
        return super.zzl();
    }
}
