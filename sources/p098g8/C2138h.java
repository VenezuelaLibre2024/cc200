package p098g8;

import java.util.List;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.h */
/* loaded from: classes.dex */
public final class C2138h extends AbstractC2135f0.e {

    /* renamed from: a */
    public final String f8453a;

    /* renamed from: b */
    public final String f8454b;

    /* renamed from: c */
    public final String f8455c;

    /* renamed from: d */
    public final long f8456d;

    /* renamed from: e */
    public final Long f8457e;

    /* renamed from: f */
    public final boolean f8458f;

    /* renamed from: g */
    public final AbstractC2135f0.e.a f8459g;

    /* renamed from: h */
    public final AbstractC2135f0.e.f f8460h;

    /* renamed from: i */
    public final AbstractC2135f0.e.AbstractC6181e f8461i;

    /* renamed from: j */
    public final AbstractC2135f0.e.c f8462j;

    /* renamed from: k */
    public final List<AbstractC2135f0.e.d> f8463k;

    /* renamed from: l */
    public final int f8464l;

    /* renamed from: g8.h$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.b {

        /* renamed from: a */
        public String f8465a;

        /* renamed from: b */
        public String f8466b;

        /* renamed from: c */
        public String f8467c;

        /* renamed from: d */
        public Long f8468d;

        /* renamed from: e */
        public Long f8469e;

        /* renamed from: f */
        public Boolean f8470f;

        /* renamed from: g */
        public AbstractC2135f0.e.a f8471g;

        /* renamed from: h */
        public AbstractC2135f0.e.f f8472h;

        /* renamed from: i */
        public AbstractC2135f0.e.AbstractC6181e f8473i;

        /* renamed from: j */
        public AbstractC2135f0.e.c f8474j;

        /* renamed from: k */
        public List<AbstractC2135f0.e.d> f8475k;

        /* renamed from: l */
        public Integer f8476l;

        public b() {
        }

