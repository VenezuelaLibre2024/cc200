package p373zd;

import java.util.Iterator;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: zd.j */
/* loaded from: classes2.dex */
public final class C6132j<T, R> implements InterfaceC6124b<R> {

    /* renamed from: a */
    public final InterfaceC6124b<T> f22689a;

    /* renamed from: b */
    public final InterfaceC4580l<T, R> f22690b;

    /* renamed from: zd.j$a */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<R> {

        /* renamed from: h */
        public final Iterator<T> f22691h;

        /* renamed from: i */
        public final /* synthetic */ C6132j<T, R> f22692i;

        public a(C6132j<T, R> c6132j) {
            this.f22692i = c6132j;
            this.f22691h = c6132j.f22689a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f22691h.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.f22692i.f22690b.invoke(this.f22691h.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6132j(InterfaceC6124b<? extends T> interfaceC6124b, InterfaceC4580l<? super T, ? extends R> interfaceC4580l) {
        C4753m.m18653f(interfaceC6124b, "sequence");
        C4753m.m18653f(interfaceC4580l, "transformer");
        this.f22689a = interfaceC6124b;
        this.f22690b = interfaceC4580l;
    }

    @Override // p373zd.InterfaceC6124b
    public Iterator<R> iterator() {
        return new a(this);
    }
}
