package p137j4;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p137j4.C3243v;
import p137j4.InterfaceC3233l;
import p222p5.C4014a;
import p222p5.C4031i0;
import p222p5.C4035k0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4051w;
import p264s3.AbstractC4426f;
import p264s3.C4441i;
import p264s3.C4463m1;
import p264s3.C4468n1;
import p264s3.C4481q;
import p275t3.C4674s1;
import p304v3.C5108e;
import p304v3.C5110g;
import p304v3.C5112i;
import p304v3.InterfaceC5105b;
import p317w3.C5228c0;
import p317w3.InterfaceC5248n;

/* renamed from: j4.o */
/* loaded from: classes.dex */
public abstract class AbstractC3236o extends AbstractC4426f {

    /* renamed from: J0 */
    public static final byte[] f11245J0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A */
    public final C5110g f11246A;

    /* renamed from: A0 */
    public boolean f11247A0;

    /* renamed from: B */
    public final C3229h f11248B;

    /* renamed from: B0 */
    public boolean f11249B0;

    /* renamed from: C */
    public final ArrayList<Long> f11250C;

    /* renamed from: C0 */
    public boolean f11251C0;

    /* renamed from: D */
    public final MediaCodec.BufferInfo f11252D;

    /* renamed from: D0 */
    public boolean f11253D0;

    /* renamed from: E */
    public final ArrayDeque<c> f11254E;

    /* renamed from: E0 */
    public C4481q f11255E0;

    /* renamed from: F */
    public C4463m1 f11256F;

    /* renamed from: F0 */
    public C5108e f11257F0;

    /* renamed from: G */
    public C4463m1 f11258G;

    /* renamed from: G0 */
    public c f11259G0;

    /* renamed from: H */
    public InterfaceC5248n f11260H;

    /* renamed from: H0 */
    public long f11261H0;

    /* renamed from: I */
    public InterfaceC5248n f11262I;

    /* renamed from: I0 */
    public boolean f11263I0;

    /* renamed from: J */
    public MediaCrypto f11264J;

    /* renamed from: K */
    public boolean f11265K;

    /* renamed from: L */
    public long f11266L;

    /* renamed from: M */
    public float f11267M;

    /* renamed from: N */
    public float f11268N;

    /* renamed from: O */
    public InterfaceC3233l f11269O;

    /* renamed from: P */
    public C4463m1 f11270P;

    /* renamed from: Q */
    public MediaFormat f11271Q;

    /* renamed from: R */
    public boolean f11272R;

    /* renamed from: S */
    public float f11273S;

    /* renamed from: T */
    public ArrayDeque<C3235n> f11274T;

    /* renamed from: U */
    public b f11275U;

    /* renamed from: V */
    public C3235n f11276V;

    /* renamed from: W */
    public int f11277W;

    /* renamed from: X */
    public boolean f11278X;

    /* renamed from: Y */
    public boolean f11279Y;

    /* renamed from: Z */
    public boolean f11280Z;

    /* renamed from: a0 */
    public boolean f11281a0;

    /* renamed from: b0 */
    public boolean f11282b0;

    /* renamed from: c0 */
    public boolean f11283c0;

    /* renamed from: d0 */
    public boolean f11284d0;

    /* renamed from: e0 */
    public boolean f11285e0;

    /* renamed from: f0 */
    public boolean f11286f0;

    /* renamed from: g0 */
    public boolean f11287g0;

    /* renamed from: h0 */
    public C3230i f11288h0;

    /* renamed from: i0 */
    public long f11289i0;

    /* renamed from: j0 */
    public int f11290j0;

    /* renamed from: k0 */
    public int f11291k0;

    /* renamed from: l0 */
    public ByteBuffer f11292l0;

    /* renamed from: m0 */
    public boolean f11293m0;

    /* renamed from: n0 */
    public boolean f11294n0;

    /* renamed from: o0 */
    public boolean f11295o0;

    /* renamed from: p0 */
    public boolean f11296p0;

    /* renamed from: q0 */
    public boolean f11297q0;

    /* renamed from: r0 */
    public boolean f11298r0;

    /* renamed from: s0 */
    public int f11299s0;

    /* renamed from: t0 */
    public int f11300t0;

    /* renamed from: u */
    public final InterfaceC3233l.b f11301u;

    /* renamed from: u0 */
    public int f11302u0;

    /* renamed from: v */
    public final InterfaceC3238q f11303v;

    /* renamed from: v0 */
    public boolean f11304v0;

    /* renamed from: w */
    public final boolean f11305w;

    /* renamed from: w0 */
    public boolean f11306w0;

    /* renamed from: x */
    public final float f11307x;

    /* renamed from: x0 */
    public boolean f11308x0;

    /* renamed from: y */
    public final C5110g f11309y;

    /* renamed from: y0 */
    public long f11310y0;

    /* renamed from: z */
    public final C5110g f11311z;

    /* renamed from: z0 */
    public long f11312z0;

    /* renamed from: j4.o$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static void m11686a(InterfaceC3233l.a aVar, C4674s1 c4674s1) {
            LogSessionId m18497a = c4674s1.m18497a();
            if (m18497a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            aVar.f11227b.setString("log-session-id", m18497a.getStringId());
        }
    }

    /* renamed from: j4.o$b */
    /* loaded from: classes.dex */
    public static class b extends Exception {

        /* renamed from: h */
        public final String f11313h;

        /* renamed from: i */
        public final boolean f11314i;

        /* renamed from: j */
        public final C3235n f11315j;

        /* renamed from: k */
        public final String f11316k;

        /* renamed from: l */
        public final b f11317l;

        public b(String str, Throwable th, String str2, boolean z10, C3235n c3235n, String str3, b bVar) {
            super(str, th);
            this.f11313h = str2;
            this.f11314i = z10;
            this.f11315j = c3235n;
            this.f11316k = str3;
            this.f11317l = bVar;
        }

        public b(C4463m1 c4463m1, Throwable th, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + c4463m1, th, c4463m1.f16506s, z10, null, m11688b(i10), null);
        }

