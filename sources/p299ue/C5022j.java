package p299ue;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import re.AbstractC4371s;
import re.C4346a;
import re.C4357f0;
import re.C4374v;
import re.InterfaceC4354e;
import se.C4596e;

/* renamed from: ue.j */
/* loaded from: classes2.dex */
public final class C5022j {

    /* renamed from: a */
    public final C4346a f18801a;

    /* renamed from: b */
    public final C5020h f18802b;

    /* renamed from: c */
    public final InterfaceC4354e f18803c;

    /* renamed from: d */
    public final AbstractC4371s f18804d;

    /* renamed from: f */
    public int f18806f;

    /* renamed from: e */
    public List<Proxy> f18805e = Collections.emptyList();

    /* renamed from: g */
    public List<InetSocketAddress> f18807g = Collections.emptyList();

    /* renamed from: h */
    public final List<C4357f0> f18808h = new ArrayList();

    /* renamed from: ue.j$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final List<C4357f0> f18809a;

        /* renamed from: b */
        public int f18810b = 0;

        public a(List<C4357f0> list) {
            this.f18809a = list;
        }

        /* renamed from: a */
        public List<C4357f0> m19720a() {
            return new ArrayList(this.f18809a);
        }

        /* renamed from: b */
        public boolean m19721b() {
            return this.f18810b < this.f18809a.size();
        }

        /* renamed from: c */
        public C4357f0 m19722c() {
            if (!m19721b()) {
                throw new NoSuchElementException();
            }
            List<C4357f0> list = this.f18809a;
            int i10 = this.f18810b;
            this.f18810b = i10 + 1;
            return list.get(i10);
        }
    }

    public C5022j(C4346a c4346a, C5020h c5020h, InterfaceC4354e interfaceC4354e, AbstractC4371s abstractC4371s) {
        this.f18801a = c4346a;
        this.f18802b = c5020h;
        this.f18803c = interfaceC4354e;
        this.f18804d = abstractC4371s;
        m19719g(c4346a.m16644l(), c4346a.m16639g());
    }

    /* renamed from: a */
    public static String m19713a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* renamed from: b */
    public boolean m19714b() {
        return m19715c() || !this.f18808h.isEmpty();
    }

    /* renamed from: c */
    public final boolean m19715c() {
        return this.f18806f < this.f18805e.size();
    }

    /* renamed from: d */
    public a m19716d() {
        if (!m19714b()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m19715c()) {
            Proxy m19717e = m19717e();
            int size = this.f18807g.size();
            for (int i10 = 0; i10 < size; i10++) {
                C4357f0 c4357f0 = new C4357f0(this.f18801a, m19717e, this.f18807g.get(i10));
                if (this.f18802b.m19709c(c4357f0)) {
                    this.f18808h.add(c4357f0);
                } else {
                    arrayList.add(c4357f0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f18808h);
            this.f18808h.clear();
        }
        return new a(arrayList);
    }

    /* renamed from: e */
    public final Proxy m19717e() {
        if (m19715c()) {
            List<Proxy> list = this.f18805e;
            int i10 = this.f18806f;
            this.f18806f = i10 + 1;
            Proxy proxy = list.get(i10);
            m19718f(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f18801a.m16644l().m16861l() + "; exhausted proxy configurations: " + this.f18805e);
    }

    /* renamed from: f */
    public final void m19718f(Proxy proxy) {
        String m16861l;
        int m16866w;
        this.f18807g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            m16861l = this.f18801a.m16644l().m16861l();
            m16866w = this.f18801a.m16644l().m16866w();
        } else {
            SocketAddress address = proxy.address();
            if (!(address instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
            m16861l = m19713a(inetSocketAddress);
            m16866w = inetSocketAddress.getPort();
        }
        if (m16866w < 1 || m16866w > 65535) {
            throw new SocketException("No route to " + m16861l + ":" + m16866w + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f18807g.add(InetSocketAddress.createUnresolved(m16861l, m16866w));
            return;
        }
        this.f18804d.m16807k(this.f18803c, m16861l);
        List<InetAddress> mo16791a = this.f18801a.m16635c().mo16791a(m16861l);
        if (mo16791a.isEmpty()) {
            throw new UnknownHostException(this.f18801a.m16635c() + " returned no addresses for " + m16861l);
        }
        this.f18804d.m16806j(this.f18803c, m16861l, mo16791a);
        int size = mo16791a.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f18807g.add(new InetSocketAddress(mo16791a.get(i10), m16866w));
        }
    }

    /* renamed from: g */
    public final void m19719g(C4374v c4374v, Proxy proxy) {
        List<Proxy> m18112t;
        if (proxy != null) {
            m18112t = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = this.f18801a.m16641i().select(c4374v.m16854C());
            m18112t = (select == null || select.isEmpty()) ? C4596e.m18112t(Proxy.NO_PROXY) : C4596e.m18111s(select);
        }
        this.f18805e = m18112t;
        this.f18806f = 0;
    }
}
