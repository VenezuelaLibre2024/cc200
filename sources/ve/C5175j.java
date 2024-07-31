package ve;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p079f6.C1841a;
import p299ue.C5015c;
import p299ue.C5021i;
import p299ue.C5023k;
import p344xe.C5768a;
import re.AbstractC4351c0;
import re.C4349b0;
import re.C4353d0;
import re.C4357f0;
import re.C4374v;
import re.C4377y;
import re.InterfaceC4375w;
import se.AbstractC4592a;
import se.C4596e;

/* renamed from: ve.j */
/* loaded from: classes2.dex */
public final class C5175j implements InterfaceC4375w {

    /* renamed from: a */
    public final C4377y f19521a;

    public C5175j(C4377y c4377y) {
        this.f19521a = c4377y;
    }

    @Override // re.InterfaceC4375w
    /* renamed from: a */
    public C4353d0 mo16889a(InterfaceC4375w.a aVar) {
        C5015c mo16928f;
        C4349b0 m20953b;
        C4349b0 mo16894e = aVar.mo16894e();
        C5172g c5172g = (C5172g) aVar;
        C5023k m20949h = c5172g.m20949h();
        int i10 = 0;
        C4353d0 c4353d0 = null;
        while (true) {
            m20949h.m19735m(mo16894e);
            if (m20949h.m19731i()) {
                throw new IOException("Canceled");
            }
            try {
                try {
                    C4353d0 m20948g = c5172g.m20948g(mo16894e, m20949h, null);
                    if (c4353d0 != null) {
                        m20948g = m20948g.m16710x().m16724n(c4353d0.m16710x().m16712b(null).m16713c()).m16713c();
                    }
                    c4353d0 = m20948g;
                    mo16928f = AbstractC4592a.f17225a.mo16928f(c4353d0);
                    m20953b = m20953b(c4353d0, mo16928f != null ? mo16928f.m19653c().m19693q() : null);
                } catch (IOException e10) {
                    if (!m20955d(e10, m20949h, !(e10 instanceof C5768a), mo16894e)) {
                        throw e10;
                    }
                } catch (C5021i e11) {
                    if (!m20955d(e11.m19712c(), m20949h, false, mo16894e)) {
                        throw e11.m19711b();
                    }
                }
                if (m20953b == null) {
                    if (mo16928f != null && mo16928f.m19658h()) {
                        m20949h.m19737o();
                    }
                    return c4353d0;
                }
                AbstractC4351c0 m16659a = m20953b.m16659a();
                if (m16659a != null && m16659a.m16682f()) {
                    return c4353d0;
                }
                C4596e.m18098f(c4353d0.m16703a());
                if (m20949h.m19730h()) {
                    mo16928f.m19655e();
                }
                i10++;
                if (i10 > 20) {
                    throw new ProtocolException("Too many follow-up requests: " + i10);
                }
                mo16894e = m20953b;
            } finally {
                m20949h.m19728f();
            }
        }
    }

    /* renamed from: b */
    public final C4349b0 m20953b(C4353d0 c4353d0, C4357f0 c4357f0) {
        String m16707l;
        C4374v m16852A;
        if (c4353d0 == null) {
            throw new IllegalStateException();
        }
        int m16705f = c4353d0.m16705f();
        String m16664f = c4353d0.m16701K().m16664f();
        if (m16705f == 307 || m16705f == 308) {
            if (!m16664f.equals("GET") && !m16664f.equals("HEAD")) {
                return null;
            }
        } else {
            if (m16705f == 401) {
                return this.f19521a.m16901b().mo16658a(c4357f0, c4353d0);
            }
            if (m16705f == 503) {
                if ((c4353d0.m16699E() == null || c4353d0.m16699E().m16705f() != 503) && m20957f(c4353d0, C1841a.e.API_PRIORITY_OTHER) == 0) {
                    return c4353d0.m16701K();
                }
                return null;
            }
            if (m16705f == 407) {
                if ((c4357f0 != null ? c4357f0.m16738b() : this.f19521a.m16920x()).type() == Proxy.Type.HTTP) {
                    return this.f19521a.m16921y().mo16658a(c4357f0, c4353d0);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (m16705f == 408) {
                if (!this.f19521a.m16897B()) {
                    return null;
                }
                AbstractC4351c0 m16659a = c4353d0.m16701K().m16659a();
                if (m16659a != null && m16659a.m16682f()) {
                    return null;
                }
                if ((c4353d0.m16699E() == null || c4353d0.m16699E().m16705f() != 408) && m20957f(c4353d0, 0) <= 0) {
                    return c4353d0.m16701K();
                }
                return null;
            }
            switch (m16705f) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f19521a.m16911n() || (m16707l = c4353d0.m16707l("Location")) == null || (m16852A = c4353d0.m16701K().m16666h().m16852A(m16707l)) == null) {
            return null;
        }
        if (!m16852A.m16853B().equals(c4353d0.m16701K().m16666h().m16853B()) && !this.f19521a.m16912o()) {
            return null;
        }
        C4349b0.a m16665g = c4353d0.m16701K().m16665g();
        if (C5171f.m20943b(m16664f)) {
            boolean m20945d = C5171f.m20945d(m16664f);
            if (C5171f.m20944c(m16664f)) {
                m16665g.m16671e("GET", null);
            } else {
                m16665g.m16671e(m16664f, m20945d ? c4353d0.m16701K().m16659a() : null);
            }
            if (!m20945d) {
                m16665g.m16672f("Transfer-Encoding");
                m16665g.m16672f("Content-Length");
                m16665g.m16672f("Content-Type");
            }
        }
        if (!C4596e.m18084D(c4353d0.m16701K().m16666h(), m16852A)) {
            m16665g.m16672f("Authorization");
        }
        return m16665g.m16674h(m16852A).m16667a();
    }

    /* renamed from: c */
    public final boolean m20954c(IOException iOException, boolean z10) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        return iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z10 : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* renamed from: d */
    public final boolean m20955d(IOException iOException, C5023k c5023k, boolean z10, C4349b0 c4349b0) {
        if (this.f19521a.m16897B()) {
            return !(z10 && m20956e(iOException, c4349b0)) && m20954c(iOException, z10) && c5023k.m19725c();
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m20956e(IOException iOException, C4349b0 c4349b0) {
        AbstractC4351c0 m16659a = c4349b0.m16659a();
        return (m16659a != null && m16659a.m16682f()) || (iOException instanceof FileNotFoundException);
    }

    /* renamed from: f */
    public final int m20957f(C4353d0 c4353d0, int i10) {
        String m16707l = c4353d0.m16707l("Retry-After");
        return m16707l == null ? i10 : m16707l.matches("\\d+") ? Integer.valueOf(m16707l).intValue() : C1841a.e.API_PRIORITY_OTHER;
    }
}
