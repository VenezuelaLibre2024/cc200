package p097g7;

/* renamed from: g7.q */
/* loaded from: classes.dex */
public final class C2114q extends AbstractC2115r {

    /* renamed from: a */
    public final int f8223a;

    /* renamed from: b */
    public final long f8224b;

    public C2114q(int i10, long j10) {
        this.f8223a = i10;
        this.f8224b = j10;
    }

    @Override // p097g7.AbstractC2115r
    /* renamed from: a */
    public final int mo8332a() {
        return this.f8223a;
    }

    @Override // p097g7.AbstractC2115r
    /* renamed from: b */
    public final long mo8333b() {
        return this.f8224b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2115r) {
            AbstractC2115r abstractC2115r = (AbstractC2115r) obj;
            if (this.f8223a == abstractC2115r.mo8332a() && this.f8224b == abstractC2115r.mo8333b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f8223a ^ 1000003;
        long j10 = this.f8224b;
        return (i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f8223a + ", eventTimestamp=" + this.f8224b + "}";
    }
}
