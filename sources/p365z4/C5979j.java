package p365z4;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p007a5.C0053g;
import p109h7.C2420c;
import p126i7.AbstractC2651u;
import p152k4.C3348a;
import p206o5.C3916m;
import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p221p4.C4007h;
import p221p4.C4011l;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4037l0;
import p264s3.C4463m1;
import p275t3.C4674s1;
import p317w3.C5247m;
import p318w4.AbstractC5274n;
import p333x3.C5564e;
import p333x3.InterfaceC5572l;
import p365z4.C5975f;

/* renamed from: z4.j */
/* loaded from: classes.dex */
public final class C5979j extends AbstractC5274n {

    /* renamed from: M */
    public static final AtomicInteger f22223M = new AtomicInteger();

    /* renamed from: A */
    public final boolean f22224A;

    /* renamed from: B */
    public final boolean f22225B;

    /* renamed from: C */
    public final C4674s1 f22226C;

    /* renamed from: D */
    public InterfaceC5980k f22227D;

    /* renamed from: E */
    public C5986q f22228E;

    /* renamed from: F */
    public int f22229F;

    /* renamed from: G */
    public boolean f22230G;

    /* renamed from: H */
    public volatile boolean f22231H;

    /* renamed from: I */
    public boolean f22232I;

    /* renamed from: J */
    public AbstractC2651u<Integer> f22233J;

    /* renamed from: K */
    public boolean f22234K;

    /* renamed from: L */
    public boolean f22235L;

    /* renamed from: k */
    public final int f22236k;

    /* renamed from: l */
    public final int f22237l;

    /* renamed from: m */
    public final Uri f22238m;

    /* renamed from: n */
    public final boolean f22239n;

    /* renamed from: o */
    public final int f22240o;

    /* renamed from: p */
    public final InterfaceC3910j f22241p;

    /* renamed from: q */
    public final C3918n f22242q;

    /* renamed from: r */
    public final InterfaceC5980k f22243r;

    /* renamed from: s */
    public final boolean f22244s;

    /* renamed from: t */
    public final boolean f22245t;

    /* renamed from: u */
    public final C4033j0 f22246u;

    /* renamed from: v */
    public final InterfaceC5977h f22247v;

    /* renamed from: w */
    public final List<C4463m1> f22248w;

    /* renamed from: x */
    public final C5247m f22249x;

    /* renamed from: y */
    public final C4007h f22250y;

    /* renamed from: z */
    public final C4015a0 f22251z;

    public C5979j(InterfaceC5977h interfaceC5977h, InterfaceC3910j interfaceC3910j, C3918n c3918n, C4463m1 c4463m1, boolean z10, InterfaceC3910j interfaceC3910j2, C3918n c3918n2, boolean z11, Uri uri, List<C4463m1> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, C4033j0 c4033j0, C5247m c5247m, InterfaceC5980k interfaceC5980k, C4007h c4007h, C4015a0 c4015a0, boolean z15, C4674s1 c4674s1) {
        super(interfaceC3910j, c3918n, c4463m1, i10, obj, j10, j11, j12);
        this.f22224A = z10;
        this.f22240o = i11;
        this.f22235L = z12;
        this.f22237l = i12;
        this.f22242q = c3918n2;
        this.f22241p = interfaceC3910j2;
        this.f22230G = c3918n2 != null;
        this.f22225B = z11;
        this.f22238m = uri;
        this.f22244s = z14;
        this.f22246u = c4033j0;
        this.f22245t = z13;
        this.f22247v = interfaceC5977h;
        this.f22248w = list;
        this.f22249x = c5247m;
        this.f22243r = interfaceC5980k;
        this.f22250y = c4007h;
        this.f22251z = c4015a0;
        this.f22239n = z15;
        this.f22226C = c4674s1;
        this.f22233J = AbstractC2651u.m10770u();
        this.f22236k = f22223M.getAndIncrement();
    }

