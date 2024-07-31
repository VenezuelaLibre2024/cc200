package p206o5;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p222p5.C4014a;
import p222p5.C4035k0;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: o5.e0 */
/* loaded from: classes.dex */
public final class C3901e0 implements InterfaceC3903f0 {

    /* renamed from: d */
    public static final c f13999d = m14799h(false, -9223372036854775807L);

    /* renamed from: e */
    public static final c f14000e = m14799h(true, -9223372036854775807L);

    /* renamed from: f */
    public static final c f14001f;

    /* renamed from: g */
    public static final c f14002g;

    /* renamed from: a */
    public final ExecutorService f14003a;

    /* renamed from: b */
    public d<? extends e> f14004b;

    /* renamed from: c */
    public IOException f14005c;

    /* renamed from: o5.e0$b */
    /* loaded from: classes.dex */
    public interface b<T extends e> {
        /* renamed from: k */
        c mo219k(T t10, long j10, long j11, IOException iOException, int i10);

        /* renamed from: o */
        void mo222o(T t10, long j10, long j11);

        /* renamed from: r */
        void mo223r(T t10, long j10, long j11, boolean z10);
    }

    /* renamed from: o5.e0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f14006a;

        /* renamed from: b */
        public final long f14007b;

        public c(int i10, long j10) {
            this.f14006a = i10;
            this.f14007b = j10;
        }

