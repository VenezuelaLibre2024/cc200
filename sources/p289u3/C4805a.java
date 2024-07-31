package p289u3;

import p222p5.C4046r;
import p222p5.C4054z;
import p264s3.C4499t2;

/* renamed from: u3.a */
/* loaded from: classes.dex */
public final class C4805a {

    /* renamed from: a */
    public static final int[] f17863a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    public static final int[] f17864b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: u3.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f17865a;

        /* renamed from: b */
        public final int f17866b;

        /* renamed from: c */
        public final String f17867c;

        public b(int i10, int i11, String str) {
            this.f17865a = i10;
            this.f17866b = i11;
            this.f17867c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m18856a(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            int[] iArr = f17863a;
            if (i13 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i13]) {
                i14 = i13;
            }
            i13++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f17864b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return m18857b(2, i14, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    /* renamed from: b */
    public static byte[] m18857b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    /* renamed from: c */
    public static int m18858c(C4054z c4054z) {
        int m15601h = c4054z.m15601h(5);
        return m15601h == 31 ? c4054z.m15601h(6) + 32 : m15601h;
    }

    /* renamed from: d */
    public static int m18859d(C4054z c4054z) {
        int m15601h = c4054z.m15601h(4);
        if (m15601h == 15) {
            if (c4054z.m15595b() >= 24) {
                return c4054z.m15601h(24);
            }
            throw C4499t2.m17594a("AAC header insufficient data", null);
        }
        if (m15601h < 13) {
            return f17863a[m15601h];
        }
        throw C4499t2.m17594a("AAC header wrong Sampling Frequency Index", null);
    }

    /* renamed from: e */
    public static b m18860e(C4054z c4054z, boolean z10) {
        int m18858c = m18858c(c4054z);
        int m18859d = m18859d(c4054z);
        int m15601h = c4054z.m15601h(4);
        String str = "mp4a.40." + m18858c;
        if (m18858c == 5 || m18858c == 29) {
            m18859d = m18859d(c4054z);
            m18858c = m18858c(c4054z);
            if (m18858c == 22) {
                m15601h = c4054z.m15601h(4);
            }
        }
        if (z10) {
            if (m18858c != 1 && m18858c != 2 && m18858c != 3 && m18858c != 4 && m18858c != 6 && m18858c != 7 && m18858c != 17) {
                switch (m18858c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C4499t2.m17597d("Unsupported audio object type: " + m18858c);
                }
            }
            m18862g(c4054z, m18858c, m15601h);
            switch (m18858c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m15601h2 = c4054z.m15601h(2);
                    if (m15601h2 == 2 || m15601h2 == 3) {
                        throw C4499t2.m17597d("Unsupported epConfig: " + m15601h2);
                    }
            }
        }
        int i10 = f17864b[m15601h];
        if (i10 != -1) {
            return new b(m18859d, i10, str);
        }
        throw C4499t2.m17594a(null, null);
    }

    /* renamed from: f */
    public static b m18861f(byte[] bArr) {
        return m18860e(new C4054z(bArr), false);
    }

    /* renamed from: g */
    public static void m18862g(C4054z c4054z, int i10, int i11) {
        if (c4054z.m15600g()) {
            C4046r.m15529i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c4054z.m15600g()) {
            c4054z.m15611r(14);
        }
        boolean m15600g = c4054z.m15600g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            c4054z.m15611r(3);
        }
        if (m15600g) {
            if (i10 == 22) {
                c4054z.m15611r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                c4054z.m15611r(3);
            }
            c4054z.m15611r(1);
        }
    }
}
