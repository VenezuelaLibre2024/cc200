package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p029c2.AbstractC0592j;
import p044d2.C1522d;
import p044d2.C1527i;
import p044d2.InterfaceC1520b;
import p178m2.C3509j;
import p178m2.C3513n;
import p178m2.ExecutorC3506g;
import p203o2.InterfaceC3840a;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* loaded from: classes.dex */
public class C0426d implements InterfaceC1520b {

    /* renamed from: r */
    public static final String f2054r = AbstractC0592j.m2972f("SystemAlarmDispatcher");

    /* renamed from: h */
    public final Context f2055h;

    /* renamed from: i */
    public final InterfaceC3840a f2056i;

    /* renamed from: j */
    public final C3513n f2057j;

    /* renamed from: k */
    public final C1522d f2058k;

    /* renamed from: l */
    public final C1527i f2059l;

    /* renamed from: m */
    public final C0423a f2060m;

    /* renamed from: n */
    public final Handler f2061n;

    /* renamed from: o */
    public final List<Intent> f2062o;

    /* renamed from: p */
    public Intent f2063p;

    /* renamed from: q */
    public c f2064q;

    /* renamed from: androidx.work.impl.background.systemalarm.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0426d c0426d;
            d dVar;
            synchronized (C0426d.this.f2062o) {
                C0426d c0426d2 = C0426d.this;
                c0426d2.f2063p = c0426d2.f2062o.get(0);
            }
            Intent intent = C0426d.this.f2063p;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C0426d.this.f2063p.getIntExtra("KEY_START_ID", 0);
                AbstractC0592j m2970c = AbstractC0592j.m2970c();
                String str = C0426d.f2054r;
                m2970c.mo2973a(str, String.format("Processing command %s, %s", C0426d.this.f2063p, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock m13056b = C3509j.m13056b(C0426d.this.f2055h, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    AbstractC0592j.m2970c().mo2973a(str, String.format("Acquiring operation wake lock (%s) %s", action, m13056b), new Throwable[0]);
                    m13056b.acquire();
                    C0426d c0426d3 = C0426d.this;
                    c0426d3.f2060m.m2179p(c0426d3.f2063p, intExtra, c0426d3);
                    AbstractC0592j.m2970c().mo2973a(str, String.format("Releasing operation wake lock (%s) %s", action, m13056b), new Throwable[0]);
                    m13056b.release();
                    c0426d = C0426d.this;
                    dVar = new d(c0426d);
                } catch (Throwable th) {
                    try {
                        AbstractC0592j m2970c2 = AbstractC0592j.m2970c();
                        String str2 = C0426d.f2054r;
                        m2970c2.mo2974b(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC0592j.m2970c().mo2973a(str2, String.format("Releasing operation wake lock (%s) %s", action, m13056b), new Throwable[0]);
                        m13056b.release();
                        c0426d = C0426d.this;
                        dVar = new d(c0426d);
                    } catch (Throwable th2) {
                        AbstractC0592j.m2970c().mo2973a(C0426d.f2054r, String.format("Releasing operation wake lock (%s) %s", action, m13056b), new Throwable[0]);
                        m13056b.release();
                        C0426d c0426d4 = C0426d.this;
                        c0426d4.m2196k(new d(c0426d4));
                        throw th2;
                    }
                }
                c0426d.m2196k(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$b */
    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: h */
        public final C0426d f2066h;

        /* renamed from: i */
        public final Intent f2067i;

        /* renamed from: j */
        public final int f2068j;

