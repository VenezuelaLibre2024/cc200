package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
import td.C4753m;

/* renamed from: androidx.lifecycle.h */
/* loaded from: classes.dex */
public final class C0348h {

    /* renamed from: a */
    public static final C0348h f1725a = new C0348h();

    /* renamed from: b */
    public static final AtomicBoolean f1726b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.h$a */
    /* loaded from: classes.dex */
    public static final class a extends C0338c {
        @Override // androidx.lifecycle.C0338c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C4753m.m18653f(activity, "activity");
            FragmentC0366v.f1757i.m1874c(activity);
        }
    }

    /* renamed from: a */
    public static final void m1822a(Context context) {
        C4753m.m18653f(context, "context");
        if (f1726b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C4753m.m18651d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
