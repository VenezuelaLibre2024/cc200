package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p016b1.C0443b;
import p133j0.C3205d;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* loaded from: classes.dex */
public class C0397b extends Drawable implements Animatable {

    /* renamed from: n */
    public static final Interpolator f1894n = new LinearInterpolator();

    /* renamed from: o */
    public static final Interpolator f1895o = new C0443b();

    /* renamed from: p */
    public static final int[] f1896p = {-16777216};

    /* renamed from: h */
    public final c f1897h;

    /* renamed from: i */
    public float f1898i;

    /* renamed from: j */
    public Resources f1899j;

    /* renamed from: k */
    public Animator f1900k;

    /* renamed from: l */
    public float f1901l;

    /* renamed from: m */
    public boolean f1902m;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        public final /* synthetic */ c f1903a;

        public a(c cVar) {
            this.f1903a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C0397b.this.m2015n(floatValue, this.f1903a);
            C0397b.this.m2003b(floatValue, this.f1903a, false);
            C0397b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* loaded from: classes.dex */
    public class b implements Animator.AnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ c f1905a;

        public b(c cVar) {
            this.f1905a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C0397b.this.m2003b(1.0f, this.f1905a, true);
            this.f1905a.m2016A();
            this.f1905a.m2028l();
            C0397b c0397b = C0397b.this;
            if (!c0397b.f1902m) {
                c0397b.f1901l += 1.0f;
                return;
            }
            c0397b.f1902m = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f1905a.m2040x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0397b.this.f1901l = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final RectF f1907a = new RectF();

        /* renamed from: b */
        public final Paint f1908b;

        /* renamed from: c */
        public final Paint f1909c;

        /* renamed from: d */
        public final Paint f1910d;

        /* renamed from: e */
        public float f1911e;

        /* renamed from: f */
        public float f1912f;

        /* renamed from: g */
        public float f1913g;

        /* renamed from: h */
        public float f1914h;

        /* renamed from: i */
        public int[] f1915i;

        /* renamed from: j */
        public int f1916j;

        /* renamed from: k */
        public float f1917k;

        /* renamed from: l */
        public float f1918l;

        /* renamed from: m */
        public float f1919m;

        /* renamed from: n */
        public boolean f1920n;

        /* renamed from: o */
        public Path f1921o;

        /* renamed from: p */
        public float f1922p;

        /* renamed from: q */
        public float f1923q;

        /* renamed from: r */
        public int f1924r;

        /* renamed from: s */
        public int f1925s;

        /* renamed from: t */
        public int f1926t;

        /* renamed from: u */
        public int f1927u;

        public c() {
            Paint paint = new Paint();
            this.f1908b = paint;
            Paint paint2 = new Paint();
            this.f1909c = paint2;
            Paint paint3 = new Paint();
            this.f1910d = paint3;
            this.f1911e = 0.0f;
            this.f1912f = 0.0f;
            this.f1913g = 0.0f;
            this.f1914h = 5.0f;
            this.f1922p = 1.0f;
            this.f1926t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* renamed from: A */
        public void m2016A() {
            this.f1917k = this.f1911e;
            this.f1918l = this.f1912f;
            this.f1919m = this.f1913g;
        }

        /* renamed from: a */
        public void m2017a(Canvas canvas, Rect rect) {
            RectF rectF = this.f1907a;
            float f10 = this.f1923q;
            float f11 = (this.f1914h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                f11 = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f1924r * this.f1922p) / 2.0f, this.f1914h / 2.0f);
            }
            rectF.set(rect.centerX() - f11, rect.centerY() - f11, rect.centerX() + f11, rect.centerY() + f11);
            float f12 = this.f1911e;
            float f13 = this.f1913g;
            float f14 = (f12 + f13) * 360.0f;
            float f15 = ((this.f1912f + f13) * 360.0f) - f14;
            this.f1908b.setColor(this.f1927u);
            this.f1908b.setAlpha(this.f1926t);
            float f16 = this.f1914h / 2.0f;
            rectF.inset(f16, f16);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f1910d);
            float f17 = -f16;
            rectF.inset(f17, f17);
            canvas.drawArc(rectF, f14, f15, false, this.f1908b);
            m2018b(canvas, f14, f15, rectF);
        }

