package p285u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: u.f */
/* loaded from: classes.dex */
public abstract class AbstractC4776f<K, V> {

    /* renamed from: a */
    public AbstractC4776f<K, V>.b f17776a;

    /* renamed from: b */
    public AbstractC4776f<K, V>.c f17777b;

    /* renamed from: c */
    public AbstractC4776f<K, V>.e f17778c;

    /* renamed from: u.f$a */
    /* loaded from: classes.dex */
    public final class a<T> implements Iterator<T> {

        /* renamed from: h */
        public final int f17779h;

        /* renamed from: i */
        public int f17780i;

        /* renamed from: j */
        public int f17781j;

        /* renamed from: k */
        public boolean f17782k = false;

        public a(int i10) {
            this.f17779h = i10;
            this.f17780i = AbstractC4776f.this.mo18710d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17781j < this.f17780i;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) AbstractC4776f.this.mo18708b(this.f17781j, this.f17779h);
            this.f17781j++;
            this.f17782k = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f17782k) {
                throw new IllegalStateException();
            }
            int i10 = this.f17781j - 1;
            this.f17781j = i10;
            this.f17780i--;
            this.f17782k = false;
            AbstractC4776f.this.mo18714h(i10);
        }
    }

    /* renamed from: u.f$b */
    /* loaded from: classes.dex */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int mo18710d = AbstractC4776f.this.mo18710d();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC4776f.this.mo18713g(entry.getKey(), entry.getValue());
            }
            return mo18710d != AbstractC4776f.this.mo18710d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC4776f.this.mo18707a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int mo18711e = AbstractC4776f.this.mo18711e(entry.getKey());
            if (mo18711e < 0) {
                return false;
            }
            return C4773c.m18726c(AbstractC4776f.this.mo18708b(mo18711e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC4776f.m18743k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int mo18710d = AbstractC4776f.this.mo18710d() - 1; mo18710d >= 0; mo18710d--) {
                Object mo18708b = AbstractC4776f.this.mo18708b(mo18710d, 0);
                Object mo18708b2 = AbstractC4776f.this.mo18708b(mo18710d, 1);
                i10 += (mo18708b == null ? 0 : mo18708b.hashCode()) ^ (mo18708b2 == null ? 0 : mo18708b2.hashCode());
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC4776f.this.mo18710d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC4776f.this.mo18710d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u.f$c */
    /* loaded from: classes.dex */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC4776f.this.mo18707a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC4776f.this.mo18711e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC4776f.m18742j(AbstractC4776f.this.mo18709c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC4776f.m18743k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i10 = 0;
            for (int mo18710d = AbstractC4776f.this.mo18710d() - 1; mo18710d >= 0; mo18710d--) {
                Object mo18708b = AbstractC4776f.this.mo18708b(mo18710d, 0);
                i10 += mo18708b == null ? 0 : mo18708b.hashCode();
            }
            return i10;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC4776f.this.mo18710d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int mo18711e = AbstractC4776f.this.mo18711e(obj);
            if (mo18711e < 0) {
                return false;
            }
            AbstractC4776f.this.mo18714h(mo18711e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC4776f.m18744o(AbstractC4776f.this.mo18709c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC4776f.m18745p(AbstractC4776f.this.mo18709c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC4776f.this.mo18710d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC4776f.this.m18749q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC4776f.this.m18750r(tArr, 0);
        }
    }

    /* renamed from: u.f$d */
    /* loaded from: classes.dex */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: h */
        public int f17786h;

        /* renamed from: j */
        public boolean f17788j = false;

        /* renamed from: i */
        public int f17787i = -1;

        public d() {
            this.f17786h = AbstractC4776f.this.mo18710d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f17787i++;
            this.f17788j = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f17788j) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C4773c.m18726c(entry.getKey(), AbstractC4776f.this.mo18708b(this.f17787i, 0)) && C4773c.m18726c(entry.getValue(), AbstractC4776f.this.mo18708b(this.f17787i, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f17788j) {
                return (K) AbstractC4776f.this.mo18708b(this.f17787i, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f17788j) {
                return (V) AbstractC4776f.this.mo18708b(this.f17787i, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17787i < this.f17786h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f17788j) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object mo18708b = AbstractC4776f.this.mo18708b(this.f17787i, 0);
            Object mo18708b2 = AbstractC4776f.this.mo18708b(this.f17787i, 1);
            return (mo18708b == null ? 0 : mo18708b.hashCode()) ^ (mo18708b2 != null ? mo18708b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f17788j) {
                throw new IllegalStateException();
            }
            AbstractC4776f.this.mo18714h(this.f17787i);
            this.f17787i--;
            this.f17786h--;
            this.f17788j = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            if (this.f17788j) {
                return (V) AbstractC4776f.this.mo18715i(this.f17787i, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: u.f$e */
    /* loaded from: classes.dex */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC4776f.this.mo18707a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC4776f.this.mo18712f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC4776f.this.mo18710d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int mo18712f = AbstractC4776f.this.mo18712f(obj);
            if (mo18712f < 0) {
                return false;
            }
            AbstractC4776f.this.mo18714h(mo18712f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int mo18710d = AbstractC4776f.this.mo18710d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo18710d) {
                if (collection.contains(AbstractC4776f.this.mo18708b(i10, 1))) {
                    AbstractC4776f.this.mo18714h(i10);
                    i10--;
                    mo18710d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int mo18710d = AbstractC4776f.this.mo18710d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < mo18710d) {
                if (!collection.contains(AbstractC4776f.this.mo18708b(i10, 1))) {
                    AbstractC4776f.this.mo18714h(i10);
                    i10--;
                    mo18710d--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC4776f.this.mo18710d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC4776f.this.m18749q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC4776f.this.m18750r(tArr, 1);
        }
    }

    /* renamed from: j */
    public static <K, V> boolean m18742j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public static <T> boolean m18743k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: o */
    public static <K, V> boolean m18744o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* renamed from: p */
    public static <K, V> boolean m18745p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo18707a();

    /* renamed from: b */
    public abstract Object mo18708b(int i10, int i11);

    /* renamed from: c */
    public abstract Map<K, V> mo18709c();

    /* renamed from: d */
    public abstract int mo18710d();

    /* renamed from: e */
    public abstract int mo18711e(Object obj);

    /* renamed from: f */
    public abstract int mo18712f(Object obj);

    /* renamed from: g */
    public abstract void mo18713g(K k10, V v10);

    /* renamed from: h */
    public abstract void mo18714h(int i10);

    /* renamed from: i */
    public abstract V mo18715i(int i10, V v10);

    /* renamed from: l */
    public Set<Map.Entry<K, V>> m18746l() {
        if (this.f17776a == null) {
            this.f17776a = new b();
        }
        return this.f17776a;
    }

    /* renamed from: m */
    public Set<K> m18747m() {
        if (this.f17777b == null) {
            this.f17777b = new c();
        }
        return this.f17777b;
    }

    /* renamed from: n */
    public Collection<V> m18748n() {
        if (this.f17778c == null) {
            this.f17778c = new e();
        }
        return this.f17778c;
    }

    /* renamed from: q */
    public Object[] m18749q(int i10) {
        int mo18710d = mo18710d();
        Object[] objArr = new Object[mo18710d];
        for (int i11 = 0; i11 < mo18710d; i11++) {
            objArr[i11] = mo18708b(i11, i10);
        }
        return objArr;
    }

    /* renamed from: r */
    public <T> T[] m18750r(T[] tArr, int i10) {
        int mo18710d = mo18710d();
        if (tArr.length < mo18710d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), mo18710d));
        }
        for (int i11 = 0; i11 < mo18710d; i11++) {
            tArr[i11] = mo18708b(i11, i10);
        }
        if (tArr.length > mo18710d) {
            tArr[mo18710d] = null;
        }
        return tArr;
    }
}
