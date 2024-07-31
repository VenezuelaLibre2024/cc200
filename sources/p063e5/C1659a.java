package p063e5;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p047d5.AbstractC1558m;
import p047d5.C1547b;
import p047d5.C1557l;
import p047d5.InterfaceC1553h;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: e5.a */
/* loaded from: classes.dex */
public final class C1659a extends AbstractC1663e {

    /* renamed from: h */
    public final int f6135h;

    /* renamed from: i */
    public final int f6136i;

    /* renamed from: j */
    public final int f6137j;

    /* renamed from: k */
    public final long f6138k;

    /* renamed from: n */
    public List<C1547b> f6141n;

    /* renamed from: o */
    public List<C1547b> f6142o;

    /* renamed from: p */
    public int f6143p;

    /* renamed from: q */
    public int f6144q;

    /* renamed from: r */
    public boolean f6145r;

    /* renamed from: s */
    public boolean f6146s;

    /* renamed from: t */
    public byte f6147t;

    /* renamed from: u */
    public byte f6148u;

    /* renamed from: w */
    public boolean f6150w;

    /* renamed from: x */
    public long f6151x;

    /* renamed from: y */
    public static final int[] f6132y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    public static final int[] f6133z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    public static final int[] f6126A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    public static final int[] f6127B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, C1417R.styleable.AppCompatTheme_switchStyle, C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, C1417R.styleable.AppCompatTheme_textAppearanceListItem, C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary, C1417R.styleable.AppCompatTheme_textAppearanceListItemSmall, C1417R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, C1417R.styleable.AppCompatTheme_textColorAlertDialogListItem, C1417R.styleable.AppCompatTheme_textColorSearchUrl, C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, C1417R.styleable.AppCompatTheme_toolbarStyle, C1417R.styleable.AppCompatTheme_tooltipForegroundColor, C1417R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    public static final int[] f6128C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    public static final int[] f6129D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    public static final int[] f6130E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    public static final boolean[] f6131F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    public final C4015a0 f6134g = new C4015a0();

    /* renamed from: l */
    public final ArrayList<a> f6139l = new ArrayList<>();

    /* renamed from: m */
    public a f6140m = new a(0, 4);

    /* renamed from: v */
    public int f6149v = 0;

    /* renamed from: e5.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final List<C6159a> f6152a = new ArrayList();

        /* renamed from: b */
        public final List<SpannableString> f6153b = new ArrayList();

        /* renamed from: c */
        public final StringBuilder f6154c = new StringBuilder();

        /* renamed from: d */
        public int f6155d;

        /* renamed from: e */
        public int f6156e;

        /* renamed from: f */
        public int f6157f;

        /* renamed from: g */
        public int f6158g;

        /* renamed from: h */
        public int f6159h;

        /* renamed from: e5.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C6159a {

            /* renamed from: a */
            public final int f6160a;

            /* renamed from: b */
            public final boolean f6161b;

            /* renamed from: c */
            public int f6162c;

