package p116he;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.C1080o;
import p038ce.C1101t0;
import p116he.AbstractC2525f;
import td.C4753m;

/* renamed from: he.f */
/* loaded from: classes2.dex */
public abstract class AbstractC2525f<N extends AbstractC2525f<N>> {

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f9964h = AtomicReferenceFieldUpdater.newUpdater(AbstractC2525f.class, Object.class, "_next");

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f9965i = AtomicReferenceFieldUpdater.newUpdater(AbstractC2525f.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC2525f(N n10) {
        this._prev = n10;
    }

    /* renamed from: a */
    public static final /* synthetic */ Object m10066a(AbstractC2525f abstractC2525f) {
        return abstractC2525f.m10071f();
    }

    /* renamed from: b */
    public final void m10067b() {
        f9965i.lazySet(this, null);
    }

    /* renamed from: c */
    public final N m10068c() {
        N m10072g = m10072g();
        while (m10072g != null && m10072g.mo10073h()) {
            m10072g = (N) f9965i.get(m10072g);
        }
        return m10072g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [he.f] */
    /* renamed from: d */
    public final N m10069d() {
        ?? m10070e;
        if (C1101t0.m4573a() && !(!m10074i())) {
            throw new AssertionError();
        }
        N m10070e2 = m10070e();
        C4753m.m18650c(m10070e2);
        while (m10070e2.mo10073h() && (m10070e = m10070e2.m10070e()) != 0) {
            m10070e2 = m10070e;
        }
        return m10070e2;
    }

    /* renamed from: e */
    public final N m10070e() {
        Object m10071f = m10071f();
        if (m10071f == C2523e.f9963a) {
            return null;
        }
        return (N) m10071f;
    }

    /* renamed from: f */
    public final Object m10071f() {
        return f9964h.get(this);
    }

    /* renamed from: g */
    public final N m10072g() {
        return (N) f9965i.get(this);
    }

    /* renamed from: h */
    public abstract boolean mo10073h();

    /* renamed from: i */
    public final boolean m10074i() {
        return m10070e() == null;
    }

    /* renamed from: j */
    public final boolean m10075j() {
        return C1080o.m4523a(f9964h, this, null, C2523e.f9963a);
    }

    /* renamed from: k */
    public final void m10076k() {
        Object obj;
        if (C1101t0.m4573a()) {
            if (!(mo10073h() || m10074i())) {
                throw new AssertionError();
            }
        }
        if (m10074i()) {
            return;
        }
        while (true) {
            N m10068c = m10068c();
            N m10069d = m10069d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9965i;
            do {
                obj = atomicReferenceFieldUpdater.get(m10069d);
            } while (!C1080o.m4523a(atomicReferenceFieldUpdater, m10069d, obj, ((AbstractC2525f) obj) == null ? null : m10068c));
            if (m10068c != null) {
                f9964h.set(m10068c, m10069d);
            }
            if (!m10069d.mo10073h() || m10069d.m10074i()) {
                if (m10068c == null || !m10068c.mo10073h()) {
                    return;
                }
            }
        }
    }

    /* renamed from: l */
    public final boolean m10077l(N n10) {
        return C1080o.m4523a(f9964h, this, null, n10);
    }
}
