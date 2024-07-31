package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p242qc.C4226b;
import p242qc.C4227c;
import p242qc.C4233i;
import p258rc.InterfaceC4343d;
import p297uc.C5009g;

/* loaded from: classes2.dex */
public class OverlayView extends View {

    /* renamed from: A */
    public int f5438A;

    /* renamed from: B */
    public float f5439B;

    /* renamed from: C */
    public float f5440C;

    /* renamed from: D */
    public int f5441D;

    /* renamed from: E */
    public int f5442E;

    /* renamed from: F */
    public int f5443F;

    /* renamed from: G */
    public int f5444G;

    /* renamed from: H */
    public InterfaceC4343d f5445H;

    /* renamed from: I */
    public boolean f5446I;

    /* renamed from: h */
    public final RectF f5447h;

    /* renamed from: i */
    public final RectF f5448i;

    /* renamed from: j */
    public int f5449j;

    /* renamed from: k */
    public int f5450k;

    /* renamed from: l */
    public float[] f5451l;

    /* renamed from: m */
    public float[] f5452m;

    /* renamed from: n */
    public int f5453n;

    /* renamed from: o */
    public int f5454o;

    /* renamed from: p */
    public float f5455p;

    /* renamed from: q */
    public float[] f5456q;

    /* renamed from: r */
    public boolean f5457r;

    /* renamed from: s */
    public boolean f5458s;

    /* renamed from: t */
    public boolean f5459t;

    /* renamed from: u */
    public int f5460u;

    /* renamed from: v */
    public Path f5461v;

    /* renamed from: w */
    public Paint f5462w;

    /* renamed from: x */
    public Paint f5463x;

    /* renamed from: y */
    public Paint f5464y;

