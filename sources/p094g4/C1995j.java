package p094g4;

import java.util.ArrayList;
import java.util.Arrays;
import p094g4.AbstractC1994i;
import p126i7.AbstractC2651u;
import p222p5.C4014a;
import p222p5.C4015a0;
import p264s3.C4463m1;
import p264s3.C4499t2;
import p333x3.C5565e0;

/* renamed from: g4.j */
/* loaded from: classes.dex */
public final class C1995j extends AbstractC1994i {

    /* renamed from: n */
    public a f7959n;

    /* renamed from: o */
    public int f7960o;

    /* renamed from: p */
    public boolean f7961p;

    /* renamed from: q */
    public C5565e0.d f7962q;

    /* renamed from: r */
    public C5565e0.b f7963r;

    /* renamed from: g4.j$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C5565e0.d f7964a;

        /* renamed from: b */
        public final C5565e0.b f7965b;

        /* renamed from: c */
        public final byte[] f7966c;

        /* renamed from: d */
        public final C5565e0.c[] f7967d;

        /* renamed from: e */
        public final int f7968e;

        public a(C5565e0.d dVar, C5565e0.b bVar, byte[] bArr, C5565e0.c[] cVarArr, int i10) {
            this.f7964a = dVar;
            this.f7965b = bVar;
            this.f7966c = bArr;
            this.f7967d = cVarArr;
            this.f7968e = i10;
        }
    }

    /* renamed from: n */
    public static void m8059n(C4015a0 c4015a0, long j10) {
        if (c4015a0.m15227b() < c4015a0.m15232g() + 4) {
            c4015a0.m15220Q(Arrays.copyOf(c4015a0.m15230e(), c4015a0.m15232g() + 4));
        } else {
            c4015a0.m15222S(c4015a0.m15232g() + 4);
        }
        byte[] m15230e = c4015a0.m15230e();
        m15230e[c4015a0.m15232g() - 4] = (byte) (j10 & 255);
        m15230e[c4015a0.m15232g() - 3] = (byte) ((j10 >>> 8) & 255);
        m15230e[c4015a0.m15232g() - 2] = (byte) ((j10 >>> 16) & 255);
        m15230e[c4015a0.m15232g() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    /* renamed from: o */
    public static int m8060o(byte b10, a aVar) {
        return !aVar.f7967d[m8061p(b10, aVar.f7968e, 1)].f20896a ? aVar.f7964a.f20906g : aVar.f7964a.f20907h;
    }

    /* renamed from: p */
    public static int m8061p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    /* renamed from: r */
    public static boolean m8062r(C4015a0 c4015a0) {
        try {
            return C5565e0.m22450m(1, c4015a0, true);
        } catch (C4499t2 unused) {
            return false;
        }
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: e */
    public void mo8053e(long j10) {
        super.mo8053e(j10);
        this.f7961p = j10 != 0;
        C5565e0.d dVar = this.f7962q;
        this.f7960o = dVar != null ? dVar.f20906g : 0;
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: f */
    public long mo8028f(C4015a0 c4015a0) {
        if ((c4015a0.m15230e()[0] & 1) == 1) {
            return -1L;
        }
        int m8060o = m8060o(c4015a0.m15230e()[0], (a) C4014a.m15202h(this.f7959n));
        long j10 = this.f7961p ? (this.f7960o + m8060o) / 4 : 0;
        m8059n(c4015a0, j10);
        this.f7961p = true;
        this.f7960o = m8060o;
        return j10;
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: h */
    public boolean mo8029h(C4015a0 c4015a0, long j10, AbstractC1994i.b bVar) {
        if (this.f7959n != null) {
            C4014a.m15199e(bVar.f7957a);
            return false;
        }
        a m8063q = m8063q(c4015a0);
        this.f7959n = m8063q;
        if (m8063q == null) {
            return true;
        }
        C5565e0.d dVar = m8063q.f7964a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f20909j);
        arrayList.add(m8063q.f7966c);
        bVar.f7957a = new C4463m1.b().m17474g0("audio/vorbis").m17450I(dVar.f20904e).m17469b0(dVar.f20903d).m17451J(dVar.f20901b).m17475h0(dVar.f20902c).m17463V(arrayList).m17467Z(C5565e0.m22440c(AbstractC2651u.m10769q(m8063q.f7965b.f20894b))).m17448G();
        return true;
    }

    @Override // p094g4.AbstractC1994i
    /* renamed from: l */
    public void mo8030l(boolean z10) {
        super.mo8030l(z10);
        if (z10) {
            this.f7959n = null;
            this.f7962q = null;
            this.f7963r = null;
        }
        this.f7960o = 0;
        this.f7961p = false;
    }

    /* renamed from: q */
    public a m8063q(C4015a0 c4015a0) {
        C5565e0.d dVar = this.f7962q;
        if (dVar == null) {
            this.f7962q = C5565e0.m22448k(c4015a0);
            return null;
        }
        C5565e0.b bVar = this.f7963r;
        if (bVar == null) {
            this.f7963r = C5565e0.m22446i(c4015a0);
            return null;
        }
        byte[] bArr = new byte[c4015a0.m15232g()];
        System.arraycopy(c4015a0.m15230e(), 0, bArr, 0, c4015a0.m15232g());
        return new a(dVar, bVar, bArr, C5565e0.m22449l(c4015a0, dVar.f20901b), C5565e0.m22438a(r4.length - 1));
    }
}
