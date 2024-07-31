package p364z3;

import java.util.Arrays;
import p222p5.C4014a;
import p222p5.C4041n0;
import p333x3.C5557a0;
import p333x3.InterfaceC5559b0;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5586z;

/* renamed from: z3.e */
/* loaded from: classes.dex */
public final class C5966e {

    /* renamed from: a */
    public final InterfaceC5559b0 f22158a;

    /* renamed from: b */
    public final int f22159b;

    /* renamed from: c */
    public final int f22160c;

    /* renamed from: d */
    public final long f22161d;

    /* renamed from: e */
    public final int f22162e;

    /* renamed from: f */
    public int f22163f;

    /* renamed from: g */
    public int f22164g;

    /* renamed from: h */
    public int f22165h;

    /* renamed from: i */
    public int f22166i;

    /* renamed from: j */
    public int f22167j;

    /* renamed from: k */
    public long[] f22168k;

    /* renamed from: l */
    public int[] f22169l;

    public C5966e(int i10, int i11, long j10, int i12, InterfaceC5559b0 interfaceC5559b0) {
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        C4014a.m15195a(z10);
        this.f22161d = j10;
        this.f22162e = i12;
        this.f22158a = interfaceC5559b0;
        this.f22159b = m23898d(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f22160c = i11 == 2 ? m23898d(i10, 1650720768) : -1;
        this.f22168k = new long[512];
        this.f22169l = new int[512];
    }

    /* renamed from: d */
    public static int m23898d(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    /* renamed from: a */
    public void m23899a() {
        this.f22165h++;
    }

    /* renamed from: b */
    public void m23900b(long j10) {
        if (this.f22167j == this.f22169l.length) {
            long[] jArr = this.f22168k;
            this.f22168k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f22169l;
            this.f22169l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f22168k;
        int i10 = this.f22167j;
        jArr2[i10] = j10;
        this.f22169l[i10] = this.f22166i;
        this.f22167j = i10 + 1;
    }

    /* renamed from: c */
    public void m23901c() {
        this.f22168k = Arrays.copyOf(this.f22168k, this.f22167j);
        this.f22169l = Arrays.copyOf(this.f22169l, this.f22167j);
    }

    /* renamed from: e */
    public final long m23902e(int i10) {
        return (this.f22161d * i10) / this.f22162e;
    }

    /* renamed from: f */
    public long m23903f() {
        return m23902e(this.f22165h);
    }

    /* renamed from: g */
    public long m23904g() {
        return m23902e(1);
    }

    /* renamed from: h */
    public final C5557a0 m23905h(int i10) {
        return new C5557a0(this.f22169l[i10] * m23904g(), this.f22168k[i10]);
    }

    /* renamed from: i */
    public InterfaceC5586z.a m23906i(long j10) {
        int m23904g = (int) (j10 / m23904g());
        int m15459h = C4041n0.m15459h(this.f22169l, m23904g, true, true);
        if (this.f22169l[m15459h] == m23904g) {
            return new InterfaceC5586z.a(m23905h(m15459h));
        }
        C5557a0 m23905h = m23905h(m15459h);
        int i10 = m15459h + 1;
        return i10 < this.f22168k.length ? new InterfaceC5586z.a(m23905h, m23905h(i10)) : new InterfaceC5586z.a(m23905h);
    }

    /* renamed from: j */
    public boolean m23907j(int i10) {
        return this.f22159b == i10 || this.f22160c == i10;
    }

    /* renamed from: k */
    public void m23908k() {
        this.f22166i++;
    }

    /* renamed from: l */
    public boolean m23909l() {
        return Arrays.binarySearch(this.f22169l, this.f22165h) >= 0;
    }

    /* renamed from: m */
    public boolean m23910m(InterfaceC5572l interfaceC5572l) {
        int i10 = this.f22164g;
        int m22407c = i10 - this.f22158a.m22407c(interfaceC5572l, i10, false);
        this.f22164g = m22407c;
        boolean z10 = m22407c == 0;
        if (z10) {
            if (this.f22163f > 0) {
                this.f22158a.mo4851a(m23903f(), m23909l() ? 1 : 0, this.f22163f, 0, null);
            }
            m23899a();
        }
        return z10;
    }

    /* renamed from: n */
    public void m23911n(int i10) {
        this.f22163f = i10;
        this.f22164g = i10;
    }

    /* renamed from: o */
    public void m23912o(long j10) {
        int i10;
        if (this.f22167j == 0) {
            i10 = 0;
        } else {
            i10 = this.f22169l[C4041n0.m15461i(this.f22168k, j10, true, true)];
        }
        this.f22165h = i10;
    }
}
