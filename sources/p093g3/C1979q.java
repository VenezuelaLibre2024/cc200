package p093g3;

import java.util.Set;
import p045d3.C1531c;
import p045d3.InterfaceC1535g;
import p045d3.InterfaceC1536h;
import p045d3.InterfaceC1537i;

/* renamed from: g3.q */
/* loaded from: classes.dex */
public final class C1979q implements InterfaceC1537i {

    /* renamed from: a */
    public final Set<C1531c> f7882a;

    /* renamed from: b */
    public final AbstractC1978p f7883b;

    /* renamed from: c */
    public final InterfaceC1982t f7884c;

    public C1979q(Set<C1531c> set, AbstractC1978p abstractC1978p, InterfaceC1982t interfaceC1982t) {
        this.f7882a = set;
        this.f7883b = abstractC1978p;
        this.f7884c = interfaceC1982t;
    }

    @Override // p045d3.InterfaceC1537i
    /* renamed from: a */
    public <T> InterfaceC1536h<T> mo6240a(String str, Class<T> cls, C1531c c1531c, InterfaceC1535g<T, byte[]> interfaceC1535g) {
        if (this.f7882a.contains(c1531c)) {
            return new C1981s(this.f7883b, str, c1531c, interfaceC1535g, this.f7884c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c1531c, this.f7882a));
    }
}
