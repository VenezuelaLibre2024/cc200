package p017b2;

import android.webkit.WebView;
import cf.C1128a;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: b2.w */
/* loaded from: classes.dex */
public class C0469w implements InterfaceC0468v {

    /* renamed from: a */
    public final WebViewProviderFactoryBoundaryInterface f2219a;

    public C0469w(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f2219a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // p017b2.InterfaceC0468v
    /* renamed from: a */
    public String[] mo2353a() {
        return this.f2219a.getSupportedFeatures();
    }

    @Override // p017b2.InterfaceC0468v
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C1128a.m4610a(WebViewProviderBoundaryInterface.class, this.f2219a.createWebView(webView));
    }

    @Override // p017b2.InterfaceC0468v
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) C1128a.m4610a(ServiceWorkerControllerBoundaryInterface.class, this.f2219a.getServiceWorkerController());
    }

    @Override // p017b2.InterfaceC0468v
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C1128a.m4610a(StaticsBoundaryInterface.class, this.f2219a.getStatics());
    }

    @Override // p017b2.InterfaceC0468v
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C1128a.m4610a(WebkitToCompatConverterBoundaryInterface.class, this.f2219a.getWebkitToCompatConverter());
    }
}
