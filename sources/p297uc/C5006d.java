package p297uc;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: uc.d */
/* loaded from: classes2.dex */
public class C5006d extends Drawable {

    /* renamed from: b */
    public Bitmap f18724b;

    /* renamed from: d */
    public int f18726d;

    /* renamed from: e */
    public int f18727e;

    /* renamed from: a */
    public final Paint f18723a = new Paint(2);

    /* renamed from: c */
    public int f18725c = 255;

    public C5006d(Bitmap bitmap) {
        m19618b(bitmap);
    }

    /* renamed from: a */
    public Bitmap m19617a() {
        return this.f18724b;
    }

    /* renamed from: b */
    public void m19618b(Bitmap bitmap) {
        this.f18724b = bitmap;
        if (bitmap != null) {
            this.f18726d = bitmap.getWidth();
            this.f18727e = this.f18724b.getHeight();
        } else {
            this.f18727e = 0;
            this.f18726d = 0;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f18724b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.f18724b, (Rect) null, getBounds(), this.f18723a);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f18725c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18727e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18726d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f18727e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f18726d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f18725c = i10;
        this.f18723a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18723a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f18723a.setFilterBitmap(z10);
    }
}
