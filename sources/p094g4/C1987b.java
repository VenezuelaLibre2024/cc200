package p094g4;

import java.util.Arrays;
import p094g4.AbstractC1994i;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p333x3.C5577q;
import p333x3.C5578r;
import p333x3.C5579s;
import p333x3.C5580t;
import p333x3.InterfaceC5572l;
import p333x3.InterfaceC5586z;

/* renamed from: g4.b */
/* loaded from: classes.dex */
public final class C1987b extends AbstractC1994i {

    /* renamed from: n */
    public C5580t f7914n;

    /* renamed from: o */
    public a f7915o;

    /* renamed from: g4.b$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC1992g {

        /* renamed from: a */
        public C5580t f7916a;

        /* renamed from: b */
        public C5580t.a f7917b;

        /* renamed from: c */
        public long f7918c = -1;

        /* renamed from: d */
        public long f7919d = -1;

        public a(C5580t c5580t, C5580t.a aVar) {
            this.f7916a = c5580t;
            this.f7917b = aVar;
        }

        @Override // p094g4.InterfaceC1992g
        /* renamed from: a */
        public long mo8019a(InterfaceC5572l interfaceC5572l) {
            long j10 = this.f7919d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f7919d = -1L;
            return j11;
        }

        @Override // p094g4.InterfaceC1992g
        /* renamed from: b */
        public InterfaceC5586z mo8020b() {
            C4014a.m15200f(this.f7918c != -1);
            return new C5579s(this.f7916a, this.f7918c);
        }

        @Override // p094g4.InterfaceC1992g
        /* renamed from: c */
        public void mo8021c(long j10) {
            long[] jArr = this.f7917b.f20951a;
            this.f7919d = jArr[C4041n0.m15461i(jArr, j10, true, true)];
        }

        /* renamed from: d */
        public void m8032d(long j10) {
            this.f7918c = j10;
        }
    }

    /* renamed from: o */
    public static boolean m8026o(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* renamed from: p */
    public static boolean m8027p(C4015a0 c4015a0) {
        return c4015a0.m15226a() >= 5 && c4015a0.m15210G() == 127 && c4015a0.m15212I() == 1179402563;
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: f */
    public long mo8028f(C4015a0 c4015a0) {
        if (m8026o(c4015a0.m15230e())) {
            return m8031n(c4015a0);
        }
        return -1L;
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: h */
    public boolean mo8029h(C4015a0 c4015a0, long j10, AbstractC1994i.b bVar) {
        byte[] m15230e = c4015a0.m15230e();
        C5580t c5580t = this.f7914n;
        if (c5580t == null) {
            C5580t c5580t2 = new C5580t(m15230e, 17);
            this.f7914n = c5580t2;
            bVar.f7957a = c5580t2.m22495g(Arrays.copyOfRange(m15230e, 9, c4015a0.m15232g()), null);
            return true;
        }
        if ((m15230e[0] & Byte.MAX_VALUE) == 3) {
            C5580t.a m22482f = C5578r.m22482f(c4015a0);
            C5580t m22491b = c5580t.m22491b(m22482f);
            this.f7914n = m22491b;
            this.f7915o = new a(m22491b, m22482f);
            return true;
        }
        if (!m8026o(m15230e)) {
            return true;
        }
        a aVar = this.f7915o;
        if (aVar != null) {
            aVar.m8032d(j10);
            bVar.f7958b = this.f7915o;
        }
        C4014a.m15199e(bVar.f7957a);
        return false;
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: l */
    public void mo8030l(boolean z10) {
        super.mo8030l(z10);
        if (z10) {
            this.f7914n = null;
            this.f7915o = null;
        }
    }

    /* renamed from: n */
    public final int m8031n(C4015a0 c4015a0) {
        int i10 = (c4015a0.m15230e()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            c4015a0.m15224U(4);
            c4015a0.m15217N();
        }
        int m22476j = C5577q.m22476j(c4015a0, i10);
        c4015a0.m15223T(0);
        return m22476j;
    }
}
