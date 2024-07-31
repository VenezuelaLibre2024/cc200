package p148k0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* renamed from: k0.y */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3342y implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: h */
    public final View f11649h;

    /* renamed from: i */
    public ViewTreeObserver f11650i;

    /* renamed from: j */
    public final Runnable f11651j;

    public ViewTreeObserverOnPreDrawListenerC3342y(View view, Runnable runnable) {
        this.f11649h = view;
        this.f11650i = view.getViewTreeObserver();
        this.f11651j = runnable;
    }

    /* renamed from: a */
    public static ViewTreeObserverOnPreDrawListenerC3342y m12395a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        ViewTreeObserverOnPreDrawListenerC3342y viewTreeObserverOnPreDrawListenerC3342y = new ViewTreeObserverOnPreDrawListenerC3342y(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC3342y);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC3342y);
        return viewTreeObserverOnPreDrawListenerC3342y;
    }

    /* renamed from: b */
    public void m12396b() {
        (this.f11650i.isAlive() ? this.f11650i : this.f11649h.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f11649h.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m12396b();
        this.f11651j.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f11650i = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m12396b();
    }
}
