package vc;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p242qc.C4233i;
import p258rc.InterfaceC4340a;
import p258rc.InterfaceC4342c;
import p297uc.C5004b;
import p297uc.C5009g;
import sc.C4566b;
import sc.C4568d;
import tc.AsyncTaskC4738a;
import vc.C5162b;

/* renamed from: vc.a */
/* loaded from: classes2.dex */
public class C5161a extends C5162b {

    /* renamed from: B */
    public final RectF f19451B;

    /* renamed from: C */
    public final Matrix f19452C;

    /* renamed from: D */
    public float f19453D;

    /* renamed from: E */
    public float f19454E;

    /* renamed from: F */
    public InterfaceC4342c f19455F;

    /* renamed from: G */
    public Runnable f19456G;

    /* renamed from: H */
    public Runnable f19457H;

    /* renamed from: I */
    public float f19458I;

    /* renamed from: J */
    public float f19459J;

    /* renamed from: K */
    public int f19460K;

    /* renamed from: L */
    public int f19461L;

    /* renamed from: M */
    public long f19462M;

    /* renamed from: vc.a$a */
    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: h */
        public final WeakReference<C5161a> f19463h;

        /* renamed from: i */
        public final long f19464i;

        /* renamed from: j */
        public final long f19465j = System.currentTimeMillis();

        /* renamed from: k */
        public final float f19466k;

        /* renamed from: l */
        public final float f19467l;

        /* renamed from: m */
        public final float f19468m;

        /* renamed from: n */
        public final float f19469n;

        /* renamed from: o */
        public final float f19470o;

        /* renamed from: p */
        public final float f19471p;

        /* renamed from: q */
        public final boolean f19472q;

