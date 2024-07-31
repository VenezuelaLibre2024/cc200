package p116he;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.C1080o;
import p038ce.C1101t0;
import td.C4747g;

/* renamed from: he.y */
/* loaded from: classes2.dex */
public final class C2561y<E> {

    /* renamed from: e */
    public static final a f10026e = new a(null);

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f10027f = AtomicReferenceFieldUpdater.newUpdater(C2561y.class, Object.class, "_next");

    /* renamed from: g */
    public static final AtomicLongFieldUpdater f10028g = AtomicLongFieldUpdater.newUpdater(C2561y.class, "_state");

    /* renamed from: h */
    public static final C2538l0 f10029h = new C2538l0("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a */
    public final int f10030a;

    /* renamed from: b */
    public final boolean f10031b;

    /* renamed from: c */
    public final int f10032c;

    /* renamed from: d */
    public final AtomicReferenceArray f10033d;

    /* renamed from: he.y$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final int m10210a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long m10211b(long j10, int i10) {
            return m10213d(j10, 1073741823L) | (i10 << 0);
        }

        /* renamed from: c */
        public final long m10212c(long j10, int i10) {
            return m10213d(j10, 1152921503533105152L) | (i10 << 30);
        }

        /* renamed from: d */
        public final long m10213d(long j10, long j11) {
            return j10 & (~j11);
        }
    }

    /* renamed from: he.y$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final int f10034a;

        public b(int i10) {
            this.f10034a = i10;
        }
    }

    public C2561y(int i10, boolean z10) {
        this.f10030a = i10;
        this.f10031b = z10;
        int i11 = i10 - 1;
        this.f10032c = i11;
        this.f10033d = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        return 1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m10199a(E r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = p116he.C2561y.f10028g
        L2:
            long r3 = r0.get(r14)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            he.y$a r15 = p116he.C2561y.f10026e
            int r15 = r15.m10210a(r3)
            return r15
        L16:
            he.y$a r1 = p116he.C2561y.f10026e
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            r9 = 0
            long r5 = r5 >> r9
            int r2 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r10 = 30
            long r5 = r5 >> r10
            int r10 = (int) r5
            int r11 = r14.f10032c
            int r5 = r10 + 2
            r5 = r5 & r11
            r6 = r2 & r11
            r12 = 1
            if (r5 != r6) goto L34
            return r12
        L34:
            boolean r5 = r14.f10031b
            r6 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L53
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r14.f10033d
            r13 = r10 & r11
            java.lang.Object r5 = r5.get(r13)
            if (r5 == 0) goto L53
            int r1 = r14.f10030a
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 < r3) goto L52
            int r10 = r10 - r2
            r2 = r10 & r6
            int r1 = r1 >> 1
            if (r2 <= r1) goto L2
        L52:
            return r12
        L53:
            int r2 = r10 + 1
            r2 = r2 & r6
            java.util.concurrent.atomic.AtomicLongFieldUpdater r5 = p116he.C2561y.f10028g
            long r12 = r1.m10212c(r3, r2)
            r1 = r5
            r2 = r14
            r5 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r14.f10033d
            r1 = r10 & r11
            r0.set(r1, r15)
            r0 = r14
        L6d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = p116he.C2561y.f10028g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L84
            he.y r0 = r0.m10207i()
            he.y r0 = r0.m10203e(r10, r15)
            if (r0 != 0) goto L6d
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p116he.C2561y.m10199a(java.lang.Object):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final C2561y<E> m10200b(long j10) {
        C2561y<E> c2561y = new C2561y<>(this.f10030a * 2, this.f10031b);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f10032c;
            if ((i10 & i12) == (i11 & i12)) {
                f10028g.set(c2561y, f10026e.m10213d(j10, 1152921504606846976L));
                return c2561y;
            }
            Object obj = this.f10033d.get(i12 & i10);
            if (obj == null) {
                obj = new b(i10);
            }
            c2561y.f10033d.set(c2561y.f10032c & i10, obj);
            i10++;
        }
    }

    /* renamed from: c */
    public final C2561y<E> m10201c(long j10) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10027f;
        while (true) {
            C2561y<E> c2561y = (C2561y) atomicReferenceFieldUpdater.get(this);
            if (c2561y != null) {
                return c2561y;
            }
            C1080o.m4523a(f10027f, this, null, m10200b(j10));
        }
    }

    /* renamed from: d */
    public final boolean m10202d() {
        long j10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10028g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    /* renamed from: e */
    public final C2561y<E> m10203e(int i10, E e10) {
        Object obj = this.f10033d.get(this.f10032c & i10);
        if (!(obj instanceof b) || ((b) obj).f10034a != i10) {
            return null;
        }
        this.f10033d.set(i10 & this.f10032c, e10);
        return this;
    }

    /* renamed from: f */
    public final int m10204f() {
        long j10 = f10028g.get(this);
        return (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0))) & 1073741823;
    }

    /* renamed from: g */
    public final boolean m10205g() {
        long j10 = f10028g.get(this);
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    /* renamed from: h */
    public final long m10206h() {
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10028g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, j11));
        return j11;
    }

    /* renamed from: i */
    public final C2561y<E> m10207i() {
        return m10201c(m10206h());
    }

    /* renamed from: j */
    public final Object m10208j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10028g;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j10) != 0) {
                return f10029h;
            }
            a aVar = f10026e;
            int i10 = (int) ((1073741823 & j10) >> 0);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f10032c;
            if ((i11 & i12) == (i10 & i12)) {
                return null;
            }
            Object obj = this.f10033d.get(i12 & i10);
            if (obj == null) {
                if (this.f10031b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i13 = (i10 + 1) & 1073741823;
                if (f10028g.compareAndSet(this, j10, aVar.m10211b(j10, i13))) {
                    this.f10033d.set(this.f10032c & i10, null);
                    return obj;
                }
                if (this.f10031b) {
                    C2561y<E> c2561y = this;
                    do {
                        c2561y = c2561y.m10209k(i10, i13);
                    } while (c2561y != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: k */
    public final C2561y<E> m10209k(int i10, int i11) {
        long j10;
        a aVar;
        int i12;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10028g;
        do {
            j10 = atomicLongFieldUpdater.get(this);
            aVar = f10026e;
            i12 = (int) ((1073741823 & j10) >> 0);
            if (C1101t0.m4573a()) {
                if (!(i12 == i10)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j10) != 0) {
                return m10207i();
            }
        } while (!f10028g.compareAndSet(this, j10, aVar.m10211b(j10, i11)));
        this.f10033d.set(this.f10032c & i12, null);
        return null;
    }
}
