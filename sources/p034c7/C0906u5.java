package p034c7;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzm;
import com.google.android.gms.internal.measurement.zzr;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.internal.measurement.zzx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import p034c7.C0810n7;
import p108h6.C2394s;
import p207o6.InterfaceC3935d;
import p285u.C4771a;
import p285u.C4775e;

/* renamed from: c7.u5 */
/* loaded from: classes.dex */
public final class C0906u5 extends AbstractC0954xb implements InterfaceC0746j {

    /* renamed from: d */
    public final Map<String, Map<String, String>> f3615d;

    /* renamed from: e */
    public final Map<String, Set<String>> f3616e;

    /* renamed from: f */
    public final Map<String, Map<String, Boolean>> f3617f;

    /* renamed from: g */
    public final Map<String, Map<String, Boolean>> f3618g;

    /* renamed from: h */
    public final Map<String, zzfc.zzd> f3619h;

    /* renamed from: i */
    public final Map<String, Map<String, Integer>> f3620i;

    /* renamed from: j */
    public final C4775e<String, zzb> f3621j;

    /* renamed from: k */
    public final zzv f3622k;

    /* renamed from: l */
    public final Map<String, String> f3623l;

    /* renamed from: m */
    public final Map<String, String> f3624m;

    /* renamed from: n */
    public final Map<String, String> f3625n;

    public C0906u5(C0968yb c0968yb) {
        super(c0968yb);
        this.f3615d = new C4771a();
        this.f3616e = new C4771a();
        this.f3617f = new C4771a();
        this.f3618g = new C4771a();
        this.f3619h = new C4771a();
        this.f3623l = new C4771a();
        this.f3624m = new C4771a();
        this.f3625n = new C4771a();
        this.f3620i = new C4771a();
        this.f3621j = new C0624a6(this, 20);
        this.f3622k = new C0976z5(this);
    }

    /* renamed from: u */
    public static C0810n7.a m3861u(zzfc.zza.zze zzeVar) {
        int i10 = C0639b6.f2786b[zzeVar.ordinal()];
        if (i10 == 1) {
            return C0810n7.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return C0810n7.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return C0810n7.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return C0810n7.a.AD_PERSONALIZATION;
    }

    /* renamed from: w */
    public static /* synthetic */ zzb m3862w(C0906u5 c0906u5, String str) {
        c0906u5.m4002p();
        C2394s.m9613f(str);
        if (!c0906u5.m3882R(str)) {
            return null;
        }
        if (!c0906u5.f3619h.containsKey(str) || c0906u5.f3619h.get(str) == null) {
            c0906u5.m3892b0(str);
        } else {
            c0906u5.m3866B(str, c0906u5.f3619h.get(str));
        }
        return c0906u5.f3621j.snapshot().get(str);
    }

    /* renamed from: z */
    public static Map<String, String> m3864z(zzfc.zzd zzdVar) {
        C4771a c4771a = new C4771a();
        if (zzdVar != null) {
            for (zzfc.zzg zzgVar : zzdVar.zzn()) {
                c4771a.put(zzgVar.zzb(), zzgVar.zzc());
            }
        }
        return c4771a;
    }

    /* renamed from: A */
    public final void m3865A(String str, zzfc.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        C4771a c4771a = new C4771a();
        C4771a c4771a2 = new C4771a();
        C4771a c4771a3 = new C4771a();
        if (zzaVar != null) {
            Iterator<zzfc.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i10 = 0; i10 < zzaVar.zza(); i10++) {
                zzfc.zzc.zza zzby = zzaVar.zza(i10).zzby();
                if (zzby.zzb().isEmpty()) {
                    zzj().m3919G().m3995a("EventConfig contained null event name");
                } else {
                    String zzb = zzby.zzb();
                    String m3684b = C0824o7.m3684b(zzby.zzb());
                    if (!TextUtils.isEmpty(m3684b)) {
                        zzby = zzby.zza(m3684b);
                        zzaVar.zza(i10, zzby);
                    }
                    if (zzby.zze() && zzby.zzc()) {
                        c4771a.put(zzb, Boolean.TRUE);
                    }
                    if (zzby.zzf() && zzby.zzd()) {
                        c4771a2.put(zzby.zzb(), Boolean.TRUE);
                    }
                    if (zzby.zzg()) {
                        if (zzby.zza() < 2 || zzby.zza() > 65535) {
                            zzj().m3919G().m3997c("Invalid sampling rate. Event name, sample rate", zzby.zzb(), Integer.valueOf(zzby.zza()));
                        } else {
                            c4771a3.put(zzby.zzb(), Integer.valueOf(zzby.zza()));
                        }
                    }
                }
            }
        }
        this.f3616e.put(str, hashSet);
        this.f3617f.put(str, c4771a);
        this.f3618g.put(str, c4771a2);
        this.f3620i.put(str, c4771a3);
    }

