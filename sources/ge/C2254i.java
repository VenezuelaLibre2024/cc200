package ge;

import ae.C0101g;
import gd.C2237k;
import gd.C2245s;
import p038ce.C1046g2;
import p087fe.InterfaceC1907c;
import p146jd.C3285h;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p161kd.C3385c;
import p173ld.AbstractC3470d;
import p173ld.C3474h;
import p173ld.InterfaceC3471e;
import sd.InterfaceC4584p;
import sd.InterfaceC4585q;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: ge.i */
/* loaded from: classes2.dex */
public final class C2254i<T> extends AbstractC3470d implements InterfaceC1907c<T> {

    /* renamed from: h */
    public final InterfaceC1907c<T> f8886h;

    /* renamed from: i */
    public final InterfaceC3284g f8887i;

    /* renamed from: j */
    public final int f8888j;

    /* renamed from: k */
    public InterfaceC3284g f8889k;

    /* renamed from: l */
    public InterfaceC3281d<? super C2245s> f8890l;

    /* renamed from: ge.i$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4584p<Integer, InterfaceC3284g.b, Integer> {

        /* renamed from: h */
        public static final a f8891h = new a();

        public a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer m8986a(int i10, InterfaceC3284g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // sd.InterfaceC4584p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, InterfaceC3284g.b bVar) {
            return m8986a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2254i(InterfaceC1907c<? super T> interfaceC1907c, InterfaceC3284g interfaceC3284g) {
        super(C2252g.f8881h, C3285h.f11452h);
        this.f8886h = interfaceC1907c;
        this.f8887i = interfaceC3284g;
        this.f8888j = ((Number) interfaceC3284g.mo4370z0(0, a.f8891h)).intValue();
    }

    /* renamed from: a */
    public final void m8983a(InterfaceC3284g interfaceC3284g, InterfaceC3284g interfaceC3284g2, T t10) {
        if (interfaceC3284g2 instanceof C2250e) {
            m8985l((C2250e) interfaceC3284g2, t10);
        }
        C2256k.m8989a(this, interfaceC3284g);
    }

    @Override // p087fe.InterfaceC1907c
    public Object emit(T t10, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        try {
            Object m8984j = m8984j(interfaceC3281d, t10);
            if (m8984j == C3385c.m12581c()) {
                C3474h.m12927c(interfaceC3281d);
            }
            return m8984j == C3385c.m12581c() ? m8984j : C2245s.f8873a;
        } catch (Throwable th) {
            this.f8889k = new C2250e(th, interfaceC3281d.getContext());
            throw th;
        }
    }

    @Override // p173ld.AbstractC3467a, p173ld.InterfaceC3471e
    public InterfaceC3471e getCallerFrame() {
        InterfaceC3281d<? super C2245s> interfaceC3281d = this.f8890l;
        if (interfaceC3281d instanceof InterfaceC3471e) {
            return (InterfaceC3471e) interfaceC3281d;
        }
        return null;
    }

    @Override // p173ld.AbstractC3470d, p146jd.InterfaceC3281d
    public InterfaceC3284g getContext() {
        InterfaceC3284g interfaceC3284g = this.f8889k;
        return interfaceC3284g == null ? C3285h.f11452h : interfaceC3284g;
    }

    @Override // p173ld.AbstractC3467a, p173ld.InterfaceC3471e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // p173ld.AbstractC3467a
    public Object invokeSuspend(Object obj) {
        Throwable m8968d = C2237k.m8968d(obj);
        if (m8968d != null) {
            this.f8889k = new C2250e(m8968d, getContext());
        }
        InterfaceC3281d<? super C2245s> interfaceC3281d = this.f8890l;
        if (interfaceC3281d != null) {
            interfaceC3281d.resumeWith(obj);
        }
        return C3385c.m12581c();
    }

    /* renamed from: j */
    public final Object m8984j(InterfaceC3281d<? super C2245s> interfaceC3281d, T t10) {
        InterfaceC4585q interfaceC4585q;
        InterfaceC3284g context = interfaceC3281d.getContext();
        C1046g2.m4337i(context);
        InterfaceC3284g interfaceC3284g = this.f8889k;
        if (interfaceC3284g != context) {
            m8983a(context, interfaceC3284g, t10);
            this.f8889k = context;
        }
        this.f8890l = interfaceC3281d;
        interfaceC4585q = C2255j.f8892a;
        InterfaceC1907c<T> interfaceC1907c = this.f8886h;
        C4753m.m18651d(interfaceC1907c, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        C4753m.m18651d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object mo7159b = interfaceC4585q.mo7159b(interfaceC1907c, t10, this);
        if (!C4753m.m18648a(mo7159b, C3385c.m12581c())) {
            this.f8890l = null;
        }
        return mo7159b;
    }

    /* renamed from: l */
    public final void m8985l(C2250e c2250e, Object obj) {
        throw new IllegalStateException(C0101g.m417e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c2250e.f8879h + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // p173ld.AbstractC3470d, p173ld.AbstractC3467a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