        /* renamed from: c */
        public boolean m14810c() {
            int i10 = this.f14006a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: o5.e0$d */
    /* loaded from: classes.dex */
    public final class d<T extends e> extends Handler implements Runnable {

        /* renamed from: h */
        public final int f14008h;

        /* renamed from: i */
        public final T f14009i;

        /* renamed from: j */
        public final long f14010j;

        /* renamed from: k */
        public b<T> f14011k;

        /* renamed from: l */
        public IOException f14012l;

        /* renamed from: m */
        public int f14013m;

        /* renamed from: n */
        public Thread f14014n;

        /* renamed from: o */
        public boolean f14015o;

        /* renamed from: p */
        public volatile boolean f14016p;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f14009i = t10;
            this.f14011k = bVar;
            this.f14008h = i10;
            this.f14010j = j10;
        }

        /* renamed from: a */
        public void m14811a(boolean z10) {
            this.f14016p = z10;
            this.f14012l = null;
            if (hasMessages(0)) {
                this.f14015o = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f14015o = true;
                    this.f14009i.mo14818c();
                    Thread thread = this.f14014n;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                m14813c();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) C4014a.m15199e(this.f14011k)).mo223r(this.f14009i, elapsedRealtime, elapsedRealtime - this.f14010j, true);
                this.f14011k = null;
            }
        }

        /* renamed from: b */
        public final void m14812b() {
            this.f14012l = null;
            C3901e0.this.f14003a.execute((Runnable) C4014a.m15199e(C3901e0.this.f14004b));
        }

        /* renamed from: c */
        public final void m14813c() {
            C3901e0.this.f14004b = null;
        }

        /* renamed from: d */
        public final long m14814d() {
            return Math.min((this.f14013m - 1) * 1000, 5000);
        }

        /* renamed from: e */
        public void m14815e(int i10) {
            IOException iOException = this.f14012l;
            if (iOException != null && this.f14013m > i10) {
                throw iOException;
            }
        }

        /* renamed from: f */
        public void m14816f(long j10) {
            C4014a.m15200f(C3901e0.this.f14004b == null);
            C3901e0.this.f14004b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                m14812b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f14016p) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                m14812b();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            m14813c();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f14010j;
            b bVar = (b) C4014a.m15199e(this.f14011k);
            if (this.f14015o) {
                bVar.mo223r(this.f14009i, elapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.mo222o(this.f14009i, elapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    C4046r.m15524d("LoadTask", "Unexpected exception handling load completed", e10);
                    C3901e0.this.f14005c = new h(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f14012l = iOException;
            int i12 = this.f14013m + 1;
            this.f14013m = i12;
            c mo219k = bVar.mo219k(this.f14009i, elapsedRealtime, j10, iOException, i12);
            if (mo219k.f14006a == 3) {
                C3901e0.this.f14005c = this.f14012l;
            } else if (mo219k.f14006a != 2) {
                if (mo219k.f14006a == 1) {
                    this.f14013m = 1;
                }
                m14816f(mo219k.f14007b != -9223372036854775807L ? mo219k.f14007b : m14814d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            Message obtainMessage;
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f14015o;
                    this.f14014n = Thread.currentThread();
                }
                if (z10) {
                    C4035k0.m15372a("load:" + this.f14009i.getClass().getSimpleName());
                    try {
                        this.f14009i.mo14817b();
                        C4035k0.m15374c();
                    } catch (Throwable th) {
                        C4035k0.m15374c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f14014n = null;
                    Thread.interrupted();
                }
                if (this.f14016p) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f14016p) {
                    return;
                }
                obtainMessage = obtainMessage(2, e10);
                obtainMessage.sendToTarget();
            } catch (Exception e11) {
                if (this.f14016p) {
                    return;
                }
                C4046r.m15524d("LoadTask", "Unexpected exception loading stream", e11);
                hVar = new h(e11);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f14016p) {
                    return;
                }
                C4046r.m15524d("LoadTask", "OutOfMemory error loading stream", e12);
                hVar = new h(e12);
                obtainMessage = obtainMessage(2, hVar);
                obtainMessage.sendToTarget();
            } catch (Error e13) {
                if (!this.f14016p) {
                    C4046r.m15524d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(3, e13).sendToTarget();
                }
                throw e13;
            }
        }
    }

    /* renamed from: o5.e0$e */
    /* loaded from: classes.dex */
    public interface e {
        /* renamed from: b */
        void mo14817b();

        /* renamed from: c */
        void mo14818c();
    }

    /* renamed from: o5.e0$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: h */
        void mo14819h();
    }

    /* renamed from: o5.e0$g */
    /* loaded from: classes.dex */
    public static final class g implements Runnable {

        /* renamed from: h */
        public final f f14018h;

        public g(f fVar) {
            this.f14018h = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14018h.mo14819h();
        }
    }

    /* renamed from: o5.e0$h */
    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f14001f = new c(2, j10);
        f14002g = new c(3, j10);
    }

    public C3901e0(String str) {
        this.f14003a = C4041n0.m15398C0("ExoPlayer:Loader:" + str);
    }

    /* renamed from: h */
    public static c m14799h(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // p206o5.InterfaceC3903f0
    /* renamed from: a */
    public void mo4756a() {
        m14804k(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public void m14800f() {
        ((d) C4014a.m15202h(this.f14004b)).m14811a(false);
    }

    /* renamed from: g */
    public void m14801g() {
        this.f14005c = null;
    }

    /* renamed from: i */
    public boolean m14802i() {
        return this.f14005c != null;
    }

    /* renamed from: j */
    public boolean m14803j() {
        return this.f14004b != null;
    }

    /* renamed from: k */
    public void m14804k(int i10) {
        IOException iOException = this.f14005c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f14004b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f14008h;
            }
            dVar.m14815e(i10);
        }
    }

    /* renamed from: l */
    public void m14805l() {
        m14806m(null);
    }

    /* renamed from: m */
    public void m14806m(f fVar) {
        d<? extends e> dVar = this.f14004b;
        if (dVar != null) {
            dVar.m14811a(true);
        }
        if (fVar != null) {
            this.f14003a.execute(new g(fVar));
        }
        this.f14003a.shutdown();
    }

    /* renamed from: n */
    public <T extends e> long m14807n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) C4014a.m15202h(Looper.myLooper());
        this.f14005c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, elapsedRealtime).m14816f(0L);
        return elapsedRealtime;
    }
}
