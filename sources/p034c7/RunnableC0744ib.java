package p034c7;

import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: c7.ib */
/* loaded from: classes.dex */
public final class RunnableC0744ib implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ zzcv f3186h;

    /* renamed from: i */
    public final /* synthetic */ String f3187i;

    /* renamed from: j */
    public final /* synthetic */ String f3188j;

    /* renamed from: k */
    public final /* synthetic */ AppMeasurementDynamiteService f3189k;

    public RunnableC0744ib(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, String str, String str2) {
        this.f3186h = zzcvVar;
        this.f3187i = str;
        this.f3188j = str2;
        this.f3189k = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3189k.f4610a.m3489E().m4022I(this.f3186h, this.f3187i, this.f3188j);
    }
}
