package p193n5;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p126i7.AbstractC2651u;
import p155k7.C3368e;
import p222p5.C4014a;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;
import p290u4.C4881s0;

/* renamed from: n5.x */
/* loaded from: classes.dex */
public final class C3757x implements InterfaceC4436h {

    /* renamed from: j */
    public static final String f13480j = C4041n0.m15478q0(0);

    /* renamed from: k */
    public static final String f13481k = C4041n0.m15478q0(1);

    /* renamed from: l */
    public static final InterfaceC4436h.a<C3757x> f13482l = new InterfaceC4436h.a() { // from class: n5.w
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C3757x m14253c;
            m14253c = C3757x.m14253c(bundle);
            return m14253c;
        }
    };

    /* renamed from: h */
    public final C4881s0 f13483h;

    /* renamed from: i */
    public final AbstractC2651u<Integer> f13484i;

    public C3757x(C4881s0 c4881s0, List<Integer> list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= c4881s0.f18465h)) {
            throw new IndexOutOfBoundsException();
        }
        this.f13483h = c4881s0;
        this.f13484i = AbstractC2651u.m10768p(list);
    }

    /* renamed from: c */
    public static /* synthetic */ C3757x m14253c(Bundle bundle) {
        return new C3757x(C4881s0.f18464o.mo6314a((Bundle) C4014a.m15199e(bundle.getBundle(f13480j))), C3368e.m12524c((int[]) C4014a.m15199e(bundle.getIntArray(f13481k))));
    }

    /* renamed from: b */
    public int m14254b() {
        return this.f13483h.f18467j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3757x.class != obj.getClass()) {
            return false;
        }
        C3757x c3757x = (C3757x) obj;
        return this.f13483h.equals(c3757x.f13483h) && this.f13484i.equals(c3757x.f13484i);
    }

    public int hashCode() {
        return this.f13483h.hashCode() + (this.f13484i.hashCode() * 31);
    }
}
