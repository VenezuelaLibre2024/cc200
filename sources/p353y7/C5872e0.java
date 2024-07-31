package p353y7;

import java.lang.annotation.Annotation;

/* renamed from: y7.e0 */
/* loaded from: classes.dex */
public final class C5872e0<T> {

    /* renamed from: a */
    public final Class<? extends Annotation> f21877a;

    /* renamed from: b */
    public final Class<T> f21878b;

    /* renamed from: y7.e0$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public C5872e0(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f21877a = cls;
        this.f21878b = cls2;
    }

    /* renamed from: a */
    public static <T> C5872e0<T> m23504a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new C5872e0<>(cls, cls2);
    }

    /* renamed from: b */
    public static <T> C5872e0<T> m23505b(Class<T> cls) {
        return new C5872e0<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5872e0.class != obj.getClass()) {
            return false;
        }
        C5872e0 c5872e0 = (C5872e0) obj;
        if (this.f21878b.equals(c5872e0.f21878b)) {
            return this.f21877a.equals(c5872e0.f21877a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f21878b.hashCode() * 31) + this.f21877a.hashCode();
    }

    public String toString() {
        if (this.f21877a == a.class) {
            return this.f21878b.getName();
        }
        return "@" + this.f21877a.getName() + " " + this.f21878b.getName();
    }
}
