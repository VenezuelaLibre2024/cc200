package p034c7;

import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: c7.ha */
/* loaded from: classes.dex */
public final class RunnableC0729ha implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ zzcv f3032h;

    /* renamed from: i */
    public final /* synthetic */ AppMeasurementDynamiteService f3033i;

    public RunnableC0729ha(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar) {
        this.f3032h = zzcvVar;
        this.f3033i = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3033i.f4610a.m3491G().m3790T(this.f3032h, this.f3033i.f4610a.m3502j());
    }
}
