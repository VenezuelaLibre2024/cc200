package p126i7;

import java.io.Serializable;
import p109h7.C2432o;

/* renamed from: i7.v0 */
/* loaded from: classes.dex */
public final class C2654v0 extends AbstractC2642p0<Comparable<?>> implements Serializable {

    /* renamed from: h */
    public static final C2654v0 f10387h = new C2654v0();

    @Override // p126i7.AbstractC2642p0
    /* renamed from: f */
    public <S extends Comparable<?>> AbstractC2642p0<S> mo10700f() {
        return AbstractC2642p0.m10725c();
    }

    @Override // p126i7.AbstractC2642p0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        C2432o.m9704j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
