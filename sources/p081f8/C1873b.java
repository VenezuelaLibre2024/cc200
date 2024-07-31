package p081f8;

import java.util.Objects;

/* renamed from: f8.b */
/* loaded from: classes.dex */
public final class C1873b extends AbstractC1880i {

    /* renamed from: b */
    public final String f7073b;

    /* renamed from: c */
    public final String f7074c;

    /* renamed from: d */
    public final String f7075d;

    /* renamed from: e */
    public final String f7076e;

    /* renamed from: f */
    public final long f7077f;

    public C1873b(String str, String str2, String str3, String str4, long j10) {
        Objects.requireNonNull(str, "Null rolloutId");
        this.f7073b = str;
        Objects.requireNonNull(str2, "Null parameterKey");
        this.f7074c = str2;
        Objects.requireNonNull(str3, "Null parameterValue");
        this.f7075d = str3;
        Objects.requireNonNull(str4, "Null variantId");
        this.f7076e = str4;
        this.f7077f = j10;
    }

    @Override // p081f8.AbstractC1880i
    /* renamed from: c */
    public String mo7617c() {
        return this.f7074c;
    }

    @Override // p081f8.AbstractC1880i
    /* renamed from: d */
    public String mo7618d() {
        return this.f7075d;
    }

    @Override // p081f8.AbstractC1880i
    /* renamed from: e */
    public String mo7619e() {
        return this.f7073b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1880i)) {
            return false;
        }
        AbstractC1880i abstractC1880i = (AbstractC1880i) obj;
        return this.f7073b.equals(abstractC1880i.mo7619e()) && this.f7074c.equals(abstractC1880i.mo7617c()) && this.f7075d.equals(abstractC1880i.mo7618d()) && this.f7076e.equals(abstractC1880i.mo7621g()) && this.f7077f == abstractC1880i.mo7620f();
    }

    @Override // p081f8.AbstractC1880i
    /* renamed from: f */
    public long mo7620f() {
        return this.f7077f;
    }

    @Override // p081f8.AbstractC1880i
    /* renamed from: g */
    public String mo7621g() {
        return this.f7076e;
    }

    public int hashCode() {
        int hashCode = (((((((this.f7073b.hashCode() ^ 1000003) * 1000003) ^ this.f7074c.hashCode()) * 1000003) ^ this.f7075d.hashCode()) * 1000003) ^ this.f7076e.hashCode()) * 1000003;
        long j10 = this.f7077f;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f7073b + ", parameterKey=" + this.f7074c + ", parameterValue=" + this.f7075d + ", variantId=" + this.f7076e + ", templateVersion=" + this.f7077f + "}";
    }
}
