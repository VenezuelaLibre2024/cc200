package p289u3;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p193n5.ExecutorC3749p;
import p222p5.C4014a;
import p222p5.C4026g;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p222p5.InterfaceC4020d;
import p264s3.C4403a3;
import p264s3.C4463m1;
import p264s3.InterfaceC4486r;
import p275t3.C4674s1;
import p289u3.C4808b0;
import p289u3.C4839v;
import p289u3.InterfaceC4817g;
import p289u3.InterfaceC4837t;

/* renamed from: u3.a0 */
/* loaded from: classes.dex */
public final class C4806a0 implements InterfaceC4837t {

    /* renamed from: e0 */
    public static boolean f17868e0 = false;

    /* renamed from: f0 */
    public static final Object f17869f0 = new Object();

    /* renamed from: g0 */
    public static ExecutorService f17870g0;

    /* renamed from: h0 */
    public static int f17871h0;

    /* renamed from: A */
    public ByteBuffer f17872A;

    /* renamed from: B */
    public int f17873B;

    /* renamed from: C */
    public long f17874C;

    /* renamed from: D */
    public long f17875D;

    /* renamed from: E */
    public long f17876E;

    /* renamed from: F */
    public long f17877F;

    /* renamed from: G */
    public int f17878G;

    /* renamed from: H */
    public boolean f17879H;

    /* renamed from: I */
    public boolean f17880I;

    /* renamed from: J */
    public long f17881J;

    /* renamed from: K */
    public float f17882K;

    /* renamed from: L */
    public InterfaceC4817g[] f17883L;

    /* renamed from: M */
    public ByteBuffer[] f17884M;

    /* renamed from: N */
    public ByteBuffer f17885N;

    /* renamed from: O */
    public int f17886O;

    /* renamed from: P */
    public ByteBuffer f17887P;

    /* renamed from: Q */
    public byte[] f17888Q;

    /* renamed from: R */
    public int f17889R;

    /* renamed from: S */
    public int f17890S;

    /* renamed from: T */
    public boolean f17891T;

    /* renamed from: U */
    public boolean f17892U;

    /* renamed from: V */
    public boolean f17893V;

    /* renamed from: W */
    public boolean f17894W;

    /* renamed from: X */
    public int f17895X;

    /* renamed from: Y */
    public C4840w f17896Y;

    /* renamed from: Z */
    public d f17897Z;

    /* renamed from: a */
    public final C4815f f17898a;

    /* renamed from: a0 */
    public boolean f17899a0;

    /* renamed from: b */
    public final InterfaceC4819h f17900b;

    /* renamed from: b0 */
    public long f17901b0;

    /* renamed from: c */
    public final boolean f17902c;

    /* renamed from: c0 */
    public boolean f17903c0;

    /* renamed from: d */
    public final C4842y f17904d;

    /* renamed from: d0 */
    public boolean f17905d0;

    /* renamed from: e */
    public final C4828l0 f17906e;

    /* renamed from: f */
    public final InterfaceC4817g[] f17907f;

    /* renamed from: g */
    public final InterfaceC4817g[] f17908g;

    /* renamed from: h */
    public final C4026g f17909h;

    /* renamed from: i */
    public final C4839v f17910i;

    /* renamed from: j */
    public final ArrayDeque<j> f17911j;

    /* renamed from: k */
    public final boolean f17912k;

    /* renamed from: l */
    public final int f17913l;

    /* renamed from: m */
    public m f17914m;

    /* renamed from: n */
    public final k<InterfaceC4837t.b> f17915n;

    /* renamed from: o */
    public final k<InterfaceC4837t.e> f17916o;

    /* renamed from: p */
    public final e f17917p;

    /* renamed from: q */
    public final InterfaceC4486r.a f17918q;

    /* renamed from: r */
    public C4674s1 f17919r;

    /* renamed from: s */
    public InterfaceC4837t.c f17920s;

    /* renamed from: t */
    public g f17921t;

    /* renamed from: u */
    public g f17922u;

    /* renamed from: v */
    public AudioTrack f17923v;

    /* renamed from: w */
    public C4813e f17924w;

    /* renamed from: x */
    public j f17925x;

    /* renamed from: y */
    public j f17926y;

    /* renamed from: z */
    public C4403a3 f17927z;

    /* renamed from: u3.a0$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public static void m18933a(AudioTrack audioTrack, d dVar) {
            audioTrack.setPreferredDevice(dVar == null ? null : dVar.f17928a);
        }
    }

    /* renamed from: u3.a0$c */
    /* loaded from: classes.dex */
    public static final class c {
        /* renamed from: a */
        public static void m18934a(AudioTrack audioTrack, C4674s1 c4674s1) {
            LogSessionId m18497a = c4674s1.m18497a();
            if (m18497a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            audioTrack.setLogSessionId(m18497a);
        }
    }

    /* renamed from: u3.a0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final AudioDeviceInfo f17928a;

        public d(AudioDeviceInfo audioDeviceInfo) {
            this.f17928a = audioDeviceInfo;
        }
    }

    /* renamed from: u3.a0$e */
    /* loaded from: classes.dex */
    public interface e {

        /* renamed from: a */
        public static final e f17929a = new C4808b0.a().m18994g();

        /* renamed from: a */
        int mo18935a(int i10, int i11, int i12, int i13, int i14, int i15, double d10);
    }

    /* renamed from: u3.a0$f */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: b */
        public InterfaceC4819h f17931b;

        /* renamed from: c */
        public boolean f17932c;

        /* renamed from: d */
        public boolean f17933d;

        /* renamed from: g */
        public InterfaceC4486r.a f17936g;

        /* renamed from: a */
        public C4815f f17930a = C4815f.f18031c;

        /* renamed from: e */
        public int f17934e = 0;

        /* renamed from: f */
        public e f17935f = e.f17929a;

        /* renamed from: f */
        public C4806a0 m18941f() {
            if (this.f17931b == null) {
                this.f17931b = new h(new InterfaceC4817g[0]);
            }
            return new C4806a0(this);
        }

        /* renamed from: g */
        public f m18942g(C4815f c4815f) {
            C4014a.m15199e(c4815f);
            this.f17930a = c4815f;
            return this;
        }

        /* renamed from: h */
        public f m18943h(boolean z10) {
            this.f17933d = z10;
            return this;
        }

        /* renamed from: i */
        public f m18944i(boolean z10) {
            this.f17932c = z10;
            return this;
        }

        /* renamed from: j */
        public f m18945j(int i10) {
            this.f17934e = i10;
            return this;
        }
    }

