package p126i7;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p109h7.C2432o;
import p109h7.InterfaceC2433p;

/* renamed from: i7.b0 */
/* loaded from: classes.dex */
public final class C2610b0 {
    /* renamed from: a */
    public static <T> boolean m10502a(Iterable<T> iterable, InterfaceC2433p<? super T> interfaceC2433p) {
        return C2613c0.m10518b(iterable.iterator(), interfaceC2433p);
    }

    /* renamed from: b */
    public static <E> Collection<E> m10503b(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : C2619e0.m10593i(iterable.iterator());
    }

    /* renamed from: c */
    public static <T> T m10504c(Iterable<? extends T> iterable, T t10) {
        return (T) C2613c0.m10529m(iterable.iterator(), t10);
    }

    /* renamed from: d */
    public static <T> T m10505d(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) C2613c0.m10527k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) m10507f(list);
    }

    /* renamed from: e */
    public static <T> T m10506e(Iterable<? extends T> iterable, T t10) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return t10;
            }
            if (iterable instanceof List) {
                return (T) m10507f(C2619e0.m10585a(iterable));
            }
        }
        return (T) C2613c0.m10528l(iterable.iterator(), t10);
    }

    /* renamed from: f */
    public static <T> T m10507f(List<T> list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: g */
    public static <T> boolean m10508g(Iterable<T> iterable, InterfaceC2433p<? super T> interfaceC2433p) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? m10509h((List) iterable, (InterfaceC2433p) C2432o.m9704j(interfaceC2433p)) : C2613c0.m10533q(iterable.iterator(), interfaceC2433p);
    }

    /* renamed from: h */
    public static <T> boolean m10509h(List<T> list, InterfaceC2433p<? super T> interfaceC2433p) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            T t10 = list.get(i10);
            if (!interfaceC2433p.apply(t10)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, t10);
                    } catch (IllegalArgumentException unused) {
                        m10510i(list, interfaceC2433p, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m10510i(list, interfaceC2433p, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    /* renamed from: i */
    public static <T> void m10510i(List<T> list, InterfaceC2433p<? super T> interfaceC2433p, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (interfaceC2433p.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    /* renamed from: j */
    public static Object[] m10511j(Iterable<?> iterable) {
        return m10503b(iterable).toArray();
    }
}
