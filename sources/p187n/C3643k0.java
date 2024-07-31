package p187n;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p079f6.C1841a;
import p089g.C1940j;
import p148k0.C3308b0;
import p175m.InterfaceC3490f;
import p188n0.C3682i;

/* renamed from: n.k0 */
/* loaded from: classes.dex */
public class C3643k0 implements InterfaceC3490f {

    /* renamed from: N */
    public static Method f12911N;

    /* renamed from: O */
    public static Method f12912O;

    /* renamed from: P */
    public static Method f12913P;

    /* renamed from: A */
    public Drawable f12914A;

    /* renamed from: B */
    public AdapterView.OnItemClickListener f12915B;

    /* renamed from: C */
    public AdapterView.OnItemSelectedListener f12916C;

    /* renamed from: D */
    public final i f12917D;

    /* renamed from: E */
    public final h f12918E;

    /* renamed from: F */
    public final g f12919F;

    /* renamed from: G */
    public final e f12920G;

    /* renamed from: H */
    public Runnable f12921H;

    /* renamed from: I */
    public final Handler f12922I;

    /* renamed from: J */
    public final Rect f12923J;

    /* renamed from: K */
    public Rect f12924K;

    /* renamed from: L */
    public boolean f12925L;

    /* renamed from: M */
    public PopupWindow f12926M;

    /* renamed from: h */
    public Context f12927h;

    /* renamed from: i */
    public ListAdapter f12928i;

    /* renamed from: j */
    public C3639i0 f12929j;

    /* renamed from: k */
    public int f12930k;

    /* renamed from: l */
    public int f12931l;

    /* renamed from: m */
    public int f12932m;

    /* renamed from: n */
    public int f12933n;

    /* renamed from: o */
    public int f12934o;

    /* renamed from: p */
    public boolean f12935p;

    /* renamed from: q */
    public boolean f12936q;

    /* renamed from: r */
    public boolean f12937r;

    /* renamed from: s */
    public int f12938s;

    /* renamed from: t */
    public boolean f12939t;

    /* renamed from: u */
    public boolean f12940u;

    /* renamed from: v */
    public int f12941v;

    /* renamed from: w */
    public View f12942w;

    /* renamed from: x */
    public int f12943x;

    /* renamed from: y */
    public DataSetObserver f12944y;

    /* renamed from: z */
    public View f12945z;

    /* renamed from: n.k0$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m13592s = C3643k0.this.m13592s();
            if (m13592s == null || m13592s.getWindowToken() == null) {
                return;
            }
            C3643k0.this.show();
        }
    }

    /* renamed from: n.k0$b */
    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            C3639i0 c3639i0;
            if (i10 == -1 || (c3639i0 = C3643k0.this.f12929j) == null) {
                return;
            }
            c3639i0.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: n.k0$c */
    /* loaded from: classes.dex */
    public static class c {
        /* renamed from: a */
        public static int m13600a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    /* renamed from: n.k0$d */
    /* loaded from: classes.dex */
    public static class d {
        /* renamed from: a */
        public static void m13601a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        public static void m13602b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    /* renamed from: n.k0$e */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3643k0.this.m13590q();
        }
    }

