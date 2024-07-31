package p017b2;

import android.os.Build;
import android.webkit.WebView;
import cf.C1128a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: b2.t */
/* loaded from: classes.dex */
public class C0466t {

    /* renamed from: b2.t$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static final C0447a0 f2216a = new C0447a0(C0466t.m2373d().getWebkitToCompatConverter());
    }

    /* renamed from: b2.t$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public static final InterfaceC0468v f2217a = C0466t.m2370a();
    }

    /* renamed from: a */
    public static InterfaceC0468v m2370a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new C0456j();
        }
        try {
            return new C0469w((WebViewProviderFactoryBoundaryInterface) C1128a.m4610a(WebViewProviderFactoryBoundaryInterface.class, m2371b()));
        } catch (ClassNotFoundException unused) {
            return new C0456j();
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    /* renamed from: b */
    public static InvocationHandler m2371b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m2374e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    public static C0447a0 m2372c() {
        return a.f2216a;
    }

    /* renamed from: d */
    public static InterfaceC0468v m2373d() {
        return b.f2217a;
    }

    /* renamed from: e */
    public static ClassLoader m2374e() {
        return Build.VERSION.SDK_INT >= 28 ? C0452f.m2341b() : m2375f().getClass().getClassLoader();
    }

    /* renamed from: f */
    public static Object m2375f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }
}
