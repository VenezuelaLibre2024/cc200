package p034c7;

import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: c7.g6 */
/* loaded from: classes.dex */
public final class RunnableC0711g6 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ zzcv f2989h;

    /* renamed from: i */
    public final /* synthetic */ C0705g0 f2990i;

    /* renamed from: j */
    public final /* synthetic */ String f2991j;

    /* renamed from: k */
    public final /* synthetic */ AppMeasurementDynamiteService f2992k;

    public RunnableC0711g6(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, C0705g0 c0705g0, String str) {
        this.f2989h = zzcvVar;
        this.f2990i = c0705g0;
        this.f2991j = str;
        this.f2992k = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2992k.f4610a.m3489E().m4021H(this.f2989h, this.f2990i, this.f2991j);
    }
}
