package p181m5;

import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p109h7.C2420c;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4024f;
import p222p5.C4041n0;
import p222p5.C4046r;

/* renamed from: m5.c */
/* loaded from: classes.dex */
public final class C3528c {

    /* renamed from: c */
    public static final Pattern f12363c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    public static final Pattern f12364d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    public final C4015a0 f12365a = new C4015a0();

    /* renamed from: b */
    public final StringBuilder f12366b = new StringBuilder();

    /* renamed from: b */
    public static boolean m13084b(C4015a0 c4015a0) {
        int m15231f = c4015a0.m15231f();
        int m15232g = c4015a0.m15232g();
        byte[] m15230e = c4015a0.m15230e();
        if (m15231f + 2 > m15232g) {
            return false;
        }
        int i10 = m15231f + 1;
        if (m15230e[m15231f] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (m15230e[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= m15232g) {
                c4015a0.m15224U(m15232g - c4015a0.m15231f());
                return true;
            }
            if (((char) m15230e[i11]) == '*' && ((char) m15230e[i12]) == '/') {
                i11 = i12 + 1;
                m15232g = i11;
            } else {
                i11 = i12;
            }
        }
    }

    /* renamed from: c */
    public static boolean m13085c(C4015a0 c4015a0) {
        char m13092k = m13092k(c4015a0, c4015a0.m15231f());
        if (m13092k != '\t' && m13092k != '\n' && m13092k != '\f' && m13092k != '\r' && m13092k != ' ') {
            return false;
        }
        c4015a0.m15224U(1);
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0064. Please report as an issue. */
    /* renamed from: e */
    public static void m13086e(String str, C3529d c3529d) {
        Matcher matcher = f12364d.matcher(C2420c.m9665e(str));
        if (!matcher.matches()) {
            C4046r.m15529i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        int i10 = 2;
        String str2 = (String) C4014a.m15199e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 3;
            case 1:
                c3529d.m13119t(i10);
                c3529d.m13118s(Float.parseFloat((String) C4014a.m15199e(matcher.group(1))));
                return;
            case 2:
                c3529d.m13119t(1);
                c3529d.m13118s(Float.parseFloat((String) C4014a.m15199e(matcher.group(1))));
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static String m13087f(C4015a0 c4015a0, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int m15231f = c4015a0.m15231f();
        int m15232g = c4015a0.m15232g();
        while (m15231f < m15232g && !z10) {
            char c10 = (char) c4015a0.m15230e()[m15231f];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                m15231f++;
                sb2.append(c10);
            }
        }
        c4015a0.m15224U(m15231f - c4015a0.m15231f());
        return sb2.toString();
    }

    /* renamed from: g */
    public static String m13088g(C4015a0 c4015a0, StringBuilder sb2) {
        m13095n(c4015a0);
        if (c4015a0.m15226a() == 0) {
            return null;
        }
        String m13087f = m13087f(c4015a0, sb2);
        if (!"".equals(m13087f)) {
            return m13087f;
        }
        return "" + ((char) c4015a0.m15210G());
    }

    /* renamed from: h */
    public static String m13089h(C4015a0 c4015a0, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int m15231f = c4015a0.m15231f();
            String m13088g = m13088g(c4015a0, sb2);
            if (m13088g == null) {
                return null;
            }
            if ("}".equals(m13088g) || ";".equals(m13088g)) {
                c4015a0.m15223T(m15231f);
                z10 = true;
            } else {
                sb3.append(m13088g);
            }
        }
        return sb3.toString();
    }

    /* renamed from: i */
    public static String m13090i(C4015a0 c4015a0, StringBuilder sb2) {
        m13095n(c4015a0);
        if (c4015a0.m15226a() < 5 || !"::cue".equals(c4015a0.m15207D(5))) {
            return null;
        }
        int m15231f = c4015a0.m15231f();
        String m13088g = m13088g(c4015a0, sb2);
        if (m13088g == null) {
            return null;
        }
        if ("{".equals(m13088g)) {
            c4015a0.m15223T(m15231f);
            return "";
        }
        String m13093l = "(".equals(m13088g) ? m13093l(c4015a0) : null;
        if (")".equals(m13088g(c4015a0, sb2))) {
            return m13093l;
        }
        return null;
    }

    /* renamed from: j */
    public static void m13091j(C4015a0 c4015a0, C3529d c3529d, StringBuilder sb2) {
        m13095n(c4015a0);
        String m13087f = m13087f(c4015a0, sb2);
        if (!"".equals(m13087f) && ":".equals(m13088g(c4015a0, sb2))) {
            m13095n(c4015a0);
            String m13089h = m13089h(c4015a0, sb2);
            if (m13089h == null || "".equals(m13089h)) {
                return;
            }
            int m15231f = c4015a0.m15231f();
            String m13088g = m13088g(c4015a0, sb2);
            if (!";".equals(m13088g)) {
                if (!"}".equals(m13088g)) {
                    return;
                } else {
                    c4015a0.m15223T(m15231f);
                }
            }
            if ("color".equals(m13087f)) {
                c3529d.m13116q(C4024f.m15302b(m13089h));
                return;
            }
            if ("background-color".equals(m13087f)) {
                c3529d.m13113n(C4024f.m15302b(m13089h));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(m13087f)) {
                if ("over".equals(m13089h)) {
                    c3529d.m13121v(1);
                    return;
                } else {
                    if ("under".equals(m13089h)) {
                        c3529d.m13121v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(m13087f)) {
                if (!"all".equals(m13089h) && !m13089h.startsWith("digits")) {
                    z10 = false;
                }
                c3529d.m13115p(z10);
                return;
            }
            if ("text-decoration".equals(m13087f)) {
                if ("underline".equals(m13089h)) {
                    c3529d.m13099A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(m13087f)) {
                c3529d.m13117r(m13089h);
                return;
            }
            if ("font-weight".equals(m13087f)) {
                if ("bold".equals(m13089h)) {
                    c3529d.m13114o(true);
                }
            } else if ("font-style".equals(m13087f)) {
                if ("italic".equals(m13089h)) {
                    c3529d.m13120u(true);
                }
            } else if ("font-size".equals(m13087f)) {
                m13086e(m13089h, c3529d);
            }
        }
    }

    /* renamed from: k */
    public static char m13092k(C4015a0 c4015a0, int i10) {
        return (char) c4015a0.m15230e()[i10];
    }

    /* renamed from: l */
    public static String m13093l(C4015a0 c4015a0) {
        int m15231f = c4015a0.m15231f();
        int m15232g = c4015a0.m15232g();
        boolean z10 = false;
        while (m15231f < m15232g && !z10) {
            int i10 = m15231f + 1;
            z10 = ((char) c4015a0.m15230e()[m15231f]) == ')';
            m15231f = i10;
        }
        return c4015a0.m15207D((m15231f - 1) - c4015a0.m15231f()).trim();
    }

    /* renamed from: m */
    public static void m13094m(C4015a0 c4015a0) {
        do {
        } while (!TextUtils.isEmpty(c4015a0.m15243r()));
    }

    /* renamed from: n */
    public static void m13095n(C4015a0 c4015a0) {
        while (true) {
            for (boolean z10 = true; c4015a0.m15226a() > 0 && z10; z10 = false) {
                if (!m13085c(c4015a0) && !m13084b(c4015a0)) {
                }
            }
            return;
        }
    }

    /* renamed from: a */
    public final void m13096a(C3529d c3529d, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f12363c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c3529d.m13125z((String) C4014a.m15199e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] m15426Q0 = C4041n0.m15426Q0(str, "\\.");
        String str2 = m15426Q0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c3529d.m13124y(str2.substring(0, indexOf2));
            c3529d.m13123x(str2.substring(indexOf2 + 1));
        } else {
            c3529d.m13124y(str2);
        }
        if (m15426Q0.length > 1) {
            c3529d.m13122w((String[]) C4041n0.m15408H0(m15426Q0, 1, m15426Q0.length));
        }
    }

    /* renamed from: d */
    public List<C3529d> m13097d(C4015a0 c4015a0) {
        this.f12366b.setLength(0);
        int m15231f = c4015a0.m15231f();
        m13094m(c4015a0);
        this.f12365a.m15221R(c4015a0.m15230e(), c4015a0.m15231f());
        this.f12365a.m15223T(m15231f);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String m13090i = m13090i(this.f12365a, this.f12366b);
            if (m13090i == null || !"{".equals(m13088g(this.f12365a, this.f12366b))) {
                return arrayList;
            }
            C3529d c3529d = new C3529d();
            m13096a(c3529d, m13090i);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int m15231f2 = this.f12365a.m15231f();
                String m13088g = m13088g(this.f12365a, this.f12366b);
                boolean z11 = m13088g == null || "}".equals(m13088g);
                if (!z11) {
                    this.f12365a.m15223T(m15231f2);
                    m13091j(this.f12365a, c3529d, this.f12366b);
                }
                str = m13088g;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(c3529d);
            }
        }
    }
}
