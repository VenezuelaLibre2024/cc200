package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p148k0.C3308b0;
import p148k0.C3328l0;
import p361z0.C5941c;
import td.C4753m;

/* renamed from: androidx.fragment.app.m */
/* loaded from: classes.dex */
public final class C0312m extends FrameLayout {

    /* renamed from: h */
    public final List<View> f1532h;

    /* renamed from: i */
    public final List<View> f1533i;

    /* renamed from: j */
    public View.OnApplyWindowInsetsListener f1534j;

    /* renamed from: k */
    public boolean f1535k;

    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public static final a f1536a = new a();

        /* renamed from: a */
        public final WindowInsets m1544a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            C4753m.m18653f(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            C4753m.m18653f(view, "v");
            C4753m.m18653f(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            C4753m.m18652e(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0312m(Context context, AttributeSet attributeSet, AbstractC0326x abstractC0326x) {
        super(context, attributeSet);
        String str;
        C4753m.m18653f(context, "context");
        C4753m.m18653f(attributeSet, "attrs");
        C4753m.m18653f(abstractC0326x, "fm");
        this.f1532h = new ArrayList();
        this.f1533i = new ArrayList();
        this.f1535k = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C5941c.f22093e;
        C4753m.m18652e(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C5941c.f22094f) : classAttribute;
        String string = obtainStyledAttributes.getString(C5941c.f22095g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment m1696i0 = abstractC0326x.m1696i0(id2);
        if (classAttribute != null && m1696i0 == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment mo1595a = abstractC0326x.m1726t0().mo1595a(context.getClassLoader(), classAttribute);
            C4753m.m18652e(mo1595a, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            mo1595a.onInflate(context, attributeSet, (Bundle) null);
            abstractC0326x.m1713p().m1490m(true).m1486c(this, mo1595a, string).mo1362i();
        }
        abstractC0326x.m1681a1(this);
    }

    /* renamed from: a */
    public final void m1543a(View view) {
        if (this.f1533i.contains(view)) {
            this.f1532h.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        C4753m.m18653f(view, "child");
        if (AbstractC0326x.m1616C0(view) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C3328l0 m12000N;
        C4753m.m18653f(windowInsets, "insets");
        C3328l0 m12276v = C3328l0.m12276v(windowInsets);
        C4753m.m18652e(m12276v, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1534j;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f1536a;
            C4753m.m18650c(onApplyWindowInsetsListener);
            m12000N = C3328l0.m12276v(aVar.m1544a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            m12000N = C3308b0.m12000N(this, m12276v);
        }
        C4753m.m18652e(m12000N, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!m12000N.m12290n()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                C3308b0.m12025g(getChildAt(i10), m12000N);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        C4753m.m18653f(canvas, "canvas");
        if (this.f1535k) {
            Iterator<T> it = this.f1532h.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        C4753m.m18653f(canvas, "canvas");
        C4753m.m18653f(view, "child");
        if (this.f1535k && (!this.f1532h.isEmpty()) && this.f1532h.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        C4753m.m18653f(view, "view");
        this.f1533i.remove(view);
        if (this.f1532h.remove(view)) {
            this.f1535k = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) AbstractC0326x.m1632l0(this).m1696i0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C4753m.m18653f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                C4753m.m18652e(childAt, "view");
                m1543a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        C4753m.m18653f(view, "view");
        m1543a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        C4753m.m18652e(childAt, "view");
        m1543a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        C4753m.m18653f(view, "view");
        m1543a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            C4753m.m18652e(childAt, "view");
            m1543a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            C4753m.m18652e(childAt, "view");
            m1543a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.f1535k = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT >= 18) {
            throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
        }
        super.setLayoutTransition(layoutTransition);
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C4753m.m18653f(onApplyWindowInsetsListener, "listener");
        this.f1534j = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        C4753m.m18653f(view, "view");
        if (view.getParent() == this) {
            this.f1533i.add(view);
        }
        super.startViewTransition(view);
    }
}
