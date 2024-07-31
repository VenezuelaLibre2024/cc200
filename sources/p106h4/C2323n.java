package p106h4;

import java.util.Arrays;
import p106h4.InterfaceC2316i0;
import p222p5.C4015a0;
import p222p5.C4051w;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5573m;

/* renamed from: h4.n */
/* loaded from: classes.dex */
public final class C2323n implements InterfaceC2322m {

    /* renamed from: q */
    public static final double[] f9384q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f9385a;

    /* renamed from: b */
    public InterfaceC5559b0 f9386b;

    /* renamed from: c */
    public final C2320k0 f9387c;

    /* renamed from: d */
    public final C4015a0 f9388d;

    /* renamed from: e */
    public final C2330u f9389e;

    /* renamed from: f */
    public final boolean[] f9390f;

    /* renamed from: g */
    public final a f9391g;

    /* renamed from: h */
    public long f9392h;

    /* renamed from: i */
    public boolean f9393i;

    /* renamed from: j */
    public boolean f9394j;

    /* renamed from: k */
    public long f9395k;

    /* renamed from: l */
    public long f9396l;

    /* renamed from: m */
    public long f9397m;

    /* renamed from: n */
    public long f9398n;

    /* renamed from: o */
    public boolean f9399o;

    /* renamed from: p */
    public boolean f9400p;

    /* renamed from: h4.n$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: e */
        public static final byte[] f9401e = {0, 0, 1};

        /* renamed from: a */
        public boolean f9402a;

        /* renamed from: b */
        public int f9403b;

        /* renamed from: c */
        public int f9404c;

        /* renamed from: d */
        public byte[] f9405d;

        public a(int i10) {
            this.f9405d = new byte[i10];
        }

        /* renamed from: a */
        public void m9431a(byte[] bArr, int i10, int i11) {
            if (this.f9402a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f9405d;
                int length = bArr2.length;
                int i13 = this.f9403b;
                if (length < i13 + i12) {
                    this.f9405d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f9405d, this.f9403b, i12);
                this.f9403b += i12;
            }
        }

        /* renamed from: b */
        public boolean m9432b(int i10, int i11) {
            if (this.f9402a) {
                int i12 = this.f9403b - i11;
                this.f9403b = i12;
                if (this.f9404c != 0 || i10 != 181) {
                    this.f9402a = false;
                    return true;
                }
                this.f9404c = i12;
            } else if (i10 == 179) {
                this.f9402a = true;
            }
            byte[] bArr = f9401e;
            m9431a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m9433c() {
            this.f9402a = false;
            this.f9403b = 0;
            this.f9404c = 0;
        }
    }

    public C2323n() {
        this(null);
    }

    public C2323n(C2320k0 c2320k0) {
        C4015a0 c4015a0;
        this.f9387c = c2320k0;
        this.f9390f = new boolean[4];
        this.f9391g = new a(128);
        if (c2320k0 != null) {
            this.f9389e = new C2330u(178, 128);
            c4015a0 = new C4015a0();
        } else {
            c4015a0 = null;
            this.f9389e = null;
        }
        this.f9388d = c4015a0;
        this.f9396l = -9223372036854775807L;
        this.f9398n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0075  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<p264s3.C4463m1, java.lang.Long> m9430b(p106h4.C2323n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f9405d
            int r1 = r8.f9403b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 6
            r5 = r0[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r6 = r4 >> 4
            r2 = r2 | r6
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r5
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3d
            r7 = 3
            if (r6 == r7) goto L37
            if (r6 == r1) goto L31
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L31:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
            goto L42
        L37:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L42
        L3d:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
        L42:
            float r6 = (float) r6
            float r1 = r1 / r6
        L44:
            s3.m1$b r6 = new s3.m1$b
            r6.<init>()
            s3.m1$b r9 = r6.m17462U(r9)
            java.lang.String r6 = "video/mpeg2"
            s3.m1$b r9 = r9.m17474g0(r6)
            s3.m1$b r9 = r9.m17481n0(r2)
            s3.m1$b r9 = r9.m17460S(r4)
            s3.m1$b r9 = r9.m17470c0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            s3.m1$b r9 = r9.m17463V(r1)
            s3.m1 r9 = r9.m17448G()
            r1 = 0
            r4 = r0[r5]
            r4 = r4 & 15
            int r4 = r4 + (-1)
            if (r4 < 0) goto L9c
            double[] r5 = p106h4.C2323n.f9384q
            int r6 = r5.length
            if (r4 >= r6) goto L9c
            r1 = r5[r4]
            int r8 = r8.f9404c
            int r8 = r8 + 9
            r4 = r0[r8]
            r4 = r4 & 96
            int r3 = r4 >> 5
            r8 = r0[r8]
            r8 = r8 & 31
            if (r3 == r8) goto L95
            double r3 = (double) r3
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L95:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r1 = (long) r3
        L9c:
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p106h4.C2323n.m9430b(h4.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // p106h4.InterfaceC2322m
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo9333a(p222p5.C4015a0 r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p106h4.C2323n.mo9333a(p5.a0):void");
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: c */
    public void mo9335c() {
        C4051w.m15565a(this.f9390f);
        this.f9391g.m9433c();
        C2330u c2330u = this.f9389e;
        if (c2330u != null) {
            c2330u.m9486d();
        }
        this.f9392h = 0L;
        this.f9393i = false;
        this.f9396l = -9223372036854775807L;
        this.f9398n = -9223372036854775807L;
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: d */
    public void mo9336d() {
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: e */
    public void mo9337e(InterfaceC5573m interfaceC5573m, InterfaceC2316i0.d dVar) {
        dVar.m9412a();
        this.f9385a = dVar.m9413b();
        this.f9386b = interfaceC5573m.mo3032e(dVar.m9414c(), 2);
        C2320k0 c2320k0 = this.f9387c;
        if (c2320k0 != null) {
            c2320k0.m9428b(interfaceC5573m, dVar);
        }
    }

    @Override // p106h4.InterfaceC2322m
    /* renamed from: f */
    public void mo9338f(long j10, int i10) {
        this.f9396l = j10;
    }
}
