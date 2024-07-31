package com.yalantis.ucrop.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import p297uc.C5010h;
import vc.C5161a;

/* loaded from: classes2.dex */
public class GestureCropImageView extends C5161a {

    /* renamed from: N */
    public ScaleGestureDetector f5426N;

    /* renamed from: O */
    public C5010h f5427O;

    /* renamed from: P */
    public GestureDetector f5428P;

    /* renamed from: Q */
    public float f5429Q;

    /* renamed from: R */
    public float f5430R;

    /* renamed from: S */
    public boolean f5431S;

    /* renamed from: T */
    public boolean f5432T;

    /* renamed from: U */
    public boolean f5433U;

    /* renamed from: V */
    public int f5434V;

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$b */
    /* loaded from: classes2.dex */
    public class C1500b extends GestureDetector.SimpleOnGestureListener {
        public C1500b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            GestureCropImageView gestureCropImageView = GestureCropImageView.this;
            gestureCropImageView.m20891D(gestureCropImageView.getDoubleTapTargetScale(), motionEvent.getX(), motionEvent.getY(), 200L);
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            GestureCropImageView.this.m20915o(-f10, -f11);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$c */
    /* loaded from: classes2.dex */
    public class C1501c extends C5010h.b {
        public C1501c() {
        }

        @Override // p297uc.C5010h.a
        /* renamed from: a */
        public boolean mo6076a(C5010h c5010h) {
            GestureCropImageView.this.m20914m(c5010h.m19646c(), GestureCropImageView.this.f5429Q, GestureCropImageView.this.f5430R);
            return true;
        }
    }

    /* renamed from: com.yalantis.ucrop.view.GestureCropImageView$d */
    /* loaded from: classes2.dex */
    public class C1502d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C1502d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            GestureCropImageView.this.mo20897n(scaleGestureDetector.getScaleFactor(), GestureCropImageView.this.f5429Q, GestureCropImageView.this.f5430R);
            return true;
        }
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureCropImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5431S = true;
        this.f5432T = true;
        this.f5433U = true;
        this.f5434V = 5;
    }

    /* renamed from: K */
    public final void m6074K() {
        this.f5428P = new GestureDetector(getContext(), new C1500b(), null, true);
        this.f5426N = new ScaleGestureDetector(getContext(), new C1502d());
        this.f5427O = new C5010h(new C1501c());
    }

    public int getDoubleTapScaleSteps() {
        return this.f5434V;
    }

    public float getDoubleTapTargetScale() {
        return getCurrentScale() * ((float) Math.pow(getMaxScale() / getMinScale(), 1.0f / this.f5434V));
    }

    @Override // vc.C5162b
    /* renamed from: k */
    public void mo6075k() {
        super.mo6075k();
        m6074K();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() & 255) == 0) {
            m20901v();
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f5429Q = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
            this.f5430R = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
        }
        if (this.f5433U) {
            this.f5428P.onTouchEvent(motionEvent);
        }
        if (this.f5432T) {
            this.f5426N.onTouchEvent(motionEvent);
        }
        if (this.f5431S) {
            this.f5427O.m19647d(motionEvent);
        }
        if ((motionEvent.getAction() & 255) == 1) {
            m20889B();
        }
        return true;
    }

    public void setDoubleTapScaleSteps(int i10) {
        this.f5434V = i10;
    }

    public void setGestureEnabled(boolean z10) {
        this.f5433U = z10;
    }

    public void setRotateEnabled(boolean z10) {
        this.f5431S = z10;
    }

    public void setScaleEnabled(boolean z10) {
        this.f5432T = z10;
    }
}
