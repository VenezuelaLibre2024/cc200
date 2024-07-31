package p106h4;

import android.util.SparseArray;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4054z;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: h4.a0 */
/* loaded from: classes.dex */
public final class C2300a0 implements InterfaceC5571k {

    /* renamed from: l */
    public static final InterfaceC5576p f9212l = new InterfaceC5576p() { // from class: h4.z
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m9323d;
            m9323d = C2300a0.m9323d();
            return m9323d;
        }
    };

    /* renamed from: a */
    public final C4033j0 f9213a;

    /* renamed from: b */
    public final SparseArray<a> f9214b;

    /* renamed from: c */
    public final C4015a0 f9215c;

    /* renamed from: d */
    public final C2334y f9216d;

    /* renamed from: e */
    public boolean f9217e;

    /* renamed from: f */
    public boolean f9218f;

    /* renamed from: g */
    public boolean f9219g;

    /* renamed from: h */
    public long f9220h;

    /* renamed from: i */
    public C2333x f9221i;

    /* renamed from: j */
    public InterfaceC5573m f9222j;

    /* renamed from: k */
    public boolean f9223k;

    /* renamed from: h4.a0$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC2322m f9224a;

        /* renamed from: b */
        public final C4033j0 f9225b;

        /* renamed from: c */
        public final C4054z f9226c = new C4054z(new byte[64]);

        /* renamed from: d */
        public boolean f9227d;

        /* renamed from: e */
        public boolean f9228e;

        /* renamed from: f */
        public boolean f9229f;

        /* renamed from: g */
        public int f9230g;

        /* renamed from: h */
        public long f9231h;

        public a(InterfaceC2322m interfaceC2322m, C4033j0 c4033j0) {
            this.f9224a = interfaceC2322m;
            this.f9225b = c4033j0;
        }

        /* renamed from: a */
        public void m9325a(C4015a0 c4015a0) {
            c4015a0.m15237l(this.f9226c.f14602a, 0, 3);
            this.f9226c.m15609p(0);
            m9326b();
            c4015a0.m15237l(this.f9226c.f14602a, 0, this.f9230g);
            this.f9226c.m15609p(0);
            m9327c();
            this.f9224a.mo9338f(this.f9231h, 4);
            this.f9224a.mo9333a(c4015a0);
            this.f9224a.mo9336d();
        }

        /* renamed from: b */
        public final void m9326b() {
            this.f9226c.m15611r(8);
            this.f9227d = this.f9226c.m15600g();
            this.f9228e = this.f9226c.m15600g();
            this.f9226c.m15611r(6);
            this.f9230g = this.f9226c.m15601h(8);
        }

        /* renamed from: c */
        public final void m9327c() {
            this.f9231h = 0L;
            if (this.f9227d) {
                this.f9226c.m15611r(4);
                this.f9226c.m15611r(1);
                this.f9226c.m15611r(1);
                long m15601h = (this.f9226c.m15601h(3) << 30) | (this.f9226c.m15601h(15) << 15) | this.f9226c.m15601h(15);
                this.f9226c.m15611r(1);
                if (!this.f9229f && this.f9228e) {
                    this.f9226c.m15611r(4);
                    this.f9226c.m15611r(1);
                    this.f9226c.m15611r(1);
                    this.f9226c.m15611r(1);
                    this.f9225b.m15363b((this.f9226c.m15601h(3) << 30) | (this.f9226c.m15601h(15) << 15) | this.f9226c.m15601h(15));
                    this.f9229f = true;
                }
                this.f9231h = this.f9225b.m15363b(m15601h);
            }
        }

        /* renamed from: d */
        public void m9328d() {
            this.f9229f = false;
            this.f9224a.mo9335c();
        }
    }

    public C2300a0() {
        this(new C4033j0(0L));
    }

    public C2300a0(C4033j0 c4033j0) {
        this.f9213a = c4033j0;
        this.f9215c = new C4015a0(4096);
        this.f9214b = new SparseArray<>();
        this.f9216d = new C2334y();
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC5571k[] m9323d() {
        return new InterfaceC5571k[]{new C2300a0()};
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f9222j = interfaceC5573m;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        boolean z10 = this.f9213a.m15366e() == -9223372036854775807L;
        if (!z10) {
            long m15364c = this.f9213a.m15364c();
            z10 = (m15364c == -9223372036854775807L || m15364c == 0 || m15364c == j11) ? false : true;
        }
        if (z10) {
            this.f9213a.m15367g(j11);
        }
        C2333x c2333x = this.f9221i;
        if (c2333x != null) {
            c2333x.m22374h(j11);
        }
        for (int i10 = 0; i10 < this.f9214b.size(); i10++) {
            this.f9214b.valueAt(i10).m9328d();
        }
    }

    /* renamed from: e */
    public final void m9324e(long j10) {
        InterfaceC5573m interfaceC5573m;
        InterfaceC5586z bVar;
        if (this.f9223k) {
            return;
        }
        this.f9223k = true;
        if (this.f9216d.m9501c() != -9223372036854775807L) {
            C2333x c2333x = new C2333x(this.f9216d.m9502d(), this.f9216d.m9501c(), j10);
            this.f9221i = c2333x;
            interfaceC5573m = this.f9222j;
            bVar = c2333x.m22368b();
        } else {
            interfaceC5573m = this.f9222j;
            bVar = new InterfaceC5586z.b(this.f9216d.m9501c());
        }
        interfaceC5573m.mo3033j(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo169g(p333x3.InterfaceC5572l r10, p333x3.C5585y r11) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p106h4.C2300a0.mo169g(x3.l, x3.y):int");
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        byte[] bArr = new byte[14];
        interfaceC5572l.mo22430p(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC5572l.mo22425h(bArr[13] & 7);
        interfaceC5572l.mo22430p(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }
}
