package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: com.google.android.gms.measurement.internal.a */
/* loaded from: classes.dex */
public final class RunnableC1186a implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ AppMeasurementDynamiteService.C1185b f4616h;

    /* renamed from: i */
    public final /* synthetic */ AppMeasurementDynamiteService f4617i;

    public RunnableC1186a(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.C1185b c1185b) {
        this.f4616h = c1185b;
        this.f4617i = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4617i.f4610a.m3487C().m3952I(this.f4616h);
    }
}
