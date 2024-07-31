package p076f3;

import java.util.Arrays;
import p076f3.AbstractC1815l;

/* renamed from: f3.f */
/* loaded from: classes.dex */
public final class C1809f extends AbstractC1815l {

    /* renamed from: a */
    public final long f6693a;

    /* renamed from: b */
    public final Integer f6694b;

    /* renamed from: c */
    public final long f6695c;

    /* renamed from: d */
    public final byte[] f6696d;

    /* renamed from: e */
    public final String f6697e;

    /* renamed from: f */
    public final long f6698f;

    /* renamed from: g */
    public final AbstractC1818o f6699g;

    /* renamed from: f3.f$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1815l.a {

        /* renamed from: a */
        public Long f6700a;

        /* renamed from: b */
        public Integer f6701b;

        /* renamed from: c */
        public Long f6702c;

        /* renamed from: d */
        public byte[] f6703d;

        /* renamed from: e */
        public String f6704e;

        /* renamed from: f */
        public Long f6705f;

        /* renamed from: g */
        public AbstractC1818o f6706g;

        @Override // p076f3.AbstractC1815l.a
        /* renamed from: a */
        public AbstractC1815l mo7344a() {
            String str = "";
            if (this.f6700a == null) {
                str = " eventTimeMs";
            }
            if (this.f6702c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f6705f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C1809f(this.f6700a.longValue(), this.f6701b, this.f6702c.longValue(), this.f6703d, this.f6704e, this.f6705f.longValue(), this.f6706g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p076f3.AbstractC1815l.a
        /* renamed from: b */
        public AbstractC1815l.a mo7345b(Integer num) {
            this.f6701b = num;
            return this;
        }

        @Override // p076f3.AbstractC1815l.a
        /* renamed from: c */
        public AbstractC1815l.a mo7346c(long j10) {
            this.f6700a = Long.valueOf(j10);
            return this;
        }

        @Override // p076f3.AbstractC1815l.a
        /* renamed from: d */
        public AbstractC1815l.a mo7347d(long j10) {
            this.f6702c = Long.valueOf(j10);
            return this;
        }

        @Override // p076f3.AbstractC1815l.a
        /* renamed from: e */
        public AbstractC1815l.a mo7348e(AbstractC1818o abstractC1818o) {
            this.f6706g = abstractC1818o;
            return this;
        }

        @Override // p076f3.AbstractC1815l.a
        /* renamed from: f */
        public AbstractC1815l.a mo7349f(byte[] bArr) {
            this.f6703d = bArr;
            return this;
        }

        @Override // p076f3.AbstractC1815l.a
        /* renamed from: g */
        public AbstractC1815l.a mo7350g(String str) {
            this.f6704e = str;
            return this;
        }

        @Override // p076f3.AbstractC1815l.a
        /* renamed from: h */
        public AbstractC1815l.a mo7351h(long j10) {
            this.f6705f = Long.valueOf(j10);
            return this;
        }
    }

    public C1809f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC1818o abstractC1818o) {
        this.f6693a = j10;
        this.f6694b = num;
        this.f6695c = j11;
        this.f6696d = bArr;
        this.f6697e = str;
        this.f6698f = j12;
        this.f6699g = abstractC1818o;
    }

    public /* synthetic */ C1809f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, AbstractC1818o abstractC1818o, a aVar) {
        this(j10, num, j11, bArr, str, j12, abstractC1818o);
    }

    @Override // p076f3.AbstractC1815l
    /* renamed from: b */
    public Integer mo7337b() {
        return this.f6694b;
    }

    @Override // p076f3.AbstractC1815l
    /* renamed from: c */
    public long mo7338c() {
        return this.f6693a;
    }

    @Override // p076f3.AbstractC1815l
    /* renamed from: d */
    public long mo7339d() {
        return this.f6695c;
    }

    @Override // p076f3.AbstractC1815l
    /* renamed from: e */
    public AbstractC1818o mo7340e() {
        return this.f6699g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1815l)) {
            return false;
        }
        AbstractC1815l abstractC1815l = (AbstractC1815l) obj;
        if (this.f6693a == abstractC1815l.mo7338c() && ((num = this.f6694b) != null ? num.equals(abstractC1815l.mo7337b()) : abstractC1815l.mo7337b() == null) && this.f6695c == abstractC1815l.mo7339d()) {
            if (Arrays.equals(this.f6696d, abstractC1815l instanceof C1809f ? ((C1809f) abstractC1815l).f6696d : abstractC1815l.mo7341f()) && ((str = this.f6697e) != null ? str.equals(abstractC1815l.mo7342g()) : abstractC1815l.mo7342g() == null) && this.f6698f == abstractC1815l.mo7343h()) {
                AbstractC1818o abstractC1818o = this.f6699g;
                AbstractC1818o mo7340e = abstractC1815l.mo7340e();
                if (abstractC1818o == null) {
                    if (mo7340e == null) {
                        return true;
                    }
                } else if (abstractC1818o.equals(mo7340e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p076f3.AbstractC1815l
    /* renamed from: f */
    public byte[] mo7341f() {
        return this.f6696d;
    }

    @Override // p076f3.AbstractC1815l
    /* renamed from: g */
    public String mo7342g() {
        return this.f6697e;
    }

    @Override // p076f3.AbstractC1815l
    /* renamed from: h */
    public long mo7343h() {
        return this.f6698f;
    }

    public int hashCode() {
        long j10 = this.f6693a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f6694b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f6695c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f6696d)) * 1000003;
        String str = this.f6697e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f6698f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        AbstractC1818o abstractC1818o = this.f6699g;
        return i11 ^ (abstractC1818o != null ? abstractC1818o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f6693a + ", eventCode=" + this.f6694b + ", eventUptimeMs=" + this.f6695c + ", sourceExtension=" + Arrays.toString(this.f6696d) + ", sourceExtensionJsonProto3=" + this.f6697e + ", timezoneOffsetSeconds=" + this.f6698f + ", networkConnectionInfo=" + this.f6699g + "}";
    }
}
