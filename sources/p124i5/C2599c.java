package p124i5;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import io.flutter.embedding.android.KeyboardMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p109h7.C2420c;
import p155k7.C3368e;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: i5.c */
/* loaded from: classes.dex */
public final class C2599c {

    /* renamed from: a */
    public final String f10206a;

    /* renamed from: b */
    public final int f10207b;

    /* renamed from: c */
    public final Integer f10208c;

    /* renamed from: d */
    public final Integer f10209d;

    /* renamed from: e */
    public final float f10210e;

    /* renamed from: f */
    public final boolean f10211f;

    /* renamed from: g */
    public final boolean f10212g;

    /* renamed from: h */
    public final boolean f10213h;

    /* renamed from: i */
    public final boolean f10214i;

    /* renamed from: j */
    public final int f10215j;

    /* renamed from: i5.c$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f10216a;

        /* renamed from: b */
        public final int f10217b;

        /* renamed from: c */
        public final int f10218c;

        /* renamed from: d */
        public final int f10219d;

        /* renamed from: e */
        public final int f10220e;

        /* renamed from: f */
        public final int f10221f;

        /* renamed from: g */
        public final int f10222g;

        /* renamed from: h */
        public final int f10223h;

        /* renamed from: i */
        public final int f10224i;

        /* renamed from: j */
        public final int f10225j;

