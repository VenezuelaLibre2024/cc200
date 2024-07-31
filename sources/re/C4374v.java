package re;

import bf.C0557c;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import se.C4596e;

/* renamed from: re.v */
/* loaded from: classes2.dex */
public final class C4374v {

    /* renamed from: j */
    public static final char[] f15969j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public final String f15970a;

    /* renamed from: b */
    public final String f15971b;

    /* renamed from: c */
    public final String f15972c;

    /* renamed from: d */
    public final String f15973d;

    /* renamed from: e */
    public final int f15974e;

    /* renamed from: f */
    public final List<String> f15975f;

    /* renamed from: g */
    public final List<String> f15976g;

    /* renamed from: h */
    public final String f15977h;

    /* renamed from: i */
    public final String f15978i;

    /* renamed from: re.v$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public String f15979a;

        /* renamed from: d */
        public String f15982d;

        /* renamed from: f */
        public final List<String> f15984f;

        /* renamed from: g */
        public List<String> f15985g;

        /* renamed from: h */
        public String f15986h;

        /* renamed from: b */
        public String f15980b = "";

        /* renamed from: c */
        public String f15981c = "";

        /* renamed from: e */
        public int f15983e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f15984f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        public static String m16869b(String str, int i10, int i11) {
            return C4596e.m18095c(C4374v.m16847r(str, i10, i11, false));
        }

        /* renamed from: i */
        public static int m16870i(String str, int i10, int i11) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(C4374v.m16840a(str, i10, i11, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        /* renamed from: m */
        public static int m16871m(String str, int i10, int i11) {
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt == ':') {
                    return i10;
                }
                if (charAt != '[') {
                    i10++;
                }
                do {
                    i10++;
                    if (i10 < i11) {
                    }
                    i10++;
                } while (str.charAt(i10) != ']');
                i10++;
            }
            return i11;
        }

