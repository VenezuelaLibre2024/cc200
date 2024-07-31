package p187n;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p089g.C1931a;

/* renamed from: n.v */
/* loaded from: classes.dex */
public class C3664v extends RatingBar {

    /* renamed from: h */
    public final C3660t f13043h;

    public C3664v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7322G);
    }

    public C3664v(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C3657r0.m13693a(this, getContext());
        C3660t c3660t = new C3660t(this);
        this.f13043h = c3660t;
        c3660t.mo13703c(attributeSet, i10);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Bitmap m13702b = this.f13043h.m13702b();
        if (m13702b != null) {
            setMeasuredDimension(View.resolveSizeAndState(m13702b.getWidth() * getNumStars(), i10, 0), getMeasuredHeight());
        }
    }
}
