package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.smoothstreaming.C1156a;
import com.google.android.exoplayer2.source.smoothstreaming.InterfaceC1157b;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p032c5.C0613a;
import p032c5.C0614b;
import p206o5.C3901e0;
import p206o5.C3905g0;
import p206o5.C3927v;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3899d0;
import p206o5.InterfaceC3903f0;
import p206o5.InterfaceC3910j;
import p206o5.InterfaceC3917m0;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4448j1;
import p264s3.C4503u1;
import p276t4.C4690b;
import p276t4.C4691c;
import p290u4.AbstractC4844a;
import p290u4.C4860i;
import p290u4.C4870n;
import p290u4.C4875p0;
import p290u4.C4876q;
import p290u4.InterfaceC4845a0;
import p290u4.InterfaceC4858h;
import p290u4.InterfaceC4878r;
import p290u4.InterfaceC4882t;
import p317w3.C5245l;
import p317w3.InterfaceC5256v;
import p317w3.InterfaceC5258x;

/* loaded from: classes.dex */
public final class SsMediaSource extends AbstractC4844a implements C3901e0.b<C3905g0<C0613a>> {

    /* renamed from: A */
    public final ArrayList<C1158c> f4322A;

    /* renamed from: B */
    public InterfaceC3910j f4323B;

    /* renamed from: C */
    public C3901e0 f4324C;

    /* renamed from: D */
    public InterfaceC3903f0 f4325D;

    /* renamed from: E */
    public InterfaceC3917m0 f4326E;

    /* renamed from: F */
    public long f4327F;

    /* renamed from: G */
    public C0613a f4328G;

    /* renamed from: H */
    public Handler f4329H;

    /* renamed from: o */
    public final boolean f4330o;

    /* renamed from: p */
    public final Uri f4331p;

    /* renamed from: q */
    public final C4503u1.h f4332q;

    /* renamed from: r */
    public final C4503u1 f4333r;

    /* renamed from: s */
    public final InterfaceC3910j.a f4334s;

    /* renamed from: t */
    public final InterfaceC1157b.a f4335t;

    /* renamed from: u */
    public final InterfaceC4858h f4336u;

    /* renamed from: v */
    public final InterfaceC5256v f4337v;

    /* renamed from: w */
    public final InterfaceC3899d0 f4338w;

    /* renamed from: x */
    public final long f4339x;

    /* renamed from: y */
    public final InterfaceC4845a0.a f4340y;

    /* renamed from: z */
    public final C3905g0.a<? extends C0613a> f4341z;

    /* loaded from: classes.dex */
    public static final class Factory implements InterfaceC4882t.a {

        /* renamed from: a */
        public final InterfaceC1157b.a f4342a;

        /* renamed from: b */
        public final InterfaceC3910j.a f4343b;

        /* renamed from: c */
        public InterfaceC4858h f4344c;

        /* renamed from: d */
        public InterfaceC5258x f4345d;

        /* renamed from: e */
        public InterfaceC3899d0 f4346e;

        /* renamed from: f */
        public long f4347f;

        /* renamed from: g */
        public C3905g0.a<? extends C0613a> f4348g;

        public Factory(InterfaceC1157b.a aVar, InterfaceC3910j.a aVar2) {
            this.f4342a = (InterfaceC1157b.a) C4014a.m15199e(aVar);
            this.f4343b = aVar2;
            this.f4345d = new C5245l();
            this.f4346e = new C3927v();
            this.f4347f = 30000L;
            this.f4344c = new C4860i();
        }

        public Factory(InterfaceC3910j.a aVar) {
            this(new C1156a.a(aVar), aVar);
        }

        /* renamed from: a */
        public SsMediaSource m4879a(C4503u1 c4503u1) {
            C4014a.m15199e(c4503u1.f16712i);
            C3905g0.a aVar = this.f4348g;
            if (aVar == null) {
                aVar = new C0614b();
            }
            List<C4691c> list = c4503u1.f16712i.f16790e;
            return new SsMediaSource(c4503u1, null, this.f4343b, !list.isEmpty() ? new C4690b(aVar, list) : aVar, this.f4342a, this.f4344c, this.f4345d.mo21251a(c4503u1), this.f4346e, this.f4347f);
        }
    }

