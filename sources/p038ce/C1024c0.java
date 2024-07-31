package p038ce;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import td.C4747g;

/* renamed from: ce.c0 */
/* loaded from: classes2.dex */
public class C1024c0 {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f3976b = AtomicIntegerFieldUpdater.newUpdater(C1024c0.class, "_handled");
    private volatile int _handled;

    /* renamed from: a */
    public final Throwable f3977a;

    public C1024c0(Throwable th, boolean z10) {
        this.f3977a = th;
        this._handled = z10 ? 1 : 0;
    }

    public /* synthetic */ C1024c0(Throwable th, boolean z10, int i10, C4747g c4747g) {
        this(th, (i10 & 2) != 0 ? false : z10);
    }

    /* renamed from: a */
    public final boolean m4267a() {
        return f3976b.get(this) != 0;
    }

    /* renamed from: b */
    public final boolean m4268b() {
        return f3976b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return C1105u0.m4580a(this) + '[' + this.f3977a + ']';
    }
}
