package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import p089g.C1940j;
import p148k0.C3308b0;
import p187n.C3630e1;
import p187n.C3667w0;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: classes.dex */
public class C0241c extends ViewGroup {

    /* renamed from: h */
    public boolean f1094h;

    /* renamed from: i */
    public int f1095i;

    /* renamed from: j */
    public int f1096j;

    /* renamed from: k */
    public int f1097k;

    /* renamed from: l */
    public int f1098l;

    /* renamed from: m */
    public int f1099m;

    /* renamed from: n */
    public float f1100n;

    /* renamed from: o */
    public boolean f1101o;

    /* renamed from: p */
    public int[] f1102p;

    /* renamed from: q */
    public int[] f1103q;

    /* renamed from: r */
    public Drawable f1104r;

    /* renamed from: s */
    public int f1105s;

    /* renamed from: t */
    public int f1106t;

    /* renamed from: u */
    public int f1107u;

    /* renamed from: v */
    public int f1108v;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public C0241c(Context context) {
        this(context, null);
    }

    public C0241c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0241c(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1094h = true;
        this.f1095i = -1;
        this.f1096j = 0;
        this.f1098l = 8388659;
        int[] iArr = C1940j.f7615a1;
        C3667w0 m13717u = C3667w0.m13717u(context, attributeSet, iArr, i10, 0);
        C3308b0.m12007U(this, context, iArr, attributeSet, m13717u.m13734q(), i10, 0);
        int m13727j = m13717u.m13727j(C1940j.f7625c1, -1);
        if (m13727j >= 0) {
            setOrientation(m13727j);
        }
        int m13727j2 = m13717u.m13727j(C1940j.f7620b1, -1);
        if (m13727j2 >= 0) {
            setGravity(m13727j2);
        }
        boolean m13718a = m13717u.m13718a(C1940j.f7630d1, true);
        if (!m13718a) {
            setBaselineAligned(m13718a);
        }
        this.f1100n = m13717u.m13725h(C1940j.f7640f1, -1.0f);
        this.f1095i = m13717u.m13727j(C1940j.f7635e1, -1);
        this.f1101o = m13717u.m13718a(C1940j.f7655i1, false);
        setDividerDrawable(m13717u.m13723f(C1940j.f7645g1));
        this.f1107u = m13717u.m13727j(C1940j.f7660j1, 0);
        this.f1108v = m13717u.m13722e(C1940j.f7650h1, 0);
        m13717u.m13736v();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* renamed from: e */
    public void m1051e(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean m13501b = C3630e1.m13501b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View m1060q = m1060q(i11);
            if (m1060q != null && m1060q.getVisibility() != 8 && m1061r(i11)) {
                a aVar = (a) m1060q.getLayoutParams();
                m1054h(canvas, m13501b ? m1060q.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (m1060q.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f1105s);
            }
        }
        if (m1061r(virtualChildCount)) {
            View m1060q2 = m1060q(virtualChildCount - 1);
            if (m1060q2 != null) {
                a aVar2 = (a) m1060q2.getLayoutParams();
                if (m13501b) {
                    left = m1060q2.getLeft();
                    i10 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - i10) - this.f1105s;
                } else {
                    right = m1060q2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (m13501b) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                i10 = getPaddingRight();
                right = (left - i10) - this.f1105s;
            }
            m1054h(canvas, right);
        }
    }

    /* renamed from: f */
    public void m1052f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View m1060q = m1060q(i10);
            if (m1060q != null && m1060q.getVisibility() != 8 && m1061r(i10)) {
                m1053g(canvas, (m1060q.getTop() - ((LinearLayout.LayoutParams) ((a) m1060q.getLayoutParams())).topMargin) - this.f1106t);
            }
        }
        if (m1061r(virtualChildCount)) {
            View m1060q2 = m1060q(virtualChildCount - 1);
            m1053g(canvas, m1060q2 == null ? (getHeight() - getPaddingBottom()) - this.f1106t : m1060q2.getBottom() + ((LinearLayout.LayoutParams) ((a) m1060q2.getLayoutParams())).bottomMargin);
        }
    }

    /* renamed from: g */
    public void m1053g(Canvas canvas, int i10) {
        this.f1104r.setBounds(getPaddingLeft() + this.f1108v, i10, (getWidth() - getPaddingRight()) - this.f1108v, this.f1106t + i10);
        this.f1104r.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1095i < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1095i;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1095i == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i12 = this.f1096j;
        if (this.f1097k == 1 && (i10 = this.f1098l & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1099m) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1099m;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1095i;
    }

    public Drawable getDividerDrawable() {
        return this.f1104r;
    }

    public int getDividerPadding() {
        return this.f1108v;
    }

    public int getDividerWidth() {
        return this.f1105s;
    }

    public int getGravity() {
        return this.f1098l;
    }

    public int getOrientation() {
        return this.f1097k;
    }

    public int getShowDividers() {
        return this.f1107u;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1100n;
    }

    /* renamed from: h */
    public void m1054h(Canvas canvas, int i10) {
        this.f1104r.setBounds(i10, getPaddingTop() + this.f1108v, this.f1105s + i10, (getHeight() - getPaddingBottom()) - this.f1108v);
        this.f1104r.draw(canvas);
    }

    /* renamed from: i */
    public final void m1055i(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View m1060q = m1060q(i12);
            if (m1060q.getVisibility() != 8) {
                a aVar = (a) m1060q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = m1060q.getMeasuredWidth();
                    measureChildWithMargins(m1060q, i11, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i13;
                }
            }
        }
    }

    /* renamed from: j */
    public final void m1056j(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i12 = 0; i12 < i10; i12++) {
            View m1060q = m1060q(i12);
            if (m1060q.getVisibility() != 8) {
                a aVar = (a) m1060q.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i13 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = m1060q.getMeasuredHeight();
                    measureChildWithMargins(m1060q, makeMeasureSpec, 0, i11, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i13;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k */
    public a generateDefaultLayoutParams() {
        int i10 = this.f1097k;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: l */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* renamed from: n */
    public int m1057n(View view, int i10) {
        return 0;
    }

    /* renamed from: o */
    public int m1058o(View view) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f1104r == null) {
            return;
        }
        if (this.f1097k == 1) {
            m1052f(canvas);
        } else {
            m1051e(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f1097k == 1) {
            m1063t(i10, i11, i12, i13);
        } else {
            m1062s(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f1097k == 1) {
            m1067x(i10, i11);
        } else {
            m1065v(i10, i11);
        }
    }

    /* renamed from: p */
    public int m1059p(View view) {
        return 0;
    }

    /* renamed from: q */
    public View m1060q(int i10) {
        return getChildAt(i10);
    }

    /* renamed from: r */
    public boolean m1061r(int i10) {
        if (i10 == 0) {
            return (this.f1107u & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f1107u & 4) != 0;
        }
        if ((this.f1107u & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1062s(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0241c.m1062s(int, int, int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f1094h = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1095i = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f1104r) {
            return;
        }
        this.f1104r = drawable;
        if (drawable != null) {
            this.f1105s = drawable.getIntrinsicWidth();
            this.f1106t = drawable.getIntrinsicHeight();
        } else {
            this.f1105s = 0;
            this.f1106t = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f1108v = i10;
    }

    public void setGravity(int i10) {
        if (this.f1098l != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0) {
                i10 |= 48;
            }
            this.f1098l = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f1098l;
        if ((8388615 & i12) != i11) {
            this.f1098l = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1101o = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1097k != i10) {
            this.f1097k = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f1107u) {
            requestLayout();
        }
        this.f1107u = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i12 = this.f1098l;
        if ((i12 & C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != i11) {
            this.f1098l = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f1100n = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1063t(int r18, int r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r20 - r18
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r10 = r17.getVirtualChildCount()
            int r0 = r6.f1098l
            r1 = r0 & 112(0x70, float:1.57E-43)
            r2 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r0 & r2
            r0 = 16
            if (r1 == r0) goto L3b
            r0 = 80
            if (r1 == r0) goto L2f
            int r0 = r17.getPaddingTop()
            goto L47
        L2f:
            int r0 = r17.getPaddingTop()
            int r0 = r0 + r21
            int r0 = r0 - r19
            int r1 = r6.f1099m
            int r0 = r0 - r1
            goto L47
        L3b:
            int r0 = r17.getPaddingTop()
            int r1 = r21 - r19
            int r2 = r6.f1099m
            int r1 = r1 - r2
            int r1 = r1 / 2
            int r0 = r0 + r1
        L47:
            r1 = 0
            r12 = r1
        L49:
            if (r12 >= r10) goto Lc8
            android.view.View r13 = r6.m1060q(r12)
            r14 = 1
            if (r13 != 0) goto L59
            int r1 = r6.m1066w(r12)
            int r0 = r0 + r1
            goto Lc5
        L59:
            int r1 = r13.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lc5
            int r4 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r1 = r13.getLayoutParams()
            r5 = r1
            androidx.appcompat.widget.c$a r5 = (androidx.appcompat.widget.C0241c.a) r5
            int r1 = r5.gravity
            if (r1 >= 0) goto L75
            r1 = r11
        L75:
            int r2 = p148k0.C3308b0.m12048v(r17)
            int r1 = p148k0.C3313e.m12211a(r1, r2)
            r1 = r1 & 7
            if (r1 == r14) goto L8b
            r2 = 5
            if (r1 == r2) goto L88
            int r1 = r5.leftMargin
            int r1 = r1 + r7
            goto L96
        L88:
            int r1 = r8 - r4
            goto L93
        L8b:
            int r1 = r9 - r4
            int r1 = r1 / 2
            int r1 = r1 + r7
            int r2 = r5.leftMargin
            int r1 = r1 + r2
        L93:
            int r2 = r5.rightMargin
            int r1 = r1 - r2
        L96:
            r2 = r1
            boolean r1 = r6.m1061r(r12)
            if (r1 == 0) goto La0
            int r1 = r6.f1106t
            int r0 = r0 + r1
        La0:
            int r1 = r5.topMargin
            int r16 = r0 + r1
            int r0 = r6.m1058o(r13)
            int r3 = r16 + r0
            r0 = r17
            r1 = r13
            r14 = r5
            r5 = r15
            r0.m1068y(r1, r2, r3, r4, r5)
            int r0 = r14.bottomMargin
            int r15 = r15 + r0
            int r0 = r6.m1059p(r13)
            int r15 = r15 + r0
            int r16 = r16 + r15
            int r0 = r6.m1057n(r13, r12)
            int r12 = r12 + r0
            r0 = r16
            r1 = 1
            goto Lc6
        Lc5:
            r1 = r14
        Lc6:
            int r12 = r12 + r1
            goto L49
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0241c.m1063t(int, int, int, int):void");
    }

    /* renamed from: u */
    public void m1064u(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03a5, code lost:
    
        if (r8 > 0) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03b2, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03b3, code lost:
    
        r14.measure(android.view.View.MeasureSpec.makeMeasureSpec(r8, r3), r0);
        r9 = android.view.View.combineMeasuredStates(r9, r14.getMeasuredState() & (-16777216));
        r0 = r0;
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03b0, code lost:
    
        if (r8 < 0) goto L408;
     */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d2  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1065v(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0241c.m1065v(int, int):void");
    }

    /* renamed from: w */
    public int m1066w(int i10) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x02cf, code lost:
    
        if (r15 > 0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02dc, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02dd, code lost:
    
        r13.measure(r0, android.view.View.MeasureSpec.makeMeasureSpec(r15, r10));
        r1 = android.view.View.combineMeasuredStates(r1, r13.getMeasuredState() & (-256));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02da, code lost:
    
        if (r15 < 0) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x031b  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m1067x(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0241c.m1067x(int, int):void");
    }

    /* renamed from: y */
    public final void m1068y(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }
}
