package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.o */
/* loaded from: classes.dex */
public final class C2145o extends AbstractC2135f0.e.d.a.b.AbstractC6168a {

    /* renamed from: a */
    public final long f8546a;

    /* renamed from: b */
    public final long f8547b;

    /* renamed from: c */
    public final String f8548c;

    /* renamed from: d */
    public final String f8549d;

    /* renamed from: g8.o$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a {

        /* renamed from: a */
        public Long f8550a;

        /* renamed from: b */
        public Long f8551b;

        /* renamed from: c */
        public String f8552c;

        /* renamed from: d */
        public String f8553d;

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a
        /* renamed from: a */
        public AbstractC2135f0.e.d.a.b.AbstractC6168a mo8573a() {
            String str = "";
            if (this.f8550a == null) {
                str = " baseAddress";
            }
            if (this.f8551b == null) {
                str = str + " size";
            }
            if (this.f8552c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new C2145o(this.f8550a.longValue(), this.f8551b.longValue(), this.f8552c, this.f8553d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a
        /* renamed from: b */
        public AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a mo8574b(long j10) {
            this.f8550a = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a
        /* renamed from: c */
        public AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a mo8575c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f8552c = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a
        /* renamed from: d */
        public AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a mo8576d(long j10) {
            this.f8551b = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a
        /* renamed from: e */
        public AbstractC2135f0.e.d.a.b.AbstractC6168a.AbstractC6169a mo8577e(String str) {
            this.f8553d = str;
            return this;
        }
    }

    public C2145o(long j10, long j11, String str, String str2) {
        this.f8546a = j10;
        this.f8547b = j11;
        this.f8548c = str;
        this.f8549d = str2;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a
    /* renamed from: b */
    public long mo8568b() {
        return this.f8546a;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a
    /* renamed from: c */
    public String mo8569c() {
        return this.f8548c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a
    /* renamed from: d */
    public long mo8570d() {
        return this.f8547b;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6168a
    /* renamed from: e */
    public String mo8571e() {
        return this.f8549d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.a.b.AbstractC6168a)) {
            return false;
        }
        AbstractC2135f0.e.d.a.b.AbstractC6168a abstractC6168a = (AbstractC2135f0.e.d.a.b.AbstractC6168a) obj;
        if (this.f8546a == abstractC6168a.mo8568b() && this.f8547b == abstractC6168a.mo8570d() && this.f8548c.equals(abstractC6168a.mo8569c())) {
            String str = this.f8549d;
            String mo8571e = abstractC6168a.mo8571e();
            if (str == null) {
                if (mo8571e == null) {
                    return true;
                }
            } else if (str.equals(mo8571e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f8546a;
        long j11 = this.f8547b;
        int hashCode = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f8548c.hashCode()) * 1000003;
        String str = this.f8549d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f8546a + ", size=" + this.f8547b + ", name=" + this.f8548c + ", uuid=" + this.f8549d + "}";
    }
}
