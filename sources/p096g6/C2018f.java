package p096g6;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC1164a;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p064e6.C1667b;
import p064e6.C1673e;
import p079f6.AbstractC1845e;
import p096g6.C2034j;
import p108h6.AbstractC2364i;
import p108h6.C2374l0;
import p108h6.C2385p;
import p108h6.C2397t;
import p108h6.C2400u;
import p108h6.C2406w;
import p108h6.C2409x;
import p108h6.InterfaceC2412y;
import p207o6.C3939h;
import p285u.C4772b;

/* renamed from: g6.f */
/* loaded from: classes.dex */
public class C2018f implements Handler.Callback {

    /* renamed from: B */
    public static C2018f f8015B;

    /* renamed from: l */
    public C2406w f8022l;

    /* renamed from: m */
    public InterfaceC2412y f8023m;

    /* renamed from: n */
    public final Context f8024n;

    /* renamed from: o */
    public final C1673e f8025o;

    /* renamed from: p */
    public final C2374l0 f8026p;

    /* renamed from: w */
    public final Handler f8033w;

    /* renamed from: x */
    public volatile boolean f8034x;

    /* renamed from: y */
    public static final Status f8016y = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: z */
    public static final Status f8017z = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: A */
    public static final Object f8014A = new Object();

    /* renamed from: h */
    public long f8018h = 5000;

    /* renamed from: i */
    public long f8019i = 120000;

    /* renamed from: j */
    public long f8020j = 10000;

    /* renamed from: k */
    public boolean f8021k = false;

    /* renamed from: q */
    public final AtomicInteger f8027q = new AtomicInteger(1);

    /* renamed from: r */
    public final AtomicInteger f8028r = new AtomicInteger(0);

    /* renamed from: s */
    public final Map f8029s = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: t */
    public C2003b0 f8030t = null;

    /* renamed from: u */
    public final Set f8031u = new C4772b();

    /* renamed from: v */
    public final Set f8032v = new C4772b();

    public C2018f(Context context, Looper looper, C1673e c1673e) {
        this.f8034x = true;
        this.f8024n = context;
        zau zauVar = new zau(looper, this);
        this.f8033w = zauVar;
        this.f8025o = c1673e;
        this.f8026p = new C2374l0(c1673e);
        if (C3939h.m14939a(context)) {
            this.f8034x = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    /* renamed from: a */
    public static void m8114a() {
        synchronized (f8014A) {
            C2018f c2018f = f8015B;
            if (c2018f != null) {
                c2018f.f8028r.incrementAndGet();
                Handler handler = c2018f.f8033w;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    /* renamed from: i */
    public static Status m8116i(C2002b c2002b, C1667b c1667b) {
        return new Status(c1667b, "API: " + c2002b.m8085b() + " is not available on this device. Connection failed with: " + String.valueOf(c1667b));
    }

    /* renamed from: y */
    public static C2018f m8126y(Context context) {
        C2018f c2018f;
        synchronized (f8014A) {
            if (f8015B == null) {
                f8015B = new C2018f(context.getApplicationContext(), AbstractC2364i.m9563d().getLooper(), C1673e.m6693m());
            }
            c2018f = f8015B;
        }
        return c2018f;
    }

    /* renamed from: A */
    public final Task m8128A(AbstractC1845e abstractC1845e) {
        C2007c0 c2007c0 = new C2007c0(abstractC1845e.getApiKey());
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(14, c2007c0));
        return c2007c0.m8099b().getTask();
    }

    /* renamed from: B */
    public final Task m8129B(AbstractC1845e abstractC1845e, AbstractC2050o abstractC2050o, AbstractC2077x abstractC2077x, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m8144m(taskCompletionSource, abstractC2050o.m8227e(), abstractC1845e);
        C2070u1 c2070u1 = new C2070u1(new C2000a1(abstractC2050o, abstractC2077x, runnable), taskCompletionSource);
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(8, new C2084z0(c2070u1, this.f8028r.get(), abstractC1845e)));
        return taskCompletionSource.getTask();
    }

    /* renamed from: C */
    public final Task m8130C(AbstractC1845e abstractC1845e, C2034j.a aVar, int i10) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m8144m(taskCompletionSource, i10, abstractC1845e);
        C2076w1 c2076w1 = new C2076w1(aVar, taskCompletionSource);
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(13, new C2084z0(c2076w1, this.f8028r.get(), abstractC1845e)));
        return taskCompletionSource.getTask();
    }

    /* renamed from: H */
    public final void m8131H(AbstractC1845e abstractC1845e, int i10, AbstractC1164a abstractC1164a) {
        C2067t1 c2067t1 = new C2067t1(i10, abstractC1164a);
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(4, new C2084z0(c2067t1, this.f8028r.get(), abstractC1845e)));
    }