        public b(AbstractC2135f0.e eVar) {
            this.f8465a = eVar.mo8474g();
            this.f8466b = eVar.mo8476i();
            this.f8467c = eVar.mo8470c();
            this.f8468d = Long.valueOf(eVar.mo8479l());
            this.f8469e = eVar.mo8472e();
            this.f8470f = Boolean.valueOf(eVar.mo8481n());
            this.f8471g = eVar.mo8469b();
            this.f8472h = eVar.mo8480m();
            this.f8473i = eVar.mo8478k();
            this.f8474j = eVar.mo8471d();
            this.f8475k = eVar.mo8473f();
            this.f8476l = Integer.valueOf(eVar.mo8475h());
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: a */
        public AbstractC2135f0.e mo8502a() {
            String str = "";
            if (this.f8465a == null) {
                str = " generator";
            }
            if (this.f8466b == null) {
                str = str + " identifier";
            }
            if (this.f8468d == null) {
                str = str + " startedAt";
            }
            if (this.f8470f == null) {
                str = str + " crashed";
            }
            if (this.f8471g == null) {
                str = str + " app";
            }
            if (this.f8476l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new C2138h(this.f8465a, this.f8466b, this.f8467c, this.f8468d.longValue(), this.f8469e, this.f8470f.booleanValue(), this.f8471g, this.f8472h, this.f8473i, this.f8474j, this.f8475k, this.f8476l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: b */
        public AbstractC2135f0.e.b mo8503b(AbstractC2135f0.e.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f8471g = aVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: c */
        public AbstractC2135f0.e.b mo8504c(String str) {
            this.f8467c = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: d */
        public AbstractC2135f0.e.b mo8505d(boolean z10) {
            this.f8470f = Boolean.valueOf(z10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: e */
        public AbstractC2135f0.e.b mo8506e(AbstractC2135f0.e.c cVar) {
            this.f8474j = cVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: f */
        public AbstractC2135f0.e.b mo8507f(Long l10) {
            this.f8469e = l10;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: g */
        public AbstractC2135f0.e.b mo8508g(List<AbstractC2135f0.e.d> list) {
            this.f8475k = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: h */
        public AbstractC2135f0.e.b mo8509h(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f8465a = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: i */
        public AbstractC2135f0.e.b mo8510i(int i10) {
            this.f8476l = Integer.valueOf(i10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: j */
        public AbstractC2135f0.e.b mo8511j(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f8466b = str;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: l */
        public AbstractC2135f0.e.b mo8513l(AbstractC2135f0.e.AbstractC6181e abstractC6181e) {
            this.f8473i = abstractC6181e;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: m */
        public AbstractC2135f0.e.b mo8514m(long j10) {
            this.f8468d = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.b
        /* renamed from: n */
        public AbstractC2135f0.e.b mo8515n(AbstractC2135f0.e.f fVar) {
            this.f8472h = fVar;
            return this;
        }
    }

    public C2138h(String str, String str2, String str3, long j10, Long l10, boolean z10, AbstractC2135f0.e.a aVar, AbstractC2135f0.e.f fVar, AbstractC2135f0.e.AbstractC6181e abstractC6181e, AbstractC2135f0.e.c cVar, List<AbstractC2135f0.e.d> list, int i10) {
        this.f8453a = str;
        this.f8454b = str2;
        this.f8455c = str3;
        this.f8456d = j10;
        this.f8457e = l10;
        this.f8458f = z10;
        this.f8459g = aVar;
        this.f8460h = fVar;
        this.f8461i = abstractC6181e;
        this.f8462j = cVar;
        this.f8463k = list;
        this.f8464l = i10;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: b */
    public AbstractC2135f0.e.a mo8469b() {
        return this.f8459g;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: c */
    public String mo8470c() {
        return this.f8455c;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: d */
    public AbstractC2135f0.e.c mo8471d() {
        return this.f8462j;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: e */
    public Long mo8472e() {
        return this.f8457e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l10;
        AbstractC2135f0.e.f fVar;
        AbstractC2135f0.e.AbstractC6181e abstractC6181e;
        AbstractC2135f0.e.c cVar;
        List<AbstractC2135f0.e.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e)) {
            return false;
        }
        AbstractC2135f0.e eVar = (AbstractC2135f0.e) obj;
        return this.f8453a.equals(eVar.mo8474g()) && this.f8454b.equals(eVar.mo8476i()) && ((str = this.f8455c) != null ? str.equals(eVar.mo8470c()) : eVar.mo8470c() == null) && this.f8456d == eVar.mo8479l() && ((l10 = this.f8457e) != null ? l10.equals(eVar.mo8472e()) : eVar.mo8472e() == null) && this.f8458f == eVar.mo8481n() && this.f8459g.equals(eVar.mo8469b()) && ((fVar = this.f8460h) != null ? fVar.equals(eVar.mo8480m()) : eVar.mo8480m() == null) && ((abstractC6181e = this.f8461i) != null ? abstractC6181e.equals(eVar.mo8478k()) : eVar.mo8478k() == null) && ((cVar = this.f8462j) != null ? cVar.equals(eVar.mo8471d()) : eVar.mo8471d() == null) && ((list = this.f8463k) != null ? list.equals(eVar.mo8473f()) : eVar.mo8473f() == null) && this.f8464l == eVar.mo8475h();
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: f */
    public List<AbstractC2135f0.e.d> mo8473f() {
        return this.f8463k;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: g */
    public String mo8474g() {
        return this.f8453a;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: h */
    public int mo8475h() {
        return this.f8464l;
    }

    public int hashCode() {
        int hashCode = (((this.f8453a.hashCode() ^ 1000003) * 1000003) ^ this.f8454b.hashCode()) * 1000003;
        String str = this.f8455c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f8456d;
        int i10 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f8457e;
        int hashCode3 = (((((i10 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f8458f ? 1231 : 1237)) * 1000003) ^ this.f8459g.hashCode()) * 1000003;
        AbstractC2135f0.e.f fVar = this.f8460h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        AbstractC2135f0.e.AbstractC6181e abstractC6181e = this.f8461i;
        int hashCode5 = (hashCode4 ^ (abstractC6181e == null ? 0 : abstractC6181e.hashCode())) * 1000003;
        AbstractC2135f0.e.c cVar = this.f8462j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<AbstractC2135f0.e.d> list = this.f8463k;
        return ((hashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f8464l;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: i */
    public String mo8476i() {
        return this.f8454b;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: k */
    public AbstractC2135f0.e.AbstractC6181e mo8478k() {
        return this.f8461i;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: l */
    public long mo8479l() {
        return this.f8456d;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: m */
    public AbstractC2135f0.e.f mo8480m() {
        return this.f8460h;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: n */
    public boolean mo8481n() {
        return this.f8458f;
    }

    @Override // p098g8.AbstractC2135f0.e
    /* renamed from: o */
    public AbstractC2135f0.e.b mo8482o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f8453a + ", identifier=" + this.f8454b + ", appQualitySessionId=" + this.f8455c + ", startedAt=" + this.f8456d + ", endedAt=" + this.f8457e + ", crashed=" + this.f8458f + ", app=" + this.f8459g + ", user=" + this.f8460h + ", os=" + this.f8461i + ", device=" + this.f8462j + ", events=" + this.f8463k + ", generatorType=" + this.f8464l + "}";
    }
}