        /* renamed from: k */
        public final int f10226k;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
            this.f10216a = i10;
            this.f10217b = i11;
            this.f10218c = i12;
            this.f10219d = i13;
            this.f10220e = i14;
            this.f10221f = i15;
            this.f10222g = i16;
            this.f10223h = i17;
            this.f10224i = i18;
            this.f10225j = i19;
            this.f10226k = i20;
        }

        /* renamed from: a */
        public static a m10404a(String str) {
            char c10;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < split.length; i20++) {
                String m9665e = C2420c.m9665e(split[i20].trim());
                m9665e.hashCode();
                switch (m9665e.hashCode()) {
                    case -1178781136:
                        if (m9665e.equals("italic")) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -1026963764:
                        if (m9665e.equals("underline")) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -192095652:
                        if (m9665e.equals("strikeout")) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case -70925746:
                        if (m9665e.equals("primarycolour")) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3029637:
                        if (m9665e.equals("bold")) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 3373707:
                        if (m9665e.equals("name")) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 366554320:
                        if (m9665e.equals("fontsize")) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 767321349:
                        if (m9665e.equals("borderstyle")) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 1767875043:
                        if (m9665e.equals("alignment")) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 1988365454:
                        if (m9665e.equals("outlinecolour")) {
                            c10 = '\t';
                            break;
                        }
                        break;
                }
                c10 = 65535;
                switch (c10) {
                    case 0:
                        i16 = i20;
                        break;
                    case 1:
                        i17 = i20;
                        break;
                    case 2:
                        i18 = i20;
                        break;
                    case 3:
                        i12 = i20;
                        break;
                    case 4:
                        i15 = i20;
                        break;
                    case 5:
                        i10 = i20;
                        break;
                    case 6:
                        i14 = i20;
                        break;
                    case 7:
                        i19 = i20;
                        break;
                    case '\b':
                        i11 = i20;
                        break;
                    case '\t':
                        i13 = i20;
                        break;
                }
            }
            if (i10 != -1) {
                return new a(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, split.length);
            }
            return null;
        }
    }

    /* renamed from: i5.c$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        public static final Pattern f10227c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        public static final Pattern f10228d = Pattern.compile(C4041n0.m15397C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        public static final Pattern f10229e = Pattern.compile(C4041n0.m15397C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        public static final Pattern f10230f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f10231a;

        /* renamed from: b */
        public final PointF f10232b;

        public b(int i10, PointF pointF) {
            this.f10231a = i10;
            this.f10232b = pointF;
        }

        /* renamed from: a */
        public static int m10405a(String str) {
            Matcher matcher = f10230f.matcher(str);
            if (matcher.find()) {
                return C2599c.m10399e((String) C4014a.m15199e(matcher.group(1)));
            }
            return -1;
        }

        /* renamed from: b */
        public static b m10406b(String str) {
            Matcher matcher = f10227c.matcher(str);
            PointF pointF = null;
            int i10 = -1;
            while (matcher.find()) {
                String str2 = (String) C4014a.m15199e(matcher.group(1));
                try {
                    PointF m10407c = m10407c(str2);
                    if (m10407c != null) {
                        pointF = m10407c;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int m10405a = m10405a(str2);
                    if (m10405a != -1) {
                        i10 = m10405a;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new b(i10, pointF);
        }

        /* renamed from: c */
        public static PointF m10407c(String str) {
            String group;
            String group2;
            Matcher matcher = f10228d.matcher(str);
            Matcher matcher2 = f10229e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    C4046r.m15526f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C4014a.m15199e(group)).trim()), Float.parseFloat(((String) C4014a.m15199e(group2)).trim()));
        }

        /* renamed from: d */
        public static String m10408d(String str) {
            return f10227c.matcher(str).replaceAll("");
        }
    }

    public C2599c(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f10206a = str;
        this.f10207b = i10;
        this.f10208c = num;
        this.f10209d = num2;
        this.f10210e = f10;
        this.f10211f = z10;
        this.f10212g = z11;
        this.f10213h = z12;
        this.f10214i = z13;
        this.f10215j = i11;
    }

    /* renamed from: b */
    public static C2599c m10396b(String str, a aVar) {
        C4014a.m15195a(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i10 = aVar.f10226k;
        if (length != i10) {
            C4046r.m15529i("SsaStyle", C4041n0.m15397C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i10), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[aVar.f10216a].trim();
            int i11 = aVar.f10217b;
            int m10399e = i11 != -1 ? m10399e(split[i11].trim()) : -1;
            int i12 = aVar.f10218c;
            Integer m10402h = i12 != -1 ? m10402h(split[i12].trim()) : null;
            int i13 = aVar.f10219d;
            Integer m10402h2 = i13 != -1 ? m10402h(split[i13].trim()) : null;
            int i14 = aVar.f10220e;
            float m10403i = i14 != -1 ? m10403i(split[i14].trim()) : -3.4028235E38f;
            int i15 = aVar.f10221f;
            boolean z10 = i15 != -1 && m10400f(split[i15].trim());
            int i16 = aVar.f10222g;
            boolean z11 = i16 != -1 && m10400f(split[i16].trim());
            int i17 = aVar.f10223h;
            boolean z12 = i17 != -1 && m10400f(split[i17].trim());
            int i18 = aVar.f10224i;
            boolean z13 = i18 != -1 && m10400f(split[i18].trim());
            int i19 = aVar.f10225j;
            return new C2599c(trim, m10399e, m10402h, m10402h2, m10403i, z10, z11, z12, z13, i19 != -1 ? m10401g(split[i19].trim()) : -1);
        } catch (RuntimeException e10) {
            C4046r.m15530j("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e10);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m10397c(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public static boolean m10398d(int i10) {
        return i10 == 1 || i10 == 3;
    }

    /* renamed from: e */
    public static int m10399e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m10397c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C4046r.m15529i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: f */
    public static boolean m10400f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e10) {
            C4046r.m15530j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    /* renamed from: g */
    public static int m10401g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m10398d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C4046r.m15529i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    /* renamed from: h */
    public static Integer m10402h(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C4014a.m15195a(parseLong <= KeyboardMap.kValueMask);
            return Integer.valueOf(Color.argb(C3368e.m12525d(((parseLong >> 24) & 255) ^ 255), C3368e.m12525d(parseLong & 255), C3368e.m12525d((parseLong >> 8) & 255), C3368e.m12525d((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            C4046r.m15530j("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    /* renamed from: i */
    public static float m10403i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e10) {
            C4046r.m15530j("SsaStyle", "Failed to parse font size: '" + str + "'", e10);
            return -3.4028235E38f;
        }
    }
}
