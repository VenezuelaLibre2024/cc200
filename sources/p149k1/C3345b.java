package p149k1;

import gd.C2245s;
import java.util.concurrent.CancellationException;
import p038ce.InterfaceC1117x0;
import p170l7.InterfaceFutureC3445f;
import p300v.C5025b;
import sd.InterfaceC4580l;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: k1.b */
/* loaded from: classes.dex */
public final class C3345b {

    /* renamed from: k1.b$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

        /* renamed from: h */
        public final /* synthetic */ C5025b.a<T> f11654h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC1117x0<T> f11655i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C5025b.a<T> aVar, InterfaceC1117x0<? extends T> interfaceC1117x0) {
            super(1);
            this.f11654h = aVar;
            this.f11655i = interfaceC1117x0;
        }

        /* renamed from: a */
        public final void m12402a(Throwable th) {
            if (th == null) {
                this.f11654h.m19767b(this.f11655i.mo4598j());
            } else if (th instanceof CancellationException) {
                this.f11654h.m19768c();
            } else {
                this.f11654h.m19770e(th);
            }
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            m12402a(th);
            return C2245s.f8873a;
        }
    }

    /* renamed from: b */
    public static final <T> InterfaceFutureC3445f<T> m12399b(final InterfaceC1117x0<? extends T> interfaceC1117x0, final Object obj) {
        C4753m.m18653f(interfaceC1117x0, "<this>");
        InterfaceFutureC3445f<T> m19765a = C5025b.m19765a(new C5025b.c() { // from class: k1.a
            @Override // p300v.C5025b.c
            /* renamed from: a */
            public final Object mo12397a(C5025b.a aVar) {
                Object m12401d;
                m12401d = C3345b.m12401d(InterfaceC1117x0.this, obj, aVar);
                return m12401d;
            }
        });
        C4753m.m18652e(m19765a, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return m19765a;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceFutureC3445f m12400c(InterfaceC1117x0 interfaceC1117x0, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return m12399b(interfaceC1117x0, obj);
    }

    /* renamed from: d */
    public static final Object m12401d(InterfaceC1117x0 interfaceC1117x0, Object obj, C5025b.a aVar) {
        C4753m.m18653f(interfaceC1117x0, "$this_asListenableFuture");
        C4753m.m18653f(aVar, "completer");
        interfaceC1117x0.mo4278x0(new a(aVar, interfaceC1117x0));
        return obj;
    }
}
