package za;

import p211oa.C3964a;

/* renamed from: za.b */
/* loaded from: classes.dex */
public final class C6098b extends AbstractC6102f {
    public C6098b(C3964a c3964a) {
        super(c3964a);
    }

    @Override // za.AbstractC6105i
    /* renamed from: h */
    public void mo24348h(StringBuilder sb2, int i10) {
        sb2.append(i10 < 10000 ? "(3202)" : "(3203)");
    }

    @Override // za.AbstractC6105i
    /* renamed from: i */
    public int mo24349i(int i10) {
        return i10 < 10000 ? i10 : i10 - 10000;
    }
}
