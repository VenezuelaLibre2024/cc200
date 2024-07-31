package p115hd;

import gd.C2236j;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import td.C4753m;

/* renamed from: hd.e0 */
/* loaded from: classes2.dex */
public class C2488e0 extends C2486d0 {
    /* renamed from: d */
    public static final <K, V> Map<K, V> m9896d() {
        C2513y c2513y = C2513y.f9947h;
        C4753m.m18651d(c2513y, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c2513y;
    }

    /* renamed from: e */
    public static final <K, V> Map<K, V> m9897e(C2236j<? extends K, ? extends V>... c2236jArr) {
        C4753m.m18653f(c2236jArr, "pairs");
        return c2236jArr.length > 0 ? m9905m(c2236jArr, new LinkedHashMap(C2486d0.m9892a(c2236jArr.length))) : m9896d();
    }

    /* renamed from: f */
    public static final <K, V> Map<K, V> m9898f(C2236j<? extends K, ? extends V>... c2236jArr) {
        C4753m.m18653f(c2236jArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2486d0.m9892a(c2236jArr.length));
        m9901i(linkedHashMap, c2236jArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: g */
    public static final <K, V> Map<K, V> m9899g(Map<K, ? extends V> map) {
        C4753m.m18653f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C2486d0.m9894c(map) : m9896d();
    }

    /* renamed from: h */
    public static final <K, V> void m9900h(Map<? super K, ? super V> map, Iterable<? extends C2236j<? extends K, ? extends V>> iterable) {
        C4753m.m18653f(map, "<this>");
        C4753m.m18653f(iterable, "pairs");
        for (C2236j<? extends K, ? extends V> c2236j : iterable) {
            map.put(c2236j.m8961a(), c2236j.m8962b());
        }
    }

    /* renamed from: i */
    public static final <K, V> void m9901i(Map<? super K, ? super V> map, C2236j<? extends K, ? extends V>[] c2236jArr) {
        C4753m.m18653f(map, "<this>");
        C4753m.m18653f(c2236jArr, "pairs");
        for (C2236j<? extends K, ? extends V> c2236j : c2236jArr) {
            map.put(c2236j.m8961a(), c2236j.m8962b());
        }
    }

    /* renamed from: j */
    public static final <K, V> Map<K, V> m9902j(Iterable<? extends C2236j<? extends K, ? extends V>> iterable) {
        C4753m.m18653f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m9899g(m9903k(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m9896d();
        }
        if (size != 1) {
            return m9903k(iterable, new LinkedHashMap(C2486d0.m9892a(collection.size())));
        }
        return C2486d0.m9893b(iterable instanceof List ? (C2236j<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: k */
    public static final <K, V, M extends Map<? super K, ? super V>> M m9903k(Iterable<? extends C2236j<? extends K, ? extends V>> iterable, M m10) {
        C4753m.m18653f(iterable, "<this>");
        C4753m.m18653f(m10, "destination");
        m9900h(m10, iterable);
        return m10;
    }

    /* renamed from: l */
    public static final <K, V> Map<K, V> m9904l(Map<? extends K, ? extends V> map) {
        C4753m.m18653f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m9906n(map) : C2486d0.m9894c(map) : m9896d();
    }

    /* renamed from: m */
    public static final <K, V, M extends Map<? super K, ? super V>> M m9905m(C2236j<? extends K, ? extends V>[] c2236jArr, M m10) {
        C4753m.m18653f(c2236jArr, "<this>");
        C4753m.m18653f(m10, "destination");
        m9901i(m10, c2236jArr);
        return m10;
    }

    /* renamed from: n */
    public static final <K, V> Map<K, V> m9906n(Map<? extends K, ? extends V> map) {
        C4753m.m18653f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
