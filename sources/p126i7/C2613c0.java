package p126i7;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p109h7.C2428k;
import p109h7.C2432o;
import p109h7.InterfaceC2433p;

/* renamed from: i7.c0 */
/* loaded from: classes.dex */
public final class C2613c0 {

    /* renamed from: i7.c0$a */
    /* loaded from: classes.dex */
    public class a<T> extends AbstractC2609b<T> {

        /* renamed from: j */
        public final /* synthetic */ Iterator f10245j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC2433p f10246k;

        public a(Iterator it, InterfaceC2433p interfaceC2433p) {
            this.f10245j = it;
            this.f10246k = interfaceC2433p;
        }

        @Override // p126i7.AbstractC2609b
        /* renamed from: a */
        public T mo10498a() {
            while (this.f10245j.hasNext()) {
                T t10 = (T) this.f10245j.next();
                if (this.f10246k.apply(t10)) {
                    return t10;
                }
            }
            return m10499c();
        }
    }

    /* renamed from: i7.c0$b */
    /* loaded from: classes.dex */
    public class b<T> extends AbstractC2617d1<T> {

        /* renamed from: h */
        public boolean f10247h;

        /* renamed from: i */
        public final /* synthetic */ Object f10248i;

        public b(Object obj) {
            this.f10248i = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f10247h;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f10247h) {
                throw new NoSuchElementException();
            }
            this.f10247h = true;
            return (T) this.f10248i;
        }
    }

    /* renamed from: i7.c0$c */
    /* loaded from: classes.dex */
    public static final class c<T> extends AbstractC2606a<T> {

        /* renamed from: l */
        public static final AbstractC2620e1<Object> f10249l = new c(new Object[0], 0, 0, 0);

        /* renamed from: j */
        public final T[] f10250j;

        /* renamed from: k */
        public final int f10251k;

        public c(T[] tArr, int i10, int i11, int i12) {
            super(i11, i12);
            this.f10250j = tArr;
            this.f10251k = i10;
        }

        @Override // p126i7.AbstractC2606a
        /* renamed from: a */
        public T mo10497a(int i10) {
            return this.f10250j[this.f10251k + i10];
        }
    }

    /* renamed from: i7.c0$d */
    /* loaded from: classes.dex */
    public enum d implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            C2627i.m10620c(false);
        }
    }

    /* renamed from: a */
    public static <T> boolean m10517a(Collection<T> collection, Iterator<? extends T> it) {
        C2432o.m9704j(collection);
        C2432o.m9704j(it);
        boolean z10 = false;
        while (it.hasNext()) {
            z10 |= collection.add(it.next());
        }
        return z10;
    }

    /* renamed from: b */
    public static <T> boolean m10518b(Iterator<T> it, InterfaceC2433p<? super T> interfaceC2433p) {
        return m10530n(it, interfaceC2433p) != -1;
    }

    /* renamed from: c */
    public static void m10519c(Iterator<?> it) {
        C2432o.m9704j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0014, code lost:
    
        if (r2.hasNext() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r3.equals(r2.next()) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0020, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0001, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r2.hasNext() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r2.next() != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
    
        return true;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m10520d(java.util.Iterator<?> r2, java.lang.Object r3) {
        /*
            r0 = 1
            if (r3 != 0) goto L10
        L3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            if (r3 != 0) goto L3
            return r0
        L10:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L10
            return r0
        L21:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p126i7.C2613c0.m10520d(java.util.Iterator, java.lang.Object):boolean");
    }

    /* renamed from: e */
    public static boolean m10521e(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !C2428k.m9688a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: f */
    public static <T> AbstractC2617d1<T> m10522f() {
        return m10523g();
    }

    /* renamed from: g */
    public static <T> AbstractC2620e1<T> m10523g() {
        return (AbstractC2620e1<T>) c.f10249l;
    }

    /* renamed from: h */
    public static <T> Iterator<T> m10524h() {
        return d.INSTANCE;
    }

    /* renamed from: i */
    public static <T> AbstractC2617d1<T> m10525i(Iterator<T> it, InterfaceC2433p<? super T> interfaceC2433p) {
        C2432o.m9704j(it);
        C2432o.m9704j(interfaceC2433p);
        return new a(it, interfaceC2433p);
    }

    /* renamed from: j */
    public static <T> T m10526j(Iterator<T> it, InterfaceC2433p<? super T> interfaceC2433p) {
        C2432o.m9704j(it);
        C2432o.m9704j(interfaceC2433p);
        while (it.hasNext()) {
            T next = it.next();
            if (interfaceC2433p.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: k */
    public static <T> T m10527k(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: l */
    public static <T> T m10528l(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? (T) m10527k(it) : t10;
    }

    /* renamed from: m */
    public static <T> T m10529m(Iterator<? extends T> it, T t10) {
        return it.hasNext() ? it.next() : t10;
    }

    /* renamed from: n */
    public static <T> int m10530n(Iterator<T> it, InterfaceC2433p<? super T> interfaceC2433p) {
        C2432o.m9705k(interfaceC2433p, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (interfaceC2433p.apply(it.next())) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: o */
    public static <T> T m10531o(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: p */
    public static boolean m10532p(Iterator<?> it, Collection<?> collection) {
        C2432o.m9704j(collection);
        boolean z10 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: q */
    public static <T> boolean m10533q(Iterator<T> it, InterfaceC2433p<? super T> interfaceC2433p) {
        C2432o.m9704j(interfaceC2433p);
        boolean z10 = false;
        while (it.hasNext()) {
            if (interfaceC2433p.apply(it.next())) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: r */
    public static <T> AbstractC2617d1<T> m10534r(T t10) {
        return new b(t10);
    }
}
