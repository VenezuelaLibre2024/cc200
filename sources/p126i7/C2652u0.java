package p126i7;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import p109h7.C2432o;

/* renamed from: i7.u0 */
/* loaded from: classes.dex */
public final class C2652u0<E> extends AbstractC2661z<E> {

    /* renamed from: m */
    public static final C2652u0<Comparable> f10373m = new C2652u0<>(AbstractC2651u.m10770u(), AbstractC2642p0.m10725c());

    /* renamed from: l */
    public final transient AbstractC2651u<E> f10374l;

    public C2652u0(AbstractC2651u<E> abstractC2651u, Comparator<? super E> comparator) {
        super(comparator);
        this.f10374l = abstractC2651u;
    }

    @Override // p126i7.AbstractC2661z
    /* renamed from: D */
    public AbstractC2661z<E> mo10787D() {
        Comparator reverseOrder = Collections.reverseOrder(this.f10404j);
        return isEmpty() ? AbstractC2661z.m10847I(reverseOrder) : new C2652u0(this.f10374l.mo10776B(), reverseOrder);
    }

    @Override // p126i7.AbstractC2661z, java.util.NavigableSet
    /* renamed from: E */
    public AbstractC2617d1<E> descendingIterator() {
        return this.f10374l.mo10776B().iterator();
    }

    @Override // p126i7.AbstractC2661z
    /* renamed from: L */
    public AbstractC2661z<E> mo10789L(E e10, boolean z10) {
        return m10792U(0, m10793V(e10, z10));
    }

    @Override // p126i7.AbstractC2661z
    /* renamed from: O */
    public AbstractC2661z<E> mo10790O(E e10, boolean z10, E e11, boolean z11) {
        return mo10791R(e10, z10).mo10789L(e11, z11);
    }

    @Override // p126i7.AbstractC2661z
    /* renamed from: R */
    public AbstractC2661z<E> mo10791R(E e10, boolean z10) {
        return m10792U(m10794W(e10, z10), size());
    }

    /* renamed from: U */
    public C2652u0<E> m10792U(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new C2652u0<>(this.f10374l.subList(i10, i11), this.f10404j) : AbstractC2661z.m10847I(this.f10404j);
    }

    /* renamed from: V */
    public int m10793V(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f10374l, C2432o.m9704j(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    /* renamed from: W */
    public int m10794W(E e10, boolean z10) {
        int binarySearch = Collections.binarySearch(this.f10374l, C2432o.m9704j(e10), comparator());
        return binarySearch >= 0 ? z10 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    /* renamed from: X */
    public final int m10795X(Object obj) {
        return Collections.binarySearch(this.f10374l, obj, m10796Y());
    }

    /* renamed from: Y */
    public Comparator<Object> m10796Y() {
        return this.f10404j;
    }

    @Override // p126i7.AbstractC2657x, p126i7.AbstractC2647s
    /* renamed from: a */
    public AbstractC2651u<E> mo10741a() {
        return this.f10374l;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: b */
    public int mo10736b(Object[] objArr, int i10) {
        return this.f10374l.mo10736b(objArr, i10);
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: c */
    public Object[] mo10737c() {
        return this.f10374l.mo10737c();
    }

    @Override // p126i7.AbstractC2661z, java.util.NavigableSet
    public E ceiling(E e10) {
        int m10794W = m10794W(e10, true);
        if (m10794W == size()) {
            return null;
        }
        return this.f10374l.get(m10794W);
    }

    @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m10795X(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof InterfaceC2634l0) {
            collection = ((InterfaceC2634l0) collection).m10699g();
        }
        if (!C2611b1.m10513b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        AbstractC2617d1<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int m10857S = m10857S(next2, next);
                if (m10857S < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (m10857S == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (m10857S > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: d */
    public int mo10738d() {
        return this.f10374l.mo10738d();
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: e */
    public int mo10739e() {
        return this.f10374l.mo10739e();
    }

    @Override // p126i7.AbstractC2657x, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!C2611b1.m10513b(this.f10404j, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            AbstractC2617d1<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || m10857S(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // p126i7.AbstractC2661z, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f10374l.get(0);
    }

    @Override // p126i7.AbstractC2661z, java.util.NavigableSet
    public E floor(E e10) {
        int m10793V = m10793V(e10, true) - 1;
        if (m10793V == -1) {
            return null;
        }
        return this.f10374l.get(m10793V);
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: h */
    public boolean mo10740h() {
        return this.f10374l.mo10740h();
    }

    @Override // p126i7.AbstractC2661z, java.util.NavigableSet
    public E higher(E e10) {
        int m10794W = m10794W(e10, false);
        if (m10794W == size()) {
            return null;
        }
        return this.f10374l.get(m10794W);
    }

    @Override // p126i7.AbstractC2661z, p126i7.AbstractC2657x, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC2617d1<E> iterator() {
        return this.f10374l.iterator();
    }

    @Override // p126i7.AbstractC2661z, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f10374l.get(size() - 1);
    }

    @Override // p126i7.AbstractC2661z, java.util.NavigableSet
    public E lower(E e10) {
        int m10793V = m10793V(e10, false) - 1;
        if (m10793V == -1) {
            return null;
        }
        return this.f10374l.get(m10793V);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f10374l.size();
    }
}
