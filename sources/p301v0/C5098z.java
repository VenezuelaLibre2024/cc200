package p301v0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p079f6.C1841a;
import p301v0.C5028a0;

/* renamed from: v0.z */
/* loaded from: classes.dex */
public final class C5098z extends AbstractC5033c<Integer> implements C5028a0.g, RandomAccess, InterfaceC5029a1 {

    /* renamed from: k */
    public static final C5098z f19240k;

    /* renamed from: i */
    public int[] f19241i;

    /* renamed from: j */
    public int f19242j;

    static {
        C5098z c5098z = new C5098z(new int[0], 0);
        f19240k = c5098z;
        c5098z.mo19803f();
    }

    public C5098z() {
        this(new int[10], 0);
    }

    public C5098z(int[] iArr, int i10) {
        this.f19241i = iArr;
        this.f19242j = i10;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        m19821a();
        C5028a0.m19789a(collection);
        if (!(collection instanceof C5098z)) {
            return super.addAll(collection);
        }
        C5098z c5098z = (C5098z) collection;
        int i10 = c5098z.f19242j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19242j;
        if (C1841a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f19241i;
        if (i12 > iArr.length) {
            this.f19241i = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(c5098z.f19241i, 0, this.f19241i, this.f19242j, c5098z.f19242j);
        this.f19242j = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        m20732e(i10, num.intValue());
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        m20731d(num.intValue());
        return true;
    }

    /* renamed from: d */
    public void m20731d(int i10) {
        m19821a();
        int i11 = this.f19242j;
        int[] iArr = this.f19241i;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f19241i = iArr2;
        }
        int[] iArr3 = this.f19241i;
        int i12 = this.f19242j;
        this.f19242j = i12 + 1;
        iArr3[i12] = i10;
    }

    /* renamed from: e */
    public final void m20732e(int i10, int i11) {
        int i12;
        m19821a();
        if (i10 < 0 || i10 > (i12 = this.f19242j)) {
            throw new IndexOutOfBoundsException(m20736m(i10));
        }
        int[] iArr = this.f19241i;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f19241i, i10, iArr2, i10 + 1, this.f19242j - i10);
            this.f19241i = iArr2;
        }
        this.f19241i[i10] = i11;
        this.f19242j++;
        ((AbstractList) this).modCount++;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5098z)) {
            return super.equals(obj);
        }
        C5098z c5098z = (C5098z) obj;
        if (this.f19242j != c5098z.f19242j) {
            return false;
        }
        int[] iArr = c5098z.f19241i;
        for (int i10 = 0; i10 < this.f19242j; i10++) {
            if (this.f19241i[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void m20733h(int i10) {
        if (i10 < 0 || i10 >= this.f19242j) {
            throw new IndexOutOfBoundsException(m20736m(i10));
        }
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19242j; i11++) {
            i10 = (i10 * 31) + this.f19241i[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(m20735k(i10));
    }

    /* renamed from: k */
    public int m20735k(int i10) {
        m20733h(i10);
        return this.f19241i[i10];
    }

    /* renamed from: m */
    public final String m20736m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19242j;
    }

    @Override // p301v0.C5028a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5028a0.g mo19804i(int i10) {
        if (i10 >= this.f19242j) {
            return new C5098z(Arrays.copyOf(this.f19241i, i10), this.f19242j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        m19821a();
        m20733h(i10);
        int[] iArr = this.f19241i;
        int i11 = iArr[i10];
        if (i10 < this.f19242j - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f19242j--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(m20740q(i10, num.intValue()));
    }

    /* renamed from: q */
    public int m20740q(int i10, int i11) {
        m19821a();
        m20733h(i10);
        int[] iArr = this.f19241i;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m19821a();
        for (int i10 = 0; i10 < this.f19242j; i10++) {
            if (obj.equals(Integer.valueOf(this.f19241i[i10]))) {
                int[] iArr = this.f19241i;
                System.arraycopy(iArr, i10 + 1, iArr, i10, (this.f19242j - i10) - 1);
                this.f19242j--;
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
        int[] iArr = this.f19241i;
        System.arraycopy(iArr, i11, iArr, i10, this.f19242j - i11);
        this.f19242j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19242j;
    }
}
