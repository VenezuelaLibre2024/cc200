package p126i7;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import p126i7.AbstractC2647s;

/* renamed from: i7.v */
/* loaded from: classes.dex */
public abstract class AbstractC2653v<K, V> implements Map<K, V>, Serializable {

    /* renamed from: k */
    public static final Map.Entry<?, ?>[] f10375k = new Map.Entry[0];

    /* renamed from: h */
    public transient AbstractC2657x<Map.Entry<K, V>> f10376h;

    /* renamed from: i */
    public transient AbstractC2657x<K> f10377i;

    /* renamed from: j */
    public transient AbstractC2647s<V> f10378j;

    /* renamed from: i7.v$a */
    /* loaded from: classes.dex */
    public static class a<K, V> {

        /* renamed from: a */
        public Comparator<? super V> f10379a;

        /* renamed from: b */
        public Object[] f10380b;

        /* renamed from: c */
        public int f10381c;

        /* renamed from: d */
        public boolean f10382d;

        /* renamed from: e */
        public C6189a f10383e;

        /* renamed from: i7.v$a$a */
        /* loaded from: classes.dex */
        public static final class C6189a {

            /* renamed from: a */
            public final Object f10384a;

            /* renamed from: b */
            public final Object f10385b;

            /* renamed from: c */
            public final Object f10386c;

            public C6189a(Object obj, Object obj2, Object obj3) {
                this.f10384a = obj;
                this.f10385b = obj2;
                this.f10386c = obj3;
            }

            /* renamed from: a */
            public IllegalArgumentException m10813a() {
                return new IllegalArgumentException("Multiple entries with same key: " + this.f10384a + "=" + this.f10385b + " and " + this.f10384a + "=" + this.f10386c);
            }
        }

        public a() {
            this(4);
        }

        public a(int i10) {
            this.f10380b = new Object[i10 * 2];
            this.f10381c = 0;
            this.f10382d = false;
        }

