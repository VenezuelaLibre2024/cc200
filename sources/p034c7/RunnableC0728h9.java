package p034c7;

import com.google.android.gms.internal.measurement.zzcv;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: c7.h9 */
/* loaded from: classes.dex */
public final class RunnableC0728h9 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ zzcv f3027h;

    /* renamed from: i */
    public final /* synthetic */ String f3028i;

    /* renamed from: j */
    public final /* synthetic */ String f3029j;

    /* renamed from: k */
    public final /* synthetic */ boolean f3030k;

    /* renamed from: l */
    public final /* synthetic */ AppMeasurementDynamiteService f3031l;

    public RunnableC0728h9(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcv zzcvVar, String str, String str2, boolean z10) {
        this.f3027h = zzcvVar;
        this.f3028i = str;
        this.f3029j = str2;
        this.f3030k = z10;
        this.f3031l = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3031l.f4610a.m3489E().m4023J(this.f3027h, this.f3028i, this.f3029j, this.f3030k);
    }
}
