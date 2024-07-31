package p324wa;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import p129ia.C2678j;
import p129ia.EnumC2669a;
import p211oa.C3964a;

/* renamed from: wa.q */
/* loaded from: classes.dex */
public final class C5467q extends AbstractC5466p {

    /* renamed from: j */
    public static final int[] f20354j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    public static final int[][] f20355k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    public final int[] f20356i = new int[4];

    /* renamed from: s */
    public static String m21671s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case C1417R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
            case C1417R.styleable.AppCompatTheme_colorAccent /* 50 */:
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case C1417R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case C1417R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    /* renamed from: t */
    public static void m21672t(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f20355k[i11][i12]) {
                    sb2.insert(0, (char) (i11 + 48));
                    sb2.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw C2678j.m10895a();
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: h */
    public boolean mo21669h(String str) {
        return super.mo21669h(m21671s(str));
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: k */
    public int[] mo21670k(C3964a c3964a, int i10) {
        return AbstractC5466p.m21665n(c3964a, i10, true, f20354j);
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: l */
    public int mo21635l(C3964a c3964a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f20356i;
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
        m21672t(sb2, i11);
        return i10;
    }

    @Override // p324wa.AbstractC5466p
    /* renamed from: q */
    public EnumC2669a mo21636q() {
        return EnumC2669a.UPC_E;
    }
}
