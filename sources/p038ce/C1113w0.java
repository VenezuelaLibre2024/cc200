package p038ce;

import p116he.C2518b0;
import p116he.C2540m0;

/* renamed from: ce.w0 */
/* loaded from: classes2.dex */
public final class C1113w0 {

    /* renamed from: a */
    public static final boolean f4097a = C2540m0.m10117f("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    public static final InterfaceC1125z0 f4098b = m4592b();

    /* renamed from: a */
    public static final InterfaceC1125z0 m4591a() {
        return f4098b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final InterfaceC1125z0 m4592b() {
        if (!f4097a) {
            return RunnableC1109v0.f4094p;
        }
        AbstractC1079n2 m4328c = C1045g1.m4328c();
        return (C2518b0.m10050c(m4328c) || !(m4328c instanceof InterfaceC1125z0)) ? RunnableC1109v0.f4094p : (InterfaceC1125z0) m4328c;
    }
}
