package p289u3;

import java.nio.ByteBuffer;
import p222p5.C4041n0;
import p289u3.InterfaceC4817g;

/* renamed from: u3.d0 */
/* loaded from: classes.dex */
public final class C4812d0 extends AbstractC4841x {

    /* renamed from: i */
    public static final int f17997i = Float.floatToIntBits(Float.NaN);

    /* renamed from: m */
    public static void m19008m(int i10, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i10 * 4.656612875245797E-10d));
        if (floatToIntBits == f17997i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // p289u3.InterfaceC4817g
    /* renamed from: e */
    public void mo19009e(ByteBuffer byteBuffer) {
        ByteBuffer m19187l;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f18195b.f18055c;
        if (i11 == 536870912) {
            m19187l = m19187l((i10 / 3) * 4);
            while (position < limit) {
                m19008m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m19187l);
                position += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            m19187l = m19187l(i10);
            while (position < limit) {
                m19008m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m19187l);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m19187l.flip();
    }

    @Override // p289u3.AbstractC4841x
    /* renamed from: h */
    public InterfaceC4817g.a mo19010h(InterfaceC4817g.a aVar) {
        int i10 = aVar.f18055c;
        if (C4041n0.m15482s0(i10)) {
            return i10 != 4 ? new InterfaceC4817g.a(aVar.f18053a, aVar.f18054b, 4) : InterfaceC4817g.a.f18052e;
        }
        throw new InterfaceC4817g.b(aVar);
    }
}
