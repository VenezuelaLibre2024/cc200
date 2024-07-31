package p017b2;

import android.os.Build;
import cf.C1128a;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: b2.a */
/* loaded from: classes.dex */
public abstract class AbstractC0446a implements InterfaceC0454h {

    /* renamed from: c */
    public static final Set<AbstractC0446a> f2143c = new HashSet();

    /* renamed from: a */
    public final String f2144a;

    /* renamed from: b */
    public final String f2145b;

    /* renamed from: b2.a$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static final Set<String> f2146a = new HashSet(Arrays.asList(C0466t.m2373d().mo2353a()));
    }

    /* renamed from: b2.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0446a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // p017b2.AbstractC0446a
        /* renamed from: c */
        public boolean mo2293c() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    /* renamed from: b2.a$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC0446a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // p017b2.AbstractC0446a
        /* renamed from: c */
        public boolean mo2293c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    /* renamed from: b2.a$d */
    /* loaded from: classes.dex */
    public static final class d extends AbstractC0446a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // p017b2.AbstractC0446a
        /* renamed from: c */
        public boolean mo2293c() {
            return false;
        }
    }

    /* renamed from: b2.a$e */
    /* loaded from: classes.dex */
    public static final class e extends AbstractC0446a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // p017b2.AbstractC0446a
        /* renamed from: c */
        public boolean mo2293c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    /* renamed from: b2.a$f */
    /* loaded from: classes.dex */
    public static final class f extends AbstractC0446a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // p017b2.AbstractC0446a
        /* renamed from: c */
        public boolean mo2293c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    /* renamed from: b2.a$g */
    /* loaded from: classes.dex */
    public static final class g extends AbstractC0446a {
        public g(String str, String str2) {
            super(str, str2);
        }

        @Override // p017b2.AbstractC0446a
        /* renamed from: c */
        public boolean mo2293c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    /* renamed from: b2.a$h */
    /* loaded from: classes.dex */
    public static final class h extends AbstractC0446a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // p017b2.AbstractC0446a
        /* renamed from: c */
        public boolean mo2293c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public AbstractC0446a(String str, String str2) {
        this.f2144a = str;
        this.f2145b = str2;
        f2143c.add(this);
    }

    /* renamed from: e */
    public static Set<AbstractC0446a> m2290e() {
        return Collections.unmodifiableSet(f2143c);
    }

    @Override // p017b2.InterfaceC0454h
    /* renamed from: a */
    public String mo2291a() {
        return this.f2144a;
    }

    @Override // p017b2.InterfaceC0454h
    /* renamed from: b */
    public boolean mo2292b() {
        return mo2293c() || m2294d();
    }

    /* renamed from: c */
    public abstract boolean mo2293c();

    /* renamed from: d */
    public boolean m2294d() {
        return C1128a.m4611b(a.f2146a, this.f2145b);
    }
}
