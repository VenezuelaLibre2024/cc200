package p356ya;

import java.util.List;
import p211oa.C3964a;

/* renamed from: ya.a */
/* loaded from: classes.dex */
public final class C5901a {
    /* renamed from: a */
    public static C3964a m23606a(List<C5902b> list) {
        int size = (list.size() * 2) - 1;
        if (list.get(list.size() - 1).m23609c() == null) {
            size--;
        }
        C3964a c3964a = new C3964a(size * 12);
        int i10 = 0;
        int m22852b = list.get(0).m23609c().m22852b();
        for (int i11 = 11; i11 >= 0; i11--) {
            if (((1 << i11) & m22852b) != 0) {
                c3964a.m15029n(i10);
            }
            i10++;
        }
        for (int i12 = 1; i12 < list.size(); i12++) {
            C5902b c5902b = list.get(i12);
            int m22852b2 = c5902b.m23608b().m22852b();
            for (int i13 = 11; i13 >= 0; i13--) {
                if (((1 << i13) & m22852b2) != 0) {
                    c3964a.m15029n(i10);
                }
                i10++;
            }
            if (c5902b.m23609c() != null) {
                int m22852b3 = c5902b.m23609c().m22852b();
                for (int i14 = 11; i14 >= 0; i14--) {
                    if (((1 << i14) & m22852b3) != 0) {
                        c3964a.m15029n(i10);
                    }
                    i10++;
                }
            }
        }
        return c3964a;
    }
}
