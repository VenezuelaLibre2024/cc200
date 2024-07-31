package je;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.C1080o;
import p038ce.C1101t0;
import td.C4763w;

/* renamed from: je.n */
/* loaded from: classes2.dex */
public final class C3299n {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f11503b = AtomicReferenceFieldUpdater.newUpdater(C3299n.class, Object.class, "lastScheduledTask");

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f11504c = AtomicIntegerFieldUpdater.newUpdater(C3299n.class, "producerIndex");

    /* renamed from: d */
    public static final AtomicIntegerFieldUpdater f11505d = AtomicIntegerFieldUpdater.newUpdater(C3299n.class, "consumerIndex");

    /* renamed from: e */
    public static final AtomicIntegerFieldUpdater f11506e = AtomicIntegerFieldUpdater.newUpdater(C3299n.class, "blockingTasksInBuffer");

    /* renamed from: a */
    public final AtomicReferenceArray<AbstractRunnableC3293h> f11507a = new AtomicReferenceArray<>(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    /* renamed from: a */
    public final AbstractRunnableC3293h m11944a(AbstractRunnableC3293h abstractRunnableC3293h, boolean z10) {
        if (z10) {
            return m11945b(abstractRunnableC3293h);
        }
        AbstractRunnableC3293h abstractRunnableC3293h2 = (AbstractRunnableC3293h) f11503b.getAndSet(this, abstractRunnableC3293h);
        if (abstractRunnableC3293h2 == null) {
            return null;
        }
        return m11945b(abstractRunnableC3293h2);
    }

    /* renamed from: b */
    public final AbstractRunnableC3293h m11945b(AbstractRunnableC3293h abstractRunnableC3293h) {
        if (m11947d() == 127) {
            return abstractRunnableC3293h;
        }
        if (abstractRunnableC3293h.f11491i.mo11943b() == 1) {
            f11506e.incrementAndGet(this);
        }
        int i10 = f11504c.get(this) & 127;
        while (this.f11507a.get(i10) != null) {
            Thread.yield();
        }
        this.f11507a.lazySet(i10, abstractRunnableC3293h);
        f11504c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final void m11946c(AbstractRunnableC3293h abstractRunnableC3293h) {
        if (abstractRunnableC3293h != null) {
            if (abstractRunnableC3293h.f11491i.mo11943b() == 1) {
                int decrementAndGet = f11506e.decrementAndGet(this);
                if (C1101t0.m4573a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final int m11947d() {
        return f11504c.get(this) - f11505d.get(this);
    }

    /* renamed from: e */
    public final int m11948e() {
        return f11503b.get(this) != null ? m11947d() + 1 : m11947d();
    }

    /* renamed from: f */
    public final void m11949f(C3289d c3289d) {
        AbstractRunnableC3293h abstractRunnableC3293h = (AbstractRunnableC3293h) f11503b.getAndSet(this, null);
        if (abstractRunnableC3293h != null) {
            c3289d.m10195a(abstractRunnableC3293h);
        }
        do {
        } while (m11953j(c3289d));
    }

    /* renamed from: g */
    public final AbstractRunnableC3293h m11950g() {
        AbstractRunnableC3293h abstractRunnableC3293h = (AbstractRunnableC3293h) f11503b.getAndSet(this, null);
        return abstractRunnableC3293h == null ? m11952i() : abstractRunnableC3293h;
    }

    /* renamed from: h */
    public final AbstractRunnableC3293h m11951h() {
        return m11954k(true);
    }

    /* renamed from: i */
    public final AbstractRunnableC3293h m11952i() {
        AbstractRunnableC3293h andSet;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11505d;
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 - f11504c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 + 1) && (andSet = this.f11507a.getAndSet(i11, null)) != null) {
                m11946c(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    public final boolean m11953j(C3289d c3289d) {
        AbstractRunnableC3293h m11952i = m11952i();
        if (m11952i == null) {
            return false;
        }
        c3289d.m10195a(m11952i);
        return true;
    }

    /* renamed from: k */
    public final AbstractRunnableC3293h m11954k(boolean z10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AbstractRunnableC3293h abstractRunnableC3293h;
        do {
            atomicReferenceFieldUpdater = f11503b;
            abstractRunnableC3293h = (AbstractRunnableC3293h) atomicReferenceFieldUpdater.get(this);
            if (abstractRunnableC3293h != null) {
                if ((abstractRunnableC3293h.f11491i.mo11943b() == 1) == z10) {
                }
            }
            int i10 = f11505d.get(this);
            int i11 = f11504c.get(this);
            while (i10 != i11) {
                if (z10 && f11506e.get(this) == 0) {
                    return null;
                }
                i11--;
                AbstractRunnableC3293h m11956m = m11956m(i11, z10);
                if (m11956m != null) {
                    return m11956m;
                }
            }
            return null;
        } while (!C1080o.m4523a(atomicReferenceFieldUpdater, this, abstractRunnableC3293h, null));
        return abstractRunnableC3293h;
    }

    /* renamed from: l */
    public final AbstractRunnableC3293h m11955l(int i10) {
        int i11 = f11505d.get(this);
        int i12 = f11504c.get(this);
        boolean z10 = i10 == 1;
        while (i11 != i12) {
            if (z10 && f11506e.get(this) == 0) {
                return null;
            }
            int i13 = i11 + 1;
            AbstractRunnableC3293h m11956m = m11956m(i11, z10);
            if (m11956m != null) {
                return m11956m;
            }
            i11 = i13;
        }
        return null;
    }

    /* renamed from: m */
    public final AbstractRunnableC3293h m11956m(int i10, boolean z10) {
        int i11 = i10 & 127;
        AbstractRunnableC3293h abstractRunnableC3293h = this.f11507a.get(i11);
        if (abstractRunnableC3293h != null) {
            if ((abstractRunnableC3293h.f11491i.mo11943b() == 1) == z10 && this.f11507a.compareAndSet(i11, abstractRunnableC3293h, null)) {
                if (z10) {
                    f11506e.decrementAndGet(this);
                }
                return abstractRunnableC3293h;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public final long m11957n(int i10, C4763w<AbstractRunnableC3293h> c4763w) {
        T m11952i = i10 == 3 ? m11952i() : m11955l(i10);
        if (m11952i == 0) {
            return m11958o(i10, c4763w);
        }
        c4763w.f17731h = m11952i;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [je.h, T, java.lang.Object] */
    /* renamed from: o */
    public final long m11958o(int i10, C4763w<AbstractRunnableC3293h> c4763w) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? r12;
        do {
            atomicReferenceFieldUpdater = f11503b;
            r12 = (AbstractRunnableC3293h) atomicReferenceFieldUpdater.get(this);
            if (r12 == 0) {
                return -2L;
            }
            if (((r12.f11491i.mo11943b() == 1 ? 1 : 2) & i10) == 0) {
                return -2L;
            }
            long mo11939a = C3297l.f11499f.mo11939a() - r12.f11490h;
            long j10 = C3297l.f11495b;
            if (mo11939a < j10) {
                return j10 - mo11939a;
            }
        } while (!C1080o.m4523a(atomicReferenceFieldUpdater, this, r12, null));
        c4763w.f17731h = r12;
        return -1L;
    }
}
