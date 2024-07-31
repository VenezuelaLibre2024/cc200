package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0241c;
import p089g.C1931a;
import p101h.AbstractC2259a;
import p162l.C3390a;
import p187n.C3623c0;
import p187n.C3654q;
import p187n.C3671y0;
import p187n.C3672z;

/* renamed from: androidx.appcompat.widget.d */
/* loaded from: classes.dex */
public class C0242d extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: q */
    public static final Interpolator f1109q = new DecelerateInterpolator();

    /* renamed from: h */
    public Runnable f1110h;

    /* renamed from: i */
    public c f1111i;

    /* renamed from: j */
    public C0241c f1112j;

    /* renamed from: k */
    public Spinner f1113k;

    /* renamed from: l */
    public boolean f1114l;

    /* renamed from: m */
    public int f1115m;

    /* renamed from: n */
    public int f1116n;

    /* renamed from: o */
    public int f1117o;

    /* renamed from: p */
    public int f1118p;

    /* renamed from: androidx.appcompat.widget.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ View f1119h;

        public a(View view) {
            this.f1119h = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0242d.this.smoothScrollTo(this.f1119h.getLeft() - ((C0242d.this.getWidth() - this.f1119h.getWidth()) / 2), 0);
            C0242d.this.f1110h = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.d$b */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0242d.this.f1112j.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) C0242d.this.f1112j.getChildAt(i10)).m1076b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0242d.this.m1071c((AbstractC2259a.c) getItem(i10), true);
            }
            ((d) view).m1075a((AbstractC2259a.c) getItem(i10));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.d$c */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).m1076b().m9029e();
            int childCount = C0242d.this.f1112j.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = C0242d.this.f1112j.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.d$d */
    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: h */
        public final int[] f1123h;

        /* renamed from: i */
        public AbstractC2259a.c f1124i;

        /* renamed from: j */
        public TextView f1125j;

        /* renamed from: k */
        public ImageView f1126k;

        /* renamed from: l */
        public View f1127l;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.content.Context r6, p101h.AbstractC2259a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0242d.this = r5
                int r5 = p089g.C1931a.f7332d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1123h = r1
                r4.f1124i = r7
                n.w0 r5 = p187n.C3667w0.m13717u(r6, r0, r1, r5, r3)
                boolean r6 = r5.m13735r(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.m13723f(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.m13736v()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.m1077c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0242d.d.<init>(androidx.appcompat.widget.d, android.content.Context, h.a$c, boolean):void");
        }

        /* renamed from: a */
        public void m1075a(AbstractC2259a.c cVar) {
            this.f1124i = cVar;
            m1077c();
        }

        /* renamed from: b */
        public AbstractC2259a.c m1076b() {
            return this.f1124i;
        }

        /* renamed from: c */
        public void m1077c() {
            AbstractC2259a.c cVar = this.f1124i;
            View m9026b = cVar.m9026b();
            if (m9026b != null) {
                ViewParent parent = m9026b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m9026b);
                    }
                    addView(m9026b);
                }
                this.f1127l = m9026b;
                TextView textView = this.f1125j;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1126k;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1126k.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1127l;
            if (view != null) {
                removeView(view);
                this.f1127l = null;
            }
            Drawable m9027c = cVar.m9027c();
            CharSequence m9028d = cVar.m9028d();
            if (m9027c != null) {
                if (this.f1126k == null) {
                    C3654q c3654q = new C3654q(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c3654q.setLayoutParams(layoutParams);
                    addView(c3654q, 0);
                    this.f1126k = c3654q;
                }
                this.f1126k.setImageDrawable(m9027c);
                this.f1126k.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1126k;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1126k.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(m9028d);
            if (z10) {
                if (this.f1125j == null) {
                    C3623c0 c3623c0 = new C3623c0(getContext(), null, C1931a.f7333e);
                    c3623c0.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c3623c0.setLayoutParams(layoutParams2);
                    addView(c3623c0);
                    this.f1125j = c3623c0;
                }
                this.f1125j.setText(m9028d);
                this.f1125j.setVisibility(0);
            } else {
                TextView textView2 = this.f1125j;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1125j.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1126k;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m9025a());
            }
            C3671y0.m13742a(this, z10 ? null : cVar.m9025a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (C0242d.this.f1115m > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = C0242d.this.f1115m;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: a */
    public void m1069a(int i10) {
        View childAt = this.f1112j.getChildAt(i10);
        Runnable runnable = this.f1110h;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1110h = aVar;
        post(aVar);
    }

    /* renamed from: b */
    public final Spinner m1070b() {
        C3672z c3672z = new C3672z(getContext(), null, C1931a.f7336h);
        c3672z.setLayoutParams(new C0241c.a(-2, -1));
        c3672z.setOnItemSelectedListener(this);
        return c3672z;
    }

    /* renamed from: c */
    public d m1071c(AbstractC2259a.c cVar, boolean z10) {
        d dVar = new d(this, getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1117o));
        } else {
            dVar.setFocusable(true);
            if (this.f1111i == null) {
                this.f1111i = new c();
            }
            dVar.setOnClickListener(this.f1111i);
        }
        return dVar;
    }

    /* renamed from: d */
    public final boolean m1072d() {
        Spinner spinner = this.f1113k;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    public final void m1073e() {
        if (m1072d()) {
            return;
        }
        if (this.f1113k == null) {
            this.f1113k = m1070b();
        }
        removeView(this.f1112j);
        addView(this.f1113k, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1113k.getAdapter() == null) {
            this.f1113k.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1110h;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1110h = null;
        }
        this.f1113k.setSelection(this.f1118p);
    }

    /* renamed from: f */
    public final boolean m1074f() {
        if (!m1072d()) {
            return false;
        }
        removeView(this.f1113k);
        addView(this.f1112j, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1113k.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1110h;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C3390a m12599b = C3390a.m12599b(getContext());
        setContentHeight(m12599b.m12604f());
        this.f1116n = m12599b.m12603e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1110h;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).m1076b().m9029e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = mode == 1073741824;
        setFillViewport(z10);
        int childCount = this.f1112j.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.f1115m = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.f1115m = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.f1115m, this.f1116n);
        }
        this.f1115m = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1117o, 1073741824);
        if (!z10 && this.f1114l) {
            this.f1112j.measure(0, makeMeasureSpec);
            if (this.f1112j.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                m1073e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z10 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.f1118p);
                return;
            }
        }
        m1074f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z10) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1114l = z10;
    }

    public void setContentHeight(int i10) {
        this.f1117o = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1118p = i10;
        int childCount = this.f1112j.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1112j.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                m1069a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1113k;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