    /* renamed from: I */
    public final void m8132I(AbstractC1845e abstractC1845e, int i10, AbstractC2071v abstractC2071v, TaskCompletionSource taskCompletionSource, InterfaceC2065t interfaceC2065t) {
        m8144m(taskCompletionSource, abstractC2071v.m8268d(), abstractC1845e);
        C2073v1 c2073v1 = new C2073v1(i10, abstractC2071v, taskCompletionSource, interfaceC2065t);
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(4, new C2084z0(c2073v1, this.f8028r.get(), abstractC1845e)));
    }

    /* renamed from: J */
    public final void m8133J(C2385p c2385p, int i10, long j10, int i11) {
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(18, new C2075w0(c2385p, i10, j10, i11)));
    }

    /* renamed from: K */
    public final void m8134K(C1667b c1667b, int i10) {
        if (m8140h(c1667b, i10)) {
            return;
        }
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, c1667b));
    }

    /* renamed from: b */
    public final void m8135b() {
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: c */
    public final void m8136c(AbstractC1845e abstractC1845e) {
        Handler handler = this.f8033w;
        handler.sendMessage(handler.obtainMessage(7, abstractC1845e));
    }

    /* renamed from: d */
    public final void m8137d(C2003b0 c2003b0) {
        synchronized (f8014A) {
            if (this.f8030t != c2003b0) {
                this.f8030t = c2003b0;
                this.f8031u.clear();
            }
            this.f8031u.addAll(c2003b0.m8089i());
        }
    }

    /* renamed from: e */
    public final void m8138e(C2003b0 c2003b0) {
        synchronized (f8014A) {
            if (this.f8030t == c2003b0) {
                this.f8030t = null;
                this.f8031u.clear();
            }
        }
    }

    /* renamed from: g */
    public final boolean m8139g() {
        if (this.f8021k) {
            return false;
        }
        C2400u m9626a = C2397t.m9625b().m9626a();
        if (m9626a != null && !m9626a.m9637K()) {
            return false;
        }
        int m9581a = this.f8026p.m9581a(this.f8024n, 203400000);
        return m9581a == -1 || m9581a == 0;
    }

    /* renamed from: h */
    public final boolean m8140h(C1667b c1667b, int i10) {
        return this.f8025o.m6711w(this.f8024n, c1667b, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C2002b c2002b;
        boolean m8205q;
        TaskCompletionSource m8099b;
        Boolean valueOf;
        C2002b c2002b2;
        C2002b c2002b3;
        C2002b c2002b4;
        C2002b c2002b5;
        int i10 = message.what;
        C2039k0 c2039k0 = null;
        switch (i10) {
            case 1:
                this.f8020j = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f8033w.removeMessages(12);
                for (C2002b c2002b6 : this.f8029s.keySet()) {
                    Handler handler = this.f8033w;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c2002b6), this.f8020j);
                }
                return true;
            case 2:
                C2082y1 c2082y1 = (C2082y1) message.obj;
                Iterator it = c2082y1.m8283a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C2002b c2002b7 = (C2002b) it.next();
                        C2039k0 c2039k02 = (C2039k0) this.f8029s.get(c2002b7);
                        if (c2039k02 == null) {
                            c2082y1.m8284b(c2002b7, new C1667b(13), null);
                        } else if (c2039k02.m8189O()) {
                            c2082y1.m8284b(c2002b7, C1667b.f6228l, c2039k02.m8209v().getEndpointPackageName());
                        } else {
                            C1667b m8208t = c2039k02.m8208t();
                            if (m8208t != null) {
                                c2082y1.m8284b(c2002b7, m8208t, null);
                            } else {
                                c2039k02.m8185J(c2082y1);
                                c2039k02.m8180E();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (C2039k0 c2039k03 : this.f8029s.values()) {
                    c2039k03.m8179D();
                    c2039k03.m8180E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                C2084z0 c2084z0 = (C2084z0) message.obj;
                C2039k0 c2039k04 = (C2039k0) this.f8029s.get(c2084z0.f8183c.getApiKey());
                if (c2039k04 == null) {
                    c2039k04 = m8141j(c2084z0.f8183c);
                }
                if (!c2039k04.m8190P() || this.f8028r.get() == c2084z0.f8182b) {
                    c2039k04.m8181F(c2084z0.f8181a);
                } else {
                    c2084z0.f8181a.mo8243a(f8016y);
                    c2039k04.m8187L();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                C1667b c1667b = (C1667b) message.obj;
                Iterator it2 = this.f8029s.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C2039k0 c2039k05 = (C2039k0) it2.next();
                        if (c2039k05.m8206r() == i11) {
                            c2039k0 = c2039k05;
                        }
                    }
                }
                if (c2039k0 == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (c1667b.m6677I() == 13) {
                    c2039k0.m8195f(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f8025o.mo6696e(c1667b.m6677I()) + ": " + c1667b.m6678J()));
                } else {
                    c2002b = c2039k0.f8069c;
                    c2039k0.m8195f(m8116i(c2002b, c1667b));
                }
                return true;
            case 6:
                if (this.f8024n.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2006c.m8092c((Application) this.f8024n.getApplicationContext());
                    ComponentCallbacks2C2006c.m8091b().m8093a(new C2019f0(this));
                    if (!ComponentCallbacks2C2006c.m8091b().m8095e(true)) {
                        this.f8020j = 300000L;
                    }
                }
                return true;
            case 7:
                m8141j((AbstractC1845e) message.obj);
                return true;
            case 9:
                if (this.f8029s.containsKey(message.obj)) {
                    ((C2039k0) this.f8029s.get(message.obj)).m8186K();
                }
                return true;
            case 10:
                Iterator it3 = this.f8032v.iterator();
                while (it3.hasNext()) {
                    C2039k0 c2039k06 = (C2039k0) this.f8029s.remove((C2002b) it3.next());
                    if (c2039k06 != null) {
                        c2039k06.m8187L();
                    }
                }
                this.f8032v.clear();
                return true;
            case 11:
                if (this.f8029s.containsKey(message.obj)) {
                    ((C2039k0) this.f8029s.get(message.obj)).m8188M();
                }
                return true;
            case 12:
                if (this.f8029s.containsKey(message.obj)) {
                    ((C2039k0) this.f8029s.get(message.obj)).m8191a();
                }
                return true;
            case 14:
                C2007c0 c2007c0 = (C2007c0) message.obj;
                C2002b m8098a = c2007c0.m8098a();
                if (this.f8029s.containsKey(m8098a)) {
                    m8205q = ((C2039k0) this.f8029s.get(m8098a)).m8205q(false);
                    m8099b = c2007c0.m8099b();
                    valueOf = Boolean.valueOf(m8205q);
                } else {
                    m8099b = c2007c0.m8099b();
                    valueOf = Boolean.FALSE;
                }
                m8099b.setResult(valueOf);
                return true;
            case 15:
                C2045m0 c2045m0 = (C2045m0) message.obj;
                Map map = this.f8029s;
                c2002b2 = c2045m0.f8100a;
                if (map.containsKey(c2002b2)) {
                    Map map2 = this.f8029s;
                    c2002b3 = c2045m0.f8100a;
                    C2039k0.m8172B((C2039k0) map2.get(c2002b3), c2045m0);
                }
                return true;
            case 16:
                C2045m0 c2045m02 = (C2045m0) message.obj;
                Map map3 = this.f8029s;
                c2002b4 = c2045m02.f8100a;
                if (map3.containsKey(c2002b4)) {
                    Map map4 = this.f8029s;
                    c2002b5 = c2045m02.f8100a;
                    C2039k0.m8173C((C2039k0) map4.get(c2002b5), c2045m02);
                }
                return true;
            case 17:
                m8143l();
                return true;
            case 18:
                C2075w0 c2075w0 = (C2075w0) message.obj;
                if (c2075w0.f8164c == 0) {
                    m8142k().mo9649a(new C2406w(c2075w0.f8163b, Arrays.asList(c2075w0.f8162a)));
                } else {
                    C2406w c2406w = this.f8022l;
                    if (c2406w != null) {
                        List m9645J = c2406w.m9645J();
                        if (c2406w.m9644I() != c2075w0.f8163b || (m9645J != null && m9645J.size() >= c2075w0.f8165d)) {
                            this.f8033w.removeMessages(17);
                            m8143l();
                        } else {
                            this.f8022l.m9646K(c2075w0.f8162a);
                        }
                    }
                    if (this.f8022l == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(c2075w0.f8162a);
                        this.f8022l = new C2406w(c2075w0.f8163b, arrayList);
                        Handler handler2 = this.f8033w;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), c2075w0.f8164c);
                    }
                }
                return true;
            case 19:
                this.f8021k = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    /* renamed from: j */
    public final C2039k0 m8141j(AbstractC1845e abstractC1845e) {
        C2002b apiKey = abstractC1845e.getApiKey();
        C2039k0 c2039k0 = (C2039k0) this.f8029s.get(apiKey);
        if (c2039k0 == null) {
            c2039k0 = new C2039k0(this, abstractC1845e);
            this.f8029s.put(apiKey, c2039k0);
        }
        if (c2039k0.m8190P()) {
            this.f8032v.add(apiKey);
        }
        c2039k0.m8180E();
        return c2039k0;
    }

    /* renamed from: k */
    public final InterfaceC2412y m8142k() {
        if (this.f8023m == null) {
            this.f8023m = C2409x.m9647a(this.f8024n);
        }
        return this.f8023m;
    }

    /* renamed from: l */
    public final void m8143l() {
        C2406w c2406w = this.f8022l;
        if (c2406w != null) {
            if (c2406w.m9644I() > 0 || m8139g()) {
                m8142k().mo9649a(c2406w);
            }
            this.f8022l = null;
        }
    }

    /* renamed from: m */
    public final void m8144m(TaskCompletionSource taskCompletionSource, int i10, AbstractC1845e abstractC1845e) {
        C2072v0 m8276a;
        if (i10 == 0 || (m8276a = C2072v0.m8276a(this, i10, abstractC1845e.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        Handler handler = this.f8033w;
        handler.getClass();
        task.addOnCompleteListener(new Executor() { // from class: g6.e0

            /* renamed from: h */
            public final /* synthetic */ Handler f8013h;

            public /* synthetic */ ExecutorC2015e0(Handler handler2) {
                r1 = handler2;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                r1.post(runnable);
            }
        }, m8276a);
    }

    /* renamed from: n */
    public final int m8145n() {
        return this.f8027q.getAndIncrement();
    }

    /* renamed from: x */
    public final C2039k0 m8146x(C2002b c2002b) {
        return (C2039k0) this.f8029s.get(c2002b);
    }
}
