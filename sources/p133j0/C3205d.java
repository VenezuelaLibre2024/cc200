package p133j0;

import java.util.Locale;
import java.util.Objects;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public final class C3205d {
    /* renamed from: a */
    public static void m11405a(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m11406b(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: c */
    public static float m11407c(float f10, String str) {
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f10)) {
            return f10;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    /* renamed from: d */
    public static float m11408d(float f10, float f11, float f12, String str) {
        if (f10 < f11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f11), Float.valueOf(f12)));
        }
        if (f10 <= f12) {
            return f10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f11), Float.valueOf(f12)));
    }

    /* renamed from: e */
    public static int m11409e(int i10, int i11, int i12, String str) {
        if (i10 < i11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        if (i10 <= i12) {
            return i10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    /* renamed from: f */
    public static long m11410f(long j10, long j11, long j12, String str) {
        if (j10 < j11) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j11), Long.valueOf(j12)));
        }
        if (j10 <= j12) {
            return j10;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j11), Long.valueOf(j12)));
    }

    /* renamed from: g */
    public static int m11411g(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    public static int m11412h(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str);
    }

    /* renamed from: i */
    public static int m11413i(int i10, int i11) {
        if ((i10 & i11) == i10) {
            return i10;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(i11) + " are allowed");
    }

    /* renamed from: j */
    public static <T> T m11414j(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: k */
    public static <T> T m11415k(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static void m11416l(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
