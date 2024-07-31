package p116he;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p038ce.C1101t0;
import p116he.InterfaceC2552s0;
import td.C4753m;

/* renamed from: he.r0 */
/* loaded from: classes2.dex */
public class C2550r0<T extends InterfaceC2552s0 & Comparable<? super T>> {

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f10002b = AtomicIntegerFieldUpdater.newUpdater(C2550r0.class, "_size");
    private volatile int _size;

    /* renamed from: a */
    public T[] f10003a;

    /* renamed from: a */
    public final void m10158a(T t10) {
        if (C1101t0.m4573a()) {
            if (!(t10.mo4514b() == null)) {
                throw new AssertionError();
            }
        }
        t10.mo4515f(this);
        T[] m10163f = m10163f();
        int m10160c = m10160c();
        m10167j(m10160c + 1);
        m10163f[m10160c] = t10;
        t10.mo4516h(m10160c);
        m10169l(m10160c);
    }

    /* renamed from: b */
    public final T m10159b() {
        T[] tArr = this.f10003a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public final int m10160c() {
        return f10002b.get(this);
    }

    /* renamed from: d */
    public final boolean m10161d() {
        return m10160c() == 0;
    }

    /* renamed from: e */
    public final T m10162e() {
        T m10159b;
        synchronized (this) {
            m10159b = m10159b();
        }
        return m10159b;
    }

    /* renamed from: f */
    public final T[] m10163f() {
        T[] tArr = this.f10003a;
        if (tArr == null) {
            T[] tArr2 = (T[]) new InterfaceC2552s0[4];
            this.f10003a = tArr2;
            return tArr2;
        }
        if (m10160c() < tArr.length) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, m10160c() * 2);
        C4753m.m18652e(copyOf, "copyOf(this, newSize)");
        T[] tArr3 = (T[]) ((InterfaceC2552s0[]) copyOf);
        this.f10003a = tArr3;
        return tArr3;
    }

    /* renamed from: g */
    public final boolean m10164g(T t10) {
        boolean z10;
        synchronized (this) {
            z10 = true;
            if (t10.mo4514b() == null) {
                z10 = false;
            } else {
                int mo4517i = t10.mo4517i();
                if (C1101t0.m4573a()) {
                    if (!(mo4517i >= 0)) {
                        throw new AssertionError();
                    }
                }
                m10165h(mo4517i);
            }
        }
        return z10;
    }

    /* renamed from: h */
    public final T m10165h(int i10) {
        if (C1101t0.m4573a()) {
            if (!(m10160c() > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.f10003a;
        C4753m.m18650c(tArr);
        m10167j(m10160c() - 1);
        if (i10 < m10160c()) {
            m10170m(i10, m10160c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                T t10 = tArr[i10];
                C4753m.m18650c(t10);
                T t11 = tArr[i11];
                C4753m.m18650c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    m10170m(i10, i11);
                    m10169l(i11);
                }
            }
            m10168k(i10);
        }
        T t12 = tArr[m10160c()];
        C4753m.m18650c(t12);
        if (C1101t0.m4573a()) {
            if (!(t12.mo4514b() == this)) {
                throw new AssertionError();
            }
        }
        t12.mo4515f(null);
        t12.mo4516h(-1);
        tArr[m10160c()] = null;
        return t12;
    }

    /* renamed from: i */
    public final T m10166i() {
        T m10165h;
        synchronized (this) {
            m10165h = m10160c() > 0 ? m10165h(0) : null;
        }
        return m10165h;
    }

    /* renamed from: j */
    public final void m10167j(int i10) {
        f10002b.set(this, i10);
    }

    /* renamed from: k */
    public final void m10168k(int i10) {
        while (true) {
            int i11 = (i10 * 2) + 1;
            if (i11 >= m10160c()) {
                return;
            }
            T[] tArr = this.f10003a;
            C4753m.m18650c(tArr);
            int i12 = i11 + 1;
            if (i12 < m10160c()) {
                T t10 = tArr[i12];
                C4753m.m18650c(t10);
                T t11 = tArr[i11];
                C4753m.m18650c(t11);
                if (((Comparable) t10).compareTo(t11) < 0) {
                    i11 = i12;
                }
            }
            T t12 = tArr[i10];
            C4753m.m18650c(t12);
            T t13 = tArr[i11];
            C4753m.m18650c(t13);
            if (((Comparable) t12).compareTo(t13) <= 0) {
                return;
            }
            m10170m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: l */
    public final void m10169l(int i10) {
        while (i10 > 0) {
            T[] tArr = this.f10003a;
            C4753m.m18650c(tArr);
            int i11 = (i10 - 1) / 2;
            T t10 = tArr[i11];
            C4753m.m18650c(t10);
            T t11 = tArr[i10];
            C4753m.m18650c(t11);
            if (((Comparable) t10).compareTo(t11) <= 0) {
                return;
            }
            m10170m(i10, i11);
            i10 = i11;
        }
    }

    /* renamed from: m */
    public final void m10170m(int i10, int i11) {
        T[] tArr = this.f10003a;
        C4753m.m18650c(tArr);
        T t10 = tArr[i11];
        C4753m.m18650c(t10);
        T t11 = tArr[i10];
        C4753m.m18650c(t11);
        tArr[i10] = t10;
        tArr[i11] = t11;
        t10.mo4516h(i10);
        t11.mo4516h(i11);
    }
}
