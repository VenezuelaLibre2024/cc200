package p096g6;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p064e6.C1667b;
import p064e6.C1671d;
import p064e6.C1673e;
import p079f6.AbstractC1845e;
import p079f6.AbstractC1846f;
import p079f6.C1841a;
import p079f6.C1858r;
import p096g6.C2034j;
import p108h6.C2374l0;
import p108h6.C2388q;
import p108h6.C2394s;
import p139j6.C3252e;
import p207o6.C3933b;
import p285u.C4771a;

/* renamed from: g6.k0 */
/* loaded from: classes.dex */
public final class C2039k0 implements AbstractC1846f.a, AbstractC1846f.b {

    /* renamed from: b */
    public final C1841a.f f8068b;

    /* renamed from: c */
    public final C2002b f8069c;

    /* renamed from: f */
    public final C1999a0 f8070f;

    /* renamed from: i */
    public final int f8073i;

    /* renamed from: j */
    public final BinderC2043l1 f8074j;

    /* renamed from: k */
    public boolean f8075k;

    /* renamed from: o */
    public final /* synthetic */ C2018f f8079o;

    /* renamed from: a */
    public final Queue f8067a = new LinkedList();

    /* renamed from: g */
    public final Set f8071g = new HashSet();

    /* renamed from: h */
    public final Map f8072h = new HashMap();

    /* renamed from: l */
    public final List f8076l = new ArrayList();

    /* renamed from: m */
    public C1667b f8077m = null;

    /* renamed from: n */
    public int f8078n = 0;

    public C2039k0(C2018f c2018f, AbstractC1845e abstractC1845e) {
        Handler handler;
        Context context;
        Handler handler2;
        this.f8079o = c2018f;
        handler = c2018f.f8033w;
        C1841a.f zab = abstractC1845e.zab(handler.getLooper(), this);
        this.f8068b = zab;
        this.f8069c = abstractC1845e.getApiKey();
        this.f8070f = new C1999a0();
        this.f8073i = abstractC1845e.zaa();
        if (!zab.requiresSignIn()) {
            this.f8074j = null;
            return;
        }
        context = c2018f.f8024n;
        handler2 = c2018f.f8033w;
        this.f8074j = abstractC1845e.zac(context, handler2);
    }

    /* renamed from: B */
    public static /* bridge */ /* synthetic */ void m8172B(C2039k0 c2039k0, C2045m0 c2045m0) {
        if (c2039k0.f8076l.contains(c2045m0) && !c2039k0.f8075k) {
            if (c2039k0.f8068b.isConnected()) {
                c2039k0.m8197i();
            } else {
                c2039k0.m8180E();
            }
        }
    }

    /* renamed from: C */
    public static /* bridge */ /* synthetic */ void m8173C(C2039k0 c2039k0, C2045m0 c2045m0) {
        Handler handler;
        Handler handler2;
        C1671d c1671d;
        C1671d[] mo8264g;
        if (c2039k0.f8076l.remove(c2045m0)) {
            handler = c2039k0.f8079o.f8033w;
            handler.removeMessages(15, c2045m0);
            handler2 = c2039k0.f8079o.f8033w;
            handler2.removeMessages(16, c2045m0);
            c1671d = c2045m0.f8101b;
            ArrayList arrayList = new ArrayList(c2039k0.f8067a.size());
            for (AbstractC2079x1 abstractC2079x1 : c2039k0.f8067a) {
                if ((abstractC2079x1 instanceof AbstractC2066t0) && (mo8264g = ((AbstractC2066t0) abstractC2079x1).mo8264g(c2039k0)) != null && C3933b.m14919b(mo8264g, c1671d)) {
                    arrayList.add(abstractC2079x1);
                }
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                AbstractC2079x1 abstractC2079x12 = (AbstractC2079x1) arrayList.get(i10);
                c2039k0.f8067a.remove(abstractC2079x12);
                abstractC2079x12.mo8244b(new C1858r(c1671d));
            }
        }
    }

