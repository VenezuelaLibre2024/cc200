package p137j4;

import java.nio.ByteBuffer;
import p222p5.C4014a;
import p304v3.C5110g;

/* renamed from: j4.h */
/* loaded from: classes.dex */
public final class C3229h extends C5110g {

    /* renamed from: p */
    public long f11213p;

    /* renamed from: q */
    public int f11214q;

    /* renamed from: r */
    public int f11215r;

    public C3229h() {
        super(2);
        this.f11215r = 32;
    }

    /* renamed from: B */
    public boolean m11549B(C5110g c5110g) {
        C4014a.m15195a(!c5110g.m20766y());
        C4014a.m15195a(!c5110g.m20746o());
        C4014a.m15195a(!c5110g.m20748q());
        if (!m11550C(c5110g)) {
            return false;
        }
        int i10 = this.f11214q;
        this.f11214q = i10 + 1;
        if (i10 == 0) {
            this.f19286l = c5110g.f19286l;
            if (c5110g.m20750s()) {
                m20752u(1);
            }
        }
        if (c5110g.m20747p()) {
            m20752u(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = c5110g.f19284j;
        if (byteBuffer != null) {
            m20764w(byteBuffer.remaining());
            this.f19284j.put(byteBuffer);
        }
        this.f11213p = c5110g.f19286l;
        return true;
    }

    /* renamed from: C */
    public final boolean m11550C(C5110g c5110g) {
        ByteBuffer byteBuffer;
        if (!m11554G()) {
            return true;
        }
        if (this.f11214q >= this.f11215r || c5110g.m20747p() != m20747p()) {
            return false;
        }
        ByteBuffer byteBuffer2 = c5110g.f19284j;
        return byteBuffer2 == null || (byteBuffer = this.f19284j) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    /* renamed from: D */
    public long m11551D() {
        return this.f19286l;
    }

    /* renamed from: E */
    public long m11552E() {
        return this.f11213p;
    }

    /* renamed from: F */
    public int m11553F() {
        return this.f11214q;
    }

    /* renamed from: G */
    public boolean m11554G() {
        return this.f11214q > 0;
    }

    /* renamed from: H */
    public void m11555H(int i10) {
        C4014a.m15195a(i10 > 0);
        this.f11215r = i10;
    }

    @Override // p304v3.C5110g, p304v3.AbstractC5104a
    /* renamed from: l */
    public void mo6366l() {
        super.mo6366l();
        this.f11214q = 0;
    }
}
