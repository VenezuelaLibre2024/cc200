package p187n;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p015b0.InterfaceC0438c;

/* renamed from: n.t */
/* loaded from: classes.dex */
public class C3660t {

    /* renamed from: c */
    public static final int[] f13028c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a */
    public final ProgressBar f13029a;

    /* renamed from: b */
    public Bitmap f13030b;

    /* renamed from: n.t$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m13706a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i10) {
            layerDrawable2.setLayerGravity(i10, layerDrawable.getLayerGravity(i10));
            layerDrawable2.setLayerWidth(i10, layerDrawable.getLayerWidth(i10));
            layerDrawable2.setLayerHeight(i10, layerDrawable.getLayerHeight(i10));
            layerDrawable2.setLayerInsetLeft(i10, layerDrawable.getLayerInsetLeft(i10));
            layerDrawable2.setLayerInsetRight(i10, layerDrawable.getLayerInsetRight(i10));
            layerDrawable2.setLayerInsetTop(i10, layerDrawable.getLayerInsetTop(i10));
            layerDrawable2.setLayerInsetBottom(i10, layerDrawable.getLayerInsetBottom(i10));
            layerDrawable2.setLayerInsetStart(i10, layerDrawable.getLayerInsetStart(i10));
            layerDrawable2.setLayerInsetEnd(i10, layerDrawable.getLayerInsetEnd(i10));
        }
    }

    public C3660t(ProgressBar progressBar) {
        this.f13029a = progressBar;
    }

    /* renamed from: a */
    public final Shape m13701a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* renamed from: b */
    public Bitmap m13702b() {
        return this.f13030b;
    }

    /* renamed from: c */
    public void mo13703c(AttributeSet attributeSet, int i10) {
        C3667w0 m13717u = C3667w0.m13717u(this.f13029a.getContext(), attributeSet, f13028c, i10, 0);
        Drawable m13724g = m13717u.m13724g(0);
        if (m13724g != null) {
            this.f13029a.setIndeterminateDrawable(m13705e(m13724g));
        }
        Drawable m13724g2 = m13717u.m13724g(1);
        if (m13724g2 != null) {
            this.f13029a.setProgressDrawable(m13704d(m13724g2, false));
        }
        m13717u.m13736v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public Drawable m13704d(Drawable drawable, boolean z10) {
        if (drawable instanceof InterfaceC0438c) {
            InterfaceC0438c interfaceC0438c = (InterfaceC0438c) drawable;
            Drawable mo2283b = interfaceC0438c.mo2283b();
            if (mo2283b != null) {
                interfaceC0438c.mo2282a(m13704d(mo2283b, z10));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i10 = 0; i10 < numberOfLayers; i10++) {
                    int id2 = layerDrawable.getId(i10);
                    drawableArr[i10] = m13704d(layerDrawable.getDrawable(i10), id2 == 16908301 || id2 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i11 = 0; i11 < numberOfLayers; i11++) {
                    layerDrawable2.setId(i11, layerDrawable.getId(i11));
                    if (Build.VERSION.SDK_INT >= 23) {
                        a.m13706a(layerDrawable, layerDrawable2, i11);
                    }
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f13030b == null) {
                    this.f13030b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(m13701a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z10 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    /* renamed from: e */
    public final Drawable m13705e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i10 = 0; i10 < numberOfFrames; i10++) {
            Drawable m13704d = m13704d(animationDrawable.getFrame(i10), true);
            m13704d.setLevel(10000);
            animationDrawable2.addFrame(m13704d, animationDrawable.getDuration(i10));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }
}
