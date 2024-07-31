package p206o5;

import java.util.ArrayList;
import p222p5.C4014a;
import p222p5.C4041n0;

/* renamed from: o5.f */
/* loaded from: classes.dex */
public abstract class AbstractC3902f implements InterfaceC3910j {

    /* renamed from: a */
    public final boolean f14019a;

    /* renamed from: b */
    public final ArrayList<InterfaceC3917m0> f14020b = new ArrayList<>(1);

    /* renamed from: c */
    public int f14021c;

    /* renamed from: d */
    public C3918n f14022d;

    public AbstractC3902f(boolean z10) {
        this.f14019a = z10;
    }

    @Override // p206o5.InterfaceC3910j
    /* renamed from: g */
    public final void mo14820g(InterfaceC3917m0 interfaceC3917m0) {
        C4014a.m15199e(interfaceC3917m0);
        if (this.f14020b.contains(interfaceC3917m0)) {
            return;
        }
        this.f14020b.add(interfaceC3917m0);
        this.f14021c++;
    }

    /* renamed from: q */
    public final void m14821q(int i10) {
        C3918n c3918n = (C3918n) C4041n0.m15463j(this.f14022d);
        for (int i11 = 0; i11 < this.f14021c; i11++) {
            this.f14020b.get(i11).mo14849c(this, c3918n, this.f14019a, i10);
        }
    }

    /* renamed from: r */
    public final void m14822r() {
        C3918n c3918n = (C3918n) C4041n0.m15463j(this.f14022d);
        for (int i10 = 0; i10 < this.f14021c; i10++) {
            this.f14020b.get(i10).mo14851i(this, c3918n, this.f14019a);
        }
        this.f14022d = null;
    }

    /* renamed from: s */
    public final void m14823s(C3918n c3918n) {
        for (int i10 = 0; i10 < this.f14021c; i10++) {
            this.f14020b.get(i10).mo14850d(this, c3918n, this.f14019a);
        }
    }

    /* renamed from: t */
    public final void m14824t(C3918n c3918n) {
        this.f14022d = c3918n;
        for (int i10 = 0; i10 < this.f14021c; i10++) {
            this.f14020b.get(i10).mo14848a(this, c3918n, this.f14019a);
        }
    }
}
