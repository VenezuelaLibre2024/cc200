package p038ce;

import gd.C2245s;
import p146jd.InterfaceC3281d;
import sd.InterfaceC4580l;

/* renamed from: ce.n */
/* loaded from: classes2.dex */
public interface InterfaceC1076n<T> extends InterfaceC3281d<T> {

    /* renamed from: ce.n$a */
    /* loaded from: classes2.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ boolean m4493a(InterfaceC1076n interfaceC1076n, Throwable th, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i10 & 1) != 0) {
                th = null;
            }
            return interfaceC1076n.mo4490h(th);
        }
    }

    /* renamed from: c */
    void mo4486c(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l);

    /* renamed from: e */
    Object mo4487e(T t10, Object obj, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l);

    /* renamed from: f */
    Object mo4488f(Throwable th);

    /* renamed from: g */
    void mo4489g(T t10, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l);

    /* renamed from: h */
    boolean mo4490h(Throwable th);

    /* renamed from: k */
    boolean mo4491k();

    /* renamed from: m */
    void mo4492m(Object obj);
}
