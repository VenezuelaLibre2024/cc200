package p093g3;

import java.util.Map;
import java.util.Objects;
import p093g3.AbstractC1971i;

/* renamed from: g3.b */
/* loaded from: classes.dex */
public final class C1964b extends AbstractC1971i {

    /* renamed from: a */
    public final String f7834a;

    /* renamed from: b */
    public final Integer f7835b;

    /* renamed from: c */
    public final C1970h f7836c;

    /* renamed from: d */
    public final long f7837d;

    /* renamed from: e */
    public final long f7838e;

    /* renamed from: f */
    public final Map<String, String> f7839f;

    /* renamed from: g3.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1971i.a {

        /* renamed from: a */
        public String f7840a;

        /* renamed from: b */
        public Integer f7841b;

        /* renamed from: c */
        public C1970h f7842c;

        /* renamed from: d */
        public Long f7843d;

        /* renamed from: e */
        public Long f7844e;

        /* renamed from: f */
        public Map<String, String> f7845f;

        @Override // p093g3.AbstractC1971i.a
        /* renamed from: d */
        public AbstractC1971i mo7945d() {
            String str = "";
            if (this.f7840a == null) {
                str = " transportName";
            }
            if (this.f7842c == null) {
                str = str + " encodedPayload";
            }
            if (this.f7843d == null) {
                str = str + " eventMillis";
            }
            if (this.f7844e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f7845f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C1964b(this.f7840a, this.f7841b, this.f7842c, this.f7843d.longValue(), this.f7844e.longValue(), this.f7845f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p093g3.AbstractC1971i.a
        /* renamed from: e */
        public Map<String, String> mo7946e() {
            Map<String, String> map = this.f7845f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p093g3.AbstractC1971i.a
        /* renamed from: f */
        public AbstractC1971i.a mo7947f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f7845f = map;
            return this;
        }

        @Override // p093g3.AbstractC1971i.a
        /* renamed from: g */
        public AbstractC1971i.a mo7948g(Integer num) {
            this.f7841b = num;
            return this;
        }

        @Override // p093g3.AbstractC1971i.a
        /* renamed from: h */
        public AbstractC1971i.a mo7949h(C1970h c1970h) {
            Objects.requireNonNull(c1970h, "Null encodedPayload");
            this.f7842c = c1970h;
            return this;
        }

        @Override // p093g3.AbstractC1971i.a
        /* renamed from: i */
        public AbstractC1971i.a mo7950i(long j10) {
            this.f7843d = Long.valueOf(j10);
            return this;
        }

        @Override // p093g3.AbstractC1971i.a
        /* renamed from: j */
        public AbstractC1971i.a mo7951j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f7840a = str;
            return this;
        }

        @Override // p093g3.AbstractC1971i.a
        /* renamed from: k */
        public AbstractC1971i.a mo7952k(long j10) {
            this.f7844e = Long.valueOf(j10);
            return this;
        }
    }

    public C1964b(String str, Integer num, C1970h c1970h, long j10, long j11, Map<String, String> map) {
        this.f7834a = str;
        this.f7835b = num;
        this.f7836c = c1970h;
        this.f7837d = j10;
        this.f7838e = j11;
        this.f7839f = map;
    }

    @Override // p093g3.AbstractC1971i
    /* renamed from: c */
    public Map<String, String> mo7939c() {
        return this.f7839f;
    }

    @Override // p093g3.AbstractC1971i
    /* renamed from: d */
    public Integer mo7940d() {
        return this.f7835b;
    }

    @Override // p093g3.AbstractC1971i
    /* renamed from: e */
    public C1970h mo7941e() {
        return this.f7836c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1971i)) {
            return false;
        }
        AbstractC1971i abstractC1971i = (AbstractC1971i) obj;
        return this.f7834a.equals(abstractC1971i.mo7943j()) && ((num = this.f7835b) != null ? num.equals(abstractC1971i.mo7940d()) : abstractC1971i.mo7940d() == null) && this.f7836c.equals(abstractC1971i.mo7941e()) && this.f7837d == abstractC1971i.mo7942f() && this.f7838e == abstractC1971i.mo7944k() && this.f7839f.equals(abstractC1971i.mo7939c());
    }

    @Override // p093g3.AbstractC1971i
    /* renamed from: f */
    public long mo7942f() {
        return this.f7837d;
    }

    public int hashCode() {
        int hashCode = (this.f7834a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f7835b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f7836c.hashCode()) * 1000003;
        long j10 = this.f7837d;
        int i10 = (hashCode2 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f7838e;
        return ((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f7839f.hashCode();
    }

    @Override // p093g3.AbstractC1971i
    /* renamed from: j */
    public String mo7943j() {
        return this.f7834a;
    }

    @Override // p093g3.AbstractC1971i
    /* renamed from: k */
    public long mo7944k() {
        return this.f7838e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f7834a + ", code=" + this.f7835b + ", encodedPayload=" + this.f7836c + ", eventMillis=" + this.f7837d + ", uptimeMillis=" + this.f7838e + ", autoMetadata=" + this.f7839f + "}";
    }
}
