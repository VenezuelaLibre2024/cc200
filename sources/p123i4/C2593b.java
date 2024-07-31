package p123i4;

import android.util.Pair;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.embedding.android.KeyboardMap;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p289u3.C4830m0;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;

/* renamed from: i4.b */
/* loaded from: classes.dex */
public final class C2593b implements InterfaceC5571k {

    /* renamed from: h */
    public static final InterfaceC5576p f10151h = new InterfaceC5576p() { // from class: i4.a
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m10358e;
            m10358e = C2593b.m10358e();
            return m10358e;
        }
    };

    /* renamed from: a */
    public InterfaceC5573m f10152a;

    /* renamed from: b */
    public InterfaceC5559b0 f10153b;

    /* renamed from: e */
    public b f10156e;

    /* renamed from: c */
    public int f10154c = 0;

    /* renamed from: d */
    public long f10155d = -1;

    /* renamed from: f */
    public int f10157f = -1;

    /* renamed from: g */
    public long f10158g = -1;

    /* renamed from: i4.b$a */
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: m */
        public static final int[] f10159m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n */
        public static final int[] f10160n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, C1417R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a */
        public final InterfaceC5573m f10161a;

        /* renamed from: b */
        public final InterfaceC5559b0 f10162b;

        /* renamed from: c */
        public final C2594c f10163c;

        /* renamed from: d */
        public final int f10164d;

        /* renamed from: e */
        public final byte[] f10165e;

        /* renamed from: f */
        public final C4015a0 f10166f;

        /* renamed from: g */
        public final int f10167g;

        /* renamed from: h */
        public final C4463m1 f10168h;

        /* renamed from: i */
        public int f10169i;

        /* renamed from: j */
        public long f10170j;

        /* renamed from: k */
        public int f10171k;

        /* renamed from: l */
        public long f10172l;

        public a(InterfaceC5573m interfaceC5573m, InterfaceC5559b0 interfaceC5559b0, C2594c c2594c) {
            this.f10161a = interfaceC5573m;
            this.f10162b = interfaceC5559b0;
            this.f10163c = c2594c;
            int max = Math.max(1, c2594c.f10183c / 10);
            this.f10167g = max;
            C4015a0 c4015a0 = new C4015a0(c2594c.f10187g);
            c4015a0.m15250y();
            int m15250y = c4015a0.m15250y();
            this.f10164d = m15250y;
            int i10 = c2594c.f10182b;
            int i11 = (((c2594c.f10185e - (i10 * 4)) * 8) / (c2594c.f10186f * i10)) + 1;
            if (m15250y == i11) {
                int m15467l = C4041n0.m15467l(max, m15250y);
                this.f10165e = new byte[c2594c.f10185e * m15467l];
                this.f10166f = new C4015a0(m15467l * m10365h(m15250y, i10));
                int i12 = ((c2594c.f10183c * c2594c.f10185e) * 8) / m15250y;
                this.f10168h = new C4463m1.b().m17474g0("audio/raw").m17450I(i12).m17469b0(i12).m17466Y(m10365h(max, i10)).m17451J(c2594c.f10182b).m17475h0(c2594c.f10183c).m17468a0(2).m17448G();
                return;
            }
            throw C4499t2.m17594a("Expected frames per block: " + i11 + "; got: " + m15250y, null);
        }

        /* renamed from: h */
        public static int m10365h(int i10, int i11) {
            return i10 * 2 * i11;
        }

        @Override // p123i4.C2593b.b
        /* renamed from: a */
        public void mo10366a(long j10) {
            this.f10169i = 0;
            this.f10170j = j10;
            this.f10171k = 0;
            this.f10172l = 0L;
        }

        @Override // p123i4.C2593b.b
        /* renamed from: b */
        public void mo10367b(int i10, long j10) {
            this.f10161a.mo3033j(new C2596e(this.f10163c, this.f10164d, i10, j10));
            this.f10162b.mo4852b(this.f10168h);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0035 -> B:3:0x001b). Please report as a decompilation issue!!! */
        @Override // p123i4.C2593b.b
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean mo10368c(p333x3.InterfaceC5572l r7, long r8) {
            /*
                r6 = this;
                int r0 = r6.f10167g
                int r1 = r6.f10171k
                int r1 = r6.m10371f(r1)
                int r0 = r0 - r1
                int r1 = r6.f10164d
                int r0 = p222p5.C4041n0.m15467l(r0, r1)
                i4.c r1 = r6.f10163c
                int r1 = r1.f10185e
                int r0 = r0 * r1
                r1 = 0
                int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                r2 = 1
                if (r1 != 0) goto L1d
            L1b:
                r1 = r2
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L3e
                int r3 = r6.f10169i
                if (r3 >= r0) goto L3e
                int r3 = r0 - r3
                long r3 = (long) r3
                long r3 = java.lang.Math.min(r3, r8)
                int r3 = (int) r3
                byte[] r4 = r6.f10165e
                int r5 = r6.f10169i
                int r3 = r7.mo14769c(r4, r5, r3)
                r4 = -1
                if (r3 != r4) goto L38
                goto L1b
            L38:
                int r4 = r6.f10169i
                int r4 = r4 + r3
                r6.f10169i = r4
                goto L1e
            L3e:
                int r7 = r6.f10169i
                i4.c r8 = r6.f10163c
                int r8 = r8.f10185e
                int r7 = r7 / r8
                if (r7 <= 0) goto L75
                byte[] r8 = r6.f10165e
                p5.a0 r9 = r6.f10166f
                r6.m10369d(r8, r7, r9)
                int r8 = r6.f10169i
                i4.c r9 = r6.f10163c
                int r9 = r9.f10185e
                int r7 = r7 * r9
                int r8 = r8 - r7
                r6.f10169i = r8
                p5.a0 r7 = r6.f10166f
                int r7 = r7.m15232g()
                x3.b0 r8 = r6.f10162b
                p5.a0 r9 = r6.f10166f
                r8.m22408e(r9, r7)
                int r8 = r6.f10171k
                int r8 = r8 + r7
                r6.f10171k = r8
                int r7 = r6.m10371f(r8)
                int r8 = r6.f10167g
                if (r7 < r8) goto L75
                r6.m10373i(r8)
            L75:
                if (r1 == 0) goto L82
                int r7 = r6.f10171k
                int r7 = r6.m10371f(r7)
                if (r7 <= 0) goto L82
                r6.m10373i(r7)
            L82:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p123i4.C2593b.a.mo10368c(x3.l, long):boolean");
        }

        /* renamed from: d */
        public final void m10369d(byte[] bArr, int i10, C4015a0 c4015a0) {
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < this.f10163c.f10182b; i12++) {
                    m10370e(bArr, i11, i12, c4015a0.m15230e());
                }
            }
            int m10372g = m10372g(this.f10164d * i10);
            c4015a0.m15223T(0);
            c4015a0.m15222S(m10372g);
        }

        /* renamed from: e */
        public final void m10370e(byte[] bArr, int i10, int i11, byte[] bArr2) {
            C2594c c2594c = this.f10163c;
            int i12 = c2594c.f10185e;
            int i13 = c2594c.f10182b;
            int i14 = (i10 * i12) + (i11 * 4);
            int i15 = (i13 * 4) + i14;
            int i16 = (i12 / i13) - 4;
            int i17 = (short) (((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255));
            int min = Math.min(bArr[i14 + 2] & 255, 88);
            int i18 = f10160n[min];
            int i19 = ((i10 * this.f10164d * i13) + i11) * 2;
            bArr2[i19] = (byte) (i17 & 255);
            bArr2[i19 + 1] = (byte) (i17 >> 8);
            for (int i20 = 0; i20 < i16 * 2; i20++) {
                int i21 = bArr[((i20 / 8) * i13 * 4) + i15 + ((i20 / 2) % 4)] & 255;
                int i22 = i20 % 2 == 0 ? i21 & 15 : i21 >> 4;
                int i23 = ((((i22 & 7) * 2) + 1) * i18) >> 3;
                if ((i22 & 8) != 0) {
                    i23 = -i23;
                }
                i17 = C4041n0.m15477q(i17 + i23, -32768, 32767);
                i19 += i13 * 2;
                bArr2[i19] = (byte) (i17 & 255);
                bArr2[i19 + 1] = (byte) (i17 >> 8);
                int i24 = min + f10159m[i22];
                int[] iArr = f10160n;
                min = C4041n0.m15477q(i24, 0, iArr.length - 1);
                i18 = iArr[min];
            }
        }

        /* renamed from: f */
        public final int m10371f(int i10) {
            return i10 / (this.f10163c.f10182b * 2);
        }

        /* renamed from: g */
        public final int m10372g(int i10) {
            return m10365h(i10, this.f10163c.f10182b);
        }

        /* renamed from: i */
        public final void m10373i(int i10) {
            long m15420N0 = this.f10170j + C4041n0.m15420N0(this.f10172l, 1000000L, this.f10163c.f10183c);
            int m10372g = m10372g(i10);
            this.f10162b.mo4851a(m15420N0, 1, m10372g, this.f10171k - m10372g, null);
            this.f10172l += i10;
            this.f10171k -= m10372g;
        }
    }

    /* renamed from: i4.b$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo10366a(long j10);

        /* renamed from: b */
        void mo10367b(int i10, long j10);

        /* renamed from: c */
        boolean mo10368c(InterfaceC5572l interfaceC5572l, long j10);
    }

    /* renamed from: i4.b$c */
    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        public final InterfaceC5573m f10173a;

        /* renamed from: b */
        public final InterfaceC5559b0 f10174b;

        /* renamed from: c */
        public final C2594c f10175c;

        /* renamed from: d */
        public final C4463m1 f10176d;

        /* renamed from: e */
        public final int f10177e;

        /* renamed from: f */
        public long f10178f;

        /* renamed from: g */
        public int f10179g;

        /* renamed from: h */
        public long f10180h;

        public c(InterfaceC5573m interfaceC5573m, InterfaceC5559b0 interfaceC5559b0, C2594c c2594c, String str, int i10) {
            this.f10173a = interfaceC5573m;
            this.f10174b = interfaceC5559b0;
            this.f10175c = c2594c;
            int i11 = (c2594c.f10182b * c2594c.f10186f) / 8;
            if (c2594c.f10185e == i11) {
                int i12 = c2594c.f10183c;
                int i13 = i12 * i11 * 8;
                int max = Math.max(i11, (i12 * i11) / 10);
                this.f10177e = max;
                this.f10176d = new C4463m1.b().m17474g0(str).m17450I(i13).m17469b0(i13).m17466Y(max).m17451J(c2594c.f10182b).m17475h0(c2594c.f10183c).m17468a0(i10).m17448G();
                return;
            }
            throw C4499t2.m17594a("Expected block size: " + i11 + "; got: " + c2594c.f10185e, null);
        }

        @Override // p123i4.C2593b.b
        /* renamed from: a */
        public void mo10366a(long j10) {
            this.f10178f = j10;
            this.f10179g = 0;
            this.f10180h = 0L;
        }

        @Override // p123i4.C2593b.b
        /* renamed from: b */
        public void mo10367b(int i10, long j10) {
            this.f10173a.mo3033j(new C2596e(this.f10175c, 1, i10, j10));
            this.f10174b.mo4852b(this.f10176d);
        }

        @Override // p123i4.C2593b.b
        /* renamed from: c */
        public boolean mo10368c(InterfaceC5572l interfaceC5572l, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f10179g) < (i11 = this.f10177e)) {
                int m22407c = this.f10174b.m22407c(interfaceC5572l, (int) Math.min(i11 - i10, j11), true);
                if (m22407c == -1) {
                    j11 = 0;
                } else {
                    this.f10179g += m22407c;
                    j11 -= m22407c;
                }
            }
            int i12 = this.f10175c.f10185e;
            int i13 = this.f10179g / i12;
            if (i13 > 0) {
                long m15420N0 = this.f10178f + C4041n0.m15420N0(this.f10180h, 1000000L, r1.f10183c);
                int i14 = i13 * i12;
                int i15 = this.f10179g - i14;
                this.f10174b.mo4851a(m15420N0, 1, i14, i15, null);
                this.f10180h += i13;
                this.f10179g = i15;
            }
            return j11 <= 0;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC5571k[] m10358e() {
        return new InterfaceC5571k[]{new C2593b()};
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f10152a = interfaceC5573m;
        this.f10153b = interfaceC5573m.mo3032e(0, 1);
        interfaceC5573m.mo3034n();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        this.f10154c = j10 == 0 ? 0 : 4;
        b bVar = this.f10156e;
        if (bVar != null) {
            bVar.mo10366a(j11);
        }
    }

    /* renamed from: d */
    public final void m10359d() {
        C4014a.m15202h(this.f10153b);
        C4041n0.m15463j(this.f10152a);
    }

    /* renamed from: f */
    public final void m10360f(InterfaceC5572l interfaceC5572l) {
        C4014a.m15200f(interfaceC5572l.getPosition() == 0);
        int i10 = this.f10157f;
        if (i10 != -1) {
            interfaceC5572l.mo22428m(i10);
            this.f10154c = 4;
        } else {
            if (!C2595d.m10374a(interfaceC5572l)) {
                throw C4499t2.m17594a("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC5572l.mo22428m((int) (interfaceC5572l.mo3030f() - interfaceC5572l.getPosition()));
            this.f10154c = 1;
        }
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        m10359d();
        int i10 = this.f10154c;
        if (i10 == 0) {
            m10360f(interfaceC5572l);
            return 0;
        }
        if (i10 == 1) {
            m10362j(interfaceC5572l);
            return 0;
        }
        if (i10 == 2) {
            m10361i(interfaceC5572l);
            return 0;
        }
        if (i10 == 3) {
            m10364l(interfaceC5572l);
            return 0;
        }
        if (i10 == 4) {
            return m10363k(interfaceC5572l);
        }
        throw new IllegalStateException();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        return C2595d.m10374a(interfaceC5572l);
    }

    /* renamed from: i */
    public final void m10361i(InterfaceC5572l interfaceC5572l) {
        b cVar;
        C2594c m10375b = C2595d.m10375b(interfaceC5572l);
        int i10 = m10375b.f10181a;
        if (i10 == 17) {
            cVar = new a(this.f10152a, this.f10153b, m10375b);
        } else if (i10 == 6) {
            cVar = new c(this.f10152a, this.f10153b, m10375b, "audio/g711-alaw", -1);
        } else if (i10 == 7) {
            cVar = new c(this.f10152a, this.f10153b, m10375b, "audio/g711-mlaw", -1);
        } else {
            int m19120a = C4830m0.m19120a(i10, m10375b.f10186f);
            if (m19120a == 0) {
                throw C4499t2.m17597d("Unsupported WAV format type: " + m10375b.f10181a);
            }
            cVar = new c(this.f10152a, this.f10153b, m10375b, "audio/raw", m19120a);
        }
        this.f10156e = cVar;
        this.f10154c = 3;
    }

    /* renamed from: j */
    public final void m10362j(InterfaceC5572l interfaceC5572l) {
        this.f10155d = C2595d.m10376c(interfaceC5572l);
        this.f10154c = 2;
    }

    /* renamed from: k */
    public final int m10363k(InterfaceC5572l interfaceC5572l) {
        C4014a.m15200f(this.f10158g != -1);
        return ((b) C4014a.m15199e(this.f10156e)).mo10368c(interfaceC5572l, this.f10158g - interfaceC5572l.getPosition()) ? -1 : 0;
    }

    /* renamed from: l */
    public final void m10364l(InterfaceC5572l interfaceC5572l) {
        Pair<Long, Long> m10378e = C2595d.m10378e(interfaceC5572l);
        this.f10157f = ((Long) m10378e.first).intValue();
        long longValue = ((Long) m10378e.second).longValue();
        long j10 = this.f10155d;
        if (j10 != -1 && longValue == KeyboardMap.kValueMask) {
            longValue = j10;
        }
        this.f10158g = this.f10157f + longValue;
        long mo3029b = interfaceC5572l.mo3029b();
        if (mo3029b != -1 && this.f10158g > mo3029b) {
            C4046r.m15529i("WavExtractor", "Data exceeds input length: " + this.f10158g + ", " + mo3029b);
            this.f10158g = mo3029b;
        }
        ((b) C4014a.m15199e(this.f10156e)).mo10367b(this.f10157f, this.f10158g);
        this.f10154c = 4;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
