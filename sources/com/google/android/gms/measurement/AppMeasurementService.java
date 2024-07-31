package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import p028c1.AbstractC0582a;
import p034c7.C0981za;
import p034c7.InterfaceC0674db;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC0674db {

    /* renamed from: h */
    public C0981za<AppMeasurementService> f4606h;

    @Override // p034c7.InterfaceC0674db
    /* renamed from: a */
    public final void mo3153a(Intent intent) {
        AbstractC0582a.m2934b(intent);
    }

    @Override // p034c7.InterfaceC0674db
    /* renamed from: b */
    public final void mo3154b(JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public final C0981za<AppMeasurementService> m5103c() {
        if (this.f4606h == null) {
            this.f4606h = new C0981za<>(this);
        }
        return this.f4606h;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return m5103c().m4127b(intent);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        m5103c().m4128c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m5103c().m4133h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m5103c().m4134i(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        return m5103c().m4126a(intent, i10, i11);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return m5103c().m4136k(intent);
    }

    @Override // p034c7.InterfaceC0674db
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }
}
