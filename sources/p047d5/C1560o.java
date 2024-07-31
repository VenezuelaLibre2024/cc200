package p047d5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p126i7.AbstractC2651u;
import p222p5.C4014a;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p264s3.AbstractC4426f;
import p264s3.C4463m1;
import p264s3.C4468n1;
import p264s3.InterfaceC4450j3;

/* renamed from: d5.o */
/* loaded from: classes.dex */
public final class C1560o extends AbstractC4426f implements Handler.Callback {

    /* renamed from: A */
    public boolean f5836A;

    /* renamed from: B */
    public int f5837B;

    /* renamed from: C */
    public C4463m1 f5838C;

    /* renamed from: D */
    public InterfaceC1554i f5839D;

    /* renamed from: E */
    public C1557l f5840E;

    /* renamed from: F */
    public AbstractC1558m f5841F;

    /* renamed from: G */
    public AbstractC1558m f5842G;

    /* renamed from: H */
    public int f5843H;

    /* renamed from: I */
    public long f5844I;

    /* renamed from: J */
    public long f5845J;

    /* renamed from: K */
    public long f5846K;

    /* renamed from: u */
    public final Handler f5847u;

    /* renamed from: v */
    public final InterfaceC1559n f5848v;

    /* renamed from: w */
    public final InterfaceC1556k f5849w;

    /* renamed from: x */
    public final C4468n1 f5850x;

    /* renamed from: y */
    public boolean f5851y;

    /* renamed from: z */
    public boolean f5852z;

    public C1560o(InterfaceC1559n interfaceC1559n, Looper looper) {
        this(interfaceC1559n, looper, InterfaceC1556k.f5832a);
    }

