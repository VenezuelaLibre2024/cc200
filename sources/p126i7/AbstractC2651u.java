package p126i7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p109h7.C2432o;
import p126i7.AbstractC2647s;

/* renamed from: i7.u */
/* loaded from: classes.dex */
public abstract class AbstractC2651u<E> extends AbstractC2647s<E> implements List<E>, RandomAccess {

    /* renamed from: i */
    public static final AbstractC2620e1<Object> f10367i = new b(C2646r0.f10337l, 0);

    /* renamed from: i7.u$a */
    /* loaded from: classes.dex */
    public static final class a<E> extends AbstractC2647s.a<E> {
        public a() {
            this(4);
        }

        public a(int i10) {
            super(i10);
        }

        @Override // p126i7.AbstractC2647s.b
        /* renamed from: h */
        public a<E> mo10749a(E e10) {
            super.m10744d(e10);
            return this;
        }

        /* renamed from: i */
        public a<E> m10782i(E... eArr) {
            super.m10745e(eArr);
            return this;
        }

        /* renamed from: j */
        public a<E> m10783j(Iterable<? extends E> iterable) {
            super.mo10743b(iterable);
            return this;
        }

        /* renamed from: k */
        public AbstractC2651u<E> m10784k() {
            this.f10343c = true;
            return AbstractC2651u.m10765m(this.f10341a, this.f10342b);
        }
    }

    /* renamed from: i7.u$b */
    /* loaded from: classes.dex */
    public static class b<E> extends AbstractC2606a<E> {

        /* renamed from: j */
        public final AbstractC2651u<E> f10368j;

        public b(AbstractC2651u<E> abstractC2651u, int i10) {
            super(abstractC2651u.size(), i10);
            this.f10368j = abstractC2651u;
        }

        @Override // p126i7.AbstractC2606a
        /* renamed from: a */
        public E mo10497a(int i10) {
            return this.f10368j.get(i10);
        }
    }

    /* renamed from: i7.u$c */
    /* loaded from: classes.dex */
    public static class c<E> extends AbstractC2651u<E> {

        /* renamed from: j */
        public final transient AbstractC2651u<E> f10369j;

        public c(AbstractC2651u<E> abstractC2651u) {
            this.f10369j = abstractC2651u;
        }

        @Override // p126i7.AbstractC2651u
        /* renamed from: B */
        public AbstractC2651u<E> mo10776B() {
            return this.f10369j;
        }

        @Override // p126i7.AbstractC2651u, java.util.List
        /* renamed from: D */
        public AbstractC2651u<E> subList(int i10, int i11) {
            C2432o.m9708n(i10, i11, size());
            return this.f10369j.subList(m10786I(i11), m10786I(i10)).mo10776B();
        }

        /* renamed from: G */
        public final int m10785G(int i10) {
            return (size() - 1) - i10;
        }

        /* renamed from: I */
        public final int m10786I(int i10) {
            return size() - i10;
        }

        @Override // p126i7.AbstractC2651u, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f10369j.contains(obj);
        }

        @Override // java.util.List
        public E get(int i10) {
            C2432o.m9702h(i10, size());
            return this.f10369j.get(m10785G(i10));
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: h */
        public boolean mo10740h() {
            return this.f10369j.mo10740h();
        }

        @Override // p126i7.AbstractC2651u, java.util.List
        public int indexOf(Object obj) {
            int lastIndexOf = this.f10369j.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return m10785G(lastIndexOf);
            }
            return -1;
        }

        @Override // p126i7.AbstractC2651u, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p126i7.AbstractC2651u, java.util.List
        public int lastIndexOf(Object obj) {
            int indexOf = this.f10369j.indexOf(obj);
            if (indexOf >= 0) {
                return m10785G(indexOf);
            }
            return -1;
        }

