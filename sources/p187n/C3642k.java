package p187n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import p089g.C1931a;
import p148k0.C3308b0;
import p148k0.C3309c;
import p148k0.InterfaceC3341x;
import p148k0.InterfaceC3343z;
import p176m0.C3492a;
import p176m0.C3494c;
import p188n0.C3683j;
import p188n0.C3684k;
import p188n0.InterfaceC3687n;

/* renamed from: n.k */
/* loaded from: classes.dex */
public class C3642k extends EditText implements InterfaceC3343z, InterfaceC3341x, InterfaceC3687n {

    /* renamed from: h */
    public final C3625d f12906h;

    /* renamed from: i */
    public final C3620b0 f12907i;

    /* renamed from: j */
    public final C3617a0 f12908j;

    /* renamed from: k */
    public final C3684k f12909k;

    /* renamed from: l */
    public final C3644l f12910l;

    public C3642k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7317B);
    }

    public C3642k(Context context, AttributeSet attributeSet, int i10) {
        super(C3661t0.m13708b(context), attributeSet, i10);
        C3657r0.m13693a(this, getContext());
        C3625d c3625d = new C3625d(this);
        this.f12906h = c3625d;
        c3625d.m13455e(attributeSet, i10);
        C3620b0 c3620b0 = new C3620b0(this);
        this.f12907i = c3620b0;
        c3620b0.m13407m(attributeSet, i10);
        c3620b0.m13397b();
        this.f12908j = new C3617a0(this);
        this.f12909k = new C3684k();
        C3644l c3644l = new C3644l(this);
        this.f12910l = c3644l;
        c3644l.m13605c(attributeSet, i10);
        m13569b(c3644l);
    }

    @Override // p148k0.InterfaceC3341x
    /* renamed from: a */
    public C3309c mo11976a(C3309c c3309c) {
        return this.f12909k.mo12394a(this, c3309c);
    }

    /* renamed from: b */
    public void m13569b(C3644l c3644l) {
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
        C3625d c3625d = this.f12906h;
        if (c3625d != null) {
            c3625d.m13452b();
        }
        C3620b0 c3620b0 = this.f12907i;
        if (c3620b0 != null) {
            c3620b0.m13397b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C3683j.m13859m(super.getCustomSelectionActionModeCallback());
    }

    @Override // p148k0.InterfaceC3343z
    public ColorStateList getSupportBackgroundTintList() {
        C3625d c3625d = this.f12906h;
        if (c3625d != null) {
            return c3625d.m13453c();
        }
        return null;
    }

    @Override // p148k0.InterfaceC3343z
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C3625d c3625d = this.f12906h;
        if (c3625d != null) {
            return c3625d.m13454d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f12907i.m13404j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f12907i.m13405k();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C3617a0 c3617a0;
        return (Build.VERSION.SDK_INT >= 28 || (c3617a0 = this.f12908j) == null) ? super.getTextClassifier() : c3617a0.m13388a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m12050x;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f12907i.m13412r(this, onCreateInputConnection, editorInfo);
        InputConnection m13620a = C3648n.m13620a(onCreateInputConnection, editorInfo, this);
        if (m13620a != null && Build.VERSION.SDK_INT <= 30 && (m12050x = C3308b0.m12050x(this)) != null) {
            C3492a.m12989d(editorInfo, m12050x);
            m13620a = C3494c.m12998c(this, m13620a, editorInfo);
        }
        return this.f12910l.m13606d(m13620a, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (C3666w.m13710a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (C3666w.m13711b(this, i10)) {
            return true;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C3625d c3625d = this.f12906h;
        if (c3625d != null) {
            c3625d.m13456f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        C3625d c3625d = this.f12906h;
        if (c3625d != null) {
            c3625d.m13457g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12907i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C3620b0 c3620b0 = this.f12907i;
        if (c3620b0 != null) {
            c3620b0.m13410p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C3683j.m13860n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        this.f12910l.m13607e(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f12910l.m13603a(keyListener));
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C3625d c3625d = this.f12906h;
        if (c3625d != null) {
            c3625d.m13459i(colorStateList);
        }
    }

    @Override // p148k0.InterfaceC3343z
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C3625d c3625d = this.f12906h;
        if (c3625d != null) {
            c3625d.m13460j(mode);
        }
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f12907i.m13417w(colorStateList);
        this.f12907i.m13397b();
    }

    @Override // p188n0.InterfaceC3687n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f12907i.m13418x(mode);
        this.f12907i.m13397b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        C3620b0 c3620b0 = this.f12907i;
        if (c3620b0 != null) {
            c3620b0.m13411q(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C3617a0 c3617a0;
        if (Build.VERSION.SDK_INT >= 28 || (c3617a0 = this.f12908j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3617a0.m13389b(textClassifier);
        }
    }
}
