package p106h4;

import java.util.Arrays;
import java.util.Collections;
import p106h4.InterfaceC2316i0;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4051w;
import p222p5.C4054z;
import p264s3.C4463m1;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.o */
/* loaded from: classes.dex */
public final class C2324o implements InterfaceC2322m {

    /* renamed from: l */
    public static final float[] f9406l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final C2320k0 f9407a;

    /* renamed from: b */
    public final C4015a0 f9408b;

    /* renamed from: e */
    public final C2330u f9411e;

    /* renamed from: f */
    public b f9412f;

    /* renamed from: g */
    public long f9413g;

    /* renamed from: h */
    public String f9414h;

    /* renamed from: i */
    public InterfaceC5559b0 f9415i;

    /* renamed from: j */
    public boolean f9416j;

    /* renamed from: c */
    public final boolean[] f9409c = new boolean[4];

    /* renamed from: d */
    public final a f9410d = new a(128);

    /* renamed from: k */
    public long f9417k = -9223372036854775807L;

    /* renamed from: h4.o$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: f */
        public static final byte[] f9418f = {0, 0, 1};

        /* renamed from: a */
        public boolean f9419a;

        /* renamed from: b */
        public int f9420b;

        /* renamed from: c */
        public int f9421c;

        /* renamed from: d */
        public int f9422d;

        /* renamed from: e */
        public byte[] f9423e;

        public a(int i10) {
            this.f9423e = new byte[i10];
        }

        /* renamed from: a */
        public void m9435a(byte[] bArr, int i10, int i11) {
            if (this.f9419a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f9423e;
                int length = bArr2.length;
                int i13 = this.f9421c;
                if (length < i13 + i12) {
                    this.f9423e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f9423e, this.f9421c, i12);
                this.f9421c += i12;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        
            if (r9 != 181) goto L27;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean m9436b(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.f9420b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L4b
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 2
                java.lang.String r5 = "Unexpected start code value"
                java.lang.String r6 = "H263Reader"
                if (r0 == r2) goto L3f
                r7 = 3
                if (r0 == r4) goto L37
                r4 = 4
                if (r0 == r7) goto L2b
                if (r0 != r4) goto L25
                r0 = 179(0xb3, float:2.51E-43)
                if (r9 == r0) goto L1d
                if (r9 != r3) goto L53
            L1d:
                int r9 = r8.f9421c
                int r9 = r9 - r10
                r8.f9421c = r9
                r8.f9419a = r1
                return r2
            L25:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>()
                throw r9
            L2b:
                r9 = r9 & 240(0xf0, float:3.36E-43)
                r10 = 32
                if (r9 == r10) goto L32
                goto L41
            L32:
                int r9 = r8.f9421c
                r8.f9422d = r9
                goto L48
            L37:
                r10 = 31
                if (r9 <= r10) goto L3c
                goto L41
            L3c:
                r8.f9420b = r7
                goto L53
            L3f:
                if (r9 == r3) goto L48
            L41:
                p222p5.C4046r.m15529i(r6, r5)
                r8.m9437c()
                goto L53
            L48:
                r8.f9420b = r4
                goto L53
            L4b:
                r10 = 176(0xb0, float:2.47E-43)
                if (r9 != r10) goto L53
                r8.f9420b = r2
                r8.f9419a = r2
            L53:
                byte[] r9 = p106h4.C2324o.a.f9418f
                int r10 = r9.length
                r8.m9435a(r9, r1, r10)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p106h4.C2324o.a.m9436b(int, int):boolean");
        }

        /* renamed from: c */
        public void m9437c() {
            this.f9419a = false;
            this.f9421c = 0;
            this.f9420b = 0;
        }
    }

    /* renamed from: h4.o$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC5559b0 f9424a;

        /* renamed from: b */
        public boolean f9425b;

        /* renamed from: c */
        public boolean f9426c;

        /* renamed from: d */
        public boolean f9427d;

        /* renamed from: e */
        public int f9428e;

        /* renamed from: f */
        public int f9429f;

        /* renamed from: g */
        public long f9430g;

        /* renamed from: h */
        public long f9431h;

        public b(InterfaceC5559b0 interfaceC5559b0) {
            this.f9424a = interfaceC5559b0;
        }

        /* renamed from: a */
        public void m9438a(byte[] bArr, int i10, int i11) {
            if (this.f9426c) {
                int i12 = this.f9429f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f9429f = i12 + (i11 - i10);
                } else {
                    this.f9427d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f9426c = false;
                }
            }
        }

