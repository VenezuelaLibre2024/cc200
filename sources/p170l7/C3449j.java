package p170l7;

import java.util.concurrent.Future;

/* renamed from: l7.j */
/* loaded from: classes.dex */
public final class C3449j {
    /* renamed from: a */
    public static <V> V m12833a(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }
}
