package p034c7;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import p034c7.InterfaceC0674db;
import p108h6.C2394s;

/* renamed from: c7.za */
/* loaded from: classes.dex */
public final class C0981za<T extends Context & InterfaceC0674db> {

    /* renamed from: a */
    public final T f3852a;

    public C0981za(T t10) {
        C2394s.m9619l(t10);
        this.f3852a = t10;
    }

    /* renamed from: a */
    public final int m4126a(final Intent intent, int i10, final int i11) {
        final C0919v4 zzj = C0767k6.m3480a(this.f3852a, null, null).zzj();
        if (intent == null) {
            zzj.m3919G().m3995a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzj.m3918F().m3997c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m4131f(new Runnable() { // from class: c7.bb
                @Override // java.lang.Runnable
                public final void run() {
                    C0981za.this.m4129d(i11, zzj, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m4127b(Intent intent) {
        if (intent == null) {
            m4135j().m3914B().m3995a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC0823o6(C0968yb.m4050g(this.f3852a));
        }
        m4135j().m3919G().m3996b("onBind received unknown action", action);
        return null;
    }

    /* renamed from: c */
    public final void m4128c() {
        C0767k6.m3480a(this.f3852a, null, null).zzj().m3918F().m3995a("Local AppMeasurementService is starting up");
    }

    /* renamed from: d */
    public final /* synthetic */ void m4129d(int i10, C0919v4 c0919v4, Intent intent) {
        if (this.f3852a.zza(i10)) {
            c0919v4.m3918F().m3996b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i10));
            m4135j().m3918F().m3995a("Completed wakeful intent.");
            this.f3852a.mo3153a(intent);
        }
    }

    /* renamed from: e */
    public final /* synthetic */ void m4130e(C0919v4 c0919v4, JobParameters jobParameters) {
        c0919v4.m3918F().m3995a("AppMeasurementJobService processed last upload request.");
        this.f3852a.mo3154b(jobParameters, false);
    }

    /* renamed from: f */
    public final void m4131f(Runnable runnable) {
        C0968yb m4050g = C0968yb.m4050g(this.f3852a);
        m4050g.zzl().m3152y(new RunnableC0688eb(this, m4050g, runnable));
    }

    @TargetApi(24)
    /* renamed from: g */
    public final boolean m4132g(final JobParameters jobParameters) {
        final C0919v4 zzj = C0767k6.m3480a(this.f3852a, null, null).zzj();
        String string = jobParameters.getExtras().getString("action");
        zzj.m3918F().m3996b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        m4131f(new Runnable() { // from class: c7.cb
            @Override // java.lang.Runnable
            public final void run() {
                C0981za.this.m4130e(zzj, jobParameters);
            }
        });
        return true;
    }

    /* renamed from: h */
    public final void m4133h() {
        C0767k6.m3480a(this.f3852a, null, null).zzj().m3918F().m3995a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: i */
    public final void m4134i(Intent intent) {
        if (intent == null) {
            m4135j().m3914B().m3995a("onRebind called with null intent");
        } else {
            m4135j().m3918F().m3996b("onRebind called. action", intent.getAction());
        }
    }

    /* renamed from: j */
    public final C0919v4 m4135j() {
        return C0767k6.m3480a(this.f3852a, null, null).zzj();
    }

    /* renamed from: k */
    public final boolean m4136k(Intent intent) {
        if (intent == null) {
            m4135j().m3914B().m3995a("onUnbind called with null intent");
            return true;
        }
        m4135j().m3918F().m3996b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
