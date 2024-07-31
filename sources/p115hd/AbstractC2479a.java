package p115hd;

import java.util.Collection;
import java.util.Iterator;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4746f;
import td.C4753m;

/* renamed from: hd.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2479a<E> implements Collection<E> {

    /* renamed from: hd.a$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<E, CharSequence> {

        /* renamed from: h */
        public final /* synthetic */ AbstractC2479a<E> f9905h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC2479a<? extends E> abstractC2479a) {
            super(1);
            this.f9905h = abstractC2479a;
        }

        @Override // sd.InterfaceC4580l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e10) {
            return e10 == this.f9905h ? "(this Collection)" : String.valueOf(e10);
        }
    }

    /* renamed from: a */
    public abstract int mo9875a();

    @Override // java.util.Collection
    public boolean add(E e10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e10) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C4753m.m18648a(it.next(), e10)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        C4753m.m18653f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return mo9875a();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C4746f.m18644a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C4753m.m18653f(tArr, "array");
        return (T[]) C4746f.m18645b(this, tArr);
    }

    public String toString() {
        return C2510v.m10025x(this, ", ", "[", "]", 0, null, new a(this), 24, null);
    }
}
