package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p089g.C1936f;
import p089g.C1940j;
import p148k0.C3308b0;
import p187n.C3619b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: h */
    public boolean f840h;

    /* renamed from: i */
    public View f841i;

    /* renamed from: j */
    public View f842j;

    /* renamed from: k */
    public View f843k;

    /* renamed from: l */
    public Drawable f844l;

    /* renamed from: m */
    public Drawable f845m;

    /* renamed from: n */
    public Drawable f846n;

    /* renamed from: o */
    public boolean f847o;

    /* renamed from: p */
    public boolean f848p;

    /* renamed from: q */
    public int f849q;

    /* renamed from: androidx.appcompat.widget.ActionBarContainer$a */
    /* loaded from: classes.dex */
    public static class C0200a {
        /* renamed from: a */
        public static void m863a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C3308b0.m12012Z(this, new C3619b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1940j.f7613a);
        this.f844l = obtainStyledAttributes.getDrawable(C1940j.f7618b);
        this.f845m = obtainStyledAttributes.getDrawable(C1940j.f7628d);
        this.f849q = obtainStyledAttributes.getDimensionPixelSize(C1940j.f7658j, -1);
        boolean z10 = true;
        if (getId() == C1936f.f7431H) {
            this.f847o = true;
            this.f846n = obtainStyledAttributes.getDrawable(C1940j.f7623c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f847o ? this.f844l != null || this.f845m != null : this.f846n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    /* renamed from: a */
    public final int m861a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    public final boolean m862b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f844l;
        if (drawable != null && drawable.isStateful()) {
            this.f844l.setState(getDrawableState());
        }
        Drawable drawable2 = this.f845m;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f845m.setState(getDrawableState());
        }
        Drawable drawable3 = this.f846n;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f846n.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f841i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f844l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f845m;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f846n;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f842j = findViewById(C1936f.f7440a);
        this.f843k = findViewById(C1936f.f7445f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f840h || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z10, i10, i11, i12, i13);
        View view2 = this.f841i;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (view2 != null && view2.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
            int measuredHeight2 = measuredHeight - view2.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view2.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f847o) {
            Drawable drawable3 = this.f846n;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f844l != null) {
                if (this.f842j.getVisibility() == 0) {
                    drawable2 = this.f844l;
                    left = this.f842j.getLeft();
                    top = this.f842j.getTop();
                    right = this.f842j.getRight();
                    view = this.f842j;
                } else {
                    View view3 = this.f843k;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f844l.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f844l;
                        left = this.f843k.getLeft();
                        top = this.f843k.getTop();
                        right = this.f843k.getRight();
                        view = this.f843k;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z12 = true;
            }
            this.f848p = z13;
            if (z13 && (drawable = this.f845m) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f842j
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.f849q
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f842j
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f841i
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f842j
            boolean r0 = r3.m862b(r0)
            if (r0 != 0) goto L47
            android.view.View r0 = r3.f842j
        L42:
            int r0 = r3.m861a(r0)
            goto L53
        L47:
            android.view.View r0 = r3.f843k
            boolean r0 = r3.m862b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f843k
            goto L42
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f841i
            int r1 = r3.m861a(r1)
            int r0 = r0 + r1
            int r4 = java.lang.Math.min(r0, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f844l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f844l);
        }
        this.f844l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f842j;
            if (view != null) {
                this.f844l.setBounds(view.getLeft(), this.f842j.getTop(), this.f842j.getRight(), this.f842j.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f847o ? this.f844l != null || this.f845m != null : this.f846n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0200a.m863a(this);
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f846n;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f846n);
        }
        this.f846n = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f847o && (drawable2 = this.f846n) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f847o ? !(this.f844l != null || this.f845m != null) : this.f846n == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0200a.m863a(this);
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f845m;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f845m);
        }
        this.f845m = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f848p && (drawable2 = this.f845m) != null) {
                drawable2.setBounds(this.f841i.getLeft(), this.f841i.getTop(), this.f841i.getRight(), this.f841i.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f847o ? this.f844l != null || this.f845m != null : this.f846n != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            C0200a.m863a(this);
        }
    }

    public void setTabContainer(C0242d c0242d) {
        View view = this.f841i;
        if (view != null) {
            removeView(view);
        }
        this.f841i = c0242d;
        if (c0242d != null) {
            addView(c0242d);
            ViewGroup.LayoutParams layoutParams = c0242d.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0242d.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f840h = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f844l;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f845m;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f846n;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f844l && !this.f847o) || (drawable == this.f845m && this.f848p) || ((drawable == this.f846n && this.f847o) || super.verifyDrawable(drawable));
    }
}
