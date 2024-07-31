package p301v0;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: v0.d1 */
/* loaded from: classes.dex */
public final class C5038d1<E> extends AbstractC5033c<E> implements RandomAccess {

    /* renamed from: k */
    public static final C5038d1<Object> f18895k;

    /* renamed from: i */
    public E[] f18896i;

    /* renamed from: j */
    public int f18897j;

    static {
        C5038d1<Object> c5038d1 = new C5038d1<>(new Object[0], 0);
        f18895k = c5038d1;
        c5038d1.mo19803f();
    }

    public C5038d1(E[] eArr, int i10) {
        this.f18896i = eArr;
        this.f18897j = i10;
    }

    /* renamed from: b */
    public static <E> E[] m19834b(int i10) {
        return (E[]) new Object[i10];
    }

    /* renamed from: c */
    public static <E> C5038d1<E> m19835c() {
        return (C5038d1<E>) f18895k;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        int i11;
        m19821a();
        if (i10 < 0 || i10 > (i11 = this.f18897j)) {
            throw new IndexOutOfBoundsException(m19837e(i10));
        }
        E[] eArr = this.f18896i;
        if (i11 < eArr.length) {
            System.arraycopy(eArr, i10, eArr, i10 + 1, i11 - i10);
        } else {
            E[] eArr2 = (E[]) m19834b(((i11 * 3) / 2) + 1);
            System.arraycopy(this.f18896i, 0, eArr2, 0, i10);
            System.arraycopy(this.f18896i, i10, eArr2, i10 + 1, this.f18897j - i10);
            this.f18896i = eArr2;
        }
        this.f18896i[i10] = e10;
        this.f18897j++;
        ((AbstractList) this).modCount++;
    }

    @Override // p301v0.AbstractC5033c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m19821a();
        int i10 = this.f18897j;
        E[] eArr = this.f18896i;
        if (i10 == eArr.length) {
            this.f18896i = (E[]) Arrays.copyOf(eArr, ((i10 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f18896i;
        int i11 = this.f18897j;
        this.f18897j = i11 + 1;
        eArr2[i11] = e10;
        ((AbstractList) this).modCount++;
        return true;
    }

    /* renamed from: d */
    public final void m19836d(int i10) {
        if (i10 < 0 || i10 >= this.f18897j) {
            throw new IndexOutOfBoundsException(m19837e(i10));
        }
    }

    /* renamed from: e */
    public final String m19837e(int i10) {
        return "Index:" + i10 + ", Size:" + this.f18897j;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        m19836d(i10);
        return this.f18896i[i10];
    }

    @Override // p301v0.C5028a0.i
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public C5038d1<E> mo19804i(int i10) {
        if (i10 >= this.f18897j) {
            return new C5038d1<>(Arrays.copyOf(this.f18896i, i10), this.f18897j);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        m19821a();
        m19836d(i10);
        E[] eArr = this.f18896i;
        E e10 = eArr[i10];
        if (i10 < this.f18897j - 1) {
            System.arraycopy(eArr, i10 + 1, eArr, i10, (r2 - i10) - 1);
        }
        this.f18897j--;
        ((AbstractList) this).modCount++;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        m19821a();
        m19836d(i10);
        E[] eArr = this.f18896i;
        E e11 = eArr[i10];
        eArr[i10] = e10;
        ((AbstractList) this).modCount++;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f18897j;
    }
}
