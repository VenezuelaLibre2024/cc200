package p000;

import android.util.Log;
import java.util.List;
import p115hd.C2502n;

/* renamed from: e */
/* loaded from: classes.dex */
public final class C1633e {
    /* renamed from: b */
    public static final List<Object> m6507b(Throwable th) {
        if (th instanceof C0000a) {
            return C2502n.m9991g(((C0000a) th).m0a(), th.getMessage(), ((C0000a) th).m1b());
        }
        return C2502n.m9991g(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }
}
