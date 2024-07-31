package p137j4;

import java.nio.ByteBuffer;
import p222p5.C4014a;
import p222p5.C4046r;
import p264s3.C4463m1;
import p289u3.C4816f0;
import p304v3.C5110g;

/* renamed from: j4.i */
/* loaded from: classes.dex */
public final class C3230i {

    /* renamed from: a */
    public long f11216a;

    /* renamed from: b */
    public long f11217b;

    /* renamed from: c */
    public boolean f11218c;

    /* renamed from: a */
    public final long m11556a(long j10) {
        return this.f11216a + Math.max(0L, ((this.f11217b - 529) * 1000000) / j10);
    }

    /* renamed from: b */
    public long m11557b(C4463m1 c4463m1) {
        return m11556a(c4463m1.f16486G);
    }

    /* renamed from: c */
    public void m11558c() {
        this.f11216a = 0L;
        this.f11217b = 0L;
        this.f11218c = false;
    }

    /* renamed from: d */
    public long m11559d(C4463m1 c4463m1, C5110g c5110g) {
        if (this.f11217b == 0) {
            this.f11216a = c5110g.f19286l;
        }
        if (this.f11218c) {
            return c5110g.f19286l;
        }
        ByteBuffer byteBuffer = (ByteBuffer) C4014a.m15199e(c5110g.f19284j);
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = (i10 << 8) | (byteBuffer.get(i11) & 255);
        }
        int m19062m = C4816f0.m19062m(i10);
        if (m19062m != -1) {
            long m11556a = m11556a(c4463m1.f16486G);
            this.f11217b += m19062m;
            return m11556a;
        }
        this.f11218c = true;
        this.f11217b = 0L;
        this.f11216a = c5110g.f19286l;
        C4046r.m15529i("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return c5110g.f19286l;
    }
}
