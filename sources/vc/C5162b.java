package vc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import p187n.C3654q;
import p258rc.InterfaceC4341b;
import p297uc.C5003a;
import p297uc.C5006d;
import p297uc.C5009g;
import sc.C4567c;

/* renamed from: vc.b */
/* loaded from: classes2.dex */
public class C5162b extends C3654q {

    /* renamed from: A */
    public C4567c f19480A;

    /* renamed from: k */
    public final float[] f19481k;

    /* renamed from: l */
    public final float[] f19482l;

    /* renamed from: m */
    public final float[] f19483m;

    /* renamed from: n */
    public Matrix f19484n;

    /* renamed from: o */
    public int f19485o;

    /* renamed from: p */
    public int f19486p;

    /* renamed from: q */
    public b f19487q;

    /* renamed from: r */
    public float[] f19488r;

    /* renamed from: s */
    public float[] f19489s;

    /* renamed from: t */
    public boolean f19490t;

    /* renamed from: u */
    public boolean f19491u;

    /* renamed from: v */
    public int f19492v;

    /* renamed from: w */
    public String f19493w;

    /* renamed from: x */
    public String f19494x;

    /* renamed from: y */
    public Uri f19495y;

    /* renamed from: z */
    public Uri f19496z;

    /* renamed from: vc.b$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC4341b {
        public a() {
        }

        @Override // p258rc.InterfaceC4341b
        /* renamed from: a */
        public void mo16629a(Bitmap bitmap, C4567c c4567c, Uri uri, Uri uri2) {
            C5162b.this.f19495y = uri;
            C5162b.this.f19496z = uri2;
            C5162b.this.f19493w = uri.getPath();
            C5162b.this.f19494x = uri2 != null ? uri2.getPath() : null;
            C5162b.this.f19480A = c4567c;
            C5162b c5162b = C5162b.this;
            c5162b.f19490t = true;
            c5162b.setImageBitmap(bitmap);
        }

        @Override // p258rc.InterfaceC4341b
        public void onFailure(Exception exc) {
            Log.e("TransformImageView", "onFailure: setImageUri", exc);
            b bVar = C5162b.this.f19487q;
            if (bVar != null) {
                bVar.mo6037c(exc);
            }
        }
    }

    /* renamed from: vc.b$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        void mo6035a(float f10);

        /* renamed from: b */
        void mo6036b();

        /* renamed from: c */
        void mo6037c(Exception exc);

        /* renamed from: d */
        void mo6038d(float f10);
    }

    public C5162b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C5162b(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19481k = new float[8];
        this.f19482l = new float[2];
        this.f19483m = new float[9];
        this.f19484n = new Matrix();
        this.f19490t = false;
        this.f19491u = false;
        this.f19492v = 0;
        mo6075k();
    }

    public float getCurrentAngle() {
        return m20911h(this.f19484n);
    }

    public float getCurrentScale() {
        return m20912i(this.f19484n);
    }

    public C4567c getExifInfo() {
        return this.f19480A;
    }

    public String getImageInputPath() {
        return this.f19493w;
    }

    public Uri getImageInputUri() {
        return this.f19495y;
    }

    public String getImageOutputPath() {
        return this.f19494x;
    }

    public Uri getImageOutputUri() {
        return this.f19496z;
    }

    public int getMaxBitmapSize() {
        if (this.f19492v <= 0) {
            this.f19492v = C5003a.m19604b(getContext());
        }
        return this.f19492v;
    }

    public Bitmap getViewBitmap() {
        if (getDrawable() == null || !(getDrawable() instanceof C5006d)) {
            return null;
        }
        return ((C5006d) getDrawable()).m19617a();
    }

    /* renamed from: h */
    public float m20911h(Matrix matrix) {
        return (float) (-(Math.atan2(m20913j(matrix, 1), m20913j(matrix, 0)) * 57.29577951308232d));
    }

    /* renamed from: i */
    public float m20912i(Matrix matrix) {
        return (float) Math.sqrt(Math.pow(m20913j(matrix, 0), 2.0d) + Math.pow(m20913j(matrix, 3), 2.0d));
    }

    /* renamed from: j */
    public float m20913j(Matrix matrix, int i10) {
        matrix.getValues(this.f19483m);
        return this.f19483m[i10];
    }

    /* renamed from: k */
    public void mo6075k() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* renamed from: l */
    public void mo20896l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        Log.d("TransformImageView", String.format("Image size: [%d:%d]", Integer.valueOf((int) intrinsicWidth), Integer.valueOf((int) intrinsicHeight)));
        RectF rectF = new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight);
        this.f19488r = C5009g.m19641b(rectF);
        this.f19489s = C5009g.m19640a(rectF);
        this.f19491u = true;
        b bVar = this.f19487q;
        if (bVar != null) {
            bVar.mo6036b();
        }
    }

    /* renamed from: m */
    public void m20914m(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f19484n.postRotate(f10, f11, f12);
            setImageMatrix(this.f19484n);
            b bVar = this.f19487q;
            if (bVar != null) {
                bVar.mo6035a(m20911h(this.f19484n));
            }
        }
    }

    /* renamed from: n */
    public void mo20897n(float f10, float f11, float f12) {
        if (f10 != 0.0f) {
            this.f19484n.postScale(f10, f10, f11, f12);
            setImageMatrix(this.f19484n);
            b bVar = this.f19487q;
            if (bVar != null) {
                bVar.mo6038d(m20912i(this.f19484n));
            }
        }
    }

    /* renamed from: o */
    public void m20915o(float f10, float f11) {
        if (f10 == 0.0f && f11 == 0.0f) {
            return;
        }
        this.f19484n.postTranslate(f10, f11);
        setImageMatrix(this.f19484n);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 || (this.f19490t && !this.f19491u)) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.f19485o = width - paddingLeft;
            this.f19486p = height - paddingTop;
            mo20896l();
        }
    }

    /* renamed from: p */
    public void m20916p(Uri uri, Uri uri2) {
        int maxBitmapSize = getMaxBitmapSize();
        C5003a.m19606d(getContext(), uri, uri2, maxBitmapSize, maxBitmapSize, new a());
    }

    /* renamed from: q */
    public final void m20917q() {
        this.f19484n.mapPoints(this.f19481k, this.f19488r);
        this.f19484n.mapPoints(this.f19482l, this.f19489s);
    }

    @Override // p187n.C3654q, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new C5006d(bitmap));
    }

    @Override // android.widget.ImageView
    public void setImageMatrix(Matrix matrix) {
        super.setImageMatrix(matrix);
        this.f19484n.set(matrix);
        m20917q();
    }

    public void setMaxBitmapSize(int i10) {
        this.f19492v = i10;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == ImageView.ScaleType.MATRIX) {
            super.setScaleType(scaleType);
        } else {
            Log.w("TransformImageView", "Invalid ScaleType. Only ScaleType.MATRIX can be used");
        }
    }

    public void setTransformImageListener(b bVar) {
        this.f19487q = bVar;
    }
}
