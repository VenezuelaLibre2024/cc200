package p109h7;

import java.util.Objects;

/* renamed from: h7.o */
/* loaded from: classes.dex */
public final class C2432o {
    /* renamed from: a */
    public static String m9695a(int i10, int i11, String str) {
        if (i10 < 0) {
            return C2437t.m9730c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C2437t.m9730c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    /* renamed from: b */
    public static String m9696b(int i10, int i11, String str) {
        if (i10 < 0) {
            return C2437t.m9730c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C2437t.m9730c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }

    /* renamed from: c */
    public static String m9697c(int i10, int i11, int i12) {
        return (i10 < 0 || i10 > i12) ? m9696b(i10, i12, "start index") : (i11 < 0 || i11 > i12) ? m9696b(i11, i12, "end index") : C2437t.m9730c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    /* renamed from: d */
    public static void m9698d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m9699e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m9700f(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(C2437t.m9730c(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    /* renamed from: g */
    public static void m9701g(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(C2437t.m9730c(str, Long.valueOf(j10)));
        }
    }

    /* renamed from: h */
    public static int m9702h(int i10, int i11) {
        return m9703i(i10, i11, "index");
    }

    /* renamed from: i */
    public static int m9703i(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(m9695a(i10, i11, str));
        }
        return i10;
    }

    /* renamed from: j */
    public static <T> T m9704j(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: k */
    public static <T> T m9705k(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: l */
    public static int m9706l(int i10, int i11) {
        return m9707m(i10, i11, "index");
    }

    /* renamed from: m */
    public static int m9707m(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m9696b(i10, i11, str));
        }
        return i10;
    }

    /* renamed from: n */
    public static void m9708n(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(m9697c(i10, i11, i12));
        }
    }

    /* renamed from: o */
    public static void m9709o(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public static void m9710p(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: q */
    public static void m9711q(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(C2437t.m9730c(str, obj));
        }
    }
}
