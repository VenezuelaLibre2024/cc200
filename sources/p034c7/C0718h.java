package p034c7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzoq;
import com.google.android.gms.internal.measurement.zzov;
import java.lang.reflect.InvocationTargetException;
import p108h6.C2394s;
import p207o6.C3945n;
import p207o6.InterfaceC3935d;
import p237q6.C4195c;

/* renamed from: c7.h */
/* loaded from: classes.dex */
public final class C0718h extends C0754j7 {

    /* renamed from: b */
    public Boolean f3004b;

    /* renamed from: c */
    public String f3005c;

    /* renamed from: d */
    public InterfaceC0746j f3006d;

    /* renamed from: e */
    public Boolean f3007e;

    public C0718h(C0767k6 c0767k6) {
        super(c0767k6);
        this.f3005c = "";
        this.f3006d = C0704g.f2942a;
    }

    /* renamed from: D */
    public static long m3258D() {
        return C0733i0.f3101f.m3607a(null).longValue();
    }

    /* renamed from: H */
    public static long m3259H() {
        return C0733i0.f3047F.m3607a(null).longValue();
    }

    /* renamed from: A */
    public final boolean m3260A(String str, C0793m4<Boolean> c0793m4) {
        Boolean m3607a;
        if (str != null) {
            String mo3168b = this.f3006d.mo3168b(str, c0793m4.m3608b());
            if (!TextUtils.isEmpty(mo3168b)) {
                m3607a = c0793m4.m3607a(Boolean.valueOf("1".equals(mo3168b)));
                return m3607a.booleanValue();
            }
        }
        m3607a = c0793m4.m3607a(null);
        return m3607a.booleanValue();
    }

