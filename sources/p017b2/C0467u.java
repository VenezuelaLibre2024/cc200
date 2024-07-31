package p017b2;

import android.annotation.SuppressLint;
import android.net.Uri;
import cf.C1128a;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import p004a2.AbstractC0037g;
import p004a2.AbstractC0041k;
import p004a2.C0036f;
import p004a2.C0038h;

/* renamed from: b2.u */
/* loaded from: classes.dex */
public class C0467u {

    /* renamed from: a */
    public WebViewProviderBoundaryInterface f2218a;

    public C0467u(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.f2218a = webViewProviderBoundaryInterface;
    }

    /* renamed from: a */
    public void m2376a(String str, String[] strArr, C0038h.b bVar) {
        this.f2218a.addWebMessageListener(str, strArr, C1128a.m4612c(new C0463q(bVar)));
    }

    /* renamed from: b */
    public AbstractC0037g[] m2377b() {
        InvocationHandler[] createWebMessageChannel = this.f2218a.createWebMessageChannel();
        AbstractC0037g[] abstractC0037gArr = new AbstractC0037g[createWebMessageChannel.length];
        for (int i10 = 0; i10 < createWebMessageChannel.length; i10++) {
            abstractC0037gArr[i10] = new C0464r(createWebMessageChannel[i10]);
        }
        return abstractC0037gArr;
    }

    /* renamed from: c */
    public void m2378c(C0036f c0036f, Uri uri) {
        this.f2218a.postMessageToMainFrame(C1128a.m4612c(new C0461o(c0036f)), uri);
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: d */
    public void m2379d(Executor executor, AbstractC0041k abstractC0041k) {
        this.f2218a.setWebViewRendererClient(abstractC0041k != null ? C1128a.m4612c(new C0470x(executor, abstractC0041k)) : null);
    }
}
