package ye;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import re.EnumC4378z;

/* renamed from: ye.e */
/* loaded from: classes2.dex */
public final class C5925e extends C5926f {

    /* renamed from: c */
    public final Method f22020c;

    /* renamed from: d */
    public final Method f22021d;

    public C5925e(Method method, Method method2) {
        this.f22020c = method;
        this.f22021d = method2;
    }

    /* renamed from: u */
    public static C5925e m23665u() {
        try {
            return new C5925e(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // ye.C5926f
    /* renamed from: g */
    public void mo23642g(SSLSocket sSLSocket, String str, List<EnumC4378z> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> m23666b = C5926f.m23666b(list);
            this.f22020c.invoke(sSLParameters, m23666b.toArray(new String[m23666b.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set SSL parameters", e10);
        }
    }

    @Override // ye.C5926f
    /* renamed from: n */
    public String mo23643n(SSLSocket sSLSocket) {
        try {
            String str = (String) this.f22021d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (!str.equals("")) {
                    return str;
                }
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
