package p138j5;

import java.util.Collections;
import java.util.List;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: j5.b */
/* loaded from: classes.dex */
public final class C3247b implements InterfaceC1553h {

    /* renamed from: h */
    public final C1547b[] f11346h;

    /* renamed from: i */
    public final long[] f11347i;

    public C3247b(C1547b[] c1547bArr, long[] jArr) {
        this.f11346h = c1547bArr;
        this.f11347i = jArr;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: b */
    public int mo6350b(long j10) {
        int m15453e = C4041n0.m15453e(this.f11347i, j10, false, false);
        if (m15453e < this.f11347i.length) {
            return m15453e;
        }
        return -1;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: c */
    public long mo6351c(int i10) {
        C4014a.m15195a(i10 >= 0);
        C4014a.m15195a(i10 < this.f11347i.length);
        return this.f11347i[i10];
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: f */
    public List<C1547b> mo6352f(long j10) {
        int m15461i = C4041n0.m15461i(this.f11347i, j10, true, false);
        if (m15461i != -1) {
            C1547b[] c1547bArr = this.f11346h;
            if (c1547bArr[m15461i] != C1547b.f5779y) {
                return Collections.singletonList(c1547bArr[m15461i]);
            }
        }
        return Collections.emptyList();
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: h */
    public int mo6353h() {
        return this.f11347i.length;
    }
}
