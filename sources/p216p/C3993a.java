package p216p;

import java.util.HashMap;
import java.util.Map;
import p216p.C3994b;

/* renamed from: p.a */
/* loaded from: classes.dex */
public class C3993a<K, V> extends C3994b<K, V> {

    /* renamed from: l */
    public final HashMap<K, C3994b.c<K, V>> f14379l = new HashMap<>();

    @Override // p216p.C3994b
    /* renamed from: b */
    public C3994b.c<K, V> mo15123b(K k10) {
        return this.f14379l.get(k10);
    }

    public boolean contains(K k10) {
        return this.f14379l.containsKey(k10);
    }

    @Override // p216p.C3994b
    /* renamed from: h */
    public V mo15124h(K k10, V v10) {
        C3994b.c<K, V> mo15123b = mo15123b(k10);
        if (mo15123b != null) {
            return mo15123b.f14385i;
        }
        this.f14379l.put(k10, m15130e(k10, v10));
        return null;
    }

    @Override // p216p.C3994b
    /* renamed from: j */
    public V mo15125j(K k10) {
        V v10 = (V) super.mo15125j(k10);
        this.f14379l.remove(k10);
        return v10;
    }

    /* renamed from: k */
    public Map.Entry<K, V> m15126k(K k10) {
        if (contains(k10)) {
            return this.f14379l.get(k10).f14387k;
        }
        return null;
    }
}
