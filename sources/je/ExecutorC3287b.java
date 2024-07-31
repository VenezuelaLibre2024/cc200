package je;

import java.util.concurrent.Executor;
import p038ce.AbstractC1064k0;
import p038ce.AbstractC1098s1;
import p116he.C2540m0;
import p116he.C2544o0;
import p146jd.C3285h;
import p146jd.InterfaceC3284g;
import p343xd.C5767k;

/* renamed from: je.b */
/* loaded from: classes2.dex */
public final class ExecutorC3287b extends AbstractC1098s1 implements Executor {

    /* renamed from: k */
    public static final ExecutorC3287b f11481k = new ExecutorC3287b();

    /* renamed from: l */
    public static final AbstractC1064k0 f11482l;

    static {
        int m10139e;
        C3298m c3298m = C3298m.f11502j;
        m10139e = C2544o0.m10139e("kotlinx.coroutines.io.parallelism", C5767k.m22904a(64, C2540m0.m10112a()), 0, 0, 12, null);
        f11482l = c3298m.mo4459J0(m10139e);
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: H0 */
    public void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        f11482l.mo4339H0(interfaceC3284g, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo4339H0(C3285h.f11452h, runnable);
    }

    @Override // p038ce.AbstractC1064k0
    public String toString() {
        return "Dispatchers.IO";
    }
}
