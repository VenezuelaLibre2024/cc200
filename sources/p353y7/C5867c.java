package p353y7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: y7.c */
/* loaded from: classes.dex */
public final class C5867c<T> {

    /* renamed from: a */
    public final String f21858a;

    /* renamed from: b */
    public final Set<C5872e0<? super T>> f21859b;

    /* renamed from: c */
    public final Set<C5885q> f21860c;

    /* renamed from: d */
    public final int f21861d;

    /* renamed from: e */
    public final int f21862e;

    /* renamed from: f */
    public final InterfaceC5875g<T> f21863f;

    /* renamed from: g */
    public final Set<Class<?>> f21864g;

    /* renamed from: y7.c$b */
    /* loaded from: classes.dex */
    public static class b<T> {

        /* renamed from: a */
        public String f21865a;

        /* renamed from: b */
        public final Set<C5872e0<? super T>> f21866b;

        /* renamed from: c */
        public final Set<C5885q> f21867c;

        /* renamed from: d */
        public int f21868d;

        /* renamed from: e */
        public int f21869e;

        /* renamed from: f */
        public InterfaceC5875g<T> f21870f;

        /* renamed from: g */
        public final Set<Class<?>> f21871g;

        @SafeVarargs
        public b(Class<T> cls, Class<? super T>... clsArr) {
            this.f21865a = null;
            HashSet hashSet = new HashSet();
            this.f21866b = hashSet;
            this.f21867c = new HashSet();
            this.f21868d = 0;
            this.f21869e = 0;
            this.f21871g = new HashSet();
            C5870d0.m23502c(cls, "Null interface");
            hashSet.add(C5872e0.m23505b(cls));
            for (Class<? super T> cls2 : clsArr) {
                C5870d0.m23502c(cls2, "Null interface");
                this.f21866b.add(C5872e0.m23505b(cls2));
            }
        }

        public /* synthetic */ b(Class cls, Class[] clsArr, a aVar) {
            this(cls, clsArr);
        }

        @SafeVarargs
        public b(C5872e0<T> c5872e0, C5872e0<? super T>... c5872e0Arr) {
            this.f21865a = null;
            HashSet hashSet = new HashSet();
            this.f21866b = hashSet;
            this.f21867c = new HashSet();
            this.f21868d = 0;
            this.f21869e = 0;
            this.f21871g = new HashSet();
            C5870d0.m23502c(c5872e0, "Null interface");
            hashSet.add(c5872e0);
            for (C5872e0<? super T> c5872e02 : c5872e0Arr) {
                C5870d0.m23502c(c5872e02, "Null interface");
            }
            Collections.addAll(this.f21866b, c5872e0Arr);
        }

        public /* synthetic */ b(C5872e0 c5872e0, C5872e0[] c5872e0Arr, a aVar) {
            this(c5872e0, c5872e0Arr);
        }

        /* renamed from: b */
        public b<T> m23473b(C5885q c5885q) {
            C5870d0.m23502c(c5885q, "Null dependency");
            m23481j(c5885q.m23556c());
            this.f21867c.add(c5885q);
            return this;
        }

        /* renamed from: c */
        public b<T> m23474c() {
            return m23480i(1);
        }

        /* renamed from: d */
        public C5867c<T> m23475d() {
            C5870d0.m23503d(this.f21870f != null, "Missing required property: factory.");
            return new C5867c<>(this.f21865a, new HashSet(this.f21866b), new HashSet(this.f21867c), this.f21868d, this.f21869e, this.f21870f, this.f21871g);
        }

        /* renamed from: e */
        public b<T> m23476e() {
            return m23480i(2);
        }

        /* renamed from: f */
        public b<T> m23477f(InterfaceC5875g<T> interfaceC5875g) {
            this.f21870f = (InterfaceC5875g) C5870d0.m23502c(interfaceC5875g, "Null factory");
            return this;
        }

        /* renamed from: g */
        public final b<T> m23478g() {
            this.f21869e = 1;
            return this;
        }

        /* renamed from: h */
        public b<T> m23479h(String str) {
            this.f21865a = str;
            return this;
        }

        /* renamed from: i */
        public final b<T> m23480i(int i10) {
            C5870d0.m23503d(this.f21868d == 0, "Instantiation type has already been set.");
            this.f21868d = i10;
            return this;
        }

