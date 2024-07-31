package p126i7;

import java.io.Serializable;
import p109h7.C2432o;

/* renamed from: i7.w0 */
/* loaded from: classes.dex */
public final class C2656w0<T> extends AbstractC2642p0<T> implements Serializable {

    /* renamed from: h */
    public final AbstractC2642p0<? super T> f10397h;

    public C2656w0(AbstractC2642p0<? super T> abstractC2642p0) {
        this.f10397h = (AbstractC2642p0) C2432o.m9704j(abstractC2642p0);
    }

    @Override // p126i7.AbstractC2642p0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f10397h.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2656w0) {
            return this.f10397h.equals(((C2656w0) obj).f10397h);
        }
        return false;
    }

    @Override // p126i7.AbstractC2642p0
    /* renamed from: f */
    public <S extends T> AbstractC2642p0<S> mo10700f() {
        return this.f10397h;
    }

    public int hashCode() {
        return -this.f10397h.hashCode();
    }

    public String toString() {
        return this.f10397h + ".reverse()";
    }
}
