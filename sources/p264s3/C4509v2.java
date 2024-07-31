package p264s3;

import android.os.Bundle;
import p109h7.C2428k;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: s3.v2 */
/* loaded from: classes.dex */
public final class C4509v2 extends AbstractC4440h3 {

    /* renamed from: k */
    public static final String f16880k = C4041n0.m15478q0(1);

    /* renamed from: l */
    public static final InterfaceC4436h.a<C4509v2> f16881l = new InterfaceC4436h.a() { // from class: s3.u2
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4509v2 m17709d;
            m17709d = C4509v2.m17709d(bundle);
            return m17709d;
        }
    };

    /* renamed from: j */
    public final float f16882j;

    public C4509v2() {
        this.f16882j = -1.0f;
    }

    public C4509v2(float f10) {
        C4014a.m15196b(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f16882j = f10;
    }

    /* renamed from: d */
    public static C4509v2 m17709d(Bundle bundle) {
        C4014a.m15195a(bundle.getInt(AbstractC4440h3.f16295h, -1) == 1);
        float f10 = bundle.getFloat(f16880k, -1.0f);
        return f10 == -1.0f ? new C4509v2() : new C4509v2(f10);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C4509v2) && this.f16882j == ((C4509v2) obj).f16882j;
    }

    public int hashCode() {
        return C2428k.m9689b(Float.valueOf(this.f16882j));
    }
}
