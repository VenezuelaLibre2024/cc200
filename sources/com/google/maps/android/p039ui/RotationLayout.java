package com.google.maps.android.p039ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class RotationLayout extends FrameLayout {

    /* renamed from: h */
    public int f5224h;

    public RotationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        float height;
        int i10;
        int i11 = this.f5224h;
        if (i11 == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (i11 == 1) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f, getWidth() / 2, 0.0f);
            height = getHeight() / 2;
            i10 = getWidth();
        } else if (i11 == 2) {
            canvas.rotate(180.0f, getWidth() / 2, getHeight() / 2);
            super.dispatchDraw(canvas);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(270.0f, getWidth() / 2, 0.0f);
            height = getHeight() / 2;
            i10 = -getWidth();
        }
        canvas.translate(height, i10 / 2);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f5224h;
        if (i12 != 1 && i12 != 3) {
            super.onMeasure(i10, i11);
        } else {
            super.onMeasure(i10, i11);
            setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void setViewRotation(int i10) {
        this.f5224h = ((i10 + 360) % 360) / 90;
    }
}
