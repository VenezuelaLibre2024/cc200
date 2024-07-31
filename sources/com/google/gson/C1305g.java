package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.g */
/* loaded from: classes.dex */
public final class C1305g extends AbstractC1374j implements Iterable<AbstractC1374j> {

    /* renamed from: h */
    public final List<AbstractC1374j> f4980h = new ArrayList();

    @Override // com.google.gson.AbstractC1374j
    /* renamed from: a */
    public boolean mo5620a() {
        if (this.f4980h.size() == 1) {
            return this.f4980h.get(0).mo5620a();
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.AbstractC1374j
    /* renamed from: e */
    public String mo5621e() {
        if (this.f4980h.size() == 1) {
            return this.f4980h.get(0).mo5621e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C1305g) && ((C1305g) obj).f4980h.equals(this.f4980h));
    }

    public int hashCode() {
        return this.f4980h.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<AbstractC1374j> iterator() {
        return this.f4980h.iterator();
    }

    /* renamed from: n */
    public void m5622n(AbstractC1374j abstractC1374j) {
        if (abstractC1374j == null) {
            abstractC1374j = C1376l.f5213a;
        }
        this.f4980h.add(abstractC1374j);
    }
}
