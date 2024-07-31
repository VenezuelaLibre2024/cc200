package p290u4;

import p062e4.C1655f;
import p222p5.C4014a;
import p333x3.C5585y;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5576p;

/* renamed from: u4.c */
/* loaded from: classes.dex */
public final class C4848c implements InterfaceC4847b0 {

    /* renamed from: a */
    public final InterfaceC5576p f18219a;

    /* renamed from: b */
    public InterfaceC5571k f18220b;

    /* renamed from: c */
    public InterfaceC5572l f18221c;

    public C4848c(InterfaceC5576p interfaceC5576p) {
        this.f18219a = interfaceC5576p;
    }

    @Override // p290u4.InterfaceC4847b0
    /* renamed from: c */
    public void mo19239c(long j10, long j11) {
        ((InterfaceC5571k) C4014a.m15199e(this.f18220b)).mo165c(j10, j11);
    }

    @Override // p290u4.InterfaceC4847b0
    /* renamed from: d */
    public int mo19240d(C5585y c5585y) {
        return ((InterfaceC5571k) C4014a.m15199e(this.f18220b)).mo169g((InterfaceC5572l) C4014a.m15199e(this.f18221c), c5585y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003f, code lost:
    
        if (r6.getPosition() != r11) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
    
        if (r6.getPosition() != r11) goto L33;
     */
    @Override // p290u4.InterfaceC4847b0
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo19241e(p206o5.InterfaceC3906h r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, p333x3.InterfaceC5573m r15) {
        /*
            r7 = this;
            x3.e r6 = new x3.e
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f18221c = r6
            x3.k r8 = r7.f18220b
            if (r8 == 0) goto L10
            return
        L10:
            x3.p r8 = r7.f18219a
            x3.k[] r8 = r8.mo22456c(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f18220b = r8
            goto L74
        L20:
            int r10 = r8.length
            r0 = r13
        L22:
            if (r0 >= r10) goto L70
            r1 = r8[r0]
            boolean r2 = r1.mo170h(r6)     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            if (r2 == 0) goto L35
            r7.f18220b = r1     // Catch: java.lang.Throwable -> L42 java.io.EOFException -> L57
            p222p5.C4014a.m15200f(r14)
            r6.mo22427l()
            goto L70
        L35:
            x3.k r1 = r7.f18220b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L42:
            r8 = move-exception
            x3.k r9 = r7.f18220b
            if (r9 != 0) goto L4f
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L50
        L4f:
            r13 = r14
        L50:
            p222p5.C4014a.m15200f(r13)
            r6.mo22427l()
            throw r8
        L57:
            x3.k r1 = r7.f18220b
            if (r1 != 0) goto L66
            long r1 = r6.getPosition()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L64
            goto L66
        L64:
            r1 = r13
            goto L67
        L66:
            r1 = r14
        L67:
            p222p5.C4014a.m15200f(r1)
            r6.mo22427l()
            int r0 = r0 + 1
            goto L22
        L70:
            x3.k r10 = r7.f18220b
            if (r10 == 0) goto L7a
        L74:
            x3.k r8 = r7.f18220b
            r8.mo164b(r15)
            return
        L7a:
            u4.v0 r10 = new u4.v0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = p222p5.C4041n0.m15417M(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = p222p5.C4014a.m15199e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p290u4.C4848c.mo19241e(o5.h, android.net.Uri, java.util.Map, long, long, x3.m):void");
    }

    @Override // p290u4.InterfaceC4847b0
    /* renamed from: f */
    public long mo19242f() {
        InterfaceC5572l interfaceC5572l = this.f18221c;
        if (interfaceC5572l != null) {
            return interfaceC5572l.getPosition();
        }
        return -1L;
    }

    @Override // p290u4.InterfaceC4847b0
    /* renamed from: g */
    public void mo19243g() {
        InterfaceC5571k interfaceC5571k = this.f18220b;
        if (interfaceC5571k instanceof C1655f) {
            ((C1655f) interfaceC5571k).m6569j();
        }
    }

    @Override // p290u4.InterfaceC4847b0
    public void release() {
        InterfaceC5571k interfaceC5571k = this.f18220b;
        if (interfaceC5571k != null) {
            interfaceC5571k.release();
            this.f18220b = null;
        }
        this.f18221c = null;
    }
}
