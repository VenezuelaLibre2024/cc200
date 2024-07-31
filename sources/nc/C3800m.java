package nc;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: nc.m */
/* loaded from: classes2.dex */
public class C3800m {

    /* renamed from: a */
    public final String f13693a;

    /* renamed from: b */
    public final int f13694b;

    /* renamed from: c */
    public HandlerThread f13695c;

    /* renamed from: d */
    public Handler f13696d;

    /* renamed from: e */
    public Runnable f13697e;

    /* renamed from: f */
    public C3798k f13698f;

    public C3800m(String str, int i10) {
        this.f13693a = str;
        this.f13694b = i10;
    }

    /* renamed from: b */
    public boolean m14494b() {
        C3798k c3798k = this.f13698f;
        return c3798k != null && c3798k.m14491b();
    }

    /* renamed from: d */
    public Integer m14495d() {
        C3798k c3798k = this.f13698f;
        if (c3798k != null) {
            return c3798k.m14490a();
        }
        return null;
    }

    /* renamed from: e */
    public void m14496e(final C3798k c3798k) {
        this.f13696d.post(new Runnable() { // from class: nc.l
            @Override // java.lang.Runnable
            public final void run() {
                C3800m.this.m14493c(c3798k);
            }
        });
    }

    /* renamed from: f */
    public synchronized void m14497f() {
        HandlerThread handlerThread = this.f13695c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f13695c = null;
            this.f13696d = null;
        }
    }

    /* renamed from: g */
    public synchronized void m14498g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f13693a, this.f13694b);
        this.f13695c = handlerThread;
        handlerThread.start();
        this.f13696d = new Handler(this.f13695c.getLooper());
        this.f13697e = runnable;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void m14493c(C3798k c3798k) {
        c3798k.f13690b.run();
        this.f13698f = c3798k;
        this.f13697e.run();
    }
}
