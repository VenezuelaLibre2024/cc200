package p126i7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: i7.p */
/* loaded from: classes.dex */
public abstract class AbstractC2641p<K, V> extends AbstractC2643q implements Map<K, V> {
    /* renamed from: b */
    public abstract Map<K, V> mo10720b();

    /* renamed from: c */
    public boolean m10721c(Object obj) {
        return C2624g0.m10600b(this, obj);
    }

    @Override // java.util.Map
    public void clear() {
        mo10720b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo10720b().containsKey(obj);
    }

    /* renamed from: d */
    public boolean m10722d(Object obj) {
        return C2624g0.m10601c(this, obj);
    }

    /* renamed from: e */
    public int m10723e() {
        return C2660y0.m10837d(entrySet());
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return mo10720b().entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return mo10720b().get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo10720b().isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return mo10720b().keySet();
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        return mo10720b().put(k10, v10);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        mo10720b().putAll(map);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        return mo10720b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo10720b().size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return mo10720b().values();
    }
}
