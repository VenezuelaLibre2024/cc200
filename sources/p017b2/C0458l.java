package p017b2;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;
import p004a2.AbstractC0032b;

/* renamed from: b2.l */
/* loaded from: classes.dex */
public class C0458l implements ServiceWorkerClientBoundaryInterface {

    /* renamed from: a */
    public final AbstractC0032b f2155a;

    public C0458l(AbstractC0032b abstractC0032b) {
        this.f2155a = abstractC0032b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    @Override // org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f2155a.shouldInterceptRequest(webResourceRequest);
    }
}
