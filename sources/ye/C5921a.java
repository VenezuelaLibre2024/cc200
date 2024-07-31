package ye;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import re.EnumC4378z;

@SuppressLint({"NewApi"})
/* renamed from: ye.a */
/* loaded from: classes2.dex */
public class C5921a extends C5922b {
    public C5921a(Class<?> cls) {
        super(cls, null, null, null, null, null);
    }

    /* renamed from: w */
    public static C5926f m23641w() {
        if (!C5926f.m23672p()) {
            return null;
        }
        try {
            if (C5922b.m23646x() >= 29) {
                return new C5921a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    @Override // ye.C5922b, ye.C5926f
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    /* renamed from: g */
    public void mo23642g(SSLSocket sSLSocket, String str, List<EnumC4378z> list) {
        try {
            m23644y(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) C5926f.m23666b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Override // ye.C5922b, ye.C5926f
    @IgnoreJRERequirement
    /* renamed from: n */
    public String mo23643n(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }

    /* renamed from: y */
    public final void m23644y(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }
}
