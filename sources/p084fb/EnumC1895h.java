package p084fb;

/* renamed from: fb.h */
/* loaded from: classes.dex */
public enum EnumC1895h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: h */
    public final int[] f7168h;

    /* renamed from: i */
    public final int f7169i;

    EnumC1895h(int[] iArr, int i10) {
        this.f7168h = iArr;
        this.f7169i = i10;
    }

    /* renamed from: b */
    public static EnumC1895h m7748b(int i10) {
        if (i10 == 0) {
            return TERMINATOR;
        }
        if (i10 == 1) {
            return NUMERIC;
        }
        if (i10 == 2) {
            return ALPHANUMERIC;
        }
        if (i10 == 3) {
            return STRUCTURED_APPEND;
        }
        if (i10 == 4) {
            return BYTE;
        }
        if (i10 == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i10 == 7) {
            return ECI;
        }
        if (i10 == 8) {
            return KANJI;
        }
        if (i10 == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i10 == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int m7749c(C1897j c1897j) {
        int m7760j = c1897j.m7760j();
        return this.f7168h[m7760j <= 9 ? (char) 0 : m7760j <= 26 ? (char) 1 : (char) 2];
    }
}
