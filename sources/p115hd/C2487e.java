package p115hd;

import java.util.Collection;
import java.util.Iterator;
import td.C4742b;
import td.C4746f;
import td.C4753m;

/* renamed from: hd.e */
/* loaded from: classes2.dex */
public final class C2487e<T> implements Collection<T> {

    /* renamed from: h */
    public final T[] f9916h;

    /* renamed from: i */
    public final boolean f9917i;

    public C2487e(T[] tArr, boolean z10) {
        C4753m.m18653f(tArr, "values");
        this.f9916h = tArr;
        this.f9917i = z10;
    }

    /* renamed from: a */
    public int m9895a() {
        return this.f9916h.length;
    }

    @Override // java.util.Collection
    public boolean add(T t10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return C2497j.m9963h(this.f9916h, obj);
    }

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
        return this.f9916h.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return C4742b.m18638a(this.f9916h);
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
        return m9895a();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C2501m.m9985a(this.f9916h, this.f9917i);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        C4753m.m18653f(tArr, "array");
        return (T[]) C4746f.m18645b(this, tArr);
    }
}
