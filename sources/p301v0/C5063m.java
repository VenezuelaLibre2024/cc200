package p301v0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p079f6.C1841a;
import p301v0.C5028a0;

/* renamed from: v0.m */
/* loaded from: classes.dex */
public final class C5063m extends AbstractC5033c<Double> implements C5028a0.b, RandomAccess, InterfaceC5029a1 {

    /* renamed from: k */
    public static final C5063m f19025k;

    /* renamed from: i */
    public double[] f19026i;

    /* renamed from: j */
    public int f19027j;

    static {
        C5063m c5063m = new C5063m(new double[0], 0);
        f19025k = c5063m;
        c5063m.mo19803f();
    }

    public C5063m() {
        this(new double[10], 0);
    }

    public C5063m(double[] dArr, int i10) {
        this.f19026i = dArr;
        this.f19027j = i10;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        m19821a();
        C5028a0.m19789a(collection);
        if (!(collection instanceof C5063m)) {
            return super.addAll(collection);
        }
        C5063m c5063m = (C5063m) collection;
        int i10 = c5063m.f19027j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19027j;
        if (C1841a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f19026i;
        if (i12 > dArr.length) {
            this.f19026i = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(c5063m.f19026i, 0, this.f19026i, this.f19027j, c5063m.f19027j);
        this.f19027j = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        m20356e(i10, d10.doubleValue());
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        m20355d(d10.doubleValue());
        return true;
    }

    /* renamed from: d */
    public void m20355d(double d10) {
        m19821a();
        int i10 = this.f19027j;
        double[] dArr = this.f19026i;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f19026i = dArr2;
        }
        double[] dArr3 = this.f19026i;
        int i11 = this.f19027j;
        this.f19027j = i11 + 1;
        dArr3[i11] = d10;
    }

    /* renamed from: e */
    public final void m20356e(int i10, double d10) {
        int i11;
        m19821a();
        if (i10 < 0 || i10 > (i11 = this.f19027j)) {
            throw new IndexOutOfBoundsException(m20360m(i10));
        }
        double[] dArr = this.f19026i;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f19026i, i10, dArr2, i10 + 1, this.f19027j - i10);
            this.f19026i = dArr2;
        }
        this.f19026i[i10] = d10;
        this.f19027j++;
        ((AbstractList) this).modCount++;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5063m)) {
            return super.equals(obj);
        }
        C5063m c5063m = (C5063m) obj;
        if (this.f19027j != c5063m.f19027j) {
            return false;
        }
        double[] dArr = c5063m.f19026i;
        for (int i10 = 0; i10 < this.f19027j; i10++) {
            if (Double.doubleToLongBits(this.f19026i[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void m20357h(int i10) {
        if (i10 < 0 || i10 >= this.f19027j) {
            throw new IndexOutOfBoundsException(m20360m(i10));
        }
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19027j; i11++) {
            i10 = (i10 * 31) + C5028a0.m19794f(Double.doubleToLongBits(this.f19026i[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(m20359k(i10));
    }

    /* renamed from: k */
    public double m20359k(int i10) {
        m20357h(i10);
        return this.f19026i[i10];
    }

    /* renamed from: m */
    public final String m20360m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19027j;
    }

    @Override // p301v0.C5028a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5028a0.b mo19804i(int i10) {
        if (i10 >= this.f19027j) {
            return new C5063m(Arrays.copyOf(this.f19026i, i10), this.f19027j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        m19821a();
        m20357h(i10);
        double[] dArr = this.f19026i;
        double d10 = dArr[i10];
        if (i10 < this.f19027j - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f19027j--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(m20364q(i10, d10.doubleValue()));
    }

    /* renamed from: q */
    public double m20364q(int i10, double d10) {
        m19821a();
        m20357h(i10);
        double[] dArr = this.f19026i;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m19821a();
        for (int i10 = 0; i10 < this.f19027j; i10++) {
            if (obj.equals(Double.valueOf(this.f19026i[i10]))) {
                double[] dArr = this.f19026i;
                System.arraycopy(dArr, i10 + 1, dArr, i10, (this.f19027j - i10) - 1);
                this.f19027j--;
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
        double[] dArr = this.f19026i;
        System.arraycopy(dArr, i11, dArr, i10, this.f19027j - i11);
        this.f19027j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19027j;
    }
}
