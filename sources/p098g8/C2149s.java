package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.s */
/* loaded from: classes.dex */
public final class C2149s extends AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b {

    /* renamed from: a */
    public final long f8576a;

    /* renamed from: b */
    public final String f8577b;

    /* renamed from: c */
    public final String f8578c;

    /* renamed from: d */
    public final long f8579d;

    /* renamed from: e */
    public final int f8580e;

    /* renamed from: g8.s$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a {

        /* renamed from: a */
        public Long f8581a;

        /* renamed from: b */
        public String f8582b;

        /* renamed from: c */
        public String f8583c;

        /* renamed from: d */
        public Long f8584d;

        /* renamed from: e */
        public Integer f8585e;

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a
        /* renamed from: a */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b mo8619a() {
            String str = "";
            if (this.f8581a == null) {
                str = " pc";
            }
            if (this.f8582b == null) {
                str = str + " symbol";
            }
            if (this.f8584d == null) {
                str = str + " offset";
            }
            if (this.f8585e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new C2149s(this.f8581a.longValue(), this.f8582b, this.f8583c, this.f8584d.longValue(), this.f8585e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a
        /* renamed from: b */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a mo8620b(String str) {
            this.f8583c = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a
        /* renamed from: c */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a mo8621c(int i10) {
            this.f8585e = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a
        /* renamed from: d */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a mo8622d(long j10) {
            this.f8584d = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a
        /* renamed from: e */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a mo8623e(long j10) {
            this.f8581a = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a
        /* renamed from: f */
        public AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b.AbstractC6177a mo8624f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f8582b = str;
            return this;
        }
    }

    public C2149s(long j10, String str, String str2, long j11, int i10) {
        this.f8576a = j10;
        this.f8577b = str;
        this.f8578c = str2;
        this.f8579d = j11;
        this.f8580e = i10;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b
    /* renamed from: b */
    public String mo8614b() {
        return this.f8578c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b
    /* renamed from: c */
    public int mo8615c() {
        return this.f8580e;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b
    /* renamed from: d */
    public long mo8616d() {
        return this.f8579d;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b
    /* renamed from: e */
    public long mo8617e() {
        return this.f8576a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b)) {
            return false;
        }
        AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b abstractC6176b = (AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b) obj;
        return this.f8576a == abstractC6176b.mo8617e() && this.f8577b.equals(abstractC6176b.mo8618f()) && ((str = this.f8578c) != null ? str.equals(abstractC6176b.mo8614b()) : abstractC6176b.mo8614b() == null) && this.f8579d == abstractC6176b.mo8616d() && this.f8580e == abstractC6176b.mo8615c();
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6174e.AbstractC6176b
    /* renamed from: f */
    public String mo8618f() {
        return this.f8577b;
    }

    public int hashCode() {
        long j10 = this.f8576a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8577b.hashCode()) * 1000003;
        String str = this.f8578c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f8579d;
        return ((hashCode2 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f8580e;
    }

    public String toString() {
        return "Frame{pc=" + this.f8576a + ", symbol=" + this.f8577b + ", file=" + this.f8578c + ", offset=" + this.f8579d + ", importance=" + this.f8580e + "}";
    }
}
