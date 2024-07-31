package p301v0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p079f6.C1841a;
import p301v0.C5028a0;

/* renamed from: v0.f */
/* loaded from: classes.dex */
public final class C5042f extends AbstractC5033c<Boolean> implements C5028a0.a, RandomAccess, InterfaceC5029a1 {

    /* renamed from: k */
    public static final C5042f f18915k;

    /* renamed from: i */
    public boolean[] f18916i;

    /* renamed from: j */
    public int f18917j;

    static {
        C5042f c5042f = new C5042f(new boolean[0], 0);
        f18915k = c5042f;
        c5042f.mo19803f();
    }

    public C5042f() {
        this(new boolean[10], 0);
    }

    public C5042f(boolean[] zArr, int i10) {
        this.f18916i = zArr;
        this.f18917j = i10;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        m19821a();
        C5028a0.m19789a(collection);
        if (!(collection instanceof C5042f)) {
            return super.addAll(collection);
        }
        C5042f c5042f = (C5042f) collection;
        int i10 = c5042f.f18917j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18917j;
        if (C1841a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f18916i;
        if (i12 > zArr.length) {
            this.f18916i = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(c5042f.f18916i, 0, this.f18916i, this.f18917j, c5042f.f18917j);
        this.f18917j = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        m19917d(i10, bool.booleanValue());
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        m19918e(bool.booleanValue());
        return true;
    }

    /* renamed from: d */
    public final void m19917d(int i10, boolean z10) {
        int i11;
        m19821a();
        if (i10 < 0 || i10 > (i11 = this.f18917j)) {
            throw new IndexOutOfBoundsException(m19922m(i10));
        }
        boolean[] zArr = this.f18916i;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f18916i, i10, zArr2, i10 + 1, this.f18917j - i10);
            this.f18916i = zArr2;
        }
        this.f18916i[i10] = z10;
        this.f18917j++;
        ((AbstractList) this).modCount++;
    }

    /* renamed from: e */
    public void m19918e(boolean z10) {
        m19821a();
        int i10 = this.f18917j;
        boolean[] zArr = this.f18916i;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f18916i = zArr2;
        }
        boolean[] zArr3 = this.f18916i;
        int i11 = this.f18917j;
        this.f18917j = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5042f)) {
            return super.equals(obj);
        }
        C5042f c5042f = (C5042f) obj;
        if (this.f18917j != c5042f.f18917j) {
            return false;
        }
        boolean[] zArr = c5042f.f18916i;
        for (int i10 = 0; i10 < this.f18917j; i10++) {
            if (this.f18916i[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void m19919h(int i10) {
        if (i10 < 0 || i10 >= this.f18917j) {
            throw new IndexOutOfBoundsException(m19922m(i10));
        }
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f18917j; i11++) {
            i10 = (i10 * 31) + C5028a0.m19791c(this.f18916i[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(m19921k(i10));
    }

    /* renamed from: k */
    public boolean m19921k(int i10) {
        m19919h(i10);
        return this.f18916i[i10];
    }

    /* renamed from: m */
    public final String m19922m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f18917j;
    }

    @Override // p301v0.C5028a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5028a0.a mo19804i(int i10) {
        if (i10 >= this.f18917j) {
            return new C5042f(Arrays.copyOf(this.f18916i, i10), this.f18917j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        m19821a();
        m19919h(i10);
        boolean[] zArr = this.f18916i;
        boolean z10 = zArr[i10];
        if (i10 < this.f18917j - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f18917j--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(m19926q(i10, bool.booleanValue()));
    }

    /* renamed from: q */
    public boolean m19926q(int i10, boolean z10) {
        m19821a();
        m19919h(i10);
        boolean[] zArr = this.f18916i;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m19821a();
        for (int i10 = 0; i10 < this.f18917j; i10++) {
            if (obj.equals(Boolean.valueOf(this.f18916i[i10]))) {
                boolean[] zArr = this.f18916i;
                System.arraycopy(zArr, i10 + 1, zArr, i10, (this.f18917j - i10) - 1);
                this.f18917j--;
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
        boolean[] zArr = this.f18916i;
        System.arraycopy(zArr, i11, zArr, i10, this.f18917j - i11);
        this.f18917j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f18917j;
    }
}
