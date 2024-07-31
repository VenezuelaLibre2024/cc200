package p204o3;

import p204o3.AbstractC3850e;

/* renamed from: o3.a */
/* loaded from: classes.dex */
public final class C3842a extends AbstractC3850e {

    /* renamed from: b */
    public final long f13861b;

    /* renamed from: c */
    public final int f13862c;

    /* renamed from: d */
    public final int f13863d;

    /* renamed from: e */
    public final long f13864e;

    /* renamed from: f */
    public final int f13865f;

    /* renamed from: o3.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3850e.a {

        /* renamed from: a */
        public Long f13866a;

        /* renamed from: b */
        public Integer f13867b;

        /* renamed from: c */
        public Integer f13868c;

        /* renamed from: d */
        public Long f13869d;

        /* renamed from: e */
        public Integer f13870e;

        @Override // p204o3.AbstractC3850e.a
        /* renamed from: a */
        public AbstractC3850e mo14619a() {
            String str = "";
            if (this.f13866a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f13867b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f13868c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f13869d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f13870e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C3842a(this.f13866a.longValue(), this.f13867b.intValue(), this.f13868c.intValue(), this.f13869d.longValue(), this.f13870e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p204o3.AbstractC3850e.a
        /* renamed from: b */
        public AbstractC3850e.a mo14620b(int i10) {
            this.f13868c = Integer.valueOf(i10);
            return this;
        }

        @Override // p204o3.AbstractC3850e.a
        /* renamed from: c */
        public AbstractC3850e.a mo14621c(long j10) {
            this.f13869d = Long.valueOf(j10);
            return this;
        }

        @Override // p204o3.AbstractC3850e.a
        /* renamed from: d */
        public AbstractC3850e.a mo14622d(int i10) {
            this.f13867b = Integer.valueOf(i10);
            return this;
        }

        @Override // p204o3.AbstractC3850e.a
        /* renamed from: e */
        public AbstractC3850e.a mo14623e(int i10) {
            this.f13870e = Integer.valueOf(i10);
            return this;
        }

        @Override // p204o3.AbstractC3850e.a
        /* renamed from: f */
        public AbstractC3850e.a mo14624f(long j10) {
            this.f13866a = Long.valueOf(j10);
            return this;
        }
    }

    public C3842a(long j10, int i10, int i11, long j11, int i12) {
        this.f13861b = j10;
        this.f13862c = i10;
        this.f13863d = i11;
        this.f13864e = j11;
        this.f13865f = i12;
    }

    public /* synthetic */ C3842a(long j10, int i10, int i11, long j11, int i12, a aVar) {
        this(j10, i10, i11, j11, i12);
    }

    @Override // p204o3.AbstractC3850e
    /* renamed from: b */
    public int mo14614b() {
        return this.f13863d;
    }

    @Override // p204o3.AbstractC3850e
    /* renamed from: c */
    public long mo14615c() {
        return this.f13864e;
    }

    @Override // p204o3.AbstractC3850e
    /* renamed from: d */
    public int mo14616d() {
        return this.f13862c;
    }

    @Override // p204o3.AbstractC3850e
    /* renamed from: e */
    public int mo14617e() {
        return this.f13865f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3850e)) {
            return false;
        }
        AbstractC3850e abstractC3850e = (AbstractC3850e) obj;
        return this.f13861b == abstractC3850e.mo14618f() && this.f13862c == abstractC3850e.mo14616d() && this.f13863d == abstractC3850e.mo14614b() && this.f13864e == abstractC3850e.mo14615c() && this.f13865f == abstractC3850e.mo14617e();
    }

    @Override // p204o3.AbstractC3850e
    /* renamed from: f */
    public long mo14618f() {
        return this.f13861b;
    }

    public int hashCode() {
        long j10 = this.f13861b;
        int i10 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f13862c) * 1000003) ^ this.f13863d) * 1000003;
        long j11 = this.f13864e;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13865f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f13861b + ", loadBatchSize=" + this.f13862c + ", criticalSectionEnterTimeoutMs=" + this.f13863d + ", eventCleanUpAge=" + this.f13864e + ", maxBlobByteSizePerRow=" + this.f13865f + "}";
    }
}
