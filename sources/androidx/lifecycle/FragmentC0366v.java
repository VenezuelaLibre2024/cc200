package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0344f;
import td.C4747g;
import td.C4753m;

/* renamed from: androidx.lifecycle.v */
/* loaded from: classes.dex */
public class FragmentC0366v extends Fragment {

    /* renamed from: i */
    public static final b f1757i = new b(null);

    /* renamed from: h */
    public a f1758h;

    /* renamed from: androidx.lifecycle.v$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        void mo1865a();

        void onResume();

        void onStart();
    }

    /* renamed from: androidx.lifecycle.v$b */
    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public final void m1872a(Activity activity, AbstractC0344f.a aVar) {
            C4753m.m18653f(activity, "activity");
            C4753m.m18653f(aVar, "event");
            if (activity instanceof InterfaceC0357m) {
                ((InterfaceC0357m) activity).getLifecycle().m1833h(aVar);
            } else if (activity instanceof InterfaceC0354k) {
                AbstractC0344f lifecycle = ((InterfaceC0354k) activity).getLifecycle();
                if (lifecycle instanceof C0356l) {
                    ((C0356l) lifecycle).m1833h(aVar);
                }
            }
        }

        /* renamed from: b */
        public final FragmentC0366v m1873b(Activity activity) {
            C4753m.m18653f(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C4753m.m18651d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (FragmentC0366v) findFragmentByTag;
        }

        /* renamed from: c */
        public final void m1874c(Activity activity) {
            C4753m.m18653f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.m1875a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC0366v(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* renamed from: androidx.lifecycle.v$c */
    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        /* renamed from: androidx.lifecycle.v$c$a */
        /* loaded from: classes.dex */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(C4747g c4747g) {
                this();
            }

            /* renamed from: a */
            public final void m1875a(Activity activity) {
                C4753m.m18653f(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.m1875a(activity);
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
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C4753m.m18653f(activity, "activity");
            FragmentC0366v.f1757i.m1872a(activity, AbstractC0344f.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C4753m.m18653f(activity, "activity");
            FragmentC0366v.f1757i.m1872a(activity, AbstractC0344f.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C4753m.m18653f(activity, "activity");
            FragmentC0366v.f1757i.m1872a(activity, AbstractC0344f.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            C4753m.m18653f(activity, "activity");
            FragmentC0366v.f1757i.m1872a(activity, AbstractC0344f.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            C4753m.m18653f(activity, "activity");
            FragmentC0366v.f1757i.m1872a(activity, AbstractC0344f.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            C4753m.m18653f(activity, "activity");
            FragmentC0366v.f1757i.m1872a(activity, AbstractC0344f.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C4753m.m18653f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C4753m.m18653f(activity, "activity");
            C4753m.m18653f(bundle, "bundle");
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

    /* renamed from: e */
    public static final void m1866e(Activity activity) {
        f1757i.m1874c(activity);
    }

    /* renamed from: a */
    public final void m1867a(AbstractC0344f.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f1757i;
            Activity activity = getActivity();
            C4753m.m18652e(activity, "activity");
            bVar.m1872a(activity, aVar);
        }
    }

    /* renamed from: b */
    public final void m1868b(a aVar) {
        if (aVar != null) {
            aVar.mo1865a();
        }
    }

    /* renamed from: c */
    public final void m1869c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    /* renamed from: d */
    public final void m1870d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    /* renamed from: f */
    public final void m1871f(a aVar) {
        this.f1758h = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1868b(this.f1758h);
        m1867a(AbstractC0344f.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m1867a(AbstractC0344f.a.ON_DESTROY);
        this.f1758h = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m1867a(AbstractC0344f.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m1869c(this.f1758h);
        m1867a(AbstractC0344f.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m1870d(this.f1758h);
        m1867a(AbstractC0344f.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m1867a(AbstractC0344f.a.ON_STOP);
    }
}
