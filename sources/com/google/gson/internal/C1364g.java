package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.gson.internal.g */
/* loaded from: classes.dex */
public final class C1364g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: o */
    public static final Comparator<Comparable> f5169o = new a();

    /* renamed from: h */
    public Comparator<? super K> f5170h;

    /* renamed from: i */
    public e<K, V> f5171i;

    /* renamed from: j */
    public int f5172j;

    /* renamed from: k */
    public int f5173k;

    /* renamed from: l */
    public final e<K, V> f5174l;

    /* renamed from: m */
    public C1364g<K, V>.b f5175m;

    /* renamed from: n */
    public C1364g<K, V>.c f5176n;

    /* renamed from: com.google.gson.internal.g$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.g$b */
    /* loaded from: classes.dex */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.g$b$a */
        /* loaded from: classes.dex */
        public class a extends C1364g<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return m5814a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1364g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C1364g.this.m5804c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> m5804c;
            if (!(obj instanceof Map.Entry) || (m5804c = C1364g.this.m5804c((Map.Entry) obj)) == null) {
                return false;
            }
            C1364g.this.m5807f(m5804c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1364g.this.f5172j;
        }
    }

    /* renamed from: com.google.gson.internal.g$c */
    /* loaded from: classes.dex */
    public final class c extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.g$c$a */
        /* loaded from: classes.dex */
        public class a extends C1364g<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m5814a().f5190m;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C1364g.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C1364g.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return C1364g.this.m5808g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C1364g.this.f5172j;
        }
    }

    /* renamed from: com.google.gson.internal.g$d */
    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: h */
        public e<K, V> f5181h;

        /* renamed from: i */
        public e<K, V> f5182i = null;

        /* renamed from: j */
        public int f5183j;

        public d() {
            this.f5181h = C1364g.this.f5174l.f5188k;
            this.f5183j = C1364g.this.f5173k;
        }

        /* renamed from: a */
        public final e<K, V> m5814a() {
            e<K, V> eVar = this.f5181h;
            C1364g c1364g = C1364g.this;
            if (eVar == c1364g.f5174l) {
                throw new NoSuchElementException();
            }
            if (c1364g.f5173k != this.f5183j) {
                throw new ConcurrentModificationException();
            }
            this.f5181h = eVar.f5188k;
            this.f5182i = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5181h != C1364g.this.f5174l;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f5182i;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            C1364g.this.m5807f(eVar, true);
            this.f5182i = null;
            this.f5183j = C1364g.this.f5173k;
        }
    }

    /* renamed from: com.google.gson.internal.g$e */
    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: h */
        public e<K, V> f5185h;

        /* renamed from: i */
        public e<K, V> f5186i;

        /* renamed from: j */
        public e<K, V> f5187j;

        /* renamed from: k */
        public e<K, V> f5188k;

        /* renamed from: l */
        public e<K, V> f5189l;

        /* renamed from: m */
        public final K f5190m;

        /* renamed from: n */
        public V f5191n;

        /* renamed from: o */
        public int f5192o;

        public e() {
            this.f5190m = null;
            this.f5189l = this;
            this.f5188k = this;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f5185h = eVar;
            this.f5190m = k10;
            this.f5192o = 1;
            this.f5188k = eVar2;
            this.f5189l = eVar3;
            eVar3.f5188k = this;
            eVar2.f5189l = this;
        }

        /* renamed from: a */
        public e<K, V> m5815a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f5186i; eVar2 != null; eVar2 = eVar2.f5186i) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public e<K, V> m5816b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f5187j; eVar2 != null; eVar2 = eVar2.f5187j) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k10 = this.f5190m;
            if (k10 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k10.equals(entry.getKey())) {
                return false;
            }
            V v10 = this.f5191n;
            Object value = entry.getValue();
            if (v10 == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v10.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f5190m;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f5191n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f5190m;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f5191n;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11 = this.f5191n;
            this.f5191n = v10;
            return v11;
        }

        public String toString() {
            return this.f5190m + "=" + this.f5191n;
        }
    }

    public C1364g() {
        this(f5169o);
    }

    public C1364g(Comparator<? super K> comparator) {
        this.f5172j = 0;
        this.f5173k = 0;
        this.f5174l = new e<>();
        this.f5170h = comparator == null ? f5169o : comparator;
    }

    /* renamed from: a */
    public final boolean m5802a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public e<K, V> m5803b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f5170h;
        e<K, V> eVar2 = this.f5171i;
        if (eVar2 != null) {
            Comparable comparable = comparator == f5169o ? (Comparable) k10 : null;
            while (true) {
                K k11 = eVar2.f5190m;
                i10 = comparable != null ? comparable.compareTo(k11) : comparator.compare(k10, k11);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f5186i : eVar2.f5187j;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f5174l;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f5189l);
            if (i10 < 0) {
                eVar2.f5186i = eVar;
            } else {
                eVar2.f5187j = eVar;
            }
            m5806e(eVar2, true);
        } else {
            if (comparator == f5169o && !(k10 instanceof Comparable)) {
                throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f5189l);
            this.f5171i = eVar;
        }
        this.f5172j++;
        this.f5173k++;
        return eVar;
    }

    /* renamed from: c */
    public e<K, V> m5804c(Map.Entry<?, ?> entry) {
        e<K, V> m5805d = m5805d(entry.getKey());
        if (m5805d != null && m5802a(m5805d.f5191n, entry.getValue())) {
            return m5805d;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f5171i = null;
        this.f5172j = 0;
        this.f5173k++;
        e<K, V> eVar = this.f5174l;
        eVar.f5189l = eVar;
        eVar.f5188k = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m5805d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public e<K, V> m5805d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m5803b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public final void m5806e(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f5186i;
            e<K, V> eVar3 = eVar.f5187j;
            int i10 = eVar2 != null ? eVar2.f5192o : 0;
            int i11 = eVar3 != null ? eVar3.f5192o : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                e<K, V> eVar4 = eVar3.f5186i;
                e<K, V> eVar5 = eVar3.f5187j;
                int i13 = (eVar4 != null ? eVar4.f5192o : 0) - (eVar5 != null ? eVar5.f5192o : 0);
                if (i13 != -1 && (i13 != 0 || z10)) {
                    m5811j(eVar3);
                }
                m5810i(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                e<K, V> eVar6 = eVar2.f5186i;
                e<K, V> eVar7 = eVar2.f5187j;
                int i14 = (eVar6 != null ? eVar6.f5192o : 0) - (eVar7 != null ? eVar7.f5192o : 0);
                if (i14 != 1 && (i14 != 0 || z10)) {
                    m5810i(eVar2);
                }
                m5811j(eVar);
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                eVar.f5192o = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f5192o = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f5185h;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C1364g<K, V>.b bVar = this.f5175m;
        if (bVar != null) {
            return bVar;
        }
        C1364g<K, V>.b bVar2 = new b();
        this.f5175m = bVar2;
        return bVar2;
    }

    /* renamed from: f */
    public void m5807f(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f5189l;
            eVar2.f5188k = eVar.f5188k;
            eVar.f5188k.f5189l = eVar2;
        }
        e<K, V> eVar3 = eVar.f5186i;
        e<K, V> eVar4 = eVar.f5187j;
        e<K, V> eVar5 = eVar.f5185h;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m5809h(eVar, eVar3);
                eVar.f5186i = null;
            } else if (eVar4 != null) {
                m5809h(eVar, eVar4);
                eVar.f5187j = null;
            } else {
                m5809h(eVar, null);
            }
            m5806e(eVar5, false);
            this.f5172j--;
            this.f5173k++;
            return;
        }
        e<K, V> m5816b = eVar3.f5192o > eVar4.f5192o ? eVar3.m5816b() : eVar4.m5815a();
        m5807f(m5816b, false);
        e<K, V> eVar6 = eVar.f5186i;
        if (eVar6 != null) {
            i10 = eVar6.f5192o;
            m5816b.f5186i = eVar6;
            eVar6.f5185h = m5816b;
            eVar.f5186i = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f5187j;
        if (eVar7 != null) {
            i11 = eVar7.f5192o;
            m5816b.f5187j = eVar7;
            eVar7.f5185h = m5816b;
            eVar.f5187j = null;
        }
        m5816b.f5192o = Math.max(i10, i11) + 1;
        m5809h(eVar, m5816b);
    }

    /* renamed from: g */
    public e<K, V> m5808g(Object obj) {
        e<K, V> m5805d = m5805d(obj);
        if (m5805d != null) {
            m5807f(m5805d, true);
        }
        return m5805d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> m5805d = m5805d(obj);
        if (m5805d != null) {
            return m5805d.f5191n;
        }
        return null;
    }

    /* renamed from: h */
    public final void m5809h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f5185h;
        eVar.f5185h = null;
        if (eVar2 != null) {
            eVar2.f5185h = eVar3;
        }
        if (eVar3 == null) {
            this.f5171i = eVar2;
        } else if (eVar3.f5186i == eVar) {
            eVar3.f5186i = eVar2;
        } else {
            eVar3.f5187j = eVar2;
        }
    }

    /* renamed from: i */
    public final void m5810i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f5186i;
        e<K, V> eVar3 = eVar.f5187j;
        e<K, V> eVar4 = eVar3.f5186i;
        e<K, V> eVar5 = eVar3.f5187j;
        eVar.f5187j = eVar4;
        if (eVar4 != null) {
            eVar4.f5185h = eVar;
        }
        m5809h(eVar, eVar3);
        eVar3.f5186i = eVar;
        eVar.f5185h = eVar3;
        int max = Math.max(eVar2 != null ? eVar2.f5192o : 0, eVar4 != null ? eVar4.f5192o : 0) + 1;
        eVar.f5192o = max;
        eVar3.f5192o = Math.max(max, eVar5 != null ? eVar5.f5192o : 0) + 1;
    }

    /* renamed from: j */
    public final void m5811j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f5186i;
        e<K, V> eVar3 = eVar.f5187j;
        e<K, V> eVar4 = eVar2.f5186i;
        e<K, V> eVar5 = eVar2.f5187j;
        eVar.f5186i = eVar5;
        if (eVar5 != null) {
            eVar5.f5185h = eVar;
        }
        m5809h(eVar, eVar2);
        eVar2.f5187j = eVar;
        eVar.f5185h = eVar2;
        int max = Math.max(eVar3 != null ? eVar3.f5192o : 0, eVar5 != null ? eVar5.f5192o : 0) + 1;
        eVar.f5192o = max;
        eVar2.f5192o = Math.max(max, eVar4 != null ? eVar4.f5192o : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        C1364g<K, V>.c cVar = this.f5176n;
        if (cVar != null) {
            return cVar;
        }
        C1364g<K, V>.c cVar2 = new c();
        this.f5176n = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        Objects.requireNonNull(k10, "key == null");
        e<K, V> m5803b = m5803b(k10, true);
        V v11 = m5803b.f5191n;
        m5803b.f5191n = v10;
        return v11;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> m5808g = m5808g(obj);
        if (m5808g != null) {
            return m5808g.f5191n;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f5172j;
    }
}
