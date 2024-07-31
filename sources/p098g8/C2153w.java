package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.w */
/* loaded from: classes.dex */
public final class C2153w extends AbstractC2135f0.e.d.AbstractC6180e {

    /* renamed from: a */
    public final AbstractC2135f0.e.d.AbstractC6180e.b f8608a;

    /* renamed from: b */
    public final String f8609b;

    /* renamed from: c */
    public final String f8610c;

    /* renamed from: d */
    public final long f8611d;

    /* renamed from: g8.w$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.AbstractC6180e.a {

        /* renamed from: a */
        public AbstractC2135f0.e.d.AbstractC6180e.b f8612a;

        /* renamed from: b */
        public String f8613b;

        /* renamed from: c */
        public String f8614c;

        /* renamed from: d */
        public Long f8615d;

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.a
        /* renamed from: a */
        public AbstractC2135f0.e.d.AbstractC6180e mo8665a() {
            String str = "";
            if (this.f8612a == null) {
                str = " rolloutVariant";
            }
            if (this.f8613b == null) {
                str = str + " parameterKey";
            }
            if (this.f8614c == null) {
                str = str + " parameterValue";
            }
            if (this.f8615d == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new C2153w(this.f8612a, this.f8613b, this.f8614c, this.f8615d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.a
        /* renamed from: b */
        public AbstractC2135f0.e.d.AbstractC6180e.a mo8666b(String str) {
            Objects.requireNonNull(str, "Null parameterKey");
            this.f8613b = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.a
        /* renamed from: c */
        public AbstractC2135f0.e.d.AbstractC6180e.a mo8667c(String str) {
            Objects.requireNonNull(str, "Null parameterValue");
            this.f8614c = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.a
        /* renamed from: d */
        public AbstractC2135f0.e.d.AbstractC6180e.a mo8668d(AbstractC2135f0.e.d.AbstractC6180e.b bVar) {
            Objects.requireNonNull(bVar, "Null rolloutVariant");
            this.f8612a = bVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e.a
        /* renamed from: e */
        public AbstractC2135f0.e.d.AbstractC6180e.a mo8669e(long j10) {
            this.f8615d = Long.valueOf(j10);
            return this;
        }
    }

    public C2153w(AbstractC2135f0.e.d.AbstractC6180e.b bVar, String str, String str2, long j10) {
        this.f8608a = bVar;
        this.f8609b = str;
        this.f8610c = str2;
        this.f8611d = j10;
    }

    @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e
    /* renamed from: b */
    public String mo8661b() {
        return this.f8609b;
    }

    @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e
    /* renamed from: c */
    public String mo8662c() {
        return this.f8610c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e
    /* renamed from: d */
    public AbstractC2135f0.e.d.AbstractC6180e.b mo8663d() {
        return this.f8608a;
    }

    @Override // p098g8.AbstractC2135f0.e.d.AbstractC6180e
    /* renamed from: e */
    public long mo8664e() {
        return this.f8611d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.AbstractC6180e)) {
            return false;
        }
        AbstractC2135f0.e.d.AbstractC6180e abstractC6180e = (AbstractC2135f0.e.d.AbstractC6180e) obj;
        return this.f8608a.equals(abstractC6180e.mo8663d()) && this.f8609b.equals(abstractC6180e.mo8661b()) && this.f8610c.equals(abstractC6180e.mo8662c()) && this.f8611d == abstractC6180e.mo8664e();
    }

    public int hashCode() {
        int hashCode = (((((this.f8608a.hashCode() ^ 1000003) * 1000003) ^ this.f8609b.hashCode()) * 1000003) ^ this.f8610c.hashCode()) * 1000003;
        long j10 = this.f8611d;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f8608a + ", parameterKey=" + this.f8609b + ", parameterValue=" + this.f8610c + ", templateVersion=" + this.f8611d + "}";
    }
}
