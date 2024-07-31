package p126i7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: i7.f */
/* loaded from: classes.dex */
public abstract class AbstractC2621f<K, V> implements InterfaceC2626h0<K, V> {

    /* renamed from: h */
    public transient Set<K> f10287h;

    /* renamed from: i */
    public transient Collection<V> f10288i;

    /* renamed from: j */
    public transient Map<K, Collection<V>> f10289j;

    /* renamed from: i7.f$a */
    /* loaded from: classes.dex */
    public class a extends AbstractCollection<V> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2621f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2621f.this.mo10595b(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractC2621f.this.mo10546g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC2621f.this.size();
        }
    }

    @Override // p126i7.InterfaceC2626h0
    /* renamed from: a */
    public Map<K, Collection<V>> mo10514a() {
        Map<K, Collection<V>> map = this.f10289j;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mo10596c = mo10596c();
        this.f10289j = mo10596c;
        return mo10596c;
    }

    /* renamed from: b */
    public boolean mo10595b(Object obj) {
        Iterator<Collection<V>> it = mo10514a().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public abstract Map<K, Collection<V>> mo10596c();

    /* renamed from: d */
    public abstract Set<K> mo10597d();

    /* renamed from: e */
    public abstract Collection<V> mo10545e();

    public boolean equals(Object obj) {
        return C2632k0.m10686a(this, obj);
    }

    /* renamed from: f */
    public Set<K> m10598f() {
        Set<K> set = this.f10287h;
        if (set != null) {
            return set;
        }
        Set<K> mo10597d = mo10597d();
        this.f10287h = mo10597d;
        return mo10597d;
    }

    /* renamed from: g */
    public abstract Iterator<V> mo10546g();

    public int hashCode() {
        return mo10514a().hashCode();
    }

    public String toString() {
        return mo10514a().toString();
    }

    @Override // p126i7.InterfaceC2626h0
    public Collection<V> values() {
        Collection<V> collection = this.f10288i;
        if (collection != null) {
            return collection;
        }
        Collection<V> mo10545e = mo10545e();
        this.f10288i = mo10545e;
        return mo10545e;
    }
}
