package p098g8;

import java.util.List;
import java.util.Objects;
import p098g8.AbstractC2135f0;

/* renamed from: g8.n */
/* loaded from: classes.dex */
public final class C2144n extends AbstractC2135f0.e.d.a.b {

    /* renamed from: a */
    public final List<AbstractC2135f0.e.d.a.b.AbstractC6174e> f8536a;

    /* renamed from: b */
    public final AbstractC2135f0.e.d.a.b.c f8537b;

    /* renamed from: c */
    public final AbstractC2135f0.a f8538c;

    /* renamed from: d */
    public final AbstractC2135f0.e.d.a.b.AbstractC6172d f8539d;

    /* renamed from: e */
    public final List<AbstractC2135f0.e.d.a.b.AbstractC6168a> f8540e;

    /* renamed from: g8.n$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC2135f0.e.d.a.b.AbstractC6170b {

        /* renamed from: a */
        public List<AbstractC2135f0.e.d.a.b.AbstractC6174e> f8541a;

        /* renamed from: b */
        public AbstractC2135f0.e.d.a.b.c f8542b;

        /* renamed from: c */
        public AbstractC2135f0.a f8543c;

        /* renamed from: d */
        public AbstractC2135f0.e.d.a.b.AbstractC6172d f8544d;

        /* renamed from: e */
        public List<AbstractC2135f0.e.d.a.b.AbstractC6168a> f8545e;

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6170b
        /* renamed from: a */
        public AbstractC2135f0.e.d.a.b mo8579a() {
            String str = "";
            if (this.f8544d == null) {
                str = " signal";
            }
            if (this.f8545e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new C2144n(this.f8541a, this.f8542b, this.f8543c, this.f8544d, this.f8545e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6170b
        /* renamed from: b */
        public AbstractC2135f0.e.d.a.b.AbstractC6170b mo8580b(AbstractC2135f0.a aVar) {
            this.f8543c = aVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6170b
        /* renamed from: c */
        public AbstractC2135f0.e.d.a.b.AbstractC6170b mo8581c(List<AbstractC2135f0.e.d.a.b.AbstractC6168a> list) {
            Objects.requireNonNull(list, "Null binaries");
            this.f8545e = list;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6170b
        /* renamed from: d */
        public AbstractC2135f0.e.d.a.b.AbstractC6170b mo8582d(AbstractC2135f0.e.d.a.b.c cVar) {
            this.f8542b = cVar;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6170b
        /* renamed from: e */
        public AbstractC2135f0.e.d.a.b.AbstractC6170b mo8583e(AbstractC2135f0.e.d.a.b.AbstractC6172d abstractC6172d) {
            Objects.requireNonNull(abstractC6172d, "Null signal");
            this.f8544d = abstractC6172d;
            return this;
        }

        @Override // p098g8.AbstractC2135f0.e.d.a.b.AbstractC6170b
        /* renamed from: f */
        public AbstractC2135f0.e.d.a.b.AbstractC6170b mo8584f(List<AbstractC2135f0.e.d.a.b.AbstractC6174e> list) {
            this.f8541a = list;
            return this;
        }
    }

    public C2144n(List<AbstractC2135f0.e.d.a.b.AbstractC6174e> list, AbstractC2135f0.e.d.a.b.c cVar, AbstractC2135f0.a aVar, AbstractC2135f0.e.d.a.b.AbstractC6172d abstractC6172d, List<AbstractC2135f0.e.d.a.b.AbstractC6168a> list2) {
        this.f8536a = list;
        this.f8537b = cVar;
        this.f8538c = aVar;
        this.f8539d = abstractC6172d;
        this.f8540e = list2;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b
    /* renamed from: b */
    public AbstractC2135f0.a mo8562b() {
        return this.f8538c;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b
    /* renamed from: c */
    public List<AbstractC2135f0.e.d.a.b.AbstractC6168a> mo8563c() {
        return this.f8540e;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b
    /* renamed from: d */
    public AbstractC2135f0.e.d.a.b.c mo8564d() {
        return this.f8537b;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b
    /* renamed from: e */
    public AbstractC2135f0.e.d.a.b.AbstractC6172d mo8565e() {
        return this.f8539d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2135f0.e.d.a.b)) {
            return false;
        }
        AbstractC2135f0.e.d.a.b bVar = (AbstractC2135f0.e.d.a.b) obj;
        List<AbstractC2135f0.e.d.a.b.AbstractC6174e> list = this.f8536a;
        if (list != null ? list.equals(bVar.mo8566f()) : bVar.mo8566f() == null) {
            AbstractC2135f0.e.d.a.b.c cVar = this.f8537b;
            if (cVar != null ? cVar.equals(bVar.mo8564d()) : bVar.mo8564d() == null) {
                AbstractC2135f0.a aVar = this.f8538c;
                if (aVar != null ? aVar.equals(bVar.mo8562b()) : bVar.mo8562b() == null) {
                    if (this.f8539d.equals(bVar.mo8565e()) && this.f8540e.equals(bVar.mo8563c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p098g8.AbstractC2135f0.e.d.a.b
    /* renamed from: f */
    public List<AbstractC2135f0.e.d.a.b.AbstractC6174e> mo8566f() {
        return this.f8536a;
    }

    public int hashCode() {
        List<AbstractC2135f0.e.d.a.b.AbstractC6174e> list = this.f8536a;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC2135f0.e.d.a.b.c cVar = this.f8537b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        AbstractC2135f0.a aVar = this.f8538c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f8539d.hashCode()) * 1000003) ^ this.f8540e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f8536a + ", exception=" + this.f8537b + ", appExitInfo=" + this.f8538c + ", signal=" + this.f8539d + ", binaries=" + this.f8540e + "}";
    }
}
