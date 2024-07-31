package p324wa;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.Arrays;
import java.util.Map;
import p129ia.C2672d;
import p129ia.C2674f;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p211oa.C3964a;

/* renamed from: wa.d */
/* loaded from: classes.dex */
public final class C5454d extends AbstractC5461k {

    /* renamed from: c */
    public static final char[] f20318c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    public static final int[] f20319d;

    /* renamed from: e */
    public static final int f20320e;

    /* renamed from: a */
    public final StringBuilder f20321a = new StringBuilder(20);

    /* renamed from: b */
    public final int[] f20322b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f20319d = iArr;
        f20320e = iArr[47];
    }

    /* renamed from: h */
    public static void m21628h(CharSequence charSequence) {
        int length = charSequence.length();
        m21629i(charSequence, length - 2, 20);
        m21629i(charSequence, length - 1, 15);
    }

    /* renamed from: i */
    public static void m21629i(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != f20318c[i12 % 47]) {
            throw C2672d.m10881a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    /* renamed from: j */
    public static String m21630j(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i11 >= length - 1) {
                    throw C2674f.m10883a();
                }
                i11++;
                char charAt2 = charSequence.charAt(i11);
                switch (charAt) {
                    case C1417R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i10 = charAt2 - '@';
                            charAt = (char) i10;
                            break;
                        } else {
                            throw C2674f.m10883a();
                        }
                        break;
                    case C1417R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /* 98 */:
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i10 = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i10 = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i10 = charAt2 + 16;
                        } else if (charAt2 < 'P' || charAt2 > 'T') {
                            if (charAt2 != 'U') {
                                if (charAt2 != 'V') {
                                    if (charAt2 != 'W') {
                                        if (charAt2 >= 'X' && charAt2 <= 'Z') {
                                            charAt = 127;
                                            break;
                                        } else {
                                            throw C2674f.m10883a();
                                        }
                                    } else {
                                        charAt = '`';
                                        break;
                                    }
                                } else {
                                    charAt = '@';
                                    break;
                                }
                            }
                            charAt = 0;
                            break;
                        } else {
                            i10 = charAt2 + '+';
                        }
                        charAt = (char) i10;
                        break;
                    case C1417R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i10 = charAt2 - ' ';
                            charAt = (char) i10;
                            break;
                        } else {
                            if (charAt2 != 'Z') {
                                throw C2674f.m10883a();
                            }
                            charAt = ':';
                            break;
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i10 = charAt2 + ' ';
                            charAt = (char) i10;
                            break;
                        } else {
                            throw C2674f.m10883a();
                        }
                    default:
                        charAt = 0;
                        break;
                }
            }
            sb2.append(charAt);
            i11++;
        }
        return sb2.toString();
    }

    /* renamed from: l */
    public static char m21631l(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f20319d;
            if (i11 >= iArr.length) {
                throw C2678j.m10895a();
            }
            if (iArr[i11] == i10) {
                return f20318c[i11];
            }
            i11++;
        }
    }

    /* renamed from: m */
    public static int m21632m(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((iArr[i13] * 9.0f) / i10);
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < round; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= round;
            }
        }
        return i12;
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        int m15024g = c3964a.m15024g(m21633k(c3964a)[1]);
        int m15026i = c3964a.m15026i();
        int[] iArr = this.f20322b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f20321a;
        sb2.setLength(0);
        while (true) {
            AbstractC5461k.m21648f(c3964a, m15024g, iArr);
            int m21632m = m21632m(iArr);
            if (m21632m < 0) {
                throw C2678j.m10895a();
            }
            char m21631l = m21631l(m21632m);
            sb2.append(m21631l);
            int i11 = m15024g;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int m15024g2 = c3964a.m15024g(i11);
            if (m21631l == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (m15024g2 == m15026i || !c3964a.m15022e(m15024g2)) {
                    throw C2678j.m10895a();
                }
                if (sb2.length() < 2) {
                    throw C2678j.m10895a();
                }
                m21628h(sb2);
                sb2.setLength(sb2.length() - 2);
                float f10 = i10;
                C2682n c2682n = new C2682n(m21630j(sb2), null, new C2684p[]{new C2684p((r14[1] + r14[0]) / 2.0f, f10), new C2684p(m15024g + (i13 / 2.0f), f10)}, EnumC2669a.CODE_93);
                c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]G0");
                return c2682n;
            }
            m15024g = m15024g2;
        }
    }

    /* renamed from: k */
    public final int[] m21633k(C3964a c3964a) {
        int m15026i = c3964a.m15026i();
        int m15024g = c3964a.m15024g(0);
        Arrays.fill(this.f20322b, 0);
        int[] iArr = this.f20322b;
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = m15024g;
        while (m15024g < m15026i) {
            if (c3964a.m15022e(m15024g) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (m21632m(iArr) == f20320e) {
                        return new int[]{i11, m15024g};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            m15024g++;
        }
        throw C2678j.m10895a();
    }
}
