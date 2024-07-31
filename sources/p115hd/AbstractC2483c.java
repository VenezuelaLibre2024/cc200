package p115hd;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import td.C4747g;
import td.C4753m;

/* renamed from: hd.c */
/* loaded from: classes2.dex */
public abstract class AbstractC2483c<E> extends AbstractC2479a<E> implements List<E> {

    /* renamed from: h */
    public static final a f9909h = new a(null);

    /* renamed from: hd.c$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final void m9883a(int i10, int i11) {
            if (i10 < 0 || i10 >= i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: b */
        public final void m9884b(int i10, int i11) {
            if (i10 < 0 || i10 > i11) {
                throw new IndexOutOfBoundsException("index: " + i10 + ", size: " + i11);
            }
        }

        /* renamed from: c */
        public final void m9885c(int i10, int i11, int i12) {
            if (i10 < 0 || i11 > i12) {
                throw new IndexOutOfBoundsException("fromIndex: " + i10 + ", toIndex: " + i11 + ", size: " + i12);
            }
            if (i10 <= i11) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i10 + " > toIndex: " + i11);
        }

        /* renamed from: d */
        public final boolean m9886d(Collection<?> collection, Collection<?> collection2) {
            C4753m.m18653f(collection, "c");
            C4753m.m18653f(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!C4753m.m18648a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public final int m9887e(Collection<?> collection) {
            C4753m.m18653f(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i10 = (i10 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i10;
        }
    }

    /* renamed from: hd.c$b */
    /* loaded from: classes2.dex */
    public class b implements Iterator<E> {

        /* renamed from: h */
        public int f9910h;

        public b() {
        }

        /* renamed from: a */
        public final int m9888a() {
            return this.f9910h;
        }

        /* renamed from: c */
        public final void m9889c(int i10) {
            this.f9910h = i10;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9910h < AbstractC2483c.this.size();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC2483c<E> abstractC2483c = AbstractC2483c.this;
            int i10 = this.f9910h;
            this.f9910h = i10 + 1;
            return abstractC2483c.get(i10);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: hd.c$c */
    /* loaded from: classes2.dex */
    public class c extends AbstractC2483c<E>.b implements ListIterator<E> {
        public c(int i10) {
            super();
            AbstractC2483c.f9909h.m9884b(i10, AbstractC2483c.this.size());
            m9889c(i10);
        }

        @Override // java.util.ListIterator
        public void add(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m9888a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m9888a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC2483c<E> abstractC2483c = AbstractC2483c.this;
            m9889c(m9888a() - 1);
            return abstractC2483c.get(m9888a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m9888a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: hd.c$d */
    /* loaded from: classes2.dex */
    public static final class d<E> extends AbstractC2483c<E> implements RandomAccess {

        /* renamed from: i */
        public final AbstractC2483c<E> f9913i;

        /* renamed from: j */
        public final int f9914j;

        /* renamed from: k */
        public int f9915k;

        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC2483c<? extends E> abstractC2483c, int i10, int i11) {
            C4753m.m18653f(abstractC2483c, "list");
            this.f9913i = abstractC2483c;
            this.f9914j = i10;
            AbstractC2483c.f9909h.m9885c(i10, i11, abstractC2483c.size());
            this.f9915k = i11 - i10;
        }

        @Override // p115hd.AbstractC2479a
        /* renamed from: a */
        public int mo9875a() {
            return this.f9915k;
        }

        @Override // p115hd.AbstractC2483c, java.util.List
        public E get(int i10) {
            AbstractC2483c.f9909h.m9883a(i10, this.f9915k);
            return this.f9913i.get(this.f9914j + i10);
        }
    }

    @Override // java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f9909h.m9886d(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract E get(int i10);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f9909h.m9887e(this);
    }

    @Override // java.util.List
    public int indexOf(E e10) {
        Iterator<E> it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (C4753m.m18648a(it.next(), e10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(E e10) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C4753m.m18648a(listIterator.previous(), e10)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new c(i10);
    }

    @Override // java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return new d(this, i10, i11);
    }
}
