package p038ce;

import p146jd.AbstractC3278a;
import p146jd.InterfaceC3284g;
import td.C4747g;
import td.C4753m;

/* renamed from: ce.o0 */
/* loaded from: classes2.dex */
public final class C1081o0 extends AbstractC3278a {

    /* renamed from: j */
    public static final a f4065j = new a(null);

    /* renamed from: i */
    public final String f4066i;

    /* renamed from: ce.o0$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC3284g.c<C1081o0> {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    /* renamed from: H0 */
    public final String m4524H0() {
        return this.f4066i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1081o0) && C4753m.m18648a(this.f4066i, ((C1081o0) obj).f4066i);
    }

    public int hashCode() {
        return this.f4066i.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f4066i + ')';
    }
}
