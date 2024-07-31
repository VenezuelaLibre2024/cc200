package p246r0;

import ee.C1778f;
import ee.C1779g;
import ee.C1782j;
import ee.InterfaceC1776d;
import gd.C2245s;
import java.util.concurrent.atomic.AtomicInteger;
import p038ce.C1063k;
import p038ce.InterfaceC1026c2;
import p038ce.InterfaceC1085p0;
import p079f6.C1841a;
import p146jd.InterfaceC3281d;
import p173ld.AbstractC3478l;
import p173ld.InterfaceC3472f;
import sd.InterfaceC4580l;
import sd.InterfaceC4584p;
import td.AbstractC4754n;
import td.C4753m;

/* renamed from: r0.l */
/* loaded from: classes.dex */
public final class C4268l<T> {

    /* renamed from: a */
    public final InterfaceC1085p0 f15416a;

    /* renamed from: b */
    public final InterfaceC4584p<T, InterfaceC3281d<? super C2245s>, Object> f15417b;

    /* renamed from: c */
    public final InterfaceC1776d<T> f15418c;

    /* renamed from: d */
    public final AtomicInteger f15419d;

    /* renamed from: r0.l$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4580l<Throwable, C2245s> {

        /* renamed from: h */
        public final /* synthetic */ InterfaceC4580l<Throwable, C2245s> f15420h;

        /* renamed from: i */
        public final /* synthetic */ C4268l<T> f15421i;

