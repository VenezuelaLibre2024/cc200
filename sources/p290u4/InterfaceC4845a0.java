package p290u4;

import android.os.Handler;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4882t;

/* renamed from: u4.a0 */
/* loaded from: classes.dex */
public interface InterfaceC4845a0 {

    /* renamed from: u4.a0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final int f18213a;

        /* renamed from: b */
        public final InterfaceC4882t.b f18214b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C6208a> f18215c;

        /* renamed from: d */
        public final long f18216d;

        /* renamed from: u4.a0$a$a */
        /* loaded from: classes.dex */
        public static final class C6208a {

            /* renamed from: a */
            public Handler f18217a;

            /* renamed from: b */
            public InterfaceC4845a0 f18218b;

            public C6208a(Handler handler, InterfaceC4845a0 interfaceC4845a0) {
                this.f18217a = handler;
                this.f18218b = interfaceC4845a0;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a(CopyOnWriteArrayList<C6208a> copyOnWriteArrayList, int i10, InterfaceC4882t.b bVar, long j10) {
            this.f18215c = copyOnWriteArrayList;
            this.f18213a = i10;
            this.f18214b = bVar;
            this.f18216d = j10;
        }

        /* renamed from: k */
        public /* synthetic */ void m19213k(InterfaceC4845a0 interfaceC4845a0, C4876q c4876q) {
            interfaceC4845a0.mo17582H(this.f18213a, this.f18214b, c4876q);
        }

        /* renamed from: l */
        public /* synthetic */ void m19214l(InterfaceC4845a0 interfaceC4845a0, C4870n c4870n, C4876q c4876q) {
            interfaceC4845a0.mo17584J(this.f18213a, this.f18214b, c4870n, c4876q);
        }

        /* renamed from: m */
        public /* synthetic */ void m19215m(InterfaceC4845a0 interfaceC4845a0, C4870n c4870n, C4876q c4876q) {
            interfaceC4845a0.mo17588u(this.f18213a, this.f18214b, c4870n, c4876q);
        }

        /* renamed from: n */
        public /* synthetic */ void m19216n(InterfaceC4845a0 interfaceC4845a0, C4870n c4870n, C4876q c4876q, IOException iOException, boolean z10) {
            interfaceC4845a0.mo17583I(this.f18213a, this.f18214b, c4870n, c4876q, iOException, z10);
        }

        /* renamed from: o */
        public /* synthetic */ void m19217o(InterfaceC4845a0 interfaceC4845a0, C4870n c4870n, C4876q c4876q) {
            interfaceC4845a0.mo17589y(this.f18213a, this.f18214b, c4870n, c4876q);
        }

        /* renamed from: p */
        public /* synthetic */ void m19218p(InterfaceC4845a0 interfaceC4845a0, InterfaceC4882t.b bVar, C4876q c4876q) {
            interfaceC4845a0.mo17590z(this.f18213a, bVar, c4876q);
        }

        /* renamed from: A */
        public void m19219A(C4870n c4870n, int i10, int i11, C4463m1 c4463m1, int i12, Object obj, long j10, long j11) {
            m19220B(c4870n, new C4876q(i10, i11, c4463m1, i12, obj, m19226h(j10), m19226h(j11)));
        }

        /* renamed from: B */
        public void m19220B(C4870n c4870n, C4876q c4876q) {
            Iterator<C6208a> it = this.f18215c.iterator();
            while (it.hasNext()) {
                C6208a next = it.next();
                C4041n0.m15414K0(next.f18217a, new Runnable() { // from class: u4.v

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC4845a0 f18482i;

                    /* renamed from: j */
                    public final /* synthetic */ C4870n f18483j;

                    /* renamed from: k */
                    public final /* synthetic */ C4876q f18484k;

                    public /* synthetic */ RunnableC4886v(InterfaceC4845a0 interfaceC4845a0, C4870n c4870n2, C4876q c4876q2) {
                        r2 = interfaceC4845a0;
                        r3 = c4870n2;
                        r4 = c4876q2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4845a0.a.this.m19217o(r2, r3, r4);
                    }
                });
            }
        }

        /* renamed from: C */
        public void m19221C(InterfaceC4845a0 interfaceC4845a0) {
            Iterator<C6208a> it = this.f18215c.iterator();
            while (it.hasNext()) {
                C6208a next = it.next();
                if (next.f18218b == interfaceC4845a0) {
                    this.f18215c.remove(next);
                }
            }
        }

        /* renamed from: D */
        public void m19222D(int i10, long j10, long j11) {
            m19223E(new C4876q(1, i10, null, 3, null, m19226h(j10), m19226h(j11)));
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: u4.z.<init>(u4.a0$a, u4.a0, u4.t$b, u4.q):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        /* renamed from: E */
        public void m19223E(p290u4.C4876q r6) {
            /*
                r5 = this;
                u4.t$b r0 = r5.f18214b
                java.lang.Object r0 = p222p5.C4014a.m15199e(r0)
                u4.t$b r0 = (p290u4.InterfaceC4882t.b) r0
                java.util.concurrent.CopyOnWriteArrayList<u4.a0$a$a> r1 = r5.f18215c
                java.util.Iterator r1 = r1.iterator()
            Le:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L27
                java.lang.Object r2 = r1.next()
                u4.a0$a$a r2 = (p290u4.InterfaceC4845a0.a.C6208a) r2
                u4.a0 r3 = r2.f18218b
                android.os.Handler r2 = r2.f18217a
                u4.z r4 = new u4.z
                r4.<init>()
                p222p5.C4041n0.m15414K0(r2, r4)
                goto Le
            L27:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p290u4.InterfaceC4845a0.a.m19223E(u4.q):void");
        }

        /* renamed from: F */
        public a m19224F(int i10, InterfaceC4882t.b bVar, long j10) {
            return new a(this.f18215c, i10, bVar, j10);
        }

        /* renamed from: g */
        public void m19225g(Handler handler, InterfaceC4845a0 interfaceC4845a0) {
            C4014a.m15199e(handler);
            C4014a.m15199e(interfaceC4845a0);
            this.f18215c.add(new C6208a(handler, interfaceC4845a0));
        }

        /* renamed from: h */
        public final long m19226h(long j10) {
            long m15442Y0 = C4041n0.m15442Y0(j10);
            if (m15442Y0 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f18216d + m15442Y0;
        }

        /* renamed from: i */
        public void m19227i(int i10, C4463m1 c4463m1, int i11, Object obj, long j10) {
            m19228j(new C4876q(1, i10, c4463m1, i11, obj, m19226h(j10), -9223372036854775807L));
        }

        /* renamed from: j */
        public void m19228j(C4876q c4876q) {
            Iterator<C6208a> it = this.f18215c.iterator();
            while (it.hasNext()) {
                C6208a next = it.next();
                C4041n0.m15414K0(next.f18217a, new Runnable() { // from class: u4.y

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC4845a0 f18499i;

                    /* renamed from: j */
                    public final /* synthetic */ C4876q f18500j;

                    public /* synthetic */ RunnableC4891y(InterfaceC4845a0 interfaceC4845a0, C4876q c4876q2) {
                        r2 = interfaceC4845a0;
                        r3 = c4876q2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4845a0.a.this.m19213k(r2, r3);
                    }
                });
            }
        }

        /* renamed from: q */
        public void m19229q(C4870n c4870n, int i10) {
            m19230r(c4870n, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: r */
        public void m19230r(C4870n c4870n, int i10, int i11, C4463m1 c4463m1, int i12, Object obj, long j10, long j11) {
            m19231s(c4870n, new C4876q(i10, i11, c4463m1, i12, obj, m19226h(j10), m19226h(j11)));
        }

        /* renamed from: s */
        public void m19231s(C4870n c4870n, C4876q c4876q) {
            Iterator<C6208a> it = this.f18215c.iterator();
            while (it.hasNext()) {
                C6208a next = it.next();
                C4041n0.m15414K0(next.f18217a, new Runnable() { // from class: u4.w

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC4845a0 f18487i;

                    /* renamed from: j */
                    public final /* synthetic */ C4870n f18488j;

                    /* renamed from: k */
                    public final /* synthetic */ C4876q f18489k;

                    public /* synthetic */ RunnableC4888w(InterfaceC4845a0 interfaceC4845a0, C4870n c4870n2, C4876q c4876q2) {
                        r2 = interfaceC4845a0;
                        r3 = c4870n2;
                        r4 = c4876q2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4845a0.a.this.m19214l(r2, r3, r4);
                    }
                });
            }
        }

        /* renamed from: t */
        public void m19232t(C4870n c4870n, int i10) {
            m19233u(c4870n, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }

        /* renamed from: u */
        public void m19233u(C4870n c4870n, int i10, int i11, C4463m1 c4463m1, int i12, Object obj, long j10, long j11) {
            m19234v(c4870n, new C4876q(i10, i11, c4463m1, i12, obj, m19226h(j10), m19226h(j11)));
        }

        /* renamed from: v */
        public void m19234v(C4870n c4870n, C4876q c4876q) {
            Iterator<C6208a> it = this.f18215c.iterator();
            while (it.hasNext()) {
                C6208a next = it.next();
                C4041n0.m15414K0(next.f18217a, new Runnable() { // from class: u4.u

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC4845a0 f18472i;

                    /* renamed from: j */
                    public final /* synthetic */ C4870n f18473j;

                    /* renamed from: k */
                    public final /* synthetic */ C4876q f18474k;

                    public /* synthetic */ RunnableC4884u(InterfaceC4845a0 interfaceC4845a0, C4870n c4870n2, C4876q c4876q2) {
                        r2 = interfaceC4845a0;
                        r3 = c4870n2;
                        r4 = c4876q2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4845a0.a.this.m19215m(r2, r3, r4);
                    }
                });
            }
        }

        /* renamed from: w */
        public void m19235w(C4870n c4870n, int i10, int i11, C4463m1 c4463m1, int i12, Object obj, long j10, long j11, IOException iOException, boolean z10) {
            m19237y(c4870n, new C4876q(i10, i11, c4463m1, i12, obj, m19226h(j10), m19226h(j11)), iOException, z10);
        }

        /* renamed from: x */
        public void m19236x(C4870n c4870n, int i10, IOException iOException, boolean z10) {
            m19235w(c4870n, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z10);
        }

        /* renamed from: y */
        public void m19237y(C4870n c4870n, C4876q c4876q, IOException iOException, boolean z10) {
            Iterator<C6208a> it = this.f18215c.iterator();
            while (it.hasNext()) {
                C6208a next = it.next();
                C4041n0.m15414K0(next.f18217a, new Runnable() { // from class: u4.x

                    /* renamed from: i */
                    public final /* synthetic */ InterfaceC4845a0 f18493i;

                    /* renamed from: j */
                    public final /* synthetic */ C4870n f18494j;

                    /* renamed from: k */
                    public final /* synthetic */ C4876q f18495k;

                    /* renamed from: l */
                    public final /* synthetic */ IOException f18496l;

                    /* renamed from: m */
                    public final /* synthetic */ boolean f18497m;

                    public /* synthetic */ RunnableC4890x(InterfaceC4845a0 interfaceC4845a0, C4870n c4870n2, C4876q c4876q2, IOException iOException2, boolean z102) {
                        r2 = interfaceC4845a0;
                        r3 = c4870n2;
                        r4 = c4876q2;
                        r5 = iOException2;
                        r6 = z102;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4845a0.a.this.m19216n(r2, r3, r4, r5, r6);
                    }
                });
            }
        }

        /* renamed from: z */
        public void m19238z(C4870n c4870n, int i10) {
            m19219A(c4870n, i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        }
    }

    /* renamed from: H */
    default void mo17582H(int i10, InterfaceC4882t.b bVar, C4876q c4876q) {
    }

    /* renamed from: I */
    default void mo17583I(int i10, InterfaceC4882t.b bVar, C4870n c4870n, C4876q c4876q, IOException iOException, boolean z10) {
    }

    /* renamed from: J */
    default void mo17584J(int i10, InterfaceC4882t.b bVar, C4870n c4870n, C4876q c4876q) {
    }

    /* renamed from: u */
    default void mo17588u(int i10, InterfaceC4882t.b bVar, C4870n c4870n, C4876q c4876q) {
    }

    /* renamed from: y */
    default void mo17589y(int i10, InterfaceC4882t.b bVar, C4870n c4870n, C4876q c4876q) {
    }

    /* renamed from: z */
    default void mo17590z(int i10, InterfaceC4882t.b bVar, C4876q c4876q) {
    }
}
