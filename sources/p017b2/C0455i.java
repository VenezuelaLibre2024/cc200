package p017b2;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import p004a2.AbstractC0032b;

/* renamed from: b2.i */
/* loaded from: classes.dex */
public class C0455i extends ServiceWorkerClient {

    /* renamed from: a */
    public final AbstractC0032b f2151a;

    public C0455i(AbstractC0032b abstractC0032b) {
        this.f2151a = abstractC0032b;
    }

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f2151a.shouldInterceptRequest(webResourceRequest);
    }
}
