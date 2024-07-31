package p264s3;

import android.os.Bundle;
import p109h7.C2428k;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: s3.o3 */
/* loaded from: classes.dex */
public final class C4475o3 extends AbstractC4440h3 {

    /* renamed from: l */
    public static final String f16578l = C4041n0.m15478q0(1);

    /* renamed from: m */
    public static final String f16579m = C4041n0.m15478q0(2);

    /* renamed from: n */
    public static final InterfaceC4436h.a<C4475o3> f16580n = C4470n3.f16563a;

    /* renamed from: j */
    public final int f16581j;

    /* renamed from: k */
    public final float f16582k;

    public C4475o3(int i10) {
        C4014a.m15196b(i10 > 0, "maxStars must be a positive integer");
        this.f16581j = i10;
        this.f16582k = -1.0f;
    }

    public C4475o3(int i10, float f10) {
        C4014a.m15196b(i10 > 0, "maxStars must be a positive integer");
        C4014a.m15196b(f10 >= 0.0f && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f16581j = i10;
        this.f16582k = f10;
    }

    /* renamed from: d */
    public static C4475o3 m17487d(Bundle bundle) {
        C4014a.m15195a(bundle.getInt(AbstractC4440h3.f16295h, -1) == 2);
        int i10 = bundle.getInt(f16578l, 5);
        float f10 = bundle.getFloat(f16579m, -1.0f);
        return f10 == -1.0f ? new C4475o3(i10) : new C4475o3(i10, f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4475o3)) {
            return false;
        }
        C4475o3 c4475o3 = (C4475o3) obj;
        return this.f16581j == c4475o3.f16581j && this.f16582k == c4475o3.f16582k;
    }

    public int hashCode() {
        return C2428k.m9689b(Integer.valueOf(this.f16581j), Float.valueOf(this.f16582k));
    }
}
