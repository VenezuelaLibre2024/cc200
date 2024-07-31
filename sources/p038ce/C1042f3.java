package p038ce;

import ie.C2706b;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import p173ld.C3474h;
import sd.InterfaceC4584p;

/* renamed from: ce.f3 */
/* loaded from: classes2.dex */
public final class C1042f3 {
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r4 == null) goto L21;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final p038ce.C1032d3 m4317a(long r2, p038ce.InterfaceC1125z0 r4, p038ce.InterfaceC1026c2 r5) {
        /*
            boolean r0 = r4 instanceof p038ce.InterfaceC1020b1
            if (r0 == 0) goto L7
            ce.b1 r4 = (p038ce.InterfaceC1020b1) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            be.a$a r0 = be.C0550a.f2478i
            be.d r0 = be.EnumC0553d.MILLISECONDS
            long r0 = be.C0552c.m2781i(r2, r0)
            java.lang.String r4 = r4.m4265u0(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            ce.d3 r2 = new ce.d3
            r2.<init>(r4, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p038ce.C1042f3.m4317a(long, ce.z0, ce.c2):ce.d3");
    }

    /* renamed from: b */
    public static final <U, T extends U> Object m4318b(RunnableC1037e3<U, ? super T> runnableC1037e3, InterfaceC4584p<? super InterfaceC1085p0, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p) {
        C1046g2.m4335g(runnableC1037e3, C1015a1.m4258a(runnableC1037e3.f9969k.getContext()).mo4501G0(runnableC1037e3.f3995l, runnableC1037e3, runnableC1037e3.getContext()));
        return C2706b.m11038c(runnableC1037e3, runnableC1037e3, interfaceC4584p);
    }

    /* renamed from: c */
    public static final <T> Object m4319c(long j10, InterfaceC4584p<? super InterfaceC1085p0, ? super InterfaceC3281d<? super T>, ? extends Object> interfaceC4584p, InterfaceC3281d<? super T> interfaceC3281d) {
        if (j10 <= 0) {
            throw new C1032d3("Timed out immediately");
        }
        Object m4318b = m4318b(new RunnableC1037e3(j10, interfaceC3281d), interfaceC4584p);
        if (m4318b == C3385c.m12581c()) {
            C3474h.m12927c(interfaceC3281d);
        }
        return m4318b;
    }
}
