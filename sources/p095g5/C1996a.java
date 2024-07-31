package p095g5;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p047d5.AbstractC1552g;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p222p5.C4015a0;
import p222p5.C4041n0;

/* renamed from: g5.a */
/* loaded from: classes.dex */
public final class C1996a extends AbstractC1552g {

    /* renamed from: o */
    public final C4015a0 f7969o;

    /* renamed from: p */
    public final C4015a0 f7970p;

    /* renamed from: q */
    public final a f7971q;

    /* renamed from: r */
    public Inflater f7972r;

    /* renamed from: g5.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final C4015a0 f7973a = new C4015a0();

        /* renamed from: b */
        public final int[] f7974b = new int[256];

        /* renamed from: c */
        public boolean f7975c;

        /* renamed from: d */
        public int f7976d;

        /* renamed from: e */
        public int f7977e;

        /* renamed from: f */
        public int f7978f;

        /* renamed from: g */
        public int f7979g;

        /* renamed from: h */
        public int f7980h;

        /* renamed from: i */
        public int f7981i;

        /* renamed from: d */
        public C1547b m8069d() {
            int i10;
            if (this.f7976d == 0 || this.f7977e == 0 || this.f7980h == 0 || this.f7981i == 0 || this.f7973a.m15232g() == 0 || this.f7973a.m15231f() != this.f7973a.m15232g() || !this.f7975c) {
                return null;
            }
            this.f7973a.m15223T(0);
            int i11 = this.f7980h * this.f7981i;
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int m15210G = this.f7973a.m15210G();
                if (m15210G != 0) {
                    i10 = i12 + 1;
                    iArr[i12] = this.f7974b[m15210G];
                } else {
                    int m15210G2 = this.f7973a.m15210G();
                    if (m15210G2 != 0) {
                        i10 = ((m15210G2 & 64) == 0 ? m15210G2 & 63 : ((m15210G2 & 63) << 8) | this.f7973a.m15210G()) + i12;
                        Arrays.fill(iArr, i12, i10, (m15210G2 & 128) == 0 ? 0 : this.f7974b[this.f7973a.m15210G()]);
                    }
                }
                i12 = i10;
            }
            return new C1547b.b().m6323f(Bitmap.createBitmap(iArr, this.f7980h, this.f7981i, Bitmap.Config.ARGB_8888)).m6328k(this.f7978f / this.f7976d).m6329l(0).m6325h(this.f7979g / this.f7977e, 0).m6326i(0).m6331n(this.f7980h / this.f7976d).m6324g(this.f7981i / this.f7977e).m6318a();
        }

        /* renamed from: e */
        public final void m8070e(C4015a0 c4015a0, int i10) {
            int m15213J;
            if (i10 < 4) {
                return;
            }
            c4015a0.m15224U(3);
            int i11 = i10 - 4;
            if ((c4015a0.m15210G() & 128) != 0) {
                if (i11 < 7 || (m15213J = c4015a0.m15213J()) < 4) {
                    return;
                }
                this.f7980h = c4015a0.m15216M();
                this.f7981i = c4015a0.m15216M();
                this.f7973a.m15219P(m15213J - 4);
                i11 -= 7;
            }
            int m15231f = this.f7973a.m15231f();
            int m15232g = this.f7973a.m15232g();
            if (m15231f >= m15232g || i11 <= 0) {
                return;
            }
            int min = Math.min(i11, m15232g - m15231f);
            c4015a0.m15237l(this.f7973a.m15230e(), m15231f, min);
            this.f7973a.m15223T(m15231f + min);
        }

        /* renamed from: f */
        public final void m8071f(C4015a0 c4015a0, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f7976d = c4015a0.m15216M();
            this.f7977e = c4015a0.m15216M();
            c4015a0.m15224U(11);
            this.f7978f = c4015a0.m15216M();
            this.f7979g = c4015a0.m15216M();
        }

        /* renamed from: g */
        public final void m8072g(C4015a0 c4015a0, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            c4015a0.m15224U(2);
            Arrays.fill(this.f7974b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int m15210G = c4015a0.m15210G();
                int m15210G2 = c4015a0.m15210G();
                int m15210G3 = c4015a0.m15210G();
                int m15210G4 = c4015a0.m15210G();
                int m15210G5 = c4015a0.m15210G();
                double d10 = m15210G2;
                double d11 = m15210G3 - 128;
                int i13 = (int) ((1.402d * d11) + d10);
                int i14 = i12;
                double d12 = m15210G4 - 128;
                this.f7974b[m15210G] = C4041n0.m15477q((int) (d10 + (d12 * 1.772d)), 0, 255) | (C4041n0.m15477q((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (m15210G5 << 24) | (C4041n0.m15477q(i13, 0, 255) << 16);
                i12 = i14 + 1;
            }
            this.f7975c = true;
        }

        /* renamed from: h */
        public void m8073h() {
            this.f7976d = 0;
            this.f7977e = 0;
            this.f7978f = 0;
            this.f7979g = 0;
            this.f7980h = 0;
            this.f7981i = 0;
            this.f7973a.m15219P(0);
            this.f7975c = false;
        }
    }

    public C1996a() {
        super("PgsDecoder");
        this.f7969o = new C4015a0();
        this.f7970p = new C4015a0();
        this.f7971q = new a();
    }

    /* renamed from: C */
    public static C1547b m8064C(C4015a0 c4015a0, a aVar) {
        int m15232g = c4015a0.m15232g();
        int m15210G = c4015a0.m15210G();
        int m15216M = c4015a0.m15216M();
        int m15231f = c4015a0.m15231f() + m15216M;
        C1547b c1547b = null;
        if (m15231f > m15232g) {
            c4015a0.m15223T(m15232g);
            return null;
        }
        if (m15210G != 128) {
            switch (m15210G) {
                case 20:
                    aVar.m8072g(c4015a0, m15216M);
                    break;
                case 21:
                    aVar.m8070e(c4015a0, m15216M);
                    break;
                case 22:
                    aVar.m8071f(c4015a0, m15216M);
                    break;
            }
        } else {
            c1547b = aVar.m8069d();
            aVar.m8073h();
        }
        c4015a0.m15223T(m15231f);
        return c1547b;
    }

    /* renamed from: B */
    public final void m8065B(C4015a0 c4015a0) {
        if (c4015a0.m15226a() <= 0 || c4015a0.m15235j() != 120) {
            return;
        }
        if (this.f7972r == null) {
            this.f7972r = new Inflater();
        }
        if (C4041n0.m15476p0(c4015a0, this.f7970p, this.f7972r)) {
            c4015a0.m15221R(this.f7970p.m15230e(), this.f7970p.m15232g());
        }
    }

    @Override // p047d5.AbstractC1552g
    /* renamed from: z */
    public InterfaceC1553h mo6363z(byte[] bArr, int i10, boolean z10) {
        this.f7969o.m15221R(bArr, i10);
        m8065B(this.f7969o);
        this.f7971q.m8073h();
        ArrayList arrayList = new ArrayList();
        while (this.f7969o.m15226a() >= 3) {
            C1547b m8064C = m8064C(this.f7969o, this.f7971q);
            if (m8064C != null) {
                arrayList.add(m8064C);
            }
        }
        return new C1997b(Collections.unmodifiableList(arrayList));
    }
}