        public b(C0426d c0426d, Intent intent, int i10) {
            this.f2066h = c0426d;
            this.f2067i = intent;
            this.f2068j = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2066h.m2187a(this.f2067i, this.f2068j);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo2162a();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    /* loaded from: classes.dex */
    public static class d implements Runnable {

        /* renamed from: h */
        public final C0426d f2069h;

        public d(C0426d c0426d) {
            this.f2069h = c0426d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2069h.m2189d();
        }
    }

    public C0426d(Context context) {
        this(context, null, null);
    }

    public C0426d(Context context, C1522d c1522d, C1527i c1527i) {
        Context applicationContext = context.getApplicationContext();
        this.f2055h = applicationContext;
        this.f2060m = new C0423a(applicationContext);
        this.f2057j = new C3513n();
        c1527i = c1527i == null ? C1527i.m6192k(context) : c1527i;
        this.f2059l = c1527i;
        c1522d = c1522d == null ? c1527i.m6197m() : c1522d;
        this.f2058k = c1522d;
        this.f2056i = c1527i.m6200p();
        c1522d.m6155d(this);
        this.f2062o = new ArrayList();
        this.f2063p = null;
        this.f2061n = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public boolean m2187a(Intent intent, int i10) {
        AbstractC0592j m2970c = AbstractC0592j.m2970c();
        String str = f2054r;
        m2970c.mo2973a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        m2188b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC0592j.m2970c().mo2977h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m2194i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f2062o) {
            boolean z10 = this.f2062o.isEmpty() ? false : true;
            this.f2062o.add(intent);
            if (!z10) {
                m2197l();
            }
        }
        return true;
    }

    /* renamed from: b */
    public final void m2188b() {
        if (this.f2061n.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // p044d2.InterfaceC1520b
    /* renamed from: c */
    public void mo2171c(String str, boolean z10) {
        m2196k(new b(this, C0423a.m2166d(this.f2055h, str, z10), 0));
    }

    /* renamed from: d */
    public void m2189d() {
        AbstractC0592j m2970c = AbstractC0592j.m2970c();
        String str = f2054r;
        m2970c.mo2973a(str, "Checking if commands are complete.", new Throwable[0]);
        m2188b();
        synchronized (this.f2062o) {
            if (this.f2063p != null) {
                AbstractC0592j.m2970c().mo2973a(str, String.format("Removing command %s", this.f2063p), new Throwable[0]);
                if (!this.f2062o.remove(0).equals(this.f2063p)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                this.f2063p = null;
            }
            ExecutorC3506g mo14612c = this.f2056i.mo14612c();
            if (!this.f2060m.m2178o() && this.f2062o.isEmpty() && !mo14612c.m13053a()) {
                AbstractC0592j.m2970c().mo2973a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.f2064q;
                if (cVar != null) {
                    cVar.mo2162a();
                }
            } else if (!this.f2062o.isEmpty()) {
                m2197l();
            }
        }
    }

    /* renamed from: e */
    public C1522d m2190e() {
        return this.f2058k;
    }

    /* renamed from: f */
    public InterfaceC3840a m2191f() {
        return this.f2056i;
    }

    /* renamed from: g */
    public C1527i m2192g() {
        return this.f2059l;
    }

    /* renamed from: h */
    public C3513n m2193h() {
        return this.f2057j;
    }

    /* renamed from: i */
    public final boolean m2194i(String str) {
        m2188b();
        synchronized (this.f2062o) {
            Iterator<Intent> it = this.f2062o.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: j */
    public void m2195j() {
        AbstractC0592j.m2970c().mo2973a(f2054r, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2058k.m6159i(this);
        this.f2057j.m13058a();
        this.f2064q = null;
    }

    /* renamed from: k */
    public void m2196k(Runnable runnable) {
        this.f2061n.post(runnable);
    }

    /* renamed from: l */
    public final void m2197l() {
        m2188b();
        PowerManager.WakeLock m13056b = C3509j.m13056b(this.f2055h, "ProcessCommand");
        try {
            m13056b.acquire();
            this.f2059l.m6200p().mo14611b(new a());
        } finally {
            m13056b.release();
        }
    }

    /* renamed from: m */
    public void m2198m(c cVar) {
        if (this.f2064q != null) {
            AbstractC0592j.m2970c().mo2974b(f2054r, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f2064q = cVar;
        }
    }
}
