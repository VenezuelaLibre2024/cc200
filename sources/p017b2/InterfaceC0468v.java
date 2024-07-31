package p017b2;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: b2.v */
/* loaded from: classes.dex */
public interface InterfaceC0468v {
    /* renamed from: a */
    String[] mo2353a();

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    StaticsBoundaryInterface getStatics();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
