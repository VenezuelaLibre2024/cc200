package p187n;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p089g.C1940j;
import p330x0.C5505a;

/* renamed from: n.l */
/* loaded from: classes.dex */
public class C3644l {

    /* renamed from: a */
    public final EditText f12953a;

    /* renamed from: b */
    public final C5505a f12954b;

    public C3644l(EditText editText) {
        this.f12953a = editText;
        this.f12954b = new C5505a(editText, false);
    }

    /* renamed from: a */
    public KeyListener m13603a(KeyListener keyListener) {
        return m13604b(keyListener) ? this.f12954b.m22158a(keyListener) : keyListener;
    }

    /* renamed from: b */
    public boolean m13604b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* renamed from: c */
    public void m13605c(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f12953a.getContext().obtainStyledAttributes(attributeSet, C1940j.f7644g0, i10, 0);
        try {
            int i11 = C1940j.f7714u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            m13607e(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: d */
    public InputConnection m13606d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f12954b.m22159b(inputConnection, editorInfo);
    }

    /* renamed from: e */
    public void m13607e(boolean z10) {
        this.f12954b.m22160c(z10);
    }
}
