package p275t3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import p126i7.AbstractC2617d1;
import p126i7.AbstractC2651u;
import p137j4.AbstractC3236o;
import p137j4.C3234m;
import p206o5.C3893a0;
import p206o5.C3919n0;
import p206o5.C3928w;
import p206o5.C3930y;
import p206o5.C3931z;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4053y;
import p236q5.C4192y;
import p264s3.AbstractC4505u3;
import p264s3.C4441i;
import p264s3.C4463m1;
import p264s3.C4481q;
import p264s3.C4499t2;
import p264s3.C4503u1;
import p264s3.C4519x2;
import p264s3.C4530z3;
import p264s3.InterfaceC4409b3;
import p275t3.InterfaceC4621b;
import p275t3.InterfaceC4671r1;
import p289u3.InterfaceC4837t;
import p290u4.C4870n;
import p290u4.C4876q;
import p290u4.InterfaceC4882t;
import p304v3.C5108e;
import p317w3.C5237h;
import p317w3.C5244k0;
import p317w3.C5247m;
import p317w3.InterfaceC5248n;

/* renamed from: t3.q1 */
/* loaded from: classes.dex */
public final class C4668q1 implements InterfaceC4621b, InterfaceC4671r1.a {

    /* renamed from: A */
    public boolean f17442A;

    /* renamed from: a */
    public final Context f17443a;

    /* renamed from: b */
    public final InterfaceC4671r1 f17444b;

    /* renamed from: c */
    public final PlaybackSession f17445c;

    /* renamed from: i */
    public String f17451i;

    /* renamed from: j */
    public PlaybackMetrics.Builder f17452j;

    /* renamed from: k */
    public int f17453k;

    /* renamed from: n */
    public C4519x2 f17456n;

    /* renamed from: o */
    public b f17457o;

    /* renamed from: p */
    public b f17458p;

    /* renamed from: q */
    public b f17459q;

    /* renamed from: r */
    public C4463m1 f17460r;

    /* renamed from: s */
    public C4463m1 f17461s;

    /* renamed from: t */
    public C4463m1 f17462t;

    /* renamed from: u */
    public boolean f17463u;

    /* renamed from: v */
    public int f17464v;

    /* renamed from: w */
    public boolean f17465w;

    /* renamed from: x */
    public int f17466x;

    /* renamed from: y */
    public int f17467y;

    /* renamed from: z */
    public int f17468z;

    /* renamed from: e */
    public final AbstractC4505u3.d f17447e = new AbstractC4505u3.d();

    /* renamed from: f */
    public final AbstractC4505u3.b f17448f = new AbstractC4505u3.b();

    /* renamed from: h */
    public final HashMap<String, Long> f17450h = new HashMap<>();

    /* renamed from: g */
    public final HashMap<String, Long> f17449g = new HashMap<>();

    /* renamed from: d */
    public final long f17446d = SystemClock.elapsedRealtime();

    /* renamed from: l */
    public int f17454l = 0;

    /* renamed from: m */
    public int f17455m = 0;

    /* renamed from: t3.q1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f17469a;

        /* renamed from: b */
        public final int f17470b;

