package p264s3;

import android.os.Bundle;
import p109h7.C2428k;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: s3.p1 */
/* loaded from: classes.dex */
public final class C4478p1 extends AbstractC4440h3 {

    /* renamed from: l */
    public static final String f16586l = C4041n0.m15478q0(1);

    /* renamed from: m */
    public static final String f16587m = C4041n0.m15478q0(2);

    /* renamed from: n */
    public static final InterfaceC4436h.a<C4478p1> f16588n = new InterfaceC4436h.a() { // from class: s3.o1
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4478p1 m17489d;
            m17489d = C4478p1.m17489d(bundle);
            return m17489d;
        }
    };

    /* renamed from: j */
    public final boolean f16589j;

    /* renamed from: k */
    public final boolean f16590k;

    public C4478p1() {
        this.f16589j = false;
        this.f16590k = false;
    }

    public C4478p1(boolean z10) {
        this.f16589j = true;
        this.f16590k = z10;
    }

    /* renamed from: d */
    public static C4478p1 m17489d(Bundle bundle) {
        C4014a.m15195a(bundle.getInt(AbstractC4440h3.f16295h, -1) == 0);
        return bundle.getBoolean(f16586l, false) ? new C4478p1(bundle.getBoolean(f16587m, false)) : new C4478p1();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4478p1)) {
            return false;
        }
        C4478p1 c4478p1 = (C4478p1) obj;
        return this.f16590k == c4478p1.f16590k && this.f16589j == c4478p1.f16589j;
    }

    public int hashCode() {
        return C2428k.m9689b(Boolean.valueOf(this.f16589j), Boolean.valueOf(this.f16590k));
    }
}
