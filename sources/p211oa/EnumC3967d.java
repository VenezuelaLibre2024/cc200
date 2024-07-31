package p211oa;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import p129ia.C2674f;

/* renamed from: oa.d */
/* loaded from: classes.dex */
public enum EnumC3967d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");


    /* renamed from: F */
    public static final Map<Integer, EnumC3967d> f14289F = new HashMap();

    /* renamed from: G */
    public static final Map<String, EnumC3967d> f14290G = new HashMap();

    /* renamed from: h */
    public final int[] f14309h;

    /* renamed from: i */
    public final String[] f14310i;

    static {
        for (EnumC3967d enumC3967d : values()) {
            for (int i10 : enumC3967d.f14309h) {
                f14289F.put(Integer.valueOf(i10), enumC3967d);
            }
            f14290G.put(enumC3967d.name(), enumC3967d);
            for (String str : enumC3967d.f14310i) {
                f14290G.put(str, enumC3967d);
            }
        }
    }

    EnumC3967d(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    EnumC3967d(int i10, String... strArr) {
        this.f14309h = new int[]{i10};
        this.f14310i = strArr;
    }

    EnumC3967d(int[] iArr, String... strArr) {
        this.f14309h = iArr;
        this.f14310i = strArr;
    }

    /* renamed from: b */
    public static EnumC3967d m15052b(int i10) {
        if (i10 < 0 || i10 >= 900) {
            throw C2674f.m10883a();
        }
        return f14289F.get(Integer.valueOf(i10));
    }

    /* renamed from: c */
    public Charset m15053c() {
        return Charset.forName(name());
    }
}
