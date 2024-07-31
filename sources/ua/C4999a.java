package ua;

import java.util.Map;
import p129ia.C2671c;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p129ia.InterfaceC2680l;
import p211oa.C3965b;
import p211oa.C3968e;
import va.C5156c;

/* renamed from: ua.a */
/* loaded from: classes.dex */
public final class C4999a implements InterfaceC2680l {

    /* renamed from: b */
    public static final C2684p[] f18678b = new C2684p[0];

    /* renamed from: a */
    public final C5156c f18679a = new C5156c();

    /* renamed from: c */
    public static C3965b m19567c(C3965b c3965b) {
        int[] m15037i = c3965b.m15037i();
        if (m15037i == null) {
            throw C2678j.m10895a();
        }
        int i10 = m15037i[0];
        int i11 = m15037i[1];
        int i12 = m15037i[2];
        int i13 = m15037i[3];
        C3965b c3965b2 = new C3965b(30, 33);
        for (int i14 = 0; i14 < 33; i14++) {
            int min = Math.min((((i14 * i13) + (i13 / 2)) / 33) + i11, i13 - 1);
            for (int i15 = 0; i15 < 30; i15++) {
                if (c3965b.m15035g(Math.min((((i15 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30, i12 - 1) + i10, min)) {
                    c3965b2.m15044q(i15, i14);
                }
            }
        }
        return c3965b2;
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: a */
    public C2682n mo363a(C2671c c2671c) {
        return mo364b(c2671c, null);
    }

    @Override // p129ia.InterfaceC2680l
    /* renamed from: b */
    public C2682n mo364b(C2671c c2671c, Map<EnumC2673e, ?> map) {
        C3968e m20862b = this.f18679a.m20862b(m19567c(c2671c.m10875a()), map);
        C2682n c2682n = new C2682n(m20862b.m15062i(), m20862b.m15058e(), f18678b, EnumC2669a.MAXICODE);
        String m15055b = m20862b.m15055b();
        if (m15055b != null) {
            c2682n.m10904h(EnumC2683o.ERROR_CORRECTION_LEVEL, m15055b);
        }
        return c2682n;
    }

    @Override // p129ia.InterfaceC2680l
    public void reset() {
    }
}