        /* renamed from: b */
        public void m2018b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f1920n) {
                Path path = this.f1921o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f1921o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f1924r * this.f1922p) / 2.0f;
                this.f1921o.moveTo(0.0f, 0.0f);
                this.f1921o.lineTo(this.f1924r * this.f1922p, 0.0f);
                Path path3 = this.f1921o;
                float f13 = this.f1924r;
                float f14 = this.f1922p;
                path3.lineTo((f13 * f14) / 2.0f, this.f1925s * f14);
                this.f1921o.offset((min + rectF.centerX()) - f12, rectF.centerY() + (this.f1914h / 2.0f));
                this.f1921o.close();
                this.f1909c.setColor(this.f1927u);
                this.f1909c.setAlpha(this.f1926t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f1921o, this.f1909c);
                canvas.restore();
            }
        }

        /* renamed from: c */
        public int m2019c() {
            return this.f1926t;
        }

        /* renamed from: d */
        public float m2020d() {
            return this.f1912f;
        }

        /* renamed from: e */
        public int m2021e() {
            return this.f1915i[m2022f()];
        }

        /* renamed from: f */
        public int m2022f() {
            return (this.f1916j + 1) % this.f1915i.length;
        }

        /* renamed from: g */
        public float m2023g() {
            return this.f1911e;
        }

        /* renamed from: h */
        public int m2024h() {
            return this.f1915i[this.f1916j];
        }

        /* renamed from: i */
        public float m2025i() {
            return this.f1918l;
        }

        /* renamed from: j */
        public float m2026j() {
            return this.f1919m;
        }

        /* renamed from: k */
        public float m2027k() {
            return this.f1917k;
        }

        /* renamed from: l */
        public void m2028l() {
            m2036t(m2022f());
        }

        /* renamed from: m */
        public void m2029m() {
            this.f1917k = 0.0f;
            this.f1918l = 0.0f;
            this.f1919m = 0.0f;
            m2041y(0.0f);
            m2038v(0.0f);
            m2039w(0.0f);
        }

        /* renamed from: n */
        public void m2030n(int i10) {
            this.f1926t = i10;
        }

        /* renamed from: o */
        public void m2031o(float f10, float f11) {
            this.f1924r = (int) f10;
            this.f1925s = (int) f11;
        }

        /* renamed from: p */
        public void m2032p(float f10) {
            if (f10 != this.f1922p) {
                this.f1922p = f10;
            }
        }

        /* renamed from: q */
        public void m2033q(float f10) {
            this.f1923q = f10;
        }

        /* renamed from: r */
        public void m2034r(int i10) {
            this.f1927u = i10;
        }

        /* renamed from: s */
        public void m2035s(ColorFilter colorFilter) {
            this.f1908b.setColorFilter(colorFilter);
        }

        /* renamed from: t */
        public void m2036t(int i10) {
            this.f1916j = i10;
            this.f1927u = this.f1915i[i10];
        }

        /* renamed from: u */
        public void m2037u(int[] iArr) {
            this.f1915i = iArr;
            m2036t(0);
        }

        /* renamed from: v */
        public void m2038v(float f10) {
            this.f1912f = f10;
        }

        /* renamed from: w */
        public void m2039w(float f10) {
            this.f1913g = f10;
        }

        /* renamed from: x */
        public void m2040x(boolean z10) {
            if (this.f1920n != z10) {
                this.f1920n = z10;
            }
        }

        /* renamed from: y */
        public void m2041y(float f10) {
            this.f1911e = f10;
        }

        /* renamed from: z */
        public void m2042z(float f10) {
            this.f1914h = f10;
            this.f1908b.setStrokeWidth(f10);
        }
    }

    public C0397b(Context context) {
        this.f1899j = ((Context) C3205d.m11414j(context)).getResources();
        c cVar = new c();
        this.f1897h = cVar;
        cVar.m2037u(f1896p);
        m2012k(2.5f);
        m2014m();
    }

    /* renamed from: a */
    public final void m2002a(float f10, c cVar) {
        m2015n(f10, cVar);
        float floor = (float) (Math.floor(cVar.m2026j() / 0.8f) + 1.0d);
        cVar.m2041y(cVar.m2027k() + (((cVar.m2025i() - 0.01f) - cVar.m2027k()) * f10));
        cVar.m2038v(cVar.m2025i());
        cVar.m2039w(cVar.m2026j() + ((floor - cVar.m2026j()) * f10));
    }

    /* renamed from: b */
    public void m2003b(float f10, c cVar, boolean z10) {
        float interpolation;
        float f11;
        if (this.f1902m) {
            m2002a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float m2026j = cVar.m2026j();
            if (f10 < 0.5f) {
                interpolation = cVar.m2027k();
                f11 = (f1895o.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float m2027k = cVar.m2027k() + 0.79f;
                interpolation = m2027k - (((1.0f - f1895o.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f11 = m2027k;
            }
            float f12 = m2026j + (0.20999998f * f10);
            float f13 = (f10 + this.f1901l) * 216.0f;
            cVar.m2041y(interpolation);
            cVar.m2038v(f11);
            cVar.m2039w(f12);
            m2009h(f13);
        }
    }

    /* renamed from: c */
    public final int m2004c(float f10, int i10, int i11) {
        return ((((i10 >> 24) & 255) + ((int) ((((i11 >> 24) & 255) - r0) * f10))) << 24) | ((((i10 >> 16) & 255) + ((int) ((((i11 >> 16) & 255) - r1) * f10))) << 16) | ((((i10 >> 8) & 255) + ((int) ((((i11 >> 8) & 255) - r2) * f10))) << 8) | ((i10 & 255) + ((int) (f10 * ((i11 & 255) - r8))));
    }

    /* renamed from: d */
    public void m2005d(boolean z10) {
        this.f1897h.m2040x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f1898i, bounds.exactCenterX(), bounds.exactCenterY());
        this.f1897h.m2017a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void m2006e(float f10) {
        this.f1897h.m2032p(f10);
        invalidateSelf();
    }

    /* renamed from: f */
    public void m2007f(int... iArr) {
        this.f1897h.m2037u(iArr);
        this.f1897h.m2036t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void m2008g(float f10) {
        this.f1897h.m2039w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1897h.m2019c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void m2009h(float f10) {
        this.f1898i = f10;
    }

    /* renamed from: i */
    public final void m2010i(float f10, float f11, float f12, float f13) {
        c cVar = this.f1897h;
        float f14 = this.f1899j.getDisplayMetrics().density;
        cVar.m2042z(f11 * f14);
        cVar.m2033q(f10 * f14);
        cVar.m2036t(0);
        cVar.m2031o(f12 * f14, f13 * f14);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f1900k.isRunning();
    }

    /* renamed from: j */
    public void m2011j(float f10, float f11) {
        this.f1897h.m2041y(f10);
        this.f1897h.m2038v(f11);
        invalidateSelf();
    }

    /* renamed from: k */
    public void m2012k(float f10) {
        this.f1897h.m2042z(f10);
        invalidateSelf();
    }

    /* renamed from: l */
    public void m2013l(int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        if (i10 == 0) {
            f10 = 11.0f;
            f11 = 3.0f;
            f12 = 12.0f;
            f13 = 6.0f;
        } else {
            f10 = 7.5f;
            f11 = 2.5f;
            f12 = 10.0f;
            f13 = 5.0f;
        }
        m2010i(f10, f11, f12, f13);
        invalidateSelf();
    }

    /* renamed from: m */
    public final void m2014m() {
        c cVar = this.f1897h;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f1894n);
        ofFloat.addListener(new b(cVar));
        this.f1900k = ofFloat;
    }

    /* renamed from: n */
    public void m2015n(float f10, c cVar) {
        cVar.m2034r(f10 > 0.75f ? m2004c((f10 - 0.75f) / 0.25f, cVar.m2024h(), cVar.m2021e()) : cVar.m2024h());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f1897h.m2030n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1897h.m2035s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Animator animator;
        long j10;
        this.f1900k.cancel();
        this.f1897h.m2016A();
        if (this.f1897h.m2020d() != this.f1897h.m2023g()) {
            this.f1902m = true;
            animator = this.f1900k;
            j10 = 666;
        } else {
            this.f1897h.m2036t(0);
            this.f1897h.m2029m();
            animator = this.f1900k;
            j10 = 1332;
        }
        animator.setDuration(j10);
        this.f1900k.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f1900k.cancel();
        m2009h(0.0f);
        this.f1897h.m2040x(false);
        this.f1897h.m2036t(0);
        this.f1897h.m2029m();
        invalidateSelf();
    }
}
