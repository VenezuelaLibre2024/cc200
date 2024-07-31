package p126i7;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p079f6.C1841a;
import p109h7.C2428k;
import p109h7.C2432o;
import p109h7.InterfaceC2424g;
import p126i7.C2660y0;

/* renamed from: i7.g0 */
/* loaded from: classes.dex */
public final class C2624g0 {

    /* renamed from: i7.g0$a */
    /* loaded from: classes.dex */
    public class a<K, V> extends AbstractC2614c1<Map.Entry<K, V>, V> {
        public a(Iterator it) {
            super(it);
        }

        @Override // p126i7.AbstractC2614c1
        /* renamed from: c */
        public V mo10536a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* renamed from: i7.g0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends Enum<b> implements InterfaceC2424g<Map.Entry<?, ?>, Object> {

        /* renamed from: h */
        public static final b f10291h = new a("KEY", 0);

        /* renamed from: i */
        public static final b f10292i = new C6187b("VALUE", 1);

        /* renamed from: j */
        public static final /* synthetic */ b[] f10293j = m10612b();

        /* renamed from: i7.g0$b$a */
        /* loaded from: classes.dex */
        public enum a extends b {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p109h7.InterfaceC2424g
            /* renamed from: c */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* renamed from: i7.g0$b$b */
        /* loaded from: classes.dex */
        public enum C6187b extends b {
            public C6187b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // p109h7.InterfaceC2424g
            /* renamed from: c */
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        public b(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ b(String str, int i10, C2622f0 c2622f0) {
            this(str, i10);
        }

        /* renamed from: b */
        public static /* synthetic */ b[] m10612b() {
            return new b[]{f10291h, f10292i};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f10293j.clone();
        }
    }

    /* renamed from: i7.g0$c */
    /* loaded from: classes.dex */
    public static abstract class c<K, V> extends C2660y0.d<Map.Entry<K, V>> {
        /* renamed from: a */
        public abstract Map<K, V> mo10558a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo10558a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo10558a().isEmpty();
        }

        @Override // p126i7.C2660y0.d, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C2432o.m9704j(collection));
            } catch (UnsupportedOperationException unused) {
                return C2660y0.m10843j(this, collection.iterator());
            }
        }

        @Override // p126i7.C2660y0.d, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C2432o.m9704j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m10840g = C2660y0.m10840g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        m10840g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo10558a().keySet().retainAll(m10840g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo10558a().size();
        }
    }

    /* renamed from: i7.g0$d */
    /* loaded from: classes.dex */
    public static class d<K, V> extends C2660y0.d<K> {

        /* renamed from: h */
        public final Map<K, V> f10294h;

        public d(Map<K, V> map) {
            this.f10294h = (Map) C2432o.m9704j(map);
        }

        /* renamed from: a */
        public Map<K, V> m10615a() {
            return this.f10294h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m10615a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m10615a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m10615a().size();
        }
    }

    /* renamed from: i7.g0$e */
    /* loaded from: classes.dex */
    public static class e<K, V> extends AbstractCollection<V> {

        /* renamed from: h */
        public final Map<K, V> f10295h;

        public e(Map<K, V> map) {
            this.f10295h = (Map) C2432o.m9704j(map);
        }

        /* renamed from: a */
        public final Map<K, V> m10616a() {
            return this.f10295h;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m10616a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m10616a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m10616a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return C2624g0.m10610l(m10616a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : m10616a().entrySet()) {
                    if (C2428k.m9688a(obj, entry.getValue())) {
                        m10616a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) C2432o.m9704j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m10839f = C2660y0.m10839f();
                for (Map.Entry<K, V> entry : m10616a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m10839f.add(entry.getKey());
                    }
                }
                return m10616a().keySet().removeAll(m10839f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) C2432o.m9704j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m10839f = C2660y0.m10839f();
                for (Map.Entry<K, V> entry : m10616a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m10839f.add(entry.getKey());
                    }
                }
                return m10616a().keySet().retainAll(m10839f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m10616a().size();
        }
    }

    /* renamed from: i7.g0$f */
    /* loaded from: classes.dex */
    public static abstract class f<K, V> extends AbstractMap<K, V> {

        /* renamed from: h */
        public transient Set<Map.Entry<K, V>> f10296h;

        /* renamed from: i */
        public transient Collection<V> f10297i;

        /* renamed from: a */
        public abstract Set<Map.Entry<K, V>> mo10554a();

        /* renamed from: b */
        public Collection<V> m10617b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f10296h;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> mo10554a = mo10554a();
            this.f10296h = mo10554a;
            return mo10554a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f10297i;
            if (collection != null) {
                return collection;
            }
            Collection<V> m10617b = m10617b();
            this.f10297i = m10617b;
            return m10617b;
        }
    }

    /* renamed from: a */
    public static int m10599a(int i10) {
        if (i10 >= 3) {
            return i10 < 1073741824 ? (int) Math.ceil(i10 / 0.75d) : C1841a.e.API_PRIORITY_OTHER;
        }
        C2627i.m10619b(i10, "expectedSize");
        return i10 + 1;
    }

    /* renamed from: b */
    public static boolean m10600b(Map<?, ?> map, Object obj) {
        return C2613c0.m10520d(m10610l(map.entrySet().iterator()), obj);
    }

    /* renamed from: c */
    public static boolean m10601c(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: d */
    public static <K, V> Map.Entry<K, V> m10602d(K k10, V v10) {
        return new C2649t(k10, v10);
    }

    /* renamed from: e */
    public static <K> InterfaceC2424g<Map.Entry<K, ?>, K> m10603e() {
        return b.f10291h;
    }

    /* renamed from: f */
    public static <K, V> IdentityHashMap<K, V> m10604f() {
        return new IdentityHashMap<>();
    }

    /* renamed from: g */
    public static boolean m10605g(Map<?, ?> map, Object obj) {
        C2432o.m9704j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: h */
    public static <V> V m10606h(Map<?, V> map, Object obj) {
        C2432o.m9704j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static <V> V m10607i(Map<?, V> map, Object obj) {
        C2432o.m9704j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static String m10608j(Map<?, ?> map) {
        StringBuilder m10622b = C2629j.m10622b(map.size());
        m10622b.append('{');
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                m10622b.append(", ");
            }
            z10 = false;
            m10622b.append(entry.getKey());
            m10622b.append('=');
            m10622b.append(entry.getValue());
        }
        m10622b.append('}');
        return m10622b.toString();
    }

    /* renamed from: k */
    public static <V> InterfaceC2424g<Map.Entry<?, V>, V> m10609k() {
        return b.f10292i;
    }

    /* renamed from: l */
    public static <K, V> Iterator<V> m10610l(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
