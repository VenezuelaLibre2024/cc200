package p048d6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import p108h6.C2394s;
import p194n6.C3760a;

/* renamed from: d6.u */
/* loaded from: classes.dex */
public final class ServiceConnectionC1588u implements ServiceConnection {

    /* renamed from: j */
    public C1590w f5902j;

    /* renamed from: m */
    public final /* synthetic */ C1564b0 f5905m;

    /* renamed from: h */
    public int f5900h = 0;

    /* renamed from: i */
    public final Messenger f5901i = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: d6.r
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Received response to request: " + i10);
            }
            ServiceConnectionC1588u serviceConnectionC1588u = ServiceConnectionC1588u.this;
            synchronized (serviceConnectionC1588u) {
                AbstractC1592y abstractC1592y = (AbstractC1592y) serviceConnectionC1588u.f5904l.get(i10);
                if (abstractC1592y == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i10);
                    return true;
                }
                serviceConnectionC1588u.f5904l.remove(i10);
                serviceConnectionC1588u.m6426f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    abstractC1592y.m6430c(new C1593z(4, "Not supported by GmsCore", null));
                    return true;
                }
                abstractC1592y.mo6391a(data);
                return true;
            }
        }
    }));

    /* renamed from: k */
    public final Queue f5903k = new ArrayDeque();

    /* renamed from: l */
    public final SparseArray f5904l = new SparseArray();

    public /* synthetic */ ServiceConnectionC1588u(C1564b0 c1564b0, C1587t c1587t) {
        this.f5905m = c1564b0;
    }

    /* renamed from: a */
    public final synchronized void m6421a(int i10, String str) {
        m6422b(i10, str, null);
    }

    /* renamed from: b */
    public final synchronized void m6422b(int i10, String str, Throwable th) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        int i11 = this.f5900h;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.f5900h = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f5900h = 4;
        C3760a.m14312b().m14317c(C1564b0.m6397a(this.f5905m), this);
        C1593z c1593z = new C1593z(i10, str, th);
        Iterator it = this.f5903k.iterator();
        while (it.hasNext()) {
            ((AbstractC1592y) it.next()).m6430c(c1593z);
        }
        this.f5903k.clear();
        for (int i12 = 0; i12 < this.f5904l.size(); i12++) {
            ((AbstractC1592y) this.f5904l.valueAt(i12)).m6430c(c1593z);
        }
        this.f5904l.clear();
    }

    /* renamed from: c */
    public final void m6423c() {
        C1564b0.m6399e(this.f5905m).execute(new Runnable() { // from class: d6.o
            @Override // java.lang.Runnable
            public final void run() {
                final AbstractC1592y abstractC1592y;
                while (true) {
                    final ServiceConnectionC1588u serviceConnectionC1588u = ServiceConnectionC1588u.this;
                    synchronized (serviceConnectionC1588u) {
                        if (serviceConnectionC1588u.f5900h != 2) {
                            return;
                        }
                        if (serviceConnectionC1588u.f5903k.isEmpty()) {
                            serviceConnectionC1588u.m6426f();
                            return;
                        } else {
                            abstractC1592y = (AbstractC1592y) serviceConnectionC1588u.f5903k.poll();
                            serviceConnectionC1588u.f5904l.put(abstractC1592y.f5908a, abstractC1592y);
                            C1564b0.m6399e(serviceConnectionC1588u.f5905m).schedule(new Runnable() { // from class: d6.s
                                @Override // java.lang.Runnable
                                public final void run() {
                                    ServiceConnectionC1588u.this.m6425e(abstractC1592y.f5908a);
                                }
                            }, 30L, TimeUnit.SECONDS);
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(abstractC1592y)));
                    }
                    C1564b0 c1564b0 = serviceConnectionC1588u.f5905m;
                    Messenger messenger = serviceConnectionC1588u.f5901i;
                    int i10 = abstractC1592y.f5910c;
                    Context m6397a = C1564b0.m6397a(c1564b0);
                    Message obtain = Message.obtain();
                    obtain.what = i10;
                    obtain.arg1 = abstractC1592y.f5908a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", abstractC1592y.mo6392b());
                    bundle.putString("pkg", m6397a.getPackageName());
                    bundle.putBundle("data", abstractC1592y.f5911d);
                    obtain.setData(bundle);
                    try {
                        serviceConnectionC1588u.f5902j.m6429a(obtain);
                    } catch (RemoteException e10) {
                        serviceConnectionC1588u.m6421a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: d */
    public final synchronized void m6424d() {
        if (this.f5900h == 1) {
            m6421a(1, "Timed out while binding");
        }
    }

    /* renamed from: e */
    public final synchronized void m6425e(int i10) {
        AbstractC1592y abstractC1592y = (AbstractC1592y) this.f5904l.get(i10);
        if (abstractC1592y != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i10);
            this.f5904l.remove(i10);
            abstractC1592y.m6430c(new C1593z(3, "Timed out waiting for response", null));
            m6426f();
        }
    }

    /* renamed from: f */
    public final synchronized void m6426f() {
        if (this.f5900h == 2 && this.f5903k.isEmpty() && this.f5904l.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f5900h = 3;
            C3760a.m14312b().m14317c(C1564b0.m6397a(this.f5905m), this);
        }
    }

    /* renamed from: g */
    public final synchronized boolean m6427g(AbstractC1592y abstractC1592y) {
        int i10 = this.f5900h;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f5903k.add(abstractC1592y);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.f5903k.add(abstractC1592y);
            m6423c();
            return true;
        }
        this.f5903k.add(abstractC1592y);
        C2394s.m9622o(this.f5900h == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f5900h = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (C3760a.m14312b().m14316a(C1564b0.m6397a(this.f5905m), intent, this, 1)) {
                C1564b0.m6399e(this.f5905m).schedule(new Runnable() { // from class: d6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ServiceConnectionC1588u.this.m6424d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                m6421a(0, "Unable to bind to service");
            }
        } catch (SecurityException e10) {
            m6422b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        C1564b0.m6399e(this.f5905m).execute(new Runnable() { // from class: d6.n
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC1588u serviceConnectionC1588u = ServiceConnectionC1588u.this;
                IBinder iBinder2 = iBinder;
                synchronized (serviceConnectionC1588u) {
                    try {
                        if (iBinder2 == null) {
                            serviceConnectionC1588u.m6421a(0, "Null service connection");
                            return;
                        }
                        try {
                            serviceConnectionC1588u.f5902j = new C1590w(iBinder2);
                            serviceConnectionC1588u.f5900h = 2;
                            serviceConnectionC1588u.m6423c();
                        } catch (RemoteException e10) {
                            serviceConnectionC1588u.m6421a(0, e10.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        C1564b0.m6399e(this.f5905m).execute(new Runnable() { // from class: d6.q
            @Override // java.lang.Runnable
            public final void run() {
                ServiceConnectionC1588u.this.m6421a(2, "Service disconnected");
            }
        });
    }
}
