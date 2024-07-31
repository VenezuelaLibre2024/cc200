package p034c7;

import android.content.ComponentName;

/* renamed from: c7.ta */
/* loaded from: classes.dex */
public final class RunnableC0897ta implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ ComponentName f3600h;

    /* renamed from: i */
    public final /* synthetic */ ServiceConnectionC0869ra f3601i;

    public RunnableC0897ta(ServiceConnectionC0869ra serviceConnectionC0869ra, ComponentName componentName) {
        this.f3600h = componentName;
        this.f3601i = serviceConnectionC0869ra;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966y9.m4009D(this.f3601i.f3519j, this.f3600h);
    }
}
