package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.InterfaceC0196i;
import p002a0.C0005b;
import p079f6.C1841a;
import p089g.C1931a;
import p089g.C1936f;
import p148k0.C3308b0;
import p148k0.C3328l0;
import p148k0.C3338u;
import p148k0.InterfaceC3335r;
import p148k0.InterfaceC3336s;
import p148k0.InterfaceC3337t;
import p187n.C3630e1;
import p187n.InterfaceC3632f0;
import p187n.InterfaceC3635g0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC3632f0, InterfaceC3337t, InterfaceC3335r, InterfaceC3336s {

    /* renamed from: M */
    public static final int[] f864M = {C1931a.f7330b, R.attr.windowContentOverlay};

    /* renamed from: A */
    public final Rect f865A;

    /* renamed from: B */
    public C3328l0 f866B;

    /* renamed from: C */
    public C3328l0 f867C;

    /* renamed from: D */
    public C3328l0 f868D;

    /* renamed from: E */
    public C3328l0 f869E;

    /* renamed from: F */
    public InterfaceC0205d f870F;

    /* renamed from: G */
    public OverScroller f871G;

    /* renamed from: H */
    public ViewPropertyAnimator f872H;

    /* renamed from: I */
    public final AnimatorListenerAdapter f873I;

    /* renamed from: J */
    public final Runnable f874J;

    /* renamed from: K */
    public final Runnable f875K;

    /* renamed from: L */
    public final C3338u f876L;

    /* renamed from: h */
    public int f877h;

    /* renamed from: i */
    public int f878i;

    /* renamed from: j */
    public ContentFrameLayout f879j;

    /* renamed from: k */
    public ActionBarContainer f880k;

    /* renamed from: l */
    public InterfaceC3635g0 f881l;

    /* renamed from: m */
    public Drawable f882m;

    /* renamed from: n */
    public boolean f883n;

    /* renamed from: o */
    public boolean f884o;

    /* renamed from: p */
    public boolean f885p;

    /* renamed from: q */
    public boolean f886q;

    /* renamed from: r */
    public boolean f887r;

    /* renamed from: s */
    public int f888s;

    /* renamed from: t */
    public int f889t;

    /* renamed from: u */
    public final Rect f890u;

    /* renamed from: v */
    public final Rect f891v;

    /* renamed from: w */
    public final Rect f892w;

    /* renamed from: x */
    public final Rect f893x;

    /* renamed from: y */
    public final Rect f894y;

    /* renamed from: z */
    public final Rect f895z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$a */
    /* loaded from: classes.dex */
    public class C0202a extends AnimatorListenerAdapter {
        public C0202a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f872H = null;
            actionBarOverlayLayout.f887r = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f872H = null;
            actionBarOverlayLayout.f887r = false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$b */
    /* loaded from: classes.dex */
    public class RunnableC0203b implements Runnable {
        public RunnableC0203b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m885o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f872H = actionBarOverlayLayout.f880k.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f873I);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$c */
    /* loaded from: classes.dex */
    public class RunnableC0204c implements Runnable {
        public RunnableC0204c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.m885o();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f872H = actionBarOverlayLayout.f880k.animate().translationY(-ActionBarOverlayLayout.this.f880k.getHeight()).setListener(ActionBarOverlayLayout.this.f873I);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0205d {
        /* renamed from: a */
        void mo893a();

        /* renamed from: b */
        void mo894b();

        /* renamed from: c */
        void mo895c(boolean z10);

        /* renamed from: d */
        void mo896d();

        /* renamed from: e */
        void mo897e();

        /* renamed from: f */
        void mo898f(int i10);
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$e */
    /* loaded from: classes.dex */
    public static class C0206e extends ViewGroup.MarginLayoutParams {
        public C0206e(int i10, int i11) {
            super(i10, i11);
        }

        public C0206e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0206e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f878i = 0;
        this.f890u = new Rect();
        this.f891v = new Rect();
        this.f892w = new Rect();
        this.f893x = new Rect();
        this.f894y = new Rect();
        this.f895z = new Rect();
        this.f865A = new Rect();
        C3328l0 c3328l0 = C3328l0.f11602b;
        this.f866B = c3328l0;
        this.f867C = c3328l0;
        this.f868D = c3328l0;
        this.f869E = c3328l0;
        this.f873I = new C0202a();
        this.f874J = new RunnableC0203b();
        this.f875K = new RunnableC0204c();
        m886p(context);
        this.f876L = new C3338u(this);
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: a */
    public void mo871a(Menu menu, InterfaceC0196i.a aVar) {
        m890t();
        this.f881l.mo1088a(menu, aVar);
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: b */
    public boolean mo872b() {
        m890t();
        return this.f881l.mo1089b();
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: c */
    public void mo873c() {
        m890t();
        this.f881l.mo1090c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0206e;
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: d */
    public boolean mo874d() {
        m890t();
        return this.f881l.mo1091d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f882m == null || this.f883n) {
            return;
        }
        int bottom = this.f880k.getVisibility() == 0 ? (int) (this.f880k.getBottom() + this.f880k.getTranslationY() + 0.5f) : 0;
        this.f882m.setBounds(0, bottom, getWidth(), this.f882m.getIntrinsicHeight() + bottom);
        this.f882m.draw(canvas);
    }

    /* renamed from: e */
    public final void m875e() {
        m885o();
        this.f875K.run();
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: f */
    public boolean mo876f() {
        m890t();
        return this.f881l.mo1093f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        m890t();
        boolean m881k = m881k(this.f880k, rect, true, true, false, true);
        this.f893x.set(rect);
        C3630e1.m13500a(this, this.f893x, this.f890u);
        if (!this.f894y.equals(this.f893x)) {
            this.f894y.set(this.f893x);
            m881k = true;
        }
        if (!this.f891v.equals(this.f890u)) {
            this.f891v.set(this.f890u);
            m881k = true;
        }
        if (m881k) {
            requestLayout();
        }
        return true;
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: g */
    public boolean mo877g() {
        m890t();
        return this.f881l.mo1094g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0206e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f880k;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f876L.m12389a();
    }

    public CharSequence getTitle() {
        m890t();
        return this.f881l.getTitle();
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: h */
    public boolean mo878h() {
        m890t();
        return this.f881l.mo1095h();
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: i */
    public void mo879i(int i10) {
        m890t();
        if (i10 == 2) {
            this.f881l.mo1109v();
        } else if (i10 == 5) {
            this.f881l.mo1110w();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p187n.InterfaceC3632f0
    /* renamed from: j */
    public void mo880j() {
        m890t();
        this.f881l.mo1096i();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m881k(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0206e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.m881k(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C0206e generateDefaultLayoutParams() {
        return new C0206e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0206e generateLayoutParams(AttributeSet attributeSet) {
        return new C0206e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public final InterfaceC3635g0 m884n(View view) {
        if (view instanceof InterfaceC3635g0) {
            return (InterfaceC3635g0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* renamed from: o */
    public void m885o() {
        removeCallbacks(this.f874J);
        removeCallbacks(this.f875K);
        ViewPropertyAnimator viewPropertyAnimator = this.f872H;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m890t();
        C3328l0 m12277w = C3328l0.m12277w(windowInsets, this);
        boolean m881k = m881k(this.f880k, new Rect(m12277w.m12286i(), m12277w.m12288k(), m12277w.m12287j(), m12277w.m12285h()), true, true, false, true);
        C3308b0.m12023f(this, m12277w, this.f890u);
        Rect rect = this.f890u;
        C3328l0 m12289l = m12277w.m12289l(rect.left, rect.top, rect.right, rect.bottom);
        this.f866B = m12289l;
        boolean z10 = true;
        if (!this.f867C.equals(m12289l)) {
            this.f867C = this.f866B;
            m881k = true;
        }
        if (this.f891v.equals(this.f890u)) {
            z10 = m881k;
        } else {
            this.f891v.set(this.f890u);
        }
        if (z10) {
            requestLayout();
        }
        return m12277w.m12278a().m12280c().m12279b().m12297u();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m886p(getContext());
        C3308b0.m12006T(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m885o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                C0206e c0206e = (C0206e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) c0206e).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) c0206e).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int measuredHeight;
        C3328l0 m12299a;
        m890t();
        measureChildWithMargins(this.f880k, i10, 0, i11, 0);
        C0206e c0206e = (C0206e) this.f880k.getLayoutParams();
        int max = Math.max(0, this.f880k.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0206e).leftMargin + ((ViewGroup.MarginLayoutParams) c0206e).rightMargin);
        int max2 = Math.max(0, this.f880k.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0206e).topMargin + ((ViewGroup.MarginLayoutParams) c0206e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f880k.getMeasuredState());
        boolean z10 = (C3308b0.m11988B(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f877h;
            if (this.f885p && this.f880k.getTabContainer() != null) {
                measuredHeight += this.f877h;
            }
        } else {
            measuredHeight = this.f880k.getVisibility() != 8 ? this.f880k.getMeasuredHeight() : 0;
        }
        this.f892w.set(this.f890u);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 21) {
            this.f868D = this.f866B;
        } else {
            this.f895z.set(this.f893x);
        }
        if (!this.f884o && !z10) {
            Rect rect = this.f892w;
            rect.top += measuredHeight;
            rect.bottom += 0;
            if (i12 >= 21) {
                m12299a = this.f868D.m12289l(0, measuredHeight, 0, 0);
                this.f868D = m12299a;
            }
        } else if (i12 >= 21) {
            m12299a = new C3328l0.b(this.f868D).m12301c(C0005b.m13b(this.f868D.m12286i(), this.f868D.m12288k() + measuredHeight, this.f868D.m12287j(), this.f868D.m12285h() + 0)).m12299a();
            this.f868D = m12299a;
        } else {
            Rect rect2 = this.f895z;
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        m881k(this.f879j, this.f892w, true, true, true, true);
        if (i12 >= 21 && !this.f869E.equals(this.f868D)) {
            C3328l0 c3328l0 = this.f868D;
            this.f869E = c3328l0;
            C3308b0.m12025g(this.f879j, c3328l0);
        } else if (i12 < 21 && !this.f865A.equals(this.f895z)) {
            this.f865A.set(this.f895z);
            this.f879j.m923a(this.f895z);
        }
        measureChildWithMargins(this.f879j, i10, 0, i11, 0);
        C0206e c0206e2 = (C0206e) this.f879j.getLayoutParams();
        int max3 = Math.max(max, this.f879j.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0206e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0206e2).rightMargin);
        int max4 = Math.max(max2, this.f879j.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0206e2).topMargin + ((ViewGroup.MarginLayoutParams) c0206e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f879j.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f886q || !z10) {
            return false;
        }
        if (m892v(f11)) {
            m875e();
        } else {
            m891u();
        }
        this.f887r = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // p148k0.InterfaceC3335r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f888s + i11;
        this.f888s = i14;
        setActionBarHideOffset(i14);
    }

    @Override // p148k0.InterfaceC3335r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // p148k0.InterfaceC3336s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        onNestedScroll(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f876L.m12390b(view, view2, i10);
        this.f888s = getActionBarHideOffset();
        m885o();
        InterfaceC0205d interfaceC0205d = this.f870F;
        if (interfaceC0205d != null) {
            interfaceC0205d.mo897e();
        }
    }

    @Override // p148k0.InterfaceC3335r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f880k.getVisibility() != 0) {
            return false;
        }
        return this.f886q;
    }

    @Override // p148k0.InterfaceC3335r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public void onStopNestedScroll(View view) {
        if (this.f886q && !this.f887r) {
            if (this.f888s <= this.f880k.getHeight()) {
                m889s();
            } else {
                m888r();
            }
        }
        InterfaceC0205d interfaceC0205d = this.f870F;
        if (interfaceC0205d != null) {
            interfaceC0205d.mo894b();
        }
    }

    @Override // p148k0.InterfaceC3335r
    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i10);
        }
        m890t();
        int i11 = this.f889t ^ i10;
        this.f889t = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        InterfaceC0205d interfaceC0205d = this.f870F;
        if (interfaceC0205d != null) {
            interfaceC0205d.mo895c(!z11);
            if (z10 || !z11) {
                this.f870F.mo893a();
            } else {
                this.f870F.mo896d();
            }
        }
        if ((i11 & 256) == 0 || this.f870F == null) {
            return;
        }
        C3308b0.m12006T(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f878i = i10;
        InterfaceC0205d interfaceC0205d = this.f870F;
        if (interfaceC0205d != null) {
            interfaceC0205d.mo898f(i10);
        }
    }

    /* renamed from: p */
    public final void m886p(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f864M);
        this.f877h = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f882m = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f883n = context.getApplicationInfo().targetSdkVersion < 19;
        this.f871G = new OverScroller(context);
    }

    /* renamed from: q */
    public boolean m887q() {
        return this.f884o;
    }

    /* renamed from: r */
    public final void m888r() {
        m885o();
        postDelayed(this.f875K, 600L);
    }

    /* renamed from: s */
    public final void m889s() {
        m885o();
        postDelayed(this.f874J, 600L);
    }

    public void setActionBarHideOffset(int i10) {
        m885o();
        this.f880k.setTranslationY(-Math.max(0, Math.min(i10, this.f880k.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0205d interfaceC0205d) {
        this.f870F = interfaceC0205d;
        if (getWindowToken() != null) {
            this.f870F.mo898f(this.f878i);
            int i10 = this.f889t;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                C3308b0.m12006T(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f885p = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f886q) {
            this.f886q = z10;
            if (z10) {
                return;
            }
            m885o();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        m890t();
        this.f881l.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        m890t();
        this.f881l.setIcon(drawable);
    }

    public void setLogo(int i10) {
        m890t();
        this.f881l.mo1101n(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f884o = z10;
        this.f883n = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // p187n.InterfaceC3632f0
    public void setWindowCallback(Window.Callback callback) {
        m890t();
        this.f881l.setWindowCallback(callback);
    }

    @Override // p187n.InterfaceC3632f0
    public void setWindowTitle(CharSequence charSequence) {
        m890t();
        this.f881l.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public void m890t() {
        if (this.f879j == null) {
            this.f879j = (ContentFrameLayout) findViewById(C1936f.f7441b);
            this.f880k = (ActionBarContainer) findViewById(C1936f.f7442c);
            this.f881l = m884n(findViewById(C1936f.f7440a));
        }
    }

    /* renamed from: u */
    public final void m891u() {
        m885o();
        this.f874J.run();
    }

    /* renamed from: v */
    public final boolean m892v(float f10) {
        this.f871G.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, C1841a.e.API_PRIORITY_OTHER);
        return this.f871G.getFinalY() > this.f880k.getHeight();
    }
}
