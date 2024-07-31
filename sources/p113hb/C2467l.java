package p113hb;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import ma.C3602k;
import p129ia.AbstractC2676h;
import p129ia.C2682n;
import p130ib.C2692g;
import p130ib.InterfaceC2701p;

/* renamed from: hb.l */
/* loaded from: classes.dex */
public class C2467l {

    /* renamed from: k */
    public static final String f9871k = "l";

    /* renamed from: a */
    public C2692g f9872a;

    /* renamed from: b */
    public HandlerThread f9873b;

    /* renamed from: c */
    public Handler f9874c;

    /* renamed from: d */
    public C2464i f9875d;

    /* renamed from: e */
    public Handler f9876e;

    /* renamed from: f */
    public Rect f9877f;

    /* renamed from: g */
    public boolean f9878g = false;

    /* renamed from: h */
    public final Object f9879h = new Object();

    /* renamed from: i */
    public final Handler.Callback f9880i = new a();

    /* renamed from: j */
    public final InterfaceC2701p f9881j = new b();

    /* renamed from: hb.l$a */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == C3602k.f12689e) {
                C2467l.this.m9841g((C2475t) message.obj);
                return true;
            }
            if (i10 != C3602k.f12693i) {
                return true;
            }
            C2467l.this.m9842h();
            return true;
        }
    }

    /* renamed from: hb.l$b */
    /* loaded from: classes.dex */
    public class b implements InterfaceC2701p {
        public b() {
        }

        @Override // p130ib.InterfaceC2701p
        /* renamed from: a */
        public void mo9847a(C2475t c2475t) {
            synchronized (C2467l.this.f9879h) {
                if (C2467l.this.f9878g) {
                    C2467l.this.f9874c.obtainMessage(C3602k.f12689e, c2475t).sendToTarget();
                }
            }
        }

        @Override // p130ib.InterfaceC2701p
        /* renamed from: b */
        public void mo9848b(Exception exc) {
            synchronized (C2467l.this.f9879h) {
                if (C2467l.this.f9878g) {
                    C2467l.this.f9874c.obtainMessage(C3602k.f12693i).sendToTarget();
                }
            }
        }
    }

    public C2467l(C2692g c2692g, C2464i c2464i, Handler handler) {
        C2476u.m9873a();
        this.f9872a = c2692g;
        this.f9875d = c2464i;
        this.f9876e = handler;
    }

    /* renamed from: f */
    public AbstractC2676h m9840f(C2475t c2475t) {
        if (this.f9877f == null) {
            return null;
        }
        return c2475t.m9867a();
    }

    /* renamed from: g */
    public final void m9841g(C2475t c2475t) {
        Message obtain;
        long currentTimeMillis = System.currentTimeMillis();
        c2475t.m9870d(this.f9877f);
        AbstractC2676h m9840f = m9840f(c2475t);
        C2682n m9830c = m9840f != null ? this.f9875d.m9830c(m9840f) : null;
        if (m9830c != null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            Log.d(f9871k, "Found barcode in " + (currentTimeMillis2 - currentTimeMillis) + " ms");
            if (this.f9876e != null) {
                obtain = Message.obtain(this.f9876e, C3602k.f12691g, new C2457b(m9830c, c2475t));
                obtain.setData(new Bundle());
                obtain.sendToTarget();
            }
        } else {
            Handler handler = this.f9876e;
            if (handler != null) {
                obtain = Message.obtain(handler, C3602k.f12690f);
                obtain.sendToTarget();
            }
        }
        if (this.f9876e != null) {
            Message.obtain(this.f9876e, C3602k.f12692h, C2457b.m9822f(this.f9875d.m9831d(), c2475t)).sendToTarget();
        }
        m9842h();
    }

    /* renamed from: h */
    public final void m9842h() {
        this.f9872a.m10960v(this.f9881j);
    }

    /* renamed from: i */
    public void m9843i(Rect rect) {
        this.f9877f = rect;
    }

    /* renamed from: j */
    public void m9844j(C2464i c2464i) {
        this.f9875d = c2464i;
    }

    /* renamed from: k */
    public void m9845k() {
        C2476u.m9873a();
        HandlerThread handlerThread = new HandlerThread(f9871k);
        this.f9873b = handlerThread;
        handlerThread.start();
        this.f9874c = new Handler(this.f9873b.getLooper(), this.f9880i);
        this.f9878g = true;
        m9842h();
    }

    /* renamed from: l */
    public void m9846l() {
        C2476u.m9873a();
        synchronized (this.f9879h) {
            this.f9878g = false;
            this.f9874c.removeCallbacksAndMessages(null);
            this.f9873b.quit();
        }
    }
}
