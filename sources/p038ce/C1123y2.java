package p038ce;

import p116he.C2538l0;
import p116he.C2548q0;

/* renamed from: ce.y2 */
/* loaded from: classes2.dex */
public final class C1123y2 {

    /* renamed from: a */
    public static final C1123y2 f4101a = new C1123y2();

    /* renamed from: b */
    public static final ThreadLocal<AbstractC1074m1> f4102b = C2548q0.m10154a(new C2538l0("ThreadLocalEventLoop"));

    /* renamed from: a */
    public final AbstractC1074m1 m4600a() {
        return f4102b.get();
    }

    /* renamed from: b */
    public final AbstractC1074m1 m4601b() {
        ThreadLocal<AbstractC1074m1> threadLocal = f4102b;
        AbstractC1074m1 abstractC1074m1 = threadLocal.get();
        if (abstractC1074m1 != null) {
            return abstractC1074m1;
        }
        AbstractC1074m1 m4555a = C1086p1.m4555a();
        threadLocal.set(m4555a);
        return m4555a;
    }

    /* renamed from: c */
    public final void m4602c() {
        f4102b.set(null);
    }

    /* renamed from: d */
    public final void m4603d(AbstractC1074m1 abstractC1074m1) {
        f4102b.set(abstractC1074m1);
    }
}
