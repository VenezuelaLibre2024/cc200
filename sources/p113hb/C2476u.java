package p113hb;

import android.os.Looper;

/* renamed from: hb.u */
/* loaded from: classes.dex */
public class C2476u {
    /* renamed from: a */
    public static void m9873a() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }
}
