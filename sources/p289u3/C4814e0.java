package p289u3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;
import p126i7.AbstractC2651u;
import p137j4.AbstractC3236o;
import p137j4.C3235n;
import p137j4.C3243v;
import p137j4.InterfaceC3233l;
import p137j4.InterfaceC3238q;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4049u;
import p222p5.C4050v;
import p222p5.InterfaceC4048t;
import p264s3.C4403a3;
import p264s3.C4463m1;
import p264s3.C4468n1;
import p264s3.InterfaceC4445i3;
import p264s3.InterfaceC4450j3;
import p289u3.InterfaceC4836s;
import p289u3.InterfaceC4837t;
import p304v3.C5110g;
import p304v3.C5112i;

/* renamed from: u3.e0 */
/* loaded from: classes.dex */
public class C4814e0 extends AbstractC3236o implements InterfaceC4048t {

    /* renamed from: K0 */
    public final Context f18017K0;

    /* renamed from: L0 */
    public final InterfaceC4836s.a f18018L0;

    /* renamed from: M0 */
    public final InterfaceC4837t f18019M0;

    /* renamed from: N0 */
    public int f18020N0;

    /* renamed from: O0 */
    public boolean f18021O0;

    /* renamed from: P0 */
    public C4463m1 f18022P0;

    /* renamed from: Q0 */
    public C4463m1 f18023Q0;

    /* renamed from: R0 */
    public long f18024R0;

    /* renamed from: S0 */
    public boolean f18025S0;

    /* renamed from: T0 */
    public boolean f18026T0;

    /* renamed from: U0 */
    public boolean f18027U0;

    /* renamed from: V0 */
    public boolean f18028V0;

    /* renamed from: W0 */
    public InterfaceC4445i3.a f18029W0;

    /* renamed from: u3.e0$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public static void m19032a(InterfaceC4837t interfaceC4837t, Object obj) {
            interfaceC4837t.mo18905f((AudioDeviceInfo) obj);
        }
    }

    /* renamed from: u3.e0$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC4837t.c {
        public c() {
        }

        @Override // p289u3.InterfaceC4837t.c
        /* renamed from: a */
        public void mo19033a(Exception exc) {
            C4046r.m15524d("MediaCodecAudioRenderer", "Audio sink error", exc);
            C4814e0.this.f18018L0.m19146l(exc);
        }

        @Override // p289u3.InterfaceC4837t.c
        /* renamed from: b */
        public void mo19034b(long j10) {
            C4814e0.this.f18018L0.m19142B(j10);
        }

        @Override // p289u3.InterfaceC4837t.c
        /* renamed from: c */
        public void mo19035c() {
            if (C4814e0.this.f18029W0 != null) {
                C4814e0.this.f18029W0.mo17341a();
            }
        }

        @Override // p289u3.InterfaceC4837t.c
        /* renamed from: d */
        public void mo19036d(int i10, long j10, long j11) {
            C4814e0.this.f18018L0.m19144D(i10, j10, j11);
        }

        @Override // p289u3.InterfaceC4837t.c
        /* renamed from: e */
        public void mo19037e() {
            C4814e0.this.m19030H1();
        }

        @Override // p289u3.InterfaceC4837t.c
        /* renamed from: f */
        public void mo19038f() {
            if (C4814e0.this.f18029W0 != null) {
                C4814e0.this.f18029W0.mo17342b();
            }
        }

