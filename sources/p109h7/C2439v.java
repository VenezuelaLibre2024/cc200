package p109h7;

import java.io.Serializable;
import p109h7.C2439v;

/* renamed from: h7.v */
/* loaded from: classes.dex */
public final class C2439v {

    /* renamed from: h7.v$a */
    /* loaded from: classes.dex */
    public static class a<T> implements InterfaceC2438u<T>, Serializable {

        /* renamed from: h */
        public final InterfaceC2438u<T> f9775h;

        /* renamed from: i */
        public volatile transient boolean f9776i;

        /* renamed from: j */
        public transient T f9777j;

        public a(InterfaceC2438u<T> interfaceC2438u) {
            this.f9775h = (InterfaceC2438u) C2432o.m9704j(interfaceC2438u);
        }

        @Override // p109h7.InterfaceC2438u
        public T get() {
            if (!this.f9776i) {
                synchronized (this) {
                    if (!this.f9776i) {
                        T t10 = this.f9775h.get();
                        this.f9777j = t10;
                        this.f9776i = true;
                        return t10;
                    }
                }
            }
            return (T) C2427j.m9687a(this.f9777j);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f9776i) {
                obj = "<supplier that returned " + this.f9777j + ">";
            } else {
                obj = this.f9775h;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: h7.v$b */
    /* loaded from: classes.dex */
    public static class b<T> implements InterfaceC2438u<T> {

        /* renamed from: j */
        public static final InterfaceC2438u<Void> f9778j = new InterfaceC2438u() { // from class: h7.w
            @Override // p109h7.InterfaceC2438u
            public final Object get() {
                Void m9735b;
                m9735b = C2439v.b.m9735b();
                return m9735b;
            }
        };

        /* renamed from: h */
        public volatile InterfaceC2438u<T> f9779h;

        /* renamed from: i */
        public T f9780i;

        public b(InterfaceC2438u<T> interfaceC2438u) {
            this.f9779h = (InterfaceC2438u) C2432o.m9704j(interfaceC2438u);
        }

        /* renamed from: b */
        public static /* synthetic */ Void m9735b() {
            throw new IllegalStateException();
        }

        @Override // p109h7.InterfaceC2438u
        public T get() {
            InterfaceC2438u<T> interfaceC2438u = this.f9779h;
            InterfaceC2438u<T> interfaceC2438u2 = (InterfaceC2438u<T>) f9778j;
            if (interfaceC2438u != interfaceC2438u2) {
                synchronized (this) {
                    if (this.f9779h != interfaceC2438u2) {
                        T t10 = this.f9779h.get();
                        this.f9780i = t10;
                        this.f9779h = interfaceC2438u2;
                        return t10;
                    }
                }
            }
            return (T) C2427j.m9687a(this.f9780i);
        }

        public String toString() {
            Object obj = this.f9779h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f9778j) {
                obj = "<supplier that returned " + this.f9780i + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* renamed from: h7.v$c */
    /* loaded from: classes.dex */
    public static class c<T> implements InterfaceC2438u<T>, Serializable {

        /* renamed from: h */
        public final T f9781h;

        public c(T t10) {
            this.f9781h = t10;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return C2428k.m9688a(this.f9781h, ((c) obj).f9781h);
            }
            return false;
        }

        @Override // p109h7.InterfaceC2438u
        public T get() {
            return this.f9781h;
        }

        public int hashCode() {
            return C2428k.m9689b(this.f9781h);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f9781h + ")";
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC2438u<T> m9732a(InterfaceC2438u<T> interfaceC2438u) {
        return ((interfaceC2438u instanceof b) || (interfaceC2438u instanceof a)) ? interfaceC2438u : interfaceC2438u instanceof Serializable ? new a(interfaceC2438u) : new b(interfaceC2438u);
    }

    /* renamed from: b */
    public static <T> InterfaceC2438u<T> m9733b(T t10) {
        return new c(t10);
    }
}
