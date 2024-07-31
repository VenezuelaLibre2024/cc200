package p330x0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0261e;

/* renamed from: x0.e */
/* loaded from: classes.dex */
public final class C5509e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f20616a;

    /* renamed from: b */
    public final a f20617b;

    /* renamed from: x0.e$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public boolean m22170a(Editable editable, int i10, KeyEvent keyEvent) {
            return C0261e.m1244f(editable, i10, keyEvent);
        }
    }

    public C5509e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    public C5509e(KeyListener keyListener, a aVar) {
        this.f20616a = keyListener;
        this.f20617b = aVar;
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f20616a.clearMetaKeyState(view, editable, i10);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f20616a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f20617b.m22170a(editable, i10, keyEvent) || this.f20616a.onKeyDown(view, editable, i10, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f20616a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f20616a.onKeyUp(view, editable, i10, keyEvent);
    }
}
