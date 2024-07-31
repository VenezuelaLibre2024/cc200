package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.b */
/* loaded from: classes.dex */
public final class C2126b extends AbstractC2135f0 {

    /* renamed from: b */
    public final String f8373b;

    /* renamed from: c */
    public final String f8374c;

    /* renamed from: d */
    public final int f8375d;

    /* renamed from: e */
    public final String f8376e;

    /* renamed from: f */
    public final String f8377f;

    /* renamed from: g */
    public final String f8378g;

    /* renamed from: h */
    public final String f8379h;

    /* renamed from: i */
    public final String f8380i;

    /* renamed from: j */
    public final AbstractC2135f0.e f8381j;

    /* renamed from: k */
    public final AbstractC2135f0.d f8382k;

    /* renamed from: l */
    public final AbstractC2135f0.a f8383l;

    /* renamed from: g8.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.b {

        /* renamed from: a */
        public String f8384a;

        /* renamed from: b */
        public String f8385b;

        /* renamed from: c */
        public Integer f8386c;

        /* renamed from: d */
        public String f8387d;

        /* renamed from: e */
        public String f8388e;

        /* renamed from: f */
        public String f8389f;

        /* renamed from: g */
        public String f8390g;

        /* renamed from: h */
        public String f8391h;

        /* renamed from: i */
        public AbstractC2135f0.e f8392i;

        /* renamed from: j */
        public AbstractC2135f0.d f8393j;

        /* renamed from: k */
        public AbstractC2135f0.a f8394k;

        public b() {
        }

