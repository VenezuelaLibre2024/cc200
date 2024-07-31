package p324wa;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.Arrays;
import java.util.Map;
import p079f6.C1841a;
import p129ia.C2672d;
import p129ia.C2674f;
import p129ia.C2678j;
import p129ia.C2682n;
import p129ia.C2684p;
import p129ia.EnumC2669a;
import p129ia.EnumC2673e;
import p129ia.EnumC2683o;
import p211oa.C3964a;

/* renamed from: wa.c */
/* loaded from: classes.dex */
public final class C5453c extends AbstractC5461k {

    /* renamed from: e */
    public static final int[] f20313e = {52, 289, 97, 352, 49, 304, C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    public final boolean f20314a;

    /* renamed from: b */
    public final boolean f20315b;

    /* renamed from: c */
    public final StringBuilder f20316c;

    /* renamed from: d */
    public final int[] f20317d;

    public C5453c() {
        this(false);
    }

    public C5453c(boolean z10) {
        this(z10, false);
    }

    public C5453c(boolean z10, boolean z11) {
        this.f20314a = z10;
        this.f20315b = z11;
        this.f20316c = new StringBuilder(20);
        this.f20317d = new int[9];
    }

    /* renamed from: h */
    public static String m21624h(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i11++;
                char charAt2 = charSequence.charAt(i11);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i10 = charAt2 - ' ';
                                } else {
                                    if (charAt2 != 'Z') {
                                        throw C2674f.m10883a();
                                    }
                                    charAt = ':';
                                }
                            }
                            charAt = 0;
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw C2674f.m10883a();
                            }
                            i10 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i10 = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i10 = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i10 = charAt2 + 16;
                    } else if (charAt2 < 'P' || charAt2 > 'T') {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                charAt = '@';
                            } else if (charAt2 == 'W') {
                                charAt = '`';
                            } else {
                                if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                    throw C2674f.m10883a();
                                }
                                charAt = 127;
                            }
                        }
                        charAt = 0;
                    } else {
                        i10 = charAt2 + '+';
                    }
                } else {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        throw C2674f.m10883a();
                    }
                    i10 = charAt2 - '@';
                }
                charAt = (char) i10;
            }
            sb2.append(charAt);
            i11++;
        }
        return sb2.toString();
    }

    /* renamed from: i */
    public static int[] m21625i(C3964a c3964a, int[] iArr) {
        int m15026i = c3964a.m15026i();
        int m15024g = c3964a.m15024g(0);
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
                    if (m21627k(iArr) == 148 && c3964a.m15027k(Math.max(0, i11 - ((m15024g - i11) / 2)), i11, false)) {
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

    /* renamed from: j */
    public static char m21626j(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f20313e;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw C2678j.m10895a();
            }
            if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            }
            i11++;
        }
    }

    /* renamed from: k */
    public static int m21627k(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = C1841a.e.API_PRIORITY_OTHER;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if (i19 * 2 >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            }
            if (i13 <= 3) {
                return -1;
            }
            i10 = i11;
        }
    }

    @Override // p324wa.AbstractC5461k
    /* renamed from: c */
    public C2682n mo21616c(int i10, C3964a c3964a, Map<EnumC2673e, ?> map) {
        int[] iArr = this.f20317d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f20316c;
        sb2.setLength(0);
        int m15024g = c3964a.m15024g(m21625i(c3964a, iArr)[1]);
        int m15026i = c3964a.m15026i();
        while (true) {
            AbstractC5461k.m21648f(c3964a, m15024g, iArr);
            int m21627k = m21627k(iArr);
            if (m21627k < 0) {
                throw C2678j.m10895a();
            }
            char m21626j = m21626j(m21627k);
            sb2.append(m21626j);
            int i11 = m15024g;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int m15024g2 = c3964a.m15024g(i11);
            if (m21626j == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int i15 = (m15024g2 - m15024g) - i13;
                if (m15024g2 != m15026i && i15 * 2 < i13) {
                    throw C2678j.m10895a();
                }
                if (this.f20314a) {
                    int length = sb2.length() - 1;
                    int i16 = 0;
                    for (int i17 = 0; i17 < length; i17++) {
                        i16 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f20316c.charAt(i17));
                    }
                    if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16 % 43)) {
                        throw C2672d.m10881a();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw C2678j.m10895a();
                }
                float f10 = i10;
                C2682n c2682n = new C2682n(this.f20315b ? m21624h(sb2) : sb2.toString(), null, new C2684p[]{new C2684p((r2[1] + r2[0]) / 2.0f, f10), new C2684p(m15024g + (i13 / 2.0f), f10)}, EnumC2669a.CODE_39);
                c2682n.m10904h(EnumC2683o.SYMBOLOGY_IDENTIFIER, "]A0");
                return c2682n;
            }
            m15024g = m15024g2;
        }
    }
}
