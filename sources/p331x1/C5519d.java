package p331x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import p148k0.C3308b0;

/* renamed from: x1.d */
/* loaded from: classes.dex */
public class C5519d extends AbstractC5532j0 {

    /* renamed from: x1.d$a */
    /* loaded from: classes.dex */
    public class a extends C5539n {

        /* renamed from: a */
        public final /* synthetic */ View f20672a;

        public a(View view) {
            this.f20672a = view;
        }

        @Override // p331x1.AbstractC5537m.f
        /* renamed from: d */
        public void mo22218d(AbstractC5537m abstractC5537m) {
            C5518c0.m22229g(this.f20672a, 1.0f);
            C5518c0.m22223a(this.f20672a);
            abstractC5537m.mo22287T(this);
        }
    }

    /* renamed from: x1.d$b */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final View f20674a;

        /* renamed from: b */
        public boolean f20675b = false;

        public b(View view) {
            this.f20674a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C5518c0.m22229g(this.f20674a, 1.0f);
            if (this.f20675b) {
                this.f20674a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (C3308b0.m11990D(this.f20674a) && this.f20674a.getLayerType() == 0) {
                this.f20675b = true;
                this.f20674a.setLayerType(2, null);
            }
        }
    }

    public C5519d(int i10) {
        m22263m0(i10);
    }

    /* renamed from: o0 */
    public static float m22237o0(C5544s c5544s, float f10) {
        Float f11;
        return (c5544s == null || (f11 = (Float) c5544s.f20797a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // p331x1.AbstractC5532j0
    /* renamed from: i0 */
    public Animator mo22238i0(ViewGroup viewGroup, View view, C5544s c5544s, C5544s c5544s2) {
        float m22237o0 = m22237o0(c5544s, 0.0f);
        return m22240n0(view, m22237o0 != 1.0f ? m22237o0 : 0.0f, 1.0f);
    }

    @Override // p331x1.AbstractC5532j0
    /* renamed from: k0 */
    public Animator mo22239k0(ViewGroup viewGroup, View view, C5544s c5544s, C5544s c5544s2) {
        C5518c0.m22227e(view);
        return m22240n0(view, m22237o0(c5544s, 1.0f), 0.0f);
    }

    @Override // p331x1.AbstractC5532j0, p331x1.AbstractC5537m
    /* renamed from: m */
    public void mo22202m(C5544s c5544s) {
        super.mo22202m(c5544s);
        c5544s.f20797a.put("android:fade:transitionAlpha", Float.valueOf(C5518c0.m22225c(c5544s.f20798b)));
    }

    /* renamed from: n0 */
    public final Animator m22240n0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        C5518c0.m22229g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C5518c0.f20670b, f11);
        ofFloat.addListener(new b(view));
        mo22295b(new a(view));
        return ofFloat;
    }
}
