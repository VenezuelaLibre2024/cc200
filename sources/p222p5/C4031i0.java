package p222p5;

import java.util.Arrays;

/* renamed from: p5.i0 */
/* loaded from: classes.dex */
public final class C4031i0<V> {

    /* renamed from: a */
    public long[] f14490a;

    /* renamed from: b */
    public V[] f14491b;

    /* renamed from: c */
    public int f14492c;

    /* renamed from: d */
    public int f14493d;

    public C4031i0() {
        this(10);
    }

    public C4031i0(int i10) {
        this.f14490a = new long[i10];
        this.f14491b = (V[]) m15338f(i10);
    }

    /* renamed from: f */
    public static <V> V[] m15338f(int i10) {
        return (V[]) new Object[i10];
    }

    /* renamed from: a */
    public synchronized void m15339a(long j10, V v10) {
        m15342d(j10);
        m15343e();
        m15340b(j10, v10);
    }

    /* renamed from: b */
    public final void m15340b(long j10, V v10) {
        int i10 = this.f14492c;
        int i11 = this.f14493d;
        V[] vArr = this.f14491b;
        int length = (i10 + i11) % vArr.length;
        this.f14490a[length] = j10;
        vArr[length] = v10;
        this.f14493d = i11 + 1;
    }

    /* renamed from: c */
    public synchronized void m15341c() {
        this.f14492c = 0;
        this.f14493d = 0;
        Arrays.fill(this.f14491b, (Object) null);
    }

    /* renamed from: d */
    public final void m15342d(long j10) {
        if (this.f14493d > 0) {
            if (j10 <= this.f14490a[((this.f14492c + r0) - 1) % this.f14491b.length]) {
                m15341c();
            }
        }
    }

    /* renamed from: e */
    public final void m15343e() {
        int length = this.f14491b.length;
        if (this.f14493d < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        V[] vArr = (V[]) m15338f(i10);
        int i11 = this.f14492c;
        int i12 = length - i11;
        System.arraycopy(this.f14490a, i11, jArr, 0, i12);
        System.arraycopy(this.f14491b, this.f14492c, vArr, 0, i12);
        int i13 = this.f14492c;
        if (i13 > 0) {
            System.arraycopy(this.f14490a, 0, jArr, i12, i13);
            System.arraycopy(this.f14491b, 0, vArr, i12, this.f14492c);
        }
        this.f14490a = jArr;
        this.f14491b = vArr;
        this.f14492c = 0;
    }

    /* renamed from: g */
    public final V m15344g(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f14493d > 0) {
            long j12 = j10 - this.f14490a[this.f14492c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = m15347j();
            j11 = j12;
        }
        return v10;
    }

    /* renamed from: h */
    public synchronized V m15345h() {
        return this.f14493d == 0 ? null : m15347j();
    }

    /* renamed from: i */
    public synchronized V m15346i(long j10) {
        return m15344g(j10, true);
    }

    /* renamed from: j */
    public final V m15347j() {
        C4014a.m15200f(this.f14493d > 0);
        V[] vArr = this.f14491b;
        int i10 = this.f14492c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f14492c = (i10 + 1) % vArr.length;
        this.f14493d--;
        return v10;
    }

    /* renamed from: k */
    public synchronized int m15348k() {
        return this.f14493d;
    }
}
