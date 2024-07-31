package gd;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;
import td.C4747g;
import td.C4753m;

/* renamed from: gd.k */
/* loaded from: classes2.dex */
public final class C2237k<T> implements Serializable {

    /* renamed from: i */
    public static final a f8865i = new a(null);

    /* renamed from: h */
    public final Object f8866h;

    /* renamed from: gd.k$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: gd.k$b */
    /* loaded from: classes2.dex */
    public static final class b implements Serializable {

        /* renamed from: h */
        public final Throwable f8867h;

        public b(Throwable th) {
            C4753m.m18653f(th, Constants.EXCEPTION);
            this.f8867h = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && C4753m.m18648a(this.f8867h, ((b) obj).f8867h);
        }

        public int hashCode() {
            return this.f8867h.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f8867h + ')';
        }
    }

    public /* synthetic */ C2237k(Object obj) {
        this.f8866h = obj;
    }

    /* renamed from: a */
    public static final /* synthetic */ C2237k m8965a(Object obj) {
        return new C2237k(obj);
    }

    /* renamed from: b */
    public static <T> Object m8966b(Object obj) {
        return obj;
    }

    /* renamed from: c */
    public static boolean m8967c(Object obj, Object obj2) {
        return (obj2 instanceof C2237k) && C4753m.m18648a(obj, ((C2237k) obj2).m8973i());
    }

    /* renamed from: d */
    public static final Throwable m8968d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f8867h;
        }
        return null;
    }

    /* renamed from: e */
    public static int m8969e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: f */
    public static final boolean m8970f(Object obj) {
        return obj instanceof b;
    }

    /* renamed from: g */
    public static final boolean m8971g(Object obj) {
        return !(obj instanceof b);
    }

    /* renamed from: h */
    public static String m8972h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m8967c(this.f8866h, obj);
    }

    public int hashCode() {
        return m8969e(this.f8866h);
    }

    /* renamed from: i */
    public final /* synthetic */ Object m8973i() {
        return this.f8866h;
    }

    public String toString() {
        return m8972h(this.f8866h);
    }
}
