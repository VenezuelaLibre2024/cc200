package re;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import re.C4374v;
import se.C4596e;

/* renamed from: re.a */
/* loaded from: classes2.dex */
public final class C4346a {

    /* renamed from: a */
    public final C4374v f15694a;

    /* renamed from: b */
    public final InterfaceC4369q f15695b;

    /* renamed from: c */
    public final SocketFactory f15696c;

    /* renamed from: d */
    public final InterfaceC4350c f15697d;

    /* renamed from: e */
    public final List<EnumC4378z> f15698e;

    /* renamed from: f */
    public final List<C4364l> f15699f;

    /* renamed from: g */
    public final ProxySelector f15700g;

    /* renamed from: h */
    public final Proxy f15701h;

    /* renamed from: i */
    public final SSLSocketFactory f15702i;

    /* renamed from: j */
    public final HostnameVerifier f15703j;

    /* renamed from: k */
    public final C4358g f15704k;

    public C4346a(String str, int i10, InterfaceC4369q interfaceC4369q, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C4358g c4358g, InterfaceC4350c interfaceC4350c, Proxy proxy, List<EnumC4378z> list, List<C4364l> list2, ProxySelector proxySelector) {
        this.f15694a = new C4374v.a().m16887q(sSLSocketFactory != null ? "https" : "http").m16877e(str).m16883l(i10).m16874a();
        Objects.requireNonNull(interfaceC4369q, "dns == null");
        this.f15695b = interfaceC4369q;
        Objects.requireNonNull(socketFactory, "socketFactory == null");
        this.f15696c = socketFactory;
        Objects.requireNonNull(interfaceC4350c, "proxyAuthenticator == null");
        this.f15697d = interfaceC4350c;
        Objects.requireNonNull(list, "protocols == null");
        this.f15698e = C4596e.m18111s(list);
        Objects.requireNonNull(list2, "connectionSpecs == null");
        this.f15699f = C4596e.m18111s(list2);
        Objects.requireNonNull(proxySelector, "proxySelector == null");
        this.f15700g = proxySelector;
        this.f15701h = proxy;
        this.f15702i = sSLSocketFactory;
        this.f15703j = hostnameVerifier;
        this.f15704k = c4358g;
    }

    /* renamed from: a */
    public C4358g m16633a() {
        return this.f15704k;
    }

    /* renamed from: b */
    public List<C4364l> m16634b() {
        return this.f15699f;
    }

    /* renamed from: c */
    public InterfaceC4369q m16635c() {
        return this.f15695b;
    }

    /* renamed from: d */
    public boolean m16636d(C4346a c4346a) {
        return this.f15695b.equals(c4346a.f15695b) && this.f15697d.equals(c4346a.f15697d) && this.f15698e.equals(c4346a.f15698e) && this.f15699f.equals(c4346a.f15699f) && this.f15700g.equals(c4346a.f15700g) && Objects.equals(this.f15701h, c4346a.f15701h) && Objects.equals(this.f15702i, c4346a.f15702i) && Objects.equals(this.f15703j, c4346a.f15703j) && Objects.equals(this.f15704k, c4346a.f15704k) && m16644l().m16866w() == c4346a.m16644l().m16866w();
    }

    /* renamed from: e */
    public HostnameVerifier m16637e() {
        return this.f15703j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4346a) {
            C4346a c4346a = (C4346a) obj;
            if (this.f15694a.equals(c4346a.f15694a) && m16636d(c4346a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public List<EnumC4378z> m16638f() {
        return this.f15698e;
    }

    /* renamed from: g */
    public Proxy m16639g() {
        return this.f15701h;
    }

    /* renamed from: h */
    public InterfaceC4350c m16640h() {
        return this.f15697d;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f15694a.hashCode()) * 31) + this.f15695b.hashCode()) * 31) + this.f15697d.hashCode()) * 31) + this.f15698e.hashCode()) * 31) + this.f15699f.hashCode()) * 31) + this.f15700g.hashCode()) * 31) + Objects.hashCode(this.f15701h)) * 31) + Objects.hashCode(this.f15702i)) * 31) + Objects.hashCode(this.f15703j)) * 31) + Objects.hashCode(this.f15704k);
    }

    /* renamed from: i */
    public ProxySelector m16641i() {
        return this.f15700g;
    }

    /* renamed from: j */
    public SocketFactory m16642j() {
        return this.f15696c;
    }

    /* renamed from: k */
    public SSLSocketFactory m16643k() {
        return this.f15702i;
    }

    /* renamed from: l */
    public C4374v m16644l() {
        return this.f15694a;
    }

    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f15694a.m16861l());
        sb2.append(":");
        sb2.append(this.f15694a.m16866w());
        if (this.f15701h != null) {
            sb2.append(", proxy=");
            obj = this.f15701h;
        } else {
            sb2.append(", proxySelector=");
            obj = this.f15700g;
        }
        sb2.append(obj);
        sb2.append("}");
        return sb2.toString();
    }
}
