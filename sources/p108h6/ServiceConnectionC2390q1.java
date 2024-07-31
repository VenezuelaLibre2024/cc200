package p108h6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import p194n6.C3760a;
import p207o6.C3944m;

/* renamed from: h6.q1 */
/* loaded from: classes.dex */
public final class ServiceConnectionC2390q1 implements ServiceConnection, InterfaceC2402u1 {

    /* renamed from: h */
    public final Map f9685h = new HashMap();

    /* renamed from: i */
    public int f9686i = 2;

    /* renamed from: j */
    public boolean f9687j;

    /* renamed from: k */
    public IBinder f9688k;

    /* renamed from: l */
    public final C2387p1 f9689l;

    /* renamed from: m */
    public ComponentName f9690m;

    /* renamed from: n */
    public final /* synthetic */ C2399t1 f9691n;

    public ServiceConnectionC2390q1(C2399t1 c2399t1, C2387p1 c2387p1) {
        this.f9691n = c2399t1;
        this.f9689l = c2387p1;
    }

    /* renamed from: a */
    public final int m9596a() {
        return this.f9686i;
    }

    /* renamed from: b */
    public final ComponentName m9597b() {
        return this.f9690m;
    }

    /* renamed from: c */
    public final IBinder m9598c() {
        return this.f9688k;
    }

    /* renamed from: d */
    public final void m9599d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f9685h.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: e */
    public final void m9600e(String str, Executor executor) {
        C3760a c3760a;
        Context context;
        Context context2;
        C3760a c3760a2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        this.f9686i = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C3944m.m14963l()) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            C2399t1 c2399t1 = this.f9691n;
            c3760a = c2399t1.f9710j;
            context = c2399t1.f9707g;
            C2387p1 c2387p1 = this.f9689l;
            context2 = c2399t1.f9707g;
            boolean m14318d = c3760a.m14318d(context, str, c2387p1.m9589b(context2), this, 4225, executor);
            this.f9687j = m14318d;
            if (m14318d) {
                handler = this.f9691n.f9708h;
                Message obtainMessage = handler.obtainMessage(1, this.f9689l);
                handler2 = this.f9691n.f9708h;
                j10 = this.f9691n.f9712l;
                handler2.sendMessageDelayed(obtainMessage, j10);
            } else {
                this.f9686i = 2;
                try {
                    C2399t1 c2399t12 = this.f9691n;
                    c3760a2 = c2399t12.f9710j;
                    context3 = c2399t12.f9707g;
                    c3760a2.m14317c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    /* renamed from: f */
    public final void m9601f(ServiceConnection serviceConnection, String str) {
        this.f9685h.remove(serviceConnection);
    }

    /* renamed from: g */
    public final void m9602g(String str) {
        Handler handler;
        C3760a c3760a;
        Context context;
        C2387p1 c2387p1 = this.f9689l;
        handler = this.f9691n.f9708h;
        handler.removeMessages(1, c2387p1);
        C2399t1 c2399t1 = this.f9691n;
        c3760a = c2399t1.f9710j;
        context = c2399t1.f9707g;
        c3760a.m14317c(context, this);
        this.f9687j = false;
        this.f9686i = 2;
    }

    /* renamed from: h */
    public final boolean m9603h(ServiceConnection serviceConnection) {
        return this.f9685h.containsKey(serviceConnection);
    }

    /* renamed from: i */
    public final boolean m9604i() {
        return this.f9685h.isEmpty();
    }

    /* renamed from: j */
    public final boolean m9605j() {
        return this.f9687j;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f9691n.f9706f;
        synchronized (hashMap) {
            handler = this.f9691n.f9708h;
            handler.removeMessages(1, this.f9689l);
            this.f9688k = iBinder;
            this.f9690m = componentName;
            Iterator it = this.f9685h.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f9686i = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f9691n.f9706f;
        synchronized (hashMap) {
            handler = this.f9691n.f9708h;
            handler.removeMessages(1, this.f9689l);
            this.f9688k = null;
            this.f9690m = componentName;
            Iterator it = this.f9685h.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f9686i = 2;
        }
    }
}
