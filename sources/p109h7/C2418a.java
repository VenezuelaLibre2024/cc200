package p109h7;

/* renamed from: h7.a */
/* loaded from: classes.dex */
public final class C2418a<T> extends AbstractC2429l<T> {

    /* renamed from: h */
    public static final C2418a<Object> f9733h = new C2418a<>();

    /* renamed from: e */
    public static <T> AbstractC2429l<T> m9654e() {
        return f9733h;
    }

    @Override // p109h7.AbstractC2429l
    /* renamed from: b */
    public T mo9655b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // p109h7.AbstractC2429l
    /* renamed from: c */
    public boolean mo9656c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
