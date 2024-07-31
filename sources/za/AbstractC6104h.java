package za;

import p211oa.C3964a;

/* renamed from: za.h */
/* loaded from: classes.dex */
public abstract class AbstractC6104h extends AbstractC6106j {
    public AbstractC6104h(C3964a c3964a) {
        super(c3964a);
    }

    /* renamed from: e */
    public static void m24352e(StringBuilder sb2, int i10) {
        int i11 = 0;
        for (int i12 = 0; i12 < 13; i12++) {
            int charAt = sb2.charAt(i12 + i10) - '0';
            if ((i12 & 1) == 0) {
                charAt *= 3;
            }
            i11 += charAt;
        }
        int i13 = 10 - (i11 % 10);
        sb2.append(i13 != 10 ? i13 : 0);
    }

    /* renamed from: f */
    public final void m24353f(StringBuilder sb2, int i10) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        m24354g(sb2, i10, length);
    }

    /* renamed from: g */
    public final void m24354g(StringBuilder sb2, int i10, int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            int m24390f = m24357b().m24390f((i12 * 10) + i10, 10);
            if (m24390f / 100 == 0) {
                sb2.append('0');
            }
            if (m24390f / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(m24390f);
        }
        m24352e(sb2, i11);
    }
}
