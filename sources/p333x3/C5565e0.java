package p333x3;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p152k4.C3348a;
import p192n4.C3729a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.C4499t2;
import p265s4.C4531a;

/* renamed from: x3.e0 */
/* loaded from: classes.dex */
public final class C5565e0 {

    /* renamed from: x3.e0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f20888a;

        /* renamed from: b */
        public final int f20889b;

        /* renamed from: c */
        public final long[] f20890c;

        /* renamed from: d */
        public final int f20891d;

        /* renamed from: e */
        public final boolean f20892e;

        public a(int i10, int i11, long[] jArr, int i12, boolean z10) {
            this.f20888a = i10;
            this.f20889b = i11;
            this.f20890c = jArr;
            this.f20891d = i12;
            this.f20892e = z10;
        }
    }

    /* renamed from: x3.e0$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final String f20893a;

        /* renamed from: b */
        public final String[] f20894b;

        /* renamed from: c */
        public final int f20895c;

        public b(String str, String[] strArr, int i10) {
            this.f20893a = str;
            this.f20894b = strArr;
            this.f20895c = i10;
        }
    }

    /* renamed from: x3.e0$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final boolean f20896a;

        /* renamed from: b */
        public final int f20897b;

        /* renamed from: c */
        public final int f20898c;

        /* renamed from: d */
        public final int f20899d;

        public c(boolean z10, int i10, int i11, int i12) {
            this.f20896a = z10;
            this.f20897b = i10;
            this.f20898c = i11;
            this.f20899d = i12;
        }
    }

    /* renamed from: x3.e0$d */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        public final int f20900a;

        /* renamed from: b */
        public final int f20901b;

        /* renamed from: c */
        public final int f20902c;

        /* renamed from: d */
        public final int f20903d;

        /* renamed from: e */
        public final int f20904e;

        /* renamed from: f */
        public final int f20905f;

        /* renamed from: g */
        public final int f20906g;

        /* renamed from: h */
        public final int f20907h;

        /* renamed from: i */
        public final boolean f20908i;

        /* renamed from: j */
        public final byte[] f20909j;

        public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f20900a = i10;
            this.f20901b = i11;
            this.f20902c = i12;
            this.f20903d = i13;
            this.f20904e = i14;
            this.f20905f = i15;
            this.f20906g = i16;
            this.f20907h = i17;
            this.f20908i = z10;
            this.f20909j = bArr;
        }
    }

    /* renamed from: a */
    public static int m22438a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    /* renamed from: b */
    public static long m22439b(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    /* renamed from: c */
    public static C3348a m22440c(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] m15428R0 = C4041n0.m15428R0(str, "=");
            if (m15428R0.length != 2) {
                C4046r.m15529i("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (m15428R0[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C3729a.m14042a(new C4015a0(Base64.decode(m15428R0[1], 0))));
                } catch (RuntimeException e10) {
                    C4046r.m15530j("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new C4531a(m15428R0[0], m15428R0[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C3348a(arrayList);
    }

    /* renamed from: d */
    public static a m22441d(C5563d0 c5563d0) {
        if (c5563d0.m22420d(24) != 5653314) {
            throw C4499t2.m17594a("expected code book to start with [0x56, 0x43, 0x42] at " + c5563d0.m22418b(), null);
        }
        int m22420d = c5563d0.m22420d(16);
        int m22420d2 = c5563d0.m22420d(24);
        long[] jArr = new long[m22420d2];
        boolean m22419c = c5563d0.m22419c();
        long j10 = 0;
        if (m22419c) {
            int m22420d3 = c5563d0.m22420d(5) + 1;
            int i10 = 0;
            while (i10 < m22420d2) {
                int m22420d4 = c5563d0.m22420d(m22438a(m22420d2 - i10));
                for (int i11 = 0; i11 < m22420d4 && i10 < m22420d2; i11++) {
                    jArr[i10] = m22420d3;
                    i10++;
                }
                m22420d3++;
            }
        } else {
            boolean m22419c2 = c5563d0.m22419c();
            for (int i12 = 0; i12 < m22420d2; i12++) {
                if (!m22419c2) {
                    jArr[i12] = c5563d0.m22420d(5) + 1;
                } else if (c5563d0.m22419c()) {
                    jArr[i12] = c5563d0.m22420d(5) + 1;
                } else {
                    jArr[i12] = 0;
                }
            }
        }
        int m22420d5 = c5563d0.m22420d(4);
        if (m22420d5 > 2) {
            throw C4499t2.m17594a("lookup type greater than 2 not decodable: " + m22420d5, null);
        }
        if (m22420d5 == 1 || m22420d5 == 2) {
            c5563d0.m22421e(32);
            c5563d0.m22421e(32);
            int m22420d6 = c5563d0.m22420d(4) + 1;
            c5563d0.m22421e(1);
            if (m22420d5 != 1) {
                j10 = m22420d2 * m22420d;
            } else if (m22420d != 0) {
                j10 = m22439b(m22420d2, m22420d);
            }
            c5563d0.m22421e((int) (j10 * m22420d6));
        }
        return new a(m22420d, m22420d2, jArr, m22420d5, m22419c);
    }

    /* renamed from: e */
    public static void m22442e(C5563d0 c5563d0) {
        int m22420d = c5563d0.m22420d(6) + 1;
        for (int i10 = 0; i10 < m22420d; i10++) {
            int m22420d2 = c5563d0.m22420d(16);
            if (m22420d2 == 0) {
                c5563d0.m22421e(8);
                c5563d0.m22421e(16);
                c5563d0.m22421e(16);
                c5563d0.m22421e(6);
                c5563d0.m22421e(8);
                int m22420d3 = c5563d0.m22420d(4) + 1;
                for (int i11 = 0; i11 < m22420d3; i11++) {
                    c5563d0.m22421e(8);
                }
            } else {
                if (m22420d2 != 1) {
                    throw C4499t2.m17594a("floor type greater than 1 not decodable: " + m22420d2, null);
                }
                int m22420d4 = c5563d0.m22420d(5);
                int i12 = -1;
                int[] iArr = new int[m22420d4];
                for (int i13 = 0; i13 < m22420d4; i13++) {
                    iArr[i13] = c5563d0.m22420d(4);
                    if (iArr[i13] > i12) {
                        i12 = iArr[i13];
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = c5563d0.m22420d(3) + 1;
                    int m22420d5 = c5563d0.m22420d(2);
                    if (m22420d5 > 0) {
                        c5563d0.m22421e(8);
                    }
                    for (int i16 = 0; i16 < (1 << m22420d5); i16++) {
                        c5563d0.m22421e(8);
                    }
                }
                c5563d0.m22421e(2);
                int m22420d6 = c5563d0.m22420d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < m22420d4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        c5563d0.m22421e(m22420d6);
                        i18++;
                    }
                }
            }
        }
    }

    /* renamed from: f */
    public static void m22443f(int i10, C5563d0 c5563d0) {
        int m22420d = c5563d0.m22420d(6) + 1;
        for (int i11 = 0; i11 < m22420d; i11++) {
            int m22420d2 = c5563d0.m22420d(16);
            if (m22420d2 != 0) {
                C4046r.m15523c("VorbisUtil", "mapping type other than 0 not supported: " + m22420d2);
            } else {
                int m22420d3 = c5563d0.m22419c() ? c5563d0.m22420d(4) + 1 : 1;
                if (c5563d0.m22419c()) {
                    int m22420d4 = c5563d0.m22420d(8) + 1;
                    for (int i12 = 0; i12 < m22420d4; i12++) {
                        int i13 = i10 - 1;
                        c5563d0.m22421e(m22438a(i13));
                        c5563d0.m22421e(m22438a(i13));
                    }
                }
                if (c5563d0.m22420d(2) != 0) {
                    throw C4499t2.m17594a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (m22420d3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        c5563d0.m22421e(4);
                    }
                }
                for (int i15 = 0; i15 < m22420d3; i15++) {
                    c5563d0.m22421e(8);
                    c5563d0.m22421e(8);
                    c5563d0.m22421e(8);
                }
            }
        }
    }

    /* renamed from: g */
    public static c[] m22444g(C5563d0 c5563d0) {
        int m22420d = c5563d0.m22420d(6) + 1;
        c[] cVarArr = new c[m22420d];
        for (int i10 = 0; i10 < m22420d; i10++) {
            cVarArr[i10] = new c(c5563d0.m22419c(), c5563d0.m22420d(16), c5563d0.m22420d(16), c5563d0.m22420d(8));
        }
        return cVarArr;
    }

    /* renamed from: h */
    public static void m22445h(C5563d0 c5563d0) {
        int m22420d = c5563d0.m22420d(6) + 1;
        for (int i10 = 0; i10 < m22420d; i10++) {
            if (c5563d0.m22420d(16) > 2) {
                throw C4499t2.m17594a("residueType greater than 2 is not decodable", null);
            }
            c5563d0.m22421e(24);
            c5563d0.m22421e(24);
            c5563d0.m22421e(24);
            int m22420d2 = c5563d0.m22420d(6) + 1;
            c5563d0.m22421e(8);
            int[] iArr = new int[m22420d2];
            for (int i11 = 0; i11 < m22420d2; i11++) {
                iArr[i11] = ((c5563d0.m22419c() ? c5563d0.m22420d(5) : 0) * 8) + c5563d0.m22420d(3);
            }
            for (int i12 = 0; i12 < m22420d2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        c5563d0.m22421e(8);
                    }
                }
            }
        }
    }

    /* renamed from: i */
    public static b m22446i(C4015a0 c4015a0) {
        return m22447j(c4015a0, true, true);
    }

    /* renamed from: j */
    public static b m22447j(C4015a0 c4015a0, boolean z10, boolean z11) {
        if (z10) {
            m22450m(3, c4015a0, false);
        }
        String m15207D = c4015a0.m15207D((int) c4015a0.m15248w());
        int length = 11 + m15207D.length();
        long m15248w = c4015a0.m15248w();
        String[] strArr = new String[(int) m15248w];
        int i10 = length + 4;
        for (int i11 = 0; i11 < m15248w; i11++) {
            strArr[i11] = c4015a0.m15207D((int) c4015a0.m15248w());
            i10 = i10 + 4 + strArr[i11].length();
        }
        if (z11 && (c4015a0.m15210G() & 1) == 0) {
            throw C4499t2.m17594a("framing bit expected to be set", null);
        }
        return new b(m15207D, strArr, i10 + 1);
    }

    /* renamed from: k */
    public static d m22448k(C4015a0 c4015a0) {
        m22450m(1, c4015a0, false);
        int m15249x = c4015a0.m15249x();
        int m15210G = c4015a0.m15210G();
        int m15249x2 = c4015a0.m15249x();
        int m15245t = c4015a0.m15245t();
        if (m15245t <= 0) {
            m15245t = -1;
        }
        int m15245t2 = c4015a0.m15245t();
        if (m15245t2 <= 0) {
            m15245t2 = -1;
        }
        int m15245t3 = c4015a0.m15245t();
        if (m15245t3 <= 0) {
            m15245t3 = -1;
        }
        int m15210G2 = c4015a0.m15210G();
        return new d(m15249x, m15210G, m15249x2, m15245t, m15245t2, m15245t3, (int) Math.pow(2.0d, m15210G2 & 15), (int) Math.pow(2.0d, (m15210G2 & 240) >> 4), (c4015a0.m15210G() & 1) > 0, Arrays.copyOf(c4015a0.m15230e(), c4015a0.m15232g()));
    }

    /* renamed from: l */
    public static c[] m22449l(C4015a0 c4015a0, int i10) {
        m22450m(5, c4015a0, false);
        int m15210G = c4015a0.m15210G() + 1;
        C5563d0 c5563d0 = new C5563d0(c4015a0.m15230e());
        c5563d0.m22421e(c4015a0.m15231f() * 8);
        for (int i11 = 0; i11 < m15210G; i11++) {
            m22441d(c5563d0);
        }
        int m22420d = c5563d0.m22420d(6) + 1;
        for (int i12 = 0; i12 < m22420d; i12++) {
            if (c5563d0.m22420d(16) != 0) {
                throw C4499t2.m17594a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        m22442e(c5563d0);
        m22445h(c5563d0);
        m22443f(i10, c5563d0);
        c[] m22444g = m22444g(c5563d0);
        if (c5563d0.m22419c()) {
            return m22444g;
        }
        throw C4499t2.m17594a("framing bit after modes not set as expected", null);
    }

    /* renamed from: m */
    public static boolean m22450m(int i10, C4015a0 c4015a0, boolean z10) {
        if (c4015a0.m15226a() < 7) {
            if (z10) {
                return false;
            }
            throw C4499t2.m17594a("too short header: " + c4015a0.m15226a(), null);
        }
        if (c4015a0.m15210G() != i10) {
            if (z10) {
                return false;
            }
            throw C4499t2.m17594a("expected header type " + Integer.toHexString(i10), null);
        }
        if (c4015a0.m15210G() == 118 && c4015a0.m15210G() == 111 && c4015a0.m15210G() == 114 && c4015a0.m15210G() == 98 && c4015a0.m15210G() == 105 && c4015a0.m15210G() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw C4499t2.m17594a("expected characters 'vorbis'", null);
    }
}
