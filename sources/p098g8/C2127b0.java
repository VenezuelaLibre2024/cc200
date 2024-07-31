package p098g8;

import java.util.Objects;
import p098g8.AbstractC2137g0;

/* renamed from: g8.b0 */
/* loaded from: classes.dex */
public final class C2127b0 extends AbstractC2137g0 {

    /* renamed from: a */
    public final AbstractC2137g0.a f8395a;

    /* renamed from: b */
    public final AbstractC2137g0.c f8396b;

    /* renamed from: c */
    public final AbstractC2137g0.b f8397c;

    public C2127b0(AbstractC2137g0.a aVar, AbstractC2137g0.c cVar, AbstractC2137g0.b bVar) {
        Objects.requireNonNull(aVar, "Null appData");
        this.f8395a = aVar;
        Objects.requireNonNull(cVar, "Null osData");
        this.f8396b = cVar;
        Objects.requireNonNull(bVar, "Null deviceData");
        this.f8397c = bVar;
    }

    @Override // p098g8.AbstractC2137g0
    /* renamed from: a */
    public AbstractC2137g0.a mo8393a() {
        return this.f8395a;
    }

    @Override // p098g8.AbstractC2137g0
    /* renamed from: c */
    public AbstractC2137g0.b mo8394c() {
        return this.f8397c;
    }

    @Override // p098g8.AbstractC2137g0
    /* renamed from: d */
    public AbstractC2137g0.c mo8395d() {
        return this.f8396b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2137g0)) {
            return false;
        }
        AbstractC2137g0 abstractC2137g0 = (AbstractC2137g0) obj;
        return this.f8395a.equals(abstractC2137g0.mo8393a()) && this.f8396b.equals(abstractC2137g0.mo8395d()) && this.f8397c.equals(abstractC2137g0.mo8394c());
    }

    public int hashCode() {
        return ((((this.f8395a.hashCode() ^ 1000003) * 1000003) ^ this.f8396b.hashCode()) * 1000003) ^ this.f8397c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f8395a + ", osData=" + this.f8396b + ", deviceData=" + this.f8397c + "}";
    }
}
