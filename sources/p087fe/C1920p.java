package p087fe;

import gd.C2245s;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;
import sd.InterfaceC4584p;

/* renamed from: fe.p */
/* loaded from: classes2.dex */
public final class C1920p<T> implements InterfaceC1907c<T> {

    /* renamed from: h */
    public final InterfaceC1907c<T> f7268h;

    /* renamed from: i */
    public final InterfaceC4584p<InterfaceC1907c<? super T>, InterfaceC3281d<? super C2245s>, Object> f7269i;

    @InterfaceC3472f(m12916c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m12917f = "Share.kt", m12918l = {419, 423}, m12919m = "onSubscription")
    /* renamed from: fe.p$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3470d {

        /* renamed from: h */
        public Object f7270h;

        /* renamed from: i */
        public Object f7271i;

        /* renamed from: j */
        public /* synthetic */ Object f7272j;

        /* renamed from: k */
        public final /* synthetic */ C1920p<T> f7273k;

        /* renamed from: l */
        public int f7274l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1920p<T> c1920p, InterfaceC3281d<? super a> interfaceC3281d) {
            super(interfaceC3281d);
            this.f7273k = c1920p;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f7272j = obj;
            this.f7274l |= Integer.MIN_VALUE;
            return this.f7273k.m7815a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ge.i] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m7815a(p146jd.InterfaceC3281d<? super gd.C2245s> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p087fe.C1920p.a
            if (r0 == 0) goto L13
            r0 = r7
            fe.p$a r0 = (p087fe.C1920p.a) r0
            int r1 = r0.f7274l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7274l = r1
            goto L18
        L13:
            fe.p$a r0 = new fe.p$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f7272j
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f7274l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            gd.C2238l.m8975b(r7)
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f7271i
            ge.i r2 = (ge.C2254i) r2
            java.lang.Object r4 = r0.f7270h
            fe.p r4 = (p087fe.C1920p) r4
            gd.C2238l.m8975b(r7)     // Catch: java.lang.Throwable -> L7d
            goto L5e
        L40:
            gd.C2238l.m8975b(r7)
            ge.i r2 = new ge.i
            fe.c<T> r7 = r6.f7268h
            jd.g r5 = r0.getContext()
            r2.<init>(r7, r5)
            sd.p<fe.c<? super T>, jd.d<? super gd.s>, java.lang.Object> r7 = r6.f7269i     // Catch: java.lang.Throwable -> L7d
            r0.f7270h = r6     // Catch: java.lang.Throwable -> L7d
            r0.f7271i = r2     // Catch: java.lang.Throwable -> L7d
            r0.f7274l = r4     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L7d
            if (r7 != r1) goto L5d
            return r1
        L5d:
            r4 = r6
        L5e:
            r2.releaseIntercepted()
            fe.c<T> r7 = r4.f7268h
            boolean r2 = r7 instanceof p087fe.C1920p
            if (r2 == 0) goto L7a
            fe.p r7 = (p087fe.C1920p) r7
            r2 = 0
            r0.f7270h = r2
            r0.f7271i = r2
            r0.f7274l = r3
            java.lang.Object r7 = r7.m7815a(r0)
            if (r7 != r1) goto L77
            return r1
        L77:
            gd.s r7 = gd.C2245s.f8873a
            return r7
        L7a:
            gd.s r7 = gd.C2245s.f8873a
            return r7
        L7d:
            r7 = move-exception
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p087fe.C1920p.m7815a(jd.d):java.lang.Object");
    }

    @Override // p087fe.InterfaceC1907c
    public Object emit(T t10, InterfaceC3281d<? super C2245s> interfaceC3281d) {
        return this.f7268h.emit(t10, interfaceC3281d);
    }
}
