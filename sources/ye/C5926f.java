package ye;

import af.AbstractC0114c;
import af.C0112a;
import af.C0113b;
import af.InterfaceC0116e;
import bf.C0557c;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import re.C4377y;
import re.EnumC4378z;
import se.C4596e;

/* renamed from: ye.f */
/* loaded from: classes2.dex */
public class C5926f {

    /* renamed from: a */
    public static final C5926f f22022a = m23670k();

    /* renamed from: b */
    public static final Logger f22023b = Logger.getLogger(C4377y.class.getName());

    /* renamed from: b */
    public static List<String> m23666b(List<EnumC4378z> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EnumC4378z enumC4378z = list.get(i10);
            if (enumC4378z != EnumC4378z.HTTP_1_0) {
                arrayList.add(enumC4378z.toString());
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static byte[] m23667e(List<EnumC4378z> list) {
        C0557c c0557c = new C0557c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            EnumC4378z enumC4378z = list.get(i10);
            if (enumC4378z != EnumC4378z.HTTP_1_0) {
                c0557c.mo2807C(enumC4378z.toString().length());
                c0557c.mo2820S(enumC4378z.toString());
            }
        }
        return c0557c.mo2854z();
    }

    /* renamed from: i */
    public static C5926f m23668i() {
        C5926f m23641w = C5921a.m23641w();
        if (m23641w != null) {
            return m23641w;
        }
        C5926f m23645w = C5922b.m23645w();
        Objects.requireNonNull(m23645w, "No platform found on Android");
        return m23645w;
    }

    /* renamed from: j */
    public static C5926f m23669j() {
        C5923c m23660u;
        if (m23673r() && (m23660u = C5923c.m23660u()) != null) {
            return m23660u;
        }
        C5925e m23665u = C5925e.m23665u();
        if (m23665u != null) {
            return m23665u;
        }
        C5926f m23663u = C5924d.m23663u();
        return m23663u != null ? m23663u : new C5926f();
    }

    /* renamed from: k */
    public static C5926f m23670k() {
        return m23672p() ? m23668i() : m23669j();
    }

    /* renamed from: l */
    public static C5926f m23671l() {
        return f22022a;
    }

    /* renamed from: p */
    public static boolean m23672p() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    /* renamed from: r */
    public static boolean m23673r() {
        if ("conscrypt".equals(C4596e.m18109q("okhttp.platform", null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    /* renamed from: a */
    public void mo23664a(SSLSocket sSLSocket) {
    }

    /* renamed from: c */
    public AbstractC0114c mo23647c(X509TrustManager x509TrustManager) {
        return new C0112a(mo23648d(x509TrustManager));
    }

    /* renamed from: d */
    public InterfaceC0116e mo23648d(X509TrustManager x509TrustManager) {
        return new C0113b(x509TrustManager.getAcceptedIssuers());
    }

    /* renamed from: f */
    public void mo23661f(SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: g */
    public void mo23642g(SSLSocket sSLSocket, String str, List<EnumC4378z> list) {
    }

    /* renamed from: h */
    public void mo23649h(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        socket.connect(inetSocketAddress, i10);
    }

    /* renamed from: m */
    public SSLContext mo23650m() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    /* renamed from: n */
    public String mo23643n(SSLSocket sSLSocket) {
        return null;
    }

    /* renamed from: o */
    public Object mo23651o(String str) {
        if (f22023b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    /* renamed from: q */
    public boolean mo23652q(String str) {
        return true;
    }

    /* renamed from: s */
    public void mo23653s(int i10, String str, Throwable th) {
        f22023b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    /* renamed from: t */
    public void mo23654t(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        mo23653s(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
