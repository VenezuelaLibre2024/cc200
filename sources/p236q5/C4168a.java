package p236q5;

import java.util.ArrayList;
import java.util.List;
import p222p5.C4015a0;
import p222p5.C4022e;
import p222p5.C4051w;
import p264s3.C4499t2;

/* renamed from: q5.a */
/* loaded from: classes.dex */
public final class C4168a {

    /* renamed from: a */
    public final List<byte[]> f14977a;

    /* renamed from: b */
    public final int f14978b;

    /* renamed from: c */
    public final int f14979c;

    /* renamed from: d */
    public final int f14980d;

    /* renamed from: e */
    public final float f14981e;

    /* renamed from: f */
    public final String f14982f;

    public C4168a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f14977a = list;
        this.f14978b = i10;
        this.f14979c = i11;
        this.f14980d = i12;
        this.f14981e = f10;
        this.f14982f = str;
    }

    /* renamed from: a */
    public static byte[] m16026a(C4015a0 c4015a0) {
        int m15216M = c4015a0.m15216M();
        int m15231f = c4015a0.m15231f();
        c4015a0.m15224U(m15216M);
        return C4022e.m15280d(c4015a0.m15230e(), m15231f, m15216M);
    }

    /* renamed from: b */
    public static C4168a m16027b(C4015a0 c4015a0) {
        float f10;
        String str;
        int i10;
        try {
            c4015a0.m15224U(4);
            int m15210G = (c4015a0.m15210G() & 3) + 1;
            if (m15210G == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int m15210G2 = c4015a0.m15210G() & 31;
            for (int i11 = 0; i11 < m15210G2; i11++) {
                arrayList.add(m16026a(c4015a0));
            }
            int m15210G3 = c4015a0.m15210G();
            for (int i12 = 0; i12 < m15210G3; i12++) {
                arrayList.add(m16026a(c4015a0));
            }
            int i13 = -1;
            if (m15210G2 > 0) {
                C4051w.c m15576l = C4051w.m15576l((byte[]) arrayList.get(0), m15210G, ((byte[]) arrayList.get(0)).length);
                int i14 = m15576l.f14584f;
                int i15 = m15576l.f14585g;
                float f11 = m15576l.f14586h;
                str = C4022e.m15277a(m15576l.f14579a, m15576l.f14580b, m15576l.f14581c);
                i13 = i14;
                i10 = i15;
                f10 = f11;
            } else {
                f10 = 1.0f;
                str = null;
                i10 = -1;
            }
            return new C4168a(arrayList, m15210G, i13, i10, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw C4499t2.m17594a("Error parsing AVC config", e10);
        }
    }
}
