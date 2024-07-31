package p126i7;

import java.util.Comparator;
import java.util.SortedSet;
import p109h7.C2432o;

/* renamed from: i7.b1 */
/* loaded from: classes.dex */
public final class C2611b1 {
    /* renamed from: a */
    public static <E> Comparator<? super E> m10512a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? AbstractC2642p0.m10725c() : comparator;
    }

    /* renamed from: b */
    public static boolean m10513b(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        C2432o.m9704j(comparator);
        C2432o.m9704j(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m10512a((SortedSet) iterable);
        } else {
            if (!(iterable instanceof InterfaceC2608a1)) {
                return false;
            }
            comparator2 = ((InterfaceC2608a1) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