        public b(AbstractC2135f0 abstractC2135f0) {
            this.f8384a = abstractC2135f0.mo8378l();
            this.f8385b = abstractC2135f0.mo8374h();
            this.f8386c = Integer.valueOf(abstractC2135f0.mo8377k());
            this.f8387d = abstractC2135f0.mo8375i();
            this.f8388e = abstractC2135f0.mo8373g();
            this.f8389f = abstractC2135f0.mo8370d();
            this.f8390g = abstractC2135f0.mo8371e();
            this.f8391h = abstractC2135f0.mo8372f();
            this.f8392i = abstractC2135f0.mo8379m();
            this.f8393j = abstractC2135f0.mo8376j();
            this.f8394k = abstractC2135f0.mo8369c();
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: a */
        public AbstractC2135f0 mo8381a() {
            String str = "";
            if (this.f8384a == null) {
                str = " sdkVersion";
            }
            if (this.f8385b == null) {
                str = str + " gmpAppId";
            }
            if (this.f8386c == null) {
                str = str + " platform";
            }
            if (this.f8387d == null) {
                str = str + " installationUuid";
            }
            if (this.f8390g == null) {
                str = str + " buildVersion";
            }
            if (this.f8391h == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new C2126b(this.f8384a, this.f8385b, this.f8386c.intValue(), this.f8387d, this.f8388e, this.f8389f, this.f8390g, this.f8391h, this.f8392i, this.f8393j, this.f8394k);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: b */
        public AbstractC2135f0.b mo8382b(AbstractC2135f0.a aVar) {
            this.f8394k = aVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: c */
        public AbstractC2135f0.b mo8383c(String str) {
            this.f8389f = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: d */
        public AbstractC2135f0.b mo8384d(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f8390g = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: e */
        public AbstractC2135f0.b mo8385e(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f8391h = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: f */
        public AbstractC2135f0.b mo8386f(String str) {
            this.f8388e = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: g */
        public AbstractC2135f0.b mo8387g(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f8385b = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: h */
        public AbstractC2135f0.b mo8388h(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f8387d = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: i */
        public AbstractC2135f0.b mo8389i(AbstractC2135f0.d dVar) {
            this.f8393j = dVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: j */
        public AbstractC2135f0.b mo8390j(int i10) {
            this.f8386c = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: k */
        public AbstractC2135f0.b mo8391k(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f8384a = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.b
        /* renamed from: l */
        public AbstractC2135f0.b mo8392l(AbstractC2135f0.e eVar) {
            this.f8392i = eVar;
            return this;
        }
    }

    public C2126b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, AbstractC2135f0.e eVar, AbstractC2135f0.d dVar, AbstractC2135f0.a aVar) {
        this.f8373b = str;
        this.f8374c = str2;
        this.f8375d = i10;
        this.f8376e = str3;
        this.f8377f = str4;
        this.f8378g = str5;
        this.f8379h = str6;
        this.f8380i = str7;
        this.f8381j = eVar;
        this.f8382k = dVar;
        this.f8383l = aVar;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: c */
    public AbstractC2135f0.a mo8369c() {
        return this.f8383l;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: d */
    public String mo8370d() {
        return this.f8378g;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: e */
    public String mo8371e() {
        return this.f8379h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        AbstractC2135f0.e eVar;
        AbstractC2135f0.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0)) {
            return false;
        }
        AbstractC2135f0 abstractC2135f0 = (AbstractC2135f0) obj;
        if (this.f8373b.equals(abstractC2135f0.mo8378l()) && this.f8374c.equals(abstractC2135f0.mo8374h()) && this.f8375d == abstractC2135f0.mo8377k() && this.f8376e.equals(abstractC2135f0.mo8375i()) && ((str = this.f8377f) != null ? str.equals(abstractC2135f0.mo8373g()) : abstractC2135f0.mo8373g() == null) && ((str2 = this.f8378g) != null ? str2.equals(abstractC2135f0.mo8370d()) : abstractC2135f0.mo8370d() == null) && this.f8379h.equals(abstractC2135f0.mo8371e()) && this.f8380i.equals(abstractC2135f0.mo8372f()) && ((eVar = this.f8381j) != null ? eVar.equals(abstractC2135f0.mo8379m()) : abstractC2135f0.mo8379m() == null) && ((dVar = this.f8382k) != null ? dVar.equals(abstractC2135f0.mo8376j()) : abstractC2135f0.mo8376j() == null)) {
            AbstractC2135f0.a aVar = this.f8383l;
            AbstractC2135f0.a mo8369c = abstractC2135f0.mo8369c();
            if (aVar == null) {
                if (mo8369c == null) {
                    return true;
                }
            } else if (aVar.equals(mo8369c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: f */
    public String mo8372f() {
        return this.f8380i;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: g */
    public String mo8373g() {
        return this.f8377f;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: h */
    public String mo8374h() {
        return this.f8374c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f8373b.hashCode() ^ 1000003) * 1000003) ^ this.f8374c.hashCode()) * 1000003) ^ this.f8375d) * 1000003) ^ this.f8376e.hashCode()) * 1000003;
        String str = this.f8377f;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f8378g;
        int hashCode3 = (((((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.f8379h.hashCode()) * 1000003) ^ this.f8380i.hashCode()) * 1000003;
        AbstractC2135f0.e eVar = this.f8381j;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        AbstractC2135f0.d dVar = this.f8382k;
        int hashCode5 = (hashCode4 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        AbstractC2135f0.a aVar = this.f8383l;
        return hashCode5 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: i */
    public String mo8375i() {
        return this.f8376e;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: j */
    public AbstractC2135f0.d mo8376j() {
        return this.f8382k;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: k */
    public int mo8377k() {
        return this.f8375d;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: l */
    public String mo8378l() {
        return this.f8373b;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: m */
    public AbstractC2135f0.e mo8379m() {
        return this.f8381j;
    }

    @Override // p098g8.AbstractC2135f0
    /* renamed from: n */
    public AbstractC2135f0.b mo8380n() {
        return new b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f8373b + ", gmpAppId=" + this.f8374c + ", platform=" + this.f8375d + ", installationUuid=" + this.f8376e + ", firebaseInstallationId=" + this.f8377f + ", appQualitySessionId=" + this.f8378g + ", buildVersion=" + this.f8379h + ", displayVersion=" + this.f8380i + ", session=" + this.f8381j + ", ndkPayload=" + this.f8382k + ", appExitInfo=" + this.f8383l + "}";
    }
}
