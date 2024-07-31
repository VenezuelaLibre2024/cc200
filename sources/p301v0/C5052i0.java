package p301v0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p079f6.C1841a;
import p301v0.C5028a0;

/* renamed from: v0.i0 */
/* loaded from: classes.dex */
public final class C5052i0 extends AbstractC5033c<Long> implements C5028a0.h, RandomAccess, InterfaceC5029a1 {

    /* renamed from: k */
    public static final C5052i0 f18959k;

    /* renamed from: i */
    public long[] f18960i;

    /* renamed from: j */
    public int f18961j;

    static {
        C5052i0 c5052i0 = new C5052i0(new long[0], 0);
        f18959k = c5052i0;
        c5052i0.mo19803f();
    }

    public C5052i0() {
        this(new long[10], 0);
    }

    public C5052i0(long[] jArr, int i10) {
        this.f18960i = jArr;
        this.f18961j = i10;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        m19821a();
        C5028a0.m19789a(collection);
        if (!(collection instanceof C5052i0)) {
            return super.addAll(collection);
        }
        C5052i0 c5052i0 = (C5052i0) collection;
        int i10 = c5052i0.f18961j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18961j;
        if (C1841a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f18960i;
        if (i12 > jArr.length) {
            this.f18960i = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(c5052i0.f18960i, 0, this.f18960i, this.f18961j, c5052i0.f18961j);
        this.f18961j = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        m20054d(i10, l10.longValue());
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        m20055e(l10.longValue());
        return true;
    }

    /* renamed from: d */
    public final void m20054d(int i10, long j10) {
        int i11;
        m19821a();
        if (i10 < 0 || i10 > (i11 = this.f18961j)) {
            throw new IndexOutOfBoundsException(m20059m(i10));
        }
        long[] jArr = this.f18960i;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f18960i, i10, jArr2, i10 + 1, this.f18961j - i10);
            this.f18960i = jArr2;
        }
        this.f18960i[i10] = j10;
        this.f18961j++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: e */
    public void m20055e(long j10) {
        m19821a();
        int i10 = this.f18961j;
        long[] jArr = this.f18960i;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f18960i = jArr2;
        }
        long[] jArr3 = this.f18960i;
        int i11 = this.f18961j;
        this.f18961j = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5052i0)) {
            return super.equals(obj);
        }
        C5052i0 c5052i0 = (C5052i0) obj;
        if (this.f18961j != c5052i0.f18961j) {
            return false;
        }
        long[] jArr = c5052i0.f18960i;
        for (int i10 = 0; i10 < this.f18961j; i10++) {
            if (this.f18960i[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void m20056h(int i10) {
        if (i10 < 0 || i10 >= this.f18961j) {
            throw new IndexOutOfBoundsException(m20059m(i10));
        }
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f18961j; i11++) {
            i10 = (i10 * 31) + C5028a0.m19794f(this.f18960i[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(m20058k(i10));
    }

    /* renamed from: k */
    public long m20058k(int i10) {
        m20056h(i10);
        return this.f18960i[i10];
    }

    /* renamed from: m */
    public final String m20059m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f18961j;
    }

    @Override // p301v0.C5028a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5028a0.h mo19804i(int i10) {
        if (i10 >= this.f18961j) {
            return new C5052i0(Arrays.copyOf(this.f18960i, i10), this.f18961j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        m19821a();
        m20056h(i10);
        long[] jArr = this.f18960i;
        long j10 = jArr[i10];
        if (i10 < this.f18961j - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f18961j--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(m20063q(i10, l10.longValue()));
    }

    /* renamed from: q */
    public long m20063q(int i10, long j10) {
        m19821a();
        m20056h(i10);
        long[] jArr = this.f18960i;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m19821a();
        for (int i10 = 0; i10 < this.f18961j; i10++) {
            if (obj.equals(Long.valueOf(this.f18960i[i10]))) {
                long[] jArr = this.f18960i;
                System.arraycopy(jArr, i10 + 1, jArr, i10, (this.f18961j - i10) - 1);
                this.f18961j--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i10, int i11) {
        m19821a();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f18960i;
        System.arraycopy(jArr, i11, jArr, i10, this.f18961j - i11);
        this.f18961j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f18961j;
    }
}
