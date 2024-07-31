package p038ce;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: ce.u1 */
/* loaded from: classes2.dex */
public final class C1106u1 {
    /* renamed from: a */
    public static final AbstractC1064k0 m4583a(Executor executor) {
        AbstractC1064k0 abstractC1064k0;
        ExecutorC1040f1 executorC1040f1 = executor instanceof ExecutorC1040f1 ? (ExecutorC1040f1) executor : null;
        return (executorC1040f1 == null || (abstractC1064k0 = executorC1040f1.f3999h) == null) ? new C1102t1(executor) : abstractC1064k0;
    }

    /* renamed from: b */
    public static final AbstractC1098s1 m4584b(ExecutorService executorService) {
        return new C1102t1(executorService);
    }
}
