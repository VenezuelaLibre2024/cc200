package p187n;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import p089g.C1940j;
import p330x0.C5510f;

/* renamed from: n.m */
/* loaded from: classes.dex */
public class C3646m {

    /* renamed from: a */
    public final TextView f12955a;

    /* renamed from: b */
    public final C5510f f12956b;

    public C3646m(TextView textView) {
        this.f12955a = textView;
        this.f12956b = new C5510f(textView, false);
    }

    /* renamed from: a */
    public InputFilter[] m13608a(InputFilter[] inputFilterArr) {
        return this.f12956b.m22171a(inputFilterArr);
    }

    /* renamed from: b */
    public void m13609b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.f12955a.getContext().obtainStyledAttributes(attributeSet, C1940j.f7644g0, i10, 0);
        try {
            int i11 = C1940j.f7714u0;
            boolean z10 = obtainStyledAttributes.hasValue(i11) ? obtainStyledAttributes.getBoolean(i11, true) : true;
            obtainStyledAttributes.recycle();
            m13611d(z10);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public void m13610c(boolean z10) {
        this.f12956b.m22172b(z10);
    }

    /* renamed from: d */
    public void m13611d(boolean z10) {
        this.f12956b.m22173c(z10);
    }
}
