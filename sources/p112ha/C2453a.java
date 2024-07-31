package p112ha;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p345y.C5782a;
import p370z9.C6093a;

/* renamed from: ha.a */
/* loaded from: classes.dex */
public class C2453a extends Drawable {

    /* renamed from: a */
    public final Drawable f9844a;

    /* renamed from: b */
    public final Drawable f9845b;

    /* renamed from: c */
    public int f9846c = -1;

    public C2453a(Context context) {
        this.f9845b = C5782a.getDrawable(context, C6093a.f22619a);
        this.f9844a = C5782a.getDrawable(context, C6093a.f22620b);
    }

    /* renamed from: a */
    public void m9811a(int i10) {
        this.f9846c = i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f9845b.draw(canvas);
        canvas.drawColor(this.f9846c, PorterDuff.Mode.SRC_IN);
        this.f9844a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f9845b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f9845b.setBounds(i10, i11, i12, i13);
        this.f9844a.setBounds(i10, i11, i12, i13);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.f9845b.setBounds(rect);
        this.f9844a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }
}
