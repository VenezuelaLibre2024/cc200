package p112ha;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: ha.c */
/* loaded from: classes.dex */
public class C2455c extends TextView {

    /* renamed from: h */
    public int f9856h;

    /* renamed from: i */
    public int f9857i;

    public C2455c(Context context) {
        super(context);
        this.f9856h = 0;
        this.f9857i = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.f9857i / 2, this.f9856h / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int max = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f9856h = measuredWidth - measuredHeight;
            this.f9857i = 0;
        } else {
            this.f9856h = 0;
            this.f9857i = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(max, max);
    }
}
