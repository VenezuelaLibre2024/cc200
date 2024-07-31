package p331x1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: x1.r */
/* loaded from: classes.dex */
public class C5543r {

    /* renamed from: a */
    public static final boolean f20794a;

    /* renamed from: b */
    public static final boolean f20795b;

    /* renamed from: c */
    public static final boolean f20796c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f20794a = i10 >= 19;
        f20795b = i10 >= 18;
        f20796c = i10 >= 28;
    }

    /* renamed from: a */
    public static View m22337a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        C5518c0.m22231i(view, matrix);
        C5518c0.m22232j(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap m22338b = m22338b(view, matrix, rectF, viewGroup);
        if (m22338b != null) {
            imageView.setImageBitmap(m22338b);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* renamed from: b */
    public static Bitmap m22338b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z10;
        boolean z11;
        int i10;
        ViewGroup viewGroup2;
        if (f20794a) {
            z10 = !view.isAttachedToWindow();
            z11 = viewGroup == null ? false : viewGroup.isAttachedToWindow();
        } else {
            z10 = false;
            z11 = false;
        }
        boolean z12 = f20795b;
        Bitmap bitmap = null;
        if (!z12 || !z10) {
            i10 = 0;
            viewGroup2 = null;
        } else {
            if (!z11) {
                return null;
            }
            viewGroup2 = (ViewGroup) view.getParent();
            i10 = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round > 0 && round2 > 0) {
            float min = Math.min(1.0f, 1048576.0f / (round * round2));
            int round3 = Math.round(round * min);
            int round4 = Math.round(round2 * min);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min, min);
            if (f20796c) {
                Picture picture = new Picture();
                Canvas beginRecording = picture.beginRecording(round3, round4);
                beginRecording.concat(matrix);
                view.draw(beginRecording);
                picture.endRecording();
                bitmap = Bitmap.createBitmap(picture);
            } else {
                bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmap);
                canvas.concat(matrix);
                view.draw(canvas);
            }
        }
        if (z12 && z10) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i10);
        }
        return bitmap;
    }

    /* renamed from: c */
    public static Animator m22339c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
