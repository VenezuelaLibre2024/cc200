package p250r4;

import java.nio.ByteBuffer;
import p152k4.AbstractC3354g;
import p152k4.C3348a;
import p152k4.C3351d;
import p222p5.C4015a0;
import p222p5.C4033j0;
import p222p5.C4054z;

/* renamed from: r4.c */
/* loaded from: classes.dex */
public final class C4295c extends AbstractC3354g {

    /* renamed from: a */
    public final C4015a0 f15579a = new C4015a0();

    /* renamed from: b */
    public final C4054z f15580b = new C4054z();

    /* renamed from: c */
    public C4033j0 f15581c;

    @Override // p152k4.AbstractC3354g
    /* renamed from: b */
    public C3348a mo12429b(C3351d c3351d, ByteBuffer byteBuffer) {
        C4033j0 c4033j0 = this.f15581c;
        if (c4033j0 == null || c3351d.f11659p != c4033j0.m15366e()) {
            C4033j0 c4033j02 = new C4033j0(c3351d.f19286l);
            this.f15581c = c4033j02;
            c4033j02.m15362a(c3351d.f19286l - c3351d.f11659p);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f15579a.m15221R(array, limit);
        this.f15580b.m15608o(array, limit);
        this.f15580b.m15611r(39);
        long m15601h = (this.f15580b.m15601h(1) << 32) | this.f15580b.m15601h(32);
        this.f15580b.m15611r(20);
        int m15601h2 = this.f15580b.m15601h(12);
        int m15601h3 = this.f15580b.m15601h(8);
        C3348a.b bVar = null;
        this.f15579a.m15224U(14);
        if (m15601h3 == 0) {
            bVar = new C4297e();
        } else if (m15601h3 == 255) {
            bVar = C4293a.m16518a(this.f15579a, m15601h2, m15601h);
        } else if (m15601h3 == 4) {
            bVar = C4298f.m16528a(this.f15579a);
        } else if (m15601h3 == 5) {
            bVar = C4296d.m16521a(this.f15579a, m15601h, this.f15581c);
        } else if (m15601h3 == 6) {
            bVar = C4299g.m16541a(this.f15579a, m15601h, this.f15581c);
        }
        return bVar == null ? new C3348a(new C3348a.b[0]) : new C3348a(bVar);
    }
}
