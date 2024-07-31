package p076f3;

import java.util.List;
import p076f3.AbstractC1816m;

/* renamed from: f3.g */
/* loaded from: classes.dex */
public final class C1810g extends AbstractC1816m {

    /* renamed from: a */
    public final long f6707a;

    /* renamed from: b */
    public final long f6708b;

    /* renamed from: c */
    public final AbstractC1814k f6709c;

    /* renamed from: d */
    public final Integer f6710d;

    /* renamed from: e */
    public final String f6711e;

    /* renamed from: f */
    public final List<AbstractC1815l> f6712f;

    /* renamed from: g */
    public final EnumC1819p f6713g;

    /* renamed from: f3.g$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1816m.a {

        /* renamed from: a */
        public Long f6714a;

        /* renamed from: b */
        public Long f6715b;

        /* renamed from: c */
        public AbstractC1814k f6716c;

        /* renamed from: d */
        public Integer f6717d;

        /* renamed from: e */
        public String f6718e;

        /* renamed from: f */
        public List<AbstractC1815l> f6719f;

        /* renamed from: g */
        public EnumC1819p f6720g;

        @Override // p076f3.AbstractC1816m.a
        /* renamed from: a */
        public AbstractC1816m mo7359a() {
            String str = "";
            if (this.f6714a == null) {
                str = " requestTimeMs";
            }
            if (this.f6715b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C1810g(this.f6714a.longValue(), this.f6715b.longValue(), this.f6716c, this.f6717d, this.f6718e, this.f6719f, this.f6720g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p076f3.AbstractC1816m.a
        /* renamed from: b */
        public AbstractC1816m.a mo7360b(AbstractC1814k abstractC1814k) {
            this.f6716c = abstractC1814k;
            return this;
        }

        @Override // p076f3.AbstractC1816m.a
        /* renamed from: c */
        public AbstractC1816m.a mo7361c(List<AbstractC1815l> list) {
            this.f6719f = list;
            return this;
        }

        @Override // p076f3.AbstractC1816m.a
        /* renamed from: d */
        public AbstractC1816m.a mo7362d(Integer num) {
            this.f6717d = num;
            return this;
        }

        @Override // p076f3.AbstractC1816m.a
        /* renamed from: e */
        public AbstractC1816m.a mo7363e(String str) {
            this.f6718e = str;
            return this;
        }

        @Override // p076f3.AbstractC1816m.a
        /* renamed from: f */
        public AbstractC1816m.a mo7364f(EnumC1819p enumC1819p) {
            this.f6720g = enumC1819p;
            return this;
        }

        @Override // p076f3.AbstractC1816m.a
        /* renamed from: g */
        public AbstractC1816m.a mo7365g(long j10) {
            this.f6714a = Long.valueOf(j10);
            return this;
        }

        @Override // p076f3.AbstractC1816m.a
        /* renamed from: h */
        public AbstractC1816m.a mo7366h(long j10) {
            this.f6715b = Long.valueOf(j10);
            return this;
        }
    }

    public C1810g(long j10, long j11, AbstractC1814k abstractC1814k, Integer num, String str, List<AbstractC1815l> list, EnumC1819p enumC1819p) {
        this.f6707a = j10;
        this.f6708b = j11;
        this.f6709c = abstractC1814k;
        this.f6710d = num;
        this.f6711e = str;
        this.f6712f = list;
        this.f6713g = enumC1819p;
    }

    @Override // p076f3.AbstractC1816m
    /* renamed from: b */
    public AbstractC1814k mo7352b() {
        return this.f6709c;
    }

    @Override // p076f3.AbstractC1816m
    /* renamed from: c */
    public List<AbstractC1815l> mo7353c() {
        return this.f6712f;
    }

    @Override // p076f3.AbstractC1816m
    /* renamed from: d */
    public Integer mo7354d() {
        return this.f6710d;
    }

    @Override // p076f3.AbstractC1816m
    /* renamed from: e */
    public String mo7355e() {
        return this.f6711e;
    }

    public boolean equals(Object obj) {
        AbstractC1814k abstractC1814k;
        Integer num;
        String str;
        List<AbstractC1815l> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1816m)) {
            return false;
        }
        AbstractC1816m abstractC1816m = (AbstractC1816m) obj;
        if (this.f6707a == abstractC1816m.mo7357g() && this.f6708b == abstractC1816m.mo7358h() && ((abstractC1814k = this.f6709c) != null ? abstractC1814k.equals(abstractC1816m.mo7352b()) : abstractC1816m.mo7352b() == null) && ((num = this.f6710d) != null ? num.equals(abstractC1816m.mo7354d()) : abstractC1816m.mo7354d() == null) && ((str = this.f6711e) != null ? str.equals(abstractC1816m.mo7355e()) : abstractC1816m.mo7355e() == null) && ((list = this.f6712f) != null ? list.equals(abstractC1816m.mo7353c()) : abstractC1816m.mo7353c() == null)) {
            EnumC1819p enumC1819p = this.f6713g;
            EnumC1819p mo7356f = abstractC1816m.mo7356f();
            if (enumC1819p == null) {
                if (mo7356f == null) {
                    return true;
                }
            } else if (enumC1819p.equals(mo7356f)) {
                return true;
            }
        }
        return false;
    }

    @Override // p076f3.AbstractC1816m
    /* renamed from: f */
    public EnumC1819p mo7356f() {
        return this.f6713g;
    }

    @Override // p076f3.AbstractC1816m
    /* renamed from: g */
    public long mo7357g() {
        return this.f6707a;
    }

    @Override // p076f3.AbstractC1816m
    /* renamed from: h */
    public long mo7358h() {
        return this.f6708b;
    }

    public int hashCode() {
        long j10 = this.f6707a;
        long j11 = this.f6708b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        AbstractC1814k abstractC1814k = this.f6709c;
        int hashCode = (i10 ^ (abstractC1814k == null ? 0 : abstractC1814k.hashCode())) * 1000003;
        Integer num = this.f6710d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f6711e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC1815l> list = this.f6712f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC1819p enumC1819p = this.f6713g;
        return hashCode4 ^ (enumC1819p != null ? enumC1819p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f6707a + ", requestUptimeMs=" + this.f6708b + ", clientInfo=" + this.f6709c + ", logSource=" + this.f6710d + ", logSourceName=" + this.f6711e + ", logEvents=" + this.f6712f + ", qosTier=" + this.f6713g + "}";
    }
}
