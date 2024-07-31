package p285u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: u.b */
/* loaded from: classes.dex */
public final class C4772b<E> implements Collection<E>, Set<E> {

    /* renamed from: l */
    public static final int[] f17757l = new int[0];

    /* renamed from: m */
    public static final Object[] f17758m = new Object[0];

    /* renamed from: n */
    public static Object[] f17759n;

    /* renamed from: o */
    public static int f17760o;

    /* renamed from: p */
    public static Object[] f17761p;

    /* renamed from: q */
    public static int f17762q;

    /* renamed from: h */
    public int[] f17763h;

    /* renamed from: i */
    public Object[] f17764i;

    /* renamed from: j */
    public int f17765j;

    /* renamed from: k */
    public AbstractC4776f<E, E> f17766k;

    /* renamed from: u.b$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4776f<E, E> {
        public a() {
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: a */
        public void mo18707a() {
            C4772b.this.clear();
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: b */
        public Object mo18708b(int i10, int i11) {
            return C4772b.this.f17764i[i10];
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: c */
        public Map<E, E> mo18709c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: d */
        public int mo18710d() {
            return C4772b.this.f17765j;
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: e */
        public int mo18711e(Object obj) {
            return C4772b.this.indexOf(obj);
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: f */
        public int mo18712f(Object obj) {
            return C4772b.this.indexOf(obj);
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: g */
        public void mo18713g(E e10, E e11) {
            C4772b.this.add(e10);
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: h */
        public void mo18714h(int i10) {
            C4772b.this.m18722j(i10);
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: i */
        public E mo18715i(int i10, E e10) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C4772b() {
        this(0);
    }

    public C4772b(int i10) {
        if (i10 == 0) {
            this.f17763h = f17757l;
            this.f17764i = f17758m;
        } else {
            m18717a(i10);
        }
        this.f17765j = 0;
    }

    /* renamed from: c */
    public static void m18716c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C4772b.class) {
                if (f17762q < 10) {
                    objArr[0] = f17761p;
                    objArr[1] = iArr;
                    for (int i11 = i10 - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f17761p = objArr;
                    f17762q++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C4772b.class) {
                if (f17760o < 10) {
                    objArr[0] = f17759n;
                    objArr[1] = iArr;
                    for (int i12 = i10 - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f17759n = objArr;
                    f17760o++;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m18717a(int i10) {
        if (i10 == 8) {
            synchronized (C4772b.class) {
                Object[] objArr = f17761p;
                if (objArr != null) {
                    this.f17764i = objArr;
                    f17761p = (Object[]) objArr[0];
                    this.f17763h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f17762q--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C4772b.class) {
                Object[] objArr2 = f17759n;
                if (objArr2 != null) {
                    this.f17764i = objArr2;
                    f17759n = (Object[]) objArr2[0];
                    this.f17763h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17760o--;
                    return;
                }
            }
        }
        this.f17763h = new int[i10];
        this.f17764i = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int m18720e;
        if (e10 == null) {
            m18720e = m18721h();
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            m18720e = m18720e(e10, hashCode);
        }
        if (m18720e >= 0) {
            return false;
        }
        int i11 = ~m18720e;
        int i12 = this.f17765j;
        int[] iArr = this.f17763h;
        if (i12 >= iArr.length) {
            int i13 = 4;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 >= 4) {
                i13 = 8;
            }
            Object[] objArr = this.f17764i;
            m18717a(i13);
            int[] iArr2 = this.f17763h;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f17764i, 0, objArr.length);
            }
            m18716c(iArr, objArr, this.f17765j);
        }
        int i14 = this.f17765j;
        if (i11 < i14) {
            int[] iArr3 = this.f17763h;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f17764i;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f17765j - i11);
        }
        this.f17763h[i11] = i10;
        this.f17764i[i11] = e10;
        this.f17765j++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m18718b(this.f17765j + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= add(it.next());
        }
        return z10;
    }

    /* renamed from: b */
    public void m18718b(int i10) {
        int[] iArr = this.f17763h;
        if (iArr.length < i10) {
            Object[] objArr = this.f17764i;
            m18717a(i10);
            int i11 = this.f17765j;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.f17763h, 0, i11);
                System.arraycopy(objArr, 0, this.f17764i, 0, this.f17765j);
            }
            m18716c(iArr, objArr, this.f17765j);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f17765j;
        if (i10 != 0) {
            m18716c(this.f17763h, this.f17764i, i10);
            this.f17763h = f17757l;
            this.f17764i = f17758m;
            this.f17765j = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final AbstractC4776f<E, E> m18719d() {
        if (this.f17766k == null) {
            this.f17766k = new a();
        }
        return this.f17766k;
    }

    /* renamed from: e */
    public final int m18720e(Object obj, int i10) {
        int i11 = this.f17765j;
        if (i11 == 0) {
            return -1;
        }
        int m18724a = C4773c.m18724a(this.f17763h, i11, i10);
        if (m18724a < 0 || obj.equals(this.f17764i[m18724a])) {
            return m18724a;
        }
        int i12 = m18724a + 1;
        while (i12 < i11 && this.f17763h[i12] == i10) {
            if (obj.equals(this.f17764i[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m18724a - 1; i13 >= 0 && this.f17763h[i13] == i10; i13--) {
            if (obj.equals(this.f17764i[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f17765j; i10++) {
                try {
                    if (!set.contains(m18723k(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int m18721h() {
        int i10 = this.f17765j;
        if (i10 == 0) {
            return -1;
        }
        int m18724a = C4773c.m18724a(this.f17763h, i10, 0);
        if (m18724a < 0 || this.f17764i[m18724a] == null) {
            return m18724a;
        }
        int i11 = m18724a + 1;
        while (i11 < i10 && this.f17763h[i11] == 0) {
            if (this.f17764i[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = m18724a - 1; i12 >= 0 && this.f17763h[i12] == 0; i12--) {
            if (this.f17764i[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f17763h;
        int i10 = this.f17765j;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public int indexOf(Object obj) {
        return obj == null ? m18721h() : m18720e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f17765j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return m18719d().m18747m().iterator();
    }

    /* renamed from: j */
    public E m18722j(int i10) {
        Object[] objArr = this.f17764i;
        E e10 = (E) objArr[i10];
        int i11 = this.f17765j;
        if (i11 <= 1) {
            m18716c(this.f17763h, objArr, i11);
            this.f17763h = f17757l;
            this.f17764i = f17758m;
            this.f17765j = 0;
        } else {
            int[] iArr = this.f17763h;
            if (iArr.length <= 8 || i11 >= iArr.length / 3) {
                int i12 = i11 - 1;
                this.f17765j = i12;
                if (i10 < i12) {
                    int i13 = i10 + 1;
                    System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                    Object[] objArr2 = this.f17764i;
                    System.arraycopy(objArr2, i13, objArr2, i10, this.f17765j - i10);
                }
                this.f17764i[this.f17765j] = null;
            } else {
                m18717a(i11 > 8 ? i11 + (i11 >> 1) : 8);
                this.f17765j--;
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f17763h, 0, i10);
                    System.arraycopy(objArr, 0, this.f17764i, 0, i10);
                }
                int i14 = this.f17765j;
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    System.arraycopy(iArr, i15, this.f17763h, i10, i14 - i10);
                    System.arraycopy(objArr, i15, this.f17764i, i10, this.f17765j - i10);
                }
            }
        }
        return e10;
    }

    /* renamed from: k */
    public E m18723k(int i10) {
        return (E) this.f17764i[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m18722j(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= remove(it.next());
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f17765j - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f17764i[i10])) {
                m18722j(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f17765j;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f17765j;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f17764i, 0, objArr, 0, i10);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f17765j) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f17765j));
        }
        System.arraycopy(this.f17764i, 0, tArr, 0, this.f17765j);
        int length = tArr.length;
        int i10 = this.f17765j;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f17765j * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f17765j; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E m18723k = m18723k(i10);
            if (m18723k != this) {
                sb2.append(m18723k);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