    /* renamed from: B */
    public final void m3866B(final String str, zzfc.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.f3621j.remove(str);
            return;
        }
        zzj().m3918F().m3996b("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzfp.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            zzb zzbVar = new zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: c7.v5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzm("internal.remoteConfig", new C0654c6(C0906u5.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: c7.y5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C0906u5 c0906u5 = C0906u5.this;
                    final String str2 = str;
                    return new zzx("internal.appMetadata", new Callable() { // from class: c7.w5
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C0906u5 c0906u52 = C0906u5.this;
                            String str3 = str2;
                            C0710g5 m3604y0 = c0906u52.mo3122l().m3604y0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 84002L);
                            if (m3604y0 != null) {
                                String m3209h = m3604y0.m3209h();
                                if (m3209h != null) {
                                    hashMap.put("app_version", m3209h);
                                }
                                hashMap.put("app_version_int", Long.valueOf(m3604y0.m3169A()));
                                hashMap.put("dynamite_version", Long.valueOf(m3604y0.m3204e0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: c7.x5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzr(C0906u5.this.f3622k);
                }
            });
            zzbVar.zza(zzcVar);
            this.f3621j.put(str, zzbVar);
            zzj().m3918F().m3997c("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzfp.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().m3918F().m3996b("EES program activity", it.next().zzb());
            }
        } catch (zzc unused) {
            zzj().m3914B().m3996b("Failed to load EES program. appId", str);
        }
    }

