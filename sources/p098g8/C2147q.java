package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.q */
/* loaded from: classes.dex */
public final class C2147q extends AbstractC2135f0.e.d.a.b.AbstractC6172d {

    /* renamed from: a */
    public final String f8564a;

    /* renamed from: b */
    public final String f8565b;

    /* renamed from: c */
    public final long f8566c;

    /* renamed from: g8.q$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a {

        /* renamed from: a */
        public String f8567a;

        /* renamed from: b */
        public String f8568b;

        /* renamed from: c */
        public Long f8569c;

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a
        /* renamed from: a */
        public AbstractC2135f0.e.d.a.b.AbstractC6172d mo8601a() {
            String str = "";
            if (this.f8567a == null) {
                str = " name";
            }
            if (this.f8568b == null) {
                str = str + " code";
            }
            if (this.f8569c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new C2147q(this.f8567a, this.f8568b, this.f8569c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a
        /* renamed from: b */
        public AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a mo8602b(long j10) {
            this.f8569c = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a
        /* renamed from: c */
        public AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a mo8603c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f8568b = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a
        /* renamed from: d */
        public AbstractC2135f0.e.d.a.b.AbstractC6172d.AbstractC6173a mo8604d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f8567a = str;
            return this;
        }
    }

    public C2147q(String str, String str2, long j10) {
        this.f8564a = str;
        this.f8565b = str2;
        this.f8566c = j10;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6172d
    /* renamed from: b */
    public long mo8598b() {
        return this.f8566c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6172d
    /* renamed from: c */
    public String mo8599c() {
        return this.f8565b;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6172d
    /* renamed from: d */
    public String mo8600d() {
        return this.f8564a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.a.b.AbstractC6172d)) {
            return false;
        }
        AbstractC2135f0.e.d.a.b.AbstractC6172d abstractC6172d = (AbstractC2135f0.e.d.a.b.AbstractC6172d) obj;
        return this.f8564a.equals(abstractC6172d.mo8600d()) && this.f8565b.equals(abstractC6172d.mo8599c()) && this.f8566c == abstractC6172d.mo8598b();
    }

    public int hashCode() {
        int hashCode = (((this.f8564a.hashCode() ^ 1000003) * 1000003) ^ this.f8565b.hashCode()) * 1000003;
        long j10 = this.f8566c;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f8564a + ", code=" + this.f8565b + ", address=" + this.f8566c + "}";
    }
}
