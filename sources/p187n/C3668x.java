package p187n;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p089g.C1931a;

/* renamed from: n.x */
/* loaded from: classes.dex */
public class C3668x extends SeekBar {

    /* renamed from: h */
    public final C3670y f13048h;

    public C3668x(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1931a.f7324I);
    }

    public C3668x(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        C3657r0.m13693a(this, getContext());
        C3670y c3670y = new C3670y(this);
        this.f13048h = c3670y;
        c3670y.mo13703c(attributeSet, i10);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f13048h.m13739h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f13048h.m13740i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f13048h.m13738g(canvas);
    }
}
