package p264s3;

import p193n5.AbstractC3734b0;
import p193n5.C3736c0;
import p193n5.InterfaceC3752s;
import p206o5.InterfaceC3894b;
import p222p5.C4014a;
import p222p5.C4046r;
import p290u4.C4850d;
import p290u4.C4864k;
import p290u4.C4885u0;
import p290u4.InterfaceC4869m0;
import p290u4.InterfaceC4878r;
import p290u4.InterfaceC4882t;

/* renamed from: s3.a2 */
/* loaded from: classes.dex */
public final class C4402a2 {

    /* renamed from: a */
    public final InterfaceC4878r f16134a;

    /* renamed from: b */
    public final Object f16135b;

    /* renamed from: c */
    public final InterfaceC4869m0[] f16136c;

    /* renamed from: d */
    public boolean f16137d;

    /* renamed from: e */
    public boolean f16138e;

    /* renamed from: f */
    public C4408b2 f16139f;

    /* renamed from: g */
    public boolean f16140g;

    /* renamed from: h */
    public final boolean[] f16141h;

    /* renamed from: i */
    public final InterfaceC4450j3[] f16142i;

    /* renamed from: j */
    public final AbstractC3734b0 f16143j;

    /* renamed from: k */
    public final C4494s2 f16144k;

    /* renamed from: l */
    public C4402a2 f16145l;

    /* renamed from: m */
    public C4885u0 f16146m;

    /* renamed from: n */
    public C3736c0 f16147n;

    /* renamed from: o */
    public long f16148o;

    public C4402a2(InterfaceC4450j3[] interfaceC4450j3Arr, long j10, AbstractC3734b0 abstractC3734b0, InterfaceC3894b interfaceC3894b, C4494s2 c4494s2, C4408b2 c4408b2, C3736c0 c3736c0) {
        this.f16142i = interfaceC4450j3Arr;
        this.f16148o = j10;
        this.f16143j = abstractC3734b0;
        this.f16144k = c4494s2;
        InterfaceC4882t.b bVar = c4408b2.f16168a;
        this.f16135b = bVar.f18457a;
        this.f16139f = c4408b2;
        this.f16146m = C4885u0.f18475k;
        this.f16147n = c3736c0;
        this.f16136c = new InterfaceC4869m0[interfaceC4450j3Arr.length];
        this.f16141h = new boolean[interfaceC4450j3Arr.length];
        this.f16134a = m17033e(bVar, c4494s2, interfaceC3894b, c4408b2.f16169b, c4408b2.f16171d);
    }

    /* renamed from: e */
    public static InterfaceC4878r m17033e(InterfaceC4882t.b bVar, C4494s2 c4494s2, InterfaceC3894b interfaceC3894b, long j10, long j11) {
        InterfaceC4878r m17541h = c4494s2.m17541h(bVar, interfaceC3894b, j10);
        return j11 != -9223372036854775807L ? new C4850d(m17541h, true, 0L, j11) : m17541h;
    }

    /* renamed from: u */
    public static void m17034u(C4494s2 c4494s2, InterfaceC4878r interfaceC4878r) {
        try {
            if (interfaceC4878r instanceof C4850d) {
                interfaceC4878r = ((C4850d) interfaceC4878r).f18223h;
            }
            c4494s2.m17553z(interfaceC4878r);
        } catch (RuntimeException e10) {
            C4046r.m15524d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    /* renamed from: A */
    public void m17035A() {
        InterfaceC4878r interfaceC4878r = this.f16134a;
        if (interfaceC4878r instanceof C4850d) {
            long j10 = this.f16139f.f16171d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C4850d) interfaceC4878r).m19249u(0L, j10);
        }
    }

    /* renamed from: a */
    public long m17036a(C3736c0 c3736c0, long j10, boolean z10) {
        return m17037b(c3736c0, j10, z10, new boolean[this.f16142i.length]);
    }

