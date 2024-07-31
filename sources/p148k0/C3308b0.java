package p148k0;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p148k0.C3305a;
import p148k0.C3308b0;
import p148k0.C3328l0;
import p285u.C4777g;
import p313w.C5186e;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: k0.b0 */
/* loaded from: classes.dex */
public class C3308b0 {

    /* renamed from: b */
    public static Field f11535b;

    /* renamed from: c */
    public static boolean f11536c;

    /* renamed from: d */
    public static WeakHashMap<View, String> f11537d;

    /* renamed from: f */
    public static Field f11539f;

    /* renamed from: h */
    public static ThreadLocal<Rect> f11541h;

    /* renamed from: a */
    public static final AtomicInteger f11534a = new AtomicInteger(1);

    /* renamed from: e */
    public static WeakHashMap<View, C3320h0> f11538e = null;

    /* renamed from: g */
    public static boolean f11540g = false;

    /* renamed from: i */
    public static final int[] f11542i = {C5186e.f19621b, C5186e.f19623c, C5186e.f19645n, C5186e.f19656y, C5186e.f19594B, C5186e.f19595C, C5186e.f19596D, C5186e.f19597E, C5186e.f19598F, C5186e.f19599G, C5186e.f19625d, C5186e.f19627e, C5186e.f19629f, C5186e.f19631g, C5186e.f19633h, C5186e.f19635i, C5186e.f19637j, C5186e.f19639k, C5186e.f19641l, C5186e.f19643m, C5186e.f19646o, C5186e.f19647p, C5186e.f19648q, C5186e.f19649r, C5186e.f19650s, C5186e.f19651t, C5186e.f19652u, C5186e.f19653v, C5186e.f19654w, C5186e.f19655x, C5186e.f19657z, C5186e.f19593A};

    /* renamed from: j */
    public static final InterfaceC3341x f11543j = C3306a0.f11530h;

    /* renamed from: k */
    public static final e f11544k = new e();

