package p013ab;

import bb.C0540j;
import java.util.ArrayList;
import java.util.Map;
import p053db.C1608a;
import p053db.C1609b;
import p079f6.C1841a;
import p129ia.C2671c;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p129ia.InterfaceC2680l;
import p211oa.C3968e;

/* renamed from: ab.b */
/* loaded from: classes.dex */
public final class C0084b implements InterfaceC2680l {

    /* renamed from: a */
    public static final C2682n[] f290a = new C2682n[0];

    /* renamed from: c */
    public static C2682n[] m358c(C2671c c2671c, Map<EnumC2673e, ?> map, boolean z10) {
        ArrayList arrayList = new ArrayList();
        C1609b m6459b = C1608a.m6459b(c2671c, map, z10);
        for (C2684p[] c2684pArr : m6459b.m6466b()) {
            C3968e m2642i = C0540j.m2642i(m6459b.m6465a(), c2684pArr[4], c2684pArr[5], c2684pArr[6], c2684pArr[7], m361f(c2684pArr), m359d(c2684pArr));
            C2682n c2682n = new C2682n(m2642i.m15062i(), m2642i.m15058e(), c2684pArr, EnumC2669a.PDF_417);
            c2682n.m10904h(EnumC2683o.ERROR_CORRECTION_LEVEL, m2642i.m15055b());
            C0085c c0085c = (C0085c) m2642i.m15057d();
            if (c0085c != null) {
                c2682n.m10904h(EnumC2683o.PDF417_EXTRA_METADATA, c0085c);
            }
            c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]L" + m2642i.m15061h());
            arrayList.add(c2682n);
        }
        return (C2682n[]) arrayList.toArray(f290a);
    }

    /* renamed from: d */
    public static int m359d(C2684p[] c2684pArr) {
        return Math.max(Math.max(m360e(c2684pArr[0], c2684pArr[4]), (m360e(c2684pArr[6], c2684pArr[2]) * 17) / 18), Math.max(m360e(c2684pArr[1], c2684pArr[5]), (m360e(c2684pArr[7], c2684pArr[3]) * 17) / 18));
    }

    /* renamed from: e */
    public static int m360e(C2684p c2684p, C2684p c2684p2) {
        if (c2684p == null || c2684p2 == null) {
            return 0;
        }
        return (int) Math.abs(c2684p.m10908c() - c2684p2.m10908c());
    }

    /* renamed from: f */
    public static int m361f(C2684p[] c2684pArr) {
        return Math.min(Math.min(m362g(c2684pArr[0], c2684pArr[4]), (m362g(c2684pArr[6], c2684pArr[2]) * 17) / 18), Math.min(m362g(c2684pArr[1], c2684pArr[5]), (m362g(c2684pArr[7], c2684pArr[3]) * 17) / 18));
    }

    /* renamed from: g */
    public static int m362g(C2684p c2684p, C2684p c2684p2) {
        return (c2684p == null || c2684p2 == null) ? C1841a.e.API_PRIORITY_OTHER : (int) Math.abs(c2684p.m10908c() - c2684p2.m10908c());
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: a */
    public C2682n mo363a(C2671c c2671c) {
        return mo364b(c2671c, null);
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: b */
    public C2682n mo364b(C2671c c2671c, Map<EnumC2673e, ?> map) {
        C2682n[] m358c = m358c(c2671c, map, false);
        if (m358c.length == 0 || m358c[0] == null) {
            throw C2678j.m10895a();
        }
        return m358c[0];
    }

    @Override // p129ia.InterfaceC2680l
    public void reset() {
    }
}