    /* renamed from: u3.a0$g */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        public final C4463m1 f17937a;

        /* renamed from: b */
        public final int f17938b;

        /* renamed from: c */
        public final int f17939c;

        /* renamed from: d */
        public final int f17940d;

        /* renamed from: e */
        public final int f17941e;

        /* renamed from: f */
        public final int f17942f;

        /* renamed from: g */
        public final int f17943g;

        /* renamed from: h */
        public final int f17944h;

        /* renamed from: i */
        public final InterfaceC4817g[] f17945i;

        public g(C4463m1 c4463m1, int i10, int i11, int i12, int i13, int i14, int i15, int i16, InterfaceC4817g[] interfaceC4817gArr) {
            this.f17937a = c4463m1;
            this.f17938b = i10;
            this.f17939c = i11;
            this.f17940d = i12;
            this.f17941e = i13;
            this.f17942f = i14;
            this.f17943g = i15;
            this.f17944h = i16;
            this.f17945i = interfaceC4817gArr;
        }

        /* renamed from: i */
        public static AudioAttributes m18946i(C4813e c4813e, boolean z10) {
            return z10 ? m18947j() : c4813e.m19013b().f18011a;
        }

        /* renamed from: j */
        public static AudioAttributes m18947j() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        /* renamed from: a */
        public AudioTrack m18948a(boolean z10, C4813e c4813e, int i10) {
            try {
                AudioTrack m18951d = m18951d(z10, c4813e, i10);
                int state = m18951d.getState();
                if (state == 1) {
                    return m18951d;
                }
                try {
                    m18951d.release();
                } catch (Exception unused) {
                }
                throw new InterfaceC4837t.b(state, this.f17941e, this.f17942f, this.f17944h, this.f17937a, m18957l(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e10) {
                throw new InterfaceC4837t.b(0, this.f17941e, this.f17942f, this.f17944h, this.f17937a, m18957l(), e10);
            }
        }

        /* renamed from: b */
        public boolean m18949b(g gVar) {
            return gVar.f17939c == this.f17939c && gVar.f17943g == this.f17943g && gVar.f17941e == this.f17941e && gVar.f17942f == this.f17942f && gVar.f17940d == this.f17940d;
        }

        /* renamed from: c */
        public g m18950c(int i10) {
            return new g(this.f17937a, this.f17938b, this.f17939c, this.f17940d, this.f17941e, this.f17942f, this.f17943g, i10, this.f17945i);
        }

        /* renamed from: d */
        public final AudioTrack m18951d(boolean z10, C4813e c4813e, int i10) {
            int i11 = C4041n0.f14513a;
            return i11 >= 29 ? m18953f(z10, c4813e, i10) : i11 >= 21 ? m18952e(z10, c4813e, i10) : m18954g(c4813e, i10);
        }

        /* renamed from: e */
        public final AudioTrack m18952e(boolean z10, C4813e c4813e, int i10) {
            return new AudioTrack(m18946i(c4813e, z10), C4806a0.m18869N(this.f17941e, this.f17942f, this.f17943g), this.f17944h, 1, i10);
        }

        /* renamed from: f */
        public final AudioTrack m18953f(boolean z10, C4813e c4813e, int i10) {
            return new AudioTrack.Builder().setAudioAttributes(m18946i(c4813e, z10)).setAudioFormat(C4806a0.m18869N(this.f17941e, this.f17942f, this.f17943g)).setTransferMode(1).setBufferSizeInBytes(this.f17944h).setSessionId(i10).setOffloadedPlayback(this.f17939c == 1).build();
        }

        /* renamed from: g */
        public final AudioTrack m18954g(C4813e c4813e, int i10) {
            int m15456f0 = C4041n0.m15456f0(c4813e.f18007j);
            int i11 = this.f17941e;
            int i12 = this.f17942f;
            int i13 = this.f17943g;
            int i14 = this.f17944h;
            return i10 == 0 ? new AudioTrack(m15456f0, i11, i12, i13, i14, 1) : new AudioTrack(m15456f0, i11, i12, i13, i14, 1, i10);
        }

        /* renamed from: h */
        public long m18955h(long j10) {
            return (j10 * 1000000) / this.f17941e;
        }

        /* renamed from: k */
        public long m18956k(long j10) {
            return (j10 * 1000000) / this.f17937a.f16486G;
        }

        /* renamed from: l */
        public boolean m18957l() {
            return this.f17939c == 1;
        }
    }

    /* renamed from: u3.a0$h */
    /* loaded from: classes.dex */
    public static class h implements InterfaceC4819h {

        /* renamed from: a */
        public final InterfaceC4817g[] f17946a;

        /* renamed from: b */
        public final C4822i0 f17947b;

        /* renamed from: c */
        public final C4826k0 f17948c;

        public h(InterfaceC4817g... interfaceC4817gArr) {
            this(interfaceC4817gArr, new C4822i0(), new C4826k0());
        }

        public h(InterfaceC4817g[] interfaceC4817gArr, C4822i0 c4822i0, C4826k0 c4826k0) {
            InterfaceC4817g[] interfaceC4817gArr2 = new InterfaceC4817g[interfaceC4817gArr.length + 2];
            this.f17946a = interfaceC4817gArr2;
            System.arraycopy(interfaceC4817gArr, 0, interfaceC4817gArr2, 0, interfaceC4817gArr.length);
            this.f17947b = c4822i0;
            this.f17948c = c4826k0;
            interfaceC4817gArr2[interfaceC4817gArr.length] = c4822i0;
            interfaceC4817gArr2[interfaceC4817gArr.length + 1] = c4826k0;
        }

        @Override // p289u3.InterfaceC4819h
        /* renamed from: a */
        public long mo18958a(long j10) {
            return this.f17948c.m19114g(j10);
        }

        @Override // p289u3.InterfaceC4819h
        /* renamed from: b */
        public C4403a3 mo18959b(C4403a3 c4403a3) {
            this.f17948c.m19116i(c4403a3.f16153h);
            this.f17948c.m19115h(c4403a3.f16154i);
            return c4403a3;
        }

        @Override // p289u3.InterfaceC4819h
        /* renamed from: c */
        public long mo18960c() {
            return this.f17947b.m19083p();
        }

        @Override // p289u3.InterfaceC4819h
        /* renamed from: d */
        public boolean mo18961d(boolean z10) {
            this.f17947b.m19089v(z10);
            return z10;
        }

        @Override // p289u3.InterfaceC4819h
        /* renamed from: e */
        public InterfaceC4817g[] mo18962e() {
            return this.f17946a;
        }
    }

    /* renamed from: u3.a0$i */
    /* loaded from: classes.dex */
    public static final class i extends RuntimeException {
        public i(String str) {
            super(str);
        }
    }

    /* renamed from: u3.a0$j */
    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a */
        public final C4403a3 f17949a;

        /* renamed from: b */
        public final boolean f17950b;

        /* renamed from: c */
        public final long f17951c;

        /* renamed from: d */
        public final long f17952d;

        public j(C4403a3 c4403a3, boolean z10, long j10, long j11) {
            this.f17949a = c4403a3;
            this.f17950b = z10;
            this.f17951c = j10;
            this.f17952d = j11;
        }
    }

