package p034c7;

import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p108h6.C2394s;
import p207o6.InterfaceC3935d;
import p285u.C4771a;

/* renamed from: c7.b0 */
/* loaded from: classes.dex */
public final class C0633b0 extends C0695f4 {

    /* renamed from: b */
    public final Map<String, Long> f2778b;

    /* renamed from: c */
    public final Map<String, Integer> f2779c;

    /* renamed from: d */
    public long f2780d;

    public C0633b0(C0767k6 c0767k6) {
        super(c0767k6);
        this.f2779c = new C4771a();
        this.f2778b = new C4771a();
    }

    /* renamed from: t */
    public static /* synthetic */ void m3090t(C0633b0 c0633b0, String str, long j10) {
        c0633b0.mo3099i();
        C2394s.m9613f(str);
        if (c0633b0.f2779c.isEmpty()) {
            c0633b0.f2780d = j10;
        }
        Integer num = c0633b0.f2779c.get(str);
        if (num != null) {
            c0633b0.f2779c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (c0633b0.f2779c.size() >= 100) {
            c0633b0.zzj().m3919G().m3995a("Too many ads visible");
        } else {
            c0633b0.f2779c.put(str, 1);
            c0633b0.f2778b.put(str, Long.valueOf(j10));
        }
    }

    /* renamed from: x */
    public static /* synthetic */ void m3091x(C0633b0 c0633b0, String str, long j10) {
        c0633b0.mo3099i();
        C2394s.m9613f(str);
        Integer num = c0633b0.f2779c.get(str);
        if (num == null) {
            c0633b0.zzj().m3914B().m3996b("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        C0854q9 m3724x = c0633b0.mo3104n().m3724x(false);
        int intValue = num.intValue() - 1;
        if (intValue != 0) {
            c0633b0.f2779c.put(str, Integer.valueOf(intValue));
            return;
        }
        c0633b0.f2779c.remove(str);
        Long l10 = c0633b0.f2778b.get(str);
        if (l10 == null) {
            c0633b0.zzj().m3914B().m3995a("First ad unit exposure time was never set");
        } else {
            long longValue = j10 - l10.longValue();
            c0633b0.f2778b.remove(str);
            c0633b0.m3110v(str, longValue, m3724x);
        }
        if (c0633b0.f2779c.isEmpty()) {
            long j11 = c0633b0.f2780d;
            if (j11 == 0) {
                c0633b0.zzj().m3914B().m3995a("First ad exposure time was never set");
            } else {
                c0633b0.m3108r(j10 - j11, m3724x);
                c0633b0.f2780d = 0L;
            }
        }
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

    /* renamed from: q */
    public final void m3107q(long j10) {
        C0854q9 m3724x = mo3104n().m3724x(false);
        for (String str : this.f2778b.keySet()) {
            m3110v(str, j10 - this.f2778b.get(str).longValue(), m3724x);
        }
        if (!this.f2778b.isEmpty()) {
            m3108r(j10 - this.f2780d, m3724x);
        }
        m3111w(j10);
    }

    /* renamed from: r */
    public final void m3108r(long j10, C0854q9 c0854q9) {
        if (c0854q9 == null) {
            zzj().m3918F().m3995a("Not logging ad exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().m3918F().m3996b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j10);
        C0857qc.m3741L(c0854q9, bundle, true);
        mo3103m().m3989x0("am", "_xa", bundle);
    }

    /* renamed from: u */
    public final void m3109u(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().m3914B().m3995a("Ad unit id must be a non-empty string");
        } else {
            zzl().m3152y(new RunnableC0617a(this, str, j10));
        }
    }

    /* renamed from: v */
    public final void m3110v(String str, long j10, C0854q9 c0854q9) {
        if (c0854q9 == null) {
            zzj().m3918F().m3995a("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j10 < 1000) {
            zzj().m3918F().m3996b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j10);
        C0857qc.m3741L(c0854q9, bundle, true);
        mo3103m().m3989x0("am", "_xu", bundle);
    }

    /* renamed from: w */
    public final void m3111w(long j10) {
        Iterator<String> it = this.f2778b.keySet().iterator();
        while (it.hasNext()) {
            this.f2778b.put(it.next(), Long.valueOf(j10));
        }
        if (this.f2778b.isEmpty()) {
            return;
        }
        this.f2780d = j10;
    }

    /* renamed from: y */
    public final void m3112y(String str, long j10) {
        if (str == null || str.length() == 0) {
            zzj().m3914B().m3995a("Ad unit id must be a non-empty string");
        } else {
            zzl().m3152y(new RunnableC0665d2(this, str, j10));
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
