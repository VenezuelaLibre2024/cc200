package p105h3;

import java.util.Objects;
import p105h3.AbstractC2292g;

/* renamed from: h3.b */
/* loaded from: classes.dex */
public final class C2287b extends AbstractC2292g {

    /* renamed from: a */
    public final AbstractC2292g.a f9187a;

    /* renamed from: b */
    public final long f9188b;

    public C2287b(AbstractC2292g.a aVar, long j10) {
        Objects.requireNonNull(aVar, "Null status");
        this.f9187a = aVar;
        this.f9188b = j10;
    }

    @Override // p105h3.AbstractC2292g
    /* renamed from: b */
    public long mo9299b() {
        return this.f9188b;
    }

    @Override // p105h3.AbstractC2292g
    /* renamed from: c */
    public AbstractC2292g.a mo9300c() {
        return this.f9187a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2292g)) {
            return false;
        }
        AbstractC2292g abstractC2292g = (AbstractC2292g) obj;
        return this.f9187a.equals(abstractC2292g.mo9300c()) && this.f9188b == abstractC2292g.mo9299b();
    }

    public int hashCode() {
        int hashCode = (this.f9187a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f9188b;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f9187a + ", nextRequestWaitMillis=" + this.f9188b + "}";
    }
}
