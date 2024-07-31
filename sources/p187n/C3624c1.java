package p187n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import p089g.C1934d;
import p089g.C1936f;
import p089g.C1937g;
import p089g.C1939i;

/* renamed from: n.c1 */
/* loaded from: classes.dex */
public class C3624c1 {

    /* renamed from: a */
    public final Context f12807a;

    /* renamed from: b */
    public final View f12808b;

    /* renamed from: c */
    public final TextView f12809c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f12810d;

    /* renamed from: e */
    public final Rect f12811e;

    /* renamed from: f */
    public final int[] f12812f;

    /* renamed from: g */
    public final int[] f12813g;

    public C3624c1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f12810d = layoutParams;
        this.f12811e = new Rect();
        this.f12812f = new int[2];
        this.f12813g = new int[2];
        this.f12807a = context;
        View inflate = LayoutInflater.from(context).inflate(C1937g.f7484s, (ViewGroup) null);
        this.f12808b = inflate;
        this.f12809c = (TextView) inflate.findViewById(C1936f.f7458s);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C1939i.f7498a;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m13446b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void m13447a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f12807a.getResources().getDimensionPixelOffset(C1934d.f7376m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f12807a.getResources().getDimensionPixelOffset(C1934d.f7375l);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f12807a.getResources().getDimensionPixelOffset(z10 ? C1934d.f7378o : C1934d.f7377n);
        View m13446b = m13446b(view);
        if (m13446b == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        m13446b.getWindowVisibleDisplayFrame(this.f12811e);
        Rect rect = this.f12811e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f12807a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f12811e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        m13446b.getLocationOnScreen(this.f12813g);
        view.getLocationOnScreen(this.f12812f);
        int[] iArr = this.f12812f;
        int i13 = iArr[0];
        int[] iArr2 = this.f12813g;
        iArr[0] = i13 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (m13446b.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f12808b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f12808b.getMeasuredHeight();
        int[] iArr3 = this.f12812f;
        int i14 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i15 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z10 ? measuredHeight + i15 <= this.f12811e.height() : i14 < 0) {
            layoutParams.y = i14;
        } else {
            layoutParams.y = i15;
        }
    }

    /* renamed from: c */
    public void m13448c() {
        if (m13449d()) {
            ((WindowManager) this.f12807a.getSystemService("window")).removeView(this.f12808b);
        }
    }

    /* renamed from: d */
    public boolean m13449d() {
        return this.f12808b.getParent() != null;
    }

    /* renamed from: e */
    public void m13450e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (m13449d()) {
            m13448c();
        }
        this.f12809c.setText(charSequence);
        m13447a(view, i10, i11, z10, this.f12810d);
        ((WindowManager) this.f12807a.getSystemService("window")).addView(this.f12808b, this.f12810d);
    }
}