    /* renamed from: i */
    public static InterfaceC3910j m23966i(InterfaceC3910j interfaceC3910j, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return interfaceC3910j;
        }
        C4014a.m15199e(bArr2);
        return new C5970a(interfaceC3910j, bArr, bArr2);
    }

    /* renamed from: j */
    public static C5979j m23967j(InterfaceC5977h interfaceC5977h, InterfaceC3910j interfaceC3910j, C4463m1 c4463m1, long j10, C0053g c0053g, C5975f.e eVar, Uri uri, List<C4463m1> list, int i10, Object obj, boolean z10, C5989t c5989t, C5979j c5979j, byte[] bArr, byte[] bArr2, boolean z11, C4674s1 c4674s1) {
        boolean z12;
        InterfaceC3910j interfaceC3910j2;
        C3918n c3918n;
        boolean z13;
        C4007h c4007h;
        C4015a0 c4015a0;
        InterfaceC5980k interfaceC5980k;
        C0053g.e eVar2 = eVar.f22215a;
        C3918n m14858a = new C3918n.b().m14866i(C4037l0.m15388e(c0053g.f190a, eVar2.f153h)).m14865h(eVar2.f161p).m14864g(eVar2.f162q).m14859b(eVar.f22218d ? 8 : 0).m14858a();
        boolean z14 = bArr != null;
        InterfaceC3910j m23966i = m23966i(interfaceC3910j, bArr, z14 ? m23968l((String) C4014a.m15199e(eVar2.f160o)) : null);
        C0053g.d dVar = eVar2.f154i;
        if (dVar != null) {
            boolean z15 = bArr2 != null;
            byte[] m23968l = z15 ? m23968l((String) C4014a.m15199e(dVar.f160o)) : null;
            z12 = z14;
            c3918n = new C3918n(C4037l0.m15388e(c0053g.f190a, dVar.f153h), dVar.f161p, dVar.f162q);
            interfaceC3910j2 = m23966i(interfaceC3910j, bArr2, m23968l);
            z13 = z15;
        } else {
            z12 = z14;
            interfaceC3910j2 = null;
            c3918n = null;
            z13 = false;
        }
        long j11 = j10 + eVar2.f157l;
        long j12 = j11 + eVar2.f155j;
        int i11 = c0053g.f133j + eVar2.f156k;
        if (c5979j != null) {
            C3918n c3918n2 = c5979j.f22242q;
            boolean z16 = c3918n == c3918n2 || (c3918n != null && c3918n2 != null && c3918n.f14071a.equals(c3918n2.f14071a) && c3918n.f14077g == c5979j.f22242q.f14077g);
            boolean z17 = uri.equals(c5979j.f22238m) && c5979j.f22232I;
            c4007h = c5979j.f22250y;
            c4015a0 = c5979j.f22251z;
            interfaceC5980k = (z16 && z17 && !c5979j.f22234K && c5979j.f22237l == i11) ? c5979j.f22227D : null;
        } else {
            c4007h = new C4007h();
            c4015a0 = new C4015a0(10);
            interfaceC5980k = null;
        }
        return new C5979j(interfaceC5977h, m23966i, m14858a, c4463m1, z12, interfaceC3910j2, c3918n, z13, uri, list, i10, obj, j11, j12, eVar.f22216b, eVar.f22217c, !eVar.f22218d, i11, eVar2.f163r, z10, c5989t.m24062a(i11), eVar2.f158m, interfaceC5980k, c4007h, c4015a0, z11, c4674s1);
    }

    /* renamed from: l */
    public static byte[] m23968l(String str) {
        if (C2420c.m9665e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* renamed from: p */
    public static boolean m23969p(C5975f.e eVar, C0053g c0053g) {
        C0053g.e eVar2 = eVar.f22215a;
        return eVar2 instanceof C0053g.b ? ((C0053g.b) eVar2).f146s || (eVar.f22217c == 0 && c0053g.f192c) : c0053g.f192c;
    }

    /* renamed from: w */
    public static boolean m23970w(C5979j c5979j, Uri uri, C0053g c0053g, C5975f.e eVar, long j10) {
        if (c5979j == null) {
            return false;
        }
        if (uri.equals(c5979j.f22238m) && c5979j.f22232I) {
            return false;
        }
        return !m23969p(eVar, c0053g) || j10 + eVar.f22215a.f157l < c5979j.f19973h;
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: b */
    public void mo14817b() {
        InterfaceC5980k interfaceC5980k;
        C4014a.m15199e(this.f22228E);
        if (this.f22227D == null && (interfaceC5980k = this.f22243r) != null && interfaceC5980k.mo23927e()) {
            this.f22227D = this.f22243r;
            this.f22230G = false;
        }
        m23977s();
        if (this.f22231H) {
            return;
        }
        if (!this.f22245t) {
            m23976r();
        }
        this.f22232I = !this.f22231H;
    }

    @Override // p206o5.C3901e0.e
    /* renamed from: c */
    public void mo14818c() {
        this.f22231H = true;
    }

    @Override // p318w4.AbstractC5274n
    /* renamed from: h */
    public boolean mo21353h() {
        return this.f22232I;
    }

    /* renamed from: k */
    public final void m23971k(InterfaceC3910j interfaceC3910j, C3918n c3918n, boolean z10, boolean z11) {
        C3918n m14856e;
        long position;
        long j10;
        if (z10) {
            r0 = this.f22229F != 0;
            m14856e = c3918n;
        } else {
            m14856e = c3918n.m14856e(this.f22229F);
        }
        try {
            C5564e m23979u = m23979u(interfaceC3910j, m14856e, z11);
            if (r0) {
                m23979u.mo22428m(this.f22229F);
            }
            do {
                try {
                    try {
                        if (this.f22231H) {
                            break;
                        }
                    } catch (EOFException e10) {
                        if ((this.f19969d.f16499l & 16384) == 0) {
                            throw e10;
                        }
                        this.f22227D.mo23925c();
                        position = m23979u.getPosition();
                        j10 = c3918n.f14077g;
                    }
                } catch (Throwable th) {
                    this.f22229F = (int) (m23979u.getPosition() - c3918n.f14077g);
                    throw th;
                }
            } while (this.f22227D.mo23923a(m23979u));
            position = m23979u.getPosition();
            j10 = c3918n.f14077g;
            this.f22229F = (int) (position - j10);
        } finally {
            C3916m.m14847a(interfaceC3910j);
        }
    }

    /* renamed from: m */
    public int m23972m(int i10) {
        C4014a.m15200f(!this.f22239n);
        if (i10 >= this.f22233J.size()) {
            return 0;
        }
        return this.f22233J.get(i10).intValue();
    }

    /* renamed from: n */
    public void m23973n(C5986q c5986q, AbstractC2651u<Integer> abstractC2651u) {
        this.f22228E = c5986q;
        this.f22233J = abstractC2651u;
    }

    /* renamed from: o */
    public void m23974o() {
        this.f22234K = true;
    }

    /* renamed from: q */
    public boolean m23975q() {
        return this.f22235L;
    }

    /* renamed from: r */
    public final void m23976r() {
        m23971k(this.f19974i, this.f19967b, this.f22224A, true);
    }

    /* renamed from: s */
    public final void m23977s() {
        if (this.f22230G) {
            C4014a.m15199e(this.f22241p);
            C4014a.m15199e(this.f22242q);
            m23971k(this.f22241p, this.f22242q, this.f22225B, false);
            this.f22229F = 0;
            this.f22230G = false;
        }
    }

    /* renamed from: t */
    public final long m23978t(InterfaceC5572l interfaceC5572l) {
        interfaceC5572l.mo22427l();
        try {
            this.f22251z.m15219P(10);
            interfaceC5572l.mo22430p(this.f22251z.m15230e(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f22251z.m15213J() != 4801587) {
            return -9223372036854775807L;
        }
        this.f22251z.m15224U(3);
        int m15209F = this.f22251z.m15209F();
        int i10 = m15209F + 10;
        if (i10 > this.f22251z.m15227b()) {
            byte[] m15230e = this.f22251z.m15230e();
            this.f22251z.m15219P(i10);
            System.arraycopy(m15230e, 0, this.f22251z.m15230e(), 0, 10);
        }
        interfaceC5572l.mo22430p(this.f22251z.m15230e(), 10, m15209F);
        C3348a m15180e = this.f22250y.m15180e(this.f22251z.m15230e(), m15209F);
        if (m15180e == null) {
            return -9223372036854775807L;
        }
        int m12414f = m15180e.m12414f();
        for (int i11 = 0; i11 < m12414f; i11++) {
            C3348a.b m12413e = m15180e.m12413e(i11);
            if (m12413e instanceof C4011l) {
                C4011l c4011l = (C4011l) m12413e;
                if ("com.apple.streaming.transportStreamTimestamp".equals(c4011l.f14437i)) {
                    System.arraycopy(c4011l.f14438j, 0, this.f22251z.m15230e(), 0, 8);
                    this.f22251z.m15223T(0);
                    this.f22251z.m15222S(8);
                    return this.f22251z.m15251z() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: u */
    public final C5564e m23979u(InterfaceC3910j interfaceC3910j, C3918n c3918n, boolean z10) {
        C5986q c5986q;
        long j10;
        long mo14770k = interfaceC3910j.mo14770k(c3918n);
        if (z10) {
            try {
                this.f22246u.m15368h(this.f22244s, this.f19972g);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        C5564e c5564e = new C5564e(interfaceC3910j, c3918n.f14077g, mo14770k);
        if (this.f22227D == null) {
            long m23978t = m23978t(c5564e);
            c5564e.mo22427l();
            InterfaceC5980k interfaceC5980k = this.f22243r;
            InterfaceC5980k mo23928f = interfaceC5980k != null ? interfaceC5980k.mo23928f() : this.f22247v.mo23935a(c3918n.f14071a, this.f19969d, this.f22248w, this.f22246u, interfaceC3910j.mo14829j(), c5564e, this.f22226C);
            this.f22227D = mo23928f;
            if (mo23928f.mo23926d()) {
                c5986q = this.f22228E;
                j10 = m23978t != -9223372036854775807L ? this.f22246u.m15363b(m23978t) : this.f19972g;
            } else {
                c5986q = this.f22228E;
                j10 = 0;
            }
            c5986q.m24042m0(j10);
            this.f22228E.m24026Y();
            this.f22227D.mo23924b(this.f22228E);
        }
        this.f22228E.m24038j0(this.f22249x);
        return c5564e;
    }

    /* renamed from: v */
    public void m23980v() {
        this.f22235L = true;
    }
}
