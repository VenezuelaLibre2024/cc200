package p289u3;

import java.nio.ByteBuffer;
import p222p5.C4014a;
import p289u3.InterfaceC4817g;

/* renamed from: u3.y */
/* loaded from: classes.dex */
public final class C4842y extends AbstractC4841x {

    /* renamed from: i */
    public int[] f18202i;

    /* renamed from: j */
    public int[] f18203j;

    @Override // p289u3.InterfaceC4817g
    /* renamed from: e */
    public void mo19009e(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) C4014a.m15199e(this.f18203j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m19187l = m19187l(((limit - position) / this.f18195b.f18056d) * this.f18196c.f18056d);
        while (position < limit) {
            for (int i10 : iArr) {
                m19187l.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f18195b.f18056d;
        }
        byteBuffer.position(limit);
        m19187l.flip();
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: h */
    public InterfaceC4817g.a mo19010h(InterfaceC4817g.a aVar) {
        int[] iArr = this.f18202i;
        if (iArr == null) {
            return InterfaceC4817g.a.f18052e;
        }
        if (aVar.f18055c != 2) {
            throw new InterfaceC4817g.b(aVar);
        }
        boolean z10 = aVar.f18054b != iArr.length;
        int i10 = 0;
        while (i10 < iArr.length) {
            int i11 = iArr[i10];
            if (i11 >= aVar.f18054b) {
                throw new InterfaceC4817g.b(aVar);
            }
            z10 |= i11 != i10;
            i10++;
        }
        return z10 ? new InterfaceC4817g.a(aVar.f18053a, iArr.length, 2) : InterfaceC4817g.a.f18052e;
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: i */
    public void mo19077i() {
        this.f18203j = this.f18202i;
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: k */
    public void mo19079k() {
        this.f18203j = null;
        this.f18202i = null;
    }

    /* renamed from: m */
    public void m19188m(int[] iArr) {
        this.f18202i = iArr;
    }
}
