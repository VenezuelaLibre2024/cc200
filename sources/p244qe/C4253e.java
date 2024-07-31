package p244qe;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import gd.C2245s;
import sd.InterfaceC4569a;
import td.C4753m;

/* renamed from: qe.e */
/* loaded from: classes2.dex */
public final class C4253e {

    /* renamed from: qe.e$a */
    /* loaded from: classes2.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: h */
        public final /* synthetic */ Activity f15383h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC4569a<C2245s> f15384i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4569a<C2245s> f15385j;

        public a(Activity activity, InterfaceC4569a<C2245s> interfaceC4569a, InterfaceC4569a<C2245s> interfaceC4569a2) {
            this.f15383h = activity;
            this.f15384i = interfaceC4569a;
            this.f15385j = interfaceC4569a2;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C4753m.m18653f(activity, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C4753m.m18653f(activity, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            InterfaceC4569a<C2245s> interfaceC4569a;
            C4753m.m18653f(activity, "p0");
            if (!C4753m.m18648a(activity, this.f15383h) || (interfaceC4569a = this.f15384i) == null) {
                return;
            }
            interfaceC4569a.invoke();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            InterfaceC4569a<C2245s> interfaceC4569a;
            C4753m.m18653f(activity, "p0");
            if (!C4753m.m18648a(activity, this.f15383h) || (interfaceC4569a = this.f15385j) == null) {
                return;
            }
            interfaceC4569a.invoke();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C4753m.m18653f(activity, "p0");
            C4753m.m18653f(bundle, "p1");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C4753m.m18653f(activity, "p0");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C4753m.m18653f(activity, "p0");
        }
    }

    /* renamed from: a */
    public static final C4255g m16332a(Activity activity, InterfaceC4569a<C2245s> interfaceC4569a, InterfaceC4569a<C2245s> interfaceC4569a2) {
        C4753m.m18653f(activity, "<this>");
        a aVar = new a(activity, interfaceC4569a, interfaceC4569a2);
        activity.getApplication().registerActivityLifecycleCallbacks(aVar);
        Application application = activity.getApplication();
        C4753m.m18652e(application, "application");
        return new C4255g(application, aVar);
    }
}
