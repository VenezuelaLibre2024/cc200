package p143ja;

import p129ia.C2671c;
import p129ia.C2682n;
import p129ia.InterfaceC2680l;

/* renamed from: ja.b */
/* loaded from: classes.dex */
public final class C3273b implements InterfaceC2680l {
    @Override // p129ia.InterfaceC2680l
    /* renamed from: a */
    public C2682n mo363a(C2671c c2671c) {
        return mo364b(c2671c, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[LOOP:0: B:25:0x005c->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // p129ia.InterfaceC2680l
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p129ia.C2682n mo364b(p129ia.C2671c r11, java.util.Map<p129ia.EnumC2673e, ?> r12) {
        /*
            r10 = this;
            la.a r0 = new la.a
            oa.b r11 = r11.m10875a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            ja.a r2 = r0.m12877a(r11)     // Catch: p129ia.C2674f -> L25 p129ia.C2678j -> L2b
            ia.p[] r3 = r2.m15071b()     // Catch: p129ia.C2674f -> L25 p129ia.C2678j -> L2b
            ka.a r4 = new ka.a     // Catch: p129ia.C2674f -> L21 p129ia.C2678j -> L23
            r4.<init>()     // Catch: p129ia.C2674f -> L21 p129ia.C2678j -> L23
            oa.e r2 = r4.m12572c(r2)     // Catch: p129ia.C2674f -> L21 p129ia.C2678j -> L23
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L2f
        L21:
            r2 = move-exception
            goto L27
        L23:
            r2 = move-exception
            goto L2d
        L25:
            r2 = move-exception
            r3 = r1
        L27:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L2f
        L2b:
            r2 = move-exception
            r3 = r1
        L2d:
            r4 = r3
            r3 = r1
        L2f:
            if (r1 != 0) goto L4e
            r1 = 1
            ja.a r0 = r0.m12877a(r1)     // Catch: p129ia.C2674f -> L44 p129ia.C2678j -> L46
            ia.p[] r4 = r0.m15071b()     // Catch: p129ia.C2674f -> L44 p129ia.C2678j -> L46
            ka.a r1 = new ka.a     // Catch: p129ia.C2674f -> L44 p129ia.C2678j -> L46
            r1.<init>()     // Catch: p129ia.C2674f -> L44 p129ia.C2678j -> L46
            oa.e r1 = r1.m12572c(r0)     // Catch: p129ia.C2674f -> L44 p129ia.C2678j -> L46
            goto L4e
        L44:
            r11 = move-exception
            goto L47
        L46:
            r11 = move-exception
        L47:
            if (r2 != 0) goto L4d
            if (r3 == 0) goto L4c
            throw r3
        L4c:
            throw r11
        L4d:
            throw r2
        L4e:
            r6 = r4
            if (r12 == 0) goto L66
            ia.e r0 = p129ia.EnumC2673e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            ia.q r12 = (p129ia.InterfaceC2685q) r12
            if (r12 == 0) goto L66
            int r0 = r6.length
        L5c:
            if (r11 >= r0) goto L66
            r2 = r6[r11]
            r12.mo9828a(r2)
            int r11 = r11 + 1
            goto L5c
        L66:
            ia.n r11 = new ia.n
            java.lang.String r3 = r1.m15062i()
            byte[] r4 = r1.m15058e()
            int r5 = r1.m15056c()
            ia.a r7 = p129ia.EnumC2669a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.m15054a()
            if (r12 == 0) goto L89
            ia.o r0 = p129ia.EnumC2683o.BYTE_SEGMENTS
            r11.m10904h(r0, r12)
        L89:
            java.lang.String r12 = r1.m15055b()
            if (r12 == 0) goto L94
            ia.o r0 = p129ia.EnumC2683o.ERROR_CORRECTION_LEVEL
            r11.m10904h(r0, r12)
        L94:
            ia.o r12 = p129ia.EnumC2683o.SYMBOLOGY_IDENTIFIER
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "]z"
            r0.append(r2)
            int r1 = r1.m15061h()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11.m10904h(r12, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p143ja.C3273b.mo364b(ia.c, java.util.Map):ia.n");
    }

    @Override // p129ia.InterfaceC2680l
    public void reset() {
    }
}
