package p246r0;

/* renamed from: r0.c */
/* loaded from: classes.dex */
public final class C4259c<T> extends AbstractC4270n<T> {

    /* renamed from: a */
    public final T f15393a;

    /* renamed from: b */
    public final int f15394b;

    public C4259c(T t10, int i10) {
        super(null);
        this.f15393a = t10;
        this.f15394b = i10;
    }

    /* renamed from: a */
    public final void m16339a() {
        T t10 = this.f15393a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f15394b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    /* renamed from: b */
    public final T m16340b() {
        return this.f15393a;
    }
}
