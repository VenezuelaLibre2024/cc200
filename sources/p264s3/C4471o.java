package p264s3;

import android.os.Bundle;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: s3.o */
/* loaded from: classes.dex */
public final class C4471o implements InterfaceC4436h {

    /* renamed from: k */
    public static final C4471o f16564k = new C4471o(0, 0, 0);

    /* renamed from: l */
    public static final String f16565l = C4041n0.m15478q0(0);

    /* renamed from: m */
    public static final String f16566m = C4041n0.m15478q0(1);

    /* renamed from: n */
    public static final String f16567n = C4041n0.m15478q0(2);

    /* renamed from: o */
    public static final InterfaceC4436h.a<C4471o> f16568o = new InterfaceC4436h.a() { // from class: s3.n
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4471o m17485b;
            m17485b = C4471o.m17485b(bundle);
            return m17485b;
        }
    };

    /* renamed from: h */
    public final int f16569h;

    /* renamed from: i */
    public final int f16570i;

    /* renamed from: j */
    public final int f16571j;

    public C4471o(int i10, int i11, int i12) {
        this.f16569h = i10;
        this.f16570i = i11;
        this.f16571j = i12;
    }

    /* renamed from: b */
    public static /* synthetic */ C4471o m17485b(Bundle bundle) {
        return new C4471o(bundle.getInt(f16565l, 0), bundle.getInt(f16566m, 0), bundle.getInt(f16567n, 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4471o)) {
            return false;
        }
        C4471o c4471o = (C4471o) obj;
        return this.f16569h == c4471o.f16569h && this.f16570i == c4471o.f16570i && this.f16571j == c4471o.f16571j;
    }

    public int hashCode() {
        return ((((527 + this.f16569h) * 31) + this.f16570i) * 31) + this.f16571j;
    }
}
