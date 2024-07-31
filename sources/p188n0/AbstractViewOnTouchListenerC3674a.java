package p188n0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import p148k0.C3308b0;

/* renamed from: n0.a */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC3674a implements View.OnTouchListener {

    /* renamed from: y */
    public static final int f13086y = ViewConfiguration.getTapTimeout();

    /* renamed from: j */
    public final View f13089j;

    /* renamed from: k */
    public Runnable f13090k;

    /* renamed from: n */
    public int f13093n;

    /* renamed from: o */
    public int f13094o;

    /* renamed from: s */
    public boolean f13098s;

    /* renamed from: t */
    public boolean f13099t;

    /* renamed from: u */
    public boolean f13100u;

    /* renamed from: v */
    public boolean f13101v;

    /* renamed from: w */
    public boolean f13102w;

    /* renamed from: x */
    public boolean f13103x;

    /* renamed from: h */
    public final a f13087h = new a();

    /* renamed from: i */
    public final Interpolator f13088i = new AccelerateInterpolator();

    /* renamed from: l */
    public float[] f13091l = {0.0f, 0.0f};

    /* renamed from: m */
    public float[] f13092m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: p */
    public float[] f13095p = {0.0f, 0.0f};

    /* renamed from: q */
    public float[] f13096q = {0.0f, 0.0f};

    /* renamed from: r */
    public float[] f13097r = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: n0.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public int f13104a;

        /* renamed from: b */
        public int f13105b;

        /* renamed from: c */
        public float f13106c;

        /* renamed from: d */
        public float f13107d;

        /* renamed from: j */
        public float f13113j;

        /* renamed from: k */
        public int f13114k;

        /* renamed from: e */
        public long f13108e = Long.MIN_VALUE;

        /* renamed from: i */
        public long f13112i = -1;

        /* renamed from: f */
        public long f13109f = 0;

        /* renamed from: g */
        public int f13110g = 0;

        /* renamed from: h */
        public int f13111h = 0;

        /* renamed from: a */
        public void m13791a() {
            if (this.f13109f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float m13797g = m13797g(m13795e(currentAnimationTimeMillis));
            long j10 = currentAnimationTimeMillis - this.f13109f;
            this.f13109f = currentAnimationTimeMillis;
            float f10 = ((float) j10) * m13797g;
            this.f13110g = (int) (this.f13106c * f10);
            this.f13111h = (int) (f10 * this.f13107d);
        }

        /* renamed from: b */
        public int m13792b() {
            return this.f13110g;
        }

        /* renamed from: c */
        public int m13793c() {
            return this.f13111h;
        }

        /* renamed from: d */
        public int m13794d() {
            float f10 = this.f13106c;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: e */
        public final float m13795e(long j10) {
            long j11 = this.f13108e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f13112i;
            if (j12 < 0 || j10 < j12) {
                return AbstractViewOnTouchListenerC3674a.m13769e(((float) (j10 - j11)) / this.f13104a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f13113j;
            return (1.0f - f10) + (f10 * AbstractViewOnTouchListenerC3674a.m13769e(((float) (j10 - j12)) / this.f13114k, 0.0f, 1.0f));
        }

        /* renamed from: f */
        public int m13796f() {
            float f10 = this.f13107d;
            return (int) (f10 / Math.abs(f10));
        }

        /* renamed from: g */
        public final float m13797g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        /* renamed from: h */
        public boolean m13798h() {
            return this.f13112i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f13112i + ((long) this.f13114k);
        }

        /* renamed from: i */
        public void m13799i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f13114k = AbstractViewOnTouchListenerC3674a.m13770f((int) (currentAnimationTimeMillis - this.f13108e), 0, this.f13105b);
            this.f13113j = m13795e(currentAnimationTimeMillis);
            this.f13112i = currentAnimationTimeMillis;
        }

        /* renamed from: j */
        public void m13800j(int i10) {
            this.f13105b = i10;
        }

        /* renamed from: k */
        public void m13801k(int i10) {
            this.f13104a = i10;
        }

        /* renamed from: l */
        public void m13802l(float f10, float f11) {
            this.f13106c = f10;
            this.f13107d = f11;
        }

        /* renamed from: m */
        public void m13803m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f13108e = currentAnimationTimeMillis;
            this.f13112i = -1L;
            this.f13109f = currentAnimationTimeMillis;
            this.f13113j = 0.5f;
            this.f13110g = 0;
            this.f13111h = 0;
        }
    }

    /* renamed from: n0.a$b */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC3674a abstractViewOnTouchListenerC3674a = AbstractViewOnTouchListenerC3674a.this;
            if (abstractViewOnTouchListenerC3674a.f13101v) {
                if (abstractViewOnTouchListenerC3674a.f13099t) {
                    abstractViewOnTouchListenerC3674a.f13099t = false;
                    abstractViewOnTouchListenerC3674a.f13087h.m13803m();
                }
                a aVar = AbstractViewOnTouchListenerC3674a.this.f13087h;
                if (aVar.m13798h() || !AbstractViewOnTouchListenerC3674a.this.m13789u()) {
                    AbstractViewOnTouchListenerC3674a.this.f13101v = false;
                    return;
                }
                AbstractViewOnTouchListenerC3674a abstractViewOnTouchListenerC3674a2 = AbstractViewOnTouchListenerC3674a.this;
                if (abstractViewOnTouchListenerC3674a2.f13100u) {
                    abstractViewOnTouchListenerC3674a2.f13100u = false;
                    abstractViewOnTouchListenerC3674a2.m13773c();
                }
                aVar.m13791a();
                AbstractViewOnTouchListenerC3674a.this.mo13778j(aVar.m13792b(), aVar.m13793c());
                C3308b0.m12004R(AbstractViewOnTouchListenerC3674a.this.f13089j, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC3674a(View view) {
        this.f13089j = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        m13783o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        m13784p(f12, f12);
        m13780l(1);
        m13782n(Float.MAX_VALUE, Float.MAX_VALUE);
        m13787s(0.2f, 0.2f);
        m13788t(1.0f, 1.0f);
        m13779k(f13086y);
        m13786r(500);
        m13785q(500);
    }

    /* renamed from: e */
    public static float m13769e(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* renamed from: f */
    public static int m13770f(int i10, int i11, int i12) {
        return i10 > i12 ? i12 : i10 < i11 ? i11 : i10;
    }

    /* renamed from: a */
    public abstract boolean mo13771a(int i10);

    /* renamed from: b */
    public abstract boolean mo13772b(int i10);

    /* renamed from: c */
    public void m13773c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f13089j.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: d */
    public final float m13774d(int i10, float f10, float f11, float f12) {
        float m13776h = m13776h(this.f13091l[i10], f11, this.f13092m[i10], f10);
        if (m13776h == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f13095p[i10];
        float f14 = this.f13096q[i10];
        float f15 = this.f13097r[i10];
        float f16 = f13 * f12;
        return m13776h > 0.0f ? m13769e(m13776h * f16, f14, f15) : -m13769e((-m13776h) * f16, f14, f15);
    }

    /* renamed from: g */
    public final float m13775g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f13093n;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f13101v && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final float m13776h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float m13769e = m13769e(f10 * f11, 0.0f, f12);
        float m13775g = m13775g(f11 - f13, m13769e) - m13775g(f13, m13769e);
        if (m13775g < 0.0f) {
            interpolation = -this.f13088i.getInterpolation(-m13775g);
        } else {
            if (m13775g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f13088i.getInterpolation(m13775g);
        }
        return m13769e(interpolation, -1.0f, 1.0f);
    }

    /* renamed from: i */
    public final void m13777i() {
        if (this.f13099t) {
            this.f13101v = false;
        } else {
            this.f13087h.m13799i();
        }
    }

    /* renamed from: j */
    public abstract void mo13778j(int i10, int i11);

    /* renamed from: k */
    public AbstractViewOnTouchListenerC3674a m13779k(int i10) {
        this.f13094o = i10;
        return this;
    }

    /* renamed from: l */
    public AbstractViewOnTouchListenerC3674a m13780l(int i10) {
        this.f13093n = i10;
        return this;
    }

    /* renamed from: m */
    public AbstractViewOnTouchListenerC3674a m13781m(boolean z10) {
        if (this.f13102w && !z10) {
            m13777i();
        }
        this.f13102w = z10;
        return this;
    }

    /* renamed from: n */
    public AbstractViewOnTouchListenerC3674a m13782n(float f10, float f11) {
        float[] fArr = this.f13092m;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: o */
    public AbstractViewOnTouchListenerC3674a m13783o(float f10, float f11) {
        float[] fArr = this.f13097r;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f13102w
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.m13777i()
            goto L58
        L1a:
            r5.f13100u = r2
            r5.f13098s = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f13089j
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.m13774d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f13089j
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.m13774d(r2, r7, r6, r3)
            n0.a$a r7 = r5.f13087h
            r7.m13802l(r0, r6)
            boolean r6 = r5.f13101v
            if (r6 != 0) goto L58
            boolean r6 = r5.m13789u()
            if (r6 == 0) goto L58
            r5.m13790v()
        L58:
            boolean r6 = r5.f13103x
            if (r6 == 0) goto L61
            boolean r6 = r5.f13101v
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p188n0.AbstractViewOnTouchListenerC3674a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public AbstractViewOnTouchListenerC3674a m13784p(float f10, float f11) {
        float[] fArr = this.f13096q;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: q */
    public AbstractViewOnTouchListenerC3674a m13785q(int i10) {
        this.f13087h.m13800j(i10);
        return this;
    }

    /* renamed from: r */
    public AbstractViewOnTouchListenerC3674a m13786r(int i10) {
        this.f13087h.m13801k(i10);
        return this;
    }

    /* renamed from: s */
    public AbstractViewOnTouchListenerC3674a m13787s(float f10, float f11) {
        float[] fArr = this.f13091l;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* renamed from: t */
    public AbstractViewOnTouchListenerC3674a m13788t(float f10, float f11) {
        float[] fArr = this.f13095p;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* renamed from: u */
    public boolean m13789u() {
        a aVar = this.f13087h;
        int m13796f = aVar.m13796f();
        int m13794d = aVar.m13794d();
        return (m13796f != 0 && mo13772b(m13796f)) || (m13794d != 0 && mo13771a(m13794d));
    }

    /* renamed from: v */
    public final void m13790v() {
        int i10;
        if (this.f13090k == null) {
            this.f13090k = new b();
        }
        this.f13101v = true;
        this.f13099t = true;
        if (this.f13098s || (i10 = this.f13094o) <= 0) {
            this.f13090k.run();
        } else {
            C3308b0.m12005S(this.f13089j, this.f13090k, i10);
        }
        this.f13098s = true;
    }
}