    /* renamed from: n.k0$f */
    /* loaded from: classes.dex */
    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C3643k0.this.mo729a()) {
                C3643k0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C3643k0.this.dismiss();
        }
    }

    /* renamed from: n.k0$g */
    /* loaded from: classes.dex */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 != 1 || C3643k0.this.m13595v() || C3643k0.this.f12926M.getContentView() == null) {
                return;
            }
            C3643k0 c3643k0 = C3643k0.this;
            c3643k0.f12922I.removeCallbacks(c3643k0.f12917D);
            C3643k0.this.f12917D.run();
        }
    }

    /* renamed from: n.k0$h */
    /* loaded from: classes.dex */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C3643k0.this.f12926M) != null && popupWindow.isShowing() && x10 >= 0 && x10 < C3643k0.this.f12926M.getWidth() && y10 >= 0 && y10 < C3643k0.this.f12926M.getHeight()) {
                C3643k0 c3643k0 = C3643k0.this;
                c3643k0.f12922I.postDelayed(c3643k0.f12917D, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C3643k0 c3643k02 = C3643k0.this;
            c3643k02.f12922I.removeCallbacks(c3643k02.f12917D);
            return false;
        }
    }

    /* renamed from: n.k0$i */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3639i0 c3639i0 = C3643k0.this.f12929j;
            if (c3639i0 == null || !C3308b0.m11992F(c3639i0) || C3643k0.this.f12929j.getCount() <= C3643k0.this.f12929j.getChildCount()) {
                return;
            }
            int childCount = C3643k0.this.f12929j.getChildCount();
            C3643k0 c3643k0 = C3643k0.this;
            if (childCount <= c3643k0.f12941v) {
                c3643k0.f12926M.setInputMethodMode(2);
                C3643k0.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f12911N = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f12913P = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f12912O = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C3643k0(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public C3643k0(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f12930k = -2;
        this.f12931l = -2;
        this.f12934o = 1002;
        this.f12938s = 0;
        this.f12939t = false;
        this.f12940u = false;
        this.f12941v = C1841a.e.API_PRIORITY_OTHER;
        this.f12943x = 0;
        this.f12917D = new i();
        this.f12918E = new h();
        this.f12919F = new g();
        this.f12920G = new e();
        this.f12923J = new Rect();
        this.f12927h = context;
        this.f12922I = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1940j.f7670l1, i10, i11);
        this.f12932m = obtainStyledAttributes.getDimensionPixelOffset(C1940j.f7675m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C1940j.f7680n1, 0);
        this.f12933n = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f12935p = true;
        }
        obtainStyledAttributes.recycle();
        C3658s c3658s = new C3658s(context, attributeSet, i10, i11);
        this.f12926M = c3658s;
        c3658s.setInputMethodMode(1);
    }

    /* renamed from: A */
    public void m13570A(int i10) {
        Drawable background = this.f12926M.getBackground();
        if (background == null) {
            m13581L(i10);
            return;
        }
        background.getPadding(this.f12923J);
        Rect rect = this.f12923J;
        this.f12931l = rect.left + rect.right + i10;
    }

    /* renamed from: B */
    public void m13571B(int i10) {
        this.f12938s = i10;
    }

    /* renamed from: C */
    public void m13572C(Rect rect) {
        this.f12924K = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: D */
    public void m13573D(int i10) {
        this.f12926M.setInputMethodMode(i10);
    }

    /* renamed from: E */
    public void m13574E(boolean z10) {
        this.f12925L = z10;
        this.f12926M.setFocusable(z10);
    }

    /* renamed from: F */
    public void m13575F(PopupWindow.OnDismissListener onDismissListener) {
        this.f12926M.setOnDismissListener(onDismissListener);
    }

    /* renamed from: G */
    public void m13576G(AdapterView.OnItemClickListener onItemClickListener) {
        this.f12915B = onItemClickListener;
    }

    /* renamed from: H */
    public void m13577H(boolean z10) {
        this.f12937r = true;
        this.f12936q = z10;
    }

    /* renamed from: I */
    public final void m13578I(boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            d.m13602b(this.f12926M, z10);
            return;
        }
        Method method = f12911N;
        if (method != null) {
            try {
                method.invoke(this.f12926M, Boolean.valueOf(z10));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: J */
    public void m13579J(int i10) {
        this.f12943x = i10;
    }

    /* renamed from: K */
    public void m13580K(int i10) {
        C3639i0 c3639i0 = this.f12929j;
        if (!mo729a() || c3639i0 == null) {
            return;
        }
        c3639i0.setListSelectionHidden(false);
        c3639i0.setSelection(i10);
        if (c3639i0.getChoiceMode() != 0) {
            c3639i0.setItemChecked(i10, true);
        }
    }

    /* renamed from: L */
    public void m13581L(int i10) {
        this.f12931l = i10;
    }

    @Override // p175m.InterfaceC3490f
    /* renamed from: a */
    public boolean mo729a() {
        return this.f12926M.isShowing();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0150  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m13582d() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p187n.C3643k0.m13582d():int");
    }

    @Override // p175m.InterfaceC3490f
    public void dismiss() {
        this.f12926M.dismiss();
        m13597x();
        this.f12926M.setContentView(null);
        this.f12929j = null;
        this.f12922I.removeCallbacks(this.f12917D);
    }

    /* renamed from: e */
    public void m13583e(Drawable drawable) {
        this.f12926M.setBackgroundDrawable(drawable);
    }

    /* renamed from: f */
    public int m13584f() {
        return this.f12932m;
    }

    /* renamed from: g */
    public void m13585g(int i10) {
        this.f12932m = i10;
    }

    /* renamed from: i */
    public Drawable m13586i() {
        return this.f12926M.getBackground();
    }

    @Override // p175m.InterfaceC3490f
    /* renamed from: j */
    public ListView mo731j() {
        return this.f12929j;
    }

    /* renamed from: l */
    public void m13587l(int i10) {
        this.f12933n = i10;
        this.f12935p = true;
    }

    /* renamed from: o */
    public int m13588o() {
        if (this.f12935p) {
            return this.f12933n;
        }
        return 0;
    }

    /* renamed from: p */
    public void mo13589p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f12944y;
        if (dataSetObserver == null) {
            this.f12944y = new f();
        } else {
            ListAdapter listAdapter2 = this.f12928i;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f12928i = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f12944y);
        }
        C3639i0 c3639i0 = this.f12929j;
        if (c3639i0 != null) {
            c3639i0.setAdapter(this.f12928i);
        }
    }

    /* renamed from: q */
    public void m13590q() {
        C3639i0 c3639i0 = this.f12929j;
        if (c3639i0 != null) {
            c3639i0.setListSelectionHidden(true);
            c3639i0.requestLayout();
        }
    }

    /* renamed from: r */
    public C3639i0 mo13591r(Context context, boolean z10) {
        return new C3639i0(context, z10);
    }

    /* renamed from: s */
    public View m13592s() {
        return this.f12945z;
    }

    @Override // p175m.InterfaceC3490f
    public void show() {
        int m13582d = m13582d();
        boolean m13595v = m13595v();
        C3682i.m13840b(this.f12926M, this.f12934o);
        if (this.f12926M.isShowing()) {
            if (C3308b0.m11992F(m13592s())) {
                int i10 = this.f12931l;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = m13592s().getWidth();
                }
                int i11 = this.f12930k;
                if (i11 == -1) {
                    if (!m13595v) {
                        m13582d = -1;
                    }
                    if (m13595v) {
                        this.f12926M.setWidth(this.f12931l == -1 ? -1 : 0);
                        this.f12926M.setHeight(0);
                    } else {
                        this.f12926M.setWidth(this.f12931l == -1 ? -1 : 0);
                        this.f12926M.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    m13582d = i11;
                }
                this.f12926M.setOutsideTouchable((this.f12940u || this.f12939t) ? false : true);
                this.f12926M.update(m13592s(), this.f12932m, this.f12933n, i10 < 0 ? -1 : i10, m13582d < 0 ? -1 : m13582d);
                return;
            }
            return;
        }
        int i12 = this.f12931l;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = m13592s().getWidth();
        }
        int i13 = this.f12930k;
        if (i13 == -1) {
            m13582d = -1;
        } else if (i13 != -2) {
            m13582d = i13;
        }
        this.f12926M.setWidth(i12);
        this.f12926M.setHeight(m13582d);
        m13578I(true);
        this.f12926M.setOutsideTouchable((this.f12940u || this.f12939t) ? false : true);
        this.f12926M.setTouchInterceptor(this.f12918E);
        if (this.f12937r) {
            C3682i.m13839a(this.f12926M, this.f12936q);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f12913P;
            if (method != null) {
                try {
                    method.invoke(this.f12926M, this.f12924K);
                } catch (Exception e10) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e10);
                }
            }
        } else {
            d.m13601a(this.f12926M, this.f12924K);
        }
        C3682i.m13841c(this.f12926M, m13592s(), this.f12932m, this.f12933n, this.f12938s);
        this.f12929j.setSelection(-1);
        if (!this.f12925L || this.f12929j.isInTouchMode()) {
            m13590q();
        }
        if (this.f12925L) {
            return;
        }
        this.f12922I.post(this.f12920G);
    }

    /* renamed from: t */
    public final int m13593t(View view, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT > 23) {
            return c.m13600a(this.f12926M, view, i10, z10);
        }
        Method method = f12912O;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f12926M, view, Integer.valueOf(i10), Boolean.valueOf(z10))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f12926M.getMaxAvailableHeight(view, i10);
    }

    /* renamed from: u */
    public int m13594u() {
        return this.f12931l;
    }

    /* renamed from: v */
    public boolean m13595v() {
        return this.f12926M.getInputMethodMode() == 2;
    }

    /* renamed from: w */
    public boolean m13596w() {
        return this.f12925L;
    }

    /* renamed from: x */
    public final void m13597x() {
        View view = this.f12942w;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f12942w);
            }
        }
    }

    /* renamed from: y */
    public void m13598y(View view) {
        this.f12945z = view;
    }

    /* renamed from: z */
    public void m13599z(int i10) {
        this.f12926M.setAnimationStyle(i10);
    }
}
