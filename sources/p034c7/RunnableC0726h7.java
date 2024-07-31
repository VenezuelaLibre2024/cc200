package p034c7;

import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: c7.h7 */
/* loaded from: classes.dex */
public final class RunnableC0726h7 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ zzcv f3023h;

    /* renamed from: i */
    public final /* synthetic */ AppMeasurementDynamiteService f3024i;

    public RunnableC0726h7(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar) {
        this.f3023h = zzcvVar;
        this.f3024i = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3024i.f4610a.m3489E().m4020G(this.f3023h);
    }
}
