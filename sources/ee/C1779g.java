package ee;

import td.C4747g;
import td.C4753m;

/* renamed from: ee.g */
/* loaded from: classes2.dex */
public final class C1779g<T> {

    /* renamed from: b */
    public static final b f6579b = new b(null);

    /* renamed from: c */
    public static final c f6580c = new c();

    /* renamed from: a */
    public final Object f6581a;

    /* renamed from: ee.g$a */
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: a */
        public final Throwable f6582a;

        public a(Throwable th) {
            this.f6582a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C4753m.m18648a(this.f6582a, ((a) obj).f6582a);
        }

        public int hashCode() {
            Throwable th = this.f6582a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // ee.C1779g.c
        public String toString() {
            return "Closed(" + this.f6582a + ')';
        }
    }

    /* renamed from: ee.g$b */
    /* loaded from: classes2.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final <E> Object m7205a(Throwable th) {
            return C1779g.m7196c(new a(th));
        }

        /* renamed from: b */
        public final <E> Object m7206b() {
            return C1779g.m7196c(C1779g.f6580c);
        }

        /* renamed from: c */
        public final <E> Object m7207c(E e10) {
            return C1779g.m7196c(e10);
        }
    }

    /* renamed from: ee.g$c */
    /* loaded from: classes2.dex */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ C1779g(Object obj) {
        this.f6581a = obj;
    }

    /* renamed from: b */
    public static final /* synthetic */ C1779g m7195b(Object obj) {
        return new C1779g(obj);
    }

    /* renamed from: c */
    public static <T> Object m7196c(Object obj) {
        return obj;
    }

    /* renamed from: d */
    public static boolean m7197d(Object obj, Object obj2) {
        return (obj2 instanceof C1779g) && C4753m.m18648a(obj, ((C1779g) obj2).m7204k());
    }

    /* renamed from: e */
    public static final Throwable m7198e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f6582a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static final T m7199f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static int m7200g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: h */
    public static final boolean m7201h(Object obj) {
        return obj instanceof a;
    }

    /* renamed from: i */
    public static final boolean m7202i(Object obj) {
        return !(obj instanceof c);
    }

    /* renamed from: j */
    public static String m7203j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m7197d(this.f6581a, obj);
    }

    public int hashCode() {
        return m7200g(this.f6581a);
    }

    /* renamed from: k */
    public final /* synthetic */ Object m7204k() {
        return this.f6581a;
    }

    public String toString() {
        return m7203j(this.f6581a);
    }
}