        @Override // p126i7.AbstractC2651u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // p126i7.AbstractC2651u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10369j.size();
        }
    }

    /* renamed from: i7.u$d */
    /* loaded from: classes.dex */
    public class d extends AbstractC2651u<E> {

        /* renamed from: j */
        public final transient int f10370j;

        /* renamed from: k */
        public final transient int f10371k;

        public d(int i10, int i11) {
            this.f10370j = i10;
            this.f10371k = i11;
        }

        @Override // p126i7.AbstractC2651u, java.util.List
        /* renamed from: D */
        public AbstractC2651u<E> subList(int i10, int i11) {
            C2432o.m9708n(i10, i11, this.f10371k);
            AbstractC2651u abstractC2651u = AbstractC2651u.this;
            int i12 = this.f10370j;
            return abstractC2651u.subList(i10 + i12, i11 + i12);
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: c */
        public Object[] mo10737c() {
            return AbstractC2651u.this.mo10737c();
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: d */
        public int mo10738d() {
            return AbstractC2651u.this.mo10739e() + this.f10370j + this.f10371k;
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: e */
        public int mo10739e() {
            return AbstractC2651u.this.mo10739e() + this.f10370j;
        }

        @Override // java.util.List
        public E get(int i10) {
            C2432o.m9702h(i10, this.f10371k);
            return AbstractC2651u.this.get(i10 + this.f10370j);
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: h */
        public boolean mo10740h() {
            return true;
        }

        @Override // p126i7.AbstractC2651u, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p126i7.AbstractC2651u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // p126i7.AbstractC2651u, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10371k;
        }
    }

    /* renamed from: C */
    public static <E> AbstractC2651u<E> m10763C(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        C2432o.m9704j(comparator);
        Object[] m10511j = C2610b0.m10511j(iterable);
        C2640o0.m10717b(m10511j);
        Arrays.sort(m10511j, comparator);
        return m10764k(m10511j);
    }

    /* renamed from: k */
    public static <E> AbstractC2651u<E> m10764k(Object[] objArr) {
        return m10765m(objArr, objArr.length);
    }

    /* renamed from: m */
    public static <E> AbstractC2651u<E> m10765m(Object[] objArr, int i10) {
        return i10 == 0 ? m10770u() : new C2646r0(objArr, i10);
    }

    /* renamed from: n */
    public static <E> a<E> m10766n() {
        return new a<>();
    }

    /* renamed from: o */
    public static <E> AbstractC2651u<E> m10767o(Object... objArr) {
        return m10764k(C2640o0.m10717b(objArr));
    }

    /* renamed from: p */
    public static <E> AbstractC2651u<E> m10768p(Collection<? extends E> collection) {
        if (!(collection instanceof AbstractC2647s)) {
            return m10767o(collection.toArray());
        }
        AbstractC2651u<E> mo10741a = ((AbstractC2647s) collection).mo10741a();
        return mo10741a.mo10740h() ? m10764k(mo10741a.toArray()) : mo10741a;
    }

    /* renamed from: q */
    public static <E> AbstractC2651u<E> m10769q(E[] eArr) {
        return eArr.length == 0 ? m10770u() : m10767o((Object[]) eArr.clone());
    }

    /* renamed from: u */
    public static <E> AbstractC2651u<E> m10770u() {
        return (AbstractC2651u<E>) C2646r0.f10337l;
    }

    /* renamed from: v */
    public static <E> AbstractC2651u<E> m10771v(E e10) {
        return m10767o(e10);
    }

    /* renamed from: w */
    public static <E> AbstractC2651u<E> m10772w(E e10, E e11) {
        return m10767o(e10, e11);
    }

    /* renamed from: x */
    public static <E> AbstractC2651u<E> m10773x(E e10, E e11, E e12) {
        return m10767o(e10, e11, e12);
    }

    /* renamed from: y */
    public static <E> AbstractC2651u<E> m10774y(E e10, E e11, E e12, E e13, E e14) {
        return m10767o(e10, e11, e12, e13, e14);
    }

    /* renamed from: z */
    public static <E> AbstractC2651u<E> m10775z(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return m10767o(e10, e11, e12, e13, e14, e15, e16);
    }

    /* renamed from: B */
    public AbstractC2651u<E> mo10776B() {
        return size() <= 1 ? this : new c(this);
    }

    @Override // java.util.List
    /* renamed from: D */
    public AbstractC2651u<E> subList(int i10, int i11) {
        C2432o.m9708n(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? m10770u() : m10778E(i10, i11);
    }

    /* renamed from: E */
    public AbstractC2651u<E> m10778E(int i10, int i11) {
        return new d(i10, i11 - i10);
    }

    @Override // p126i7.AbstractC2647s
    @Deprecated
    /* renamed from: a */
    public final AbstractC2651u<E> mo10741a() {
        return this;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: b */
    public int mo10736b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return C2619e0.m10587c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C2619e0.m10588d(this, obj);
    }

    @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public AbstractC2617d1<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return C2619e0.m10590f(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public AbstractC2620e1<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: t */
    public AbstractC2620e1<E> listIterator(int i10) {
        C2432o.m9706l(i10, size());
        return isEmpty() ? (AbstractC2620e1<E>) f10367i : new b(this, i10);
    }
}
