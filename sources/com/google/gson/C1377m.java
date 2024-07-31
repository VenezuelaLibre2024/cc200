package com.google.gson;

import com.google.gson.internal.C1364g;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.gson.m */
/* loaded from: classes.dex */
public final class C1377m extends AbstractC1374j {

    /* renamed from: a */
    public final C1364g<String, AbstractC1374j> f5214a = new C1364g<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1377m) && ((C1377m) obj).f5214a.equals(this.f5214a));
    }

    public int hashCode() {
        return this.f5214a.hashCode();
    }

    /* renamed from: n */
    public void m5842n(String str, AbstractC1374j abstractC1374j) {
        C1364g<String, AbstractC1374j> c1364g = this.f5214a;
        if (abstractC1374j == null) {
            abstractC1374j = C1376l.f5213a;
        }
        c1364g.put(str, abstractC1374j);
    }

    /* renamed from: o */
    public Set<Map.Entry<String, AbstractC1374j>> m5843o() {
        return this.f5214a.entrySet();
    }

    /* renamed from: p */
    public boolean m5844p(String str) {
        return this.f5214a.containsKey(str);
    }

    /* renamed from: q */
    public AbstractC1374j m5845q(String str) {
        return this.f5214a.remove(str);
    }
}
