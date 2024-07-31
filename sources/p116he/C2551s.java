package p116he;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p038ce.AbstractC1064k0;
import p038ce.C1073m0;
import p038ce.C1113w0;
import p038ce.InterfaceC1055i1;
import p038ce.InterfaceC1125z0;
import p146jd.C3285h;
import p146jd.InterfaceC3284g;

/* renamed from: he.s */
/* loaded from: classes2.dex */
public final class C2551s extends AbstractC1064k0 implements InterfaceC1125z0 {

    /* renamed from: o */
    public static final AtomicIntegerFieldUpdater f10004o = AtomicIntegerFieldUpdater.newUpdater(C2551s.class, "runningWorkers");

    /* renamed from: j */
    public final AbstractC1064k0 f10005j;

    /* renamed from: k */
    public final int f10006k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC1125z0 f10007l;

    /* renamed from: m */
    public final C2560x<Runnable> f10008m;

    /* renamed from: n */
    public final Object f10009n;
    private volatile int runningWorkers;

    /* renamed from: he.s$a */
    /* loaded from: classes2.dex */
    public final class a implements Runnable {

        /* renamed from: h */
        public Runnable f10010h;

        public a(Runnable runnable) {
            this.f10010h = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f10010h.run();
                } catch (Throwable th) {
                    C1073m0.m4472a(C3285h.f11452h, th);
                }
                Runnable m10173M0 = C2551s.this.m10173M0();
                if (m10173M0 == null) {
                    return;
                }
                this.f10010h = m10173M0;
                i10++;
                if (i10 >= 16 && C2551s.this.f10005j.mo4340I0(C2551s.this)) {
                    C2551s.this.f10005j.mo4339H0(C2551s.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2551s(AbstractC1064k0 abstractC1064k0, int i10) {
        this.f10005j = abstractC1064k0;
        this.f10006k = i10;
        InterfaceC1125z0 interfaceC1125z0 = abstractC1064k0 instanceof InterfaceC1125z0 ? (InterfaceC1125z0) abstractC1064k0 : null;
        this.f10007l = interfaceC1125z0 == null ? C1113w0.m4591a() : interfaceC1125z0;
        this.f10008m = new C2560x<>(false);
        this.f10009n = new Object();
    }

    @Override // p038ce.InterfaceC1125z0
    /* renamed from: G0 */
    public InterfaceC1055i1 mo4501G0(long j10, Runnable runnable, InterfaceC3284g interfaceC3284g) {
        return this.f10007l.mo4501G0(j10, runnable, interfaceC3284g);
    }

    @Override // p038ce.AbstractC1064k0
    /* renamed from: H0 */
    public void mo4339H0(InterfaceC3284g interfaceC3284g, Runnable runnable) {
        Runnable m10173M0;
        this.f10008m.m10195a(runnable);
        if (f10004o.get(this) >= this.f10006k || !m10174N0() || (m10173M0 = m10173M0()) == null) {
            return;
        }
        this.f10005j.mo4339H0(this, new a(m10173M0));
    }

    /* renamed from: M0 */
    public final Runnable m10173M0() {
        while (true) {
            Runnable m10198d = this.f10008m.m10198d();
            if (m10198d != null) {
                return m10198d;
            }
            synchronized (this.f10009n) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10004o;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f10008m.m10197c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    /* renamed from: N0 */
    public final boolean m10174N0() {
        boolean z10;
        synchronized (this.f10009n) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10004o;
            if (atomicIntegerFieldUpdater.get(this) >= this.f10006k) {
                z10 = false;
            } else {
                atomicIntegerFieldUpdater.incrementAndGet(this);
                z10 = true;
            }
        }
        return z10;
    }
}
