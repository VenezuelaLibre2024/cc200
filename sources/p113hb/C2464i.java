package p113hb;

import java.util.ArrayList;
import java.util.List;
import p129ia.AbstractC2676h;
import p129ia.C2671c;
import p129ia.C2677i;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.InterfaceC2680l;
import p129ia.InterfaceC2685q;
import p211oa.C3974k;

/* renamed from: hb.i */
/* loaded from: classes.dex */
public class C2464i implements InterfaceC2685q {

    /* renamed from: a */
    public InterfaceC2680l f9868a;

    /* renamed from: b */
    public List<C2684p> f9869b = new ArrayList();

    public C2464i(InterfaceC2680l interfaceC2680l) {
        this.f9868a = interfaceC2680l;
    }

    @Override // p129ia.InterfaceC2685q
    /* renamed from: a */
    public void mo9828a(C2684p c2684p) {
        this.f9869b.add(c2684p);
    }

    /* renamed from: b */
    public C2682n m9829b(C2671c c2671c) {
        C2682n c2682n;
        this.f9869b.clear();
        try {
            InterfaceC2680l interfaceC2680l = this.f9868a;
            c2682n = interfaceC2680l instanceof C2677i ? ((C2677i) interfaceC2680l).m10893d(c2671c) : interfaceC2680l.mo363a(c2671c);
        } catch (Exception unused) {
            c2682n = null;
        } catch (Throwable th) {
            this.f9868a.reset();
            throw th;
        }
        this.f9868a.reset();
        return c2682n;
    }

    /* renamed from: c */
    public C2682n m9830c(AbstractC2676h abstractC2676h) {
        return m9829b(mo9832e(abstractC2676h));
    }

    /* renamed from: d */
    public List<C2684p> m9831d() {
        return new ArrayList(this.f9869b);
    }

    /* renamed from: e */
    public C2671c mo9832e(AbstractC2676h abstractC2676h) {
        return new C2671c(new C3974k(abstractC2676h));
    }
}
