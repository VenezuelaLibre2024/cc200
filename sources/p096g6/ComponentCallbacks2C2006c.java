package p096g6;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p207o6.C3944m;

/* renamed from: g6.c */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C2006c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: l */
    public static final ComponentCallbacks2C2006c f7999l = new ComponentCallbacks2C2006c();

    /* renamed from: h */
    public final AtomicBoolean f8000h = new AtomicBoolean();

    /* renamed from: i */
    public final AtomicBoolean f8001i = new AtomicBoolean();

    /* renamed from: j */
    public final ArrayList f8002j = new ArrayList();

    /* renamed from: k */
    public boolean f8003k = false;

    /* renamed from: g6.c$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo8097a(boolean z10);
    }

    /* renamed from: b */
    public static ComponentCallbacks2C2006c m8091b() {
        return f7999l;
    }

    /* renamed from: c */
    public static void m8092c(Application application) {
        ComponentCallbacks2C2006c componentCallbacks2C2006c = f7999l;
        synchronized (componentCallbacks2C2006c) {
            if (!componentCallbacks2C2006c.f8003k) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C2006c);
                application.registerComponentCallbacks(componentCallbacks2C2006c);
                componentCallbacks2C2006c.f8003k = true;
            }
        }
    }

    /* renamed from: a */
    public void m8093a(a aVar) {
        synchronized (f7999l) {
            this.f8002j.add(aVar);
        }
    }

    /* renamed from: d */
    public boolean m8094d() {
        return this.f8000h.get();
    }

    @TargetApi(16)
    /* renamed from: e */
    public boolean m8095e(boolean z10) {
        if (!this.f8001i.get()) {
            if (!C3944m.m14953b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f8001i.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f8000h.set(true);
            }
        }
        return m8094d();
    }

    /* renamed from: f */
    public final void m8096f(boolean z10) {
        synchronized (f7999l) {
            Iterator it = this.f8002j.iterator();
            while (it.hasNext()) {
                ((a) it.next()).mo8097a(z10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f8001i;
        boolean compareAndSet = this.f8000h.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            m8096f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f8001i;
        boolean compareAndSet = this.f8000h.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (compareAndSet) {
            m8096f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f8000h.compareAndSet(false, true)) {
            this.f8001i.set(true);
            m8096f(true);
        }
    }
}
