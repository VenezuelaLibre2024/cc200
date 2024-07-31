package p187n;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import p089g.C1940j;
import p188n0.C3682i;

/* renamed from: n.s */
/* loaded from: classes.dex */
public class C3658s extends PopupWindow {

    /* renamed from: b */
    public static final boolean f13026b;

    /* renamed from: a */
    public boolean f13027a;

    static {
        f13026b = Build.VERSION.SDK_INT < 21;
    }

    public C3658s(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        m13699a(context, attributeSet, i10, i11);
    }

    /* renamed from: a */
    public final void m13699a(Context context, AttributeSet attributeSet, int i10, int i11) {
        C3667w0 m13717u = C3667w0.m13717u(context, attributeSet, C1940j.f7607Y1, i10, i11);
        int i12 = C1940j.f7616a2;
        if (m13717u.m13735r(i12)) {
            m13700b(m13717u.m13718a(i12, false));
        }
        setBackgroundDrawable(m13717u.m13723f(C1940j.f7611Z1));
        m13717u.m13736v();
    }

    /* renamed from: b */
    public final void m13700b(boolean z10) {
        if (f13026b) {
            this.f13027a = z10;
        } else {
            C3682i.m13839a(this, z10);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11) {
        if (f13026b && this.f13027a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i10, int i11, int i12) {
        if (f13026b && this.f13027a) {
            i11 -= view.getHeight();
        }
        super.showAsDropDown(view, i10, i11, i12);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i10, int i11, int i12, int i13) {
        if (f13026b && this.f13027a) {
            i11 -= view.getHeight();
        }
        super.update(view, i10, i11, i12, i13);
    }
}
