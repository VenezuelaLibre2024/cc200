package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.FragmentC0366v;
import td.C4747g;
import td.C4753m;

/* renamed from: androidx.lifecycle.u */
/* loaded from: classes.dex */
public final class C0365u implements InterfaceC0354k {

    /* renamed from: p */
    public static final b f1745p = new b(null);

    /* renamed from: q */
    public static final C0365u f1746q = new C0365u();

    /* renamed from: h */
    public int f1747h;

    /* renamed from: i */
    public int f1748i;

    /* renamed from: l */
    public Handler f1751l;

    /* renamed from: j */
    public boolean f1749j = true;

    /* renamed from: k */
    public boolean f1750k = true;

    /* renamed from: m */
    public final C0356l f1752m = new C0356l(this);

    /* renamed from: n */
    public final Runnable f1753n = new Runnable() { // from class: androidx.lifecycle.t
        @Override // java.lang.Runnable
        public final void run() {
            C0365u.m1854i(C0365u.this);
        }
    };

    /* renamed from: o */
    public final FragmentC0366v.a f1754o = new d();

    /* renamed from: androidx.lifecycle.u$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f1755a = new a();

        /* renamed from: a */
        public static final void m1862a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C4753m.m18653f(activity, "activity");
            C4753m.m18653f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* renamed from: androidx.lifecycle.u$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC0354k m1863a() {
            return C0365u.f1746q;
        }

        /* renamed from: b */
        public final void m1864b(Context context) {
            C4753m.m18653f(context, "context");
            C0365u.f1746q.m1859h(context);
        }
    }

    /* renamed from: androidx.lifecycle.u$c */
    /* loaded from: classes.dex */
    public static final class c extends C0338c {

        /* renamed from: androidx.lifecycle.u$c$a */
        /* loaded from: classes.dex */
        public static final class a extends C0338c {
            public final /* synthetic */ C0365u this$0;

            public a(C0365u c0365u) {
                this.this$0 = c0365u;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C4753m.m18653f(activity, "activity");
                this.this$0.m1856e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C4753m.m18653f(activity, "activity");
                this.this$0.m1857f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.C0338c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C4753m.m18653f(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC0366v.f1757i.m1873b(activity).m1871f(C0365u.this.f1754o);
            }
        }

        @Override // androidx.lifecycle.C0338c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C4753m.m18653f(activity, "activity");
            C0365u.this.m1855d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C4753m.m18653f(activity, "activity");
            a.m1862a(activity, new a(C0365u.this));
        }

        @Override // androidx.lifecycle.C0338c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C4753m.m18653f(activity, "activity");
            C0365u.this.m1858g();
        }
    }

    /* renamed from: androidx.lifecycle.u$d */
    /* loaded from: classes.dex */
    public static final class d implements FragmentC0366v.a {
        public d() {
        }

        @Override // androidx.lifecycle.FragmentC0366v.a
        /* renamed from: a */
        public void mo1865a() {
        }

        @Override // androidx.lifecycle.FragmentC0366v.a
        public void onResume() {
            C0365u.this.m1856e();
        }

        @Override // androidx.lifecycle.FragmentC0366v.a
        public void onStart() {
            C0365u.this.m1857f();
        }
    }

    /* renamed from: i */
    public static final void m1854i(C0365u c0365u) {
        C4753m.m18653f(c0365u, "this$0");
        c0365u.m1860j();
        c0365u.m1861k();
    }

    /* renamed from: d */
    public final void m1855d() {
        int i10 = this.f1748i - 1;
        this.f1748i = i10;
        if (i10 == 0) {
            Handler handler = this.f1751l;
            C4753m.m18650c(handler);
            handler.postDelayed(this.f1753n, 700L);
        }
    }

    /* renamed from: e */
    public final void m1856e() {
        int i10 = this.f1748i + 1;
        this.f1748i = i10;
        if (i10 == 1) {
            if (this.f1749j) {
                this.f1752m.m1833h(AbstractC0344f.a.ON_RESUME);
                this.f1749j = false;
            } else {
                Handler handler = this.f1751l;
                C4753m.m18650c(handler);
                handler.removeCallbacks(this.f1753n);
            }
        }
    }

    /* renamed from: f */
    public final void m1857f() {
        int i10 = this.f1747h + 1;
        this.f1747h = i10;
        if (i10 == 1 && this.f1750k) {
            this.f1752m.m1833h(AbstractC0344f.a.ON_START);
            this.f1750k = false;
        }
    }

    /* renamed from: g */
    public final void m1858g() {
        this.f1747h--;
        m1861k();
    }

    @Override // androidx.lifecycle.InterfaceC0354k
    public AbstractC0344f getLifecycle() {
        return this.f1752m;
    }

    /* renamed from: h */
    public final void m1859h(Context context) {
        C4753m.m18653f(context, "context");
        this.f1751l = new Handler();
        this.f1752m.m1833h(AbstractC0344f.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C4753m.m18651d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* renamed from: j */
    public final void m1860j() {
        if (this.f1748i == 0) {
            this.f1749j = true;
            this.f1752m.m1833h(AbstractC0344f.a.ON_PAUSE);
        }
    }

    /* renamed from: k */
    public final void m1861k() {
        if (this.f1747h == 0 && this.f1749j) {
            this.f1752m.m1833h(AbstractC0344f.a.ON_STOP);
            this.f1750k = true;
        }
    }
}
