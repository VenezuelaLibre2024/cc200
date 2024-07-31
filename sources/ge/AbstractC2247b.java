package ge;

import gd.C2237k;
import gd.C2245s;
import ge.AbstractC2249d;
import java.util.Arrays;
import p146jd.InterfaceC3281d;
import td.C4753m;

/* renamed from: ge.b */
/* loaded from: classes2.dex */
public abstract class AbstractC2247b<S extends AbstractC2249d<?>> {

    /* renamed from: h */
    public S[] f8875h;

    /* renamed from: i */
    public int f8876i;

    /* renamed from: j */
    public int f8877j;

    /* renamed from: b */
    public final S m8979b() {
        S s10;
        synchronized (this) {
            S[] sArr = this.f8875h;
            if (sArr == null) {
                sArr = mo7800d(2);
                this.f8875h = sArr;
            } else if (this.f8876i >= sArr.length) {
                Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                C4753m.m18652e(copyOf, "copyOf(this, newSize)");
                this.f8875h = (S[]) ((AbstractC2249d[]) copyOf);
                sArr = (S[]) ((AbstractC2249d[]) copyOf);
            }
            int i10 = this.f8877j;
            do {
                s10 = sArr[i10];
                if (s10 == null) {
                    s10 = mo7799c();
                    sArr[i10] = s10;
                }
                i10++;
                if (i10 >= sArr.length) {
                    i10 = 0;
                }
                C4753m.m18651d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            } while (!s10.mo7808a(this));
            this.f8877j = i10;
            this.f8876i++;
        }
        return s10;
    }

    /* renamed from: c */
    public abstract S mo7799c();

    /* renamed from: d */
    public abstract S[] mo7800d(int i10);

    /* renamed from: e */
    public final void m8980e(S s10) {
        int i10;
        InterfaceC3281d<C2245s>[] mo7809b;
        synchronized (this) {
            int i11 = this.f8876i - 1;
            this.f8876i = i11;
            if (i11 == 0) {
                this.f8877j = 0;
            }
            C4753m.m18651d(s10, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            mo7809b = s10.mo7809b(this);
        }
        for (InterfaceC3281d<C2245s> interfaceC3281d : mo7809b) {
            if (interfaceC3281d != null) {
                C2237k.a aVar = C2237k.f8865i;
                interfaceC3281d.resumeWith(C2237k.m8966b(C2245s.f8873a));
            }
        }
    }

    /* renamed from: f */
    public final S[] m8981f() {
        return this.f8875h;
    }
}
