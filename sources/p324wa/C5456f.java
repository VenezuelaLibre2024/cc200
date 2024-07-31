package p324wa;

import p129ia.EnumC2669a;
import p211oa.C3964a;

/* renamed from: wa.f */
/* loaded from: classes.dex */
public final class C5456f extends AbstractC5466p {

    /* renamed from: i */
    public final int[] f20325i = new int[4];

    @Override // p324wa.AbstractC5466p
    /* renamed from: l */
    public int mo21635l(C3964a c3964a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f20325i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m15026i = c3964a.m15026i();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < m15026i; i11++) {
            sb2.append((char) (AbstractC5466p.m21664j(c3964a, iArr2, i10, AbstractC5466p.f20349g) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = AbstractC5466p.m21665n(c3964a, i10, true, AbstractC5466p.f20347e)[1];
        for (int i14 = 0; i14 < 4 && i13 < m15026i; i14++) {
            sb2.append((char) (AbstractC5466p.m21664j(c3964a, iArr2, i13, AbstractC5466p.f20349g) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: q */
    public EnumC2669a mo21636q() {
        return EnumC2669a.EAN_8;
    }
}
