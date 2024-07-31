package p098g8;

import java.util.List;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.c */
/* loaded from: classes.dex */
public final class C2128c extends AbstractC2135f0.a {

    /* renamed from: a */
    public final int f8398a;

    /* renamed from: b */
    public final String f8399b;

    /* renamed from: c */
    public final int f8400c;

    /* renamed from: d */
    public final int f8401d;

    /* renamed from: e */
    public final long f8402e;

    /* renamed from: f */
    public final long f8403f;

    /* renamed from: g */
    public final long f8404g;

    /* renamed from: h */
    public final String f8405h;

    /* renamed from: i */
    public final List<AbstractC2135f0.a.AbstractC6164a> f8406i;

    /* renamed from: g8.c$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.a.b {

        /* renamed from: a */
        public Integer f8407a;

        /* renamed from: b */
        public String f8408b;

        /* renamed from: c */
        public Integer f8409c;

        /* renamed from: d */
        public Integer f8410d;

        /* renamed from: e */
        public Long f8411e;

        /* renamed from: f */
        public Long f8412f;

        /* renamed from: g */
        public Long f8413g;

        /* renamed from: h */
        public String f8414h;

        /* renamed from: i */
        public List<AbstractC2135f0.a.AbstractC6164a> f8415i;

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: a */
        public AbstractC2135f0.a mo8405a() {
            String str = "";
            if (this.f8407a == null) {
                str = " pid";
            }
            if (this.f8408b == null) {
                str = str + " processName";
            }
            if (this.f8409c == null) {
                str = str + " reasonCode";
            }
            if (this.f8410d == null) {
                str = str + " importance";
            }
            if (this.f8411e == null) {
                str = str + " pss";
            }
            if (this.f8412f == null) {
                str = str + " rss";
            }
            if (this.f8413g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new C2128c(this.f8407a.intValue(), this.f8408b, this.f8409c.intValue(), this.f8410d.intValue(), this.f8411e.longValue(), this.f8412f.longValue(), this.f8413g.longValue(), this.f8414h, this.f8415i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: b */
        public AbstractC2135f0.a.b mo8406b(List<AbstractC2135f0.a.AbstractC6164a> list) {
            this.f8415i = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: c */
        public AbstractC2135f0.a.b mo8407c(int i10) {
            this.f8410d = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: d */
        public AbstractC2135f0.a.b mo8408d(int i10) {
            this.f8407a = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: e */
        public AbstractC2135f0.a.b mo8409e(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f8408b = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: f */
        public AbstractC2135f0.a.b mo8410f(long j10) {
            this.f8411e = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: g */
        public AbstractC2135f0.a.b mo8411g(int i10) {
            this.f8409c = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: h */
        public AbstractC2135f0.a.b mo8412h(long j10) {
            this.f8412f = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: i */
        public AbstractC2135f0.a.b mo8413i(long j10) {
            this.f8413g = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.a.b
        /* renamed from: j */
        public AbstractC2135f0.a.b mo8414j(String str) {
            this.f8414h = str;
            return this;
        }
    }

    public C2128c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2, List<AbstractC2135f0.a.AbstractC6164a> list) {
        this.f8398a = i10;
        this.f8399b = str;
        this.f8400c = i11;
        this.f8401d = i12;
        this.f8402e = j10;
        this.f8403f = j11;
        this.f8404g = j12;
        this.f8405h = str2;
        this.f8406i = list;
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: b */
    public List<AbstractC2135f0.a.AbstractC6164a> mo8396b() {
        return this.f8406i;
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: c */
    public int mo8397c() {
        return this.f8401d;
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: d */
    public int mo8398d() {
        return this.f8398a;
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: e */
    public String mo8399e() {
        return this.f8399b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.a)) {
            return false;
        }
        AbstractC2135f0.a aVar = (AbstractC2135f0.a) obj;
        if (this.f8398a == aVar.mo8398d() && this.f8399b.equals(aVar.mo8399e()) && this.f8400c == aVar.mo8401g() && this.f8401d == aVar.mo8397c() && this.f8402e == aVar.mo8400f() && this.f8403f == aVar.mo8402h() && this.f8404g == aVar.mo8403i() && ((str = this.f8405h) != null ? str.equals(aVar.mo8404j()) : aVar.mo8404j() == null)) {
            List<AbstractC2135f0.a.AbstractC6164a> list = this.f8406i;
            List<AbstractC2135f0.a.AbstractC6164a> mo8396b = aVar.mo8396b();
            if (list == null) {
                if (mo8396b == null) {
                    return true;
                }
            } else if (list.equals(mo8396b)) {
                return true;
            }
        }
        return false;
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: f */
    public long mo8400f() {
        return this.f8402e;
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: g */
    public int mo8401g() {
        return this.f8400c;
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: h */
    public long mo8402h() {
        return this.f8403f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f8398a ^ 1000003) * 1000003) ^ this.f8399b.hashCode()) * 1000003) ^ this.f8400c) * 1000003) ^ this.f8401d) * 1000003;
        long j10 = this.f8402e;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f8403f;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        long j12 = this.f8404g;
        int i12 = (i11 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f8405h;
        int hashCode2 = (i12 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<AbstractC2135f0.a.AbstractC6164a> list = this.f8406i;
        return hashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: i */
    public long mo8403i() {
        return this.f8404g;
    }

    @Override // p098g8.AbstractC2135f0.a
    /* renamed from: j */
    public String mo8404j() {
        return this.f8405h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f8398a + ", processName=" + this.f8399b + ", reasonCode=" + this.f8400c + ", importance=" + this.f8401d + ", pss=" + this.f8402e + ", rss=" + this.f8403f + ", timestamp=" + this.f8404g + ", traceFile=" + this.f8405h + ", buildIdMappingForArch=" + this.f8406i + "}";
    }
}
