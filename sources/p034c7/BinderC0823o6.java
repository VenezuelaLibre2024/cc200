package p034c7;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzad;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p064e6.C1683j;
import p064e6.C1685k;
import p108h6.C2394s;
import p207o6.C3947p;

/* renamed from: c7.o6 */
/* loaded from: classes.dex */
public final class BinderC0823o6 extends AbstractBinderC0807n4 {

    /* renamed from: a */
    public final C0968yb f3394a;

    /* renamed from: b */
    public Boolean f3395b;

    /* renamed from: c */
    public String f3396c;

    public BinderC0823o6(C0968yb c0968yb) {
        this(c0968yb, null);
    }

    public BinderC0823o6(C0968yb c0968yb, String str) {
        C2394s.m9619l(c0968yb);
        this.f3394a = c0968yb;
        this.f3396c = null;
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: C0 */
    public final void mo3653C0(C0690f c0690f, C0871rc c0871rc) {
        C2394s.m9619l(c0690f);
        C2394s.m9619l(c0690f.f2909j);
        m3678O1(c0871rc, false);
        C0690f c0690f2 = new C0690f(c0690f);
        c0690f2.f2907h = c0871rc.f3534h;
        m3681e(new RunnableC0865r6(this, c0690f2, c0871rc));
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: E1 */
    public final List<C0787lc> mo3654E1(C0871rc c0871rc, boolean z10) {
        m3678O1(c0871rc, false);
        String str = c0871rc.f3534h;
        C2394s.m9619l(str);
        try {
            List<C0815nc> list = (List) this.f3394a.zzl().m3148r(new CallableC0698f7(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C0815nc c0815nc : list) {
                if (z10 || !C0857qc.m3735C0(c0815nc.f3379c)) {
                    arrayList.add(new C0787lc(c0815nc));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f3394a.zzj().m3914B().m3997c("Failed to get user properties. appId", C0919v4.m3906q(c0871rc.f3534h), e10);
            return null;
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: M0 */
    public final void mo3655M0(C0871rc c0871rc) {
        m3678O1(c0871rc, false);
        m3681e(new RunnableC0851q6(this, c0871rc));
    }

    /* renamed from: M1 */
    public final void m3676M1(String str, boolean z10) {
        boolean z11;
        if (TextUtils.isEmpty(str)) {
            this.f3394a.zzj().m3914B().m3995a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z10) {
            try {
                if (this.f3395b == null) {
                    if (!"com.google.android.gms".equals(this.f3396c) && !C3947p.m14967a(this.f3394a.zza(), Binder.getCallingUid()) && !C1685k.m6736a(this.f3394a.zza()).m6740c(Binder.getCallingUid())) {
                        z11 = false;
                        this.f3395b = Boolean.valueOf(z11);
                    }
                    z11 = true;
                    this.f3395b = Boolean.valueOf(z11);
                }
                if (this.f3395b.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                this.f3394a.zzj().m3914B().m3996b("Measurement Service called with invalid calling package. appId", C0919v4.m3906q(str));
                throw e10;
            }
        }
        if (this.f3396c == null && C1683j.m6733k(this.f3394a.zza(), Binder.getCallingUid(), str)) {
            this.f3396c = str;
        }
        if (str.equals(this.f3396c)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    /* renamed from: N1 */
    public final C0705g0 m3677N1(C0705g0 c0705g0, C0871rc c0871rc) {
        C0618a0 c0618a0;
        boolean z10 = false;
        if ("_cmp".equals(c0705g0.f2943h) && (c0618a0 = c0705g0.f2944i) != null && c0618a0.m3077I() != 0) {
            String m3082O = c0705g0.f2944i.m3082O("_cis");
            if ("referrer broadcast".equals(m3082O) || "referrer API".equals(m3082O)) {
                z10 = true;
            }
        }
        if (!z10) {
            return c0705g0;
        }
        this.f3394a.zzj().m3917E().m3996b("Event has been filtered ", c0705g0.toString());
        return new C0705g0("_cmpx", c0705g0.f2944i, c0705g0.f2945j, c0705g0.f2946k);
    }

    /* renamed from: O1 */
    public final void m3678O1(C0871rc c0871rc, boolean z10) {
        C2394s.m9619l(c0871rc);
        C2394s.m9613f(c0871rc.f3534h);
        m3676M1(c0871rc.f3534h, false);
        this.f3394a.m4095j0().m3797f0(c0871rc.f3535i, c0871rc.f3550x);
    }

    /* renamed from: P1 */
    public final void m3679P1(C0705g0 c0705g0, C0871rc c0871rc) {
        C0947x4 m3918F;
        String str;
        String str2;
        if (!this.f3394a.m4086d0().m3882R(c0871rc.f3534h)) {
            m3680Q1(c0705g0, c0871rc);
            return;
        }
        this.f3394a.zzj().m3918F().m3996b("EES config found for", c0871rc.f3534h);
        C0906u5 m4086d0 = this.f3394a.m4086d0();
        String str3 = c0871rc.f3534h;
        zzb zzbVar = TextUtils.isEmpty(str3) ? null : m4086d0.f3621j.get(str3);
        if (zzbVar == null) {
            m3918F = this.f3394a.zzj().m3918F();
            str = c0871rc.f3534h;
            str2 = "EES not loaded for";
        } else {
            boolean z10 = false;
            try {
                Map<String, Object> m3460L = this.f3394a.m4093i0().m3460L(c0705g0.f2944i.m3079L(), true);
                String m3683a = C0824o7.m3683a(c0705g0.f2943h);
                if (m3683a == null) {
                    m3683a = c0705g0.f2943h;
                }
                z10 = zzbVar.zza(new zzad(m3683a, c0705g0.f2946k, m3460L));
            } catch (zzc unused) {
                this.f3394a.zzj().m3914B().m3997c("EES error. appId, eventName", c0871rc.f3535i, c0705g0.f2943h);
            }
            if (z10) {
                if (zzbVar.zzd()) {
                    this.f3394a.zzj().m3918F().m3996b("EES edited event", c0705g0.f2943h);
                    c0705g0 = this.f3394a.m4093i0().m3475z(zzbVar.zza().zzb());
                }
                m3680Q1(c0705g0, c0871rc);
                if (zzbVar.zzc()) {
                    for (zzad zzadVar : zzbVar.zza().zzc()) {
                        this.f3394a.zzj().m3918F().m3996b("EES logging created event", zzadVar.zzb());
                        m3680Q1(this.f3394a.m4093i0().m3475z(zzadVar), c0871rc);
                    }
                    return;
                }
                return;
            }
            m3918F = this.f3394a.zzj().m3918F();
            str = c0705g0.f2943h;
            str2 = "EES was not applied to event";
        }
        m3918F.m3996b(str2, str);
        m3680Q1(c0705g0, c0871rc);
    }

    /* renamed from: Q1 */
    public final void m3680Q1(C0705g0 c0705g0, C0871rc c0871rc) {
        this.f3394a.m4097k0();
        this.f3394a.m4098l(c0705g0, c0871rc);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: Y */
    public final void mo3656Y(C0871rc c0871rc) {
        m3678O1(c0871rc, false);
        m3681e(new RunnableC0837p6(this, c0871rc));
    }

    /* renamed from: e */
    public final void m3681e(Runnable runnable) {
        C2394s.m9619l(runnable);
        if (this.f3394a.zzl().m3145E()) {
            runnable.run();
        } else {
            this.f3394a.zzl().m3152y(runnable);
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: e0 */
    public final List<C0690f> mo3657e0(String str, String str2, C0871rc c0871rc) {
        m3678O1(c0871rc, false);
        String str3 = c0871rc.f3534h;
        C2394s.m9619l(str3);
        try {
            return (List) this.f3394a.zzl().m3148r(new CallableC0921v6(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f3394a.zzj().m3914B().m3996b("Failed to get conditional user properties", e10);
            return Collections.emptyList();
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: f0 */
    public final void mo3658f0(C0705g0 c0705g0, String str, String str2) {
        C2394s.m9619l(c0705g0);
        C2394s.m9613f(str);
        m3676M1(str, true);
        m3681e(new RunnableC0640b7(this, c0705g0, str));
    }

    /* renamed from: g */
    public final /* synthetic */ void m3682g(String str, Bundle bundle) {
        this.f3394a.m4080a0().m3586c0(str, bundle);
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: g0 */
    public final void mo3659g0(C0690f c0690f) {
        C2394s.m9619l(c0690f);
        C2394s.m9619l(c0690f.f2909j);
        C2394s.m9613f(c0690f.f2907h);
        m3676M1(c0690f.f2907h, true);
        m3681e(new RunnableC0907u6(this, new C0690f(c0690f)));
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: i */
    public final C0760k mo3660i(C0871rc c0871rc) {
        m3678O1(c0871rc, false);
        C2394s.m9613f(c0871rc.f3534h);
        if (!zzns.zza()) {
            return new C0760k(null);
        }
        try {
            return (C0760k) this.f3394a.zzl().m3151w(new CallableC0977z6(this, c0871rc)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            this.f3394a.zzj().m3914B().m3997c("Failed to get consent. appId", C0919v4.m3906q(c0871rc.f3534h), e10);
            return new C0760k(null);
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: i0 */
    public final void mo3661i0(long j10, String str, String str2, String str3) {
        m3681e(new RunnableC0879s6(this, str2, str3, str, j10));
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: i1 */
    public final void mo3662i1(C0705g0 c0705g0, C0871rc c0871rc) {
        C2394s.m9619l(c0705g0);
        m3678O1(c0871rc, false);
        m3681e(new RunnableC0655c7(this, c0705g0, c0871rc));
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: j */
    public final List<C0856qb> mo3663j(C0871rc c0871rc, Bundle bundle) {
        m3678O1(c0871rc, false);
        C2394s.m9619l(c0871rc.f3534h);
        try {
            return (List) this.f3394a.zzl().m3148r(new CallableC0712g7(this, c0871rc, bundle)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f3394a.zzj().m3914B().m3997c("Failed to get trigger URIs. appId", C0919v4.m3906q(c0871rc.f3534h), e10);
            return Collections.emptyList();
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: k */
    public final byte[] mo3664k(C0705g0 c0705g0, String str) {
        C2394s.m9613f(str);
        C2394s.m9619l(c0705g0);
        m3676M1(str, true);
        this.f3394a.zzj().m3913A().m3996b("Log and bundle. event", this.f3394a.m4082b0().m3857c(c0705g0.f2943h));
        long mo14934c = this.f3394a.zzb().mo14934c() / 1000000;
        try {
            byte[] bArr = (byte[]) this.f3394a.zzl().m3151w(new CallableC0684e7(this, c0705g0, str)).get();
            if (bArr == null) {
                this.f3394a.zzj().m3914B().m3996b("Log and bundle returned null. appId", C0919v4.m3906q(str));
                bArr = new byte[0];
            }
            this.f3394a.zzj().m3913A().m3998d("Log and bundle processed. event, size, time_ms", this.f3394a.m4082b0().m3857c(c0705g0.f2943h), Integer.valueOf(bArr.length), Long.valueOf((this.f3394a.zzb().mo14934c() / 1000000) - mo14934c));
            return bArr;
        } catch (InterruptedException | ExecutionException e10) {
            this.f3394a.zzj().m3914B().m3998d("Failed to log and bundle. appId, event, error", C0919v4.m3906q(str), this.f3394a.m4082b0().m3857c(c0705g0.f2943h), e10);
            return null;
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: l1 */
    public final void mo3665l1(Bundle bundle, C0871rc c0871rc) {
        m3678O1(c0871rc, false);
        String str = c0871rc.f3534h;
        C2394s.m9619l(str);
        m3681e(new Runnable() { // from class: c7.n6

            /* renamed from: i */
            public /* synthetic */ String f3351i;

            /* renamed from: j */
            public /* synthetic */ Bundle f3352j;

            public /* synthetic */ RunnableC0809n6(String str2, Bundle bundle2) {
                r2 = str2;
                r3 = bundle2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BinderC0823o6.this.m3682g(r2, r3);
            }
        });
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: m0 */
    public final List<C0690f> mo3666m0(String str, String str2, String str3) {
        m3676M1(str, true);
        try {
            return (List) this.f3394a.zzl().m3148r(new CallableC0963y6(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            this.f3394a.zzj().m3914B().m3996b("Failed to get conditional user properties as", e10);
            return Collections.emptyList();
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: p0 */
    public final void mo3667p0(C0871rc c0871rc) {
        C2394s.m9613f(c0871rc.f3534h);
        m3676M1(c0871rc.f3534h, false);
        m3681e(new RunnableC0949x6(this, c0871rc));
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: q */
    public final List<C0787lc> mo3668q(String str, String str2, boolean z10, C0871rc c0871rc) {
        m3678O1(c0871rc, false);
        String str3 = c0871rc.f3534h;
        C2394s.m9619l(str3);
        try {
            List<C0815nc> list = (List) this.f3394a.zzl().m3148r(new CallableC0893t6(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C0815nc c0815nc : list) {
                if (z10 || !C0857qc.m3735C0(c0815nc.f3379c)) {
                    arrayList.add(new C0787lc(c0815nc));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f3394a.zzj().m3914B().m3997c("Failed to query user properties. appId", C0919v4.m3906q(c0871rc.f3534h), e10);
            return Collections.emptyList();
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: q0 */
    public final void mo3669q0(C0871rc c0871rc) {
        C2394s.m9613f(c0871rc.f3534h);
        C2394s.m9619l(c0871rc.f3524C);
        RunnableC0625a7 runnableC0625a7 = new RunnableC0625a7(this, c0871rc);
        C2394s.m9619l(runnableC0625a7);
        if (this.f3394a.zzl().m3145E()) {
            runnableC0625a7.run();
        } else {
            this.f3394a.zzl().m3144B(runnableC0625a7);
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: v */
    public final List<C0787lc> mo3670v(String str, String str2, String str3, boolean z10) {
        m3676M1(str, true);
        try {
            List<C0815nc> list = (List) this.f3394a.zzl().m3148r(new CallableC0935w6(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (C0815nc c0815nc : list) {
                if (z10 || !C0857qc.m3735C0(c0815nc.f3379c)) {
                    arrayList.add(new C0787lc(c0815nc));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e10) {
            this.f3394a.zzj().m3914B().m3997c("Failed to get user properties as. appId", C0919v4.m3906q(str), e10);
            return Collections.emptyList();
        }
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: x1 */
    public final void mo3671x1(C0787lc c0787lc, C0871rc c0871rc) {
        C2394s.m9619l(c0787lc);
        m3678O1(c0871rc, false);
        m3681e(new RunnableC0670d7(this, c0787lc, c0871rc));
    }

    @Override // p034c7.InterfaceC0821o4
    /* renamed from: y */
    public final String mo3672y(C0871rc c0871rc) {
        m3678O1(c0871rc, false);
        return this.f3394a.m4067N(c0871rc);
    }
}