    /* renamed from: C */
    public final boolean m3867C(String str, byte[] bArr, String str2, String str3) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        zzfc.zzd.zza zzby = m3895x(str, bArr).zzby();
        if (zzby == null) {
            return false;
        }
        m3865A(str, zzby);
        m3866B(str, (zzfc.zzd) ((zzjf) zzby.zzah()));
        this.f3619h.put(str, (zzfc.zzd) ((zzjf) zzby.zzah()));
        this.f3623l.put(str, zzby.zzc());
        this.f3624m.put(str, str2);
        this.f3625n.put(str, str3);
        this.f3615d.put(str, m3864z((zzfc.zzd) ((zzjf) zzby.zzah())));
        mo3122l().m3578U(str, new ArrayList(zzby.zzd()));
        try {
            zzby.zzb();
            bArr = ((zzfc.zzd) ((zzjf) zzby.zzah())).zzbv();
        } catch (RuntimeException e10) {
            zzj().m3919G().m3997c("Unable to serialize reduced-size config. Storing full config instead. appId", C0919v4.m3906q(str), e10);
        }
        C0788m mo3122l = mo3122l();
        C2394s.m9613f(str);
        mo3122l.mo3099i();
        mo3122l.m4002p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (mo3122l.m3599w().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                mo3122l.zzj().m3914B().m3996b("Failed to update remote config (got 0). appId", C0919v4.m3906q(str));
            }
        } catch (SQLiteException e11) {
            mo3122l.zzj().m3914B().m3997c("Error storing remote config. appId", C0919v4.m3906q(str), e11);
        }
        this.f3619h.put(str, (zzfc.zzd) ((zzjf) zzby.zzah()));
        return true;
    }

    /* renamed from: D */
    public final int m3868D(String str, String str2) {
        Integer num;
        mo3099i();
        m3892b0(str);
        Map<String, Integer> map = this.f3620i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* renamed from: E */
    public final zzfc.zza m3869E(String str) {
        mo3099i();
        m3892b0(str);
        zzfc.zzd m3871G = m3871G(str);
        if (m3871G == null || !m3871G.zzp()) {
            return null;
        }
        return m3871G.zzd();
    }

    /* renamed from: F */
    public final boolean m3870F(String str, C0810n7.a aVar) {
        mo3099i();
        m3892b0(str);
        zzfc.zza m3869E = m3869E(str);
        if (m3869E == null) {
            return false;
        }
        Iterator<zzfc.zza.zzb> it = m3869E.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfc.zza.zzb next = it.next();
            if (aVar == m3861u(next.zzc())) {
                if (next.zzb() == zzfc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: G */
    public final zzfc.zzd m3871G(String str) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        m3892b0(str);
        return this.f3619h.get(str);
    }

    /* renamed from: H */
    public final boolean m3872H(String str, String str2) {
        Boolean bool;
        mo3099i();
        m3892b0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f3618g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: I */
    public final String m3873I(String str) {
        mo3099i();
        return this.f3625n.get(str);
    }

    /* renamed from: J */
    public final boolean m3874J(String str, String str2) {
        Boolean bool;
        mo3099i();
        m3892b0(str);
        if (m3883S(str) && C0857qc.m3735C0(str2)) {
            return true;
        }
        if (m3885U(str) && C0857qc.m3737E0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f3617f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* renamed from: K */
    public final String m3875K(String str) {
        mo3099i();
        return this.f3624m.get(str);
    }

    /* renamed from: L */
    public final String m3876L(String str) {
        mo3099i();
        m3892b0(str);
        return this.f3623l.get(str);
    }

    /* renamed from: M */
    public final Set<String> m3877M(String str) {
        mo3099i();
        m3892b0(str);
        return this.f3616e.get(str);
    }

    /* renamed from: N */
    public final SortedSet<String> m3878N(String str) {
        mo3099i();
        m3892b0(str);
        TreeSet treeSet = new TreeSet();
        zzfc.zza m3869E = m3869E(str);
        if (m3869E == null) {
            return treeSet;
        }
        Iterator<zzfc.zza.zzf> it = m3869E.zzc().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().zzb());
        }
        return treeSet;
    }

    /* renamed from: O */
    public final void m3879O(String str) {
        mo3099i();
        this.f3624m.put(str, null);
    }

    /* renamed from: P */
    public final void m3880P(String str) {
        mo3099i();
        this.f3619h.remove(str);
    }

    /* renamed from: Q */
    public final boolean m3881Q(String str) {
        mo3099i();
        zzfc.zzd m3871G = m3871G(str);
        if (m3871G == null) {
            return false;
        }
        return m3871G.zzo();
    }

    /* renamed from: R */
    public final boolean m3882R(String str) {
        zzfc.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.f3619h.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    /* renamed from: S */
    public final boolean m3883S(String str) {
        return "1".equals(mo3168b(str, "measurement.upload.blacklist_internal"));
    }

    /* renamed from: T */
    public final boolean m3884T(String str) {
        mo3099i();
        m3892b0(str);
        zzfc.zza m3869E = m3869E(str);
        return m3869E == null || !m3869E.zzg() || m3869E.zzf();
    }

    /* renamed from: U */
    public final boolean m3885U(String str) {
        return "1".equals(mo3168b(str, "measurement.upload.blacklist_public"));
    }

    /* renamed from: V */
    public final boolean m3886V(String str) {
        mo3099i();
        m3892b0(str);
        return this.f3616e.get(str) != null && this.f3616e.get(str).contains("app_instance_id");
    }

    /* renamed from: W */
    public final boolean m3887W(String str) {
        mo3099i();
        m3892b0(str);
        if (this.f3616e.get(str) != null) {
            return this.f3616e.get(str).contains("device_model") || this.f3616e.get(str).contains("device_info");
        }
        return false;
    }

    /* renamed from: X */
    public final boolean m3888X(String str) {
        mo3099i();
        m3892b0(str);
        return this.f3616e.get(str) != null && this.f3616e.get(str).contains("enhanced_user_id");
    }

    /* renamed from: Y */
    public final boolean m3889Y(String str) {
        mo3099i();
        m3892b0(str);
        return this.f3616e.get(str) != null && this.f3616e.get(str).contains("google_signals");
    }

    /* renamed from: Z */
    public final boolean m3890Z(String str) {
        mo3099i();
        m3892b0(str);
        if (this.f3616e.get(str) != null) {
            return this.f3616e.get(str).contains("os_version") || this.f3616e.get(str).contains("device_info");
        }
        return false;
    }

    @Override // p034c7.C0754j7
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0718h mo3092a() {
        return super.mo3092a();
    }

    /* renamed from: a0 */
    public final boolean m3891a0(String str) {
        mo3099i();
        m3892b0(str);
        return this.f3616e.get(str) != null && this.f3616e.get(str).contains("user_id");
    }

    @Override // p034c7.InterfaceC0746j
    /* renamed from: b */
    public final String mo3168b(String str, String str2) {
        mo3099i();
        m3892b0(str);
        Map<String, String> map = this.f3615d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* renamed from: b0 */
    public final void m3892b0(String str) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        if (this.f3619h.get(str) == null) {
            C0816o m3606z0 = mo3122l().m3606z0(str);
            if (m3606z0 != null) {
                zzfc.zzd.zza zzby = m3895x(str, m3606z0.f3382a).zzby();
                m3865A(str, zzby);
                this.f3615d.put(str, m3864z((zzfc.zzd) ((zzjf) zzby.zzah())));
                this.f3619h.put(str, (zzfc.zzd) ((zzjf) zzby.zzah()));
                m3866B(str, (zzfc.zzd) ((zzjf) zzby.zzah()));
                this.f3623l.put(str, zzby.zzc());
                this.f3624m.put(str, m3606z0.f3383b);
                this.f3625n.put(str, m3606z0.f3384c);
                return;
            }
            this.f3615d.put(str, null);
            this.f3617f.put(str, null);
            this.f3616e.put(str, null);
            this.f3618g.put(str, null);
            this.f3619h.put(str, null);
            this.f3623l.put(str, null);
            this.f3624m.put(str, null);
            this.f3625n.put(str, null);
            this.f3620i.put(str, null);
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

    @Override // p034c7.C0912ub
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C0745ic mo3120j() {
        return super.mo3120j();
    }

    @Override // p034c7.C0912ub
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C0955xc mo3121k() {
        return super.mo3121k();
    }

    @Override // p034c7.C0912ub
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C0788m mo3122l() {
        return super.mo3122l();
    }

    @Override // p034c7.C0912ub
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ C0906u5 mo3123m() {
        return super.mo3123m();
    }

    @Override // p034c7.C0912ub
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C0953xa mo3124n() {
        return super.mo3124n();
    }

    @Override // p034c7.C0912ub
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C0940wb mo3125o() {
        return super.mo3125o();
    }

    @Override // p034c7.AbstractC0954xb
    /* renamed from: s */
    public final boolean mo3126s() {
        return false;
    }

    /* renamed from: t */
    public final long m3893t(String str) {
        String mo3168b = mo3168b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(mo3168b)) {
            return 0L;
        }
        try {
            return Long.parseLong(mo3168b);
        } catch (NumberFormatException e10) {
            zzj().m3919G().m3997c("Unable to parse timezone offset. appId", C0919v4.m3906q(str), e10);
            return 0L;
        }
    }

    /* renamed from: v */
    public final C0810n7.a m3894v(String str, C0810n7.a aVar) {
        mo3099i();
        m3892b0(str);
        zzfc.zza m3869E = m3869E(str);
        if (m3869E == null) {
            return null;
        }
        for (zzfc.zza.zzc zzcVar : m3869E.zze()) {
            if (aVar == m3861u(zzcVar.zzc())) {
                return m3861u(zzcVar.zzb());
            }
        }
        return null;
    }

    /* renamed from: x */
    public final zzfc.zzd m3895x(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzd.zzg();
        }
        try {
            zzfc.zzd zzdVar = (zzfc.zzd) ((zzjf) ((zzfc.zzd.zza) C0745ic.m3435E(zzfc.zzd.zze(), bArr)).zzah());
            zzj().m3918F().m3997c("Parsed config. version, gmp_app_id", zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzq() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (zzjq | RuntimeException e10) {
            zzj().m3919G().m3997c("Unable to merge remote config. appId", C0919v4.m3906q(str), e10);
            return zzfc.zzd.zzg();
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
