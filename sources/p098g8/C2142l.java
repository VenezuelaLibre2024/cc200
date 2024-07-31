package p098g8;

import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.l */
/* loaded from: classes.dex */
public final class C2142l extends AbstractC2135f0.e.d {

    /* renamed from: a */
    public final long f8510a;

    /* renamed from: b */
    public final String f8511b;

    /* renamed from: c */
    public final AbstractC2135f0.e.d.a f8512c;

    /* renamed from: d */
    public final AbstractC2135f0.e.d.c f8513d;

    /* renamed from: e */
    public final AbstractC2135f0.e.d.AbstractC6179d f8514e;

    /* renamed from: f */
    public final AbstractC2135f0.e.d.f f8515f;

    /* renamed from: g8.l$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.b {

        /* renamed from: a */
        public Long f8516a;

        /* renamed from: b */
        public String f8517b;

        /* renamed from: c */
        public AbstractC2135f0.e.d.a f8518c;

        /* renamed from: d */
        public AbstractC2135f0.e.d.c f8519d;

        /* renamed from: e */
        public AbstractC2135f0.e.d.AbstractC6179d f8520e;

        /* renamed from: f */
        public AbstractC2135f0.e.d.f f8521f;

        public b() {
        }

        public b(AbstractC2135f0.e.d dVar) {
            this.f8516a = Long.valueOf(dVar.mo8541f());
            this.f8517b = dVar.mo8542g();
            this.f8518c = dVar.mo8537b();
            this.f8519d = dVar.mo8538c();
            this.f8520e = dVar.mo8539d();
            this.f8521f = dVar.mo8540e();
        }

        @Override // p098g8.AbstractC2135f0.e.d.b
        /* renamed from: a */
        public AbstractC2135f0.e.d mo8635a() {
            String str = "";
            if (this.f8516a == null) {
                str = " timestamp";
            }
            if (this.f8517b == null) {
                str = str + " type";
            }
            if (this.f8518c == null) {
                str = str + " app";
            }
            if (this.f8519d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new C2142l(this.f8516a.longValue(), this.f8517b, this.f8518c, this.f8519d, this.f8520e, this.f8521f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.b
        /* renamed from: b */
        public AbstractC2135f0.e.d.b mo8636b(AbstractC2135f0.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f8518c = aVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.b
        /* renamed from: c */
        public AbstractC2135f0.e.d.b mo8637c(AbstractC2135f0.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f8519d = cVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.b
        /* renamed from: d */
        public AbstractC2135f0.e.d.b mo8638d(AbstractC2135f0.e.d.AbstractC6179d abstractC6179d) {
            this.f8520e = abstractC6179d;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.b
        /* renamed from: e */
        public AbstractC2135f0.e.d.b mo8639e(AbstractC2135f0.e.d.f fVar) {
            this.f8521f = fVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.b
        /* renamed from: f */
        public AbstractC2135f0.e.d.b mo8640f(long j10) {
            this.f8516a = Long.valueOf(j10);
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.b
        /* renamed from: g */
        public AbstractC2135f0.e.d.b mo8641g(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f8517b = str;
            return this;
        }
    }

    public C2142l(long j10, String str, AbstractC2135f0.e.d.a aVar, AbstractC2135f0.e.d.c cVar, AbstractC2135f0.e.d.AbstractC6179d abstractC6179d, AbstractC2135f0.e.d.f fVar) {
        this.f8510a = j10;
        this.f8511b = str;
        this.f8512c = aVar;
        this.f8513d = cVar;
        this.f8514e = abstractC6179d;
        this.f8515f = fVar;
    }

    @Override // p098g8.AbstractC2135f0.e.d
    /* renamed from: b */
    public AbstractC2135f0.e.d.a mo8537b() {
        return this.f8512c;
    }

    @Override // p098g8.AbstractC2135f0.e.d
    /* renamed from: c */
    public AbstractC2135f0.e.d.c mo8538c() {
        return this.f8513d;
    }

    @Override // p098g8.AbstractC2135f0.e.d
    /* renamed from: d */
    public AbstractC2135f0.e.d.AbstractC6179d mo8539d() {
        return this.f8514e;
    }

    @Override // p098g8.AbstractC2135f0.e.d
    /* renamed from: e */
    public AbstractC2135f0.e.d.f mo8540e() {
        return this.f8515f;
    }

    public boolean equals(Object obj) {
        AbstractC2135f0.e.d.AbstractC6179d abstractC6179d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d)) {
            return false;
        }
        AbstractC2135f0.e.d dVar = (AbstractC2135f0.e.d) obj;
        if (this.f8510a == dVar.mo8541f() && this.f8511b.equals(dVar.mo8542g()) && this.f8512c.equals(dVar.mo8537b()) && this.f8513d.equals(dVar.mo8538c()) && ((abstractC6179d = this.f8514e) != null ? abstractC6179d.equals(dVar.mo8539d()) : dVar.mo8539d() == null)) {
            AbstractC2135f0.e.d.f fVar = this.f8515f;
            AbstractC2135f0.e.d.f mo8540e = dVar.mo8540e();
            if (fVar == null) {
                if (mo8540e == null) {
                    return true;
                }
            } else if (fVar.equals(mo8540e)) {
                return true;
            }
        }
        return false;
    }

    @Override // p098g8.AbstractC2135f0.e.d
    /* renamed from: f */
    public long mo8541f() {
        return this.f8510a;
    }

    @Override // p098g8.AbstractC2135f0.e.d
    /* renamed from: g */
    public String mo8542g() {
        return this.f8511b;
    }

    @Override // p098g8.AbstractC2135f0.e.d
    /* renamed from: h */
    public AbstractC2135f0.e.d.b mo8543h() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f8510a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f8511b.hashCode()) * 1000003) ^ this.f8512c.hashCode()) * 1000003) ^ this.f8513d.hashCode()) * 1000003;
        AbstractC2135f0.e.d.AbstractC6179d abstractC6179d = this.f8514e;
        int hashCode2 = (hashCode ^ (abstractC6179d == null ? 0 : abstractC6179d.hashCode())) * 1000003;
        AbstractC2135f0.e.d.f fVar = this.f8515f;
        return hashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f8510a + ", type=" + this.f8511b + ", app=" + this.f8512c + ", device=" + this.f8513d + ", log=" + this.f8514e + ", rollouts=" + this.f8515f + "}";
    }
}
