package p324wa;

import p129ia.C2678j;
import p129ia.EnumC2669a;
import p211oa.C3964a;

/* renamed from: wa.e */
/* loaded from: classes.dex */
public final class C5455e extends AbstractC5466p {

    /* renamed from: j */
    public static final int[] f20323j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    public final int[] f20324i = new int[4];

    /* renamed from: s */
    public static void m21634s(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f20323j[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw C2678j.m10895a();
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: l */
    public int mo21635l(C3964a c3964a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f20324i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m15026i = c3964a.m15026i();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < m15026i; i12++) {
            int m21664j = AbstractC5466p.m21664j(c3964a, iArr2, i10, AbstractC5466p.f20350h);
            sb2.append((char) ((m21664j % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (m21664j >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        m21634s(sb2, i11);
        int i14 = AbstractC5466p.m21665n(c3964a, i10, true, AbstractC5466p.f20347e)[1];
        for (int i15 = 0; i15 < 6 && i14 < m15026i; i15++) {
            sb2.append((char) (AbstractC5466p.m21664j(c3964a, iArr2, i14, AbstractC5466p.f20349g) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        return i14;
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: q */
    public EnumC2669a mo21636q() {
        return EnumC2669a.EAN_13;
    }
}
