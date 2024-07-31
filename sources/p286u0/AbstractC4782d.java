package p286u0;

import java.util.Map;
import p115hd.C2488e0;
import td.C4753m;

/* renamed from: u0.d */
/* loaded from: classes.dex */
public abstract class AbstractC4782d {

    /* renamed from: u0.d$a */
    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: a */
        public final String f17812a;

        public a(String str) {
            C4753m.m18653f(str, "name");
            this.f17812a = str;
        }

        /* renamed from: a */
        public final String m18790a() {
            return this.f17812a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return C4753m.m18648a(this.f17812a, ((a) obj).f17812a);
            }
            return false;
        }

        public int hashCode() {
            return this.f17812a.hashCode();
        }

        public String toString() {
            return this.f17812a;
        }
    }

    /* renamed from: u0.d$b */
    /* loaded from: classes.dex */
    public static final class b<T> {

        /* renamed from: a */
        public final a<T> f17813a;

        /* renamed from: b */
        public final T f17814b;

        /* renamed from: a */
        public final a<T> m18791a() {
            return this.f17813a;
        }

        /* renamed from: b */
        public final T m18792b() {
            return this.f17814b;
        }
    }

    /* renamed from: a */
    public abstract Map<a<?>, Object> mo18776a();

    /* renamed from: b */
    public abstract <T> T mo18777b(a<T> aVar);

    /* renamed from: c */
    public final C4779a m18788c() {
        return new C4779a(C2488e0.m9906n(mo18776a()), false);
    }

    /* renamed from: d */
    public final AbstractC4782d m18789d() {
        return new C4779a(C2488e0.m9906n(mo18776a()), true);
    }
}
