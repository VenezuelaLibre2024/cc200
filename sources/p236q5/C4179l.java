package p236q5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: q5.l */
/* loaded from: classes.dex */
public final class C4179l {

    /* renamed from: a */
    public final C4172e f15078a = new C4172e();

    /* renamed from: b */
    public final b f15079b;

    /* renamed from: c */
    public final e f15080c;

    /* renamed from: d */
    public boolean f15081d;

    /* renamed from: e */
    public Surface f15082e;

    /* renamed from: f */
    public float f15083f;

    /* renamed from: g */
    public float f15084g;

    /* renamed from: h */
    public float f15085h;

    /* renamed from: i */
    public float f15086i;

    /* renamed from: j */
    public int f15087j;

    /* renamed from: k */
    public long f15088k;

    /* renamed from: l */
    public long f15089l;

    /* renamed from: m */
    public long f15090m;

    /* renamed from: n */
    public long f15091n;

    /* renamed from: o */
    public long f15092o;

    /* renamed from: p */
    public long f15093p;

    /* renamed from: q */
    public long f15094q;

    /* renamed from: q5.l$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static void m16121a(Surface surface, float f10) {
            try {
                surface.setFrameRate(f10, f10 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e10) {
                C4046r.m15524d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    /* renamed from: q5.l$b */
    /* loaded from: classes.dex */
    public interface b {

        /* renamed from: q5.l$b$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            void mo16102a(Display display);
        }

        /* renamed from: a */
        void mo16122a(a aVar);

        /* renamed from: b */
        void mo16123b();
    }

    /* renamed from: q5.l$c */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        public final WindowManager f15095a;

        public c(WindowManager windowManager) {
            this.f15095a = windowManager;
        }

        /* renamed from: c */
        public static b m16124c(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // p236q5.C4179l.b
        /* renamed from: a */
        public void mo16122a(b.a aVar) {
            aVar.mo16102a(this.f15095a.getDefaultDisplay());
        }

        @Override // p236q5.C4179l.b
        /* renamed from: b */
        public void mo16123b() {
        }
    }

    /* renamed from: q5.l$d */
    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f15096a;

        /* renamed from: b */
        public b.a f15097b;

        public d(DisplayManager displayManager) {
            this.f15096a = displayManager;
        }

