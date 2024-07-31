package p331x1;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: x1.i */
/* loaded from: classes.dex */
public class C5529i {
    /* renamed from: a */
    public static PropertyValuesHolder m22256a(Property<?, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, (TypeConverter) null, path) : PropertyValuesHolder.ofFloat(new C5527h(property, path), 0.0f, 1.0f);
    }
}
