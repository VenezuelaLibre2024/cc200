package za;

import p129ia.C2678j;
import p211oa.C3964a;

/* renamed from: za.c */
/* loaded from: classes.dex */
public final class C6099c extends AbstractC6104h {
    public C6099c(C3964a c3964a) {
        super(c3964a);
    }

    @Override // za.AbstractC6106j
    /* renamed from: d */
    public String mo24350d() {
        if (m24358c().m15026i() < 48) {
            throw C2678j.m10895a();
        }
        StringBuilder sb2 = new StringBuilder();
        m24353f(sb2, 8);
        int m24390f = m24357b().m24390f(48, 2);
        sb2.append("(392");
        sb2.append(m24390f);
        sb2.append(')');
        sb2.append(m24357b().m24387c(50, null).m24371b());
        return sb2.toString();
    }
}
