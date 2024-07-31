package p017b2;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.io.File;
import p004a2.AbstractC0032b;

/* renamed from: b2.c */
/* loaded from: classes.dex */
public class C0449c {
    /* renamed from: a */
    public static boolean m2312a(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    /* renamed from: b */
    public static boolean m2313b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    /* renamed from: c */
    public static boolean m2314c(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    /* renamed from: d */
    public static int m2315d(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    /* renamed from: e */
    public static File m2316e(Context context) {
        return context.getDataDir();
    }

    /* renamed from: f */
    public static int m2317f(WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    /* renamed from: g */
    public static ServiceWorkerController m2318g() {
        return ServiceWorkerController.getInstance();
    }

    /* renamed from: h */
    public static ServiceWorkerWebSettings m2319h(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    /* renamed from: i */
    public static C0460n m2320i(ServiceWorkerController serviceWorkerController) {
        return new C0460n(m2319h(serviceWorkerController));
    }

    /* renamed from: j */
    public static boolean m2321j(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    /* renamed from: k */
    public static void m2322k(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setAllowContentAccess(z10);
    }

    /* renamed from: l */
    public static void m2323l(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setAllowFileAccess(z10);
    }

    /* renamed from: m */
    public static void m2324m(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z10);
    }

    /* renamed from: n */
    public static void m2325n(ServiceWorkerWebSettings serviceWorkerWebSettings, int i10) {
        serviceWorkerWebSettings.setCacheMode(i10);
    }

    /* renamed from: o */
    public static void m2326o(WebSettings webSettings, int i10) {
        webSettings.setDisabledActionModeMenuItems(i10);
    }

    /* renamed from: p */
    public static void m2327p(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    /* renamed from: q */
    public static void m2328q(ServiceWorkerController serviceWorkerController, AbstractC0032b abstractC0032b) {
        serviceWorkerController.setServiceWorkerClient(new C0455i(abstractC0032b));
    }
}
