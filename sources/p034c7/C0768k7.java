package p034c7;

import android.os.Bundle;

/* renamed from: c7.k7 */
/* loaded from: classes.dex */
public final class C0768k7 {
    /* renamed from: a */
    public static <T> T m3519a(Bundle bundle, String str, Class<T> cls, T t10) {
        T t11 = (T) bundle.get(str);
        if (t11 == null) {
            return t10;
        }
        if (cls.isAssignableFrom(t11.getClass())) {
            return t11;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t11.getClass().getCanonicalName()));
    }

    /* renamed from: b */
    public static void m3520b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
