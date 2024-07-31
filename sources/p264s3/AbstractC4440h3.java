package p264s3;

import android.os.Bundle;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: s3.h3 */
/* loaded from: classes.dex */
public abstract class AbstractC4440h3 implements InterfaceC4436h {

    /* renamed from: h */
    public static final String f16295h = C4041n0.m15478q0(0);

    /* renamed from: i */
    public static final InterfaceC4436h.a<AbstractC4440h3> f16296i = new InterfaceC4436h.a() { // from class: s3.g3
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            AbstractC4440h3 m17225b;
            m17225b = AbstractC4440h3.m17225b(bundle);
            return m17225b;
        }
    };

    /* renamed from: b */
    public static AbstractC4440h3 m17225b(Bundle bundle) {
        InterfaceC4436h.a aVar;
        int i10 = bundle.getInt(f16295h, -1);
        if (i10 == 0) {
            aVar = C4478p1.f16588n;
        } else if (i10 == 1) {
            aVar = C4509v2.f16881l;
        } else if (i10 == 2) {
            aVar = C4475o3.f16580n;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException("Unknown RatingType: " + i10);
            }
            aVar = C4495s3.f16693n;
        }
        return (AbstractC4440h3) aVar.mo6314a(bundle);
    }
}