        /* renamed from: r */
        public static int m16872r(String str, int i10, int i11) {
            if (i11 - i10 < 2) {
                return -1;
            }
            char charAt = str.charAt(i10);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i10++;
                    if (i10 >= i11) {
                        break;
                    }
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i10;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: s */
        public static int m16873s(String str, int i10, int i11) {
            int i12 = 0;
            while (i10 < i11) {
                char charAt = str.charAt(i10);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i12++;
                i10++;
            }
            return i12;
        }

        /* renamed from: a */
        public C4374v m16874a() {
            if (this.f15979a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f15982d != null) {
                return new C4374v(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* renamed from: c */
        public int m16875c() {
            int i10 = this.f15983e;
            return i10 != -1 ? i10 : C4374v.m16843d(this.f15979a);
        }

        /* renamed from: d */
        public a m16876d(String str) {
            this.f15985g = str != null ? C4374v.m16851y(C4374v.m16841b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: e */
        public a m16877e(String str) {
            Objects.requireNonNull(str, "host == null");
            String m16869b = m16869b(str, 0, str.length());
            if (m16869b != null) {
                this.f15982d = m16869b;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: f */
        public final boolean m16878f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: g */
        public final boolean m16879g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: h */
        public a m16880h(C4374v c4374v, String str) {
            int m18106n;
            int i10;
            int m18086F = C4596e.m18086F(str, 0, str.length());
            int m18087G = C4596e.m18087G(str, m18086F, str.length());
            int m16872r = m16872r(str, m18086F, m18087G);
            if (m16872r != -1) {
                if (str.regionMatches(true, m18086F, "https:", 0, 6)) {
                    this.f15979a = "https";
                    m18086F += 6;
                } else {
                    if (!str.regionMatches(true, m18086F, "http:", 0, 5)) {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str.substring(0, m16872r) + "'");
                    }
                    this.f15979a = "http";
                    m18086F += 5;
                }
            } else {
                if (c4374v == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.f15979a = c4374v.f15970a;
            }
            int m16873s = m16873s(str, m18086F, m18087G);
            char c10 = '?';
            char c11 = '#';
            if (m16873s >= 2 || c4374v == null || !c4374v.f15970a.equals(this.f15979a)) {
                boolean z10 = false;
                boolean z11 = false;
                int i11 = m18086F + m16873s;
                while (true) {
                    m18106n = C4596e.m18106n(str, i11, m18087G, "@/\\?#");
                    char charAt = m18106n != m18087G ? str.charAt(m18106n) : (char) 65535;
                    if (charAt == 65535 || charAt == c11 || charAt == '/' || charAt == '\\' || charAt == c10) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z10) {
                            i10 = m18106n;
                            this.f15981c += "%40" + C4374v.m16840a(str, i11, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int m18105m = C4596e.m18105m(str, i11, m18106n, ':');
                            i10 = m18106n;
                            String m16840a = C4374v.m16840a(str, i11, m18105m, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z11) {
                                m16840a = this.f15980b + "%40" + m16840a;
                            }
                            this.f15980b = m16840a;
                            if (m18105m != i10) {
                                this.f15981c = C4374v.m16840a(str, m18105m + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z10 = true;
                            }
                            z11 = true;
                        }
                        i11 = i10 + 1;
                    }
                    c10 = '?';
                    c11 = '#';
                }
                int m16871m = m16871m(str, i11, m18106n);
                int i12 = m16871m + 1;
                if (i12 < m18106n) {
                    this.f15982d = m16869b(str, i11, m16871m);
                    int m16870i = m16870i(str, i12, m18106n);
                    this.f15983e = m16870i;
                    if (m16870i == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str.substring(i12, m18106n) + '\"');
                    }
                } else {
                    this.f15982d = m16869b(str, i11, m16871m);
                    this.f15983e = C4374v.m16843d(this.f15979a);
                }
                if (this.f15982d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str.substring(i11, m16871m) + '\"');
                }
                m18086F = m18106n;
            } else {
                this.f15980b = c4374v.m16860j();
                this.f15981c = c4374v.m16856f();
                this.f15982d = c4374v.f15973d;
                this.f15983e = c4374v.f15974e;
                this.f15984f.clear();
                this.f15984f.addAll(c4374v.m16858h());
                if (m18086F == m18087G || str.charAt(m18086F) == '#') {
                    m16876d(c4374v.m16859i());
                }
            }
            int m18106n2 = C4596e.m18106n(str, m18086F, m18087G, "?#");
            m16886p(str, m18086F, m18106n2);
            if (m18106n2 < m18087G && str.charAt(m18106n2) == '?') {
                int m18105m2 = C4596e.m18105m(str, m18106n2, m18087G, '#');
                this.f15985g = C4374v.m16851y(C4374v.m16840a(str, m18106n2 + 1, m18105m2, " \"'<>#", true, false, true, true, null));
                m18106n2 = m18105m2;
            }
            if (m18106n2 < m18087G && str.charAt(m18106n2) == '#') {
                this.f15986h = C4374v.m16840a(str, 1 + m18106n2, m18087G, "", true, false, false, false, null);
            }
            return this;
        }

        /* renamed from: j */
        public a m16881j(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f15981c = C4374v.m16841b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: k */
        public final void m16882k() {
            if (!this.f15984f.remove(r0.size() - 1).isEmpty() || this.f15984f.isEmpty()) {
                this.f15984f.add("");
            } else {
                this.f15984f.set(r0.size() - 1, "");
            }
        }

        /* renamed from: l */
        public a m16883l(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f15983e = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        /* renamed from: n */
        public final void m16884n(String str, int i10, int i11, boolean z10, boolean z11) {
            String m16840a = C4374v.m16840a(str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, true, null);
            if (m16878f(m16840a)) {
                return;
            }
            if (m16879g(m16840a)) {
                m16882k();
                return;
            }
            if (this.f15984f.get(r11.size() - 1).isEmpty()) {
                this.f15984f.set(r11.size() - 1, m16840a);
            } else {
                this.f15984f.add(m16840a);
            }
            if (z10) {
                this.f15984f.add("");
            }
        }

        /* renamed from: o */
        public a m16885o() {
            int size = this.f15984f.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f15984f.set(i10, C4374v.m16841b(this.f15984f.get(i10), "[]", true, true, false, true));
            }
            List<String> list = this.f15985g;
            if (list != null) {
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    String str = this.f15985g.get(i11);
                    if (str != null) {
                        this.f15985g.set(i11, C4374v.m16841b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f15986h;
            if (str2 != null) {
                this.f15986h = C4374v.m16841b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: p */
        public final void m16886p(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt == '/' || charAt == '\\') {
                this.f15984f.clear();
                this.f15984f.add("");
                i10++;
            } else {
                List<String> list = this.f15984f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                if (i12 >= i11) {
                    return;
                }
                i10 = C4596e.m18106n(str, i12, i11, "/\\");
                boolean z10 = i10 < i11;
                m16884n(str, i12, i10, z10, true);
                if (z10) {
                    i10++;
                }
            }
        }

        /* renamed from: q */
        public a m16887q(String str) {
            Objects.requireNonNull(str, "scheme == null");
            String str2 = "http";
            if (!str.equalsIgnoreCase("http")) {
                str2 = "https";
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f15979a = str2;
            return this;
        }

        /* renamed from: t */
        public a m16888t(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f15980b = C4374v.m16841b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            String str2 = this.f15979a;
            if (str2 != null) {
                sb2.append(str2);
                str = "://";
            } else {
                str = "//";
            }
            sb2.append(str);
            if (!this.f15980b.isEmpty() || !this.f15981c.isEmpty()) {
                sb2.append(this.f15980b);
                if (!this.f15981c.isEmpty()) {
                    sb2.append(':');
                    sb2.append(this.f15981c);
                }
                sb2.append('@');
            }
            String str3 = this.f15982d;
            if (str3 != null) {
                if (str3.indexOf(58) != -1) {
                    sb2.append('[');
                    sb2.append(this.f15982d);
                    sb2.append(']');
                } else {
                    sb2.append(this.f15982d);
                }
            }
            if (this.f15983e != -1 || this.f15979a != null) {
                int m16875c = m16875c();
                String str4 = this.f15979a;
                if (str4 == null || m16875c != C4374v.m16843d(str4)) {
                    sb2.append(':');
                    sb2.append(m16875c);
                }
            }
            C4374v.m16846q(sb2, this.f15984f);
            if (this.f15985g != null) {
                sb2.append('?');
                C4374v.m16845n(sb2, this.f15985g);
            }
            if (this.f15986h != null) {
                sb2.append('#');
                sb2.append(this.f15986h);
            }
            return sb2.toString();
        }
    }

    public C4374v(a aVar) {
        this.f15970a = aVar.f15979a;
        this.f15971b = m16848s(aVar.f15980b, false);
        this.f15972c = m16848s(aVar.f15981c, false);
        this.f15973d = aVar.f15982d;
        this.f15974e = aVar.m16875c();
        this.f15975f = m16865t(aVar.f15984f, false);
        List<String> list = aVar.f15985g;
        this.f15976g = list != null ? m16865t(list, true) : null;
        String str = aVar.f15986h;
        this.f15977h = str != null ? m16848s(str, false) : null;
        this.f15978i = aVar.toString();
    }

    /* renamed from: a */
    public static String m16840a(String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        int i12 = i10;
        while (i12 < i11) {
            int codePointAt = str.codePointAt(i12);
            if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || !z13)) {
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z10 && (!z11 || m16850v(str, i12, i11)))) && (codePointAt != 43 || !z12))) {
                    i12 += Character.charCount(codePointAt);
                }
            }
            C0557c c0557c = new C0557c();
            c0557c.m2814I0(str, i10, i12);
            m16842c(c0557c, str, i12, i11, str2, z10, z11, z12, z13, charset);
            return c0557c.m2825c0();
        }
        return str.substring(i10, i11);
    }

    /* renamed from: b */
    public static String m16841b(String str, String str2, boolean z10, boolean z11, boolean z12, boolean z13) {
        return m16840a(str, 0, str.length(), str2, z10, z11, z12, z13, null);
    }

    /* renamed from: c */
    public static void m16842c(C0557c c0557c, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
        C0557c c0557c2 = null;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (!z10 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z12) {
                    c0557c.mo2820S(z10 ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z13) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z10 || (z11 && !m16850v(str, i10, i11)))))) {
                    if (c0557c2 == null) {
                        c0557c2 = new C0557c();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        c0557c2.m2816J0(codePointAt);
                    } else {
                        c0557c2.m2810G0(str, i10, Character.charCount(codePointAt) + i10, charset);
                    }
                    while (!c0557c2.mo2805B()) {
                        int readByte = c0557c2.readByte() & 255;
                        c0557c.mo2807C(37);
                        char[] cArr = f15969j;
                        c0557c.mo2807C(cArr[(readByte >> 4) & 15]);
                        c0557c.mo2807C(cArr[readByte & 15]);
                    }
                } else {
                    c0557c.m2816J0(codePointAt);
                }
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: d */
    public static int m16843d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: k */
    public static C4374v m16844k(String str) {
        return new a().m16880h(null, str).m16874a();
    }

    /* renamed from: n */
    public static void m16845n(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10 += 2) {
            String str = list.get(i10);
            String str2 = list.get(i10 + 1);
            if (i10 > 0) {
                sb2.append('&');
            }
            sb2.append(str);
            if (str2 != null) {
                sb2.append('=');
                sb2.append(str2);
            }
        }
    }

    /* renamed from: q */
    public static void m16846q(StringBuilder sb2, List<String> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append('/');
            sb2.append(list.get(i10));
        }
    }

    /* renamed from: r */
    public static String m16847r(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                C0557c c0557c = new C0557c();
                c0557c.m2814I0(str, i10, i12);
                m16849u(c0557c, str, i12, i11, z10);
                return c0557c.m2825c0();
            }
        }
        return str.substring(i10, i11);
    }

    /* renamed from: s */
    public static String m16848s(String str, boolean z10) {
        return m16847r(str, 0, str.length(), z10);
    }

    /* renamed from: u */
    public static void m16849u(C0557c c0557c, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                if (codePointAt == 43 && z10) {
                    c0557c.mo2807C(32);
                }
                c0557c.m2816J0(codePointAt);
            } else {
                int m18102j = C4596e.m18102j(str.charAt(i10 + 1));
                int m18102j2 = C4596e.m18102j(str.charAt(i12));
                if (m18102j != -1 && m18102j2 != -1) {
                    c0557c.mo2807C((m18102j << 4) + m18102j2);
                    i10 = i12;
                }
                c0557c.m2816J0(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: v */
    public static boolean m16850v(String str, int i10, int i11) {
        int i12 = i10 + 2;
        return i12 < i11 && str.charAt(i10) == '%' && C4596e.m18102j(str.charAt(i10 + 1)) != -1 && C4596e.m18102j(str.charAt(i12)) != -1;
    }

    /* renamed from: y */
    public static List<String> m16851y(String str) {
        String str2;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 <= str.length()) {
            int indexOf = str.indexOf(38, i10);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i10);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i10, indexOf));
                str2 = null;
            } else {
                arrayList.add(str.substring(i10, indexOf2));
                str2 = str.substring(indexOf2 + 1, indexOf);
            }
            arrayList.add(str2);
            i10 = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: A */
    public C4374v m16852A(String str) {
        a m16864p = m16864p(str);
        if (m16864p != null) {
            return m16864p.m16874a();
        }
        return null;
    }

    /* renamed from: B */
    public String m16853B() {
        return this.f15970a;
    }

    /* renamed from: C */
    public URI m16854C() {
        String aVar = m16863o().m16885o().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: e */
    public String m16855e() {
        if (this.f15977h == null) {
            return null;
        }
        return this.f15978i.substring(this.f15978i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4374v) && ((C4374v) obj).f15978i.equals(this.f15978i);
    }

    /* renamed from: f */
    public String m16856f() {
        if (this.f15972c.isEmpty()) {
            return "";
        }
        return this.f15978i.substring(this.f15978i.indexOf(58, this.f15970a.length() + 3) + 1, this.f15978i.indexOf(64));
    }

    /* renamed from: g */
    public String m16857g() {
        int indexOf = this.f15978i.indexOf(47, this.f15970a.length() + 3);
        String str = this.f15978i;
        return this.f15978i.substring(indexOf, C4596e.m18106n(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: h */
    public List<String> m16858h() {
        int indexOf = this.f15978i.indexOf(47, this.f15970a.length() + 3);
        String str = this.f15978i;
        int m18106n = C4596e.m18106n(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < m18106n) {
            int i10 = indexOf + 1;
            int m18105m = C4596e.m18105m(this.f15978i, i10, m18106n, '/');
            arrayList.add(this.f15978i.substring(i10, m18105m));
            indexOf = m18105m;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f15978i.hashCode();
    }

    /* renamed from: i */
    public String m16859i() {
        if (this.f15976g == null) {
            return null;
        }
        int indexOf = this.f15978i.indexOf(63) + 1;
        String str = this.f15978i;
        return this.f15978i.substring(indexOf, C4596e.m18105m(str, indexOf, str.length(), '#'));
    }

    /* renamed from: j */
    public String m16860j() {
        if (this.f15971b.isEmpty()) {
            return "";
        }
        int length = this.f15970a.length() + 3;
        String str = this.f15978i;
        return this.f15978i.substring(length, C4596e.m18106n(str, length, str.length(), ":@"));
    }

    /* renamed from: l */
    public String m16861l() {
        return this.f15973d;
    }

    /* renamed from: m */
    public boolean m16862m() {
        return this.f15970a.equals("https");
    }

    /* renamed from: o */
    public a m16863o() {
        a aVar = new a();
        aVar.f15979a = this.f15970a;
        aVar.f15980b = m16860j();
        aVar.f15981c = m16856f();
        aVar.f15982d = this.f15973d;
        aVar.f15983e = this.f15974e != m16843d(this.f15970a) ? this.f15974e : -1;
        aVar.f15984f.clear();
        aVar.f15984f.addAll(m16858h());
        aVar.m16876d(m16859i());
        aVar.f15986h = m16855e();
        return aVar;
    }

    /* renamed from: p */
    public a m16864p(String str) {
        try {
            return new a().m16880h(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: t */
    public final List<String> m16865t(List<String> list, boolean z10) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            String str = list.get(i10);
            arrayList.add(str != null ? m16848s(str, z10) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String toString() {
        return this.f15978i;
    }

    /* renamed from: w */
    public int m16866w() {
        return this.f15974e;
    }

    /* renamed from: x */
    public String m16867x() {
        if (this.f15976g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        m16845n(sb2, this.f15976g);
        return sb2.toString();
    }

    /* renamed from: z */
    public String m16868z() {
        return m16864p("/...").m16888t("").m16881j("").m16874a().toString();
    }
}
