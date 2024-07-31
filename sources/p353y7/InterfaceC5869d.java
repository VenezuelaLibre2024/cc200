package p353y7;

import java.util.Set;
import p354y8.InterfaceC5895a;
import p354y8.InterfaceC5896b;

/* renamed from: y7.d */
/* loaded from: classes.dex */
public interface InterfaceC5869d {
    /* renamed from: a */
    default <T> T mo23492a(C5872e0<T> c5872e0) {
        InterfaceC5896b<T> mo23493b = mo23493b(c5872e0);
        if (mo23493b == null) {
            return null;
        }
        return mo23493b.get();
    }

    /* renamed from: b */
    <T> InterfaceC5896b<T> mo23493b(C5872e0<T> c5872e0);

    /* renamed from: c */
    default <T> InterfaceC5896b<T> mo23494c(Class<T> cls) {
        return mo23493b(C5872e0.m23505b(cls));
    }

    /* renamed from: d */
    default <T> Set<T> mo23495d(C5872e0<T> c5872e0) {
        return mo23496e(c5872e0).get();
    }

    /* renamed from: e */
    <T> InterfaceC5896b<Set<T>> mo23496e(C5872e0<T> c5872e0);

    /* renamed from: f */
    default <T> Set<T> m23497f(Class<T> cls) {
        return mo23495d(C5872e0.m23505b(cls));
    }

    /* renamed from: g */
    default <T> InterfaceC5895a<T> mo23498g(Class<T> cls) {
        return mo23499h(C5872e0.m23505b(cls));
    }

    default <T> T get(Class<T> cls) {
        return (T) mo23492a(C5872e0.m23505b(cls));
    }

    /* renamed from: h */
    <T> InterfaceC5895a<T> mo23499h(C5872e0<T> c5872e0);
}
