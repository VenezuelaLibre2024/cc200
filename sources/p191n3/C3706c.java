package p191n3;

import java.util.Map;
import java.util.Objects;
import p045d3.EnumC1533e;
import p191n3.AbstractC3710g;
import p234q3.InterfaceC4157a;

/* renamed from: n3.c */
/* loaded from: classes.dex */
public final class C3706c extends AbstractC3710g {

    /* renamed from: a */
    public final InterfaceC4157a f13207a;

    /* renamed from: b */
    public final Map<EnumC1533e, AbstractC3710g.b> f13208b;

    public C3706c(InterfaceC4157a interfaceC4157a, Map<EnumC1533e, AbstractC3710g.b> map) {
        Objects.requireNonNull(interfaceC4157a, "Null clock");
        this.f13207a = interfaceC4157a;
        Objects.requireNonNull(map, "Null values");
        this.f13208b = map;
    }

    @Override // p191n3.AbstractC3710g
    /* renamed from: e */
    public InterfaceC4157a mo13986e() {
        return this.f13207a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3710g)) {
            return false;
        }
        AbstractC3710g abstractC3710g = (AbstractC3710g) obj;
        return this.f13207a.equals(abstractC3710g.mo13986e()) && this.f13208b.equals(abstractC3710g.mo13987h());
    }

    @Override // p191n3.AbstractC3710g
    /* renamed from: h */
    public Map<EnumC1533e, AbstractC3710g.b> mo13987h() {
        return this.f13208b;
    }

    public int hashCode() {
        return ((this.f13207a.hashCode() ^ 1000003) * 1000003) ^ this.f13208b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f13207a + ", values=" + this.f13208b + "}";
    }
}
