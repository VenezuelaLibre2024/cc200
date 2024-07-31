package p284te;

import bf.C0557c;
import bf.C0566l;
import bf.C0575u;
import bf.InterfaceC0558d;
import bf.InterfaceC0559e;
import bf.InterfaceC0573s;
import bf.InterfaceC0574t;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p284te.C4769c;
import re.C4349b0;
import re.C4353d0;
import re.C4373u;
import re.EnumC4378z;
import re.InterfaceC4375w;
import se.AbstractC4592a;
import se.C4596e;
import ve.C5170e;
import ve.C5171f;
import ve.C5173h;

/* renamed from: te.a */
/* loaded from: classes2.dex */
public final class C4767a implements InterfaceC4375w {

    /* renamed from: a */
    public final InterfaceC4770d f17735a;

    /* renamed from: te.a$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC0574t {

        /* renamed from: h */
        public boolean f17736h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC0559e f17737i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4768b f17738j;

        /* renamed from: k */
        public final /* synthetic */ InterfaceC0558d f17739k;

        public a(InterfaceC0559e interfaceC0559e, InterfaceC4768b interfaceC4768b, InterfaceC0558d interfaceC0558d) {
            this.f17737i = interfaceC0559e;
            this.f17738j = interfaceC4768b;
            this.f17739k = interfaceC0558d;
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: T */
        public long mo2800T(C0557c c0557c, long j10) {
            try {
                long mo2800T = this.f17737i.mo2800T(c0557c, j10);
                if (mo2800T != -1) {
                    c0557c.m2849w(this.f17739k.mo2823b(), c0557c.m2831g0() - mo2800T, mo2800T);
                    this.f17739k.mo2815J();
                    return mo2800T;
                }
                if (!this.f17736h) {
                    this.f17736h = true;
                    this.f17739k.close();
                }
                return -1L;
            } catch (IOException e10) {
                if (!this.f17736h) {
                    this.f17736h = true;
                    this.f17738j.m18690a();
                }
                throw e10;
            }
        }

        @Override // bf.InterfaceC0574t
        /* renamed from: c */
        public C0575u mo2801c() {
            return this.f17737i.mo2801c();
        }

        @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f17736h && !C4596e.m18107o(this, 100, TimeUnit.MILLISECONDS)) {
                this.f17736h = true;
                this.f17738j.m18690a();
            }
            this.f17737i.close();
        }
    }

    public C4767a(InterfaceC4770d interfaceC4770d) {
        this.f17735a = interfaceC4770d;
    }

    /* renamed from: c */
    public static C4373u m18685c(C4373u c4373u, C4373u c4373u2) {
        C4373u.a aVar = new C4373u.a();
        int m16831h = c4373u.m16831h();
        for (int i10 = 0; i10 < m16831h; i10++) {
            String m16829e = c4373u.m16829e(i10);
            String m16832i = c4373u.m16832i(i10);
            if ((!"Warning".equalsIgnoreCase(m16829e) || !m16832i.startsWith("1")) && (m18686d(m16829e) || !m18687e(m16829e) || c4373u2.m16828c(m16829e) == null)) {
                AbstractC4592a.f17225a.mo16924b(aVar, m16829e, m16832i);
            }
        }
        int m16831h2 = c4373u2.m16831h();
        for (int i11 = 0; i11 < m16831h2; i11++) {
            String m16829e2 = c4373u2.m16829e(i11);
            if (!m18686d(m16829e2) && m18687e(m16829e2)) {
                AbstractC4592a.f17225a.mo16924b(aVar, m16829e2, c4373u2.m16832i(i11));
            }
        }
        return aVar.m16837d();
    }

    /* renamed from: d */
    public static boolean m18686d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: e */
    public static boolean m18687e(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    /* renamed from: f */
    public static C4353d0 m18688f(C4353d0 c4353d0) {
        return (c4353d0 == null || c4353d0.m16703a() == null) ? c4353d0 : c4353d0.m16710x().m16712b(null).m16713c();
    }

    @Override // re.InterfaceC4375w
    /* renamed from: a */
    public C4353d0 mo16889a(InterfaceC4375w.a aVar) {
        InterfaceC4770d interfaceC4770d = this.f17735a;
        C4353d0 m18704f = interfaceC4770d != null ? interfaceC4770d.m18704f(aVar.mo16894e()) : null;
        C4769c m18696c = new C4769c.a(System.currentTimeMillis(), aVar.mo16894e(), m18704f).m18696c();
        C4349b0 c4349b0 = m18696c.f17741a;
        C4353d0 c4353d0 = m18696c.f17742b;
        InterfaceC4770d interfaceC4770d2 = this.f17735a;
        if (interfaceC4770d2 != null) {
            interfaceC4770d2.m18700b(m18696c);
        }
        if (m18704f != null && c4353d0 == null) {
            C4596e.m18098f(m18704f.m16703a());
        }
        if (c4349b0 == null && c4353d0 == null) {
            return new C4353d0.a().m16727q(aVar.mo16894e()).m16725o(EnumC4378z.HTTP_1_1).m16717g(504).m16722l("Unsatisfiable Request (only-if-cached)").m16712b(C4596e.f17233d).m16728r(-1L).m16726p(System.currentTimeMillis()).m16713c();
        }
        if (c4349b0 == null) {
            return c4353d0.m16710x().m16714d(m18688f(c4353d0)).m16713c();
        }
        try {
            C4353d0 mo16892c = aVar.mo16892c(c4349b0);
            if (mo16892c == null && m18704f != null) {
            }
            if (c4353d0 != null) {
                if (mo16892c.m16705f() == 304) {
                    C4353d0 m16713c = c4353d0.m16710x().m16720j(m18685c(c4353d0.m16709w(), mo16892c.m16709w())).m16728r(mo16892c.m16702P()).m16726p(mo16892c.m16700I()).m16714d(m18688f(c4353d0)).m16723m(m18688f(mo16892c)).m16713c();
                    mo16892c.m16703a().close();
                    this.f17735a.m18699a();
                    this.f17735a.m18702d(c4353d0, m16713c);
                    return m16713c;
                }
                C4596e.m18098f(c4353d0.m16703a());
            }
            C4353d0 m16713c2 = mo16892c.m16710x().m16714d(m18688f(c4353d0)).m16723m(m18688f(mo16892c)).m16713c();
            if (this.f17735a != null) {
                if (C5170e.m20936c(m16713c2) && C4769c.m18692a(m16713c2, c4349b0)) {
                    return m18689b(this.f17735a.m18703e(m16713c2), m16713c2);
                }
                if (C5171f.m20942a(c4349b0.m16664f())) {
                    try {
                        this.f17735a.m18701c(c4349b0);
                    } catch (IOException unused) {
                    }
                }
            }
            return m16713c2;
        } finally {
            if (m18704f != null) {
                C4596e.m18098f(m18704f.m16703a());
            }
        }
    }

    /* renamed from: b */
    public final C4353d0 m18689b(InterfaceC4768b interfaceC4768b, C4353d0 c4353d0) {
        InterfaceC0573s m18691b;
        if (interfaceC4768b == null || (m18691b = interfaceC4768b.m18691b()) == null) {
            return c4353d0;
        }
        return c4353d0.m16710x().m16712b(new C5173h(c4353d0.m16707l("Content-Type"), c4353d0.m16703a().mo16733f(), C0566l.m2894b(new a(c4353d0.m16703a().mo16734n(), interfaceC4768b, C0566l.m2893a(m18691b))))).m16713c();
    }
}
