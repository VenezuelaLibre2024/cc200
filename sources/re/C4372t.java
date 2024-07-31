package re;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import se.C4596e;

/* renamed from: re.t */
/* loaded from: classes2.dex */
public final class C4372t {

    /* renamed from: a */
    public final EnumC4359g0 f15963a;

    /* renamed from: b */
    public final C4361i f15964b;

    /* renamed from: c */
    public final List<Certificate> f15965c;

    /* renamed from: d */
    public final List<Certificate> f15966d;

    public C4372t(EnumC4359g0 enumC4359g0, C4361i c4361i, List<Certificate> list, List<Certificate> list2) {
        this.f15963a = enumC4359g0;
        this.f15964b = c4361i;
        this.f15965c = list;
        this.f15966d = list2;
    }

    /* renamed from: b */
    public static C4372t m16820b(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C4361i m16752b = C4361i.m16752b(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC4359g0 m16749b = EnumC4359g0.m16749b(protocol);
        try {
            certificateArr = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            certificateArr = null;
        }
        List m18112t = certificateArr != null ? C4596e.m18112t(certificateArr) : Collections.emptyList();
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C4372t(m16749b, m16752b, m18112t, localCertificates != null ? C4596e.m18112t(localCertificates) : Collections.emptyList());
    }

    /* renamed from: a */
    public C4361i m16821a() {
        return this.f15964b;
    }

    /* renamed from: c */
    public final List<String> m16822c(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<Certificate> m16823d() {
        return this.f15965c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4372t)) {
            return false;
        }
        C4372t c4372t = (C4372t) obj;
        return this.f15963a.equals(c4372t.f15963a) && this.f15964b.equals(c4372t.f15964b) && this.f15965c.equals(c4372t.f15965c) && this.f15966d.equals(c4372t.f15966d);
    }

    public int hashCode() {
        return ((((((527 + this.f15963a.hashCode()) * 31) + this.f15964b.hashCode()) * 31) + this.f15965c.hashCode()) * 31) + this.f15966d.hashCode();
    }

    public String toString() {
        return "Handshake{tlsVersion=" + this.f15963a + " cipherSuite=" + this.f15964b + " peerCertificates=" + m16822c(this.f15965c) + " localCertificates=" + m16822c(this.f15966d) + '}';
    }
}
