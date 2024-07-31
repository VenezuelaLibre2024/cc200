package p264s3;

import android.os.Bundle;
import p109h7.C2428k;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: s3.s3 */
/* loaded from: classes.dex */
public final class C4495s3 extends AbstractC4440h3 {

    /* renamed from: l */
    public static final String f16691l = C4041n0.m15478q0(1);

    /* renamed from: m */
    public static final String f16692m = C4041n0.m15478q0(2);

    /* renamed from: n */
    public static final InterfaceC4436h.a<C4495s3> f16693n = new InterfaceC4436h.a() { // from class: s3.r3
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4495s3 m17593d;
            m17593d = C4495s3.m17593d(bundle);
            return m17593d;
        }
    };

    /* renamed from: j */
    public final boolean f16694j;

    /* renamed from: k */
    public final boolean f16695k;

    public C4495s3() {
        this.f16694j = false;
        this.f16695k = false;
    }

    public C4495s3(boolean z10) {
        this.f16694j = true;
        this.f16695k = z10;
    }

    /* renamed from: d */
    public static C4495s3 m17593d(Bundle bundle) {
        C4014a.m15195a(bundle.getInt(AbstractC4440h3.f16295h, -1) == 3);
        return bundle.getBoolean(f16691l, false) ? new C4495s3(bundle.getBoolean(f16692m, false)) : new C4495s3();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4495s3)) {
            return false;
        }
        C4495s3 c4495s3 = (C4495s3) obj;
        return this.f16695k == c4495s3.f16695k && this.f16694j == c4495s3.f16694j;
    }

    public int hashCode() {
        return C2428k.m9689b(Boolean.valueOf(this.f16694j), Boolean.valueOf(this.f16695k));
    }
}
