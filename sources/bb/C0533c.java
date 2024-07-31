package bb;

import p129ia.C2678j;
import p129ia.C2684p;
import p211oa.C3965b;

/* renamed from: bb.c */
/* loaded from: classes.dex */
public final class C0533c {

    /* renamed from: a */
    public final C3965b f2371a;

    /* renamed from: b */
    public final C2684p f2372b;

    /* renamed from: c */
    public final C2684p f2373c;

    /* renamed from: d */
    public final C2684p f2374d;

    /* renamed from: e */
    public final C2684p f2375e;

    /* renamed from: f */
    public final int f2376f;

    /* renamed from: g */
    public final int f2377g;

    /* renamed from: h */
    public final int f2378h;

    /* renamed from: i */
    public final int f2379i;

    public C0533c(C0533c c0533c) {
        this.f2371a = c0533c.f2371a;
        this.f2372b = c0533c.f2372b;
        this.f2373c = c0533c.f2373c;
        this.f2374d = c0533c.f2374d;
        this.f2375e = c0533c.f2375e;
        this.f2376f = c0533c.f2376f;
        this.f2377g = c0533c.f2377g;
        this.f2378h = c0533c.f2378h;
        this.f2379i = c0533c.f2379i;
    }

    public C0533c(C3965b c3965b, C2684p c2684p, C2684p c2684p2, C2684p c2684p3, C2684p c2684p4) {
        boolean z10 = c2684p == null || c2684p2 == null;
        boolean z11 = c2684p3 == null || c2684p4 == null;
        if (z10 && z11) {
            throw C2678j.m10895a();
        }
        if (z10) {
            c2684p = new C2684p(0.0f, c2684p3.m10909d());
            c2684p2 = new C2684p(0.0f, c2684p4.m10909d());
        } else if (z11) {
            c2684p3 = new C2684p(c3965b.m15041n() - 1, c2684p.m10909d());
            c2684p4 = new C2684p(c3965b.m15041n() - 1, c2684p2.m10909d());
        }
        this.f2371a = c3965b;
        this.f2372b = c2684p;
        this.f2373c = c2684p2;
        this.f2374d = c2684p3;
        this.f2375e = c2684p4;
        this.f2376f = (int) Math.min(c2684p.m10908c(), c2684p2.m10908c());
        this.f2377g = (int) Math.max(c2684p3.m10908c(), c2684p4.m10908c());
        this.f2378h = (int) Math.min(c2684p.m10909d(), c2684p3.m10909d());
        this.f2379i = (int) Math.max(c2684p2.m10909d(), c2684p4.m10909d());
    }

    /* renamed from: j */
    public static C0533c m2572j(C0533c c0533c, C0533c c0533c2) {
        return c0533c == null ? c0533c2 : c0533c2 == null ? c0533c : new C0533c(c0533c.f2371a, c0533c.f2372b, c0533c.f2373c, c0533c2.f2374d, c0533c2.f2375e);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bb.C0533c m2573a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            ia.p r0 = r12.f2372b
            ia.p r1 = r12.f2373c
            ia.p r2 = r12.f2374d
            ia.p r3 = r12.f2375e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.m10909d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            ia.p r13 = new ia.p
            float r4 = r4.m10908c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            ia.p r13 = r12.f2373c
            goto L34
        L32:
            ia.p r13 = r12.f2375e
        L34:
            float r0 = r13.m10909d()
            int r0 = (int) r0
            int r0 = r0 + r14
            oa.b r14 = r12.f2371a
            int r14 = r14.m15038k()
            if (r0 < r14) goto L4a
            oa.b r14 = r12.f2371a
            int r14 = r14.m15038k()
            int r0 = r14 + (-1)
        L4a:
            ia.p r14 = new ia.p
            float r13 = r13.m10908c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            bb.c r13 = new bb.c
            oa.b r7 = r12.f2371a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: bb.C0533c.m2573a(int, int, boolean):bb.c");
    }

    /* renamed from: b */
    public C2684p m2574b() {
        return this.f2373c;
    }

    /* renamed from: c */
    public C2684p m2575c() {
        return this.f2375e;
    }

    /* renamed from: d */
    public int m2576d() {
        return this.f2377g;
    }

    /* renamed from: e */
    public int m2577e() {
        return this.f2379i;
    }

    /* renamed from: f */
    public int m2578f() {
        return this.f2376f;
    }

    /* renamed from: g */
    public int m2579g() {
        return this.f2378h;
    }

    /* renamed from: h */
    public C2684p m2580h() {
        return this.f2372b;
    }

    /* renamed from: i */
    public C2684p m2581i() {
        return this.f2374d;
    }
}
