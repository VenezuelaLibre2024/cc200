package p038ce;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import p146jd.InterfaceC3284g;
import p373zd.InterfaceC6124b;

/* renamed from: ce.h2 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1051h2 {
    /* renamed from: a */
    public static final InterfaceC1014a0 m4344a(InterfaceC1026c2 interfaceC1026c2) {
        return new C1041f2(interfaceC1026c2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC1014a0 m4345b(InterfaceC1026c2 interfaceC1026c2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC1026c2 = null;
        }
        return C1046g2.m4329a(interfaceC1026c2);
    }

    /* renamed from: c */
    public static final void m4346c(InterfaceC3284g interfaceC3284g, CancellationException cancellationException) {
        InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) interfaceC3284g.mo4368d(InterfaceC1026c2.f3979c);
        if (interfaceC1026c2 != null) {
            interfaceC1026c2.mo4279y0(cancellationException);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m4347d(InterfaceC3284g interfaceC3284g, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C1046g2.m4331c(interfaceC3284g, cancellationException);
    }

    /* renamed from: e */
    public static final void m4348e(InterfaceC3284g interfaceC3284g, CancellationException cancellationException) {
        InterfaceC6124b<InterfaceC1026c2> mo4277w;
        InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) interfaceC3284g.mo4368d(InterfaceC1026c2.f3979c);
        if (interfaceC1026c2 == null || (mo4277w = interfaceC1026c2.mo4277w()) == null) {
            return;
        }
        Iterator<InterfaceC1026c2> it = mo4277w.iterator();
        while (it.hasNext()) {
            it.next().mo4279y0(cancellationException);
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m4349f(InterfaceC3284g interfaceC3284g, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = null;
        }
        C1046g2.m4333e(interfaceC3284g, cancellationException);
    }

    /* renamed from: g */
    public static final InterfaceC1055i1 m4350g(InterfaceC1026c2 interfaceC1026c2, InterfaceC1055i1 interfaceC1055i1) {
        return interfaceC1026c2.mo4278x0(new C1065k1(interfaceC1055i1));
    }

    /* renamed from: h */
    public static final void m4351h(InterfaceC1026c2 interfaceC1026c2) {
        if (!interfaceC1026c2.mo4255a()) {
            throw interfaceC1026c2.mo4273K();
        }
    }

    /* renamed from: i */
    public static final void m4352i(InterfaceC3284g interfaceC3284g) {
        InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) interfaceC3284g.mo4368d(InterfaceC1026c2.f3979c);
        if (interfaceC1026c2 != null) {
            C1046g2.m4336h(interfaceC1026c2);
        }
    }

    /* renamed from: j */
    public static final InterfaceC1026c2 m4353j(InterfaceC3284g interfaceC3284g) {
        InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) interfaceC3284g.mo4368d(InterfaceC1026c2.f3979c);
        if (interfaceC1026c2 != null) {
            return interfaceC1026c2;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC3284g).toString());
    }
}
