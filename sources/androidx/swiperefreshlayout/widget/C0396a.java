package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import p148k0.C3308b0;
import p302v1.C5100a;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* loaded from: classes.dex */
public class C0396a extends ImageView {

    /* renamed from: h */
    public Animation.AnimationListener f1888h;

    /* renamed from: i */
    public int f1889i;

    /* renamed from: j */
    public int f1890j;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* loaded from: classes.dex */
    public static class a extends OvalShape {

        /* renamed from: h */
        public Paint f1891h = new Paint();

        /* renamed from: i */
        public int f1892i;

        /* renamed from: j */
        public C0396a f1893j;

        public a(C0396a c0396a, int i10) {
            this.f1893j = c0396a;
            this.f1892i = i10;
            m2001b((int) rect().width());
        }

        /* renamed from: b */
        public final void m2001b(int i10) {
            float f10 = i10 / 2;
            this.f1891h.setShader(new RadialGradient(f10, f10, this.f1892i, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f1893j.getWidth() / 2;
            float height = this.f1893j.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f1891h);
            canvas.drawCircle(width, height, r0 - this.f1892i, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            m2001b((int) f10);
        }
    }

    public C0396a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i10 = (int) (1.75f * f10);
        int i11 = (int) (0.0f * f10);
        this.f1889i = (int) (3.5f * f10);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C5100a.f19248f);
        this.f1890j = obtainStyledAttributes.getColor(C5100a.f19249g, -328966);
        obtainStyledAttributes.recycle();
        if (m1999a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C3308b0.m12020d0(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.f1889i));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f1889i, i11, i10, 503316480);
            int i12 = this.f1889i;
            setPadding(i12, i12, i12, i12);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f1890j);
        C3308b0.m12012Z(this, shapeDrawable);
    }

    /* renamed from: a */
    public final boolean m1999a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void m2000b(Animation.AnimationListener animationListener) {
        this.f1888h = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f1888h;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f1888h;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (m1999a()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth() + (this.f1889i * 2), getMeasuredHeight() + (this.f1889i * 2));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
            this.f1890j = i10;
        }
    }
}
