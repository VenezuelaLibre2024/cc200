package p102h0;

import android.os.Handler;
import android.os.Looper;

/* renamed from: h0.b */
/* loaded from: classes.dex */
public class C2274b {
    /* renamed from: a */
    public static Handler m9237a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
