package p330x0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0261e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p079f6.C1841a;

/* renamed from: x0.g */
/* loaded from: classes.dex */
public final class C5511g implements TextWatcher {

    /* renamed from: h */
    public final EditText f20623h;

    /* renamed from: i */
    public final boolean f20624i;

    /* renamed from: j */
    public C0261e.e f20625j;

    /* renamed from: k */
    public int f20626k = C1841a.e.API_PRIORITY_OTHER;

    /* renamed from: l */
    public int f20627l = 0;

    /* renamed from: m */
    public boolean f20628m = true;

    /* renamed from: x0.g$a */
    /* loaded from: classes.dex */
    public static class a extends C0261e.e {

        /* renamed from: a */
        public final Reference<EditText> f20629a;

        public a(EditText editText) {
            this.f20629a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C0261e.e
        /* renamed from: b */
        public void mo1269b() {
            super.mo1269b();
            C5511g.m22187b(this.f20629a.get(), 1);
        }
    }

    public C5511g(EditText editText, boolean z10) {
        this.f20623h = editText;
        this.f20624i = z10;
    }

    /* renamed from: b */
    public static void m22187b(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0261e.m1242b().m1255o(editableText);
            C5508d.m22167b(editableText, selectionStart, selectionEnd);
        }
    }

    /* renamed from: a */
    public final C0261e.e m22188a() {
        if (this.f20625j == null) {
            this.f20625j = new a(this.f20623h);
        }
        return this.f20625j;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    /* renamed from: c */
    public void m22189c(boolean z10) {
        if (this.f20628m != z10) {
            if (this.f20625j != null) {
                C0261e.m1242b().m1260t(this.f20625j);
            }
            this.f20628m = z10;
            if (z10) {
                m22187b(this.f20623h, C0261e.m1242b().m1248d());
            }
        }
    }

    /* renamed from: d */
    public final boolean m22190d() {
        return (this.f20628m && (this.f20624i || C0261e.m1246h())) ? false : true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (this.f20623h.isInEditMode() || m22190d() || i11 > i12 || !(charSequence instanceof Spannable)) {
            return;
        }
        int m1248d = C0261e.m1242b().m1248d();
        if (m1248d != 0) {
            if (m1248d == 1) {
                C0261e.m1242b().m1258r((Spannable) charSequence, i10, i10 + i12, this.f20626k, this.f20627l);
                return;
            } else if (m1248d != 3) {
                return;
            }
        }
        C0261e.m1242b().m1259s(m22188a());
    }
}
