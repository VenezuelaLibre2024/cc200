package p126i7;

import java.util.Comparator;
import java.util.Map;
import p109h7.InterfaceC2424g;

/* renamed from: i7.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC2642p0<T> implements Comparator<T> {
    /* renamed from: a */
    public static <T> AbstractC2642p0<T> m10724a(Comparator<T> comparator) {
        return comparator instanceof AbstractC2642p0 ? (AbstractC2642p0) comparator : new C2635m(comparator);
    }

    /* renamed from: c */
    public static <C extends Comparable> AbstractC2642p0<C> m10725c() {
        return C2636m0.f10331h;
    }

    /* renamed from: b */
    public <E extends T> AbstractC2651u<E> m10726b(Iterable<E> iterable) {
        return AbstractC2651u.m10763C(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    /* renamed from: d */
    public <T2 extends T> AbstractC2642p0<Map.Entry<T2, ?>> m10727d() {
        return (AbstractC2642p0<Map.Entry<T2, ?>>) m10728e(C2624g0.m10603e());
    }

    /* renamed from: e */
    public <F> AbstractC2642p0<F> m10728e(InterfaceC2424g<F, ? extends T> interfaceC2424g) {
        return new C2625h(interfaceC2424g, this);
    }

    /* renamed from: f */
    public <S extends T> AbstractC2642p0<S> mo10700f() {
        return new C2656w0(this);
    }
}
