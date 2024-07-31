package p109h7;

/* renamed from: h7.r */
/* loaded from: classes.dex */
public final class C2435r<T> extends AbstractC2429l<T> {

    /* renamed from: h */
    public final T f9763h;

    public C2435r(T t10) {
        this.f9763h = t10;
    }

    @Override // p109h7.AbstractC2429l
    /* renamed from: b */
    public T mo9655b() {
        return this.f9763h;
    }

    @Override // p109h7.AbstractC2429l
    /* renamed from: c */
    public boolean mo9656c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2435r) {
            return this.f9763h.equals(((C2435r) obj).f9763h);
        }
        return false;
    }

    public int hashCode() {
        return this.f9763h.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f9763h + ")";
    }
}
