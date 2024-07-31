package p331x1;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: x1.f */
/* loaded from: classes.dex */
public class C5523f {
    /* renamed from: a */
    public static <T> ObjectAnimator m22250a(T t10, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t10, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(t10, new C5527h(property, path), 0.0f, 1.0f);
    }
}
