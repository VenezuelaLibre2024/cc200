package p251r5;

import java.nio.ByteBuffer;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p264s3.AbstractC4426f;
import p264s3.C4463m1;
import p264s3.InterfaceC4450j3;
import p304v3.C5110g;

/* renamed from: r5.b */
/* loaded from: classes.dex */
public final class C4301b extends AbstractC4426f {

    /* renamed from: u */
    public final C5110g f15614u;

    /* renamed from: v */
    public final C4015a0 f15615v;

    /* renamed from: w */
    public long f15616w;

    /* renamed from: x */
    public InterfaceC4300a f15617x;

    /* renamed from: y */
    public long f15618y;

    public C4301b() {
        super(6);
        this.f15614u = new C5110g(1);
        this.f15615v = new C4015a0();
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: P */
    public void mo6368P() {
        m16548a0();
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: R */
    public void mo6369R(long j10, boolean z10) {
        this.f15618y = Long.MIN_VALUE;
        m16548a0();
    }

    @Override // p264s3.AbstractC4426f
    /* renamed from: V */
    public void mo6370V(C4463m1[] c4463m1Arr, long j10, long j11) {
        this.f15616w = j11;
    }

    /* renamed from: Z */
    public final float[] m16547Z(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f15615v.m15221R(byteBuffer.array(), byteBuffer.limit());
        this.f15615v.m15223T(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f15615v.m15245t());
        }
        return fArr;
    }

    @Override // p264s3.InterfaceC4450j3
    /* renamed from: a */
    public int mo6372a(C4463m1 c4463m1) {
        return InterfaceC4450j3.m17374v("application/x-camera-motion".equals(c4463m1.f16506s) ? 4 : 0);
    }

    /* renamed from: a0 */
    public final void m16548a0() {
        InterfaceC4300a interfaceC4300a = this.f15617x;
        if (interfaceC4300a != null) {
            interfaceC4300a.mo16546d();
        }
    }

    @Override // p264s3.InterfaceC4445i3, p264s3.InterfaceC4450j3
    /* renamed from: b */
    public String mo6374b() {
        return "CameraMotionRenderer";
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: c */
    public boolean mo6376c() {
        return mo17216j();
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: e */
    public boolean mo6379e() {
        return true;
    }

    @Override // p264s3.InterfaceC4445i3
    /* renamed from: x */
    public void mo6387x(long j10, long j11) {
        while (!mo17216j() && this.f15618y < 100000 + j10) {
            this.f15614u.mo6366l();
            if (m17210W(m17205K(), this.f15614u, 0) != -4 || this.f15614u.m20748q()) {
                return;
            }
            C5110g c5110g = this.f15614u;
            this.f15618y = c5110g.f19286l;
            if (this.f15617x != null && !c5110g.m20747p()) {
                this.f15614u.m20765x();
                float[] m16547Z = m16547Z((ByteBuffer) C4041n0.m15463j(this.f15614u.f19284j));
                if (m16547Z != null) {
                    ((InterfaceC4300a) C4041n0.m15463j(this.f15617x)).mo16545a(this.f15618y - this.f15616w, m16547Z);
                }
            }
        }
    }

    @Override // p264s3.AbstractC4426f, p264s3.C4425e3.b
    /* renamed from: y */
    public void mo16091y(int i10, Object obj) {
        if (i10 == 8) {
            this.f15617x = (InterfaceC4300a) obj;
        } else {
            super.mo16091y(i10, obj);
        }
    }
}
