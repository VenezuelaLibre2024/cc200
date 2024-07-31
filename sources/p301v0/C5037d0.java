package p301v0;

import java.util.Iterator;
import java.util.Map;

/* renamed from: v0.d0 */
/* loaded from: classes.dex */
public class C5037d0 extends C5040e0 {

    /* renamed from: f */
    public final InterfaceC5079r0 f18892f;

    /* renamed from: v0.d0$b */
    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: h */
        public Map.Entry<K, C5037d0> f18893h;

        public b(Map.Entry<K, C5037d0> entry) {
            this.f18893h = entry;
        }

        /* renamed from: a */
        public C5037d0 m19832a() {
            return this.f18893h.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f18893h.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            C5037d0 value = this.f18893h.getValue();
            if (value == null) {
                return null;
            }
            return value.m19831f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof InterfaceC5079r0) {
                return this.f18893h.getValue().m19908d((InterfaceC5079r0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: v0.d0$c */
    /* loaded from: classes.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: h */
        public Iterator<Map.Entry<K, Object>> f18894h;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f18894h = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f18894h.next();
            return next.getValue() instanceof C5037d0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18894h.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f18894h.remove();
        }
    }

    @Override // p301v0.C5040e0
    public boolean equals(Object obj) {
        return m19831f().equals(obj);
    }

    /* renamed from: f */
    public InterfaceC5079r0 m19831f() {
        return m19907c(this.f18892f);
    }

    @Override // p301v0.C5040e0
    public int hashCode() {
        return m19831f().hashCode();
    }

    public String toString() {
        return m19831f().toString();
    }
}
