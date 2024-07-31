package p099g9;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* renamed from: g9.u0 */
/* loaded from: classes.dex */
public final class C2203u0 {

    /* renamed from: d */
    public static WeakReference<C2203u0> f8750d;

    /* renamed from: a */
    public final SharedPreferences f8751a;

    /* renamed from: b */
    public C2197r0 f8752b;

    /* renamed from: c */
    public final Executor f8753c;

    public C2203u0(SharedPreferences sharedPreferences, Executor executor) {
        this.f8753c = executor;
        this.f8751a = sharedPreferences;
    }

    /* renamed from: b */
    public static synchronized C2203u0 m8839b(Context context, Executor executor) {
        C2203u0 c2203u0;
        synchronized (C2203u0.class) {
            WeakReference<C2203u0> weakReference = f8750d;
            c2203u0 = weakReference != null ? weakReference.get() : null;
            if (c2203u0 == null) {
                c2203u0 = new C2203u0(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                c2203u0.m8842d();
                f8750d = new WeakReference<>(c2203u0);
            }
        }
        return c2203u0;
    }

    /* renamed from: a */
    public synchronized boolean m8840a(C2201t0 c2201t0) {
        return this.f8752b.m8818b(c2201t0.m8838e());
    }

    /* renamed from: c */
    public synchronized C2201t0 m8841c() {
        return C2201t0.m8832a(this.f8752b.m8821f());
    }

    /* renamed from: d */
    public final synchronized void m8842d() {
        this.f8752b = C2197r0.m8817d(this.f8751a, "topic_operation_queue", ",", this.f8753c);
    }

    /* renamed from: e */
    public synchronized boolean m8843e(C2201t0 c2201t0) {
        return this.f8752b.m8822g(c2201t0.m8838e());
    }
}
