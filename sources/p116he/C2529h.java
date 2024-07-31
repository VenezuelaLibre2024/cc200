package p116he;

import java.util.Collection;
import java.util.ServiceLoader;
import p038ce.InterfaceC1069l0;
import p373zd.C6129g;
import p373zd.C6131i;

/* renamed from: he.h */
/* loaded from: classes2.dex */
public final class C2529h {

    /* renamed from: a */
    public static final Collection<InterfaceC1069l0> f9968a = C6131i.m24445h(C6129g.m24440c(ServiceLoader.load(InterfaceC1069l0.class, InterfaceC1069l0.class.getClassLoader()).iterator()));

    /* renamed from: a */
    public static final Collection<InterfaceC1069l0> m10081a() {
        return f9968a;
    }

    /* renamed from: b */
    public static final void m10082b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
