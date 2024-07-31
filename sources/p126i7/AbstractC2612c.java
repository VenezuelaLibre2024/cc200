package p126i7;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: i7.c */
/* loaded from: classes.dex */
public abstract class AbstractC2612c<K, V> extends AbstractC2615d<K, V> implements InterfaceC2616d0<K, V> {
    public AbstractC2612c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // p126i7.AbstractC2621f, p126i7.InterfaceC2626h0
    /* renamed from: a */
    public Map<K, Collection<V>> mo10514a() {
        return super.mo10514a();
    }

    @Override // p126i7.AbstractC2621f
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p126i7.AbstractC2615d, p126i7.InterfaceC2626h0
    public boolean put(K k10, V v10) {
        return super.put(k10, v10);
    }

    @Override // p126i7.AbstractC2615d
    /* renamed from: u */
    public <E> Collection<E> mo10515u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // p126i7.AbstractC2615d
    /* renamed from: v */
    public Collection<V> mo10516v(K k10, Collection<V> collection) {
        return m10552w(k10, (List) collection, null);
    }
}