        /* renamed from: b */
        public void m9439b(long j10, int i10, boolean z10) {
            if (this.f9428e == 182 && z10 && this.f9425b) {
                long j11 = this.f9431h;
                if (j11 != -9223372036854775807L) {
                    this.f9424a.mo4851a(j11, this.f9427d ? 1 : 0, (int) (j10 - this.f9430g), i10, null);
                }
            }
            if (this.f9428e != 179) {
                this.f9430g = j10;
            }
        }

        /* renamed from: c */
        public void m9440c(int i10, long j10) {
            this.f9428e = i10;
            this.f9427d = false;
            this.f9425b = i10 == 182 || i10 == 179;
            this.f9426c = i10 == 182;
            this.f9429f = 0;
            this.f9431h = j10;
        }

        /* renamed from: d */
        public void m9441d() {
            this.f9425b = false;
            this.f9426c = false;
            this.f9427d = false;
            this.f9428e = -1;
        }
    }

    public C2324o(C2320k0 c2320k0) {
        C4015a0 c4015a0;
        this.f9407a = c2320k0;
        if (c2320k0 != null) {
            this.f9411e = new C2330u(178, 128);
            c4015a0 = new C4015a0();
        } else {
            c4015a0 = null;
            this.f9411e = null;
        }
        this.f9408b = c4015a0;
    }

    /* renamed from: b */
    public static C4463m1 m9434b(a aVar, int i10, String str) {
        byte[] copyOf = Arrays.copyOf(aVar.f9423e, aVar.f9421c);
        C4054z c4054z = new C4054z(copyOf);
        c4054z.m15612s(i10);
        c4054z.m15612s(4);
        c4054z.m15610q();
        c4054z.m15611r(8);
        if (c4054z.m15600g()) {
            c4054z.m15611r(4);
            c4054z.m15611r(3);
        }
        int m15601h = c4054z.m15601h(4);
        float f10 = 1.0f;
        if (m15601h == 15) {
            int m15601h2 = c4054z.m15601h(8);
            int m15601h3 = c4054z.m15601h(8);
            if (m15601h3 != 0) {
                f10 = m15601h2 / m15601h3;
            }
            C4046r.m15529i("H263Reader", "Invalid aspect ratio");
        } else {
            float[] fArr = f9406l;
            if (m15601h < fArr.length) {
                f10 = fArr[m15601h];
            }
            C4046r.m15529i("H263Reader", "Invalid aspect ratio");
        }
        if (c4054z.m15600g()) {
            c4054z.m15611r(2);
            c4054z.m15611r(1);
            if (c4054z.m15600g()) {
                c4054z.m15611r(15);
                c4054z.m15610q();
                c4054z.m15611r(15);
                c4054z.m15610q();
                c4054z.m15611r(15);
                c4054z.m15610q();
                c4054z.m15611r(3);
                c4054z.m15611r(11);
                c4054z.m15610q();
                c4054z.m15611r(15);
                c4054z.m15610q();
            }
        }
        if (c4054z.m15601h(2) != 0) {
            C4046r.m15529i("H263Reader", "Unhandled video object layer shape");
        }
        c4054z.m15610q();
        int m15601h4 = c4054z.m15601h(16);
        c4054z.m15610q();
        if (c4054z.m15600g()) {
            if (m15601h4 == 0) {
                C4046r.m15529i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = m15601h4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                c4054z.m15611r(i11);
            }
        }
        c4054z.m15610q();
        int m15601h5 = c4054z.m15601h(13);
        c4054z.m15610q();
        int m15601h6 = c4054z.m15601h(13);
        c4054z.m15610q();
        c4054z.m15610q();
        return new C4463m1.b().m17462U(str).m17474g0("video/mp4v-es").m17481n0(m15601h5).m17460S(m15601h6).m17470c0(f10).m17463V(Collections.singletonList(copyOf)).m17448G();
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    public void mo9333a(C4015a0 c4015a0) {
        C4014a.m15202h(this.f9412f);
        C4014a.m15202h(this.f9415i);
        int m15231f = c4015a0.m15231f();
        int m15232g = c4015a0.m15232g();
        byte[] m15230e = c4015a0.m15230e();
        this.f9413g += c4015a0.m15226a();
        this.f9415i.m22408e(c4015a0, c4015a0.m15226a());
        while (true) {
            int m15567c = C4051w.m15567c(m15230e, m15231f, m15232g, this.f9409c);
            if (m15567c == m15232g) {
                break;
            }
            int i10 = m15567c + 3;
            int i11 = c4015a0.m15230e()[i10] & 255;
            int i12 = m15567c - m15231f;
            int i13 = 0;
            if (!this.f9416j) {
                if (i12 > 0) {
                    this.f9410d.m9435a(m15230e, m15231f, m15567c);
                }
                if (this.f9410d.m9436b(i11, i12 < 0 ? -i12 : 0)) {
                    InterfaceC5559b0 interfaceC5559b0 = this.f9415i;
                    a aVar = this.f9410d;
                    interfaceC5559b0.mo4852b(m9434b(aVar, aVar.f9422d, (String) C4014a.m15199e(this.f9414h)));
                    this.f9416j = true;
                }
            }
            this.f9412f.m9438a(m15230e, m15231f, m15567c);
            C2330u c2330u = this.f9411e;
            if (c2330u != null) {
                if (i12 > 0) {
                    c2330u.m9483a(m15230e, m15231f, m15567c);
                } else {
                    i13 = -i12;
                }
                if (this.f9411e.m9484b(i13)) {
                    C2330u c2330u2 = this.f9411e;
                    ((C4015a0) C4041n0.m15463j(this.f9408b)).m15221R(this.f9411e.f9550d, C4051w.m15581q(c2330u2.f9550d, c2330u2.f9551e));
                    ((C2320k0) C4041n0.m15463j(this.f9407a)).m9427a(this.f9417k, this.f9408b);
                }
                if (i11 == 178 && c4015a0.m15230e()[m15567c + 2] == 1) {
                    this.f9411e.m9487e(i11);
                }
            }
            int i14 = m15232g - m15567c;
            this.f9412f.m9439b(this.f9413g - i14, i14, this.f9416j);
            this.f9412f.m9440c(i11, this.f9417k);
            m15231f = i10;
        }
        if (!this.f9416j) {
            this.f9410d.m9435a(m15230e, m15231f, m15232g);
        }
        this.f9412f.m9438a(m15230e, m15231f, m15232g);
        C2330u c2330u3 = this.f9411e;
        if (c2330u3 != null) {
            c2330u3.m9483a(m15230e, m15231f, m15232g);
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        C4051w.m15565a(this.f9409c);
        this.f9410d.m9437c();
        b bVar = this.f9412f;
        if (bVar != null) {
            bVar.m9441d();
        }
        C2330u c2330u = this.f9411e;
        if (c2330u != null) {
            c2330u.m9486d();
        }
        this.f9413g = 0L;
        this.f9417k = -9223372036854775807L;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9414h = dVar.m9413b();
        InterfaceC5559b0 mo3032e = interfaceC5573m.mo3032e(dVar.m9414c(), 2);
        this.f9415i = mo3032e;
        this.f9412f = new b(mo3032e);
        C2320k0 c2320k0 = this.f9407a;
        if (c2320k0 != null) {
            c2320k0.m9428b(interfaceC5573m, dVar);
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9417k = j10;
        }
    }
}
