package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import p034c7.C0981za;
import p034c7.InterfaceC0674db;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC0674db {

    /* renamed from: h */
    public C0981za<AppMeasurementJobService> f4604h;

    @Override // p034c7.InterfaceC0674db
    /* renamed from: a */
    public final void mo3153a(Intent intent) {
    }

    @Override // p034c7.InterfaceC0674db
    @TargetApi(24)
    /* renamed from: b */
    public final void mo3154b(JobParameters jobParameters, boolean z10) {
        jobFinished(jobParameters, false);
    }

    /* renamed from: c */
    public final C0981za<AppMeasurementJobService> m5102c() {
        if (this.f4604h == null) {
            this.f4604h = new C0981za<>(this);
        }
        return this.f4604h;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m5102c().m4128c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m5102c().m4133h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m5102c().m4134i(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return m5102c().m4132g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return m5102c().m4136k(intent);
    }

    @Override // p034c7.InterfaceC0674db
    public final boolean zza(int i10) {
        throw new UnsupportedOperationException();
    }
}
