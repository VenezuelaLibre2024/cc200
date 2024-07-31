package p204o3;

import java.util.Objects;
import p093g3.AbstractC1971i;
import p093g3.AbstractC1978p;

/* renamed from: o3.b */
/* loaded from: classes.dex */
public final class C3844b extends AbstractC3862k {

    /* renamed from: a */
    public final long f13872a;

    /* renamed from: b */
    public final AbstractC1978p f13873b;

    /* renamed from: c */
    public final AbstractC1971i f13874c;

    public C3844b(long j10, AbstractC1978p abstractC1978p, AbstractC1971i abstractC1971i) {
        this.f13872a = j10;
        Objects.requireNonNull(abstractC1978p, "Null transportContext");
        this.f13873b = abstractC1978p;
        Objects.requireNonNull(abstractC1971i, "Null event");
        this.f13874c = abstractC1971i;
    }

    @Override // p204o3.AbstractC3862k
    /* renamed from: b */
    public AbstractC1971i mo14625b() {
        return this.f13874c;
    }

    @Override // p204o3.AbstractC3862k
    /* renamed from: c */
    public long mo14626c() {
        return this.f13872a;
    }

    @Override // p204o3.AbstractC3862k
    /* renamed from: d */
    public AbstractC1978p mo14627d() {
        return this.f13873b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3862k)) {
            return false;
        }
        AbstractC3862k abstractC3862k = (AbstractC3862k) obj;
        return this.f13872a == abstractC3862k.mo14626c() && this.f13873b.equals(abstractC3862k.mo14627d()) && this.f13874c.equals(abstractC3862k.mo14625b());
    }

    public int hashCode() {
        long j10 = this.f13872a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13873b.hashCode()) * 1000003) ^ this.f13874c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f13872a + ", transportContext=" + this.f13873b + ", event=" + this.f13874c + "}";
    }
}
