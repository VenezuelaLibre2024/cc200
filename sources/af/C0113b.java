package af;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: af.b */
/* loaded from: classes2.dex */
public final class C0113b implements InterfaceC0116e {

    /* renamed from: a */
    public final Map<X500Principal, Set<X509Certificate>> f356a = new LinkedHashMap();

    public C0113b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> set = this.f356a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.f356a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // af.InterfaceC0116e
    /* renamed from: a */
    public X509Certificate mo494a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f356a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0113b) && ((C0113b) obj).f356a.equals(this.f356a);
    }

    public int hashCode() {
        return this.f356a.hashCode();
    }
}
