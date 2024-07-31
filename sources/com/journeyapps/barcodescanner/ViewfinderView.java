package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.C1392a;
import java.util.ArrayList;
import java.util.List;
import ma.C3601j;
import ma.C3606o;
import p113hb.C2474s;
import p129ia.C2684p;

/* loaded from: classes.dex */
public class ViewfinderView extends View {

    /* renamed from: u */
    public static final String f5244u = ViewfinderView.class.getSimpleName();

    /* renamed from: v */
    public static final int[] f5245v = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: h */
    public final Paint f5246h;

    /* renamed from: i */
    public Bitmap f5247i;

    /* renamed from: j */
    public int f5248j;

    /* renamed from: k */
    public final int f5249k;

    /* renamed from: l */
    public final int f5250l;

    /* renamed from: m */
    public final int f5251m;

    /* renamed from: n */
    public boolean f5252n;

    /* renamed from: o */
    public int f5253o;

    /* renamed from: p */
    public List<C2684p> f5254p;

    /* renamed from: q */
    public List<C2684p> f5255q;

    /* renamed from: r */
    public C1392a f5256r;

    /* renamed from: s */
    public Rect f5257s;

    /* renamed from: t */
    public C2474s f5258t;

    /* renamed from: com.journeyapps.barcodescanner.ViewfinderView$a */
    /* loaded from: classes.dex */
    public class C1391a implements C1392a.f {
        public C1391a() {
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: a */
        public void mo5887a() {
            ViewfinderView.this.m5886b();
            ViewfinderView.this.invalidate();
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: b */
        public void mo5888b(Exception exc) {
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: c */
        public void mo5889c() {
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: d */
        public void mo5890d() {
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: e */
        public void mo5891e() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5246h = new Paint(1);
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3606o.f12716n);
        this.f5248j = obtainStyledAttributes.getColor(C3606o.f12721s, resources.getColor(C3601j.f12684d));
        this.f5249k = obtainStyledAttributes.getColor(C3606o.f12718p, resources.getColor(C3601j.f12682b));
        this.f5250l = obtainStyledAttributes.getColor(C3606o.f12719q, resources.getColor(C3601j.f12683c));
        this.f5251m = obtainStyledAttributes.getColor(C3606o.f12717o, resources.getColor(C3601j.f12681a));
        this.f5252n = obtainStyledAttributes.getBoolean(C3606o.f12720r, true);
        obtainStyledAttributes.recycle();
        this.f5253o = 0;
        this.f5254p = new ArrayList(20);
        this.f5255q = new ArrayList(20);
    }

    /* renamed from: a */
    public void m5885a(C2684p c2684p) {
        if (this.f5254p.size() < 20) {
            this.f5254p.add(c2684p);
        }
    }

    /* renamed from: b */
    public void m5886b() {
        C1392a c1392a = this.f5256r;
        if (c1392a == null) {
            return;
        }
        Rect framingRect = c1392a.getFramingRect();
        C2474s previewSize = this.f5256r.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f5257s = framingRect;
        this.f5258t = previewSize;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C2474s c2474s;
        m5886b();
        Rect rect = this.f5257s;
        if (rect == null || (c2474s = this.f5258t) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f5246h.setColor(this.f5247i != null ? this.f5249k : this.f5248j);
        float f10 = width;
        canvas.drawRect(0.0f, 0.0f, f10, rect.top, this.f5246h);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f5246h);
        canvas.drawRect(rect.right + 1, rect.top, f10, rect.bottom + 1, this.f5246h);
        canvas.drawRect(0.0f, rect.bottom + 1, f10, height, this.f5246h);
        if (this.f5247i != null) {
            this.f5246h.setAlpha(160);
            canvas.drawBitmap(this.f5247i, (Rect) null, rect, this.f5246h);
            return;
        }
        if (this.f5252n) {
            this.f5246h.setColor(this.f5250l);
            Paint paint = this.f5246h;
            int[] iArr = f5245v;
            paint.setAlpha(iArr[this.f5253o]);
            this.f5253o = (this.f5253o + 1) % iArr.length;
            int height2 = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, height2 - 1, rect.right - 1, height2 + 2, this.f5246h);
        }
        float width2 = getWidth() / c2474s.f9897h;
        float height3 = getHeight() / c2474s.f9898i;
        if (!this.f5255q.isEmpty()) {
            this.f5246h.setAlpha(80);
            this.f5246h.setColor(this.f5251m);
            for (C2684p c2684p : this.f5255q) {
                canvas.drawCircle((int) (c2684p.m10908c() * width2), (int) (c2684p.m10909d() * height3), 3.0f, this.f5246h);
            }
            this.f5255q.clear();
        }
        if (!this.f5254p.isEmpty()) {
            this.f5246h.setAlpha(160);
            this.f5246h.setColor(this.f5251m);
            for (C2684p c2684p2 : this.f5254p) {
                canvas.drawCircle((int) (c2684p2.m10908c() * width2), (int) (c2684p2.m10909d() * height3), 6.0f, this.f5246h);
            }
            List<C2684p> list = this.f5254p;
            List<C2684p> list2 = this.f5255q;
            this.f5254p = list2;
            this.f5255q = list;
            list2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(C1392a c1392a) {
        this.f5256r = c1392a;
        c1392a.m5904i(new C1391a());
    }

    public void setLaserVisibility(boolean z10) {
        this.f5252n = z10;
    }

    public void setMaskColor(int i10) {
        this.f5248j = i10;
    }
}
