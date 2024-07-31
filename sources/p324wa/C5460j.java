package p324wa;

import java.util.Collection;
import java.util.Map;
import p129ia.AbstractC2681m;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p211oa.C3964a;

/* renamed from: wa.j */
/* loaded from: classes.dex */
public final class C5460j extends AbstractC5461k {

    /* renamed from: b */
    public static final AbstractC5466p[] f20335b = new AbstractC5466p[0];

    /* renamed from: a */
    public final AbstractC5466p[] f20336a;

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C5460j(java.util.Map<p129ia.EnumC2673e, ?> r3) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 != 0) goto L7
            r3 = 0
            goto Lf
        L7:
            ia.e r0 = p129ia.EnumC2673e.POSSIBLE_FORMATS
            java.lang.Object r3 = r3.get(r0)
            java.util.Collection r3 = (java.util.Collection) r3
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r3 == 0) goto L55
            ia.a r1 = p129ia.EnumC2669a.EAN_13
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L27
            wa.e r1 = new wa.e
            r1.<init>()
        L23:
            r0.add(r1)
            goto L35
        L27:
            ia.a r1 = p129ia.EnumC2669a.UPC_A
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L35
            wa.l r1 = new wa.l
            r1.<init>()
            goto L23
        L35:
            ia.a r1 = p129ia.EnumC2669a.EAN_8
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L45
            wa.f r1 = new wa.f
            r1.<init>()
            r0.add(r1)
        L45:
            ia.a r1 = p129ia.EnumC2669a.UPC_E
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L55
            wa.q r3 = new wa.q
            r3.<init>()
            r0.add(r3)
        L55:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L73
            wa.e r3 = new wa.e
            r3.<init>()
            r0.add(r3)
            wa.f r3 = new wa.f
            r3.<init>()
            r0.add(r3)
            wa.q r3 = new wa.q
            r3.<init>()
            r0.add(r3)
        L73:
            wa.p[] r3 = p324wa.C5460j.f20335b
            java.lang.Object[] r3 = r0.toArray(r3)
            wa.p[] r3 = (p324wa.AbstractC5466p[]) r3
            r2.f20336a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p324wa.C5460j.<init>(java.util.Map):void");
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        boolean z10;
        int[] m21667p = AbstractC5466p.m21667p(c3964a);
        for (AbstractC5466p abstractC5466p : this.f20336a) {
            try {
                C2682n mo21652m = abstractC5466p.mo21652m(i10, c3964a, m21667p, map);
                boolean z11 = mo21652m.m10898b() == EnumC2669a.EAN_13 && mo21652m.m10902f().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(EnumC2673e.POSSIBLE_FORMATS);
                if (collection != null && !collection.contains(EnumC2669a.UPC_A)) {
                    z10 = false;
                    if (z11 || !z10) {
                        return mo21652m;
                    }
                    C2682n c2682n = new C2682n(mo21652m.m10902f().substring(1), mo21652m.m10899c(), mo21652m.m10901e(), EnumC2669a.UPC_A);
                    c2682n.m10903g(mo21652m.m10900d());
                    return c2682n;
                }
                z10 = true;
                if (z11) {
                }
                return mo21652m;
            } catch (AbstractC2681m unused) {
            }
        }
        throw C2678j.m10895a();
    }

    @Override // p324wa.AbstractC5461k, p129ia.InterfaceC2680l
    public void reset() {
        for (AbstractC5466p abstractC5466p : this.f20336a) {
            abstractC5466p.reset();
        }
    }
}
