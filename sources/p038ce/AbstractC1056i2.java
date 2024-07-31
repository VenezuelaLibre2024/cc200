package p038ce;

import td.C4753m;

/* renamed from: ce.i2 */
/* loaded from: classes2.dex */
public abstract class AbstractC1056i2 extends AbstractC1034e0 implements InterfaceC1055i1, InterfaceC1118x1 {

    /* renamed from: k */
    public C1061j2 f4011k;

    @Override // p038ce.InterfaceC1118x1
    /* renamed from: a */
    public boolean mo4363a() {
        return true;
    }

    @Override // p038ce.InterfaceC1055i1
    public void dispose() {
        m4365v().m4390C0(this);
    }

    @Override // p038ce.InterfaceC1118x1
    /* renamed from: e */
    public C1083o2 mo4364e() {
        return null;
    }

    @Override // p116he.C2559w
    public String toString() {
        return C1105u0.m4580a(this) + '@' + C1105u0.m4581b(this) + "[job@" + C1105u0.m4581b(m4365v()) + ']';
    }

    /* renamed from: v */
    public final C1061j2 m4365v() {
        C1061j2 c1061j2 = this.f4011k;
        if (c1061j2 != null) {
            return c1061j2;
        }
        C4753m.m18667t("job");
        return null;
    }

    /* renamed from: w */
    public final void m4366w(C1061j2 c1061j2) {
        this.f4011k = c1061j2;
    }
}
