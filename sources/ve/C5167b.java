package ve;

import bf.C0566l;
import bf.InterfaceC0558d;
import java.net.ProtocolException;
import p299ue.C5015c;
import re.AbstractC4355e0;
import re.C4349b0;
import re.C4353d0;
import re.InterfaceC4375w;
import se.C4596e;

/* renamed from: ve.b */
/* loaded from: classes2.dex */
public final class C5167b implements InterfaceC4375w {

    /* renamed from: a */
    public final boolean f19502a;

    public C5167b(boolean z10) {
        this.f19502a = z10;
    }

    @Override // re.InterfaceC4375w
    /* renamed from: a */
    public C4353d0 mo16889a(InterfaceC4375w.a aVar) {
        boolean z10;
        C4353d0.a m16710x;
        AbstractC4355e0 m19661k;
        C5172g c5172g = (C5172g) aVar;
        C5015c m20947f = c5172g.m20947f();
        C4349b0 mo16894e = c5172g.mo16894e();
        long currentTimeMillis = System.currentTimeMillis();
        m20947f.m19666p(mo16894e);
        C4353d0.a aVar2 = null;
        if (!C5171f.m20943b(mo16894e.m16664f()) || mo16894e.m16659a() == null) {
            m20947f.m19660j();
            z10 = false;
        } else {
            if ("100-continue".equalsIgnoreCase(mo16894e.m16661c("Expect"))) {
                m20947f.m19657g();
                m20947f.m19664n();
                aVar2 = m20947f.m19662l(true);
                z10 = true;
            } else {
                z10 = false;
            }
            if (aVar2 != null) {
                m20947f.m19660j();
                if (!m20947f.m19653c().m19690n()) {
                    m20947f.m19659i();
                }
            } else if (mo16894e.m16659a().m16681e()) {
                m20947f.m19657g();
                mo16894e.m16659a().mo16683g(C0566l.m2893a(m20947f.m19654d(mo16894e, true)));
            } else {
                InterfaceC0558d m2893a = C0566l.m2893a(m20947f.m19654d(mo16894e, false));
                mo16894e.m16659a().mo16683g(m2893a);
                m2893a.close();
            }
        }
        if (mo16894e.m16659a() == null || !mo16894e.m16659a().m16681e()) {
            m20947f.m19656f();
        }
        if (!z10) {
            m20947f.m19664n();
        }
        if (aVar2 == null) {
            aVar2 = m20947f.m19662l(false);
        }
        C4353d0 m16713c = aVar2.m16727q(mo16894e).m16718h(m20947f.m19653c().m19687k()).m16728r(currentTimeMillis).m16726p(System.currentTimeMillis()).m16713c();
        int m16705f = m16713c.m16705f();
        if (m16705f == 100) {
            m16713c = m20947f.m19662l(false).m16727q(mo16894e).m16718h(m20947f.m19653c().m19687k()).m16728r(currentTimeMillis).m16726p(System.currentTimeMillis()).m16713c();
            m16705f = m16713c.m16705f();
        }
        m20947f.m19663m(m16713c);
        if (this.f19502a && m16705f == 101) {
            m16710x = m16713c.m16710x();
            m19661k = C4596e.f17233d;
        } else {
            m16710x = m16713c.m16710x();
            m19661k = m20947f.m19661k(m16713c);
        }
        C4353d0 m16713c2 = m16710x.m16712b(m19661k).m16713c();
        if ("close".equalsIgnoreCase(m16713c2.m16701K().m16661c("Connection")) || "close".equalsIgnoreCase(m16713c2.m16707l("Connection"))) {
            m20947f.m19659i();
        }
        if ((m16705f != 204 && m16705f != 205) || m16713c2.m16703a().mo16733f() <= 0) {
            return m16713c2;
        }
        throw new ProtocolException("HTTP " + m16705f + " had non-zero Content-Length: " + m16713c2.m16703a().mo16733f());
    }
}
