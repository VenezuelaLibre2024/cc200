package p330x0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0261e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* renamed from: x0.d */
/* loaded from: classes.dex */
public final class C5508d implements InputFilter {

    /* renamed from: a */
    public final TextView f20612a;

    /* renamed from: b */
    public C0261e.e f20613b;

    /* renamed from: x0.d$a */
    /* loaded from: classes.dex */
    public static class a extends C0261e.e {

        /* renamed from: a */
        public final Reference<TextView> f20614a;

        /* renamed from: b */
        public final Reference<C5508d> f20615b;

        public a(TextView textView, C5508d c5508d) {
            this.f20614a = new WeakReference(textView);
            this.f20615b = new WeakReference(c5508d);
        }

        @Override // androidx.emoji2.text.C0261e.e
        /* renamed from: b */
        public void mo1269b() {
            CharSequence text;
            CharSequence m1255o;
            super.mo1269b();
            TextView textView = this.f20614a.get();
            if (m22169c(textView, this.f20615b.get()) && textView.isAttachedToWindow() && text != (m1255o = C0261e.m1242b().m1255o((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(m1255o);
                int selectionEnd = Selection.getSelectionEnd(m1255o);
                textView.setText(m1255o);
                if (m1255o instanceof Spannable) {
                    C5508d.m22167b((Spannable) m1255o, selectionStart, selectionEnd);
                }
            }
        }

        /* renamed from: c */
        public final boolean m22169c(TextView textView, InputFilter inputFilter) {
            InputFilter[] filters;
            if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
                return false;
            }
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    return true;
                }
            }
            return false;
        }
    }

    public C5508d(TextView textView) {
        this.f20612a = textView;
    }

    /* renamed from: b */
    public static void m22167b(Spannable spannable, int i10, int i11) {
        if (i10 >= 0 && i11 >= 0) {
            Selection.setSelection(spannable, i10, i11);
        } else if (i10 >= 0) {
            Selection.setSelection(spannable, i10);
        } else if (i11 >= 0) {
            Selection.setSelection(spannable, i11);
        }
    }

    /* renamed from: a */
    public final C0261e.e m22168a() {
        if (this.f20613b == null) {
            this.f20613b = new a(this.f20612a, this);
        }
        return this.f20613b;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (this.f20612a.isInEditMode()) {
            return charSequence;
        }
        int m1248d = C0261e.m1242b().m1248d();
        if (m1248d != 0) {
            boolean z10 = true;
            if (m1248d == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == this.f20612a.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return C0261e.m1242b().m1256p(charSequence, 0, charSequence.length());
            }
            if (m1248d != 3) {
                return charSequence;
            }
        }
        C0261e.m1242b().m1259s(m22168a());
        return charSequence;
    }
}
