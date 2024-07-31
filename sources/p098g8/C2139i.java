package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.i */
/* loaded from: classes.dex */
public final class C2139i extends AbstractC2135f0.e.a {

    /* renamed from: a */
    public final String f8477a;

    /* renamed from: b */
    public final String f8478b;

    /* renamed from: c */
    public final String f8479c;

    /* renamed from: d */
    public final AbstractC2135f0.e.a.b f8480d;

    /* renamed from: e */
    public final String f8481e;

    /* renamed from: f */
    public final String f8482f;

    /* renamed from: g */
    public final String f8483g;

    /* renamed from: g8.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.a.AbstractC6166a {

        /* renamed from: a */
        public String f8484a;

        /* renamed from: b */
        public String f8485b;

        /* renamed from: c */
        public String f8486c;

        /* renamed from: d */
        public AbstractC2135f0.e.a.b f8487d;

        /* renamed from: e */
        public String f8488e;

        /* renamed from: f */
        public String f8489f;

        /* renamed from: g */
        public String f8490g;

        @Override // p098g8.AbstractC2135f0.e.a.AbstractC6166a
        /* renamed from: a */
        public AbstractC2135f0.e.a mo8494a() {
            String str = "";
            if (this.f8484a == null) {
                str = " identifier";
            }
            if (this.f8485b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new C2139i(this.f8484a, this.f8485b, this.f8486c, this.f8487d, this.f8488e, this.f8489f, this.f8490g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.a.AbstractC6166a
        /* renamed from: b */
        public AbstractC2135f0.e.a.AbstractC6166a mo8495b(String str) {
            this.f8489f = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.a.AbstractC6166a
        /* renamed from: c */
        public AbstractC2135f0.e.a.AbstractC6166a mo8496c(String str) {
            this.f8490g = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.a.AbstractC6166a
        /* renamed from: d */
        public AbstractC2135f0.e.a.AbstractC6166a mo8497d(String str) {
            this.f8486c = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.a.AbstractC6166a
        /* renamed from: e */
        public AbstractC2135f0.e.a.AbstractC6166a mo8498e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f8484a = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.a.AbstractC6166a
        /* renamed from: f */
        public AbstractC2135f0.e.a.AbstractC6166a mo8499f(String str) {
            this.f8488e = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.a.AbstractC6166a
        /* renamed from: g */
        public AbstractC2135f0.e.a.AbstractC6166a mo8500g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f8485b = str;
            return this;
        }
    }

    public C2139i(String str, String str2, String str3, AbstractC2135f0.e.a.b bVar, String str4, String str5, String str6) {
        this.f8477a = str;
        this.f8478b = str2;
        this.f8479c = str3;
        this.f8480d = bVar;
        this.f8481e = str4;
        this.f8482f = str5;
        this.f8483g = str6;
    }

    @Override // p098g8.AbstractC2135f0.e.a
    /* renamed from: b */
    public String mo8487b() {
        return this.f8482f;
    }

    @Override // p098g8.AbstractC2135f0.e.a
    /* renamed from: c */
    public String mo8488c() {
        return this.f8483g;
    }

    @Override // p098g8.AbstractC2135f0.e.a
    /* renamed from: d */
    public String mo8489d() {
        return this.f8479c;
    }

    @Override // p098g8.AbstractC2135f0.e.a
    /* renamed from: e */
    public String mo8490e() {
        return this.f8477a;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC2135f0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.a)) {
            return false;
        }
        AbstractC2135f0.e.a aVar = (AbstractC2135f0.e.a) obj;
        if (this.f8477a.equals(aVar.mo8490e()) && this.f8478b.equals(aVar.mo8493h()) && ((str = this.f8479c) != null ? str.equals(aVar.mo8489d()) : aVar.mo8489d() == null) && ((bVar = this.f8480d) != null ? bVar.equals(aVar.mo8492g()) : aVar.mo8492g() == null) && ((str2 = this.f8481e) != null ? str2.equals(aVar.mo8491f()) : aVar.mo8491f() == null) && ((str3 = this.f8482f) != null ? str3.equals(aVar.mo8487b()) : aVar.mo8487b() == null)) {
            String str4 = this.f8483g;
            String mo8488c = aVar.mo8488c();
            if (str4 == null) {
                if (mo8488c == null) {
                    return true;
                }
            } else if (str4.equals(mo8488c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p098g8.AbstractC2135f0.e.a
    /* renamed from: f */
    public String mo8491f() {
        return this.f8481e;
    }

    @Override // p098g8.AbstractC2135f0.e.a
    /* renamed from: g */
    public AbstractC2135f0.e.a.b mo8492g() {
        return this.f8480d;
    }

    @Override // p098g8.AbstractC2135f0.e.a
    /* renamed from: h */
    public String mo8493h() {
        return this.f8478b;
    }

    public int hashCode() {
        int hashCode = (((this.f8477a.hashCode() ^ 1000003) * 1000003) ^ this.f8478b.hashCode()) * 1000003;
        String str = this.f8479c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        AbstractC2135f0.e.a.b bVar = this.f8480d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f8481e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f8482f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f8483g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f8477a + ", version=" + this.f8478b + ", displayVersion=" + this.f8479c + ", organization=" + this.f8480d + ", installationUuid=" + this.f8481e + ", developmentPlatform=" + this.f8482f + ", developmentPlatformVersion=" + this.f8483g + "}";
    }
}
