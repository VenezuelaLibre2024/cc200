package p126i7;

import java.io.Serializable;
import p109h7.C2432o;

/* renamed from: i7.m0 */
/* loaded from: classes.dex */
public final class C2636m0 extends AbstractC2642p0<Comparable<?>> implements Serializable {

    /* renamed from: h */
    public static final C2636m0 f10331h = new C2636m0();

    @Override // p126i7.AbstractC2642p0
    /* renamed from: f */
    public <S extends Comparable<?>> AbstractC2642p0<S> mo10700f() {
        return C2654v0.f10387h;
    }

    @Override // p126i7.AbstractC2642p0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C2432o.m9704j(comparable);
        C2432o.m9704j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
