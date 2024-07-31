package com.yalantis.ucrop.view.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.Locale;
import p187n.C3623c0;
import p242qc.C4226b;
import p242qc.C4227c;
import p242qc.C4233i;
import p345y.C5782a;
import sc.C4565a;

/* loaded from: classes2.dex */
public class AspectRatioTextView extends C3623c0 {

    /* renamed from: n */
    public final float f5470n;

    /* renamed from: o */
    public final Rect f5471o;

    /* renamed from: p */
    public Paint f5472p;

    /* renamed from: q */
    public int f5473q;

    /* renamed from: r */
    public float f5474r;

    /* renamed from: s */
    public String f5475s;

    /* renamed from: t */
    public float f5476t;

    /* renamed from: u */
    public float f5477u;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5470n = 1.5f;
        this.f5471o = new Rect();
        m6094h(context.obtainStyledAttributes(attributeSet, C4233i.f15295U));
    }

    /* renamed from: f */
    public final void m6092f(int i10) {
        Paint paint = this.f5472p;
        if (paint != null) {
            paint.setColor(i10);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_selected}, new int[]{0}}, new int[]{i10, C5782a.getColor(getContext(), C4226b.f15224k)}));
    }

    /* renamed from: g */
    public float m6093g(boolean z10) {
        if (z10) {
            m6096j();
            m6095i();
        }
        return this.f5474r;
    }

    /* renamed from: h */
    public final void m6094h(TypedArray typedArray) {
        setGravity(1);
        this.f5475s = typedArray.getString(C4233i.f15296V);
        this.f5476t = typedArray.getFloat(C4233i.f15297W, 0.0f);
        float f10 = typedArray.getFloat(C4233i.f15298X, 0.0f);
        this.f5477u = f10;
        float f11 = this.f5476t;
        if (f11 == 0.0f || f10 == 0.0f) {
            this.f5474r = 0.0f;
        } else {
            this.f5474r = f11 / f10;
        }
        this.f5473q = getContext().getResources().getDimensionPixelSize(C4227c.f15234h);
        Paint paint = new Paint(1);
        this.f5472p = paint;
        paint.setStyle(Paint.Style.FILL);
        m6095i();
        m6092f(getResources().getColor(C4226b.f15225l));
        typedArray.recycle();
    }

    /* renamed from: i */
    public final void m6095i() {
        setText(!TextUtils.isEmpty(this.f5475s) ? this.f5475s : String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.f5476t), Integer.valueOf((int) this.f5477u)));
    }

    /* renamed from: j */
    public final void m6096j() {
        if (this.f5474r != 0.0f) {
            float f10 = this.f5476t;
            float f11 = this.f5477u;
            this.f5476t = f11;
            this.f5477u = f10;
            this.f5474r = f11 / f10;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f5471o);
            Rect rect = this.f5471o;
            float f10 = (rect.right - rect.left) / 2.0f;
            float f11 = rect.bottom - (rect.top / 2.0f);
            int i10 = this.f5473q;
            canvas.drawCircle(f10, f11 - (i10 * 1.5f), i10 / 2.0f, this.f5472p);
        }
    }

    public void setActiveColor(int i10) {
        m6092f(i10);
        invalidate();
    }

    public void setAspectRatio(C4565a c4565a) {
        this.f5475s = c4565a.m18061a();
        this.f5476t = c4565a.m18062b();
        float m18063d = c4565a.m18063d();
        this.f5477u = m18063d;
        float f10 = this.f5476t;
        if (f10 == 0.0f || m18063d == 0.0f) {
            this.f5474r = 0.0f;
        } else {
            this.f5474r = f10 / m18063d;
        }
        m6095i();
    }
}
