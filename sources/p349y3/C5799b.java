package p349y3;

import java.io.EOFException;
import java.util.Arrays;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p333x3.C5562d;
import p333x3.C5585y;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5571k;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5573m;
import p333x3.InterfaceC5576p;
import p333x3.InterfaceC5586z;

/* renamed from: y3.b */
/* loaded from: classes.dex */
public final class C5799b implements InterfaceC5571k {

    /* renamed from: r */
    public static final int[] f21730r;

    /* renamed from: u */
    public static final int f21733u;

    /* renamed from: a */
    public final byte[] f21734a;

    /* renamed from: b */
    public final int f21735b;

    /* renamed from: c */
    public boolean f21736c;

    /* renamed from: d */
    public long f21737d;

    /* renamed from: e */
    public int f21738e;

    /* renamed from: f */
    public int f21739f;

    /* renamed from: g */
    public boolean f21740g;

    /* renamed from: h */
    public long f21741h;

    /* renamed from: i */
    public int f21742i;

    /* renamed from: j */
    public int f21743j;

    /* renamed from: k */
    public long f21744k;

    /* renamed from: l */
    public InterfaceC5573m f21745l;

    /* renamed from: m */
    public InterfaceC5559b0 f21746m;

    /* renamed from: n */
    public InterfaceC5586z f21747n;

    /* renamed from: o */
    public boolean f21748o;

    /* renamed from: p */
    public static final InterfaceC5576p f21728p = new InterfaceC5576p() { // from class: y3.a
        @Override // p333x3.InterfaceC5576p
        /* renamed from: b */
        public final InterfaceC5571k[] mo161b() {
            InterfaceC5571k[] m23264m;
            m23264m = C5799b.m23264m();
            return m23264m;
        }
    };

    /* renamed from: q */
    public static final int[] f21729q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: s */
    public static final byte[] f21731s = C4041n0.m15468l0("#!AMR\n");

    /* renamed from: t */
    public static final byte[] f21732t = C4041n0.m15468l0("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f21730r = iArr;
        f21733u = iArr[8];
    }

    public C5799b() {
        this(0);
    }

    public C5799b(int i10) {
        this.f21735b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f21734a = new byte[1];
        this.f21742i = -1;
    }

    /* renamed from: e */
    public static int m23263e(int i10, long j10) {
        return (int) (((i10 * 8) * 1000000) / j10);
    }

    /* renamed from: m */
    public static /* synthetic */ InterfaceC5571k[] m23264m() {
        return new InterfaceC5571k[]{new C5799b()};
    }

