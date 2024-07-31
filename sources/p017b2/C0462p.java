package p017b2;

import cf.C1128a;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import p004a2.AbstractC0037g;

/* renamed from: b2.p */
/* loaded from: classes.dex */
public class C0462p implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a */
    public final AbstractC0037g.a f2162a;

    public C0462p(AbstractC0037g.a aVar) {
        this.f2162a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        this.f2162a.onMessage(new C0464r(invocationHandler), C0461o.m2360b((WebMessageBoundaryInterface) C1128a.m4610a(WebMessageBoundaryInterface.class, invocationHandler2)));
    }
}
