package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import p079f6.C1841a;
import p148k0.C3305a;
import p148k0.C3308b0;
import p148k0.C3332o;
import p148k0.C3334q;
import p148k0.C3338u;
import p148k0.InterfaceC3333p;
import p148k0.InterfaceC3336s;
import p163l0.C3400b;
import p163l0.C3402d;
import p188n0.C3678e;
import p313w.C5182a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC3336s, InterfaceC3333p {

    /* renamed from: I */
    public static final float f1170I = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: J */
    public static final C0249a f1171J = new C0249a();

    /* renamed from: K */
    public static final int[] f1172K = {R.attr.fillViewport};

    /* renamed from: A */
    public final int[] f1173A;

    /* renamed from: B */
    public int f1174B;

    /* renamed from: C */
    public int f1175C;

    /* renamed from: D */
    public C0252d f1176D;

    /* renamed from: E */
    public final C3338u f1177E;

    /* renamed from: F */
    public final C3334q f1178F;

    /* renamed from: G */
    public float f1179G;

    /* renamed from: H */
    public InterfaceC0251c f1180H;

    /* renamed from: h */
    public final float f1181h;

    /* renamed from: i */
    public long f1182i;

    /* renamed from: j */
    public final Rect f1183j;

    /* renamed from: k */
    public OverScroller f1184k;

    /* renamed from: l */
    public EdgeEffect f1185l;

    /* renamed from: m */
    public EdgeEffect f1186m;

    /* renamed from: n */
    public int f1187n;

    /* renamed from: o */
    public boolean f1188o;

    /* renamed from: p */
    public boolean f1189p;

    /* renamed from: q */
    public View f1190q;

    /* renamed from: r */
    public boolean f1191r;

    /* renamed from: s */
    public VelocityTracker f1192s;

    /* renamed from: t */
    public boolean f1193t;

    /* renamed from: u */
    public boolean f1194u;

    /* renamed from: v */
    public int f1195v;

    /* renamed from: w */
    public int f1196w;

    /* renamed from: x */
    public int f1197x;

    /* renamed from: y */
    public int f1198y;

    /* renamed from: z */
    public final int[] f1199z;

    /* renamed from: androidx.core.widget.NestedScrollView$a */
    /* loaded from: classes.dex */
    public static class C0249a extends C3305a {
        @Override // p148k0.C3305a
        /* renamed from: f */
        public void mo1205f(View view, AccessibilityEvent accessibilityEvent) {
            super.mo1205f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C3402d.m12693a(accessibilityEvent, nestedScrollView.getScrollX());
            C3402d.m12694b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // p148k0.C3305a
        /* renamed from: g */
        public void mo1206g(View view, C3400b c3400b) {
            int scrollRange;
            super.mo1206g(view, c3400b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            c3400b.m12657J(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            c3400b.m12661N(true);
            if (nestedScrollView.getScrollY() > 0) {
                c3400b.m12664a(C3400b.a.f11942r);
                c3400b.m12664a(C3400b.a.f11910C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                c3400b.m12664a(C3400b.a.f11941q);
                c3400b.m12664a(C3400b.a.f11912E);
            }
        }

        @Override // p148k0.C3305a
        /* renamed from: j */
        public boolean mo1207j(View view, int i10, Bundle bundle) {
            if (super.mo1207j(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m1177P(0, max, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m1177P(0, min, true);
            return true;
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$b */
    /* loaded from: classes.dex */
    public static class C0250b {
        /* renamed from: a */
        public static boolean m1208a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* renamed from: androidx.core.widget.NestedScrollView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0251c {
        /* renamed from: a */
        void mo669a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    /* renamed from: androidx.core.widget.NestedScrollView$d */
    /* loaded from: classes.dex */
    public static class C0252d extends View.BaseSavedState {
        public static final Parcelable.Creator<C0252d> CREATOR = new a();

        /* renamed from: h */
        public int f1200h;

        /* renamed from: androidx.core.widget.NestedScrollView$d$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<C0252d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0252d createFromParcel(Parcel parcel) {
                return new C0252d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C0252d[] newArray(int i10) {
                return new C0252d[i10];
            }
        }

        public C0252d(Parcel parcel) {
            super(parcel);
            this.f1200h = parcel.readInt();
        }

        public C0252d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1200h + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1200h);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5182a.f19568c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1183j = new Rect();
        this.f1188o = true;
        this.f1189p = false;
        this.f1190q = null;
        this.f1191r = false;
        this.f1194u = true;
        this.f1198y = -1;
        this.f1199z = new int[2];
        this.f1173A = new int[2];
        this.f1185l = C3678e.m13819a(context, attributeSet);
        this.f1186m = C3678e.m13819a(context, attributeSet);
        this.f1181h = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        m1200u();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1172K, i10, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1177E = new C3338u(this);
        this.f1178F = new C3334q(this);
        setNestedScrollingEnabled(true);
        C3308b0.m12009W(this, f1171J);
    }

    /* renamed from: e */
    public static int m1160e(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1179G == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1179G = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1179G;
    }

    /* renamed from: y */
    public static boolean m1161y(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m1161y((View) parent, view2);
    }

    /* renamed from: A */
    public final void m1162A(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1178F.m12374e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    /* renamed from: B */
    public final void m1163B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1198y) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1187n = (int) motionEvent.getY(i10);
            this.f1198y = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f1192s;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: C */
    public boolean m1164C(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i18 = i12 + i10;
        int i19 = !z15 ? 0 : i16;
        int i20 = i13 + i11;
        int i21 = !z16 ? 0 : i17;
        int i22 = -i19;
        int i23 = i19 + i14;
        int i24 = -i21;
        int i25 = i21 + i15;
        if (i18 > i23) {
            i18 = i23;
            z11 = true;
        } else if (i18 < i22) {
            z11 = true;
            i18 = i22;
        } else {
            z11 = false;
        }
        if (i20 > i25) {
            i20 = i25;
            z12 = true;
        } else if (i20 < i24) {
            z12 = true;
            i20 = i24;
        } else {
            z12 = false;
        }
        if (z12 && !m1197r(1)) {
            this.f1184k.springBack(i18, i20, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i18, i20, z11, z12);
        return z11 || z12;
    }

    /* renamed from: D */
    public boolean m1165D(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f1183j.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1183j;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1183j.top = getScrollY() - height;
            Rect rect2 = this.f1183j;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1183j;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return m1169H(i10, i11, i12);
    }

    /* renamed from: E */
    public final void m1166E() {
        VelocityTracker velocityTracker = this.f1192s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1192s = null;
        }
    }

    /* renamed from: F */
    public final int m1167F(int i10, float f10) {
        float m13822d;
        EdgeEffect edgeEffect;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (C3678e.m13820b(this.f1185l) != 0.0f) {
            m13822d = -C3678e.m13822d(this.f1185l, -height, width);
            if (C3678e.m13820b(this.f1185l) == 0.0f) {
                edgeEffect = this.f1185l;
                edgeEffect.onRelease();
            }
            f11 = m13822d;
        } else if (C3678e.m13820b(this.f1186m) != 0.0f) {
            m13822d = C3678e.m13822d(this.f1186m, height, 1.0f - width);
            if (C3678e.m13820b(this.f1186m) == 0.0f) {
                edgeEffect = this.f1186m;
                edgeEffect.onRelease();
            }
            f11 = m13822d;
        }
        int round = Math.round(f11 * getHeight());
        if (round != 0) {
            invalidate();
        }
        return round;
    }

    /* renamed from: G */
    public final void m1168G(boolean z10) {
        if (z10) {
            m1178Q(2, 1);
        } else {
            m1180S(1);
        }
        this.f1175C = getScrollY();
        C3308b0.m12003Q(this);
    }

    /* renamed from: H */
    public final boolean m1169H(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        boolean z11 = i10 == 33;
        View m1193n = m1193n(z11, i11, i12);
        if (m1193n == null) {
            m1193n = this;
        }
        if (i11 < scrollY || i12 > i13) {
            m1170I(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (m1193n != findFocus()) {
            m1193n.requestFocus(i10);
        }
        return z10;
    }

    /* renamed from: I */
    public final int m1170I(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        EdgeEffect edgeEffect;
        if (i12 == 1) {
            m1178Q(2, i12);
        }
        boolean z11 = false;
        if (m1187h(0, i10, this.f1173A, this.f1199z, i12)) {
            i13 = i10 - this.f1173A[1];
            i14 = this.f1199z[1] + 0;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = m1183c() && !z10;
        boolean z13 = m1164C(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !m1197r(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f1173A;
        iArr[1] = 0;
        m1188i(0, scrollY2, 0, i13 - scrollY2, this.f1199z, i12, iArr);
        int i15 = i14 + this.f1199z[1];
        int i16 = i13 - this.f1173A[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z12) {
                C3678e.m13822d(this.f1185l, (-i16) / getHeight(), i11 / getWidth());
                if (!this.f1186m.isFinished()) {
                    edgeEffect = this.f1186m;
                    edgeEffect.onRelease();
                }
            }
        } else if (i17 > scrollRange && z12) {
            C3678e.m13822d(this.f1186m, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f1185l.isFinished()) {
                edgeEffect = this.f1185l;
                edgeEffect.onRelease();
            }
        }
        if (this.f1185l.isFinished() && this.f1186m.isFinished()) {
            z11 = z13;
        } else {
            C3308b0.m12003Q(this);
        }
        if (z11 && i12 == 0) {
            this.f1192s.clear();
        }
        if (i12 == 1) {
            m1180S(i12);
            this.f1185l.onRelease();
            this.f1186m.onRelease();
        }
        return i15;
    }

    /* renamed from: J */
    public final void m1171J(View view) {
        view.getDrawingRect(this.f1183j);
        offsetDescendantRectToMyCoords(view, this.f1183j);
        int m1185f = m1185f(this.f1183j);
        if (m1185f != 0) {
            scrollBy(0, m1185f);
        }
    }

    /* renamed from: K */
    public final boolean m1172K(Rect rect, boolean z10) {
        int m1185f = m1185f(rect);
        boolean z11 = m1185f != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, m1185f);
            } else {
                m1174M(0, m1185f);
            }
        }
        return z11;
    }

    /* renamed from: L */
    public final boolean m1173L(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return m1196q(-i10) < C3678e.m13820b(edgeEffect) * ((float) getHeight());
    }

    /* renamed from: M */
    public final void m1174M(int i10, int i11) {
        m1175N(i10, i11, 250, false);
    }

    /* renamed from: N */
    public final void m1175N(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1182i > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1184k.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            m1168G(z10);
        } else {
            if (!this.f1184k.isFinished()) {
                m1181a();
            }
            scrollBy(i10, i11);
        }
        this.f1182i = AnimationUtils.currentAnimationTimeMillis();
    }

    /* renamed from: O */
    public void m1176O(int i10, int i11, int i12, boolean z10) {
        m1175N(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    /* renamed from: P */
    public void m1177P(int i10, int i11, boolean z10) {
        m1176O(i10, i11, 250, z10);
    }

    /* renamed from: Q */
    public boolean m1178Q(int i10, int i11) {
        return this.f1178F.m12386q(i10, i11);
    }

    /* renamed from: R */
    public final boolean m1179R(MotionEvent motionEvent) {
        boolean z10;
        if (C3678e.m13820b(this.f1185l) != 0.0f) {
            C3678e.m13822d(this.f1185l, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (C3678e.m13820b(this.f1186m) == 0.0f) {
            return z10;
        }
        C3678e.m13822d(this.f1186m, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* renamed from: S */
    public void m1180S(int i10) {
        this.f1178F.m12388s(i10);
    }

    /* renamed from: a */
    public final void m1181a() {
        this.f1184k.abortAnimation();
        m1180S(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    public boolean m1182b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !m1204z(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m1170I(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f1183j);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1183j);
            m1170I(m1185f(this.f1183j), 0, 1, true);
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && m1203x(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m1183c() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1184k.isFinished()) {
            return;
        }
        this.f1184k.computeScrollOffset();
        int currY = this.f1184k.getCurrY();
        int m1186g = m1186g(currY - this.f1175C);
        this.f1175C = currY;
        int[] iArr = this.f1173A;
        boolean z10 = false;
        iArr[1] = 0;
        m1187h(0, m1186g, iArr, null, 1);
        int i10 = m1186g - this.f1173A[1];
        int scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY = getScrollY();
            m1164C(0, i10, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i11 = i10 - scrollY2;
            int[] iArr2 = this.f1173A;
            iArr2[1] = 0;
            m1188i(0, scrollY2, 0, i11, this.f1199z, 1, iArr2);
            i10 = i11 - this.f1173A[1];
        }
        if (i10 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i10 < 0) {
                    if (this.f1185l.isFinished()) {
                        edgeEffect = this.f1185l;
                        edgeEffect.onAbsorb((int) this.f1184k.getCurrVelocity());
                    }
                } else if (this.f1186m.isFinished()) {
                    edgeEffect = this.f1186m;
                    edgeEffect.onAbsorb((int) this.f1184k.getCurrVelocity());
                }
            }
            m1181a();
        }
        if (this.f1184k.isFinished()) {
            m1180S(1);
        } else {
            C3308b0.m12003Q(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    /* renamed from: d */
    public final boolean m1184d() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m1192m(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f1178F.m12370a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f1178F.m12371b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return m1187h(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f1178F.m12375f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i10 = 0;
        if (!this.f1185l.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 21 || C0250b.m1208a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (i11 >= 21 && C0250b.m1208a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(paddingLeft, min);
            this.f1185l.setSize(width, height);
            if (this.f1185l.draw(canvas)) {
                C3308b0.m12003Q(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f1186m.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 21 || C0250b.m1208a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i10 = 0 + getPaddingLeft();
        }
        if (i12 >= 21 && C0250b.m1208a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i10 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f1186m.setSize(width2, height2);
        if (this.f1186m.draw(canvas)) {
            C3308b0.m12003Q(this);
        }
        canvas.restoreToCount(save2);
    }

    /* renamed from: f */
    public int m1185f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    /* renamed from: g */
    public int m1186g(int i10) {
        int height = getHeight();
        if (i10 > 0 && C3678e.m13820b(this.f1185l) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * C3678e.m13822d(this.f1185l, ((-i10) * 4.0f) / height, 0.5f));
            if (round != i10) {
                this.f1185l.finish();
            }
            return i10 - round;
        }
        if (i10 >= 0 || C3678e.m13820b(this.f1186m) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int round2 = Math.round((f10 / 4.0f) * C3678e.m13822d(this.f1186m, (i10 * 4.0f) / f10, 0.5f));
        if (round2 != i10) {
            this.f1186m.finish();
        }
        return i10 - round2;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f1177E.m12389a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* renamed from: h */
    public boolean m1187h(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.f1178F.m12373d(i10, i11, iArr, iArr2, i12);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m1197r(0);
    }

    /* renamed from: i */
    public void m1188i(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        this.f1178F.m12374e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View, p148k0.InterfaceC3333p
    public boolean isNestedScrollingEnabled() {
        return this.f1178F.m12382m();
    }

    /* renamed from: j */
    public final void m1189j(int i10) {
        if (i10 != 0) {
            if (this.f1194u) {
                m1174M(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    /* renamed from: k */
    public final boolean m1190k(int i10) {
        EdgeEffect edgeEffect;
        if (C3678e.m13820b(this.f1185l) != 0.0f) {
            if (m1173L(this.f1185l, i10)) {
                edgeEffect = this.f1185l;
                edgeEffect.onAbsorb(i10);
            } else {
                i10 = -i10;
                m1194o(i10);
            }
        } else {
            if (C3678e.m13820b(this.f1186m) == 0.0f) {
                return false;
            }
            i10 = -i10;
            if (m1173L(this.f1186m, i10)) {
                edgeEffect = this.f1186m;
                edgeEffect.onAbsorb(i10);
            }
            m1194o(i10);
        }
        return true;
    }

    /* renamed from: l */
    public final void m1191l() {
        this.f1198y = -1;
        this.f1191r = false;
        m1166E();
        m1180S(0);
        this.f1185l.onRelease();
        this.f1186m.onRelease();
    }

    /* renamed from: m */
    public boolean m1192m(KeyEvent keyEvent) {
        this.f1183j.setEmpty();
        if (!m1184d()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            return (findNextFocus == null || findNextFocus == this || !findNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? m1182b(33) : m1195p(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? m1182b(130) : m1195p(130);
        }
        if (keyCode != 62) {
            return false;
        }
        m1165D(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i10, int i11) {
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* renamed from: n */
    public final View m1193n(boolean z10, int i10, int i11) {
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12) {
                            if (!z13) {
                            }
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else {
                        if (!z13) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    /* renamed from: o */
    public void m1194o(int i10) {
        if (getChildCount() > 0) {
            this.f1184k.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, C1841a.e.API_PRIORITY_OTHER, 0, 0);
            m1168G(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1189p = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i10;
        float f10;
        if (motionEvent.getAction() != 8 || this.f1191r) {
            return false;
        }
        if (C3332o.m12369a(motionEvent, 2)) {
            f10 = motionEvent.getAxisValue(9);
            i10 = (int) motionEvent.getX();
        } else if (C3332o.m12369a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i10 = getWidth() / 2;
            f10 = axisValue;
        } else {
            i10 = 0;
            f10 = 0.0f;
        }
        if (f10 == 0.0f) {
            return false;
        }
        m1170I(-((int) (f10 * getVerticalScrollFactorCompat())), i10, 1, C3332o.m12369a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f1191r) {
            return true;
        }
        int i10 = action & 255;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = this.f1198y;
                    if (i11 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i11);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i11 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f1187n) > this.f1195v && (2 & getNestedScrollAxes()) == 0) {
                                this.f1191r = true;
                                this.f1187n = y10;
                                m1201v();
                                this.f1192s.addMovement(motionEvent);
                                this.f1174B = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i10 != 3) {
                    if (i10 == 6) {
                        m1163B(motionEvent);
                    }
                }
            }
            this.f1191r = false;
            this.f1198y = -1;
            m1166E();
            if (this.f1184k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                C3308b0.m12003Q(this);
            }
            m1180S(0);
        } else {
            int y11 = (int) motionEvent.getY();
            if (m1198s((int) motionEvent.getX(), y11)) {
                this.f1187n = y11;
                this.f1198y = motionEvent.getPointerId(0);
                m1199t();
                this.f1192s.addMovement(motionEvent);
                this.f1184k.computeScrollOffset();
                if (!m1179R(motionEvent) && this.f1184k.isFinished()) {
                    z10 = false;
                }
                this.f1191r = z10;
                m1178Q(2, 0);
            } else {
                if (!m1179R(motionEvent) && this.f1184k.isFinished()) {
                    z10 = false;
                }
                this.f1191r = z10;
                m1166E();
            }
        }
        return this.f1191r;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f1188o = false;
        View view = this.f1190q;
        if (view != null && m1161y(view, this)) {
            m1171J(this.f1190q);
        }
        this.f1190q = null;
        if (!this.f1189p) {
            if (this.f1176D != null) {
                scrollTo(getScrollX(), this.f1176D.f1200h);
                this.f1176D = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int m1160e = m1160e(scrollY, paddingTop, i14);
            if (m1160e != scrollY) {
                scrollTo(getScrollX(), m1160e);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1189p = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f1193t && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        m1194o((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // p148k0.InterfaceC3335r
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr, int i12) {
        m1187h(i10, i11, iArr, null, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m1162A(i13, 0, null);
    }

    @Override // p148k0.InterfaceC3335r
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14) {
        m1162A(i13, i14, null);
    }

    @Override // p148k0.InterfaceC3336s
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        m1162A(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // p148k0.InterfaceC3335r
    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        this.f1177E.m12391c(view, view2, i10, i11);
        m1178Q(2, i11);
    }

    @Override // android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i10) : focusFinder.findNextFocusFromRect(this, rect, i10);
        if (findNextFocus == null || m1203x(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0252d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0252d c0252d = (C0252d) parcelable;
        super.onRestoreInstanceState(c0252d.getSuperState());
        this.f1176D = c0252d;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0252d c0252d = new C0252d(super.onSaveInstanceState());
        c0252d.f1200h = getScrollY();
        return c0252d;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        InterfaceC0251c interfaceC0251c = this.f1180H;
        if (interfaceC0251c != null) {
            interfaceC0251c.mo669a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !m1204z(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f1183j);
        offsetDescendantRectToMyCoords(findFocus, this.f1183j);
        m1189j(m1185f(this.f1183j));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    @Override // p148k0.InterfaceC3335r
    public boolean onStartNestedScroll(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, p148k0.InterfaceC3337t
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // p148k0.InterfaceC3335r
    public void onStopNestedScroll(View view, int i10) {
        this.f1177E.m12393e(view, i10);
        m1180S(i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r12.f1184k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        p148k0.C3308b0.m12003Q(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (r12.f1184k.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L96;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public boolean m1195p(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1183j;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1183j.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1183j;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1183j;
        return m1169H(i10, rect3.top, rect3.bottom);
    }

    /* renamed from: q */
    public final float m1196q(int i10) {
        double log = Math.log((Math.abs(i10) * 0.35f) / (this.f1181h * 0.015f));
        float f10 = f1170I;
        return (float) (this.f1181h * 0.015f * Math.exp((f10 / (f10 - 1.0d)) * log));
    }

    /* renamed from: r */
    public boolean m1197r(int i10) {
        return this.f1178F.m12381l(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1188o) {
            this.f1190q = view2;
        } else {
            m1171J(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return m1172K(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            m1166E();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1188o = true;
        super.requestLayout();
    }

    /* renamed from: s */
    public final boolean m1198s(int i10, int i11) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int m1160e = m1160e(i10, width, width2);
            int m1160e2 = m1160e(i11, height, height2);
            if (m1160e == getScrollX() && m1160e2 == getScrollY()) {
                return;
            }
            super.scrollTo(m1160e, m1160e2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1193t) {
            this.f1193t = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f1178F.m12383n(z10);
    }

    public void setOnScrollChangeListener(InterfaceC0251c interfaceC0251c) {
        this.f1180H = interfaceC0251c;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1194u = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return m1178Q(i10, 0);
    }

    @Override // android.view.View, p148k0.InterfaceC3333p
    public void stopNestedScroll() {
        m1180S(0);
    }

    /* renamed from: t */
    public final void m1199t() {
        VelocityTracker velocityTracker = this.f1192s;
        if (velocityTracker == null) {
            this.f1192s = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    /* renamed from: u */
    public final void m1200u() {
        this.f1184k = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1195v = viewConfiguration.getScaledTouchSlop();
        this.f1196w = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1197x = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* renamed from: v */
    public final void m1201v() {
        if (this.f1192s == null) {
            this.f1192s = VelocityTracker.obtain();
        }
    }

    /* renamed from: w */
    public final void m1202w(int i10, int i11) {
        this.f1187n = i10;
        this.f1198y = i11;
        m1178Q(2, 0);
    }

    /* renamed from: x */
    public final boolean m1203x(View view) {
        return !m1204z(view, 0, getHeight());
    }

    /* renamed from: z */
    public final boolean m1204z(View view, int i10, int i11) {
        view.getDrawingRect(this.f1183j);
        offsetDescendantRectToMyCoords(view, this.f1183j);
        return this.f1183j.bottom + i10 >= getScrollY() && this.f1183j.top - i10 <= getScrollY() + i11;
    }
}
