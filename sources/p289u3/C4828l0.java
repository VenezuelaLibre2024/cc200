package p289u3;

import java.nio.ByteBuffer;
import p222p5.C4041n0;
import p289u3.InterfaceC4817g;

/* renamed from: u3.l0 */
/* loaded from: classes.dex */
public final class C4828l0 extends AbstractC4841x {

    /* renamed from: i */
    public int f18116i;

    /* renamed from: j */
    public int f18117j;

    /* renamed from: k */
    public boolean f18118k;

    /* renamed from: l */
    public int f18119l;

    /* renamed from: m */
    public byte[] f18120m = C4041n0.f14518f;

    /* renamed from: n */
    public int f18121n;

    /* renamed from: o */
    public long f18122o;

    @Override // p289u3.AbstractC4841x, p289u3.InterfaceC4817g
    /* renamed from: b */
    public ByteBuffer mo19065b() {
        int i10;
        if (super.mo19066c() && (i10 = this.f18121n) > 0) {
            m19187l(i10).put(this.f18120m, 0, this.f18121n).flip();
            this.f18121n = 0;
        }
        return super.mo19065b();
    }

    @Override // p289u3.AbstractC4841x, p289u3.InterfaceC4817g
    /* renamed from: c */
    public boolean mo19066c() {
        return super.mo19066c() && this.f18121n == 0;
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: e */
    public void mo19009e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f18119l);
        this.f18122o += min / this.f18195b.f18056d;
        this.f18119l -= min;
        byteBuffer.position(position + min);
        if (this.f18119l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f18121n + i11) - this.f18120m.length;
        ByteBuffer m19187l = m19187l(length);
        int m15477q = C4041n0.m15477q(length, 0, this.f18121n);
        m19187l.put(this.f18120m, 0, m15477q);
        int m15477q2 = C4041n0.m15477q(length - m15477q, 0, i11);
        byteBuffer.limit(byteBuffer.position() + m15477q2);
        m19187l.put(byteBuffer);
        byteBuffer.limit(limit);
        int i12 = i11 - m15477q2;
        int i13 = this.f18121n - m15477q;
        this.f18121n = i13;
        byte[] bArr = this.f18120m;
        System.arraycopy(bArr, m15477q, bArr, 0, i13);
        byteBuffer.get(this.f18120m, this.f18121n, i12);
        this.f18121n += i12;
        m19187l.flip();
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: h */
    public InterfaceC4817g.a mo19010h(InterfaceC4817g.a aVar) {
        if (aVar.f18055c != 2) {
            throw new InterfaceC4817g.b(aVar);
        }
        this.f18118k = true;
        return (this.f18116i == 0 && this.f18117j == 0) ? InterfaceC4817g.a.f18052e : aVar;
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: i */
    public void mo19077i() {
        if (this.f18118k) {
            this.f18118k = false;
            int i10 = this.f18117j;
            int i11 = this.f18195b.f18056d;
            this.f18120m = new byte[i10 * i11];
            this.f18119l = this.f18116i * i11;
        }
        this.f18121n = 0;
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: j */
    public void mo19078j() {
        if (this.f18118k) {
            if (this.f18121n > 0) {
                this.f18122o += r0 / this.f18195b.f18056d;
            }
            this.f18121n = 0;
        }
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: k */
    public void mo19079k() {
        this.f18120m = C4041n0.f14518f;
    }

    /* renamed from: m */
    public long m19117m() {
        return this.f18122o;
    }

    /* renamed from: n */
    public void m19118n() {
        this.f18122o = 0L;
    }

    /* renamed from: o */
    public void m19119o(int i10, int i11) {
        this.f18116i = i10;
        this.f18117j = i11;
    }
}
