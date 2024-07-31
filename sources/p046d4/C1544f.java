package p046d4;

import p222p5.C4015a0;
import p333x3.InterfaceC5572l;

/* renamed from: d4.f */
/* loaded from: classes.dex */
public final class C1544f {

    /* renamed from: a */
    public final C4015a0 f5755a = new C4015a0(8);

    /* renamed from: b */
    public int f5756b;

    /* renamed from: a */
    public final long m6307a(InterfaceC5572l interfaceC5572l) {
        int i10 = 0;
        interfaceC5572l.mo22430p(this.f5755a.m15230e(), 0, 1);
        int i11 = this.f5755a.m15230e()[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        interfaceC5572l.mo22430p(this.f5755a.m15230e(), 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (this.f5755a.m15230e()[i10] & 255) + (i14 << 8);
        }
        this.f5756b += i13 + 1;
        return i14;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        return false;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m6308b(p333x3.InterfaceC5572l r14) {
        /*
            r13 = this;
            long r0 = r14.mo3029b()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1024(0x400, double:5.06E-321)
            if (r2 == 0) goto L12
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L11
            goto L12
        L11:
            r3 = r0
        L12:
            int r3 = (int) r3
            p5.a0 r4 = r13.f5755a
            byte[] r4 = r4.m15230e()
            r5 = 0
            r6 = 4
            r14.mo22430p(r4, r5, r6)
            p5.a0 r4 = r13.f5755a
            long r7 = r4.m15212I()
            r13.f5756b = r6
        L26:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r6 = 1
            if (r4 == 0) goto L54
            int r4 = r13.f5756b
            int r4 = r4 + r6
            r13.f5756b = r4
            if (r4 != r3) goto L36
            return r5
        L36:
            p5.a0 r4 = r13.f5755a
            byte[] r4 = r4.m15230e()
            r14.mo22430p(r4, r5, r6)
            r4 = 8
            long r6 = r7 << r4
            r8 = -256(0xffffffffffffff00, double:NaN)
            long r6 = r6 & r8
            p5.a0 r4 = r13.f5755a
            byte[] r4 = r4.m15230e()
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r8 = (long) r4
            long r7 = r6 | r8
            goto L26
        L54:
            long r3 = r13.m6307a(r14)
            int r7 = r13.f5756b
            long r7 = (long) r7
            r9 = -9223372036854775808
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto La1
            if (r2 == 0) goto L6a
            long r11 = r7 + r3
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            goto La1
        L6a:
            int r0 = r13.f5756b
            long r1 = (long) r0
            long r11 = r7 + r3
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 >= 0) goto L9b
            long r0 = r13.m6307a(r14)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L7c
            return r5
        L7c:
            long r0 = r13.m6307a(r14)
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L9a
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L8e
            goto L9a
        L8e:
            if (r2 == 0) goto L6a
            int r0 = (int) r0
            r14.mo22425h(r0)
            int r1 = r13.f5756b
            int r1 = r1 + r0
            r13.f5756b = r1
            goto L6a
        L9a:
            return r5
        L9b:
            long r0 = (long) r0
            int r14 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r14 != 0) goto La1
            r5 = r6
        La1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p046d4.C1544f.m6308b(x3.l):boolean");
    }
}
