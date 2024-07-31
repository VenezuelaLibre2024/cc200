package p148k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: k0.h0 */
/* loaded from: classes.dex */
public final class C3320h0 {

    /* renamed from: a */
    public final WeakReference<View> f11583a;

    /* renamed from: b */
    public Runnable f11584b = null;

    /* renamed from: c */
    public Runnable f11585c = null;

    /* renamed from: d */
    public int f11586d = -1;

    /* renamed from: k0.h0$a */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3322i0 f11587a;

        /* renamed from: b */
        public final /* synthetic */ View f11588b;

        public a(InterfaceC3322i0 interfaceC3322i0, View view) {
            this.f11587a = interfaceC3322i0;
            this.f11588b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f11587a.mo1114a(this.f11588b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f11587a.mo1115b(this.f11588b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f11587a.mo1116c(this.f11588b);
        }
    }

    /* renamed from: k0.h0$b */
    /* loaded from: classes.dex */
    public static class b {
        /* renamed from: a */
        public static ViewPropertyAnimator m12261a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* renamed from: k0.h0$c */
    /* loaded from: classes.dex */
    public static class c implements InterfaceC3322i0 {

        /* renamed from: a */
        public C3320h0 f11590a;

        /* renamed from: b */
        public boolean f11591b;

        public c(C3320h0 c3320h0) {
            this.f11590a = c3320h0;
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: a */
        public void mo1114a(View view) {
            Object tag = view.getTag(2113929216);
            InterfaceC3322i0 interfaceC3322i0 = tag instanceof InterfaceC3322i0 ? (InterfaceC3322i0) tag : null;
            if (interfaceC3322i0 != null) {
                interfaceC3322i0.mo1114a(view);
            }
        }

        @Override // p148k0.InterfaceC3322i0
        @SuppressLint({"WrongConstant"})
        /* renamed from: b */
        public void mo1115b(View view) {
            int i10 = this.f11590a.f11586d;
            if (i10 > -1) {
                view.setLayerType(i10, null);
                this.f11590a.f11586d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f11591b) {
                C3320h0 c3320h0 = this.f11590a;
                Runnable runnable = c3320h0.f11585c;
                if (runnable != null) {
                    c3320h0.f11585c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                InterfaceC3322i0 interfaceC3322i0 = tag instanceof InterfaceC3322i0 ? (InterfaceC3322i0) tag : null;
                if (interfaceC3322i0 != null) {
                    interfaceC3322i0.mo1115b(view);
                }
                this.f11591b = true;
            }
        }

        @Override // p148k0.InterfaceC3322i0
        /* renamed from: c */
        public void mo1116c(View view) {
            this.f11591b = false;
            if (this.f11590a.f11586d > -1) {
                view.setLayerType(2, null);
            }
            C3320h0 c3320h0 = this.f11590a;
            Runnable runnable = c3320h0.f11584b;
            if (runnable != null) {
                c3320h0.f11584b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            InterfaceC3322i0 interfaceC3322i0 = tag instanceof InterfaceC3322i0 ? (InterfaceC3322i0) tag : null;
            if (interfaceC3322i0 != null) {
                interfaceC3322i0.mo1116c(view);
            }
        }
    }

    public C3320h0(View view) {
        this.f11583a = new WeakReference<>(view);
    }

    /* renamed from: b */
    public C3320h0 m12250b(float f10) {
        View view = this.f11583a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    /* renamed from: c */
    public void m12251c() {
        View view = this.f11583a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m12252d() {
        View view = this.f11583a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public C3320h0 m12253f(long j10) {
        View view = this.f11583a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    /* renamed from: g */
    public C3320h0 m12254g(Interpolator interpolator) {
        View view = this.f11583a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: h */
    public C3320h0 m12255h(InterfaceC3322i0 interfaceC3322i0) {
        View view = this.f11583a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, interfaceC3322i0);
                interfaceC3322i0 = new c(this);
            }
            m12256i(view, interfaceC3322i0);
        }
        return this;
    }

    /* renamed from: i */
    public final void m12256i(View view, InterfaceC3322i0 interfaceC3322i0) {
        if (interfaceC3322i0 != null) {
            view.animate().setListener(new a(interfaceC3322i0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: j */
    public C3320h0 m12257j(long j10) {
        View view = this.f11583a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    /* renamed from: k */
    public C3320h0 m12258k(final InterfaceC3326k0 interfaceC3326k0) {
        final View view = this.f11583a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b.m12261a(view.animate(), interfaceC3326k0 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: k0.g0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    InterfaceC3326k0.this.mo9218a(view);
                }
            } : null);
        }
        return this;
    }

    /* renamed from: l */
    public void m12259l() {
        View view = this.f11583a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: m */
    public C3320h0 m12260m(float f10) {
        View view = this.f11583a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
