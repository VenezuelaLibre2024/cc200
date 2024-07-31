package p015b0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: b0.e */
/* loaded from: classes.dex */
public class C0440e extends C0439d {

    /* renamed from: o */
    public static Method f2133o;

    public C0440e(Drawable drawable) {
        super(drawable);
        m2288g();
    }

    public C0440e(C0441f c0441f, Resources resources) {
        super(c0441f, resources);
        m2288g();
    }

    @Override // p015b0.C0439d
    /* renamed from: c */
    public boolean mo2284c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2132m;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* renamed from: g */
    public final void m2288g() {
        if (f2133o == null) {
            try {
                f2133o = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f2132m.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2132m.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f2132m;
        if (drawable != null && (method = f2133o) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e10) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e10);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        this.f2132m.setHotspot(f10, f11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        this.f2132m.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // p015b0.C0439d, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p015b0.C0439d, android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTint(int i10) {
        if (mo2284c()) {
            super.setTint(i10);
        } else {
            this.f2132m.setTint(i10);
        }
    }

    @Override // p015b0.C0439d, android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintList(ColorStateList colorStateList) {
        if (mo2284c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2132m.setTintList(colorStateList);
        }
    }

    @Override // p015b0.C0439d, android.graphics.drawable.Drawable, p015b0.InterfaceC0437b
    public void setTintMode(PorterDuff.Mode mode) {
        if (mo2284c()) {
            super.setTintMode(mode);
        } else {
            this.f2132m.setTintMode(mode);
        }
    }
}
