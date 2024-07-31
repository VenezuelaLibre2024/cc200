package p301v0;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p301v0.C5087u;

/* renamed from: v0.j1 */
/* loaded from: classes.dex */
public class C5056j1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: h */
    public final int f18974h;

    /* renamed from: i */
    public List<C5056j1<K, V>.e> f18975i;

    /* renamed from: j */
    public Map<K, V> f18976j;

    /* renamed from: k */
    public boolean f18977k;

    /* renamed from: l */
    public volatile C5056j1<K, V>.g f18978l;

    /* renamed from: m */
    public Map<K, V> f18979m;

    /* renamed from: n */
    public volatile C5056j1<K, V>.c f18980n;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* renamed from: v0.j1$a */
    /* loaded from: classes.dex */
    public static class a<FieldDescriptorType> extends C5056j1<FieldDescriptorType, Object> {
        public a(int i10) {
            super(i10, null);
        }

        @Override // p301v0.C5056j1
        /* renamed from: p */
        public void mo20152p() {
            if (!m20151o()) {
                for (int i10 = 0; i10 < m20147k(); i10++) {
                    Map.Entry<FieldDescriptorType, Object> m20146j = m20146j(i10);
                    if (((C5087u.b) m20146j.getKey()).mo20608d()) {
                        m20146j.setValue(Collections.unmodifiableList((List) m20146j.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m20149m()) {
                    if (((C5087u.b) entry.getKey()).mo20608d()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.mo20152p();
        }

        @Override // p301v0.C5056j1, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.put((C5087u.b) obj, obj2);
        }
    }

    /* renamed from: v0.j1$b */
    /* loaded from: classes.dex */
    public class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h */
        public int f18981h;

        /* renamed from: i */
        public Iterator<Map.Entry<K, V>> f18982i;

        public b() {
            this.f18981h = C5056j1.this.f18975i.size();
        }

        public /* synthetic */ b(C5056j1 c5056j1, a aVar) {
            this();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m20155a() {
            if (this.f18982i == null) {
                this.f18982i = C5056j1.this.f18979m.entrySet().iterator();
            }
            return this.f18982i;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (m20155a().hasNext()) {
                entry = m20155a().next();
            } else {
                List list = C5056j1.this.f18975i;
                int i10 = this.f18981h - 1;
                this.f18981h = i10;
                entry = (Map.Entry<K, V>) list.get(i10);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f18981h;
            return (i10 > 0 && i10 <= C5056j1.this.f18975i.size()) || m20155a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: v0.j1$c */
    /* loaded from: classes.dex */
    public class c extends C5056j1<K, V>.g {
        public c() {
            super(C5056j1.this, null);
        }

        public /* synthetic */ c(C5056j1 c5056j1, a aVar) {
            this();
        }

        @Override // p301v0.C5056j1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(C5056j1.this, null);
        }
    }

    /* renamed from: v0.j1$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public static final Iterator<Object> f18985a = new a();

        /* renamed from: b */
        public static final Iterable<Object> f18986b = new b();

        /* renamed from: v0.j1$d$a */
        /* loaded from: classes.dex */
        public static class a implements Iterator<Object> {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: v0.j1$d$b */
        /* loaded from: classes.dex */
        public static class b implements Iterable<Object> {
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f18985a;
            }
        }

        /* renamed from: b */
        public static <T> Iterable<T> m20158b() {
            return (Iterable<T>) f18986b;
        }
    }

    /* renamed from: v0.j1$e */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<C5056j1<K, V>.e> {

        /* renamed from: h */
        public final K f18987h;

        /* renamed from: i */
        public V f18988i;

        public e(K k10, V v10) {
            this.f18987h = k10;
            this.f18988i = v10;
        }

        public e(C5056j1 c5056j1, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(C5056j1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: c */
        public final boolean m20160c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m20160c(this.f18987h, entry.getKey()) && m20160c(this.f18988i, entry.getValue());
        }

        @Override // java.util.Map.Entry
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f18987h;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f18988i;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k10 = this.f18987h;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f18988i;
            return hashCode ^ (v10 != null ? v10.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            C5056j1.this.m20143g();
            V v11 = this.f18988i;
            this.f18988i = v10;
            return v11;
        }

        public String toString() {
            return this.f18987h + "=" + this.f18988i;
        }
    }

    /* renamed from: v0.j1$f */
    /* loaded from: classes.dex */
    public class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: h */
        public int f18990h;

        /* renamed from: i */
        public boolean f18991i;

        /* renamed from: j */
        public Iterator<Map.Entry<K, V>> f18992j;

        public f() {
            this.f18990h = -1;
        }

        public /* synthetic */ f(C5056j1 c5056j1, a aVar) {
            this();
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> m20162a() {
            if (this.f18992j == null) {
                this.f18992j = C5056j1.this.f18976j.entrySet().iterator();
            }
            return this.f18992j;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f18991i = true;
            int i10 = this.f18990h + 1;
            this.f18990h = i10;
            return i10 < C5056j1.this.f18975i.size() ? (Map.Entry<K, V>) C5056j1.this.f18975i.get(this.f18990h) : m20162a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f18990h + 1 >= C5056j1.this.f18975i.size()) {
                return !C5056j1.this.f18976j.isEmpty() && m20162a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f18991i) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f18991i = false;
            C5056j1.this.m20143g();
            if (this.f18990h >= C5056j1.this.f18975i.size()) {
                m20162a().remove();
                return;
            }
            C5056j1 c5056j1 = C5056j1.this;
            int i10 = this.f18990h;
            this.f18990h = i10 - 1;
            c5056j1.m20154s(i10);
        }
    }

    /* renamed from: v0.j1$g */
    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        public g() {
        }

        public /* synthetic */ g(C5056j1 c5056j1, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C5056j1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C5056j1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C5056j1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(C5056j1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C5056j1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C5056j1.this.size();
        }
    }

    public C5056j1(int i10) {
        this.f18974h = i10;
        this.f18975i = Collections.emptyList();
        this.f18976j = Collections.emptyMap();
        this.f18979m = Collections.emptyMap();
    }

    public /* synthetic */ C5056j1(int i10, a aVar) {
        this(i10);
    }

    /* renamed from: q */
    public static <FieldDescriptorType extends C5087u.b<FieldDescriptorType>> C5056j1<FieldDescriptorType, Object> m20141q(int i10) {
        return new a(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m20143g();
        if (!this.f18975i.isEmpty()) {
            this.f18975i.clear();
        }
        if (this.f18976j.isEmpty()) {
            return;
        }
        this.f18976j.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m20142f(comparable) >= 0 || this.f18976j.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f18978l == null) {
            this.f18978l = new g(this, null);
        }
        return this.f18978l;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5056j1)) {
            return super.equals(obj);
        }
        C5056j1 c5056j1 = (C5056j1) obj;
        int size = size();
        if (size != c5056j1.size()) {
            return false;
        }
        int m20147k = m20147k();
        if (m20147k != c5056j1.m20147k()) {
            return entrySet().equals(c5056j1.entrySet());
        }
        for (int i10 = 0; i10 < m20147k; i10++) {
            if (!m20146j(i10).equals(c5056j1.m20146j(i10))) {
                return false;
            }
        }
        if (m20147k != size) {
            return this.f18976j.equals(c5056j1.f18976j);
        }
        return true;
    }

    /* renamed from: f */
    public final int m20142f(K k10) {
        int size = this.f18975i.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f18975i.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f18975i.get(i11).getKey());
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i11;
                }
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: g */
    public final void m20143g() {
        if (this.f18977k) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m20142f = m20142f(comparable);
        return m20142f >= 0 ? this.f18975i.get(m20142f).getValue() : this.f18976j.get(comparable);
    }

    /* renamed from: h */
    public Set<Map.Entry<K, V>> m20144h() {
        if (this.f18980n == null) {
            this.f18980n = new c(this, null);
        }
        return this.f18980n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m20147k = m20147k();
        int i10 = 0;
        for (int i11 = 0; i11 < m20147k; i11++) {
            i10 += this.f18975i.get(i11).hashCode();
        }
        return m20148l() > 0 ? i10 + this.f18976j.hashCode() : i10;
    }

    /* renamed from: i */
    public final void m20145i() {
        m20143g();
        if (!this.f18975i.isEmpty() || (this.f18975i instanceof ArrayList)) {
            return;
        }
        this.f18975i = new ArrayList(this.f18974h);
    }

    /* renamed from: j */
    public Map.Entry<K, V> m20146j(int i10) {
        return this.f18975i.get(i10);
    }

    /* renamed from: k */
    public int m20147k() {
        return this.f18975i.size();
    }

    /* renamed from: l */
    public int m20148l() {
        return this.f18976j.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> m20149m() {
        return this.f18976j.isEmpty() ? d.m20158b() : this.f18976j.entrySet();
    }

    /* renamed from: n */
    public final SortedMap<K, V> m20150n() {
        m20143g();
        if (this.f18976j.isEmpty() && !(this.f18976j instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18976j = treeMap;
            this.f18979m = treeMap.descendingMap();
        }
        return (SortedMap) this.f18976j;
    }

    /* renamed from: o */
    public boolean m20151o() {
        return this.f18977k;
    }

    /* renamed from: p */
    public void mo20152p() {
        if (this.f18977k) {
            return;
        }
        this.f18976j = this.f18976j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f18976j);
        this.f18979m = this.f18979m.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f18979m);
        this.f18977k = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public V put(K k10, V v10) {
        m20143g();
        int m20142f = m20142f(k10);
        if (m20142f >= 0) {
            return this.f18975i.get(m20142f).setValue(v10);
        }
        m20145i();
        int i10 = -(m20142f + 1);
        if (i10 >= this.f18974h) {
            return m20150n().put(k10, v10);
        }
        int size = this.f18975i.size();
        int i11 = this.f18974h;
        if (size == i11) {
            C5056j1<K, V>.e remove = this.f18975i.remove(i11 - 1);
            m20150n().put(remove.getKey(), remove.getValue());
        }
        this.f18975i.add(i10, new e(k10, v10));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m20143g();
        Comparable comparable = (Comparable) obj;
        int m20142f = m20142f(comparable);
        if (m20142f >= 0) {
            return (V) m20154s(m20142f);
        }
        if (this.f18976j.isEmpty()) {
            return null;
        }
        return this.f18976j.remove(comparable);
    }

    /* renamed from: s */
    public final V m20154s(int i10) {
        m20143g();
        V value = this.f18975i.remove(i10).getValue();
        if (!this.f18976j.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m20150n().entrySet().iterator();
            this.f18975i.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f18975i.size() + this.f18976j.size();
    }
}
