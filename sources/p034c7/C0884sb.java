package p034c7;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzce;
import p207o6.InterfaceC3935d;

/* renamed from: c7.sb */
/* loaded from: classes.dex */
public final class C0884sb extends AbstractC0954xb {

    /* renamed from: d */
    public final AlarmManager f3580d;

    /* renamed from: e */
    public AbstractC0900u f3581e;

    /* renamed from: f */
    public Integer f3582f;

    public C0884sb(C0968yb c0968yb) {
        super(c0968yb);
        this.f3580d = (AlarmManager) zza().getSystemService("alarm");
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
        AlarmManager alarmManager = this.f3580d;
        if (alarmManager != null) {
            alarmManager.cancel(m3846w());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        m3848y();
        return false;
    }

    /* renamed from: t */
    public final void m3843t(long j10) {
        m4002p();
        Context zza = zza();
        if (!C0857qc.m3746Y(zza)) {
            zzj().m3913A().m3995a("Receiver not registered/enabled");
        }
        if (!C0857qc.m3747Z(zza, false)) {
            zzj().m3913A().m3995a("Service not registered/enabled");
        }
        m3844u();
        zzj().m3918F().m3996b("Scheduling upload, millis", Long.valueOf(j10));
        long mo14933b = zzb().mo14933b() + j10;
        if (j10 < Math.max(0L, C0733i0.f3141z.m3607a(null).longValue()) && !m3847x().m3852e()) {
            m3847x().m3851b(j10);
        }
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f3580d;
            if (alarmManager != null) {
                alarmManager.setInexactRepeating(2, mo14933b, Math.max(C0733i0.f3131u.m3607a(null).longValue(), j10), m3846w());
                return;
            }
            return;
        }
        Context zza2 = zza();
        ComponentName componentName = new ComponentName(zza2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int m3845v = m3845v();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        zzce.zza(zza2, new JobInfo.Builder(m3845v, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    /* renamed from: u */
    public final void m3844u() {
        m4002p();
        zzj().m3918F().m3995a("Unscheduling upload");
        AlarmManager alarmManager = this.f3580d;
        if (alarmManager != null) {
            alarmManager.cancel(m3846w());
        }
        m3847x().m3850a();
        if (Build.VERSION.SDK_INT >= 24) {
            m3848y();
        }
    }

    /* renamed from: v */
    public final int m3845v() {
        if (this.f3582f == null) {
            this.f3582f = Integer.valueOf(("measurement" + zza().getPackageName()).hashCode());
        }
        return this.f3582f.intValue();
    }

    /* renamed from: w */
    public final PendingIntent m3846w() {
        Context zza = zza();
        return zzcc.zza(zza, 0, new Intent().setClassName(zza, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzcc.zza);
    }

    /* renamed from: x */
    public final AbstractC0900u m3847x() {
        if (this.f3581e == null) {
            this.f3581e = new C0926vb(this, this.f3647b.m4087e0());
        }
        return this.f3581e;
    }

    @TargetApi(24)
    /* renamed from: y */
    public final void m3848y() {
        JobScheduler jobScheduler = (JobScheduler) zza().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m3845v());
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