        public a(int i10, int i11) {
            this.f17469a = i10;
            this.f17470b = i11;
        }
    }

    /* renamed from: t3.q1$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final C4463m1 f17471a;

        /* renamed from: b */
        public final int f17472b;

        /* renamed from: c */
        public final String f17473c;

        public b(C4463m1 c4463m1, int i10, String str) {
            this.f17471a = c4463m1;
            this.f17472b = i10;
            this.f17473c = str;
        }
    }

    public C4668q1(Context context, PlaybackSession playbackSession) {
        this.f17443a = context.getApplicationContext();
        this.f17445c = playbackSession;
        C4665p1 c4665p1 = new C4665p1();
        this.f17444b = c4665p1;
        c4665p1.mo18453g(this);
    }

    /* renamed from: A0 */
    public static C4668q1 m18469A0(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new C4668q1(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    /* renamed from: C0 */
    public static int m18470C0(int i10) {
        switch (C4041n0.m15433U(i10)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    /* renamed from: D0 */
    public static C5247m m18471D0(AbstractC2651u<C4530z3.a> abstractC2651u) {
        C5247m c5247m;
        AbstractC2617d1<C4530z3.a> it = abstractC2651u.iterator();
        while (it.hasNext()) {
            C4530z3.a next = it.next();
            for (int i10 = 0; i10 < next.f17119h; i10++) {
                if (next.m17953e(i10) && (c5247m = next.m17950b(i10).f16509v) != null) {
                    return c5247m;
                }
            }
        }
        return null;
    }

    /* renamed from: E0 */
    public static int m18472E0(C5247m c5247m) {
        for (int i10 = 0; i10 < c5247m.f19908k; i10++) {
            UUID uuid = c5247m.m21259f(i10).f19910i;
            if (uuid.equals(C4441i.f16300d)) {
                return 3;
            }
            if (uuid.equals(C4441i.f16301e)) {
                return 2;
            }
            if (uuid.equals(C4441i.f16299c)) {
                return 6;
            }
        }
        return 1;
    }

    /* renamed from: F0 */
    public static a m18473F0(C4519x2 c4519x2, Context context, boolean z10) {
        int i10;
        boolean z11;
        if (c4519x2.f16978h == 1001) {
            return new a(20, 0);
        }
        if (c4519x2 instanceof C4481q) {
            C4481q c4481q = (C4481q) c4519x2;
            z11 = c4481q.f16611p == 1;
            i10 = c4481q.f16615t;
        } else {
            i10 = 0;
            z11 = false;
        }
        Throwable th = (Throwable) C4014a.m15199e(c4519x2.getCause());
        if (!(th instanceof IOException)) {
            if (z11 && (i10 == 0 || i10 == 1)) {
                return new a(35, 0);
            }
            if (z11 && i10 == 3) {
                return new a(15, 0);
            }
            if (z11 && i10 == 2) {
                return new a(23, 0);
            }
            if (th instanceof AbstractC3236o.b) {
                return new a(13, C4041n0.m15435V(((AbstractC3236o.b) th).f11316k));
            }
            if (th instanceof C3234m) {
                return new a(14, C4041n0.m15435V(((C3234m) th).f11233i));
            }
            if (th instanceof OutOfMemoryError) {
                return new a(14, 0);
            }
            if (th instanceof InterfaceC4837t.b) {
                return new a(17, ((InterfaceC4837t.b) th).f18141h);
            }
            if (th instanceof InterfaceC4837t.e) {
                return new a(18, ((InterfaceC4837t.e) th).f18146h);
            }
            if (C4041n0.f14513a < 16 || !(th instanceof MediaCodec.CryptoException)) {
                return new a(22, 0);
            }
            int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
            return new a(m18470C0(errorCode), errorCode);
        }
        if (th instanceof C3893a0) {
            return new a(5, ((C3893a0) th).f13968k);
        }
        if ((th instanceof C3931z) || (th instanceof C4499t2)) {
            return new a(z10 ? 10 : 11, 0);
        }
        if ((th instanceof C3930y) || (th instanceof C3919n0.a)) {
            if (C4053y.m15585d(context).m15589f() == 1) {
                return new a(3, 0);
            }
            Throwable cause = th.getCause();
            return cause instanceof UnknownHostException ? new a(6, 0) : cause instanceof SocketTimeoutException ? new a(7, 0) : ((th instanceof C3930y) && ((C3930y) th).f14182j == 1) ? new a(4, 0) : new a(8, 0);
        }
        if (c4519x2.f16978h == 1002) {
            return new a(21, 0);
        }
        if (!(th instanceof InterfaceC5248n.a)) {
            if (!(th instanceof C3928w.b) || !(th.getCause() instanceof FileNotFoundException)) {
                return new a(9, 0);
            }
            Throwable cause2 = ((Throwable) C4014a.m15199e(th.getCause())).getCause();
            return (C4041n0.f14513a >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) ? new a(32, 0) : new a(31, 0);
        }
        Throwable th2 = (Throwable) C4014a.m15199e(th.getCause());
        int i11 = C4041n0.f14513a;
        if (i11 < 21 || !(th2 instanceof MediaDrm.MediaDrmStateException)) {
            return (i11 < 23 || !(th2 instanceof MediaDrmResetException)) ? (i11 < 18 || !(th2 instanceof NotProvisionedException)) ? (i11 < 18 || !(th2 instanceof DeniedByServerException)) ? th2 instanceof C5244k0 ? new a(23, 0) : th2 instanceof C5237h.e ? new a(28, 0) : new a(30, 0) : new a(29, 0) : new a(24, 0) : new a(27, 0);
        }
        int m15435V = C4041n0.m15435V(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
        return new a(m18470C0(m15435V), m15435V);
    }

    /* renamed from: G0 */
    public static Pair<String, String> m18474G0(String str) {
        String[] m15426Q0 = C4041n0.m15426Q0(str, "-");
        return Pair.create(m15426Q0[0], m15426Q0.length >= 2 ? m15426Q0[1] : null);
    }

    /* renamed from: I0 */
    public static int m18475I0(Context context) {
        switch (C4053y.m15585d(context).m15589f()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    /* renamed from: J0 */
    public static int m18476J0(C4503u1 c4503u1) {
        C4503u1.h hVar = c4503u1.f16712i;
        if (hVar == null) {
            return 0;
        }
        int m15474o0 = C4041n0.m15474o0(hVar.f16786a, hVar.f16787b);
        if (m15474o0 == 0) {
            return 3;
        }
        if (m15474o0 != 1) {
            return m15474o0 != 2 ? 1 : 4;
        }
        return 5;
    }

    /* renamed from: K0 */
    public static int m18477K0(int i10) {
        if (i10 == 1) {
            return 2;
        }
        if (i10 != 2) {
            return i10 != 3 ? 1 : 4;
        }
        return 3;
    }

    /* renamed from: B0 */
    public final void m18478B0() {
        PlaybackMetrics.Builder builder = this.f17452j;
        if (builder != null && this.f17442A) {
            builder.setAudioUnderrunCount(this.f17468z);
            this.f17452j.setVideoFramesDropped(this.f17466x);
            this.f17452j.setVideoFramesPlayed(this.f17467y);
            Long l10 = this.f17449g.get(this.f17451i);
            this.f17452j.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = this.f17450h.get(this.f17451i);
            this.f17452j.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.f17452j.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.f17445c.reportPlaybackMetrics(this.f17452j.build());
        }
        this.f17452j = null;
        this.f17451i = null;
        this.f17468z = 0;
        this.f17466x = 0;
        this.f17467y = 0;
        this.f17460r = null;
        this.f17461s = null;
        this.f17462t = null;
        this.f17442A = false;
    }

    /* renamed from: H0 */
    public LogSessionId m18479H0() {
        return this.f17445c.getSessionId();
    }

    /* renamed from: L0 */
    public final void m18480L0(InterfaceC4621b.b bVar) {
        for (int i10 = 0; i10 < bVar.m18294d(); i10++) {
            int m18292b = bVar.m18292b(i10);
            InterfaceC4621b.a m18293c = bVar.m18293c(m18292b);
            if (m18292b == 0) {
                this.f17444b.mo18452f(m18293c);
            } else if (m18292b == 11) {
                this.f17444b.mo18447a(m18293c, this.f17453k);
            } else {
                this.f17444b.mo18450d(m18293c);
            }
        }
    }

    /* renamed from: M0 */
    public final void m18481M0(long j10) {
        int m18475I0 = m18475I0(this.f17443a);
        if (m18475I0 != this.f17455m) {
            this.f17455m = m18475I0;
            this.f17445c.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(m18475I0).setTimeSinceCreatedMillis(j10 - this.f17446d).build());
        }
    }

    @Override // p275t3.InterfaceC4621b
    /* renamed from: N */
    public void mo18231N(InterfaceC4621b.a aVar, C4870n c4870n, C4876q c4876q, IOException iOException, boolean z10) {
        this.f17464v = c4876q.f18446a;
    }

    /* renamed from: N0 */
    public final void m18482N0(long j10) {
        C4519x2 c4519x2 = this.f17456n;
        if (c4519x2 == null) {
            return;
        }
        a m18473F0 = m18473F0(c4519x2, this.f17443a, this.f17464v == 4);
        this.f17445c.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j10 - this.f17446d).setErrorCode(m18473F0.f17469a).setSubErrorCode(m18473F0.f17470b).setException(c4519x2).build());
        this.f17442A = true;
        this.f17456n = null;
    }

    /* renamed from: O0 */
    public final void m18483O0(InterfaceC4409b3 interfaceC4409b3, InterfaceC4621b.b bVar, long j10) {
        if (interfaceC4409b3.mo17100v() != 2) {
            this.f17463u = false;
        }
        if (interfaceC4409b3.mo17095q() == null) {
            this.f17465w = false;
        } else if (bVar.m18291a(10)) {
            this.f17465w = true;
        }
        int m18492W0 = m18492W0(interfaceC4409b3);
        if (this.f17454l != m18492W0) {
            this.f17454l = m18492W0;
            this.f17442A = true;
            this.f17445c.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.f17454l).setTimeSinceCreatedMillis(j10 - this.f17446d).build());
        }
    }

    /* renamed from: P0 */
    public final void m18484P0(InterfaceC4409b3 interfaceC4409b3, InterfaceC4621b.b bVar, long j10) {
        if (bVar.m18291a(2)) {
            C4530z3 mo17101x = interfaceC4409b3.mo17101x();
            boolean m17947c = mo17101x.m17947c(2);
            boolean m17947c2 = mo17101x.m17947c(1);
            boolean m17947c3 = mo17101x.m17947c(3);
            if (m17947c || m17947c2 || m17947c3) {
                if (!m17947c) {
                    m18490U0(j10, null, 0);
                }
                if (!m17947c2) {
                    m18485Q0(j10, null, 0);
                }
                if (!m17947c3) {
                    m18488S0(j10, null, 0);
                }
            }
        }
        if (m18496z0(this.f17457o)) {
            b bVar2 = this.f17457o;
            C4463m1 c4463m1 = bVar2.f17471a;
            if (c4463m1.f16512y != -1) {
                m18490U0(j10, c4463m1, bVar2.f17472b);
                this.f17457o = null;
            }
        }
        if (m18496z0(this.f17458p)) {
            b bVar3 = this.f17458p;
            m18485Q0(j10, bVar3.f17471a, bVar3.f17472b);
            this.f17458p = null;
        }
        if (m18496z0(this.f17459q)) {
            b bVar4 = this.f17459q;
            m18488S0(j10, bVar4.f17471a, bVar4.f17472b);
            this.f17459q = null;
        }
    }

    /* renamed from: Q0 */
    public final void m18485Q0(long j10, C4463m1 c4463m1, int i10) {
        if (C4041n0.m15449c(this.f17461s, c4463m1)) {
            return;
        }
        if (this.f17461s == null && i10 == 0) {
            i10 = 1;
        }
        this.f17461s = c4463m1;
        m18491V0(0, j10, c4463m1, i10);
    }

    @Override // p275t3.InterfaceC4671r1.a
    /* renamed from: R */
    public void mo18486R(InterfaceC4621b.a aVar, String str, String str2) {
    }

    /* renamed from: R0 */
    public final void m18487R0(InterfaceC4409b3 interfaceC4409b3, InterfaceC4621b.b bVar) {
        C5247m m18471D0;
        if (bVar.m18291a(0)) {
            InterfaceC4621b.a m18293c = bVar.m18293c(0);
            if (this.f17452j != null) {
                m18489T0(m18293c.f17304b, m18293c.f17306d);
            }
        }
        if (bVar.m18291a(2) && this.f17452j != null && (m18471D0 = m18471D0(interfaceC4409b3.mo17101x().m17946b())) != null) {
            ((PlaybackMetrics.Builder) C4041n0.m15463j(this.f17452j)).setDrmType(m18472E0(m18471D0));
        }
        if (bVar.m18291a(1011)) {
            this.f17468z++;
        }
    }

    /* renamed from: S0 */
    public final void m18488S0(long j10, C4463m1 c4463m1, int i10) {
        if (C4041n0.m15449c(this.f17462t, c4463m1)) {
            return;
        }
        if (this.f17462t == null && i10 == 0) {
            i10 = 1;
        }
        this.f17462t = c4463m1;
        m18491V0(2, j10, c4463m1, i10);
    }

    /* renamed from: T0 */
    public final void m18489T0(AbstractC4505u3 abstractC4505u3, InterfaceC4882t.b bVar) {
        int mo4743f;
        PlaybackMetrics.Builder builder = this.f17452j;
        if (bVar == null || (mo4743f = abstractC4505u3.mo4743f(bVar.f18457a)) == -1) {
            return;
        }
        abstractC4505u3.m17672j(mo4743f, this.f17448f);
        abstractC4505u3.m17675r(this.f17448f.f16834j, this.f17447e);
        builder.setStreamType(m18476J0(this.f17447e.f16862j));
        AbstractC4505u3.d dVar = this.f17447e;
        if (dVar.f16873u != -9223372036854775807L && !dVar.f16871s && !dVar.f16868p && !dVar.m17706g()) {
            builder.setMediaDurationMillis(this.f17447e.m17705f());
        }
        builder.setPlaybackType(this.f17447e.m17706g() ? 2 : 1);
        this.f17442A = true;
    }

    /* renamed from: U0 */
    public final void m18490U0(long j10, C4463m1 c4463m1, int i10) {
        if (C4041n0.m15449c(this.f17460r, c4463m1)) {
            return;
        }
        if (this.f17460r == null && i10 == 0) {
            i10 = 1;
        }
        this.f17460r = c4463m1;
        m18491V0(1, j10, c4463m1, i10);
    }

    /* renamed from: V0 */
    public final void m18491V0(int i10, long j10, C4463m1 c4463m1, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.f17446d);
        if (c4463m1 != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(m18477K0(i11));
            String str = c4463m1.f16505r;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c4463m1.f16506s;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c4463m1.f16503p;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = c4463m1.f16502o;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = c4463m1.f16511x;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = c4463m1.f16512y;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = c4463m1.f16485F;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = c4463m1.f16486G;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = c4463m1.f16497j;
            if (str4 != null) {
                Pair<String, String> m18474G0 = m18474G0(str4);
                timeSinceCreatedMillis.setLanguage((String) m18474G0.first);
                Object obj = m18474G0.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = c4463m1.f16513z;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f17442A = true;
        this.f17445c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    /* renamed from: W0 */
    public final int m18492W0(InterfaceC4409b3 interfaceC4409b3) {
        int mo17100v = interfaceC4409b3.mo17100v();
        if (this.f17463u) {
            return 5;
        }
        if (this.f17465w) {
            return 13;
        }
        if (mo17100v == 4) {
            return 11;
        }
        if (mo17100v == 2) {
            int i10 = this.f17454l;
            if (i10 == 0 || i10 == 2) {
                return 2;
            }
            if (interfaceC4409b3.mo17089j()) {
                return interfaceC4409b3.mo17075D() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (mo17100v == 3) {
            if (interfaceC4409b3.mo17089j()) {
                return interfaceC4409b3.mo17075D() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (mo17100v != 1 || this.f17454l == 0) {
            return this.f17454l;
        }
        return 12;
    }

    @Override // p275t3.InterfaceC4621b
    /* renamed from: f0 */
    public void mo18254f0(InterfaceC4621b.a aVar, int i10, long j10, long j11) {
        InterfaceC4882t.b bVar = aVar.f17306d;
        if (bVar != null) {
            String mo18451e = this.f17444b.mo18451e(aVar.f17304b, (InterfaceC4882t.b) C4014a.m15199e(bVar));
            Long l10 = this.f17450h.get(mo18451e);
            Long l11 = this.f17449g.get(mo18451e);
            this.f17450h.put(mo18451e, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.f17449g.put(mo18451e, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // p275t3.InterfaceC4671r1.a
    /* renamed from: g0 */
    public void mo18493g0(InterfaceC4621b.a aVar, String str) {
        InterfaceC4882t.b bVar = aVar.f17306d;
        if (bVar == null || !bVar.m19438b()) {
            m18478B0();
            this.f17451i = str;
            this.f17452j = new PlaybackMetrics.Builder().setPlayerName("ExoPlayerLib").setPlayerVersion("2.18.7");
            m18489T0(aVar.f17304b, aVar.f17306d);
        }
    }

    @Override // p275t3.InterfaceC4621b
    /* renamed from: h */
    public void mo18256h(InterfaceC4621b.a aVar, C4876q c4876q) {
        if (aVar.f17306d == null) {
            return;
        }
        b bVar = new b((C4463m1) C4014a.m15199e(c4876q.f18448c), c4876q.f18449d, this.f17444b.mo18451e(aVar.f17304b, (InterfaceC4882t.b) C4014a.m15199e(aVar.f17306d)));
        int i10 = c4876q.f18447b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f17458p = bVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f17459q = bVar;
                return;
            }
        }
        this.f17457o = bVar;
    }

    @Override // p275t3.InterfaceC4621b
    /* renamed from: h0 */
    public void mo18257h0(InterfaceC4621b.a aVar, C4519x2 c4519x2) {
        this.f17456n = c4519x2;
    }

    @Override // p275t3.InterfaceC4671r1.a
    /* renamed from: m0 */
    public void mo18494m0(InterfaceC4621b.a aVar, String str, boolean z10) {
        InterfaceC4882t.b bVar = aVar.f17306d;
        if ((bVar == null || !bVar.m19438b()) && str.equals(this.f17451i)) {
            m18478B0();
        }
        this.f17449g.remove(str);
        this.f17450h.remove(str);
    }

    @Override // p275t3.InterfaceC4621b
    /* renamed from: o */
    public void mo18269o(InterfaceC4621b.a aVar, C4192y c4192y) {
        b bVar = this.f17457o;
        if (bVar != null) {
            C4463m1 c4463m1 = bVar.f17471a;
            if (c4463m1.f16512y == -1) {
                this.f17457o = new b(c4463m1.m17411b().m17481n0(c4192y.f15139h).m17460S(c4192y.f15140i).m17448G(), bVar.f17472b, bVar.f17473c);
            }
        }
    }

    @Override // p275t3.InterfaceC4621b
    /* renamed from: r */
    public void mo18275r(InterfaceC4409b3 interfaceC4409b3, InterfaceC4621b.b bVar) {
        if (bVar.m18294d() == 0) {
            return;
        }
        m18480L0(bVar);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        m18487R0(interfaceC4409b3, bVar);
        m18482N0(elapsedRealtime);
        m18484P0(interfaceC4409b3, bVar, elapsedRealtime);
        m18481M0(elapsedRealtime);
        m18483O0(interfaceC4409b3, bVar, elapsedRealtime);
        if (bVar.m18291a(1028)) {
            this.f17444b.mo18449c(bVar.m18293c(1028));
        }
    }

    @Override // p275t3.InterfaceC4621b
    /* renamed from: s */
    public void mo18277s(InterfaceC4621b.a aVar, InterfaceC4409b3.e eVar, InterfaceC4409b3.e eVar2, int i10) {
        if (i10 == 1) {
            this.f17463u = true;
        }
        this.f17453k = i10;
    }

    @Override // p275t3.InterfaceC4671r1.a
    /* renamed from: x */
    public void mo18495x(InterfaceC4621b.a aVar, String str) {
    }

    @Override // p275t3.InterfaceC4621b
    /* renamed from: y */
    public void mo18288y(InterfaceC4621b.a aVar, C5108e c5108e) {
        this.f17466x += c5108e.f19277g;
        this.f17467y += c5108e.f19275e;
    }

    /* renamed from: z0 */
    public final boolean m18496z0(b bVar) {
        return bVar != null && bVar.f17473c.equals(this.f17444b.mo18448b());
    }
}
