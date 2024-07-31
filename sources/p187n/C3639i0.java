package p187n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p015b0.C0436a;
import p089g.C1931a;
import p132j.C3200c;
import p148k0.C3320h0;
import p188n0.C3680g;

/* renamed from: n.i0 */
/* loaded from: classes.dex */
public class C3639i0 extends ListView {

    /* renamed from: h */
    public final Rect f12866h;

    /* renamed from: i */
    public int f12867i;

    /* renamed from: j */
    public int f12868j;

    /* renamed from: k */
    public int f12869k;

    /* renamed from: l */
    public int f12870l;

    /* renamed from: m */
    public int f12871m;

    /* renamed from: n */
    public Field f12872n;

    /* renamed from: o */
    public c f12873o;

    /* renamed from: p */
    public boolean f12874p;

    /* renamed from: q */
    public boolean f12875q;

    /* renamed from: r */
    public boolean f12876r;

    /* renamed from: s */
    public C3320h0 f12877s;

    /* renamed from: t */
    public C3680g f12878t;

    /* renamed from: u */
    public d f12879u;

    /* renamed from: n.i0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m13534a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    /* renamed from: n.i0$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public static Method f12880a;

        /* renamed from: b */
        public static Method f12881b;

        /* renamed from: c */
        public static Method f12882c;

        /* renamed from: d */
        public static boolean f12883d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f12880a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f12881b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f12882c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f12883d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        /* renamed from: a */
        public static boolean m13535a() {
            return f12883d;
        }

        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: b */
        public static void m13536b(C3639i0 c3639i0, int i10, View view) {
            try {
                f12880a.invoke(c3639i0, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f12881b.invoke(c3639i0, Integer.valueOf(i10));
                f12882c.invoke(c3639i0, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: n.i0$c */
    /* loaded from: classes.dex */
    public static class c extends C3200c {

        /* renamed from: i */
        public boolean f12884i;

        public c(Drawable drawable) {
            super(drawable);
            this.f12884i = true;
        }

        /* renamed from: c */
        public void m13537c(boolean z10) {
            this.f12884i = z10;
        }

        @Override // p132j.C3200c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f12884i) {
                super.draw(canvas);
            }
        }

        @Override // p132j.C3200c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f12884i) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // p132j.C3200c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f12884i) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // p132j.C3200c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f12884i) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p132j.C3200c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f12884i) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* renamed from: n.i0$d */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        /* renamed from: a */
        public void m13538a() {
            C3639i0 c3639i0 = C3639i0.this;
            c3639i0.f12879u = null;
            c3639i0.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m13539b() {
            C3639i0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C3639i0 c3639i0 = C3639i0.this;
            c3639i0.f12879u = null;
            c3639i0.drawableStateChanged();
        }
    }

    public C3639i0(Context context, boolean z10) {
        super(context, null, C1931a.f7316A);
        this.f12866h = new Rect();
        this.f12867i = 0;
        this.f12868j = 0;
        this.f12869k = 0;
        this.f12870l = 0;
        this.f12875q = z10;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f12872n = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e10) {
            e10.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z10) {
        c cVar = this.f12873o;
        if (cVar != null) {
            cVar.m13537c(z10);
        }
    }

    /* renamed from: a */
    public final void m13523a() {
        this.f12876r = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f12871m - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C3320h0 c3320h0 = this.f12877s;
        if (c3320h0 != null) {
            c3320h0.m12251c();
            this.f12877s = null;
        }
    }

    /* renamed from: b */
    public final void m13524b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    /* renamed from: c */
    public final void m13525c(Canvas canvas) {
        Drawable selector;
        if (this.f12866h.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f12866h);
        selector.draw(canvas);
    }

    /* renamed from: d */
    public int mo13526d(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i15 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i15;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        View view = null;
        while (i16 < count) {
            int itemViewType = adapter.getItemViewType(i16);
            if (itemViewType != i17) {
                view = null;
                i17 = itemViewType;
            }
            view = adapter.getView(i16, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i19 = layoutParams.height;
            view.measure(i10, i19 > 0 ? View.MeasureSpec.makeMeasureSpec(i19, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i16 > 0) {
                i15 += dividerHeight;
            }
            i15 += view.getMeasuredHeight();
            if (i15 >= i13) {
                return (i14 < 0 || i16 <= i14 || i18 <= 0 || i15 == i13) ? i13 : i18;
            }
            if (i14 >= 0 && i16 >= i14) {
                i18 = i15;
            }
            i16++;
        }
        return i15;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m13525c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f12879u != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m13533k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0048 A[ADDED_TO_REGION] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo13527e(android.view.MotionEvent r8, int r9) {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = r1
            r3 = r2
            goto L46
        L11:
            r9 = r1
            r3 = r9
            goto L46
        L14:
            r3 = r2
            goto L17
        L16:
            r3 = r1
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = r2
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m13531i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m13524b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m13523a()
        L4d:
            if (r3 == 0) goto L65
            n0.g r9 = r7.f12878t
            if (r9 != 0) goto L5a
            n0.g r9 = new n0.g
            r9.<init>(r7)
            r7.f12878t = r9
        L5a:
            n0.g r9 = r7.f12878t
            r9.m13781m(r2)
            n0.g r9 = r7.f12878t
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            n0.g r8 = r7.f12878t
            if (r8 == 0) goto L6c
            r8.m13781m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p187n.C3639i0.mo13527e(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: f */
    public final void m13528f(int i10, View view) {
        Rect rect = this.f12866h;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f12867i;
        rect.top -= this.f12868j;
        rect.right += this.f12869k;
        rect.bottom += this.f12870l;
        try {
            boolean z10 = this.f12872n.getBoolean(this);
            if (view.isEnabled() != z10) {
                this.f12872n.set(this, Boolean.valueOf(!z10));
                if (i10 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        }
    }

    /* renamed from: g */
    public final void m13529g(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        m13528f(i10, view);
        if (z10) {
            Rect rect = this.f12866h;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0436a.m2259j(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: h */
    public final void m13530h(int i10, View view, float f10, float f11) {
        m13529g(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        C0436a.m2259j(selector, f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f12875q || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f12875q || super.hasWindowFocus();
    }

    /* renamed from: i */
    public final void m13531i(View view, int i10, float f10, float f11) {
        View childAt;
        this.f12876r = true;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 21) {
            a.m13534a(this, f10, f11);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i12 = this.f12871m;
        if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f12871m = i10;
        float left = f10 - view.getLeft();
        float top = f11 - view.getTop();
        if (i11 >= 21) {
            a.m13534a(view, left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m13530h(i10, view, f10, f11);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f12875q || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f12875q && this.f12874p) || super.isInTouchMode();
    }

    /* renamed from: j */
    public final boolean m13532j() {
        return this.f12876r;
    }

    /* renamed from: k */
    public final void m13533k() {
        Drawable selector = getSelector();
        if (selector != null && m13532j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f12879u = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f12879u == null) {
            d dVar = new d();
            this.f12879u = dVar;
            dVar.m13539b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.m13535a()) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        b.m13536b(this, pointToPosition, childAt);
                    }
                }
                m13533k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f12871m = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        d dVar = this.f12879u;
        if (dVar != null) {
            dVar.m13538a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f12874p = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        c cVar = drawable != null ? new c(drawable) : null;
        this.f12873o = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f12867i = rect.left;
        this.f12868j = rect.top;
        this.f12869k = rect.right;
        this.f12870l = rect.bottom;
    }
}