        /* renamed from: j */
        public final void m23481j(C5872e0<?> c5872e0) {
            C5870d0.m23500a(!this.f21866b.contains(c5872e0), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public C5867c(String str, Set<C5872e0<? super T>> set, Set<C5885q> set2, int i10, int i11, InterfaceC5875g<T> interfaceC5875g, Set<Class<?>> set3) {
        this.f21858a = str;
        this.f21859b = Collections.unmodifiableSet(set);
        this.f21860c = Collections.unmodifiableSet(set2);
        this.f21861d = i10;
        this.f21862e = i11;
        this.f21863f = interfaceC5875g;
        this.f21864g = Collections.unmodifiableSet(set3);
    }

    public /* synthetic */ C5867c(String str, Set set, Set set2, int i10, int i11, InterfaceC5875g interfaceC5875g, Set set3, a aVar) {
        this(str, set, set2, i10, i11, interfaceC5875g, set3);
    }

    /* renamed from: c */
    public static <T> b<T> m23454c(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> b<T> m23455d(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    /* renamed from: e */
    public static <T> b<T> m23456e(C5872e0<T> c5872e0) {
        return new b<>(c5872e0, new C5872e0[0]);
    }

    @SafeVarargs
    /* renamed from: f */
    public static <T> b<T> m23457f(C5872e0<T> c5872e0, C5872e0<? super T>... c5872e0Arr) {
        return new b<>(c5872e0, c5872e0Arr);
    }

    /* renamed from: l */
    public static <T> C5867c<T> m23458l(T t10, Class<T> cls) {
        return m23459m(cls).m23477f(new InterfaceC5875g() { // from class: y7.a

            /* renamed from: a */
            public final /* synthetic */ Object f21854a;

            public /* synthetic */ C5863a(Object t102) {
                r1 = t102;
            }

            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                Object m23460q;
                m23460q = C5867c.m23460q(r1, interfaceC5869d);
                return m23460q;
            }
        }).m23475d();
    }

    /* renamed from: m */
    public static <T> b<T> m23459m(Class<T> cls) {
        return m23454c(cls).m23478g();
    }

    /* renamed from: q */
    public static /* synthetic */ Object m23460q(Object obj, InterfaceC5869d interfaceC5869d) {
        return obj;
    }

    /* renamed from: r */
    public static /* synthetic */ Object m23461r(Object obj, InterfaceC5869d interfaceC5869d) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: s */
    public static <T> C5867c<T> m23462s(T t10, Class<T> cls, Class<? super T>... clsArr) {
        return m23455d(cls, clsArr).m23477f(new InterfaceC5875g() { // from class: y7.b

            /* renamed from: a */
            public final /* synthetic */ Object f21856a;

            public /* synthetic */ C5865b(Object t102) {
                r1 = t102;
            }

            @Override // p353y7.InterfaceC5875g
            /* renamed from: a */
            public final Object mo319a(InterfaceC5869d interfaceC5869d) {
                Object m23461r;
                m23461r = C5867c.m23461r(r1, interfaceC5869d);
                return m23461r;
            }
        }).m23475d();
    }

    /* renamed from: g */
    public Set<C5885q> m23463g() {
        return this.f21860c;
    }

    /* renamed from: h */
    public InterfaceC5875g<T> m23464h() {
        return this.f21863f;
    }

    /* renamed from: i */
    public String m23465i() {
        return this.f21858a;
    }

    /* renamed from: j */
    public Set<C5872e0<? super T>> m23466j() {
        return this.f21859b;
    }

    /* renamed from: k */
    public Set<Class<?>> m23467k() {
        return this.f21864g;
    }

    /* renamed from: n */
    public boolean m23468n() {
        return this.f21861d == 1;
    }

    /* renamed from: o */
    public boolean m23469o() {
        return this.f21861d == 2;
    }

    /* renamed from: p */
    public boolean m23470p() {
        return this.f21862e == 0;
    }

    /* renamed from: t */
    public C5867c<T> m23471t(InterfaceC5875g<T> interfaceC5875g) {
        return new C5867c<>(this.f21858a, this.f21859b, this.f21860c, this.f21861d, this.f21862e, interfaceC5875g, this.f21864g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f21859b.toArray()) + ">{" + this.f21861d + ", type=" + this.f21862e + ", deps=" + Arrays.toString(this.f21860c.toArray()) + "}";
    }
}