            public C6159a(int i10, boolean z10, int i11) {
                this.f6160a = i10;
                this.f6161b = z10;
                this.f6162c = i11;
            }
        }

        public a(int i10, int i11) {
            m6625j(i10);
            this.f6159h = i11;
        }

        /* renamed from: n */
        public static void m6617n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        /* renamed from: o */
        public static void m6618o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        /* renamed from: q */
        public static void m6619q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        /* renamed from: e */
        public void m6620e(char c10) {
            if (this.f6154c.length() < 32) {
                this.f6154c.append(c10);
            }
        }

        /* renamed from: f */
        public void m6621f() {
            int length = this.f6154c.length();
            if (length > 0) {
                this.f6154c.delete(length - 1, length);
                for (int size = this.f6152a.size() - 1; size >= 0; size--) {
                    C6159a c6159a = this.f6152a.get(size);
                    int i10 = c6159a.f6162c;
                    if (i10 != length) {
                        return;
                    }
                    c6159a.f6162c = i10 - 1;
                }
            }
        }

        /* renamed from: g */
        public C1547b m6622g(int i10) {
            float f10;
            int i11 = this.f6156e + this.f6157f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f6153b.size(); i13++) {
                spannableStringBuilder.append(C4041n0.m15440X0(this.f6153b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(C4041n0.m15440X0(m6623h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f6158g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f6158g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f6155d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f6158g == 1) {
                i15 -= this.f6159h - 1;
            }
            return new C1547b.b().m6332o(spannableStringBuilder).m6333p(Layout.Alignment.ALIGN_NORMAL).m6325h(i15, 1).m6328k(f10).m6329l(i10).m6318a();
        }

        /* renamed from: h */
        public final SpannableString m6623h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f6154c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (i10 < this.f6152a.size()) {
                C6159a c6159a = this.f6152a.get(i10);
                boolean z11 = c6159a.f6161b;
                int i16 = c6159a.f6160a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = C1659a.f6126A[i16];
                    }
                    z10 = z12;
                }
                int i17 = c6159a.f6162c;
                i10++;
                if (i17 != (i10 < this.f6152a.size() ? this.f6152a.get(i10).f6162c : length)) {
                    if (i12 != -1 && !z11) {
                        m6619q(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i17;
                    }
                    if (i13 != -1 && !z10) {
                        m6618o(spannableStringBuilder, i13, i17);
                        i13 = -1;
                    } else if (i13 == -1 && z10) {
                        i13 = i17;
                    }
                    if (i15 != i14) {
                        m6617n(spannableStringBuilder, i11, i17, i14);
                        i14 = i15;
                        i11 = i17;
                    }
                }
            }
            if (i12 != -1 && i12 != length) {
                m6619q(spannableStringBuilder, i12, length);
            }
            if (i13 != -1 && i13 != length) {
                m6618o(spannableStringBuilder, i13, length);
            }
            if (i11 != length) {
                m6617n(spannableStringBuilder, i11, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: i */
        public boolean m6624i() {
            return this.f6152a.isEmpty() && this.f6153b.isEmpty() && this.f6154c.length() == 0;
        }

        /* renamed from: j */
        public void m6625j(int i10) {
            this.f6158g = i10;
            this.f6152a.clear();
            this.f6153b.clear();
            this.f6154c.setLength(0);
            this.f6155d = 15;
            this.f6156e = 0;
            this.f6157f = 0;
        }

        /* renamed from: k */
        public void m6626k() {
            this.f6153b.add(m6623h());
            this.f6154c.setLength(0);
            this.f6152a.clear();
            int min = Math.min(this.f6159h, this.f6155d);
            while (this.f6153b.size() >= min) {
                this.f6153b.remove(0);
            }
        }

        /* renamed from: l */
        public void m6627l(int i10) {
            this.f6158g = i10;
        }

        /* renamed from: m */
        public void m6628m(int i10) {
            this.f6159h = i10;
        }

        /* renamed from: p */
        public void m6629p(int i10, boolean z10) {
            this.f6152a.add(new C6159a(i10, z10, this.f6154c.length()));
        }
    }

    public C1659a(String str, int i10, long j10) {
        this.f6138k = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f6135h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 != 1) {
            if (i10 == 2) {
                this.f6137j = 1;
                this.f6136i = 0;
                m6599M(0);
                m6598L();
                this.f6150w = true;
                this.f6151x = -9223372036854775807L;
            }
            if (i10 == 3) {
                this.f6137j = 0;
            } else if (i10 != 4) {
                C4046r.m15529i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.f6137j = 1;
            }
            this.f6136i = 1;
            m6599M(0);
            m6598L();
            this.f6150w = true;
            this.f6151x = -9223372036854775807L;
        }
        this.f6137j = 0;
        this.f6136i = 0;
        m6599M(0);
        m6598L();
        this.f6150w = true;
        this.f6151x = -9223372036854775807L;
    }

    /* renamed from: A */
    public static boolean m6579A(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    /* renamed from: B */
    public static boolean m6580B(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    /* renamed from: C */
    public static boolean m6581C(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    /* renamed from: D */
    public static boolean m6582D(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    /* renamed from: E */
    public static boolean m6583E(byte b10) {
        return (b10 & 240) == 16;
    }

    /* renamed from: G */
    public static boolean m6584G(byte b10) {
        return (b10 & 246) == 20;
    }

    /* renamed from: H */
    public static boolean m6585H(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    /* renamed from: I */
    public static boolean m6586I(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    /* renamed from: J */
    public static boolean m6587J(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    /* renamed from: p */
    public static char m6589p(byte b10) {
        return (char) f6127B[(b10 & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: q */
    public static int m6590q(byte b10) {
        return (b10 >> 3) & 1;
    }

    /* renamed from: s */
    public static char m6591s(byte b10) {
        return (char) f6129D[b10 & 31];
    }

    /* renamed from: t */
    public static char m6592t(byte b10) {
        return (char) f6130E[b10 & 31];
    }

    /* renamed from: u */
    public static char m6593u(byte b10, byte b11) {
        return (b10 & 1) == 0 ? m6591s(b11) : m6592t(b11);
    }

    /* renamed from: v */
    public static char m6594v(byte b10) {
        return (char) f6128C[b10 & 15];
    }

    /* renamed from: z */
    public static boolean m6595z(byte b10) {
        return (b10 & 224) == 0;
    }

    /* renamed from: F */
    public final boolean m6596F(boolean z10, byte b10, byte b11) {
        if (!z10 || !m6583E(b10)) {
            this.f6146s = false;
        } else {
            if (this.f6146s && this.f6147t == b10 && this.f6148u == b11) {
                this.f6146s = false;
                return true;
            }
            this.f6146s = true;
            this.f6147t = b10;
            this.f6148u = b11;
        }
        return false;
    }

    /* renamed from: K */
    public final void m6597K(byte b10, byte b11) {
        if (!m6587J(b10)) {
            if (m6584G(b10)) {
                if (b11 != 32 && b11 != 47) {
                    switch (b11) {
                        default:
                            switch (b11) {
                                case C1417R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                                    break;
                                case C1417R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                                case C1417R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                                    break;
                                default:
                                    return;
                            }
                        case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                        case C1417R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                        case C1417R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                            this.f6150w = true;
                            return;
                    }
                }
                this.f6150w = true;
                return;
            }
            return;
        }
        this.f6150w = false;
    }

    /* renamed from: L */
    public final void m6598L() {
        this.f6140m.m6625j(this.f6143p);
        this.f6139l.clear();
        this.f6139l.add(this.f6140m);
    }

    /* renamed from: M */
    public final void m6599M(int i10) {
        int i11 = this.f6143p;
        if (i11 == i10) {
            return;
        }
        this.f6143p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f6139l.size(); i12++) {
                this.f6139l.get(i12).m6627l(i10);
            }
            return;
        }
        m6598L();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f6141n = Collections.emptyList();
        }
    }

    /* renamed from: N */
    public final void m6600N(int i10) {
        this.f6144q = i10;
        this.f6140m.m6628m(i10);
    }

    /* renamed from: O */
    public final boolean m6601O() {
        return (this.f6138k == -9223372036854775807L || this.f6151x == -9223372036854775807L || m6669j() - this.f6151x < this.f6138k) ? false : true;
    }

    /* renamed from: P */
    public final boolean m6602P(byte b10) {
        if (m6595z(b10)) {
            this.f6149v = m6590q(b10);
        }
        return this.f6149v == this.f6137j;
    }

    @Override // p063e5.AbstractC1663e, p047d5.InterfaceC1554i
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo6341a(long j10) {
        super.mo6341a(j10);
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: e */
    public InterfaceC1553h mo6603e() {
        List<C1547b> list = this.f6141n;
        this.f6142o = list;
        return new C1664f((List) C4014a.m15199e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0018 A[SYNTHETIC] */
    @Override // p063e5.AbstractC1663e
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6604f(p047d5.C1557l r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p063e5.C1659a.mo6604f(d5.l):void");
    }

    @Override // p063e5.AbstractC1663e, p304v3.InterfaceC5107d
    public void flush() {
        super.flush();
        this.f6141n = null;
        this.f6142o = null;
        m6599M(0);
        m6600N(4);
        m6598L();
        this.f6145r = false;
        this.f6146s = false;
        this.f6147t = (byte) 0;
        this.f6148u = (byte) 0;
        this.f6149v = 0;
        this.f6150w = true;
        this.f6151x = -9223372036854775807L;
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C1557l mo6343c() {
        return super.mo6343c();
    }

    @Override // p063e5.AbstractC1663e, p304v3.InterfaceC5107d
    /* renamed from: h */
    public AbstractC1558m mo6342b() {
        AbstractC1558m m6668i;
        AbstractC1558m mo6342b = super.mo6342b();
        if (mo6342b != null) {
            return mo6342b;
        }
        if (!m6601O() || (m6668i = m6668i()) == null) {
            return null;
        }
        this.f6141n = Collections.emptyList();
        this.f6151x = -9223372036854775807L;
        m6668i.m6367w(m6669j(), mo6603e(), Long.MAX_VALUE);
        return m6668i;
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: k */
    public boolean mo6607k() {
        return this.f6141n != this.f6142o;
    }

    @Override // p063e5.AbstractC1663e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo6344d(C1557l c1557l) {
        super.mo6344d(c1557l);
    }

    /* renamed from: r */
    public final List<C1547b> m6609r() {
        int size = this.f6139l.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            C1547b m6622g = this.f6139l.get(i11).m6622g(Integer.MIN_VALUE);
            arrayList.add(m6622g);
            if (m6622g != null) {
                i10 = Math.min(i10, m6622g.f5789p);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            C1547b c1547b = (C1547b) arrayList.get(i12);
            if (c1547b != null) {
                if (c1547b.f5789p != i10) {
                    c1547b = (C1547b) C4014a.m15199e(this.f6139l.get(i12).m6622g(i10));
                }
                arrayList2.add(c1547b);
            }
        }
        return arrayList2;
    }

    @Override // p063e5.AbstractC1663e, p304v3.InterfaceC5107d
    public void release() {
    }

    /* renamed from: w */
    public final void m6610w(byte b10) {
        this.f6140m.m6620e(' ');
        this.f6140m.m6629p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    /* renamed from: x */
    public final void m6611x(byte b10) {
        if (b10 == 32) {
            m6599M(2);
            return;
        }
        if (b10 == 41) {
            m6599M(3);
            return;
        }
        switch (b10) {
            case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                m6599M(1);
                m6600N(2);
                return;
            case C1417R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                m6599M(1);
                m6600N(3);
                return;
            case C1417R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                m6599M(1);
                m6600N(4);
                return;
            default:
                int i10 = this.f6143p;
                if (i10 == 0) {
                    return;
                }
                if (b10 == 33) {
                    this.f6140m.m6621f();
                    return;
                }
                switch (b10) {
                    case C1417R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                        this.f6141n = Collections.emptyList();
                        int i11 = this.f6143p;
                        if (i11 != 1 && i11 != 3) {
                            return;
                        }
                        break;
                    case C1417R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                        if (i10 != 1 || this.f6140m.m6624i()) {
                            return;
                        }
                        this.f6140m.m6626k();
                        return;
                    case C1417R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                        break;
                    case C1417R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                        this.f6141n = m6609r();
                        break;
                    default:
                        return;
                }
                m6598L();
                return;
        }
    }

    /* renamed from: y */
    public final void m6612y(byte b10, byte b11) {
        int i10 = f6132y[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f6140m.f6155d) {
            if (this.f6143p != 1 && !this.f6140m.m6624i()) {
                a aVar = new a(this.f6143p, this.f6144q);
                this.f6140m = aVar;
                this.f6139l.add(aVar);
            }
            this.f6140m.f6155d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f6140m.m6629p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f6140m.f6156e = f6133z[i11];
        }
    }
}
