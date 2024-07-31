package p318w4;

import p206o5.C3918n;
import p206o5.InterfaceC3910j;
import p222p5.C4014a;
import p264s3.C4463m1;

/* renamed from: w4.a */
/* loaded from: classes.dex */
public abstract class AbstractC5261a extends AbstractC5274n {

    /* renamed from: k */
    public final long f19938k;

    /* renamed from: l */
    public final long f19939l;

    /* renamed from: m */
    public C5263c f19940m;

    /* renamed from: n */
    public int[] f19941n;

    public AbstractC5261a(InterfaceC3910j interfaceC3910j, C3918n c3918n, C4463m1 c4463m1, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(interfaceC3910j, c3918n, c4463m1, i10, obj, j10, j11, j14);
        this.f19938k = j12;
        this.f19939l = j13;
    }

    /* renamed from: i */
    public final int m21300i(int i10) {
        return ((int[]) C4014a.m15202h(this.f19941n))[i10];
    }

    /* renamed from: j */
    public final C5263c m21301j() {
        return (C5263c) C4014a.m15202h(this.f19940m);
    }

    /* renamed from: k */
    public void m21302k(C5263c c5263c) {
        this.f19940m = c5263c;
        this.f19941n = c5263c.m21307a();
    }
}
