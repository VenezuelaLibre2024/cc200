package p034c7;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzoj;
import com.google.android.gms.internal.measurement.zzok;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzpt;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import gd.C2245s;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p034c7.C0810n7;
import p108h6.C2394s;
import p164l1.AbstractC3404a;
import p170l7.C3443d;
import p170l7.InterfaceFutureC3445f;
import p207o6.C3936e;
import p207o6.C3946o;
import p207o6.InterfaceC3935d;
import p285u.C4771a;

/* renamed from: c7.w7 */
/* loaded from: classes.dex */
public final class C0936w7 extends AbstractC0680e3 {

    /* renamed from: c */
    public C0686e9 f3697c;

    /* renamed from: d */
    public InterfaceC0880s7 f3698d;

    /* renamed from: e */
    public final Set<InterfaceC0866r7> f3699e;

    /* renamed from: f */
    public boolean f3700f;

    /* renamed from: g */
    public final AtomicReference<String> f3701g;

    /* renamed from: h */
    public final Object f3702h;

    /* renamed from: i */
    public boolean f3703i;

    /* renamed from: j */
    public PriorityQueue<C0856qb> f3704j;

    /* renamed from: k */
    public C0810n7 f3705k;

    /* renamed from: l */
    public final AtomicLong f3706l;

    /* renamed from: m */
    public long f3707m;

    /* renamed from: n */
    public final C0913uc f3708n;

    /* renamed from: o */
    public boolean f3709o;

    /* renamed from: p */
    public AbstractC0900u f3710p;

    /* renamed from: q */
    public SharedPreferences.OnSharedPreferenceChangeListener f3711q;

    /* renamed from: r */
    public AbstractC0900u f3712r;

    /* renamed from: s */
    public final InterfaceC0843pc f3713s;

    public C0936w7(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3699e = new CopyOnWriteArraySet();
        this.f3702h = new Object();
        this.f3703i = false;
        this.f3709o = true;
        this.f3713s = new C0937w8(this);
        this.f3701g = new AtomicReference<>();
        this.f3705k = C0810n7.f3353c;
        this.f3707m = -1L;
        this.f3706l = new AtomicLong(0L);
        this.f3708n = new C0913uc(c0767k6);
    }

