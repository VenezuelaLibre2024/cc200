package ye;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;
import re.EnumC4378z;

/* renamed from: ye.c */
/* loaded from: classes2.dex */
public class C5923c extends C5926f {
    /* renamed from: u */
    public static C5923c m23660u() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C5923c();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    @Override // ye.C5926f
    /* renamed from: f */
    public void mo23661f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // ye.C5926f
    /* renamed from: g */
    public void mo23642g(SSLSocket sSLSocket, String str, List<EnumC4378z> list) {
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.mo23642g(sSLSocket, str, list);
            return;
        }
        if (str != null) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setHostname(sSLSocket, str);
        }
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C5926f.m23666b(list).toArray(new String[0]));
    }

    @Override // ye.C5926f
    /* renamed from: m */
    public SSLContext mo23650m() {
        try {
            return SSLContext.getInstance("TLSv1.3", m23662v());
        } catch (NoSuchAlgorithmException e10) {
            try {
                return SSLContext.getInstance("TLS", m23662v());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e10);
            }
        }
    }

    @Override // ye.C5926f
    /* renamed from: n */
    public String mo23643n(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket) ? Conscrypt.getApplicationProtocol(sSLSocket) : super.mo23643n(sSLSocket);
    }

    /* renamed from: v */
    public final Provider m23662v() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }
}
