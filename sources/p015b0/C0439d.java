package p015b0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: b0.d */
/* loaded from: classes.dex */
public class C0439d extends Drawable implements Drawable.Callback, InterfaceC0438c, InterfaceC0437b {

    /* renamed from: n */
    public static final PorterDuff.Mode f2126n = PorterDuff.Mode.SRC_IN;

    /* renamed from: h */
    public int f2127h;

    /* renamed from: i */
    public PorterDuff.Mode f2128i;

    /* renamed from: j */
    public boolean f2129j;

    /* renamed from: k */
    public C0441f f2130k;

    /* renamed from: l */
    public boolean f2131l;

    /* renamed from: m */
    public Drawable f2132m;

    public C0439d(Drawable drawable) {
        this.f2130k = m2285d();
        mo2282a(drawable);
    }

    public C0439d(C0441f c0441f, Resources resources) {
        this.f2130k = c0441f;
        m2286e(resources);
    }

    @Override // p015b0.InterfaceC0438c
    /* renamed from: a */
    public final void mo2282a(Drawable drawable) {
        Drawable drawable2 = this.f2132m;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2132m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C0441f c0441f = this.f2130k;
            if (c0441f != null) {
                c0441f.f2135b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // p015b0.InterfaceC0438c
    /* renamed from: b */
    public final Drawable mo2283b() {
        return this.f2132m;
    }

    /* renamed from: c */
    public boolean mo2284c() {
        return true;
    }

    /* renamed from: d */
    public final C0441f m2285d() {
        return new C0441f(this.f2130k);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2132m.draw(canvas);
    }

    /* renamed from: e */
    public final void m2286e(Resources resources) {
        Drawable.ConstantState constantState;
        C0441f c0441f = this.f2130k;
        if (c0441f == null || (constantState = c0441f.f2135b) == null) {
            return;
        }
        mo2282a(constantState.newDrawable(resources));
    }

    /* renamed from: f */
    public final boolean m2287f(int[] iArr) {
        if (!mo2284c()) {
            return false;
        }
        C0441f c0441f = this.f2130k;
        ColorStateList colorStateList = c0441f.f2136c;
        PorterDuff.Mode mode = c0441f.f2137d;
        if (colorStateList == null || mode == null) {
            this.f2129j = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f2129j || colorForState != this.f2127h || mode != this.f2128i) {
                setColorFilter(colorForState, mode);
                this.f2127h = colorForState;
                this.f2128i = mode;
                this.f2129j = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C0441f c0441f = this.f2130k;
        return changingConfigurations | (c0441f != null ? c0441f.getChangingConfigurations() : 0) | this.f2132m.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        C0441f c0441f = this.f2130k;
        if (c0441f == null || !c0441f.m2289a()) {
            return null;
        }
        this.f2130k.f2134a = getChangingConfigurations();
        return this.f2130k;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f2132m.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2132m.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2132m.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C0436a.m2254e(this.f2132m);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f2132m.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f2132m.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2132m.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f2132m.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f2132m.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f2132m.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return C0436a.m2256g(this.f2132m);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0441f c0441f;
        ColorStateList colorStateList = (!mo2284c() || (c0441f = this.f2130k) == null) ? null : c0441f.f2136c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f2132m.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f2132m.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f2131l && super.mutate() == this) {
            this.f2130k = m2285d();
            Drawable drawable = this.f2132m;
            if (drawable != null) {
                drawable.mutate();
            }
            C0441f c0441f = this.f2130k;
            if (c0441f != null) {
                Drawable drawable2 = this.f2132m;
                c0441f.f2135b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f2131l = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2132m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        return C0436a.m2261l(this.f2132m, i10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        return this.f2132m.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f2132m.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        C0436a.m2258i(this.f2132m, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i10) {
        this.f2132m.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2132m.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f2132m.setDither(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f2132m.setFilterBitmap(z10);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m2287f(iArr) || this.f2132m.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintList(ColorStateList colorStateList) {
        this.f2130k.f2136c = colorStateList;
        m2287f(getState());
    }

    @Override // android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2130k.f2137d = mode;
        m2287f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return super.setVisible(z10, z11) || this.f2132m.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
