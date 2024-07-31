package p038ce;

import java.util.concurrent.CancellationException;

/* renamed from: ce.r1 */
/* loaded from: classes2.dex */
public final class C1094r1 {
    /* renamed from: a */
    public static final CancellationException m4570a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
