package p236q5;

import android.os.Bundle;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;

/* renamed from: q5.y */
/* loaded from: classes.dex */
public final class C4192y implements InterfaceC4436h {

    /* renamed from: l */
    public static final C4192y f15133l = new C4192y(0, 0);

    /* renamed from: m */
    public static final String f15134m = C4041n0.m15478q0(0);

    /* renamed from: n */
    public static final String f15135n = C4041n0.m15478q0(1);

    /* renamed from: o */
    public static final String f15136o = C4041n0.m15478q0(2);

    /* renamed from: p */
    public static final String f15137p = C4041n0.m15478q0(3);

    /* renamed from: q */
    public static final InterfaceC4436h.a<C4192y> f15138q = new InterfaceC4436h.a() { // from class: q5.x
        @Override // p264s3.InterfaceC4436h.a
        /* renamed from: a */
        public final InterfaceC4436h mo6314a(Bundle bundle) {
            C4192y m16174b;
            m16174b = C4192y.m16174b(bundle);
            return m16174b;
        }
    };

    /* renamed from: h */
    public final int f15139h;

    /* renamed from: i */
    public final int f15140i;

    /* renamed from: j */
    public final int f15141j;

    /* renamed from: k */
    public final float f15142k;

    public C4192y(int i10, int i11) {
        this(i10, i11, 0, 1.0f);
    }

    public C4192y(int i10, int i11, int i12, float f10) {
        this.f15139h = i10;
        this.f15140i = i11;
        this.f15141j = i12;
        this.f15142k = f10;
    }

    /* renamed from: b */
    public static /* synthetic */ C4192y m16174b(Bundle bundle) {
        return new C4192y(bundle.getInt(f15134m, 0), bundle.getInt(f15135n, 0), bundle.getInt(f15136o, 0), bundle.getFloat(f15137p, 1.0f));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4192y)) {
            return false;
        }
        C4192y c4192y = (C4192y) obj;
        return this.f15139h == c4192y.f15139h && this.f15140i == c4192y.f15140i && this.f15141j == c4192y.f15141j && this.f15142k == c4192y.f15142k;
    }

    public int hashCode() {
        return ((((((217 + this.f15139h) * 31) + this.f15140i) * 31) + this.f15141j) * 31) + Float.floatToRawIntBits(this.f15142k);
    }
}
