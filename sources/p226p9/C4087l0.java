package p226p9;

import android.app.Activity;
import android.os.Build;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p108h6.C2394s;
import p226p9.AbstractC4073e0;
import p226p9.AbstractC4073e0.a;
import p240q9.C4210a;
import p240q9.C4216g;

/* renamed from: p9.l0 */
/* loaded from: classes.dex */
public class C4087l0<ListenerTypeT, ResultT extends AbstractC4073e0.a> {

    /* renamed from: a */
    public final Queue<ListenerTypeT> f14720a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final HashMap<ListenerTypeT, C4216g> f14721b = new HashMap<>();

    /* renamed from: c */
    public AbstractC4073e0<ResultT> f14722c;

    /* renamed from: d */
    public int f14723d;

    /* renamed from: e */
    public a<ListenerTypeT, ResultT> f14724e;

    /* renamed from: p9.l0$a */
    /* loaded from: classes.dex */
    public interface a<ListenerTypeT, ResultT> {
        /* renamed from: a */
        void mo15621a(ListenerTypeT listenertypet, ResultT resultt);
    }

    public C4087l0(AbstractC4073e0<ResultT> abstractC4073e0, int i10, a<ListenerTypeT, ResultT> aVar) {
        this.f14722c = abstractC4073e0;
        this.f14723d = i10;
        this.f14724e = aVar;
    }

    /* renamed from: f */
    public /* synthetic */ void m15749f(Object obj, AbstractC4073e0.a aVar) {
        this.f14724e.mo15621a(obj, aVar);
    }

    /* renamed from: g */
    public /* synthetic */ void m15750g(Object obj, AbstractC4073e0.a aVar) {
        this.f14724e.mo15621a(obj, aVar);
    }

    /* renamed from: d */
    public void m15751d(Activity activity, Executor executor, ListenerTypeT listenertypet) {
        boolean z10;
        C4216g c4216g;
        C2394s.m9619l(listenertypet);
        synchronized (this.f14722c.m15658J()) {
            boolean z11 = true;
            z10 = (this.f14722c.m15651B() & this.f14723d) != 0;
            this.f14720a.add(listenertypet);
            c4216g = new C4216g(executor);
            this.f14721b.put(listenertypet, c4216g);
            if (activity != null) {
                if (Build.VERSION.SDK_INT >= 17) {
                    if (activity.isDestroyed()) {
                        z11 = false;
                    }
                    C2394s.m9609b(z11, "Activity is already destroyed!");
                }
                C4210a.m16209a().m16211c(activity, listenertypet, new Runnable() { // from class: p9.i0

                    /* renamed from: i */
                    public final /* synthetic */ Object f14705i;

                    public /* synthetic */ RunnableC4081i0(Object listenertypet2) {
                        r2 = listenertypet2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C4087l0.this.m15748e(r2);
                    }
                });
            }
        }
        if (z10) {
            c4216g.m16234a(new Runnable() { // from class: p9.k0

                /* renamed from: i */
                public final /* synthetic */ Object f14718i;

                /* renamed from: j */
                public final /* synthetic */ AbstractC4073e0.a f14719j;

                public /* synthetic */ RunnableC4085k0(Object listenertypet2, AbstractC4073e0.a aVar) {
                    r2 = listenertypet2;
                    r3 = aVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C4087l0.this.m15749f(r2, r3);
                }
            });
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: p9.j0.<init>(p9.l0, java.lang.Object, p9.e0$a):void, class status: GENERATED_AND_UNLOADED
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    /* renamed from: h */
    public void m15752h() {
        /*
            r5 = this;
            p9.e0<ResultT extends p9.e0$a> r0 = r5.f14722c
            int r0 = r0.m15651B()
            int r1 = r5.f14723d
            r0 = r0 & r1
            if (r0 == 0) goto L34
            p9.e0<ResultT extends p9.e0$a> r0 = r5.f14722c
            p9.e0$a r0 = r0.m15670g0()
            java.util.Queue<ListenerTypeT> r1 = r5.f14720a
            java.util.Iterator r1 = r1.iterator()
        L17:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            java.util.HashMap<ListenerTypeT, q9.g> r3 = r5.f14721b
            java.lang.Object r3 = r3.get(r2)
            q9.g r3 = (p240q9.C4216g) r3
            if (r3 == 0) goto L17
            p9.j0 r4 = new p9.j0
            r4.<init>()
            r3.m16234a(r4)
            goto L17
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p226p9.C4087l0.m15752h():void");
    }

    /* renamed from: i */
    public void m15748e(ListenerTypeT listenertypet) {
        C2394s.m9619l(listenertypet);
        synchronized (this.f14722c.m15658J()) {
            this.f14721b.remove(listenertypet);
            this.f14720a.remove(listenertypet);
            C4210a.m16209a().m16210b(listenertypet);
        }
    }
}
