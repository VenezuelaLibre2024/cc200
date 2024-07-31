package p126i7;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p079f6.C1841a;
import p109h7.C2432o;

/* renamed from: i7.s */
/* loaded from: classes.dex */
public abstract class AbstractC2647s<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: h */
    public static final Object[] f10340h = new Object[0];

    /* renamed from: i7.s$a */
    /* loaded from: classes.dex */
    public static abstract class a<E> extends b<E> {

        /* renamed from: a */
        public Object[] f10341a;

        /* renamed from: b */
        public int f10342b;

        /* renamed from: c */
        public boolean f10343c;

        public a(int i10) {
            C2627i.m10619b(i10, "initialCapacity");
            this.f10341a = new Object[i10];
            this.f10342b = 0;
        }

        @Override // p126i7.AbstractC2647s.b
        /* renamed from: b */
        public b<E> mo10743b(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                m10747g(this.f10342b + collection.size());
                if (collection instanceof AbstractC2647s) {
                    this.f10342b = ((AbstractC2647s) collection).mo10736b(this.f10341a, this.f10342b);
                    return this;
                }
            }
            super.mo10743b(iterable);
            return this;
        }

        /* renamed from: d */
        public a<E> m10744d(E e10) {
            C2432o.m9704j(e10);
            m10747g(this.f10342b + 1);
            Object[] objArr = this.f10341a;
            int i10 = this.f10342b;
            this.f10342b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        /* renamed from: e */
        public b<E> m10745e(E... eArr) {
            m10746f(eArr, eArr.length);
            return this;
        }

        /* renamed from: f */
        public final void m10746f(Object[] objArr, int i10) {
            C2640o0.m10718c(objArr, i10);
            m10747g(this.f10342b + i10);
            System.arraycopy(objArr, 0, this.f10341a, this.f10342b, i10);
            this.f10342b += i10;
        }

        /* renamed from: g */
        public final void m10747g(int i10) {
            Object[] objArr = this.f10341a;
            if (objArr.length < i10) {
                this.f10341a = Arrays.copyOf(objArr, b.m10748c(objArr.length, i10));
            } else if (!this.f10343c) {
                return;
            } else {
                this.f10341a = (Object[]) objArr.clone();
            }
            this.f10343c = false;
        }
    }

    /* renamed from: i7.s$b */
    /* loaded from: classes.dex */
    public static abstract class b<E> {
        /* renamed from: c */
        public static int m10748c(int i10, int i11) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = i10 + (i10 >> 1) + 1;
            if (i12 < i11) {
                i12 = Integer.highestOneBit(i11 - 1) << 1;
            }
            return i12 < 0 ? C1841a.e.API_PRIORITY_OTHER : i12;
        }

        /* renamed from: a */
        public abstract b<E> mo10749a(E e10);

        /* renamed from: b */
        public b<E> mo10743b(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                mo10749a(it.next());
            }
            return this;
        }
    }

    /* renamed from: a */
    public AbstractC2651u<E> mo10741a() {
        return isEmpty() ? AbstractC2651u.m10770u() : AbstractC2651u.m10764k(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    public int mo10736b(Object[] objArr, int i10) {
        AbstractC2617d1<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    /* renamed from: c */
    public Object[] mo10737c() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    /* renamed from: d */
    public int mo10738d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public int mo10739e() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public abstract boolean mo10740h();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public abstract AbstractC2617d1<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f10340h);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C2432o.m9704j(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] mo10737c = mo10737c();
            if (mo10737c != null) {
                return (T[]) C2644q0.m10730a(mo10737c, mo10739e(), mo10738d(), tArr);
            }
            tArr = (T[]) C2640o0.m10719d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        mo10736b(tArr, 0);
        return tArr;
    }
}
