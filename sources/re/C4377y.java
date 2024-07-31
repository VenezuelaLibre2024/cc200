package re;

import af.AbstractC0114c;
import af.C0115d;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p284te.InterfaceC4770d;
import p299ue.C5015c;
import p299ue.C5019g;
import p374ze.C6133a;
import re.AbstractC4371s;
import re.C4353d0;
import re.C4373u;
import se.AbstractC4592a;
import se.C4596e;
import ye.C5926f;

/* renamed from: re.y */
/* loaded from: classes2.dex */
public class C4377y implements Cloneable {

    /* renamed from: I */
    public static final List<EnumC4378z> f15987I = C4596e.m18112t(EnumC4378z.HTTP_2, EnumC4378z.HTTP_1_1);

    /* renamed from: J */
    public static final List<C4364l> f15988J = C4596e.m18112t(C4364l.f15927h, C4364l.f15929j);

    /* renamed from: A */
    public final boolean f15989A;

    /* renamed from: B */
    public final boolean f15990B;

    /* renamed from: C */
    public final boolean f15991C;

    /* renamed from: D */
    public final int f15992D;

    /* renamed from: E */
    public final int f15993E;

    /* renamed from: F */
    public final int f15994F;

    /* renamed from: G */
    public final int f15995G;

    /* renamed from: H */
    public final int f15996H;

    /* renamed from: h */
    public final C4367o f15997h;

    /* renamed from: i */
    public final Proxy f15998i;

    /* renamed from: j */
    public final List<EnumC4378z> f15999j;

    /* renamed from: k */
    public final List<C4364l> f16000k;

    /* renamed from: l */
    public final List<InterfaceC4375w> f16001l;

    /* renamed from: m */
    public final List<InterfaceC4375w> f16002m;

    /* renamed from: n */
    public final AbstractC4371s.b f16003n;

    /* renamed from: o */
    public final ProxySelector f16004o;

    /* renamed from: p */
    public final InterfaceC4366n f16005p;

    /* renamed from: q */
    public final InterfaceC4770d f16006q;

    /* renamed from: r */
    public final SocketFactory f16007r;

    /* renamed from: s */
    public final SSLSocketFactory f16008s;

    /* renamed from: t */
    public final AbstractC0114c f16009t;

    /* renamed from: u */
    public final HostnameVerifier f16010u;

    /* renamed from: v */
    public final C4358g f16011v;

    /* renamed from: w */
    public final InterfaceC4350c f16012w;

    /* renamed from: x */
    public final InterfaceC4350c f16013x;

    /* renamed from: y */
    public final C4363k f16014y;

    /* renamed from: z */
    public final InterfaceC4369q f16015z;

    /* renamed from: re.y$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractC4592a {
        @Override // se.AbstractC4592a
        /* renamed from: a */
        public void mo16923a(C4373u.a aVar, String str) {
            aVar.m16835b(str);
        }

        @Override // se.AbstractC4592a
        /* renamed from: b */
        public void mo16924b(C4373u.a aVar, String str, String str2) {
            aVar.m16836c(str, str2);
        }

        @Override // se.AbstractC4592a
        /* renamed from: c */
        public void mo16925c(C4364l c4364l, SSLSocket sSLSocket, boolean z10) {
            c4364l.m16757a(sSLSocket, z10);
        }

        @Override // se.AbstractC4592a
        /* renamed from: d */
        public int mo16926d(C4353d0.a aVar) {
            return aVar.f15769c;
        }

        @Override // se.AbstractC4592a
        /* renamed from: e */
        public boolean mo16927e(C4346a c4346a, C4346a c4346a2) {
            return c4346a.m16636d(c4346a2);
        }

        @Override // se.AbstractC4592a
        /* renamed from: f */
        public C5015c mo16928f(C4353d0 c4353d0) {
            return c4353d0.f15765t;
        }

        @Override // se.AbstractC4592a
        /* renamed from: g */
        public void mo16929g(C4353d0.a aVar, C5015c c5015c) {
            aVar.m16721k(c5015c);
        }

