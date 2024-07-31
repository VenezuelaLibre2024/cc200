package p353y7;

import java.util.Objects;

/* renamed from: y7.d0 */
/* loaded from: classes.dex */
public final class C5870d0 {
    /* renamed from: a */
    public static void m23500a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static <T> T m23501b(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: c */
    public static <T> T m23502c(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* renamed from: d */
    public static void m23503d(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
