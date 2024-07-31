package p264s3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p047d5.C1547b;
import p047d5.C1550e;
import p047d5.InterfaceC1559n;
import p126i7.AbstractC2651u;
import p152k4.C3348a;
import p152k4.InterfaceC3352e;
import p193n5.AbstractC3734b0;
import p193n5.C3736c0;
import p193n5.InterfaceC3752s;
import p206o5.InterfaceC3900e;
import p222p5.C4014a;
import p222p5.C4019c0;
import p222p5.C4021d0;
import p222p5.C4026g;
import p222p5.C4036l;
import p222p5.C4041n0;
import p222p5.C4045q;
import p222p5.C4046r;
import p222p5.InterfaceC4020d;
import p222p5.InterfaceC4040n;
import p236q5.C4192y;
import p236q5.InterfaceC4177j;
import p236q5.InterfaceC4190w;
import p251r5.C4305f;
import p251r5.InterfaceC4300a;
import p264s3.AbstractC4505u3;
import p264s3.C4405b;
import p264s3.C4416d;
import p264s3.C4425e3;
import p264s3.C4443i1;
import p264s3.C4480p3;
import p264s3.C4494s2;
import p264s3.C4512w0;
import p264s3.InterfaceC4409b3;
import p264s3.InterfaceC4486r;
import p275t3.C4668q1;
import p275t3.C4674s1;
import p275t3.InterfaceC4618a;
import p275t3.InterfaceC4621b;
import p289u3.C4813e;
import p289u3.InterfaceC4836s;
import p290u4.C4885u0;
import p290u4.InterfaceC4873o0;
import p290u4.InterfaceC4882t;
import p304v3.C5108e;
import p304v3.C5112i;

/* renamed from: s3.w0 */
/* loaded from: classes.dex */
public final class C4512w0 extends AbstractC4421e implements InterfaceC4486r {

    /* renamed from: A */
    public final C4416d f16885A;

    /* renamed from: B */
    public final C4480p3 f16886B;

    /* renamed from: C */
    public final C4404a4 f16887C;

    /* renamed from: D */
    public final C4410b4 f16888D;

    /* renamed from: E */
    public final long f16889E;

    /* renamed from: F */
    public int f16890F;

    /* renamed from: G */
    public boolean f16891G;

    /* renamed from: H */
    public int f16892H;

    /* renamed from: I */
    public int f16893I;

    /* renamed from: J */
    public boolean f16894J;

    /* renamed from: K */
    public int f16895K;

    /* renamed from: L */
    public C4465m3 f16896L;

    /* renamed from: M */
    public InterfaceC4873o0 f16897M;

    /* renamed from: N */
    public boolean f16898N;

    /* renamed from: O */
    public InterfaceC4409b3.b f16899O;

    /* renamed from: P */
    public C4528z1 f16900P;

    /* renamed from: Q */
    public C4528z1 f16901Q;

    /* renamed from: R */
    public C4463m1 f16902R;

    /* renamed from: S */
    public C4463m1 f16903S;

    /* renamed from: T */
    public AudioTrack f16904T;

    /* renamed from: U */
    public Object f16905U;

    /* renamed from: V */
    public Surface f16906V;

    /* renamed from: W */
    public SurfaceHolder f16907W;

    /* renamed from: X */
    public C4305f f16908X;

    /* renamed from: Y */
    public boolean f16909Y;

    /* renamed from: Z */
    public TextureView f16910Z;

    /* renamed from: a0 */
    public int f16911a0;

    /* renamed from: b */
    public final C3736c0 f16912b;

    /* renamed from: b0 */
    public int f16913b0;

    /* renamed from: c */
    public final InterfaceC4409b3.b f16914c;

    /* renamed from: c0 */
    public C4021d0 f16915c0;

    /* renamed from: d */
    public final C4026g f16916d;

    /* renamed from: d0 */
    public C5108e f16917d0;

    /* renamed from: e */
    public final Context f16918e;

    /* renamed from: e0 */
    public C5108e f16919e0;

    /* renamed from: f */
    public final InterfaceC4409b3 f16920f;

    /* renamed from: f0 */
    public int f16921f0;

    /* renamed from: g */
    public final InterfaceC4445i3[] f16922g;

    /* renamed from: g0 */
    public C4813e f16923g0;

    /* renamed from: h */
    public final AbstractC3734b0 f16924h;

    /* renamed from: h0 */
    public float f16925h0;

    /* renamed from: i */
    public final InterfaceC4040n f16926i;

    /* renamed from: i0 */
    public boolean f16927i0;

    /* renamed from: j */
    public final C4443i1.f f16928j;

    /* renamed from: j0 */
    public C1550e f16929j0;

    /* renamed from: k */
    public final C4443i1 f16930k;

    /* renamed from: k0 */
    public boolean f16931k0;

    /* renamed from: l */
    public final C4045q<InterfaceC4409b3.d> f16932l;

    /* renamed from: l0 */
    public boolean f16933l0;

    /* renamed from: m */
    public final CopyOnWriteArraySet<InterfaceC4486r.a> f16934m;

    /* renamed from: m0 */
    public C4019c0 f16935m0;

    /* renamed from: n */
    public final AbstractC4505u3.b f16936n;

    /* renamed from: n0 */
    public boolean f16937n0;

    /* renamed from: o */
    public final List<e> f16938o;

    /* renamed from: o0 */
    public boolean f16939o0;

    /* renamed from: p */
    public final boolean f16940p;

    /* renamed from: p0 */
    public C4471o f16941p0;

    /* renamed from: q */
    public final InterfaceC4882t.a f16942q;

    /* renamed from: q0 */
    public C4192y f16943q0;

    /* renamed from: r */
    public final InterfaceC4618a f16944r;

    /* renamed from: r0 */
    public C4528z1 f16945r0;

    /* renamed from: s */
    public final Looper f16946s;

    /* renamed from: s0 */
    public C4524y2 f16947s0;

    /* renamed from: t */
    public final InterfaceC3900e f16948t;

    /* renamed from: t0 */
    public int f16949t0;

    /* renamed from: u */
    public final long f16950u;

    /* renamed from: u0 */
    public int f16951u0;

    /* renamed from: v */
    public final long f16952v;

    /* renamed from: v0 */
    public long f16953v0;

    /* renamed from: w */
    public final InterfaceC4020d f16954w;

    /* renamed from: x */
    public final c f16955x;

    /* renamed from: y */
    public final d f16956y;

    /* renamed from: z */
    public final C4405b f16957z;

    /* renamed from: s3.w0$b */
    /* loaded from: classes.dex */
    public static final class b {
        /* renamed from: a */
        public static C4674s1 m17828a(Context context, C4512w0 c4512w0, boolean z10) {
            C4668q1 m18469A0 = C4668q1.m18469A0(context);
            if (m18469A0 == null) {
                C4046r.m15529i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new C4674s1(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z10) {
                c4512w0.m17795P0(m18469A0);
            }
            return new C4674s1(m18469A0.m18479H0());
        }
    }

