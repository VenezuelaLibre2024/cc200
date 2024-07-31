package ee;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p116he.AbstractC2532i0;
import td.C4753m;

/* renamed from: ee.h */
/* loaded from: classes2.dex */
public final class C1780h<E> extends AbstractC2532i0<C1780h<E>> {

    /* renamed from: l */
    public final C1774b<E> f6583l;

    /* renamed from: m */
    public final AtomicReferenceArray f6584m;

    public C1780h(long j10, C1780h<E> c1780h, C1774b<E> c1774b, int i10) {
        super(j10, c1780h, i10);
        this.f6583l = c1774b;
        this.f6584m = new AtomicReferenceArray(C1775c.f6557b * 2);
    }

    /* renamed from: A */
    public final void m7208A(int i10, Object obj) {
        this.f6584m.set((i10 * 2) + 1, obj);
    }

    /* renamed from: B */
    public final void m7209B(int i10, E e10) {
        m7220z(i10, e10);
    }

    @Override // p116he.AbstractC2532i0
    /* renamed from: n */
    public int mo7210n() {
        return C1775c.f6557b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        m7213s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = m7215u().f6545c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        p116he.C2522d0.m10059b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // p116he.AbstractC2532i0
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo7211o(int r4, java.lang.Throwable r5, p146jd.InterfaceC3284g r6) {
        /*
            r3 = this;
            int r5 = ee.C1775c.f6557b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.m7216v(r4)
        Le:
            java.lang.Object r1 = r3.m7217w(r4)
            boolean r2 = r1 instanceof p038ce.InterfaceC1062j3
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof ee.C1787o
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            he.l0 r2 = ee.C1775c.m7173j()
            if (r1 == r2) goto L63
            he.l0 r2 = ee.C1775c.m7172i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            he.l0 r2 = ee.C1775c.m7179p()
            if (r1 == r2) goto Le
            he.l0 r2 = ee.C1775c.m7180q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            he.l0 r4 = ee.C1775c.m7169f()
            if (r1 == r4) goto L62
            he.l0 r4 = ee.C1775c.f6559d
            if (r1 != r4) goto L40
            goto L62
        L40:
            he.l0 r4 = ee.C1775c.m7189z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.m7213s(r4)
            if (r0 == 0) goto L73
            ee.b r4 = r3.m7215u()
            sd.l<E, gd.s> r4 = r4.f6545c
            if (r4 == 0) goto L73
            p116he.C2522d0.m10059b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            he.l0 r2 = ee.C1775c.m7173j()
            goto L7f
        L7b:
            he.l0 r2 = ee.C1775c.m7172i()
        L7f:
            boolean r1 = r3.m7212r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.m7213s(r4)
            r1 = r0 ^ 1
            r3.m7218x(r4, r1)
            if (r0 == 0) goto L9a
            ee.b r4 = r3.m7215u()
            sd.l<E, gd.s> r4 = r4.f6545c
            if (r4 == 0) goto L9a
            p116he.C2522d0.m10059b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.C1780h.mo7211o(int, java.lang.Throwable, jd.g):void");
    }

    /* renamed from: r */
    public final boolean m7212r(int i10, Object obj, Object obj2) {
        return this.f6584m.compareAndSet((i10 * 2) + 1, obj, obj2);
    }

    /* renamed from: s */
    public final void m7213s(int i10) {
        m7220z(i10, null);
    }

    /* renamed from: t */
    public final Object m7214t(int i10, Object obj) {
        return this.f6584m.getAndSet((i10 * 2) + 1, obj);
    }

    /* renamed from: u */
    public final C1774b<E> m7215u() {
        C1774b<E> c1774b = this.f6583l;
        C4753m.m18650c(c1774b);
        return c1774b;
    }

    /* renamed from: v */
    public final E m7216v(int i10) {
        return (E) this.f6584m.get(i10 * 2);
    }

    /* renamed from: w */
    public final Object m7217w(int i10) {
        return this.f6584m.get((i10 * 2) + 1);
    }

    /* renamed from: x */
    public final void m7218x(int i10, boolean z10) {
        if (z10) {
            m7215u().m7145x0((this.f9971j * C1775c.f6557b) + i10);
        }
        m10085p();
    }

    /* renamed from: y */
    public final E m7219y(int i10) {
        E m7216v = m7216v(i10);
        m7213s(i10);
        return m7216v;
    }

    /* renamed from: z */
    public final void m7220z(int i10, Object obj) {
        this.f6584m.lazySet(i10 * 2, obj);
    }
}
