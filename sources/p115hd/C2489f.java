package p115hd;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p079f6.C1841a;
import p343xd.C5767k;
import td.C4747g;
import td.C4753m;

/* renamed from: hd.f */
/* loaded from: classes2.dex */
public final class C2489f<E> extends AbstractC2485d<E> {

    /* renamed from: k */
    public static final a f9918k = new a(null);

    /* renamed from: l */
    public static final Object[] f9919l = new Object[0];

    /* renamed from: h */
    public int f9920h;

    /* renamed from: i */
    public Object[] f9921i = f9919l;

    /* renamed from: j */
    public int f9922j;

    /* renamed from: hd.f$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final int m9919a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - 2147483639 <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return C1841a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }
    }

    @Override // p115hd.AbstractC2485d
    /* renamed from: a */
    public int mo9890a() {
        return this.f9922j;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        AbstractC2483c.f9909h.m9884b(i10, size());
        if (i10 == size()) {
            m9908d(e10);
            return;
        }
        if (i10 == 0) {
            m9907c(e10);
            return;
        }
        m9912k(size() + 1);
        int m9915o = m9915o(this.f9920h + i10);
        if (i10 < ((size() + 1) >> 1)) {
            int m9911j = m9911j(m9915o);
            int m9911j2 = m9911j(this.f9920h);
            int i11 = this.f9920h;
            if (m9911j >= i11) {
                Object[] objArr = this.f9921i;
                objArr[m9911j2] = objArr[i11];
                C2495i.m9933d(objArr, objArr, i11, i11 + 1, m9911j + 1);
            } else {
                Object[] objArr2 = this.f9921i;
                C2495i.m9933d(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                Object[] objArr3 = this.f9921i;
                objArr3[objArr3.length - 1] = objArr3[0];
                C2495i.m9933d(objArr3, objArr3, 0, 1, m9911j + 1);
            }
            this.f9921i[m9911j] = e10;
            this.f9920h = m9911j2;
        } else {
            int m9915o2 = m9915o(this.f9920h + size());
            Object[] objArr4 = this.f9921i;
            if (m9915o < m9915o2) {
                C2495i.m9933d(objArr4, objArr4, m9915o + 1, m9915o, m9915o2);
            } else {
                C2495i.m9933d(objArr4, objArr4, 1, 0, m9915o2);
                Object[] objArr5 = this.f9921i;
                objArr5[0] = objArr5[objArr5.length - 1];
                C2495i.m9933d(objArr5, objArr5, m9915o + 1, m9915o, objArr5.length - 1);
            }
            this.f9921i[m9915o] = e10;
        }
        this.f9922j = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e10) {
        m9908d(e10);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        C4753m.m18653f(collection, "elements");
        AbstractC2483c.f9909h.m9884b(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        m9912k(size() + collection.size());
        int m9915o = m9915o(this.f9920h + size());
        int m9915o2 = m9915o(this.f9920h + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f9920h;
            int i12 = i11 - size;
            if (m9915o2 < i11) {
                Object[] objArr = this.f9921i;
                C2495i.m9933d(objArr, objArr, i12, i11, objArr.length);
                Object[] objArr2 = this.f9921i;
                if (size >= m9915o2) {
                    C2495i.m9933d(objArr2, objArr2, objArr2.length - size, 0, m9915o2);
                } else {
                    C2495i.m9933d(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.f9921i;
                    C2495i.m9933d(objArr3, objArr3, 0, size, m9915o2);
                }
            } else if (i12 >= 0) {
                Object[] objArr4 = this.f9921i;
                C2495i.m9933d(objArr4, objArr4, i12, i11, m9915o2);
            } else {
                Object[] objArr5 = this.f9921i;
                i12 += objArr5.length;
                int i13 = m9915o2 - i11;
                int length = objArr5.length - i12;
                if (length >= i13) {
                    C2495i.m9933d(objArr5, objArr5, i12, i11, m9915o2);
                } else {
                    C2495i.m9933d(objArr5, objArr5, i12, i11, i11 + length);
                    Object[] objArr6 = this.f9921i;
                    C2495i.m9933d(objArr6, objArr6, 0, this.f9920h + length, m9915o2);
                }
            }
            this.f9920h = i12;
            m9909e(m9914n(m9915o2 - size), collection);
        } else {
            int i14 = m9915o2 + size;
            if (m9915o2 < m9915o) {
                int i15 = size + m9915o;
                Object[] objArr7 = this.f9921i;
                if (i15 > objArr7.length) {
                    if (i14 >= objArr7.length) {
                        i14 -= objArr7.length;
                    } else {
                        int length2 = m9915o - (i15 - objArr7.length);
                        C2495i.m9933d(objArr7, objArr7, 0, length2, m9915o);
                        Object[] objArr8 = this.f9921i;
                        C2495i.m9933d(objArr8, objArr8, i14, m9915o2, length2);
                    }
                }
                C2495i.m9933d(objArr7, objArr7, i14, m9915o2, m9915o);
            } else {
                Object[] objArr9 = this.f9921i;
                C2495i.m9933d(objArr9, objArr9, size, 0, m9915o);
                Object[] objArr10 = this.f9921i;
                if (i14 >= objArr10.length) {
                    C2495i.m9933d(objArr10, objArr10, i14 - objArr10.length, m9915o2, objArr10.length);
                } else {
                    C2495i.m9933d(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.f9921i;
                    C2495i.m9933d(objArr11, objArr11, i14, m9915o2, objArr11.length - size);
                }
            }
            m9909e(m9915o2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        C4753m.m18653f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m9912k(size() + collection.size());
        m9909e(m9915o(this.f9920h + size()), collection);
        return true;
    }

    @Override // p115hd.AbstractC2485d
    /* renamed from: b */
    public E mo9891b(int i10) {
        AbstractC2483c.f9909h.m9883a(i10, size());
        if (i10 == C2502n.m9990f(this)) {
            return m9918s();
        }
        if (i10 == 0) {
            return m9916p();
        }
        int m9915o = m9915o(this.f9920h + i10);
        E e10 = (E) this.f9921i[m9915o];
        if (i10 < (size() >> 1)) {
            int i11 = this.f9920h;
            if (m9915o >= i11) {
                Object[] objArr = this.f9921i;
                C2495i.m9933d(objArr, objArr, i11 + 1, i11, m9915o);
            } else {
                Object[] objArr2 = this.f9921i;
                C2495i.m9933d(objArr2, objArr2, 1, 0, m9915o);
                Object[] objArr3 = this.f9921i;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f9920h;
                C2495i.m9933d(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f9921i;
            int i13 = this.f9920h;
            objArr4[i13] = null;
            this.f9920h = m9913m(i13);
        } else {
            int m9915o2 = m9915o(this.f9920h + C2502n.m9990f(this));
            Object[] objArr5 = this.f9921i;
            if (m9915o <= m9915o2) {
                C2495i.m9933d(objArr5, objArr5, m9915o, m9915o + 1, m9915o2 + 1);
            } else {
                C2495i.m9933d(objArr5, objArr5, m9915o, m9915o + 1, objArr5.length);
                Object[] objArr6 = this.f9921i;
                objArr6[objArr6.length - 1] = objArr6[0];
                C2495i.m9933d(objArr6, objArr6, 0, 1, m9915o2 + 1);
            }
            this.f9921i[m9915o2] = null;
        }
        this.f9922j = size() - 1;
        return e10;
    }

    /* renamed from: c */
    public final void m9907c(E e10) {
        m9912k(size() + 1);
        int m9911j = m9911j(this.f9920h);
        this.f9920h = m9911j;
        this.f9921i[m9911j] = e10;
        this.f9922j = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        int m9915o = m9915o(this.f9920h + size());
        int i10 = this.f9920h;
        if (i10 < m9915o) {
            C2495i.m9935f(this.f9921i, null, i10, m9915o);
        } else if (!isEmpty()) {
            Object[] objArr = this.f9921i;
            C2495i.m9935f(objArr, null, this.f9920h, objArr.length);
            C2495i.m9935f(this.f9921i, null, 0, m9915o);
        }
        this.f9920h = 0;
        this.f9922j = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* renamed from: d */
    public final void m9908d(E e10) {
        m9912k(size() + 1);
        this.f9921i[m9915o(this.f9920h + size())] = e10;
        this.f9922j = size() + 1;
    }

    /* renamed from: e */
    public final void m9909e(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f9921i.length;
        while (i10 < length && it.hasNext()) {
            this.f9921i[i10] = it.next();
            i10++;
        }
        int i11 = this.f9920h;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f9921i[i12] = it.next();
        }
        this.f9922j = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        AbstractC2483c.f9909h.m9883a(i10, size());
        return (E) this.f9921i[m9915o(this.f9920h + i10)];
    }

    /* renamed from: h */
    public final void m9910h(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f9921i;
        C2495i.m9933d(objArr2, objArr, 0, this.f9920h, objArr2.length);
        Object[] objArr3 = this.f9921i;
        int length = objArr3.length;
        int i11 = this.f9920h;
        C2495i.m9933d(objArr3, objArr, length - i11, 0, i11);
        this.f9920h = 0;
        this.f9921i = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int m9915o = m9915o(this.f9920h + size());
        int i10 = this.f9920h;
        if (i10 < m9915o) {
            while (i10 < m9915o) {
                if (!C4753m.m18648a(obj, this.f9921i[i10])) {
                    i10++;
                }
            }
            return -1;
        }
        if (i10 < m9915o) {
            return -1;
        }
        int length = this.f9921i.length;
        while (true) {
            if (i10 >= length) {
                for (int i11 = 0; i11 < m9915o; i11++) {
                    if (C4753m.m18648a(obj, this.f9921i[i11])) {
                        i10 = i11 + this.f9921i.length;
                    }
                }
                return -1;
            }
            if (C4753m.m18648a(obj, this.f9921i[i10])) {
                break;
            }
            i10++;
        }
        return i10 - this.f9920h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final int m9911j(int i10) {
        return i10 == 0 ? C2497j.m9968m(this.f9921i) : i10 - 1;
    }

    /* renamed from: k */
    public final void m9912k(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f9921i;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f9919l) {
            this.f9921i = new Object[C5767k.m22904a(i10, 10)];
        } else {
            m9910h(f9918k.m9919a(objArr.length, i10));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int m9968m;
        int m9915o = m9915o(this.f9920h + size());
        int i10 = this.f9920h;
        if (i10 < m9915o) {
            m9968m = m9915o - 1;
            if (i10 <= m9968m) {
                while (!C4753m.m18648a(obj, this.f9921i[m9968m])) {
                    if (m9968m != i10) {
                        m9968m--;
                    }
                }
                return m9968m - this.f9920h;
            }
            return -1;
        }
        if (i10 > m9915o) {
            int i11 = m9915o - 1;
            while (true) {
                if (-1 >= i11) {
                    m9968m = C2497j.m9968m(this.f9921i);
                    int i12 = this.f9920h;
                    if (i12 <= m9968m) {
                        while (!C4753m.m18648a(obj, this.f9921i[m9968m])) {
                            if (m9968m != i12) {
                                m9968m--;
                            }
                        }
                    }
                } else {
                    if (C4753m.m18648a(obj, this.f9921i[i11])) {
                        m9968m = i11 + this.f9921i.length;
                        break;
                    }
                    i11--;
                }
            }
        }
        return -1;
    }

    /* renamed from: m */
    public final int m9913m(int i10) {
        if (i10 == C2497j.m9968m(this.f9921i)) {
            return 0;
        }
        return i10 + 1;
    }

    /* renamed from: n */
    public final int m9914n(int i10) {
        return i10 < 0 ? i10 + this.f9921i.length : i10;
    }

    /* renamed from: o */
    public final int m9915o(int i10) {
        Object[] objArr = this.f9921i;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    /* renamed from: p */
    public final E m9916p() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f9921i;
        int i10 = this.f9920h;
        E e10 = (E) objArr[i10];
        objArr[i10] = null;
        this.f9920h = m9913m(i10);
        this.f9922j = size() - 1;
        return e10;
    }

    /* renamed from: q */
    public final E m9917q() {
        if (isEmpty()) {
            return null;
        }
        return m9916p();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<? extends Object> collection) {
        int m9915o;
        C4753m.m18653f(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f9921i.length == 0) == false) {
                int m9915o2 = m9915o(this.f9920h + size());
                int i10 = this.f9920h;
                if (i10 < m9915o2) {
                    m9915o = i10;
                    while (i10 < m9915o2) {
                        Object obj = this.f9921i[i10];
                        if (!collection.contains(obj)) {
                            this.f9921i[m9915o] = obj;
                            m9915o++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    C2495i.m9935f(this.f9921i, null, m9915o, m9915o2);
                } else {
                    int length = this.f9921i.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f9921i;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (!collection.contains(obj2)) {
                            this.f9921i[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    m9915o = m9915o(i11);
                    for (int i12 = 0; i12 < m9915o2; i12++) {
                        Object[] objArr2 = this.f9921i;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (!collection.contains(obj3)) {
                            this.f9921i[m9915o] = obj3;
                            m9915o = m9913m(m9915o);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f9922j = m9914n(m9915o - this.f9920h);
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<? extends Object> collection) {
        int m9915o;
        C4753m.m18653f(collection, "elements");
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (!isEmpty()) {
            if ((this.f9921i.length == 0) == false) {
                int m9915o2 = m9915o(this.f9920h + size());
                int i10 = this.f9920h;
                if (i10 < m9915o2) {
                    m9915o = i10;
                    while (i10 < m9915o2) {
                        Object obj = this.f9921i[i10];
                        if (collection.contains(obj)) {
                            this.f9921i[m9915o] = obj;
                            m9915o++;
                        } else {
                            z10 = true;
                        }
                        i10++;
                    }
                    C2495i.m9935f(this.f9921i, null, m9915o, m9915o2);
                } else {
                    int length = this.f9921i.length;
                    boolean z11 = false;
                    int i11 = i10;
                    while (i10 < length) {
                        Object[] objArr = this.f9921i;
                        Object obj2 = objArr[i10];
                        objArr[i10] = null;
                        if (collection.contains(obj2)) {
                            this.f9921i[i11] = obj2;
                            i11++;
                        } else {
                            z11 = true;
                        }
                        i10++;
                    }
                    m9915o = m9915o(i11);
                    for (int i12 = 0; i12 < m9915o2; i12++) {
                        Object[] objArr2 = this.f9921i;
                        Object obj3 = objArr2[i12];
                        objArr2[i12] = null;
                        if (collection.contains(obj3)) {
                            this.f9921i[m9915o] = obj3;
                            m9915o = m9913m(m9915o);
                        } else {
                            z11 = true;
                        }
                    }
                    z10 = z11;
                }
                if (z10) {
                    this.f9922j = m9914n(m9915o - this.f9920h);
                }
            }
        }
        return z10;
    }

    /* renamed from: s */
    public final E m9918s() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int m9915o = m9915o(this.f9920h + C2502n.m9990f(this));
        Object[] objArr = this.f9921i;
        E e10 = (E) objArr[m9915o];
        objArr[m9915o] = null;
        this.f9922j = size() - 1;
        return e10;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        AbstractC2483c.f9909h.m9883a(i10, size());
        int m9915o = m9915o(this.f9920h + i10);
        Object[] objArr = this.f9921i;
        E e11 = (E) objArr[m9915o];
        objArr[m9915o] = e10;
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        C4753m.m18653f(tArr, "array");
        if (tArr.length < size()) {
            tArr = (T[]) C2491g.m9927a(tArr, size());
        }
        int m9915o = m9915o(this.f9920h + size());
        int i10 = this.f9920h;
        if (i10 < m9915o) {
            C2495i.m9934e(this.f9921i, tArr, 0, i10, m9915o, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f9921i;
            C2495i.m9933d(objArr, tArr, 0, this.f9920h, objArr.length);
            Object[] objArr2 = this.f9921i;
            C2495i.m9933d(objArr2, tArr, objArr2.length - this.f9920h, 0, m9915o);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }
}