    /* renamed from: b */
    public long m17037b(C3736c0 c3736c0, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c3736c0.f13324a) {
                break;
            }
            boolean[] zArr2 = this.f16141h;
            if (z10 || !c3736c0.m14095b(this.f16147n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        m17041g(this.f16136c);
        m17040f();
        this.f16147n = c3736c0;
        m17042h();
        long mo4796q = this.f16134a.mo4796q(c3736c0.f13326c, this.f16141h, this.f16136c, zArr, j10);
        m17038c(this.f16136c);
        this.f16138e = false;
        int i11 = 0;
        while (true) {
            InterfaceC4869m0[] interfaceC4869m0Arr = this.f16136c;
            if (i11 >= interfaceC4869m0Arr.length) {
                return mo4796q;
            }
            if (interfaceC4869m0Arr[i11] != null) {
                C4014a.m15200f(c3736c0.m14096c(i11));
                if (this.f16142i[i11].mo17215i() != -2) {
                    this.f16138e = true;
                }
            } else {
                C4014a.m15200f(c3736c0.f13326c[i11] == null);
            }
            i11++;
        }
    }

    /* renamed from: c */
    public final void m17038c(InterfaceC4869m0[] interfaceC4869m0Arr) {
        int i10 = 0;
        while (true) {
            InterfaceC4450j3[] interfaceC4450j3Arr = this.f16142i;
            if (i10 >= interfaceC4450j3Arr.length) {
                return;
            }
            if (interfaceC4450j3Arr[i10].mo17215i() == -2 && this.f16147n.m14096c(i10)) {
                interfaceC4869m0Arr[i10] = new C4864k();
            }
            i10++;
        }
    }

    /* renamed from: d */
    public void m17039d(long j10) {
        C4014a.m15200f(m17052r());
        this.f16134a.mo4786c(m17058y(j10));
    }

    /* renamed from: f */
    public final void m17040f() {
        if (!m17052r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C3736c0 c3736c0 = this.f16147n;
            if (i10 >= c3736c0.f13324a) {
                return;
            }
            boolean m14096c = c3736c0.m14096c(i10);
            InterfaceC3752s interfaceC3752s = this.f16147n.f13326c[i10];
            if (m14096c && interfaceC3752s != null) {
                interfaceC3752s.mo14060f();
            }
            i10++;
        }
    }

    /* renamed from: g */
    public final void m17041g(InterfaceC4869m0[] interfaceC4869m0Arr) {
        int i10 = 0;
        while (true) {
            InterfaceC4450j3[] interfaceC4450j3Arr = this.f16142i;
            if (i10 >= interfaceC4450j3Arr.length) {
                return;
            }
            if (interfaceC4450j3Arr[i10].mo17215i() == -2) {
                interfaceC4869m0Arr[i10] = null;
            }
            i10++;
        }
    }

    /* renamed from: h */
    public final void m17042h() {
        if (!m17052r()) {
            return;
        }
        int i10 = 0;
        while (true) {
            C3736c0 c3736c0 = this.f16147n;
            if (i10 >= c3736c0.f13324a) {
                return;
            }
            boolean m14096c = c3736c0.m14096c(i10);
            InterfaceC3752s interfaceC3752s = this.f16147n.f13326c[i10];
            if (m14096c && interfaceC3752s != null) {
                interfaceC3752s.mo14063l();
            }
            i10++;
        }
    }

    /* renamed from: i */
    public long m17043i() {
        if (!this.f16137d) {
            return this.f16139f.f16169b;
        }
        long mo4789f = this.f16138e ? this.f16134a.mo4789f() : Long.MIN_VALUE;
        return mo4789f == Long.MIN_VALUE ? this.f16139f.f16172e : mo4789f;
    }

    /* renamed from: j */
    public C4402a2 m17044j() {
        return this.f16145l;
    }

    /* renamed from: k */
    public long m17045k() {
        if (this.f16137d) {
            return this.f16134a.mo4785b();
        }
        return 0L;
    }

    /* renamed from: l */
    public long m17046l() {
        return this.f16148o;
    }

    /* renamed from: m */
    public long m17047m() {
        return this.f16139f.f16169b + this.f16148o;
    }

    /* renamed from: n */
    public C4885u0 m17048n() {
        return this.f16146m;
    }

    /* renamed from: o */
    public C3736c0 m17049o() {
        return this.f16147n;
    }

    /* renamed from: p */
    public void m17050p(float f10, AbstractC4505u3 abstractC4505u3) {
        this.f16137d = true;
        this.f16146m = this.f16134a.mo4798s();
        C3736c0 m17055v = m17055v(f10, abstractC4505u3);
        C4408b2 c4408b2 = this.f16139f;
        long j10 = c4408b2.f16169b;
        long j11 = c4408b2.f16172e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long m17036a = m17036a(m17055v, j10, false);
        long j12 = this.f16148o;
        C4408b2 c4408b22 = this.f16139f;
        this.f16148o = j12 + (c4408b22.f16169b - m17036a);
        this.f16139f = c4408b22.m17071b(m17036a);
    }

    /* renamed from: q */
    public boolean m17051q() {
        return this.f16137d && (!this.f16138e || this.f16134a.mo4789f() == Long.MIN_VALUE);
    }

    /* renamed from: r */
    public final boolean m17052r() {
        return this.f16145l == null;
    }

    /* renamed from: s */
    public void m17053s(long j10) {
        C4014a.m15200f(m17052r());
        if (this.f16137d) {
            this.f16134a.mo4790g(m17058y(j10));
        }
    }

    /* renamed from: t */
    public void m17054t() {
        m17040f();
        m17034u(this.f16144k, this.f16134a);
    }

    /* renamed from: v */
    public C3736c0 m17055v(float f10, AbstractC4505u3 abstractC4505u3) {
        C3736c0 mo14080g = this.f16143j.mo14080g(this.f16142i, m17048n(), this.f16139f.f16168a, abstractC4505u3);
        for (InterfaceC3752s interfaceC3752s : mo14080g.f13326c) {
            if (interfaceC3752s != null) {
                interfaceC3752s.mo14066q(f10);
            }
        }
        return mo14080g;
    }

    /* renamed from: w */
    public void m17056w(C4402a2 c4402a2) {
        if (c4402a2 == this.f16145l) {
            return;
        }
        m17040f();
        this.f16145l = c4402a2;
        m17042h();
    }

    /* renamed from: x */
    public void m17057x(long j10) {
        this.f16148o = j10;
    }

    /* renamed from: y */
    public long m17058y(long j10) {
        return j10 - m17046l();
    }

    /* renamed from: z */
    public long m17059z(long j10) {
        return j10 + m17046l();
    }
}
