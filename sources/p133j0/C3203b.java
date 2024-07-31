package p133j0;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public class C3203b {

    /* renamed from: j0.b$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m11403a(Object obj, Object obj2) {
            return Objects.equals(obj, obj2);
        }

        /* renamed from: b */
        public static int m11404b(Object... objArr) {
            return Objects.hash(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m11399a(Object obj, Object obj2) {
        return Build.VERSION.SDK_INT >= 19 ? a.m11403a(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m11400b(Object... objArr) {
        return Build.VERSION.SDK_INT >= 19 ? a.m11404b(objArr) : Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static <T> T m11401c(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: d */
    public static <T> T m11402d(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }
}