        @Override // se.AbstractC4592a
        /* renamed from: h */
        public C5019g mo16930h(C4363k c4363k) {
            return c4363k.f15923a;
        }
    }

    /* renamed from: re.y$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: A */
        public int f16016A;

        /* renamed from: b */
        public Proxy f16018b;

        /* renamed from: h */
        public ProxySelector f16024h;

        /* renamed from: i */
        public InterfaceC4366n f16025i;

        /* renamed from: j */
        public InterfaceC4770d f16026j;

        /* renamed from: k */
        public SocketFactory f16027k;

        /* renamed from: l */
        public SSLSocketFactory f16028l;

        /* renamed from: m */
        public AbstractC0114c f16029m;

        /* renamed from: n */
        public HostnameVerifier f16030n;

        /* renamed from: o */
        public C4358g f16031o;

        /* renamed from: p */
        public InterfaceC4350c f16032p;

        /* renamed from: q */
        public InterfaceC4350c f16033q;

        /* renamed from: r */
        public C4363k f16034r;

        /* renamed from: s */
        public InterfaceC4369q f16035s;

        /* renamed from: t */
        public boolean f16036t;

        /* renamed from: u */
        public boolean f16037u;

        /* renamed from: v */
        public boolean f16038v;

        /* renamed from: w */
        public int f16039w;

        /* renamed from: x */
        public int f16040x;

        /* renamed from: y */
        public int f16041y;

        /* renamed from: z */
        public int f16042z;

        /* renamed from: e */
        public final List<InterfaceC4375w> f16021e = new ArrayList();

        /* renamed from: f */
        public final List<InterfaceC4375w> f16022f = new ArrayList();

        /* renamed from: a */
        public C4367o f16017a = new C4367o();

        /* renamed from: c */
        public List<EnumC4378z> f16019c = C4377y.f15987I;

        /* renamed from: d */
        public List<C4364l> f16020d = C4377y.f15988J;

        /* renamed from: g */
        public AbstractC4371s.b f16023g = AbstractC4371s.m16796l(AbstractC4371s.f15962a);

        public b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f16024h = proxySelector;
            if (proxySelector == null) {
                this.f16024h = new C6133a();
            }
            this.f16025i = InterfaceC4366n.f15951a;
            this.f16027k = SocketFactory.getDefault();
            this.f16030n = C0115d.f357a;
            this.f16031o = C4358g.f15785c;
            InterfaceC4350c interfaceC4350c = InterfaceC4350c.f15725a;
            this.f16032p = interfaceC4350c;
            this.f16033q = interfaceC4350c;
            this.f16034r = new C4363k();
            this.f16035s = InterfaceC4369q.f15960a;
            this.f16036t = true;
            this.f16037u = true;
            this.f16038v = true;
            this.f16039w = 0;
            this.f16040x = 10000;
            this.f16041y = 10000;
            this.f16042z = 10000;
            this.f16016A = 0;
        }

        /* renamed from: a */
        public C4377y m16931a() {
            return new C4377y(this);
        }

        /* renamed from: b */
        public b m16932b(long j10, TimeUnit timeUnit) {
            this.f16040x = C4596e.m18096d("timeout", j10, timeUnit);
            return this;
        }

        /* renamed from: c */
        public b m16933c(long j10, TimeUnit timeUnit) {
            this.f16041y = C4596e.m18096d("timeout", j10, timeUnit);
            return this;
        }

        /* renamed from: d */
        public b m16934d(long j10, TimeUnit timeUnit) {
            this.f16042z = C4596e.m18096d("timeout", j10, timeUnit);
            return this;
        }
    }

    static {
        AbstractC4592a.f17225a = new a();
    }

    public C4377y() {
        this(new b());
    }

    public C4377y(b bVar) {
        boolean z10;
        AbstractC0114c abstractC0114c;
        this.f15997h = bVar.f16017a;
        this.f15998i = bVar.f16018b;
        this.f15999j = bVar.f16019c;
        List<C4364l> list = bVar.f16020d;
        this.f16000k = list;
        this.f16001l = C4596e.m18111s(bVar.f16021e);
        this.f16002m = C4596e.m18111s(bVar.f16022f);
        this.f16003n = bVar.f16023g;
        this.f16004o = bVar.f16024h;
        this.f16005p = bVar.f16025i;
        this.f16006q = bVar.f16026j;
        this.f16007r = bVar.f16027k;
        Iterator<C4364l> it = list.iterator();
        loop0: while (true) {
            z10 = false;
            while (it.hasNext()) {
                z10 = (z10 || it.next().m16760d()) ? true : z10;
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f16028l;
        if (sSLSocketFactory == null && z10) {
            X509TrustManager m18083C = C4596e.m18083C();
            this.f16008s = m16895u(m18083C);
            abstractC0114c = AbstractC0114c.m495b(m18083C);
        } else {
            this.f16008s = sSLSocketFactory;
            abstractC0114c = bVar.f16029m;
        }
        this.f16009t = abstractC0114c;
        if (this.f16008s != null) {
            C5926f.m23671l().mo23661f(this.f16008s);
        }
        this.f16010u = bVar.f16030n;
        this.f16011v = bVar.f16031o.m16746f(this.f16009t);
        this.f16012w = bVar.f16032p;
        this.f16013x = bVar.f16033q;
        this.f16014y = bVar.f16034r;
        this.f16015z = bVar.f16035s;
        this.f15989A = bVar.f16036t;
        this.f15990B = bVar.f16037u;
        this.f15991C = bVar.f16038v;
        this.f15992D = bVar.f16039w;
        this.f15993E = bVar.f16040x;
        this.f15994F = bVar.f16041y;
        this.f15995G = bVar.f16042z;
        this.f15996H = bVar.f16016A;
        if (this.f16001l.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f16001l);
        }
        if (this.f16002m.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f16002m);
        }
    }

    /* renamed from: u */
    public static SSLSocketFactory m16895u(X509TrustManager x509TrustManager) {
        try {
            SSLContext mo23650m = C5926f.m23671l().mo23650m();
            mo23650m.init(null, new TrustManager[]{x509TrustManager}, null);
            return mo23650m.getSocketFactory();
        } catch (GeneralSecurityException e10) {
            throw new AssertionError("No System TLS", e10);
        }
    }

    /* renamed from: A */
    public int m16896A() {
        return this.f15994F;
    }

    /* renamed from: B */
    public boolean m16897B() {
        return this.f15991C;
    }

    /* renamed from: C */
    public SocketFactory m16898C() {
        return this.f16007r;
    }

    /* renamed from: D */
    public SSLSocketFactory m16899D() {
        return this.f16008s;
    }

    /* renamed from: F */
    public int m16900F() {
        return this.f15995G;
    }

    /* renamed from: b */
    public InterfaceC4350c m16901b() {
        return this.f16013x;
    }

    /* renamed from: c */
    public int m16902c() {
        return this.f15992D;
    }

    /* renamed from: e */
    public C4358g m16903e() {
        return this.f16011v;
    }

    /* renamed from: f */
    public int m16904f() {
        return this.f15993E;
    }

    /* renamed from: g */
    public C4363k m16905g() {
        return this.f16014y;
    }

    /* renamed from: h */
    public List<C4364l> m16906h() {
        return this.f16000k;
    }

    /* renamed from: i */
    public InterfaceC4366n m16907i() {
        return this.f16005p;
    }

    /* renamed from: k */
    public C4367o m16908k() {
        return this.f15997h;
    }

    /* renamed from: l */
    public InterfaceC4369q m16909l() {
        return this.f16015z;
    }

    /* renamed from: m */
    public AbstractC4371s.b m16910m() {
        return this.f16003n;
    }

    /* renamed from: n */
    public boolean m16911n() {
        return this.f15990B;
    }

    /* renamed from: o */
    public boolean m16912o() {
        return this.f15989A;
    }

    /* renamed from: p */
    public HostnameVerifier m16913p() {
        return this.f16010u;
    }

    /* renamed from: q */
    public List<InterfaceC4375w> m16914q() {
        return this.f16001l;
    }

    /* renamed from: r */
    public InterfaceC4770d m16915r() {
        return this.f16006q;
    }

    /* renamed from: s */
    public List<InterfaceC4375w> m16916s() {
        return this.f16002m;
    }

    /* renamed from: t */
    public InterfaceC4354e m16917t(C4349b0 c4349b0) {
        return C4347a0.m16646h(this, c4349b0, false);
    }

    /* renamed from: v */
    public int m16918v() {
        return this.f15996H;
    }

    /* renamed from: w */
    public List<EnumC4378z> m16919w() {
        return this.f15999j;
    }

    /* renamed from: x */
    public Proxy m16920x() {
        return this.f15998i;
    }

    /* renamed from: y */
    public InterfaceC4350c m16921y() {
        return this.f16012w;
    }

    /* renamed from: z */
    public ProxySelector m16922z() {
        return this.f16004o;
    }
}
