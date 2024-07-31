package p301v0;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: v0.q1 */
/* loaded from: classes.dex */
public class C5077q1 extends AbstractList<String> implements InterfaceC5046g0, RandomAccess {

    /* renamed from: h */
    public final InterfaceC5046g0 f19045h;

    /* renamed from: v0.q1$a */
    /* loaded from: classes.dex */
    public class a implements ListIterator<String> {

        /* renamed from: h */
        public ListIterator<String> f19046h;

        /* renamed from: i */
        public final /* synthetic */ int f19047i;

        public a(int i10) {
            this.f19047i = i10;
            this.f19046h = C5077q1.this.f19045h.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f19046h.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f19046h.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19046h.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19046h.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19046h.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19046h.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: v0.q1$b */
    /* loaded from: classes.dex */
    public class b implements Iterator<String> {

        /* renamed from: h */
        public Iterator<String> f19049h;

        public b() {
            this.f19049h = C5077q1.this.f19045h.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f19049h.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19049h.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C5077q1(InterfaceC5046g0 interfaceC5046g0) {
        this.f19045h = interfaceC5046g0;
    }

    @Override // p301v0.InterfaceC5046g0
    /* renamed from: A */
    public InterfaceC5046g0 mo19928A() {
        return this;
    }

    @Override // p301v0.InterfaceC5046g0
    /* renamed from: F */
    public Object mo19929F(int i10) {
        return this.f19045h.mo19929F(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f19045h.get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // p301v0.InterfaceC5046g0
    /* renamed from: l */
    public void mo19935l(AbstractC5048h abstractC5048h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i10) {
        return new a(i10);
    }

    @Override // p301v0.InterfaceC5046g0
    /* renamed from: r */
    public List<?> mo19936r() {
        return this.f19045h.mo19936r();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19045h.size();
    }
}
