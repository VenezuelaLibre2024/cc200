package p194n6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p108h6.C2394s;
import p108h6.InterfaceC2402u1;
import p207o6.C3944m;
import p237q6.C4195c;

/* renamed from: n6.a */
/* loaded from: classes.dex */
public class C3760a {

    /* renamed from: b */
    public static final Object f13567b = new Object();

    /* renamed from: c */
    public static volatile C3760a f13568c;

    /* renamed from: a */
    public final ConcurrentHashMap f13569a = new ConcurrentHashMap();

    /* renamed from: b */
    public static C3760a m14312b() {
        if (f13568c == null) {
            synchronized (f13567b) {
                if (f13568c == null) {
                    f13568c = new C3760a();
                }
            }
        }
        C3760a c3760a = f13568c;
        C2394s.m9619l(c3760a);
        return c3760a;
    }

    /* renamed from: e */
    public static void m14313e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    /* renamed from: g */
    public static boolean m14314g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC2402u1);
    }

    /* renamed from: h */
    public static final boolean m14315h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!C3944m.m14961j() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: a */
    public boolean m14316a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return m14319f(context, context.getClass().getName(), intent, serviceConnection, i10, true, null);
    }

    /* renamed from: c */
    public void m14317c(Context context, ServiceConnection serviceConnection) {
        if (!m14314g(serviceConnection) || !this.f13569a.containsKey(serviceConnection)) {
            m14313e(context, serviceConnection);
            return;
        }
        try {
            m14313e(context, (ServiceConnection) this.f13569a.get(serviceConnection));
        } finally {
            this.f13569a.remove(serviceConnection);
        }
    }

    @ResultIgnorabilityUnspecified
    /* renamed from: d */
    public final boolean m14318d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return m14319f(context, str, intent, serviceConnection, 4225, true, executor);
    }

    /* renamed from: f */
    public final boolean m14319f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C4195c.m16183a(context).m16178c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!m14314g(serviceConnection)) {
            return m14315h(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f13569a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean m14315h = m14315h(context, intent, serviceConnection, i10, executor);
            if (m14315h) {
                return m14315h;
            }
            return false;
        } finally {
            this.f13569a.remove(serviceConnection, serviceConnection);
        }
    }
}