    /* renamed from: B */
    public final int m3261B() {
        return mo3096f().m3794X(201500000, true) ? 100 : 25;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> m3262C(java.lang.String r4) {
        /*
            r3 = this;
            p108h6.C2394s.m9613f(r4)
            android.os.Bundle r0 = r3.m3274Q()
            r1 = 0
            if (r0 != 0) goto L19
            c7.v4 r4 = r3.zzj()
            c7.x4 r4 = r4.m3914B()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.m3995a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.zza()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            c7.v4 r0 = r3.zzj()
            c7.x4 r0 = r0.m3914B()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.m3996b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0718h.m3262C(java.lang.String):java.util.List");
    }

    /* renamed from: E */
    public final boolean m3263E(String str) {
        return m3260A(str, C0733i0.f3061M);
    }

    /* renamed from: F */
    public final boolean m3264F(String str) {
        return "1".equals(this.f3006d.mo3168b(str, "gaia_collection_enabled"));
    }

    /* renamed from: G */
    public final boolean m3265G(String str) {
        return "1".equals(this.f3006d.mo3168b(str, "measurement.event_sampling_enabled"));
    }

    /* renamed from: I */
    public final String m3266I() {
        return m3275b("debug.firebase.analytics.app", "");
    }

    /* renamed from: J */
    public final String m3267J() {
        return m3275b("debug.deferred.deeplink", "");
    }

    /* renamed from: K */
    public final String m3268K() {
        return this.f3005c;
    }

    /* renamed from: L */
    public final boolean m3269L() {
        Boolean m3290x = m3290x("google_analytics_adid_collection_enabled");
        return m3290x == null || m3290x.booleanValue();
    }

    /* renamed from: M */
    public final boolean m3270M() {
        Boolean m3290x = m3290x("google_analytics_automatic_screen_reporting_enabled");
        return m3290x == null || m3290x.booleanValue();
    }

    /* renamed from: N */
    public final boolean m3271N() {
        Boolean m3290x = m3290x("firebase_analytics_collection_deactivated");
        return m3290x != null && m3290x.booleanValue();
    }

    /* renamed from: O */
    public final boolean m3272O() {
        if (this.f3004b == null) {
            Boolean m3290x = m3290x("app_measurement_lite");
            this.f3004b = m3290x;
            if (m3290x == null) {
                this.f3004b = Boolean.FALSE;
            }
        }
        return this.f3004b.booleanValue() || !this.f3198a.m3507o();
    }

    /* renamed from: P */
    public final boolean m3273P() {
        if (this.f3007e == null) {
            synchronized (this) {
                if (this.f3007e == null) {
                    ApplicationInfo applicationInfo = zza().getApplicationInfo();
                    String m14964a = C3945n.m14964a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f3007e = Boolean.valueOf(str != null && str.equals(m14964a));
                    }
                    if (this.f3007e == null) {
                        this.f3007e = Boolean.TRUE;
                        zzj().m3914B().m3995a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f3007e.booleanValue();
    }

    /* renamed from: Q */
    public final Bundle m3274Q() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().m3914B().m3995a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo m16178c = C4195c.m16183a(zza()).m16178c(zza().getPackageName(), 128);
            if (m16178c != null) {
                return m16178c.metaData;
            }
            zzj().m3914B().m3995a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            zzj().m3914B().m3996b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    /* renamed from: b */
    public final String m3275b(String str, String str2) {
        C0947x4 m3914B;
        String str3;
        try {
            String str4 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            C2394s.m9619l(str4);
            return str4;
        } catch (ClassNotFoundException e10) {
            e = e10;
            m3914B = zzj().m3914B();
            str3 = "Could not find SystemProperties class";
            m3914B.m3996b(str3, e);
            return str2;
        } catch (IllegalAccessException e11) {
            e = e11;
            m3914B = zzj().m3914B();
            str3 = "Could not access SystemProperties.get()";
            m3914B.m3996b(str3, e);
            return str2;
        } catch (NoSuchMethodException e12) {
            e = e12;
            m3914B = zzj().m3914B();
            str3 = "Could not find SystemProperties.get() method";
            m3914B.m3996b(str3, e);
            return str2;
        } catch (InvocationTargetException e13) {
            e = e13;
            m3914B = zzj().m3914B();
            str3 = "SystemProperties.get() threw an exception";
            m3914B.m3996b(str3, e);
            return str2;
        }
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

    @Override // p034c7.C0754j7
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo3097g() {
        super.mo3097g();
    }

    @Override // p034c7.C0754j7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo3098h() {
        super.mo3098h();
    }

    @Override // p034c7.C0754j7
    /* renamed from: i */
    public final /* bridge */ /* synthetic */ void mo3099i() {
        super.mo3099i();
    }

    /* renamed from: j */
    public final double m3276j(String str, C0793m4<Double> c0793m4) {
        if (str != null) {
            String mo3168b = this.f3006d.mo3168b(str, c0793m4.m3608b());
            if (!TextUtils.isEmpty(mo3168b)) {
                try {
                    return c0793m4.m3607a(Double.valueOf(Double.parseDouble(mo3168b))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c0793m4.m3607a(null).doubleValue();
    }

    /* renamed from: k */
    public final int m3277k(String str) {
        return m3278l(str, C0733i0.f3055J, 500, 2000);
    }

    /* renamed from: l */
    public final int m3278l(String str, C0793m4<Integer> c0793m4, int i10, int i11) {
        return Math.max(Math.min(m3283q(str, c0793m4), i11), i10);
    }

    /* renamed from: m */
    public final int m3279m(String str, boolean z10) {
        if (!zzoq.zza() || !mo3092a().m3260A(null, C0733i0.f3086Y0)) {
            return 100;
        }
        if (z10) {
            return m3278l(str, C0733i0.f3075T, 100, 500);
        }
        return 500;
    }

    /* renamed from: n */
    public final void m3280n(InterfaceC0746j interfaceC0746j) {
        this.f3006d = interfaceC0746j;
    }

    /* renamed from: o */
    public final boolean m3281o(C0793m4<Boolean> c0793m4) {
        return m3260A(null, c0793m4);
    }

    /* renamed from: p */
    public final int m3282p(String str) {
        return m3278l(str, C0733i0.f3057K, 25, 100);
    }

    /* renamed from: q */
    public final int m3283q(String str, C0793m4<Integer> c0793m4) {
        if (str != null) {
            String mo3168b = this.f3006d.mo3168b(str, c0793m4.m3608b());
            if (!TextUtils.isEmpty(mo3168b)) {
                try {
                    return c0793m4.m3607a(Integer.valueOf(Integer.parseInt(mo3168b))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c0793m4.m3607a(null).intValue();
    }

    /* renamed from: r */
    public final int m3284r(String str, boolean z10) {
        return Math.max(m3279m(str, z10), 256);
    }

    /* renamed from: s */
    public final int m3285s() {
        return (zzov.zza() && mo3092a().m3260A(null, C0733i0.f3046E0) && mo3096f().m3794X(231100000, true)) ? 35 : 0;
    }

    /* renamed from: t */
    public final int m3286t(String str) {
        return m3283q(str, C0733i0.f3123q);
    }

    /* renamed from: u */
    public final long m3287u(String str, C0793m4<Long> c0793m4) {
        if (str != null) {
            String mo3168b = this.f3006d.mo3168b(str, c0793m4.m3608b());
            if (!TextUtils.isEmpty(mo3168b)) {
                try {
                    return c0793m4.m3607a(Long.valueOf(Long.parseLong(mo3168b))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return c0793m4.m3607a(null).longValue();
    }

    /* renamed from: v */
    public final long m3288v(String str) {
        return m3287u(str, C0733i0.f3095c);
    }

    /* renamed from: w */
    public final String m3289w(String str, C0793m4<String> c0793m4) {
        return c0793m4.m3607a(str == null ? null : this.f3006d.mo3168b(str, c0793m4.m3608b()));
    }

    /* renamed from: x */
    public final Boolean m3290x(String str) {
        C2394s.m9613f(str);
        Bundle m3274Q = m3274Q();
        if (m3274Q == null) {
            zzj().m3914B().m3995a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (m3274Q.containsKey(str)) {
            return Boolean.valueOf(m3274Q.getBoolean(str));
        }
        return null;
    }

    /* renamed from: y */
    public final boolean m3291y(String str, C0793m4<Boolean> c0793m4) {
        return m3260A(str, c0793m4);
    }

    /* renamed from: z */
    public final String m3292z(String str) {
        return m3289w(str, C0733i0.f3063N);
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