    /* renamed from: s3.w0$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC4190w, InterfaceC4836s, InterfaceC1559n, InterfaceC3352e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C4305f.a, C4416d.b, C4405b.b, C4480p3.b, InterfaceC4486r.a {
        public c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: M */
        public /* synthetic */ void m17839M(InterfaceC4409b3.d dVar) {
            dVar.onMediaMetadataChanged(C4512w0.this.f16900P);
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: a */
        public void mo17845a(Exception exc) {
            C4512w0.this.f16944r.mo18199a(exc);
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: b */
        public void mo16134b(String str) {
            C4512w0.this.f16944r.mo18200b(str);
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: c */
        public void mo16135c(C4463m1 c4463m1, C5112i c5112i) {
            C4512w0.this.f16902R = c4463m1;
            C4512w0.this.f16944r.mo18201c(c4463m1, c5112i);
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: d */
        public void mo16136d(String str, long j10, long j11) {
            C4512w0.this.f16944r.mo18202d(str, j10, j11);
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: e */
        public void mo17846e(C4463m1 c4463m1, C5112i c5112i) {
            C4512w0.this.f16903S = c4463m1;
            C4512w0.this.f16944r.mo18203e(c4463m1, c5112i);
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: f */
        public void mo16137f(C5108e c5108e) {
            C4512w0.this.f16917d0 = c5108e;
            C4512w0.this.f16944r.mo18204f(c5108e);
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: g */
        public void mo17847g(String str) {
            C4512w0.this.f16944r.mo18205g(str);
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: h */
        public void mo17848h(String str, long j10, long j11) {
            C4512w0.this.f16944r.mo18206h(str, j10, j11);
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: i */
        public void mo16138i(int i10, long j10) {
            C4512w0.this.f16944r.mo18207i(i10, j10);
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: j */
        public void mo17849j(C5108e c5108e) {
            C4512w0.this.f16944r.mo18208j(c5108e);
            C4512w0.this.f16903S = null;
            C4512w0.this.f16919e0 = null;
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: k */
        public void mo16139k(Object obj, long j10) {
            C4512w0.this.f16944r.mo18209k(obj, j10);
            if (C4512w0.this.f16905U == obj) {
                C4512w0.this.f16932l.m15515k(26, new C4045q.a() { // from class: s3.f1
                    @Override // p222p5.C4045q.a
                    public final void invoke(Object obj2) {
                        ((InterfaceC4409b3.d) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: l */
        public void mo17850l(long j10) {
            C4512w0.this.f16944r.mo18210l(j10);
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: m */
        public void mo17851m(C5108e c5108e) {
            C4512w0.this.f16919e0 = c5108e;
            C4512w0.this.f16944r.mo18211m(c5108e);
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: n */
        public void mo17852n(Exception exc) {
            C4512w0.this.f16944r.mo18212n(exc);
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: o */
        public void mo16140o(Exception exc) {
            C4512w0.this.f16944r.mo18213o(exc);
        }

        @Override // p047d5.InterfaceC1559n
        public void onCues(final C1550e c1550e) {
            C4512w0.this.f16929j0 = c1550e;
            C4512w0.this.f16932l.m15515k(27, new C4045q.a() { // from class: s3.y0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onCues(C1550e.this);
                }
            });
        }

        @Override // p047d5.InterfaceC1559n
        public void onCues(final List<C1547b> list) {
            C4512w0.this.f16932l.m15515k(27, new C4045q.a() { // from class: s3.z0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onCues((List<C1547b>) list);
                }
            });
        }

        @Override // p152k4.InterfaceC3352e
        public void onMetadata(final C3348a c3348a) {
            C4512w0 c4512w0 = C4512w0.this;
            c4512w0.f16945r0 = c4512w0.f16945r0.m17873b().m17911L(c3348a).m17907H();
            C4528z1 m17801S0 = C4512w0.this.m17801S0();
            if (!m17801S0.equals(C4512w0.this.f16900P)) {
                C4512w0.this.f16900P = m17801S0;
                C4512w0.this.f16932l.m15513i(14, new C4045q.a() { // from class: s3.d1
                    @Override // p222p5.C4045q.a
                    public final void invoke(Object obj) {
                        C4512w0.c.this.m17839M((InterfaceC4409b3.d) obj);
                    }
                });
            }
            C4512w0.this.f16932l.m15513i(28, new C4045q.a() { // from class: s3.a1
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onMetadata(C3348a.this);
                }
            });
            C4512w0.this.f16932l.m15511f();
        }

        @Override // p289u3.InterfaceC4836s
        public void onSkipSilenceEnabledChanged(final boolean z10) {
            if (C4512w0.this.f16927i0 == z10) {
                return;
            }
            C4512w0.this.f16927i0 = z10;
            C4512w0.this.f16932l.m15515k(23, new C4045q.a() { // from class: s3.e1
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onSkipSilenceEnabledChanged(z10);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            C4512w0.this.m17805U1(surfaceTexture);
            C4512w0.this.m17790K1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C4512w0.this.m17807V1(null);
            C4512w0.this.m17790K1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            C4512w0.this.m17790K1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // p236q5.InterfaceC4190w
        public void onVideoSizeChanged(final C4192y c4192y) {
            C4512w0.this.f16943q0 = c4192y;
            C4512w0.this.f16932l.m15515k(25, new C4045q.a() { // from class: s3.b1
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onVideoSizeChanged(C4192y.this);
                }
            });
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: p */
        public void mo16141p(C5108e c5108e) {
            C4512w0.this.f16944r.mo18214p(c5108e);
            C4512w0.this.f16902R = null;
            C4512w0.this.f16917d0 = null;
        }

        @Override // p289u3.InterfaceC4836s
        /* renamed from: q */
        public void mo17853q(int i10, long j10, long j11) {
            C4512w0.this.f16944r.mo18215q(i10, j10, j11);
        }

        @Override // p236q5.InterfaceC4190w
        /* renamed from: r */
        public void mo16142r(long j10, int i10) {
            C4512w0.this.f16944r.mo18216r(j10, i10);
        }

        @Override // p264s3.C4480p3.b
        /* renamed from: s */
        public void mo17499s(int i10) {
            final C4471o m17737T0 = C4512w0.m17737T0(C4512w0.this.f16886B);
            if (m17737T0.equals(C4512w0.this.f16941p0)) {
                return;
            }
            C4512w0.this.f16941p0 = m17737T0;
            C4512w0.this.f16932l.m15515k(29, new C4045q.a() { // from class: s3.c1
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onDeviceInfoChanged(C4471o.this);
                }
            });
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            C4512w0.this.m17790K1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (C4512w0.this.f16909Y) {
                C4512w0.this.m17807V1(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (C4512w0.this.f16909Y) {
                C4512w0.this.m17807V1(null);
            }
            C4512w0.this.m17790K1(0, 0);
        }

        @Override // p264s3.C4405b.b
        /* renamed from: u */
        public void mo17069u() {
            C4512w0.this.m17815Z1(false, -1, 3);
        }

        @Override // p264s3.InterfaceC4486r.a
        /* renamed from: v */
        public void mo17514v(boolean z10) {
            C4512w0.this.m17821c2();
        }

        @Override // p264s3.C4416d.b
        /* renamed from: w */
        public void mo17136w(float f10) {
            C4512w0.this.m17798Q1();
        }

        @Override // p264s3.C4416d.b
        /* renamed from: x */
        public void mo17137x(int i10) {
            boolean mo17089j = C4512w0.this.mo17089j();
            C4512w0.this.m17815Z1(mo17089j, i10, C4512w0.m17748d1(mo17089j, i10));
        }

        @Override // p251r5.C4305f.a
        /* renamed from: y */
        public void mo16554y(Surface surface) {
            C4512w0.this.m17807V1(null);
        }

        @Override // p264s3.C4480p3.b
        /* renamed from: z */
        public void mo17500z(final int i10, final boolean z10) {
            C4512w0.this.f16932l.m15515k(30, new C4045q.a() { // from class: s3.x0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onDeviceVolumeChanged(i10, z10);
                }
            });
        }
    }

    /* renamed from: s3.w0$d */
    /* loaded from: classes.dex */
    public static final class d implements InterfaceC4177j, InterfaceC4300a, C4425e3.b {

        /* renamed from: h */
        public InterfaceC4177j f16959h;

        /* renamed from: i */
        public InterfaceC4300a f16960i;

        /* renamed from: j */
        public InterfaceC4177j f16961j;

        /* renamed from: k */
        public InterfaceC4300a f16962k;

        public d() {
        }

        @Override // p251r5.InterfaceC4300a
        /* renamed from: a */
        public void mo16545a(long j10, float[] fArr) {
            InterfaceC4300a interfaceC4300a = this.f16962k;
            if (interfaceC4300a != null) {
                interfaceC4300a.mo16545a(j10, fArr);
            }
            InterfaceC4300a interfaceC4300a2 = this.f16960i;
            if (interfaceC4300a2 != null) {
                interfaceC4300a2.mo16545a(j10, fArr);
            }
        }

        @Override // p251r5.InterfaceC4300a
        /* renamed from: d */
        public void mo16546d() {
            InterfaceC4300a interfaceC4300a = this.f16962k;
            if (interfaceC4300a != null) {
                interfaceC4300a.mo16546d();
            }
            InterfaceC4300a interfaceC4300a2 = this.f16960i;
            if (interfaceC4300a2 != null) {
                interfaceC4300a2.mo16546d();
            }
        }

        @Override // p236q5.InterfaceC4177j
        /* renamed from: h */
        public void mo16101h(long j10, long j11, C4463m1 c4463m1, MediaFormat mediaFormat) {
            InterfaceC4177j interfaceC4177j = this.f16961j;
            if (interfaceC4177j != null) {
                interfaceC4177j.mo16101h(j10, j11, c4463m1, mediaFormat);
            }
            InterfaceC4177j interfaceC4177j2 = this.f16959h;
            if (interfaceC4177j2 != null) {
                interfaceC4177j2.mo16101h(j10, j11, c4463m1, mediaFormat);
            }
        }

        @Override // p264s3.C4425e3.b
        /* renamed from: y */
        public void mo16091y(int i10, Object obj) {
            InterfaceC4300a cameraMotionListener;
            if (i10 == 7) {
                this.f16959h = (InterfaceC4177j) obj;
                return;
            }
            if (i10 == 8) {
                this.f16960i = (InterfaceC4300a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            C4305f c4305f = (C4305f) obj;
            if (c4305f == null) {
                cameraMotionListener = null;
                this.f16961j = null;
            } else {
                this.f16961j = c4305f.getVideoFrameMetadataListener();
                cameraMotionListener = c4305f.getCameraMotionListener();
            }
            this.f16962k = cameraMotionListener;
        }
    }

    /* renamed from: s3.w0$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC4424e2 {

        /* renamed from: a */
        public final Object f16963a;

        /* renamed from: b */
        public AbstractC4505u3 f16964b;

        public e(Object obj, AbstractC4505u3 abstractC4505u3) {
            this.f16963a = obj;
            this.f16964b = abstractC4505u3;
        }

        @Override // p264s3.InterfaceC4424e2
        /* renamed from: b */
        public Object mo17179b() {
            return this.f16963a;
        }

        @Override // p264s3.InterfaceC4424e2
        /* renamed from: c */
        public AbstractC4505u3 mo17180c() {
            return this.f16964b;
        }
    }

    static {
        C4448j1.m17365a("goog.exo.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public C4512w0(InterfaceC4486r.b bVar, InterfaceC4409b3 interfaceC4409b3) {
        C4026g c4026g = new C4026g();
        this.f16916d = c4026g;
        try {
            C4046r.m15526f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + C4041n0.f14517e + "]");
            Context applicationContext = bVar.f16632a.getApplicationContext();
            this.f16918e = applicationContext;
            InterfaceC4618a apply = bVar.f16640i.apply(bVar.f16633b);
            this.f16944r = apply;
            this.f16935m0 = bVar.f16642k;
            this.f16923g0 = bVar.f16643l;
            this.f16911a0 = bVar.f16648q;
            this.f16913b0 = bVar.f16649r;
            this.f16927i0 = bVar.f16647p;
            this.f16889E = bVar.f16656y;
            c cVar = new c();
            this.f16955x = cVar;
            d dVar = new d();
            this.f16956y = dVar;
            Handler handler = new Handler(bVar.f16641j);
            InterfaceC4445i3[] mo17397a = bVar.f16635d.get().mo17397a(handler, cVar, cVar, cVar, cVar);
            this.f16922g = mo17397a;
            C4014a.m15200f(mo17397a.length > 0);
            AbstractC3734b0 abstractC3734b0 = bVar.f16637f.get();
            this.f16924h = abstractC3734b0;
            this.f16942q = bVar.f16636e.get();
            InterfaceC3900e interfaceC3900e = bVar.f16639h.get();
            this.f16948t = interfaceC3900e;
            this.f16940p = bVar.f16650s;
            this.f16896L = bVar.f16651t;
            this.f16950u = bVar.f16652u;
            this.f16952v = bVar.f16653v;
            this.f16898N = bVar.f16657z;
            Looper looper = bVar.f16641j;
            this.f16946s = looper;
            InterfaceC4020d interfaceC4020d = bVar.f16633b;
            this.f16954w = interfaceC4020d;
            InterfaceC4409b3 interfaceC4409b32 = interfaceC4409b3 == null ? this : interfaceC4409b3;
            this.f16920f = interfaceC4409b32;
            this.f16932l = new C4045q<>(looper, interfaceC4020d, new C4045q.b() { // from class: s3.m0
                @Override // p222p5.C4045q.b
                /* renamed from: a */
                public final void mo15517a(Object obj, C4036l c4036l) {
                    C4512w0.this.m17761m1((InterfaceC4409b3.d) obj, c4036l);
                }
            });
            this.f16934m = new CopyOnWriteArraySet<>();
            this.f16938o = new ArrayList();
            this.f16897M = new InterfaceC4873o0.a(0);
            C3736c0 c3736c0 = new C3736c0(new C4455k3[mo17397a.length], new InterfaceC3752s[mo17397a.length], C4530z3.f17110i, null);
            this.f16912b = c3736c0;
            this.f16936n = new AbstractC4505u3.b();
            InterfaceC4409b3.b m17111e = new InterfaceC4409b3.b.a().m17109c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28).m17110d(29, abstractC3734b0.mo14077d()).m17111e();
            this.f16914c = m17111e;
            this.f16899O = new InterfaceC4409b3.b.a().m17108b(m17111e).m17107a(4).m17107a(10).m17111e();
            this.f16926i = interfaceC4020d.mo15273c(looper, null);
            C4443i1.f fVar = new C4443i1.f() { // from class: s3.n0
                @Override // p264s3.C4443i1.f
                /* renamed from: a */
                public final void mo17354a(C4443i1.e eVar) {
                    C4512w0.this.m17765o1(eVar);
                }
            };
            this.f16928j = fVar;
            this.f16947s0 = C4524y2.m17858j(c3736c0);
            apply.mo18198D(interfaceC4409b32, looper);
            int i10 = C4041n0.f14513a;
            C4443i1 c4443i1 = new C4443i1(mo17397a, abstractC3734b0, c3736c0, bVar.f16638g.get(), interfaceC3900e, this.f16890F, this.f16891G, apply, this.f16896L, bVar.f16654w, bVar.f16655x, this.f16898N, looper, interfaceC4020d, fVar, i10 < 31 ? new C4674s1() : b.m17828a(applicationContext, this, bVar.f16629A), bVar.f16630B);
            this.f16930k = c4443i1;
            this.f16925h0 = 1.0f;
            this.f16890F = 0;
            C4528z1 c4528z1 = C4528z1.f17007P;
            this.f16900P = c4528z1;
            this.f16901Q = c4528z1;
            this.f16945r0 = c4528z1;
            this.f16949t0 = -1;
            this.f16921f0 = i10 < 21 ? m17827j1(0) : C4041n0.m15403F(applicationContext);
            this.f16929j0 = C1550e.f5816j;
            this.f16931k0 = true;
            mo17093o(apply);
            interfaceC3900e.mo14784h(new Handler(looper), apply);
            m17797Q0(cVar);
            long j10 = bVar.f16634c;
            if (j10 > 0) {
                c4443i1.m17334u(j10);
            }
            C4405b c4405b = new C4405b(bVar.f16632a, handler, cVar);
            this.f16957z = c4405b;
            c4405b.m17068b(bVar.f16646o);
            C4416d c4416d = new C4416d(bVar.f16632a, handler, cVar);
            this.f16885A = c4416d;
            c4416d.m17129m(bVar.f16644m ? this.f16923g0 : null);
            C4480p3 c4480p3 = new C4480p3(bVar.f16632a, handler, cVar);
            this.f16886B = c4480p3;
            c4480p3.m17497h(C4041n0.m15456f0(this.f16923g0.f18007j));
            C4404a4 c4404a4 = new C4404a4(bVar.f16632a);
            this.f16887C = c4404a4;
            c4404a4.m17064a(bVar.f16645n != 0);
            C4410b4 c4410b4 = new C4410b4(bVar.f16632a);
            this.f16888D = c4410b4;
            c4410b4.m17114a(bVar.f16645n == 2);
            this.f16941p0 = m17737T0(c4480p3);
            this.f16943q0 = C4192y.f15133l;
            this.f16915c0 = C4021d0.f14459c;
            abstractC3734b0.mo14081h(this.f16923g0);
            m17796P1(1, 10, Integer.valueOf(this.f16921f0));
            m17796P1(2, 10, Integer.valueOf(this.f16921f0));
            m17796P1(1, 3, this.f16923g0);
            m17796P1(2, 4, Integer.valueOf(this.f16911a0));
            m17796P1(2, 5, Integer.valueOf(this.f16913b0));
            m17796P1(1, 9, Boolean.valueOf(this.f16927i0));
            m17796P1(2, 7, dVar);
            m17796P1(6, 8, dVar);
            c4026g.m15314e();
        } catch (Throwable th) {
            this.f16916d.m15314e();
            throw th;
        }
    }

    /* renamed from: B1 */
    public static /* synthetic */ void m17713B1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onLoadingChanged(c4524y2.f16992g);
        dVar.onIsLoadingChanged(c4524y2.f16992g);
    }

    /* renamed from: C1 */
    public static /* synthetic */ void m17715C1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onPlayerStateChanged(c4524y2.f16997l, c4524y2.f16990e);
    }

    /* renamed from: D1 */
    public static /* synthetic */ void m17717D1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onPlaybackStateChanged(c4524y2.f16990e);
    }

    /* renamed from: E1 */
    public static /* synthetic */ void m17719E1(C4524y2 c4524y2, int i10, InterfaceC4409b3.d dVar) {
        dVar.onPlayWhenReadyChanged(c4524y2.f16997l, i10);
    }

    /* renamed from: F1 */
    public static /* synthetic */ void m17721F1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onPlaybackSuppressionReasonChanged(c4524y2.f16998m);
    }

    /* renamed from: G1 */
    public static /* synthetic */ void m17723G1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onIsPlayingChanged(m17757k1(c4524y2));
    }

    /* renamed from: H1 */
    public static /* synthetic */ void m17725H1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onPlaybackParametersChanged(c4524y2.f16999n);
    }

    /* renamed from: T0 */
    public static C4471o m17737T0(C4480p3 c4480p3) {
        return new C4471o(0, c4480p3.m17495d(), c4480p3.m17494c());
    }

    /* renamed from: d1 */
    public static int m17748d1(boolean z10, int i10) {
        return (!z10 || i10 == 1) ? 1 : 2;
    }

    /* renamed from: h1 */
    public static long m17753h1(C4524y2 c4524y2) {
        AbstractC4505u3.d dVar = new AbstractC4505u3.d();
        AbstractC4505u3.b bVar = new AbstractC4505u3.b();
        c4524y2.f16986a.mo17028l(c4524y2.f16987b.f18457a, bVar);
        return c4524y2.f16988c == -9223372036854775807L ? c4524y2.f16986a.m17675r(bVar.f16834j, dVar).m17704e() : bVar.m17694q() + c4524y2.f16988c;
    }

    /* renamed from: k1 */
    public static boolean m17757k1(C4524y2 c4524y2) {
        return c4524y2.f16990e == 3 && c4524y2.f16997l && c4524y2.f16998m == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public /* synthetic */ void m17761m1(InterfaceC4409b3.d dVar, C4036l c4036l) {
        dVar.onEvents(this.f16920f, new InterfaceC4409b3.c(c4036l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ void m17765o1(final C4443i1.e eVar) {
        this.f16926i.mo15319b(new Runnable() { // from class: s3.y
            @Override // java.lang.Runnable
            public final void run() {
                C4512w0.this.m17763n1(eVar);
            }
        });
    }

    /* renamed from: p1 */
    public static /* synthetic */ void m17767p1(InterfaceC4409b3.d dVar) {
        dVar.onPlayerError(C4481q.m17507i(new C4453k1(1), 1003));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public /* synthetic */ void m17775t1(InterfaceC4409b3.d dVar) {
        dVar.onAvailableCommandsChanged(this.f16899O);
    }

    /* renamed from: u1 */
    public static /* synthetic */ void m17777u1(C4524y2 c4524y2, int i10, InterfaceC4409b3.d dVar) {
        dVar.onTimelineChanged(c4524y2.f16986a, i10);
    }

    /* renamed from: v1 */
    public static /* synthetic */ void m17779v1(int i10, InterfaceC4409b3.e eVar, InterfaceC4409b3.e eVar2, InterfaceC4409b3.d dVar) {
        dVar.onPositionDiscontinuity(i10);
        dVar.onPositionDiscontinuity(eVar, eVar2, i10);
    }

    /* renamed from: x1 */
    public static /* synthetic */ void m17783x1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onPlayerErrorChanged(c4524y2.f16991f);
    }

    /* renamed from: y1 */
    public static /* synthetic */ void m17785y1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onPlayerError(c4524y2.f16991f);
    }

    /* renamed from: z1 */
    public static /* synthetic */ void m17787z1(C4524y2 c4524y2, InterfaceC4409b3.d dVar) {
        dVar.onTracksChanged(c4524y2.f16994i.f13327d);
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: A */
    public int mo17072A() {
        m17822d2();
        int m17818b1 = m17818b1();
        if (m17818b1 == -1) {
            return 0;
        }
        return m17818b1;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: B */
    public void mo17073B(final int i10) {
        m17822d2();
        if (this.f16890F != i10) {
            this.f16890F = i10;
            this.f16930k.m17277U0(i10);
            this.f16932l.m15513i(8, new C4045q.a() { // from class: s3.o0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onRepeatModeChanged(i10);
                }
            });
            m17813Y1();
            this.f16932l.m15511f();
        }
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: D */
    public int mo17075D() {
        m17822d2();
        return this.f16947s0.f16998m;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: E */
    public int mo17076E() {
        m17822d2();
        return this.f16890F;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: F */
    public AbstractC4505u3 mo17077F() {
        m17822d2();
        return this.f16947s0.f16986a;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: G */
    public boolean mo17078G() {
        m17822d2();
        return this.f16891G;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: H */
    public long mo17079H() {
        m17822d2();
        return C4041n0.m15442Y0(m17816a1(this.f16947s0));
    }

    /* renamed from: I1 */
    public final C4524y2 m17788I1(C4524y2 c4524y2, AbstractC4505u3 abstractC4505u3, Pair<Object, Long> pair) {
        long j10;
        C4014a.m15195a(abstractC4505u3.m17676u() || pair != null);
        AbstractC4505u3 abstractC4505u32 = c4524y2.f16986a;
        C4524y2 m17868i = c4524y2.m17868i(abstractC4505u3);
        if (abstractC4505u3.m17676u()) {
            InterfaceC4882t.b m17859k = C4524y2.m17859k();
            long m15396B0 = C4041n0.m15396B0(this.f16953v0);
            C4524y2 m17861b = m17868i.m17862c(m17859k, m15396B0, m15396B0, m15396B0, 0L, C4885u0.f18475k, this.f16912b, AbstractC2651u.m10770u()).m17861b(m17859k);
            m17861b.f17001p = m17861b.f17003r;
            return m17861b;
        }
        Object obj = m17868i.f16987b.f18457a;
        boolean z10 = !obj.equals(((Pair) C4041n0.m15463j(pair)).first);
        InterfaceC4882t.b bVar = z10 ? new InterfaceC4882t.b(pair.first) : m17868i.f16987b;
        long longValue = ((Long) pair.second).longValue();
        long m15396B02 = C4041n0.m15396B0(mo17097s());
        if (!abstractC4505u32.m17676u()) {
            m15396B02 -= abstractC4505u32.mo17028l(obj, this.f16936n).m17694q();
        }
        if (z10 || longValue < m15396B02) {
            C4014a.m15200f(!bVar.m19438b());
            C4524y2 m17861b2 = m17868i.m17862c(bVar, longValue, longValue, longValue, 0L, z10 ? C4885u0.f18475k : m17868i.f16993h, z10 ? this.f16912b : m17868i.f16994i, z10 ? AbstractC2651u.m10770u() : m17868i.f16995j).m17861b(bVar);
            m17861b2.f17001p = longValue;
            return m17861b2;
        }
        if (longValue == m15396B02) {
            int mo4743f = abstractC4505u3.mo4743f(m17868i.f16996k.f18457a);
            if (mo4743f == -1 || abstractC4505u3.m17672j(mo4743f, this.f16936n).f16834j != abstractC4505u3.mo17028l(bVar.f18457a, this.f16936n).f16834j) {
                abstractC4505u3.mo17028l(bVar.f18457a, this.f16936n);
                j10 = bVar.m19438b() ? this.f16936n.m17682e(bVar.f18458b, bVar.f18459c) : this.f16936n.f16835k;
                m17868i = m17868i.m17862c(bVar, m17868i.f17003r, m17868i.f17003r, m17868i.f16989d, j10 - m17868i.f17003r, m17868i.f16993h, m17868i.f16994i, m17868i.f16995j).m17861b(bVar);
            }
            return m17868i;
        }
        C4014a.m15200f(!bVar.m19438b());
        long max = Math.max(0L, m17868i.f17002q - (longValue - m15396B02));
        j10 = m17868i.f17001p;
        if (m17868i.f16996k.equals(m17868i.f16987b)) {
            j10 = longValue + max;
        }
        m17868i = m17868i.m17862c(bVar, longValue, longValue, longValue, max, m17868i.f16993h, m17868i.f16994i, m17868i.f16995j);
        m17868i.f17001p = j10;
        return m17868i;
    }

    /* renamed from: J1 */
    public final Pair<Object, Long> m17789J1(AbstractC4505u3 abstractC4505u3, int i10, long j10) {
        if (abstractC4505u3.m17676u()) {
            this.f16949t0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f16953v0 = j10;
            this.f16951u0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= abstractC4505u3.mo4748t()) {
            i10 = abstractC4505u3.mo17025e(this.f16891G);
            j10 = abstractC4505u3.m17675r(i10, this.f16241a).m17703d();
        }
        return abstractC4505u3.m17673n(this.f16241a, this.f16936n, i10, C4041n0.m15396B0(j10));
    }

    /* renamed from: K1 */
    public final void m17790K1(final int i10, final int i11) {
        if (i10 == this.f16915c0.m15276b() && i11 == this.f16915c0.m15275a()) {
            return;
        }
        this.f16915c0 = new C4021d0(i10, i11);
        this.f16932l.m15515k(24, new C4045q.a() { // from class: s3.p0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4409b3.d) obj).onSurfaceSizeChanged(i10, i11);
            }
        });
    }

    /* renamed from: L1 */
    public final long m17791L1(AbstractC4505u3 abstractC4505u3, InterfaceC4882t.b bVar, long j10) {
        abstractC4505u3.mo17028l(bVar.f18457a, this.f16936n);
        return j10 + this.f16936n.m17694q();
    }

    /* renamed from: M1 */
    public final C4524y2 m17792M1(int i10, int i11) {
        int mo17072A = mo17072A();
        AbstractC4505u3 mo17077F = mo17077F();
        int size = this.f16938o.size();
        this.f16892H++;
        m17793N1(i10, i11);
        AbstractC4505u3 m17804U0 = m17804U0();
        C4524y2 m17788I1 = m17788I1(this.f16947s0, m17804U0, m17820c1(mo17077F, m17804U0));
        int i12 = m17788I1.f16990e;
        if (i12 != 1 && i12 != 4 && i10 < i11 && i11 == size && mo17072A >= m17788I1.f16986a.mo4748t()) {
            m17788I1 = m17788I1.m17866g(4);
        }
        this.f16930k.m17319n0(i10, i11, this.f16897M);
        return m17788I1;
    }

    @Override // p264s3.AbstractC4421e
    /* renamed from: N */
    public void mo17176N(int i10, long j10, int i11, boolean z10) {
        m17822d2();
        C4014a.m15195a(i10 >= 0);
        this.f16944r.mo18217w();
        AbstractC4505u3 abstractC4505u3 = this.f16947s0.f16986a;
        if (abstractC4505u3.m17676u() || i10 < abstractC4505u3.mo4748t()) {
            this.f16892H++;
            if (mo17087g()) {
                C4046r.m15529i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C4443i1.e eVar = new C4443i1.e(this.f16947s0);
                eVar.m17350b(1);
                this.f16928j.mo17354a(eVar);
                return;
            }
            int i12 = mo17100v() != 1 ? 2 : 1;
            int mo17072A = mo17072A();
            C4524y2 m17788I1 = m17788I1(this.f16947s0.m17866g(i12), abstractC4505u3, m17789J1(abstractC4505u3, i10, j10));
            this.f16930k.m17242A0(abstractC4505u3, i10, C4041n0.m15396B0(j10));
            m17817a2(m17788I1, 0, 1, true, true, 1, m17816a1(m17788I1), mo17072A, z10);
        }
    }

    /* renamed from: N1 */
    public final void m17793N1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f16938o.remove(i12);
        }
        this.f16897M = this.f16897M.mo19410c(i10, i11);
    }

    /* renamed from: O1 */
    public final void m17794O1() {
        if (this.f16908X != null) {
            m17806V0(this.f16956y).m17194n(10000).m17193m(null).m17192l();
            this.f16908X.m16552d(this.f16955x);
            this.f16908X = null;
        }
        TextureView textureView = this.f16910Z;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f16955x) {
                C4046r.m15529i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f16910Z.setSurfaceTextureListener(null);
            }
            this.f16910Z = null;
        }
        SurfaceHolder surfaceHolder = this.f16907W;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f16955x);
            this.f16907W = null;
        }
    }

    /* renamed from: P0 */
    public void m17795P0(InterfaceC4621b interfaceC4621b) {
        this.f16944r.mo18196B((InterfaceC4621b) C4014a.m15199e(interfaceC4621b));
    }

    /* renamed from: P1 */
    public final void m17796P1(int i10, int i11, Object obj) {
        for (InterfaceC4445i3 interfaceC4445i3 : this.f16922g) {
            if (interfaceC4445i3.mo17215i() == i10) {
                m17806V0(interfaceC4445i3).m17194n(i11).m17193m(obj).m17192l();
            }
        }
    }

    /* renamed from: Q0 */
    public void m17797Q0(InterfaceC4486r.a aVar) {
        this.f16934m.add(aVar);
    }

    /* renamed from: Q1 */
    public final void m17798Q1() {
        m17796P1(1, 2, Float.valueOf(this.f16925h0 * this.f16885A.m17123g()));
    }

    /* renamed from: R0 */
    public final List<C4494s2.c> m17799R0(int i10, List<InterfaceC4882t> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            C4494s2.c cVar = new C4494s2.c(list.get(i11), this.f16940p);
            arrayList.add(cVar);
            this.f16938o.add(i11 + i10, new e(cVar.f16687b, cVar.f16686a.m19424Z()));
        }
        this.f16897M = this.f16897M.mo19414g(i10, arrayList.size());
        return arrayList;
    }

    /* renamed from: R1 */
    public void m17800R1(List<InterfaceC4882t> list) {
        m17822d2();
        m17802S1(list, true);
    }

    /* renamed from: S0 */
    public final C4528z1 m17801S0() {
        AbstractC4505u3 mo17077F = mo17077F();
        if (mo17077F.m17676u()) {
            return this.f16945r0;
        }
        return this.f16945r0.m17873b().m17909J(mo17077F.m17675r(mo17072A(), this.f16241a).f16862j.f16715l).m17907H();
    }

    /* renamed from: S1 */
    public void m17802S1(List<InterfaceC4882t> list, boolean z10) {
        m17822d2();
        m17803T1(list, -1, -9223372036854775807L, z10);
    }

    /* renamed from: T1 */
    public final void m17803T1(List<InterfaceC4882t> list, int i10, long j10, boolean z10) {
        int i11;
        long j11;
        int m17818b1 = m17818b1();
        long mo17079H = mo17079H();
        this.f16892H++;
        if (!this.f16938o.isEmpty()) {
            m17793N1(0, this.f16938o.size());
        }
        List<C4494s2.c> m17799R0 = m17799R0(0, list);
        AbstractC4505u3 m17804U0 = m17804U0();
        if (!m17804U0.m17676u() && i10 >= m17804U0.mo4748t()) {
            throw new C4483q1(m17804U0, i10, j10);
        }
        if (z10) {
            j11 = -9223372036854775807L;
            i11 = m17804U0.mo17025e(this.f16891G);
        } else if (i10 == -1) {
            i11 = m17818b1;
            j11 = mo17079H;
        } else {
            i11 = i10;
            j11 = j10;
        }
        C4524y2 m17788I1 = m17788I1(this.f16947s0, m17804U0, m17789J1(m17804U0, i11, j11));
        int i12 = m17788I1.f16990e;
        if (i11 != -1 && i12 != 1) {
            i12 = (m17804U0.m17676u() || i11 >= m17804U0.mo4748t()) ? 4 : 2;
        }
        C4524y2 m17866g = m17788I1.m17866g(i12);
        this.f16930k.m17268N0(m17799R0, i11, C4041n0.m15396B0(j11), this.f16897M);
        m17817a2(m17866g, 0, 1, false, (this.f16947s0.f16987b.f18457a.equals(m17866g.f16987b.f18457a) || this.f16947s0.f16986a.m17676u()) ? false : true, 4, m17816a1(m17866g), -1, false);
    }

    /* renamed from: U0 */
    public final AbstractC4505u3 m17804U0() {
        return new C4430f3(this.f16938o, this.f16897M);
    }

    /* renamed from: U1 */
    public final void m17805U1(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        m17807V1(surface);
        this.f16906V = surface;
    }

    /* renamed from: V0 */
    public final C4425e3 m17806V0(C4425e3.b bVar) {
        int m17818b1 = m17818b1();
        C4443i1 c4443i1 = this.f16930k;
        AbstractC4505u3 abstractC4505u3 = this.f16947s0.f16986a;
        if (m17818b1 == -1) {
            m17818b1 = 0;
        }
        return new C4425e3(c4443i1, bVar, abstractC4505u3, m17818b1, this.f16954w, c4443i1.m17243B());
    }

    /* renamed from: V1 */
    public final void m17807V1(Object obj) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        InterfaceC4445i3[] interfaceC4445i3Arr = this.f16922g;
        int length = interfaceC4445i3Arr.length;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= length) {
                break;
            }
            InterfaceC4445i3 interfaceC4445i3 = interfaceC4445i3Arr[i10];
            if (interfaceC4445i3.mo17215i() == 2) {
                arrayList.add(m17806V0(interfaceC4445i3).m17194n(1).m17193m(obj).m17192l());
            }
            i10++;
        }
        Object obj2 = this.f16905U;
        if (obj2 == null || obj2 == obj) {
            z10 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C4425e3) it.next()).m17181a(this.f16889E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z10 = false;
            Object obj3 = this.f16905U;
            Surface surface = this.f16906V;
            if (obj3 == surface) {
                surface.release();
                this.f16906V = null;
            }
        }
        this.f16905U = obj;
        if (z10) {
            m17811X1(false, C4481q.m17507i(new C4453k1(3), 1003));
        }
    }

    /* renamed from: W0 */
    public final Pair<Boolean, Integer> m17808W0(C4524y2 c4524y2, C4524y2 c4524y22, boolean z10, int i10, boolean z11, boolean z12) {
        AbstractC4505u3 abstractC4505u3 = c4524y22.f16986a;
        AbstractC4505u3 abstractC4505u32 = c4524y2.f16986a;
        if (abstractC4505u32.m17676u() && abstractC4505u3.m17676u()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (abstractC4505u32.m17676u() != abstractC4505u3.m17676u()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (abstractC4505u3.m17675r(abstractC4505u3.mo17028l(c4524y22.f16987b.f18457a, this.f16936n).f16834j, this.f16241a).f16860h.equals(abstractC4505u32.m17675r(abstractC4505u32.mo17028l(c4524y2.f16987b.f18457a, this.f16936n).f16834j, this.f16241a).f16860h)) {
            return (z10 && i10 == 0 && c4524y22.f16987b.f18460d < c4524y2.f16987b.f18460d) ? new Pair<>(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    /* renamed from: W1 */
    public void m17809W1(boolean z10) {
        m17822d2();
        this.f16885A.m17132p(mo17089j(), 1);
        m17811X1(z10, null);
        this.f16929j0 = new C1550e(AbstractC2651u.m10770u(), this.f16947s0.f17003r);
    }

    /* renamed from: X0 */
    public boolean m17810X0() {
        m17822d2();
        return this.f16947s0.f17000o;
    }

    /* renamed from: X1 */
    public final void m17811X1(boolean z10, C4481q c4481q) {
        C4524y2 m17861b;
        if (z10) {
            m17861b = m17792M1(0, this.f16938o.size()).m17864e(null);
        } else {
            C4524y2 c4524y2 = this.f16947s0;
            m17861b = c4524y2.m17861b(c4524y2.f16987b);
            m17861b.f17001p = m17861b.f17003r;
            m17861b.f17002q = 0L;
        }
        C4524y2 m17866g = m17861b.m17866g(1);
        if (c4481q != null) {
            m17866g = m17866g.m17864e(c4481q);
        }
        C4524y2 c4524y22 = m17866g;
        this.f16892H++;
        this.f16930k.m17302g1();
        m17817a2(c4524y22, 0, 1, false, c4524y22.f16986a.m17676u() && !this.f16947s0.f16986a.m17676u(), 4, m17816a1(c4524y22), -1, false);
    }

    /* renamed from: Y0 */
    public Looper m17812Y0() {
        return this.f16946s;
    }

    /* renamed from: Y1 */
    public final void m17813Y1() {
        InterfaceC4409b3.b bVar = this.f16899O;
        InterfaceC4409b3.b m15407H = C4041n0.m15407H(this.f16920f, this.f16914c);
        this.f16899O = m15407H;
        if (m15407H.equals(bVar)) {
            return;
        }
        this.f16932l.m15513i(13, new C4045q.a() { // from class: s3.r0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                C4512w0.this.m17775t1((InterfaceC4409b3.d) obj);
            }
        });
    }

    /* renamed from: Z0 */
    public long m17814Z0() {
        m17822d2();
        if (this.f16947s0.f16986a.m17676u()) {
            return this.f16953v0;
        }
        C4524y2 c4524y2 = this.f16947s0;
        if (c4524y2.f16996k.f18460d != c4524y2.f16987b.f18460d) {
            return c4524y2.f16986a.m17675r(mo17072A(), this.f16241a).m17705f();
        }
        long j10 = c4524y2.f17001p;
        if (this.f16947s0.f16996k.m19438b()) {
            C4524y2 c4524y22 = this.f16947s0;
            AbstractC4505u3.b mo17028l = c4524y22.f16986a.mo17028l(c4524y22.f16996k.f18457a, this.f16936n);
            long m17686i = mo17028l.m17686i(this.f16947s0.f16996k.f18458b);
            j10 = m17686i == Long.MIN_VALUE ? mo17028l.f16835k : m17686i;
        }
        C4524y2 c4524y23 = this.f16947s0;
        return C4041n0.m15442Y0(m17791L1(c4524y23.f16986a, c4524y23.f16996k, j10));
    }

    /* renamed from: Z1 */
    public final void m17815Z1(boolean z10, int i10, int i11) {
        int i12 = 0;
        boolean z11 = z10 && i10 != -1;
        if (z11 && i10 != 1) {
            i12 = 1;
        }
        C4524y2 c4524y2 = this.f16947s0;
        if (c4524y2.f16997l == z11 && c4524y2.f16998m == i12) {
            return;
        }
        this.f16892H++;
        C4524y2 m17863d = c4524y2.m17863d(z11, i12);
        this.f16930k.m17272Q0(z11, i12);
        m17817a2(m17863d, 0, i11, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: a */
    public void mo17081a() {
        m17822d2();
        boolean mo17089j = mo17089j();
        int m17132p = this.f16885A.m17132p(mo17089j, 2);
        m17815Z1(mo17089j, m17132p, m17748d1(mo17089j, m17132p));
        C4524y2 c4524y2 = this.f16947s0;
        if (c4524y2.f16990e != 1) {
            return;
        }
        C4524y2 m17864e = c4524y2.m17864e(null);
        C4524y2 m17866g = m17864e.m17866g(m17864e.f16986a.m17676u() ? 4 : 2);
        this.f16892H++;
        this.f16930k.m17305i0();
        m17817a2(m17866g, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: a1 */
    public final long m17816a1(C4524y2 c4524y2) {
        return c4524y2.f16986a.m17676u() ? C4041n0.m15396B0(this.f16953v0) : c4524y2.f16987b.m19438b() ? c4524y2.f17003r : m17791L1(c4524y2.f16986a, c4524y2.f16987b, c4524y2.f17003r);
    }

    /* renamed from: a2 */
    public final void m17817a2(final C4524y2 c4524y2, final int i10, final int i11, boolean z10, boolean z11, final int i12, long j10, int i13, boolean z12) {
        C4524y2 c4524y22 = this.f16947s0;
        this.f16947s0 = c4524y2;
        boolean z13 = !c4524y22.f16986a.equals(c4524y2.f16986a);
        Pair<Boolean, Integer> m17808W0 = m17808W0(c4524y2, c4524y22, z11, i12, z13, z12);
        boolean booleanValue = ((Boolean) m17808W0.first).booleanValue();
        final int intValue = ((Integer) m17808W0.second).intValue();
        C4528z1 c4528z1 = this.f16900P;
        if (booleanValue) {
            r3 = c4524y2.f16986a.m17676u() ? null : c4524y2.f16986a.m17675r(c4524y2.f16986a.mo17028l(c4524y2.f16987b.f18457a, this.f16936n).f16834j, this.f16241a).f16862j;
            this.f16945r0 = C4528z1.f17007P;
        }
        if (booleanValue || !c4524y22.f16995j.equals(c4524y2.f16995j)) {
            this.f16945r0 = this.f16945r0.m17873b().m17910K(c4524y2.f16995j).m17907H();
            c4528z1 = m17801S0();
        }
        boolean z14 = !c4528z1.equals(this.f16900P);
        this.f16900P = c4528z1;
        boolean z15 = c4524y22.f16997l != c4524y2.f16997l;
        boolean z16 = c4524y22.f16990e != c4524y2.f16990e;
        if (z16 || z15) {
            m17821c2();
        }
        boolean z17 = c4524y22.f16992g;
        boolean z18 = c4524y2.f16992g;
        boolean z19 = z17 != z18;
        if (z19) {
            m17819b2(z18);
        }
        if (z13) {
            this.f16932l.m15513i(0, new C4045q.a() { // from class: s3.g0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17777u1(C4524y2.this, i10, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (z11) {
            final InterfaceC4409b3.e m17825g1 = m17825g1(i12, c4524y22, i13);
            final InterfaceC4409b3.e m17824f1 = m17824f1(j10);
            this.f16932l.m15513i(11, new C4045q.a() { // from class: s3.q0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17779v1(i12, m17825g1, m17824f1, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (booleanValue) {
            this.f16932l.m15513i(1, new C4045q.a() { // from class: s3.s0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onMediaItemTransition(C4503u1.this, intValue);
                }
            });
        }
        if (c4524y22.f16991f != c4524y2.f16991f) {
            this.f16932l.m15513i(10, new C4045q.a() { // from class: s3.u0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17783x1(C4524y2.this, (InterfaceC4409b3.d) obj);
                }
            });
            if (c4524y2.f16991f != null) {
                this.f16932l.m15513i(10, new C4045q.a() { // from class: s3.d0
                    @Override // p222p5.C4045q.a
                    public final void invoke(Object obj) {
                        C4512w0.m17785y1(C4524y2.this, (InterfaceC4409b3.d) obj);
                    }
                });
            }
        }
        C3736c0 c3736c0 = c4524y22.f16994i;
        C3736c0 c3736c02 = c4524y2.f16994i;
        if (c3736c0 != c3736c02) {
            this.f16924h.mo14078e(c3736c02.f13328e);
            this.f16932l.m15513i(2, new C4045q.a() { // from class: s3.z
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17787z1(C4524y2.this, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (z14) {
            final C4528z1 c4528z12 = this.f16900P;
            this.f16932l.m15513i(14, new C4045q.a() { // from class: s3.t0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onMediaMetadataChanged(C4528z1.this);
                }
            });
        }
        if (z19) {
            this.f16932l.m15513i(3, new C4045q.a() { // from class: s3.f0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17713B1(C4524y2.this, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (z16 || z15) {
            this.f16932l.m15513i(-1, new C4045q.a() { // from class: s3.e0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17715C1(C4524y2.this, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (z16) {
            this.f16932l.m15513i(4, new C4045q.a() { // from class: s3.v0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17717D1(C4524y2.this, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (z15) {
            this.f16932l.m15513i(5, new C4045q.a() { // from class: s3.h0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17719E1(C4524y2.this, i11, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (c4524y22.f16998m != c4524y2.f16998m) {
            this.f16932l.m15513i(6, new C4045q.a() { // from class: s3.a0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17721F1(C4524y2.this, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (m17757k1(c4524y22) != m17757k1(c4524y2)) {
            this.f16932l.m15513i(7, new C4045q.a() { // from class: s3.c0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17723G1(C4524y2.this, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (!c4524y22.f16999n.equals(c4524y2.f16999n)) {
            this.f16932l.m15513i(12, new C4045q.a() { // from class: s3.b0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17725H1(C4524y2.this, (InterfaceC4409b3.d) obj);
                }
            });
        }
        if (z10) {
            this.f16932l.m15513i(-1, new C4045q.a() { // from class: s3.l0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onSeekProcessed();
                }
            });
        }
        m17813Y1();
        this.f16932l.m15511f();
        if (c4524y22.f17000o != c4524y2.f17000o) {
            Iterator<InterfaceC4486r.a> it = this.f16934m.iterator();
            while (it.hasNext()) {
                it.next().mo17514v(c4524y2.f17000o);
            }
        }
    }

    /* renamed from: b1 */
    public final int m17818b1() {
        if (this.f16947s0.f16986a.m17676u()) {
            return this.f16949t0;
        }
        C4524y2 c4524y2 = this.f16947s0;
        return c4524y2.f16986a.mo17028l(c4524y2.f16987b.f18457a, this.f16936n).f16834j;
    }

    /* renamed from: b2 */
    public final void m17819b2(boolean z10) {
        C4019c0 c4019c0 = this.f16935m0;
        if (c4019c0 != null) {
            if (z10 && !this.f16937n0) {
                c4019c0.m15269a(0);
                this.f16937n0 = true;
            } else {
                if (z10 || !this.f16937n0) {
                    return;
                }
                c4019c0.m15270b(0);
                this.f16937n0 = false;
            }
        }
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: c */
    public long mo17083c() {
        m17822d2();
        if (!mo17087g()) {
            return m17172J();
        }
        C4524y2 c4524y2 = this.f16947s0;
        InterfaceC4882t.b bVar = c4524y2.f16987b;
        c4524y2.f16986a.mo17028l(bVar.f18457a, this.f16936n);
        return C4041n0.m15442Y0(this.f16936n.m17682e(bVar.f18458b, bVar.f18459c));
    }

    /* renamed from: c1 */
    public final Pair<Object, Long> m17820c1(AbstractC4505u3 abstractC4505u3, AbstractC4505u3 abstractC4505u32) {
        long mo17097s = mo17097s();
        if (abstractC4505u3.m17676u() || abstractC4505u32.m17676u()) {
            boolean z10 = !abstractC4505u3.m17676u() && abstractC4505u32.m17676u();
            int m17818b1 = z10 ? -1 : m17818b1();
            if (z10) {
                mo17097s = -9223372036854775807L;
            }
            return m17789J1(abstractC4505u32, m17818b1, mo17097s);
        }
        Pair<Object, Long> m17673n = abstractC4505u3.m17673n(this.f16241a, this.f16936n, mo17072A(), C4041n0.m15396B0(mo17097s));
        Object obj = ((Pair) C4041n0.m15463j(m17673n)).first;
        if (abstractC4505u32.mo4743f(obj) != -1) {
            return m17673n;
        }
        Object m17240y0 = C4443i1.m17240y0(this.f16241a, this.f16936n, this.f16890F, this.f16891G, obj, abstractC4505u3, abstractC4505u32);
        if (m17240y0 == null) {
            return m17789J1(abstractC4505u32, -1, -9223372036854775807L);
        }
        abstractC4505u32.mo17028l(m17240y0, this.f16936n);
        int i10 = this.f16936n.f16834j;
        return m17789J1(abstractC4505u32, i10, abstractC4505u32.m17675r(i10, this.f16241a).m17703d());
    }

    /* renamed from: c2 */
    public final void m17821c2() {
        int mo17100v = mo17100v();
        if (mo17100v != 1) {
            if (mo17100v == 2 || mo17100v == 3) {
                this.f16887C.m17065b(mo17089j() && !m17810X0());
                this.f16888D.m17115b(mo17089j());
                return;
            } else if (mo17100v != 4) {
                throw new IllegalStateException();
            }
        }
        this.f16887C.m17065b(false);
        this.f16888D.m17115b(false);
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: d */
    public void mo17084d(C4403a3 c4403a3) {
        m17822d2();
        if (c4403a3 == null) {
            c4403a3 = C4403a3.f16149k;
        }
        if (this.f16947s0.f16999n.equals(c4403a3)) {
            return;
        }
        C4524y2 m17865f = this.f16947s0.m17865f(c4403a3);
        this.f16892H++;
        this.f16930k.m17275S0(c4403a3);
        m17817a2(m17865f, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* renamed from: d2 */
    public final void m17822d2() {
        this.f16916d.m15311b();
        if (Thread.currentThread() != m17812Y0().getThread()) {
            String m15397C = C4041n0.m15397C("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), m17812Y0().getThread().getName());
            if (this.f16931k0) {
                throw new IllegalStateException(m15397C);
            }
            C4046r.m15530j("ExoPlayerImpl", m15397C, this.f16933l0 ? null : new IllegalStateException());
            this.f16933l0 = true;
        }
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: e */
    public void mo17085e(float f10) {
        m17822d2();
        final float m15475p = C4041n0.m15475p(f10, 0.0f, 1.0f);
        if (this.f16925h0 == m15475p) {
            return;
        }
        this.f16925h0 = m15475p;
        m17798Q1();
        this.f16932l.m15515k(22, new C4045q.a() { // from class: s3.j0
            @Override // p222p5.C4045q.a
            public final void invoke(Object obj) {
                ((InterfaceC4409b3.d) obj).onVolumeChanged(m15475p);
            }
        });
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public C4481q mo17095q() {
        m17822d2();
        return this.f16947s0.f16991f;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: f */
    public void mo17086f(Surface surface) {
        m17822d2();
        m17794O1();
        m17807V1(surface);
        int i10 = surface == null ? 0 : -1;
        m17790K1(i10, i10);
    }

    /* renamed from: f1 */
    public final InterfaceC4409b3.e m17824f1(long j10) {
        int i10;
        C4503u1 c4503u1;
        Object obj;
        int mo17072A = mo17072A();
        Object obj2 = null;
        if (this.f16947s0.f16986a.m17676u()) {
            i10 = -1;
            c4503u1 = null;
            obj = null;
        } else {
            C4524y2 c4524y2 = this.f16947s0;
            Object obj3 = c4524y2.f16987b.f18457a;
            c4524y2.f16986a.mo17028l(obj3, this.f16936n);
            i10 = this.f16947s0.f16986a.mo4743f(obj3);
            obj = obj3;
            obj2 = this.f16947s0.f16986a.m17675r(mo17072A, this.f16241a).f16860h;
            c4503u1 = this.f16241a.f16862j;
        }
        long m15442Y0 = C4041n0.m15442Y0(j10);
        long m15442Y02 = this.f16947s0.f16987b.m19438b() ? C4041n0.m15442Y0(m17753h1(this.f16947s0)) : m15442Y0;
        InterfaceC4882t.b bVar = this.f16947s0.f16987b;
        return new InterfaceC4409b3.e(obj2, mo17072A, c4503u1, obj, i10, m15442Y0, m15442Y02, bVar.f18458b, bVar.f18459c);
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: g */
    public boolean mo17087g() {
        m17822d2();
        return this.f16947s0.f16987b.m19438b();
    }

    /* renamed from: g1 */
    public final InterfaceC4409b3.e m17825g1(int i10, C4524y2 c4524y2, int i11) {
        int i12;
        int i13;
        Object obj;
        C4503u1 c4503u1;
        Object obj2;
        long j10;
        long j11;
        AbstractC4505u3.b bVar = new AbstractC4505u3.b();
        if (c4524y2.f16986a.m17676u()) {
            i12 = i11;
            i13 = -1;
            obj = null;
            c4503u1 = null;
            obj2 = null;
        } else {
            Object obj3 = c4524y2.f16987b.f18457a;
            c4524y2.f16986a.mo17028l(obj3, bVar);
            int i14 = bVar.f16834j;
            i12 = i14;
            obj2 = obj3;
            i13 = c4524y2.f16986a.mo4743f(obj3);
            obj = c4524y2.f16986a.m17675r(i14, this.f16241a).f16860h;
            c4503u1 = this.f16241a.f16862j;
        }
        boolean m19438b = c4524y2.f16987b.m19438b();
        if (i10 == 0) {
            if (m19438b) {
                InterfaceC4882t.b bVar2 = c4524y2.f16987b;
                j10 = bVar.m17682e(bVar2.f18458b, bVar2.f18459c);
                j11 = m17753h1(c4524y2);
            } else {
                j10 = c4524y2.f16987b.f18461e != -1 ? m17753h1(this.f16947s0) : bVar.f16836l + bVar.f16835k;
                j11 = j10;
            }
        } else if (m19438b) {
            j10 = c4524y2.f17003r;
            j11 = m17753h1(c4524y2);
        } else {
            j10 = bVar.f16836l + c4524y2.f17003r;
            j11 = j10;
        }
        long m15442Y0 = C4041n0.m15442Y0(j10);
        long m15442Y02 = C4041n0.m15442Y0(j11);
        InterfaceC4882t.b bVar3 = c4524y2.f16987b;
        return new InterfaceC4409b3.e(obj, i12, c4503u1, obj2, i13, m15442Y0, m15442Y02, bVar3.f18458b, bVar3.f18459c);
    }

    @Override // p264s3.InterfaceC4486r
    /* renamed from: h */
    public void mo17510h(final C4813e c4813e, boolean z10) {
        m17822d2();
        if (this.f16939o0) {
            return;
        }
        if (!C4041n0.m15449c(this.f16923g0, c4813e)) {
            this.f16923g0 = c4813e;
            m17796P1(1, 3, c4813e);
            this.f16886B.m17497h(C4041n0.m15456f0(c4813e.f18007j));
            this.f16932l.m15513i(20, new C4045q.a() { // from class: s3.i0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    ((InterfaceC4409b3.d) obj).onAudioAttributesChanged(C4813e.this);
                }
            });
        }
        this.f16885A.m17129m(z10 ? c4813e : null);
        this.f16924h.mo14081h(c4813e);
        boolean mo17089j = mo17089j();
        int m17132p = this.f16885A.m17132p(mo17089j, mo17100v());
        m17815Z1(mo17089j, m17132p, m17748d1(mo17089j, m17132p));
        this.f16932l.m15511f();
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: i */
    public long mo17088i() {
        m17822d2();
        return C4041n0.m15442Y0(this.f16947s0.f17002q);
    }

    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public final void m17763n1(C4443i1.e eVar) {
        long j10;
        boolean z10;
        long j11;
        int i10 = this.f16892H - eVar.f16361c;
        this.f16892H = i10;
        boolean z11 = true;
        if (eVar.f16362d) {
            this.f16893I = eVar.f16363e;
            this.f16894J = true;
        }
        if (eVar.f16364f) {
            this.f16895K = eVar.f16365g;
        }
        if (i10 == 0) {
            AbstractC4505u3 abstractC4505u3 = eVar.f16360b.f16986a;
            if (!this.f16947s0.f16986a.m17676u() && abstractC4505u3.m17676u()) {
                this.f16949t0 = -1;
                this.f16953v0 = 0L;
                this.f16951u0 = 0;
            }
            if (!abstractC4505u3.m17676u()) {
                List<AbstractC4505u3> m17222I = ((C4430f3) abstractC4505u3).m17222I();
                C4014a.m15200f(m17222I.size() == this.f16938o.size());
                for (int i11 = 0; i11 < m17222I.size(); i11++) {
                    this.f16938o.get(i11).f16964b = m17222I.get(i11);
                }
            }
            if (this.f16894J) {
                if (eVar.f16360b.f16987b.equals(this.f16947s0.f16987b) && eVar.f16360b.f16989d == this.f16947s0.f17003r) {
                    z11 = false;
                }
                if (z11) {
                    if (abstractC4505u3.m17676u() || eVar.f16360b.f16987b.m19438b()) {
                        j11 = eVar.f16360b.f16989d;
                    } else {
                        C4524y2 c4524y2 = eVar.f16360b;
                        j11 = m17791L1(abstractC4505u3, c4524y2.f16987b, c4524y2.f16989d);
                    }
                    j10 = j11;
                } else {
                    j10 = -9223372036854775807L;
                }
                z10 = z11;
            } else {
                j10 = -9223372036854775807L;
                z10 = false;
            }
            this.f16894J = false;
            m17817a2(eVar.f16360b, 1, this.f16895K, false, z10, this.f16893I, j10, -1, false);
        }
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: j */
    public boolean mo17089j() {
        m17822d2();
        return this.f16947s0.f16997l;
    }

    /* renamed from: j1 */
    public final int m17827j1(int i10) {
        AudioTrack audioTrack = this.f16904T;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i10) {
            this.f16904T.release();
            this.f16904T = null;
        }
        if (this.f16904T == null) {
            this.f16904T = new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
        }
        return this.f16904T.getAudioSessionId();
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: k */
    public int mo17090k() {
        m17822d2();
        if (this.f16947s0.f16986a.m17676u()) {
            return this.f16951u0;
        }
        C4524y2 c4524y2 = this.f16947s0;
        return c4524y2.f16986a.mo4743f(c4524y2.f16987b.f18457a);
    }

    @Override // p264s3.InterfaceC4486r
    /* renamed from: l */
    public void mo17511l(InterfaceC4882t interfaceC4882t) {
        m17822d2();
        m17800R1(Collections.singletonList(interfaceC4882t));
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: o */
    public void mo17093o(InterfaceC4409b3.d dVar) {
        this.f16932l.m15508c((InterfaceC4409b3.d) C4014a.m15199e(dVar));
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: p */
    public int mo17094p() {
        m17822d2();
        if (mo17087g()) {
            return this.f16947s0.f16987b.f18459c;
        }
        return -1;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: r */
    public void mo17096r(boolean z10) {
        m17822d2();
        int m17132p = this.f16885A.m17132p(z10, mo17100v());
        m17815Z1(z10, m17132p, m17748d1(z10, m17132p));
    }

    @Override // p264s3.InterfaceC4409b3
    public void release() {
        AudioTrack audioTrack;
        C4046r.m15526f("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + C4041n0.f14517e + "] [" + C4448j1.m17366b() + "]");
        m17822d2();
        if (C4041n0.f14513a < 21 && (audioTrack = this.f16904T) != null) {
            audioTrack.release();
            this.f16904T = null;
        }
        this.f16957z.m17068b(false);
        this.f16886B.m17496g();
        this.f16887C.m17065b(false);
        this.f16888D.m17115b(false);
        this.f16885A.m17125i();
        if (!this.f16930k.m17310k0()) {
            this.f16932l.m15515k(10, new C4045q.a() { // from class: s3.k0
                @Override // p222p5.C4045q.a
                public final void invoke(Object obj) {
                    C4512w0.m17767p1((InterfaceC4409b3.d) obj);
                }
            });
        }
        this.f16932l.m15514j();
        this.f16926i.mo15328k(null);
        this.f16948t.mo14782f(this.f16944r);
        C4524y2 m17866g = this.f16947s0.m17866g(1);
        this.f16947s0 = m17866g;
        C4524y2 m17861b = m17866g.m17861b(m17866g.f16987b);
        this.f16947s0 = m17861b;
        m17861b.f17001p = m17861b.f17003r;
        this.f16947s0.f17002q = 0L;
        this.f16944r.release();
        this.f16924h.mo14079f();
        m17794O1();
        Surface surface = this.f16906V;
        if (surface != null) {
            surface.release();
            this.f16906V = null;
        }
        if (this.f16937n0) {
            ((C4019c0) C4014a.m15199e(this.f16935m0)).m15270b(0);
            this.f16937n0 = false;
        }
        this.f16929j0 = C1550e.f5816j;
        this.f16939o0 = true;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: s */
    public long mo17097s() {
        m17822d2();
        if (!mo17087g()) {
            return mo17079H();
        }
        C4524y2 c4524y2 = this.f16947s0;
        c4524y2.f16986a.mo17028l(c4524y2.f16987b.f18457a, this.f16936n);
        C4524y2 c4524y22 = this.f16947s0;
        return c4524y22.f16988c == -9223372036854775807L ? c4524y22.f16986a.m17675r(mo17072A(), this.f16241a).m17703d() : this.f16936n.m17693p() + C4041n0.m15442Y0(this.f16947s0.f16988c);
    }

    @Override // p264s3.InterfaceC4409b3
    public void stop() {
        m17822d2();
        m17809W1(false);
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: t */
    public long mo17098t() {
        m17822d2();
        if (!mo17087g()) {
            return m17814Z0();
        }
        C4524y2 c4524y2 = this.f16947s0;
        return c4524y2.f16996k.equals(c4524y2.f16987b) ? C4041n0.m15442Y0(this.f16947s0.f17001p) : mo17083c();
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: v */
    public int mo17100v() {
        m17822d2();
        return this.f16947s0.f16990e;
    }

    @Override // p264s3.InterfaceC4486r
    /* renamed from: w */
    public C4463m1 mo17512w() {
        m17822d2();
        return this.f16902R;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: x */
    public C4530z3 mo17101x() {
        m17822d2();
        return this.f16947s0.f16994i.f13327d;
    }

    @Override // p264s3.InterfaceC4409b3
    /* renamed from: z */
    public int mo17103z() {
        m17822d2();
        if (mo17087g()) {
            return this.f16947s0.f16987b.f18458b;
        }
        return -1;
    }
}
