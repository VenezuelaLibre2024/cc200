package p126i7;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p109h7.C2432o;
import p109h7.InterfaceC2433p;

/* renamed from: i7.j */
/* loaded from: classes.dex */
public final class C2629j {

    /* renamed from: i7.j$a */
    /* loaded from: classes.dex */
    public static class a<E> extends AbstractCollection<E> {

        /* renamed from: h */
        public final Collection<E> f10300h;

        /* renamed from: i */
        public final InterfaceC2433p<? super E> f10301i;

        public a(Collection<E> collection, InterfaceC2433p<? super E> interfaceC2433p) {
            this.f10300h = collection;
            this.f10301i = interfaceC2433p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E e10) {
            C2432o.m9698d(this.f10301i.apply(e10));
            return this.f10300h.add(e10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                C2432o.m9698d(this.f10301i.apply(it.next()));
            }
            return this.f10300h.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C2610b0.m10508g(this.f10300h, this.f10301i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (C2629j.m10623c(this.f10300h, obj)) {
                return this.f10301i.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return C2629j.m10621a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !C2610b0.m10502a(this.f10300h, this.f10301i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<E> iterator() {
            return C2613c0.m10525i(this.f10300h.iterator(), this.f10301i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f10300h.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<E> it = this.f10300h.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f10301i.apply(next) && collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<E> it = this.f10300h.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                E next = it.next();
                if (this.f10301i.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator<E> it = this.f10300h.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (this.f10301i.apply(it.next())) {
                    i10++;
                }
            }
            return i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return C2619e0.m10593i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) C2619e0.m10593i(iterator()).toArray(tArr);
        }
    }

    /* renamed from: a */
    public static boolean m10621a(Collection<?> collection, Collection<?> collection2) {
        Iterator<?> it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static StringBuilder m10622b(int i10) {
        C2627i.m10619b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }

    /* renamed from: c */
    public static boolean m10623c(Collection<?> collection, Object obj) {
        C2432o.m9704j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
