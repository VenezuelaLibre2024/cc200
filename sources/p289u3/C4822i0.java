package p289u3;

import java.nio.ByteBuffer;
import p222p5.C4014a;
import p222p5.C4041n0;
import p289u3.InterfaceC4817g;

/* renamed from: u3.i0 */
/* loaded from: classes.dex */
public final class C4822i0 extends AbstractC4841x {

    /* renamed from: i */
    public final long f18061i;

    /* renamed from: j */
    public final long f18062j;

    /* renamed from: k */
    public final short f18063k;

    /* renamed from: l */
    public int f18064l;

    /* renamed from: m */
    public boolean f18065m;

    /* renamed from: n */
    public byte[] f18066n;

    /* renamed from: o */
    public byte[] f18067o;

    /* renamed from: p */
    public int f18068p;

    /* renamed from: q */
    public int f18069q;

    /* renamed from: r */
    public int f18070r;

    /* renamed from: s */
    public boolean f18071s;

    /* renamed from: t */
    public long f18072t;

    public C4822i0() {
        this(150000L, 20000L, (short) 1024);
    }

    public C4822i0(long j10, long j11, short s10) {
        C4014a.m15195a(j11 <= j10);
        this.f18061i = j10;
        this.f18062j = j11;
        this.f18063k = s10;
        byte[] bArr = C4041n0.f14518f;
        this.f18066n = bArr;
        this.f18067o = bArr;
    }

    @Override // p289u3.AbstractC4841x, p289u3.InterfaceC4817g
    /* renamed from: a */
    public boolean mo19064a() {
        return this.f18065m;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: e */
    public void mo19009e(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !m19186g()) {
            int i10 = this.f18068p;
            if (i10 == 0) {
                m19087t(byteBuffer);
            } else if (i10 == 1) {
                m19086s(byteBuffer);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                m19088u(byteBuffer);
            }
        }
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: h */
    public InterfaceC4817g.a mo19010h(InterfaceC4817g.a aVar) {
        if (aVar.f18055c == 2) {
            return this.f18065m ? aVar : InterfaceC4817g.a.f18052e;
        }
        throw new InterfaceC4817g.b(aVar);
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: i */
    public void mo19077i() {
        if (this.f18065m) {
            this.f18064l = this.f18195b.f18056d;
            int m19080m = m19080m(this.f18061i) * this.f18064l;
            if (this.f18066n.length != m19080m) {
                this.f18066n = new byte[m19080m];
            }
            int m19080m2 = m19080m(this.f18062j) * this.f18064l;
            this.f18070r = m19080m2;
            if (this.f18067o.length != m19080m2) {
                this.f18067o = new byte[m19080m2];
            }
        }
        this.f18068p = 0;
        this.f18072t = 0L;
        this.f18069q = 0;
        this.f18071s = false;
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: j */
    public void mo19078j() {
        int i10 = this.f18069q;
        if (i10 > 0) {
            m19085r(this.f18066n, i10);
        }
        if (this.f18071s) {
            return;
        }
        this.f18072t += this.f18070r / this.f18064l;
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: k */
    public void mo19079k() {
        this.f18065m = false;
        this.f18070r = 0;
        byte[] bArr = C4041n0.f14518f;
        this.f18066n = bArr;
        this.f18067o = bArr;
    }

    /* renamed from: m */
    public final int m19080m(long j10) {
        return (int) ((j10 * this.f18195b.f18053a) / 1000000);
    }

    /* renamed from: n */
    public final int m19081n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        do {
            limit -= 2;
            if (limit < byteBuffer.position()) {
                return byteBuffer.position();
            }
        } while (Math.abs((int) byteBuffer.getShort(limit)) <= this.f18063k);
        int i10 = this.f18064l;
        return ((limit / i10) * i10) + i10;
    }

    /* renamed from: o */
    public final int m19082o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f18063k) {
                int i10 = this.f18064l;
                return i10 * (position / i10);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: p */
    public long m19083p() {
        return this.f18072t;
    }

    /* renamed from: q */
    public final void m19084q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        m19187l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f18071s = true;
        }
    }

    /* renamed from: r */
    public final void m19085r(byte[] bArr, int i10) {
        m19187l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f18071s = true;
        }
    }

    /* renamed from: s */
    public final void m19086s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m19082o = m19082o(byteBuffer);
        int position = m19082o - byteBuffer.position();
        byte[] bArr = this.f18066n;
        int length = bArr.length;
        int i10 = this.f18069q;
        int i11 = length - i10;
        if (m19082o < limit && position < i11) {
            m19085r(bArr, i10);
            this.f18069q = 0;
            this.f18068p = 0;
            return;
        }
        int min = Math.min(position, i11);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f18066n, this.f18069q, min);
        int i12 = this.f18069q + min;
        this.f18069q = i12;
        byte[] bArr2 = this.f18066n;
        if (i12 == bArr2.length) {
            if (this.f18071s) {
                m19085r(bArr2, this.f18070r);
                this.f18072t += (this.f18069q - (this.f18070r * 2)) / this.f18064l;
            } else {
                this.f18072t += (i12 - this.f18070r) / this.f18064l;
            }
            m19090w(byteBuffer, this.f18066n, this.f18069q);
            this.f18069q = 0;
            this.f18068p = 2;
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: t */
    public final void m19087t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f18066n.length));
        int m19081n = m19081n(byteBuffer);
        if (m19081n == byteBuffer.position()) {
            this.f18068p = 1;
        } else {
            byteBuffer.limit(m19081n);
            m19084q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    /* renamed from: u */
    public final void m19088u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int m19082o = m19082o(byteBuffer);
        byteBuffer.limit(m19082o);
        this.f18072t += byteBuffer.remaining() / this.f18064l;
        m19090w(byteBuffer, this.f18067o, this.f18070r);
        if (m19082o < limit) {
            m19085r(this.f18067o, this.f18070r);
            this.f18068p = 0;
            byteBuffer.limit(limit);
        }
    }

    /* renamed from: v */
    public void m19089v(boolean z10) {
        this.f18065m = z10;
    }

    /* renamed from: w */
    public final void m19090w(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f18070r);
        int i11 = this.f18070r - min;
        System.arraycopy(bArr, i10 - i11, this.f18067o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f18067o, i11, min);
    }
}
