package p126i7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p109h7.C2432o;
import p126i7.AbstractC2621f;
import p126i7.C2624g0;

/* renamed from: i7.d */
/* loaded from: classes.dex */
public abstract class AbstractC2615d<K, V> extends AbstractC2621f<K, V> implements Serializable {

    /* renamed from: k */
    public transient Map<K, Collection<V>> f10255k;

    /* renamed from: l */
    public transient int f10256l;

    /* renamed from: i7.d$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2615d<K, V>.c<V> {
        public a(AbstractC2615d abstractC2615d) {
            super();
        }

        @Override // p126i7.AbstractC2615d.c
        /* renamed from: a */
        public V mo10553a(K k10, V v10) {
            return v10;
        }
    }

    /* renamed from: i7.d$b */
    /* loaded from: classes.dex */
    public class b extends C2624g0.f<K, Collection<V>> {

        /* renamed from: j */
        public final transient Map<K, Collection<V>> f10257j;

        /* renamed from: i7.d$b$a */
        /* loaded from: classes.dex */
        public class a extends C2624g0.c<K, Collection<V>> {
            public a() {
            }

            @Override // p126i7.C2624g0.c
            /* renamed from: a */
            public Map<K, Collection<V>> mo10558a() {
                return b.this;
            }

            @Override // p126i7.C2624g0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return C2629j.m10623c(b.this.f10257j.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C6186b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractC2615d.this.m10551t(entry.getKey());
                return true;
            }
        }

        /* renamed from: i7.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C6186b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: h */
            public final Iterator<Map.Entry<K, Collection<V>>> f10260h;

            /* renamed from: i */
            public Collection<V> f10261i;

            public C6186b() {
                this.f10260h = b.this.f10257j.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f10260h.next();
                this.f10261i = next.getValue();
                return b.this.m10557e(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10260h.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                C2432o.m9710p(this.f10261i != null, "no calls to next() since the last call to remove()");
                this.f10260h.remove();
                AbstractC2615d.m10542m(AbstractC2615d.this, this.f10261i.size());
                this.f10261i.clear();
                this.f10261i = null;
            }
        }

        public b(Map<K, Collection<V>> map) {
            this.f10257j = map;
        }

        @Override // p126i7.C2624g0.f
        /* renamed from: a */
        public Set<Map.Entry<K, Collection<V>>> mo10554a() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) C2624g0.m10606h(this.f10257j, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC2615d.this.mo10516v(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f10257j == AbstractC2615d.this.f10255k) {
                AbstractC2615d.this.clear();
            } else {
                C2613c0.m10519c(new C6186b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return C2624g0.m10605g(this.f10257j, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> remove = this.f10257j.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> mo10547o = AbstractC2615d.this.mo10547o();
            mo10547o.addAll(remove);
            AbstractC2615d.m10542m(AbstractC2615d.this, remove.size());
            remove.clear();
            return mo10547o;
        }

        /* renamed from: e */
        public Map.Entry<K, Collection<V>> m10557e(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return C2624g0.m10602d(key, AbstractC2615d.this.mo10516v(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f10257j.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f10257j.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractC2615d.this.m10598f();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f10257j.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f10257j.toString();
        }
    }

    /* renamed from: i7.d$c */
    /* loaded from: classes.dex */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: h */
        public final Iterator<Map.Entry<K, Collection<V>>> f10263h;

        /* renamed from: i */
        public K f10264i = null;

        /* renamed from: j */
        public Collection<V> f10265j = null;

        /* renamed from: k */
        public Iterator<V> f10266k = C2613c0.m10524h();

        public c() {
            this.f10263h = AbstractC2615d.this.f10255k.entrySet().iterator();
        }

        /* renamed from: a */
        public abstract T mo10553a(K k10, V v10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10263h.hasNext() || this.f10266k.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f10266k.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f10263h.next();
                this.f10264i = next.getKey();
                Collection<V> value = next.getValue();
                this.f10265j = value;
                this.f10266k = value.iterator();
            }
            return mo10553a(C2638n0.m10713a(this.f10264i), this.f10266k.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f10266k.remove();
            Collection<V> collection = this.f10265j;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f10263h.remove();
            }
            AbstractC2615d.m10540k(AbstractC2615d.this);
        }
    }

    /* renamed from: i7.d$d */
    /* loaded from: classes.dex */
    public class d extends C2624g0.d<K, Collection<V>> {

        /* renamed from: i7.d$d$a */
        /* loaded from: classes.dex */
        public class a implements Iterator<K> {

            /* renamed from: h */
            public Map.Entry<K, Collection<V>> f10269h;

            /* renamed from: i */
            public final /* synthetic */ Iterator f10270i;

            public a(Iterator it) {
                this.f10270i = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f10270i.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f10270i.next();
                this.f10269h = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                C2432o.m9710p(this.f10269h != null, "no calls to next() since the last call to remove()");
                Collection<V> value = this.f10269h.getValue();
                this.f10270i.remove();
                AbstractC2615d.m10542m(AbstractC2615d.this, value.size());
                value.clear();
                this.f10269h = null;
            }
        }

        public d(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C2613c0.m10519c(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return m10615a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || m10615a().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return m10615a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(m10615a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int i10;
            Collection<V> remove = m10615a().remove(obj);
            if (remove != null) {
                i10 = remove.size();
                remove.clear();
                AbstractC2615d.m10542m(AbstractC2615d.this, i10);
            } else {
                i10 = 0;
            }
            return i10 > 0;
        }
    }

    /* renamed from: i7.d$e */
    /* loaded from: classes.dex */
    public class e extends AbstractC2615d<K, V>.h implements NavigableMap<K, Collection<V>> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry<K, Collection<V>> ceilingEntry = mo10562h().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return m10557e(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            return mo10562h().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(mo10562h().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> firstEntry = mo10562h().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return m10557e(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry<K, Collection<V>> floorEntry = mo10562h().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return m10557e(floorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            return mo10562h().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(mo10562h().headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry<K, Collection<V>> higherEntry = mo10562h().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return m10557e(higherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            return mo10562h().higherKey(k10);
        }

        @Override // p126i7.AbstractC2615d.h
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> mo10560f() {
            return new f(mo10562h());
        }

        @Override // p126i7.AbstractC2615d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // p126i7.AbstractC2615d.h, p126i7.AbstractC2615d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        /* renamed from: l */
        public Map.Entry<K, Collection<V>> m10566l(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> mo10547o = AbstractC2615d.this.mo10547o();
            mo10547o.addAll(next.getValue());
            it.remove();
            return C2624g0.m10602d(next.getKey(), AbstractC2615d.this.mo10515u(mo10547o));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> lastEntry = mo10562h().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return m10557e(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry<K, Collection<V>> lowerEntry = mo10562h().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return m10557e(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            return mo10562h().lowerKey(k10);
        }

        @Override // p126i7.AbstractC2615d.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo10562h() {
            return (NavigableMap) super.mo10562h();
        }

        @Override // p126i7.AbstractC2615d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return mo10561g();
        }

        @Override // p126i7.AbstractC2615d.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m10566l(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m10566l(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(mo10562h().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(mo10562h().tailMap(k10, z10));
        }
    }

    /* renamed from: i7.d$f */
    /* loaded from: classes.dex */
    public class f extends AbstractC2615d<K, V>.i implements NavigableSet<K> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // p126i7.AbstractC2615d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k10) {
            return headSet(k10, false);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k10) {
            return mo10570b().ceilingKey(k10);
        }

        @Override // p126i7.AbstractC2615d.i
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> mo10570b() {
            return (NavigableMap) super.mo10570b();
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new f(mo10570b().descendingMap());
        }

        @Override // p126i7.AbstractC2615d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k10, K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // java.util.NavigableSet
        public K floor(K k10) {
            return mo10570b().floorKey(k10);
        }

        @Override // p126i7.AbstractC2615d.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(mo10570b().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public K higher(K k10) {
            return mo10570b().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(K k10) {
            return mo10570b().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) C2613c0.m10531o(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) C2613c0.m10531o(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(mo10570b().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(mo10570b().tailMap(k10, z10));
        }
    }

    /* renamed from: i7.d$g */
    /* loaded from: classes.dex */
    public class g extends AbstractC2615d<K, V>.k implements RandomAccess {
        public g(AbstractC2615d abstractC2615d, K k10, List<V> list, AbstractC2615d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    /* renamed from: i7.d$h */
    /* loaded from: classes.dex */
    public class h extends AbstractC2615d<K, V>.b implements SortedMap<K, Collection<V>> {

        /* renamed from: l */
        public SortedSet<K> f10274l;

        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return mo10562h().comparator();
        }

        /* renamed from: f */
        public SortedSet<K> mo10560f() {
            return new i(mo10562h());
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return mo10562h().firstKey();
        }

        @Override // p126i7.AbstractC2615d.b, java.util.AbstractMap, java.util.Map
        /* renamed from: g */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f10274l;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> mo10560f = mo10560f();
            this.f10274l = mo10560f;
            return mo10560f;
        }

        /* renamed from: h */
        public SortedMap<K, Collection<V>> mo10562h() {
            return (SortedMap) this.f10257j;
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(mo10562h().headMap(k10));
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return mo10562h().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(mo10562h().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(mo10562h().tailMap(k10));
        }
    }

    /* renamed from: i7.d$i */
    /* loaded from: classes.dex */
    public class i extends AbstractC2615d<K, V>.d implements SortedSet<K> {
        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* renamed from: b */
        public SortedMap<K, Collection<V>> mo10570b() {
            return (SortedMap) super.m10615a();
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return mo10570b().comparator();
        }

        @Override // java.util.SortedSet
        public K first() {
            return mo10570b().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(mo10570b().headMap(k10));
        }

        @Override // java.util.SortedSet
        public K last() {
            return mo10570b().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(mo10570b().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(mo10570b().tailMap(k10));
        }
    }

    /* renamed from: i7.d$j */
    /* loaded from: classes.dex */
    public class j extends AbstractCollection<V> {

        /* renamed from: h */
        public final K f10277h;

        /* renamed from: i */
        public Collection<V> f10278i;

        /* renamed from: j */
        public final AbstractC2615d<K, V>.j f10279j;

        /* renamed from: k */
        public final Collection<V> f10280k;

        /* renamed from: i7.d$j$a */
        /* loaded from: classes.dex */
        public class a implements Iterator<V> {

            /* renamed from: h */
            public final Iterator<V> f10282h;

            /* renamed from: i */
            public final Collection<V> f10283i;

            public a() {
                Collection<V> collection = j.this.f10278i;
                this.f10283i = collection;
                this.f10282h = AbstractC2615d.m10544s(collection);
            }

            public a(Iterator<V> it) {
                this.f10283i = j.this.f10278i;
                this.f10282h = it;
            }

            /* renamed from: a */
            public Iterator<V> m10581a() {
                m10582c();
                return this.f10282h;
            }

            /* renamed from: c */
            public void m10582c() {
                j.this.m10579e();
                if (j.this.f10278i != this.f10283i) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                m10582c();
                return this.f10282h.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                m10582c();
                return this.f10282h.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f10282h.remove();
                AbstractC2615d.m10540k(AbstractC2615d.this);
                j.this.m10580h();
            }
        }

        public j(K k10, Collection<V> collection, AbstractC2615d<K, V>.j jVar) {
            this.f10277h = k10;
            this.f10278i = collection;
            this.f10279j = jVar;
            this.f10280k = jVar == null ? null : jVar.m10577c();
        }

        /* renamed from: a */
        public void m10575a() {
            AbstractC2615d<K, V>.j jVar = this.f10279j;
            if (jVar != null) {
                jVar.m10575a();
            } else {
                AbstractC2615d.this.f10255k.put(this.f10277h, this.f10278i);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v10) {
            m10579e();
            boolean isEmpty = this.f10278i.isEmpty();
            boolean add = this.f10278i.add(v10);
            if (add) {
                AbstractC2615d.m10539j(AbstractC2615d.this);
                if (isEmpty) {
                    m10575a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f10278i.addAll(collection);
            if (addAll) {
                AbstractC2615d.m10541l(AbstractC2615d.this, this.f10278i.size() - size);
                if (size == 0) {
                    m10575a();
                }
            }
            return addAll;
        }

        /* renamed from: b */
        public AbstractC2615d<K, V>.j m10576b() {
            return this.f10279j;
        }

        /* renamed from: c */
        public Collection<V> m10577c() {
            return this.f10278i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f10278i.clear();
            AbstractC2615d.m10542m(AbstractC2615d.this, size);
            m10580h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            m10579e();
            return this.f10278i.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            m10579e();
            return this.f10278i.containsAll(collection);
        }

        /* renamed from: d */
        K m10578d() {
            return this.f10277h;
        }

        /* renamed from: e */
        public void m10579e() {
            Collection<V> collection;
            AbstractC2615d<K, V>.j jVar = this.f10279j;
            if (jVar != null) {
                jVar.m10579e();
                if (this.f10279j.m10577c() != this.f10280k) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f10278i.isEmpty() || (collection = (Collection) AbstractC2615d.this.f10255k.get(this.f10277h)) == null) {
                    return;
                }
                this.f10278i = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            m10579e();
            return this.f10278i.equals(obj);
        }

        /* renamed from: h */
        public void m10580h() {
            AbstractC2615d<K, V>.j jVar = this.f10279j;
            if (jVar != null) {
                jVar.m10580h();
            } else if (this.f10278i.isEmpty()) {
                AbstractC2615d.this.f10255k.remove(this.f10277h);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            m10579e();
            return this.f10278i.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            m10579e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            m10579e();
            boolean remove = this.f10278i.remove(obj);
            if (remove) {
                AbstractC2615d.m10540k(AbstractC2615d.this);
                m10580h();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f10278i.removeAll(collection);
            if (removeAll) {
                AbstractC2615d.m10541l(AbstractC2615d.this, this.f10278i.size() - size);
                m10580h();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            C2432o.m9704j(collection);
            int size = size();
            boolean retainAll = this.f10278i.retainAll(collection);
            if (retainAll) {
                AbstractC2615d.m10541l(AbstractC2615d.this, this.f10278i.size() - size);
                m10580h();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            m10579e();
            return this.f10278i.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            m10579e();
            return this.f10278i.toString();
        }
    }

    /* renamed from: i7.d$k */
    /* loaded from: classes.dex */
    public class k extends AbstractC2615d<K, V>.j implements List<V> {

        /* renamed from: i7.d$k$a */
        /* loaded from: classes.dex */
        public class a extends AbstractC2615d<K, V>.j.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i10) {
                super(k.this.m10583j().listIterator(i10));
            }

            @Override // java.util.ListIterator
            public void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                m10584d().add(v10);
                AbstractC2615d.m10539j(AbstractC2615d.this);
                if (isEmpty) {
                    k.this.m10575a();
                }
            }

            /* renamed from: d */
            public final ListIterator<V> m10584d() {
                return (ListIterator) m10581a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return m10584d().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return m10584d().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return m10584d().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return m10584d().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v10) {
                m10584d().set(v10);
            }
        }

        public k(K k10, List<V> list, AbstractC2615d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        @Override // java.util.List
        public void add(int i10, V v10) {
            m10579e();
            boolean isEmpty = m10577c().isEmpty();
            m10583j().add(i10, v10);
            AbstractC2615d.m10539j(AbstractC2615d.this);
            if (isEmpty) {
                m10575a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = m10583j().addAll(i10, collection);
            if (addAll) {
                AbstractC2615d.m10541l(AbstractC2615d.this, m10577c().size() - size);
                if (size == 0) {
                    m10575a();
                }
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i10) {
            m10579e();
            return m10583j().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            m10579e();
            return m10583j().indexOf(obj);
        }

        /* renamed from: j */
        public List<V> m10583j() {
            return (List) m10577c();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            m10579e();
            return m10583j().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            m10579e();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            m10579e();
            return new a(i10);
        }

        @Override // java.util.List
        public V remove(int i10) {
            m10579e();
            V remove = m10583j().remove(i10);
            AbstractC2615d.m10540k(AbstractC2615d.this);
            m10580h();
            return remove;
        }

        @Override // java.util.List
        public V set(int i10, V v10) {
            m10579e();
            return m10583j().set(i10, v10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            m10579e();
            return AbstractC2615d.this.m10552w(m10578d(), m10583j().subList(i10, i11), m10576b() == null ? this : m10576b());
        }
    }

    public AbstractC2615d(Map<K, Collection<V>> map) {
        C2432o.m9698d(map.isEmpty());
        this.f10255k = map;
    }

    /* renamed from: j */
    public static /* synthetic */ int m10539j(AbstractC2615d abstractC2615d) {
        int i10 = abstractC2615d.f10256l;
        abstractC2615d.f10256l = i10 + 1;
        return i10;
    }

    /* renamed from: k */
    public static /* synthetic */ int m10540k(AbstractC2615d abstractC2615d) {
        int i10 = abstractC2615d.f10256l;
        abstractC2615d.f10256l = i10 - 1;
        return i10;
    }

    /* renamed from: l */
    public static /* synthetic */ int m10541l(AbstractC2615d abstractC2615d, int i10) {
        int i11 = abstractC2615d.f10256l + i10;
        abstractC2615d.f10256l = i11;
        return i11;
    }

    /* renamed from: m */
    public static /* synthetic */ int m10542m(AbstractC2615d abstractC2615d, int i10) {
        int i11 = abstractC2615d.f10256l - i10;
        abstractC2615d.f10256l = i11;
        return i11;
    }

    /* renamed from: s */
    public static <E> Iterator<E> m10544s(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // p126i7.InterfaceC2626h0
    public void clear() {
        Iterator<Collection<V>> it = this.f10255k.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f10255k.clear();
        this.f10256l = 0;
    }

    @Override // p126i7.AbstractC2621f
    /* renamed from: e */
    public Collection<V> mo10545e() {
        return new AbstractC2621f.a();
    }

    @Override // p126i7.AbstractC2621f
    /* renamed from: g */
    public Iterator<V> mo10546g() {
        return new a(this);
    }

    /* renamed from: o */
    public abstract Collection<V> mo10547o();

    /* renamed from: p */
    public Collection<V> m10548p(K k10) {
        return mo10547o();
    }

    @Override // p126i7.InterfaceC2626h0
    public boolean put(K k10, V v10) {
        Collection<V> collection = this.f10255k.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f10256l++;
            return true;
        }
        Collection<V> m10548p = m10548p(k10);
        if (!m10548p.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f10256l++;
        this.f10255k.put(k10, m10548p);
        return true;
    }

    /* renamed from: q */
    public final Map<K, Collection<V>> m10549q() {
        Map<K, Collection<V>> map = this.f10255k;
        return map instanceof NavigableMap ? new e((NavigableMap) this.f10255k) : map instanceof SortedMap ? new h((SortedMap) this.f10255k) : new b(this.f10255k);
    }

    /* renamed from: r */
    public final Set<K> m10550r() {
        Map<K, Collection<V>> map = this.f10255k;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f10255k) : map instanceof SortedMap ? new i((SortedMap) this.f10255k) : new d(this.f10255k);
    }

    @Override // p126i7.InterfaceC2626h0
    public int size() {
        return this.f10256l;
    }

    /* renamed from: t */
    public final void m10551t(Object obj) {
        Collection collection = (Collection) C2624g0.m10607i(this.f10255k, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f10256l -= size;
        }
    }

    /* renamed from: u */
    public abstract <E> Collection<E> mo10515u(Collection<E> collection);

    /* renamed from: v */
    public abstract Collection<V> mo10516v(K k10, Collection<V> collection);

    @Override // p126i7.AbstractC2621f, p126i7.InterfaceC2626h0
    public Collection<V> values() {
        return super.values();
    }

    /* renamed from: w */
    public final List<V> m10552w(K k10, List<V> list, AbstractC2615d<K, V>.j jVar) {
        return list instanceof RandomAccess ? new g(this, k10, list, jVar) : new k(k10, list, jVar);
    }
}
