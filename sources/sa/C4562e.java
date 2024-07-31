package sa;

import com.pichillilorenzo.flutter_inappwebview.C1417R;
import p129ia.C2674f;

/* renamed from: sa.e */
/* loaded from: classes.dex */
public final class C4562e {

    /* renamed from: h */
    public static final C4562e[] f17186h = m18042a();

    /* renamed from: a */
    public final int f17187a;

    /* renamed from: b */
    public final int f17188b;

    /* renamed from: c */
    public final int f17189c;

    /* renamed from: d */
    public final int f17190d;

    /* renamed from: e */
    public final int f17191e;

    /* renamed from: f */
    public final c f17192f;

    /* renamed from: g */
    public final int f17193g;

    /* renamed from: sa.e$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f17194a;

        /* renamed from: b */
        public final int f17195b;

        public b(int i10, int i11) {
            this.f17194a = i10;
            this.f17195b = i11;
        }

        /* renamed from: a */
        public int m18051a() {
            return this.f17194a;
        }

        /* renamed from: b */
        public int m18052b() {
            return this.f17195b;
        }
    }

    /* renamed from: sa.e$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f17196a;

        /* renamed from: b */
        public final b[] f17197b;

        public c(int i10, b bVar) {
            this.f17196a = i10;
            this.f17197b = new b[]{bVar};
        }

        public c(int i10, b bVar, b bVar2) {
            this.f17196a = i10;
            this.f17197b = new b[]{bVar, bVar2};
        }

        /* renamed from: a */
        public b[] m18053a() {
            return this.f17197b;
        }

        /* renamed from: b */
        public int m18054b() {
            return this.f17196a;
        }
    }

    public C4562e(int i10, int i11, int i12, int i13, int i14, c cVar) {
        this.f17187a = i10;
        this.f17188b = i11;
        this.f17189c = i12;
        this.f17190d = i13;
        this.f17191e = i14;
        this.f17192f = cVar;
        int m18054b = cVar.m18054b();
        int i15 = 0;
        for (b bVar : cVar.m18053a()) {
            i15 += bVar.m18051a() * (bVar.m18052b() + m18054b);
        }
        this.f17193g = i15;
    }

    /* renamed from: a */
    public static C4562e[] m18042a() {
        int i10 = 48;
        int i11 = 1;
        int i12 = 5;
        int i13 = 8;
        C4562e c4562e = new C4562e(3, 14, 14, 12, 12, new c(10, new b(i11, i13)));
        int i14 = 2;
        int i15 = 12;
        int i16 = 18;
        C4562e c4562e2 = new C4562e(5, 18, 18, 16, 16, new c(14, new b(i11, i16)));
        int i17 = 4;
        int i18 = 36;
        b bVar = new b(i11, 44);
        int i19 = 62;
        b bVar2 = new b(i11, 86);
        int i20 = 42;
        b bVar3 = new b(i11, 144);
        int i21 = 56;
        b bVar4 = new b(i11, 174);
        C4562e c4562e3 = new C4562e(15, 52, 52, 24, 24, new c(i20, new b(i14, C1417R.styleable.AppCompatTheme_textAppearanceLargePopupMenu)));
        b bVar5 = new b(6, 175);
        C4562e c4562e4 = new C4562e(23, 132, 132, 20, 20, new c(i19, new b(i13, 163)));
        int i22 = 22;
        b bVar6 = new b(i11, 5);
        b bVar7 = new b(i11, 10);
        int i23 = 32;
        int i24 = 38;
        return new C4562e[]{new C4562e(1, 10, 10, 8, 8, new c(i12, new b(i11, 3))), new C4562e(2, 12, 12, 10, 10, new c(7, new b(i11, i12))), c4562e, new C4562e(4, 16, 16, 14, 14, new c(i15, new b(i11, i15))), c4562e2, new C4562e(6, 20, 20, 18, 18, new c(i16, new b(i11, 22))), new C4562e(7, 22, 22, 20, 20, new c(20, new b(i11, 30))), new C4562e(8, 24, 24, 22, 22, new c(24, new b(i11, i18))), new C4562e(9, 26, 26, 24, 24, new c(28, bVar)), new C4562e(10, 32, 32, 14, 14, new c(i18, new b(i11, i19))), new C4562e(11, 36, 36, 16, 16, new c(i20, bVar2)), new C4562e(12, 40, 40, 18, 18, new c(i10, new b(i11, C1417R.styleable.AppCompatTheme_tooltipForegroundColor))), new C4562e(13, 44, 44, 20, 20, new c(i21, bVar3)), new C4562e(14, 48, 48, 22, 22, new c(68, bVar4)), c4562e3, new C4562e(16, 64, 64, 14, 14, new c(i21, new b(i14, 140))), new C4562e(17, 72, 72, 16, 16, new c(i18, new b(i17, 92))), new C4562e(18, 80, 80, 18, 18, new c(i10, new b(i17, C1417R.styleable.AppCompatTheme_tooltipForegroundColor))), new C4562e(19, 88, 88, 20, 20, new c(i21, new b(i17, 144))), new C4562e(20, 96, 96, 22, 22, new c(68, new b(i17, 174))), new C4562e(21, C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary, C1417R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 24, 24, new c(i21, new b(6, 136))), new C4562e(22, 120, 120, 18, 18, new c(68, bVar5)), c4562e4, new C4562e(24, 144, 144, 22, 22, new c(i19, new b(i13, 156), new b(i14, 155))), new C4562e(25, 8, 18, 6, 16, new c(7, bVar6)), new C4562e(26, 8, 32, 6, 14, new c(11, bVar7)), new C4562e(27, 12, 26, 10, 24, new c(14, new b(i11, 16))), new C4562e(28, 12, 36, 10, 16, new c(i16, new b(i11, i22))), new C4562e(29, 16, 36, 14, 16, new c(24, new b(i11, i23))), new C4562e(30, 16, 48, 14, 22, new c(28, new b(i11, 49))), new C4562e(31, 8, 48, 6, 22, new c(15, new b(i11, i16))), new C4562e(32, 8, 64, 6, 14, new c(i16, new b(i11, 24))), new C4562e(33, 8, 80, 6, 18, new c(i22, new b(i11, i23))), new C4562e(34, 8, 96, 6, 22, new c(28, new b(i11, i24))), new C4562e(35, 8, 120, 6, 18, new c(i23, new b(i11, 49))), new C4562e(36, 8, 144, 6, 22, new c(i18, new b(i11, 63))), new C4562e(37, 12, 64, 10, 14, new c(27, new b(i11, 43))), new C4562e(38, 12, 88, 10, 20, new c(i18, new b(i11, 64))), new C4562e(39, 16, 64, 14, 14, new c(i18, new b(i11, i19))), new C4562e(40, 20, 36, 18, 16, new c(28, new b(i11, 44))), new C4562e(41, 20, 44, 18, 20, new c(34, new b(i11, i21))), new C4562e(42, 20, 64, 18, 14, new c(42, new b(i11, 84))), new C4562e(43, 22, 48, 20, 22, new c(i24, new b(i11, 72))), new C4562e(44, 24, 48, 22, 22, new c(41, new b(i11, 80))), new C4562e(45, 24, 64, 22, 14, new c(46, new b(i11, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultTitle))), new C4562e(46, 26, 40, 24, 18, new c(i24, new b(i11, 70))), new C4562e(47, 26, 48, 24, 22, new c(42, new b(i11, 90))), new C4562e(48, 26, 64, 24, 14, new c(50, new b(i11, 118)))};
    }

    /* renamed from: h */
    public static C4562e m18043h(int i10, int i11) {
        if ((i10 & 1) != 0 || (i11 & 1) != 0) {
            throw C2674f.m10883a();
        }
        for (C4562e c4562e : f17186h) {
            if (c4562e.f17188b == i10 && c4562e.f17189c == i11) {
                return c4562e;
            }
        }
        throw C2674f.m10883a();
    }

    /* renamed from: b */
    public int m18044b() {
        return this.f17191e;
    }

    /* renamed from: c */
    public int m18045c() {
        return this.f17190d;
    }

    /* renamed from: d */
    public c m18046d() {
        return this.f17192f;
    }

    /* renamed from: e */
    public int m18047e() {
        return this.f17189c;
    }

    /* renamed from: f */
    public int m18048f() {
        return this.f17188b;
    }

    /* renamed from: g */
    public int m18049g() {
        return this.f17193g;
    }

    /* renamed from: i */
    public int m18050i() {
        return this.f17187a;
    }

    public String toString() {
        return String.valueOf(this.f17187a);
    }
}
