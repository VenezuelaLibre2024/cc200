package ye;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import re.EnumC4378z;
import se.C4596e;

/* renamed from: ye.d */
/* loaded from: classes2.dex */
public class C5924d extends C5926f {

    /* renamed from: c */
    public final Method f22012c;

    /* renamed from: d */
    public final Method f22013d;

    /* renamed from: e */
    public final Method f22014e;

    /* renamed from: f */
    public final Class<?> f22015f;

    /* renamed from: g */
    public final Class<?> f22016g;

    /* renamed from: ye.d$a */
    /* loaded from: classes2.dex */
    public static class a implements InvocationHandler {

        /* renamed from: a */
        public final List<String> f22017a;

        /* renamed from: b */
        public boolean f22018b;

        /* renamed from: c */
        public String f22019c;

        public a(List<String> list) {
            this.f22017a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = C4596e.f17231b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f22018b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f22017a;
            }
            if ((!name.equals("selectProtocol") && !name.equals("select")) || String.class != returnType || objArr.length != 1 || !(objArr[0] instanceof List)) {
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f22019c = (String) objArr[0];
                return null;
            }
            List list = (List) objArr[0];
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = (String) list.get(i10);
                if (this.f22017a.contains(str)) {
                    this.f22019c = str;
                    return str;
                }
            }
            String str2 = this.f22017a.get(0);
            this.f22019c = str2;
            return str2;
        }
    }

    public C5924d(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f22012c = method;
        this.f22013d = method2;
        this.f22014e = method3;
        this.f22015f = cls;
        this.f22016g = cls2;
    }

    /* renamed from: u */
    public static C5926f m23663u() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
            return new C5924d(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // ye.C5926f
    /* renamed from: a */
    public void mo23664a(SSLSocket sSLSocket) {
        try {
            this.f22014e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    @Override // ye.C5926f
    /* renamed from: g */
    public void mo23642g(SSLSocket sSLSocket, String str, List<EnumC4378z> list) {
        try {
            this.f22012c.invoke(null, sSLSocket, Proxy.newProxyInstance(C5926f.class.getClassLoader(), new Class[]{this.f22015f, this.f22016g}, new a(C5926f.m23666b(list))));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Override // ye.C5926f
    /* renamed from: n */
    public String mo23643n(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f22013d.invoke(null, sSLSocket));
            boolean z10 = aVar.f22018b;
            if (!z10 && aVar.f22019c == null) {
                C5926f.m23671l().mo23653s(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z10) {
                return null;
            }
            return aVar.f22019c;
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
