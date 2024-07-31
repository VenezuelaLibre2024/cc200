package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public class LayoutInflaterFactory2C0319q implements LayoutInflater.Factory2 {

    /* renamed from: h */
    public final AbstractC0326x f1573h;

    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: h */
        public final /* synthetic */ C0297e0 f1574h;

        public a(C0297e0 c0297e0) {
            this.f1574h = c0297e0;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m1445k = this.f1574h.m1445k();
            this.f1574h.m1447m();
            AbstractC0313m0.m1545n((ViewGroup) m1445k.mView.getParent(), LayoutInflaterFactory2C0319q.this.f1573h).m1555j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C0319q(AbstractC0326x abstractC0326x) {
        this.f1573h = abstractC0326x;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016d  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.LayoutInflaterFactory2C0319q.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
