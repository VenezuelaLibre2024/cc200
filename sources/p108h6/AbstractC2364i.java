package p108h6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* renamed from: h6.i */
/* loaded from: classes.dex */
public abstract class AbstractC2364i {

    /* renamed from: a */
    public static final Object f9641a = new Object();

    /* renamed from: b */
    public static C2399t1 f9642b = null;

    /* renamed from: c */
    public static HandlerThread f9643c = null;

    /* renamed from: d */
    public static Executor f9644d = null;

    /* renamed from: e */
    public static boolean f9645e = false;

    /* renamed from: b */
    public static int m9561b() {
        return 4225;
    }

    /* renamed from: c */
    public static AbstractC2364i m9562c(Context context) {
        synchronized (f9641a) {
            if (f9642b == null) {
                f9642b = new C2399t1(context.getApplicationContext(), f9645e ? m9563d().getLooper() : context.getMainLooper(), f9644d);
            }
        }
        return f9642b;
    }

    /* renamed from: d */
    public static HandlerThread m9563d() {
        synchronized (f9641a) {
            HandlerThread handlerThread = f9643c;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f9643c = handlerThread2;
            handlerThread2.start();
            return f9643c;
        }
    }

    /* renamed from: a */
    public boolean m9564a(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return mo9568h(new C2387p1(componentName, 4225), serviceConnection, str, executor);
    }

    /* renamed from: e */
    public void m9565e(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        mo9566f(new C2387p1(componentName, 4225), serviceConnection, str);
    }

    /* renamed from: f */
    public abstract void mo9566f(C2387p1 c2387p1, ServiceConnection serviceConnection, String str);

    /* renamed from: g */
    public final void m9567g(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        mo9566f(new C2387p1(str, str2, 4225, z10), serviceConnection, str3);
    }

    /* renamed from: h */
    public abstract boolean mo9568h(C2387p1 c2387p1, ServiceConnection serviceConnection, String str, Executor executor);
}