    /* renamed from: z */
    public Paint f5465z;

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5447h = new RectF();
        this.f5448i = new RectF();
        this.f5456q = null;
        this.f5461v = new Path();
        this.f5462w = new Paint(1);
        this.f5463x = new Paint(1);
        this.f5464y = new Paint(1);
        this.f5465z = new Paint(1);
        this.f5438A = 0;
        this.f5439B = -1.0f;
        this.f5440C = -1.0f;
        this.f5441D = -1;
        this.f5442E = getResources().getDimensionPixelSize(C4227c.f15230d);
        this.f5443F = getResources().getDimensionPixelSize(C4227c.f15231e);
        this.f5444G = getResources().getDimensionPixelSize(C4227c.f15229c);
        m6080d();
    }

    /* renamed from: a */
    public void m6077a(Canvas canvas) {
        if (this.f5458s) {
            if (this.f5456q == null && !this.f5447h.isEmpty()) {
                this.f5456q = new float[(this.f5453n * 4) + (this.f5454o * 4)];
                int i10 = 0;
                for (int i11 = 0; i11 < this.f5453n; i11++) {
                    float[] fArr = this.f5456q;
                    int i12 = i10 + 1;
                    RectF rectF = this.f5447h;
                    fArr[i10] = rectF.left;
                    int i13 = i12 + 1;
                    float f10 = i11 + 1.0f;
                    float height = rectF.height() * (f10 / (this.f5453n + 1));
                    RectF rectF2 = this.f5447h;
                    fArr[i12] = height + rectF2.top;
                    float[] fArr2 = this.f5456q;
                    int i14 = i13 + 1;
                    fArr2[i13] = rectF2.right;
                    i10 = i14 + 1;
                    fArr2[i14] = (rectF2.height() * (f10 / (this.f5453n + 1))) + this.f5447h.top;
                }
                for (int i15 = 0; i15 < this.f5454o; i15++) {
                    float[] fArr3 = this.f5456q;
                    int i16 = i10 + 1;
                    float f11 = i15 + 1.0f;
                    float width = this.f5447h.width() * (f11 / (this.f5454o + 1));
                    RectF rectF3 = this.f5447h;
                    fArr3[i10] = width + rectF3.left;
                    float[] fArr4 = this.f5456q;
                    int i17 = i16 + 1;
                    fArr4[i16] = rectF3.top;
                    int i18 = i17 + 1;
                    float width2 = rectF3.width() * (f11 / (this.f5454o + 1));
                    RectF rectF4 = this.f5447h;
                    fArr4[i17] = width2 + rectF4.left;
                    i10 = i18 + 1;
                    this.f5456q[i18] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.f5456q;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.f5463x);
            }
        }
        if (this.f5457r) {
            canvas.drawRect(this.f5447h, this.f5464y);
        }
        if (this.f5438A != 0) {
            canvas.save();
            this.f5448i.set(this.f5447h);
            this.f5448i.inset(this.f5444G, -r1);
            canvas.clipRect(this.f5448i, Region.Op.DIFFERENCE);
            this.f5448i.set(this.f5447h);
            this.f5448i.inset(-r1, this.f5444G);
            canvas.clipRect(this.f5448i, Region.Op.DIFFERENCE);
            canvas.drawRect(this.f5447h, this.f5465z);
            canvas.restore();
        }
    }

    /* renamed from: b */
    public void m6078b(Canvas canvas) {
        canvas.save();
        if (this.f5459t) {
            canvas.clipPath(this.f5461v, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.f5447h, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.f5460u);
        canvas.restore();
        if (this.f5459t) {
            canvas.drawCircle(this.f5447h.centerX(), this.f5447h.centerY(), Math.min(this.f5447h.width(), this.f5447h.height()) / 2.0f, this.f5462w);
        }
    }

    /* renamed from: c */
    public final int m6079c(float f10, float f11) {
        double d10 = this.f5442E;
        int i10 = -1;
        for (int i11 = 0; i11 < 8; i11 += 2) {
            double sqrt = Math.sqrt(Math.pow(f10 - this.f5451l[i11], 2.0d) + Math.pow(f11 - this.f5451l[i11 + 1], 2.0d));
            if (sqrt < d10) {
                i10 = i11 / 2;
                d10 = sqrt;
            }
        }
        if (this.f5438A == 1 && i10 < 0 && this.f5447h.contains(f10, f11)) {
            return 4;
        }
        return i10;
    }

    /* renamed from: d */
    public void m6080d() {
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* renamed from: e */
    public final void m6081e(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C4233i.f15310e0, getResources().getDimensionPixelSize(C4227c.f15227a));
        int color = typedArray.getColor(C4233i.f15308d0, getResources().getColor(C4226b.f15216c));
        this.f5464y.setStrokeWidth(dimensionPixelSize);
        this.f5464y.setColor(color);
        this.f5464y.setStyle(Paint.Style.STROKE);
        this.f5465z.setStrokeWidth(dimensionPixelSize * 3);
        this.f5465z.setColor(color);
        this.f5465z.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: f */
    public final void m6082f(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(C4233i.f15318i0, getResources().getDimensionPixelSize(C4227c.f15228b));
        int color = typedArray.getColor(C4233i.f15312f0, getResources().getColor(C4226b.f15217d));
        this.f5463x.setStrokeWidth(dimensionPixelSize);
        this.f5463x.setColor(color);
        this.f5453n = typedArray.getInt(C4233i.f15316h0, 2);
        this.f5454o = typedArray.getInt(C4233i.f15314g0, 2);
    }

    /* renamed from: g */
    public void m6083g(TypedArray typedArray) {
        this.f5459t = typedArray.getBoolean(C4233i.f15304b0, false);
        int color = typedArray.getColor(C4233i.f15306c0, getResources().getColor(C4226b.f15218e));
        this.f5460u = color;
        this.f5462w.setColor(color);
        this.f5462w.setStyle(Paint.Style.STROKE);
        this.f5462w.setStrokeWidth(1.0f);
        m6081e(typedArray);
        this.f5457r = typedArray.getBoolean(C4233i.f15320j0, true);
        m6082f(typedArray);
        this.f5458s = typedArray.getBoolean(C4233i.f15322k0, true);
    }

    public RectF getCropViewRect() {
        return this.f5447h;
    }

    public int getFreestyleCropMode() {
        return this.f5438A;
    }

    public InterfaceC4343d getOverlayViewChangeListener() {
        return this.f5445H;
    }

    /* renamed from: h */
    public void m6084h() {
        int i10 = this.f5449j;
        float f10 = this.f5455p;
        int i11 = (int) (i10 / f10);
        int i12 = this.f5450k;
        if (i11 > i12) {
            int i13 = (i10 - ((int) (i12 * f10))) / 2;
            this.f5447h.set(getPaddingLeft() + i13, getPaddingTop(), getPaddingLeft() + r1 + i13, getPaddingTop() + this.f5450k);
        } else {
            int i14 = (i12 - i11) / 2;
            this.f5447h.set(getPaddingLeft(), getPaddingTop() + i14, getPaddingLeft() + this.f5449j, getPaddingTop() + i11 + i14);
        }
        InterfaceC4343d interfaceC4343d = this.f5445H;
        if (interfaceC4343d != null) {
            interfaceC4343d.mo6091a(this.f5447h);
        }
        m6086j();
    }

    /* renamed from: i */
    public final void m6085i(float f10, float f11) {
        this.f5448i.set(this.f5447h);
        int i10 = this.f5441D;
        if (i10 == 0) {
            RectF rectF = this.f5448i;
            RectF rectF2 = this.f5447h;
            rectF.set(f10, f11, rectF2.right, rectF2.bottom);
        } else if (i10 == 1) {
            RectF rectF3 = this.f5448i;
            RectF rectF4 = this.f5447h;
            rectF3.set(rectF4.left, f11, f10, rectF4.bottom);
        } else if (i10 == 2) {
            RectF rectF5 = this.f5448i;
            RectF rectF6 = this.f5447h;
            rectF5.set(rectF6.left, rectF6.top, f10, f11);
        } else if (i10 == 3) {
            RectF rectF7 = this.f5448i;
            RectF rectF8 = this.f5447h;
            rectF7.set(f10, rectF8.top, rectF8.right, f11);
        } else if (i10 == 4) {
            this.f5448i.offset(f10 - this.f5439B, f11 - this.f5440C);
            if (this.f5448i.left <= getLeft() || this.f5448i.top <= getTop() || this.f5448i.right >= getRight() || this.f5448i.bottom >= getBottom()) {
                return;
            }
            this.f5447h.set(this.f5448i);
            m6086j();
            postInvalidate();
            return;
        }
        boolean z10 = this.f5448i.height() >= ((float) this.f5443F);
        boolean z11 = this.f5448i.width() >= ((float) this.f5443F);
        RectF rectF9 = this.f5447h;
        rectF9.set(z11 ? this.f5448i.left : rectF9.left, z10 ? this.f5448i.top : rectF9.top, z11 ? this.f5448i.right : rectF9.right, z10 ? this.f5448i.bottom : rectF9.bottom);
        if (z10 || z11) {
            m6086j();
            postInvalidate();
        }
    }

    /* renamed from: j */
    public final void m6086j() {
        this.f5451l = C5009g.m19641b(this.f5447h);
        this.f5452m = C5009g.m19640a(this.f5447h);
        this.f5456q = null;
        this.f5461v.reset();
        this.f5461v.addCircle(this.f5447h.centerX(), this.f5447h.centerY(), Math.min(this.f5447h.width(), this.f5447h.height()) / 2.0f, Path.Direction.CW);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m6078b(canvas);
        m6077a(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f5449j = width - paddingLeft;
            this.f5450k = height - paddingTop;
            if (this.f5446I) {
                this.f5446I = false;
                setTargetAspectRatio(this.f5455p);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5447h.isEmpty() && this.f5438A != 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int m6079c = m6079c(x10, y10);
                this.f5441D = m6079c;
                boolean z10 = m6079c != -1;
                if (!z10) {
                    this.f5439B = -1.0f;
                    this.f5440C = -1.0f;
                } else if (this.f5439B < 0.0f) {
                    this.f5439B = x10;
                    this.f5440C = y10;
                }
                return z10;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.f5441D != -1) {
                float min = Math.min(Math.max(x10, getPaddingLeft()), getWidth() - getPaddingRight());
                float min2 = Math.min(Math.max(y10, getPaddingTop()), getHeight() - getPaddingBottom());
                m6085i(min, min2);
                this.f5439B = min;
                this.f5440C = min2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.f5439B = -1.0f;
                this.f5440C = -1.0f;
                this.f5441D = -1;
                InterfaceC4343d interfaceC4343d = this.f5445H;
                if (interfaceC4343d != null) {
                    interfaceC4343d.mo6091a(this.f5447h);
                }
            }
        }
        return false;
    }

    public void setCircleDimmedLayer(boolean z10) {
        this.f5459t = z10;
    }

    public void setCropFrameColor(int i10) {
        this.f5464y.setColor(i10);
    }

    public void setCropFrameStrokeWidth(int i10) {
        this.f5464y.setStrokeWidth(i10);
    }

    public void setCropGridColor(int i10) {
        this.f5463x.setColor(i10);
    }

    public void setCropGridColumnCount(int i10) {
        this.f5454o = i10;
        this.f5456q = null;
    }

    public void setCropGridRowCount(int i10) {
        this.f5453n = i10;
        this.f5456q = null;
    }

    public void setCropGridStrokeWidth(int i10) {
        this.f5463x.setStrokeWidth(i10);
    }

    public void setDimmedColor(int i10) {
        this.f5460u = i10;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z10) {
        this.f5438A = z10 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i10) {
        this.f5438A = i10;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(InterfaceC4343d interfaceC4343d) {
        this.f5445H = interfaceC4343d;
    }

    public void setShowCropFrame(boolean z10) {
        this.f5457r = z10;
    }

    public void setShowCropGrid(boolean z10) {
        this.f5458s = z10;
    }

    public void setTargetAspectRatio(float f10) {
        this.f5455p = f10;
        if (this.f5449j <= 0) {
            this.f5446I = true;
        } else {
            m6084h();
            postInvalidate();
        }
    }
}
