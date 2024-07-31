package p167l4;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p109h7.C2422e;
import p152k4.AbstractC3354g;
import p152k4.C3348a;
import p152k4.C3351d;
import p222p5.C4054z;

/* renamed from: l4.b */
/* loaded from: classes.dex */
public final class C3431b extends AbstractC3354g {
    /* renamed from: c */
    public static C3348a m12776c(C4054z c4054z) {
        c4054z.m15611r(12);
        int m15597d = (c4054z.m15597d() + c4054z.m15601h(12)) - 4;
        c4054z.m15611r(44);
        c4054z.m15612s(c4054z.m15601h(12));
        c4054z.m15611r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (c4054z.m15597d() >= m15597d) {
                break;
            }
            c4054z.m15611r(48);
            int m15601h = c4054z.m15601h(8);
            c4054z.m15611r(4);
            int m15597d2 = c4054z.m15597d() + c4054z.m15601h(12);
            String str2 = null;
            while (c4054z.m15597d() < m15597d2) {
                int m15601h2 = c4054z.m15601h(8);
                int m15601h3 = c4054z.m15601h(8);
                int m15597d3 = c4054z.m15597d() + m15601h3;
                if (m15601h2 == 2) {
                    int m15601h4 = c4054z.m15601h(16);
                    c4054z.m15611r(8);
                    if (m15601h4 != 3) {
                    }
                    while (c4054z.m15597d() < m15597d3) {
                        str = c4054z.m15605l(c4054z.m15601h(8), C2422e.f9745a);
                        int m15601h5 = c4054z.m15601h(8);
                        for (int i10 = 0; i10 < m15601h5; i10++) {
                            c4054z.m15612s(c4054z.m15601h(8));
                        }
                    }
                } else if (m15601h2 == 21) {
                    str2 = c4054z.m15605l(m15601h3, C2422e.f9745a);
                }
                c4054z.m15609p(m15597d3 * 8);
            }
            c4054z.m15609p(m15597d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new C3430a(m15601h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C3348a(arrayList);
    }

    @Override // p152k4.AbstractC3354g
    /* renamed from: b */
    public C3348a mo12429b(C3351d c3351d, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m12776c(new C4054z(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
