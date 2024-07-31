package p063e5;

import java.util.Collections;
import java.util.List;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p222p5.C4014a;

/* renamed from: e5.f */
/* loaded from: classes.dex */
public final class C1664f implements InterfaceC1553h {

    /* renamed from: h */
    public final List<C1547b> f6224h;

    public C1664f(List<C1547b> list) {
        this.f6224h = list;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: b */
    public int mo6350b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: c */
    public long mo6351c(int i10) {
        C4014a.m15195a(i10 == 0);
        return 0L;
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: f */
    public List<C1547b> mo6352f(long j10) {
        return j10 >= 0 ? this.f6224h : Collections.emptyList();
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: h */
    public int mo6353h() {
        return 1;
    }
}
