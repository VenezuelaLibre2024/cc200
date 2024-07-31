package p236q5;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.List;
import p126i7.AbstractC2651u;
import p137j4.AbstractC3236o;
import p137j4.C3234m;
import p137j4.C3235n;
import p137j4.C3243v;
import p137j4.InterfaceC3233l;
import p137j4.InterfaceC3238q;
import p222p5.C4014a;
import p222p5.C4035k0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4049u;
import p222p5.C4050v;
import p236q5.InterfaceC4190w;
import p264s3.C4463m1;
import p264s3.C4468n1;
import p264s3.C4481q;
import p264s3.InterfaceC4450j3;
import p304v3.C5108e;
import p304v3.C5110g;
import p304v3.C5112i;

/* renamed from: q5.h */
/* loaded from: classes.dex */
public class C4175h extends AbstractC3236o {

    /* renamed from: u1 */
    public static final int[] f15023u1 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* renamed from: v1 */
    public static boolean f15024v1;

    /* renamed from: w1 */
    public static boolean f15025w1;

    /* renamed from: K0 */
    public final Context f15026K0;

    /* renamed from: L0 */
    public final C4179l f15027L0;

    /* renamed from: M0 */
    public final InterfaceC4190w.a f15028M0;

    /* renamed from: N0 */
    public final long f15029N0;

    /* renamed from: O0 */
    public final int f15030O0;

    /* renamed from: P0 */
    public final boolean f15031P0;

    /* renamed from: Q0 */
    public b f15032Q0;

    /* renamed from: R0 */
    public boolean f15033R0;

    /* renamed from: S0 */
    public boolean f15034S0;

    /* renamed from: T0 */
    public Surface f15035T0;

    /* renamed from: U0 */
    public C4176i f15036U0;

    /* renamed from: V0 */
    public boolean f15037V0;

    /* renamed from: W0 */
    public int f15038W0;

    /* renamed from: X0 */
    public boolean f15039X0;

    /* renamed from: Y0 */
    public boolean f15040Y0;

    /* renamed from: Z0 */
    public boolean f15041Z0;

    /* renamed from: a1 */
    public long f15042a1;

    /* renamed from: b1 */
    public long f15043b1;

    /* renamed from: c1 */
    public long f15044c1;

    /* renamed from: d1 */
    public int f15045d1;

    /* renamed from: e1 */
    public int f15046e1;

    /* renamed from: f1 */
    public int f15047f1;

    /* renamed from: g1 */
    public long f15048g1;

    /* renamed from: h1 */
    public long f15049h1;

    /* renamed from: i1 */
    public long f15050i1;

    /* renamed from: j1 */
    public int f15051j1;

    /* renamed from: k1 */
    public long f15052k1;

    /* renamed from: l1 */
    public int f15053l1;

    /* renamed from: m1 */
    public int f15054m1;

    /* renamed from: n1 */
    public int f15055n1;

    /* renamed from: o1 */
    public float f15056o1;

    /* renamed from: p1 */
    public C4192y f15057p1;

    /* renamed from: q1 */
    public boolean f15058q1;

    /* renamed from: r1 */
    public int f15059r1;

    /* renamed from: s1 */
    public c f15060s1;

    /* renamed from: t1 */
    public InterfaceC4177j f15061t1;

    /* renamed from: q5.h$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static boolean m16092a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: q5.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f15062a;

        /* renamed from: b */
        public final int f15063b;

        /* renamed from: c */
        public final int f15064c;

