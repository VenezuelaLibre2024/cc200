package p044d2;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.C0416a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C0430a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p029c2.AbstractC0592j;
import p029c2.C0587e;
import p044d2.RunnableC1528j;
import p150k2.InterfaceC3346a;
import p170l7.InterfaceFutureC3445f;
import p178m2.C3509j;
import p203o2.InterfaceC3840a;
import p345y.C5782a;

/* renamed from: d2.d */
/* loaded from: classes.dex */
public class C1522d implements InterfaceC1520b, InterfaceC3346a {

    /* renamed from: s */
    public static final String f5546s = AbstractC0592j.m2972f("Processor");

    /* renamed from: i */
    public Context f5548i;

    /* renamed from: j */
    public C0416a f5549j;

    /* renamed from: k */
    public InterfaceC3840a f5550k;

    /* renamed from: l */
    public WorkDatabase f5551l;

    /* renamed from: o */
    public List<InterfaceC1523e> f5554o;

    /* renamed from: n */
    public Map<String, RunnableC1528j> f5553n = new HashMap();

    /* renamed from: m */
    public Map<String, RunnableC1528j> f5552m = new HashMap();

    /* renamed from: p */
    public Set<String> f5555p = new HashSet();

    /* renamed from: q */
    public final List<InterfaceC1520b> f5556q = new ArrayList();

    /* renamed from: h */
    public PowerManager.WakeLock f5547h = null;

    /* renamed from: r */
    public final Object f5557r = new Object();

    /* renamed from: d2.d$a */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: h */
        public InterfaceC1520b f5558h;

        /* renamed from: i */
        public String f5559i;

        /* renamed from: j */
        public InterfaceFutureC3445f<Boolean> f5560j;

        public a(InterfaceC1520b interfaceC1520b, String str, InterfaceFutureC3445f<Boolean> interfaceFutureC3445f) {
            this.f5558h = interfaceC1520b;
            this.f5559i = str;
            this.f5560j = interfaceFutureC3445f;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                z10 = this.f5560j.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f5558h.mo2171c(this.f5559i, z10);
        }
    }

    public C1522d(Context context, C0416a c0416a, InterfaceC3840a interfaceC3840a, WorkDatabase workDatabase, List<InterfaceC1523e> list) {
        this.f5548i = context;
        this.f5549j = c0416a;
        this.f5550k = interfaceC3840a;
        this.f5551l = workDatabase;
        this.f5554o = list;
    }

    /* renamed from: e */
    public static boolean m6152e(String str, RunnableC1528j runnableC1528j) {
        if (runnableC1528j == null) {
            AbstractC0592j.m2970c().mo2973a(f5546s, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        runnableC1528j.m6212d();
        AbstractC0592j.m2970c().mo2973a(f5546s, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    @Override // p150k2.InterfaceC3346a
    /* renamed from: a */
    public void mo6153a(String str) {
        synchronized (this.f5557r) {
            this.f5552m.remove(str);
            m6163m();
        }
    }

    @Override // p150k2.InterfaceC3346a
    /* renamed from: b */
    public void mo6154b(String str, C0587e c0587e) {
        synchronized (this.f5557r) {
            AbstractC0592j.m2970c().mo2975d(f5546s, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            RunnableC1528j remove = this.f5553n.remove(str);
            if (remove != null) {
                if (this.f5547h == null) {
                    PowerManager.WakeLock m13056b = C3509j.m13056b(this.f5548i, "ProcessorForegroundLck");
                    this.f5547h = m13056b;
                    m13056b.acquire();
                }
                this.f5552m.put(str, remove);
                C5782a.startForegroundService(this.f5548i, C0430a.m2205d(this.f5548i, str, c0587e));
            }
        }
    }

    @Override // p044d2.InterfaceC1520b
    /* renamed from: c */
    public void mo2171c(String str, boolean z10) {
        synchronized (this.f5557r) {
            this.f5553n.remove(str);
            AbstractC0592j.m2970c().mo2973a(f5546s, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator<InterfaceC1520b> it = this.f5556q.iterator();
            while (it.hasNext()) {
                it.next().mo2171c(str, z10);
            }
        }
    }

    /* renamed from: d */
    public void m6155d(InterfaceC1520b interfaceC1520b) {
        synchronized (this.f5557r) {
            this.f5556q.add(interfaceC1520b);
        }
    }

    /* renamed from: f */
    public boolean m6156f(String str) {
        boolean contains;
        synchronized (this.f5557r) {
            contains = this.f5555p.contains(str);
        }
        return contains;
    }

    /* renamed from: g */
    public boolean m6157g(String str) {
        boolean z10;
        synchronized (this.f5557r) {
            z10 = this.f5553n.containsKey(str) || this.f5552m.containsKey(str);
        }
        return z10;
    }

    /* renamed from: h */
    public boolean m6158h(String str) {
        boolean containsKey;
        synchronized (this.f5557r) {
            containsKey = this.f5552m.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: i */
    public void m6159i(InterfaceC1520b interfaceC1520b) {
        synchronized (this.f5557r) {
            this.f5556q.remove(interfaceC1520b);
        }
    }

    /* renamed from: j */
    public boolean m6160j(String str) {
        return m6161k(str, null);
    }

    /* renamed from: k */
    public boolean m6161k(String str, WorkerParameters.C0415a c0415a) {
        synchronized (this.f5557r) {
            if (m6157g(str)) {
                AbstractC0592j.m2970c().mo2973a(f5546s, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            RunnableC1528j m6224a = new RunnableC1528j.c(this.f5548i, this.f5549j, this.f5550k, this, this.f5551l, str).m6226c(this.f5554o).m6225b(c0415a).m6224a();
            InterfaceFutureC3445f<Boolean> m6210b = m6224a.m6210b();
            m6210b.mo12809b(new a(this, str, m6210b), this.f5550k.mo14610a());
            this.f5553n.put(str, m6224a);
            this.f5550k.mo14612c().execute(m6224a);
            AbstractC0592j.m2970c().mo2973a(f5546s, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean m6162l(String str) {
        boolean m6152e;
        synchronized (this.f5557r) {
            boolean z10 = true;
            AbstractC0592j.m2970c().mo2973a(f5546s, String.format("Processor cancelling %s", str), new Throwable[0]);
            this.f5555p.add(str);
            RunnableC1528j remove = this.f5552m.remove(str);
            if (remove == null) {
                z10 = false;
            }
            if (remove == null) {
                remove = this.f5553n.remove(str);
            }
            m6152e = m6152e(str, remove);
            if (z10) {
                m6163m();
            }
        }
        return m6152e;
    }

    /* renamed from: m */
    public final void m6163m() {
        synchronized (this.f5557r) {
            if (!(!this.f5552m.isEmpty())) {
                try {
                    this.f5548i.startService(C0430a.m2206f(this.f5548i));
                } catch (Throwable th) {
                    AbstractC0592j.m2970c().mo2974b(f5546s, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f5547h;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f5547h = null;
                }
            }
        }
    }

    /* renamed from: n */
    public boolean m6164n(String str) {
        boolean m6152e;
        synchronized (this.f5557r) {
            AbstractC0592j.m2970c().mo2973a(f5546s, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            m6152e = m6152e(str, this.f5552m.remove(str));
        }
        return m6152e;
    }

    /* renamed from: o */
    public boolean m6165o(String str) {
        boolean m6152e;
        synchronized (this.f5557r) {
            AbstractC0592j.m2970c().mo2973a(f5546s, String.format("Processor stopping background work %s", str), new Throwable[0]);
            m6152e = m6152e(str, this.f5553n.remove(str));
        }
        return m6152e;
    }
}
