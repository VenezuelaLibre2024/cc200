package p017b2;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import p004a2.AbstractC0037g;
import p004a2.C0036f;

/* renamed from: b2.o */
/* loaded from: classes.dex */
public class C0461o implements WebMessageBoundaryInterface {

    /* renamed from: a */
    public C0036f f2161a;

    public C0461o(C0036f c0036f) {
        this.f2161a = c0036f;
    }

    /* renamed from: a */
    public static AbstractC0037g[] m2359a(InvocationHandler[] invocationHandlerArr) {
        AbstractC0037g[] abstractC0037gArr = new AbstractC0037g[invocationHandlerArr.length];
        for (int i10 = 0; i10 < invocationHandlerArr.length; i10++) {
            abstractC0037gArr[i10] = new C0464r(invocationHandlerArr[i10]);
        }
        return abstractC0037gArr;
    }

    /* renamed from: b */
    public static C0036f m2360b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        return new C0036f(webMessageBoundaryInterface.getData(), m2359a(webMessageBoundaryInterface.getPorts()));
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public String getData() {
        return this.f2161a.m133a();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        throw new UnsupportedOperationException("This method is not yet supported");
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        AbstractC0037g[] m134b = this.f2161a.m134b();
        if (m134b == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[m134b.length];
        for (int i10 = 0; i10 < m134b.length; i10++) {
            invocationHandlerArr[i10] = m134b[i10].mo137c();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[0];
    }
}
