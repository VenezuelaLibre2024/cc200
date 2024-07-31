package je;

import p038ce.C1105u0;

/* renamed from: je.k */
/* loaded from: classes2.dex */
public final class C3296k extends AbstractRunnableC3293h {

    /* renamed from: j */
    public final Runnable f11493j;

    public C3296k(Runnable runnable, long j10, InterfaceC3294i interfaceC3294i) {
        super(j10, interfaceC3294i);
        this.f11493j = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f11493j.run();
        } finally {
            this.f11491i.mo11942a();
        }
    }

    public String toString() {
        return "Task[" + C1105u0.m4580a(this.f11493j) + '@' + C1105u0.m4581b(this.f11493j) + ", " + this.f11490h + ", " + this.f11491i + ']';
    }
}
