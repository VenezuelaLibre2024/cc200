package p084fb;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import p129ia.C2674f;
import p211oa.C3965b;

/* renamed from: fb.j */
/* loaded from: classes.dex */
public final class C1897j {

    /* renamed from: e */
    public static final int[] f7171e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: f */
    public static final C1897j[] f7172f = m7751b();

    /* renamed from: a */
    public final int f7173a;

    /* renamed from: b */
    public final int[] f7174b;

    /* renamed from: c */
    public final b[] f7175c;

    /* renamed from: d */
    public final int f7176d;

    /* renamed from: fb.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f7177a;

        /* renamed from: b */
        public final int f7178b;

        public a(int i10, int i11) {
            this.f7177a = i10;
            this.f7178b = i11;
        }

        /* renamed from: a */
        public int m7761a() {
            return this.f7177a;
        }

        /* renamed from: b */
        public int m7762b() {
            return this.f7178b;
        }
    }

    /* renamed from: fb.j$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f7179a;

        /* renamed from: b */
        public final a[] f7180b;

        public b(int i10, a... aVarArr) {
            this.f7179a = i10;
            this.f7180b = aVarArr;
        }

        /* renamed from: a */
        public a[] m7763a() {
            return this.f7180b;
        }

        /* renamed from: b */
        public int m7764b() {
            return this.f7179a;
        }
    }

    public C1897j(int i10, int[] iArr, b... bVarArr) {
        this.f7173a = i10;
        this.f7174b = iArr;
        this.f7175c = bVarArr;
        int m7764b = bVarArr[0].m7764b();
        int i11 = 0;
        for (a aVar : bVarArr[0].m7763a()) {
            i11 += aVar.m7761a() * (aVar.m7762b() + m7764b);
        }
        this.f7176d = i11;
    }

    /* renamed from: b */
    public static C1897j[] m7751b() {
        return new C1897j[]{new C1897j(1, new int[0], new b(7, new a(1, 19)), new b(10, new a(1, 16)), new b(13, new a(1, 13)), new b(17, new a(1, 9))), new C1897j(2, new int[]{6, 18}, new b(10, new a(1, 34)), new b(16, new a(1, 28)), new b(22, new a(1, 22)), new b(28, new a(1, 16))), new C1897j(3, new int[]{6, 22}, new b(15, new a(1, 55)), new b(26, new a(1, 44)), new b(18, new a(2, 17)), new b(22, new a(2, 13))), new C1897j(4, new int[]{6, 26}, new b(20, new a(1, 80)), new b(18, new a(2, 32)), new b(26, new a(2, 24)), new b(16, new a(4, 9))), new C1897j(5, new int[]{6, 30}, new b(26, new a(1, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new b(24, new a(2, 43)), new b(18, new a(2, 15), new a(2, 16)), new b(22, new a(2, 11), new a(2, 12))), new C1897j(6, new int[]{6, 34}, new b(18, new a(2, 68)), new b(16, new a(4, 27)), new b(24, new a(4, 19)), new b(28, new a(4, 15))), new C1897j(7, new int[]{6, 22, 38}, new b(20, new a(2, 78)), new b(18, new a(4, 31)), new b(18, new a(2, 14), new a(4, 15)), new b(26, new a(4, 13), new a(1, 14))), new C1897j(8, new int[]{6, 24, 42}, new b(24, new a(2, 97)), new b(22, new a(2, 38), new a(2, 39)), new b(22, new a(4, 18), new a(2, 19)), new b(26, new a(4, 14), new a(2, 15))), new C1897j(9, new int[]{6, 26, 46}, new b(30, new a(2, 116)), new b(22, new a(3, 36), new a(2, 37)), new b(20, new a(4, 16), new a(4, 17)), new b(24, new a(4, 12), new a(4, 13))), new C1897j(10, new int[]{6, 28, 50}, new b(18, new a(2, 68), new a(2, 69)), new b(26, new a(4, 43), new a(1, 44)), new b(24, new a(6, 19), new a(2, 20)), new b(28, new a(6, 15), new a(2, 16))), new C1897j(11, new int[]{6, 30, 54}, new b(20, new a(4, 81)), new b(30, new a(1, 50), new a(4, 51)), new b(28, new a(4, 22), new a(4, 23)), new b(24, new a(3, 12), new a(8, 13))), new C1897j(12, new int[]{6, 32, 58}, new b(24, new a(2, 92), new a(2, 93)), new b(22, new a(6, 36), new a(2, 37)), new b(26, new a(4, 20), new a(6, 21)), new b(28, new a(7, 14), new a(4, 15))), new C1897j(13, new int[]{6, 34, 62}, new b(26, new a(4, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle)), new b(22, new a(8, 37), new a(1, 38)), new b(24, new a(8, 20), new a(4, 21)), new b(22, new a(12, 11), new a(4, 12))), new C1897j(14, new int[]{6, 26, 46, 66}, new b(30, new a(3, C1417R.styleable.AppCompatTheme_tooltipFrameBackground), new a(1, 116)), new b(24, new a(4, 40), new a(5, 41)), new b(20, new a(11, 16), new a(5, 17)), new b(24, new a(11, 12), new a(5, 13))), new C1897j(15, new int[]{6, 26, 48, 70}, new b(22, new a(5, 87), new a(1, 88)), new b(24, new a(5, 41), new a(5, 42)), new b(30, new a(5, 24), new a(7, 25)), new b(24, new a(11, 12), new a(7, 13))), new C1897j(16, new int[]{6, 26, 50, 74}, new b(24, new a(5, 98), new a(1, 99)), new b(28, new a(7, 45), new a(3, 46)), new b(24, new a(15, 19), new a(2, 20)), new b(30, new a(3, 15), new a(13, 16))), new C1897j(17, new int[]{6, 30, 54, 78}, new b(28, new a(1, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle), new a(5, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new b(28, new a(10, 46), new a(1, 47)), new b(28, new a(1, 22), new a(15, 23)), new b(28, new a(2, 14), new a(17, 15))), new C1897j(18, new int[]{6, 30, 56, 82}, new b(30, new a(5, 120), new a(1, 121)), new b(26, new a(9, 43), new a(4, 44)), new b(28, new a(17, 22), new a(1, 23)), new b(28, new a(2, 14), new a(19, 15))), new C1897j(19, new int[]{6, 30, 58, 86}, new b(28, new a(3, C1417R.styleable.AppCompatTheme_toolbarStyle), new a(4, C1417R.styleable.AppCompatTheme_tooltipForegroundColor)), new b(26, new a(3, 44), new a(11, 45)), new b(26, new a(17, 21), new a(4, 22)), new b(26, new a(9, 13), new a(16, 14))), new C1897j(20, new int[]{6, 34, 62, 90}, new b(28, new a(3, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle), new a(5, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle)), new b(26, new a(3, 41), new a(13, 42)), new b(30, new a(15, 24), new a(5, 25)), new b(28, new a(15, 15), new a(10, 16))), new C1897j(21, new int[]{6, 28, 50, 72, 94}, new b(28, new a(4, 116), new a(4, 117)), new b(26, new a(17, 42)), new b(28, new a(17, 22), new a(6, 23)), new b(30, new a(19, 16), new a(6, 17))), new C1897j(22, new int[]{6, 26, 50, 74, 98}, new b(28, new a(2, C1417R.styleable.AppCompatTheme_textColorSearchUrl), new a(7, C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle)), new b(28, new a(17, 46)), new b(30, new a(7, 24), new a(16, 25)), new b(24, new a(34, 13))), new C1897j(23, new int[]{6, 30, 54, 78, C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu}, new b(30, new a(4, 121), new a(5, 122)), new b(28, new a(4, 47), new a(14, 48)), new b(30, new a(11, 24), new a(14, 25)), new b(30, new a(16, 15), new a(14, 16))), new C1897j(24, new int[]{6, 28, 54, 80, C1417R.styleable.AppCompatTheme_textAppearancePopupMenuHeader}, new b(30, new a(6, 117), new a(4, 118)), new b(28, new a(6, 45), new a(14, 46)), new b(30, new a(11, 24), new a(16, 25)), new b(30, new a(30, 16), new a(2, 17))), new C1897j(25, new int[]{6, 32, 58, 84, C1417R.styleable.AppCompatTheme_textColorAlertDialogListItem}, new b(26, new a(8, C1417R.styleable.AppCompatTheme_textAppearancePopupMenuHeader), new a(4, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle)), new b(28, new a(8, 47), new a(13, 48)), new b(30, new a(7, 24), new a(22, 25)), new b(30, new a(22, 15), new a(13, 16))), new C1897j(26, new int[]{6, 30, 58, 86, C1417R.styleable.AppCompatTheme_tooltipForegroundColor}, new b(28, new a(10, C1417R.styleable.AppCompatTheme_tooltipForegroundColor), new a(2, C1417R.styleable.AppCompatTheme_tooltipFrameBackground)), new b(28, new a(19, 46), new a(4, 47)), new b(28, new a(28, 22), new a(6, 23)), new b(30, new a(33, 16), new a(4, 17))), new C1897j(27, new int[]{6, 34, 62, 90, 118}, new b(30, new a(8, 122), new a(4, 123)), new b(28, new a(22, 45), new a(3, 46)), new b(30, new a(8, 23), new a(26, 24)), new b(30, new a(12, 15), new a(28, 16))), new C1897j(28, new int[]{6, 26, 50, 74, 98, 122}, new b(30, new a(3, 117), new a(10, 118)), new b(28, new a(3, 45), new a(23, 46)), new b(30, new a(4, 24), new a(31, 25)), new b(30, new a(11, 15), new a(31, 16))), new C1897j(29, new int[]{6, 30, 54, 78, C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 126}, new b(30, new a(7, 116), new a(7, 117)), new b(28, new a(21, 45), new a(7, 46)), new b(30, new a(1, 23), new a(37, 24)), new b(30, new a(19, 15), new a(26, 16))), new C1897j(30, new int[]{6, 26, 52, 78, C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 130}, new b(30, new a(5, C1417R.styleable.AppCompatTheme_tooltipFrameBackground), new a(10, 116)), new b(28, new a(19, 47), new a(10, 48)), new b(30, new a(15, 24), new a(25, 25)), new b(30, new a(23, 15), new a(25, 16))), new C1897j(31, new int[]{6, 30, 56, 82, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 134}, new b(30, new a(13, C1417R.styleable.AppCompatTheme_tooltipFrameBackground), new a(3, 116)), new b(28, new a(2, 46), new a(29, 47)), new b(30, new a(42, 24), new a(1, 25)), new b(30, new a(23, 15), new a(28, 16))), new C1897j(32, new int[]{6, 34, 60, 86, C1417R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 138}, new b(30, new a(17, C1417R.styleable.AppCompatTheme_tooltipFrameBackground)), new b(28, new a(10, 46), new a(23, 47)), new b(30, new a(10, 24), new a(35, 25)), new b(30, new a(19, 15), new a(35, 16))), new C1897j(33, new int[]{6, 30, 58, 86, C1417R.styleable.AppCompatTheme_tooltipForegroundColor, 142}, new b(30, new a(17, C1417R.styleable.AppCompatTheme_tooltipFrameBackground), new a(1, 116)), new b(28, new a(14, 46), new a(21, 47)), new b(30, new a(29, 24), new a(19, 25)), new b(30, new a(11, 15), new a(46, 16))), new C1897j(34, new int[]{6, 34, 62, 90, 118, 146}, new b(30, new a(13, C1417R.styleable.AppCompatTheme_tooltipFrameBackground), new a(6, 116)), new b(28, new a(14, 46), new a(23, 47)), new b(30, new a(44, 24), new a(7, 25)), new b(30, new a(59, 16), new a(1, 17))), new C1897j(35, new int[]{6, 30, 54, 78, C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 126, 150}, new b(30, new a(12, 121), new a(7, 122)), new b(28, new a(12, 47), new a(26, 48)), new b(30, new a(39, 24), new a(14, 25)), new b(30, new a(22, 15), new a(41, 16))), new C1897j(36, new int[]{6, 24, 50, 76, C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, 128, 154}, new b(30, new a(6, 121), new a(14, 122)), new b(28, new a(6, 47), new a(34, 48)), new b(30, new a(46, 24), new a(10, 25)), new b(30, new a(2, 15), new a(64, 16))), new C1897j(37, new int[]{6, 28, 54, 80, C1417R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, 132, 158}, new b(30, new a(17, 122), new a(4, 123)), new b(28, new a(29, 46), new a(14, 47)), new b(30, new a(49, 24), new a(10, 25)), new b(30, new a(24, 15), new a(46, 16))), new C1897j(38, new int[]{6, 32, 58, 84, C1417R.styleable.AppCompatTheme_textColorAlertDialogListItem, 136, 162}, new b(30, new a(4, 122), new a(18, 123)), new b(28, new a(13, 46), new a(32, 47)), new b(30, new a(48, 24), new a(14, 25)), new b(30, new a(42, 15), new a(32, 16))), new C1897j(39, new int[]{6, 26, 54, 82, C1417R.styleable.AppCompatTheme_textColorAlertDialogListItem, 138, 166}, new b(30, new a(20, 117), new a(4, 118)), new b(28, new a(40, 47), new a(7, 48)), new b(30, new a(43, 24), new a(22, 25)), new b(30, new a(10, 15), new a(67, 16))), new C1897j(40, new int[]{6, 30, 58, 86, C1417R.styleable.AppCompatTheme_tooltipForegroundColor, 142, 170}, new b(30, new a(19, 118), new a(6, 119)), new b(28, new a(18, 47), new a(31, 48)), new b(30, new a(34, 24), new a(34, 25)), new b(30, new a(20, 15), new a(61, 16)))};
    }

    /* renamed from: c */
    public static C1897j m7752c(int i10) {
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        while (true) {
            int[] iArr = f7171e;
            if (i11 >= iArr.length) {
                if (i12 <= 3) {
                    return m7754i(i13);
                }
                return null;
            }
            int i14 = iArr[i11];
            if (i14 == i10) {
                return m7754i(i11 + 7);
            }
            int m7745e = C1894g.m7745e(i10, i14);
            if (m7745e < i12) {
                i13 = i11 + 7;
                i12 = m7745e;
            }
            i11++;
        }
    }

    /* renamed from: g */
    public static C1897j m7753g(int i10) {
        if (i10 % 4 != 1) {
            throw C2674f.m10883a();
        }
        try {
            return m7754i((i10 - 17) / 4);
        } catch (IllegalArgumentException unused) {
            throw C2674f.m10883a();
        }
    }

    /* renamed from: i */
    public static C1897j m7754i(int i10) {
        if (i10 < 1 || i10 > 40) {
            throw new IllegalArgumentException();
        }
        return f7172f[i10 - 1];
    }

    /* renamed from: a */
    public C3965b m7755a() {
        int m7757e = m7757e();
        C3965b c3965b = new C3965b(m7757e);
        c3965b.m15045r(0, 0, 9, 9);
        int i10 = m7757e - 8;
        c3965b.m15045r(i10, 0, 8, 9);
        c3965b.m15045r(0, i10, 9, 8);
        int length = this.f7174b.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = this.f7174b[i11] - 2;
            for (int i13 = 0; i13 < length; i13++) {
                if ((i11 != 0 || (i13 != 0 && i13 != length - 1)) && (i11 != length - 1 || i13 != 0)) {
                    c3965b.m15045r(this.f7174b[i13] - 2, i12, 5, 5);
                }
            }
        }
        int i14 = m7757e - 17;
        c3965b.m15045r(6, 9, 1, i14);
        c3965b.m15045r(9, 6, i14, 1);
        if (this.f7173a > 6) {
            int i15 = m7757e - 11;
            c3965b.m15045r(i15, 0, 3, 6);
            c3965b.m15045r(0, i15, 6, 3);
        }
        return c3965b;
    }

    /* renamed from: d */
    public int[] m7756d() {
        return this.f7174b;
    }

    /* renamed from: e */
    public int m7757e() {
        return (this.f7173a * 4) + 17;
    }

    /* renamed from: f */
    public b m7758f(EnumC1893f enumC1893f) {
        return this.f7175c[enumC1893f.ordinal()];
    }

    /* renamed from: h */
    public int m7759h() {
        return this.f7176d;
    }

    /* renamed from: j */
    public int m7760j() {
        return this.f7173a;
    }

    public String toString() {
        return String.valueOf(this.f7173a);
    }
}
