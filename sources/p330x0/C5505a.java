package p330x0;

import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p079f6.C1841a;
import p133j0.C3205d;

/* renamed from: x0.a */
/* loaded from: classes.dex */
public final class C5505a {

    /* renamed from: a */
    public final b f20602a;

    /* renamed from: b */
    public int f20603b = C1841a.e.API_PRIORITY_OTHER;

    /* renamed from: c */
    public int f20604c = 0;

    /* renamed from: x0.a$a */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a */
        public final EditText f20605a;

        /* renamed from: b */
        public final C5511g f20606b;

        public a(EditText editText, boolean z10) {
            this.f20605a = editText;
            C5511g c5511g = new C5511g(editText, z10);
            this.f20606b = c5511g;
            editText.addTextChangedListener(c5511g);
            editText.setEditableFactory(C5506b.getInstance());
        }

        @Override // p330x0.C5505a.b
        /* renamed from: a */
        public KeyListener mo22161a(KeyListener keyListener) {
            if (keyListener instanceof C5509e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new C5509e(keyListener);
        }

        @Override // p330x0.C5505a.b
        /* renamed from: b */
        public InputConnection mo22162b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof C5507c ? inputConnection : new C5507c(this.f20605a, inputConnection, editorInfo);
        }

        @Override // p330x0.C5505a.b
        /* renamed from: c */
        public void mo22163c(boolean z10) {
            this.f20606b.m22189c(z10);
        }
    }

    /* renamed from: x0.a$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public KeyListener mo22161a(KeyListener keyListener) {
            return keyListener;
        }

        /* renamed from: b */
        public InputConnection mo22162b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection;
        }

        /* renamed from: c */
        public void mo22163c(boolean z10) {
        }
    }

    public C5505a(EditText editText, boolean z10) {
        C3205d.m11415k(editText, "editText cannot be null");
        if (Build.VERSION.SDK_INT < 19) {
            this.f20602a = new b();
        } else {
            this.f20602a = new a(editText, z10);
        }
    }

    /* renamed from: a */
    public KeyListener m22158a(KeyListener keyListener) {
        return this.f20602a.mo22161a(keyListener);
    }

    /* renamed from: b */
    public InputConnection m22159b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f20602a.mo22162b(inputConnection, editorInfo);
    }

    /* renamed from: c */
    public void m22160c(boolean z10) {
        this.f20602a.mo22163c(z10);
    }
}
