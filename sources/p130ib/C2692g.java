package p130ib;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import ma.C3602k;
import p113hb.C2474s;
import p113hb.C2476u;

/* renamed from: ib.g */
/* loaded from: classes.dex */
public class C2692g {

    /* renamed from: n */
    public static final String f10510n = "g";

    /* renamed from: a */
    public C2696k f10511a;

    /* renamed from: b */
    public C2695j f10512b;

    /* renamed from: c */
    public C2693h f10513c;

    /* renamed from: d */
    public Handler f10514d;

    /* renamed from: e */
    public C2698m f10515e;

    /* renamed from: h */
    public Handler f10518h;

    /* renamed from: f */
    public boolean f10516f = false;

    /* renamed from: g */
    public boolean f10517g = true;

    /* renamed from: i */
    public C2694i f10519i = new C2694i();

    /* renamed from: j */
    public Runnable f10520j = new a();

    /* renamed from: k */
    public Runnable f10521k = new b();

    /* renamed from: l */
    public Runnable f10522l = new c();

    /* renamed from: m */
    public Runnable f10523m = new d();

    /* renamed from: ib.g$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C2692g.f10510n, "Opening camera");
                C2692g.this.f10513c.m10976l();
            } catch (Exception e10) {
                C2692g.this.m10958t(e10);
                Log.e(C2692g.f10510n, "Failed to open camera", e10);
            }
        }
    }

    /* renamed from: ib.g$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C2692g.f10510n, "Configuring camera");
                C2692g.this.f10513c.m10970e();
                if (C2692g.this.f10514d != null) {
                    C2692g.this.f10514d.obtainMessage(C3602k.f12694j, C2692g.this.m10956o()).sendToTarget();
                }
            } catch (Exception e10) {
                C2692g.this.m10958t(e10);
                Log.e(C2692g.f10510n, "Failed to configure camera", e10);
            }
        }
    }

    /* renamed from: ib.g$c */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C2692g.f10510n, "Starting preview");
                C2692g.this.f10513c.m10983s(C2692g.this.f10512b);
                C2692g.this.f10513c.m10985u();
            } catch (Exception e10) {
                C2692g.this.m10958t(e10);
                Log.e(C2692g.f10510n, "Failed to start preview", e10);
            }
        }
    }

    /* renamed from: ib.g$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.d(C2692g.f10510n, "Closing camera");
                C2692g.this.f10513c.m10986v();
                C2692g.this.f10513c.m10969d();
            } catch (Exception e10) {
                Log.e(C2692g.f10510n, "Failed to close camera", e10);
            }
            C2692g.this.f10517g = true;
            C2692g.this.f10514d.sendEmptyMessage(C3602k.f12687c);
            C2692g.this.f10511a.m11003b();
        }
    }

    public C2692g(Context context) {
        C2476u.m9873a();
        this.f10511a = C2696k.m11001d();
        C2693h c2693h = new C2693h(context);
        this.f10513c = c2693h;
        c2693h.m10979o(this.f10519i);
        this.f10518h = new Handler();
    }

    /* renamed from: q */
    public /* synthetic */ void m10947q(InterfaceC2701p interfaceC2701p) {
        this.f10513c.m10977m(interfaceC2701p);
    }

    /* renamed from: r */
    public /* synthetic */ void m10948r(InterfaceC2701p interfaceC2701p) {
        if (this.f10516f) {
            this.f10511a.m11004c(new Runnable() { // from class: ib.d

                /* renamed from: i */
                public final /* synthetic */ InterfaceC2701p f10505i;

                public /* synthetic */ RunnableC2689d(InterfaceC2701p interfaceC2701p2) {
                    r2 = interfaceC2701p2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2692g.this.m10947q(r2);
                }
            });
        } else {
            Log.d(f10510n, "Camera is closed, not requesting preview");
        }
    }

    /* renamed from: s */
    public /* synthetic */ void m10949s(boolean z10) {
        this.f10513c.m10984t(z10);
    }

    /* renamed from: A */
    public void m10950A(boolean z10) {
        C2476u.m9873a();
        if (this.f10516f) {
            this.f10511a.m11004c(new Runnable() { // from class: ib.f

                /* renamed from: i */
                public final /* synthetic */ boolean f10509i;

                public /* synthetic */ RunnableC2691f(boolean z102) {
                    r2 = z102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2692g.this.m10949s(r2);
                }
            });
        }
    }

    /* renamed from: B */
    public void m10951B() {
        C2476u.m9873a();
        m10952C();
        this.f10511a.m11004c(this.f10522l);
    }

    /* renamed from: C */
    public final void m10952C() {
        if (!this.f10516f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    /* renamed from: l */
    public void m10953l() {
        C2476u.m9873a();
        if (this.f10516f) {
            this.f10511a.m11004c(this.f10523m);
        } else {
            this.f10517g = true;
        }
        this.f10516f = false;
    }

    /* renamed from: m */
    public void m10954m() {
        C2476u.m9873a();
        m10952C();
        this.f10511a.m11004c(this.f10521k);
    }

    /* renamed from: n */
    public C2698m m10955n() {
        return this.f10515e;
    }

    /* renamed from: o */
    public final C2474s m10956o() {
        return this.f10513c.m10973h();
    }

    /* renamed from: p */
    public boolean m10957p() {
        return this.f10517g;
    }

    /* renamed from: t */
    public final void m10958t(Exception exc) {
        Handler handler = this.f10514d;
        if (handler != null) {
            handler.obtainMessage(C3602k.f12688d, exc).sendToTarget();
        }
    }

    /* renamed from: u */
    public void m10959u() {
        C2476u.m9873a();
        this.f10516f = true;
        this.f10517g = false;
        this.f10511a.m11005e(this.f10520j);
    }

    /* renamed from: v */
    public void m10960v(InterfaceC2701p interfaceC2701p) {
        this.f10518h.post(new Runnable() { // from class: ib.e

            /* renamed from: i */
            public final /* synthetic */ InterfaceC2701p f10507i;

            public /* synthetic */ RunnableC2690e(InterfaceC2701p interfaceC2701p2) {
                r2 = interfaceC2701p2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2692g.this.m10948r(r2);
            }
        });
    }

    /* renamed from: w */
    public void m10961w(C2694i c2694i) {
        if (this.f10516f) {
            return;
        }
        this.f10519i = c2694i;
        this.f10513c.m10979o(c2694i);
    }

    /* renamed from: x */
    public void m10962x(C2698m c2698m) {
        this.f10515e = c2698m;
        this.f10513c.m10981q(c2698m);
    }

    /* renamed from: y */
    public void m10963y(Handler handler) {
        this.f10514d = handler;
    }

    /* renamed from: z */
    public void m10964z(C2695j c2695j) {
        this.f10512b = c2695j;
    }
}
