package com.yalantis.ucrop.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p242qc.C4226b;
import p242qc.C4227c;
import p345y.C5782a;

/* loaded from: classes2.dex */
public class HorizontalProgressWheelView extends View {

    /* renamed from: h */
    public final Rect f5478h;

    /* renamed from: i */
    public InterfaceC1505a f5479i;

    /* renamed from: j */
    public float f5480j;

    /* renamed from: k */
    public Paint f5481k;

    /* renamed from: l */
    public Paint f5482l;

    /* renamed from: m */
    public int f5483m;

    /* renamed from: n */
    public int f5484n;

    /* renamed from: o */
    public int f5485o;

    /* renamed from: p */
    public boolean f5486p;

    /* renamed from: q */
    public float f5487q;

    /* renamed from: r */
    public int f5488r;

    /* renamed from: com.yalantis.ucrop.view.widget.HorizontalProgressWheelView$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1505a {
        /* renamed from: a */
        void mo6039a();

        /* renamed from: b */
        void mo6040b(float f10, float f11);

        /* renamed from: c */
        void mo6041c();
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalProgressWheelView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5478h = new Rect();
        m6097a();
    }

    /* renamed from: a */
    public final void m6097a() {
        this.f5488r = C5782a.getColor(getContext(), C4226b.f15226m);
        this.f5483m = getContext().getResources().getDimensionPixelSize(C4227c.f15235i);
        this.f5484n = getContext().getResources().getDimensionPixelSize(C4227c.f15232f);
        this.f5485o = getContext().getResources().getDimensionPixelSize(C4227c.f15233g);
        Paint paint = new Paint(1);
        this.f5481k = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f5481k.setStrokeWidth(this.f5483m);
        this.f5481k.setColor(getResources().getColor(C4226b.f15220g));
        Paint paint2 = new Paint(this.f5481k);
        this.f5482l = paint2;
        paint2.setColor(this.f5488r);
        this.f5482l.setStrokeCap(Paint.Cap.ROUND);
        this.f5482l.setStrokeWidth(getContext().getResources().getDimensionPixelSize(C4227c.f15236j));
    }

    /* renamed from: b */
    public final void m6098b(MotionEvent motionEvent, float f10) {
        this.f5487q -= f10;
        postInvalidate();
        this.f5480j = motionEvent.getX();
        InterfaceC1505a interfaceC1505a = this.f5479i;
        if (interfaceC1505a != null) {
            interfaceC1505a.mo6040b(-f10, this.f5487q);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Paint paint;
        float f10;
        super.onDraw(canvas);
        canvas.getClipBounds(this.f5478h);
        int width = this.f5478h.width() / (this.f5483m + this.f5485o);
        float f11 = this.f5487q % (r2 + r1);
        for (int i10 = 0; i10 < width; i10++) {
            int i11 = width / 4;
            if (i10 < i11) {
                paint = this.f5481k;
                f10 = i10;
            } else if (i10 > (width * 3) / 4) {
                paint = this.f5481k;
                f10 = width - i10;
            } else {
                this.f5481k.setAlpha(255);
                float f12 = -f11;
                Rect rect = this.f5478h;
                float f13 = rect.left + f12 + ((this.f5483m + this.f5485o) * i10);
                float centerY = rect.centerY() - (this.f5484n / 4.0f);
                Rect rect2 = this.f5478h;
                canvas.drawLine(f13, centerY, f12 + rect2.left + ((this.f5483m + this.f5485o) * i10), rect2.centerY() + (this.f5484n / 4.0f), this.f5481k);
            }
            paint.setAlpha((int) ((f10 / i11) * 255.0f));
            float f122 = -f11;
            Rect rect3 = this.f5478h;
            float f132 = rect3.left + f122 + ((this.f5483m + this.f5485o) * i10);
            float centerY2 = rect3.centerY() - (this.f5484n / 4.0f);
            Rect rect22 = this.f5478h;
            canvas.drawLine(f132, centerY2, f122 + rect22.left + ((this.f5483m + this.f5485o) * i10), rect22.centerY() + (this.f5484n / 4.0f), this.f5481k);
        }
        canvas.drawLine(this.f5478h.centerX(), this.f5478h.centerY() - (this.f5484n / 2.0f), this.f5478h.centerX(), (this.f5484n / 2.0f) + this.f5478h.centerY(), this.f5482l);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5480j = motionEvent.getX();
        } else if (action == 1) {
            InterfaceC1505a interfaceC1505a = this.f5479i;
            if (interfaceC1505a != null) {
                this.f5486p = false;
                interfaceC1505a.mo6039a();
            }
        } else if (action == 2) {
            float x10 = motionEvent.getX() - this.f5480j;
            if (x10 != 0.0f) {
                if (!this.f5486p) {
                    this.f5486p = true;
                    InterfaceC1505a interfaceC1505a2 = this.f5479i;
                    if (interfaceC1505a2 != null) {
                        interfaceC1505a2.mo6041c();
                    }
                }
                m6098b(motionEvent, x10);
            }
        }
        return true;
    }

    public void setMiddleLineColor(int i10) {
        this.f5488r = i10;
        this.f5482l.setColor(i10);
        invalidate();
    }

    public void setScrollingListener(InterfaceC1505a interfaceC1505a) {
        this.f5479i = interfaceC1505a;
    }
}
