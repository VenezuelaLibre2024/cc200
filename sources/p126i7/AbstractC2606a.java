package p126i7;

import java.util.NoSuchElementException;
import p109h7.C2432o;

/* renamed from: i7.a */
/* loaded from: classes.dex */
public abstract class AbstractC2606a<E> extends AbstractC2620e1<E> {

    /* renamed from: h */
    public final int f10235h;

    /* renamed from: i */
    public int f10236i;

    public AbstractC2606a(int i10, int i11) {
        C2432o.m9706l(i11, i10);
        this.f10235h = i10;
        this.f10236i = i11;
    }

    /* renamed from: a */
    public abstract E mo10497a(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f10236i < this.f10235h;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f10236i > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f10236i;
        this.f10236i = i10 + 1;
        return mo10497a(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f10236i;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f10236i - 1;
        this.f10236i = i10;
        return mo10497a(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f10236i - 1;
    }
}
