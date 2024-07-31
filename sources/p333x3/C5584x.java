package p333x3;

import p222p5.C4014a;
import p222p5.C4041n0;
import p333x3.InterfaceC5586z;

/* renamed from: x3.x */
/* loaded from: classes.dex */
public final class C5584x implements InterfaceC5586z {

    /* renamed from: a */
    public final long[] f20958a;

    /* renamed from: b */
    public final long[] f20959b;

    /* renamed from: c */
    public final long f20960c;

    /* renamed from: d */
    public final boolean f20961d;

    public C5584x(long[] jArr, long[] jArr2, long j10) {
        C4014a.m15195a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f20961d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f20958a = jArr;
            this.f20959b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f20958a = jArr3;
            long[] jArr4 = new long[i10];
            this.f20959b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f20960c = j10;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: d */
    public long mo3035d() {
        return this.f20960c;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: f */
    public boolean mo3036f() {
        return this.f20961d;
    }

    @Override // p333x3.InterfaceC5586z
    /* renamed from: i */
    public InterfaceC5586z.a mo3037i(long j10) {
        if (!this.f20961d) {
            return new InterfaceC5586z.a(C5557a0.f20850c);
        }
        int m15461i = C4041n0.m15461i(this.f20959b, j10, true, true);
        C5557a0 c5557a0 = new C5557a0(this.f20959b[m15461i], this.f20958a[m15461i]);
        if (c5557a0.f20851a == j10 || m15461i == this.f20959b.length - 1) {
            return new InterfaceC5586z.a(c5557a0);
        }
        int i10 = m15461i + 1;
        return new InterfaceC5586z.a(c5557a0, new C5557a0(this.f20959b[i10], this.f20958a[i10]));
    }
}