        public b(C4463m1 c4463m1, Throwable th, boolean z10, C3235n c3235n) {
            this("Decoder init failed: " + c3235n.f11234a + ", " + c4463m1, th, c4463m1.f16506s, z10, c3235n, C4041n0.f14513a >= 21 ? m11689d(th) : null, null);
        }

        /* renamed from: b */
        public static String m11688b(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }

        /* renamed from: d */
        public static String m11689d(Throwable th) {
            if (th instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th).getDiagnosticInfo();
            }
            return null;
        }

        /* renamed from: c */
        public final b m11690c(b bVar) {
            return new b(getMessage(), getCause(), this.f11313h, this.f11314i, this.f11315j, this.f11316k, bVar);
        }
    }

    /* renamed from: j4.o$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: e */
        public static final c f11318e = new c(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a */
        public final long f11319a;

        /* renamed from: b */
        public final long f11320b;

        /* renamed from: c */
        public final long f11321c;

        /* renamed from: d */
        public final C4031i0<C4463m1> f11322d = new C4031i0<>();

        public c(long j10, long j11, long j12) {
            this.f11319a = j10;
            this.f11320b = j11;
            this.f11321c = j12;
        }
    }

    public AbstractC3236o(int i10, InterfaceC3233l.b bVar, InterfaceC3238q interfaceC3238q, boolean z10, float f10) {
        super(i10);
        this.f11301u = bVar;
        this.f11303v = (InterfaceC3238q) C4014a.m15199e(interfaceC3238q);
        this.f11305w = z10;
        this.f11307x = f10;
        this.f11309y = C5110g.m20761z();
        this.f11311z = new C5110g(0);
        this.f11246A = new C5110g(2);
        C3229h c3229h = new C3229h();
        this.f11248B = c3229h;
        this.f11250C = new ArrayList<>();
        this.f11252D = new MediaCodec.BufferInfo();
        this.f11267M = 1.0f;
        this.f11268N = 1.0f;
        this.f11266L = -9223372036854775807L;
        this.f11254E = new ArrayDeque<>();
        m11659m1(c.f11318e);
        c3229h.m20764w(0);
        c3229h.f19284j.order(ByteOrder.nativeOrder());
        this.f11273S = -1.0f;
        this.f11277W = 0;
        this.f11299s0 = 0;
        this.f11290j0 = -1;
        this.f11291k0 = -1;
        this.f11289i0 = -9223372036854775807L;
        this.f11310y0 = -9223372036854775807L;
        this.f11312z0 = -9223372036854775807L;
        this.f11261H0 = -9223372036854775807L;
        this.f11300t0 = 0;
        this.f11302u0 = 0;
    }

    /* renamed from: M0 */
    public static boolean m11602M0(IllegalStateException illegalStateException) {
        if (C4041n0.f14513a >= 21 && m11603N0(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    /* renamed from: N0 */
    public static boolean m11603N0(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    /* renamed from: O0 */
    public static boolean m11604O0(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    /* renamed from: d0 */
    public static boolean m11605d0(String str, C4463m1 c4463m1) {
        return C4041n0.f14513a < 21 && c4463m1.f16508u.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    /* renamed from: e0 */
    public static boolean m11606e0(String str) {
        if (C4041n0.f14513a < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(C4041n0.f14515c)) {
            String str2 = C4041n0.f14514b;
            if (str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f0 */
    public static boolean m11607f0(String str) {
        int i10 = C4041n0.f14513a;
        if (i10 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
            if (i10 <= 19) {
                String str2 = C4041n0.f14514b;
                if (("hb2000".equals(str2) || "stvm8".equals(str2)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str))) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: g0 */
    public static boolean m11608g0(String str) {
        return C4041n0.f14513a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* renamed from: h0 */
    public static boolean m11609h0(C3235n c3235n) {
        String str = c3235n.f11234a;
        int i10 = C4041n0.f14513a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(C4041n0.f14515c) && "AFTS".equals(C4041n0.f14516d) && c3235n.f11240g));
    }

    /* renamed from: i0 */
    public static boolean m11610i0(String str) {
        int i10 = C4041n0.f14513a;
        return i10 < 18 || (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i10 == 19 && C4041n0.f14516d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
    }

    /* renamed from: j0 */
    public static boolean m11611j0(String str, C4463m1 c4463m1) {
        return C4041n0.f14513a <= 18 && c4463m1.f16485F == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* renamed from: k0 */
    public static boolean m11612k0(String str) {
        return C4041n0.f14513a == 29 && "c2.android.aac.decoder".equals(str);
    }

    /* renamed from: v1 */
    public static boolean m11613v1(C4463m1 c4463m1) {
        int i10 = c4463m1.f16493N;
        return i10 == 0 || i10 == 2;
    }

    /* renamed from: A0 */
    public abstract float mo11614A0(float f10, C4463m1 c4463m1, C4463m1[] c4463m1Arr);

    /* renamed from: B0 */
    public final MediaFormat m11615B0() {
        return this.f11271Q;
    }

    /* renamed from: C0 */
    public abstract List<C3235n> mo11616C0(InterfaceC3238q interfaceC3238q, C4463m1 c4463m1, boolean z10);

    /* renamed from: D0 */
    public final C5228c0 m11617D0(InterfaceC5248n interfaceC5248n) {
        InterfaceC5105b mo21125i = interfaceC5248n.mo21125i();
        if (mo21125i == null || (mo21125i instanceof C5228c0)) {
            return (C5228c0) mo21125i;
        }
        throw m17202H(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + mo21125i), this.f11256F, 6001);
    }

    /* renamed from: E0 */
    public abstract InterfaceC3233l.a mo11618E0(C3235n c3235n, C4463m1 c4463m1, MediaCrypto mediaCrypto, float f10);

    /* renamed from: F0 */
    public final long m11619F0() {
        return this.f11259G0.f11321c;
    }

    /* renamed from: G0 */
    public float m11620G0() {
        return this.f11267M;
    }

    /* renamed from: H0 */
    public void mo11621H0(C5110g c5110g) {
    }

    /* renamed from: I0 */
    public final boolean m11622I0() {
        return this.f11291k0 >= 0;
    }

    /* renamed from: J0 */
    public final void m11623J0(C4463m1 c4463m1) {
        m11658m0();
        String str = c4463m1.f16506s;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f11248B.m11555H(32);
        } else {
            this.f11248B.m11555H(1);
        }
        this.f11295o0 = true;
    }

    /* renamed from: K0 */
    public final void m11624K0(C3235n c3235n, MediaCrypto mediaCrypto) {
        String str = c3235n.f11234a;
        int i10 = C4041n0.f14513a;
        float mo11614A0 = i10 < 23 ? -1.0f : mo11614A0(this.f11268N, this.f11256F, m17208N());
        float f10 = mo11614A0 > this.f11307x ? mo11614A0 : -1.0f;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        InterfaceC3233l.a mo11618E0 = mo11618E0(c3235n, this.f11256F, mediaCrypto, f10);
        if (i10 >= 31) {
            a.m11686a(mo11618E0, m17207M());
        }
        try {
            C4035k0.m15372a("createCodec:" + str);
            this.f11269O = this.f11301u.mo11513a(mo11618E0);
            C4035k0.m15374c();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c3235n.m11594o(this.f11256F)) {
                C4046r.m15529i("MediaCodecRenderer", C4041n0.m15397C("Format exceeds selected codec's capabilities [%s, %s]", C4463m1.m17410i(this.f11256F), str));
            }
            this.f11276V = c3235n;
            this.f11273S = f10;
            this.f11270P = this.f11256F;
            this.f11277W = m11646c0(str);
            this.f11278X = m11605d0(str, this.f11270P);
            this.f11279Y = m11610i0(str);
            this.f11280Z = m11612k0(str);
            this.f11281a0 = m11607f0(str);
            this.f11282b0 = m11608g0(str);
            this.f11283c0 = m11606e0(str);
            this.f11284d0 = m11611j0(str, this.f11270P);
            this.f11287g0 = m11609h0(c3235n) || mo11685z0();
            if (this.f11269O.mo11493a()) {
                this.f11298r0 = true;
                this.f11299s0 = 1;
                this.f11285e0 = this.f11277W != 0;
            }
            if ("c2.android.mp3.decoder".equals(c3235n.f11234a)) {
                this.f11288h0 = new C3230i();
            }
            if (getState() == 2) {
                this.f11289i0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f11257F0.f19271a++;
            mo11631S0(str, mo11618E0, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
        } catch (Throwable th) {
            C4035k0.m15374c();
            throw th;
        }
    }

    /* renamed from: L0 */
    public final boolean m11625L0(long j10) {
        int size = this.f11250C.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f11250C.get(i10).longValue() == j10) {
                this.f11250C.remove(i10);
                return true;
            }
        }
        return false;
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: P */
    public void mo6368P() {
        this.f11256F = null;
        m11659m1(c.f11318e);
        this.f11254E.clear();
        m11677v0();
    }

    /* renamed from: P0 */
    public final void m11626P0() {
        C4463m1 c4463m1;
        if (this.f11269O != null || this.f11295o0 || (c4463m1 = this.f11256F) == null) {
            return;
        }
        if (this.f11262I == null && mo11674t1(c4463m1)) {
            m11623J0(this.f11256F);
            return;
        }
        m11657l1(this.f11262I);
        String str = this.f11256F.f16506s;
        InterfaceC5248n interfaceC5248n = this.f11260H;
        if (interfaceC5248n != null) {
            if (this.f11264J == null) {
                C5228c0 m11617D0 = m11617D0(interfaceC5248n);
                if (m11617D0 != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(m11617D0.f19800a, m11617D0.f19801b);
                        this.f11264J = mediaCrypto;
                        this.f11265K = !m11617D0.f19802c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw m17202H(e10, this.f11256F, 6006);
                    }
                } else if (this.f11260H.mo21118a() == null) {
                    return;
                }
            }
            if (C5228c0.f19799d) {
                int state = this.f11260H.getState();
                if (state == 1) {
                    InterfaceC5248n.a aVar = (InterfaceC5248n.a) C4014a.m15199e(this.f11260H.mo21118a());
                    throw m17202H(aVar, this.f11256F, aVar.f19914h);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            m11628Q0(this.f11264J, this.f11265K);
        } catch (b e11) {
            throw m17202H(e11, this.f11256F, 4001);
        }
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: Q */
    public void mo11627Q(boolean z10, boolean z11) {
        this.f11257F0 = new C5108e();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* renamed from: Q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m11628Q0(android.media.MediaCrypto r8, boolean r9) {
        /*
            r7 = this;
            java.util.ArrayDeque<j4.n> r0 = r7.f11274T
            r1 = 0
            if (r0 != 0) goto L39
            java.util.List r0 = r7.m11679w0(r9)     // Catch: p137j4.C3243v.c -> L2d
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: p137j4.C3243v.c -> L2d
            r2.<init>()     // Catch: p137j4.C3243v.c -> L2d
            r7.f11274T = r2     // Catch: p137j4.C3243v.c -> L2d
            boolean r3 = r7.f11305w     // Catch: p137j4.C3243v.c -> L2d
            if (r3 == 0) goto L18
            r2.addAll(r0)     // Catch: p137j4.C3243v.c -> L2d
            goto L2a
        L18:
            boolean r2 = r0.isEmpty()     // Catch: p137j4.C3243v.c -> L2d
            if (r2 != 0) goto L2a
            java.util.ArrayDeque<j4.n> r2 = r7.f11274T     // Catch: p137j4.C3243v.c -> L2d
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: p137j4.C3243v.c -> L2d
            j4.n r0 = (p137j4.C3235n) r0     // Catch: p137j4.C3243v.c -> L2d
            r2.add(r0)     // Catch: p137j4.C3243v.c -> L2d
        L2a:
            r7.f11275U = r1     // Catch: p137j4.C3243v.c -> L2d
            goto L39
        L2d:
            r8 = move-exception
            j4.o$b r0 = new j4.o$b
            s3.m1 r1 = r7.f11256F
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r8, r9, r2)
            throw r0
        L39:
            java.util.ArrayDeque<j4.n> r0 = r7.f11274T
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb4
            java.util.ArrayDeque<j4.n> r0 = r7.f11274T
            java.lang.Object r0 = r0.peekFirst()
            j4.n r0 = (p137j4.C3235n) r0
        L49:
            j4.l r2 = r7.f11269O
            if (r2 != 0) goto Lb1
            java.util.ArrayDeque<j4.n> r2 = r7.f11274T
            java.lang.Object r2 = r2.peekFirst()
            j4.n r2 = (p137j4.C3235n) r2
            boolean r3 = r7.mo11669r1(r2)
            if (r3 != 0) goto L5c
            return
        L5c:
            r7.m11624K0(r2, r8)     // Catch: java.lang.Exception -> L60
            goto L49
        L60:
            r3 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r2 != r0) goto L73
            java.lang.String r3 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            p222p5.C4046r.m15529i(r4, r3)     // Catch: java.lang.Exception -> L74
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L74
            r7.m11624K0(r2, r8)     // Catch: java.lang.Exception -> L74
            goto L49
        L73:
            throw r3     // Catch: java.lang.Exception -> L74
        L74:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            p222p5.C4046r.m15530j(r4, r5, r3)
            java.util.ArrayDeque<j4.n> r4 = r7.f11274T
            r4.removeFirst()
            j4.o$b r4 = new j4.o$b
            s3.m1 r5 = r7.f11256F
            r4.<init>(r5, r3, r9, r2)
            r7.mo11629R0(r4)
            j4.o$b r2 = r7.f11275U
            if (r2 != 0) goto L9f
            r7.f11275U = r4
            goto La5
        L9f:
            j4.o$b r2 = p137j4.AbstractC3236o.b.m11687a(r2, r4)
            r7.f11275U = r2
        La5:
            java.util.ArrayDeque<j4.n> r2 = r7.f11274T
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lae
            goto L49
        Lae:
            j4.o$b r8 = r7.f11275U
            throw r8
        Lb1:
            r7.f11274T = r1
            return
        Lb4:
            j4.o$b r8 = new j4.o$b
            s3.m1 r0 = r7.f11256F
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r8.<init>(r0, r1, r9, r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p137j4.AbstractC3236o.m11628Q0(android.media.MediaCrypto, boolean):void");
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: R */
    public void mo6369R(long j10, boolean z10) {
        this.f11247A0 = false;
        this.f11249B0 = false;
        this.f11253D0 = false;
        if (this.f11295o0) {
            this.f11248B.mo6366l();
            this.f11246A.mo6366l();
            this.f11296p0 = false;
        } else {
            m11675u0();
        }
        if (this.f11259G0.f11322d.m15348k() > 0) {
            this.f11251C0 = true;
        }
        this.f11259G0.f11322d.m15341c();
        this.f11254E.clear();
    }

    /* renamed from: R0 */
    public abstract void mo11629R0(Exception exc);

    @Override // p264s3.AbstractC4426f
    /* renamed from: S */
    public void mo11630S() {
        try {
            m11658m0();
            m11650f1();
        } finally {
            m11665p1(null);
        }
    }

    /* renamed from: S0 */
    public abstract void mo11631S0(String str, InterfaceC3233l.a aVar, long j10, long j11);

    @Override // p264s3.AbstractC4426f
    /* renamed from: T */
    public void mo11632T() {
    }

    /* renamed from: T0 */
    public abstract void mo11633T0(String str);

    @Override // p264s3.AbstractC4426f
    /* renamed from: U */
    public void mo11634U() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
    
        if (m11664p0() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b2, code lost:
    
        if (m11664p0() == false) goto L68;
     */
    /* renamed from: U0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p304v3.C5112i mo11635U0(p264s3.C4468n1 r12) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p137j4.AbstractC3236o.mo11635U0(s3.n1):v3.i");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r5 >= r1) goto L13;
     */
    @Override // p264s3.AbstractC4426f
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6370V(p264s3.C4463m1[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            j4.o$c r1 = r0.f11259G0
            long r1 = r1.f11321c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L20
            j4.o$c r1 = new j4.o$c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m11659m1(r1)
            goto L65
        L20:
            java.util.ArrayDeque<j4.o$c> r1 = r0.f11254E
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L55
            long r1 = r0.f11310y0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L38
            long r5 = r0.f11261H0
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L55
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L55
        L38:
            j4.o$c r1 = new j4.o$c
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m11659m1(r1)
            j4.o$c r1 = r0.f11259G0
            long r1 = r1.f11321c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L65
            r12.mo11639Y0()
            goto L65
        L55:
            java.util.ArrayDeque<j4.o$c> r1 = r0.f11254E
            j4.o$c r9 = new j4.o$c
            long r3 = r0.f11310y0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p137j4.AbstractC3236o.mo6370V(s3.m1[], long, long):void");
    }

    /* renamed from: V0 */
    public abstract void mo11636V0(C4463m1 c4463m1, MediaFormat mediaFormat);

    /* renamed from: W0 */
    public void mo11637W0(long j10) {
    }

    /* renamed from: X0 */
    public void mo11638X0(long j10) {
        this.f11261H0 = j10;
        while (!this.f11254E.isEmpty() && j10 >= this.f11254E.peek().f11319a) {
            m11659m1(this.f11254E.poll());
            mo11639Y0();
        }
    }

    /* renamed from: Y0 */
    public void mo11639Y0() {
    }

    /* renamed from: Z */
    public final void m11640Z() {
        C4014a.m15200f(!this.f11247A0);
        C4468n1 m17205K = m17205K();
        this.f11246A.mo6366l();
        do {
            this.f11246A.mo6366l();
            int m17210W = m17210W(m17205K, this.f11246A, 0);
            if (m17210W == -5) {
                mo11635U0(m17205K);
                return;
            }
            if (m17210W != -4) {
                if (m17210W != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f11246A.m20748q()) {
                    this.f11247A0 = true;
                    return;
                }
                if (this.f11251C0) {
                    C4463m1 c4463m1 = (C4463m1) C4014a.m15199e(this.f11256F);
                    this.f11258G = c4463m1;
                    mo11636V0(c4463m1, null);
                    this.f11251C0 = false;
                }
                this.f11246A.m20765x();
            }
        } while (this.f11248B.m11549B(this.f11246A));
        this.f11296p0 = true;
    }

    /* renamed from: Z0 */
    public abstract void mo11641Z0(C5110g c5110g);

    @Override // p264s3.InterfaceC4450j3
    /* renamed from: a */
    public final int mo6372a(C4463m1 c4463m1) {
        try {
            return mo11676u1(this.f11303v, c4463m1);
        } catch (C3243v.c e10) {
            throw m17202H(e10, c4463m1, 4002);
        }
    }

    /* renamed from: a0 */
    public final boolean m11642a0(long j10, long j11) {
        boolean z10;
        C4014a.m15200f(!this.f11249B0);
        if (this.f11248B.m11554G()) {
            C3229h c3229h = this.f11248B;
            if (!mo11645b1(j10, j11, null, c3229h.f19284j, this.f11291k0, 0, c3229h.m11553F(), this.f11248B.m11551D(), this.f11248B.m20747p(), this.f11248B.m20748q(), this.f11258G)) {
                return false;
            }
            mo11638X0(this.f11248B.m11552E());
            this.f11248B.mo6366l();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f11247A0) {
            this.f11249B0 = true;
            return z10;
        }
        if (this.f11296p0) {
            C4014a.m15200f(this.f11248B.m11549B(this.f11246A));
            this.f11296p0 = z10;
        }
        if (this.f11297q0) {
            if (this.f11248B.m11554G()) {
                return true;
            }
            m11658m0();
            this.f11297q0 = z10;
            m11626P0();
            if (!this.f11295o0) {
                return z10;
            }
        }
        m11640Z();
        if (this.f11248B.m11554G()) {
            this.f11248B.m20765x();
        }
        if (this.f11248B.m11554G() || this.f11247A0 || this.f11297q0) {
            return true;
        }
        return z10;
    }

    @TargetApi(23)
    /* renamed from: a1 */
    public final void m11643a1() {
        int i10 = this.f11302u0;
        if (i10 == 1) {
            m11673t0();
            return;
        }
        if (i10 == 2) {
            m11673t0();
            m11682x1();
        } else if (i10 == 3) {
            m11649e1();
        } else {
            this.f11249B0 = true;
            mo11651g1();
        }
    }

    /* renamed from: b0 */
    public abstract C5112i mo11644b0(C3235n c3235n, C4463m1 c4463m1, C4463m1 c4463m12);

    /* renamed from: b1 */
    public abstract boolean mo11645b1(long j10, long j11, InterfaceC3233l interfaceC3233l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C4463m1 c4463m1);

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: c */
    public boolean mo6376c() {
        return this.f11249B0;
    }

    /* renamed from: c0 */
    public final int m11646c0(String str) {
        int i10 = C4041n0.f14513a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = C4041n0.f14516d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = C4041n0.f14514b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    /* renamed from: c1 */
    public final void m11647c1() {
        this.f11308x0 = true;
        MediaFormat mo11494b = this.f11269O.mo11494b();
        if (this.f11277W != 0 && mo11494b.getInteger("width") == 32 && mo11494b.getInteger("height") == 32) {
            this.f11286f0 = true;
            return;
        }
        if (this.f11284d0) {
            mo11494b.setInteger("channel-count", 1);
        }
        this.f11271Q = mo11494b;
        this.f11272R = true;
    }

    /* renamed from: d1 */
    public final boolean m11648d1(int i10) {
        C4468n1 m17205K = m17205K();
        this.f11309y.mo6366l();
        int m17210W = m17210W(m17205K, this.f11309y, i10 | 4);
        if (m17210W == -5) {
            mo11635U0(m17205K);
            return true;
        }
        if (m17210W != -4 || !this.f11309y.m20748q()) {
            return false;
        }
        this.f11247A0 = true;
        m11643a1();
        return false;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: e */
    public boolean mo6379e() {
        return this.f11256F != null && (m17209O() || m11622I0() || (this.f11289i0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f11289i0));
    }

    /* renamed from: e1 */
    public final void m11649e1() {
        m11650f1();
        m11626P0();
    }

    /* renamed from: f1 */
    public void m11650f1() {
        try {
            InterfaceC3233l interfaceC3233l = this.f11269O;
            if (interfaceC3233l != null) {
                interfaceC3233l.release();
                this.f11257F0.f19272b++;
                mo11633T0(this.f11276V.f11234a);
            }
            this.f11269O = null;
            try {
                MediaCrypto mediaCrypto = this.f11264J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f11269O = null;
            try {
                MediaCrypto mediaCrypto2 = this.f11264J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    /* renamed from: g1 */
    public void mo11651g1() {
    }

    /* renamed from: h1 */
    public void mo11652h1() {
        m11654j1();
        m11655k1();
        this.f11289i0 = -9223372036854775807L;
        this.f11306w0 = false;
        this.f11304v0 = false;
        this.f11285e0 = false;
        this.f11286f0 = false;
        this.f11293m0 = false;
        this.f11294n0 = false;
        this.f11250C.clear();
        this.f11310y0 = -9223372036854775807L;
        this.f11312z0 = -9223372036854775807L;
        this.f11261H0 = -9223372036854775807L;
        C3230i c3230i = this.f11288h0;
        if (c3230i != null) {
            c3230i.m11558c();
        }
        this.f11300t0 = 0;
        this.f11302u0 = 0;
        this.f11299s0 = this.f11298r0 ? 1 : 0;
    }

    /* renamed from: i1 */
    public void m11653i1() {
        mo11652h1();
        this.f11255E0 = null;
        this.f11288h0 = null;
        this.f11274T = null;
        this.f11276V = null;
        this.f11270P = null;
        this.f11271Q = null;
        this.f11272R = false;
        this.f11308x0 = false;
        this.f11273S = -1.0f;
        this.f11277W = 0;
        this.f11278X = false;
        this.f11279Y = false;
        this.f11280Z = false;
        this.f11281a0 = false;
        this.f11282b0 = false;
        this.f11283c0 = false;
        this.f11284d0 = false;
        this.f11287g0 = false;
        this.f11298r0 = false;
        this.f11299s0 = 0;
        this.f11265K = false;
    }

    /* renamed from: j1 */
    public final void m11654j1() {
        this.f11290j0 = -1;
        this.f11311z.f19284j = null;
    }

    /* renamed from: k1 */
    public final void m11655k1() {
        this.f11291k0 = -1;
        this.f11292l0 = null;
    }

    /* renamed from: l0 */
    public C3234m mo11656l0(Throwable th, C3235n c3235n) {
        return new C3234m(th, c3235n);
    }

    /* renamed from: l1 */
    public final void m11657l1(InterfaceC5248n interfaceC5248n) {
        InterfaceC5248n.m21269g(this.f11260H, interfaceC5248n);
        this.f11260H = interfaceC5248n;
    }

    /* renamed from: m0 */
    public final void m11658m0() {
        this.f11297q0 = false;
        this.f11248B.mo6366l();
        this.f11246A.mo6366l();
        this.f11296p0 = false;
        this.f11295o0 = false;
    }

    /* renamed from: m1 */
    public final void m11659m1(c cVar) {
        this.f11259G0 = cVar;
        long j10 = cVar.f11321c;
        if (j10 != -9223372036854775807L) {
            this.f11263I0 = true;
            mo11637W0(j10);
        }
    }

    /* renamed from: n0 */
    public final boolean m11660n0() {
        if (this.f11304v0) {
            this.f11300t0 = 1;
            if (this.f11279Y || this.f11281a0) {
                this.f11302u0 = 3;
                return false;
            }
            this.f11302u0 = 1;
        }
        return true;
    }

    /* renamed from: n1 */
    public final void m11661n1() {
        this.f11253D0 = true;
    }

    /* renamed from: o0 */
    public final void m11662o0() {
        if (!this.f11304v0) {
            m11649e1();
        } else {
            this.f11300t0 = 1;
            this.f11302u0 = 3;
        }
    }

    /* renamed from: o1 */
    public final void m11663o1(C4481q c4481q) {
        this.f11255E0 = c4481q;
    }

    @TargetApi(23)
    /* renamed from: p0 */
    public final boolean m11664p0() {
        if (this.f11304v0) {
            this.f11300t0 = 1;
            if (this.f11279Y || this.f11281a0) {
                this.f11302u0 = 3;
                return false;
            }
            this.f11302u0 = 2;
        } else {
            m11682x1();
        }
        return true;
    }

    /* renamed from: p1 */
    public final void m11665p1(InterfaceC5248n interfaceC5248n) {
        InterfaceC5248n.m21269g(this.f11262I, interfaceC5248n);
        this.f11262I = interfaceC5248n;
    }

    /* renamed from: q0 */
    public final boolean m11666q0(long j10, long j11) {
        boolean z10;
        boolean mo11645b1;
        int mo11499g;
        if (!m11622I0()) {
            if (this.f11282b0 && this.f11306w0) {
                try {
                    mo11499g = this.f11269O.mo11499g(this.f11252D);
                } catch (IllegalStateException unused) {
                    m11643a1();
                    if (this.f11249B0) {
                        m11650f1();
                    }
                    return false;
                }
            } else {
                mo11499g = this.f11269O.mo11499g(this.f11252D);
            }
            if (mo11499g < 0) {
                if (mo11499g == -2) {
                    m11647c1();
                    return true;
                }
                if (this.f11287g0 && (this.f11247A0 || this.f11300t0 == 2)) {
                    m11643a1();
                }
                return false;
            }
            if (this.f11286f0) {
                this.f11286f0 = false;
                this.f11269O.mo11500h(mo11499g, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.f11252D;
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                m11643a1();
                return false;
            }
            this.f11291k0 = mo11499g;
            ByteBuffer mo11506n = this.f11269O.mo11506n(mo11499g);
            this.f11292l0 = mo11506n;
            if (mo11506n != null) {
                mo11506n.position(this.f11252D.offset);
                ByteBuffer byteBuffer = this.f11292l0;
                MediaCodec.BufferInfo bufferInfo2 = this.f11252D;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f11283c0) {
                MediaCodec.BufferInfo bufferInfo3 = this.f11252D;
                if (bufferInfo3.presentationTimeUs == 0 && (bufferInfo3.flags & 4) != 0) {
                    long j12 = this.f11310y0;
                    if (j12 != -9223372036854775807L) {
                        bufferInfo3.presentationTimeUs = j12;
                    }
                }
            }
            this.f11293m0 = m11625L0(this.f11252D.presentationTimeUs);
            long j13 = this.f11312z0;
            long j14 = this.f11252D.presentationTimeUs;
            this.f11294n0 = j13 == j14;
            m11684y1(j14);
        }
        if (this.f11282b0 && this.f11306w0) {
            try {
                InterfaceC3233l interfaceC3233l = this.f11269O;
                ByteBuffer byteBuffer2 = this.f11292l0;
                int i10 = this.f11291k0;
                MediaCodec.BufferInfo bufferInfo4 = this.f11252D;
                z10 = false;
                try {
                    mo11645b1 = mo11645b1(j10, j11, interfaceC3233l, byteBuffer2, i10, bufferInfo4.flags, 1, bufferInfo4.presentationTimeUs, this.f11293m0, this.f11294n0, this.f11258G);
                } catch (IllegalStateException unused2) {
                    m11643a1();
                    if (this.f11249B0) {
                        m11650f1();
                    }
                    return z10;
                }
            } catch (IllegalStateException unused3) {
                z10 = false;
            }
        } else {
            z10 = false;
            InterfaceC3233l interfaceC3233l2 = this.f11269O;
            ByteBuffer byteBuffer3 = this.f11292l0;
            int i11 = this.f11291k0;
            MediaCodec.BufferInfo bufferInfo5 = this.f11252D;
            mo11645b1 = mo11645b1(j10, j11, interfaceC3233l2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f11293m0, this.f11294n0, this.f11258G);
        }
        if (mo11645b1) {
            mo11638X0(this.f11252D.presentationTimeUs);
            boolean z11 = (this.f11252D.flags & 4) != 0 ? true : z10;
            m11655k1();
            if (!z11) {
                return true;
            }
            m11643a1();
        }
        return z10;
    }

    /* renamed from: q1 */
    public final boolean m11667q1(long j10) {
        return this.f11266L == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.f11266L;
    }

    /* renamed from: r0 */
    public final boolean m11668r0(C3235n c3235n, C4463m1 c4463m1, InterfaceC5248n interfaceC5248n, InterfaceC5248n interfaceC5248n2) {
        C5228c0 m11617D0;
        if (interfaceC5248n == interfaceC5248n2) {
            return false;
        }
        if (interfaceC5248n2 == null || interfaceC5248n == null || !interfaceC5248n2.mo21119b().equals(interfaceC5248n.mo21119b()) || C4041n0.f14513a < 23) {
            return true;
        }
        UUID uuid = C4441i.f16301e;
        if (uuid.equals(interfaceC5248n.mo21119b()) || uuid.equals(interfaceC5248n2.mo21119b()) || (m11617D0 = m11617D0(interfaceC5248n2)) == null) {
            return true;
        }
        return !c3235n.f11240g && (m11617D0.f19802c ? false : interfaceC5248n2.mo21124h(c4463m1.f16506s));
    }

    /* renamed from: r1 */
    public boolean mo11669r1(C3235n c3235n) {
        return true;
    }

    /* renamed from: s0 */
    public final boolean m11670s0() {
        int i10;
        if (this.f11269O == null || (i10 = this.f11300t0) == 2 || this.f11247A0) {
            return false;
        }
        if (i10 == 0 && m11671s1()) {
            m11662o0();
        }
        if (this.f11290j0 < 0) {
            int mo11498f = this.f11269O.mo11498f();
            this.f11290j0 = mo11498f;
            if (mo11498f < 0) {
                return false;
            }
            this.f11311z.f19284j = this.f11269O.mo11503k(mo11498f);
            this.f11311z.mo6366l();
        }
        if (this.f11300t0 == 1) {
            if (!this.f11287g0) {
                this.f11306w0 = true;
                this.f11269O.mo11505m(this.f11290j0, 0, 0, 0L, 4);
                m11654j1();
            }
            this.f11300t0 = 2;
            return false;
        }
        if (this.f11285e0) {
            this.f11285e0 = false;
            ByteBuffer byteBuffer = this.f11311z.f19284j;
            byte[] bArr = f11245J0;
            byteBuffer.put(bArr);
            this.f11269O.mo11505m(this.f11290j0, 0, bArr.length, 0L, 0);
            m11654j1();
            this.f11304v0 = true;
            return true;
        }
        if (this.f11299s0 == 1) {
            for (int i11 = 0; i11 < this.f11270P.f16508u.size(); i11++) {
                this.f11311z.f19284j.put(this.f11270P.f16508u.get(i11));
            }
            this.f11299s0 = 2;
        }
        int position = this.f11311z.f19284j.position();
        C4468n1 m17205K = m17205K();
        try {
            int m17210W = m17210W(m17205K, this.f11311z, 0);
            if (mo17216j() || this.f11311z.m20751t()) {
                this.f11312z0 = this.f11310y0;
            }
            if (m17210W == -3) {
                return false;
            }
            if (m17210W == -5) {
                if (this.f11299s0 == 2) {
                    this.f11311z.mo6366l();
                    this.f11299s0 = 1;
                }
                mo11635U0(m17205K);
                return true;
            }
            if (this.f11311z.m20748q()) {
                if (this.f11299s0 == 2) {
                    this.f11311z.mo6366l();
                    this.f11299s0 = 1;
                }
                this.f11247A0 = true;
                if (!this.f11304v0) {
                    m11643a1();
                    return false;
                }
                try {
                    if (!this.f11287g0) {
                        this.f11306w0 = true;
                        this.f11269O.mo11505m(this.f11290j0, 0, 0, 0L, 4);
                        m11654j1();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw m17202H(e10, this.f11256F, C4041n0.m15433U(e10.getErrorCode()));
                }
            }
            if (!this.f11304v0 && !this.f11311z.m20750s()) {
                this.f11311z.mo6366l();
                if (this.f11299s0 == 2) {
                    this.f11299s0 = 1;
                }
                return true;
            }
            boolean m20766y = this.f11311z.m20766y();
            if (m20766y) {
                this.f11311z.f19283i.m20754b(position);
            }
            if (this.f11278X && !m20766y) {
                C4051w.m15566b(this.f11311z.f19284j);
                if (this.f11311z.f19284j.position() == 0) {
                    return true;
                }
                this.f11278X = false;
            }
            C5110g c5110g = this.f11311z;
            long j10 = c5110g.f19286l;
            C3230i c3230i = this.f11288h0;
            if (c3230i != null) {
                j10 = c3230i.m11559d(this.f11256F, c5110g);
                this.f11310y0 = Math.max(this.f11310y0, this.f11288h0.m11557b(this.f11256F));
            }
            long j11 = j10;
            if (this.f11311z.m20747p()) {
                this.f11250C.add(Long.valueOf(j11));
            }
            if (this.f11251C0) {
                (!this.f11254E.isEmpty() ? this.f11254E.peekLast() : this.f11259G0).f11322d.m15339a(j11, this.f11256F);
                this.f11251C0 = false;
            }
            this.f11310y0 = Math.max(this.f11310y0, j11);
            this.f11311z.m20765x();
            if (this.f11311z.m20746o()) {
                mo11621H0(this.f11311z);
            }
            mo11641Z0(this.f11311z);
            try {
                if (m20766y) {
                    this.f11269O.mo11495c(this.f11290j0, 0, this.f11311z.f19283i, j11, 0);
                } else {
                    this.f11269O.mo11505m(this.f11290j0, 0, this.f11311z.f19284j.limit(), j11, 0);
                }
                m11654j1();
                this.f11304v0 = true;
                this.f11299s0 = 0;
                this.f11257F0.f19273c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw m17202H(e11, this.f11256F, C4041n0.m15433U(e11.getErrorCode()));
            }
        } catch (C5110g.a e12) {
            mo11629R0(e12);
            m11648d1(0);
            m11673t0();
            return true;
        }
    }

    /* renamed from: s1 */
    public boolean m11671s1() {
        return false;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: t */
    public void mo11672t(float f10, float f11) {
        this.f11267M = f10;
        this.f11268N = f11;
        m11680w1(this.f11270P);
    }

    /* renamed from: t0 */
    public final void m11673t0() {
        try {
            this.f11269O.flush();
        } finally {
            mo11652h1();
        }
    }

    /* renamed from: t1 */
    public boolean mo11674t1(C4463m1 c4463m1) {
        return false;
    }

    /* renamed from: u0 */
    public final boolean m11675u0() {
        boolean m11677v0 = m11677v0();
        if (m11677v0) {
            m11626P0();
        }
        return m11677v0;
    }

    /* renamed from: u1 */
    public abstract int mo11676u1(InterfaceC3238q interfaceC3238q, C4463m1 c4463m1);

    /* renamed from: v0 */
    public boolean m11677v0() {
        if (this.f11269O == null) {
            return false;
        }
        int i10 = this.f11302u0;
        if (i10 == 3 || this.f11279Y || ((this.f11280Z && !this.f11308x0) || (this.f11281a0 && this.f11306w0))) {
            m11650f1();
            return true;
        }
        if (i10 == 2) {
            int i11 = C4041n0.f14513a;
            C4014a.m15200f(i11 >= 23);
            if (i11 >= 23) {
                try {
                    m11682x1();
                } catch (C4481q e10) {
                    C4046r.m15530j("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    m11650f1();
                    return true;
                }
            }
        }
        m11673t0();
        return false;
    }

    @Override // p264s3.AbstractC4426f, p264s3.InterfaceC4450j3
    /* renamed from: w */
    public final int mo11678w() {
        return 8;
    }

    /* renamed from: w0 */
    public final List<C3235n> m11679w0(boolean z10) {
        List<C3235n> mo11616C0 = mo11616C0(this.f11303v, this.f11256F, z10);
        if (mo11616C0.isEmpty() && z10) {
            mo11616C0 = mo11616C0(this.f11303v, this.f11256F, false);
            if (!mo11616C0.isEmpty()) {
                C4046r.m15529i("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f11256F.f16506s + ", but no secure decoder available. Trying to proceed with " + mo11616C0 + ".");
            }
        }
        return mo11616C0;
    }

    /* renamed from: w1 */
    public final boolean m11680w1(C4463m1 c4463m1) {
        if (C4041n0.f14513a >= 23 && this.f11269O != null && this.f11302u0 != 3 && getState() != 0) {
            float mo11614A0 = mo11614A0(this.f11268N, c4463m1, m17208N());
            float f10 = this.f11273S;
            if (f10 == mo11614A0) {
                return true;
            }
            if (mo11614A0 == -1.0f) {
                m11662o0();
                return false;
            }
            if (f10 == -1.0f && mo11614A0 <= this.f11307x) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", mo11614A0);
            this.f11269O.mo11496d(bundle);
            this.f11273S = mo11614A0;
        }
        return true;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: x */
    public void mo6387x(long j10, long j11) {
        boolean z10 = false;
        if (this.f11253D0) {
            this.f11253D0 = false;
            m11643a1();
        }
        C4481q c4481q = this.f11255E0;
        if (c4481q != null) {
            this.f11255E0 = null;
            throw c4481q;
        }
        try {
            if (this.f11249B0) {
                mo11651g1();
                return;
            }
            if (this.f11256F != null || m11648d1(2)) {
                m11626P0();
                if (this.f11295o0) {
                    C4035k0.m15372a("bypassRender");
                    do {
                    } while (m11642a0(j10, j11));
                } else {
                    if (this.f11269O == null) {
                        this.f11257F0.f19274d += m17212Y(j10);
                        m11648d1(1);
                        this.f11257F0.m20760c();
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C4035k0.m15372a("drainAndFeed");
                    while (m11666q0(j10, j11) && m11667q1(elapsedRealtime)) {
                    }
                    while (m11670s0() && m11667q1(elapsedRealtime)) {
                    }
                }
                C4035k0.m15374c();
                this.f11257F0.m20760c();
            }
        } catch (IllegalStateException e10) {
            if (!m11602M0(e10)) {
                throw e10;
            }
            mo11629R0(e10);
            if (C4041n0.f14513a >= 21 && m11604O0(e10)) {
                z10 = true;
            }
            if (z10) {
                m11650f1();
            }
            throw m17203I(mo11656l0(e10, m11683y0()), this.f11256F, z10, 4003);
        }
    }

    /* renamed from: x0 */
    public final InterfaceC3233l m11681x0() {
        return this.f11269O;
    }

    /* renamed from: x1 */
    public final void m11682x1() {
        try {
            this.f11264J.setMediaDrmSession(m11617D0(this.f11262I).f19801b);
            m11657l1(this.f11262I);
            this.f11300t0 = 0;
            this.f11302u0 = 0;
        } catch (MediaCryptoException e10) {
            throw m17202H(e10, this.f11256F, 6006);
        }
    }

    /* renamed from: y0 */
    public final C3235n m11683y0() {
        return this.f11276V;
    }

    /* renamed from: y1 */
    public final void m11684y1(long j10) {
        boolean z10;
        C4463m1 m15346i = this.f11259G0.f11322d.m15346i(j10);
        if (m15346i == null && this.f11263I0 && this.f11271Q != null) {
            m15346i = this.f11259G0.f11322d.m15345h();
        }
        if (m15346i != null) {
            this.f11258G = m15346i;
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || (this.f11272R && this.f11258G != null)) {
            mo11636V0(this.f11258G, this.f11271Q);
            this.f11272R = false;
            this.f11263I0 = false;
        }
    }

    /* renamed from: z0 */
    public boolean mo11685z0() {
        return false;
    }
}
