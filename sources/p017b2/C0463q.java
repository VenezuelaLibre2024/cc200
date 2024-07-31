package p017b2;

import android.net.Uri;
import android.webkit.WebView;
import cf.C1128a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import p004a2.C0038h;

/* renamed from: b2.q */
/* loaded from: classes.dex */
public class C0463q implements WebMessageListenerBoundaryInterface {

    /* renamed from: a */
    public C0038h.b f2163a;

    public C0463q(C0038h.b bVar) {
        this.f2163a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        this.f2163a.onPostMessage(webView, C0461o.m2360b((WebMessageBoundaryInterface) C1128a.m4610a(WebMessageBoundaryInterface.class, invocationHandler)), uri, z10, C0457k.m2354b(invocationHandler2));
    }
}
