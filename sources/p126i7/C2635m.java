package p126i7;

import java.io.Serializable;
import java.util.Comparator;
import p109h7.C2432o;

/* renamed from: i7.m */
/* loaded from: classes.dex */
public final class C2635m<T> extends AbstractC2642p0<T> implements Serializable {

    /* renamed from: h */
    public final Comparator<T> f10330h;

    public C2635m(Comparator<T> comparator) {
        this.f10330h = (Comparator) C2432o.m9704j(comparator);
    }

    @Override // p126i7.AbstractC2642p0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f10330h.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2635m) {
            return this.f10330h.equals(((C2635m) obj).f10330h);
        }
        return false;
    }

    public int hashCode() {
        return this.f10330h.hashCode();
    }

    public String toString() {
        return this.f10330h.toString();
    }
}