    /* renamed from: N */
    public static /* bridge */ /* synthetic */ boolean m8174N(C2039k0 c2039k0, boolean z10) {
        return c2039k0.m8205q(false);
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ C2002b m8176w(C2039k0 c2039k0) {
        return c2039k0.f8069c;
    }

    /* renamed from: y */
    public static /* bridge */ /* synthetic */ void m8177y(C2039k0 c2039k0, Status status) {
        c2039k0.m8195f(status);
    }

    /* renamed from: D */
    public final void m8179D() {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        this.f8077m = null;
    }

    /* renamed from: E */
    public final void m8180E() {
        Handler handler;
        C1667b c1667b;
        C2374l0 c2374l0;
        Context context;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        if (this.f8068b.isConnected() || this.f8068b.isConnecting()) {
            return;
        }
        try {
            C2018f c2018f = this.f8079o;
            c2374l0 = c2018f.f8026p;
            context = c2018f.f8024n;
            int m9582b = c2374l0.m9582b(context, this.f8068b);
            if (m9582b != 0) {
                C1667b c1667b2 = new C1667b(m9582b, null);
                Log.w("GoogleApiManager", "The service for " + this.f8068b.getClass().getName() + " is not available: " + c1667b2.toString());
                m8183H(c1667b2, null);
                return;
            }
            C2018f c2018f2 = this.f8079o;
            C1841a.f fVar = this.f8068b;
            C2051o0 c2051o0 = new C2051o0(c2018f2, fVar, this.f8069c);
            if (fVar.requiresSignIn()) {
                ((BinderC2043l1) C2394s.m9619l(this.f8074j)).m8219O1(c2051o0);
            }
            try {
                this.f8068b.connect(c2051o0);
            } catch (SecurityException e10) {
                e = e10;
                c1667b = new C1667b(10);
                m8183H(c1667b, e);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            c1667b = new C1667b(10);
        }
    }

    /* renamed from: F */
    public final void m8181F(AbstractC2079x1 abstractC2079x1) {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        if (this.f8068b.isConnected()) {
            if (m8203o(abstractC2079x1)) {
                m8200l();
                return;
            } else {
                this.f8067a.add(abstractC2079x1);
                return;
            }
        }
        this.f8067a.add(abstractC2079x1);
        C1667b c1667b = this.f8077m;
        if (c1667b == null || !c1667b.m6680L()) {
            m8180E();
        } else {
            m8183H(this.f8077m, null);
        }
    }

    /* renamed from: G */
    public final void m8182G() {
        this.f8078n++;
    }

    /* renamed from: H */
    public final void m8183H(C1667b c1667b, Exception exc) {
        Handler handler;
        C2374l0 c2374l0;
        boolean z10;
        Status m8116i;
        Status m8116i2;
        Status m8116i3;
        Handler handler2;
        Handler handler3;
        long j10;
        Handler handler4;
        Status status;
        Handler handler5;
        Handler handler6;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        BinderC2043l1 binderC2043l1 = this.f8074j;
        if (binderC2043l1 != null) {
            binderC2043l1.m8220P1();
        }
        m8179D();
        c2374l0 = this.f8079o.f8026p;
        c2374l0.m9583c();
        m8193d(c1667b);
        if ((this.f8068b instanceof C3252e) && c1667b.m6677I() != 24) {
            this.f8079o.f8021k = true;
            C2018f c2018f = this.f8079o;
            handler5 = c2018f.f8033w;
            handler6 = c2018f.f8033w;
            handler5.sendMessageDelayed(handler6.obtainMessage(19), 300000L);
        }
        if (c1667b.m6677I() == 4) {
            status = C2018f.f8017z;
            m8195f(status);
            return;
        }
        if (this.f8067a.isEmpty()) {
            this.f8077m = c1667b;
            return;
        }
        if (exc != null) {
            handler4 = this.f8079o.f8033w;
            C2394s.m9611d(handler4);
            m8196h(null, exc, false);
            return;
        }
        z10 = this.f8079o.f8034x;
        if (!z10) {
            m8116i = C2018f.m8116i(this.f8069c, c1667b);
            m8195f(m8116i);
            return;
        }
        m8116i2 = C2018f.m8116i(this.f8069c, c1667b);
        m8196h(m8116i2, null, true);
        if (this.f8067a.isEmpty() || m8204p(c1667b) || this.f8079o.m8140h(c1667b, this.f8073i)) {
            return;
        }
        if (c1667b.m6677I() == 18) {
            this.f8075k = true;
        }
        if (!this.f8075k) {
            m8116i3 = C2018f.m8116i(this.f8069c, c1667b);
            m8195f(m8116i3);
            return;
        }
        C2018f c2018f2 = this.f8079o;
        handler2 = c2018f2.f8033w;
        handler3 = c2018f2.f8033w;
        Message obtain = Message.obtain(handler3, 9, this.f8069c);
        j10 = this.f8079o.f8018h;
        handler2.sendMessageDelayed(obtain, j10);
    }

    /* renamed from: I */
    public final void m8184I(C1667b c1667b) {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        C1841a.f fVar = this.f8068b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c1667b));
        m8183H(c1667b, null);
    }

