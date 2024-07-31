package p093g3;

import p045d3.AbstractC1532d;
import p045d3.C1531c;
import p045d3.InterfaceC1535g;
import p045d3.InterfaceC1536h;
import p045d3.InterfaceC1538j;

/* renamed from: g3.s */
/* loaded from: classes.dex */
public final class C1981s<T> implements InterfaceC1536h<T> {

    /* renamed from: a */
    public final AbstractC1978p f7886a;

    /* renamed from: b */
    public final String f7887b;

    /* renamed from: c */
    public final C1531c f7888c;

    /* renamed from: d */
    public final InterfaceC1535g<T, byte[]> f7889d;

    /* renamed from: e */
    public final InterfaceC1982t f7890e;

    public C1981s(AbstractC1978p abstractC1978p, String str, C1531c c1531c, InterfaceC1535g<T, byte[]> interfaceC1535g, InterfaceC1982t interfaceC1982t) {
        this.f7886a = abstractC1978p;
        this.f7887b = str;
        this.f7888c = c1531c;
        this.f7889d = interfaceC1535g;
        this.f7890e = interfaceC1982t;
    }

    /* renamed from: e */
    public static /* synthetic */ void m8003e(Exception exc) {
    }

    @Override // p045d3.InterfaceC1536h
    /* renamed from: a */
    public void mo6238a(AbstractC1532d<T> abstractC1532d) {
        mo6239b(abstractC1532d, new InterfaceC1538j() { // from class: g3.r
            @Override // p045d3.InterfaceC1538j
            /* renamed from: a */
            public final void mo6241a(Exception exc) {
                C1981s.m8003e(exc);
            }
        });
    }

    @Override // p045d3.InterfaceC1536h
    /* renamed from: b */
    public void mo6239b(AbstractC1532d<T> abstractC1532d, InterfaceC1538j interfaceC1538j) {
        this.f7890e.mo8005a(AbstractC1977o.m7997a().mo7962e(this.f7886a).mo7960c(abstractC1532d).mo7963f(this.f7887b).mo7961d(this.f7889d).mo7959b(this.f7888c).mo7958a(), interfaceC1538j);
    }

    /* renamed from: d */
    public AbstractC1978p m8004d() {
        return this.f7886a;
    }
}
