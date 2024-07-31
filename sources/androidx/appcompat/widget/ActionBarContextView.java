package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p089g.C1931a;
import p089g.C1936f;
import p089g.C1937g;
import p089g.C1940j;
import p148k0.C3308b0;
import p148k0.C3320h0;
import p162l.AbstractC3391b;
import p187n.AbstractC3616a;
import p187n.C3630e1;
import p187n.C3667w0;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC3616a {

    /* renamed from: A */
    public int f850A;

    /* renamed from: p */
    public CharSequence f851p;

    /* renamed from: q */
    public CharSequence f852q;

    /* renamed from: r */
    public View f853r;

    /* renamed from: s */
    public View f854s;

    /* renamed from: t */
    public View f855t;

    /* renamed from: u */
    public LinearLayout f856u;

    /* renamed from: v */
    public TextView f857v;

    /* renamed from: w */
    public TextView f858w;

    /* renamed from: x */
    public int f859x;

    /* renamed from: y */
    public int f860y;

    /* renamed from: z */
    public boolean f861z;

    /* renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0201a implements View.OnClickListener {

        /* renamed from: h */
        public final /* synthetic */ AbstractC3391b f862h;

        public ViewOnClickListenerC0201a(AbstractC3391b abstractC3391b) {
            this.f862h = abstractC3391b;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f862h.mo9219c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7338j);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C3667w0 m13717u = C3667w0.m13717u(context, attributeSet, C1940j.f7733y, i10, 0);
        C3308b0.m12012Z(this, m13717u.m13723f(C1940j.f7738z));
        this.f859x = m13717u.m13730m(C1940j.f7518D, 0);
        this.f860y = m13717u.m13730m(C1940j.f7513C, 0);
        this.f12753l = m13717u.m13729l(C1940j.f7508B, 0);
        this.f850A = m13717u.m13730m(C1940j.f7503A, C1937g.f7469d);
        m13717u.m13736v();
    }

    @Override // p187n.AbstractC3616a
    /* renamed from: f */
    public /* bridge */ /* synthetic */ C3320h0 mo864f(int i10, long j10) {
        return super.mo864f(i10, j10);
    }

    /* renamed from: g */
    public void m865g() {
        if (this.f853r == null) {
            m869k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p187n.AbstractC3616a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p187n.AbstractC3616a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f852q;
    }

    public CharSequence getTitle() {
        return this.f851p;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m866h(p162l.AbstractC3391b r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.f853r
            if (r0 != 0) goto L19
            android.content.Context r0 = r3.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = r3.f850A
            r2 = 0
            android.view.View r0 = r0.inflate(r1, r3, r2)
            r3.f853r = r0
        L15:
            r3.addView(r0)
            goto L22
        L19:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f853r
            goto L15
        L22:
            android.view.View r0 = r3.f853r
            int r1 = p089g.C1936f.f7448i
            android.view.View r0 = r0.findViewById(r1)
            r3.f854s = r0
            androidx.appcompat.widget.ActionBarContextView$a r1 = new androidx.appcompat.widget.ActionBarContextView$a
            r1.<init>(r4)
            r0.setOnClickListener(r1)
            android.view.Menu r4 = r4.mo9221e()
            androidx.appcompat.view.menu.e r4 = (androidx.appcompat.view.menu.C0192e) r4
            androidx.appcompat.widget.a r0 = r3.f12752k
            if (r0 == 0) goto L41
            r0.m1047y()
        L41:
            androidx.appcompat.widget.a r0 = new androidx.appcompat.widget.a
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            r3.f12752k = r0
            r1 = 1
            r0.m1045J(r1)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r2 = -1
            r0.<init>(r1, r2)
            androidx.appcompat.widget.a r1 = r3.f12752k
            android.content.Context r2 = r3.f12750i
            r4.m785c(r1, r2)
            androidx.appcompat.widget.a r4 = r3.f12752k
            androidx.appcompat.view.menu.j r4 = r4.mo721o(r3)
            androidx.appcompat.widget.ActionMenuView r4 = (androidx.appcompat.widget.ActionMenuView) r4
            r3.f12751j = r4
            r1 = 0
            p148k0.C3308b0.m12012Z(r4, r1)
            androidx.appcompat.widget.ActionMenuView r4 = r3.f12751j
            r3.addView(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.m866h(l.b):void");
    }

    /* renamed from: i */
    public final void m867i() {
        if (this.f856u == null) {
            LayoutInflater.from(getContext()).inflate(C1937g.f7466a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f856u = linearLayout;
            this.f857v = (TextView) linearLayout.findViewById(C1936f.f7444e);
            this.f858w = (TextView) this.f856u.findViewById(C1936f.f7443d);
            if (this.f859x != 0) {
                this.f857v.setTextAppearance(getContext(), this.f859x);
            }
            if (this.f860y != 0) {
                this.f858w.setTextAppearance(getContext(), this.f860y);
            }
        }
        this.f857v.setText(this.f851p);
        this.f858w.setText(this.f852q);
        boolean z10 = !TextUtils.isEmpty(this.f851p);
        boolean z11 = !TextUtils.isEmpty(this.f852q);
        int i10 = 0;
        this.f858w.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f856u;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f856u.getParent() == null) {
            addView(this.f856u);
        }
    }

    /* renamed from: j */
    public boolean m868j() {
        return this.f861z;
    }

    /* renamed from: k */
    public void m869k() {
        removeAllViews();
        this.f855t = null;
        this.f12751j = null;
        this.f12752k = null;
        View view = this.f854s;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    /* renamed from: l */
    public boolean m870l() {
        C0239a c0239a = this.f12752k;
        if (c0239a != null) {
            return c0239a.m1046K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0239a c0239a = this.f12752k;
        if (c0239a != null) {
            c0239a.m1037B();
            this.f12752k.m1038C();
        }
    }

    @Override // p187n.AbstractC3616a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean m13501b = C3630e1.m13501b(this);
        int paddingRight = m13501b ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f853r;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f853r.getLayoutParams();
            int i14 = m13501b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = m13501b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int m13384d = AbstractC3616a.m13384d(paddingRight, i14, m13501b);
            paddingRight = AbstractC3616a.m13384d(m13384d + m13386e(this.f853r, m13384d, paddingTop, paddingTop2, m13501b), i15, m13501b);
        }
        int i16 = paddingRight;
        LinearLayout linearLayout = this.f856u;
        if (linearLayout != null && this.f855t == null && linearLayout.getVisibility() != 8) {
            i16 += m13386e(this.f856u, i16, paddingTop, paddingTop2, m13501b);
        }
        int i17 = i16;
        View view2 = this.f855t;
        if (view2 != null) {
            m13386e(view2, i17, paddingTop, paddingTop2, m13501b);
        }
        int paddingLeft = m13501b ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f12751j;
        if (actionMenuView != null) {
            m13386e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !m13501b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int i12 = this.f12753l;
        if (i12 <= 0) {
            i12 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i13 = i12 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        View view = this.f853r;
        if (view != null) {
            int m13385c = m13385c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f853r.getLayoutParams();
            paddingLeft = m13385c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f12751j;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m13385c(this.f12751j, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f856u;
        if (linearLayout != null && this.f855t == null) {
            if (this.f861z) {
                this.f856u.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f856u.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f856u.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = m13385c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f855t;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i14 = layoutParams.width;
            int i15 = i14 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i14 >= 0) {
                paddingLeft = Math.min(i14, paddingLeft);
            }
            int i16 = layoutParams.height;
            int i17 = i16 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i16 >= 0) {
                i13 = Math.min(i16, i13);
            }
            this.f855t.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i15), View.MeasureSpec.makeMeasureSpec(i13, i17));
        }
        if (this.f12753l > 0) {
            setMeasuredDimension(size, i12);
            return;
        }
        int childCount = getChildCount();
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i18) {
                i18 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i18);
    }

    @Override // p187n.AbstractC3616a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p187n.AbstractC3616a
    public void setContentHeight(int i10) {
        this.f12753l = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f855t;
        if (view2 != null) {
            removeView(view2);
        }
        this.f855t = view;
        if (view != null && (linearLayout = this.f856u) != null) {
            removeView(linearLayout);
            this.f856u = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f852q = charSequence;
        m867i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f851p = charSequence;
        m867i();
        C3308b0.m12011Y(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f861z) {
            requestLayout();
        }
        this.f861z = z10;
    }

    @Override // p187n.AbstractC3616a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
