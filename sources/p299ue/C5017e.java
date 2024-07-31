package p299ue;

import af.C0115d;
import bf.C0566l;
import bf.C0575u;
import bf.InterfaceC0558d;
import bf.InterfaceC0559e;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import p328we.C5482a;
import p344xe.C5768a;
import p344xe.C5773f;
import p344xe.C5774g;
import p344xe.C5776i;
import p344xe.C5781n;
import p344xe.EnumC5769b;
import re.AbstractC4371s;
import re.C4346a;
import re.C4349b0;
import re.C4353d0;
import re.C4357f0;
import re.C4358g;
import re.C4364l;
import re.C4372t;
import re.C4374v;
import re.C4377y;
import re.EnumC4378z;
import re.InterfaceC4354e;
import re.InterfaceC4362j;
import re.InterfaceC4375w;
import se.AbstractC4592a;
import se.C4596e;
import se.C4597f;
import ve.InterfaceC5168c;
import ye.C5926f;

/* renamed from: ue.e */
/* loaded from: classes2.dex */
public final class C5017e extends C5773f.j implements InterfaceC4362j {

    /* renamed from: b */
    public final C5019g f18774b;

    /* renamed from: c */
    public final C4357f0 f18775c;

    /* renamed from: d */
    public Socket f18776d;

    /* renamed from: e */
    public Socket f18777e;

    /* renamed from: f */
    public C4372t f18778f;

    /* renamed from: g */
    public EnumC4378z f18779g;

    /* renamed from: h */
    public C5773f f18780h;

    /* renamed from: i */
    public InterfaceC0559e f18781i;

    /* renamed from: j */
    public InterfaceC0558d f18782j;

    /* renamed from: k */
    public boolean f18783k;

    /* renamed from: l */
    public int f18784l;

    /* renamed from: m */
    public int f18785m;

    /* renamed from: n */
    public int f18786n;

    /* renamed from: o */
    public int f18787o = 1;

    /* renamed from: p */
    public final List<Reference<C5023k>> f18788p = new ArrayList();

    /* renamed from: q */
    public long f18789q = Long.MAX_VALUE;

    public C5017e(C5019g c5019g, C4357f0 c4357f0) {
        this.f18774b = c5019g;
        this.f18775c = c4357f0;
    }

    @Override // p344xe.C5773f.j
    /* renamed from: a */
    public void mo19677a(C5773f c5773f) {
        synchronized (this.f18774b) {
            this.f18787o = c5773f.m22966e0();
        }
    }

    @Override // p344xe.C5773f.j
    /* renamed from: b */
    public void mo19678b(C5776i c5776i) {
        c5776i.m23016d(EnumC5769b.REFUSED_STREAM, null);
    }

    /* renamed from: c */
    public void m19679c() {
        C4596e.m18099g(this.f18776d);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m19680d(int r17, int r18, int r19, int r20, boolean r21, re.InterfaceC4354e r22, re.AbstractC4371s r23) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p299ue.C5017e.m19680d(int, int, int, int, boolean, re.e, re.s):void");
    }

