package p185m9;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import gd.C2245s;
import td.C4753m;

/* renamed from: m9.i0 */
/* loaded from: classes.dex */
public final class C3572i0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: h */
    public static final C3572i0 f12577h = new C3572i0();

    /* renamed from: i */
    public static boolean f12578i;

    /* renamed from: j */
    public static C3566f0 f12579j;

    /* renamed from: a */
    public final void m13273a(C3566f0 c3566f0) {
        f12579j = c3566f0;
        if (c3566f0 == null || !f12578i) {
            return;
        }
        f12578i = false;
        c3566f0.m13260k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C4753m.m18653f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        C4753m.m18653f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C4753m.m18653f(activity, "activity");
        C3566f0 c3566f0 = f12579j;
        if (c3566f0 != null) {
            c3566f0.m13257h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        C2245s c2245s;
        C4753m.m18653f(activity, "activity");
        C3566f0 c3566f0 = f12579j;
        if (c3566f0 != null) {
            c3566f0.m13260k();
            c2245s = C2245s.f8873a;
        } else {
            c2245s = null;
        }
        if (c2245s == null) {
            f12578i = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C4753m.m18653f(activity, "activity");
        C4753m.m18653f(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        C4753m.m18653f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C4753m.m18653f(activity, "activity");
    }
}