    /* renamed from: J */
    public final void m8185J(C2082y1 c2082y1) {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        this.f8071g.add(c2082y1);
    }

    /* renamed from: K */
    public final void m8186K() {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        if (this.f8075k) {
            m8180E();
        }
    }

    /* renamed from: L */
    public final void m8187L() {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        m8195f(C2018f.f8016y);
        this.f8070f.m8080f();
        for (C2034j.a aVar : (C2034j.a[]) this.f8072h.keySet().toArray(new C2034j.a[0])) {
            m8181F(new C2076w1(aVar, new TaskCompletionSource()));
        }
        m8193d(new C1667b(4));
        if (this.f8068b.isConnected()) {
            this.f8068b.onUserSignOut(new C2035j0(this));
        }
    }

    /* renamed from: M */
    public final void m8188M() {
        Handler handler;
        C1673e c1673e;
        Context context;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        if (this.f8075k) {
            m8202n();
            C2018f c2018f = this.f8079o;
            c1673e = c2018f.f8025o;
            context = c2018f.f8024n;
            m8195f(c1673e.mo6697g(context) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f8068b.disconnect("Timing out connection while resuming.");
        }
    }

    /* renamed from: O */
    public final boolean m8189O() {
        return this.f8068b.isConnected();
    }

    /* renamed from: P */
    public final boolean m8190P() {
        return this.f8068b.requiresSignIn();
    }

    /* renamed from: a */
    public final boolean m8191a() {
        return m8205q(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final C1671d m8192b(C1671d[] c1671dArr) {
        if (c1671dArr != null && c1671dArr.length != 0) {
            C1671d[] availableFeatures = this.f8068b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C1671d[0];
            }
            C4771a c4771a = new C4771a(availableFeatures.length);
            for (C1671d c1671d : availableFeatures) {
                c4771a.put(c1671d.m6691I(), Long.valueOf(c1671d.m6692J()));
            }
            for (C1671d c1671d2 : c1671dArr) {
                Long l10 = (Long) c4771a.get(c1671d2.m6691I());
                if (l10 == null || l10.longValue() < c1671d2.m6692J()) {
                    return c1671d2;
                }
            }
        }
        return null;
    }

    @Override // p096g6.InterfaceC2014e
    /* renamed from: c */
    public final void mo8108c(int i10) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f8079o.f8033w;
        if (myLooper == handler.getLooper()) {
            m8199k(i10);
        } else {
            handler2 = this.f8079o.f8033w;
            handler2.post(new RunnableC2027h0(this, i10));
        }
    }

    /* renamed from: d */
    public final void m8193d(C1667b c1667b) {
        Iterator it = this.f8071g.iterator();
        while (it.hasNext()) {
            ((C2082y1) it.next()).m8284b(this.f8069c, c1667b, C2388q.m9592b(c1667b, C1667b.f6228l) ? this.f8068b.getEndpointPackageName() : null);
        }
        this.f8071g.clear();
    }

    @Override // p096g6.InterfaceC2044m
    /* renamed from: e */
    public final void mo8194e(C1667b c1667b) {
        m8183H(c1667b, null);
    }

    /* renamed from: f */
    public final void m8195f(Status status) {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        m8196h(status, null, false);
    }

    @Override // p096g6.InterfaceC2014e
    /* renamed from: g */
    public final void mo8109g(Bundle bundle) {
        Handler handler;
        Handler handler2;
        Looper myLooper = Looper.myLooper();
        handler = this.f8079o.f8033w;
        if (myLooper == handler.getLooper()) {
            m8198j();
        } else {
            handler2 = this.f8079o.f8033w;
            handler2.post(new RunnableC2023g0(this));
        }
    }

    /* renamed from: h */
    public final void m8196h(Status status, Exception exc, boolean z10) {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f8067a.iterator();
        while (it.hasNext()) {
            AbstractC2079x1 abstractC2079x1 = (AbstractC2079x1) it.next();
            if (!z10 || abstractC2079x1.f8169a == 2) {
                if (status != null) {
                    abstractC2079x1.mo8243a(status);
                } else {
                    abstractC2079x1.mo8244b(exc);
                }
                it.remove();
            }
        }
    }

    /* renamed from: i */
    public final void m8197i() {
        ArrayList arrayList = new ArrayList(this.f8067a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC2079x1 abstractC2079x1 = (AbstractC2079x1) arrayList.get(i10);
            if (!this.f8068b.isConnected()) {
                return;
            }
            if (m8203o(abstractC2079x1)) {
                this.f8067a.remove(abstractC2079x1);
            }
        }
    }

    /* renamed from: j */
    public final void m8198j() {
        m8179D();
        m8193d(C1667b.f6228l);
        m8202n();
        Iterator it = this.f8072h.values().iterator();
        while (it.hasNext()) {
            C2000a1 c2000a1 = (C2000a1) it.next();
            if (m8192b(c2000a1.f7985a.m8226c()) == null) {
                try {
                    c2000a1.f7985a.mo8100d(this.f8068b, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    mo8108c(3);
                    this.f8068b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                }
            }
            it.remove();
        }
        m8197i();
        m8200l();
    }

    /* renamed from: k */
    public final void m8199k(int i10) {
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        C2374l0 c2374l0;
        m8179D();
        this.f8075k = true;
        this.f8070f.m8079e(i10, this.f8068b.getLastDisconnectMessage());
        C2018f c2018f = this.f8079o;
        handler = c2018f.f8033w;
        handler2 = c2018f.f8033w;
        Message obtain = Message.obtain(handler2, 9, this.f8069c);
        j10 = this.f8079o.f8018h;
        handler.sendMessageDelayed(obtain, j10);
        C2018f c2018f2 = this.f8079o;
        handler3 = c2018f2.f8033w;
        handler4 = c2018f2.f8033w;
        Message obtain2 = Message.obtain(handler4, 11, this.f8069c);
        j11 = this.f8079o.f8019i;
        handler3.sendMessageDelayed(obtain2, j11);
        c2374l0 = this.f8079o.f8026p;
        c2374l0.m9583c();
        Iterator it = this.f8072h.values().iterator();
        while (it.hasNext()) {
            ((C2000a1) it.next()).f7987c.run();
        }
    }

    /* renamed from: l */
    public final void m8200l() {
        Handler handler;
        Handler handler2;
        Handler handler3;
        long j10;
        handler = this.f8079o.f8033w;
        handler.removeMessages(12, this.f8069c);
        C2018f c2018f = this.f8079o;
        handler2 = c2018f.f8033w;
        handler3 = c2018f.f8033w;
        Message obtainMessage = handler3.obtainMessage(12, this.f8069c);
        j10 = this.f8079o.f8020j;
        handler2.sendMessageDelayed(obtainMessage, j10);
    }

    /* renamed from: m */
    public final void m8201m(AbstractC2079x1 abstractC2079x1) {
        abstractC2079x1.mo8265d(this.f8070f, m8190P());
        try {
            abstractC2079x1.mo8245c(this);
        } catch (DeadObjectException unused) {
            mo8108c(1);
            this.f8068b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* renamed from: n */
    public final void m8202n() {
        Handler handler;
        Handler handler2;
        if (this.f8075k) {
            handler = this.f8079o.f8033w;
            handler.removeMessages(11, this.f8069c);
            handler2 = this.f8079o.f8033w;
            handler2.removeMessages(9, this.f8069c);
            this.f8075k = false;
        }
    }

    /* renamed from: o */
    public final boolean m8203o(AbstractC2079x1 abstractC2079x1) {
        boolean z10;
        Handler handler;
        Handler handler2;
        long j10;
        Handler handler3;
        Handler handler4;
        long j11;
        Handler handler5;
        Handler handler6;
        Handler handler7;
        long j12;
        if (!(abstractC2079x1 instanceof AbstractC2066t0)) {
            m8201m(abstractC2079x1);
            return true;
        }
        AbstractC2066t0 abstractC2066t0 = (AbstractC2066t0) abstractC2079x1;
        C1671d m8192b = m8192b(abstractC2066t0.mo8264g(this));
        if (m8192b == null) {
            m8201m(abstractC2079x1);
            return true;
        }
        Log.w("GoogleApiManager", this.f8068b.getClass().getName() + " could not execute call because it requires feature (" + m8192b.m6691I() + ", " + m8192b.m6692J() + ").");
        z10 = this.f8079o.f8034x;
        if (!z10 || !abstractC2066t0.mo8263f(this)) {
            abstractC2066t0.mo8244b(new C1858r(m8192b));
            return true;
        }
        C2045m0 c2045m0 = new C2045m0(this.f8069c, m8192b, null);
        int indexOf = this.f8076l.indexOf(c2045m0);
        if (indexOf >= 0) {
            C2045m0 c2045m02 = (C2045m0) this.f8076l.get(indexOf);
            handler5 = this.f8079o.f8033w;
            handler5.removeMessages(15, c2045m02);
            C2018f c2018f = this.f8079o;
            handler6 = c2018f.f8033w;
            handler7 = c2018f.f8033w;
            Message obtain = Message.obtain(handler7, 15, c2045m02);
            j12 = this.f8079o.f8018h;
            handler6.sendMessageDelayed(obtain, j12);
            return false;
        }
        this.f8076l.add(c2045m0);
        C2018f c2018f2 = this.f8079o;
        handler = c2018f2.f8033w;
        handler2 = c2018f2.f8033w;
        Message obtain2 = Message.obtain(handler2, 15, c2045m0);
        j10 = this.f8079o.f8018h;
        handler.sendMessageDelayed(obtain2, j10);
        C2018f c2018f3 = this.f8079o;
        handler3 = c2018f3.f8033w;
        handler4 = c2018f3.f8033w;
        Message obtain3 = Message.obtain(handler4, 16, c2045m0);
        j11 = this.f8079o.f8019i;
        handler3.sendMessageDelayed(obtain3, j11);
        C1667b c1667b = new C1667b(2, null);
        if (m8204p(c1667b)) {
            return false;
        }
        this.f8079o.m8140h(c1667b, this.f8073i);
        return false;
    }

    /* renamed from: p */
    public final boolean m8204p(C1667b c1667b) {
        Object obj;
        C2003b0 c2003b0;
        Set set;
        C2003b0 c2003b02;
        obj = C2018f.f8014A;
        synchronized (obj) {
            C2018f c2018f = this.f8079o;
            c2003b0 = c2018f.f8030t;
            if (c2003b0 != null) {
                set = c2018f.f8031u;
                if (set.contains(this.f8069c)) {
                    c2003b02 = this.f8079o.f8030t;
                    c2003b02.m8106h(c1667b, this.f8073i);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: q */
    public final boolean m8205q(boolean z10) {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        if (!this.f8068b.isConnected() || this.f8072h.size() != 0) {
            return false;
        }
        if (!this.f8070f.m8081g()) {
            this.f8068b.disconnect("Timing out service connection.");
            return true;
        }
        if (z10) {
            m8200l();
        }
        return false;
    }

    /* renamed from: r */
    public final int m8206r() {
        return this.f8073i;
    }

    /* renamed from: s */
    public final int m8207s() {
        return this.f8078n;
    }

    /* renamed from: t */
    public final C1667b m8208t() {
        Handler handler;
        handler = this.f8079o.f8033w;
        C2394s.m9611d(handler);
        return this.f8077m;
    }

    /* renamed from: v */
    public final C1841a.f m8209v() {
        return this.f8068b;
    }

    /* renamed from: x */
    public final Map m8210x() {
        return this.f8072h;
    }
}
