package p010a8;

import android.annotation.SuppressLint;
import p023b8.C0515g;

/* renamed from: a8.h */
/* loaded from: classes.dex */
public final class C0078h {
    @SuppressLint({"VisibleForTests"})
    /* renamed from: a */
    public static void m333a(Throwable th) {
        if (th == null) {
            C0515g.m2482f().m2492k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            C0077g.m320d().f267a.m6988p(th);
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: b */
    public static void m334b(String str) {
        C0077g.m320d().f267a.m6995w("com.crashlytics.flutter.build-id.0", str);
    }
}
