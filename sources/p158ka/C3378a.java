package p158ka;

import com.journeyapps.barcodescanner.C1393b;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p129ia.C2674f;
import p130ib.AbstractC2702q;
import p130ib.C2693h;
import p130ib.C2699n;
import p143ja.C3272a;
import p211oa.C3965b;
import p211oa.C3968e;
import qa.C4219a;
import qa.C4221c;
import qa.C4222d;

/* renamed from: ka.a */
/* loaded from: classes.dex */
public final class C3378a {

    /* renamed from: b */
    public static final String[] f11777b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    public static final String[] f11778c = {"CTRL_PS", " ", "a", C1393b.f5292o, "c", "d", "e", "f", "g", C2693h.f10528n, "i", "j", "k", "l", "m", C2699n.f10571b, "o", "p", AbstractC2702q.f10572a, "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    public static final String[] f11779d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    public static final String[] f11780e = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    public static final String[] f11781f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: g */
    public static final Charset f11782g = StandardCharsets.ISO_8859_1;

    /* renamed from: a */
    public C3272a f11783a;

    /* renamed from: ka.a$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11784a;

        static {
            int[] iArr = new int[c.values().length];
            f11784a = iArr;
            try {
                iArr[c.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11784a[c.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11784a[c.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11784a[c.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f11784a[c.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: ka.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final boolean[] f11785a;

        /* renamed from: b */
        public final int f11786b;

        public b(boolean[] zArr, int i10) {
            this.f11785a = zArr;
            this.f11786b = i10;
        }
    }

    /* renamed from: ka.a$c */
    /* loaded from: classes.dex */
    public enum c {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    public static byte[] m12564a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = m12568h(zArr, i10 * 8);
        }
        return bArr;
    }

    /* renamed from: e */
    public static String m12565e(c cVar, int i10) {
        int i11 = a.f11784a[cVar.ordinal()];
        if (i11 == 1) {
            return f11777b[i10];
        }
        if (i11 == 2) {
            return f11778c[i10];
        }
        if (i11 == 3) {
            return f11779d[i10];
        }
        if (i11 == 4) {
            return f11780e[i10];
        }
        if (i11 == 5) {
            return f11781f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        throw p129ia.C2674f.m10883a();
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m12566f(boolean[] r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p158ka.C3378a.m12566f(boolean[]):java.lang.String");
    }

    /* renamed from: g */
    public static c m12567g(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? c.UPPER : c.MIXED : c.LOWER : c.PUNCT : c.DIGIT : c.BINARY;
    }

    /* renamed from: h */
    public static byte m12568h(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? m12569i(zArr, i10, 8) : m12569i(zArr, i10, length) << (8 - length));
    }

    /* renamed from: i */
    public static int m12569i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    /* renamed from: j */
    public static int m12570j(int i10, boolean z10) {
        return ((z10 ? 88 : C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) + (i10 * 16)) * i10;
    }

    /* renamed from: b */
    public final b m12571b(boolean[] zArr) {
        C4219a c4219a;
        int i10 = 8;
        if (this.f11783a.m11828d() <= 2) {
            i10 = 6;
            c4219a = C4219a.f15196j;
        } else if (this.f11783a.m11828d() <= 8) {
            c4219a = C4219a.f15200n;
        } else if (this.f11783a.m11828d() <= 22) {
            i10 = 10;
            c4219a = C4219a.f15195i;
        } else {
            i10 = 12;
            c4219a = C4219a.f15194h;
        }
        int m11827c = this.f11783a.m11827c();
        int length = zArr.length / i10;
        if (length < m11827c) {
            throw C2674f.m10883a();
        }
        int length2 = zArr.length % i10;
        int[] iArr = new int[length];
        int i11 = 0;
        while (i11 < length) {
            iArr[i11] = m12569i(zArr, length2, i10);
            i11++;
            length2 += i10;
        }
        try {
            C4221c c4221c = new C4221c(c4219a);
            int i12 = length - m11827c;
            c4221c.m16261a(iArr, i12);
            int i13 = (1 << i10) - 1;
            int i14 = 0;
            for (int i15 = 0; i15 < m11827c; i15++) {
                int i16 = iArr[i15];
                if (i16 == 0 || i16 == i13) {
                    throw C2674f.m10883a();
                }
                if (i16 == 1 || i16 == i13 - 1) {
                    i14++;
                }
            }
            boolean[] zArr2 = new boolean[(m11827c * i10) - i14];
            int i17 = 0;
            for (int i18 = 0; i18 < m11827c; i18++) {
                int i19 = iArr[i18];
                if (i19 == 1 || i19 == i13 - 1) {
                    Arrays.fill(zArr2, i17, (i17 + i10) - 1, i19 > 1);
                    i17 += i10 - 1;
                } else {
                    int i20 = i10 - 1;
                    while (i20 >= 0) {
                        int i21 = i17 + 1;
                        zArr2[i17] = ((1 << i20) & i19) != 0;
                        i20--;
                        i17 = i21;
                    }
                }
            }
            return new b(zArr2, (i12 * 100) / length);
        } catch (C4222d e10) {
            throw C2674f.m10884b(e10);
        }
    }

    /* renamed from: c */
    public C3968e m12572c(C3272a c3272a) {
        this.f11783a = c3272a;
        b m12571b = m12571b(m12573d(c3272a.m15070a()));
        C3968e c3968e = new C3968e(m12564a(m12571b.f11785a), m12566f(m12571b.f11785a), null, String.format("%d%%", Integer.valueOf(m12571b.f11786b)));
        c3968e.m15066m(m12571b.f11785a.length);
        return c3968e;
    }

    /* renamed from: d */
    public final boolean[] m12573d(C3965b c3965b) {
        boolean m11829e = this.f11783a.m11829e();
        int m11828d = this.f11783a.m11828d();
        int i10 = (m11829e ? 11 : 14) + (m11828d * 4);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[m12570j(m11828d, m11829e)];
        int i11 = 2;
        if (m11829e) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                iArr[(i13 - i15) - 1] = (i14 - r12) - 1;
                iArr[i13 + i15] = (i15 / 15) + i15 + i14 + 1;
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < m11828d) {
            int i18 = ((m11828d - i16) * 4) + (m11829e ? 9 : 12);
            int i19 = i16 * 2;
            int i20 = (i10 - 1) - i19;
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21 * 2;
                int i23 = 0;
                while (i23 < i11) {
                    int i24 = i19 + i23;
                    int i25 = i19 + i21;
                    zArr[i17 + i22 + i23] = c3965b.m15035g(iArr[i24], iArr[i25]);
                    int i26 = iArr[i25];
                    int i27 = i20 - i23;
                    zArr[(i18 * 2) + i17 + i22 + i23] = c3965b.m15035g(i26, iArr[i27]);
                    int i28 = i20 - i21;
                    zArr[(i18 * 4) + i17 + i22 + i23] = c3965b.m15035g(iArr[i27], iArr[i28]);
                    zArr[(i18 * 6) + i17 + i22 + i23] = c3965b.m15035g(iArr[i28], iArr[i24]);
                    i23++;
                    m11828d = m11828d;
                    m11829e = m11829e;
                    i11 = 2;
                }
                i21++;
                i11 = 2;
            }
            i17 += i18 * 8;
            i16++;
            i11 = 2;
        }
        return zArr;
    }
}
