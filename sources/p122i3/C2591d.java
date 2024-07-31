package p122i3;

import java.util.Objects;

/* renamed from: i3.d */
/* loaded from: classes.dex */
public final class C2591d {
    /* renamed from: a */
    public static <T> void m10354a(T t10, Class<T> cls) {
        if (t10 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m10355b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: c */
    public static <T> T m10356c(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }
}
