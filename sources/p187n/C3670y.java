package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p015b0.C0436a;
import p089g.C1940j;
import p148k0.C3308b0;

/* renamed from: n.y */
/* loaded from: classes.dex */
public class C3670y extends C3660t {

    /* renamed from: d */
    public final SeekBar f13050d;

    /* renamed from: e */
    public Drawable f13051e;

    /* renamed from: f */
    public ColorStateList f13052f;

    /* renamed from: g */
    public PorterDuff.Mode f13053g;

    /* renamed from: h */
    public boolean f13054h;

    /* renamed from: i */
    public boolean f13055i;

    public C3670y(SeekBar seekBar) {
        super(seekBar);
        this.f13052f = null;
        this.f13053g = null;
        this.f13054h = false;
        this.f13055i = false;
        this.f13050d = seekBar;
    }

    @Override // p187n.C3660t
    /* renamed from: c */
    public void mo13703c(AttributeSet attributeSet, int i10) {
        super.mo13703c(attributeSet, i10);
        Context context = this.f13050d.getContext();
        int[] iArr = C1940j.f7585T;
        C3667w0 m13717u = C3667w0.m13717u(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.f13050d;
        C3308b0.m12007U(seekBar, seekBar.getContext(), iArr, attributeSet, m13717u.m13734q(), i10, 0);
        Drawable m13724g = m13717u.m13724g(C1940j.f7589U);
        if (m13724g != null) {
            this.f13050d.setThumb(m13724g);
        }
        m13741j(m13717u.m13723f(C1940j.f7593V));
        int i11 = C1940j.f7601X;
        if (m13717u.m13735r(i11)) {
            this.f13053g = C3637h0.m13514d(m13717u.m13727j(i11, -1), this.f13053g);
            this.f13055i = true;
        }
        int i12 = C1940j.f7597W;
        if (m13717u.m13735r(i12)) {
            this.f13052f = m13717u.m13720c(i12);
            this.f13054h = true;
        }
        m13717u.m13736v();
        m13737f();
    }

    /* renamed from: f */
    public final void m13737f() {
        Drawable drawable = this.f13051e;
        if (drawable != null) {
            if (this.f13054h || this.f13055i) {
                Drawable m2265p = C0436a.m2265p(drawable.mutate());
                this.f13051e = m2265p;
                if (this.f13054h) {
                    C0436a.m2263n(m2265p, this.f13052f);
                }
                if (this.f13055i) {
                    C0436a.m2264o(this.f13051e, this.f13053g);
                }
                if (this.f13051e.isStateful()) {
                    this.f13051e.setState(this.f13050d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: g */
    public void m13738g(Canvas canvas) {
        if (this.f13051e != null) {
            int max = this.f13050d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f13051e.getIntrinsicWidth();
                int intrinsicHeight = this.f13051e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f13051e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.f13050d.getWidth() - this.f13050d.getPaddingLeft()) - this.f13050d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f13050d.getPaddingLeft(), this.f13050d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f13051e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* renamed from: h */
    public void m13739h() {
        Drawable drawable = this.f13051e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f13050d.getDrawableState())) {
            this.f13050d.invalidateDrawable(drawable);
        }
    }

    /* renamed from: i */
    public void m13740i() {
        Drawable drawable = this.f13051e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* renamed from: j */
    public void m13741j(Drawable drawable) {
        Drawable drawable2 = this.f13051e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f13051e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f13050d);
            C0436a.m2261l(drawable, C3308b0.m12048v(this.f13050d));
            if (drawable.isStateful()) {
                drawable.setState(this.f13050d.getDrawableState());
            }
            m13737f();
        }
        this.f13050d.invalidate();
    }
}
