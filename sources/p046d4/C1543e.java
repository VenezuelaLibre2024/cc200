package p046d4;

import android.util.Pair;
import android.util.SparseArray;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4047s;
import p222p5.C4051w;
import p236q5.C4170c;
import p264s3.C4441i;
import p264s3.C4499t2;
import p317w3.C5247m;
import p333x3.C5560c;
import p333x3.C5561c0;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: d4.e */
/* loaded from: classes.dex */
public class C1543e implements InterfaceC5571k {

    /* renamed from: c0 */
    public static final InterfaceC5576p f5642c0 = new InterfaceC5576p() { // from class: d4.d
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m6258A;
            m6258A = C1543e.m6258A();
            return m6258A;
        }
    };

    /* renamed from: d0 */
    public static final byte[] f5643d0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: e0 */
    public static final byte[] f5644e0 = C4041n0.m15468l0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: f0 */
    public static final byte[] f5645f0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: g0 */
    public static final byte[] f5646g0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* renamed from: h0 */
    public static final UUID f5647h0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: i0 */
    public static final Map<String, Integer> f5648i0;

    /* renamed from: A */
    public long f5649A;

    /* renamed from: B */
    public long f5650B;

    /* renamed from: C */
    public C4047s f5651C;

    /* renamed from: D */
    public C4047s f5652D;

    /* renamed from: E */
    public boolean f5653E;

    /* renamed from: F */
    public boolean f5654F;

    /* renamed from: G */
    public int f5655G;

    /* renamed from: H */
    public long f5656H;

    /* renamed from: I */
    public long f5657I;

    /* renamed from: J */
    public int f5658J;

    /* renamed from: K */
    public int f5659K;

    /* renamed from: L */
    public int[] f5660L;

    /* renamed from: M */
    public int f5661M;

    /* renamed from: N */
    public int f5662N;

    /* renamed from: O */
    public int f5663O;

    /* renamed from: P */
    public int f5664P;

    /* renamed from: Q */
    public boolean f5665Q;

    /* renamed from: R */
    public long f5666R;

    /* renamed from: S */
    public int f5667S;

    /* renamed from: T */
    public int f5668T;

    /* renamed from: U */
    public int f5669U;

    /* renamed from: V */
    public boolean f5670V;

    /* renamed from: W */
    public boolean f5671W;

    /* renamed from: X */
    public boolean f5672X;

    /* renamed from: Y */
    public int f5673Y;

    /* renamed from: Z */
    public byte f5674Z;

    /* renamed from: a */
    public final InterfaceC1541c f5675a;

    /* renamed from: a0 */
    public boolean f5676a0;

    /* renamed from: b */
    public final C1545g f5677b;

    /* renamed from: b0 */
    public InterfaceC5573m f5678b0;

    /* renamed from: c */
    public final SparseArray<c> f5679c;

    /* renamed from: d */
    public final boolean f5680d;

    /* renamed from: e */
    public final C4015a0 f5681e;

    /* renamed from: f */
    public final C4015a0 f5682f;

    /* renamed from: g */
    public final C4015a0 f5683g;

    /* renamed from: h */
    public final C4015a0 f5684h;

    /* renamed from: i */
    public final C4015a0 f5685i;

    /* renamed from: j */
    public final C4015a0 f5686j;

    /* renamed from: k */
    public final C4015a0 f5687k;

    /* renamed from: l */
    public final C4015a0 f5688l;

    /* renamed from: m */
    public final C4015a0 f5689m;

    /* renamed from: n */
    public final C4015a0 f5690n;

    /* renamed from: o */
    public ByteBuffer f5691o;

    /* renamed from: p */
    public long f5692p;

    /* renamed from: q */
    public long f5693q;

    /* renamed from: r */
    public long f5694r;

    /* renamed from: s */
    public long f5695s;

    /* renamed from: t */
    public long f5696t;

    /* renamed from: u */
    public c f5697u;

    /* renamed from: v */
    public boolean f5698v;

    /* renamed from: w */
    public int f5699w;

    /* renamed from: x */
    public long f5700x;

    /* renamed from: y */
    public boolean f5701y;

    /* renamed from: z */
    public long f5702z;

    /* renamed from: d4.e$b */
    /* loaded from: classes.dex */
    public final class b implements InterfaceC1540b {
        public b() {
        }

        @Override // p046d4.InterfaceC1540b
        /* renamed from: a */
        public void mo6250a(int i10) {
            C1543e.this.m6283o(i10);
        }

        @Override // p046d4.InterfaceC1540b
        /* renamed from: b */
        public int mo6251b(int i10) {
            return C1543e.this.m6287u(i10);
        }

        @Override // p046d4.InterfaceC1540b
        /* renamed from: c */
        public boolean mo6252c(int i10) {
            return C1543e.this.m6291z(i10);
        }

        @Override // p046d4.InterfaceC1540b
        /* renamed from: d */
        public void mo6253d(int i10, String str) {
            C1543e.this.m6272H(i10, str);
        }

        @Override // p046d4.InterfaceC1540b
        /* renamed from: e */
        public void mo6254e(int i10, double d10) {
            C1543e.this.m6285r(i10, d10);
        }

        @Override // p046d4.InterfaceC1540b
        /* renamed from: f */
        public void mo6255f(int i10, int i11, InterfaceC5572l interfaceC5572l) {
            C1543e.this.m6280l(i10, i11, interfaceC5572l);
        }

        @Override // p046d4.InterfaceC1540b
        /* renamed from: g */
        public void mo6256g(int i10, long j10, long j11) {
            C1543e.this.m6271G(i10, j10, j11);
        }

        @Override // p046d4.InterfaceC1540b
        /* renamed from: h */
        public void mo6257h(int i10, long j10) {
            C1543e.this.m6290x(i10, j10);
        }
    }

    /* renamed from: d4.e$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: N */
        public byte[] f5717N;

        /* renamed from: T */
        public C5561c0 f5723T;

        /* renamed from: U */
        public boolean f5724U;

        /* renamed from: X */
        public InterfaceC5559b0 f5727X;

        /* renamed from: Y */
        public int f5728Y;

        /* renamed from: a */
        public String f5729a;

        /* renamed from: b */
        public String f5730b;

        /* renamed from: c */
        public int f5731c;

        /* renamed from: d */
        public int f5732d;

        /* renamed from: e */
        public int f5733e;

        /* renamed from: f */
        public int f5734f;

        /* renamed from: g */
        public int f5735g;

        /* renamed from: h */
        public boolean f5736h;

        /* renamed from: i */
        public byte[] f5737i;

        /* renamed from: j */
        public InterfaceC5559b0.a f5738j;

        /* renamed from: k */
        public byte[] f5739k;

        /* renamed from: l */
        public C5247m f5740l;

        /* renamed from: m */
        public int f5741m = -1;

        /* renamed from: n */
        public int f5742n = -1;

        /* renamed from: o */
        public int f5743o = -1;

        /* renamed from: p */
        public int f5744p = -1;

        /* renamed from: q */
        public int f5745q = 0;

        /* renamed from: r */
        public int f5746r = -1;

        /* renamed from: s */
        public float f5747s = 0.0f;

        /* renamed from: t */
        public float f5748t = 0.0f;

        /* renamed from: u */
        public float f5749u = 0.0f;

        /* renamed from: v */
        public byte[] f5750v = null;

        /* renamed from: w */
        public int f5751w = -1;

        /* renamed from: x */
        public boolean f5752x = false;

        /* renamed from: y */
        public int f5753y = -1;

        /* renamed from: z */
        public int f5754z = -1;

        /* renamed from: A */
        public int f5704A = -1;

        /* renamed from: B */
        public int f5705B = 1000;

        /* renamed from: C */
        public int f5706C = 200;

        /* renamed from: D */
        public float f5707D = -1.0f;

        /* renamed from: E */
        public float f5708E = -1.0f;

        /* renamed from: F */
        public float f5709F = -1.0f;

        /* renamed from: G */
        public float f5710G = -1.0f;

        /* renamed from: H */
        public float f5711H = -1.0f;

        /* renamed from: I */
        public float f5712I = -1.0f;

        /* renamed from: J */
        public float f5713J = -1.0f;

        /* renamed from: K */
        public float f5714K = -1.0f;

        /* renamed from: L */
        public float f5715L = -1.0f;

        /* renamed from: M */
        public float f5716M = -1.0f;

        /* renamed from: O */
        public int f5718O = 1;

        /* renamed from: P */
        public int f5719P = -1;

        /* renamed from: Q */
        public int f5720Q = 8000;

        /* renamed from: R */
        public long f5721R = 0;

        /* renamed from: S */
        public long f5722S = 0;

        /* renamed from: V */
        public boolean f5725V = true;

        /* renamed from: W */
        public String f5726W = "eng";

        /* renamed from: k */
        public static Pair<String, List<byte[]>> m6297k(C4015a0 c4015a0) {
            try {
                c4015a0.m15224U(16);
                long m15248w = c4015a0.m15248w();
                if (m15248w == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (m15248w == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (m15248w != 826496599) {
                    C4046r.m15529i("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] m15230e = c4015a0.m15230e();
                for (int m15231f = c4015a0.m15231f() + 20; m15231f < m15230e.length - 4; m15231f++) {
                    if (m15230e[m15231f] == 0 && m15230e[m15231f + 1] == 0 && m15230e[m15231f + 2] == 1 && m15230e[m15231f + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(m15230e, m15231f, m15230e.length)));
                    }
                }
                throw C4499t2.m17594a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C4499t2.m17594a("Error parsing FourCC private data", null);
            }
        }

        /* renamed from: l */
        public static boolean m6298l(C4015a0 c4015a0) {
            try {
                int m15250y = c4015a0.m15250y();
                if (m15250y == 1) {
                    return true;
                }
                if (m15250y != 65534) {
                    return false;
                }
                c4015a0.m15223T(24);
                if (c4015a0.m15251z() == C1543e.f5647h0.getMostSignificantBits()) {
                    if (c4015a0.m15251z() == C1543e.f5647h0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C4499t2.m17594a("Error parsing MS/ACM codec private", null);
            }
        }

        /* renamed from: m */
        public static List<byte[]> m6299m(byte[] bArr) {
            try {
                if (bArr[0] != 2) {
                    throw C4499t2.m17594a("Error parsing vorbis codec private", null);
                }
                int i10 = 0;
                int i11 = 1;
                while ((bArr[i11] & 255) == 255) {
                    i10 += 255;
                    i11++;
                }
                int i12 = i11 + 1;
                int i13 = i10 + (bArr[i11] & 255);
                int i14 = 0;
                while ((bArr[i12] & 255) == 255) {
                    i14 += 255;
                    i12++;
                }
                int i15 = i12 + 1;
                int i16 = i14 + (bArr[i12] & 255);
                if (bArr[i15] != 1) {
                    throw C4499t2.m17594a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i13];
                System.arraycopy(bArr, i15, bArr2, 0, i13);
                int i17 = i15 + i13;
                if (bArr[i17] != 3) {
                    throw C4499t2.m17594a("Error parsing vorbis codec private", null);
                }
                int i18 = i17 + i16;
                if (bArr[i18] != 5) {
                    throw C4499t2.m17594a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i18];
                System.arraycopy(bArr, i18, bArr3, 0, bArr.length - i18);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw C4499t2.m17594a("Error parsing vorbis codec private", null);
            }
        }

        /* renamed from: f */
        public final void m6300f() {
            C4014a.m15199e(this.f5727X);
        }

        /* renamed from: g */
        public final byte[] m6301g(String str) {
            byte[] bArr = this.f5739k;
            if (bArr != null) {
                return bArr;
            }
            throw C4499t2.m17594a("Missing CodecPrivate for codec " + str, null);
        }

        /* renamed from: h */
        public final byte[] m6302h() {
            if (this.f5707D == -1.0f || this.f5708E == -1.0f || this.f5709F == -1.0f || this.f5710G == -1.0f || this.f5711H == -1.0f || this.f5712I == -1.0f || this.f5713J == -1.0f || this.f5714K == -1.0f || this.f5715L == -1.0f || this.f5716M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((this.f5707D * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5708E * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5709F * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5710G * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5711H * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5712I * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5713J * 50000.0f) + 0.5f));
            order.putShort((short) ((this.f5714K * 50000.0f) + 0.5f));
            order.putShort((short) (this.f5715L + 0.5f));
            order.putShort((short) (this.f5716M + 0.5f));
            order.putShort((short) this.f5705B);
            order.putShort((short) this.f5706C);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x01df. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:14:0x03cb  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x03e6  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x03f5  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0510  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0407  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x03e8  */
        /* renamed from: i */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m6303i(p333x3.InterfaceC5573m r20, int r21) {
            /*
                Method dump skipped, instructions count: 1574
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p046d4.C1543e.c.m6303i(x3.m, int):void");
        }

        /* renamed from: j */
        public void m6304j() {
            C5561c0 c5561c0 = this.f5723T;
            if (c5561c0 != null) {
                c5561c0.m22410a(this.f5727X, this.f5738j);
            }
        }

        /* renamed from: n */
        public void m6305n() {
            C5561c0 c5561c0 = this.f5723T;
            if (c5561c0 != null) {
                c5561c0.m22411b();
            }
        }

        /* renamed from: o */
        public final boolean m6306o(boolean z10) {
            return "A_OPUS".equals(this.f5730b) ? z10 : this.f5734f > 0;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f5648i0 = Collections.unmodifiableMap(hashMap);
    }

    public C1543e() {
        this(0);
    }

    public C1543e(int i10) {
        this(new C1539a(), i10);
    }

    public C1543e(InterfaceC1541c interfaceC1541c, int i10) {
        this.f5693q = -1L;
        this.f5694r = -9223372036854775807L;
        this.f5695s = -9223372036854775807L;
        this.f5696t = -9223372036854775807L;
        this.f5702z = -1L;
        this.f5649A = -1L;
        this.f5650B = -9223372036854775807L;
        this.f5675a = interfaceC1541c;
        interfaceC1541c.mo6244b(new b());
        this.f5680d = (i10 & 1) == 0;
        this.f5677b = new C1545g();
        this.f5679c = new SparseArray<>();
        this.f5683g = new C4015a0(4);
        this.f5684h = new C4015a0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f5685i = new C4015a0(4);
        this.f5681e = new C4015a0(C4051w.f14559a);
        this.f5682f = new C4015a0(4);
        this.f5686j = new C4015a0();
        this.f5687k = new C4015a0();
        this.f5688l = new C4015a0(8);
        this.f5689m = new C4015a0();
        this.f5690n = new C4015a0();
        this.f5660L = new int[1];
    }

    /* renamed from: A */
    public static /* synthetic */ InterfaceC5571k[] m6258A() {
        return new InterfaceC5571k[]{new C1543e()};
    }

    /* renamed from: F */
    public static void m6259F(String str, long j10, byte[] bArr) {
        byte[] m6265s;
        int i10;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                m6265s = m6265s(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case 1:
                m6265s = m6265s(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case 2:
                m6265s = m6265s(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(m6265s, 0, bArr, i10, m6265s.length);
    }

    /* renamed from: p */
    public static int[] m6264p(int[] iArr, int i10) {
        return iArr == null ? new int[i10] : iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    /* renamed from: s */
    public static byte[] m6265s(long j10, String str, long j11) {
        C4014a.m15195a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - ((i10 * 3600) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - ((i11 * 60) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return C4041n0.m15468l0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (i12 * 1000000)) / j11))));
    }

    /* renamed from: y */
    public static boolean m6266y(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals("V_MPEG4/ISO/AP")) {
                    c10 = 0;
                    break;
                }
                break;
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c10 = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c10 = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    c10 = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c10 = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    c10 = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    c10 = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c10 = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c10 = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c10 = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c10 = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c10 = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c10 = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c10 = 25;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c10 = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    c10 = ' ';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: B */
    public final boolean m6267B(C5585y c5585y, long j10) {
        if (this.f5701y) {
            this.f5649A = j10;
            c5585y.f20962a = this.f5702z;
            this.f5701y = false;
            return true;
        }
        if (this.f5698v) {
            long j11 = this.f5649A;
            if (j11 != -1) {
                c5585y.f20962a = j11;
                this.f5649A = -1L;
                return true;
            }
        }
        return false;
    }

    /* renamed from: C */
    public final void m6268C(InterfaceC5572l interfaceC5572l, int i10) {
        if (this.f5683g.m15232g() >= i10) {
            return;
        }
        if (this.f5683g.m15227b() < i10) {
            C4015a0 c4015a0 = this.f5683g;
            c4015a0.m15228c(Math.max(c4015a0.m15227b() * 2, i10));
        }
        interfaceC5572l.readFully(this.f5683g.m15230e(), this.f5683g.m15232g(), i10 - this.f5683g.m15232g());
        this.f5683g.m15222S(i10);
    }

    /* renamed from: D */
    public final void m6269D() {
        this.f5667S = 0;
        this.f5668T = 0;
        this.f5669U = 0;
        this.f5670V = false;
        this.f5671W = false;
        this.f5672X = false;
        this.f5673Y = 0;
        this.f5674Z = (byte) 0;
        this.f5676a0 = false;
        this.f5686j.m15219P(0);
    }

    /* renamed from: E */
    public final long m6270E(long j10) {
        long j11 = this.f5694r;
        if (j11 != -9223372036854775807L) {
            return C4041n0.m15420N0(j10, j11, 1000L);
        }
        throw C4499t2.m17594a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    /* renamed from: G */
    public void m6271G(int i10, long j10, long j11) {
        m6279k();
        if (i10 == 160) {
            this.f5665Q = false;
            this.f5666R = 0L;
            return;
        }
        if (i10 == 174) {
            this.f5697u = new c();
            return;
        }
        if (i10 == 187) {
            this.f5653E = false;
            return;
        }
        if (i10 == 19899) {
            this.f5699w = -1;
            this.f5700x = -1L;
            return;
        }
        if (i10 == 20533) {
            m6286t(i10).f5736h = true;
            return;
        }
        if (i10 == 21968) {
            m6286t(i10).f5752x = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f5693q;
            if (j12 != -1 && j12 != j10) {
                throw C4499t2.m17594a("Multiple Segment elements not supported", null);
            }
            this.f5693q = j10;
            this.f5692p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f5651C = new C4047s();
            this.f5652D = new C4047s();
        } else if (i10 == 524531317 && !this.f5698v) {
            if (this.f5680d && this.f5702z != -1) {
                this.f5701y = true;
            } else {
                this.f5678b0.mo3033j(new InterfaceC5586z.b(this.f5696t));
                this.f5698v = true;
            }
        }
    }

    /* renamed from: H */
    public void m6272H(int i10, String str) {
        if (i10 == 134) {
            m6286t(i10).f5730b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                m6286t(i10).f5729a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                m6286t(i10).f5726W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw C4499t2.m17594a("DocType " + str + " not supported", null);
    }

    /* renamed from: I */
    public final int m6273I(InterfaceC5572l interfaceC5572l, c cVar, int i10, boolean z10) {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f5730b)) {
            m6274J(interfaceC5572l, f5643d0, i10);
        } else if ("S_TEXT/ASS".equals(cVar.f5730b)) {
            m6274J(interfaceC5572l, f5645f0, i10);
        } else {
            if (!"S_TEXT/WEBVTT".equals(cVar.f5730b)) {
                InterfaceC5559b0 interfaceC5559b0 = cVar.f5727X;
                if (!this.f5670V) {
                    if (cVar.f5736h) {
                        this.f5663O &= -1073741825;
                        if (!this.f5671W) {
                            interfaceC5572l.readFully(this.f5683g.m15230e(), 0, 1);
                            this.f5667S++;
                            if ((this.f5683g.m15230e()[0] & 128) == 128) {
                                throw C4499t2.m17594a("Extension bit is set in signal byte", null);
                            }
                            this.f5674Z = this.f5683g.m15230e()[0];
                            this.f5671W = true;
                        }
                        byte b10 = this.f5674Z;
                        if ((b10 & 1) == 1) {
                            boolean z11 = (b10 & 2) == 2;
                            this.f5663O |= 1073741824;
                            if (!this.f5676a0) {
                                interfaceC5572l.readFully(this.f5688l.m15230e(), 0, 8);
                                this.f5667S += 8;
                                this.f5676a0 = true;
                                this.f5683g.m15230e()[0] = (byte) ((z11 ? 128 : 0) | 8);
                                this.f5683g.m15223T(0);
                                interfaceC5559b0.mo4853d(this.f5683g, 1, 1);
                                this.f5668T++;
                                this.f5688l.m15223T(0);
                                interfaceC5559b0.mo4853d(this.f5688l, 8, 1);
                                this.f5668T += 8;
                            }
                            if (z11) {
                                if (!this.f5672X) {
                                    interfaceC5572l.readFully(this.f5683g.m15230e(), 0, 1);
                                    this.f5667S++;
                                    this.f5683g.m15223T(0);
                                    this.f5673Y = this.f5683g.m15210G();
                                    this.f5672X = true;
                                }
                                int i12 = this.f5673Y * 4;
                                this.f5683g.m15219P(i12);
                                interfaceC5572l.readFully(this.f5683g.m15230e(), 0, i12);
                                this.f5667S += i12;
                                short s10 = (short) ((this.f5673Y / 2) + 1);
                                int i13 = (s10 * 6) + 2;
                                ByteBuffer byteBuffer = this.f5691o;
                                if (byteBuffer == null || byteBuffer.capacity() < i13) {
                                    this.f5691o = ByteBuffer.allocate(i13);
                                }
                                this.f5691o.position(0);
                                this.f5691o.putShort(s10);
                                int i14 = 0;
                                int i15 = 0;
                                while (true) {
                                    i11 = this.f5673Y;
                                    if (i14 >= i11) {
                                        break;
                                    }
                                    int m15214K = this.f5683g.m15214K();
                                    if (i14 % 2 == 0) {
                                        this.f5691o.putShort((short) (m15214K - i15));
                                    } else {
                                        this.f5691o.putInt(m15214K - i15);
                                    }
                                    i14++;
                                    i15 = m15214K;
                                }
                                int i16 = (i10 - this.f5667S) - i15;
                                int i17 = i11 % 2;
                                ByteBuffer byteBuffer2 = this.f5691o;
                                if (i17 == 1) {
                                    byteBuffer2.putInt(i16);
                                } else {
                                    byteBuffer2.putShort((short) i16);
                                    this.f5691o.putInt(0);
                                }
                                this.f5689m.m15221R(this.f5691o.array(), i13);
                                interfaceC5559b0.mo4853d(this.f5689m, i13, 1);
                                this.f5668T += i13;
                            }
                        }
                    } else {
                        byte[] bArr = cVar.f5737i;
                        if (bArr != null) {
                            this.f5686j.m15221R(bArr, bArr.length);
                        }
                    }
                    if (cVar.m6306o(z10)) {
                        this.f5663O |= 268435456;
                        this.f5690n.m15219P(0);
                        int m15232g = (this.f5686j.m15232g() + i10) - this.f5667S;
                        this.f5683g.m15219P(4);
                        this.f5683g.m15230e()[0] = (byte) ((m15232g >> 24) & 255);
                        this.f5683g.m15230e()[1] = (byte) ((m15232g >> 16) & 255);
                        this.f5683g.m15230e()[2] = (byte) ((m15232g >> 8) & 255);
                        this.f5683g.m15230e()[3] = (byte) (m15232g & 255);
                        interfaceC5559b0.mo4853d(this.f5683g, 4, 2);
                        this.f5668T += 4;
                    }
                    this.f5670V = true;
                }
                int m15232g2 = i10 + this.f5686j.m15232g();
                if (!"V_MPEG4/ISO/AVC".equals(cVar.f5730b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f5730b)) {
                    if (cVar.f5723T != null) {
                        C4014a.m15200f(this.f5686j.m15232g() == 0);
                        cVar.f5723T.m22413d(interfaceC5572l);
                    }
                    while (true) {
                        int i18 = this.f5667S;
                        if (i18 >= m15232g2) {
                            break;
                        }
                        int m6275K = m6275K(interfaceC5572l, interfaceC5559b0, m15232g2 - i18);
                        this.f5667S += m6275K;
                        this.f5668T += m6275K;
                    }
                } else {
                    byte[] m15230e = this.f5682f.m15230e();
                    m15230e[0] = 0;
                    m15230e[1] = 0;
                    m15230e[2] = 0;
                    int i19 = cVar.f5728Y;
                    int i20 = 4 - i19;
                    while (this.f5667S < m15232g2) {
                        int i21 = this.f5669U;
                        if (i21 == 0) {
                            m6276L(interfaceC5572l, m15230e, i20, i19);
                            this.f5667S += i19;
                            this.f5682f.m15223T(0);
                            this.f5669U = this.f5682f.m15214K();
                            this.f5681e.m15223T(0);
                            interfaceC5559b0.m22408e(this.f5681e, 4);
                            this.f5668T += 4;
                        } else {
                            int m6275K2 = m6275K(interfaceC5572l, interfaceC5559b0, i21);
                            this.f5667S += m6275K2;
                            this.f5668T += m6275K2;
                            this.f5669U -= m6275K2;
                        }
                    }
                }
                if ("A_VORBIS".equals(cVar.f5730b)) {
                    this.f5684h.m15223T(0);
                    interfaceC5559b0.m22408e(this.f5684h, 4);
                    this.f5668T += 4;
                }
                return m6284q();
            }
            m6274J(interfaceC5572l, f5646g0, i10);
        }
        return m6284q();
    }

    /* renamed from: J */
    public final void m6274J(InterfaceC5572l interfaceC5572l, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f5687k.m15227b() < length) {
            this.f5687k.m15220Q(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f5687k.m15230e(), 0, bArr.length);
        }
        interfaceC5572l.readFully(this.f5687k.m15230e(), bArr.length, i10);
        this.f5687k.m15223T(0);
        this.f5687k.m15222S(length);
    }

    /* renamed from: K */
    public final int m6275K(InterfaceC5572l interfaceC5572l, InterfaceC5559b0 interfaceC5559b0, int i10) {
        int m15226a = this.f5686j.m15226a();
        if (m15226a <= 0) {
            return interfaceC5559b0.m22407c(interfaceC5572l, i10, false);
        }
        int min = Math.min(i10, m15226a);
        interfaceC5559b0.m22408e(this.f5686j, min);
        return min;
    }

    /* renamed from: L */
    public final void m6276L(InterfaceC5572l interfaceC5572l, byte[] bArr, int i10, int i11) {
        int min = Math.min(i11, this.f5686j.m15226a());
        interfaceC5572l.readFully(bArr, i10 + min, i11 - min);
        if (min > 0) {
            this.f5686j.m15237l(bArr, i10, min);
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public final void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f5678b0 = interfaceC5573m;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        this.f5650B = -9223372036854775807L;
        this.f5655G = 0;
        this.f5675a.reset();
        this.f5677b.m6313e();
        m6269D();
        for (int i10 = 0; i10 < this.f5679c.size(); i10++) {
            this.f5679c.valueAt(i10).m6305n();
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public final int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        this.f5654F = false;
        boolean z10 = true;
        while (z10 && !this.f5654F) {
            z10 = this.f5675a.mo6243a(interfaceC5572l);
            if (z10 && m6267B(c5585y, interfaceC5572l.getPosition())) {
                return 1;
            }
        }
        if (z10) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f5679c.size(); i10++) {
            c valueAt = this.f5679c.valueAt(i10);
            valueAt.m6300f();
            valueAt.m6304j();
        }
        return -1;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public final boolean mo170h(InterfaceC5572l interfaceC5572l) {
        return new C1544f().m6308b(interfaceC5572l);
    }

    /* renamed from: i */
    public final void m6277i(int i10) {
        if (this.f5651C == null || this.f5652D == null) {
            throw C4499t2.m17594a("Element " + i10 + " must be in a Cues", null);
        }
    }

    /* renamed from: j */
    public final void m6278j(int i10) {
        if (this.f5697u != null) {
            return;
        }
        throw C4499t2.m17594a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* renamed from: k */
    public final void m6279k() {
        C4014a.m15202h(this.f5678b0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0241, code lost:
    
        throw p264s3.C4499t2.m17594a("EBML lacing sample size out of range.", null);
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m6280l(int r22, int r23, p333x3.InterfaceC5572l r24) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p046d4.C1543e.m6280l(int, int, x3.l):void");
    }

    /* renamed from: m */
    public final InterfaceC5586z m6281m(C4047s c4047s, C4047s c4047s2) {
        int i10;
        if (this.f5693q == -1 || this.f5696t == -9223372036854775807L || c4047s == null || c4047s.m15537c() == 0 || c4047s2 == null || c4047s2.m15537c() != c4047s.m15537c()) {
            return new InterfaceC5586z.b(this.f5696t);
        }
        int m15537c = c4047s.m15537c();
        int[] iArr = new int[m15537c];
        long[] jArr = new long[m15537c];
        long[] jArr2 = new long[m15537c];
        long[] jArr3 = new long[m15537c];
        int i11 = 0;
        for (int i12 = 0; i12 < m15537c; i12++) {
            jArr3[i12] = c4047s.m15536b(i12);
            jArr[i12] = this.f5693q + c4047s2.m15536b(i12);
        }
        while (true) {
            i10 = m15537c - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArr[i11] = (int) (jArr[i13] - jArr[i11]);
            jArr2[i11] = jArr3[i13] - jArr3[i11];
            i11 = i13;
        }
        iArr[i10] = (int) ((this.f5693q + this.f5692p) - jArr[i10]);
        jArr2[i10] = this.f5696t - jArr3[i10];
        long j10 = jArr2[i10];
        if (j10 <= 0) {
            C4046r.m15529i("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArr = Arrays.copyOf(iArr, i10);
            jArr = Arrays.copyOf(jArr, i10);
            jArr2 = Arrays.copyOf(jArr2, i10);
            jArr3 = Arrays.copyOf(jArr3, i10);
        }
        return new C5560c(iArr, jArr, jArr2, jArr3);
    }

    /* renamed from: n */
    public final void m6282n(c cVar, long j10, int i10, int i11, int i12) {
        String str;
        C5561c0 c5561c0 = cVar.f5723T;
        if (c5561c0 != null) {
            c5561c0.m22412c(cVar.f5727X, j10, i10, i11, i12, cVar.f5738j);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f5730b) || "S_TEXT/ASS".equals(cVar.f5730b) || "S_TEXT/WEBVTT".equals(cVar.f5730b)) {
                if (this.f5659K > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else {
                    long j11 = this.f5657I;
                    if (j11 == -9223372036854775807L) {
                        str = "Skipping subtitle sample with no duration.";
                    } else {
                        m6259F(cVar.f5730b, j11, this.f5687k.m15230e());
                        int m15231f = this.f5687k.m15231f();
                        while (true) {
                            if (m15231f >= this.f5687k.m15232g()) {
                                break;
                            }
                            if (this.f5687k.m15230e()[m15231f] == 0) {
                                this.f5687k.m15222S(m15231f);
                                break;
                            }
                            m15231f++;
                        }
                        InterfaceC5559b0 interfaceC5559b0 = cVar.f5727X;
                        C4015a0 c4015a0 = this.f5687k;
                        interfaceC5559b0.m22408e(c4015a0, c4015a0.m15232g());
                        i11 += this.f5687k.m15232g();
                    }
                }
                C4046r.m15529i("MatroskaExtractor", str);
            }
            if ((268435456 & i10) != 0) {
                if (this.f5659K > 1) {
                    this.f5690n.m15219P(0);
                } else {
                    int m15232g = this.f5690n.m15232g();
                    cVar.f5727X.mo4853d(this.f5690n, m15232g, 2);
                    i11 += m15232g;
                }
            }
            cVar.f5727X.mo4851a(j10, i10, i11, i12, cVar.f5738j);
        }
        this.f5654F = true;
    }

    /* renamed from: o */
    public void m6283o(int i10) {
        m6279k();
        if (i10 == 160) {
            if (this.f5655G != 2) {
                return;
            }
            c cVar = this.f5679c.get(this.f5661M);
            cVar.m6300f();
            if (this.f5666R > 0 && "A_OPUS".equals(cVar.f5730b)) {
                this.f5690n.m15220Q(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f5666R).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f5659K; i12++) {
                i11 += this.f5660L[i12];
            }
            int i13 = 0;
            while (i13 < this.f5659K) {
                long j10 = this.f5656H + ((cVar.f5733e * i13) / 1000);
                int i14 = this.f5663O;
                if (i13 == 0 && !this.f5665Q) {
                    i14 |= 1;
                }
                int i15 = this.f5660L[i13];
                int i16 = i11 - i15;
                m6282n(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.f5655G = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) C4014a.m15202h(this.f5697u);
            String str = cVar2.f5730b;
            if (str == null) {
                throw C4499t2.m17594a("CodecId is missing in TrackEntry element", null);
            }
            if (m6266y(str)) {
                cVar2.m6303i(this.f5678b0, cVar2.f5731c);
                this.f5679c.put(cVar2.f5731c, cVar2);
            }
            this.f5697u = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f5699w;
            if (i17 != -1) {
                long j11 = this.f5700x;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f5702z = j11;
                        return;
                    }
                    return;
                }
            }
            throw C4499t2.m17594a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            m6278j(i10);
            c cVar3 = this.f5697u;
            if (cVar3.f5736h) {
                if (cVar3.f5738j == null) {
                    throw C4499t2.m17594a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f5740l = new C5247m(new C5247m.b(C4441i.f16297a, "video/webm", this.f5697u.f5738j.f20854b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            m6278j(i10);
            c cVar4 = this.f5697u;
            if (cVar4.f5736h && cVar4.f5737i != null) {
                throw C4499t2.m17594a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f5694r == -9223372036854775807L) {
                this.f5694r = 1000000L;
            }
            long j12 = this.f5695s;
            if (j12 != -9223372036854775807L) {
                this.f5696t = m6270E(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f5679c.size() == 0) {
                throw C4499t2.m17594a("No valid tracks were found", null);
            }
            this.f5678b0.mo3034n();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f5698v) {
                this.f5678b0.mo3033j(m6281m(this.f5651C, this.f5652D));
                this.f5698v = true;
            }
            this.f5651C = null;
            this.f5652D = null;
        }
    }

    /* renamed from: q */
    public final int m6284q() {
        int i10 = this.f5668T;
        m6269D();
        return i10;
    }

    /* renamed from: r */
    public void m6285r(int i10, double d10) {
        if (i10 == 181) {
            m6286t(i10).f5720Q = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f5695s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                m6286t(i10).f5707D = (float) d10;
                return;
            case 21970:
                m6286t(i10).f5708E = (float) d10;
                return;
            case 21971:
                m6286t(i10).f5709F = (float) d10;
                return;
            case 21972:
                m6286t(i10).f5710G = (float) d10;
                return;
            case 21973:
                m6286t(i10).f5711H = (float) d10;
                return;
            case 21974:
                m6286t(i10).f5712I = (float) d10;
                return;
            case 21975:
                m6286t(i10).f5713J = (float) d10;
                return;
            case 21976:
                m6286t(i10).f5714K = (float) d10;
                return;
            case 21977:
                m6286t(i10).f5715L = (float) d10;
                return;
            case 21978:
                m6286t(i10).f5716M = (float) d10;
                return;
            default:
                switch (i10) {
                    case 30323:
                        m6286t(i10).f5747s = (float) d10;
                        return;
                    case 30324:
                        m6286t(i10).f5748t = (float) d10;
                        return;
                    case 30325:
                        m6286t(i10).f5749u = (float) d10;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // p333x3.InterfaceC5571k
    public final void release() {
    }

    /* renamed from: t */
    public c m6286t(int i10) {
        m6278j(i10);
        return this.f5697u;
    }

    /* renamed from: u */
    public int m6287u(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    /* renamed from: v */
    public void m6288v(c cVar, InterfaceC5572l interfaceC5572l, int i10) {
        if (cVar.f5735g != 1685485123 && cVar.f5735g != 1685480259) {
            interfaceC5572l.mo22428m(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f5717N = bArr;
        interfaceC5572l.readFully(bArr, 0, i10);
    }

    /* renamed from: w */
    public void m6289w(c cVar, int i10, InterfaceC5572l interfaceC5572l, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f5730b)) {
            interfaceC5572l.mo22428m(i11);
        } else {
            this.f5690n.m15219P(i11);
            interfaceC5572l.readFully(this.f5690n.m15230e(), 0, i11);
        }
    }

    /* renamed from: x */
    public void m6290x(int i10, long j10) {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw C4499t2.m17594a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw C4499t2.m17594a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                m6286t(i10).f5732d = (int) j10;
                return;
            case 136:
                m6286t(i10).f5725V = j10 == 1;
                return;
            case 155:
                this.f5657I = m6270E(j10);
                return;
            case 159:
                m6286t(i10).f5718O = (int) j10;
                return;
            case 176:
                m6286t(i10).f5741m = (int) j10;
                return;
            case 179:
                m6277i(i10);
                this.f5651C.m15535a(m6270E(j10));
                return;
            case 186:
                m6286t(i10).f5742n = (int) j10;
                return;
            case 215:
                m6286t(i10).f5731c = (int) j10;
                return;
            case 231:
                this.f5650B = m6270E(j10);
                return;
            case 238:
                this.f5664P = (int) j10;
                return;
            case 241:
                if (this.f5653E) {
                    return;
                }
                m6277i(i10);
                this.f5652D.m15535a(j10);
                this.f5653E = true;
                return;
            case 251:
                this.f5665Q = true;
                return;
            case 16871:
                m6286t(i10).f5735g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw C4499t2.m17594a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw C4499t2.m17594a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw C4499t2.m17594a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw C4499t2.m17594a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw C4499t2.m17594a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f5700x = j10 + this.f5693q;
                return;
            case 21432:
                int i11 = (int) j10;
                m6278j(i10);
                if (i11 == 0) {
                    this.f5697u.f5751w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f5697u.f5751w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f5697u.f5751w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f5697u.f5751w = 3;
                    return;
                }
            case 21680:
                m6286t(i10).f5743o = (int) j10;
                return;
            case 21682:
                m6286t(i10).f5745q = (int) j10;
                return;
            case 21690:
                m6286t(i10).f5744p = (int) j10;
                return;
            case 21930:
                m6286t(i10).f5724U = j10 == 1;
                return;
            case 21998:
                m6286t(i10).f5734f = (int) j10;
                return;
            case 22186:
                m6286t(i10).f5721R = j10;
                return;
            case 22203:
                m6286t(i10).f5722S = j10;
                return;
            case 25188:
                m6286t(i10).f5719P = (int) j10;
                return;
            case 30114:
                this.f5666R = j10;
                return;
            case 30321:
                m6278j(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f5697u.f5746r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f5697u.f5746r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f5697u.f5746r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f5697u.f5746r = 3;
                    return;
                }
            case 2352003:
                m6286t(i10).f5733e = (int) j10;
                return;
            case 2807729:
                this.f5694r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        m6278j(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f5697u.f5704A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f5697u.f5704A = 1;
                            return;
                        }
                    case 21946:
                        m6278j(i10);
                        int m16030c = C4170c.m16030c((int) j10);
                        if (m16030c != -1) {
                            this.f5697u.f5754z = m16030c;
                            return;
                        }
                        return;
                    case 21947:
                        m6278j(i10);
                        this.f5697u.f5752x = true;
                        int m16029b = C4170c.m16029b((int) j10);
                        if (m16029b != -1) {
                            this.f5697u.f5753y = m16029b;
                            return;
                        }
                        return;
                    case 21948:
                        m6286t(i10).f5705B = (int) j10;
                        return;
                    case 21949:
                        m6286t(i10).f5706C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    /* renamed from: z */
    public boolean m6291z(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }
}
