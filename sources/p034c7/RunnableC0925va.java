package p034c7;

import android.content.ComponentName;

/* renamed from: c7.va */
/* loaded from: classes.dex */
public final class RunnableC0925va implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ ServiceConnectionC0869ra f3678h;

    public RunnableC0925va(ServiceConnectionC0869ra serviceConnectionC0869ra) {
        this.f3678h = serviceConnectionC0869ra;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966y9.m4009D(this.f3678h.f3519j, new ComponentName(this.f3678h.f3519j.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
