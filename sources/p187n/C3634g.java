package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p089g.C1931a;
import p118i.C2572a;
import p148k0.InterfaceC3343z;
import p188n0.C3683j;
import p188n0.InterfaceC3685l;
import p188n0.InterfaceC3687n;

/* renamed from: n.g */
/* loaded from: classes.dex */
public class C3634g extends CheckedTextView implements InterfaceC3685l, InterfaceC3343z, InterfaceC3687n {

    /* renamed from: h */
    public final C3636h f12847h;

    /* renamed from: i */
    public final C3625d f12848i;

    /* renamed from: j */
    public final C3620b0 f12849j;

    /* renamed from: k */
    public C3646m f12850k;

    public C3634g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7347s);
    }

    public C3634g(Context context, AttributeSet attributeSet, int i10) {
        super(C3661t0.m13708b(context), attributeSet, i10);
        C3657r0.m13693a(this, getContext());
        C3620b0 c3620b0 = new C3620b0(this);
        this.f12849j = c3620b0;
        c3620b0.m13407m(attributeSet, i10);
        c3620b0.m13397b();
        C3625d c3625d = new C3625d(this);
        this.f12848i = c3625d;
        c3625d.m13455e(attributeSet, i10);
        C3636h c3636h = new C3636h(this);
        this.f12847h = c3636h;
        c3636h.m13507d(attributeSet, i10);
        getEmojiTextViewHelper().m13609b(attributeSet, i10);
    }

    private C3646m getEmojiTextViewHelper() {
        if (this.f12850k == null) {
            this.f12850k = new C3646m(this);
        }
        return this.f12850k;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C3620b0 c3620b0 = this.f12849j;
        if (c3620b0 != null) {
            c3620b0.m13397b();
        }
        C3625d c3625d = this.f12848i;
        if (c3625d != null) {
            c3625d.m13452b();
        }
        C3636h c3636h = this.f12847h;
        if (c3636h != null) {
            c3636h.m13504a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C3683j.m13859m(super.getCustomSelectionActionModeCallback());
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f12848i;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f12848i;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C3636h c3636h = this.f12847h;
        if (c3636h != null) {
            return c3636h.m13505b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C3636h c3636h = this.f12847h;
        if (c3636h != null) {
            return c3636h.m13506c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12849j.m13404j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12849j.m13405k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C3648n.m13620a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m13610c(z10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f12848i;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f12848i;
        if (c3625d != null) {
            c3625d.m13457g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(C2572a.m10278b(getContext(), i10));
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C3636h c3636h = this.f12847h;
        if (c3636h != null) {
            c3636h.m13508e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12849j;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12849j;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C3683j.m13860n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m13611d(z10);
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3625d c3625d = this.f12848i;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f12848i;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }

    @Override // p188n0.InterfaceC3685l
    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C3636h c3636h = this.f12847h;
        if (c3636h != null) {
            c3636h.m13509f(colorStateList);
        }
    }

    @Override // p188n0.InterfaceC3685l
    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C3636h c3636h = this.f12847h;
        if (c3636h != null) {
            c3636h.m13510g(mode);
        }
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f12849j.m13417w(colorStateList);
        this.f12849j.m13397b();
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f12849j.m13418x(mode);
        this.f12849j.m13397b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C3620b0 c3620b0 = this.f12849j;
        if (c3620b0 != null) {
            c3620b0.m13411q(context, i10);
        }
    }
}
