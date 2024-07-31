package p015b0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: b0.f */
/* loaded from: classes.dex */
public final class C0441f extends Drawable.ConstantState {

    /* renamed from: a */
    public int f2134a;

    /* renamed from: b */
    public Drawable.ConstantState f2135b;

    /* renamed from: c */
    public ColorStateList f2136c;

    /* renamed from: d */
    public PorterDuff.Mode f2137d;

    public C0441f(C0441f c0441f) {
        this.f2136c = null;
        this.f2137d = C0439d.f2126n;
        if (c0441f != null) {
            this.f2134a = c0441f.f2134a;
            this.f2135b = c0441f.f2135b;
            this.f2136c = c0441f.f2136c;
            this.f2137d = c0441f.f2137d;
        }
    }

    /* renamed from: a */
    public boolean m2289a() {
        return this.f2135b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i10 = this.f2134a;
        Drawable.ConstantState constantState = this.f2135b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return Build.VERSION.SDK_INT >= 21 ? new C0440e(this, resources) : new C0439d(this, resources);
    }
}