    /* renamed from: e */
    public final void m19681e(int i10, int i11, InterfaceC4354e interfaceC4354e, AbstractC4371s abstractC4371s) {
        Proxy m16738b = this.f18775c.m16738b();
        this.f18776d = (m16738b.type() == Proxy.Type.DIRECT || m16738b.type() == Proxy.Type.HTTP) ? this.f18775c.m16737a().m16642j().createSocket() : new Socket(m16738b);
        abstractC4371s.m16803g(interfaceC4354e, this.f18775c.m16740d(), m16738b);
        this.f18776d.setSoTimeout(i11);
        try {
            C5926f.m23671l().mo23649h(this.f18776d, this.f18775c.m16740d(), i10);
            try {
                this.f18781i = C0566l.m2894b(C0566l.m2901i(this.f18776d));
                this.f18782j = C0566l.m2893a(C0566l.m2898f(this.f18776d));
            } catch (NullPointerException e10) {
                if ("throw with null exception".equals(e10.getMessage())) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f18775c.m16740d());
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* renamed from: f */
    public final void m19682f(C5014b c5014b) {
        C4346a m16737a = this.f18775c.m16737a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) m16737a.m16643k().createSocket(this.f18776d, m16737a.m16644l().m16861l(), m16737a.m16644l().m16866w(), true);
                try {
                    C4364l m19648a = c5014b.m19648a(sSLSocket2);
                    if (m19648a.m16762f()) {
                        C5926f.m23671l().mo23642g(sSLSocket2, m16737a.m16644l().m16861l(), m16737a.m16638f());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    C4372t m16820b = C4372t.m16820b(session);
                    if (m16737a.m16637e().verify(m16737a.m16644l().m16861l(), session)) {
                        m16737a.m16633a().m16744a(m16737a.m16644l().m16861l(), m16820b.m16823d());
                        String mo23643n = m19648a.m16762f() ? C5926f.m23671l().mo23643n(sSLSocket2) : null;
                        this.f18777e = sSLSocket2;
                        this.f18781i = C0566l.m2894b(C0566l.m2901i(sSLSocket2));
                        this.f18782j = C0566l.m2893a(C0566l.m2898f(this.f18777e));
                        this.f18778f = m16820b;
                        this.f18779g = mo23643n != null ? EnumC4378z.m16935b(mo23643n) : EnumC4378z.HTTP_1_1;
                        C5926f.m23671l().mo23664a(sSLSocket2);
                        return;
                    }
                    List<Certificate> m16823d = m16820b.m16823d();
                    if (m16823d.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + m16737a.m16644l().m16861l() + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) m16823d.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + m16737a.m16644l().m16861l() + " not verified:\n    certificate: " + C4358g.m16741c(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C0115d.m496a(x509Certificate));
                } catch (AssertionError e10) {
                    e = e10;
                    if (!C4596e.m18118z(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C5926f.m23671l().mo23664a(sSLSocket);
                    }
                    C4596e.m18099g(sSLSocket);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (AssertionError e11) {
            e = e11;
        }
    }

    /* renamed from: g */
    public final void m19683g(int i10, int i11, int i12, InterfaceC4354e interfaceC4354e, AbstractC4371s abstractC4371s) {
        C4349b0 m19685i = m19685i();
        C4374v m16666h = m19685i.m16666h();
        for (int i13 = 0; i13 < 21; i13++) {
            m19681e(i10, i11, interfaceC4354e, abstractC4371s);
            m19685i = m19684h(i11, i12, m19685i, m16666h);
            if (m19685i == null) {
                return;
            }
            C4596e.m18099g(this.f18776d);
            this.f18776d = null;
            this.f18782j = null;
            this.f18781i = null;
            abstractC4371s.m16801e(interfaceC4354e, this.f18775c.m16740d(), this.f18775c.m16738b(), null);
        }
    }

    /* renamed from: h */
    public final C4349b0 m19684h(int i10, int i11, C4349b0 c4349b0, C4374v c4374v) {
        String str = "CONNECT " + C4596e.m18110r(c4374v, true) + " HTTP/1.1";
        while (true) {
            C5482a c5482a = new C5482a(null, null, this.f18781i, this.f18782j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f18781i.mo2801c().mo2884g(i10, timeUnit);
            this.f18782j.mo2799c().mo2884g(i11, timeUnit);
            c5482a.m21728B(c4349b0.m16662d(), str);
            c5482a.mo20923a();
            C4353d0 m16713c = c5482a.mo20926d(false).m16727q(c4349b0).m16713c();
            c5482a.m21727A(m16713c);
            int m16705f = m16713c.m16705f();
            if (m16705f == 200) {
                if (this.f18781i.mo2804A().mo2805B() && this.f18782j.mo2823b().mo2805B()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (m16705f != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + m16713c.m16705f());
            }
            C4349b0 mo16658a = this.f18775c.m16737a().m16640h().mo16658a(this.f18775c, m16713c);
            if (mo16658a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(m16713c.m16707l("Connection"))) {
                return mo16658a;
            }
            c4349b0 = mo16658a;
        }
    }

    /* renamed from: i */
    public final C4349b0 m19685i() {
        C4349b0 m16667a = new C4349b0.a().m16674h(this.f18775c.m16737a().m16644l()).m16671e("CONNECT", null).m16669c("Host", C4596e.m18110r(this.f18775c.m16737a().m16644l(), true)).m16669c("Proxy-Connection", "Keep-Alive").m16669c("User-Agent", C4597f.m18119a()).m16667a();
        C4349b0 mo16658a = this.f18775c.m16737a().m16640h().mo16658a(this.f18775c, new C4353d0.a().m16727q(m16667a).m16725o(EnumC4378z.HTTP_1_1).m16717g(407).m16722l("Preemptive Authenticate").m16712b(C4596e.f17233d).m16728r(-1L).m16726p(-1L).m16719i("Proxy-Authenticate", "OkHttp-Preemptive").m16713c());
        return mo16658a != null ? mo16658a : m16667a;
    }

    /* renamed from: j */
    public final void m19686j(C5014b c5014b, int i10, InterfaceC4354e interfaceC4354e, AbstractC4371s abstractC4371s) {
        if (this.f18775c.m16737a().m16643k() != null) {
            abstractC4371s.m16819y(interfaceC4354e);
            m19682f(c5014b);
            abstractC4371s.m16818x(interfaceC4354e, this.f18778f);
            if (this.f18779g == EnumC4378z.HTTP_2) {
                m19696t(i10);
                return;
            }
            return;
        }
        List<EnumC4378z> m16638f = this.f18775c.m16737a().m16638f();
        EnumC4378z enumC4378z = EnumC4378z.H2_PRIOR_KNOWLEDGE;
        if (!m16638f.contains(enumC4378z)) {
            this.f18777e = this.f18776d;
            this.f18779g = EnumC4378z.HTTP_1_1;
        } else {
            this.f18777e = this.f18776d;
            this.f18779g = enumC4378z;
            m19696t(i10);
        }
    }

    /* renamed from: k */
    public C4372t m19687k() {
        return this.f18778f;
    }

    /* renamed from: l */
    public boolean m19688l(C4346a c4346a, List<C4357f0> list) {
        if (this.f18788p.size() >= this.f18787o || this.f18783k || !AbstractC4592a.f17225a.mo16927e(this.f18775c.m16737a(), c4346a)) {
            return false;
        }
        if (c4346a.m16644l().m16861l().equals(m19693q().m16737a().m16644l().m16861l())) {
            return true;
        }
        if (this.f18780h == null || list == null || !m19694r(list) || c4346a.m16637e() != C0115d.f357a || !m19697u(c4346a.m16644l())) {
            return false;
        }
        try {
            c4346a.m16633a().m16744a(c4346a.m16644l().m16861l(), m19687k().m16823d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public boolean m19689m(boolean z10) {
        if (this.f18777e.isClosed() || this.f18777e.isInputShutdown() || this.f18777e.isOutputShutdown()) {
            return false;
        }
        C5773f c5773f = this.f18780h;
        if (c5773f != null) {
            return c5773f.m22965c0(System.nanoTime());
        }
        if (z10) {
            try {
                int soTimeout = this.f18777e.getSoTimeout();
                try {
                    this.f18777e.setSoTimeout(1);
                    return !this.f18781i.mo2805B();
                } finally {
                    this.f18777e.setSoTimeout(soTimeout);
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean m19690n() {
        return this.f18780h != null;
    }

    /* renamed from: o */
    public InterfaceC5168c m19691o(C4377y c4377y, InterfaceC4375w.a aVar) {
        if (this.f18780h != null) {
            return new C5774g(c4377y, this, aVar, this.f18780h);
        }
        this.f18777e.setSoTimeout(aVar.mo16890a());
        C0575u mo2801c = this.f18781i.mo2801c();
        long mo16890a = aVar.mo16890a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo2801c.mo2884g(mo16890a, timeUnit);
        this.f18782j.mo2799c().mo2884g(aVar.mo16891b(), timeUnit);
        return new C5482a(c4377y, this, this.f18781i, this.f18782j);
    }

    /* renamed from: p */
    public void m19692p() {
        synchronized (this.f18774b) {
            this.f18783k = true;
        }
    }

    /* renamed from: q */
    public C4357f0 m19693q() {
        return this.f18775c;
    }

    /* renamed from: r */
    public final boolean m19694r(List<C4357f0> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C4357f0 c4357f0 = list.get(i10);
            if (c4357f0.m16738b().type() == Proxy.Type.DIRECT && this.f18775c.m16738b().type() == Proxy.Type.DIRECT && this.f18775c.m16740d().equals(c4357f0.m16740d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public Socket m19695s() {
        return this.f18777e;
    }

    /* renamed from: t */
    public final void m19696t(int i10) {
        this.f18777e.setSoTimeout(0);
        C5773f m22980a = new C5773f.h(true).m22983d(this.f18777e, this.f18775c.m16737a().m16644l().m16861l(), this.f18781i, this.f18782j).m22981b(this).m22982c(i10).m22980a();
        this.f18780h = m22980a;
        m22980a.m22978y0();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f18775c.m16737a().m16644l().m16861l());
        sb2.append(":");
        sb2.append(this.f18775c.m16737a().m16644l().m16866w());
        sb2.append(", proxy=");
        sb2.append(this.f18775c.m16738b());
        sb2.append(" hostAddress=");
        sb2.append(this.f18775c.m16740d());
        sb2.append(" cipherSuite=");
        C4372t c4372t = this.f18778f;
        sb2.append(c4372t != null ? c4372t.m16821a() : "none");
        sb2.append(" protocol=");
        sb2.append(this.f18779g);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: u */
    public boolean m19697u(C4374v c4374v) {
        if (c4374v.m16866w() != this.f18775c.m16737a().m16644l().m16866w()) {
            return false;
        }
        if (c4374v.m16861l().equals(this.f18775c.m16737a().m16644l().m16861l())) {
            return true;
        }
        return this.f18778f != null && C0115d.f357a.m498c(c4374v.m16861l(), (X509Certificate) this.f18778f.m16823d().get(0));
    }

    /* renamed from: v */
    public void m19698v(IOException iOException) {
        int i10;
        synchronized (this.f18774b) {
            if (iOException instanceof C5781n) {
                EnumC5769b enumC5769b = ((C5781n) iOException).f21530h;
                if (enumC5769b == EnumC5769b.REFUSED_STREAM) {
                    int i11 = this.f18786n + 1;
                    this.f18786n = i11;
                    if (i11 > 1) {
                        this.f18783k = true;
                        i10 = this.f18784l;
                        this.f18784l = i10 + 1;
                    }
                } else if (enumC5769b != EnumC5769b.CANCEL) {
                    this.f18783k = true;
                    i10 = this.f18784l;
                    this.f18784l = i10 + 1;
                }
            } else if (!m19690n() || (iOException instanceof C5768a)) {
                this.f18783k = true;
                if (this.f18785m == 0) {
                    if (iOException != null) {
                        this.f18774b.m19702c(this.f18775c, iOException);
                    }
                    i10 = this.f18784l;
                    this.f18784l = i10 + 1;
                }
            }
        }
    }
}
