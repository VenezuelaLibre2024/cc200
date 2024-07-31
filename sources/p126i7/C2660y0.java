package p126i7;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import p109h7.C2432o;
import p109h7.C2434q;
import p109h7.InterfaceC2433p;
import p126i7.C2629j;

/* renamed from: i7.y0 */
/* loaded from: classes.dex */
public final class C2660y0 {

    /* renamed from: i7.y0$a */
    /* loaded from: classes.dex */
    public class a<E> extends e<E> {

        /* renamed from: h */
        public final /* synthetic */ Set f10400h;

        /* renamed from: i */
        public final /* synthetic */ Set f10401i;

        /* renamed from: i7.y0$a$a */
        /* loaded from: classes.dex */
        public class C6190a extends AbstractC2609b<E> {

            /* renamed from: j */
            public final Iterator<E> f10402j;

            public C6190a() {
                this.f10402j = a.this.f10400h.iterator();
            }

            @Override // p126i7.AbstractC2609b
            /* renamed from: a */
            public E mo10498a() {
                while (this.f10402j.hasNext()) {
                    E next = this.f10402j.next();
                    if (a.this.f10401i.contains(next)) {
                        return next;
                    }
                }
                return m10499c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f10400h = set;
            this.f10401i = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: a */
        public AbstractC2617d1<E> iterator() {
            return new C6190a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f10400h.contains(obj) && this.f10401i.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f10400h.containsAll(collection) && this.f10401i.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f10401i, this.f10400h);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f10400h.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f10401i.contains(it.next())) {
                    i10++;
                }
            }
            return i10;
        }
    }

    /* renamed from: i7.y0$b */
    /* loaded from: classes.dex */
    public static class b<E> extends C2629j.a<E> implements Set<E> {
        public b(Set<E> set, InterfaceC2433p<? super E> interfaceC2433p) {
            super(set, interfaceC2433p);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return C2660y0.m10834a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return C2660y0.m10837d(this);
        }
    }

    /* renamed from: i7.y0$c */
    /* loaded from: classes.dex */
    public static class c<E> extends b<E> implements SortedSet<E> {
        public c(SortedSet<E> sortedSet, InterfaceC2433p<? super E> interfaceC2433p) {
            super(sortedSet, interfaceC2433p);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f10300h).comparator();
        }

        @Override // java.util.SortedSet
        public E first() {
            return (E) C2613c0.m10526j(this.f10300h.iterator(), this.f10301i);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(E e10) {
            return new c(((SortedSet) this.f10300h).headSet(e10), this.f10301i);
        }

        @Override // java.util.SortedSet
        public E last() {
            SortedSet sortedSet = (SortedSet) this.f10300h;
            while (true) {
                E e10 = (Object) sortedSet.last();
                if (this.f10301i.apply(e10)) {
                    return e10;
                }
                sortedSet = sortedSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(E e10, E e11) {
            return new c(((SortedSet) this.f10300h).subSet(e10, e11), this.f10301i);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(E e10) {
            return new c(((SortedSet) this.f10300h).tailSet(e10), this.f10301i);
        }
    }

    /* renamed from: i7.y0$d */
    /* loaded from: classes.dex */
    public static abstract class d<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return C2660y0.m10842i(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) C2432o.m9704j(collection));
        }
    }

    /* renamed from: i7.y0$e */
    /* loaded from: classes.dex */
    public static abstract class e<E> extends AbstractSet<E> {
        public e() {
        }

        public /* synthetic */ e(C2658x0 c2658x0) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean add(E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static boolean m10834a(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static <E> Set<E> m10835b(Set<E> set, InterfaceC2433p<? super E> interfaceC2433p) {
        if (set instanceof SortedSet) {
            return m10836c((SortedSet) set, interfaceC2433p);
        }
        if (!(set instanceof b)) {
            return new b((Set) C2432o.m9704j(set), (InterfaceC2433p) C2432o.m9704j(interfaceC2433p));
        }
        b bVar = (b) set;
        return new b((Set) bVar.f10300h, C2434q.m9713b(bVar.f10301i, interfaceC2433p));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <E> SortedSet<E> m10836c(SortedSet<E> sortedSet, InterfaceC2433p<? super E> interfaceC2433p) {
        if (!(sortedSet instanceof b)) {
            return new c((SortedSet) C2432o.m9704j(sortedSet), (InterfaceC2433p) C2432o.m9704j(interfaceC2433p));
        }
        b bVar = (b) sortedSet;
        return new c((SortedSet) bVar.f10300h, C2434q.m9713b(bVar.f10301i, interfaceC2433p));
    }

    /* renamed from: d */
    public static int m10837d(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    /* renamed from: e */
    public static <E> e<E> m10838e(Set<E> set, Set<?> set2) {
        C2432o.m9705k(set, "set1");
        C2432o.m9705k(set2, "set2");
        return new a(set, set2);
    }

    /* renamed from: f */
    public static <E> HashSet<E> m10839f() {
        return new HashSet<>();
    }

    /* renamed from: g */
    public static <E> HashSet<E> m10840g(int i10) {
        return new HashSet<>(C2624g0.m10599a(i10));
    }

    /* renamed from: h */
    public static <E> Set<E> m10841h() {
        return Collections.newSetFromMap(C2624g0.m10604f());
    }

    /* renamed from: i */
    public static boolean m10842i(Set<?> set, Collection<?> collection) {
        C2432o.m9704j(collection);
        if (collection instanceof InterfaceC2634l0) {
            collection = ((InterfaceC2634l0) collection).m10699g();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? m10843j(set, collection.iterator()) : C2613c0.m10532p(set.iterator(), collection);
    }

    /* renamed from: j */
    public static boolean m10843j(Set<?> set, Iterator<?> it) {
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= set.remove(it.next());
        }
        return z10;
    }
}
