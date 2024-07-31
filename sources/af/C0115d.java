package af;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import se.C4596e;

/* renamed from: af.d */
/* loaded from: classes2.dex */
public final class C0115d implements HostnameVerifier {

    /* renamed from: a */
    public static final C0115d f357a = new C0115d();

    /* renamed from: a */
    public static List<String> m496a(X509Certificate x509Certificate) {
        List<String> m497b = m497b(x509Certificate, 7);
        List<String> m497b2 = m497b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(m497b.size() + m497b2.size());
        arrayList.addAll(m497b);
        arrayList.addAll(m497b2);
        return arrayList;
    }

    /* renamed from: b */
    public static List<String> m497b(X509Certificate x509Certificate, int i10) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i10 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: c */
    public boolean m498c(String str, X509Certificate x509Certificate) {
        return C4596e.m18092L(str) ? m501f(str, x509Certificate) : m500e(str, x509Certificate);
    }

    /* renamed from: d */
    public boolean m499d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m500e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = m497b(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (m499d(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m501f(String str, X509Certificate x509Certificate) {
        List<String> m497b = m497b(x509Certificate, 7);
        int size = m497b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(m497b.get(i10))) {
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return m498c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
