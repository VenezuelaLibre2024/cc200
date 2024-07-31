package p301v0;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p301v0.C5028a0;

/* renamed from: v0.l0 */
/* loaded from: classes.dex */
public final class C5061l0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: i */
    public static final C5061l0 f19022i;

    /* renamed from: h */
    public boolean f19023h;

    static {
        C5061l0 c5061l0 = new C5061l0();
        f19022i = c5061l0;
        c5061l0.m20346l();
    }

    public C5061l0() {
        this.f19023h = true;
    }

    public C5061l0(Map<K, V> map) {
        super(map);
        this.f19023h = true;
    }

    /* renamed from: b */
    public static <K, V> int m20338b(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i10 += m20339c(entry.getValue()) ^ m20339c(entry.getKey());
        }
        return i10;
    }

    /* renamed from: c */
    public static int m20339c(Object obj) {
        if (obj instanceof byte[]) {
            return C5028a0.m19792d((byte[]) obj);
        }
        if (obj instanceof C5028a0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* renamed from: e */
    public static void m20340e(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C5028a0.m19789a(obj);
            C5028a0.m19789a(map.get(obj));
        }
    }

    /* renamed from: f */
    public static <K, V> C5061l0<K, V> m20341f() {
        return f19022i;
    }

    /* renamed from: h */
    public static boolean m20342h(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* renamed from: i */
    public static <K, V> boolean m20343i(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m20342h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m20344g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m20343i(this, (Map) obj);
    }

    /* renamed from: g */
    public final void m20344g() {
        if (!m20345k()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m20338b(this);
    }

    /* renamed from: k */
    public boolean m20345k() {
        return this.f19023h;
    }

    /* renamed from: l */
    public void m20346l() {
        this.f19023h = false;
    }

    /* renamed from: m */
    public void m20347m(C5061l0<K, V> c5061l0) {
        m20344g();
        if (c5061l0.isEmpty()) {
            return;
        }
        putAll(c5061l0);
    }

    /* renamed from: n */
    public C5061l0<K, V> m20348n() {
        return isEmpty() ? new C5061l0<>() : new C5061l0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        m20344g();
        C5028a0.m19789a(k10);
        C5028a0.m19789a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m20344g();
        m20340e(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m20344g();
        return (V) super.remove(obj);
    }
}