    static {
        C4448j1.m17365a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(C4503u1 c4503u1, C0613a c0613a, InterfaceC3910j.a aVar, C3905g0.a<? extends C0613a> aVar2, InterfaceC1157b.a aVar3, InterfaceC4858h interfaceC4858h, InterfaceC5256v interfaceC5256v, InterfaceC3899d0 interfaceC3899d0, long j10) {
        C4014a.m15200f(c0613a == null || !c0613a.f2679d);
        this.f4333r = c4503u1;
        C4503u1.h hVar = (C4503u1.h) C4014a.m15199e(c4503u1.f16712i);
        this.f4332q = hVar;
        this.f4328G = c0613a;
        this.f4331p = hVar.f16786a.equals(Uri.EMPTY) ? null : C4041n0.m15395B(hVar.f16786a);
        this.f4334s = aVar;
        this.f4341z = aVar2;
        this.f4335t = aVar3;
        this.f4336u = interfaceC4858h;
        this.f4337v = interfaceC5256v;
        this.f4338w = interfaceC3899d0;
        this.f4339x = j10;
        this.f4340y = m19203w(null);
        this.f4330o = c0613a != null;
        this.f4322A = new ArrayList<>();
    }

    public /* synthetic */ SsMediaSource(C4503u1 c4503u1, C0613a c0613a, InterfaceC3910j.a aVar, C3905g0.a aVar2, InterfaceC1157b.a aVar3, InterfaceC4858h interfaceC4858h, InterfaceC5256v interfaceC5256v, InterfaceC3899d0 interfaceC3899d0, long j10, C1155a c1155a) {
        this(c4503u1, c0613a, aVar, aVar2, aVar3, interfaceC4858h, interfaceC5256v, interfaceC3899d0, j10);
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: C */
    public void mo4714C(InterfaceC3917m0 interfaceC3917m0) {
        this.f4326E = interfaceC3917m0;
        this.f4337v.mo21231d(Looper.myLooper(), m19189A());
        this.f4337v.mo21228a();
        if (this.f4330o) {
            this.f4325D = new InterfaceC3903f0.a();
            m4876J();
            return;
        }
        this.f4323B = this.f4334s.mo14830a();
        C3901e0 c3901e0 = new C3901e0("SsMediaSource");
        this.f4324C = c3901e0;
        this.f4325D = c3901e0;
        this.f4329H = C4041n0.m15489w();
        m4878L();
    }

    @Override // p290u4.AbstractC4844a
    /* renamed from: E */
    public void mo4715E() {
        this.f4328G = this.f4330o ? this.f4328G : null;
        this.f4323B = null;
        this.f4327F = 0L;
        C3901e0 c3901e0 = this.f4324C;
        if (c3901e0 != null) {
            c3901e0.m14805l();
            this.f4324C = null;
        }
        Handler handler = this.f4329H;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f4329H = null;
        }
        this.f4337v.release();
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: G */
    public void mo223r(C3905g0<C0613a> c3905g0, long j10, long j11, boolean z10) {
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        this.f4338w.m14776b(c3905g0.f14029a);
        this.f4340y.m19229q(c4870n, c3905g0.f14031c);
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: H */
    public void mo222o(C3905g0<C0613a> c3905g0, long j10, long j11) {
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        this.f4338w.m14776b(c3905g0.f14029a);
        this.f4340y.m19232t(c4870n, c3905g0.f14031c);
        this.f4328G = c3905g0.m14827e();
        this.f4327F = j10 - j11;
        m4876J();
        m4877K();
    }

    @Override // p206o5.C3901e0.b
    /* renamed from: I */
    public C3901e0.c mo219k(C3905g0<C0613a> c3905g0, long j10, long j11, IOException iOException, int i10) {
        C4870n c4870n = new C4870n(c3905g0.f14029a, c3905g0.f14030b, c3905g0.m14828f(), c3905g0.m14826d(), j10, j11, c3905g0.m14825a());
        long mo14775a = this.f4338w.mo14775a(new InterfaceC3899d0.c(c4870n, new C4876q(c3905g0.f14031c), iOException, i10));
        C3901e0.c m14799h = mo14775a == -9223372036854775807L ? C3901e0.f14002g : C3901e0.m14799h(false, mo14775a);
        boolean z10 = !m14799h.m14810c();
        this.f4340y.m19236x(c4870n, c3905g0.f14031c, iOException, z10);
        if (z10) {
            this.f4338w.m14776b(c3905g0.f14029a);
        }
        return m14799h;
    }

    /* renamed from: J */
    public final void m4876J() {
        C4875p0 c4875p0;
        for (int i10 = 0; i10 < this.f4322A.size(); i10++) {
            this.f4322A.get(i10).m4890v(this.f4328G);
        }
        long j10 = Long.MIN_VALUE;
        long j11 = Long.MAX_VALUE;
        for (C0613a.b bVar : this.f4328G.f2681f) {
            if (bVar.f2697k > 0) {
                j11 = Math.min(j11, bVar.m3049e(0));
                j10 = Math.max(j10, bVar.m3049e(bVar.f2697k - 1) + bVar.m3047c(bVar.f2697k - 1));
            }
        }
        if (j11 == Long.MAX_VALUE) {
            long j12 = this.f4328G.f2679d ? -9223372036854775807L : 0L;
            C0613a c0613a = this.f4328G;
            boolean z10 = c0613a.f2679d;
            c4875p0 = new C4875p0(j12, 0L, 0L, 0L, true, z10, z10, c0613a, this.f4333r);
        } else {
            C0613a c0613a2 = this.f4328G;
            if (c0613a2.f2679d) {
                long j13 = c0613a2.f2683h;
                if (j13 != -9223372036854775807L && j13 > 0) {
                    j11 = Math.max(j11, j10 - j13);
                }
                long j14 = j11;
                long j15 = j10 - j14;
                long m15396B0 = j15 - C4041n0.m15396B0(this.f4339x);
                if (m15396B0 < 5000000) {
                    m15396B0 = Math.min(5000000L, j15 / 2);
                }
                c4875p0 = new C4875p0(-9223372036854775807L, j15, j14, m15396B0, true, true, true, this.f4328G, this.f4333r);
            } else {
                long j16 = c0613a2.f2682g;
                long j17 = j16 != -9223372036854775807L ? j16 : j10 - j11;
                c4875p0 = new C4875p0(j11 + j17, j17, j11, 0L, true, false, false, this.f4328G, this.f4333r);
            }
        }
        m19191D(c4875p0);
    }

    /* renamed from: K */
    public final void m4877K() {
        if (this.f4328G.f2679d) {
            this.f4329H.postDelayed(new Runnable() { // from class: b5.a
                public /* synthetic */ RunnableC0480a() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.m4878L();
                }
            }, Math.max(0L, (this.f4327F + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: L */
    public final void m4878L() {
        if (this.f4324C.m14802i()) {
            return;
        }
        C3905g0 c3905g0 = new C3905g0(this.f4323B, this.f4331p, 4, this.f4341z);
        this.f4340y.m19238z(new C4870n(c3905g0.f14029a, c3905g0.f14030b, this.f4324C.m14807n(c3905g0, this, this.f4338w.mo14778d(c3905g0.f14031c))), c3905g0.f14031c);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: a */
    public void mo4725a(InterfaceC4878r interfaceC4878r) {
        ((C1158c) interfaceC4878r).m4889u();
        this.f4322A.remove(interfaceC4878r);
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: b */
    public InterfaceC4878r mo4727b(InterfaceC4882t.b bVar, InterfaceC3894b interfaceC3894b, long j10) {
        InterfaceC4845a0.a m19203w = m19203w(bVar);
        C1158c c1158c = new C1158c(this.f4328G, this.f4335t, this.f4326E, this.f4336u, this.f4337v, m19201u(bVar), this.f4338w, m19203w, this.f4325D, interfaceC3894b);
        this.f4322A.add(c1158c);
        return c1158c;
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: g */
    public C4503u1 mo4733g() {
        return this.f4333r;
    }

    @Override // p290u4.InterfaceC4882t
    /* renamed from: h */
    public void mo4735h() {
        this.f4325D.mo4756a();
    }
}
