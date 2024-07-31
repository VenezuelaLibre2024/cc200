package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p089g.C1936f;
import p089g.C1940j;
import p148k0.C3308b0;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: h */
    public boolean f919h;

    /* renamed from: i */
    public boolean f920i;

    /* renamed from: j */
    public int f921j;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f921j = -1;
        int[] iArr = C1940j.f7562N0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        C3308b0.m12007U(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f919h = obtainStyledAttributes.getBoolean(C1940j.f7566O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f919h);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f920i != z10) {
            if (!z10 || this.f919h) {
                this.f920i = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View findViewById = findViewById(C1936f.f7430G);
                if (findViewById != null) {
                    findViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    /* renamed from: a */
    public final int m921a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: b */
    public final boolean m922b() {
        return this.f920i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f919h) {
            if (size > this.f921j && m922b()) {
                setStacked(false);
            }
            this.f921j = size;
        }
        if (m922b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f919h && !m922b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int m921a = m921a(0);
        if (m921a >= 0) {
            View childAt = getChildAt(m921a);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m922b()) {
                int m921a2 = m921a(m921a + 1);
                if (m921a2 >= 0) {
                    paddingTop += getChildAt(m921a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i13 = paddingTop;
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (C3308b0.m12049w(this) != i13) {
            setMinimumHeight(i13);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f919h != z10) {
            this.f919h = z10;
            if (!z10 && m922b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
