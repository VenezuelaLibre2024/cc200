package p126i7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import p000.C0000a;
import p109h7.C2432o;

/* renamed from: i7.z */
/* loaded from: classes.dex */
public abstract class AbstractC2661z<E> extends AbstractC2607a0<E> implements NavigableSet<E>, InterfaceC2608a1<E> {

    /* renamed from: j */
    public final transient Comparator<? super E> f10404j;

    /* renamed from: k */
    public transient AbstractC2661z<E> f10405k;

    public AbstractC2661z(Comparator<? super E> comparator) {
        this.f10404j = comparator;
    }

    /* renamed from: B */
    public static <E> AbstractC2661z<E> m10845B(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C2432o.m9704j(comparator);
        if (C2611b1.m10513b(comparator, iterable) && (iterable instanceof AbstractC2661z)) {
            AbstractC2661z<E> abstractC2661z = (AbstractC2661z) iterable;
            if (!abstractC2661z.mo10740h()) {
                return abstractC2661z;
            }
        }
        Object[] m10511j = C2610b0.m10511j(iterable);
        return m10849z(comparator, m10511j.length, m10511j);
    }

    /* renamed from: C */
    public static <E> AbstractC2661z<E> m10846C(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return m10845B(comparator, collection);
    }

    /* renamed from: I */
    public static <E> C2652u0<E> m10847I(Comparator<? super E> comparator) {
        return AbstractC2642p0.m10725c().equals(comparator) ? (C2652u0<E>) C2652u0.f10373m : new C2652u0<>(AbstractC2651u.m10770u(), comparator);
    }

    /* renamed from: T */
    public static int m10848T(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public static <E> AbstractC2661z<E> m10849z(Comparator<? super E> comparator, int i10, E... eArr) {
        if (i10 == 0) {
            return m10847I(comparator);
        }
        C2640o0.m10718c(eArr, i10);
        Arrays.sort(eArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            C0000a c0000a = (Object) eArr[i12];
            if (comparator.compare(c0000a, (Object) eArr[i11 - 1]) != 0) {
                eArr[i11] = c0000a;
                i11++;
            }
        }
        Arrays.fill(eArr, i11, i10, (Object) null);
        if (i11 < eArr.length / 2) {
            eArr = (E[]) Arrays.copyOf(eArr, i11);
        }
        return new C2652u0(AbstractC2651u.m10765m(eArr, i11), comparator);
    }

    /* renamed from: D */
    public abstract AbstractC2661z<E> mo10787D();

    @Override // java.util.NavigableSet
    /* renamed from: E */
    public abstract AbstractC2617d1<E> descendingIterator();

    @Override // java.util.NavigableSet
    /* renamed from: G */
    public AbstractC2661z<E> descendingSet() {
        AbstractC2661z<E> abstractC2661z = this.f10405k;
        if (abstractC2661z != null) {
            return abstractC2661z;
        }
        AbstractC2661z<E> mo10787D = mo10787D();
        this.f10405k = mo10787D;
        mo10787D.f10405k = this;
        return mo10787D;
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: J */
    public AbstractC2661z<E> headSet(E e10) {
        return headSet(e10, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: K */
    public AbstractC2661z<E> headSet(E e10, boolean z10) {
        return mo10789L(C2432o.m9704j(e10), z10);
    }

    /* renamed from: L */
    public abstract AbstractC2661z<E> mo10789L(E e10, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: M */
    public AbstractC2661z<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    @Override // java.util.NavigableSet
    /* renamed from: N */
    public AbstractC2661z<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        C2432o.m9704j(e10);
        C2432o.m9704j(e11);
        C2432o.m9698d(this.f10404j.compare(e10, e11) <= 0);
        return mo10790O(e10, z10, e11, z11);
    }

    /* renamed from: O */
    public abstract AbstractC2661z<E> mo10790O(E e10, boolean z10, E e11, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: P */
    public AbstractC2661z<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: Q */
    public AbstractC2661z<E> tailSet(E e10, boolean z10) {
        return mo10791R(C2432o.m9704j(e10), z10);
    }

    /* renamed from: R */
    public abstract AbstractC2661z<E> mo10791R(E e10, boolean z10);

    /* renamed from: S */
    public int m10857S(Object obj, Object obj2) {
        return m10848T(this.f10404j, obj, obj2);
    }

    public E ceiling(E e10) {
        return (E) C2610b0.m10504c(tailSet(e10, true), null);
    }

    @Override // java.util.SortedSet, p126i7.InterfaceC2608a1
    public Comparator<? super E> comparator() {
        return this.f10404j;
    }

    public E first() {
        return iterator().next();
    }

    public E floor(E e10) {
        return (E) C2613c0.m10529m(headSet(e10, true).descendingIterator(), null);
    }

    public E higher(E e10) {
        return (E) C2610b0.m10504c(tailSet(e10, false), null);
    }

    @Override // p126i7.AbstractC2657x, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public abstract AbstractC2617d1<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    public E lower(E e10) {
        return (E) C2613c0.m10529m(headSet(e10, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }
}
