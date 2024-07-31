package p188n0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: n0.f */
/* loaded from: classes.dex */
public class C3679f {

    /* renamed from: n0.f$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static ColorStateList m13831a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        /* renamed from: b */
        public static PorterDuff.Mode m13832b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        /* renamed from: c */
        public static void m13833c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        /* renamed from: d */
        public static void m13834d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static ColorStateList m13827a(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m13831a(imageView);
        }
        if (imageView instanceof InterfaceC3688o) {
            return ((InterfaceC3688o) imageView).getSupportImageTintList();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static PorterDuff.Mode m13828b(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return a.m13832b(imageView);
        }
        if (imageView instanceof InterfaceC3688o) {
            return ((InterfaceC3688o) imageView).getSupportImageTintMode();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static void m13829c(ImageView imageView, ColorStateList colorStateList) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            if (imageView instanceof InterfaceC3688o) {
                ((InterfaceC3688o) imageView).setSupportImageTintList(colorStateList);
                return;
            }
            return;
        }
        a.m13833c(imageView, colorStateList);
        if (i10 != 21 || (drawable = imageView.getDrawable()) == null || a.m13831a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public static void m13830d(ImageView imageView, PorterDuff.Mode mode) {
        Drawable drawable;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 21) {
            if (imageView instanceof InterfaceC3688o) {
                ((InterfaceC3688o) imageView).setSupportImageTintMode(mode);
                return;
            }
            return;
        }
        a.m13834d(imageView, mode);
        if (i10 != 21 || (drawable = imageView.getDrawable()) == null || a.m13831a(imageView) == null) {
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(imageView.getDrawableState());
        }
        imageView.setImageDrawable(drawable);
    }
}
