package com.journeyapps.barcodescanner;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.C1392a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ma.C3602k;
import ma.C3606o;
import p113hb.C2473r;
import p113hb.C2474s;
import p113hb.C2476u;
import p113hb.InterfaceC2472q;
import p130ib.AbstractC2702q;
import p130ib.C2692g;
import p130ib.C2694i;
import p130ib.C2695j;
import p130ib.C2697l;
import p130ib.C2698m;
import p130ib.C2699n;
import p130ib.C2700o;

/* renamed from: com.journeyapps.barcodescanner.a */
/* loaded from: classes.dex */
public class C1392a extends ViewGroup {

    /* renamed from: H */
    public static final String f5260H = C1392a.class.getSimpleName();

    /* renamed from: A */
    public double f5261A;

    /* renamed from: B */
    public AbstractC2702q f5262B;

    /* renamed from: C */
    public boolean f5263C;

    /* renamed from: D */
    public final SurfaceHolder.Callback f5264D;

    /* renamed from: E */
    public final Handler.Callback f5265E;

    /* renamed from: F */
    public InterfaceC2472q f5266F;

    /* renamed from: G */
    public final f f5267G;

    /* renamed from: h */
    public C2692g f5268h;

    /* renamed from: i */
    public WindowManager f5269i;

    /* renamed from: j */
    public Handler f5270j;

    /* renamed from: k */
    public boolean f5271k;

    /* renamed from: l */
    public SurfaceView f5272l;

    /* renamed from: m */
    public TextureView f5273m;

    /* renamed from: n */
    public boolean f5274n;

    /* renamed from: o */
    public C2473r f5275o;

    /* renamed from: p */
    public int f5276p;

    /* renamed from: q */
    public List<f> f5277q;

    /* renamed from: r */
    public C2698m f5278r;

    /* renamed from: s */
    public C2694i f5279s;

    /* renamed from: t */
    public C2474s f5280t;

    /* renamed from: u */
    public C2474s f5281u;

    /* renamed from: v */
    public Rect f5282v;

    /* renamed from: w */
    public C2474s f5283w;

    /* renamed from: x */
    public Rect f5284x;

    /* renamed from: y */
    public Rect f5285y;

    /* renamed from: z */
    public C2474s f5286z;

