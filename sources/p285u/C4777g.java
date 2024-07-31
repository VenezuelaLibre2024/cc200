package p285u;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: u.g */
/* loaded from: classes.dex */
public class C4777g<K, V> {

    /* renamed from: k */
    public static Object[] f17791k;

    /* renamed from: l */
    public static int f17792l;

    /* renamed from: m */
    public static Object[] f17793m;

    /* renamed from: n */
    public static int f17794n;

    /* renamed from: h */
    public int[] f17795h;

    /* renamed from: i */
    public Object[] f17796i;

    /* renamed from: j */
    public int f17797j;

    public C4777g() {
        this.f17795h = C4773c.f17768a;
        this.f17796i = C4773c.f17770c;
        this.f17797j = 0;
    }

    public C4777g(int i10) {
        if (i10 == 0) {
            this.f17795h = C4773c.f17768a;
            this.f17796i = C4773c.f17770c;
        } else {
            m18753a(i10);
        }
        this.f17797j = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4777g(C4777g<K, V> c4777g) {
        this();
        if (c4777g != 0) {
            m18762j(c4777g);
        }
    }

    /* renamed from: a */
    private void m18753a(int i10) {
        if (i10 == 8) {
            synchronized (C4777g.class) {
                Object[] objArr = f17793m;
                if (objArr != null) {
                    this.f17796i = objArr;
                    f17793m = (Object[]) objArr[0];
                    this.f17795h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f17794n--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (C4777g.class) {
                Object[] objArr2 = f17791k;
                if (objArr2 != null) {
                    this.f17796i = objArr2;
                    f17791k = (Object[]) objArr2[0];
                    this.f17795h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f17792l--;
                    return;
                }
            }
        }
        this.f17795h = new int[i10];
        this.f17796i = new Object[i10 << 1];
    }

    /* renamed from: b */
    public static int m18754b(int[] iArr, int i10, int i11) {
        try {
            return C4773c.m18724a(iArr, i10, i11);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    public static void m18755d(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (C4777g.class) {
                if (f17794n < 10) {
                    objArr[0] = f17793m;
                    objArr[1] = iArr;
                    for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                        objArr[i11] = null;
                    }
                    f17793m = objArr;
                    f17794n++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C4777g.class) {
                if (f17792l < 10) {
                    objArr[0] = f17791k;
                    objArr[1] = iArr;
                    for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                        objArr[i12] = null;
                    }
                    f17791k = objArr;
                    f17792l++;
                }
            }
        }
    }

    /* renamed from: c */
    public void m18756c(int i10) {
        int i11 = this.f17797j;
        int[] iArr = this.f17795h;
        if (iArr.length < i10) {
            Object[] objArr = this.f17796i;
            m18753a(i10);
            if (this.f17797j > 0) {
                System.arraycopy(iArr, 0, this.f17795h, 0, i11);
                System.arraycopy(objArr, 0, this.f17796i, 0, i11 << 1);
            }
            m18755d(iArr, objArr, i11);
        }
        if (this.f17797j != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i10 = this.f17797j;
        if (i10 > 0) {
            int[] iArr = this.f17795h;
            Object[] objArr = this.f17796i;
            this.f17795h = C4773c.f17768a;
            this.f17796i = C4773c.f17770c;
            this.f17797j = 0;
            m18755d(iArr, objArr, i10);
        }
        if (this.f17797j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m18758f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m18760h(obj) >= 0;
    }

    /* renamed from: e */
    public int m18757e(Object obj, int i10) {
        int i11 = this.f17797j;
        if (i11 == 0) {
            return -1;
        }
        int m18754b = m18754b(this.f17795h, i11, i10);
        if (m18754b < 0 || obj.equals(this.f17796i[m18754b << 1])) {
            return m18754b;
        }
        int i12 = m18754b + 1;
        while (i12 < i11 && this.f17795h[i12] == i10) {
            if (obj.equals(this.f17796i[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = m18754b - 1; i13 >= 0 && this.f17795h[i13] == i10; i13--) {
            if (obj.equals(this.f17796i[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4777g) {
            C4777g c4777g = (C4777g) obj;
            if (size() != c4777g.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f17797j; i10++) {
                try {
                    K m18761i = m18761i(i10);
                    V m18765m = m18765m(i10);
                    Object obj2 = c4777g.get(m18761i);
                    if (m18765m == null) {
                        if (obj2 != null || !c4777g.containsKey(m18761i)) {
                            return false;
                        }
                    } else if (!m18765m.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f17797j; i11++) {
                try {
                    K m18761i2 = m18761i(i11);
                    V m18765m2 = m18765m(i11);
                    Object obj3 = map.get(m18761i2);
                    if (m18765m2 == null) {
                        if (obj3 != null || !map.containsKey(m18761i2)) {
                            return false;
                        }
                    } else if (!m18765m2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m18758f(Object obj) {
        return obj == null ? m18759g() : m18757e(obj, obj.hashCode());
    }

    /* renamed from: g */
    public int m18759g() {
        int i10 = this.f17797j;
        if (i10 == 0) {
            return -1;
        }
        int m18754b = m18754b(this.f17795h, i10, 0);
        if (m18754b < 0 || this.f17796i[m18754b << 1] == null) {
            return m18754b;
        }
        int i11 = m18754b + 1;
        while (i11 < i10 && this.f17795h[i11] == 0) {
            if (this.f17796i[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = m18754b - 1; i12 >= 0 && this.f17795h[i12] == 0; i12--) {
            if (this.f17796i[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v10) {
        int m18758f = m18758f(obj);
        return m18758f >= 0 ? (V) this.f17796i[(m18758f << 1) + 1] : v10;
    }

    /* renamed from: h */
    public int m18760h(Object obj) {
        int i10 = this.f17797j * 2;
        Object[] objArr = this.f17796i;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f17795h;
        Object[] objArr = this.f17796i;
        int i10 = this.f17797j;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            i13 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return i13;
    }

    /* renamed from: i */
    public K m18761i(int i10) {
        return (K) this.f17796i[i10 << 1];
    }

    public boolean isEmpty() {
        return this.f17797j <= 0;
    }

    /* renamed from: j */
    public void m18762j(C4777g<? extends K, ? extends V> c4777g) {
        int i10 = c4777g.f17797j;
        m18756c(this.f17797j + i10);
        if (this.f17797j != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(c4777g.m18761i(i11), c4777g.m18765m(i11));
            }
        } else if (i10 > 0) {
            System.arraycopy(c4777g.f17795h, 0, this.f17795h, 0, i10);
            System.arraycopy(c4777g.f17796i, 0, this.f17796i, 0, i10 << 1);
            this.f17797j = i10;
        }
    }

    /* renamed from: k */
    public V m18763k(int i10) {
        Object[] objArr = this.f17796i;
        int i11 = i10 << 1;
        V v10 = (V) objArr[i11 + 1];
        int i12 = this.f17797j;
        int i13 = 0;
        if (i12 <= 1) {
            m18755d(this.f17795h, objArr, i12);
            this.f17795h = C4773c.f17768a;
            this.f17796i = C4773c.f17770c;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f17795h;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f17796i;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f17796i;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                m18753a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f17797j) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f17795h, 0, i10);
                    System.arraycopy(objArr, 0, this.f17796i, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f17795h, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f17796i, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 != this.f17797j) {
            throw new ConcurrentModificationException();
        }
        this.f17797j = i13;
        return v10;
    }

    /* renamed from: l */
    public V m18764l(int i10, V v10) {
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f17796i;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    /* renamed from: m */
    public V m18765m(int i10) {
        return (V) this.f17796i[(i10 << 1) + 1];
    }

    public V put(K k10, V v10) {
        int i10;
        int m18757e;
        int i11 = this.f17797j;
        if (k10 == null) {
            m18757e = m18759g();
            i10 = 0;
        } else {
            int hashCode = k10.hashCode();
            i10 = hashCode;
            m18757e = m18757e(k10, hashCode);
        }
        if (m18757e >= 0) {
            int i12 = (m18757e << 1) + 1;
            Object[] objArr = this.f17796i;
            V v11 = (V) objArr[i12];
            objArr[i12] = v10;
            return v11;
        }
        int i13 = ~m18757e;
        int[] iArr = this.f17795h;
        if (i11 >= iArr.length) {
            int i14 = 4;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 >= 4) {
                i14 = 8;
            }
            Object[] objArr2 = this.f17796i;
            m18753a(i14);
            if (i11 != this.f17797j) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f17795h;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f17796i, 0, objArr2.length);
            }
            m18755d(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f17795h;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f17796i;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f17797j - i13) << 1);
        }
        int i16 = this.f17797j;
        if (i11 == i16) {
            int[] iArr4 = this.f17795h;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f17796i;
                int i17 = i13 << 1;
                objArr4[i17] = k10;
                objArr4[i17 + 1] = v10;
                this.f17797j = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k10, V v10) {
        V v11 = get(k10);
        return v11 == null ? put(k10, v10) : v11;
    }

    public V remove(Object obj) {
        int m18758f = m18758f(obj);
        if (m18758f >= 0) {
            return m18763k(m18758f);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int m18758f = m18758f(obj);
        if (m18758f < 0) {
            return false;
        }
        V m18765m = m18765m(m18758f);
        if (obj2 != m18765m && (obj2 == null || !obj2.equals(m18765m))) {
            return false;
        }
        m18763k(m18758f);
        return true;
    }

    public V replace(K k10, V v10) {
        int m18758f = m18758f(k10);
        if (m18758f >= 0) {
            return m18764l(m18758f, v10);
        }
        return null;
    }

    public boolean replace(K k10, V v10, V v11) {
        int m18758f = m18758f(k10);
        if (m18758f < 0) {
            return false;
        }
        V m18765m = m18765m(m18758f);
        if (m18765m != v10 && (v10 == null || !v10.equals(m18765m))) {
            return false;
        }
        m18764l(m18758f, v11);
        return true;
    }

    public int size() {
        return this.f17797j;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f17797j * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f17797j; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            K m18761i = m18761i(i10);
            if (m18761i != this) {
                sb2.append(m18761i);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            V m18765m = m18765m(i10);
            if (m18765m != this) {
                sb2.append(m18765m);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
