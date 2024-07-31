package p087fe;

import gd.C2245s;
import ge.C2246a;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;
import td.C4763w;

/* renamed from: fe.j */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1914j {

    /* renamed from: fe.j$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements InterfaceC1907c<T> {

        /* renamed from: h */
        public final /* synthetic */ C4763w f7249h;

        public a(C4763w c4763w) {
            this.f7249h = c4763w;
        }

        @Override // p087fe.InterfaceC1907c
        public Object emit(T t10, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            this.f7249h.f17731h = t10;
            throw new C2246a(this);
        }
    }

    @InterfaceC3472f(m12916c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m12917f = "Reduce.kt", m12918l = {183}, m12919m = "first")
    /* renamed from: fe.j$b */
    /* loaded from: classes2.dex */
    public static final class b<T> extends AbstractC3470d {

        /* renamed from: h */
        public Object f7250h;

        /* renamed from: i */
        public Object f7251i;

        /* renamed from: j */
        public /* synthetic */ Object f7252j;

        /* renamed from: k */
        public int f7253k;

        public b(InterfaceC3281d<? super b> interfaceC3281d) {
            super(interfaceC3281d);
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f7252j = obj;
            this.f7253k |= Integer.MIN_VALUE;
            return C1908d.m7788f(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object m7798a(p087fe.InterfaceC1906b<? extends T> r4, p146jd.InterfaceC3281d<? super T> r5) {
        /*
            boolean r0 = r5 instanceof p087fe.C1914j.b
            if (r0 == 0) goto L13
            r0 = r5
            fe.j$b r0 = (p087fe.C1914j.b) r0
            int r1 = r0.f7253k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7253k = r1
            goto L18
        L13:
            fe.j$b r0 = new fe.j$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f7252j
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f7253k
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f7251i
            fe.j$a r4 = (p087fe.C1914j.a) r4
            java.lang.Object r0 = r0.f7250h
            td.w r0 = (td.C4763w) r0
            gd.C2238l.m8975b(r5)     // Catch: ge.C2246a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            gd.C2238l.m8975b(r5)
            td.w r5 = new td.w
            r5.<init>()
            he.l0 r2 = ge.C2253h.f8883a
            r5.f17731h = r2
            fe.j$a r2 = new fe.j$a
            r2.<init>(r5)
            r0.f7250h = r5     // Catch: ge.C2246a -> L5b
            r0.f7251i = r2     // Catch: ge.C2246a -> L5b
            r0.f7253k = r3     // Catch: ge.C2246a -> L5b
            java.lang.Object r4 = r4.mo7781a(r2, r0)     // Catch: ge.C2246a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            ge.C2251f.m8982a(r5, r4)
        L62:
            T r4 = r0.f17731h
            he.l0 r5 = ge.C2253h.f8883a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p087fe.C1914j.m7798a(fe.b, jd.d):java.lang.Object");
    }
}
