package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p089g.C1931a;
import p118i.C2572a;
import p148k0.InterfaceC3343z;
import p188n0.InterfaceC3686m;
import p188n0.InterfaceC3687n;

/* renamed from: n.f */
/* loaded from: classes.dex */
public class C3631f extends CheckBox implements InterfaceC3686m, InterfaceC3343z, InterfaceC3687n {

    /* renamed from: h */
    public final C3638i f12843h;

    /* renamed from: i */
    public final C3625d f12844i;

    /* renamed from: j */
    public final C3620b0 f12845j;

    /* renamed from: k */
    public C3646m f12846k;

    public C3631f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7346r);
    }

    public C3631f(Context context, AttributeSet attributeSet, int i10) {
        super(C3661t0.m13708b(context), attributeSet, i10);
        C3657r0.m13693a(this, getContext());
        C3638i c3638i = new C3638i(this);
        this.f12843h = c3638i;
        c3638i.m13519e(attributeSet, i10);
        C3625d c3625d = new C3625d(this);
        this.f12844i = c3625d;
        c3625d.m13455e(attributeSet, i10);
        C3620b0 c3620b0 = new C3620b0(this);
        this.f12845j = c3620b0;
        c3620b0.m13407m(attributeSet, i10);
        getEmojiTextViewHelper().m13609b(attributeSet, i10);
    }

    private C3646m getEmojiTextViewHelper() {
        if (this.f12846k == null) {
            this.f12846k = new C3646m(this);
        }
        return this.f12846k;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3625d c3625d = this.f12844i;
        if (c3625d != null) {
            c3625d.m13452b();
        }
        C3620b0 c3620b0 = this.f12845j;
        if (c3620b0 != null) {
            c3620b0.m13397b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C3638i c3638i = this.f12843h;
        return c3638i != null ? c3638i.m13516b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f12844i;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f12844i;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C3638i c3638i = this.f12843h;
        if (c3638i != null) {
            return c3638i.m13517c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C3638i c3638i = this.f12843h;
        if (c3638i != null) {
            return c3638i.m13518d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12845j.m13404j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12845j.m13405k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m13610c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f12844i;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f12844i;
        if (c3625d != null) {
            c3625d.m13457g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C2572a.m10278b(getContext(), i10));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C3638i c3638i = this.f12843h;
        if (c3638i != null) {
            c3638i.m13520f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12845j;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12845j;
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
        C3625d c3625d = this.f12844i;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f12844i;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }

    @Override // p188n0.InterfaceC3686m
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C3638i c3638i = this.f12843h;
        if (c3638i != null) {
            c3638i.m13521g(colorStateList);
        }
    }

    @Override // p188n0.InterfaceC3686m
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C3638i c3638i = this.f12843h;
        if (c3638i != null) {
            c3638i.m13522h(mode);
        }
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f12845j.m13417w(colorStateList);
        this.f12845j.m13397b();
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f12845j.m13418x(mode);
        this.f12845j.m13397b();
    }
}
