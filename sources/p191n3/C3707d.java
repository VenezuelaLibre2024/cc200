package p191n3;

import java.util.Objects;
import java.util.Set;
import p191n3.AbstractC3710g;

/* renamed from: n3.d */
/* loaded from: classes.dex */
public final class C3707d extends AbstractC3710g.b {

    /* renamed from: a */
    public final long f13209a;

    /* renamed from: b */
    public final long f13210b;

    /* renamed from: c */
    public final Set<AbstractC3710g.c> f13211c;

    /* renamed from: n3.d$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3710g.b.a {

        /* renamed from: a */
        public Long f13212a;

        /* renamed from: b */
        public Long f13213b;

        /* renamed from: c */
        public Set<AbstractC3710g.c> f13214c;

        @Override // p191n3.AbstractC3710g.b.a
        /* renamed from: a */
        public AbstractC3710g.b mo13991a() {
            String str = "";
            if (this.f13212a == null) {
                str = " delta";
            }
            if (this.f13213b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f13214c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C3707d(this.f13212a.longValue(), this.f13213b.longValue(), this.f13214c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p191n3.AbstractC3710g.b.a
        /* renamed from: b */
        public AbstractC3710g.b.a mo13992b(long j10) {
            this.f13212a = Long.valueOf(j10);
            return this;
        }

        @Override // p191n3.AbstractC3710g.b.a
        /* renamed from: c */
        public AbstractC3710g.b.a mo13993c(Set<AbstractC3710g.c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.f13214c = set;
            return this;
        }

        @Override // p191n3.AbstractC3710g.b.a
        /* renamed from: d */
        public AbstractC3710g.b.a mo13994d(long j10) {
            this.f13213b = Long.valueOf(j10);
            return this;
        }
    }

    public C3707d(long j10, long j11, Set<AbstractC3710g.c> set) {
        this.f13209a = j10;
        this.f13210b = j11;
        this.f13211c = set;
    }

    public /* synthetic */ C3707d(long j10, long j11, Set set, a aVar) {
        this(j10, j11, set);
    }

    @Override // p191n3.AbstractC3710g.b
    /* renamed from: b */
    public long mo13988b() {
        return this.f13209a;
    }

    @Override // p191n3.AbstractC3710g.b
    /* renamed from: c */
    public Set<AbstractC3710g.c> mo13989c() {
        return this.f13211c;
    }

    @Override // p191n3.AbstractC3710g.b
    /* renamed from: d */
    public long mo13990d() {
        return this.f13210b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3710g.b)) {
            return false;
        }
        AbstractC3710g.b bVar = (AbstractC3710g.b) obj;
        return this.f13209a == bVar.mo13988b() && this.f13210b == bVar.mo13990d() && this.f13211c.equals(bVar.mo13989c());
    }

    public int hashCode() {
        long j10 = this.f13209a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f13210b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13211c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f13209a + ", maxAllowedDelay=" + this.f13210b + ", flags=" + this.f13211c + "}";
    }
}