        @Override // p289u3.InterfaceC4837t.c
        public void onSkipSilenceEnabledChanged(boolean z10) {
            C4814e0.this.f18018L0.m19143C(z10);
        }
    }

    public C4814e0(Context context, InterfaceC3233l.b bVar, InterfaceC3238q interfaceC3238q, boolean z10, Handler handler, InterfaceC4836s interfaceC4836s, InterfaceC4837t interfaceC4837t) {
        super(1, bVar, interfaceC3238q, z10, 44100.0f);
        this.f18017K0 = context.getApplicationContext();
        this.f18019M0 = interfaceC4837t;
        this.f18018L0 = new InterfaceC4836s.a(handler, interfaceC4836s);
        interfaceC4837t.mo18923q(new c());
    }

    /* renamed from: B1 */
    public static boolean m19023B1(String str) {
        if (C4041n0.f14513a < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(C4041n0.f14515c)) {
            String str2 = C4041n0.f14514b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: C1 */
    public static boolean m19024C1() {
        if (C4041n0.f14513a == 23) {
            String str = C4041n0.f14516d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F1 */
    public static List<C3235n> m19025F1(InterfaceC3238q interfaceC3238q, C4463m1 c4463m1, boolean z10, InterfaceC4837t interfaceC4837t) {
        C3235n m11732v;
        String str = c4463m1.f16506s;
        if (str == null) {
            return AbstractC2651u.m10770u();
        }
        if (interfaceC4837t.mo18896a(c4463m1) && (m11732v = C3243v.m11732v()) != null) {
            return AbstractC2651u.m10771v(m11732v);
        }
        List<C3235n> mo11691a = interfaceC3238q.mo11691a(str, z10, false);
        String m11723m = C3243v.m11723m(c4463m1);
        return m11723m == null ? AbstractC2651u.m10768p(mo11691a) : AbstractC2651u.m10766n().m10783j(mo11691a).m10783j(interfaceC3238q.mo11691a(m11723m, z10, false)).m10784k();
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: A0 */
    public float mo11614A0(float f10, C4463m1 c4463m1, C4463m1[] c4463m1Arr) {
        int i10 = -1;
        for (C4463m1 c4463m12 : c4463m1Arr) {
            int i11 = c4463m12.f16486G;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * i10;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: C0 */
    public List<C3235n> mo11616C0(InterfaceC3238q interfaceC3238q, C4463m1 c4463m1, boolean z10) {
        return C3243v.m11731u(m19025F1(interfaceC3238q, c4463m1, z10, this.f18019M0), c4463m1);
    }

    /* renamed from: D1 */
    public final int m19027D1(C3235n c3235n, C4463m1 c4463m1) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(c3235n.f11234a) || (i10 = C4041n0.f14513a) >= 24 || (i10 == 23 && C4041n0.m15490w0(this.f18017K0))) {
            return c4463m1.f16507t;
        }
        return -1;
    }

    @Override // p264s3.AbstractC4426f, p264s3.InterfaceC4445i3
    /* renamed from: E */
    public InterfaceC4048t mo17200E() {
        return this;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: E0 */
    public InterfaceC3233l.a mo11618E0(C3235n c3235n, C4463m1 c4463m1, MediaCrypto mediaCrypto, float f10) {
        this.f18020N0 = m19028E1(c3235n, c4463m1, m17208N());
        this.f18021O0 = m19023B1(c3235n.f11234a);
        MediaFormat m19029G1 = m19029G1(c4463m1, c3235n.f11236c, this.f18020N0, f10);
        this.f18023Q0 = "audio/raw".equals(c3235n.f11235b) && !"audio/raw".equals(c4463m1.f16506s) ? c4463m1 : null;
        return InterfaceC3233l.a.m11565a(c3235n, m19029G1, c4463m1, mediaCrypto);
    }

    /* renamed from: E1 */
    public int m19028E1(C3235n c3235n, C4463m1 c4463m1, C4463m1[] c4463m1Arr) {
        int m19027D1 = m19027D1(c3235n, c4463m1);
        if (c4463m1Arr.length == 1) {
            return m19027D1;
        }
        for (C4463m1 c4463m12 : c4463m1Arr) {
            if (c3235n.m11588f(c4463m1, c4463m12).f19297d != 0) {
                m19027D1 = Math.max(m19027D1, m19027D1(c3235n, c4463m12));
            }
        }
        return m19027D1;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: G1 */
    public MediaFormat m19029G1(C4463m1 c4463m1, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c4463m1.f16485F);
        mediaFormat.setInteger("sample-rate", c4463m1.f16486G);
        C4049u.m15543e(mediaFormat, c4463m1.f16508u);
        C4049u.m15542d(mediaFormat, "max-input-size", i10);
        int i11 = C4041n0.f14513a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !m19024C1()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(c4463m1.f16506s)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f18019M0.mo18926s(C4041n0.m15450c0(4, c4463m1.f16485F, c4463m1.f16486G)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        return mediaFormat;
    }

    /* renamed from: H1 */
    public void m19030H1() {
        this.f18026T0 = true;
    }

    /* renamed from: I1 */
    public final void m19031I1() {
        long mo18916m = this.f18019M0.mo18916m(mo6376c());
        if (mo18916m != Long.MIN_VALUE) {
            if (!this.f18026T0) {
                mo18916m = Math.max(this.f18024R0, mo18916m);
            }
            this.f18024R0 = mo18916m;
            this.f18026T0 = false;
        }
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: P */
    public void mo6368P() {
        this.f18027U0 = true;
        this.f18022P0 = null;
        try {
            this.f18019M0.flush();
            try {
                super.mo6368P();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.mo6368P();
                throw th;
            } finally {
            }
        }
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: Q */
    public void mo11627Q(boolean z10, boolean z11) {
        super.mo11627Q(z10, z11);
        this.f18018L0.m19150p(this.f11257F0);
        if (m17204J().f16425a) {
            this.f18019M0.mo18925r();
        } else {
            this.f18019M0.mo18918n();
        }
        this.f18019M0.mo18897b(m17207M());
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: R */
    public void mo6369R(long j10, boolean z10) {
        super.mo6369R(j10, z10);
        if (this.f18028V0) {
            this.f18019M0.mo18931w();
        } else {
            this.f18019M0.flush();
        }
        this.f18024R0 = j10;
        this.f18025S0 = true;
        this.f18026T0 = true;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: R0 */
    public void mo11629R0(Exception exc) {
        C4046r.m15524d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f18018L0.m19145k(exc);
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: S */
    public void mo11630S() {
        try {
            super.mo11630S();
        } finally {
            if (this.f18027U0) {
                this.f18027U0 = false;
                this.f18019M0.reset();
            }
        }
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: S0 */
    public void mo11631S0(String str, InterfaceC3233l.a aVar, long j10, long j11) {
        this.f18018L0.m19147m(str, j10, j11);
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: T */
    public void mo11632T() {
        super.mo11632T();
        this.f18019M0.mo18928t();
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: T0 */
    public void mo11633T0(String str) {
        this.f18018L0.m19148n(str);
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: U */
    public void mo11634U() {
        m19031I1();
        this.f18019M0.pause();
        super.mo11634U();
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: U0 */
    public C5112i mo11635U0(C4468n1 c4468n1) {
        this.f18022P0 = (C4463m1) C4014a.m15199e(c4468n1.f16559b);
        C5112i mo11635U0 = super.mo11635U0(c4468n1);
        this.f18018L0.m19151q(this.f18022P0, mo11635U0);
        return mo11635U0;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: V0 */
    public void mo11636V0(C4463m1 c4463m1, MediaFormat mediaFormat) {
        int i10;
        C4463m1 c4463m12 = this.f18023Q0;
        int[] iArr = null;
        if (c4463m12 != null) {
            c4463m1 = c4463m12;
        } else if (m11681x0() != null) {
            C4463m1 m17448G = new C4463m1.b().m17474g0("audio/raw").m17468a0("audio/raw".equals(c4463m1.f16506s) ? c4463m1.f16487H : (C4041n0.f14513a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? C4041n0.m15448b0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).m17457P(c4463m1.f16488I).m17458Q(c4463m1.f16489J).m17451J(mediaFormat.getInteger("channel-count")).m17475h0(mediaFormat.getInteger("sample-rate")).m17448G();
            if (this.f18021O0 && m17448G.f16485F == 6 && (i10 = c4463m1.f16485F) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < c4463m1.f16485F; i11++) {
                    iArr[i11] = i11;
                }
            }
            c4463m1 = m17448G;
        }
        try {
            this.f18019M0.mo18930v(c4463m1, 0, iArr);
        } catch (InterfaceC4837t.a e10) {
            throw m17202H(e10, e10.f18140h, 5001);
        }
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: W0 */
    public void mo11637W0(long j10) {
        this.f18019M0.m19152o(j10);
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: Y0 */
    public void mo11639Y0() {
        super.mo11639Y0();
        this.f18019M0.mo18921p();
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: Z0 */
    public void mo11641Z0(C5110g c5110g) {
        if (!this.f18025S0 || c5110g.m20747p()) {
            return;
        }
        if (Math.abs(c5110g.f19286l - this.f18024R0) > 500000) {
            this.f18024R0 = c5110g.f19286l;
        }
        this.f18025S0 = false;
    }

    @Override // p264s3.InterfaceC4445i3, p264s3.InterfaceC4450j3
    /* renamed from: b */
    public String mo6374b() {
        return "MediaCodecAudioRenderer";
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: b0 */
    public C5112i mo11644b0(C3235n c3235n, C4463m1 c4463m1, C4463m1 c4463m12) {
        C5112i m11588f = c3235n.m11588f(c4463m1, c4463m12);
        int i10 = m11588f.f19298e;
        if (m19027D1(c3235n, c4463m12) > this.f18020N0) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C5112i(c3235n.f11234a, c4463m1, c4463m12, i11 != 0 ? 0 : m11588f.f19297d, i11);
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: b1 */
    public boolean mo11645b1(long j10, long j11, InterfaceC3233l interfaceC3233l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C4463m1 c4463m1) {
        C4014a.m15199e(byteBuffer);
        if (this.f18023Q0 != null && (i11 & 2) != 0) {
            ((InterfaceC3233l) C4014a.m15199e(interfaceC3233l)).mo11500h(i10, false);
            return true;
        }
        if (z10) {
            if (interfaceC3233l != null) {
                interfaceC3233l.mo11500h(i10, false);
            }
            this.f11257F0.f19276f += i12;
            this.f18019M0.mo18921p();
            return true;
        }
        try {
            if (!this.f18019M0.mo18929u(byteBuffer, j12, i12)) {
                return false;
            }
            if (interfaceC3233l != null) {
                interfaceC3233l.mo11500h(i10, false);
            }
            this.f11257F0.f19275e += i12;
            return true;
        } catch (InterfaceC4837t.b e10) {
            throw m17203I(e10, this.f18022P0, e10.f18142i, 5001);
        } catch (InterfaceC4837t.e e11) {
            throw m17203I(e11, c4463m1, e11.f18147i, 5002);
        }
    }

    @Override // p137j4.AbstractC3236o, p264s3.InterfaceC4445i3
    /* renamed from: c */
    public boolean mo6376c() {
        return super.mo6376c() && this.f18019M0.mo18899c();
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: d */
    public void mo15307d(C4403a3 c4403a3) {
        this.f18019M0.mo18901d(c4403a3);
    }

    @Override // p137j4.AbstractC3236o, p264s3.InterfaceC4445i3
    /* renamed from: e */
    public boolean mo6379e() {
        return this.f18019M0.mo18914k() || super.mo6379e();
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: g1 */
    public void mo11651g1() {
        try {
            this.f18019M0.mo18912j();
        } catch (InterfaceC4837t.e e10) {
            throw m17203I(e10, e10.f18148j, e10.f18147i, 5002);
        }
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: h */
    public C4403a3 mo15308h() {
        return this.f18019M0.mo18908h();
    }

    @Override // p222p5.InterfaceC4048t
    /* renamed from: s */
    public long mo15309s() {
        if (getState() == 2) {
            m19031I1();
        }
        return this.f18024R0;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: t1 */
    public boolean mo11674t1(C4463m1 c4463m1) {
        return this.f18019M0.mo18896a(c4463m1);
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: u1 */
    public int mo11676u1(InterfaceC3238q interfaceC3238q, C4463m1 c4463m1) {
        boolean z10;
        if (!C4050v.m15558o(c4463m1.f16506s)) {
            return InterfaceC4450j3.m17374v(0);
        }
        int i10 = C4041n0.f14513a >= 21 ? 32 : 0;
        boolean z11 = true;
        boolean z12 = c4463m1.f16493N != 0;
        boolean m11613v1 = AbstractC3236o.m11613v1(c4463m1);
        int i11 = 8;
        if (m11613v1 && this.f18019M0.mo18896a(c4463m1) && (!z12 || C3243v.m11732v() != null)) {
            return InterfaceC4450j3.m17372r(4, 8, i10);
        }
        if ((!"audio/raw".equals(c4463m1.f16506s) || this.f18019M0.mo18896a(c4463m1)) && this.f18019M0.mo18896a(C4041n0.m15450c0(2, c4463m1.f16485F, c4463m1.f16486G))) {
            List<C3235n> m19025F1 = m19025F1(interfaceC3238q, c4463m1, false, this.f18019M0);
            if (m19025F1.isEmpty()) {
                return InterfaceC4450j3.m17374v(1);
            }
            if (!m11613v1) {
                return InterfaceC4450j3.m17374v(2);
            }
            C3235n c3235n = m19025F1.get(0);
            boolean m11594o = c3235n.m11594o(c4463m1);
            if (!m11594o) {
                for (int i12 = 1; i12 < m19025F1.size(); i12++) {
                    C3235n c3235n2 = m19025F1.get(i12);
                    if (c3235n2.m11594o(c4463m1)) {
                        z10 = false;
                        c3235n = c3235n2;
                        break;
                    }
                }
            }
            z10 = true;
            z11 = m11594o;
            int i13 = z11 ? 4 : 3;
            if (z11 && c3235n.m11597r(c4463m1)) {
                i11 = 16;
            }
            return InterfaceC4450j3.m17369n(i13, i11, i10, c3235n.f11241h ? 64 : 0, z10 ? 128 : 0);
        }
        return InterfaceC4450j3.m17374v(1);
    }

    @Override // p264s3.AbstractC4426f, p264s3.C4425e3.b
    /* renamed from: y */
    public void mo16091y(int i10, Object obj) {
        if (i10 == 2) {
            this.f18019M0.mo18903e(((Float) obj).floatValue());
            return;
        }
        if (i10 == 3) {
            this.f18019M0.mo18910i((C4813e) obj);
            return;
        }
        if (i10 == 6) {
            this.f18019M0.mo18906g((C4840w) obj);
            return;
        }
        switch (i10) {
            case 9:
                this.f18019M0.mo18932x(((Boolean) obj).booleanValue());
                return;
            case 10:
                this.f18019M0.mo18915l(((Integer) obj).intValue());
                return;
            case 11:
                this.f18029W0 = (InterfaceC4445i3.a) obj;
                return;
            case 12:
                if (C4041n0.f14513a >= 23) {
                    b.m19032a(this.f18019M0, obj);
                    return;
                }
                return;
            default:
                super.mo16091y(i10, obj);
                return;
        }
    }
}
