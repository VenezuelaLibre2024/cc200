package p221p4;

import io.flutter.embedding.android.KeyboardMap;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p109h7.C2420c;
import p109h7.C2422e;
import p126i7.AbstractC2651u;
import p152k4.AbstractC3354g;
import p152k4.C3348a;
import p152k4.C3351d;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4054z;

/* renamed from: p4.h */
/* loaded from: classes.dex */
public final class C4007h extends AbstractC3354g {

    /* renamed from: b */
    public static final a f14423b = new a() { // from class: p4.g
        @Override // p221p4.C4007h.a
        /* renamed from: a */
        public final boolean mo6557a(int i10, int i11, int i12, int i13, int i14) {
            boolean m15154A;
            m15154A = C4007h.m15154A(i10, i11, i12, i13, i14);
            return m15154A;
        }
    };

    /* renamed from: a */
    public final a f14424a;

    /* renamed from: p4.h$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        boolean mo6557a(int i10, int i11, int i12, int i13, int i14);
    }

    /* renamed from: p4.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f14425a;

        /* renamed from: b */
        public final boolean f14426b;

        /* renamed from: c */
        public final int f14427c;

        public b(int i10, boolean z10, int i11) {
            this.f14425a = i10;
            this.f14426b = z10;
            this.f14427c = i11;
        }
    }

    public C4007h() {
        this(null);
    }

    public C4007h(a aVar) {
        this.f14424a = aVar;
    }

    /* renamed from: A */
    public static /* synthetic */ boolean m15154A(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    /* renamed from: B */
    public static int m15155B(C4015a0 c4015a0, int i10) {
        byte[] m15230e = c4015a0.m15230e();
        int m15231f = c4015a0.m15231f();
        int i11 = m15231f;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= m15231f + i10) {
                return i10;
            }
            if ((m15230e[i11] & 255) == 255 && m15230e[i12] == 0) {
                System.arraycopy(m15230e, i11 + 2, m15230e, i12, (i10 - (i11 - m15231f)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if ((r10 & 1) != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0086, code lost:
    
        if ((r10 & 128) != 0) goto L43;
     */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m15156C(p222p5.C4015a0 r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m15231f()
        L8:
            int r3 = r18.m15226a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m15241p()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.m15212I()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.m15216M()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.m15213J()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.m15213J()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.m15223T(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.m15223T(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.m15223T(r2)
            return r6
        L98:
            int r3 = r18.m15226a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.m15223T(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.m15224U(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.m15223T(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.m15223T(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p221p4.C4007h.m15156C(p5.a0, int, int, boolean):boolean");
    }

    /* renamed from: d */
    public static byte[] m15158d(byte[] bArr, int i10, int i11) {
        return i11 <= i10 ? C4041n0.f14518f : Arrays.copyOfRange(bArr, i10, i11);
    }

    /* renamed from: f */
    public static C4000a m15159f(C4015a0 c4015a0, int i10, int i11) {
        int m15179z;
        String str;
        int m15210G = c4015a0.m15210G();
        Charset m15176w = m15176w(m15210G);
        int i12 = i10 - 1;
        byte[] bArr = new byte[i12];
        c4015a0.m15237l(bArr, 0, i12);
        if (i11 == 2) {
            str = "image/" + C2420c.m9665e(new String(bArr, 0, 3, C2422e.f9746b));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m15179z = 2;
        } else {
            m15179z = m15179z(bArr, 0);
            String m9665e = C2420c.m9665e(new String(bArr, 0, m15179z, C2422e.f9746b));
            if (m9665e.indexOf(47) == -1) {
                str = "image/" + m9665e;
            } else {
                str = m9665e;
            }
        }
        int i13 = bArr[m15179z + 1] & 255;
        int i14 = m15179z + 2;
        int m15178y = m15178y(bArr, i14, m15210G);
        return new C4000a(str, new String(bArr, i14, m15178y - i14, m15176w), i13, m15158d(bArr, m15178y + m15175v(m15210G), i12));
    }

    /* renamed from: g */
    public static C4001b m15160g(C4015a0 c4015a0, int i10, String str) {
        byte[] bArr = new byte[i10];
        c4015a0.m15237l(bArr, 0, i10);
        return new C4001b(str, bArr);
    }

    /* renamed from: h */
    public static C4002c m15161h(C4015a0 c4015a0, int i10, int i11, boolean z10, int i12, a aVar) {
        int m15231f = c4015a0.m15231f();
        int m15179z = m15179z(c4015a0.m15230e(), m15231f);
        String str = new String(c4015a0.m15230e(), m15231f, m15179z - m15231f, C2422e.f9746b);
        c4015a0.m15223T(m15179z + 1);
        int m15241p = c4015a0.m15241p();
        int m15241p2 = c4015a0.m15241p();
        long m15212I = c4015a0.m15212I();
        long j10 = m15212I == KeyboardMap.kValueMask ? -1L : m15212I;
        long m15212I2 = c4015a0.m15212I();
        long j11 = m15212I2 == KeyboardMap.kValueMask ? -1L : m15212I2;
        ArrayList arrayList = new ArrayList();
        int i13 = m15231f + i10;
        while (c4015a0.m15231f() < i13) {
            AbstractC4008i m15164k = m15164k(i11, c4015a0, z10, i12, aVar);
            if (m15164k != null) {
                arrayList.add(m15164k);
            }
        }
        return new C4002c(str, m15241p, m15241p2, j10, j11, (AbstractC4008i[]) arrayList.toArray(new AbstractC4008i[0]));
    }

    /* renamed from: i */
    public static C4003d m15162i(C4015a0 c4015a0, int i10, int i11, boolean z10, int i12, a aVar) {
        int m15231f = c4015a0.m15231f();
        int m15179z = m15179z(c4015a0.m15230e(), m15231f);
        String str = new String(c4015a0.m15230e(), m15231f, m15179z - m15231f, C2422e.f9746b);
        c4015a0.m15223T(m15179z + 1);
        int m15210G = c4015a0.m15210G();
        boolean z11 = (m15210G & 2) != 0;
        boolean z12 = (m15210G & 1) != 0;
        int m15210G2 = c4015a0.m15210G();
        String[] strArr = new String[m15210G2];
        for (int i13 = 0; i13 < m15210G2; i13++) {
            int m15231f2 = c4015a0.m15231f();
            int m15179z2 = m15179z(c4015a0.m15230e(), m15231f2);
            strArr[i13] = new String(c4015a0.m15230e(), m15231f2, m15179z2 - m15231f2, C2422e.f9746b);
            c4015a0.m15223T(m15179z2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = m15231f + i10;
        while (c4015a0.m15231f() < i14) {
            AbstractC4008i m15164k = m15164k(i11, c4015a0, z10, i12, aVar);
            if (m15164k != null) {
                arrayList.add(m15164k);
            }
        }
        return new C4003d(str, z11, z12, strArr, (AbstractC4008i[]) arrayList.toArray(new AbstractC4008i[0]));
    }

    /* renamed from: j */
    public static C4004e m15163j(C4015a0 c4015a0, int i10) {
        if (i10 < 4) {
            return null;
        }
        int m15210G = c4015a0.m15210G();
        Charset m15176w = m15176w(m15210G);
        byte[] bArr = new byte[3];
        c4015a0.m15237l(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        c4015a0.m15237l(bArr2, 0, i11);
        int m15178y = m15178y(bArr2, 0, m15210G);
        String str2 = new String(bArr2, 0, m15178y, m15176w);
        int m15175v = m15178y + m15175v(m15210G);
        return new C4004e(str, str2, m15169p(bArr2, m15175v, m15178y(bArr2, m15175v, m15210G), m15176w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0190, code lost:
    
        if (r13 == 67) goto L132;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p221p4.AbstractC4008i m15164k(int r19, p222p5.C4015a0 r20, boolean r21, int r22, p221p4.C4007h.a r23) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p221p4.C4007h.m15164k(int, p5.a0, boolean, int, p4.h$a):p4.i");
    }

    /* renamed from: l */
    public static C4005f m15165l(C4015a0 c4015a0, int i10) {
        int m15210G = c4015a0.m15210G();
        Charset m15176w = m15176w(m15210G);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c4015a0.m15237l(bArr, 0, i11);
        int m15179z = m15179z(bArr, 0);
        String str = new String(bArr, 0, m15179z, C2422e.f9746b);
        int i12 = m15179z + 1;
        int m15178y = m15178y(bArr, i12, m15210G);
        String m15169p = m15169p(bArr, i12, m15178y, m15176w);
        int m15175v = m15178y + m15175v(m15210G);
        int m15178y2 = m15178y(bArr, m15175v, m15210G);
        return new C4005f(str, m15169p, m15169p(bArr, m15175v, m15178y2, m15176w), m15158d(bArr, m15178y2 + m15175v(m15210G), i11));
    }

    /* renamed from: m */
    public static b m15166m(C4015a0 c4015a0) {
        StringBuilder sb2;
        String str;
        if (c4015a0.m15226a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int m15213J = c4015a0.m15213J();
            boolean z10 = false;
            if (m15213J == 4801587) {
                int m15210G = c4015a0.m15210G();
                c4015a0.m15224U(1);
                int m15210G2 = c4015a0.m15210G();
                int m15209F = c4015a0.m15209F();
                if (m15210G == 2) {
                    if ((m15210G2 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (m15210G == 3) {
                    if ((m15210G2 & 64) != 0) {
                        int m15241p = c4015a0.m15241p();
                        c4015a0.m15224U(m15241p);
                        m15209F -= m15241p + 4;
                    }
                } else if (m15210G == 4) {
                    if ((m15210G2 & 64) != 0) {
                        int m15209F2 = c4015a0.m15209F();
                        c4015a0.m15224U(m15209F2 - 4);
                        m15209F -= m15209F2;
                    }
                    if ((m15210G2 & 16) != 0) {
                        m15209F -= 10;
                    }
                } else {
                    sb2 = new StringBuilder();
                    sb2.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb2.append(m15210G);
                }
                if (m15210G < 4 && (m15210G2 & 128) != 0) {
                    z10 = true;
                }
                return new b(m15210G, z10, m15209F);
            }
            sb2 = new StringBuilder();
            sb2.append("Unexpected first three bytes of ID3 tag header: 0x");
            sb2.append(String.format("%06X", Integer.valueOf(m15213J)));
            str = sb2.toString();
        }
        C4046r.m15529i("Id3Decoder", str);
        return null;
    }

    /* renamed from: n */
    public static C4010k m15167n(C4015a0 c4015a0, int i10) {
        int m15216M = c4015a0.m15216M();
        int m15213J = c4015a0.m15213J();
        int m15213J2 = c4015a0.m15213J();
        int m15210G = c4015a0.m15210G();
        int m15210G2 = c4015a0.m15210G();
        C4054z c4054z = new C4054z();
        c4054z.m15606m(c4015a0);
        int i11 = ((i10 - 10) * 8) / (m15210G + m15210G2);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int m15601h = c4054z.m15601h(m15210G);
            int m15601h2 = c4054z.m15601h(m15210G2);
            iArr[i12] = m15601h;
            iArr2[i12] = m15601h2;
        }
        return new C4010k(m15216M, m15213J, m15213J2, iArr, iArr2);
    }

    /* renamed from: o */
    public static C4011l m15168o(C4015a0 c4015a0, int i10) {
        byte[] bArr = new byte[i10];
        c4015a0.m15237l(bArr, 0, i10);
        int m15179z = m15179z(bArr, 0);
        return new C4011l(new String(bArr, 0, m15179z, C2422e.f9746b), m15158d(bArr, m15179z + 1, i10));
    }

    /* renamed from: p */
    public static String m15169p(byte[] bArr, int i10, int i11, Charset charset) {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, charset);
    }

    /* renamed from: q */
    public static C4012m m15170q(C4015a0 c4015a0, int i10, String str) {
        if (i10 < 1) {
            return null;
        }
        int m15210G = c4015a0.m15210G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c4015a0.m15237l(bArr, 0, i11);
        return new C4012m(str, null, m15171r(bArr, m15210G, 0));
    }

    /* renamed from: r */
    public static AbstractC2651u<String> m15171r(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return AbstractC2651u.m10771v("");
        }
        AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
        while (true) {
            int m15178y = m15178y(bArr, i11, i10);
            if (i11 >= m15178y) {
                break;
            }
            m10766n.mo10749a(new String(bArr, i11, m15178y - i11, m15176w(i10)));
            i11 = m15175v(i10) + m15178y;
        }
        AbstractC2651u<String> m10784k = m10766n.m10784k();
        return m10784k.isEmpty() ? AbstractC2651u.m10771v("") : m10784k;
    }

    /* renamed from: s */
    public static C4012m m15172s(C4015a0 c4015a0, int i10) {
        if (i10 < 1) {
            return null;
        }
        int m15210G = c4015a0.m15210G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c4015a0.m15237l(bArr, 0, i11);
        int m15178y = m15178y(bArr, 0, m15210G);
        return new C4012m("TXXX", new String(bArr, 0, m15178y, m15176w(m15210G)), m15171r(bArr, m15210G, m15178y + m15175v(m15210G)));
    }

    /* renamed from: t */
    public static C4013n m15173t(C4015a0 c4015a0, int i10, String str) {
        byte[] bArr = new byte[i10];
        c4015a0.m15237l(bArr, 0, i10);
        return new C4013n(str, null, new String(bArr, 0, m15179z(bArr, 0), C2422e.f9746b));
    }

    /* renamed from: u */
    public static C4013n m15174u(C4015a0 c4015a0, int i10) {
        if (i10 < 1) {
            return null;
        }
        int m15210G = c4015a0.m15210G();
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        c4015a0.m15237l(bArr, 0, i11);
        int m15178y = m15178y(bArr, 0, m15210G);
        String str = new String(bArr, 0, m15178y, m15176w(m15210G));
        int m15175v = m15178y + m15175v(m15210G);
        return new C4013n("WXXX", str, m15169p(bArr, m15175v, m15179z(bArr, m15175v), C2422e.f9746b));
    }

    /* renamed from: v */
    public static int m15175v(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    /* renamed from: w */
    public static Charset m15176w(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? C2422e.f9746b : C2422e.f9747c : C2422e.f9748d : C2422e.f9750f;
    }

    /* renamed from: x */
    public static String m15177x(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* renamed from: y */
    public static int m15178y(byte[] bArr, int i10, int i11) {
        int m15179z = m15179z(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return m15179z;
        }
        while (m15179z < bArr.length - 1) {
            if ((m15179z - i10) % 2 == 0 && bArr[m15179z + 1] == 0) {
                return m15179z;
            }
            m15179z = m15179z(bArr, m15179z + 1);
        }
        return bArr.length;
    }

    /* renamed from: z */
    public static int m15179z(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    @Override // p152k4.AbstractC3354g
    /* renamed from: b */
    public C3348a mo12429b(C3351d c3351d, ByteBuffer byteBuffer) {
        return m15180e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public C3348a m15180e(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        C4015a0 c4015a0 = new C4015a0(bArr, i10);
        b m15166m = m15166m(c4015a0);
        if (m15166m == null) {
            return null;
        }
        int m15231f = c4015a0.m15231f();
        int i11 = m15166m.f14425a == 2 ? 6 : 10;
        int i12 = m15166m.f14427c;
        if (m15166m.f14426b) {
            i12 = m15155B(c4015a0, m15166m.f14427c);
        }
        c4015a0.m15222S(m15231f + i12);
        boolean z10 = false;
        if (!m15156C(c4015a0, m15166m.f14425a, i11, false)) {
            if (m15166m.f14425a != 4 || !m15156C(c4015a0, 4, i11, true)) {
                C4046r.m15529i("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m15166m.f14425a);
                return null;
            }
            z10 = true;
        }
        while (c4015a0.m15226a() >= i11) {
            AbstractC4008i m15164k = m15164k(m15166m.f14425a, c4015a0, z10, i11, this.f14424a);
            if (m15164k != null) {
                arrayList.add(m15164k);
            }
        }
        return new C3348a(arrayList);
    }
}
