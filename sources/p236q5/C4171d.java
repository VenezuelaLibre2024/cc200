package p236q5;

import p222p5.C4015a0;

/* renamed from: q5.d */
/* loaded from: classes.dex */
public final class C4171d {

    /* renamed from: a */
    public final int f14995a;

    /* renamed from: b */
    public final int f14996b;

    /* renamed from: c */
    public final String f14997c;

    public C4171d(int i10, int i11, String str) {
        this.f14995a = i10;
        this.f14996b = i11;
        this.f14997c = str;
    }

    /* renamed from: a */
    public static C4171d m16032a(C4015a0 c4015a0) {
        String str;
        c4015a0.m15224U(2);
        int m15210G = c4015a0.m15210G();
        int i10 = m15210G >> 1;
        int m15210G2 = ((c4015a0.m15210G() >> 3) & 31) | ((m15210G & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else {
            if (i10 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i10);
        sb2.append(m15210G2 >= 10 ? "." : ".0");
        sb2.append(m15210G2);
        return new C4171d(i10, m15210G2, sb2.toString());
    }
}