        /* renamed from: i */
        public static <V> void m10804i(Object[] objArr, int i10, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = i11 * 2;
                Object obj = objArr[i12];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i12 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i11] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i10, AbstractC2642p0.m10724a(comparator).m10728e(C2624g0.m10609k()));
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = i13 * 2;
                objArr[i14] = entryArr[i13].getKey();
                objArr[i14 + 1] = entryArr[i13].getValue();
            }
        }

        /* renamed from: a */
        public AbstractC2653v<K, V> m10805a() {
            return m10807c();
        }

        /* renamed from: b */
        public final AbstractC2653v<K, V> m10806b(boolean z10) {
            Object[] objArr;
            C6189a c6189a;
            C6189a c6189a2;
            if (z10 && (c6189a2 = this.f10383e) != null) {
                throw c6189a2.m10813a();
            }
            int i10 = this.f10381c;
            if (this.f10379a == null) {
                objArr = this.f10380b;
            } else {
                if (this.f10382d) {
                    this.f10380b = Arrays.copyOf(this.f10380b, i10 * 2);
                }
                objArr = this.f10380b;
                if (!z10) {
                    objArr = m10809e(objArr, this.f10381c);
                    if (objArr.length < this.f10380b.length) {
                        i10 = objArr.length >>> 1;
                    }
                }
                m10804i(objArr, i10, this.f10379a);
            }
            this.f10382d = true;
            C2648s0 m10750l = C2648s0.m10750l(i10, objArr, this);
            if (!z10 || (c6189a = this.f10383e) == null) {
                return m10750l;
            }
            throw c6189a.m10813a();
        }

        /* renamed from: c */
        public AbstractC2653v<K, V> m10807c() {
            return m10806b(true);
        }

        /* renamed from: d */
        public final void m10808d(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f10380b;
            if (i11 > objArr.length) {
                this.f10380b = Arrays.copyOf(objArr, AbstractC2647s.b.m10748c(objArr.length, i11));
                this.f10382d = false;
            }
        }

        /* renamed from: e */
        public final Object[] m10809e(Object[] objArr, int i10) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                Object obj = objArr[i11 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i11);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i10 - bitSet.cardinality()) * 2];
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10 * 2) {
                if (bitSet.get(i12 >>> 1)) {
                    i12 += 2;
                } else {
                    int i14 = i13 + 1;
                    int i15 = i12 + 1;
                    Object obj2 = objArr[i12];
                    Objects.requireNonNull(obj2);
                    objArr2[i13] = obj2;
                    i13 = i14 + 1;
                    i12 = i15 + 1;
                    Object obj3 = objArr[i15];
                    Objects.requireNonNull(obj3);
                    objArr2[i14] = obj3;
                }
            }
            return objArr2;
        }

        /* renamed from: f */
        public a<K, V> m10810f(K k10, V v10) {
            m10808d(this.f10381c + 1);
            C2627i.m10618a(k10, v10);
            Object[] objArr = this.f10380b;
            int i10 = this.f10381c;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f10381c = i10 + 1;
            return this;
        }

        /* renamed from: g */
        public a<K, V> m10811g(Map.Entry<? extends K, ? extends V> entry) {
            return m10810f(entry.getKey(), entry.getValue());
        }

        /* renamed from: h */
        public a<K, V> m10812h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                m10808d(this.f10381c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                m10811g(it.next());
            }
            return this;
        }
    }

    /* renamed from: a */
    public static <K, V> a<K, V> m10797a() {
        return new a<>();
    }

    /* renamed from: b */
    public static <K, V> AbstractC2653v<K, V> m10798b(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.m10812h(iterable);
        return aVar.m10805a();
    }

    /* renamed from: c */
    public static <K, V> AbstractC2653v<K, V> m10799c(Map<? extends K, ? extends V> map) {
        if ((map instanceof AbstractC2653v) && !(map instanceof SortedMap)) {
            AbstractC2653v<K, V> abstractC2653v = (AbstractC2653v) map;
            if (!abstractC2653v.mo10756h()) {
                return abstractC2653v;
            }
        }
        return m10798b(map.entrySet());
    }

    /* renamed from: j */
    public static <K, V> AbstractC2653v<K, V> m10800j() {
        return (AbstractC2653v<K, V>) C2648s0.f10344o;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract AbstractC2657x<Map.Entry<K, V>> mo10753d();

    /* renamed from: e */
    public abstract AbstractC2657x<K> mo10754e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return C2624g0.m10601c(this, obj);
    }

    /* renamed from: f */
    public abstract AbstractC2647s<V> mo10755f();

    @Override // java.util.Map
    /* renamed from: g */
    public AbstractC2657x<Map.Entry<K, V>> entrySet() {
        AbstractC2657x<Map.Entry<K, V>> abstractC2657x = this.f10376h;
        if (abstractC2657x != null) {
            return abstractC2657x;
        }
        AbstractC2657x<Map.Entry<K, V>> mo10753d = mo10753d();
        this.f10376h = mo10753d;
        return mo10753d;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    /* renamed from: h */
    public abstract boolean mo10756h();

    @Override // java.util.Map
    public int hashCode() {
        return C2660y0.m10837d(entrySet());
    }

    @Override // java.util.Map
    /* renamed from: i */
    public AbstractC2657x<K> keySet() {
        AbstractC2657x<K> abstractC2657x = this.f10377i;
        if (abstractC2657x != null) {
            return abstractC2657x;
        }
        AbstractC2657x<K> mo10754e = mo10754e();
        this.f10377i = mo10754e;
        return mo10754e;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: k */
    public AbstractC2647s<V> values() {
        AbstractC2647s<V> abstractC2647s = this.f10378j;
        if (abstractC2647s != null) {
            return abstractC2647s;
        }
        AbstractC2647s<V> mo10755f = mo10755f();
        this.f10378j = mo10755f;
        return mo10755f;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return C2624g0.m10608j(this);
    }
}
