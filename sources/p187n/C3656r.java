package p187n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p089g.C1931a;
import p118i.C2572a;
import p148k0.InterfaceC3343z;
import p188n0.InterfaceC3687n;

/* renamed from: n.r */
/* loaded from: classes.dex */
public class C3656r extends MultiAutoCompleteTextView implements InterfaceC3343z, InterfaceC3687n {

    /* renamed from: k */
    public static final int[] f13012k = {R.attr.popupBackground};

    /* renamed from: h */
    public final C3625d f13013h;

    /* renamed from: i */
    public final C3620b0 f13014i;

    /* renamed from: j */
    public final C3644l f13015j;

    public C3656r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7344p);
    }

    public C3656r(Context context, AttributeSet attributeSet, int i10) {
        super(C3661t0.m13708b(context), attributeSet, i10);
        C3657r0.m13693a(this, getContext());
        C3667w0 m13717u = C3667w0.m13717u(getContext(), attributeSet, f13012k, i10, 0);
        if (m13717u.m13735r(0)) {
            setDropDownBackgroundDrawable(m13717u.m13723f(0));
        }
        m13717u.m13736v();
        C3625d c3625d = new C3625d(this);
        this.f13013h = c3625d;
        c3625d.m13455e(attributeSet, i10);
        C3620b0 c3620b0 = new C3620b0(this);
        this.f13014i = c3620b0;
        c3620b0.m13407m(attributeSet, i10);
        c3620b0.m13397b();
        C3644l c3644l = new C3644l(this);
        this.f13015j = c3644l;
        c3644l.m13605c(attributeSet, i10);
        m13692a(c3644l);
    }

    /* renamed from: a */
    public void m13692a(C3644l c3644l) {
        KeyListener keyListener = getKeyListener();
        if (c3644l.m13604b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener m13603a = c3644l.m13603a(keyListener);
            if (m13603a == keyListener) {
                return;
            }
            super.setKeyListener(m13603a);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3625d c3625d = this.f13013h;
        if (c3625d != null) {
            c3625d.m13452b();
        }
        C3620b0 c3620b0 = this.f13014i;
        if (c3620b0 != null) {
            c3620b0.m13397b();
        }
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f13013h;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f13013h;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f13014i.m13404j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f13014i.m13405k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f13015j.m13606d(C3648n.m13620a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f13013h;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f13013h;
        if (c3625d != null) {
            c3625d.m13457g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f13014i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f13014i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(C2572a.m10278b(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f13015j.m13607e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f13015j.m13603a(keyListener));
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3625d c3625d = this.f13013h;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f13013h;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f13014i.m13417w(colorStateList);
        this.f13014i.m13397b();
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f13014i.m13418x(mode);
        this.f13014i.m13397b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C3620b0 c3620b0 = this.f13014i;
        if (c3620b0 != null) {
            c3620b0.m13411q(context, i10);
        }
    }
}
