package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0192e;
import androidx.appcompat.view.menu.C0194g;
import androidx.appcompat.view.menu.InterfaceC0196i;
import androidx.appcompat.view.menu.InterfaceC0197j;
import androidx.appcompat.widget.C0241c;
import p187n.C3630e1;

/* loaded from: classes.dex */
public class ActionMenuView extends C0241c implements C0192e.b, InterfaceC0197j {

    /* renamed from: A */
    public C0239a f899A;

    /* renamed from: B */
    public InterfaceC0196i.a f900B;

    /* renamed from: C */
    public C0192e.a f901C;

    /* renamed from: D */
    public boolean f902D;

    /* renamed from: E */
    public int f903E;

    /* renamed from: F */
    public int f904F;

    /* renamed from: G */
    public int f905G;

    /* renamed from: H */
    public InterfaceC0211e f906H;

    /* renamed from: w */
    public C0192e f907w;

    /* renamed from: x */
    public Context f908x;

    /* renamed from: y */
    public int f909y;

    /* renamed from: z */
    public boolean f910z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0207a {
        /* renamed from: a */
        boolean mo690a();

        /* renamed from: b */
        boolean mo691b();
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: classes.dex */
    public static class C0208b implements InterfaceC0196i.a {
        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: b */
        public void mo813b(C0192e c0192e, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0196i.a
        /* renamed from: c */
        public boolean mo814c(C0192e c0192e) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: classes.dex */
    public static class C0209c extends C0241c.a {

        /* renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f911a;

        /* renamed from: b */
        @ViewDebug.ExportedProperty
        public int f912b;

        /* renamed from: c */
        @ViewDebug.ExportedProperty
        public int f913c;

        /* renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f914d;

        /* renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f915e;

        /* renamed from: f */
        public boolean f916f;

        public C0209c(int i10, int i11) {
            super(i10, i11);
            this.f911a = false;
        }

        public C0209c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0209c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0209c(C0209c c0209c) {
            super(c0209c);
            this.f911a = c0209c.f911a;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: classes.dex */
    public class C0210d implements C0192e.a {
        public C0210d() {
        }

        @Override // androidx.appcompat.view.menu.C0192e.a
        /* renamed from: a */
        public boolean mo810a(C0192e c0192e, MenuItem menuItem) {
            InterfaceC0211e interfaceC0211e = ActionMenuView.this.f906H;
            return interfaceC0211e != null && interfaceC0211e.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.C0192e.a
        /* renamed from: b */
        public void mo811b(C0192e c0192e) {
            C0192e.a aVar = ActionMenuView.this.f901C;
            if (aVar != null) {
                aVar.mo811b(c0192e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0211e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f904F = (int) (56.0f * f10);
        this.f905G = (int) (f10 * 4.0f);
        this.f908x = context;
        this.f909y = 0;
    }

    /* renamed from: J */
    public static int m899J(View view, int i10, int i11, int i12, int i13) {
        C0209c c0209c = (C0209c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = actionMenuItemView != null && actionMenuItemView.m694f();
        int i14 = 2;
        if (i11 <= 0 || (z10 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z10 || i15 >= 2) {
                i14 = i15;
            }
        }
        c0209c.f914d = !c0209c.f911a && z10;
        c0209c.f912b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    @Override // androidx.appcompat.widget.C0241c
    /* renamed from: A */
    public C0209c generateDefaultLayoutParams() {
        C0209c c0209c = new C0209c(-2, -2);
        ((LinearLayout.LayoutParams) c0209c).gravity = 16;
        return c0209c;
    }

    @Override // androidx.appcompat.widget.C0241c
    /* renamed from: B */
    public C0209c generateLayoutParams(AttributeSet attributeSet) {
        return new C0209c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.C0241c
    /* renamed from: C */
    public C0209c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0209c c0209c = layoutParams instanceof C0209c ? new C0209c((C0209c) layoutParams) : new C0209c(layoutParams);
        if (((LinearLayout.LayoutParams) c0209c).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0209c).gravity = 16;
        }
        return c0209c;
    }

    /* renamed from: D */
    public C0209c m903D() {
        C0209c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f911a = true;
        return generateDefaultLayoutParams;
    }

    /* renamed from: E */
    public boolean m904E(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof InterfaceC0207a)) {
            z10 = false | ((InterfaceC0207a) childAt).mo690a();
        }
        return (i10 <= 0 || !(childAt2 instanceof InterfaceC0207a)) ? z10 : z10 | ((InterfaceC0207a) childAt2).mo691b();
    }

    /* renamed from: F */
    public boolean m905F() {
        C0239a c0239a = this.f899A;
        return c0239a != null && c0239a.m1037B();
    }

    /* renamed from: G */
    public boolean m906G() {
        C0239a c0239a = this.f899A;
        return c0239a != null && c0239a.m1039D();
    }

    /* renamed from: H */
    public boolean m907H() {
        C0239a c0239a = this.f899A;
        return c0239a != null && c0239a.m1040E();
    }

    /* renamed from: I */
    public boolean m908I() {
        return this.f910z;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* renamed from: K */
    public final void m909K(int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        boolean z12;
        int i16;
        ?? r14;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
        int i17 = size - paddingLeft;
        int i18 = this.f904F;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = i18 + (i20 / i19);
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        boolean z13 = false;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        long j10 = 0;
        while (i23 < childCount) {
            View childAt = getChildAt(i23);
            int i27 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z14 = childAt instanceof ActionMenuItemView;
                int i28 = i24 + 1;
                if (z14) {
                    int i29 = this.f905G;
                    i16 = i28;
                    r14 = 0;
                    childAt.setPadding(i29, 0, i29, 0);
                } else {
                    i16 = i28;
                    r14 = 0;
                }
                C0209c c0209c = (C0209c) childAt.getLayoutParams();
                c0209c.f916f = r14;
                c0209c.f913c = r14;
                c0209c.f912b = r14;
                c0209c.f914d = r14;
                ((LinearLayout.LayoutParams) c0209c).leftMargin = r14;
                ((LinearLayout.LayoutParams) c0209c).rightMargin = r14;
                c0209c.f915e = z14 && ((ActionMenuItemView) childAt).m694f();
                int m899J = m899J(childAt, i21, c0209c.f911a ? 1 : i19, childMeasureSpec, paddingTop);
                i25 = Math.max(i25, m899J);
                if (c0209c.f914d) {
                    i26++;
                }
                if (c0209c.f911a) {
                    z13 = true;
                }
                i19 -= m899J;
                i22 = Math.max(i22, childAt.getMeasuredHeight());
                if (m899J == 1) {
                    j10 |= 1 << i23;
                    i22 = i22;
                }
                i24 = i16;
            }
            i23++;
            size2 = i27;
        }
        int i30 = size2;
        boolean z15 = z13 && i24 == 2;
        boolean z16 = false;
        while (i26 > 0 && i19 > 0) {
            int i31 = Integer.MAX_VALUE;
            int i32 = 0;
            int i33 = 0;
            long j11 = 0;
            while (i33 < childCount) {
                boolean z17 = z16;
                C0209c c0209c2 = (C0209c) getChildAt(i33).getLayoutParams();
                int i34 = i22;
                if (c0209c2.f914d) {
                    int i35 = c0209c2.f912b;
                    if (i35 < i31) {
                        j11 = 1 << i33;
                        i31 = i35;
                        i32 = 1;
                    } else if (i35 == i31) {
                        i32++;
                        j11 |= 1 << i33;
                    }
                }
                i33++;
                i22 = i34;
                z16 = z17;
            }
            z10 = z16;
            i14 = i22;
            j10 |= j11;
            if (i32 > i19) {
                i12 = mode;
                i13 = i17;
                break;
            }
            int i36 = i31 + 1;
            int i37 = 0;
            while (i37 < childCount) {
                View childAt2 = getChildAt(i37);
                C0209c c0209c3 = (C0209c) childAt2.getLayoutParams();
                int i38 = i17;
                int i39 = mode;
                long j12 = 1 << i37;
                if ((j11 & j12) == 0) {
                    if (c0209c3.f912b == i36) {
                        j10 |= j12;
                    }
                    z12 = z15;
                } else {
                    if (z15 && c0209c3.f915e && i19 == 1) {
                        int i40 = this.f905G;
                        z12 = z15;
                        childAt2.setPadding(i40 + i21, 0, i40, 0);
                    } else {
                        z12 = z15;
                    }
                    c0209c3.f912b++;
                    c0209c3.f916f = true;
                    i19--;
                }
                i37++;
                mode = i39;
                i17 = i38;
                z15 = z12;
            }
            i22 = i14;
            z16 = true;
        }
        i12 = mode;
        i13 = i17;
        z10 = z16;
        i14 = i22;
        boolean z18 = !z13 && i24 == 1;
        if (i19 <= 0 || j10 == 0 || (i19 >= i24 - 1 && !z18 && i25 <= 1)) {
            i15 = 0;
            z11 = z10;
        } else {
            float bitCount = Long.bitCount(j10);
            if (z18) {
                i15 = 0;
            } else {
                i15 = 0;
                if ((j10 & 1) != 0 && !((C0209c) getChildAt(0).getLayoutParams()).f915e) {
                    bitCount -= 0.5f;
                }
                int i41 = childCount - 1;
                if ((j10 & (1 << i41)) != 0 && !((C0209c) getChildAt(i41).getLayoutParams()).f915e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i19 * i21) / bitCount) : i15;
            z11 = z10;
            for (int i43 = i15; i43 < childCount; i43++) {
                if ((j10 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C0209c c0209c4 = (C0209c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0209c4.f913c = i42;
                        c0209c4.f916f = true;
                        if (i43 == 0 && !c0209c4.f915e) {
                            ((LinearLayout.LayoutParams) c0209c4).leftMargin = (-i42) / 2;
                        }
                        z11 = true;
                    } else if (c0209c4.f911a) {
                        c0209c4.f913c = i42;
                        c0209c4.f916f = true;
                        ((LinearLayout.LayoutParams) c0209c4).rightMargin = (-i42) / 2;
                        z11 = true;
                    } else {
                        if (i43 != 0) {
                            ((LinearLayout.LayoutParams) c0209c4).leftMargin = i42 / 2;
                        }
                        if (i43 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c0209c4).rightMargin = i42 / 2;
                        }
                    }
                }
            }
        }
        if (z11) {
            for (int i44 = i15; i44 < childCount; i44++) {
                View childAt4 = getChildAt(i44);
                C0209c c0209c5 = (C0209c) childAt4.getLayoutParams();
                if (c0209c5.f916f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0209c5.f912b * i21) + c0209c5.f913c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i13, i12 != 1073741824 ? i14 : i30);
    }

    /* renamed from: L */
    public C0192e m910L() {
        return this.f907w;
    }

    /* renamed from: M */
    public void m911M(InterfaceC0196i.a aVar, C0192e.a aVar2) {
        this.f900B = aVar;
        this.f901C = aVar2;
    }

    /* renamed from: N */
    public boolean m912N() {
        C0239a c0239a = this.f899A;
        return c0239a != null && c0239a.m1046K();
    }

    @Override // androidx.appcompat.view.menu.C0192e.b
    /* renamed from: a */
    public boolean mo700a(C0194g c0194g) {
        return this.f907w.m766L(c0194g, 0);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0197j
    /* renamed from: b */
    public void mo701b(C0192e c0192e) {
        this.f907w = c0192e;
    }

    @Override // androidx.appcompat.widget.C0241c, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0209c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f907w == null) {
            Context context = getContext();
            C0192e c0192e = new C0192e(context);
            this.f907w = c0192e;
            c0192e.mo772R(new C0210d());
            C0239a c0239a = new C0239a(context);
            this.f899A = c0239a;
            c0239a.m1045J(true);
            C0239a c0239a2 = this.f899A;
            InterfaceC0196i.a aVar = this.f900B;
            if (aVar == null) {
                aVar = new C0208b();
            }
            c0239a2.mo713g(aVar);
            this.f907w.m785c(this.f899A, this.f908x);
            this.f899A.m1043H(this);
        }
        return this.f907w;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f899A.m1036A();
    }

    public int getPopupTheme() {
        return this.f909y;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0239a c0239a = this.f899A;
        if (c0239a != null) {
            c0239a.mo710c(false);
            if (this.f899A.m1040E()) {
                this.f899A.m1037B();
                this.f899A.m1046K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m916z();
    }

    @Override // androidx.appcompat.widget.C0241c, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.f902D) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean m13501b = C3630e1.m13501b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                C0209c c0209c = (C0209c) childAt.getLayoutParams();
                if (c0209c.f911a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m904E(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m13501b) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0209c).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0209c).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0209c).leftMargin) + ((LinearLayout.LayoutParams) c0209c).rightMargin;
                    m904E(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (m13501b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                C0209c c0209c2 = (C0209c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0209c2.f911a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) c0209c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0209c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            C0209c c0209c3 = (C0209c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0209c3.f911a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) c0209c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = i28 + measuredWidth4 + ((LinearLayout.LayoutParams) c0209c3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.C0241c, android.view.View
    public void onMeasure(int i10, int i11) {
        C0192e c0192e;
        boolean z10 = this.f902D;
        boolean z11 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.f902D = z11;
        if (z10 != z11) {
            this.f903E = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.f902D && (c0192e = this.f907w) != null && size != this.f903E) {
            this.f903E = size;
            c0192e.m765K(true);
        }
        int childCount = getChildCount();
        if (this.f902D && childCount > 0) {
            m909K(i10, i11);
            return;
        }
        for (int i12 = 0; i12 < childCount; i12++) {
            C0209c c0209c = (C0209c) getChildAt(i12).getLayoutParams();
            ((LinearLayout.LayoutParams) c0209c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0209c).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.f899A.m1042G(z10);
    }

    public void setOnMenuItemClickListener(InterfaceC0211e interfaceC0211e) {
        this.f906H = interfaceC0211e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f899A.m1044I(drawable);
    }

    public void setOverflowReserved(boolean z10) {
        this.f910z = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.f909y != i10) {
            this.f909y = i10;
            if (i10 == 0) {
                this.f908x = getContext();
            } else {
                this.f908x = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(C0239a c0239a) {
        this.f899A = c0239a;
        c0239a.m1043H(this);
    }

    /* renamed from: z */
    public void m916z() {
        C0239a c0239a = this.f899A;
        if (c0239a != null) {
            c0239a.m1047y();
        }
    }
}
