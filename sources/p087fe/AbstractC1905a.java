package p087fe;

import gd.C2245s;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3470d;
import p173ld.InterfaceC3472f;

/* renamed from: fe.a */
/* loaded from: classes2.dex */
public abstract class AbstractC1905a<T> implements InterfaceC1906b<T> {

    @InterfaceC3472f(m12916c = "kotlinx.coroutines.flow.AbstractFlow", m12917f = "Flow.kt", m12918l = {230}, m12919m = "collect")
    /* renamed from: fe.a$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC3470d {

        /* renamed from: h */
        public Object f7219h;

        /* renamed from: i */
        public /* synthetic */ Object f7220i;

        /* renamed from: j */
        public final /* synthetic */ AbstractC1905a<T> f7221j;

        /* renamed from: k */
        public int f7222k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1905a<T> abstractC1905a, InterfaceC3281d<? super a> interfaceC3281d) {
            super(interfaceC3281d);
            this.f7221j = abstractC1905a;
        }

        @Override // p173ld.AbstractC3467a
        public final Object invokeSuspend(Object obj) {
            this.f7220i = obj;
            this.f7222k |= Integer.MIN_VALUE;
            return this.f7221j.mo7781a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p087fe.InterfaceC1906b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo7781a(p087fe.InterfaceC1907c<? super T> r6, p146jd.InterfaceC3281d<? super gd.C2245s> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p087fe.AbstractC1905a.a
            if (r0 == 0) goto L13
            r0 = r7
            fe.a$a r0 = (p087fe.AbstractC1905a.a) r0
            int r1 = r0.f7222k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7222k = r1
            goto L18
        L13:
            fe.a$a r0 = new fe.a$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7220i
            java.lang.Object r1 = p161kd.C3385c.m12581c()
            int r2 = r0.f7222k
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f7219h
            ge.i r6 = (ge.C2254i) r6
            gd.C2238l.m8975b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            gd.C2238l.m8975b(r7)
            ge.i r7 = new ge.i
            jd.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f7219h = r7     // Catch: java.lang.Throwable -> L55
            r0.f7222k = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.mo7782b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            gd.s r6 = gd.C2245s.f8873a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p087fe.AbstractC1905a.mo7781a(fe.c, jd.d):java.lang.Object");
    }

    /* renamed from: b */
    public abstract Object mo7782b(InterfaceC1907c<? super T> interfaceC1907c, InterfaceC3281d<? super C2245s> interfaceC3281d);
}
