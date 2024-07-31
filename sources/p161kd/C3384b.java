package p161kd;

import gd.C2238l;
import gd.C2245s;
import p146jd.C3285h;
import p146jd.InterfaceC3281d;
import p146jd.InterfaceC3284g;
import p173ld.AbstractC3467a;
import p173ld.AbstractC3470d;
import p173ld.AbstractC3476j;
import p173ld.C3474h;
import sd.InterfaceC4584p;
import td.C4741a0;
import td.C4753m;

/* renamed from: kd.b */
/* loaded from: classes2.dex */
public class C3384b {

    /* renamed from: kd.b$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3476j {

        /* renamed from: h */
        public int f11798h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC4584p f11799i;

        /* renamed from: j */
        public final /* synthetic */ Object f11800j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3281d interfaceC3281d, InterfaceC4584p interfaceC4584p, Object obj) {
            super(interfaceC3281d);
            this.f11799i = interfaceC4584p;
            this.f11800j = obj;
            C4753m.m18651d(interfaceC3281d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p173ld.AbstractC3467a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f11798h;
            if (i10 == 0) {
                this.f11798h = 1;
                C2238l.m8975b(obj);
                C4753m.m18651d(this.f11799i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC4584p) C4741a0.m18631a(this.f11799i, 2)).invoke(this.f11800j, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f11798h = 2;
            C2238l.m8975b(obj);
            return obj;
        }
    }

    /* renamed from: kd.b$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC3470d {

        /* renamed from: h */
        public int f11801h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC4584p f11802i;

        /* renamed from: j */
        public final /* synthetic */ Object f11803j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3281d interfaceC3281d, InterfaceC3284g interfaceC3284g, InterfaceC4584p interfaceC4584p, Object obj) {
            super(interfaceC3281d, interfaceC3284g);
            this.f11802i = interfaceC4584p;
            this.f11803j = obj;
            C4753m.m18651d(interfaceC3281d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // p173ld.AbstractC3467a
        public Object invokeSuspend(Object obj) {
            int i10 = this.f11801h;
            if (i10 == 0) {
                this.f11801h = 1;
                C2238l.m8975b(obj);
                C4753m.m18651d(this.f11802i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC4584p) C4741a0.m18631a(this.f11802i, 2)).invoke(this.f11803j, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f11801h = 2;
            C2238l.m8975b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <R, T> InterfaceC3281d<C2245s> m12579a(InterfaceC4584p<? super R, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, R r10, InterfaceC3281d<? super T> interfaceC3281d) {
        C4753m.m18653f(interfaceC4584p, "<this>");
        C4753m.m18653f(interfaceC3281d, "completion");
        InterfaceC3281d<?> m12925a = C3474h.m12925a(interfaceC3281d);
        if (interfaceC4584p instanceof AbstractC3467a) {
            return ((AbstractC3467a) interfaceC4584p).create(r10, m12925a);
        }
        InterfaceC3284g context = m12925a.getContext();
        return context == C3285h.f11452h ? new a(m12925a, interfaceC4584p, r10) : new b(m12925a, context, interfaceC4584p, r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> InterfaceC3281d<T> m12580b(InterfaceC3281d<? super T> interfaceC3281d) {
        InterfaceC3281d<T> interfaceC3281d2;
        C4753m.m18653f(interfaceC3281d, "<this>");
        AbstractC3470d abstractC3470d = interfaceC3281d instanceof AbstractC3470d ? (AbstractC3470d) interfaceC3281d : null;
        return (abstractC3470d == null || (interfaceC3281d2 = (InterfaceC3281d<T>) abstractC3470d.intercepted()) == null) ? interfaceC3281d : interfaceC3281d2;
    }
}
