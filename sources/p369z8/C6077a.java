package p369z8;

import java.util.Objects;
import p369z8.AbstractC6089m;

/* renamed from: z8.a */
/* loaded from: classes.dex */
public final class C6077a extends AbstractC6089m {

    /* renamed from: a */
    public final String f22573a;

    /* renamed from: b */
    public final long f22574b;

    /* renamed from: c */
    public final long f22575c;

    /* renamed from: z8.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC6089m.a {

        /* renamed from: a */
        public String f22576a;

        /* renamed from: b */
        public Long f22577b;

        /* renamed from: c */
        public Long f22578c;

        @Override // p369z8.AbstractC6089m.a
        /* renamed from: a */
        public AbstractC6089m mo24296a() {
            String str = "";
            if (this.f22576a == null) {
                str = " token";
            }
            if (this.f22577b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f22578c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new C6077a(this.f22576a, this.f22577b.longValue(), this.f22578c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p369z8.AbstractC6089m.a
        /* renamed from: b */
        public AbstractC6089m.a mo24297b(String str) {
            Objects.requireNonNull(str, "Null token");
            this.f22576a = str;
            return this;
        }

        @Override // p369z8.AbstractC6089m.a
        /* renamed from: c */
        public AbstractC6089m.a mo24298c(long j10) {
            this.f22578c = Long.valueOf(j10);
            return this;
        }

        @Override // p369z8.AbstractC6089m.a
        /* renamed from: d */
        public AbstractC6089m.a mo24299d(long j10) {
            this.f22577b = Long.valueOf(j10);
            return this;
        }
    }

    public C6077a(String str, long j10, long j11) {
        this.f22573a = str;
        this.f22574b = j10;
        this.f22575c = j11;
    }

    public /* synthetic */ C6077a(String str, long j10, long j11, a aVar) {
        this(str, j10, j11);
    }

    @Override // p369z8.AbstractC6089m
    /* renamed from: b */
    public String mo24293b() {
        return this.f22573a;
    }

    @Override // p369z8.AbstractC6089m
    /* renamed from: c */
    public long mo24294c() {
        return this.f22575c;
    }

    @Override // p369z8.AbstractC6089m
    /* renamed from: d */
    public long mo24295d() {
        return this.f22574b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6089m)) {
            return false;
        }
        AbstractC6089m abstractC6089m = (AbstractC6089m) obj;
        return this.f22573a.equals(abstractC6089m.mo24293b()) && this.f22574b == abstractC6089m.mo24295d() && this.f22575c == abstractC6089m.mo24294c();
    }

    public int hashCode() {
        int hashCode = (this.f22573a.hashCode() ^ 1000003) * 1000003;
        long j10 = this.f22574b;
        long j11 = this.f22575c;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f22573a + ", tokenExpirationTimestamp=" + this.f22574b + ", tokenCreationTimestamp=" + this.f22575c + "}";
    }
}
