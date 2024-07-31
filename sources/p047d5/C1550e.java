package p047d5;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p126i7.AbstractC2651u;
import p222p5.C4018c;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: d5.e */
/* loaded from: classes.dex */
public final class C1550e implements InterfaceC4436h {

    /* renamed from: j */
    public static final C1550e f5816j = new C1550e(AbstractC2651u.m10770u(), 0);

    /* renamed from: k */
    public static final String f5817k = C4041n0.m15478q0(0);

    /* renamed from: l */
    public static final String f5818l = C4041n0.m15478q0(1);

    /* renamed from: m */
    public static final InterfaceC4436h.a<C1550e> f5819m = new InterfaceC4436h.a() { // from class: d5.d
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C1550e m6339b;
            m6339b = C1550e.m6339b(bundle);
            return m6339b;
        }
    };

    /* renamed from: h */
    public final AbstractC2651u<C1547b> f5820h;

    /* renamed from: i */
    public final long f5821i;

    public C1550e(List<C1547b> list, long j10) {
        this.f5820h = AbstractC2651u.m10768p(list);
        this.f5821i = j10;
    }

    /* renamed from: b */
    public static final C1550e m6339b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f5817k);
        return new C1550e(parcelableArrayList == null ? AbstractC2651u.m10770u() : C4018c.m15267b(C1547b.f5778Q, parcelableArrayList), bundle.getLong(f5818l));
    }
}
