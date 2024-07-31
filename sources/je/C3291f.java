package je;

import p038ce.AbstractC1098s1;
import p146jd.InterfaceC3284g;

/* renamed from: je.f */
/* loaded from: classes2.dex */
public class C3291f extends AbstractC1098s1 {

    /* renamed from: k */
    public final int f11485k;

    /* renamed from: l */
    public final int f11486l;

    /* renamed from: m */
    public final long f11487m;

    /* renamed from: n */
    public final String f11488n;

    /* renamed from: o */
    public ExecutorC3286a f11489o = m11940K0();

    public C3291f(int i10, int i11, long j10, String str) {
        this.f11485k = i10;
        this.f11486l = i11;
        this.f11487m = j10;
        this.f11488n = str;
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: H0 */
    public void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        ExecutorC3286a.m11898x(this.f11489o, runnable, null, false, 6, null);
    }

    /* renamed from: K0 */
    public final ExecutorC3286a m11940K0() {
        return new ExecutorC3286a(this.f11485k, this.f11486l, this.f11487m, this.f11488n);
    }

    /* renamed from: L0 */
    public final void m11941L0(Runnable runnable, InterfaceC3294i interfaceC3294i, boolean z10) {
        this.f11489o.m11914w(runnable, interfaceC3294i, z10);
    }
}