    /* renamed from: k0.b0$a */
    /* loaded from: classes.dex */
    public class a extends f<Boolean> {
        public a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: i */
        public Boolean mo12053d(View view) {
            return Boolean.valueOf(o.m12155d(view));
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: j */
        public void mo12054e(View view, Boolean bool) {
            o.m12160i(view, bool.booleanValue());
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: k */
        public boolean mo12055h(Boolean bool, Boolean bool2) {
            return !m12073a(bool, bool2);
        }
    }

    /* renamed from: k0.b0$b */
    /* loaded from: classes.dex */
    public class b extends f<CharSequence> {
        public b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: i */
        public CharSequence mo12053d(View view) {
            return o.m12153b(view);
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: j */
        public void mo12054e(View view, CharSequence charSequence) {
            o.m12159h(view, charSequence);
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: k */
        public boolean mo12055h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: k0.b0$c */
    /* loaded from: classes.dex */
    public class c extends f<CharSequence> {
        public c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: i */
        public CharSequence mo12053d(View view) {
            return q.m12165a(view);
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: j */
        public void mo12054e(View view, CharSequence charSequence) {
            q.m12166b(view, charSequence);
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: k */
        public boolean mo12055h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: k0.b0$d */
    /* loaded from: classes.dex */
    public class d extends f<Boolean> {
        public d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: i */
        public Boolean mo12053d(View view) {
            return Boolean.valueOf(o.m12154c(view));
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: j */
        public void mo12054e(View view, Boolean bool) {
            o.m12158g(view, bool.booleanValue());
        }

        @Override // p148k0.C3308b0.f
        /* renamed from: k */
        public boolean mo12055h(Boolean bool, Boolean bool2) {
            return !m12073a(bool, bool2);
        }
    }

    /* renamed from: k0.b0$e */
    /* loaded from: classes.dex */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: h */
        public final WeakHashMap<View, Boolean> f11545h = new WeakHashMap<>();

        /* renamed from: a */
        public void m12068a(View view) {
            this.f11545h.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (k.m12113b(view)) {
                m12070c(view);
            }
        }

        /* renamed from: b */
        public final void m12069b(View view, boolean z10) {
            boolean z11 = view.isShown() && view.getWindowVisibility() == 0;
            if (z10 != z11) {
                C3308b0.m11997K(view, z11 ? 16 : 32);
                this.f11545h.put(view, Boolean.valueOf(z11));
            }
        }

        /* renamed from: c */
        public final void m12070c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        /* renamed from: d */
        public void m12071d(View view) {
            this.f11545h.remove(view);
            view.removeOnAttachStateChangeListener(this);
            m12072e(view);
        }

        /* renamed from: e */
        public final void m12072e(View view) {
            h.m12093o(view.getViewTreeObserver(), this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f11545h.entrySet()) {
                    m12069b(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m12070c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: k0.b0$f */
    /* loaded from: classes.dex */
    public static abstract class f<T> {

        /* renamed from: a */
        public final int f11546a;

        /* renamed from: b */
        public final Class<T> f11547b;

        /* renamed from: c */
        public final int f11548c;

        /* renamed from: d */
        public final int f11549d;

        public f(int i10, Class<T> cls, int i11) {
            this(i10, cls, 0, i11);
        }

        public f(int i10, Class<T> cls, int i11, int i12) {
            this.f11546a = i10;
            this.f11547b = cls;
            this.f11549d = i11;
            this.f11548c = i12;
        }

        /* renamed from: a */
        public boolean m12073a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: b */
        public final boolean m12074b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        public final boolean m12075c() {
            return Build.VERSION.SDK_INT >= this.f11548c;
        }

        /* renamed from: d */
        public abstract T mo12053d(View view);

        /* renamed from: e */
        public abstract void mo12054e(View view, T t10);

        /* renamed from: f */
        public T m12076f(View view) {
            if (m12075c()) {
                return mo12053d(view);
            }
            if (!m12074b()) {
                return null;
            }
            T t10 = (T) view.getTag(this.f11546a);
            if (this.f11547b.isInstance(t10)) {
                return t10;
            }
            return null;
        }

        /* renamed from: g */
        public void m12077g(View view, T t10) {
            if (m12075c()) {
                mo12054e(view, t10);
            } else if (m12074b() && mo12055h(m12076f(view), t10)) {
                C3308b0.m12031j(view);
                view.setTag(this.f11546a, t10);
                C3308b0.m11997K(view, this.f11549d);
            }
        }

        /* renamed from: h */
        public abstract boolean mo12055h(T t10, T t11);
    }

    /* renamed from: k0.b0$g */
    /* loaded from: classes.dex */
    public static class g {
        /* renamed from: a */
        public static boolean m12078a(View view) {
            return view.hasOnClickListeners();
        }
    }

    /* renamed from: k0.b0$h */
    /* loaded from: classes.dex */
    public static class h {
        /* renamed from: a */
        public static AccessibilityNodeProvider m12079a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        /* renamed from: b */
        public static boolean m12080b(View view) {
            return view.getFitsSystemWindows();
        }

        /* renamed from: c */
        public static int m12081c(View view) {
            return view.getImportantForAccessibility();
        }

        /* renamed from: d */
        public static int m12082d(View view) {
            return view.getMinimumHeight();
        }

        /* renamed from: e */
        public static int m12083e(View view) {
            return view.getMinimumWidth();
        }

        /* renamed from: f */
        public static ViewParent m12084f(View view) {
            return view.getParentForAccessibility();
        }

        /* renamed from: g */
        public static int m12085g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        /* renamed from: h */
        public static boolean m12086h(View view) {
            return view.hasOverlappingRendering();
        }

        /* renamed from: i */
        public static boolean m12087i(View view) {
            return view.hasTransientState();
        }

        /* renamed from: j */
        public static boolean m12088j(View view, int i10, Bundle bundle) {
            return view.performAccessibilityAction(i10, bundle);
        }

        /* renamed from: k */
        public static void m12089k(View view) {
            view.postInvalidateOnAnimation();
        }

        /* renamed from: l */
        public static void m12090l(View view, int i10, int i11, int i12, int i13) {
            view.postInvalidateOnAnimation(i10, i11, i12, i13);
        }

        /* renamed from: m */
        public static void m12091m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        /* renamed from: n */
        public static void m12092n(View view, Runnable runnable, long j10) {
            view.postOnAnimationDelayed(runnable, j10);
        }

        /* renamed from: o */
        public static void m12093o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        /* renamed from: p */
        public static void m12094p(View view) {
            view.requestFitSystemWindows();
        }

        /* renamed from: q */
        public static void m12095q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        /* renamed from: r */
        public static void m12096r(View view, boolean z10) {
            view.setHasTransientState(z10);
        }

        /* renamed from: s */
        public static void m12097s(View view, int i10) {
            view.setImportantForAccessibility(i10);
        }
    }

    /* renamed from: k0.b0$i */
    /* loaded from: classes.dex */
    public static class i {
        /* renamed from: a */
        public static int m12098a() {
            return View.generateViewId();
        }

        /* renamed from: b */
        public static Display m12099b(View view) {
            return view.getDisplay();
        }

        /* renamed from: c */
        public static int m12100c(View view) {
            return view.getLabelFor();
        }

        /* renamed from: d */
        public static int m12101d(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: e */
        public static int m12102e(View view) {
            return view.getPaddingEnd();
        }

        /* renamed from: f */
        public static int m12103f(View view) {
            return view.getPaddingStart();
        }

        /* renamed from: g */
        public static boolean m12104g(View view) {
            return view.isPaddingRelative();
        }

        /* renamed from: h */
        public static void m12105h(View view, int i10) {
            view.setLabelFor(i10);
        }

        /* renamed from: i */
        public static void m12106i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        /* renamed from: j */
        public static void m12107j(View view, int i10) {
            view.setLayoutDirection(i10);
        }

        /* renamed from: k */
        public static void m12108k(View view, int i10, int i11, int i12, int i13) {
            view.setPaddingRelative(i10, i11, i12, i13);
        }
    }

    /* renamed from: k0.b0$j */
    /* loaded from: classes.dex */
    public static class j {
        /* renamed from: a */
        public static Rect m12109a(View view) {
            return view.getClipBounds();
        }

        /* renamed from: b */
        public static boolean m12110b(View view) {
            return view.isInLayout();
        }

        /* renamed from: c */
        public static void m12111c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: k0.b0$k */
    /* loaded from: classes.dex */
    public static class k {
        /* renamed from: a */
        public static int m12112a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        /* renamed from: b */
        public static boolean m12113b(View view) {
            return view.isAttachedToWindow();
        }

        /* renamed from: c */
        public static boolean m12114c(View view) {
            return view.isLaidOut();
        }

        /* renamed from: d */
        public static boolean m12115d(View view) {
            return view.isLayoutDirectionResolved();
        }

        /* renamed from: e */
        public static void m12116e(ViewParent viewParent, View view, View view2, int i10) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i10);
        }

        /* renamed from: f */
        public static void m12117f(View view, int i10) {
            view.setAccessibilityLiveRegion(i10);
        }

        /* renamed from: g */
        public static void m12118g(AccessibilityEvent accessibilityEvent, int i10) {
            accessibilityEvent.setContentChangeTypes(i10);
        }
    }

    /* renamed from: k0.b0$l */
    /* loaded from: classes.dex */
    public static class l {
        /* renamed from: a */
        public static WindowInsets m12119a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        /* renamed from: b */
        public static WindowInsets m12120b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        /* renamed from: c */
        public static void m12121c(View view) {
            view.requestApplyInsets();
        }
    }

    /* renamed from: k0.b0$m */
    /* loaded from: classes.dex */
    public static class m {

        /* renamed from: k0.b0$m$a */
        /* loaded from: classes.dex */
        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public C3328l0 f11550a = null;

            /* renamed from: b */
            public final /* synthetic */ View f11551b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC3339v f11552c;

            public a(View view, InterfaceC3339v interfaceC3339v) {
                this.f11551b = view;
                this.f11552c = interfaceC3339v;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C3328l0 m12277w = C3328l0.m12277w(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    m.m12122a(windowInsets, this.f11551b);
                    if (m12277w.equals(this.f11550a)) {
                        return this.f11552c.mo9123a(view, m12277w).m12297u();
                    }
                }
                this.f11550a = m12277w;
                C3328l0 mo9123a = this.f11552c.mo9123a(view, m12277w);
                if (i10 >= 30) {
                    return mo9123a.m12297u();
                }
                C3308b0.m12006T(view);
                return mo9123a.m12297u();
            }
        }

        /* renamed from: a */
        public static void m12122a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C5186e.f19636i0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        public static C3328l0 m12123b(View view, C3328l0 c3328l0, Rect rect) {
            WindowInsets m12297u = c3328l0.m12297u();
            if (m12297u != null) {
                return C3328l0.m12277w(view.computeSystemWindowInsets(m12297u, rect), view);
            }
            rect.setEmpty();
            return c3328l0;
        }

        /* renamed from: c */
        public static boolean m12124c(View view, float f10, float f11, boolean z10) {
            return view.dispatchNestedFling(f10, f11, z10);
        }

        /* renamed from: d */
        public static boolean m12125d(View view, float f10, float f11) {
            return view.dispatchNestedPreFling(f10, f11);
        }

        /* renamed from: e */
        public static boolean m12126e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
        }

        /* renamed from: f */
        public static boolean m12127f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
            return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
        }

        /* renamed from: g */
        public static ColorStateList m12128g(View view) {
            return view.getBackgroundTintList();
        }

        /* renamed from: h */
        public static PorterDuff.Mode m12129h(View view) {
            return view.getBackgroundTintMode();
        }

        /* renamed from: i */
        public static float m12130i(View view) {
            return view.getElevation();
        }

        /* renamed from: j */
        public static C3328l0 m12131j(View view) {
            return C3328l0.a.m12298a(view);
        }

        /* renamed from: k */
        public static String m12132k(View view) {
            return view.getTransitionName();
        }

        /* renamed from: l */
        public static float m12133l(View view) {
            return view.getTranslationZ();
        }

        /* renamed from: m */
        public static float m12134m(View view) {
            return view.getZ();
        }

        /* renamed from: n */
        public static boolean m12135n(View view) {
            return view.hasNestedScrollingParent();
        }

        /* renamed from: o */
        public static boolean m12136o(View view) {
            return view.isImportantForAccessibility();
        }

        /* renamed from: p */
        public static boolean m12137p(View view) {
            return view.isNestedScrollingEnabled();
        }

        /* renamed from: q */
        public static void m12138q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        /* renamed from: r */
        public static void m12139r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        /* renamed from: s */
        public static void m12140s(View view, float f10) {
            view.setElevation(f10);
        }

        /* renamed from: t */
        public static void m12141t(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        /* renamed from: u */
        public static void m12142u(View view, InterfaceC3339v interfaceC3339v) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C5186e.f19620a0, interfaceC3339v);
            }
            if (interfaceC3339v == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C5186e.f19636i0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC3339v));
            }
        }

        /* renamed from: v */
        public static void m12143v(View view, String str) {
            view.setTransitionName(str);
        }

        /* renamed from: w */
        public static void m12144w(View view, float f10) {
            view.setTranslationZ(f10);
        }

        /* renamed from: x */
        public static void m12145x(View view, float f10) {
            view.setZ(f10);
        }

        /* renamed from: y */
        public static boolean m12146y(View view, int i10) {
            return view.startNestedScroll(i10);
        }

        /* renamed from: z */
        public static void m12147z(View view) {
            view.stopNestedScroll();
        }
    }

    /* renamed from: k0.b0$n */
    /* loaded from: classes.dex */
    public static class n {
        /* renamed from: a */
        public static C3328l0 m12148a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C3328l0 m12276v = C3328l0.m12276v(rootWindowInsets);
            m12276v.m12295s(m12276v);
            m12276v.m12281d(view.getRootView());
            return m12276v;
        }

        /* renamed from: b */
        public static int m12149b(View view) {
            return view.getScrollIndicators();
        }

        /* renamed from: c */
        public static void m12150c(View view, int i10) {
            view.setScrollIndicators(i10);
        }

        /* renamed from: d */
        public static void m12151d(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* renamed from: k0.b0$o */
    /* loaded from: classes.dex */
    public static class o {
        /* renamed from: a */
        public static void m12152a(View view, t tVar) {
            int i10 = C5186e.f19634h0;
            C4777g c4777g = (C4777g) view.getTag(i10);
            if (c4777g == null) {
                c4777g = new C4777g();
                view.setTag(i10, c4777g);
            }
            Objects.requireNonNull(tVar);
            ViewOnUnhandledKeyEventListenerC3310c0 viewOnUnhandledKeyEventListenerC3310c0 = new View.OnUnhandledKeyEventListener() { // from class: k0.c0
                public /* synthetic */ ViewOnUnhandledKeyEventListenerC3310c0() {
                }

                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return C3308b0.t.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            c4777g.put(tVar, viewOnUnhandledKeyEventListenerC3310c0);
            view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC3310c0);
        }

        /* renamed from: b */
        public static CharSequence m12153b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* renamed from: c */
        public static boolean m12154c(View view) {
            return view.isAccessibilityHeading();
        }

        /* renamed from: d */
        public static boolean m12155d(View view) {
            return view.isScreenReaderFocusable();
        }

        /* renamed from: e */
        public static void m12156e(View view, t tVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C4777g c4777g = (C4777g) view.getTag(C5186e.f19634h0);
            if (c4777g == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c4777g.get(tVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        /* renamed from: f */
        public static <T> T m12157f(View view, int i10) {
            return (T) view.requireViewById(i10);
        }

        /* renamed from: g */
        public static void m12158g(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        /* renamed from: h */
        public static void m12159h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* renamed from: i */
        public static void m12160i(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* renamed from: k0.b0$p */
    /* loaded from: classes.dex */
    public static class p {
        /* renamed from: a */
        public static View.AccessibilityDelegate m12161a(View view) {
            return view.getAccessibilityDelegate();
        }

        /* renamed from: b */
        public static List<Rect> m12162b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        /* renamed from: c */
        public static void m12163c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }

        /* renamed from: d */
        public static void m12164d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* renamed from: k0.b0$q */
    /* loaded from: classes.dex */
    public static class q {
        /* renamed from: a */
        public static CharSequence m12165a(View view) {
            return view.getStateDescription();
        }

        /* renamed from: b */
        public static void m12166b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* renamed from: k0.b0$r */
    /* loaded from: classes.dex */
    public static final class r {
        /* renamed from: a */
        public static String[] m12167a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        /* renamed from: b */
        public static C3309c m12168b(View view, C3309c c3309c) {
            ContentInfo m12183f = c3309c.m12183f();
            ContentInfo performReceiveContent = view.performReceiveContent(m12183f);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == m12183f ? c3309c : C3309c.m12179g(performReceiveContent);
        }

        /* renamed from: c */
        public static void m12169c(View view, String[] strArr, InterfaceC3340w interfaceC3340w) {
            if (interfaceC3340w == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new s(interfaceC3340w));
            }
        }
    }

    /* renamed from: k0.b0$s */
    /* loaded from: classes.dex */
    public static final class s implements OnReceiveContentListener {

        /* renamed from: a */
        public final InterfaceC3340w f11553a;

        public s(InterfaceC3340w interfaceC3340w) {
            this.f11553a = interfaceC3340w;
        }

        @Override // android.view.OnReceiveContentListener
        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C3309c m12179g = C3309c.m12179g(contentInfo);
            C3309c mo12394a = this.f11553a.mo12394a(view, m12179g);
            if (mo12394a == null) {
                return null;
            }
            return mo12394a == m12179g ? contentInfo : mo12394a.m12183f();
        }
    }

    /* renamed from: k0.b0$t */
    /* loaded from: classes.dex */
    public interface t {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    /* renamed from: k0.b0$u */
    /* loaded from: classes.dex */
    public static class u {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f11554d = new ArrayList<>();

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f11555a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f11556b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f11557c = null;

        /* renamed from: a */
        public static u m12170a(View view) {
            int i10 = C5186e.f19632g0;
            u uVar = (u) view.getTag(i10);
            if (uVar != null) {
                return uVar;
            }
            u uVar2 = new u();
            view.setTag(i10, uVar2);
            return uVar2;
        }

        /* renamed from: b */
        public boolean m12171b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m12176g();
            }
            View m12172c = m12172c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m12172c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m12173d().put(keyCode, new WeakReference<>(m12172c));
                }
            }
            return m12172c != null;
        }

        /* renamed from: c */
        public final View m12172c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f11555a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View m12172c = m12172c(viewGroup.getChildAt(childCount), keyEvent);
                        if (m12172c != null) {
                            return m12172c;
                        }
                    }
                }
                if (m12174e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        public final SparseArray<WeakReference<View>> m12173d() {
            if (this.f11556b == null) {
                this.f11556b = new SparseArray<>();
            }
            return this.f11556b;
        }

        /* renamed from: e */
        public final boolean m12174e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C5186e.f19634h0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((t) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public boolean m12175f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f11557c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f11557c = new WeakReference<>(keyEvent);
            WeakReference<View> weakReference2 = null;
            SparseArray<WeakReference<View>> m12173d = m12173d();
            if (keyEvent.getAction() == 1 && (indexOfKey = m12173d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = m12173d.valueAt(indexOfKey);
                m12173d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = m12173d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = weakReference2.get();
            if (view != null && C3308b0.m11992F(view)) {
                m12174e(view, keyEvent);
            }
            return true;
        }

        /* renamed from: g */
        public final void m12176g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f11555a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f11554d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f11555a == null) {
                    this.f11555a = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f11554d;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f11555a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f11555a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public static String m11987A(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m12132k(view);
        }
        WeakHashMap<View, String> weakHashMap = f11537d;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    @Deprecated
    /* renamed from: B */
    public static int m11988B(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.m12085g(view);
        }
        return 0;
    }

    /* renamed from: C */
    public static boolean m11989C(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return g.m12078a(view);
        }
        return false;
    }

    /* renamed from: D */
    public static boolean m11990D(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.m12086h(view);
        }
        return true;
    }

    /* renamed from: E */
    public static boolean m11991E(View view) {
        Boolean m12076f = m12015b().m12076f(view);
        return m12076f != null && m12076f.booleanValue();
    }

    /* renamed from: F */
    public static boolean m11992F(View view) {
        return Build.VERSION.SDK_INT >= 19 ? k.m12113b(view) : view.getWindowToken() != null;
    }

    /* renamed from: G */
    public static boolean m11993G(View view) {
        return Build.VERSION.SDK_INT >= 19 ? k.m12114c(view) : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: H */
    public static boolean m11994H(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m12137p(view);
        }
        if (view instanceof InterfaceC3333p) {
            return ((InterfaceC3333p) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: I */
    public static boolean m11995I(View view) {
        Boolean m12076f = m12008V().m12076f(view);
        return m12076f != null && m12076f.booleanValue();
    }

    /* renamed from: J */
    public static /* synthetic */ C3309c m11996J(C3309c c3309c) {
        return c3309c;
    }

    /* renamed from: K */
    public static void m11997K(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = m12041o(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (m12039n(view) != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                k.m12118g(obtain, i10);
                if (z10) {
                    obtain.getText().add(m12041o(view));
                    m12034k0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                k.m12118g(obtain2, i10);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m12041o(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    k.m12116e(view.getParent(), view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    /* renamed from: L */
    public static void m11998L(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        if (i11 < 21) {
            m12019d(view, i10);
            return;
        }
        Rect m12045s = m12045s();
        boolean z10 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m12045s.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !m12045s.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m12019d(view, i10);
        if (z10 && m12045s.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m12045s);
        }
    }

    /* renamed from: M */
    public static void m11999M(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        if (i11 < 21) {
            m12021e(view, i10);
            return;
        }
        Rect m12045s = m12045s();
        boolean z10 = false;
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            m12045s.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !m12045s.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        m12021e(view, i10);
        if (z10 && m12045s.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(m12045s);
        }
    }

    /* renamed from: N */
    public static C3328l0 m12000N(View view, C3328l0 c3328l0) {
        WindowInsets m12297u;
        if (Build.VERSION.SDK_INT >= 21 && (m12297u = c3328l0.m12297u()) != null) {
            WindowInsets m12120b = l.m12120b(view, m12297u);
            if (!m12120b.equals(m12297u)) {
                return C3328l0.m12277w(m12120b, view);
            }
        }
        return c3328l0;
    }

    /* renamed from: O */
    public static f<CharSequence> m12001O() {
        return new b(C5186e.f19618Z, CharSequence.class, 8, 28);
    }

    /* renamed from: P */
    public static C3309c m12002P(View view, C3309c c3309c) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c3309c + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return r.m12168b(view, c3309c);
        }
        InterfaceC3340w interfaceC3340w = (InterfaceC3340w) view.getTag(C5186e.f19622b0);
        if (interfaceC3340w == null) {
            return m12046t(view).mo11976a(c3309c);
        }
        C3309c mo12394a = interfaceC3340w.mo12394a(view, c3309c);
        if (mo12394a == null) {
            return null;
        }
        return m12046t(view).mo11976a(mo12394a);
    }

    /* renamed from: Q */
    public static void m12003Q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m12089k(view);
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: R */
    public static void m12004R(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m12091m(view, runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: S */
    public static void m12005S(View view, Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m12092n(view, runnable, j10);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j10);
        }
    }

    /* renamed from: T */
    public static void m12006T(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 20) {
            l.m12121c(view);
        } else if (i10 >= 16) {
            h.m12094p(view);
        }
    }

    /* renamed from: U */
    public static void m12007U(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            p.m12163c(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* renamed from: V */
    public static f<Boolean> m12008V() {
        return new a(C5186e.f19626d0, Boolean.class, 28);
    }

    /* renamed from: W */
    public static void m12009W(View view, C3305a c3305a) {
        if (c3305a == null && (m12035l(view) instanceof C3305a.a)) {
            c3305a = new C3305a();
        }
        view.setAccessibilityDelegate(c3305a == null ? null : c3305a.m11967d());
    }

    /* renamed from: X */
    public static void m12010X(View view, boolean z10) {
        m12015b().m12077g(view, Boolean.valueOf(z10));
    }

    /* renamed from: Y */
    public static void m12011Y(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            m12001O().m12077g(view, charSequence);
            if (charSequence != null) {
                f11544k.m12068a(view);
            } else {
                f11544k.m12071d(view);
            }
        }
    }

    /* renamed from: Z */
    public static void m12012Z(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m12095q(view, drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a0 */
    public static void m12014a0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            if (view instanceof InterfaceC3343z) {
                ((InterfaceC3343z) view).setSupportBackgroundTintList(colorStateList);
                return;
            }
            return;
        }
        m.m12138q(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (m.m12128g(view) == null && m.m12129h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.m12095q(view, background);
        }
    }

    /* renamed from: b */
    public static f<Boolean> m12015b() {
        return new d(C5186e.f19617Y, Boolean.class, 28);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b0 */
    public static void m12016b0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            if (view instanceof InterfaceC3343z) {
                ((InterfaceC3343z) view).setSupportBackgroundTintMode(mode);
                return;
            }
            return;
        }
        m.m12139r(view, mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (m.m12128g(view) == null && m.m12129h(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            h.m12095q(view, background);
        }
    }

    /* renamed from: c */
    public static C3320h0 m12017c(View view) {
        if (f11538e == null) {
            f11538e = new WeakHashMap<>();
        }
        C3320h0 c3320h0 = f11538e.get(view);
        if (c3320h0 != null) {
            return c3320h0;
        }
        C3320h0 c3320h02 = new C3320h0(view);
        f11538e.put(view, c3320h02);
        return c3320h02;
    }

    /* renamed from: c0 */
    public static void m12018c0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            j.m12111c(view, rect);
        }
    }

    /* renamed from: d */
    public static void m12019d(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            m12040n0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m12040n0((View) parent);
            }
        }
    }

    /* renamed from: d0 */
    public static void m12020d0(View view, float f10) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m12140s(view, f10);
        }
    }

    /* renamed from: e */
    public static void m12021e(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            m12040n0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                m12040n0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m12022e0(View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 16) {
            h.m12096r(view, z10);
        }
    }

    /* renamed from: f */
    public static C3328l0 m12023f(View view, C3328l0 c3328l0, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? m.m12123b(view, c3328l0, rect) : c3328l0;
    }

    /* renamed from: f0 */
    public static void m12024f0(View view, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 19) {
            if (i11 < 16) {
                return;
            }
            if (i10 == 4) {
                i10 = 2;
            }
        }
        h.m12097s(view, i10);
    }

    /* renamed from: g */
    public static C3328l0 m12025g(View view, C3328l0 c3328l0) {
        WindowInsets m12297u;
        if (Build.VERSION.SDK_INT >= 21 && (m12297u = c3328l0.m12297u()) != null) {
            WindowInsets m12119a = l.m12119a(view, m12297u);
            if (!m12119a.equals(m12297u)) {
                return C3328l0.m12277w(m12119a, view);
            }
        }
        return c3328l0;
    }

    /* renamed from: g0 */
    public static void m12026g0(View view, InterfaceC3339v interfaceC3339v) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m12142u(view, interfaceC3339v);
        }
    }

    /* renamed from: h */
    public static boolean m12027h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return u.m12170a(view).m12171b(view, keyEvent);
    }

    /* renamed from: h0 */
    public static void m12028h0(View view, boolean z10) {
        m12008V().m12077g(view, Boolean.valueOf(z10));
    }

    /* renamed from: i */
    public static boolean m12029i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return u.m12170a(view).m12175f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m12030i0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            n.m12151d(view, i10, i11);
        }
    }

    /* renamed from: j */
    public static void m12031j(View view) {
        C3305a m12033k = m12033k(view);
        if (m12033k == null) {
            m12033k = new C3305a();
        }
        m12009W(view, m12033k);
    }

    /* renamed from: j0 */
    public static void m12032j0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m12143v(view, str);
            return;
        }
        if (f11537d == null) {
            f11537d = new WeakHashMap<>();
        }
        f11537d.put(view, str);
    }

