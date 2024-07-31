package p038ce;

import p115hd.C2489f;

/* renamed from: ce.m1 */
/* loaded from: classes2.dex */
public abstract class AbstractC1074m1 extends AbstractC1064k0 {

    /* renamed from: j */
    public long f4052j;

    /* renamed from: k */
    public boolean f4053k;

    /* renamed from: l */
    public C2489f<AbstractC1030d1<?>> f4054l;

    /* renamed from: L0 */
    public static /* synthetic */ void m4474L0(AbstractC1074m1 abstractC1074m1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1074m1.m4476K0(z10);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ void m4475Q0(AbstractC1074m1 abstractC1074m1, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        abstractC1074m1.m4480P0(z10);
    }

    /* renamed from: K0 */
    public final void m4476K0(boolean z10) {
        long m4477M0 = this.f4052j - m4477M0(z10);
        this.f4052j = m4477M0;
        if (m4477M0 > 0) {
            return;
        }
        if (C1101t0.m4573a()) {
            if (!(this.f4052j == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f4053k) {
            shutdown();
        }
    }

    /* renamed from: M0 */
    public final long m4477M0(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    /* renamed from: N0 */
    public final void m4478N0(AbstractC1030d1<?> abstractC1030d1) {
        C2489f<AbstractC1030d1<?>> c2489f = this.f4054l;
        if (c2489f == null) {
            c2489f = new C2489f<>();
            this.f4054l = c2489f;
        }
        c2489f.m9908d(abstractC1030d1);
    }

    /* renamed from: O0 */
    public long mo4479O0() {
        C2489f<AbstractC1030d1<?>> c2489f = this.f4054l;
        return (c2489f == null || c2489f.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: P0 */
    public final void m4480P0(boolean z10) {
        this.f4052j += m4477M0(z10);
        if (z10) {
            return;
        }
        this.f4053k = true;
    }

    /* renamed from: R0 */
    public final boolean m4481R0() {
        return this.f4052j >= m4477M0(true);
    }

    /* renamed from: S0 */
    public final boolean m4482S0() {
        C2489f<AbstractC1030d1<?>> c2489f = this.f4054l;
        if (c2489f != null) {
            return c2489f.isEmpty();
        }
        return true;
    }

    /* renamed from: T0 */
    public long mo4483T0() {
        return !m4484U0() ? Long.MAX_VALUE : 0L;
    }

    /* renamed from: U0 */
    public final boolean m4484U0() {
        AbstractC1030d1<?> m9917q;
        C2489f<AbstractC1030d1<?>> c2489f = this.f4054l;
        if (c2489f == null || (m9917q = c2489f.m9917q()) == null) {
            return false;
        }
        m9917q.run();
        return true;
    }

    /* renamed from: V0 */
    public boolean m4485V0() {
        return false;
    }

    public void shutdown() {
    }
}
