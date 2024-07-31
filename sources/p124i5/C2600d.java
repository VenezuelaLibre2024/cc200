package p124i5;

import java.util.Collections;
import java.util.List;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: i5.d */
/* loaded from: classes.dex */
public final class C2600d implements InterfaceC1553h {

    /* renamed from: h */
    public final List<List<C1547b>> f10233h;

    /* renamed from: i */
    public final List<Long> f10234i;

    public C2600d(List<List<C1547b>> list, List<Long> list2) {
        this.f10233h = list;
        this.f10234i = list2;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: b */
    public int mo6350b(long j10) {
        int m15451d = C4041n0.m15451d(this.f10234i, Long.valueOf(j10), false, false);
        if (m15451d < this.f10234i.size()) {
            return m15451d;
        }
        return -1;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: c */
    public long mo6351c(int i10) {
        C4014a.m15195a(i10 >= 0);
        C4014a.m15195a(i10 < this.f10234i.size());
        return this.f10234i.get(i10).longValue();
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: f */
    public List<C1547b> mo6352f(long j10) {
        int m15455f = C4041n0.m15455f(this.f10234i, Long.valueOf(j10), true, false);
        return m15455f == -1 ? Collections.emptyList() : this.f10233h.get(m15455f);
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: h */
    public int mo6353h() {
        return this.f10234i.size();
    }
}
