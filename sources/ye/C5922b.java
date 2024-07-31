package ye;

import af.AbstractC0114c;
import af.InterfaceC0116e;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import re.EnumC4378z;
import se.C4596e;

/* renamed from: ye.b */
/* loaded from: classes2.dex */
public class C5922b extends C5926f {

    /* renamed from: c */
    public final Class<?> f21998c;

    /* renamed from: d */
    public final Class<?> f21999d;

    /* renamed from: e */
    public final Method f22000e;

    /* renamed from: f */
    public final Method f22001f;

    /* renamed from: g */
    public final Method f22002g;

    /* renamed from: h */
    public final Method f22003h;

    /* renamed from: i */
    public final b f22004i = b.m23657b();

    /* renamed from: ye.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC0114c {

        /* renamed from: a */
        public final Object f22005a;

        /* renamed from: b */
        public final Method f22006b;

        public a(Object obj, Method method) {
            this.f22005a = obj;
            this.f22006b = method;
        }

        @Override // af.AbstractC0114c
        /* renamed from: a */
        public List<Certificate> mo492a(List<Certificate> list, String str) {
            try {
                return (List) this.f22006b.invoke(this.f22005a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
                sSLPeerUnverifiedException.initCause(e11);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* renamed from: ye.b$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        public final Method f22007a;

        /* renamed from: b */
        public final Method f22008b;

        /* renamed from: c */
        public final Method f22009c;

        public b(Method method, Method method2, Method method3) {
            this.f22007a = method;
            this.f22008b = method2;
            this.f22009c = method3;
        }

        /* renamed from: b */
        public static b m23657b() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", new Class[0]);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new b(method3, method2, method);
        }

        /* renamed from: a */
        public Object m23658a(String str) {
            Method method = this.f22007a;
            if (method != null) {
                try {
                    Object invoke = method.invoke(null, new Object[0]);
                    this.f22008b.invoke(invoke, str);
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* renamed from: c */
        public boolean m23659c(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f22009c.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: ye.b$c */
    /* loaded from: classes2.dex */
    public static final class c implements InterfaceC0116e {

        /* renamed from: a */
        public final X509TrustManager f22010a;

        /* renamed from: b */
        public final Method f22011b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.f22011b = method;
            this.f22010a = x509TrustManager;
        }

        @Override // af.InterfaceC0116e
        /* renamed from: a */
        public X509Certificate mo494a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f22011b.invoke(this.f22010a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22010a.equals(cVar.f22010a) && this.f22011b.equals(cVar.f22011b);
        }

        public int hashCode() {
            return this.f22010a.hashCode() + (this.f22011b.hashCode() * 31);
        }
    }

    public C5922b(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.f21998c = cls;
        this.f21999d = cls2;
        this.f22000e = method;
        this.f22001f = method2;
        this.f22002g = method3;
        this.f22003h = method4;
    }

    /* renamed from: w */
    public static C5926f m23645w() {
        if (!C5926f.m23672p()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return new C5922b(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
                } catch (NoSuchMethodException unused) {
                }
            }
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    /* renamed from: x */
    public static int m23646x() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // ye.C5926f
    /* renamed from: c */
    public AbstractC0114c mo23647c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.mo23647c(x509TrustManager);
        }
    }

    @Override // ye.C5926f
    /* renamed from: d */
    public InterfaceC0116e mo23648d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.mo23648d(x509TrustManager);
        }
    }

    @Override // ye.C5926f
    /* renamed from: g */
    public void mo23642g(SSLSocket sSLSocket, String str, List<EnumC4378z> list) {
        if (this.f21999d.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.f22000e.invoke(sSLSocket, Boolean.TRUE);
                    this.f22001f.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e10) {
                    throw new AssertionError(e10);
                }
            }
            this.f22003h.invoke(sSLSocket, C5926f.m23667e(list));
        }
    }

    @Override // ye.C5926f
    /* renamed from: h */
    public void mo23649h(Socket socket, InetSocketAddress inetSocketAddress, int i10) {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (!C4596e.m18118z(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (ClassCastException e11) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e11;
            }
            throw new IOException("Exception in connect", e11);
        }
    }

    @Override // ye.C5926f
    /* renamed from: m */
    public SSLContext mo23650m() {
        boolean z10 = true;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 16 || i10 >= 22) {
                z10 = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z10) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    @Override // ye.C5926f
    /* renamed from: n */
    public String mo23643n(SSLSocket sSLSocket) {
        if (!this.f21999d.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f22002g.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // ye.C5926f
    /* renamed from: o */
    public Object mo23651o(String str) {
        return this.f22004i.m23658a(str);
    }

    @Override // ye.C5926f
    /* renamed from: q */
    public boolean mo23652q(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return m23656v(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.mo23652q(str);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // ye.C5926f
    /* renamed from: s */
    public void mo23653s(int i10, String str, Throwable th) {
        int min;
        int i11 = i10 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i12 = 0;
        int length = str.length();
        while (i12 < length) {
            int indexOf = str.indexOf(10, i12);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, min));
                if (min >= indexOf) {
                    break;
                } else {
                    i12 = min;
                }
            }
            i12 = min + 1;
        }
    }

    @Override // ye.C5926f
    /* renamed from: t */
    public void mo23654t(String str, Object obj) {
        if (this.f22004i.m23659c(obj)) {
            return;
        }
        mo23653s(5, str, null);
    }

    /* renamed from: u */
    public final boolean m23655u(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.mo23652q(str);
        }
    }

    /* renamed from: v */
    public final boolean m23656v(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m23655u(str, cls, obj);
        }
    }
}
