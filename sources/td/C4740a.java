package td;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: td.a */
/* loaded from: classes2.dex */
public final class C4740a<T> implements Iterator<T> {

    /* renamed from: h */
    public final T[] f17714h;

    /* renamed from: i */
    public int f17715i;

    public C4740a(T[] tArr) {
        C4753m.m18653f(tArr, "array");
        this.f17714h = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17715i < this.f17714h.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f17714h;
            int i10 = this.f17715i;
            this.f17715i = i10 + 1;
            return tArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f17715i--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
