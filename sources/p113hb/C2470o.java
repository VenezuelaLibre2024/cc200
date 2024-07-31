package p113hb;

import p129ia.AbstractC2676h;
import p129ia.C2671c;
import p129ia.InterfaceC2680l;
import p211oa.C3974k;

/* renamed from: hb.o */
/* loaded from: classes.dex */
public class C2470o extends C2464i {

    /* renamed from: c */
    public boolean f9888c;

    public C2470o(InterfaceC2680l interfaceC2680l) {
        super(interfaceC2680l);
        this.f9888c = true;
    }

    @Override // p113hb.C2464i
    /* renamed from: e */
    public C2671c mo9832e(AbstractC2676h abstractC2676h) {
        if (this.f9888c) {
            this.f9888c = false;
            return new C2671c(new C3974k(abstractC2676h.mo10887e()));
        }
        this.f9888c = true;
        return new C2671c(new C3974k(abstractC2676h));
    }
}
