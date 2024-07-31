package p318w4;

import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p264s3.C4463m1;

/* renamed from: w4.n */
/* loaded from: classes.dex */
public abstract class AbstractC5274n extends AbstractC5266f {

    /* renamed from: j */
    public final long f20017j;

    public AbstractC5274n(InterfaceC3910j interfaceC3910j, C3918n c3918n, C4463m1 c4463m1, int i10, Object obj, long j10, long j11, long j12) {
        super(interfaceC3910j, c3918n, 1, c4463m1, i10, obj, j10, j11);
        C4014a.m15199e(c4463m1);
        this.f20017j = j12;
    }

    /* renamed from: g */
    public long mo21352g() {
        long j10 = this.f20017j;
        if (j10 != -1) {
            return 1 + j10;
        }
        return -1L;
    }

    /* renamed from: h */
    public abstract boolean mo21353h();
}
