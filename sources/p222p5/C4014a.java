package p222p5;

import android.text.TextUtils;
import java.util.Objects;

/* renamed from: p5.a */
/* loaded from: classes.dex */
public final class C4014a {
    /* renamed from: a */
    public static void m15195a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m15196b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static int m15197c(int i10, int i11, int i12) {
        if (i10 < i11 || i10 >= i12) {
            throw new IndexOutOfBoundsException();
        }
        return i10;
    }

    /* renamed from: d */
    public static String m15198d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    /* renamed from: e */
    public static <T> T m15199e(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* renamed from: f */
    public static void m15200f(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: g */
    public static void m15201g(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: h */
    public static <T> T m15202h(T t10) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    /* renamed from: i */
    public static <T> T m15203i(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
}
