package p239q8;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: q8.d */
/* loaded from: classes.dex */
public final class C4205d {

    /* renamed from: a */
    public final String f15164a;

    /* renamed from: b */
    public final Map<Class<?>, Object> f15165b;

    /* renamed from: q8.d$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f15166a;

        /* renamed from: b */
        public Map<Class<?>, Object> f15167b = null;

        public b(String str) {
            this.f15166a = str;
        }

        /* renamed from: a */
        public C4205d m16200a() {
            return new C4205d(this.f15166a, this.f15167b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f15167b)));
        }

        /* renamed from: b */
        public <T extends Annotation> b m16201b(T t10) {
            if (this.f15167b == null) {
                this.f15167b = new HashMap();
            }
            this.f15167b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public C4205d(String str, Map<Class<?>, Object> map) {
        this.f15164a = str;
        this.f15165b = map;
    }

    /* renamed from: a */
    public static b m16196a(String str) {
        return new b(str);
    }

    /* renamed from: d */
    public static C4205d m16197d(String str) {
        return new C4205d(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m16198b() {
        return this.f15164a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m16199c(Class<T> cls) {
        return (T) this.f15165b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4205d)) {
            return false;
        }
        C4205d c4205d = (C4205d) obj;
        return this.f15164a.equals(c4205d.f15164a) && this.f15165b.equals(c4205d.f15165b);
    }

    public int hashCode() {
        return (this.f15164a.hashCode() * 31) + this.f15165b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f15164a + ", properties=" + this.f15165b.values() + "}";
    }
}