    /* renamed from: k */
    public static C3305a m12033k(View view) {
        View.AccessibilityDelegate m12035l = m12035l(view);
        if (m12035l == null) {
            return null;
        }
        return m12035l instanceof C3305a.a ? ((C3305a.a) m12035l).f11529a : new C3305a(m12035l);
    }

    /* renamed from: k0 */
    public static void m12034k0(View view) {
        if (m12047u(view) == 0) {
            m12024f0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m12047u((View) parent) == 4) {
                m12024f0(view, 2);
                return;
            }
        }
    }

    /* renamed from: l */
    public static View.AccessibilityDelegate m12035l(View view) {
        return Build.VERSION.SDK_INT >= 29 ? p.m12161a(view) : m12037m(view);
    }

    /* renamed from: l0 */
    public static f<CharSequence> m12036l0() {
        return new c(C5186e.f19628e0, CharSequence.class, 64, 30);
    }

    /* renamed from: m */
    public static View.AccessibilityDelegate m12037m(View view) {
        if (f11540g) {
            return null;
        }
        if (f11539f == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f11539f = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f11540g = true;
                return null;
            }
        }
        try {
            Object obj = f11539f.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f11540g = true;
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m0 */
    public static void m12038m0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            m.m12147z(view);
        } else if (view instanceof InterfaceC3333p) {
            ((InterfaceC3333p) view).stopNestedScroll();
        }
    }

    /* renamed from: n */
    public static int m12039n(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return k.m12112a(view);
        }
        return 0;
    }

    /* renamed from: n0 */
    public static void m12040n0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: o */
    public static CharSequence m12041o(View view) {
        return m12001O().m12076f(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static ColorStateList m12042p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m12128g(view);
        }
        if (view instanceof InterfaceC3343z) {
            return ((InterfaceC3343z) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public static PorterDuff.Mode m12043q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return m.m12129h(view);
        }
        if (view instanceof InterfaceC3343z) {
            return ((InterfaceC3343z) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: r */
    public static Rect m12044r(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return j.m12109a(view);
        }
        return null;
    }

    /* renamed from: s */
    public static Rect m12045s() {
        if (f11541h == null) {
            f11541h = new ThreadLocal<>();
        }
        Rect rect = f11541h.get();
        if (rect == null) {
            rect = new Rect();
            f11541h.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    public static InterfaceC3341x m12046t(View view) {
        return view instanceof InterfaceC3341x ? (InterfaceC3341x) view : f11543j;
    }

    /* renamed from: u */
    public static int m12047u(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.m12081c(view);
        }
        return 0;
    }

    /* renamed from: v */
    public static int m12048v(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return i.m12101d(view);
        }
        return 0;
    }

    /* renamed from: w */
    public static int m12049w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return h.m12082d(view);
        }
        if (!f11536c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f11535b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f11536c = true;
        }
        Field field = f11535b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: x */
    public static String[] m12050x(View view) {
        return Build.VERSION.SDK_INT >= 31 ? r.m12167a(view) : (String[]) view.getTag(C5186e.f19624c0);
    }

    /* renamed from: y */
    public static C3328l0 m12051y(View view) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return n.m12148a(view);
        }
        if (i10 >= 21) {
            return m.m12131j(view);
        }
        return null;
    }

    /* renamed from: z */
    public static CharSequence m12052z(View view) {
        return m12036l0().m12076f(view);
    }
}
