package p038ce;

/* renamed from: ce.n2 */
/* loaded from: classes2.dex */
public abstract class AbstractC1079n2 extends AbstractC1064k0 {
    /* renamed from: K0 */
    public abstract AbstractC1079n2 mo4521K0();

    /* renamed from: L0 */
    public final String m4522L0() {
        AbstractC1079n2 abstractC1079n2;
        AbstractC1079n2 m4328c = C1045g1.m4328c();
        if (this == m4328c) {
            return "Dispatchers.Main";
        }
        try {
            abstractC1079n2 = m4328c.mo4521K0();
        } catch (UnsupportedOperationException unused) {
            abstractC1079n2 = null;
        }
        if (this == abstractC1079n2) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // p038ce.AbstractC1064k0
    public String toString() {
        String m4522L0 = m4522L0();
        if (m4522L0 != null) {
            return m4522L0;
        }
        return C1105u0.m4580a(this) + '@' + C1105u0.m4581b(this);
    }
}
