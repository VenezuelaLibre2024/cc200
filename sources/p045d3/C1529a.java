package p045d3;

import java.util.Objects;

/* renamed from: d3.a */
/* loaded from: classes.dex */
public final class C1529a<T> extends AbstractC1532d<T> {

    /* renamed from: a */
    public final Integer f5622a;

    /* renamed from: b */
    public final T f5623b;

    /* renamed from: c */
    public final EnumC1533e f5624c;

    /* renamed from: d */
    public final AbstractC1534f f5625d;

    public C1529a(Integer num, T t10, EnumC1533e enumC1533e, AbstractC1534f abstractC1534f) {
        this.f5622a = num;
        Objects.requireNonNull(t10, "Null payload");
        this.f5623b = t10;
        Objects.requireNonNull(enumC1533e, "Null priority");
        this.f5624c = enumC1533e;
        this.f5625d = abstractC1534f;
    }

    @Override // p045d3.AbstractC1532d
    /* renamed from: a */
    public Integer mo6227a() {
        return this.f5622a;
    }

    @Override // p045d3.AbstractC1532d
    /* renamed from: b */
    public T mo6228b() {
        return this.f5623b;
    }

    @Override // p045d3.AbstractC1532d
    /* renamed from: c */
    public EnumC1533e mo6229c() {
        return this.f5624c;
    }

    @Override // p045d3.AbstractC1532d
    /* renamed from: d */
    public AbstractC1534f mo6230d() {
        return this.f5625d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1532d)) {
            return false;
        }
        AbstractC1532d abstractC1532d = (AbstractC1532d) obj;
        Integer num = this.f5622a;
        if (num != null ? num.equals(abstractC1532d.mo6227a()) : abstractC1532d.mo6227a() == null) {
            if (this.f5623b.equals(abstractC1532d.mo6228b()) && this.f5624c.equals(abstractC1532d.mo6229c())) {
                AbstractC1534f abstractC1534f = this.f5625d;
                AbstractC1534f mo6230d = abstractC1532d.mo6230d();
                if (abstractC1534f == null) {
                    if (mo6230d == null) {
                        return true;
                    }
                } else if (abstractC1534f.equals(mo6230d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f5622a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f5623b.hashCode()) * 1000003) ^ this.f5624c.hashCode()) * 1000003;
        AbstractC1534f abstractC1534f = this.f5625d;
        return hashCode ^ (abstractC1534f != null ? abstractC1534f.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f5622a + ", payload=" + this.f5623b + ", priority=" + this.f5624c + ", productData=" + this.f5625d + "}";
    }
}
