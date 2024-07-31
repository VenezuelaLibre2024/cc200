package ve;

import bf.C0560f;
import java.util.List;
import p079f6.C1841a;
import re.C4353d0;
import re.C4365m;
import re.C4373u;
import re.C4374v;
import re.InterfaceC4366n;

/* renamed from: ve.e */
/* loaded from: classes2.dex */
public final class C5170e {

    /* renamed from: a */
    public static final C0560f f19506a = C0560f.m2859m("\"\\");

    /* renamed from: b */
    public static final C0560f f19507b = C0560f.m2859m("\t ,=");

    /* renamed from: a */
    public static long m20934a(C4373u c4373u) {
        return m20941h(c4373u.m16828c("Content-Length"));
    }

    /* renamed from: b */
    public static long m20935b(C4353d0 c4353d0) {
        return m20934a(c4353d0.m16709w());
    }

    /* renamed from: c */
    public static boolean m20936c(C4353d0 c4353d0) {
        if (c4353d0.m16701K().m16664f().equals("HEAD")) {
            return false;
        }
        int m16705f = c4353d0.m16705f();
        return (((m16705f >= 100 && m16705f < 200) || m16705f == 204 || m16705f == 304) && m20935b(c4353d0) == -1 && !"chunked".equalsIgnoreCase(c4353d0.m16707l("Transfer-Encoding"))) ? false : true;
    }

    /* renamed from: d */
    public static int m20937d(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return C1841a.e.API_PRIORITY_OTHER;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    /* renamed from: e */
    public static void m20938e(InterfaceC4366n interfaceC4366n, C4374v c4374v, C4373u c4373u) {
        if (interfaceC4366n == InterfaceC4366n.f15951a) {
            return;
        }
        List<C4365m> m16774f = C4365m.m16774f(c4374v, c4373u);
        if (m16774f.isEmpty()) {
            return;
        }
        interfaceC4366n.mo16782b(c4374v, m16774f);
    }

    /* renamed from: f */
    public static int m20939f(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    /* renamed from: g */
    public static int m20940g(String str, int i10) {
        char charAt;
        while (i10 < str.length() && ((charAt = str.charAt(i10)) == ' ' || charAt == '\t')) {
            i10++;
        }
        return i10;
    }

    /* renamed from: h */
    public static long m20941h(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }
}
