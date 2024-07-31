package p017b2;

import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: b2.a0 */
/* loaded from: classes.dex */
public class C0447a0 {

    /* renamed from: a */
    public final WebkitToCompatConverterBoundaryInterface f2147a;

    public C0447a0(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f2147a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public ServiceWorkerWebSettings m2295a(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f2147a.convertServiceWorkerSettings(invocationHandler);
    }

    /* renamed from: b */
    public InvocationHandler m2296b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f2147a.convertServiceWorkerSettings(serviceWorkerWebSettings);
    }

    /* renamed from: c */
    public WebMessagePort m2297c(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f2147a.convertWebMessagePort(invocationHandler);
    }

    /* renamed from: d */
    public InvocationHandler m2298d(WebMessagePort webMessagePort) {
        return this.f2147a.convertWebMessagePort(webMessagePort);
    }
}