        public b(int i10, int i11, int i12) {
            this.f15062a = i10;
            this.f15063b = i11;
            this.f15064c = i12;
        }
    }

    /* renamed from: q5.h$c */
    /* loaded from: classes.dex */
    public final class c implements InterfaceC3233l.c, Handler.Callback {

        /* renamed from: h */
        public final Handler f15065h;

        public c(InterfaceC3233l interfaceC3233l) {
            Handler m15491x = C4041n0.m15491x(this);
            this.f15065h = m15491x;
            interfaceC3233l.mo11502j(this, m15491x);
        }

        @Override // p137j4.InterfaceC3233l.c
        /* renamed from: a */
        public void mo11567a(InterfaceC3233l interfaceC3233l, long j10, long j11) {
            if (C4041n0.f14513a >= 30) {
                m16093b(j10);
            } else {
                this.f15065h.sendMessageAtFrontOfQueue(Message.obtain(this.f15065h, 0, (int) (j10 >> 32), (int) j10));
            }
        }

        /* renamed from: b */
        public final void m16093b(long j10) {
            C4175h c4175h = C4175h.this;
            if (this != c4175h.f15060s1 || c4175h.m11681x0() == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                C4175h.this.m16077b2();
                return;
            }
            try {
                C4175h.this.m16076a2(j10);
            } catch (C4481q e10) {
                C4175h.this.m11663o1(e10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            m16093b(C4041n0.m15436V0(message.arg1, message.arg2));
            return true;
        }
    }

    public C4175h(Context context, InterfaceC3233l.b bVar, InterfaceC3238q interfaceC3238q, long j10, boolean z10, Handler handler, InterfaceC4190w interfaceC4190w, int i10) {
        this(context, bVar, interfaceC3238q, j10, z10, handler, interfaceC4190w, i10, 30.0f);
    }

    public C4175h(Context context, InterfaceC3233l.b bVar, InterfaceC3238q interfaceC3238q, long j10, boolean z10, Handler handler, InterfaceC4190w interfaceC4190w, int i10, float f10) {
        super(2, bVar, interfaceC3238q, z10, f10);
        this.f15029N0 = j10;
        this.f15030O0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.f15026K0 = applicationContext;
        this.f15027L0 = new C4179l(applicationContext);
        this.f15028M0 = new InterfaceC4190w.a(handler, interfaceC4190w);
        this.f15031P0 = m16051G1();
        this.f15043b1 = -9223372036854775807L;
        this.f15053l1 = -1;
        this.f15054m1 = -1;
        this.f15056o1 = -1.0f;
        this.f15038W0 = 1;
        this.f15059r1 = 0;
        m16063D1();
    }

    /* renamed from: F1 */
    public static void m16050F1(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    /* renamed from: G1 */
    public static boolean m16051G1() {
        return "NVIDIA".equals(C4041n0.f14515c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0722, code lost:
    
        if (r0.equals("ELUGA_Ray_X") == false) goto L91;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x089a. Please report as an issue. */
    /* renamed from: I1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m16052I1() {
        /*
            Method dump skipped, instructions count: 3180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p236q5.C4175h.m16052I1():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007a, code lost:
    
        if (r3.equals("video/av01") == false) goto L18;
     */
    /* renamed from: J1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m16053J1(p137j4.C3235n r9, p264s3.C4463m1 r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p236q5.C4175h.m16053J1(j4.n, s3.m1):int");
    }

    /* renamed from: K1 */
    public static Point m16054K1(C3235n c3235n, C4463m1 c4463m1) {
        int i10 = c4463m1.f16512y;
        int i11 = c4463m1.f16511x;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f15023u1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (C4041n0.f14513a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point m11587c = c3235n.m11587c(i15, i13);
                if (c3235n.m11598w(m11587c.x, m11587c.y, c4463m1.f16513z)) {
                    return m11587c;
                }
            } else {
                try {
                    int m15467l = C4041n0.m15467l(i13, 16) * 16;
                    int m15467l2 = C4041n0.m15467l(i14, 16) * 16;
                    if (m15467l * m15467l2 <= C3243v.m11706N()) {
                        int i16 = z10 ? m15467l2 : m15467l;
                        if (!z10) {
                            m15467l = m15467l2;
                        }
                        return new Point(i16, m15467l);
                    }
                } catch (C3243v.c unused) {
                }
            }
        }
        return null;
    }

    /* renamed from: M1 */
    public static List<C3235n> m16055M1(Context context, InterfaceC3238q interfaceC3238q, C4463m1 c4463m1, boolean z10, boolean z11) {
        String str = c4463m1.f16506s;
        if (str == null) {
            return AbstractC2651u.m10770u();
        }
        List<C3235n> mo11691a = interfaceC3238q.mo11691a(str, z10, z11);
        String m11723m = C3243v.m11723m(c4463m1);
        if (m11723m == null) {
            return AbstractC2651u.m10768p(mo11691a);
        }
        List<C3235n> mo11691a2 = interfaceC3238q.mo11691a(m11723m, z10, z11);
        return (C4041n0.f14513a < 26 || !"video/dolby-vision".equals(c4463m1.f16506s) || mo11691a2.isEmpty() || a.m16092a(context)) ? AbstractC2651u.m10766n().m10783j(mo11691a).m10783j(mo11691a2).m10784k() : AbstractC2651u.m10768p(mo11691a2);
    }

    /* renamed from: N1 */
    public static int m16056N1(C3235n c3235n, C4463m1 c4463m1) {
        if (c4463m1.f16507t == -1) {
            return m16053J1(c3235n, c4463m1);
        }
        int size = c4463m1.f16508u.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += c4463m1.f16508u.get(i11).length;
        }
        return c4463m1.f16507t + i10;
    }

    /* renamed from: O1 */
    public static int m16057O1(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    /* renamed from: Q1 */
    public static boolean m16058Q1(long j10) {
        return j10 < -30000;
    }

    /* renamed from: R1 */
    public static boolean m16059R1(long j10) {
        return j10 < -500000;
    }

    /* renamed from: f2 */
    public static void m16060f2(InterfaceC3233l interfaceC3233l, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        interfaceC3233l.mo11496d(bundle);
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: A0 */
    public float mo11614A0(float f10, C4463m1 c4463m1, C4463m1[] c4463m1Arr) {
        float f11 = -1.0f;
        for (C4463m1 c4463m12 : c4463m1Arr) {
            float f12 = c4463m12.f16513z;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: C0 */
    public List<C3235n> mo11616C0(InterfaceC3238q interfaceC3238q, C4463m1 c4463m1, boolean z10) {
        return C3243v.m11731u(m16055M1(this.f15026K0, interfaceC3238q, c4463m1, z10, this.f15058q1), c4463m1);
    }

    /* renamed from: C1 */
    public final void m16062C1() {
        InterfaceC3233l m11681x0;
        this.f15039X0 = false;
        if (C4041n0.f14513a < 23 || !this.f15058q1 || (m11681x0 = m11681x0()) == null) {
            return;
        }
        this.f15060s1 = new c(m11681x0);
    }

    /* renamed from: D1 */
    public final void m16063D1() {
        this.f15057p1 = null;
    }

    @Override // p137j4.AbstractC3236o
    @TargetApi(17)
    /* renamed from: E0 */
    public InterfaceC3233l.a mo11618E0(C3235n c3235n, C4463m1 c4463m1, MediaCrypto mediaCrypto, float f10) {
        C4176i c4176i = this.f15036U0;
        if (c4176i != null && c4176i.f15069h != c3235n.f11240g) {
            m16078c2();
        }
        String str = c3235n.f11236c;
        b m16066L1 = m16066L1(c3235n, c4463m1, m17208N());
        this.f15032Q0 = m16066L1;
        MediaFormat m16067P1 = m16067P1(c4463m1, str, m16066L1, f10, this.f15031P0, this.f15058q1 ? this.f15059r1 : 0);
        if (this.f15035T0 == null) {
            if (!m16087m2(c3235n)) {
                throw new IllegalStateException();
            }
            if (this.f15036U0 == null) {
                this.f15036U0 = C4176i.m16096d(this.f15026K0, c3235n.f11240g);
            }
            this.f15035T0 = this.f15036U0;
        }
        return InterfaceC3233l.a.m11566b(c3235n, m16067P1, c4463m1, this.f15035T0, mediaCrypto);
    }

    /* renamed from: E1 */
    public boolean m16064E1(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C4175h.class) {
            if (!f15024v1) {
                f15025w1 = m16052I1();
                f15024v1 = true;
            }
        }
        return f15025w1;
    }

    @Override // p137j4.AbstractC3236o
    @TargetApi(29)
    /* renamed from: H0 */
    public void mo11621H0(C5110g c5110g) {
        if (this.f15034S0) {
            ByteBuffer byteBuffer = (ByteBuffer) C4014a.m15199e(c5110g.f19287m);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        m16060f2(m11681x0(), bArr);
                    }
                }
            }
        }
    }

    /* renamed from: H1 */
    public void m16065H1(InterfaceC3233l interfaceC3233l, int i10, long j10) {
        C4035k0.m15372a("dropVideoBuffer");
        interfaceC3233l.mo11500h(i10, false);
        C4035k0.m15374c();
        m16089o2(0, 1);
    }

    /* renamed from: L1 */
    public b m16066L1(C3235n c3235n, C4463m1 c4463m1, C4463m1[] c4463m1Arr) {
        int m16053J1;
        int i10 = c4463m1.f16511x;
        int i11 = c4463m1.f16512y;
        int m16056N1 = m16056N1(c3235n, c4463m1);
        if (c4463m1Arr.length == 1) {
            if (m16056N1 != -1 && (m16053J1 = m16053J1(c3235n, c4463m1)) != -1) {
                m16056N1 = Math.min((int) (m16056N1 * 1.5f), m16053J1);
            }
            return new b(i10, i11, m16056N1);
        }
        int length = c4463m1Arr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            C4463m1 c4463m12 = c4463m1Arr[i12];
            if (c4463m1.f16484E != null && c4463m12.f16484E == null) {
                c4463m12 = c4463m12.m17411b().m17453L(c4463m1.f16484E).m17448G();
            }
            if (c3235n.m11588f(c4463m1, c4463m12).f19297d != 0) {
                int i13 = c4463m12.f16511x;
                z10 |= i13 == -1 || c4463m12.f16512y == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, c4463m12.f16512y);
                m16056N1 = Math.max(m16056N1, m16056N1(c3235n, c4463m12));
            }
        }
        if (z10) {
            C4046r.m15529i("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point m16054K1 = m16054K1(c3235n, c4463m1);
            if (m16054K1 != null) {
                i10 = Math.max(i10, m16054K1.x);
                i11 = Math.max(i11, m16054K1.y);
                m16056N1 = Math.max(m16056N1, m16053J1(c3235n, c4463m1.m17411b().m17481n0(i10).m17460S(i11).m17448G()));
                C4046r.m15529i("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new b(i10, i11, m16056N1);
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: P */
    public void mo6368P() {
        m16063D1();
        m16062C1();
        this.f15037V0 = false;
        this.f15060s1 = null;
        try {
            super.mo6368P();
        } finally {
            this.f15028M0.m16169m(this.f11257F0);
        }
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(21)
    /* renamed from: P1 */
    public MediaFormat m16067P1(C4463m1 c4463m1, String str, b bVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> m11727q;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", c4463m1.f16511x);
        mediaFormat.setInteger("height", c4463m1.f16512y);
        C4049u.m15543e(mediaFormat, c4463m1.f16508u);
        C4049u.m15541c(mediaFormat, "frame-rate", c4463m1.f16513z);
        C4049u.m15542d(mediaFormat, "rotation-degrees", c4463m1.f16480A);
        C4049u.m15540b(mediaFormat, c4463m1.f16484E);
        if ("video/dolby-vision".equals(c4463m1.f16506s) && (m11727q = C3243v.m11727q(c4463m1)) != null) {
            C4049u.m15542d(mediaFormat, "profile", ((Integer) m11727q.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f15062a);
        mediaFormat.setInteger("max-height", bVar.f15063b);
        C4049u.m15542d(mediaFormat, "max-input-size", bVar.f15064c);
        if (C4041n0.f14513a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            m16050F1(mediaFormat, i10);
        }
        return mediaFormat;
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: Q */
    public void mo11627Q(boolean z10, boolean z11) {
        super.mo11627Q(z10, z11);
        boolean z12 = m17204J().f16425a;
        C4014a.m15200f((z12 && this.f15059r1 == 0) ? false : true);
        if (this.f15058q1 != z12) {
            this.f15058q1 = z12;
            m11650f1();
        }
        this.f15028M0.m16171o(this.f11257F0);
        this.f15040Y0 = z11;
        this.f15041Z0 = false;
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: R */
    public void mo6369R(long j10, boolean z10) {
        super.mo6369R(j10, z10);
        m16062C1();
        this.f15027L0.m16112j();
        this.f15048g1 = -9223372036854775807L;
        this.f15042a1 = -9223372036854775807L;
        this.f15046e1 = 0;
        if (z10) {
            m16081g2();
        } else {
            this.f15043b1 = -9223372036854775807L;
        }
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: R0 */
    public void mo11629R0(Exception exc) {
        C4046r.m15524d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f15028M0.m16165C(exc);
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    @TargetApi(17)
    /* renamed from: S */
    public void mo11630S() {
        try {
            super.mo11630S();
        } finally {
            if (this.f15036U0 != null) {
                m16078c2();
            }
        }
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: S0 */
    public void mo11631S0(String str, InterfaceC3233l.a aVar, long j10, long j11) {
        this.f15028M0.m16167k(str, j10, j11);
        this.f15033R0 = m16064E1(str);
        this.f15034S0 = ((C3235n) C4014a.m15199e(m11683y0())).m11595p();
        if (C4041n0.f14513a < 23 || !this.f15058q1) {
            return;
        }
        this.f15060s1 = new c((InterfaceC3233l) C4014a.m15199e(m11681x0()));
    }

    /* renamed from: S1 */
    public boolean m16068S1(long j10, boolean z10) {
        int m17212Y = m17212Y(j10);
        if (m17212Y == 0) {
            return false;
        }
        if (z10) {
            C5108e c5108e = this.f11257F0;
            c5108e.f19274d += m17212Y;
            c5108e.f19276f += this.f15047f1;
        } else {
            this.f11257F0.f19280j++;
            m16089o2(m17212Y, this.f15047f1);
        }
        m11675u0();
        return true;
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: T */
    public void mo11632T() {
        super.mo11632T();
        this.f15045d1 = 0;
        this.f15044c1 = SystemClock.elapsedRealtime();
        this.f15049h1 = SystemClock.elapsedRealtime() * 1000;
        this.f15050i1 = 0L;
        this.f15051j1 = 0;
        this.f15027L0.m16113k();
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: T0 */
    public void mo11633T0(String str) {
        this.f15028M0.m16168l(str);
    }

    /* renamed from: T1 */
    public final void m16069T1() {
        if (this.f15045d1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f15028M0.m16170n(this.f15045d1, elapsedRealtime - this.f15044c1);
            this.f15045d1 = 0;
            this.f15044c1 = elapsedRealtime;
        }
    }

    @Override // p137j4.AbstractC3236o, p264s3.AbstractC4426f
    /* renamed from: U */
    public void mo11634U() {
        this.f15043b1 = -9223372036854775807L;
        m16069T1();
        m16071V1();
        this.f15027L0.m16114l();
        super.mo11634U();
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: U0 */
    public C5112i mo11635U0(C4468n1 c4468n1) {
        C5112i mo11635U0 = super.mo11635U0(c4468n1);
        this.f15028M0.m16172p(c4468n1.f16559b, mo11635U0);
        return mo11635U0;
    }

    /* renamed from: U1 */
    public void m16070U1() {
        this.f15041Z0 = true;
        if (this.f15039X0) {
            return;
        }
        this.f15039X0 = true;
        this.f15028M0.m16163A(this.f15035T0);
        this.f15037V0 = true;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: V0 */
    public void mo11636V0(C4463m1 c4463m1, MediaFormat mediaFormat) {
        InterfaceC3233l m11681x0 = m11681x0();
        if (m11681x0 != null) {
            m11681x0.mo11501i(this.f15038W0);
        }
        if (this.f15058q1) {
            this.f15053l1 = c4463m1.f16511x;
            this.f15054m1 = c4463m1.f16512y;
        } else {
            C4014a.m15199e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f15053l1 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f15054m1 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = c4463m1.f16481B;
        this.f15056o1 = f10;
        if (C4041n0.f14513a >= 21) {
            int i10 = c4463m1.f16480A;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f15053l1;
                this.f15053l1 = this.f15054m1;
                this.f15054m1 = i11;
                this.f15056o1 = 1.0f / f10;
            }
        } else {
            this.f15055n1 = c4463m1.f16480A;
        }
        this.f15027L0.m16109g(c4463m1.f16513z);
    }

    /* renamed from: V1 */
    public final void m16071V1() {
        int i10 = this.f15051j1;
        if (i10 != 0) {
            this.f15028M0.m16164B(this.f15050i1, i10);
            this.f15050i1 = 0L;
            this.f15051j1 = 0;
        }
    }

    /* renamed from: W1 */
    public final void m16072W1() {
        int i10 = this.f15053l1;
        if (i10 == -1 && this.f15054m1 == -1) {
            return;
        }
        C4192y c4192y = this.f15057p1;
        if (c4192y != null && c4192y.f15139h == i10 && c4192y.f15140i == this.f15054m1 && c4192y.f15141j == this.f15055n1 && c4192y.f15142k == this.f15056o1) {
            return;
        }
        C4192y c4192y2 = new C4192y(this.f15053l1, this.f15054m1, this.f15055n1, this.f15056o1);
        this.f15057p1 = c4192y2;
        this.f15028M0.m16166D(c4192y2);
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: X0 */
    public void mo11638X0(long j10) {
        super.mo11638X0(j10);
        if (this.f15058q1) {
            return;
        }
        this.f15047f1--;
    }

    /* renamed from: X1 */
    public final void m16073X1() {
        if (this.f15037V0) {
            this.f15028M0.m16163A(this.f15035T0);
        }
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: Y0 */
    public void mo11639Y0() {
        super.mo11639Y0();
        m16062C1();
    }

    /* renamed from: Y1 */
    public final void m16074Y1() {
        C4192y c4192y = this.f15057p1;
        if (c4192y != null) {
            this.f15028M0.m16166D(c4192y);
        }
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: Z0 */
    public void mo11641Z0(C5110g c5110g) {
        boolean z10 = this.f15058q1;
        if (!z10) {
            this.f15047f1++;
        }
        if (C4041n0.f14513a >= 23 || !z10) {
            return;
        }
        m16076a2(c5110g.f19286l);
    }

    /* renamed from: Z1 */
    public final void m16075Z1(long j10, long j11, C4463m1 c4463m1) {
        InterfaceC4177j interfaceC4177j = this.f15061t1;
        if (interfaceC4177j != null) {
            interfaceC4177j.mo16101h(j10, j11, c4463m1, m11615B0());
        }
    }

    /* renamed from: a2 */
    public void m16076a2(long j10) {
        m11684y1(j10);
        m16072W1();
        this.f11257F0.f19275e++;
        m16070U1();
        mo11638X0(j10);
    }

    @Override // p264s3.InterfaceC4445i3, p264s3.InterfaceC4450j3
    /* renamed from: b */
    public String mo6374b() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: b0 */
    public C5112i mo11644b0(C3235n c3235n, C4463m1 c4463m1, C4463m1 c4463m12) {
        C5112i m11588f = c3235n.m11588f(c4463m1, c4463m12);
        int i10 = m11588f.f19298e;
        int i11 = c4463m12.f16511x;
        b bVar = this.f15032Q0;
        if (i11 > bVar.f15062a || c4463m12.f16512y > bVar.f15063b) {
            i10 |= 256;
        }
        if (m16056N1(c3235n, c4463m12) > this.f15032Q0.f15064c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new C5112i(c3235n.f11234a, c4463m1, c4463m12, i12 != 0 ? 0 : m11588f.f19297d, i12);
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: b1 */
    public boolean mo11645b1(long j10, long j11, InterfaceC3233l interfaceC3233l, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C4463m1 c4463m1) {
        boolean z12;
        long j13;
        C4014a.m15199e(interfaceC3233l);
        if (this.f15042a1 == -9223372036854775807L) {
            this.f15042a1 = j10;
        }
        if (j12 != this.f15048g1) {
            this.f15027L0.m16110h(j12);
            this.f15048g1 = j12;
        }
        long m11619F0 = m11619F0();
        long j14 = j12 - m11619F0;
        if (z10 && !z11) {
            m16088n2(interfaceC3233l, i10, j14);
            return true;
        }
        double m11620G0 = m11620G0();
        boolean z13 = getState() == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j15 = (long) ((j12 - j10) / m11620G0);
        if (z13) {
            j15 -= elapsedRealtime - j11;
        }
        if (this.f15035T0 == this.f15036U0) {
            if (!m16058Q1(j15)) {
                return false;
            }
            m16088n2(interfaceC3233l, i10, j14);
            m16090p2(j15);
            return true;
        }
        long j16 = elapsedRealtime - this.f15049h1;
        if (this.f15041Z0 ? this.f15039X0 : !(z13 || this.f15040Y0)) {
            j13 = j16;
            z12 = false;
        } else {
            z12 = true;
            j13 = j16;
        }
        if (!(this.f15043b1 == -9223372036854775807L && j10 >= m11619F0 && (z12 || (z13 && m16086l2(j15, j13))))) {
            if (z13 && j10 != this.f15042a1) {
                long nanoTime = System.nanoTime();
                long m16107b = this.f15027L0.m16107b((j15 * 1000) + nanoTime);
                long j17 = (m16107b - nanoTime) / 1000;
                boolean z14 = this.f15043b1 != -9223372036854775807L;
                if (m16084j2(j17, j11, z11) && m16068S1(j10, z14)) {
                    return false;
                }
                if (m16085k2(j17, j11, z11)) {
                    if (z14) {
                        m16088n2(interfaceC3233l, i10, j14);
                    } else {
                        m16065H1(interfaceC3233l, i10, j14);
                    }
                    j15 = j17;
                } else {
                    j15 = j17;
                    if (C4041n0.f14513a >= 21) {
                        if (j15 < 50000) {
                            if (m16107b == this.f15052k1) {
                                m16088n2(interfaceC3233l, i10, j14);
                            } else {
                                m16075Z1(j14, m16107b, c4463m1);
                                m16080e2(interfaceC3233l, i10, j14, m16107b);
                            }
                            m16090p2(j15);
                            this.f15052k1 = m16107b;
                            return true;
                        }
                    } else if (j15 < 30000) {
                        if (j15 > 11000) {
                            try {
                                Thread.sleep((j15 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        m16075Z1(j14, m16107b, c4463m1);
                        m16079d2(interfaceC3233l, i10, j14);
                    }
                }
            }
            return false;
        }
        long nanoTime2 = System.nanoTime();
        m16075Z1(j14, nanoTime2, c4463m1);
        if (C4041n0.f14513a >= 21) {
            m16080e2(interfaceC3233l, i10, j14, nanoTime2);
        }
        m16079d2(interfaceC3233l, i10, j14);
        m16090p2(j15);
        return true;
    }

    /* renamed from: b2 */
    public final void m16077b2() {
        m11661n1();
    }

    /* renamed from: c2 */
    public final void m16078c2() {
        Surface surface = this.f15035T0;
        C4176i c4176i = this.f15036U0;
        if (surface == c4176i) {
            this.f15035T0 = null;
        }
        c4176i.release();
        this.f15036U0 = null;
    }

    /* renamed from: d2 */
    public void m16079d2(InterfaceC3233l interfaceC3233l, int i10, long j10) {
        m16072W1();
        C4035k0.m15372a("releaseOutputBuffer");
        interfaceC3233l.mo11500h(i10, true);
        C4035k0.m15374c();
        this.f15049h1 = SystemClock.elapsedRealtime() * 1000;
        this.f11257F0.f19275e++;
        this.f15046e1 = 0;
        m16070U1();
    }

    @Override // p137j4.AbstractC3236o, p264s3.InterfaceC4445i3
    /* renamed from: e */
    public boolean mo6379e() {
        C4176i c4176i;
        if (super.mo6379e() && (this.f15039X0 || (((c4176i = this.f15036U0) != null && this.f15035T0 == c4176i) || m11681x0() == null || this.f15058q1))) {
            this.f15043b1 = -9223372036854775807L;
            return true;
        }
        if (this.f15043b1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f15043b1) {
            return true;
        }
        this.f15043b1 = -9223372036854775807L;
        return false;
    }

    /* renamed from: e2 */
    public void m16080e2(InterfaceC3233l interfaceC3233l, int i10, long j10, long j11) {
        m16072W1();
        C4035k0.m15372a("releaseOutputBuffer");
        interfaceC3233l.mo11497e(i10, j11);
        C4035k0.m15374c();
        this.f15049h1 = SystemClock.elapsedRealtime() * 1000;
        this.f11257F0.f19275e++;
        this.f15046e1 = 0;
        m16070U1();
    }

    /* renamed from: g2 */
    public final void m16081g2() {
        this.f15043b1 = this.f15029N0 > 0 ? SystemClock.elapsedRealtime() + this.f15029N0 : -9223372036854775807L;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: h1 */
    public void mo11652h1() {
        super.mo11652h1();
        this.f15047f1 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [q5.h, j4.o, s3.f] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    /* renamed from: h2 */
    public final void m16082h2(Object obj) {
        C4176i c4176i = obj instanceof Surface ? (Surface) obj : null;
        if (c4176i == null) {
            C4176i c4176i2 = this.f15036U0;
            if (c4176i2 != null) {
                c4176i = c4176i2;
            } else {
                C3235n m11683y0 = m11683y0();
                if (m11683y0 != null && m16087m2(m11683y0)) {
                    c4176i = C4176i.m16096d(this.f15026K0, m11683y0.f11240g);
                    this.f15036U0 = c4176i;
                }
            }
        }
        if (this.f15035T0 == c4176i) {
            if (c4176i == null || c4176i == this.f15036U0) {
                return;
            }
            m16074Y1();
            m16073X1();
            return;
        }
        this.f15035T0 = c4176i;
        this.f15027L0.m16115m(c4176i);
        this.f15037V0 = false;
        int state = getState();
        InterfaceC3233l m11681x0 = m11681x0();
        if (m11681x0 != null) {
            if (C4041n0.f14513a < 23 || c4176i == null || this.f15033R0) {
                m11650f1();
                m11626P0();
            } else {
                m16083i2(m11681x0, c4176i);
            }
        }
        if (c4176i == null || c4176i == this.f15036U0) {
            m16063D1();
            m16062C1();
            return;
        }
        m16074Y1();
        m16062C1();
        if (state == 2) {
            m16081g2();
        }
    }

    /* renamed from: i2 */
    public void m16083i2(InterfaceC3233l interfaceC3233l, Surface surface) {
        interfaceC3233l.mo11504l(surface);
    }

    /* renamed from: j2 */
    public boolean m16084j2(long j10, long j11, boolean z10) {
        return m16059R1(j10) && !z10;
    }

    /* renamed from: k2 */
    public boolean m16085k2(long j10, long j11, boolean z10) {
        return m16058Q1(j10) && !z10;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: l0 */
    public C3234m mo11656l0(Throwable th, C3235n c3235n) {
        return new C4174g(th, c3235n, this.f15035T0);
    }

    /* renamed from: l2 */
    public boolean m16086l2(long j10, long j11) {
        return m16058Q1(j10) && j11 > 100000;
    }

    /* renamed from: m2 */
    public final boolean m16087m2(C3235n c3235n) {
        return C4041n0.f14513a >= 23 && !this.f15058q1 && !m16064E1(c3235n.f11234a) && (!c3235n.f11240g || C4176i.m16095b(this.f15026K0));
    }

    /* renamed from: n2 */
    public void m16088n2(InterfaceC3233l interfaceC3233l, int i10, long j10) {
        C4035k0.m15372a("skipVideoBuffer");
        interfaceC3233l.mo11500h(i10, false);
        C4035k0.m15374c();
        this.f11257F0.f19276f++;
    }

    /* renamed from: o2 */
    public void m16089o2(int i10, int i11) {
        C5108e c5108e = this.f11257F0;
        c5108e.f19278h += i10;
        int i12 = i10 + i11;
        c5108e.f19277g += i12;
        this.f15045d1 += i12;
        int i13 = this.f15046e1 + i12;
        this.f15046e1 = i13;
        c5108e.f19279i = Math.max(i13, c5108e.f19279i);
        int i14 = this.f15030O0;
        if (i14 <= 0 || this.f15045d1 < i14) {
            return;
        }
        m16069T1();
    }

    /* renamed from: p2 */
    public void m16090p2(long j10) {
        this.f11257F0.m20758a(j10);
        this.f15050i1 += j10;
        this.f15051j1++;
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: r1 */
    public boolean mo11669r1(C3235n c3235n) {
        return this.f15035T0 != null || m16087m2(c3235n);
    }

    @Override // p137j4.AbstractC3236o, p264s3.InterfaceC4445i3
    /* renamed from: t */
    public void mo11672t(float f10, float f11) {
        super.mo11672t(f10, f11);
        this.f15027L0.m16111i(f10);
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: u1 */
    public int mo11676u1(InterfaceC3238q interfaceC3238q, C4463m1 c4463m1) {
        boolean z10;
        int i10 = 0;
        if (!C4050v.m15562s(c4463m1.f16506s)) {
            return InterfaceC4450j3.m17374v(0);
        }
        boolean z11 = c4463m1.f16509v != null;
        List<C3235n> m16055M1 = m16055M1(this.f15026K0, interfaceC3238q, c4463m1, z11, false);
        if (z11 && m16055M1.isEmpty()) {
            m16055M1 = m16055M1(this.f15026K0, interfaceC3238q, c4463m1, false, false);
        }
        if (m16055M1.isEmpty()) {
            return InterfaceC4450j3.m17374v(1);
        }
        if (!AbstractC3236o.m11613v1(c4463m1)) {
            return InterfaceC4450j3.m17374v(2);
        }
        C3235n c3235n = m16055M1.get(0);
        boolean m11594o = c3235n.m11594o(c4463m1);
        if (!m11594o) {
            for (int i11 = 1; i11 < m16055M1.size(); i11++) {
                C3235n c3235n2 = m16055M1.get(i11);
                if (c3235n2.m11594o(c4463m1)) {
                    z10 = false;
                    m11594o = true;
                    c3235n = c3235n2;
                    break;
                }
            }
        }
        z10 = true;
        int i12 = m11594o ? 4 : 3;
        int i13 = c3235n.m11597r(c4463m1) ? 16 : 8;
        int i14 = c3235n.f11241h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (C4041n0.f14513a >= 26 && "video/dolby-vision".equals(c4463m1.f16506s) && !a.m16092a(this.f15026K0)) {
            i15 = 256;
        }
        if (m11594o) {
            List<C3235n> m16055M12 = m16055M1(this.f15026K0, interfaceC3238q, c4463m1, z11, true);
            if (!m16055M12.isEmpty()) {
                C3235n c3235n3 = C3243v.m11731u(m16055M12, c4463m1).get(0);
                if (c3235n3.m11594o(c4463m1) && c3235n3.m11597r(c4463m1)) {
                    i10 = 32;
                }
            }
        }
        return InterfaceC4450j3.m17369n(i12, i13, i10, i14, i15);
    }

    @Override // p264s3.AbstractC4426f, p264s3.C4425e3.b
    /* renamed from: y */
    public void mo16091y(int i10, Object obj) {
        if (i10 == 1) {
            m16082h2(obj);
            return;
        }
        if (i10 == 7) {
            this.f15061t1 = (InterfaceC4177j) obj;
            return;
        }
        if (i10 == 10) {
            int intValue = ((Integer) obj).intValue();
            if (this.f15059r1 != intValue) {
                this.f15059r1 = intValue;
                if (this.f15058q1) {
                    m11650f1();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.mo16091y(i10, obj);
                return;
            } else {
                this.f15027L0.m16117o(((Integer) obj).intValue());
                return;
            }
        }
        this.f15038W0 = ((Integer) obj).intValue();
        InterfaceC3233l m11681x0 = m11681x0();
        if (m11681x0 != null) {
            m11681x0.mo11501i(this.f15038W0);
        }
    }

    @Override // p137j4.AbstractC3236o
    /* renamed from: z0 */
    public boolean mo11685z0() {
        return this.f15058q1 && C4041n0.f14513a < 23;
    }
}
