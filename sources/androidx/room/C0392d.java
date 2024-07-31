package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.C0391c;
import androidx.room.InterfaceC0389a;
import androidx.room.InterfaceC0390b;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.room.d */
/* loaded from: classes.dex */
public class C0392d {

    /* renamed from: a */
    public final Context f1857a;

    /* renamed from: b */
    public final String f1858b;

    /* renamed from: c */
    public int f1859c;

    /* renamed from: d */
    public final C0391c f1860d;

    /* renamed from: e */
    public final C0391c.c f1861e;

    /* renamed from: f */
    public InterfaceC0390b f1862f;

    /* renamed from: g */
    public final Executor f1863g;

    /* renamed from: h */
    public final InterfaceC0389a f1864h = new a();

    /* renamed from: i */
    public final AtomicBoolean f1865i = new AtomicBoolean(false);

    /* renamed from: j */
    public final ServiceConnection f1866j;

    /* renamed from: k */
    public final Runnable f1867k;

    /* renamed from: l */
    public final Runnable f1868l;

    /* renamed from: m */
    public final Runnable f1869m;

    /* renamed from: androidx.room.d$a */
    /* loaded from: classes.dex */
    public class a extends InterfaceC0389a.a {

        /* renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC6143a implements Runnable {

            /* renamed from: h */
            public final /* synthetic */ String[] f1871h;

            public RunnableC6143a(String[] strArr) {
                this.f1871h = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0392d.this.f1860d.m1970e(this.f1871h);
            }
        }

        public a() {
        }

        @Override // androidx.room.InterfaceC0389a
        /* renamed from: x */
        public void mo1963x(String[] strArr) {
            C0392d.this.f1863g.execute(new RunnableC6143a(strArr));
        }
    }

    /* renamed from: androidx.room.d$b */
    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C0392d.this.f1862f = InterfaceC0390b.a.m1965c(iBinder);
            C0392d c0392d = C0392d.this;
            c0392d.f1863g.execute(c0392d.f1867k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C0392d c0392d = C0392d.this;
            c0392d.f1863g.execute(c0392d.f1868l);
            C0392d.this.f1862f = null;
        }
    }

    /* renamed from: androidx.room.d$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C0392d c0392d = C0392d.this;
                InterfaceC0390b interfaceC0390b = c0392d.f1862f;
                if (interfaceC0390b != null) {
                    c0392d.f1859c = interfaceC0390b.mo1961S(c0392d.f1864h, c0392d.f1858b);
                    C0392d c0392d2 = C0392d.this;
                    c0392d2.f1860d.m1967a(c0392d2.f1861e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    /* renamed from: androidx.room.d$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0392d c0392d = C0392d.this;
            c0392d.f1860d.m1972g(c0392d.f1861e);
        }
    }

    /* renamed from: androidx.room.d$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0392d c0392d = C0392d.this;
            c0392d.f1860d.m1972g(c0392d.f1861e);
            try {
                C0392d c0392d2 = C0392d.this;
                InterfaceC0390b interfaceC0390b = c0392d2.f1862f;
                if (interfaceC0390b != null) {
                    interfaceC0390b.mo1960G1(c0392d2.f1864h, c0392d2.f1859c);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e10);
            }
            C0392d c0392d3 = C0392d.this;
            c0392d3.f1857a.unbindService(c0392d3.f1866j);
        }
    }

    /* renamed from: androidx.room.d$f */
    /* loaded from: classes.dex */
    public class f extends C0391c.c {
        public f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.C0391c.c
        /* renamed from: a */
        public boolean mo1984a() {
            return true;
        }

        @Override // androidx.room.C0391c.c
        /* renamed from: b */
        public void mo1985b(Set<String> set) {
            if (C0392d.this.f1865i.get()) {
                return;
            }
            try {
                C0392d c0392d = C0392d.this;
                InterfaceC0390b interfaceC0390b = c0392d.f1862f;
                if (interfaceC0390b != null) {
                    interfaceC0390b.mo1962w1(c0392d.f1859c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public C0392d(Context context, String str, C0391c c0391c, Executor executor) {
        b bVar = new b();
        this.f1866j = bVar;
        this.f1867k = new c();
        this.f1868l = new d();
        this.f1869m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f1857a = applicationContext;
        this.f1858b = str;
        this.f1860d = c0391c;
        this.f1863g = executor;
        this.f1861e = new f((String[]) c0391c.f1834a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
