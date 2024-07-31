package p126i7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p109h7.C2428k;
import p109h7.C2432o;
import p155k7.C3368e;

/* renamed from: i7.k */
/* loaded from: classes.dex */
public class C2631k<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: q */
    public static final Object f10306q = new Object();

    /* renamed from: h */
    public transient Object f10307h;

    /* renamed from: i */
    public transient int[] f10308i;

    /* renamed from: j */
    public transient Object[] f10309j;

    /* renamed from: k */
    public transient Object[] f10310k;

    /* renamed from: l */
    public transient int f10311l;

    /* renamed from: m */
    public transient int f10312m;

    /* renamed from: n */
    public transient Set<K> f10313n;

    /* renamed from: o */
    public transient Set<Map.Entry<K, V>> f10314o;

    /* renamed from: p */
    public transient Collection<V> f10315p;

    /* renamed from: i7.k$a */
    /* loaded from: classes.dex */
    public class a extends C2631k<K, V>.e<K> {
        public a() {
            super(C2631k.this, null);
        }

        @Override // p126i7.C2631k.e
        /* renamed from: c */
        public K mo10681c(int i10) {
            return (K) C2631k.this.m10651G(i10);
        }
    }

    /* renamed from: i7.k$b */
    /* loaded from: classes.dex */
    public class b extends C2631k<K, V>.e<Map.Entry<K, V>> {
        public b() {
            super(C2631k.this, null);
        }

        @Override // p126i7.C2631k.e
        /* renamed from: e */
        public Map.Entry<K, V> mo10681c(int i10) {
            return new g(i10);
        }
    }

    /* renamed from: i7.k$c */
    /* loaded from: classes.dex */
    public class c extends C2631k<K, V>.e<V> {
        public c() {
            super(C2631k.this, null);
        }

        @Override // p126i7.C2631k.e
        /* renamed from: c */
        public V mo10681c(int i10) {
            return (V) C2631k.this.m10667W(i10);
        }
    }

    /* renamed from: i7.k$d */
    /* loaded from: classes.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2631k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map<K, V> m10677w = C2631k.this.m10677w();
            if (m10677w != null) {
                return m10677w.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m10648D = C2631k.this.m10648D(entry.getKey());
            return m10648D != -1 && C2428k.m9688a(C2631k.this.m10667W(m10648D), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return C2631k.this.m10679y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m10677w = C2631k.this.m10677w();
            if (m10677w != null) {
                return m10677w.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C2631k.this.m10654J()) {
                return false;
            }
            int m10646B = C2631k.this.m10646B();
            int m10694f = C2633l.m10694f(entry.getKey(), entry.getValue(), m10646B, C2631k.this.m10658N(), C2631k.this.m10656L(), C2631k.this.m10657M(), C2631k.this.m10659O());
            if (m10694f == -1) {
                return false;
            }
            C2631k.this.m10653I(m10694f, m10646B);
            C2631k.m10635e(C2631k.this);
            C2631k.this.m10647C();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2631k.this.size();
        }
    }

    /* renamed from: i7.k$e */
    /* loaded from: classes.dex */
    public abstract class e<T> implements Iterator<T> {

        /* renamed from: h */
        public int f10320h;

        /* renamed from: i */
        public int f10321i;

        /* renamed from: j */
        public int f10322j;

        public e() {
            this.f10320h = C2631k.this.f10311l;
            this.f10321i = C2631k.this.m10680z();
            this.f10322j = -1;
        }

        public /* synthetic */ e(C2631k c2631k, a aVar) {
            this();
        }

        /* renamed from: a */
        public final void m10683a() {
            if (C2631k.this.f10311l != this.f10320h) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: c */
        public abstract T mo10681c(int i10);

        /* renamed from: d */
        public void m10684d() {
            this.f10320h += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10321i >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            m10683a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i10 = this.f10321i;
            this.f10322j = i10;
            T mo10681c = mo10681c(i10);
            this.f10321i = C2631k.this.m10645A(this.f10321i);
            return mo10681c;
        }

        @Override // java.util.Iterator
        public void remove() {
            m10683a();
            C2627i.m10620c(this.f10322j >= 0);
            m10684d();
            C2631k c2631k = C2631k.this;
            c2631k.remove(c2631k.m10651G(this.f10322j));
            this.f10321i = C2631k.this.m10670o(this.f10321i, this.f10322j);
            this.f10322j = -1;
        }
    }

    /* renamed from: i7.k$f */
    /* loaded from: classes.dex */
    public class f extends AbstractSet<K> {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2631k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C2631k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return C2631k.this.m10652H();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map<K, V> m10677w = C2631k.this.m10677w();
            return m10677w != null ? m10677w.keySet().remove(obj) : C2631k.this.m10655K(obj) != C2631k.f10306q;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C2631k.this.size();
        }
    }

    /* renamed from: i7.k$g */
    /* loaded from: classes.dex */
    public final class g extends AbstractC2618e<K, V> {

        /* renamed from: h */
        public final K f10325h;

        /* renamed from: i */
        public int f10326i;

        public g(int i10) {
            this.f10325h = (K) C2631k.this.m10651G(i10);
            this.f10326i = i10;
        }

        /* renamed from: a */
        public final void m10685a() {
            int i10 = this.f10326i;
            if (i10 == -1 || i10 >= C2631k.this.size() || !C2428k.m9688a(this.f10325h, C2631k.this.m10651G(this.f10326i))) {
                this.f10326i = C2631k.this.m10648D(this.f10325h);
            }
        }

        @Override // p126i7.AbstractC2618e, java.util.Map.Entry
        public K getKey() {
            return this.f10325h;
        }

        @Override // p126i7.AbstractC2618e, java.util.Map.Entry
        public V getValue() {
            Map<K, V> m10677w = C2631k.this.m10677w();
            if (m10677w != null) {
                return (V) C2638n0.m10713a(m10677w.get(this.f10325h));
            }
            m10685a();
            int i10 = this.f10326i;
            return i10 == -1 ? (V) C2638n0.m10714b() : (V) C2631k.this.m10667W(i10);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            Map<K, V> m10677w = C2631k.this.m10677w();
            if (m10677w != null) {
                return (V) C2638n0.m10713a(m10677w.put(this.f10325h, v10));
            }
            m10685a();
            int i10 = this.f10326i;
            if (i10 == -1) {
                C2631k.this.put(this.f10325h, v10);
                return (V) C2638n0.m10714b();
            }
            V v11 = (V) C2631k.this.m10667W(i10);
            C2631k.this.m10666V(this.f10326i, v10);
            return v11;
        }
    }

    /* renamed from: i7.k$h */
    /* loaded from: classes.dex */
    public class h extends AbstractCollection<V> {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C2631k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C2631k.this.m10668X();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C2631k.this.size();
        }
    }

    public C2631k() {
        m10649E(3);
    }

    /* renamed from: e */
    public static /* synthetic */ int m10635e(C2631k c2631k) {
        int i10 = c2631k.f10312m;
        c2631k.f10312m = i10 - 1;
        return i10;
    }

    /* renamed from: r */
    public static <K, V> C2631k<K, V> m10644r() {
        return new C2631k<>();
    }

    /* renamed from: A */
    public int m10645A(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f10312m) {
            return i11;
        }
        return -1;
    }

    /* renamed from: B */
    public final int m10646B() {
        return (1 << (this.f10311l & 31)) - 1;
    }

    /* renamed from: C */
    public void m10647C() {
        this.f10311l += 32;
    }

    /* renamed from: D */
    public final int m10648D(Object obj) {
        if (m10654J()) {
            return -1;
        }
        int m10735c = C2645r.m10735c(obj);
        int m10646B = m10646B();
        int m10696h = C2633l.m10696h(m10658N(), m10735c & m10646B);
        if (m10696h == 0) {
            return -1;
        }
        int m10690b = C2633l.m10690b(m10735c, m10646B);
        do {
            int i10 = m10696h - 1;
            int m10678x = m10678x(i10);
            if (C2633l.m10690b(m10678x, m10646B) == m10690b && C2428k.m9688a(obj, m10651G(i10))) {
                return i10;
            }
            m10696h = C2633l.m10691c(m10678x, m10646B);
        } while (m10696h != 0);
        return -1;
    }

    /* renamed from: E */
    public void m10649E(int i10) {
        C2432o.m9699e(i10 >= 0, "Expected size must be >= 0");
        this.f10311l = C3368e.m12527f(i10, 1, 1073741823);
    }

    /* renamed from: F */
    public void m10650F(int i10, K k10, V v10, int i11, int i12) {
        m10663S(i10, C2633l.m10692d(i11, 0, i12));
        m10665U(i10, k10);
        m10666V(i10, v10);
    }

    /* renamed from: G */
    public final K m10651G(int i10) {
        return (K) m10657M()[i10];
    }

    /* renamed from: H */
    public Iterator<K> m10652H() {
        Map<K, V> m10677w = m10677w();
        return m10677w != null ? m10677w.keySet().iterator() : new a();
    }

    /* renamed from: I */
    public void m10653I(int i10, int i11) {
        Object m10658N = m10658N();
        int[] m10656L = m10656L();
        Object[] m10657M = m10657M();
        Object[] m10659O = m10659O();
        int size = size() - 1;
        if (i10 >= size) {
            m10657M[i10] = null;
            m10659O[i10] = null;
            m10656L[i10] = 0;
            return;
        }
        Object obj = m10657M[size];
        m10657M[i10] = obj;
        m10659O[i10] = m10659O[size];
        m10657M[size] = null;
        m10659O[size] = null;
        m10656L[i10] = m10656L[size];
        m10656L[size] = 0;
        int m10735c = C2645r.m10735c(obj) & i11;
        int m10696h = C2633l.m10696h(m10658N, m10735c);
        int i12 = size + 1;
        if (m10696h == i12) {
            C2633l.m10697i(m10658N, m10735c, i10 + 1);
            return;
        }
        while (true) {
            int i13 = m10696h - 1;
            int i14 = m10656L[i13];
            int m10691c = C2633l.m10691c(i14, i11);
            if (m10691c == i12) {
                m10656L[i13] = C2633l.m10692d(i14, i10 + 1, i11);
                return;
            }
            m10696h = m10691c;
        }
    }

    /* renamed from: J */
    public boolean m10654J() {
        return this.f10307h == null;
    }

    /* renamed from: K */
    public final Object m10655K(Object obj) {
        if (m10654J()) {
            return f10306q;
        }
        int m10646B = m10646B();
        int m10694f = C2633l.m10694f(obj, null, m10646B, m10658N(), m10656L(), m10657M(), null);
        if (m10694f == -1) {
            return f10306q;
        }
        V m10667W = m10667W(m10694f);
        m10653I(m10694f, m10646B);
        this.f10312m--;
        m10647C();
        return m10667W;
    }

    /* renamed from: L */
    public final int[] m10656L() {
        int[] iArr = this.f10308i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: M */
    public final Object[] m10657M() {
        Object[] objArr = this.f10309j;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: N */
    public final Object m10658N() {
        Object obj = this.f10307h;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: O */
    public final Object[] m10659O() {
        Object[] objArr = this.f10310k;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: P */
    public void m10660P(int i10) {
        this.f10308i = Arrays.copyOf(m10656L(), i10);
        this.f10309j = Arrays.copyOf(m10657M(), i10);
        this.f10310k = Arrays.copyOf(m10659O(), i10);
    }

    /* renamed from: Q */
    public final void m10661Q(int i10) {
        int min;
        int length = m10656L().length;
        if (i10 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        m10660P(min);
    }

    /* renamed from: R */
    public final int m10662R(int i10, int i11, int i12, int i13) {
        Object m10689a = C2633l.m10689a(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            C2633l.m10697i(m10689a, i12 & i14, i13 + 1);
        }
        Object m10658N = m10658N();
        int[] m10656L = m10656L();
        for (int i15 = 0; i15 <= i10; i15++) {
            int m10696h = C2633l.m10696h(m10658N, i15);
            while (m10696h != 0) {
                int i16 = m10696h - 1;
                int i17 = m10656L[i16];
                int m10690b = C2633l.m10690b(i17, i10) | i15;
                int i18 = m10690b & i14;
                int m10696h2 = C2633l.m10696h(m10689a, i18);
                C2633l.m10697i(m10689a, i18, m10696h);
                m10656L[i16] = C2633l.m10692d(m10690b, m10696h2, i14);
                m10696h = C2633l.m10691c(i17, i10);
            }
        }
        this.f10307h = m10689a;
        m10664T(i14);
        return i14;
    }

    /* renamed from: S */
    public final void m10663S(int i10, int i11) {
        m10656L()[i10] = i11;
    }

    /* renamed from: T */
    public final void m10664T(int i10) {
        this.f10311l = C2633l.m10692d(this.f10311l, 32 - Integer.numberOfLeadingZeros(i10), 31);
    }

    /* renamed from: U */
    public final void m10665U(int i10, K k10) {
        m10657M()[i10] = k10;
    }

    /* renamed from: V */
    public final void m10666V(int i10, V v10) {
        m10659O()[i10] = v10;
    }

    /* renamed from: W */
    public final V m10667W(int i10) {
        return (V) m10659O()[i10];
    }

    /* renamed from: X */
    public Iterator<V> m10668X() {
        Map<K, V> m10677w = m10677w();
        return m10677w != null ? m10677w.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m10654J()) {
            return;
        }
        m10647C();
        Map<K, V> m10677w = m10677w();
        if (m10677w != null) {
            this.f10311l = C3368e.m12527f(size(), 3, 1073741823);
            m10677w.clear();
            this.f10307h = null;
        } else {
            Arrays.fill(m10657M(), 0, this.f10312m, (Object) null);
            Arrays.fill(m10659O(), 0, this.f10312m, (Object) null);
            C2633l.m10695g(m10658N());
            Arrays.fill(m10656L(), 0, this.f10312m, 0);
        }
        this.f10312m = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map<K, V> m10677w = m10677w();
        return m10677w != null ? m10677w.containsKey(obj) : m10648D(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map<K, V> m10677w = m10677w();
        if (m10677w != null) {
            return m10677w.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f10312m; i10++) {
            if (C2428k.m9688a(obj, m10667W(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f10314o;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> m10673s = m10673s();
        this.f10314o = m10673s;
        return m10673s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Map<K, V> m10677w = m10677w();
        if (m10677w != null) {
            return m10677w.get(obj);
        }
        int m10648D = m10648D(obj);
        if (m10648D == -1) {
            return null;
        }
        m10669n(m10648D);
        return m10667W(m10648D);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f10313n;
        if (set != null) {
            return set;
        }
        Set<K> m10675u = m10675u();
        this.f10313n = m10675u;
        return m10675u;
    }

    /* renamed from: n */
    public void m10669n(int i10) {
    }

    /* renamed from: o */
    public int m10670o(int i10, int i11) {
        return i10 - 1;
    }

    /* renamed from: p */
    public int m10671p() {
        C2432o.m9710p(m10654J(), "Arrays already allocated");
        int i10 = this.f10311l;
        int m10698j = C2633l.m10698j(i10);
        this.f10307h = C2633l.m10689a(m10698j);
        m10664T(m10698j - 1);
        this.f10308i = new int[i10];
        this.f10309j = new Object[i10];
        this.f10310k = new Object[i10];
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        int i10;
        if (m10654J()) {
            m10671p();
        }
        Map<K, V> m10677w = m10677w();
        if (m10677w != null) {
            return m10677w.put(k10, v10);
        }
        int[] m10656L = m10656L();
        Object[] m10657M = m10657M();
        Object[] m10659O = m10659O();
        int i11 = this.f10312m;
        int i12 = i11 + 1;
        int m10735c = C2645r.m10735c(k10);
        int m10646B = m10646B();
        int i13 = m10735c & m10646B;
        int m10696h = C2633l.m10696h(m10658N(), i13);
        if (m10696h == 0) {
            if (i12 <= m10646B) {
                C2633l.m10697i(m10658N(), i13, i12);
                i10 = m10646B;
            }
            i10 = m10662R(m10646B, C2633l.m10693e(m10646B), m10735c, i11);
        } else {
            int m10690b = C2633l.m10690b(m10735c, m10646B);
            int i14 = 0;
            while (true) {
                int i15 = m10696h - 1;
                int i16 = m10656L[i15];
                if (C2633l.m10690b(i16, m10646B) == m10690b && C2428k.m9688a(k10, m10657M[i15])) {
                    V v11 = (V) m10659O[i15];
                    m10659O[i15] = v10;
                    m10669n(i15);
                    return v11;
                }
                int m10691c = C2633l.m10691c(i16, m10646B);
                i14++;
                if (m10691c != 0) {
                    m10696h = m10691c;
                } else {
                    if (i14 >= 9) {
                        return m10672q().put(k10, v10);
                    }
                    if (i12 <= m10646B) {
                        m10656L[i15] = C2633l.m10692d(i16, i12, m10646B);
                    }
                }
            }
        }
        m10661Q(i12);
        m10650F(i11, k10, v10, m10735c, i10);
        this.f10312m = i12;
        m10647C();
        return null;
    }

    /* renamed from: q */
    public Map<K, V> m10672q() {
        Map<K, V> m10674t = m10674t(m10646B() + 1);
        int m10680z = m10680z();
        while (m10680z >= 0) {
            m10674t.put(m10651G(m10680z), m10667W(m10680z));
            m10680z = m10645A(m10680z);
        }
        this.f10307h = m10674t;
        this.f10308i = null;
        this.f10309j = null;
        this.f10310k = null;
        m10647C();
        return m10674t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        Map<K, V> m10677w = m10677w();
        if (m10677w != null) {
            return m10677w.remove(obj);
        }
        V v10 = (V) m10655K(obj);
        if (v10 == f10306q) {
            return null;
        }
        return v10;
    }

    /* renamed from: s */
    public Set<Map.Entry<K, V>> m10673s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> m10677w = m10677w();
        return m10677w != null ? m10677w.size() : this.f10312m;
    }

    /* renamed from: t */
    public Map<K, V> m10674t(int i10) {
        return new LinkedHashMap(i10, 1.0f);
    }

    /* renamed from: u */
    public Set<K> m10675u() {
        return new f();
    }

    /* renamed from: v */
    public Collection<V> m10676v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f10315p;
        if (collection != null) {
            return collection;
        }
        Collection<V> m10676v = m10676v();
        this.f10315p = m10676v;
        return m10676v;
    }

    /* renamed from: w */
    public Map<K, V> m10677w() {
        Object obj = this.f10307h;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: x */
    public final int m10678x(int i10) {
        return m10656L()[i10];
    }

    /* renamed from: y */
    public Iterator<Map.Entry<K, V>> m10679y() {
        Map<K, V> m10677w = m10677w();
        return m10677w != null ? m10677w.entrySet().iterator() : new b();
    }

    /* renamed from: z */
    public int m10680z() {
        return isEmpty() ? -1 : 0;
    }
}
