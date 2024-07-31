package p195n7;

/* renamed from: n7.a */
/* loaded from: classes.dex */
public final class C3761a extends AbstractC3778r {

    /* renamed from: a */
    public final long f13570a;

    /* renamed from: b */
    public final long f13571b;

    /* renamed from: c */
    public final long f13572c;

    public C3761a(long j10, long j11, long j12) {
        this.f13570a = j10;
        this.f13571b = j11;
        this.f13572c = j12;
    }

    @Override // p195n7.AbstractC3778r
    /* renamed from: b */
    public long mo14320b() {
        return this.f13571b;
    }

    @Override // p195n7.AbstractC3778r
    /* renamed from: c */
    public long mo14321c() {
        return this.f13570a;
    }

    @Override // p195n7.AbstractC3778r
    /* renamed from: d */
    public long mo14322d() {
        return this.f13572c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3778r)) {
            return false;
        }
        AbstractC3778r abstractC3778r = (AbstractC3778r) obj;
        return this.f13570a == abstractC3778r.mo14321c() && this.f13571b == abstractC3778r.mo14320b() && this.f13572c == abstractC3778r.mo14322d();
    }

    public int hashCode() {
        long j10 = this.f13570a;
        long j11 = this.f13571b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f13572c;
        return i10 ^ ((int) ((j12 >>> 32) ^ j12));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f13570a + ", elapsedRealtime=" + this.f13571b + ", uptimeMillis=" + this.f13572c + "}";
    }
}