        public a(C5161a c5161a, long j10, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10) {
            this.f19463h = new WeakReference<>(c5161a);
            this.f19464i = j10;
            this.f19466k = f10;
            this.f19467l = f11;
            this.f19468m = f12;
            this.f19469n = f13;
            this.f19470o = f14;
            this.f19471p = f15;
            this.f19472q = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5161a c5161a = this.f19463h.get();
            if (c5161a == null) {
                return;
            }
            float min = (float) Math.min(this.f19464i, System.currentTimeMillis() - this.f19465j);
            float m19613b = C5004b.m19613b(min, 0.0f, this.f19468m, (float) this.f19464i);
            float m19613b2 = C5004b.m19613b(min, 0.0f, this.f19469n, (float) this.f19464i);
            float m19612a = C5004b.m19612a(min, 0.0f, this.f19471p, (float) this.f19464i);
            if (min < ((float) this.f19464i)) {
                float[] fArr = c5161a.f19482l;
                c5161a.m20915o(m19613b - (fArr[0] - this.f19466k), m19613b2 - (fArr[1] - this.f19467l));
                if (!this.f19472q) {
                    c5161a.m20893F(this.f19470o + m19612a, c5161a.f19451B.centerX(), c5161a.f19451B.centerY());
                }
                if (c5161a.m20903x()) {
                    return;
                }
                c5161a.post(this);
            }
        }
    }

    /* renamed from: vc.a$b */
    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: h */
        public final WeakReference<C5161a> f19473h;

        /* renamed from: i */
        public final long f19474i;

        /* renamed from: j */
        public final long f19475j = System.currentTimeMillis();

        /* renamed from: k */
        public final float f19476k;

        /* renamed from: l */
        public final float f19477l;

        /* renamed from: m */
        public final float f19478m;

        /* renamed from: n */
        public final float f19479n;

        public b(C5161a c5161a, long j10, float f10, float f11, float f12, float f13) {
            this.f19473h = new WeakReference<>(c5161a);
            this.f19474i = j10;
            this.f19476k = f10;
            this.f19477l = f11;
            this.f19478m = f12;
            this.f19479n = f13;
        }

        @Override // java.lang.Runnable
        public void run() {
            C5161a c5161a = this.f19473h.get();
            if (c5161a == null) {
                return;
            }
            float min = (float) Math.min(this.f19474i, System.currentTimeMillis() - this.f19475j);
            float m19612a = C5004b.m19612a(min, 0.0f, this.f19477l, (float) this.f19474i);
            if (min >= ((float) this.f19474i)) {
                c5161a.m20889B();
            } else {
                c5161a.m20893F(this.f19476k + m19612a, this.f19478m, this.f19479n);
                c5161a.post(this);
            }
        }
    }

    public C5161a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5161a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19451B = new RectF();
        this.f19452C = new Matrix();
        this.f19454E = 10.0f;
        this.f19457H = null;
        this.f19460K = 0;
        this.f19461L = 0;
        this.f19462M = 500L;
    }

    /* renamed from: A */
    public void m20888A(TypedArray typedArray) {
        float abs = Math.abs(typedArray.getFloat(C4233i.f15300Z, 0.0f));
        float abs2 = Math.abs(typedArray.getFloat(C4233i.f15302a0, 0.0f));
        if (abs == 0.0f || abs2 == 0.0f) {
            this.f19453D = 0.0f;
        } else {
            this.f19453D = abs / abs2;
        }
    }

    /* renamed from: B */
    public void m20889B() {
        setImageToWrapCropBounds(true);
    }

    /* renamed from: C */
    public final void m20890C(float f10, float f11) {
        float width = this.f19451B.width();
        float height = this.f19451B.height();
        float max = Math.max(this.f19451B.width() / f10, this.f19451B.height() / f11);
        RectF rectF = this.f19451B;
        float f12 = ((width - (f10 * max)) / 2.0f) + rectF.left;
        float f13 = ((height - (f11 * max)) / 2.0f) + rectF.top;
        this.f19484n.reset();
        this.f19484n.postScale(max, max);
        this.f19484n.postTranslate(f12, f13);
        setImageMatrix(this.f19484n);
    }

    /* renamed from: D */
    public void m20891D(float f10, float f11, float f12, long j10) {
        if (f10 > getMaxScale()) {
            f10 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        b bVar = new b(this, j10, currentScale, f10 - currentScale, f11, f12);
        this.f19457H = bVar;
        post(bVar);
    }

    /* renamed from: E */
    public void m20892E(float f10) {
        m20893F(f10, this.f19451B.centerX(), this.f19451B.centerY());
    }

    /* renamed from: F */
    public void m20893F(float f10, float f11, float f12) {
        if (f10 <= getMaxScale()) {
            mo20897n(f10 / getCurrentScale(), f11, f12);
        }
    }

    /* renamed from: G */
    public void m20894G(float f10) {
        m20895H(f10, this.f19451B.centerX(), this.f19451B.centerY());
    }

    /* renamed from: H */
    public void m20895H(float f10, float f11, float f12) {
        if (f10 >= getMinScale()) {
            mo20897n(f10 / getCurrentScale(), f11, f12);
        }
    }

    public InterfaceC4342c getCropBoundsChangeListener() {
        return this.f19455F;
    }

    public float getMaxScale() {
        return this.f19458I;
    }

    public float getMinScale() {
        return this.f19459J;
    }

    public float getTargetAspectRatio() {
        return this.f19453D;
    }

    @Override // vc.C5162b
    /* renamed from: l */
    public void mo20896l() {
        super.mo20896l();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.f19453D == 0.0f) {
            this.f19453D = intrinsicWidth / intrinsicHeight;
        }
        int i10 = this.f19485o;
        float f10 = this.f19453D;
        int i11 = (int) (i10 / f10);
        int i12 = this.f19486p;
        if (i11 > i12) {
            this.f19451B.set((i10 - ((int) (i12 * f10))) / 2, 0.0f, r4 + r2, i12);
        } else {
            this.f19451B.set(0.0f, (i12 - i11) / 2, i10, i11 + r6);
        }
        m20900u(intrinsicWidth, intrinsicHeight);
        m20890C(intrinsicWidth, intrinsicHeight);
        InterfaceC4342c interfaceC4342c = this.f19455F;
        if (interfaceC4342c != null) {
            interfaceC4342c.mo6090a(this.f19453D);
        }
        C5162b.b bVar = this.f19487q;
        if (bVar != null) {
            bVar.mo6038d(getCurrentScale());
            this.f19487q.mo6035a(getCurrentAngle());
        }
    }

    @Override // vc.C5162b
    /* renamed from: n */
    public void mo20897n(float f10, float f11, float f12) {
        if ((f10 <= 1.0f || getCurrentScale() * f10 > getMaxScale()) && (f10 >= 1.0f || getCurrentScale() * f10 < getMinScale())) {
            return;
        }
        super.mo20897n(f10, f11, f12);
    }

    /* renamed from: s */
    public final float[] m20898s() {
        this.f19452C.reset();
        this.f19452C.setRotate(-getCurrentAngle());
        float[] fArr = this.f19481k;
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        float[] m19641b = C5009g.m19641b(this.f19451B);
        this.f19452C.mapPoints(copyOf);
        this.f19452C.mapPoints(m19641b);
        RectF m19643d = C5009g.m19643d(copyOf);
        RectF m19643d2 = C5009g.m19643d(m19641b);
        float f10 = m19643d.left - m19643d2.left;
        float f11 = m19643d.top - m19643d2.top;
        float f12 = m19643d.right - m19643d2.right;
        float f13 = m19643d.bottom - m19643d2.bottom;
        float[] fArr2 = new float[4];
        if (f10 <= 0.0f) {
            f10 = 0.0f;
        }
        fArr2[0] = f10;
        if (f11 <= 0.0f) {
            f11 = 0.0f;
        }
        fArr2[1] = f11;
        if (f12 >= 0.0f) {
            f12 = 0.0f;
        }
        fArr2[2] = f12;
        if (f13 >= 0.0f) {
            f13 = 0.0f;
        }
        fArr2[3] = f13;
        this.f19452C.reset();
        this.f19452C.setRotate(getCurrentAngle());
        this.f19452C.mapPoints(fArr2);
        return fArr2;
    }

    public void setCropBoundsChangeListener(InterfaceC4342c interfaceC4342c) {
        this.f19455F = interfaceC4342c;
    }

    public void setCropRect(RectF rectF) {
        this.f19453D = rectF.width() / rectF.height();
        this.f19451B.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        m20899t();
        m20889B();
    }

    public void setImageToWrapCropBounds(boolean z10) {
        float f10;
        float max;
        float f11;
        if (!this.f19491u || m20903x()) {
            return;
        }
        float[] fArr = this.f19482l;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float currentScale = getCurrentScale();
        float centerX = this.f19451B.centerX() - f12;
        float centerY = this.f19451B.centerY() - f13;
        this.f19452C.reset();
        this.f19452C.setTranslate(centerX, centerY);
        float[] fArr2 = this.f19481k;
        float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.f19452C.mapPoints(copyOf);
        boolean m20904y = m20904y(copyOf);
        if (m20904y) {
            float[] m20898s = m20898s();
            float f14 = -(m20898s[0] + m20898s[2]);
            f11 = -(m20898s[1] + m20898s[3]);
            f10 = f14;
            max = 0.0f;
        } else {
            RectF rectF = new RectF(this.f19451B);
            this.f19452C.reset();
            this.f19452C.setRotate(getCurrentAngle());
            this.f19452C.mapRect(rectF);
            float[] m19642c = C5009g.m19642c(this.f19481k);
            f10 = centerX;
            max = (Math.max(rectF.width() / m19642c[0], rectF.height() / m19642c[1]) * currentScale) - currentScale;
            f11 = centerY;
        }
        if (z10) {
            a aVar = new a(this, this.f19462M, f12, f13, f10, f11, currentScale, max, m20904y);
            this.f19456G = aVar;
            post(aVar);
        } else {
            m20915o(f10, f11);
            if (m20904y) {
                return;
            }
            m20893F(currentScale + max, this.f19451B.centerX(), this.f19451B.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j10) {
        if (j10 <= 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative value.");
        }
        this.f19462M = j10;
    }

    public void setMaxResultImageSizeX(int i10) {
        this.f19460K = i10;
    }

    public void setMaxResultImageSizeY(int i10) {
        this.f19461L = i10;
    }

    public void setMaxScaleMultiplier(float f10) {
        this.f19454E = f10;
    }

    public void setTargetAspectRatio(float f10) {
        if (getDrawable() == null) {
            this.f19453D = f10;
            return;
        }
        if (f10 == 0.0f) {
            f10 = r0.getIntrinsicWidth() / r0.getIntrinsicHeight();
        }
        this.f19453D = f10;
        InterfaceC4342c interfaceC4342c = this.f19455F;
        if (interfaceC4342c != null) {
            interfaceC4342c.mo6090a(this.f19453D);
        }
    }

    /* renamed from: t */
    public final void m20899t() {
        if (getDrawable() == null) {
            return;
        }
        m20900u(r0.getIntrinsicWidth(), r0.getIntrinsicHeight());
    }

    /* renamed from: u */
    public final void m20900u(float f10, float f11) {
        float min = Math.min(Math.min(this.f19451B.width() / f10, this.f19451B.width() / f11), Math.min(this.f19451B.height() / f11, this.f19451B.height() / f10));
        this.f19459J = min;
        this.f19458I = min * this.f19454E;
    }

    /* renamed from: v */
    public void m20901v() {
        removeCallbacks(this.f19456G);
        removeCallbacks(this.f19457H);
    }

    /* renamed from: w */
    public void m20902w(Bitmap.CompressFormat compressFormat, int i10, InterfaceC4340a interfaceC4340a) {
        m20901v();
        setImageToWrapCropBounds(false);
        C4568d c4568d = new C4568d(this.f19451B, C5009g.m19643d(this.f19481k), getCurrentScale(), getCurrentAngle());
        C4566b c4566b = new C4566b(this.f19460K, this.f19461L, compressFormat, i10, getImageInputPath(), getImageOutputPath(), getExifInfo());
        c4566b.m18075j(getImageInputUri());
        c4566b.m18076k(getImageOutputUri());
        new AsyncTaskC4738a(getContext(), getViewBitmap(), c4568d, c4566b, interfaceC4340a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: x */
    public boolean m20903x() {
        return m20904y(this.f19481k);
    }

    /* renamed from: y */
    public boolean m20904y(float[] fArr) {
        this.f19452C.reset();
        this.f19452C.setRotate(-getCurrentAngle());
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.f19452C.mapPoints(copyOf);
        float[] m19641b = C5009g.m19641b(this.f19451B);
        this.f19452C.mapPoints(m19641b);
        return C5009g.m19643d(copyOf).contains(C5009g.m19643d(m19641b));
    }

    /* renamed from: z */
    public void m20905z(float f10) {
        m20914m(f10, this.f19451B.centerX(), this.f19451B.centerY());
    }
}
