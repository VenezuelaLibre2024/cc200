package p168l5;

import java.util.Collections;
import java.util.List;
import p047d5.C1547b;
import p047d5.InterfaceC1553h;
import p222p5.C4014a;

/* renamed from: l5.b */
/* loaded from: classes.dex */
public final class C3433b implements InterfaceC1553h {

    /* renamed from: i */
    public static final C3433b f12073i = new C3433b();

    /* renamed from: h */
    public final List<C1547b> f12074h;

    public C3433b() {
        this.f12074h = Collections.emptyList();
    }

    public C3433b(C1547b c1547b) {
        this.f12074h = Collections.singletonList(c1547b);
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
        return j10 >= 0 ? this.f12074h : Collections.emptyList();
    }

    @Override // p047d5.InterfaceC1553h
    /* renamed from: h */
    public int mo6353h() {
        return 1;
    }
}
