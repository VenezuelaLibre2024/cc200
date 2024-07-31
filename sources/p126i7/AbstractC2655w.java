package p126i7;

import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: i7.w */
/* loaded from: classes.dex */
public abstract class AbstractC2655w<K, V> extends AbstractC2623g<K, V> implements Serializable {

    /* renamed from: k */
    public final transient AbstractC2653v<K, ? extends AbstractC2647s<V>> f10388k;

    /* renamed from: l */
    public final transient int f10389l;

    /* renamed from: i7.w$a */
    /* loaded from: classes.dex */
    public class a extends AbstractC2617d1<V> {

        /* renamed from: h */
        public Iterator<? extends AbstractC2647s<V>> f10390h;

        /* renamed from: i */
        public Iterator<V> f10391i = C2613c0.m10522f();

        public a() {
            this.f10390h = AbstractC2655w.this.f10388k.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10391i.hasNext() || this.f10390h.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f10391i.hasNext()) {
                this.f10391i = this.f10390h.next().iterator();
            }
            return this.f10391i.next();
        }
    }

    /* renamed from: i7.w$b */
    /* loaded from: classes.dex */
    public static class b<K, V> {

        /* renamed from: a */
        public final Map<K, Collection<V>> f10393a = C2644q0.m10732c();

        /* renamed from: b */
        public Comparator<? super K> f10394b;

        /* renamed from: c */
        public Comparator<? super V> f10395c;
    }

    /* renamed from: i7.w$c */
    /* loaded from: classes.dex */
    public static final class c<K, V> extends AbstractC2647s<V> {

        /* renamed from: i */
        public final transient AbstractC2655w<K, V> f10396i;

        public c(AbstractC2655w<K, V> abstractC2655w) {
            this.f10396i = abstractC2655w;
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: b */
        public int mo10736b(Object[] objArr, int i10) {
            AbstractC2617d1<? extends AbstractC2647s<V>> it = this.f10396i.f10388k.values().iterator();
            while (it.hasNext()) {
                i10 = it.next().mo10736b(objArr, i10);
            }
            return i10;
        }

        @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f10396i.mo10595b(obj);
        }

        @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: j */
        public AbstractC2617d1<V> iterator() {
            return this.f10396i.mo10546g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f10396i.size();
        }
    }

    public AbstractC2655w(AbstractC2653v<K, ? extends AbstractC2647s<V>> abstractC2653v, int i10) {
        this.f10388k = abstractC2653v;
        this.f10389l = i10;
    }

    @Override // p126i7.AbstractC2621f
    /* renamed from: b */
    public boolean mo10595b(Object obj) {
        return obj != null && super.mo10595b(obj);
    }

    @Override // p126i7.AbstractC2621f
    /* renamed from: c */
    public Map<K, Collection<V>> mo10596c() {
        throw new AssertionError("should never be called");
    }

    @Override // p126i7.InterfaceC2626h0
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p126i7.AbstractC2621f
    /* renamed from: d */
    public Set<K> mo10597d() {
        throw new AssertionError("unreachable");
    }

    @Override // p126i7.AbstractC2621f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p126i7.AbstractC2621f, p126i7.InterfaceC2626h0
    /* renamed from: h */
    public AbstractC2653v<K, Collection<V>> mo10514a() {
        return this.f10388k;
    }

    @Override // p126i7.AbstractC2621f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p126i7.AbstractC2621f
    /* renamed from: i */
    public AbstractC2647s<V> mo10545e() {
        return new c(this);
    }

    @Override // p126i7.AbstractC2621f
    /* renamed from: j */
    public AbstractC2617d1<V> mo10546g() {
        return new a();
    }

    @Override // p126i7.AbstractC2621f, p126i7.InterfaceC2626h0
    /* renamed from: k */
    public AbstractC2647s<V> values() {
        return (AbstractC2647s) super.values();
    }

    @Override // p126i7.InterfaceC2626h0
    @Deprecated
    public final boolean put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // p126i7.InterfaceC2626h0
    public int size() {
        return this.f10389l;
    }

    @Override // p126i7.AbstractC2621f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
