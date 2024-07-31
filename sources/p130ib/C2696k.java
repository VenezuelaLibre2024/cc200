package p130ib;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: ib.k */
/* loaded from: classes.dex */
public class C2696k {

    /* renamed from: e */
    public static C2696k f10561e;

    /* renamed from: a */
    public Handler f10562a;

    /* renamed from: b */
    public HandlerThread f10563b;

    /* renamed from: c */
    public int f10564c = 0;

    /* renamed from: d */
    public final Object f10565d = new Object();

    /* renamed from: d */
    public static C2696k m11001d() {
        if (f10561e == null) {
            f10561e = new C2696k();
        }
        return f10561e;
    }

    /* renamed from: a */
    public final void m11002a() {
        synchronized (this.f10565d) {
            if (this.f10562a == null) {
                if (this.f10564c <= 0) {
                    throw new IllegalStateException("CameraThread is not open");
                }
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                this.f10563b = handlerThread;
                handlerThread.start();
                this.f10562a = new Handler(this.f10563b.getLooper());
            }
        }
    }

    /* renamed from: b */
    public void m11003b() {
        synchronized (this.f10565d) {
            int i10 = this.f10564c - 1;
            this.f10564c = i10;
            if (i10 == 0) {
                m11006f();
            }
        }
    }

    /* renamed from: c */
    public void m11004c(Runnable runnable) {
        synchronized (this.f10565d) {
            m11002a();
            this.f10562a.post(runnable);
        }
    }

    /* renamed from: e */
    public void m11005e(Runnable runnable) {
        synchronized (this.f10565d) {
            this.f10564c++;
            m11004c(runnable);
        }
    }

    /* renamed from: f */
    public final void m11006f() {
        synchronized (this.f10565d) {
            this.f10563b.quit();
            this.f10563b = null;
            this.f10562a = null;
        }
    }
}
