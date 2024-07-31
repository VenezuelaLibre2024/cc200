package p116he;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.C1080o;
import p038ce.C1105u0;
import td.C4753m;
import td.C4757q;

/* renamed from: he.w */
/* loaded from: classes2.dex */
public class C2559w {

    /* renamed from: h */
    public static final AtomicReferenceFieldUpdater f10020h = AtomicReferenceFieldUpdater.newUpdater(C2559w.class, Object.class, "_next");

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f10021i = AtomicReferenceFieldUpdater.newUpdater(C2559w.class, Object.class, "_prev");

    /* renamed from: j */
    public static final AtomicReferenceFieldUpdater f10022j = AtomicReferenceFieldUpdater.newUpdater(C2559w.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: he.w$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends AbstractC2517b<C2559w> {

        /* renamed from: b */
        public final C2559w f10023b;

        /* renamed from: c */
        public C2559w f10024c;

        public a(C2559w c2559w) {
            this.f10023b = c2559w;
        }

        @Override // p116he.AbstractC2517b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void mo10046b(C2559w c2559w, Object obj) {
            boolean z10 = obj == null;
            C2559w c2559w2 = z10 ? this.f10023b : this.f10024c;
            if (c2559w2 != null && C1080o.m4523a(C2559w.f10020h, c2559w, this, c2559w2) && z10) {
                C2559w c2559w3 = this.f10023b;
                C2559w c2559w4 = this.f10024c;
                C4753m.m18650c(c2559w4);
                c2559w3.m10186l(c2559w4);
            }
        }
    }

    /* renamed from: h */
    public final boolean m10183h(C2559w c2559w) {
        f10021i.lazySet(c2559w, this);
        f10020h.lazySet(c2559w, this);
        while (m10187m() == this) {
            if (C1080o.m4523a(f10020h, this, this, c2559w)) {
                c2559w.m10186l(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (p038ce.C1080o.m4523a(r4, r3, r2, ((p116he.C2526f0) r5).f9966a) != false) goto L26;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p116he.C2559w m10184j(p116he.AbstractC2524e0 r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p116he.C2559w.f10021i
            java.lang.Object r0 = r0.get(r8)
            he.w r0 = (p116he.C2559w) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p116he.C2559w.f10020h
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = p116he.C2559w.f10021i
            boolean r0 = p038ce.C1080o.m4523a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.mo10178p()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof p116he.AbstractC2524e0
            if (r6 == 0) goto L34
            he.e0 r5 = (p116he.AbstractC2524e0) r5
            r5.mo10045a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof p116he.C2526f0
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            he.f0 r5 = (p116he.C2526f0) r5
            he.w r5 = r5.f9966a
            boolean r2 = p038ce.C1080o.m4523a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = p116he.C2559w.f10021i
            java.lang.Object r2 = r4.get(r2)
            he.w r2 = (p116he.C2559w) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            td.C4753m.m18651d(r5, r3)
            r3 = r5
            he.w r3 = (p116he.C2559w) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: p116he.C2559w.m10184j(he.e0):he.w");
    }

    /* renamed from: k */
    public final C2559w m10185k(C2559w c2559w) {
        while (c2559w.mo10178p()) {
            c2559w = (C2559w) f10021i.get(c2559w);
        }
        return c2559w;
    }

    /* renamed from: l */
    public final void m10186l(C2559w c2559w) {
        C2559w c2559w2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10021i;
        do {
            c2559w2 = (C2559w) atomicReferenceFieldUpdater.get(c2559w);
            if (m10187m() != c2559w) {
                return;
            }
        } while (!C1080o.m4523a(f10021i, c2559w, c2559w2, this));
        if (mo10178p()) {
            c2559w.m10184j(null);
        }
    }

    /* renamed from: m */
    public final Object m10187m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10020h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2524e0)) {
                return obj;
            }
            ((AbstractC2524e0) obj).mo10045a(this);
        }
    }

    /* renamed from: n */
    public final C2559w m10188n() {
        return C2557v.m10180b(m10187m());
    }

    /* renamed from: o */
    public final C2559w m10189o() {
        C2559w m10184j = m10184j(null);
        return m10184j == null ? m10185k((C2559w) f10021i.get(this)) : m10184j;
    }

    /* renamed from: p */
    public boolean mo10178p() {
        return m10187m() instanceof C2526f0;
    }

    /* renamed from: q */
    public boolean m10190q() {
        return m10191r() == null;
    }

    /* renamed from: r */
    public final C2559w m10191r() {
        Object m10187m;
        C2559w c2559w;
        do {
            m10187m = m10187m();
            if (m10187m instanceof C2526f0) {
                return ((C2526f0) m10187m).f9966a;
            }
            if (m10187m == this) {
                return (C2559w) m10187m;
            }
            C4753m.m18651d(m10187m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c2559w = (C2559w) m10187m;
        } while (!C1080o.m4523a(f10020h, this, m10187m, c2559w.m10192s()));
        c2559w.m10184j(null);
        return null;
    }

    /* renamed from: s */
    public final C2526f0 m10192s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10022j;
        C2526f0 c2526f0 = (C2526f0) atomicReferenceFieldUpdater.get(this);
        if (c2526f0 != null) {
            return c2526f0;
        }
        C2526f0 c2526f02 = new C2526f0(this);
        atomicReferenceFieldUpdater.lazySet(this, c2526f02);
        return c2526f02;
    }

    /* renamed from: t */
    public final int m10193t(C2559w c2559w, C2559w c2559w2, a aVar) {
        f10021i.lazySet(c2559w, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10020h;
        atomicReferenceFieldUpdater.lazySet(c2559w, c2559w2);
        aVar.f10024c = c2559w2;
        if (C1080o.m4523a(atomicReferenceFieldUpdater, this, c2559w2, aVar)) {
            return aVar.mo10045a(this) == null ? 1 : 2;
        }
        return 0;
    }

    public String toString() {
        return new C4757q(this) { // from class: he.w.b
            @Override // p359yd.InterfaceC5916f
            public Object get() {
                return C1105u0.m4580a(this.receiver);
            }
        } + '@' + C1105u0.m4581b(this);
    }
}
