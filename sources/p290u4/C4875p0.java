package p290u4;

import android.net.Uri;
import p222p5.C4014a;
import p264s3.AbstractC4505u3;
import p264s3.C4503u1;

/* renamed from: u4.p0 */
/* loaded from: classes.dex */
public final class C4875p0 extends AbstractC4505u3 {

    /* renamed from: m */
    public final long f18433m;

    /* renamed from: n */
    public final long f18434n;

    /* renamed from: o */
    public final long f18435o;

    /* renamed from: p */
    public final long f18436p;

    /* renamed from: q */
    public final long f18437q;

    /* renamed from: r */
    public final long f18438r;

    /* renamed from: s */
    public final long f18439s;

    /* renamed from: t */
    public final boolean f18440t;

    /* renamed from: u */
    public final boolean f18441u;

    /* renamed from: v */
    public final boolean f18442v;

    /* renamed from: w */
    public final Object f18443w;

    /* renamed from: x */
    public final C4503u1 f18444x;

    /* renamed from: y */
    public final C4503u1.g f18445y;

    /* renamed from: z */
    public static final Object f18432z = new Object();

    /* renamed from: A */
    public static final C4503u1 f18431A = new C4503u1.c().m17604c("SinglePeriodTimeline").m17606e(Uri.EMPTY).m17602a();

    public C4875p0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, C4503u1 c4503u1, C4503u1.g gVar) {
        this.f18433m = j10;
        this.f18434n = j11;
        this.f18435o = j12;
        this.f18436p = j13;
        this.f18437q = j14;
        this.f18438r = j15;
        this.f18439s = j16;
        this.f18440t = z10;
        this.f18441u = z11;
        this.f18442v = z12;
        this.f18443w = obj;
        this.f18444x = (C4503u1) C4014a.m15199e(c4503u1);
        this.f18445y = gVar;
    }

    public C4875p0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, C4503u1 c4503u1) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, false, obj, c4503u1, z12 ? c4503u1.f16714k : null);
    }

    public C4875p0(long j10, boolean z10, boolean z11, boolean z12, Object obj, C4503u1 c4503u1) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, c4503u1);
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: f */
    public int mo4743f(Object obj) {
        return f18432z.equals(obj) ? 0 : -1;
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: k */
    public AbstractC4505u3.b mo4744k(int i10, AbstractC4505u3.b bVar, boolean z10) {
        C4014a.m15197c(i10, 0, 1);
        return bVar.m17698u(null, z10 ? f18432z : null, 0, this.f18436p, -this.f18438r);
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: m */
    public int mo4745m() {
        return 1;
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: q */
    public Object mo4746q(int i10) {
        C4014a.m15197c(i10, 0, 1);
        return f18432z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r1 > r5) goto L10;
     */
    @Override // p264s3.AbstractC4505u3
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p264s3.AbstractC4505u3.d mo4747s(int r25, p264s3.AbstractC4505u3.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p222p5.C4014a.m15197c(r3, r1, r2)
            long r1 = r0.f18439s
            boolean r14 = r0.f18441u
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L2e
            boolean r5 = r0.f18442v
            if (r5 != 0) goto L2e
            r5 = 0
            int r5 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r5 = r0.f18437q
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r3
            goto L30
        L27:
            long r1 = r1 + r27
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = p264s3.AbstractC4505u3.d.f16858y
            s3.u1 r5 = r0.f18444x
            java.lang.Object r6 = r0.f18443w
            long r7 = r0.f18433m
            long r9 = r0.f18434n
            long r11 = r0.f18435o
            boolean r13 = r0.f18440t
            s3.u1$g r15 = r0.f18445y
            long r1 = r0.f18437q
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f18438r
            r22 = r1
            r3 = r26
            s3.u3$d r1 = r3.m17707h(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p290u4.C4875p0.mo4747s(int, s3.u3$d, long):s3.u3$d");
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: t */
    public int mo4748t() {
        return 1;
    }
}
