package p264s3;

import android.util.Pair;
import p222p5.C4014a;
import p264s3.AbstractC4505u3;
import p290u4.InterfaceC4873o0;

/* renamed from: s3.a */
/* loaded from: classes.dex */
public abstract class AbstractC4399a extends AbstractC4505u3 {

    /* renamed from: m */
    public final int f16129m;

    /* renamed from: n */
    public final InterfaceC4873o0 f16130n;

    /* renamed from: o */
    public final boolean f16131o;

    public AbstractC4399a(boolean z10, InterfaceC4873o0 interfaceC4873o0) {
        this.f16131o = z10;
        this.f16130n = interfaceC4873o0;
        this.f16129m = interfaceC4873o0.mo19409b();
    }

    /* renamed from: A */
    public static Object m17016A(Object obj) {
        return ((Pair) obj).first;
    }

    /* renamed from: C */
    public static Object m17017C(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: z */
    public static Object m17018z(Object obj) {
        return ((Pair) obj).second;
    }

    /* renamed from: B */
    public abstract Object mo17019B(int i10);

    /* renamed from: D */
    public abstract int mo17020D(int i10);

    /* renamed from: E */
    public abstract int mo17021E(int i10);

    /* renamed from: F */
    public final int m17022F(int i10, boolean z10) {
        if (z10) {
            return this.f16130n.mo19413f(i10);
        }
        if (i10 < this.f16129m - 1) {
            return i10 + 1;
        }
        return -1;
    }

    /* renamed from: G */
    public final int m17023G(int i10, boolean z10) {
        if (z10) {
            return this.f16130n.mo19412e(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    /* renamed from: H */
    public abstract AbstractC4505u3 mo17024H(int i10);

    @Override // p264s3.AbstractC4505u3
    /* renamed from: e */
    public int mo17025e(boolean z10) {
        if (this.f16129m == 0) {
            return -1;
        }
        if (this.f16131o) {
            z10 = false;
        }
        int mo19411d = z10 ? this.f16130n.mo19411d() : 0;
        while (mo17024H(mo19411d).m17676u()) {
            mo19411d = m17022F(mo19411d, z10);
            if (mo19411d == -1) {
                return -1;
            }
        }
        return mo17021E(mo19411d) + mo17024H(mo19411d).mo17025e(z10);
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: f */
    public final int mo4743f(Object obj) {
        int mo4743f;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object m17016A = m17016A(obj);
        Object m17018z = m17018z(obj);
        int mo17030w = mo17030w(m17016A);
        if (mo17030w == -1 || (mo4743f = mo17024H(mo17030w).mo4743f(m17018z)) == -1) {
            return -1;
        }
        return mo17020D(mo17030w) + mo4743f;
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: g */
    public int mo17026g(boolean z10) {
        int i10 = this.f16129m;
        if (i10 == 0) {
            return -1;
        }
        if (this.f16131o) {
            z10 = false;
        }
        int mo19415h = z10 ? this.f16130n.mo19415h() : i10 - 1;
        while (mo17024H(mo19415h).m17676u()) {
            mo19415h = m17023G(mo19415h, z10);
            if (mo19415h == -1) {
                return -1;
            }
        }
        return mo17021E(mo19415h) + mo17024H(mo19415h).mo17026g(z10);
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: i */
    public int mo17027i(int i10, int i11, boolean z10) {
        if (this.f16131o) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int mo17032y = mo17032y(i10);
        int mo17021E = mo17021E(mo17032y);
        int mo17027i = mo17024H(mo17032y).mo17027i(i10 - mo17021E, i11 != 2 ? i11 : 0, z10);
        if (mo17027i != -1) {
            return mo17021E + mo17027i;
        }
        int m17022F = m17022F(mo17032y, z10);
        while (m17022F != -1 && mo17024H(m17022F).m17676u()) {
            m17022F = m17022F(m17022F, z10);
        }
        if (m17022F != -1) {
            return mo17021E(m17022F) + mo17024H(m17022F).mo17025e(z10);
        }
        if (i11 == 2) {
            return mo17025e(z10);
        }
        return -1;
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: k */
    public final AbstractC4505u3.b mo4744k(int i10, AbstractC4505u3.b bVar, boolean z10) {
        int mo17031x = mo17031x(i10);
        int mo17021E = mo17021E(mo17031x);
        mo17024H(mo17031x).mo4744k(i10 - mo17020D(mo17031x), bVar, z10);
        bVar.f16834j += mo17021E;
        if (z10) {
            bVar.f16833i = m17017C(mo17019B(mo17031x), C4014a.m15199e(bVar.f16833i));
        }
        return bVar;
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: l */
    public final AbstractC4505u3.b mo17028l(Object obj, AbstractC4505u3.b bVar) {
        Object m17016A = m17016A(obj);
        Object m17018z = m17018z(obj);
        int mo17030w = mo17030w(m17016A);
        int mo17021E = mo17021E(mo17030w);
        mo17024H(mo17030w).mo17028l(m17018z, bVar);
        bVar.f16834j += mo17021E;
        bVar.f16833i = obj;
        return bVar;
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: p */
    public int mo17029p(int i10, int i11, boolean z10) {
        if (this.f16131o) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int mo17032y = mo17032y(i10);
        int mo17021E = mo17021E(mo17032y);
        int mo17029p = mo17024H(mo17032y).mo17029p(i10 - mo17021E, i11 != 2 ? i11 : 0, z10);
        if (mo17029p != -1) {
            return mo17021E + mo17029p;
        }
        int m17023G = m17023G(mo17032y, z10);
        while (m17023G != -1 && mo17024H(m17023G).m17676u()) {
            m17023G = m17023G(m17023G, z10);
        }
        if (m17023G != -1) {
            return mo17021E(m17023G) + mo17024H(m17023G).mo17026g(z10);
        }
        if (i11 == 2) {
            return mo17026g(z10);
        }
        return -1;
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: q */
    public final Object mo4746q(int i10) {
        int mo17031x = mo17031x(i10);
        return m17017C(mo17019B(mo17031x), mo17024H(mo17031x).mo4746q(i10 - mo17020D(mo17031x)));
    }

    @Override // p264s3.AbstractC4505u3
    /* renamed from: s */
    public final AbstractC4505u3.d mo4747s(int i10, AbstractC4505u3.d dVar, long j10) {
        int mo17032y = mo17032y(i10);
        int mo17021E = mo17021E(mo17032y);
        int mo17020D = mo17020D(mo17032y);
        mo17024H(mo17032y).mo4747s(i10 - mo17021E, dVar, j10);
        Object mo17019B = mo17019B(mo17032y);
        if (!AbstractC4505u3.d.f16858y.equals(dVar.f16860h)) {
            mo17019B = m17017C(mo17019B, dVar.f16860h);
        }
        dVar.f16860h = mo17019B;
        dVar.f16874v += mo17020D;
        dVar.f16875w += mo17020D;
        return dVar;
    }

    /* renamed from: w */
    public abstract int mo17030w(Object obj);

    /* renamed from: x */
    public abstract int mo17031x(int i10);

    /* renamed from: y */
    public abstract int mo17032y(int i10);
}
