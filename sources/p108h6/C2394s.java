package p108h6;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;
import p207o6.C3950s;

/* renamed from: h6.s */
/* loaded from: classes.dex */
public final class C2394s {
    /* renamed from: a */
    public static void m9608a(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m9609b(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m9610c(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m9611d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* renamed from: e */
    public static void m9612e(String str) {
        if (!C3950s.m14975a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: f */
    public static String m9613f(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* renamed from: g */
    public static String m9614g(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* renamed from: h */
    public static void m9615h() {
        m9616i("Must not be called on GoogleApiHandler thread.");
    }

    /* renamed from: i */
    public static void m9616i(String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException(str);
            }
        }
    }

    /* renamed from: j */
    public static void m9617j() {
        m9618k("Must not be called on the main application thread");
    }

    /* renamed from: k */
    public static void m9618k(String str) {
        if (C3950s.m14975a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: l */
    public static <T> T m9619l(T t10) {
        Objects.requireNonNull(t10, "null reference");
        return t10;
    }

    /* renamed from: m */
    public static <T> T m9620m(T t10, Object obj) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* renamed from: n */
    public static int m9621n(int i10) {
        if (i10 != 0) {
            return i10;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: o */
    public static void m9622o(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public static void m9623p(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: q */
    public static void m9624q(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