        /* renamed from: d */
        public static b m16125d(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // p236q5.C4179l.b
        /* renamed from: a */
        public void mo16122a(b.a aVar) {
            this.f15097b = aVar;
            this.f15096a.registerDisplayListener(this, C4041n0.m15489w());
            aVar.mo16102a(m16126c());
        }

        @Override // p236q5.C4179l.b
        /* renamed from: b */
        public void mo16123b() {
            this.f15096a.unregisterDisplayListener(this);
            this.f15097b = null;
        }

        /* renamed from: c */
        public final Display m16126c() {
            return this.f15096a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f15097b;
            if (aVar == null || i10 != 0) {
                return;
            }
            aVar.mo16102a(m16126c());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* renamed from: q5.l$e */
    /* loaded from: classes.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: m */
        public static final e f15098m = new e();

        /* renamed from: h */
        public volatile long f15099h = -9223372036854775807L;

        /* renamed from: i */
        public final Handler f15100i;

        /* renamed from: j */
        public final HandlerThread f15101j;

        /* renamed from: k */
        public Choreographer f15102k;

        /* renamed from: l */
        public int f15103l;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f15101j = handlerThread;
            handlerThread.start();
            Handler m15487v = C4041n0.m15487v(handlerThread.getLooper(), this);
            this.f15100i = m15487v;
            m15487v.sendEmptyMessage(0);
        }

        /* renamed from: d */
        public static e m16127d() {
            return f15098m;
        }

        /* renamed from: a */
        public void m16128a() {
            this.f15100i.sendEmptyMessage(1);
        }

        /* renamed from: b */
        public final void m16129b() {
            Choreographer choreographer = this.f15102k;
            if (choreographer != null) {
                int i10 = this.f15103l + 1;
                this.f15103l = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        /* renamed from: c */
        public final void m16130c() {
            try {
                this.f15102k = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                C4046r.m15530j("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f15099h = j10;
            ((Choreographer) C4014a.m15199e(this.f15102k)).postFrameCallbackDelayed(this, 500L);
        }

        /* renamed from: e */
        public void m16131e() {
            this.f15100i.sendEmptyMessage(2);
        }

        /* renamed from: f */
        public final void m16132f() {
            Choreographer choreographer = this.f15102k;
            if (choreographer != null) {
                int i10 = this.f15103l - 1;
                this.f15103l = i10;
                if (i10 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f15099h = -9223372036854775807L;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                m16130c();
                return true;
            }
            if (i10 == 1) {
                m16129b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            m16132f();
            return true;
        }
    }

    public C4179l(Context context) {
        b m16106f = m16106f(context);
        this.f15079b = m16106f;
        this.f15080c = m16106f != null ? e.m16127d() : null;
        this.f15088k = -9223372036854775807L;
        this.f15089l = -9223372036854775807L;
        this.f15083f = -1.0f;
        this.f15086i = 1.0f;
        this.f15087j = 0;
    }

    /* renamed from: c */
    public static boolean m16104c(long j10, long j11) {
        return Math.abs(j10 - j11) <= 20000000;
    }

    /* renamed from: e */
    public static long m16105e(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    /* renamed from: f */
    public static b m16106f(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b m16125d = C4041n0.f14513a >= 17 ? d.m16125d(applicationContext) : null;
        return m16125d == null ? c.m16124c(applicationContext) : m16125d;
    }

    /* renamed from: b */
    public long m16107b(long j10) {
        long j11;
        e eVar;
        if (this.f15093p != -1 && this.f15078a.m16037e()) {
            long m16033a = this.f15094q + (((float) (this.f15078a.m16033a() * (this.f15090m - this.f15093p))) / this.f15086i);
            if (m16104c(j10, m16033a)) {
                j11 = m16033a;
                this.f15091n = this.f15090m;
                this.f15092o = j11;
                eVar = this.f15080c;
                if (eVar != null || this.f15088k == -9223372036854775807L) {
                    return j11;
                }
                long j12 = eVar.f15099h;
                return j12 == -9223372036854775807L ? j11 : m16105e(j11, j12, this.f15088k) - this.f15089l;
            }
            m16116n();
        }
        j11 = j10;
        this.f15091n = this.f15090m;
        this.f15092o = j11;
        eVar = this.f15080c;
        if (eVar != null) {
        }
        return j11;
    }

    /* renamed from: d */
    public final void m16108d() {
        Surface surface;
        if (C4041n0.f14513a < 30 || (surface = this.f15082e) == null || this.f15087j == Integer.MIN_VALUE || this.f15085h == 0.0f) {
            return;
        }
        this.f15085h = 0.0f;
        a.m16121a(surface, 0.0f);
    }

    /* renamed from: g */
    public void m16109g(float f10) {
        this.f15083f = f10;
        this.f15078a.m16039g();
        m16119q();
    }

    /* renamed from: h */
    public void m16110h(long j10) {
        long j11 = this.f15091n;
        if (j11 != -1) {
            this.f15093p = j11;
            this.f15094q = this.f15092o;
        }
        this.f15090m++;
        this.f15078a.m16038f(j10 * 1000);
        m16119q();
    }

    /* renamed from: i */
    public void m16111i(float f10) {
        this.f15086i = f10;
        m16116n();
        m16120r(false);
    }

    /* renamed from: j */
    public void m16112j() {
        m16116n();
    }

    /* renamed from: k */
    public void m16113k() {
        this.f15081d = true;
        m16116n();
        if (this.f15079b != null) {
            ((e) C4014a.m15199e(this.f15080c)).m16128a();
            this.f15079b.mo16122a(new b.a() { // from class: q5.k
                @Override // p236q5.C4179l.b.a
                /* renamed from: a */
                public final void mo16102a(Display display) {
                    C4179l.this.m16118p(display);
                }
            });
        }
        m16120r(false);
    }

    /* renamed from: l */
    public void m16114l() {
        this.f15081d = false;
        b bVar = this.f15079b;
        if (bVar != null) {
            bVar.mo16123b();
            ((e) C4014a.m15199e(this.f15080c)).m16131e();
        }
        m16108d();
    }

    /* renamed from: m */
    public void m16115m(Surface surface) {
        if (surface instanceof C4176i) {
            surface = null;
        }
        if (this.f15082e == surface) {
            return;
        }
        m16108d();
        this.f15082e = surface;
        m16120r(true);
    }

    /* renamed from: n */
    public final void m16116n() {
        this.f15090m = 0L;
        this.f15093p = -1L;
        this.f15091n = -1L;
    }

    /* renamed from: o */
    public void m16117o(int i10) {
        if (this.f15087j == i10) {
            return;
        }
        this.f15087j = i10;
        m16120r(true);
    }

    /* renamed from: p */
    public final void m16118p(Display display) {
        long j10;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f15088k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            C4046r.m15529i("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            this.f15088k = -9223372036854775807L;
        }
        this.f15089l = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (java.lang.Math.abs(r0 - r7.f15084g) >= (r7.f15078a.m16037e() && (r7.f15078a.m16036d() > 5000000000L ? 1 : (r7.f15078a.m16036d() == 5000000000L ? 0 : -1)) >= 0 ? 0.02f : 1.0f)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006a, code lost:
    
        if (r7.f15078a.m16035c() >= 30) goto L35;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16119q() {
        /*
            r7 = this;
            int r0 = p222p5.C4041n0.f14513a
            r1 = 30
            if (r0 < r1) goto L73
            android.view.Surface r0 = r7.f15082e
            if (r0 != 0) goto Lc
            goto L73
        Lc:
            q5.e r0 = r7.f15078a
            boolean r0 = r0.m16037e()
            if (r0 == 0) goto L1b
            q5.e r0 = r7.f15078a
            float r0 = r0.m16034b()
            goto L1d
        L1b:
            float r0 = r7.f15083f
        L1d:
            float r2 = r7.f15084g
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L24
            return
        L24:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L61
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L61
            q5.e r1 = r7.f15078a
            boolean r1 = r1.m16037e()
            if (r1 == 0) goto L49
            q5.e r1 = r7.f15078a
            long r1 = r1.m16036d()
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L49
            r1 = r6
            goto L4a
        L49:
            r1 = r5
        L4a:
            if (r1 == 0) goto L50
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r2 = r7.f15084g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L5f
            goto L6c
        L5f:
            r6 = r5
            goto L6c
        L61:
            if (r4 == 0) goto L64
            goto L6c
        L64:
            q5.e r2 = r7.f15078a
            int r2 = r2.m16035c()
            if (r2 < r1) goto L5f
        L6c:
            if (r6 == 0) goto L73
            r7.f15084g = r0
            r7.m16120r(r5)
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p236q5.C4179l.m16119q():void");
    }

    /* renamed from: r */
    public final void m16120r(boolean z10) {
        Surface surface;
        if (C4041n0.f14513a < 30 || (surface = this.f15082e) == null || this.f15087j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f15081d) {
            float f11 = this.f15084g;
            if (f11 != -1.0f) {
                f10 = this.f15086i * f11;
            }
        }
        if (z10 || this.f15085h != f10) {
            this.f15085h = f10;
            a.m16121a(surface, f10);
        }
    }
}
