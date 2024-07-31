package p116he;

import gd.C2227a;
import gd.C2245s;
import p038ce.C1073m0;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4580l;
import td.AbstractC4754n;

/* renamed from: he.d0 */
/* loaded from: classes2.dex */
public final class C2522d0 {

    /* renamed from: he.d0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC4580l<E, C2245s> f9960h;

        /* renamed from: i */
        public final /* synthetic */ E f9961i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC3284g f9962j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4580l<? super E, C2245s> interfaceC4580l, E e10, InterfaceC3284g interfaceC3284g) {
            super(1);
            this.f9960h = interfaceC4580l;
            this.f9961i = e10;
            this.f9962j = interfaceC3284g;
        }

        /* renamed from: a */
        public final void m10062a(Throwable th) {
            C2522d0.m10059b(this.f9960h, this.f9961i, this.f9962j);
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            m10062a(th);
            return C2245s.f8873a;
        }
    }

    /* renamed from: a */
    public static final <E> InterfaceC4580l<Throwable, C2245s> m10058a(InterfaceC4580l<? super E, C2245s> interfaceC4580l, E e10, InterfaceC3284g interfaceC3284g) {
        return new a(interfaceC4580l, e10, interfaceC3284g);
    }

    /* renamed from: b */
    public static final <E> void m10059b(InterfaceC4580l<? super E, C2245s> interfaceC4580l, E e10, InterfaceC3284g interfaceC3284g) {
        C2556u0 m10060c = m10060c(interfaceC4580l, e10, null);
        if (m10060c != null) {
            C1073m0.m4472a(interfaceC3284g, m10060c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <E> C2556u0 m10060c(InterfaceC4580l<? super E, C2245s> interfaceC4580l, E e10, C2556u0 c2556u0) {
        try {
            interfaceC4580l.invoke(e10);
        } catch (Throwable th) {
            if (c2556u0 == null || c2556u0.getCause() == th) {
                return new C2556u0("Exception in undelivered element handler for " + e10, th);
            }
            C2227a.m8956a(c2556u0, th);
        }
        return c2556u0;
    }

    /* renamed from: d */
    public static /* synthetic */ C2556u0 m10061d(InterfaceC4580l interfaceC4580l, Object obj, C2556u0 c2556u0, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            c2556u0 = null;
        }
        return m10060c(interfaceC4580l, obj, c2556u0);
    }
}
