package p076f3;

import p076f3.AbstractC1818o;

/* renamed from: f3.i */
/* loaded from: classes.dex */
public final class C1812i extends AbstractC1818o {

    /* renamed from: a */
    public final AbstractC1818o.c f6722a;

    /* renamed from: b */
    public final AbstractC1818o.b f6723b;

    /* renamed from: f3.i$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC1818o.a {

        /* renamed from: a */
        public AbstractC1818o.c f6724a;

        /* renamed from: b */
        public AbstractC1818o.b f6725b;

        @Override // p076f3.AbstractC1818o.a
        /* renamed from: a */
        public AbstractC1818o mo7370a() {
            return new C1812i(this.f6724a, this.f6725b);
        }

        @Override // p076f3.AbstractC1818o.a
        /* renamed from: b */
        public AbstractC1818o.a mo7371b(AbstractC1818o.b bVar) {
            this.f6725b = bVar;
            return this;
        }

        @Override // p076f3.AbstractC1818o.a
        /* renamed from: c */
        public AbstractC1818o.a mo7372c(AbstractC1818o.c cVar) {
            this.f6724a = cVar;
            return this;
        }
    }

    public C1812i(AbstractC1818o.c cVar, AbstractC1818o.b bVar) {
        this.f6722a = cVar;
        this.f6723b = bVar;
    }

    public /* synthetic */ C1812i(AbstractC1818o.c cVar, AbstractC1818o.b bVar, a aVar) {
        this(cVar, bVar);
    }

    @Override // p076f3.AbstractC1818o
    /* renamed from: b */
    public AbstractC1818o.b mo7368b() {
        return this.f6723b;
    }

    @Override // p076f3.AbstractC1818o
    /* renamed from: c */
    public AbstractC1818o.c mo7369c() {
        return this.f6722a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1818o)) {
            return false;
        }
        AbstractC1818o abstractC1818o = (AbstractC1818o) obj;
        AbstractC1818o.c cVar = this.f6722a;
        if (cVar != null ? cVar.equals(abstractC1818o.mo7369c()) : abstractC1818o.mo7369c() == null) {
            AbstractC1818o.b bVar = this.f6723b;
            AbstractC1818o.b mo7368b = abstractC1818o.mo7368b();
            if (bVar == null) {
                if (mo7368b == null) {
                    return true;
                }
            } else if (bVar.equals(mo7368b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC1818o.c cVar = this.f6722a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC1818o.b bVar = this.f6723b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f6722a + ", mobileSubtype=" + this.f6723b + "}";
    }
}
