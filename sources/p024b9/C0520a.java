package p024b9;

import java.util.Objects;
import p024b9.AbstractC0523d;
import p024b9.C0522c;

/* renamed from: b9.a */
/* loaded from: classes.dex */
public final class C0520a extends AbstractC0523d {

    /* renamed from: b */
    public final String f2321b;

    /* renamed from: c */
    public final C0522c.a f2322c;

    /* renamed from: d */
    public final String f2323d;

    /* renamed from: e */
    public final String f2324e;

    /* renamed from: f */
    public final long f2325f;

    /* renamed from: g */
    public final long f2326g;

    /* renamed from: h */
    public final String f2327h;

    /* renamed from: b9.a$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0523d.a {

        /* renamed from: a */
        public String f2328a;

        /* renamed from: b */
        public C0522c.a f2329b;

        /* renamed from: c */
        public String f2330c;

        /* renamed from: d */
        public String f2331d;

        /* renamed from: e */
        public Long f2332e;

        /* renamed from: f */
        public Long f2333f;

        /* renamed from: g */
        public String f2334g;

        public b() {
        }

        public b(AbstractC0523d abstractC0523d) {
            this.f2328a = abstractC0523d.mo2505d();
            this.f2329b = abstractC0523d.mo2508g();
            this.f2330c = abstractC0523d.mo2503b();
            this.f2331d = abstractC0523d.mo2507f();
            this.f2332e = Long.valueOf(abstractC0523d.mo2504c());
            this.f2333f = Long.valueOf(abstractC0523d.mo2509h());
            this.f2334g = abstractC0523d.mo2506e();
        }

        public /* synthetic */ b(AbstractC0523d abstractC0523d, a aVar) {
            this(abstractC0523d);
        }

        @Override // p024b9.AbstractC0523d.a
        /* renamed from: a */
        public AbstractC0523d mo2511a() {
            String str = "";
            if (this.f2329b == null) {
                str = " registrationStatus";
            }
            if (this.f2332e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f2333f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C0520a(this.f2328a, this.f2329b, this.f2330c, this.f2331d, this.f2332e.longValue(), this.f2333f.longValue(), this.f2334g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p024b9.AbstractC0523d.a
        /* renamed from: b */
        public AbstractC0523d.a mo2512b(String str) {
            this.f2330c = str;
            return this;
        }

        @Override // p024b9.AbstractC0523d.a
        /* renamed from: c */
        public AbstractC0523d.a mo2513c(long j10) {
            this.f2332e = Long.valueOf(j10);
            return this;
        }

        @Override // p024b9.AbstractC0523d.a
        /* renamed from: d */
        public AbstractC0523d.a mo2514d(String str) {
            this.f2328a = str;
            return this;
        }

        @Override // p024b9.AbstractC0523d.a
        /* renamed from: e */
        public AbstractC0523d.a mo2515e(String str) {
            this.f2334g = str;
            return this;
        }

        @Override // p024b9.AbstractC0523d.a
        /* renamed from: f */
        public AbstractC0523d.a mo2516f(String str) {
            this.f2331d = str;
            return this;
        }

        @Override // p024b9.AbstractC0523d.a
        /* renamed from: g */
        public AbstractC0523d.a mo2517g(C0522c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f2329b = aVar;
            return this;
        }

        @Override // p024b9.AbstractC0523d.a
        /* renamed from: h */
        public AbstractC0523d.a mo2518h(long j10) {
            this.f2333f = Long.valueOf(j10);
            return this;
        }
    }

    public C0520a(String str, C0522c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f2321b = str;
        this.f2322c = aVar;
        this.f2323d = str2;
        this.f2324e = str3;
        this.f2325f = j10;
        this.f2326g = j11;
        this.f2327h = str4;
    }

    public /* synthetic */ C0520a(String str, C0522c.a aVar, String str2, String str3, long j10, long j11, String str4, a aVar2) {
        this(str, aVar, str2, str3, j10, j11, str4);
    }

    @Override // p024b9.AbstractC0523d
    /* renamed from: b */
    public String mo2503b() {
        return this.f2323d;
    }

    @Override // p024b9.AbstractC0523d
    /* renamed from: c */
    public long mo2504c() {
        return this.f2325f;
    }

    @Override // p024b9.AbstractC0523d
    /* renamed from: d */
    public String mo2505d() {
        return this.f2321b;
    }

    @Override // p024b9.AbstractC0523d
    /* renamed from: e */
    public String mo2506e() {
        return this.f2327h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0523d)) {
            return false;
        }
        AbstractC0523d abstractC0523d = (AbstractC0523d) obj;
        String str3 = this.f2321b;
        if (str3 != null ? str3.equals(abstractC0523d.mo2505d()) : abstractC0523d.mo2505d() == null) {
            if (this.f2322c.equals(abstractC0523d.mo2508g()) && ((str = this.f2323d) != null ? str.equals(abstractC0523d.mo2503b()) : abstractC0523d.mo2503b() == null) && ((str2 = this.f2324e) != null ? str2.equals(abstractC0523d.mo2507f()) : abstractC0523d.mo2507f() == null) && this.f2325f == abstractC0523d.mo2504c() && this.f2326g == abstractC0523d.mo2509h()) {
                String str4 = this.f2327h;
                String mo2506e = abstractC0523d.mo2506e();
                if (str4 == null) {
                    if (mo2506e == null) {
                        return true;
                    }
                } else if (str4.equals(mo2506e)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p024b9.AbstractC0523d
    /* renamed from: f */
    public String mo2507f() {
        return this.f2324e;
    }

    @Override // p024b9.AbstractC0523d
    /* renamed from: g */
    public C0522c.a mo2508g() {
        return this.f2322c;
    }

    @Override // p024b9.AbstractC0523d
    /* renamed from: h */
    public long mo2509h() {
        return this.f2326g;
    }

    public int hashCode() {
        String str = this.f2321b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f2322c.hashCode()) * 1000003;
        String str2 = this.f2323d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f2324e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j10 = this.f2325f;
        int i10 = (hashCode3 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f2326g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f2327h;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p024b9.AbstractC0523d
    /* renamed from: n */
    public AbstractC0523d.a mo2510n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f2321b + ", registrationStatus=" + this.f2322c + ", authToken=" + this.f2323d + ", refreshToken=" + this.f2324e + ", expiresInSecs=" + this.f2325f + ", tokenCreationEpochInSecs=" + this.f2326g + ", fisError=" + this.f2327h + "}";
    }
}