        /* renamed from: j */
        public final /* synthetic */ InterfaceC4584p<T, Throwable, C2245s> f15422j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l, C4268l<T> c4268l, InterfaceC4584p<? super T, ? super Throwable, C2245s> interfaceC4584p) {
            super(1);
            this.f15420h = interfaceC4580l;
            this.f15421i = c4268l;
            this.f15422j = interfaceC4584p;
        }

        /* renamed from: a */
        public final void m16363a(Throwable th) {
            C2245s c2245s;
            this.f15420h.invoke(th);
            this.f15421i.f15418c.mo7114b(th);
            do {
                Object m7199f = C1779g.m7199f(this.f15421i.f15418c.mo7112a());
                if (m7199f == null) {
                    c2245s = null;
                } else {
                    this.f15422j.invoke(m7199f, th);
                    c2245s = C2245s.f8873a;
                }
            } while (c2245s != null);
        }

        @Override // sd.InterfaceC4580l
        public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
            m16363a(th);
            return C2245s.f8873a;
        }
    }

    @InterfaceC3472f(m12916c = "androidx.datastore.core.SimpleActor$offer$2", m12917f = "SimpleActor.kt", m12918l = {122, 122}, m12919m = "invokeSuspend")
    /* renamed from: r0.l$b */
    /* loaded from: classes.dex */
    public static final class b extends AbstractC3478l implements InterfaceC4584p<InterfaceC1085p0, InterfaceC3281d<? super C2245s>, Object> {

        /* renamed from: h */
        public Object f15423h;

        /* renamed from: i */
        public int f15424i;

        /* renamed from: j */
        public final /* synthetic */ C4268l<T> f15425j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C4268l<T> c4268l, InterfaceC3281d<? super b> interfaceC3281d) {
            super(2, interfaceC3281d);
            this.f15425j = c4268l;
        }

        @Override // p173ld.AbstractC3467a
        public final InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
            return new b(this.f15425j, interfaceC3281d);
        }

        @Override // sd.InterfaceC4584p
        public final Object invoke(InterfaceC1085p0 interfaceC1085p0, InterfaceC3281d<? super C2245s> interfaceC3281d) {
            return ((b) create(interfaceC1085p0, interfaceC3281d)).invokeSuspend(C2245s.f8873a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x005a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:6:0x006e). Please report as a decompilation issue!!! */
        @Override // p173ld.AbstractC3467a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = p161kd.C3385c.m12581c()
                int r1 = r7.f15424i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                gd.C2238l.m8975b(r8)
                r8 = r7
                goto L6e
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                java.lang.Object r1 = r7.f15423h
                sd.p r1 = (sd.InterfaceC4584p) r1
                gd.C2238l.m8975b(r8)
                r4 = r1
                r1 = r0
                r0 = r7
                goto L60
            L26:
                gd.C2238l.m8975b(r8)
                r0.l<T> r8 = r7.f15425j
                java.util.concurrent.atomic.AtomicInteger r8 = p246r0.C4268l.m16360c(r8)
                int r8 = r8.get()
                if (r8 <= 0) goto L37
                r8 = r3
                goto L38
            L37:
                r8 = 0
            L38:
                if (r8 == 0) goto L7d
                r8 = r7
            L3b:
                r0.l<T> r1 = r8.f15425j
                ce.p0 r1 = p246r0.C4268l.m16361d(r1)
                p038ce.C1089q0.m4560d(r1)
                r0.l<T> r1 = r8.f15425j
                sd.p r1 = p246r0.C4268l.m16358a(r1)
                r0.l<T> r4 = r8.f15425j
                ee.d r4 = p246r0.C4268l.m16359b(r4)
                r8.f15423h = r1
                r8.f15424i = r3
                java.lang.Object r4 = r4.mo7118d(r8)
                if (r4 != r0) goto L5b
                return r0
            L5b:
                r6 = r0
                r0 = r8
                r8 = r4
                r4 = r1
                r1 = r6
            L60:
                r5 = 0
                r0.f15423h = r5
                r0.f15424i = r2
                java.lang.Object r8 = r4.invoke(r8, r0)
                if (r8 != r1) goto L6c
                return r1
            L6c:
                r8 = r0
                r0 = r1
            L6e:
                r0.l<T> r1 = r8.f15425j
                java.util.concurrent.atomic.AtomicInteger r1 = p246r0.C4268l.m16360c(r1)
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L3b
                gd.s r8 = gd.C2245s.f8873a
                return r8
            L7d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p246r0.C4268l.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4268l(InterfaceC1085p0 interfaceC1085p0, InterfaceC4580l<? super Throwable, C2245s> interfaceC4580l, InterfaceC4584p<? super T, ? super Throwable, C2245s> interfaceC4584p, InterfaceC4584p<? super T, ? super InterfaceC3281d<? super C2245s>, ? extends Object> interfaceC4584p2) {
        C4753m.m18653f(interfaceC1085p0, "scope");
        C4753m.m18653f(interfaceC4580l, "onComplete");
        C4753m.m18653f(interfaceC4584p, "onUndeliveredElement");
        C4753m.m18653f(interfaceC4584p2, "consumeMessage");
        this.f15416a = interfaceC1085p0;
        this.f15417b = interfaceC4584p2;
        this.f15418c = C1778f.m7193b(C1841a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.f15419d = new AtomicInteger(0);
        InterfaceC1026c2 interfaceC1026c2 = (InterfaceC1026c2) interfaceC1085p0.mo1763b().mo4368d(InterfaceC1026c2.f3979c);
        if (interfaceC1026c2 == null) {
            return;
        }
        interfaceC1026c2.mo4278x0(new a(interfaceC4580l, this, interfaceC4584p));
    }

    /* renamed from: e */
    public final void m16362e(T t10) {
        Object mo7116c = this.f15418c.mo7116c(t10);
        if (mo7116c instanceof C1779g.a) {
            Throwable m7198e = C1779g.m7198e(mo7116c);
            if (m7198e != null) {
                throw m7198e;
            }
            throw new C1782j("Channel was closed normally");
        }
        if (!C1779g.m7202i(mo7116c)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.f15419d.getAndIncrement() == 0) {
            C1063k.m4457d(this.f15416a, null, null, new b(this, null), 3, null);
        }
    }
}
