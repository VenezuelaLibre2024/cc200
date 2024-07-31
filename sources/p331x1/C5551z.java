package p331x1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p148k0.C3308b0;

/* renamed from: x1.z */
/* loaded from: classes.dex */
public class C5551z implements InterfaceC5516b0 {

    /* renamed from: a */
    public a f20811a;

    /* renamed from: x1.z$a */
    /* loaded from: classes.dex */
    public static class a extends ViewGroup {

        /* renamed from: m */
        public static Method f20812m;

        /* renamed from: h */
        public ViewGroup f20813h;

        /* renamed from: i */
        public View f20814i;

        /* renamed from: j */
        public ArrayList<Drawable> f20815j;

        /* renamed from: k */
        public C5551z f20816k;

        /* renamed from: l */
        public boolean f20817l;

        static {
            try {
                Class cls = Integer.TYPE;
                f20812m = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, C5551z c5551z) {
            super(context);
            this.f20815j = null;
            this.f20813h = viewGroup;
            this.f20814i = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f20816k = c5551z;
        }

        /* renamed from: a */
        public void m22350a(Drawable drawable) {
            m22352c();
            if (this.f20815j == null) {
                this.f20815j = new ArrayList<>();
            }
            if (this.f20815j.contains(drawable)) {
                return;
            }
            this.f20815j.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        /* renamed from: b */
        public void m22351b(View view) {
            m22352c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f20813h && viewGroup.getParent() != null && C3308b0.m11992F(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f20813h.getLocationOnScreen(iArr2);
                    C3308b0.m11998L(view, iArr[0] - iArr2[0]);
                    C3308b0.m11999M(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* renamed from: c */
        public final void m22352c() {
            if (this.f20817l) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: d */
        public final void m22353d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f20815j;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f20817l = true;
                    this.f20813h.removeView(this);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            this.f20813h.getLocationOnScreen(new int[2]);
            this.f20814i.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f20814i.getWidth(), this.f20814i.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f20815j;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f20815j.get(i10).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: e */
        public final void m22354e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f20813h.getLocationOnScreen(iArr2);
            this.f20814i.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* renamed from: f */
        public void m22355f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f20815j;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m22353d();
            }
        }

        /* renamed from: g */
        public void m22356g(View view) {
            super.removeView(view);
            m22353d();
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f20813h == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f20813h == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            m22354e(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        @Override // android.view.View
        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f20815j) != null && arrayList.contains(drawable));
        }
    }

    public C5551z(Context context, ViewGroup viewGroup, View view) {
        this.f20811a = new a(context, viewGroup, view, this);
    }

    /* renamed from: e */
    public static C5551z m22348e(View view) {
        ViewGroup m22349f = m22349f(view);
        if (m22349f == null) {
            return null;
        }
        int childCount = m22349f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = m22349f.getChildAt(i10);
            if (childAt instanceof a) {
                return ((a) childAt).f20816k;
            }
        }
        return new C5546u(m22349f.getContext(), m22349f, view);
    }

    /* renamed from: f */
    public static ViewGroup m22349f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // p331x1.InterfaceC5516b0
    /* renamed from: a */
    public void mo22195a(Drawable drawable) {
        this.f20811a.m22350a(drawable);
    }

    @Override // p331x1.InterfaceC5516b0
    /* renamed from: b */
    public void mo22196b(Drawable drawable) {
        this.f20811a.m22355f(drawable);
    }
}
