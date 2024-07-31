package p096g6;

import android.os.Looper;
import java.util.concurrent.Executor;
import p096g6.C2034j;
import p108h6.C2394s;

/* renamed from: g6.k */
/* loaded from: classes.dex */
public class C2038k {
    /* renamed from: a */
    public static <L> C2034j<L> m8168a(L l10, Looper looper, String str) {
        C2394s.m9620m(l10, "Listener must not be null");
        C2394s.m9620m(looper, "Looper must not be null");
        C2394s.m9620m(str, "Listener type must not be null");
        return new C2034j<>(looper, l10, str);
    }

    /* renamed from: b */
    public static <L> C2034j<L> m8169b(L l10, Executor executor, String str) {
        C2394s.m9620m(l10, "Listener must not be null");
        C2394s.m9620m(executor, "Executor must not be null");
        C2394s.m9620m(str, "Listener type must not be null");
        return new C2034j<>(executor, l10, str);
    }

    /* renamed from: c */
    public static <L> C2034j.a<L> m8170c(L l10, String str) {
        C2394s.m9620m(l10, "Listener must not be null");
        C2394s.m9620m(str, "Listener type must not be null");
        C2394s.m9614g(str, "Listener type must not be empty");
        return new C2034j.a<>(l10, str);
    }
}