    /* renamed from: u3.a0$k */
    /* loaded from: classes.dex */
    public static final class k<T extends Exception> {

        /* renamed from: a */
        public final long f17953a;

        /* renamed from: b */
        public T f17954b;

        /* renamed from: c */
        public long f17955c;

        public k(long j10) {
            this.f17953a = j10;
        }

        /* renamed from: a */
        public void m18963a() {
            this.f17954b = null;
        }

        /* renamed from: b */
        public void m18964b(T t10) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.f17954b == null) {
                this.f17954b = t10;
                this.f17955c = this.f17953a + elapsedRealtime;
            }
            if (elapsedRealtime >= this.f17955c) {
                T t11 = this.f17954b;
                if (t11 != t10) {
                    t11.addSuppressed(t10);
                }
                T t12 = this.f17954b;
                m18963a();
                throw t12;
            }
        }
    }

    /* renamed from: u3.a0$l */
    /* loaded from: classes.dex */
    public final class l implements C4839v.a {
        public l() {
        }

        @Override // p289u3.C4839v.a
        /* renamed from: a */
        public void mo18965a(int i10, long j10) {
            if (C4806a0.this.f17920s != null) {
                C4806a0.this.f17920s.mo19036d(i10, j10, SystemClock.elapsedRealtime() - C4806a0.this.f17901b0);
            }
        }

        @Override // p289u3.C4839v.a
        /* renamed from: b */
        public void mo18966b(long j10) {
            if (C4806a0.this.f17920s != null) {
                C4806a0.this.f17920s.mo19034b(j10);
            }
        }

        @Override // p289u3.C4839v.a
        /* renamed from: c */
        public void mo18967c(long j10) {
            C4046r.m15529i("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j10);
        }

        @Override // p289u3.C4839v.a
        /* renamed from: d */
        public void mo18968d(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + C4806a0.this.m18892U() + ", " + C4806a0.this.m18893V();
            if (C4806a0.f17868e0) {
                throw new i(str);
            }
            C4046r.m15529i("DefaultAudioSink", str);
        }

        @Override // p289u3.C4839v.a
        /* renamed from: e */
        public void mo18969e(long j10, long j11, long j12, long j13) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j10 + ", " + j11 + ", " + j12 + ", " + j13 + ", " + C4806a0.this.m18892U() + ", " + C4806a0.this.m18893V();
            if (C4806a0.f17868e0) {
                throw new i(str);
            }
            C4046r.m15529i("DefaultAudioSink", str);
        }
    }

    /* renamed from: u3.a0$m */
    /* loaded from: classes.dex */
    public final class m {

        /* renamed from: a */
        public final Handler f17957a = new Handler(Looper.myLooper());

        /* renamed from: b */
        public final AudioTrack.StreamEventCallback f17958b;

        /* renamed from: u3.a0$m$a */
        /* loaded from: classes.dex */
        public class a extends AudioTrack.StreamEventCallback {

            /* renamed from: a */
            public final /* synthetic */ C4806a0 f17960a;

            public a(C4806a0 c4806a0) {
                this.f17960a = c4806a0;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(AudioTrack audioTrack, int i10) {
                if (audioTrack.equals(C4806a0.this.f17923v) && C4806a0.this.f17920s != null && C4806a0.this.f17893V) {
                    C4806a0.this.f17920s.mo19038f();
                }
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(AudioTrack audioTrack) {
                if (audioTrack.equals(C4806a0.this.f17923v) && C4806a0.this.f17920s != null && C4806a0.this.f17893V) {
                    C4806a0.this.f17920s.mo19038f();
                }
            }
        }

        public m() {
            this.f17958b = new a(C4806a0.this);
        }

        /* renamed from: a */
        public void m18970a(AudioTrack audioTrack) {
            Handler handler = this.f17957a;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC3749p(handler), this.f17958b);
        }

        /* renamed from: b */
        public void m18971b(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.f17958b);
            this.f17957a.removeCallbacksAndMessages(null);
        }
    }

    public C4806a0(f fVar) {
        this.f17898a = fVar.f17930a;
        InterfaceC4819h interfaceC4819h = fVar.f17931b;
        this.f17900b = interfaceC4819h;
        int i10 = C4041n0.f14513a;
        this.f17902c = i10 >= 21 && fVar.f17932c;
        this.f17912k = i10 >= 23 && fVar.f17933d;
        this.f17913l = i10 >= 29 ? fVar.f17934e : 0;
        this.f17917p = fVar.f17935f;
        C4026g c4026g = new C4026g(InterfaceC4020d.f14458a);
        this.f17909h = c4026g;
        c4026g.m15314e();
        this.f17910i = new C4839v(new l());
        C4842y c4842y = new C4842y();
        this.f17904d = c4842y;
        C4828l0 c4828l0 = new C4828l0();
        this.f17906e = c4828l0;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C4820h0(), c4842y, c4828l0);
        Collections.addAll(arrayList, interfaceC4819h.mo18962e());
        this.f17907f = (InterfaceC4817g[]) arrayList.toArray(new InterfaceC4817g[0]);
        this.f17908g = new InterfaceC4817g[]{new C4812d0()};
        this.f17882K = 1.0f;
        this.f17924w = C4813e.f17998n;
        this.f17895X = 0;
        this.f17896Y = new C4840w(0, 0.0f);
        C4403a3 c4403a3 = C4403a3.f16149k;
        this.f17926y = new j(c4403a3, false, 0L, 0L);
        this.f17927z = c4403a3;
        this.f17890S = -1;
        this.f17883L = new InterfaceC4817g[0];
        this.f17884M = new ByteBuffer[0];
        this.f17911j = new ArrayDeque<>();
        this.f17915n = new k<>(100L);
        this.f17916o = new k<>(100L);
        this.f17918q = fVar.f17936g;
    }

    /* renamed from: N */
    public static AudioFormat m18869N(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    /* renamed from: P */
    public static int m18870P(int i10, int i11, int i12) {
        int minBufferSize = AudioTrack.getMinBufferSize(i10, i11, i12);
        C4014a.m15200f(minBufferSize != -2);
        return minBufferSize;
    }

    /* renamed from: Q */
    public static int m18871Q(int i10, ByteBuffer byteBuffer) {
        switch (i10) {
            case 5:
            case 6:
            case 18:
                return C4807b.m18976e(byteBuffer);
            case 7:
            case 8:
                return C4810c0.m19005e(byteBuffer);
            case 9:
                int m19062m = C4816f0.m19062m(C4041n0.m15409I(byteBuffer, byteBuffer.position()));
                if (m19062m != -1) {
                    return m19062m;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            case 19:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i10);
            case 14:
                int m18973b = C4807b.m18973b(byteBuffer);
                if (m18973b == -1) {
                    return 0;
                }
                return C4807b.m18980i(byteBuffer, m18973b) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return C4809c.m18997c(byteBuffer);
            case 20:
                return C4818g0.m19075g(byteBuffer);
        }
    }

    /* renamed from: X */
    public static boolean m18872X(int i10) {
        return (C4041n0.f14513a >= 24 && i10 == -6) || i10 == -32;
    }

    /* renamed from: Z */
    public static boolean m18873Z(AudioTrack audioTrack) {
        return C4041n0.f14513a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m18874a0(AudioTrack audioTrack, C4026g c4026g) {
        try {
            audioTrack.flush();
            audioTrack.release();
            c4026g.m15314e();
            synchronized (f17869f0) {
                int i10 = f17871h0 - 1;
                f17871h0 = i10;
                if (i10 == 0) {
                    f17870g0.shutdown();
                    f17870g0 = null;
                }
            }
        } catch (Throwable th) {
            c4026g.m15314e();
            synchronized (f17869f0) {
                int i11 = f17871h0 - 1;
                f17871h0 = i11;
                if (i11 == 0) {
                    f17870g0.shutdown();
                    f17870g0 = null;
                }
                throw th;
            }
        }
    }

    /* renamed from: f0 */
    public static void m18875f0(final AudioTrack audioTrack, final C4026g c4026g) {
        c4026g.m15312c();
        synchronized (f17869f0) {
            if (f17870g0 == null) {
                f17870g0 = C4041n0.m15398C0("ExoPlayer:AudioTrackReleaseThread");
            }
            f17871h0++;
            f17870g0.execute(new Runnable() { // from class: u3.z
                @Override // java.lang.Runnable
                public final void run() {
                    C4806a0.m18874a0(audioTrack, c4026g);
                }
            });
        }
    }

    /* renamed from: k0 */
    public static void m18876k0(AudioTrack audioTrack, float f10) {
        audioTrack.setVolume(f10);
    }

    /* renamed from: l0 */
    public static void m18877l0(AudioTrack audioTrack, float f10) {
        audioTrack.setStereoVolume(f10, f10);
    }

    /* renamed from: r0 */
    public static int m18878r0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    /* renamed from: G */
    public final void m18881G(long j10) {
        C4403a3 mo18959b = m18919n0() ? this.f17900b.mo18959b(m18888O()) : C4403a3.f16149k;
        boolean mo18961d = m18919n0() ? this.f17900b.mo18961d(m18891T()) : false;
        this.f17911j.add(new j(mo18959b, mo18961d, Math.max(0L, j10), this.f17922u.m18955h(m18893V())));
        m18917m0();
        InterfaceC4837t.c cVar = this.f17920s;
        if (cVar != null) {
            cVar.onSkipSilenceEnabledChanged(mo18961d);
        }
    }

    /* renamed from: H */
    public final long m18882H(long j10) {
        while (!this.f17911j.isEmpty() && j10 >= this.f17911j.getFirst().f17952d) {
            this.f17926y = this.f17911j.remove();
        }
        j jVar = this.f17926y;
        long j11 = j10 - jVar.f17952d;
        if (jVar.f17949a.equals(C4403a3.f16149k)) {
            return this.f17926y.f17951c + j11;
        }
        if (this.f17911j.isEmpty()) {
            return this.f17926y.f17951c + this.f17900b.mo18958a(j11);
        }
        j first = this.f17911j.getFirst();
        return first.f17951c - C4041n0.m15443Z(first.f17952d - j10, this.f17926y.f17949a.f16153h);
    }

    /* renamed from: I */
    public final long m18883I(long j10) {
        return j10 + this.f17922u.m18955h(this.f17900b.mo18960c());
    }

    /* renamed from: J */
    public final AudioTrack m18884J(g gVar) {
        try {
            AudioTrack m18948a = gVar.m18948a(this.f17899a0, this.f17924w, this.f17895X);
            InterfaceC4486r.a aVar = this.f17918q;
            if (aVar != null) {
                aVar.m17513B(m18873Z(m18948a));
            }
            return m18948a;
        } catch (InterfaceC4837t.b e10) {
            InterfaceC4837t.c cVar = this.f17920s;
            if (cVar != null) {
                cVar.mo19033a(e10);
            }
            throw e10;
        }
    }

    /* renamed from: K */
    public final AudioTrack m18885K() {
        try {
            return m18884J((g) C4014a.m15199e(this.f17922u));
        } catch (InterfaceC4837t.b e10) {
            g gVar = this.f17922u;
            if (gVar.f17944h > 1000000) {
                g m18950c = gVar.m18950c(1000000);
                try {
                    AudioTrack m18884J = m18884J(m18950c);
                    this.f17922u = m18950c;
                    return m18884J;
                } catch (InterfaceC4837t.b e11) {
                    e10.addSuppressed(e11);
                    m18898b0();
                    throw e10;
                }
            }
            m18898b0();
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m18886L() {
        /*
            r9 = this;
            int r0 = r9.f17890S
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.f17890S = r3
        L9:
            r0 = r2
            goto Lc
        Lb:
            r0 = r3
        Lc:
            int r4 = r9.f17890S
            u3.g[] r5 = r9.f17883L
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo19068f()
        L1f:
            r9.m18902d0(r7)
            boolean r0 = r4.mo19066c()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.f17890S
            int r0 = r0 + r2
            r9.f17890S = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f17887P
            if (r0 == 0) goto L3b
            r9.m18924q0(r0, r7)
            java.nio.ByteBuffer r0 = r9.f17887P
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.f17890S = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p289u3.C4806a0.m18886L():boolean");
    }

    /* renamed from: M */
    public final void m18887M() {
        int i10 = 0;
        while (true) {
            InterfaceC4817g[] interfaceC4817gArr = this.f17883L;
            if (i10 >= interfaceC4817gArr.length) {
                return;
            }
            InterfaceC4817g interfaceC4817g = interfaceC4817gArr[i10];
            interfaceC4817g.flush();
            this.f17884M[i10] = interfaceC4817g.mo19065b();
            i10++;
        }
    }

    /* renamed from: O */
    public final C4403a3 m18888O() {
        return m18889R().f17949a;
    }

    /* renamed from: R */
    public final j m18889R() {
        j jVar = this.f17925x;
        return jVar != null ? jVar : !this.f17911j.isEmpty() ? this.f17911j.getLast() : this.f17926y;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: S */
    public final int m18890S(AudioFormat audioFormat, AudioAttributes audioAttributes) {
        int i10 = C4041n0.f14513a;
        if (i10 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i10 == 30 && C4041n0.f14516d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* renamed from: T */
    public boolean m18891T() {
        return m18889R().f17950b;
    }

    /* renamed from: U */
    public final long m18892U() {
        return this.f17922u.f17939c == 0 ? this.f17874C / r0.f17938b : this.f17875D;
    }

    /* renamed from: V */
    public final long m18893V() {
        return this.f17922u.f17939c == 0 ? this.f17876E / r0.f17940d : this.f17877F;
    }

    /* renamed from: W */
    public final boolean m18894W() {
        C4674s1 c4674s1;
        if (!this.f17909h.m15313d()) {
            return false;
        }
        AudioTrack m18885K = m18885K();
        this.f17923v = m18885K;
        if (m18873Z(m18885K)) {
            m18904e0(this.f17923v);
            if (this.f17913l != 3) {
                AudioTrack audioTrack = this.f17923v;
                C4463m1 c4463m1 = this.f17922u.f17937a;
                audioTrack.setOffloadDelayPadding(c4463m1.f16488I, c4463m1.f16489J);
            }
        }
        int i10 = C4041n0.f14513a;
        if (i10 >= 31 && (c4674s1 = this.f17919r) != null) {
            c.m18934a(this.f17923v, c4674s1);
        }
        this.f17895X = this.f17923v.getAudioSessionId();
        C4839v c4839v = this.f17910i;
        AudioTrack audioTrack2 = this.f17923v;
        g gVar = this.f17922u;
        c4839v.m19182s(audioTrack2, gVar.f17939c == 2, gVar.f17943g, gVar.f17940d, gVar.f17944h);
        m18913j0();
        int i11 = this.f17896Y.f18193a;
        if (i11 != 0) {
            this.f17923v.attachAuxEffect(i11);
            this.f17923v.setAuxEffectSendLevel(this.f17896Y.f18194b);
        }
        d dVar = this.f17897Z;
        if (dVar != null && i10 >= 23) {
            b.m18933a(this.f17923v, dVar);
        }
        this.f17880I = true;
        return true;
    }

    /* renamed from: Y */
    public final boolean m18895Y() {
        return this.f17923v != null;
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: a */
    public boolean mo18896a(C4463m1 c4463m1) {
        return mo18926s(c4463m1) != 0;
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: b */
    public void mo18897b(C4674s1 c4674s1) {
        this.f17919r = c4674s1;
    }

    /* renamed from: b0 */
    public final void m18898b0() {
        if (this.f17922u.m18957l()) {
            this.f17903c0 = true;
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: c */
    public boolean mo18899c() {
        return !m18895Y() || (this.f17891T && !mo18914k());
    }

    /* renamed from: c0 */
    public final void m18900c0() {
        if (this.f17892U) {
            return;
        }
        this.f17892U = true;
        this.f17910i.m19171g(m18893V());
        this.f17923v.stop();
        this.f17873B = 0;
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: d */
    public void mo18901d(C4403a3 c4403a3) {
        C4403a3 c4403a32 = new C4403a3(C4041n0.m15475p(c4403a3.f16153h, 0.1f, 8.0f), C4041n0.m15475p(c4403a3.f16154i, 0.1f, 8.0f));
        if (!this.f17912k || C4041n0.f14513a < 23) {
            m18909h0(c4403a32, m18891T());
        } else {
            m18911i0(c4403a32);
        }
    }

    /* renamed from: d0 */
    public final void m18902d0(long j10) {
        ByteBuffer byteBuffer;
        int length = this.f17883L.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.f17884M[i10 - 1];
            } else {
                byteBuffer = this.f17885N;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC4817g.f18051a;
                }
            }
            if (i10 == length) {
                m18924q0(byteBuffer, j10);
            } else {
                InterfaceC4817g interfaceC4817g = this.f17883L[i10];
                if (i10 > this.f17890S) {
                    interfaceC4817g.mo19009e(byteBuffer);
                }
                ByteBuffer mo19065b = interfaceC4817g.mo19065b();
                this.f17884M[i10] = mo19065b;
                if (mo19065b.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i10--;
            }
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: e */
    public void mo18903e(float f10) {
        if (this.f17882K != f10) {
            this.f17882K = f10;
            m18913j0();
        }
    }

    /* renamed from: e0 */
    public final void m18904e0(AudioTrack audioTrack) {
        if (this.f17914m == null) {
            this.f17914m = new m();
        }
        this.f17914m.m18970a(audioTrack);
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: f */
    public void mo18905f(AudioDeviceInfo audioDeviceInfo) {
        d dVar = audioDeviceInfo == null ? null : new d(audioDeviceInfo);
        this.f17897Z = dVar;
        AudioTrack audioTrack = this.f17923v;
        if (audioTrack != null) {
            b.m18933a(audioTrack, dVar);
        }
    }

    @Override // p289u3.InterfaceC4837t
    public void flush() {
        if (m18895Y()) {
            m18907g0();
            if (this.f17910i.m19173i()) {
                this.f17923v.pause();
            }
            if (m18873Z(this.f17923v)) {
                ((m) C4014a.m15199e(this.f17914m)).m18971b(this.f17923v);
            }
            if (C4041n0.f14513a < 21 && !this.f17894W) {
                this.f17895X = 0;
            }
            g gVar = this.f17921t;
            if (gVar != null) {
                this.f17922u = gVar;
                this.f17921t = null;
            }
            this.f17910i.m19180q();
            m18875f0(this.f17923v, this.f17909h);
            this.f17923v = null;
        }
        this.f17916o.m18963a();
        this.f17915n.m18963a();
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: g */
    public void mo18906g(C4840w c4840w) {
        if (this.f17896Y.equals(c4840w)) {
            return;
        }
        int i10 = c4840w.f18193a;
        float f10 = c4840w.f18194b;
        AudioTrack audioTrack = this.f17923v;
        if (audioTrack != null) {
            if (this.f17896Y.f18193a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f17923v.setAuxEffectSendLevel(f10);
            }
        }
        this.f17896Y = c4840w;
    }

    /* renamed from: g0 */
    public final void m18907g0() {
        this.f17874C = 0L;
        this.f17875D = 0L;
        this.f17876E = 0L;
        this.f17877F = 0L;
        this.f17905d0 = false;
        this.f17878G = 0;
        this.f17926y = new j(m18888O(), m18891T(), 0L, 0L);
        this.f17881J = 0L;
        this.f17925x = null;
        this.f17911j.clear();
        this.f17885N = null;
        this.f17886O = 0;
        this.f17887P = null;
        this.f17892U = false;
        this.f17891T = false;
        this.f17890S = -1;
        this.f17872A = null;
        this.f17873B = 0;
        this.f17906e.m19118n();
        m18887M();
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: h */
    public C4403a3 mo18908h() {
        return this.f17912k ? this.f17927z : m18888O();
    }

    /* renamed from: h0 */
    public final void m18909h0(C4403a3 c4403a3, boolean z10) {
        j m18889R = m18889R();
        if (c4403a3.equals(m18889R.f17949a) && z10 == m18889R.f17950b) {
            return;
        }
        j jVar = new j(c4403a3, z10, -9223372036854775807L, -9223372036854775807L);
        if (m18895Y()) {
            this.f17925x = jVar;
        } else {
            this.f17926y = jVar;
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: i */
    public void mo18910i(C4813e c4813e) {
        if (this.f17924w.equals(c4813e)) {
            return;
        }
        this.f17924w = c4813e;
        if (this.f17899a0) {
            return;
        }
        flush();
    }

    /* renamed from: i0 */
    public final void m18911i0(C4403a3 c4403a3) {
        if (m18895Y()) {
            try {
                this.f17923v.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c4403a3.f16153h).setPitch(c4403a3.f16154i).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                C4046r.m15530j("DefaultAudioSink", "Failed to set playback params", e10);
            }
            c4403a3 = new C4403a3(this.f17923v.getPlaybackParams().getSpeed(), this.f17923v.getPlaybackParams().getPitch());
            this.f17910i.m19183t(c4403a3.f16153h);
        }
        this.f17927z = c4403a3;
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: j */
    public void mo18912j() {
        if (!this.f17891T && m18895Y() && m18886L()) {
            m18900c0();
            this.f17891T = true;
        }
    }

    /* renamed from: j0 */
    public final void m18913j0() {
        if (m18895Y()) {
            if (C4041n0.f14513a >= 21) {
                m18876k0(this.f17923v, this.f17882K);
            } else {
                m18877l0(this.f17923v, this.f17882K);
            }
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: k */
    public boolean mo18914k() {
        return m18895Y() && this.f17910i.m19172h(m18893V());
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: l */
    public void mo18915l(int i10) {
        if (this.f17895X != i10) {
            this.f17895X = i10;
            this.f17894W = i10 != 0;
            flush();
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: m */
    public long mo18916m(boolean z10) {
        if (!m18895Y() || this.f17880I) {
            return Long.MIN_VALUE;
        }
        return m18883I(m18882H(Math.min(this.f17910i.m19168d(z10), this.f17922u.m18955h(m18893V()))));
    }

    /* renamed from: m0 */
    public final void m18917m0() {
        InterfaceC4817g[] interfaceC4817gArr = this.f17922u.f17945i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC4817g interfaceC4817g : interfaceC4817gArr) {
            if (interfaceC4817g.mo19064a()) {
                arrayList.add(interfaceC4817g);
            } else {
                interfaceC4817g.flush();
            }
        }
        int size = arrayList.size();
        this.f17883L = (InterfaceC4817g[]) arrayList.toArray(new InterfaceC4817g[size]);
        this.f17884M = new ByteBuffer[size];
        m18887M();
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: n */
    public void mo18918n() {
        if (this.f17899a0) {
            this.f17899a0 = false;
            flush();
        }
    }

    /* renamed from: n0 */
    public final boolean m18919n0() {
        return (this.f17899a0 || !"audio/raw".equals(this.f17922u.f17937a.f16506s) || m18920o0(this.f17922u.f17937a.f16487H)) ? false : true;
    }

    /* renamed from: o0 */
    public final boolean m18920o0(int i10) {
        return this.f17902c && C4041n0.m15482s0(i10);
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: p */
    public void mo18921p() {
        this.f17879H = true;
    }

    /* renamed from: p0 */
    public final boolean m18922p0(C4463m1 c4463m1, C4813e c4813e) {
        int m15549f;
        int m15405G;
        int m18890S;
        if (C4041n0.f14513a < 29 || this.f17913l == 0 || (m15549f = C4050v.m15549f((String) C4014a.m15199e(c4463m1.f16506s), c4463m1.f16503p)) == 0 || (m15405G = C4041n0.m15405G(c4463m1.f16485F)) == 0 || (m18890S = m18890S(m18869N(c4463m1.f16486G, m15405G, m15549f), c4813e.m19013b().f18011a)) == 0) {
            return false;
        }
        if (m18890S == 1) {
            return ((c4463m1.f16488I != 0 || c4463m1.f16489J != 0) && (this.f17913l == 1)) ? false : true;
        }
        if (m18890S == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // p289u3.InterfaceC4837t
    public void pause() {
        this.f17893V = false;
        if (m18895Y() && this.f17910i.m19179p()) {
            this.f17923v.pause();
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: q */
    public void mo18923q(InterfaceC4837t.c cVar) {
        this.f17920s = cVar;
    }

    /* renamed from: q0 */
    public final void m18924q0(ByteBuffer byteBuffer, long j10) {
        int m18878r0;
        InterfaceC4837t.c cVar;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.f17887P;
            if (byteBuffer2 != null) {
                C4014a.m15195a(byteBuffer2 == byteBuffer);
            } else {
                this.f17887P = byteBuffer;
                if (C4041n0.f14513a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f17888Q;
                    if (bArr == null || bArr.length < remaining) {
                        this.f17888Q = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f17888Q, 0, remaining);
                    byteBuffer.position(position);
                    this.f17889R = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (C4041n0.f14513a < 21) {
                int m19167c = this.f17910i.m19167c(this.f17876E);
                if (m19167c > 0) {
                    m18878r0 = this.f17923v.write(this.f17888Q, this.f17889R, Math.min(remaining2, m19167c));
                    if (m18878r0 > 0) {
                        this.f17889R += m18878r0;
                        byteBuffer.position(byteBuffer.position() + m18878r0);
                    }
                } else {
                    m18878r0 = 0;
                }
            } else if (this.f17899a0) {
                C4014a.m15200f(j10 != -9223372036854775807L);
                m18878r0 = m18927s0(this.f17923v, byteBuffer, remaining2, j10);
            } else {
                m18878r0 = m18878r0(this.f17923v, byteBuffer, remaining2);
            }
            this.f17901b0 = SystemClock.elapsedRealtime();
            if (m18878r0 < 0) {
                InterfaceC4837t.e eVar = new InterfaceC4837t.e(m18878r0, this.f17922u.f17937a, m18872X(m18878r0) && this.f17877F > 0);
                InterfaceC4837t.c cVar2 = this.f17920s;
                if (cVar2 != null) {
                    cVar2.mo19033a(eVar);
                }
                if (eVar.f18147i) {
                    throw eVar;
                }
                this.f17916o.m18964b(eVar);
                return;
            }
            this.f17916o.m18963a();
            if (m18873Z(this.f17923v)) {
                if (this.f17877F > 0) {
                    this.f17905d0 = false;
                }
                if (this.f17893V && (cVar = this.f17920s) != null && m18878r0 < remaining2 && !this.f17905d0) {
                    cVar.mo19035c();
                }
            }
            int i10 = this.f17922u.f17939c;
            if (i10 == 0) {
                this.f17876E += m18878r0;
            }
            if (m18878r0 == remaining2) {
                if (i10 != 0) {
                    C4014a.m15200f(byteBuffer == this.f17885N);
                    this.f17877F += this.f17878G * this.f17886O;
                }
                this.f17887P = null;
            }
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: r */
    public void mo18925r() {
        C4014a.m15200f(C4041n0.f14513a >= 21);
        C4014a.m15200f(this.f17894W);
        if (this.f17899a0) {
            return;
        }
        this.f17899a0 = true;
        flush();
    }

    @Override // p289u3.InterfaceC4837t
    public void reset() {
        flush();
        for (InterfaceC4817g interfaceC4817g : this.f17907f) {
            interfaceC4817g.reset();
        }
        for (InterfaceC4817g interfaceC4817g2 : this.f17908g) {
            interfaceC4817g2.reset();
        }
        this.f17893V = false;
        this.f17903c0 = false;
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: s */
    public int mo18926s(C4463m1 c4463m1) {
        if (!"audio/raw".equals(c4463m1.f16506s)) {
            return ((this.f17903c0 || !m18922p0(c4463m1, this.f17924w)) && !this.f17898a.m19046h(c4463m1)) ? 0 : 2;
        }
        if (C4041n0.m15484t0(c4463m1.f16487H)) {
            int i10 = c4463m1.f16487H;
            return (i10 == 2 || (this.f17902c && i10 == 4)) ? 2 : 1;
        }
        C4046r.m15529i("DefaultAudioSink", "Invalid PCM encoding: " + c4463m1.f16487H);
        return 0;
    }

    /* renamed from: s0 */
    public final int m18927s0(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (C4041n0.f14513a >= 26) {
            return audioTrack.write(byteBuffer, i10, 1, j10 * 1000);
        }
        if (this.f17872A == null) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            this.f17872A = allocate;
            allocate.order(ByteOrder.BIG_ENDIAN);
            this.f17872A.putInt(1431633921);
        }
        if (this.f17873B == 0) {
            this.f17872A.putInt(4, i10);
            this.f17872A.putLong(8, j10 * 1000);
            this.f17872A.position(0);
            this.f17873B = i10;
        }
        int remaining = this.f17872A.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.f17872A, remaining, 1);
            if (write < 0) {
                this.f17873B = 0;
                return write;
            }
            if (write < remaining) {
                return 0;
            }
        }
        int m18878r0 = m18878r0(audioTrack, byteBuffer, i10);
        if (m18878r0 < 0) {
            this.f17873B = 0;
            return m18878r0;
        }
        this.f17873B -= m18878r0;
        return m18878r0;
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: t */
    public void mo18928t() {
        this.f17893V = true;
        if (m18895Y()) {
            this.f17910i.m19184u();
            this.f17923v.play();
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: u */
    public boolean mo18929u(ByteBuffer byteBuffer, long j10, int i10) {
        ByteBuffer byteBuffer2 = this.f17885N;
        C4014a.m15195a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.f17921t != null) {
            if (!m18886L()) {
                return false;
            }
            if (this.f17921t.m18949b(this.f17922u)) {
                this.f17922u = this.f17921t;
                this.f17921t = null;
                if (m18873Z(this.f17923v) && this.f17913l != 3) {
                    if (this.f17923v.getPlayState() == 3) {
                        this.f17923v.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.f17923v;
                    C4463m1 c4463m1 = this.f17922u.f17937a;
                    audioTrack.setOffloadDelayPadding(c4463m1.f16488I, c4463m1.f16489J);
                    this.f17905d0 = true;
                }
            } else {
                m18900c0();
                if (mo18914k()) {
                    return false;
                }
                flush();
            }
            m18881G(j10);
        }
        if (!m18895Y()) {
            try {
                if (!m18894W()) {
                    return false;
                }
            } catch (InterfaceC4837t.b e10) {
                if (e10.f18142i) {
                    throw e10;
                }
                this.f17915n.m18964b(e10);
                return false;
            }
        }
        this.f17915n.m18963a();
        if (this.f17880I) {
            this.f17881J = Math.max(0L, j10);
            this.f17879H = false;
            this.f17880I = false;
            if (this.f17912k && C4041n0.f14513a >= 23) {
                m18911i0(this.f17927z);
            }
            m18881G(j10);
            if (this.f17893V) {
                mo18928t();
            }
        }
        if (!this.f17910i.m19175k(m18893V())) {
            return false;
        }
        if (this.f17885N == null) {
            C4014a.m15195a(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            g gVar = this.f17922u;
            if (gVar.f17939c != 0 && this.f17878G == 0) {
                int m18871Q = m18871Q(gVar.f17943g, byteBuffer);
                this.f17878G = m18871Q;
                if (m18871Q == 0) {
                    return true;
                }
            }
            if (this.f17925x != null) {
                if (!m18886L()) {
                    return false;
                }
                m18881G(j10);
                this.f17925x = null;
            }
            long m18956k = this.f17881J + this.f17922u.m18956k(m18892U() - this.f17906e.m19117m());
            if (!this.f17879H && Math.abs(m18956k - j10) > 200000) {
                InterfaceC4837t.c cVar = this.f17920s;
                if (cVar != null) {
                    cVar.mo19033a(new InterfaceC4837t.d(j10, m18956k));
                }
                this.f17879H = true;
            }
            if (this.f17879H) {
                if (!m18886L()) {
                    return false;
                }
                long j11 = j10 - m18956k;
                this.f17881J += j11;
                this.f17879H = false;
                m18881G(j10);
                InterfaceC4837t.c cVar2 = this.f17920s;
                if (cVar2 != null && j11 != 0) {
                    cVar2.mo19037e();
                }
            }
            if (this.f17922u.f17939c == 0) {
                this.f17874C += byteBuffer.remaining();
            } else {
                this.f17875D += this.f17878G * i10;
            }
            this.f17885N = byteBuffer;
            this.f17886O = i10;
        }
        m18902d0(j10);
        if (!this.f17885N.hasRemaining()) {
            this.f17885N = null;
            this.f17886O = 0;
            return true;
        }
        if (!this.f17910i.m19174j(m18893V())) {
            return false;
        }
        C4046r.m15529i("DefaultAudioSink", "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: v */
    public void mo18930v(C4463m1 c4463m1, int i10, int[] iArr) {
        InterfaceC4817g[] interfaceC4817gArr;
        int i11;
        int i12;
        int i13;
        int i14;
        int intValue;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int mo18935a;
        int[] iArr2;
        if ("audio/raw".equals(c4463m1.f16506s)) {
            C4014a.m15195a(C4041n0.m15484t0(c4463m1.f16487H));
            i11 = C4041n0.m15452d0(c4463m1.f16487H, c4463m1.f16485F);
            InterfaceC4817g[] interfaceC4817gArr2 = m18920o0(c4463m1.f16487H) ? this.f17908g : this.f17907f;
            this.f17906e.m19119o(c4463m1.f16488I, c4463m1.f16489J);
            if (C4041n0.f14513a < 21 && c4463m1.f16485F == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i20 = 0; i20 < 6; i20++) {
                    iArr2[i20] = i20;
                }
            } else {
                iArr2 = iArr;
            }
            this.f17904d.m19188m(iArr2);
            InterfaceC4817g.a aVar = new InterfaceC4817g.a(c4463m1.f16486G, c4463m1.f16485F, c4463m1.f16487H);
            for (InterfaceC4817g interfaceC4817g : interfaceC4817gArr2) {
                try {
                    InterfaceC4817g.a mo19067d = interfaceC4817g.mo19067d(aVar);
                    if (interfaceC4817g.mo19064a()) {
                        aVar = mo19067d;
                    }
                } catch (InterfaceC4817g.b e10) {
                    throw new InterfaceC4837t.a(e10, c4463m1);
                }
            }
            int i21 = aVar.f18055c;
            int i22 = aVar.f18053a;
            int m15405G = C4041n0.m15405G(aVar.f18054b);
            i14 = 0;
            interfaceC4817gArr = interfaceC4817gArr2;
            i12 = C4041n0.m15452d0(i21, aVar.f18054b);
            i15 = i21;
            i13 = i22;
            intValue = m15405G;
        } else {
            InterfaceC4817g[] interfaceC4817gArr3 = new InterfaceC4817g[0];
            int i23 = c4463m1.f16486G;
            if (m18922p0(c4463m1, this.f17924w)) {
                interfaceC4817gArr = interfaceC4817gArr3;
                i11 = -1;
                i12 = -1;
                i14 = 1;
                i13 = i23;
                i15 = C4050v.m15549f((String) C4014a.m15199e(c4463m1.f16506s), c4463m1.f16503p);
                intValue = C4041n0.m15405G(c4463m1.f16485F);
            } else {
                Pair<Integer, Integer> m19045f = this.f17898a.m19045f(c4463m1);
                if (m19045f == null) {
                    throw new InterfaceC4837t.a("Unable to configure passthrough for: " + c4463m1, c4463m1);
                }
                int intValue2 = ((Integer) m19045f.first).intValue();
                interfaceC4817gArr = interfaceC4817gArr3;
                i11 = -1;
                i12 = -1;
                i13 = i23;
                i14 = 2;
                intValue = ((Integer) m19045f.second).intValue();
                i15 = intValue2;
            }
        }
        if (i15 == 0) {
            throw new InterfaceC4837t.a("Invalid output encoding (mode=" + i14 + ") for: " + c4463m1, c4463m1);
        }
        if (intValue == 0) {
            throw new InterfaceC4837t.a("Invalid output channel config (mode=" + i14 + ") for: " + c4463m1, c4463m1);
        }
        if (i10 != 0) {
            mo18935a = i10;
            i16 = i15;
            i17 = intValue;
            i18 = i12;
            i19 = i13;
        } else {
            i16 = i15;
            i17 = intValue;
            i18 = i12;
            i19 = i13;
            mo18935a = this.f17917p.mo18935a(m18870P(i13, intValue, i15), i15, i14, i12 != -1 ? i12 : 1, i13, c4463m1.f16502o, this.f17912k ? 8.0d : 1.0d);
        }
        this.f17903c0 = false;
        g gVar = new g(c4463m1, i11, i14, i18, i19, i17, i16, mo18935a, interfaceC4817gArr);
        if (m18895Y()) {
            this.f17921t = gVar;
        } else {
            this.f17922u = gVar;
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: w */
    public void mo18931w() {
        if (C4041n0.f14513a < 25) {
            flush();
            return;
        }
        this.f17916o.m18963a();
        this.f17915n.m18963a();
        if (m18895Y()) {
            m18907g0();
            if (this.f17910i.m19173i()) {
                this.f17923v.pause();
            }
            this.f17923v.flush();
            this.f17910i.m19180q();
            C4839v c4839v = this.f17910i;
            AudioTrack audioTrack = this.f17923v;
            g gVar = this.f17922u;
            c4839v.m19182s(audioTrack, gVar.f17939c == 2, gVar.f17943g, gVar.f17940d, gVar.f17944h);
            this.f17880I = true;
        }
    }

    @Override // p289u3.InterfaceC4837t
    /* renamed from: x */
    public void mo18932x(boolean z10) {
        m18909h0(m18888O(), z10);
    }
}