    /* renamed from: J */
    public static /* synthetic */ void m3938J(C0936w7 c0936w7, C0810n7 c0810n7, long j10, boolean z10, boolean z11) {
        c0936w7.mo3099i();
        c0936w7.m3155q();
        C0810n7 m3410G = c0936w7.mo3095e().m3410G();
        if (j10 <= c0936w7.f3707m && C0810n7.m3628k(m3410G.m3631b(), c0810n7.m3631b())) {
            c0936w7.zzj().m3917E().m3996b("Dropped out-of-date consent setting, proposed settings", c0810n7);
            return;
        }
        if (!c0936w7.mo3095e().m3425v(c0810n7)) {
            c0936w7.zzj().m3917E().m3996b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c0810n7.m3631b()));
            return;
        }
        c0936w7.f3707m = j10;
        c0936w7.mo3105o().m4029P(z10);
        if (z11) {
            c0936w7.mo3105o().m4025L(new AtomicReference<>());
        }
    }

    /* renamed from: K */
    public static /* synthetic */ void m3939K(C0936w7 c0936w7, C0810n7 c0810n7, C0810n7 c0810n72) {
        C0810n7.a aVar = C0810n7.a.ANALYTICS_STORAGE;
        C0810n7.a aVar2 = C0810n7.a.AD_STORAGE;
        boolean m3634m = c0810n7.m3634m(c0810n72, aVar, aVar2);
        boolean m3637r = c0810n7.m3637r(c0810n72, aVar, aVar2);
        if (m3634m || m3637r) {
            c0936w7.mo3101k().m3700D();
        }
    }

    /* renamed from: A */
    public final /* synthetic */ void m3944A(SharedPreferences sharedPreferences, String str) {
        if ("IABTCF_TCString".equals(str)) {
            ((AbstractC0900u) C2394s.m9619l(this.f3712r)).m3851b(500L);
        }
    }

    /* renamed from: B */
    public final /* synthetic */ void m3945B(Bundle bundle) {
        if (bundle == null) {
            mo3095e().f3148A.m3478b(new Bundle());
            return;
        }
        Bundle m3477a = mo3095e().f3148A.m3477a();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                mo3096f();
                if (C0857qc.m3750c0(obj)) {
                    mo3096f();
                    C0857qc.m3742M(this.f3713s, 27, null, null, 0);
                }
                zzj().m3920H().m3997c("Invalid default event parameter type. Name, value", str, obj);
            } else if (C0857qc.m3735C0(str)) {
                zzj().m3920H().m3996b("Invalid default event parameter name. Name", str);
            } else if (obj == null) {
                m3477a.remove(str);
            } else if (mo3096f().m3798g0("param", str, mo3092a().m3279m(null, false), obj)) {
                mo3096f().m3776J(m3477a, str, obj);
            }
        }
        mo3096f();
        if (C0857qc.m3749b0(m3477a, mo3092a().m3261B())) {
            mo3096f();
            C0857qc.m3742M(this.f3713s, 26, null, null, 0);
            zzj().m3920H().m3995a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        mo3095e().f3148A.m3478b(m3477a);
        mo3105o().m4044x(m3477a);
    }

    /* renamed from: C */
    public final void m3946C(Bundle bundle, int i10, long j10) {
        m3155q();
        String m3626i = C0810n7.m3626i(bundle);
        if (m3626i != null) {
            zzj().m3920H().m3996b("Ignoring invalid consent setting", m3626i);
            zzj().m3920H().m3995a("Valid consent values are 'granted', 'denied'");
        }
        C0810n7 m3621c = C0810n7.m3621c(bundle, i10);
        if (!zzns.zza() || !mo3092a().m3281o(C0733i0.f3068P0)) {
            m3950G(m3621c, j10);
            return;
        }
        if (m3621c.m3645z()) {
            m3950G(m3621c, j10);
        }
        C0928w m3927b = C0928w.m3927b(bundle, i10);
        if (m3927b.m3936j()) {
            m3948E(m3927b);
        }
        Boolean m3929d = C0928w.m3929d(bundle);
        if (m3929d != null) {
            m3963X(i10 == -30 ? "tcf" : "app", "allow_personalized_ads", m3929d.toString(), false);
        }
    }

    /* renamed from: D */
    public final void m3947D(Bundle bundle, long j10) {
        C2394s.m9619l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            zzj().m3919G().m3995a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        C2394s.m9619l(bundle2);
        C0768k7.m3519a(bundle2, "app_id", String.class, null);
        C0768k7.m3519a(bundle2, "origin", String.class, null);
        C0768k7.m3519a(bundle2, "name", String.class, null);
        C0768k7.m3519a(bundle2, "value", Object.class, null);
        C0768k7.m3519a(bundle2, "trigger_event_name", String.class, null);
        C0768k7.m3519a(bundle2, "trigger_timeout", Long.class, 0L);
        C0768k7.m3519a(bundle2, "timed_out_event_name", String.class, null);
        C0768k7.m3519a(bundle2, "timed_out_event_params", Bundle.class, null);
        C0768k7.m3519a(bundle2, "triggered_event_name", String.class, null);
        C0768k7.m3519a(bundle2, "triggered_event_params", Bundle.class, null);
        C0768k7.m3519a(bundle2, "time_to_live", Long.class, 0L);
        C0768k7.m3519a(bundle2, "expired_event_name", String.class, null);
        C0768k7.m3519a(bundle2, "expired_event_params", Bundle.class, null);
        C2394s.m9613f(bundle2.getString("name"));
        C2394s.m9613f(bundle2.getString("origin"));
        C2394s.m9619l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j10);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        if (mo3096f().m3801m0(string) != 0) {
            zzj().m3914B().m3996b("Invalid conditional user property name", mo3094d().m3860g(string));
            return;
        }
        if (mo3096f().m3806r(string, obj) != 0) {
            zzj().m3914B().m3997c("Invalid conditional user property value", mo3094d().m3860g(string), obj);
            return;
        }
        Object m3811v0 = mo3096f().m3811v0(string, obj);
        if (m3811v0 == null) {
            zzj().m3914B().m3997c("Unable to normalize conditional user property value", mo3094d().m3860g(string), obj);
            return;
        }
        C0768k7.m3520b(bundle2, m3811v0);
        long j11 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j11 > 15552000000L || j11 < 1)) {
            zzj().m3914B().m3997c("Invalid conditional user property timeout", mo3094d().m3860g(string), Long.valueOf(j11));
            return;
        }
        long j12 = bundle2.getLong("time_to_live");
        if (j12 > 15552000000L || j12 < 1) {
            zzj().m3914B().m3997c("Invalid conditional user property time to live", mo3094d().m3860g(string), Long.valueOf(j12));
        } else {
            zzl().m3152y(new RunnableC0895t8(this, bundle2));
        }
    }

    /* renamed from: E */
    public final void m3948E(C0928w c0928w) {
        zzl().m3152y(new RunnableC0672d9(this, c0928w));
    }

    /* renamed from: F */
    public final void m3949F(C0810n7 c0810n7) {
        mo3099i();
        boolean z10 = (c0810n7.m3644y() && c0810n7.m3643x()) || mo3105o().m4039Z();
        if (z10 != this.f3198a.m3504l()) {
            this.f3198a.m3510r(z10);
            Boolean m3412I = mo3095e().m3412I();
            if (!z10 || m3412I == null || m3412I.booleanValue()) {
                m3954O(Boolean.valueOf(z10), false);
            }
        }
    }

    /* renamed from: G */
    public final void m3950G(C0810n7 c0810n7, long j10) {
        C0810n7 c0810n72;
        boolean z10;
        boolean z11;
        boolean z12;
        C0810n7 c0810n73 = c0810n7;
        m3155q();
        int m3631b = c0810n7.m3631b();
        if (m3631b != -10 && c0810n7.m3638s() == null && c0810n7.m3640u() == null) {
            zzj().m3920H().m3995a("Discarding empty consent settings");
            return;
        }
        synchronized (this.f3702h) {
            c0810n72 = this.f3705k;
            z10 = true;
            z11 = false;
            if (C0810n7.m3628k(m3631b, c0810n72.m3631b())) {
                boolean m3639t = c0810n73.m3639t(this.f3705k);
                if (c0810n7.m3644y() && !this.f3705k.m3644y()) {
                    z11 = true;
                }
                c0810n73 = c0810n73.m3636p(this.f3705k);
                this.f3705k = c0810n73;
                z12 = z11;
                z11 = m3639t;
            } else {
                z10 = false;
                z12 = false;
            }
        }
        if (!z10) {
            zzj().m3917E().m3996b("Ignoring lower-priority consent settings, proposed settings", c0810n73);
            return;
        }
        long andIncrement = this.f3706l.getAndIncrement();
        if (z11) {
            m3955P(null);
            zzl().m3144B(new RunnableC0657c9(this, c0810n73, j10, andIncrement, z12, c0810n72));
            return;
        }
        RunnableC0700f9 runnableC0700f9 = new RunnableC0700f9(this, c0810n73, andIncrement, z12, c0810n72);
        if (m3631b == 30 || m3631b == -10) {
            zzl().m3144B(runnableC0700f9);
        } else {
            zzl().m3152y(runnableC0700f9);
        }
    }

    /* renamed from: H */
    public final void m3951H(InterfaceC0866r7 interfaceC0866r7) {
        m3155q();
        C2394s.m9619l(interfaceC0866r7);
        if (this.f3699e.add(interfaceC0866r7)) {
            return;
        }
        zzj().m3919G().m3995a("OnEventListener already registered");
    }

    /* renamed from: I */
    public final void m3952I(InterfaceC0880s7 interfaceC0880s7) {
        InterfaceC0880s7 interfaceC0880s72;
        mo3099i();
        m3155q();
        if (interfaceC0880s7 != null && interfaceC0880s7 != (interfaceC0880s72 = this.f3698d)) {
            C2394s.m9623p(interfaceC0880s72 == null, "EventInterceptor already set.");
        }
        this.f3698d = interfaceC0880s7;
    }

    /* renamed from: N */
    public final void m3953N(Boolean bool) {
        m3155q();
        zzl().m3152y(new RunnableC0627a9(this, bool));
    }

    /* renamed from: O */
    public final void m3954O(Boolean bool, boolean z10) {
        mo3099i();
        m3155q();
        zzj().m3913A().m3996b("Setting app measurement enabled (FE)", bool);
        mo3095e().m3420q(bool);
        if (z10) {
            mo3095e().m3428y(bool);
        }
        if (this.f3198a.m3504l() || !(bool == null || bool.booleanValue())) {
            m3983r0();
        }
    }

    /* renamed from: P */
    public final void m3955P(String str) {
        this.f3701g.set(str);
    }

    /* renamed from: Q */
    public final void m3956Q(String str, String str2, long j10, Bundle bundle) {
        mo3099i();
        m3957R(str, str2, j10, bundle, true, this.f3698d == null || C0857qc.m3735C0(str2), true, null);
    }

    /* renamed from: R */
    public final void m3957R(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        String str4;
        long j11;
        String str5;
        String str6;
        boolean z13;
        int length;
        C2394s.m9613f(str);
        C2394s.m9619l(bundle);
        mo3099i();
        m3155q();
        if (!this.f3198a.m3503k()) {
            zzj().m3913A().m3995a("Event not sent since app measurement is disabled");
            return;
        }
        List<String> m3699C = mo3101k().m3699C();
        if (m3699C != null && !m3699C.contains(str2)) {
            zzj().m3913A().m3997c("Dropping non-safelisted event. event name, origin", str2, str);
            return;
        }
        boolean z14 = true;
        if (!this.f3700f) {
            this.f3700f = true;
            try {
                try {
                    (!this.f3198a.m3507o() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, zza());
                } catch (Exception e10) {
                    zzj().m3919G().m3996b("Failed to invoke Tag Manager's initialize() method", e10);
                }
            } catch (ClassNotFoundException unused) {
                zzj().m3917E().m3995a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2)) {
            if (bundle.containsKey("gclid")) {
                m3962W("auto", "_lgclid", bundle.getString("gclid"), zzb().mo14932a());
            }
            if (zzok.zza() && mo3092a().m3281o(C0733i0.f3082W0) && bundle.containsKey("gbraid")) {
                m3962W("auto", "_gbraid", bundle.getString("gbraid"), zzb().mo14932a());
            }
        }
        if (z10 && C0857qc.m3739G0(str2)) {
            mo3096f().m3774I(bundle, mo3095e().f3148A.m3477a());
        }
        if (!z12 && !"_iap".equals(str2)) {
            C0857qc m3491G = this.f3198a.m3491G();
            int i10 = 2;
            if (m3491G.m3813x0("event", str2)) {
                if (!m3491G.m3800k0("event", C0824o7.f3397a, C0824o7.f3398b, str2)) {
                    i10 = 13;
                } else if (m3491G.m3796e0("event", 40, str2)) {
                    i10 = 0;
                }
            }
            if (i10 != 0) {
                zzj().m3915C().m3996b("Invalid public event name. Event will not be logged (FE)", mo3094d().m3857c(str2));
                this.f3198a.m3491G();
                String m3736E = C0857qc.m3736E(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f3198a.m3491G();
                C0857qc.m3742M(this.f3713s, i10, "_ev", m3736E, length);
                return;
            }
        }
        C0854q9 m3724x = mo3104n().m3724x(false);
        if (m3724x != null && !bundle.containsKey("_sc")) {
            m3724x.f3476d = true;
        }
        C0857qc.m3741L(m3724x, bundle, z10 && !z12);
        boolean equals = "am".equals(str);
        boolean m3735C0 = C0857qc.m3735C0(str2);
        if (z10 && this.f3698d != null && !m3735C0 && !equals) {
            zzj().m3913A().m3997c("Passing event to registered event handler (FE)", mo3094d().m3857c(str2), mo3094d().m3855a(bundle));
            C2394s.m9619l(this.f3698d);
            this.f3698d.mo3842a(str, str2, bundle, j10);
            return;
        }
        if (this.f3198a.m3506n()) {
            int m3805q = mo3096f().m3805q(str2);
            if (m3805q != 0) {
                zzj().m3915C().m3996b("Invalid event name. Event will not be logged (FE)", mo3094d().m3857c(str2));
                mo3096f();
                String m3736E2 = C0857qc.m3736E(str2, 40, true);
                length = str2 != null ? str2.length() : 0;
                this.f3198a.m3491G();
                C0857qc.m3744N(this.f3713s, str3, m3805q, "_ev", m3736E2, length);
                return;
            }
            Bundle m3764A = mo3096f().m3764A(str3, str2, bundle, C3936e.m14936b("_o", "_sn", "_sc", "_si"), z12);
            C2394s.m9619l(m3764A);
            if (mo3104n().m3724x(false) != null && Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                C0814nb c0814nb = mo3106p().f3002f;
                long mo14933b = c0814nb.f3376d.zzb().mo14933b();
                long j12 = mo14933b - c0814nb.f3374b;
                c0814nb.f3374b = mo14933b;
                if (j12 > 0) {
                    mo3096f().m3772H(m3764A, j12);
                }
            }
            if (!"auto".equals(str) && "_ssr".equals(str2)) {
                C0857qc mo3096f = mo3096f();
                String string = m3764A.getString("_ffr");
                if (C3946o.m14966b(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                if (Objects.equals(string, mo3096f.mo3095e().f3170x.m3673a())) {
                    mo3096f.zzj().m3913A().m3995a("Not logging duplicate session_start_with_rollout event");
                    z13 = false;
                } else {
                    mo3096f.mo3095e().f3170x.m3674b(string);
                    z13 = true;
                }
                if (!z13) {
                    return;
                }
            } else if (Constants.FIREBASE_APPLICATION_EXCEPTION.equals(str2)) {
                String m3673a = mo3096f().mo3095e().f3170x.m3673a();
                if (!TextUtils.isEmpty(m3673a)) {
                    m3764A.putString("_ffr", m3673a);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m3764A);
            boolean m3254A = mo3092a().m3281o(C0733i0.f3064N0) ? mo3106p().m3254A() : mo3095e().f3167u.m3528b();
            if (mo3095e().f3164r.m3618a() > 0 && mo3095e().m3423t(j10) && m3254A) {
                zzj().m3918F().m3995a("Current session is expired, remove the session number, ID, and engagement time");
                long mo14932a = zzb().mo14932a();
                j11 = 0;
                str4 = Constants.FIREBASE_APPLICATION_EXCEPTION;
                m3962W("auto", "_sid", null, mo14932a);
                m3962W("auto", "_sno", null, zzb().mo14932a());
                m3962W("auto", "_se", null, zzb().mo14932a());
                mo3095e().f3165s.m3619b(0L);
            } else {
                str4 = Constants.FIREBASE_APPLICATION_EXCEPTION;
                j11 = 0;
            }
            if (m3764A.getLong("extend_session", j11) == 1) {
                zzj().m3918F().m3995a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                this.f3198a.m3490F().f3001e.m3728b(j10, true);
            }
            ArrayList arrayList2 = new ArrayList(m3764A.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                String str7 = (String) obj;
                if (str7 != null) {
                    mo3096f();
                    Bundle[] m3756s0 = C0857qc.m3756s0(m3764A.get(str7));
                    if (m3756s0 != null) {
                        m3764A.putParcelableArray(str7, m3756s0);
                    }
                }
            }
            int i12 = 0;
            while (i12 < arrayList.size()) {
                Bundle bundle2 = (Bundle) arrayList.get(i12);
                if (i12 != 0 ? z14 : false) {
                    str6 = "_ep";
                    str5 = str;
                } else {
                    str5 = str;
                    str6 = str2;
                }
                bundle2.putString("_o", str5);
                if (z11) {
                    bundle2 = mo3096f().m3814z(bundle2, null);
                }
                Bundle bundle3 = bundle2;
                mo3105o().m4046z(new C0705g0(str6, new C0618a0(bundle3), str, j10), str3);
                if (!equals) {
                    Iterator<InterfaceC0866r7> it = this.f3699e.iterator();
                    while (it.hasNext()) {
                        it.next().mo3818a(str, str2, new Bundle(bundle3), j10);
                    }
                }
                i12++;
                z14 = true;
            }
            if (mo3104n().m3724x(false) == null || !str4.equals(str2)) {
                return;
            }
            mo3106p().m3257z(true, true, zzb().mo14933b());
        }
    }

    /* renamed from: S */
    public final void m3958S(String str, String str2, long j10, Object obj) {
        zzl().m3152y(new RunnableC0811n8(this, str, str2, obj, j10));
    }

    /* renamed from: T */
    public final void m3959T(String str, String str2, Bundle bundle) {
        long mo14932a = zzb().mo14932a();
        C2394s.m9613f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", mo14932a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        zzl().m3152y(new RunnableC0881s8(this, bundle2));
    }

    /* renamed from: U */
    public final void m3960U(String str, String str2, Bundle bundle, String str3) {
        mo3098h();
        m3986v0(str, str2, zzb().mo14932a(), bundle, false, true, true, str3);
    }

    /* renamed from: V */
    public final void m3961V(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            mo3104n().m3716D(bundle2, j10);
        } else {
            m3986v0(str3, str2, j10, bundle2, z11, !z11 || this.f3698d == null || C0857qc.m3735C0(str2), z10, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3962W(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            p108h6.C2394s.m9613f(r9)
            p108h6.C2394s.m9613f(r10)
            r8.mo3099i()
            r8.m3155q()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L60
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            c7.i5 r0 = r8.mo3095e()
            c7.o5 r0 = r0.f3161o
            long r4 = r10.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.m3674b(r11)
            r6 = r10
            goto L5e
        L50:
            if (r11 != 0) goto L60
            c7.i5 r10 = r8.mo3095e()
            c7.o5 r10 = r10.f3161o
            java.lang.String r0 = "unset"
            r10.m3674b(r0)
            r6 = r11
        L5e:
            r3 = r1
            goto L62
        L60:
            r3 = r10
            r6 = r11
        L62:
            c7.k6 r10 = r8.f3198a
            boolean r10 = r10.m3503k()
            if (r10 != 0) goto L78
            c7.v4 r9 = r8.zzj()
            c7.x4 r9 = r9.m3918F()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.m3995a(r10)
            return
        L78:
            c7.k6 r10 = r8.f3198a
            boolean r10 = r10.m3506n()
            if (r10 != 0) goto L81
            return
        L81:
            c7.lc r10 = new c7.lc
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            c7.y9 r9 = r8.mo3105o()
            r9.m4019F(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0936w7.m3962W(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    /* renamed from: X */
    public final void m3963X(String str, String str2, Object obj, boolean z10) {
        m3964Y(str, str2, obj, z10, zzb().mo14932a());
    }

    /* renamed from: Y */
    public final void m3964Y(String str, String str2, Object obj, boolean z10, long j10) {
        int length;
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i10 = 6;
        if (z10) {
            i10 = mo3096f().m3801m0(str2);
        } else {
            C0857qc mo3096f = mo3096f();
            if (mo3096f.m3813x0("user property", str2)) {
                if (!mo3096f.m3799j0("user property", C0838p7.f3440a, str2)) {
                    i10 = 15;
                } else if (mo3096f.m3796e0("user property", 24, str2)) {
                    i10 = 0;
                }
            }
        }
        if (i10 != 0) {
            mo3096f();
            String m3736E = C0857qc.m3736E(str2, 24, true);
            length = str2 != null ? str2.length() : 0;
            this.f3198a.m3491G();
            C0857qc.m3742M(this.f3713s, i10, "_ev", m3736E, length);
            return;
        }
        if (obj == null) {
            m3958S(str3, str2, j10, null);
            return;
        }
        int m3806r = mo3096f().m3806r(str2, obj);
        if (m3806r == 0) {
            Object m3811v0 = mo3096f().m3811v0(str2, obj);
            if (m3811v0 != null) {
                m3958S(str3, str2, j10, m3811v0);
                return;
            }
            return;
        }
        mo3096f();
        String m3736E2 = C0857qc.m3736E(str2, 24, true);
        length = ((obj instanceof String) || (obj instanceof CharSequence)) ? String.valueOf(obj).length() : 0;
        this.f3198a.m3491G();
        C0857qc.m3742M(this.f3713s, m3806r, "_ev", m3736E2, length);
    }

    /* renamed from: Z */
    public final /* synthetic */ void m3965Z(List list) {
        mo3099i();
        if (Build.VERSION.SDK_INT >= 30) {
            SparseArray<Long> m3408E = mo3095e().m3408E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0856qb c0856qb = (C0856qb) it.next();
                if (!m3408E.contains(c0856qb.f3487j) || m3408E.get(c0856qb.f3487j).longValue() < c0856qb.f3486i) {
                    m3982q0().add(c0856qb);
                }
            }
            m3980o0();
        }
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    /* renamed from: a0 */
    public final Boolean m3966a0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) zzl().m3147q(atomicReference, 15000L, "boolean test flag value", new RunnableC0699f8(this, atomicReference));
    }

    /* renamed from: b0 */
    public final Double m3967b0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) zzl().m3147q(atomicReference, 15000L, "double test flag value", new RunnableC0642b9(this, atomicReference));
    }

    @Override // p034c7.C0754j7
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C0970z mo3093c() {
        return super.mo3093c();
    }

    /* renamed from: c0 */
    public final Integer m3968c0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) zzl().m3147q(atomicReference, 15000L, "int test flag value", new RunnableC0965y8(this, atomicReference));
    }

    @Override // p034c7.C0754j7
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C0905u4 mo3094d() {
        return super.mo3094d();
    }

    /* renamed from: d0 */
    public final Long m3969d0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) zzl().m3147q(atomicReference, 15000L, "long test flag value", new RunnableC0979z8(this, atomicReference));
    }

    @Override // p034c7.C0754j7
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0738i5 mo3095e() {
        return super.mo3095e();
    }

    /* renamed from: e0 */
    public final String m3970e0() {
        return this.f3701g.get();
    }

    @Override // p034c7.C0754j7
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0857qc mo3096f() {
        return super.mo3096f();
    }

    /* renamed from: f0 */
    public final String m3971f0() {
        C0854q9 m3719K = this.f3198a.m3488D().m3719K();
        if (m3719K != null) {
            return m3719K.f3474b;
        }
        return null;
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    /* renamed from: g0 */
    public final String m3972g0() {
        C0854q9 m3719K = this.f3198a.m3488D().m3719K();
        if (m3719K != null) {
            return m3719K.f3473a;
        }
        return null;
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    /* renamed from: h0 */
    public final String m3973h0() {
        if (this.f3198a.m3492H() != null) {
            return this.f3198a.m3492H();
        }
        try {
            return new C0683e6(zza(), this.f3198a.m3495K()).m3162b("google_app_id");
        } catch (IllegalStateException e10) {
            this.f3198a.zzj().m3914B().m3996b("getGoogleAppId failed with exception", e10);
            return null;
        }
    }

    @Override // p034c7.C0695f4, p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    /* renamed from: i0 */
    public final String m3974i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) zzl().m3147q(atomicReference, 15000L, "String test flag value", new RunnableC0867r8(this, atomicReference));
    }

    @Override // p034c7.C0695f4
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0633b0 mo3100j() {
        return super.mo3100j();
    }

    /* renamed from: j0 */
    public final void m3975j0() {
        mo3099i();
        m3155q();
        if (this.f3198a.m3506n()) {
            Boolean m3290x = mo3092a().m3290x("google_analytics_deferred_deep_link_enabled");
            if (m3290x != null && m3290x.booleanValue()) {
                zzj().m3913A().m3995a("Deferred Deep Link feature enabled.");
                zzl().m3152y(new Runnable() { // from class: c7.b8
                    public /* synthetic */ RunnableC0641b8() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0936w7.this.m3978m0();
                    }
                });
            }
            mo3105o().m4032S();
            this.f3709o = false;
            String m3414K = mo3095e().m3414K();
            if (TextUtils.isEmpty(m3414K)) {
                return;
            }
            mo3093c().m3430k();
            if (m3414K.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", m3414K);
            m3989x0("auto", "_ou", bundle);
        }
    }

    @Override // p034c7.C0695f4
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C0835p4 mo3101k() {
        return super.mo3101k();
    }

    /* renamed from: k0 */
    public final void m3976k0() {
        if (!(zza().getApplicationContext() instanceof Application) || this.f3697c == null) {
            return;
        }
        ((Application) zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f3697c);
    }

    @Override // p034c7.C0695f4
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C0877s4 mo3102l() {
        return super.mo3102l();
    }

    /* renamed from: l0 */
    public final void m3977l0() {
        if (zzph.zza() && mo3092a().m3281o(C0733i0.f3054I0)) {
            if (zzl().m3145E()) {
                zzj().m3914B().m3995a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C0647c.m3114a()) {
                zzj().m3914B().m3995a("Cannot get trigger URIs from main thread");
                return;
            }
            m3155q();
            zzj().m3918F().m3995a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            zzl().m3147q(atomicReference, 5000L, "get trigger URIs", new Runnable() { // from class: c7.x7

                /* renamed from: i */
                public /* synthetic */ AtomicReference f3736i;

                public /* synthetic */ RunnableC0950x7(AtomicReference atomicReference2) {
                    r2 = atomicReference2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0936w7 c0936w7 = C0936w7.this;
                    AtomicReference<List<C0856qb>> atomicReference2 = r2;
                    Bundle m3477a = c0936w7.mo3095e().f3162p.m3477a();
                    C0966y9 mo3105o = c0936w7.mo3105o();
                    if (m3477a == null) {
                        m3477a = new Bundle();
                    }
                    mo3105o.m4026M(atomicReference2, m3477a);
                }
            });
            List list = (List) atomicReference2.get();
            if (list == null) {
                zzj().m3914B().m3995a("Timed out waiting for get trigger URIs");
            } else {
                zzl().m3152y(new Runnable() { // from class: c7.a8

                    /* renamed from: i */
                    public /* synthetic */ List f2764i;

                    public /* synthetic */ RunnableC0626a8(List list2) {
                        r2 = list2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C0936w7.this.m3965Z(r2);
                    }
                });
            }
        }
    }

    @Override // p034c7.C0695f4
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0936w7 mo3103m() {
        return super.mo3103m();
    }

    /* renamed from: m0 */
    public final void m3978m0() {
        mo3099i();
        if (mo3095e().f3168v.m3528b()) {
            zzj().m3913A().m3995a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long m3618a = mo3095e().f3169w.m3618a();
        mo3095e().f3169w.m3619b(1 + m3618a);
        if (m3618a >= 5) {
            zzj().m3919G().m3995a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            mo3095e().f3168v.m3527a(true);
        } else {
            if (!zzns.zza() || !mo3092a().m3281o(C0733i0.f3072R0)) {
                this.f3198a.m3508p();
                return;
            }
            if (this.f3710p == null) {
                this.f3710p = new C0839p8(this, this.f3198a);
            }
            this.f3710p.m3851b(0L);
        }
    }

    @Override // p034c7.C0695f4
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C0840p9 mo3104n() {
        return super.mo3104n();
    }

    /* renamed from: n0 */
    public final void m3979n0() {
        mo3099i();
        zzj().m3913A().m3995a("Handle tcf update.");
        SharedPreferences m3405B = mo3095e().m3405B();
        Boolean m3290x = mo3092a().m3290x(" google_analytics_tcf_data_enabled");
        C0828ob m3688c = C0828ob.m3688c(m3405B, m3290x == null ? true : m3290x.booleanValue());
        if (mo3095e().m3426w(m3688c)) {
            Bundle m3691b = m3688c.m3691b();
            if (m3691b != Bundle.EMPTY) {
                m3946C(m3691b, -30, zzb().mo14932a());
            }
            Bundle bundle = new Bundle();
            bundle.putString("_tcfd", m3688c.m3692e());
            m3989x0("auto", "_tcf", bundle);
        }
    }

    @Override // p034c7.C0695f4
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C0966y9 mo3105o() {
        return super.mo3105o();
    }

    @TargetApi(C1417R.styleable.AppCompatTheme_actionModeTheme)
    /* renamed from: o0 */
    public final void m3980o0() {
        C0856qb poll;
        AbstractC3404a m3779L0;
        mo3099i();
        if (m3982q0().isEmpty() || this.f3703i || (poll = m3982q0().poll()) == null || (m3779L0 = mo3096f().m3779L0()) == null) {
            return;
        }
        this.f3703i = true;
        zzj().m3918F().m3996b("Registering trigger URI", poll.f3485h);
        InterfaceFutureC3445f<C2245s> mo12703c = m3779L0.mo12703c(Uri.parse(poll.f3485h));
        if (mo12703c == null) {
            this.f3703i = false;
            m3982q0().add(poll);
            return;
        }
        SparseArray<Long> m3408E = mo3095e().m3408E();
        m3408E.put(poll.f3487j, Long.valueOf(poll.f3486i));
        C0738i5 mo3095e = mo3095e();
        int[] iArr = new int[m3408E.size()];
        long[] jArr = new long[m3408E.size()];
        for (int i10 = 0; i10 < m3408E.size(); i10++) {
            iArr[i10] = m3408E.keyAt(i10);
            jArr[i10] = m3408E.valueAt(i10).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        mo3095e.f3162p.m3478b(bundle);
        C3443d.m12828a(mo12703c, new C0727h8(this, poll), new ExecutorC0741i8(this));
    }

    @Override // p034c7.C0695f4
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C0716gb mo3106p() {
        return super.mo3106p();
    }

    /* renamed from: p0 */
    public final void m3981p0() {
        mo3099i();
        zzj().m3913A().m3995a("Register tcfPrefChangeListener.");
        if (this.f3711q == null) {
            this.f3712r = new C0783l8(this, this.f3198a);
            this.f3711q = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: c7.e8
                public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC0685e8() {
                }

                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    C0936w7.this.m3944A(sharedPreferences, str);
                }
            };
        }
        mo3095e().m3405B().registerOnSharedPreferenceChangeListener(this.f3711q);
    }

    @TargetApi(C1417R.styleable.AppCompatTheme_actionModeTheme)
    /* renamed from: q0 */
    public final PriorityQueue<C0856qb> m3982q0() {
        Comparator comparing;
        if (this.f3704j == null) {
            comparing = Comparator.comparing(C0922v7.f3671a, C0964y7.f3774h);
            this.f3704j = new PriorityQueue<>(comparing);
        }
        return this.f3704j;
    }

    /* renamed from: r0 */
    public final void m3983r0() {
        Long valueOf;
        mo3099i();
        String m3673a = mo3095e().f3161o.m3673a();
        if (m3673a != null) {
            if ("unset".equals(m3673a)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf("true".equals(m3673a) ? 1L : 0L);
            }
            m3962W("app", "_npa", valueOf, zzb().mo14932a());
        }
        if (!this.f3198a.m3503k() || !this.f3709o) {
            zzj().m3913A().m3995a("Updating Scion state (FE)");
            mo3105o().m4036W();
            return;
        }
        zzj().m3913A().m3995a("Recording app launch after enabling measurement for the first time (FE)");
        m3975j0();
        if (zzoj.zza() && mo3092a().m3281o(C0733i0.f3118n0)) {
            mo3106p().f3001e.m3727a();
        }
        zzl().m3152y(new RunnableC0755j8(this));
    }

    /* renamed from: s0 */
    public final void m3984s0(Bundle bundle) {
        m3947D(bundle, zzb().mo14932a());
    }

    /* renamed from: t0 */
    public final void m3985t0(InterfaceC0866r7 interfaceC0866r7) {
        m3155q();
        C2394s.m9619l(interfaceC0866r7);
        if (this.f3699e.remove(interfaceC0866r7)) {
            return;
        }
        zzj().m3919G().m3995a("OnEventListener had not been registered");
    }

    @Override // p034c7.AbstractC0680e3
    /* renamed from: v */
    public final boolean mo3160v() {
        return false;
    }

    /* renamed from: v0 */
    public final void m3986v0(String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        zzl().m3152y(new RunnableC0825o8(this, str, str2, j10, C0857qc.m3762y(bundle), z10, z11, z12, str3));
    }

    /* renamed from: w0 */
    public final void m3987w0(String str, String str2, Bundle bundle) {
        m3961V(str, str2, bundle, true, true, zzb().mo14932a());
    }

    /* renamed from: x */
    public final ArrayList<Bundle> m3988x(String str, String str2) {
        if (zzl().m3145E()) {
            zzj().m3914B().m3995a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (C0647c.m3114a()) {
            zzj().m3914B().m3995a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f3198a.zzl().m3147q(atomicReference, 5000L, "get conditional user properties", new RunnableC0923v8(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C0857qc.m3754o0(list);
        }
        zzj().m3914B().m3996b("Timed out waiting for get conditional user properties", null);
        return new ArrayList<>();
    }

    /* renamed from: x0 */
    public final void m3989x0(String str, String str2, Bundle bundle) {
        mo3099i();
        m3956Q(str, str2, zzb().mo14932a(), bundle);
    }

    /* renamed from: y */
    public final Map<String, Object> m3990y(String str, String str2, boolean z10) {
        C0947x4 m3914B;
        String str3;
        if (zzl().m3145E()) {
            m3914B = zzj().m3914B();
            str3 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!C0647c.m3114a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f3198a.zzl().m3147q(atomicReference, 5000L, "get user properties", new RunnableC0909u8(this, atomicReference, null, str, str2, z10));
                List<C0787lc> list = (List) atomicReference.get();
                if (list == null) {
                    zzj().m3914B().m3996b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z10));
                    return Collections.emptyMap();
                }
                C4771a c4771a = new C4771a(list.size());
                for (C0787lc c0787lc : list) {
                    Object m3529I = c0787lc.m3529I();
                    if (m3529I != null) {
                        c4771a.put(c0787lc.f3289i, m3529I);
                    }
                }
                return c4771a;
            }
            m3914B = zzj().m3914B();
            str3 = "Cannot get user properties from main thread";
        }
        m3914B.m3995a(str3);
        return Collections.emptyMap();
    }

    /* renamed from: z */
    public final void m3991z(long j10, boolean z10) {
        mo3099i();
        m3155q();
        zzj().m3913A().m3995a("Resetting analytics data (FE)");
        C0716gb mo3106p = mo3106p();
        mo3106p.mo3099i();
        mo3106p.f3002f.m3649b();
        if (zzpt.zza() && mo3092a().m3281o(C0733i0.f3128s0)) {
            mo3101k().m3700D();
        }
        boolean m3503k = this.f3198a.m3503k();
        C0738i5 mo3095e = mo3095e();
        mo3095e.f3153g.m3619b(j10);
        if (!TextUtils.isEmpty(mo3095e.mo3095e().f3170x.m3673a())) {
            mo3095e.f3170x.m3674b(null);
        }
        if (zzoj.zza() && mo3095e.mo3092a().m3281o(C0733i0.f3118n0)) {
            mo3095e.f3164r.m3619b(0L);
        }
        mo3095e.f3165s.m3619b(0L);
        if (!mo3095e.mo3092a().m3271N()) {
            mo3095e.m3404A(!m3503k);
        }
        mo3095e.f3171y.m3674b(null);
        mo3095e.f3172z.m3619b(0L);
        mo3095e.f3148A.m3478b(null);
        if (z10) {
            mo3105o().m4035V();
        }
        if (zzoj.zza() && mo3092a().m3281o(C0733i0.f3118n0)) {
            mo3106p().f3001e.m3727a();
        }
        this.f3709o = !m3503k;
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
