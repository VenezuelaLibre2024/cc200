package p126i7;

import java.io.Serializable;
import p109h7.C2428k;
import p109h7.C2432o;
import p109h7.InterfaceC2424g;

/* renamed from: i7.h */
/* loaded from: classes.dex */
public final class C2625h<F, T> extends AbstractC2642p0<F> implements Serializable {

    /* renamed from: h */
    public final InterfaceC2424g<F, ? extends T> f10298h;

    /* renamed from: i */
    public final AbstractC2642p0<T> f10299i;

    public C2625h(InterfaceC2424g<F, ? extends T> interfaceC2424g, AbstractC2642p0<T> abstractC2642p0) {
        this.f10298h = (InterfaceC2424g) C2432o.m9704j(interfaceC2424g);
        this.f10299i = (AbstractC2642p0) C2432o.m9704j(abstractC2642p0);
    }

    @Override // p126i7.AbstractC2642p0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f10299i.compare(this.f10298h.apply(f10), this.f10298h.apply(f11));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2625h)) {
            return false;
        }
        C2625h c2625h = (C2625h) obj;
        return this.f10298h.equals(c2625h.f10298h) && this.f10299i.equals(c2625h.f10299i);
    }

    public int hashCode() {
        return C2428k.m9689b(this.f10298h, this.f10299i);
    }

    public String toString() {
        return this.f10299i + ".onResultOf(" + this.f10298h + ")";
    }
}
