package p187n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p148k0.InterfaceC3343z;
import p188n0.InterfaceC3687n;

/* renamed from: n.e0 */
/* loaded from: classes.dex */
public class C3629e0 extends ToggleButton implements InterfaceC3343z, InterfaceC3687n {

    /* renamed from: h */
    public final C3625d f12839h;

    /* renamed from: i */
    public final C3620b0 f12840i;

    /* renamed from: j */
    public C3646m f12841j;

    public C3629e0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public C3629e0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C3657r0.m13693a(this, getContext());
        C3625d c3625d = new C3625d(this);
        this.f12839h = c3625d;
        c3625d.m13455e(attributeSet, i10);
        C3620b0 c3620b0 = new C3620b0(this);
        this.f12840i = c3620b0;
        c3620b0.m13407m(attributeSet, i10);
        getEmojiTextViewHelper().m13609b(attributeSet, i10);
    }

    private C3646m getEmojiTextViewHelper() {
        if (this.f12841j == null) {
            this.f12841j = new C3646m(this);
        }
        return this.f12841j;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3625d c3625d = this.f12839h;
        if (c3625d != null) {
            c3625d.m13452b();
        }
        C3620b0 c3620b0 = this.f12840i;
        if (c3620b0 != null) {
            c3620b0.m13397b();
        }
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f12839h;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f12839h;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12840i.m13404j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12840i.m13405k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m13610c(z10);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f12839h;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f12839h;
        if (c3625d != null) {
            c3625d.m13457g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12840i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12840i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m13611d(z10);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m13608a(inputFilterArr));
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3625d c3625d = this.f12839h;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f12839h;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f12840i.m13417w(colorStateList);
        this.f12840i.m13397b();
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f12840i.m13418x(mode);
        this.f12840i.m13397b();
    }
}
