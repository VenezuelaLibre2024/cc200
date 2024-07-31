package p036c9;

import p036c9.AbstractC0995f;

/* renamed from: c9.b */
/* loaded from: classes.dex */
public final class C0991b extends AbstractC0995f {

    /* renamed from: a */
    public final String f3881a;

    /* renamed from: b */
    public final long f3882b;

    /* renamed from: c */
    public final AbstractC0995f.b f3883c;

    /* renamed from: c9.b$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC0995f.a {

        /* renamed from: a */
        public String f3884a;

        /* renamed from: b */
        public Long f3885b;

        /* renamed from: c */
        public AbstractC0995f.b f3886c;

        @Override // p036c9.AbstractC0995f.a
        /* renamed from: a */
        public AbstractC0995f mo4158a() {
            String str = "";
            if (this.f3885b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C0991b(this.f3884a, this.f3885b.longValue(), this.f3886c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p036c9.AbstractC0995f.a
        /* renamed from: b */
        public AbstractC0995f.a mo4159b(AbstractC0995f.b bVar) {
            this.f3886c = bVar;
            return this;
        }

        @Override // p036c9.AbstractC0995f.a
        /* renamed from: c */
        public AbstractC0995f.a mo4160c(String str) {
            this.f3884a = str;
            return this;
        }

        @Override // p036c9.AbstractC0995f.a
        /* renamed from: d */
        public AbstractC0995f.a mo4161d(long j10) {
            this.f3885b = Long.valueOf(j10);
            return this;
        }
    }

    public C0991b(String str, long j10, AbstractC0995f.b bVar) {
        this.f3881a = str;
        this.f3882b = j10;
        this.f3883c = bVar;
    }

    public /* synthetic */ C0991b(String str, long j10, AbstractC0995f.b bVar, a aVar) {
        this(str, j10, bVar);
    }

    @Override // p036c9.AbstractC0995f
    /* renamed from: b */
    public AbstractC0995f.b mo4155b() {
        return this.f3883c;
    }

    @Override // p036c9.AbstractC0995f
    /* renamed from: c */
    public String mo4156c() {
        return this.f3881a;
    }

    @Override // p036c9.AbstractC0995f
    /* renamed from: d */
    public long mo4157d() {
        return this.f3882b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0995f)) {
            return false;
        }
        AbstractC0995f abstractC0995f = (AbstractC0995f) obj;
        String str = this.f3881a;
        if (str != null ? str.equals(abstractC0995f.mo4156c()) : abstractC0995f.mo4156c() == null) {
            if (this.f3882b == abstractC0995f.mo4157d()) {
                AbstractC0995f.b bVar = this.f3883c;
                AbstractC0995f.b mo4155b = abstractC0995f.mo4155b();
                if (bVar == null) {
                    if (mo4155b == null) {
                        return true;
                    }
                } else if (bVar.equals(mo4155b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3881a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j10 = this.f3882b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        AbstractC0995f.b bVar = this.f3883c;
        return i10 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f3881a + ", tokenExpirationTimestamp=" + this.f3882b + ", responseCode=" + this.f3883c + "}";
    }
}
