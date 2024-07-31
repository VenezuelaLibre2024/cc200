package p038ce;

import p116he.C2555u;
import p116he.C2559w;
import td.C4753m;

/* renamed from: ce.o2 */
/* loaded from: classes2.dex */
public final class C1083o2 extends C2555u implements InterfaceC1118x1 {
    @Override // p038ce.InterfaceC1118x1
    /* renamed from: a */
    public boolean mo4363a() {
        return true;
    }

    @Override // p038ce.InterfaceC1118x1
    /* renamed from: e */
    public C1083o2 mo4364e() {
        return this;
    }

    @Override // p116he.C2559w
    public String toString() {
        return C1101t0.m4575c() ? m4527u("Active") : super.toString();
    }

    /* renamed from: u */
    public final String m4527u(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        Object m10187m = m10187m();
        C4753m.m18651d(m10187m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        boolean z10 = true;
        for (C2559w c2559w = (C2559w) m10187m; !C4753m.m18648a(c2559w, this); c2559w = c2559w.m10188n()) {
            if (c2559w instanceof AbstractC1056i2) {
                AbstractC1056i2 abstractC1056i2 = (AbstractC1056i2) c2559w;
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(abstractC1056i2);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        C4753m.m18652e(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
