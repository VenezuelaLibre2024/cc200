package p236q5;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import p222p5.C4014a;
import p222p5.C4038m;
import p222p5.C4046r;
import p222p5.RunnableC4032j;

/* renamed from: q5.i */
/* loaded from: classes.dex */
public final class C4176i extends Surface {

    /* renamed from: k */
    public static int f15067k;

    /* renamed from: l */
    public static boolean f15068l;

    /* renamed from: h */
    public final boolean f15069h;

    /* renamed from: i */
    public final b f15070i;

    /* renamed from: j */
    public boolean f15071j;

    /* renamed from: q5.i$b */
    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: h */
        public RunnableC4032j f15072h;

        /* renamed from: i */
        public Handler f15073i;

        /* renamed from: j */
        public Error f15074j;

        /* renamed from: k */
        public RuntimeException f15075k;

        /* renamed from: l */
        public C4176i f15076l;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        /* renamed from: a */
        public C4176i m16097a(int i10) {
            boolean z10;
            start();
            this.f15073i = new Handler(getLooper(), this);
            this.f15072h = new RunnableC4032j(this.f15073i);
            synchronized (this) {
                z10 = false;
                this.f15073i.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f15076l == null && this.f15075k == null && this.f15074j == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f15075k;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f15074j;
            if (error == null) {
                return (C4176i) C4014a.m15199e(this.f15076l);
            }
            throw error;
        }

        /* renamed from: b */
        public final void m16098b(int i10) {
            C4014a.m15199e(this.f15072h);
            this.f15072h.m15356h(i10);
            this.f15076l = new C4176i(this, this.f15072h.m15355g(), i10 != 0);
        }

        /* renamed from: c */
        public void m16099c() {
            C4014a.m15199e(this.f15073i);
            this.f15073i.sendEmptyMessage(2);
        }

        /* renamed from: d */
        public final void m16100d() {
            C4014a.m15199e(this.f15072h);
            this.f15072h.m15357i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        m16100d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    m16098b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    C4046r.m15524d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f15074j = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    C4046r.m15524d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f15075k = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (C4038m.a e12) {
                    C4046r.m15524d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f15075k = new IllegalStateException(e12);
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public C4176i(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f15070i = bVar;
        this.f15069h = z10;
    }

    /* renamed from: a */
    public static int m16094a(Context context) {
        if (C4038m.m15391c(context)) {
            return C4038m.m15392d() ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static synchronized boolean m16095b(Context context) {
        boolean z10;
        synchronized (C4176i.class) {
            if (!f15068l) {
                f15067k = m16094a(context);
                f15068l = true;
            }
            z10 = f15067k != 0;
        }
        return z10;
    }

    /* renamed from: d */
    public static C4176i m16096d(Context context, boolean z10) {
        C4014a.m15200f(!z10 || m16095b(context));
        return new b().m16097a(z10 ? f15067k : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f15070i) {
            if (!this.f15071j) {
                this.f15070i.m16099c();
                this.f15071j = true;
            }
        }
    }
}
