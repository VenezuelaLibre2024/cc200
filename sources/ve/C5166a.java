package ve;

import bf.C0564j;
import bf.C0566l;
import java.util.List;
import re.AbstractC4351c0;
import re.C4349b0;
import re.C4353d0;
import re.C4365m;
import re.InterfaceC4366n;
import re.InterfaceC4375w;
import se.C4596e;
import se.C4597f;

/* renamed from: ve.a */
/* loaded from: classes2.dex */
public final class C5166a implements InterfaceC4375w {

    /* renamed from: a */
    public final InterfaceC4366n f19501a;

    public C5166a(InterfaceC4366n interfaceC4366n) {
        this.f19501a = interfaceC4366n;
    }

    @Override // re.InterfaceC4375w
    /* renamed from: a */
    public C4353d0 mo16889a(InterfaceC4375w.a aVar) {
        C4349b0 mo16894e = aVar.mo16894e();
        C4349b0.a m16665g = mo16894e.m16665g();
        AbstractC4351c0 m16659a = mo16894e.m16659a();
        if (m16659a != null) {
            m16659a.mo16680b();
            long mo16679a = m16659a.mo16679a();
            if (mo16679a != -1) {
                m16665g.m16669c("Content-Length", Long.toString(mo16679a));
                m16665g.m16672f("Transfer-Encoding");
            } else {
                m16665g.m16669c("Transfer-Encoding", "chunked");
                m16665g.m16672f("Content-Length");
            }
        }
        boolean z10 = false;
        if (mo16894e.m16661c("Host") == null) {
            m16665g.m16669c("Host", C4596e.m18110r(mo16894e.m16666h(), false));
        }
        if (mo16894e.m16661c("Connection") == null) {
            m16665g.m16669c("Connection", "Keep-Alive");
        }
        if (mo16894e.m16661c("Accept-Encoding") == null && mo16894e.m16661c("Range") == null) {
            z10 = true;
            m16665g.m16669c("Accept-Encoding", "gzip");
        }
        List<C4365m> mo16781a = this.f19501a.mo16781a(mo16894e.m16666h());
        if (!mo16781a.isEmpty()) {
            m16665g.m16669c("Cookie", m20922b(mo16781a));
        }
        if (mo16894e.m16661c("User-Agent") == null) {
            m16665g.m16669c("User-Agent", C4597f.m18119a());
        }
        C4353d0 mo16892c = aVar.mo16892c(m16665g.m16667a());
        C5170e.m20938e(this.f19501a, mo16894e.m16666h(), mo16892c.m16709w());
        C4353d0.a m16727q = mo16892c.m16710x().m16727q(mo16894e);
        if (z10 && "gzip".equalsIgnoreCase(mo16892c.m16707l("Content-Encoding")) && C5170e.m20936c(mo16892c)) {
            C0564j c0564j = new C0564j(mo16892c.m16703a().mo16734n());
            m16727q.m16720j(mo16892c.m16709w().m16830f().m16838e("Content-Encoding").m16838e("Content-Length").m16837d());
            m16727q.m16712b(new C5173h(mo16892c.m16707l("Content-Type"), -1L, C0566l.m2894b(c0564j)));
        }
        return m16727q.m16713c();
    }

    /* renamed from: b */
    public final String m20922b(List<C4365m> list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                sb2.append("; ");
            }
            C4365m c4365m = list.get(i10);
            sb2.append(c4365m.m16778c());
            sb2.append('=');
            sb2.append(c4365m.m16780k());
        }
        return sb2.toString();
    }
}
