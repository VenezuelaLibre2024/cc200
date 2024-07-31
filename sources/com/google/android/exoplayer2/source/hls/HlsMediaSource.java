package com.google.android.exoplayer2.source.hls;

import android.os.Looper;
import java.util.List;
import p007a5.C0047a;
import p007a5.C0049c;
import p007a5.C0051e;
import p007a5.C0053g;
import p007a5.C0054h;
import p007a5.InterfaceC0057k;
import p007a5.InterfaceC0058l;
import p206o5.C3927v;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4448j1;
import p264s3.C4503u1;
import p276t4.C4691c;
import p290u4.AbstractC4844a;
import p290u4.C4860i;
import p290u4.C4875p0;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4858h;
import p290u4.InterfaceC4878r;
import p290u4.InterfaceC4882t;
import p317w3.C5245l;
import p317w3.InterfaceC5256v;
import p317w3.InterfaceC5258x;
import p365z4.C5972c;
import p365z4.C5978i;
import p365z4.C5981l;
import p365z4.InterfaceC5976g;
import p365z4.InterfaceC5977h;

/* loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC4844a implements InterfaceC0058l.e {

    /* renamed from: A */
    public C4503u1.g f4297A;

    /* renamed from: B */
    public InterfaceC3917m0 f4298B;

    /* renamed from: o */
    public final InterfaceC5977h f4299o;

    /* renamed from: p */
    public final C4503u1.h f4300p;

    /* renamed from: q */
    public final InterfaceC5976g f4301q;

    /* renamed from: r */
    public final InterfaceC4858h f4302r;

    /* renamed from: s */
    public final InterfaceC5256v f4303s;

    /* renamed from: t */
    public final InterfaceC3899d0 f4304t;

    /* renamed from: u */
    public final boolean f4305u;

    /* renamed from: v */
    public final int f4306v;

    /* renamed from: w */
    public final boolean f4307w;

    /* renamed from: x */
    public final InterfaceC0058l f4308x;

    /* renamed from: y */
    public final long f4309y;

    /* renamed from: z */
    public final C4503u1 f4310z;

    /* loaded from: classes.dex */
    public static final class Factory implements InterfaceC4882t.a {

        /* renamed from: a */
        public final InterfaceC5976g f4311a;

        /* renamed from: b */
        public InterfaceC5977h f4312b;

        /* renamed from: c */
        public InterfaceC0057k f4313c;

        /* renamed from: d */
        public InterfaceC0058l.a f4314d;

        /* renamed from: e */
        public InterfaceC4858h f4315e;

        /* renamed from: f */
        public InterfaceC5258x f4316f;

        /* renamed from: g */
        public InterfaceC3899d0 f4317g;

        /* renamed from: h */
        public boolean f4318h;

        /* renamed from: i */
        public int f4319i;

        /* renamed from: j */
        public boolean f4320j;

        /* renamed from: k */
        public long f4321k;

        public Factory(InterfaceC3910j.a aVar) {
            this(new C5972c(aVar));
        }

        public Factory(InterfaceC5976g interfaceC5976g) {
            this.f4311a = (InterfaceC5976g) C4014a.m15199e(interfaceC5976g);
            this.f4316f = new C5245l();
            this.f4313c = new C0047a();
            this.f4314d = C0049c.f95w;
            this.f4312b = InterfaceC5977h.f22219a;
            this.f4317g = new C3927v();
            this.f4315e = new C4860i();
            this.f4319i = 1;
            this.f4321k = -9223372036854775807L;
            this.f4318h = true;
        }

        /* renamed from: a */
        public HlsMediaSource m4871a(C4503u1 c4503u1) {
            C4014a.m15199e(c4503u1.f16712i);
            InterfaceC0057k interfaceC0057k = this.f4313c;
            List<C4691c> list = c4503u1.f16712i.f16790e;
            if (!list.isEmpty()) {
                interfaceC0057k = new C0051e(interfaceC0057k, list);
            }
            InterfaceC5976g interfaceC5976g = this.f4311a;
            InterfaceC5977h interfaceC5977h = this.f4312b;
            InterfaceC4858h interfaceC4858h = this.f4315e;
            InterfaceC5256v mo21251a = this.f4316f.mo21251a(c4503u1);
            InterfaceC3899d0 interfaceC3899d0 = this.f4317g;
            return new HlsMediaSource(c4503u1, interfaceC5976g, interfaceC5977h, interfaceC4858h, mo21251a, interfaceC3899d0, this.f4314d.mo179a(this.f4311a, interfaceC3899d0, interfaceC0057k), this.f4321k, this.f4318h, this.f4319i, this.f4320j);
        }
    }

    static {
        C4448j1.m17365a("goog.exo.hls");
    }

    public HlsMediaSource(C4503u1 c4503u1, InterfaceC5976g interfaceC5976g, InterfaceC5977h interfaceC5977h, InterfaceC4858h interfaceC4858h, InterfaceC5256v interfaceC5256v, InterfaceC3899d0 interfaceC3899d0, InterfaceC0058l interfaceC0058l, long j10, boolean z10, int i10, boolean z11) {
        this.f4300p = (C4503u1.h) C4014a.m15199e(c4503u1.f16712i);
        this.f4310z = c4503u1;
        this.f4297A = c4503u1.f16714k;
        this.f4301q = interfaceC5976g;
        this.f4299o = interfaceC5977h;
        this.f4302r = interfaceC4858h;
        this.f4303s = interfaceC5256v;
        this.f4304t = interfaceC3899d0;
        this.f4308x = interfaceC0058l;
        this.f4309y = j10;
        this.f4305u = z10;
        this.f4306v = i10;
        this.f4307w = z11;
    }

    public /* synthetic */ HlsMediaSource(C4503u1 c4503u1, InterfaceC5976g interfaceC5976g, InterfaceC5977h interfaceC5977h, InterfaceC4858h interfaceC4858h, InterfaceC5256v interfaceC5256v, InterfaceC3899d0 interfaceC3899d0, InterfaceC0058l interfaceC0058l, long j10, boolean z10, int i10, boolean z11, C1154a c1154a) {
        this(c4503u1, interfaceC5976g, interfaceC5977h, interfaceC4858h, interfaceC5256v, interfaceC3899d0, interfaceC0058l, j10, z10, i10, z11);
    }

    /* renamed from: H */
    public static C0053g.b m4863H(List<C0053g.b> list, long j10) {
        C0053g.b bVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            C0053g.b bVar2 = list.get(i10);
            long j11 = bVar2.f157l;
            if (j11 > j10 || !bVar2.f146s) {
                if (j11 > j10) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    /* renamed from: I */
    public static C0053g.d m4864I(List<C0053g.d> list, long j10) {
        return list.get(C4041n0.m15455f(list, Long.valueOf(j10), true, true));
    }

    /* renamed from: L */
    public static long m4865L(C0053g c0053g, long j10) {
        long j11;
        C0053g.f fVar = c0053g.f145v;
        long j12 = c0053g.f128e;
        if (j12 != -9223372036854775807L) {
            j11 = c0053g.f144u - j12;
        } else {
            long j13 = fVar.f167d;
            if (j13 == -9223372036854775807L || c0053g.f137n == -9223372036854775807L) {
                long j14 = fVar.f166c;
                j11 = j14 != -9223372036854775807L ? j14 : c0053g.f136m * 3;
            } else {
                j11 = j13;
            }
        }
        return j11 + j10;
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: C */
    public void mo4714C(InterfaceC3917m0 interfaceC3917m0) {
        this.f4298B = interfaceC3917m0;
        this.f4303s.mo21231d((Looper) C4014a.m15199e(Looper.myLooper()), m19189A());
        this.f4303s.mo21228a();
        this.f4308x.mo220l(this.f4300p.f16786a, m19203w(null), this);
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: E */
    public void mo4715E() {
        this.f4308x.stop();
        this.f4303s.release();
    }

    /* renamed from: F */
    public final C4875p0 m4866F(C0053g c0053g, long j10, long j11, C5978i c5978i) {
        long mo212d = c0053g.f131h - this.f4308x.mo212d();
        long j12 = c0053g.f138o ? mo212d + c0053g.f144u : -9223372036854775807L;
        long m4868J = m4868J(c0053g);
        long j13 = this.f4297A.f16776h;
        m4870M(c0053g, C4041n0.m15479r(j13 != -9223372036854775807L ? C4041n0.m15396B0(j13) : m4865L(c0053g, m4868J), m4868J, c0053g.f144u + m4868J));
        return new C4875p0(j10, j11, -9223372036854775807L, j12, c0053g.f144u, mo212d, m4869K(c0053g, m4868J), true, !c0053g.f138o, c0053g.f127d == 2 && c0053g.f129f, c5978i, this.f4310z, this.f4297A);
    }

    /* renamed from: G */
    public final C4875p0 m4867G(C0053g c0053g, long j10, long j11, C5978i c5978i) {
        long j12;
        if (c0053g.f128e == -9223372036854775807L || c0053g.f141r.isEmpty()) {
            j12 = 0;
        } else {
            if (!c0053g.f130g) {
                long j13 = c0053g.f128e;
                if (j13 != c0053g.f144u) {
                    j12 = m4864I(c0053g.f141r, j13).f157l;
                }
            }
            j12 = c0053g.f128e;
        }
        long j14 = c0053g.f144u;
        return new C4875p0(j10, j11, -9223372036854775807L, j14, j14, 0L, j12, true, false, true, c5978i, this.f4310z, null);
    }

    /* renamed from: J */
    public final long m4868J(C0053g c0053g) {
        if (c0053g.f139p) {
            return C4041n0.m15396B0(C4041n0.m15446a0(this.f4309y)) - c0053g.m251e();
        }
        return 0L;
    }

    /* renamed from: K */
    public final long m4869K(C0053g c0053g, long j10) {
        long j11 = c0053g.f128e;
        if (j11 == -9223372036854775807L) {
            j11 = (c0053g.f144u + j10) - C4041n0.m15396B0(this.f4297A.f16776h);
        }
        if (c0053g.f130g) {
            return j11;
        }
        C0053g.b m4863H = m4863H(c0053g.f142s, j11);
        if (m4863H != null) {
            return m4863H.f157l;
        }
        if (c0053g.f141r.isEmpty()) {
            return 0L;
        }
        C0053g.d m4864I = m4864I(c0053g.f141r, j11);
        C0053g.b m4863H2 = m4863H(m4864I.f152t, j11);
        return m4863H2 != null ? m4863H2.f157l : m4864I.f157l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4870M(p007a5.C0053g r5, long r6) {
        /*
            r4 = this;
            s3.u1 r0 = r4.f4310z
            s3.u1$g r0 = r0.f16714k
            float r1 = r0.f16779k
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L28
            float r0 = r0.f16780l
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            a5.g$f r5 = r5.f145v
            long r0 = r5.f166c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L28
            long r0 = r5.f167d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L28
            r5 = 1
            goto L29
        L28:
            r5 = 0
        L29:
            s3.u1$g$a r0 = new s3.u1$g$a
            r0.<init>()
            long r6 = p222p5.C4041n0.m15442Y0(r6)
            s3.u1$g$a r6 = r0.m17647k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3c
            r0 = r7
            goto L40
        L3c:
            s3.u1$g r0 = r4.f4297A
            float r0 = r0.f16779k
        L40:
            s3.u1$g$a r6 = r6.m17646j(r0)
            if (r5 == 0) goto L47
            goto L4b
        L47:
            s3.u1$g r5 = r4.f4297A
            float r7 = r5.f16780l
        L4b:
            s3.u1$g$a r5 = r6.m17644h(r7)
            s3.u1$g r5 = r5.m17642f()
            r4.f4297A = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.m4870M(a5.g, long):void");
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: a */
    public void mo4725a(InterfaceC4878r interfaceC4878r) {
        ((C5981l) interfaceC4878r).m23989A();
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: b */
    public InterfaceC4878r mo4727b(InterfaceC4882t.b bVar, InterfaceC3894b interfaceC3894b, long j10) {
        InterfaceC4845a0.a m19203w = m19203w(bVar);
        return new C5981l(this.f4299o, this.f4308x, this.f4301q, this.f4298B, this.f4303s, m19201u(bVar), this.f4304t, m19203w, interfaceC3894b, this.f4302r, this.f4305u, this.f4306v, this.f4307w, m19189A());
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: g */
    public C4503u1 mo4733g() {
        return this.f4310z;
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: h */
    public void mo4735h() {
        this.f4308x.mo217i();
    }

    @Override // p007a5.InterfaceC0058l.e
    /* renamed from: p */
    public void mo294p(C0053g c0053g) {
        long m15442Y0 = c0053g.f139p ? C4041n0.m15442Y0(c0053g.f131h) : -9223372036854775807L;
        int i10 = c0053g.f127d;
        long j10 = (i10 == 2 || i10 == 1) ? m15442Y0 : -9223372036854775807L;
        C5978i c5978i = new C5978i((C0054h) C4014a.m15199e(this.f4308x.mo214f()), c0053g);
        m19191D(this.f4308x.mo213e() ? m4866F(c0053g, j10, m15442Y0, c5978i) : m4867G(c0053g, j10, m15442Y0, c5978i));
    }
}