    /* renamed from: p */
    public static boolean m23265p(InterfaceC5572l interfaceC5572l, byte[] bArr) {
        interfaceC5572l.mo22427l();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC5572l.mo22430p(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: b */
    public void mo164b(InterfaceC5573m interfaceC5573m) {
        this.f21745l = interfaceC5573m;
        this.f21746m = interfaceC5573m.mo3032e(0, 1);
        interfaceC5573m.mo3034n();
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: c */
    public void mo165c(long j10, long j11) {
        this.f21737d = 0L;
        this.f21738e = 0;
        this.f21739f = 0;
        if (j10 != 0) {
            InterfaceC5586z interfaceC5586z = this.f21747n;
            if (interfaceC5586z instanceof C5562d) {
                this.f21744k = ((C5562d) interfaceC5586z).m22416c(j10);
                return;
            }
        }
        this.f21744k = 0L;
    }

    /* renamed from: d */
    public final void m23266d() {
        C4014a.m15202h(this.f21746m);
        C4041n0.m15463j(this.f21745l);
    }

    /* renamed from: f */
    public final InterfaceC5586z m23267f(long j10, boolean z10) {
        return new C5562d(j10, this.f21741h, m23263e(this.f21742i, 20000L), this.f21742i, z10);
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: g */
    public int mo169g(InterfaceC5572l interfaceC5572l, C5585y c5585y) {
        m23266d();
        if (interfaceC5572l.getPosition() == 0 && !m23275r(interfaceC5572l)) {
            throw C4499t2.m17594a("Could not find AMR header.", null);
        }
        m23272n();
        int m23276s = m23276s(interfaceC5572l);
        m23273o(interfaceC5572l.mo3029b(), m23276s);
        return m23276s;
    }

    @Override // p333x3.InterfaceC5571k
    /* renamed from: h */
    public boolean mo170h(InterfaceC5572l interfaceC5572l) {
        return m23275r(interfaceC5572l);
    }

    /* renamed from: i */
    public final int m23268i(int i10) {
        if (m23270k(i10)) {
            return this.f21736c ? f21730r[i10] : f21729q[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f21736c ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw C4499t2.m17594a(sb2.toString(), null);
    }

    /* renamed from: j */
    public final boolean m23269j(int i10) {
        return !this.f21736c && (i10 < 12 || i10 > 14);
    }

    /* renamed from: k */
    public final boolean m23270k(int i10) {
        return i10 >= 0 && i10 <= 15 && (m23271l(i10) || m23269j(i10));
    }

    /* renamed from: l */
    public final boolean m23271l(int i10) {
        return this.f21736c && (i10 < 10 || i10 > 13);
    }

    /* renamed from: n */
    public final void m23272n() {
        if (this.f21748o) {
            return;
        }
        this.f21748o = true;
        boolean z10 = this.f21736c;
        this.f21746m.mo4852b(new C4463m1.b().m17474g0(z10 ? "audio/amr-wb" : "audio/3gpp").m17466Y(f21733u).m17451J(1).m17475h0(z10 ? 16000 : 8000).m17448G());
    }

    /* renamed from: o */
    public final void m23273o(long j10, int i10) {
        InterfaceC5586z bVar;
        int i11;
        if (this.f21740g) {
            return;
        }
        int i12 = this.f21735b;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f21742i) == -1 || i11 == this.f21738e)) {
            bVar = new InterfaceC5586z.b(-9223372036854775807L);
        } else if (this.f21743j < 20 && i10 != -1) {
            return;
        } else {
            bVar = m23267f(j10, (i12 & 2) != 0);
        }
        this.f21747n = bVar;
        this.f21745l.mo3033j(bVar);
        this.f21740g = true;
    }

    /* renamed from: q */
    public final int m23274q(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22427l();
        interfaceC5572l.mo22430p(this.f21734a, 0, 1);
        byte b10 = this.f21734a[0];
        if ((b10 & 131) <= 0) {
            return m23268i((b10 >> 3) & 15);
        }
        throw C4499t2.m17594a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    /* renamed from: r */
    public final boolean m23275r(InterfaceC5572l interfaceC5572l) {
        int length;
        byte[] bArr = f21731s;
        if (m23265p(interfaceC5572l, bArr)) {
            this.f21736c = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f21732t;
            if (!m23265p(interfaceC5572l, bArr2)) {
                return false;
            }
            this.f21736c = true;
            length = bArr2.length;
        }
        interfaceC5572l.mo22428m(length);
        return true;
    }

    @Override // p333x3.InterfaceC5571k
    public void release() {
    }

    /* renamed from: s */
    public final int m23276s(InterfaceC5572l interfaceC5572l) {
        if (this.f21739f == 0) {
            try {
                int m23274q = m23274q(interfaceC5572l);
                this.f21738e = m23274q;
                this.f21739f = m23274q;
                if (this.f21742i == -1) {
                    this.f21741h = interfaceC5572l.getPosition();
                    this.f21742i = this.f21738e;
                }
                if (this.f21742i == this.f21738e) {
                    this.f21743j++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int m22407c = this.f21746m.m22407c(interfaceC5572l, this.f21739f, true);
        if (m22407c == -1) {
            return -1;
        }
        int i10 = this.f21739f - m22407c;
        this.f21739f = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f21746m.mo4851a(this.f21744k + this.f21737d, 1, this.f21738e, 0, null);
        this.f21737d += 20000;
        return 0;
    }
}
