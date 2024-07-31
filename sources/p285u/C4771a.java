package p285u;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: u.a */
/* loaded from: classes.dex */
public class C4771a<K, V> extends C4777g<K, V> implements Map<K, V> {

    /* renamed from: o */
    public AbstractC4776f<K, V> f17755o;

    /* renamed from: u.a$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC4776f<K, V> {
        public a() {
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: a */
        public void mo18707a() {
            C4771a.this.clear();
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: b */
        public Object mo18708b(int i10, int i11) {
            return C4771a.this.f17796i[(i10 << 1) + i11];
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: c */
        public Map<K, V> mo18709c() {
            return C4771a.this;
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: d */
        public int mo18710d() {
            return C4771a.this.f17797j;
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: e */
        public int mo18711e(Object obj) {
            return C4771a.this.m18758f(obj);
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: f */
        public int mo18712f(Object obj) {
            return C4771a.this.m18760h(obj);
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: g */
        public void mo18713g(K k10, V v10) {
            C4771a.this.put(k10, v10);
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: h */
        public void mo18714h(int i10) {
            C4771a.this.m18763k(i10);
        }

        @Override // p285u.AbstractC4776f
        /* renamed from: i */
        public V mo18715i(int i10, V v10) {
            return C4771a.this.m18764l(i10, v10);
        }
    }

    public C4771a() {
    }

    public C4771a(int i10) {
        super(i10);
    }

    public C4771a(C4777g c4777g) {
        super(c4777g);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m18705n().m18746l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m18705n().m18747m();
    }

    /* renamed from: n */
    public final AbstractC4776f<K, V> m18705n() {
        if (this.f17755o == null) {
            this.f17755o = new a();
        }
        return this.f17755o;
    }

    /* renamed from: o */
    public boolean m18706o(Collection<?> collection) {
        return AbstractC4776f.m18745p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m18756c(this.f17797j + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m18705n().m18748n();
    }
}
