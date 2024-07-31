package p329x;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: x.d */
/* loaded from: classes.dex */
public final class C5486d {

    /* renamed from: a */
    public static final Class<?> f20404a;

    /* renamed from: b */
    public static final Field f20405b;

    /* renamed from: c */
    public static final Field f20406c;

    /* renamed from: d */
    public static final Method f20407d;

    /* renamed from: e */
    public static final Method f20408e;

    /* renamed from: f */
    public static final Method f20409f;

    /* renamed from: g */
    public static final Handler f20410g = new Handler(Looper.getMainLooper());

    /* renamed from: x.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ d f20411h;

        /* renamed from: i */
        public final /* synthetic */ Object f20412i;

        public a(d dVar, Object obj) {
            this.f20411h = dVar;
            this.f20412i = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20411h.f20417h = this.f20412i;
        }
    }

    /* renamed from: x.d$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ Application f20413h;

        /* renamed from: i */
        public final /* synthetic */ d f20414i;

        public b(Application application, d dVar) {
            this.f20413h = application;
            this.f20414i = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f20413h.unregisterActivityLifecycleCallbacks(this.f20414i);
        }
    }

    /* renamed from: x.d$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ Object f20415h;

        /* renamed from: i */
        public final /* synthetic */ Object f20416i;

        public c(Object obj, Object obj2) {
            this.f20415h = obj;
            this.f20416i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C5486d.f20407d;
                if (method != null) {
                    method.invoke(this.f20415h, this.f20416i, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C5486d.f20408e.invoke(this.f20415h, this.f20416i, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: x.d$d */
    /* loaded from: classes.dex */
    public static final class d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: h */
        public Object f20417h;

        /* renamed from: i */
        public Activity f20418i;

        /* renamed from: j */
        public final int f20419j;

        /* renamed from: k */
        public boolean f20420k = false;

        /* renamed from: l */
        public boolean f20421l = false;

        /* renamed from: m */
        public boolean f20422m = false;

        public d(Activity activity) {
            this.f20418i = activity;
            this.f20419j = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f20418i == activity) {
                this.f20418i = null;
                this.f20421l = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f20421l || this.f20422m || this.f20420k || !C5486d.m21774h(this.f20417h, this.f20419j, activity)) {
                return;
            }
            this.f20422m = true;
            this.f20417h = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f20418i == activity) {
                this.f20420k = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> m21767a = m21767a();
        f20404a = m21767a;
        f20405b = m21768b();
        f20406c = m21772f();
        f20407d = m21770d(m21767a);
        f20408e = m21769c(m21767a);
        f20409f = m21771e(m21767a);
    }

    /* renamed from: a */
    public static Class<?> m21767a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static Field m21768b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m21769c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m21770d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Method m21771e(Class<?> cls) {
        if (m21773g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    public static Field m21772f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m21773g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    /* renamed from: h */
    public static boolean m21774h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f20406c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f20410g.postAtFrontOfQueue(new c(f20405b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m21775i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m21773g() && f20409f == null) {
            return false;
        }
        if (f20408e == null && f20407d == null) {
            return false;
        }
        try {
            Object obj2 = f20406c.get(activity);
            if (obj2 == null || (obj = f20405b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            Handler handler = f20410g;
            handler.post(new a(dVar, obj2));
            try {
                if (m21773g()) {
                    Method method = f20409f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, dVar));
                return true;
            } catch (Throwable th) {
                f20410g.post(new b(application, dVar));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
