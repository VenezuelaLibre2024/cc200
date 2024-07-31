package p126i7;

import java.util.Iterator;
import p109h7.C2432o;

/* renamed from: i7.c1 */
/* loaded from: classes.dex */
public abstract class AbstractC2614c1<F, T> implements Iterator<T> {

    /* renamed from: h */
    public final Iterator<? extends F> f10254h;

    public AbstractC2614c1(Iterator<? extends F> it) {
        this.f10254h = (Iterator) C2432o.m9704j(it);
    }

    /* renamed from: a */
    public abstract T mo10536a(F f10);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10254h.hasNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        return mo10536a(this.f10254h.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f10254h.remove();
    }
}
