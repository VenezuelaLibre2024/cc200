package p290u4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p206o5.C3892a;
import p206o5.InterfaceC3894b;
import p206o5.InterfaceC3906h;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p290u4.C4867l0;
import p304v3.C5106c;
import p304v3.C5110g;
import p333x3.InterfaceC5559b0;

/* renamed from: u4.j0 */
/* loaded from: classes.dex */
public class C4863j0 {

    /* renamed from: a */
    public final InterfaceC3894b f18343a;

    /* renamed from: b */
    public final int f18344b;

    /* renamed from: c */
    public final C4015a0 f18345c;

    /* renamed from: d */
    public a f18346d;

    /* renamed from: e */
    public a f18347e;

    /* renamed from: f */
    public a f18348f;

    /* renamed from: g */
    public long f18349g;

    /* renamed from: u4.j0$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC3894b.a {

        /* renamed from: a */
        public long f18350a;

        /* renamed from: b */
        public long f18351b;

        /* renamed from: c */
        public C3892a f18352c;

        /* renamed from: d */
        public a f18353d;

        public a(long j10, int i10) {
            m19342d(j10, i10);
        }

        @Override // p206o5.InterfaceC3894b.a
        /* renamed from: a */
        public C3892a mo14766a() {
            return (C3892a) C4014a.m15199e(this.f18352c);
        }

        /* renamed from: b */
        public a m19340b() {
            this.f18352c = null;
            a aVar = this.f18353d;
            this.f18353d = null;
            return aVar;
        }

        /* renamed from: c */
        public void m19341c(C3892a c3892a, a aVar) {
            this.f18352c = c3892a;
            this.f18353d = aVar;
        }

        /* renamed from: d */
        public void m19342d(long j10, int i10) {
            C4014a.m15200f(this.f18352c == null);
            this.f18350a = j10;
            this.f18351b = j10 + i10;
        }

        /* renamed from: e */
        public int m19343e(long j10) {
            return ((int) (j10 - this.f18350a)) + this.f18352c.f13967b;
        }

