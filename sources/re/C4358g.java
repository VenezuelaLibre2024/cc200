package re;

import af.AbstractC0114c;
import bf.C0560f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: re.g */
/* loaded from: classes2.dex */
public final class C4358g {

    /* renamed from: c */
    public static final C4358g f15785c = new a().m16747a();

    /* renamed from: a */
    public final Set<b> f15786a;

    /* renamed from: b */
    public final AbstractC0114c f15787b;

    /* renamed from: re.g$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        public final List<b> f15788a = new ArrayList();

        /* renamed from: a */
        public C4358g m16747a() {
            return new C4358g(new LinkedHashSet(this.f15788a), null);
        }
    }

    /* renamed from: re.g$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final String f15789a;

        /* renamed from: b */
        public final String f15790b;

        /* renamed from: c */
        public final String f15791c;

        /* renamed from: d */
        public final C0560f f15792d;

        /* renamed from: a */
        public boolean m16748a(String str) {
            if (!this.f15789a.startsWith("*.")) {
                return str.equals(this.f15790b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f15790b.length()) {
                String str2 = this.f15790b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f15789a.equals(bVar.f15789a) && this.f15791c.equals(bVar.f15791c) && this.f15792d.equals(bVar.f15792d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.f15789a.hashCode()) * 31) + this.f15791c.hashCode()) * 31) + this.f15792d.hashCode();
        }

        public String toString() {
            return this.f15791c + this.f15792d.mo2862b();
        }
    }

    public C4358g(Set<b> set, AbstractC0114c abstractC0114c) {
        this.f15786a = set;
        this.f15787b = abstractC0114c;
    }

    /* renamed from: c */
    public static String m16741c(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + m16743e((X509Certificate) certificate).mo2862b();
    }

    /* renamed from: d */
    public static C0560f m16742d(X509Certificate x509Certificate) {
        return C0560f.m2860p(x509Certificate.getPublicKey().getEncoded()).mo2869s();
    }

    /* renamed from: e */
    public static C0560f m16743e(X509Certificate x509Certificate) {
        return C0560f.m2860p(x509Certificate.getPublicKey().getEncoded()).mo2870t();
    }

    /* renamed from: a */
    public void m16744a(String str, List<Certificate> list) {
        List<b> m16745b = m16745b(str);
        if (m16745b.isEmpty()) {
            return;
        }
        AbstractC0114c abstractC0114c = this.f15787b;
        if (abstractC0114c != null) {
            list = abstractC0114c.mo492a(list, str);
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i10);
            int size2 = m16745b.size();
            C0560f c0560f = null;
            C0560f c0560f2 = null;
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = m16745b.get(i11);
                if (bVar.f15791c.equals("sha256/")) {
                    if (c0560f == null) {
                        c0560f = m16743e(x509Certificate);
                    }
                    if (bVar.f15792d.equals(c0560f)) {
                        return;
                    }
                } else {
                    if (!bVar.f15791c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f15791c);
                    }
                    if (c0560f2 == null) {
                        c0560f2 = m16742d(x509Certificate);
                    }
                    if (bVar.f15792d.equals(c0560f2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
            sb2.append("\n    ");
            sb2.append(m16741c(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(str);
        sb2.append(":");
        int size4 = m16745b.size();
        for (int i13 = 0; i13 < size4; i13++) {
            b bVar2 = m16745b.get(i13);
            sb2.append("\n    ");
            sb2.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb2.toString());
    }

    /* renamed from: b */
    public List<b> m16745b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.f15786a) {
            if (bVar.m16748a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4358g) {
            C4358g c4358g = (C4358g) obj;
            if (Objects.equals(this.f15787b, c4358g.f15787b) && this.f15786a.equals(c4358g.f15786a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public C4358g m16746f(AbstractC0114c abstractC0114c) {
        return Objects.equals(this.f15787b, abstractC0114c) ? this : new C4358g(this.f15786a, abstractC0114c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f15787b) * 31) + this.f15786a.hashCode();
    }
}