    /* renamed from: com.journeyapps.barcodescanner.a$a */
    /* loaded from: classes.dex */
    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C1392a.this.f5283w = new C2474s(i10, i11);
            C1392a.this.m5902C();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$b */
    /* loaded from: classes.dex */
    public class b implements SurfaceHolder.Callback {
        public b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            if (surfaceHolder == null) {
                Log.e(C1392a.f5260H, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            C1392a.this.f5283w = new C2474s(i11, i12);
            C1392a.this.m5902C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C1392a.this.f5283w = null;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$c */
    /* loaded from: classes.dex */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == C3602k.f12694j) {
                C1392a.this.m5917w((C2474s) message.obj);
                return true;
            }
            if (i10 != C3602k.f12688d) {
                if (i10 != C3602k.f12687c) {
                    return false;
                }
                C1392a.this.f5267G.mo5890d();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!C1392a.this.m5913r()) {
                return false;
            }
            C1392a.this.mo5868u();
            C1392a.this.f5267G.mo5888b(exc);
            return false;
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$d */
    /* loaded from: classes.dex */
    public class d implements InterfaceC2472q {
        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m5921c() {
            C1392a.this.m5919z();
        }

        @Override // p113hb.InterfaceC2472q
        /* renamed from: a */
        public void mo5922a(int i10) {
            C1392a.this.f5270j.postDelayed(new Runnable() { // from class: hb.c
                @Override // java.lang.Runnable
                public final void run() {
                    C1392a.d.this.m5921c();
                }
            }, 250L);
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$e */
    /* loaded from: classes.dex */
    public class e implements f {
        public e() {
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: a */
        public void mo5887a() {
            Iterator it = C1392a.this.f5277q.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo5887a();
            }
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: b */
        public void mo5888b(Exception exc) {
            Iterator it = C1392a.this.f5277q.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo5888b(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: c */
        public void mo5889c() {
            Iterator it = C1392a.this.f5277q.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo5889c();
            }
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: d */
        public void mo5890d() {
            Iterator it = C1392a.this.f5277q.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo5890d();
            }
        }

        @Override // com.journeyapps.barcodescanner.C1392a.f
        /* renamed from: e */
        public void mo5891e() {
            Iterator it = C1392a.this.f5277q.iterator();
            while (it.hasNext()) {
                ((f) it.next()).mo5891e();
            }
        }
    }

    /* renamed from: com.journeyapps.barcodescanner.a$f */
    /* loaded from: classes.dex */
    public interface f {
        /* renamed from: a */
        void mo5887a();

        /* renamed from: b */
        void mo5888b(Exception exc);

        /* renamed from: c */
        void mo5889c();

        /* renamed from: d */
        void mo5890d();

        /* renamed from: e */
        void mo5891e();
    }

    public C1392a(Context context) {
        super(context);
        this.f5271k = false;
        this.f5274n = false;
        this.f5276p = -1;
        this.f5277q = new ArrayList();
        this.f5279s = new C2694i();
        this.f5284x = null;
        this.f5285y = null;
        this.f5286z = null;
        this.f5261A = 0.1d;
        this.f5262B = null;
        this.f5263C = false;
        this.f5264D = new b();
        this.f5265E = new c();
        this.f5266F = new d();
        this.f5267G = new e();
        m5911p(context, null, 0, 0);
    }

    public C1392a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5271k = false;
        this.f5274n = false;
        this.f5276p = -1;
        this.f5277q = new ArrayList();
        this.f5279s = new C2694i();
        this.f5284x = null;
        this.f5285y = null;
        this.f5286z = null;
        this.f5261A = 0.1d;
        this.f5262B = null;
        this.f5263C = false;
        this.f5264D = new b();
        this.f5265E = new c();
        this.f5266F = new d();
        this.f5267G = new e();
        m5911p(context, attributeSet, 0, 0);
    }

    private int getDisplayRotation() {
        return this.f5269i.getDefaultDisplay().getRotation();
    }

    /* renamed from: A */
    public final void m5900A() {
        View view;
        if (this.f5271k) {
            TextureView textureView = new TextureView(getContext());
            this.f5273m = textureView;
            textureView.setSurfaceTextureListener(m5903D());
            view = this.f5273m;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f5272l = surfaceView;
            surfaceView.getHolder().addCallback(this.f5264D);
            view = this.f5272l;
        }
        addView(view);
    }

    /* renamed from: B */
    public final void m5901B(C2695j c2695j) {
        if (this.f5274n || this.f5268h == null) {
            return;
        }
        Log.i(f5260H, "Starting preview");
        this.f5268h.m10964z(c2695j);
        this.f5268h.m10951B();
        this.f5274n = true;
        mo5869x();
        this.f5267G.mo5891e();
    }

    /* renamed from: C */
    public final void m5902C() {
        Rect rect;
        C2695j c2695j;
        C2474s c2474s = this.f5283w;
        if (c2474s == null || this.f5281u == null || (rect = this.f5282v) == null) {
            return;
        }
        if (this.f5272l == null || !c2474s.equals(new C2474s(rect.width(), this.f5282v.height()))) {
            TextureView textureView = this.f5273m;
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                return;
            }
            if (this.f5281u != null) {
                this.f5273m.setTransform(m5907l(new C2474s(this.f5273m.getWidth(), this.f5273m.getHeight()), this.f5281u));
            }
            c2695j = new C2695j(this.f5273m.getSurfaceTexture());
        } else {
            c2695j = new C2695j(this.f5272l.getHolder());
        }
        m5901B(c2695j);
    }

    @TargetApi(14)
    /* renamed from: D */
    public final TextureView.SurfaceTextureListener m5903D() {
        return new a();
    }

    public C2692g getCameraInstance() {
        return this.f5268h;
    }

    public C2694i getCameraSettings() {
        return this.f5279s;
    }

    public Rect getFramingRect() {
        return this.f5284x;
    }

    public C2474s getFramingRectSize() {
        return this.f5286z;
    }

    public double getMarginFraction() {
        return this.f5261A;
    }

    public Rect getPreviewFramingRect() {
        return this.f5285y;
    }

    public AbstractC2702q getPreviewScalingStrategy() {
        AbstractC2702q abstractC2702q = this.f5262B;
        return abstractC2702q != null ? abstractC2702q : this.f5273m != null ? new C2697l() : new C2699n();
    }

    public C2474s getPreviewSize() {
        return this.f5281u;
    }

    /* renamed from: i */
    public void m5904i(f fVar) {
        this.f5277q.add(fVar);
    }

    /* renamed from: j */
    public final void m5905j() {
        C2474s c2474s;
        C2698m c2698m;
        C2474s c2474s2 = this.f5280t;
        if (c2474s2 == null || (c2474s = this.f5281u) == null || (c2698m = this.f5278r) == null) {
            this.f5285y = null;
            this.f5284x = null;
            this.f5282v = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i10 = c2474s.f9897h;
        int i11 = c2474s.f9898i;
        int i12 = c2474s2.f9897h;
        int i13 = c2474s2.f9898i;
        Rect m11012d = c2698m.m11012d(c2474s);
        if (m11012d.width() <= 0 || m11012d.height() <= 0) {
            return;
        }
        this.f5282v = m11012d;
        this.f5284x = mo5906k(new Rect(0, 0, i12, i13), this.f5282v);
        Rect rect = new Rect(this.f5284x);
        Rect rect2 = this.f5282v;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i10) / this.f5282v.width(), (rect.top * i11) / this.f5282v.height(), (rect.right * i10) / this.f5282v.width(), (rect.bottom * i11) / this.f5282v.height());
        this.f5285y = rect3;
        if (rect3.width() > 0 && this.f5285y.height() > 0) {
            this.f5267G.mo5887a();
            return;
        }
        this.f5285y = null;
        this.f5284x = null;
        Log.w(f5260H, "Preview frame is too small");
    }

    /* renamed from: k */
    public Rect mo5906k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f5286z != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f5286z.f9897h) / 2), Math.max(0, (rect3.height() - this.f5286z.f9898i) / 2));
            return rect3;
        }
        int min = (int) Math.min(rect3.width() * this.f5261A, rect3.height() * this.f5261A);
        rect3.inset(min, min);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    /* renamed from: l */
    public Matrix m5907l(C2474s c2474s, C2474s c2474s2) {
        float f10;
        float f11 = c2474s.f9897h / c2474s.f9898i;
        float f12 = c2474s2.f9897h / c2474s2.f9898i;
        float f13 = 1.0f;
        if (f11 < f12) {
            float f14 = f12 / f11;
            f10 = 1.0f;
            f13 = f14;
        } else {
            f10 = f11 / f12;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f13, f10);
        int i10 = c2474s.f9897h;
        int i11 = c2474s.f9898i;
        matrix.postTranslate((i10 - (i10 * f13)) / 2.0f, (i11 - (i11 * f10)) / 2.0f);
        return matrix;
    }

    /* renamed from: m */
    public final void m5908m(C2474s c2474s) {
        this.f5280t = c2474s;
        C2692g c2692g = this.f5268h;
        if (c2692g == null || c2692g.m10955n() != null) {
            return;
        }
        C2698m c2698m = new C2698m(getDisplayRotation(), c2474s);
        this.f5278r = c2698m;
        c2698m.m11013e(getPreviewScalingStrategy());
        this.f5268h.m10962x(this.f5278r);
        this.f5268h.m10954m();
        boolean z10 = this.f5263C;
        if (z10) {
            this.f5268h.m10950A(z10);
        }
    }

    /* renamed from: n */
    public C2692g m5909n() {
        C2692g c2692g = new C2692g(getContext());
        c2692g.m10961w(this.f5279s);
        return c2692g;
    }

    /* renamed from: o */
    public final void m5910o() {
        if (this.f5268h != null) {
            Log.w(f5260H, "initCamera called twice");
            return;
        }
        C2692g m5909n = m5909n();
        this.f5268h = m5909n;
        m5909n.m10963y(this.f5270j);
        this.f5268h.m10959u();
        this.f5276p = getDisplayRotation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m5900A();
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m5908m(new C2474s(i12 - i10, i13 - i11));
        SurfaceView surfaceView = this.f5272l;
        if (surfaceView == null) {
            TextureView textureView = this.f5273m;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
                return;
            }
            return;
        }
        Rect rect = this.f5282v;
        if (rect == null) {
            surfaceView.layout(0, 0, getWidth(), getHeight());
        } else {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f5263C);
        return bundle;
    }

    /* renamed from: p */
    public final void m5911p(Context context, AttributeSet attributeSet, int i10, int i11) {
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        m5912q(attributeSet);
        this.f5269i = (WindowManager) context.getSystemService("window");
        this.f5270j = new Handler(this.f5265E);
        this.f5275o = new C2473r();
    }

    /* renamed from: q */
    public void m5912q(AttributeSet attributeSet) {
        AbstractC2702q c2700o;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C3606o.f12711i);
        int dimension = (int) obtainStyledAttributes.getDimension(C3606o.f12713k, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(C3606o.f12712j, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f5286z = new C2474s(dimension, dimension2);
        }
        this.f5271k = obtainStyledAttributes.getBoolean(C3606o.f12715m, true);
        int integer = obtainStyledAttributes.getInteger(C3606o.f12714l, -1);
        if (integer == 1) {
            c2700o = new C2697l();
        } else {
            if (integer != 2) {
                if (integer == 3) {
                    c2700o = new C2700o();
                }
                obtainStyledAttributes.recycle();
            }
            c2700o = new C2699n();
        }
        this.f5262B = c2700o;
        obtainStyledAttributes.recycle();
    }

    /* renamed from: r */
    public boolean m5913r() {
        return this.f5268h != null;
    }

    /* renamed from: s */
    public boolean m5914s() {
        C2692g c2692g = this.f5268h;
        return c2692g == null || c2692g.m10957p();
    }

    public void setCameraSettings(C2694i c2694i) {
        this.f5279s = c2694i;
    }

    public void setFramingRectSize(C2474s c2474s) {
        this.f5286z = c2474s;
    }

    public void setMarginFraction(double d10) {
        if (d10 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f5261A = d10;
    }

    public void setPreviewScalingStrategy(AbstractC2702q abstractC2702q) {
        this.f5262B = abstractC2702q;
    }

    public void setTorch(boolean z10) {
        this.f5263C = z10;
        C2692g c2692g = this.f5268h;
        if (c2692g != null) {
            c2692g.m10950A(z10);
        }
    }

    public void setUseTextureView(boolean z10) {
        this.f5271k = z10;
    }

    /* renamed from: t */
    public boolean m5915t() {
        return this.f5274n;
    }

    /* renamed from: u */
    public void mo5868u() {
        TextureView textureView;
        SurfaceView surfaceView;
        C2476u.m9873a();
        Log.d(f5260H, "pause()");
        this.f5276p = -1;
        C2692g c2692g = this.f5268h;
        if (c2692g != null) {
            c2692g.m10953l();
            this.f5268h = null;
            this.f5274n = false;
        } else {
            this.f5270j.sendEmptyMessage(C3602k.f12687c);
        }
        if (this.f5283w == null && (surfaceView = this.f5272l) != null) {
            surfaceView.getHolder().removeCallback(this.f5264D);
        }
        if (this.f5283w == null && (textureView = this.f5273m) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f5280t = null;
        this.f5281u = null;
        this.f5285y = null;
        this.f5275o.m9862f();
        this.f5267G.mo5889c();
    }

    /* renamed from: v */
    public void m5916v() {
        C2692g cameraInstance = getCameraInstance();
        mo5868u();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.m10957p() && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    /* renamed from: w */
    public final void m5917w(C2474s c2474s) {
        this.f5281u = c2474s;
        if (this.f5280t != null) {
            m5905j();
            requestLayout();
            m5902C();
        }
    }

    /* renamed from: x */
    public void mo5869x() {
    }

    /* renamed from: y */
    public void m5918y() {
        C2476u.m9873a();
        Log.d(f5260H, "resume()");
        m5910o();
        if (this.f5283w != null) {
            m5902C();
        } else {
            SurfaceView surfaceView = this.f5272l;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f5264D);
            } else {
                TextureView textureView = this.f5273m;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        m5903D().onSurfaceTextureAvailable(this.f5273m.getSurfaceTexture(), this.f5273m.getWidth(), this.f5273m.getHeight());
                    } else {
                        this.f5273m.setSurfaceTextureListener(m5903D());
                    }
                }
            }
        }
        requestLayout();
        this.f5275o.m9861e(getContext(), this.f5266F);
    }

    /* renamed from: z */
    public final void m5919z() {
        if (!m5913r() || getDisplayRotation() == this.f5276p) {
            return;
        }
        mo5868u();
        m5918y();
    }
}
