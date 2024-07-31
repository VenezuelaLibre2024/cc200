package p244qe;

import android.app.Application;
import td.C4753m;

/* renamed from: qe.g */
/* loaded from: classes2.dex */
public final class C4255g {

    /* renamed from: a */
    public final Application f15389a;

    /* renamed from: b */
    public final Application.ActivityLifecycleCallbacks f15390b;

    public C4255g(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        C4753m.m18653f(application, "application");
        C4753m.m18653f(activityLifecycleCallbacks, "callback");
        this.f15389a = application;
        this.f15390b = activityLifecycleCallbacks;
    }

    /* renamed from: a */
    public final void m16337a() {
        this.f15389a.unregisterActivityLifecycleCallbacks(this.f15390b);
    }
}