    public C1560o(InterfaceC1559n interfaceC1559n, Looper looper, InterfaceC1556k interfaceC1556k) {
        super(3);
        this.f5848v = (InterfaceC1559n) C4014a.m15199e(interfaceC1559n);
        this.f5847u = looper == null ? null : C4041n0.m15487v(looper, this);
        this.f5849w = interfaceC1556k;
        this.f5850x = new C4468n1();
        this.f5844I = -9223372036854775807L;
        this.f5845J = -9223372036854775807L;
        this.f5846K = -9223372036854775807L;
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: P */
    public void mo6368P() {
        this.f5838C = null;
        this.f5844I = -9223372036854775807L;
        m6371Z();
        this.f5845J = -9223372036854775807L;
        this.f5846K = -9223372036854775807L;
        m6383h0();
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: R */
    public void mo6369R(long j10, boolean z10) {
        this.f5846K = j10;
        m6371Z();
        this.f5851y = false;
        this.f5852z = false;
        this.f5844I = -9223372036854775807L;
        if (this.f5837B != 0) {
            m6384i0();
        } else {
            m6382g0();
            ((InterfaceC1554i) C4014a.m15199e(this.f5839D)).flush();
        }
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: V */
    public void mo6370V(C4463m1[] c4463m1Arr, long j10, long j11) {
        this.f5845J = j11;
        this.f5838C = c4463m1Arr[0];
        if (this.f5839D != null) {
            this.f5837B = 1;
        } else {
            m6380e0();
        }
    }

    /* renamed from: Z */
    public final void m6371Z() {
        m6386k0(new C1550e(AbstractC2651u.m10770u(), m6377c0(this.f5846K)));
    }

    @Override // p264s3.InterfaceC4450j3
    /* renamed from: a */
    public int mo6372a(C4463m1 c4463m1) {
        if (this.f5849w.mo6364a(c4463m1)) {
            return InterfaceC4450j3.m17374v(c4463m1.f16493N == 0 ? 4 : 2);
        }
        return InterfaceC4450j3.m17374v(C4050v.m15561r(c4463m1.f16506s) ? 1 : 0);
    }

    /* renamed from: a0 */
    public final long m6373a0(long j10) {
        int mo6350b = this.f5841F.mo6350b(j10);
        if (mo6350b == 0 || this.f5841F.mo6353h() == 0) {
            return this.f5841F.f19292i;
        }
        if (mo6350b != -1) {
            return this.f5841F.mo6351c(mo6350b - 1);
        }
        return this.f5841F.mo6351c(r2.mo6353h() - 1);
    }

    @Override // p264s3.InterfaceC4445i3, p264s3.InterfaceC4450j3
    /* renamed from: b */
    public String mo6374b() {
        return "TextRenderer";
    }

    /* renamed from: b0 */
    public final long m6375b0() {
        if (this.f5843H == -1) {
            return Long.MAX_VALUE;
        }
        C4014a.m15199e(this.f5841F);
        if (this.f5843H >= this.f5841F.mo6353h()) {
            return Long.MAX_VALUE;
        }
        return this.f5841F.mo6351c(this.f5843H);
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: c */
    public boolean mo6376c() {
        return this.f5852z;
    }

    /* renamed from: c0 */
    public final long m6377c0(long j10) {
        C4014a.m15200f(j10 != -9223372036854775807L);
        C4014a.m15200f(this.f5845J != -9223372036854775807L);
        return j10 - this.f5845J;
    }

    /* renamed from: d0 */
    public final void m6378d0(C1555j c1555j) {
        C4046r.m15524d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f5838C, c1555j);
        m6371Z();
        m6384i0();
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: e */
    public boolean mo6379e() {
        return true;
    }

    /* renamed from: e0 */
    public final void m6380e0() {
        this.f5836A = true;
        this.f5839D = this.f5849w.mo6365b((C4463m1) C4014a.m15199e(this.f5838C));
    }

    /* renamed from: f0 */
    public final void m6381f0(C1550e c1550e) {
        this.f5848v.onCues(c1550e.f5820h);
        this.f5848v.onCues(c1550e);
    }

    /* renamed from: g0 */
    public final void m6382g0() {
        this.f5840E = null;
        this.f5843H = -1;
        AbstractC1558m abstractC1558m = this.f5841F;
        if (abstractC1558m != null) {
            abstractC1558m.mo6349v();
            this.f5841F = null;
        }
        AbstractC1558m abstractC1558m2 = this.f5842G;
        if (abstractC1558m2 != null) {
            abstractC1558m2.mo6349v();
            this.f5842G = null;
        }
    }

    /* renamed from: h0 */
    public final void m6383h0() {
        m6382g0();
        ((InterfaceC1554i) C4014a.m15199e(this.f5839D)).release();
        this.f5839D = null;
        this.f5837B = 0;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        m6381f0((C1550e) message.obj);
        return true;
    }

    /* renamed from: i0 */
    public final void m6384i0() {
        m6383h0();
        m6380e0();
    }

    /* renamed from: j0 */
    public void m6385j0(long j10) {
        C4014a.m15200f(mo17199D());
        this.f5844I = j10;
    }

    /* renamed from: k0 */
    public final void m6386k0(C1550e c1550e) {
        Handler handler = this.f5847u;
        if (handler != null) {
            handler.obtainMessage(0, c1550e).sendToTarget();
        } else {
            m6381f0(c1550e);
        }
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: x */
    public void mo6387x(long j10, long j11) {
        boolean z10;
        this.f5846K = j10;
        if (mo17199D()) {
            long j12 = this.f5844I;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                m6382g0();
                this.f5852z = true;
            }
        }
        if (this.f5852z) {
            return;
        }
        if (this.f5842G == null) {
            ((InterfaceC1554i) C4014a.m15199e(this.f5839D)).mo6341a(j10);
            try {
                this.f5842G = ((InterfaceC1554i) C4014a.m15199e(this.f5839D)).mo6342b();
            } catch (C1555j e10) {
                m6378d0(e10);
                return;
            }
        }
        if (getState() != 2) {
            return;
        }
        if (this.f5841F != null) {
            long m6375b0 = m6375b0();
            z10 = false;
            while (m6375b0 <= j10) {
                this.f5843H++;
                m6375b0 = m6375b0();
                z10 = true;
            }
        } else {
            z10 = false;
        }
        AbstractC1558m abstractC1558m = this.f5842G;
        if (abstractC1558m != null) {
            if (abstractC1558m.m20748q()) {
                if (!z10 && m6375b0() == Long.MAX_VALUE) {
                    if (this.f5837B == 2) {
                        m6384i0();
                    } else {
                        m6382g0();
                        this.f5852z = true;
                    }
                }
            } else if (abstractC1558m.f19292i <= j10) {
                AbstractC1558m abstractC1558m2 = this.f5841F;
                if (abstractC1558m2 != null) {
                    abstractC1558m2.mo6349v();
                }
                this.f5843H = abstractC1558m.mo6350b(j10);
                this.f5841F = abstractC1558m;
                this.f5842G = null;
                z10 = true;
            }
        }
        if (z10) {
            C4014a.m15199e(this.f5841F);
            m6386k0(new C1550e(this.f5841F.mo6352f(j10), m6377c0(m6373a0(j10))));
        }
        if (this.f5837B == 2) {
            return;
        }
        while (!this.f5851y) {
            try {
                C1557l c1557l = this.f5840E;
                if (c1557l == null) {
                    c1557l = ((InterfaceC1554i) C4014a.m15199e(this.f5839D)).mo6343c();
                    if (c1557l == null) {
                        return;
                    } else {
                        this.f5840E = c1557l;
                    }
                }
                if (this.f5837B == 1) {
                    c1557l.m20752u(4);
                    ((InterfaceC1554i) C4014a.m15199e(this.f5839D)).mo6344d(c1557l);
                    this.f5840E = null;
                    this.f5837B = 2;
                    return;
                }
                int m17210W = m17210W(this.f5850x, c1557l, 0);
                if (m17210W == -4) {
                    if (c1557l.m20748q()) {
                        this.f5851y = true;
                        this.f5836A = false;
                    } else {
                        C4463m1 c4463m1 = this.f5850x.f16559b;
                        if (c4463m1 == null) {
                            return;
                        }
                        c1557l.f5833p = c4463m1.f16510w;
                        c1557l.m20765x();
                        this.f5836A &= !c1557l.m20750s();
                    }
                    if (!this.f5836A) {
                        ((InterfaceC1554i) C4014a.m15199e(this.f5839D)).mo6344d(c1557l);
                        this.f5840E = null;
                    }
                } else if (m17210W == -3) {
                    return;
                }
            } catch (C1555j e11) {
                m6378d0(e11);
                return;
            }
        }
    }
}
