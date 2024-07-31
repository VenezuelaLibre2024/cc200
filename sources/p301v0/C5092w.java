package p301v0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import p079f6.C1841a;
import p301v0.C5028a0;

/* renamed from: v0.w */
/* loaded from: classes.dex */
public final class C5092w extends AbstractC5033c<Float> implements C5028a0.f, RandomAccess, InterfaceC5029a1 {

    /* renamed from: k */
    public static final C5092w f19215k;

    /* renamed from: i */
    public float[] f19216i;

    /* renamed from: j */
    public int f19217j;

    static {
        C5092w c5092w = new C5092w(new float[0], 0);
        f19215k = c5092w;
        c5092w.mo19803f();
    }

    public C5092w() {
        this(new float[10], 0);
    }

    public C5092w(float[] fArr, int i10) {
        this.f19216i = fArr;
        this.f19217j = i10;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        m19821a();
        C5028a0.m19789a(collection);
        if (!(collection instanceof C5092w)) {
            return super.addAll(collection);
        }
        C5092w c5092w = (C5092w) collection;
        int i10 = c5092w.f19217j;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19217j;
        if (C1841a.e.API_PRIORITY_OTHER - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f19216i;
        if (i12 > fArr.length) {
            this.f19216i = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(c5092w.f19216i, 0, this.f19216i, this.f19217j, c5092w.f19217j);
        this.f19217j = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        m20680e(i10, f10.floatValue());
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        m20679d(f10.floatValue());
        return true;
    }

    /* renamed from: d */
    public void m20679d(float f10) {
        m19821a();
        int i10 = this.f19217j;
        float[] fArr = this.f19216i;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f19216i = fArr2;
        }
        float[] fArr3 = this.f19216i;
        int i11 = this.f19217j;
        this.f19217j = i11 + 1;
        fArr3[i11] = f10;
    }

    /* renamed from: e */
    public final void m20680e(int i10, float f10) {
        int i11;
        m19821a();
        if (i10 < 0 || i10 > (i11 = this.f19217j)) {
            throw new IndexOutOfBoundsException(m20684m(i10));
        }
        float[] fArr = this.f19216i;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f19216i, i10, fArr2, i10 + 1, this.f19217j - i10);
            this.f19216i = fArr2;
        }
        this.f19216i[i10] = f10;
        this.f19217j++;
        ((AbstractList) this).modCount++;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5092w)) {
            return super.equals(obj);
        }
        C5092w c5092w = (C5092w) obj;
        if (this.f19217j != c5092w.f19217j) {
            return false;
        }
        float[] fArr = c5092w.f19216i;
        for (int i10 = 0; i10 < this.f19217j; i10++) {
            if (Float.floatToIntBits(this.f19216i[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final void m20681h(int i10) {
        if (i10 < 0 || i10 >= this.f19217j) {
            throw new IndexOutOfBoundsException(m20684m(i10));
        }
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19217j; i11++) {
            i10 = (i10 * 31) + Float.floatToIntBits(this.f19216i[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(m20683k(i10));
    }

    /* renamed from: k */
    public float m20683k(int i10) {
        m20681h(i10);
        return this.f19216i[i10];
    }

    /* renamed from: m */
    public final String m20684m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19217j;
    }

    @Override // p301v0.C5028a0.i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C5028a0.f mo19804i(int i10) {
        if (i10 >= this.f19217j) {
            return new C5092w(Arrays.copyOf(this.f19216i, i10), this.f19217j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        m19821a();
        m20681h(i10);
        float[] fArr = this.f19216i;
        float f10 = fArr[i10];
        if (i10 < this.f19217j - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f19217j--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(m20688q(i10, f10.floatValue()));
    }

    /* renamed from: q */
    public float m20688q(int i10, float f10) {
        m19821a();
        m20681h(i10);
        float[] fArr = this.f19216i;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        m19821a();
        for (int i10 = 0; i10 < this.f19217j; i10++) {
            if (obj.equals(Float.valueOf(this.f19216i[i10]))) {
                float[] fArr = this.f19216i;
                System.arraycopy(fArr, i10 + 1, fArr, i10, (this.f19217j - i10) - 1);
                this.f19217j--;
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
        float[] fArr = this.f19216i;
        System.arraycopy(fArr, i11, fArr, i10, this.f19217j - i11);
        this.f19217j -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19217j;
    }
}
