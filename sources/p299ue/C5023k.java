package p299ue;

import bf.C0555a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import re.AbstractC4371s;
import re.C4346a;
import re.C4349b0;
import re.C4358g;
import re.C4374v;
import re.C4377y;
import re.InterfaceC4354e;
import re.InterfaceC4375w;
import se.AbstractC4592a;
import se.C4596e;
import ye.C5926f;

/* renamed from: ue.k */
/* loaded from: classes2.dex */
public final class C5023k {

    /* renamed from: a */
    public final C4377y f18811a;

    /* renamed from: b */
    public final C5019g f18812b;

    /* renamed from: c */
    public final InterfaceC4354e f18813c;

    /* renamed from: d */
    public final AbstractC4371s f18814d;

    /* renamed from: e */
    public final C0555a f18815e;

    /* renamed from: f */
    public Object f18816f;

    /* renamed from: g */
    public C4349b0 f18817g;

    /* renamed from: h */
    public C5016d f18818h;

    /* renamed from: i */
    public C5017e f18819i;

    /* renamed from: j */
    public C5015c f18820j;

    /* renamed from: k */
    public boolean f18821k;

    /* renamed from: l */
    public boolean f18822l;

    /* renamed from: m */
    public boolean f18823m;

    /* renamed from: n */
    public boolean f18824n;

    /* renamed from: o */
    public boolean f18825o;

    /* renamed from: ue.k$a */
    /* loaded from: classes2.dex */
    public class a extends C0555a {
        public a() {
        }

        @Override // bf.C0555a
        /* renamed from: t */
        public void mo2797t() {
            C5023k.this.m19726d();
        }
    }

    /* renamed from: ue.k$b */
    /* loaded from: classes2.dex */
    public static final class b extends WeakReference<C5023k> {

        /* renamed from: a */
        public final Object f18827a;

        public b(C5023k c5023k, Object obj) {
            super(c5023k);
            this.f18827a = obj;
        }
    }