        @Override // p206o5.InterfaceC3894b.a
        public InterfaceC3894b.a next() {
            a aVar = this.f18353d;
            if (aVar == null || aVar.f18352c == null) {
                return null;
            }
            return aVar;
        }
    }

    public C4863j0(InterfaceC3894b interfaceC3894b) {
        this.f18343a = interfaceC3894b;
        int mo14765e = interfaceC3894b.mo14765e();
        this.f18344b = mo14765e;
        this.f18345c = new C4015a0(32);
        a aVar = new a(0L, mo14765e);
        this.f18346d = aVar;
        this.f18347e = aVar;
        this.f18348f = aVar;
    }

    /* renamed from: d */
    public static a m19323d(a aVar, long j10) {
        while (j10 >= aVar.f18351b) {
            aVar = aVar.f18353d;
        }
        return aVar;
    }

    /* renamed from: i */
    public static a m19324i(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a m19323d = m19323d(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (m19323d.f18351b - j10));
            byteBuffer.put(m19323d.f18352c.f13966a, m19323d.m19343e(j10), min);
            i10 -= min;
            j10 += min;
            if (j10 == m19323d.f18351b) {
                m19323d = m19323d.f18353d;
            }
        }
        return m19323d;
    }

    /* renamed from: j */
    public static a m19325j(a aVar, long j10, byte[] bArr, int i10) {
        a m19323d = m19323d(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (m19323d.f18351b - j10));
            System.arraycopy(m19323d.f18352c.f13966a, m19323d.m19343e(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == m19323d.f18351b) {
                m19323d = m19323d.f18353d;
            }
        }
        return m19323d;
    }

    /* renamed from: k */
    public static a m19326k(a aVar, C5110g c5110g, C4867l0.b bVar, C4015a0 c4015a0) {
        long j10 = bVar.f18390b;
        int i10 = 1;
        c4015a0.m15219P(1);
        a m19325j = m19325j(aVar, j10, c4015a0.m15230e(), 1);
        long j11 = j10 + 1;
        byte b10 = c4015a0.m15230e()[0];
        boolean z10 = (b10 & 128) != 0;
        int i11 = b10 & Byte.MAX_VALUE;
        C5106c c5106c = c5110g.f19283i;
        byte[] bArr = c5106c.f19259a;
        if (bArr == null) {
            c5106c.f19259a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a m19325j2 = m19325j(m19325j, j11, c5106c.f19259a, i11);
        long j12 = j11 + i11;
        if (z10) {
            c4015a0.m15219P(2);
            m19325j2 = m19325j(m19325j2, j12, c4015a0.m15230e(), 2);
            j12 += 2;
            i10 = c4015a0.m15216M();
        }
        int i12 = i10;
        int[] iArr = c5106c.f19262d;
        if (iArr == null || iArr.length < i12) {
            iArr = new int[i12];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = c5106c.f19263e;
        if (iArr3 == null || iArr3.length < i12) {
            iArr3 = new int[i12];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i13 = i12 * 6;
            c4015a0.m15219P(i13);
            m19325j2 = m19325j(m19325j2, j12, c4015a0.m15230e(), i13);
            j12 += i13;
            c4015a0.m15223T(0);
            for (int i14 = 0; i14 < i12; i14++) {
                iArr2[i14] = c4015a0.m15216M();
                iArr4[i14] = c4015a0.m15214K();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.f18389a - ((int) (j12 - bVar.f18390b));
        }
        InterfaceC5559b0.a aVar2 = (InterfaceC5559b0.a) C4041n0.m15463j(bVar.f18391c);
        c5106c.m20755c(i12, iArr2, iArr4, aVar2.f20854b, c5106c.f19259a, aVar2.f20853a, aVar2.f20855c, aVar2.f20856d);
        long j13 = bVar.f18390b;
        int i15 = (int) (j12 - j13);
        bVar.f18390b = j13 + i15;
        bVar.f18389a -= i15;
        return m19325j2;
    }

    /* renamed from: l */
    public static a m19327l(a aVar, C5110g c5110g, C4867l0.b bVar, C4015a0 c4015a0) {
        long j10;
        ByteBuffer byteBuffer;
        if (c5110g.m20766y()) {
            aVar = m19326k(aVar, c5110g, bVar, c4015a0);
        }
        if (c5110g.m20746o()) {
            c4015a0.m15219P(4);
            a m19325j = m19325j(aVar, bVar.f18390b, c4015a0.m15230e(), 4);
            int m15214K = c4015a0.m15214K();
            bVar.f18390b += 4;
            bVar.f18389a -= 4;
            c5110g.m20764w(m15214K);
            aVar = m19324i(m19325j, bVar.f18390b, c5110g.f19284j, m15214K);
            bVar.f18390b += m15214K;
            int i10 = bVar.f18389a - m15214K;
            bVar.f18389a = i10;
            c5110g.m20762A(i10);
            j10 = bVar.f18390b;
            byteBuffer = c5110g.f19287m;
        } else {
            c5110g.m20764w(bVar.f18389a);
            j10 = bVar.f18390b;
            byteBuffer = c5110g.f19284j;
        }
        return m19324i(aVar, j10, byteBuffer, bVar.f18389a);
    }

    /* renamed from: a */
    public final void m19328a(a aVar) {
        if (aVar.f18352c == null) {
            return;
        }
        this.f18343a.mo14761a(aVar);
        aVar.m19340b();
    }

    /* renamed from: b */
    public void m19329b(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.f18346d;
            if (j10 < aVar.f18351b) {
                break;
            }
            this.f18343a.mo14762b(aVar.f18352c);
            this.f18346d = this.f18346d.m19340b();
        }
        if (this.f18347e.f18350a < aVar.f18350a) {
            this.f18347e = aVar;
        }
    }

    /* renamed from: c */
    public void m19330c(long j10) {
        C4014a.m15195a(j10 <= this.f18349g);
        this.f18349g = j10;
        if (j10 != 0) {
            a aVar = this.f18346d;
            if (j10 != aVar.f18350a) {
                while (this.f18349g > aVar.f18351b) {
                    aVar = aVar.f18353d;
                }
                a aVar2 = (a) C4014a.m15199e(aVar.f18353d);
                m19328a(aVar2);
                a aVar3 = new a(aVar.f18351b, this.f18344b);
                aVar.f18353d = aVar3;
                if (this.f18349g == aVar.f18351b) {
                    aVar = aVar3;
                }
                this.f18348f = aVar;
                if (this.f18347e == aVar2) {
                    this.f18347e = aVar3;
                    return;
                }
                return;
            }
        }
        m19328a(this.f18346d);
        a aVar4 = new a(this.f18349g, this.f18344b);
        this.f18346d = aVar4;
        this.f18347e = aVar4;
        this.f18348f = aVar4;
    }

    /* renamed from: e */
    public long m19331e() {
        return this.f18349g;
    }

    /* renamed from: f */
    public void m19332f(C5110g c5110g, C4867l0.b bVar) {
        m19327l(this.f18347e, c5110g, bVar, this.f18345c);
    }

    /* renamed from: g */
    public final void m19333g(int i10) {
        long j10 = this.f18349g + i10;
        this.f18349g = j10;
        a aVar = this.f18348f;
        if (j10 == aVar.f18351b) {
            this.f18348f = aVar.f18353d;
        }
    }

    /* renamed from: h */
    public final int m19334h(int i10) {
        a aVar = this.f18348f;
        if (aVar.f18352c == null) {
            aVar.m19341c(this.f18343a.mo14763c(), new a(this.f18348f.f18351b, this.f18344b));
        }
        return Math.min(i10, (int) (this.f18348f.f18351b - this.f18349g));
    }

    /* renamed from: m */
    public void m19335m(C5110g c5110g, C4867l0.b bVar) {
        this.f18347e = m19327l(this.f18347e, c5110g, bVar, this.f18345c);
    }

    /* renamed from: n */
    public void m19336n() {
        m19328a(this.f18346d);
        this.f18346d.m19342d(0L, this.f18344b);
        a aVar = this.f18346d;
        this.f18347e = aVar;
        this.f18348f = aVar;
        this.f18349g = 0L;
        this.f18343a.mo14764d();
    }

    /* renamed from: o */
    public void m19337o() {
        this.f18347e = this.f18346d;
    }

    /* renamed from: p */
    public int m19338p(InterfaceC3906h interfaceC3906h, int i10, boolean z10) {
        int m19334h = m19334h(i10);
        a aVar = this.f18348f;
        int mo14769c = interfaceC3906h.mo14769c(aVar.f18352c.f13966a, aVar.m19343e(this.f18349g), m19334h);
        if (mo14769c != -1) {
            m19333g(mo14769c);
            return mo14769c;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: q */
    public void m19339q(C4015a0 c4015a0, int i10) {
        while (i10 > 0) {
            int m19334h = m19334h(i10);
            a aVar = this.f18348f;
            c4015a0.m15237l(aVar.f18352c.f13966a, aVar.m19343e(this.f18349g), m19334h);
            i10 -= m19334h;
            m19333g(m19334h);
        }
    }
}
