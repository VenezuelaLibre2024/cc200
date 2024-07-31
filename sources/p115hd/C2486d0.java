package p115hd;

import gd.C2236j;
import java.util.Collections;
import java.util.Map;
import p079f6.C1841a;
import td.C4753m;

/* renamed from: hd.d0 */
/* loaded from: classes2.dex */
public class C2486d0 extends C2484c0 {
    /* renamed from: a */
    public static final int m9892a(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : C1841a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: b */
    public static final <K, V> Map<K, V> m9893b(C2236j<? extends K, ? extends V> c2236j) {
        C4753m.m18653f(c2236j, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(c2236j.m8963c(), c2236j.m8964d());
        C4753m.m18652e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* renamed from: c */
    public static final <K, V> Map<K, V> m9894c(Map<? extends K, ? extends V> map) {
        C4753m.m18653f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C4753m.m18652e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