    public C5023k(C4377y c4377y, InterfaceC4354e interfaceC4354e) {
        a aVar = new a();
        this.f18815e = aVar;
        this.f18811a = c4377y;
        this.f18812b = AbstractC4592a.f17225a.mo16930h(c4377y.m16905g());
        this.f18813c = interfaceC4354e;
        this.f18814d = c4377y.m16910m().mo16794a(interfaceC4354e);
        aVar.mo2884g(c4377y.m16902c(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public void m19723a(C5017e c5017e) {
        if (this.f18819i != null) {
            throw new IllegalStateException();
        }
        this.f18819i = c5017e;
        c5017e.f18788p.add(new b(this, this.f18816f));
    }

    /* renamed from: b */
    public void m19724b() {
        this.f18816f = C5926f.m23671l().mo23651o("response.body().close()");
        this.f18814d.m16800d(this.f18813c);
    }

    /* renamed from: c */
    public boolean m19725c() {
        return this.f18818h.m19674f() && this.f18818h.m19673e();
    }

    /* renamed from: d */
    public void m19726d() {
        C5015c c5015c;
        C5017e m19669a;
        synchronized (this.f18812b) {
            this.f18823m = true;
            c5015c = this.f18820j;
            C5016d c5016d = this.f18818h;
            m19669a = (c5016d == null || c5016d.m19669a() == null) ? this.f18819i : this.f18818h.m19669a();
        }
        if (c5015c != null) {
            c5015c.m19652b();
        } else if (m19669a != null) {
            m19669a.m19679c();
        }
    }

    /* renamed from: e */
    public final C4346a m19727e(C4374v c4374v) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C4358g c4358g;
        if (c4374v.m16862m()) {
            SSLSocketFactory m16899D = this.f18811a.m16899D();
            hostnameVerifier = this.f18811a.m16913p();
            sSLSocketFactory = m16899D;
            c4358g = this.f18811a.m16903e();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c4358g = null;
        }
        return new C4346a(c4374v.m16861l(), c4374v.m16866w(), this.f18811a.m16909l(), this.f18811a.m16898C(), sSLSocketFactory, hostnameVerifier, c4358g, this.f18811a.m16921y(), this.f18811a.m16920x(), this.f18811a.m16919w(), this.f18811a.m16906h(), this.f18811a.m16922z());
    }

    /* renamed from: f */
    public void m19728f() {
        synchronized (this.f18812b) {
            if (this.f18825o) {
                throw new IllegalStateException();
            }
            this.f18820j = null;
        }
    }

    /* renamed from: g */
    public IOException m19729g(C5015c c5015c, boolean z10, boolean z11, IOException iOException) {
        boolean z12;
        synchronized (this.f18812b) {
            C5015c c5015c2 = this.f18820j;
            if (c5015c != c5015c2) {
                return iOException;
            }
            boolean z13 = true;
            if (z10) {
                z12 = !this.f18821k;
                this.f18821k = true;
            } else {
                z12 = false;
            }
            if (z11) {
                if (!this.f18822l) {
                    z12 = true;
                }
                this.f18822l = true;
            }
            if (this.f18821k && this.f18822l && z12) {
                c5015c2.m19653c().f18785m++;
                this.f18820j = null;
            } else {
                z13 = false;
            }
            return z13 ? m19732j(iOException, false) : iOException;
        }
    }

    /* renamed from: h */
    public boolean m19730h() {
        boolean z10;
        synchronized (this.f18812b) {
            z10 = this.f18820j != null;
        }
        return z10;
    }

    /* renamed from: i */
    public boolean m19731i() {
        boolean z10;
        synchronized (this.f18812b) {
            z10 = this.f18823m;
        }
        return z10;
    }

    /* renamed from: j */
    public final IOException m19732j(IOException iOException, boolean z10) {
        C5017e c5017e;
        Socket m19736n;
        boolean z11;
        synchronized (this.f18812b) {
            if (z10) {
                if (this.f18820j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            c5017e = this.f18819i;
            m19736n = (c5017e != null && this.f18820j == null && (z10 || this.f18825o)) ? m19736n() : null;
            if (this.f18819i != null) {
                c5017e = null;
            }
            z11 = this.f18825o && this.f18820j == null;
        }
        C4596e.m18099g(m19736n);
        if (c5017e != null) {
            this.f18814d.m16805i(this.f18813c, c5017e);
        }
        if (z11) {
            boolean z12 = iOException != null;
            iOException = m19739q(iOException);
            AbstractC4371s abstractC4371s = this.f18814d;
            InterfaceC4354e interfaceC4354e = this.f18813c;
            if (z12) {
                abstractC4371s.m16799c(interfaceC4354e, iOException);
            } else {
                abstractC4371s.m16798b(interfaceC4354e);
            }
        }
        return iOException;
    }

    /* renamed from: k */
    public C5015c m19733k(InterfaceC4375w.a aVar, boolean z10) {
        synchronized (this.f18812b) {
            if (this.f18825o) {
                throw new IllegalStateException("released");
            }
            if (this.f18820j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C5015c c5015c = new C5015c(this, this.f18813c, this.f18814d, this.f18818h, this.f18818h.m19670b(this.f18811a, aVar, z10));
        synchronized (this.f18812b) {
            this.f18820j = c5015c;
            this.f18821k = false;
            this.f18822l = false;
        }
        return c5015c;
    }

    /* renamed from: l */
    public IOException m19734l(IOException iOException) {
        synchronized (this.f18812b) {
            this.f18825o = true;
        }
        return m19732j(iOException, false);
    }

    /* renamed from: m */
    public void m19735m(C4349b0 c4349b0) {
        C4349b0 c4349b02 = this.f18817g;
        if (c4349b02 != null) {
            if (C4596e.m18084D(c4349b02.m16666h(), c4349b0.m16666h()) && this.f18818h.m19673e()) {
                return;
            }
            if (this.f18820j != null) {
                throw new IllegalStateException();
            }
            if (this.f18818h != null) {
                m19732j(null, true);
                this.f18818h = null;
            }
        }
        this.f18817g = c4349b0;
        this.f18818h = new C5016d(this, this.f18812b, m19727e(c4349b0.m16666h()), this.f18813c, this.f18814d);
    }

    /* renamed from: n */
    public Socket m19736n() {
        int i10 = 0;
        int size = this.f18819i.f18788p.size();
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            }
            if (this.f18819i.f18788p.get(i10).get() == this) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        C5017e c5017e = this.f18819i;
        c5017e.f18788p.remove(i10);
        this.f18819i = null;
        if (!c5017e.f18788p.isEmpty()) {
            return null;
        }
        c5017e.f18789q = System.nanoTime();
        if (this.f18812b.m19703d(c5017e)) {
            return c5017e.m19695s();
        }
        return null;
    }

    /* renamed from: o */
    public void m19737o() {
        if (this.f18824n) {
            throw new IllegalStateException();
        }
        this.f18824n = true;
        this.f18815e.m2792n();
    }

    /* renamed from: p */
    public void m19738p() {
        this.f18815e.m2789k();
    }

    /* renamed from: q */
    public final IOException m19739q(IOException iOException) {
        if (this.f18824n || !this.f18815e.m2792n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
