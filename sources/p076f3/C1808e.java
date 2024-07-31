package p076f3;

import p076f3.AbstractC1814k;

/* renamed from: f3.e */
/* loaded from: classes.dex */
public final class C1808e extends AbstractC1814k {

    /* renamed from: a */
    public final AbstractC1814k.b f6689a;

    /* renamed from: b */
    public final AbstractC1804a f6690b;

    /* renamed from: f3.e$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1814k.a {

        /* renamed from: a */
        public AbstractC1814k.b f6691a;

        /* renamed from: b */
        public AbstractC1804a f6692b;

        @Override // p076f3.AbstractC1814k.a
        /* renamed from: a */
        public AbstractC1814k mo7334a() {
            return new C1808e(this.f6691a, this.f6692b);
        }

        @Override // p076f3.AbstractC1814k.a
        /* renamed from: b */
        public AbstractC1814k.a mo7335b(AbstractC1804a abstractC1804a) {
            this.f6692b = abstractC1804a;
            return this;
        }

        @Override // p076f3.AbstractC1814k.a
        /* renamed from: c */
        public AbstractC1814k.a mo7336c(AbstractC1814k.b bVar) {
            this.f6691a = bVar;
            return this;
        }
    }

    public C1808e(AbstractC1814k.b bVar, AbstractC1804a abstractC1804a) {
        this.f6689a = bVar;
        this.f6690b = abstractC1804a;
    }

    public /* synthetic */ C1808e(AbstractC1814k.b bVar, AbstractC1804a abstractC1804a, a aVar) {
        this(bVar, abstractC1804a);
    }

    @Override // p076f3.AbstractC1814k
    /* renamed from: b */
    public AbstractC1804a mo7332b() {
        return this.f6690b;
    }

    @Override // p076f3.AbstractC1814k
    /* renamed from: c */
    public AbstractC1814k.b mo7333c() {
        return this.f6689a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1814k)) {
            return false;
        }
        AbstractC1814k abstractC1814k = (AbstractC1814k) obj;
        AbstractC1814k.b bVar = this.f6689a;
        if (bVar != null ? bVar.equals(abstractC1814k.mo7333c()) : abstractC1814k.mo7333c() == null) {
            AbstractC1804a abstractC1804a = this.f6690b;
            AbstractC1804a mo7332b = abstractC1814k.mo7332b();
            if (abstractC1804a == null) {
                if (mo7332b == null) {
                    return true;
                }
            } else if (abstractC1804a.equals(mo7332b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC1814k.b bVar = this.f6689a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC1804a abstractC1804a = this.f6690b;
        return hashCode ^ (abstractC1804a != null ? abstractC1804a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f6689a + ", androidClientInfo=" + this.f6690b + "}";
    }
}
