package p036c9;

import p036c9.AbstractC0993d;

/* renamed from: c9.a */
/* loaded from: classes.dex */
public final class C0990a extends AbstractC0993d {

    /* renamed from: a */
    public final String f3871a;

    /* renamed from: b */
    public final String f3872b;

    /* renamed from: c */
    public final String f3873c;

    /* renamed from: d */
    public final AbstractC0995f f3874d;

    /* renamed from: e */
    public final AbstractC0993d.b f3875e;

    /* renamed from: c9.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0993d.a {

        /* renamed from: a */
        public String f3876a;

        /* renamed from: b */
        public String f3877b;

        /* renamed from: c */
        public String f3878c;

        /* renamed from: d */
        public AbstractC0995f f3879d;

        /* renamed from: e */
        public AbstractC0993d.b f3880e;

        @Override // p036c9.AbstractC0993d.a
        /* renamed from: a */
        public AbstractC0993d mo4149a() {
            return new C0990a(this.f3876a, this.f3877b, this.f3878c, this.f3879d, this.f3880e);
        }

        @Override // p036c9.AbstractC0993d.a
        /* renamed from: b */
        public AbstractC0993d.a mo4150b(AbstractC0995f abstractC0995f) {
            this.f3879d = abstractC0995f;
            return this;
        }

        @Override // p036c9.AbstractC0993d.a
        /* renamed from: c */
        public AbstractC0993d.a mo4151c(String str) {
            this.f3877b = str;
            return this;
        }

        @Override // p036c9.AbstractC0993d.a
        /* renamed from: d */
        public AbstractC0993d.a mo4152d(String str) {
            this.f3878c = str;
            return this;
        }

        @Override // p036c9.AbstractC0993d.a
        /* renamed from: e */
        public AbstractC0993d.a mo4153e(AbstractC0993d.b bVar) {
            this.f3880e = bVar;
            return this;
        }

        @Override // p036c9.AbstractC0993d.a
        /* renamed from: f */
        public AbstractC0993d.a mo4154f(String str) {
            this.f3876a = str;
            return this;
        }
    }

    public C0990a(String str, String str2, String str3, AbstractC0995f abstractC0995f, AbstractC0993d.b bVar) {
        this.f3871a = str;
        this.f3872b = str2;
        this.f3873c = str3;
        this.f3874d = abstractC0995f;
        this.f3875e = bVar;
    }

    public /* synthetic */ C0990a(String str, String str2, String str3, AbstractC0995f abstractC0995f, AbstractC0993d.b bVar, a aVar) {
        this(str, str2, str3, abstractC0995f, bVar);
    }

    @Override // p036c9.AbstractC0993d
    /* renamed from: b */
    public AbstractC0995f mo4144b() {
        return this.f3874d;
    }

    @Override // p036c9.AbstractC0993d
    /* renamed from: c */
    public String mo4145c() {
        return this.f3872b;
    }

    @Override // p036c9.AbstractC0993d
    /* renamed from: d */
    public String mo4146d() {
        return this.f3873c;
    }

    @Override // p036c9.AbstractC0993d
    /* renamed from: e */
    public AbstractC0993d.b mo4147e() {
        return this.f3875e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0993d)) {
            return false;
        }
        AbstractC0993d abstractC0993d = (AbstractC0993d) obj;
        String str = this.f3871a;
        if (str != null ? str.equals(abstractC0993d.mo4148f()) : abstractC0993d.mo4148f() == null) {
            String str2 = this.f3872b;
            if (str2 != null ? str2.equals(abstractC0993d.mo4145c()) : abstractC0993d.mo4145c() == null) {
                String str3 = this.f3873c;
                if (str3 != null ? str3.equals(abstractC0993d.mo4146d()) : abstractC0993d.mo4146d() == null) {
                    AbstractC0995f abstractC0995f = this.f3874d;
                    if (abstractC0995f != null ? abstractC0995f.equals(abstractC0993d.mo4144b()) : abstractC0993d.mo4144b() == null) {
                        AbstractC0993d.b bVar = this.f3875e;
                        AbstractC0993d.b mo4147e = abstractC0993d.mo4147e();
                        if (bVar == null) {
                            if (mo4147e == null) {
                                return true;
                            }
                        } else if (bVar.equals(mo4147e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p036c9.AbstractC0993d
    /* renamed from: f */
    public String mo4148f() {
        return this.f3871a;
    }

    public int hashCode() {
        String str = this.f3871a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f3872b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3873c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC0995f abstractC0995f = this.f3874d;
        int hashCode4 = (hashCode3 ^ (abstractC0995f == null ? 0 : abstractC0995f.hashCode())) * 1000003;
        AbstractC0993d.b bVar = this.f3875e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f3871a + ", fid=" + this.f3872b + ", refreshToken=" + this.f3873c + ", authToken=" + this.f3874d + ", responseCode=" + this.f3875e + "}";
    }
}
