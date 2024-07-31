package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p245r.C4256a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: h */
    public final int f1151h;

    /* renamed from: i */
    public final int f1152i;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1151h = getResources().getDimensionPixelOffset(C4256a.f15392b);
        this.f1152i = getResources().getDimensionPixelOffset(C4256a.f15391a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1151h * 2), this.f1152i), 1073741824), i11);
    }
}
