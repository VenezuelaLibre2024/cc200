package p324wa;

import java.util.Map;
import p129ia.C2671c;
import p129ia.C2674f;
import p129ia.C2682n;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p211oa.C3964a;

/* renamed from: wa.l */
/* loaded from: classes.dex */
public final class C5462l extends AbstractC5466p {

    /* renamed from: i */
    public final AbstractC5466p f20337i = new C5455e();

    /* renamed from: s */
    public static C2682n m21651s(C2682n c2682n) {
        String m10902f = c2682n.m10902f();
        if (m10902f.charAt(0) != '0') {
            throw C2674f.m10883a();
        }
        C2682n c2682n2 = new C2682n(m10902f.substring(1), null, c2682n.m10901e(), EnumC2669a.UPC_A);
        if (c2682n.m10900d() != null) {
            c2682n2.m10903g(c2682n.m10900d());
        }
        return c2682n2;
    }

    @Override // p324wa.AbstractC5461k, p129ia.InterfaceC2680l
    /* renamed from: a */
    public C2682n mo363a(C2671c c2671c) {
        return m21651s(this.f20337i.mo363a(c2671c));
    }

    @Override // p324wa.AbstractC5461k, p129ia.InterfaceC2680l
    /* renamed from: b */
    public C2682n mo364b(C2671c c2671c, Map<EnumC2673e, ?> map) {
        return m21651s(this.f20337i.mo364b(c2671c, map));
    }

    @Override // p324wa.AbstractC5466p, p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        return m21651s(this.f20337i.mo21616c(i10, c3964a, map));
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: l */
    public int mo21635l(C3964a c3964a, int[] iArr, StringBuilder sb2) {
        return this.f20337i.mo21635l(c3964a, iArr, sb2);
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: m */
    public C2682n mo21652m(int i10, C3964a c3964a, int[] iArr, Map<EnumC2673e, ?> map) {
        return m21651s(this.f20337i.mo21652m(i10, c3964a, iArr, map));
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: q */
    public EnumC2669a mo21636q() {
        return EnumC2669a.UPC_A;
    }
}
