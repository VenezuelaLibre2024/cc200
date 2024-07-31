package p097g7;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: g7.d */
/* loaded from: classes.dex */
public final class C2092d {

    /* renamed from: o */
    public static final Map f8190o = new HashMap();

    /* renamed from: a */
    public final Context f8191a;

    /* renamed from: b */
    public final C2091c0 f8192b;

    /* renamed from: c */
    public final String f8193c;

    /* renamed from: g */
    public boolean f8197g;

    /* renamed from: h */
    public final Intent f8198h;

    /* renamed from: i */
    public final InterfaceC2105j0 f8199i;

    /* renamed from: m */
    public ServiceConnection f8203m;

    /* renamed from: n */
    public IInterface f8204n;

    /* renamed from: d */
    public final List f8194d = new ArrayList();

    /* renamed from: e */
    public final Set f8195e = new HashSet();

    /* renamed from: f */
    public final Object f8196f = new Object();

    /* renamed from: k */
    public final IBinder.DeathRecipient f8201k = new IBinder.DeathRecipient() { // from class: g7.f0
        public /* synthetic */ C2097f0() {
        }

        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2092d.m8303k(C2092d.this);
        }
    };

    /* renamed from: l */
    public final AtomicInteger f8202l = new AtomicInteger(0);

    /* renamed from: j */
    public final WeakReference f8200j = new WeakReference(null);

    public C2092d(Context context, C2091c0 c2091c0, String str, Intent intent, InterfaceC2105j0 interfaceC2105j0, InterfaceC2103i0 interfaceC2103i0) {
        this.f8191a = context;
        this.f8192b = c2091c0;
        this.f8193c = str;
        this.f8198h = intent;
        this.f8199i = interfaceC2105j0;
    }

    /* renamed from: k */
    public static /* synthetic */ void m8303k(C2092d c2092d) {
        c2092d.f8192b.m8293c("reportBinderDeath", new Object[0]);
        InterfaceC2103i0 interfaceC2103i0 = (InterfaceC2103i0) c2092d.f8200j.get();
        if (interfaceC2103i0 != null) {
            c2092d.f8192b.m8293c("calling onBinderDied", new Object[0]);
            interfaceC2103i0.m8324a();
        } else {
            c2092d.f8192b.m8293c("%s : Binder has died.", c2092d.f8193c);
            Iterator it = c2092d.f8194d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC2093d0) it.next()).mo5115a(c2092d.m8317w());
            }
            c2092d.f8194d.clear();
        }
        synchronized (c2092d.f8196f) {
            c2092d.m8318x();
        }
    }

    /* renamed from: o */
    public static /* bridge */ /* synthetic */ void m8307o(C2092d c2092d, TaskCompletionSource taskCompletionSource) {
        c2092d.f8195e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: g7.e0

            /* renamed from: b */
            public final /* synthetic */ TaskCompletionSource f8207b;

            public /* synthetic */ C2095e0(TaskCompletionSource taskCompletionSource2) {
                r2 = taskCompletionSource2;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                C2092d.this.m8315u(r2, task);
            }
        });
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ void m8309q(C2092d c2092d, AbstractRunnableC2093d0 abstractRunnableC2093d0) {
        if (c2092d.f8204n != null || c2092d.f8197g) {
            if (!c2092d.f8197g) {
                abstractRunnableC2093d0.run();
                return;
            } else {
                c2092d.f8192b.m8293c("Waiting to bind to the service.", new Object[0]);
                c2092d.f8194d.add(abstractRunnableC2093d0);
                return;
            }
        }
        c2092d.f8192b.m8293c("Initiate binding to the service.", new Object[0]);
        c2092d.f8194d.add(abstractRunnableC2093d0);
        ServiceConnectionC2090c serviceConnectionC2090c = new ServiceConnectionC2090c(c2092d, null);
        c2092d.f8203m = serviceConnectionC2090c;
        c2092d.f8197g = true;
        if (c2092d.f8191a.bindService(c2092d.f8198h, serviceConnectionC2090c, 1)) {
            return;
        }
        c2092d.f8192b.m8293c("Failed to bind to the service.", new Object[0]);
        c2092d.f8197g = false;
        Iterator it = c2092d.f8194d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC2093d0) it.next()).mo5115a(new C2094e());
        }
        c2092d.f8194d.clear();
    }

    /* renamed from: r */
    public static /* bridge */ /* synthetic */ void m8310r(C2092d c2092d) {
        c2092d.f8192b.m8293c("linkToDeath", new Object[0]);
        try {
            c2092d.f8204n.asBinder().linkToDeath(c2092d.f8201k, 0);
        } catch (RemoteException e10) {
            c2092d.f8192b.m8292b(e10, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: s */
    public static /* bridge */ /* synthetic */ void m8311s(C2092d c2092d) {
        c2092d.f8192b.m8293c("unlinkToDeath", new Object[0]);
        c2092d.f8204n.asBinder().unlinkToDeath(c2092d.f8201k, 0);
    }

    /* renamed from: c */
    public final Handler m8312c() {
        Handler handler;
        Map map = f8190o;
        synchronized (map) {
            if (!map.containsKey(this.f8193c)) {
                HandlerThread handlerThread = new HandlerThread(this.f8193c, 10);
                handlerThread.start();
                map.put(this.f8193c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) map.get(this.f8193c);
        }
        return handler;
    }

    /* renamed from: e */
    public final IInterface m8313e() {
        return this.f8204n;
    }

    /* renamed from: t */
    public final void m8314t(AbstractRunnableC2093d0 abstractRunnableC2093d0, TaskCompletionSource taskCompletionSource) {
        m8312c().post(new C2099g0(this, abstractRunnableC2093d0.m8319c(), taskCompletionSource, abstractRunnableC2093d0));
    }

    /* renamed from: u */
    public final /* synthetic */ void m8315u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f8196f) {
            this.f8195e.remove(taskCompletionSource);
        }
    }

    /* renamed from: v */
    public final void m8316v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f8196f) {
            this.f8195e.remove(taskCompletionSource);
        }
        m8312c().post(new C2101h0(this));
    }

    /* renamed from: w */
    public final RemoteException m8317w() {
        return Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f8193c).concat(" : Binder has died."));
    }

    /* renamed from: x */
    public final void m8318x() {
        Iterator it = this.f8195e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(m8317w());
        }
        this.f8195e.clear();
    }
}
