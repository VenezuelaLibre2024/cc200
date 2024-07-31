package p264s3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p109h7.C2426i;
import p126i7.AbstractC2651u;
import p155k7.C3364a;
import p222p5.C4014a;
import p222p5.C4018c;
import p222p5.C4041n0;
import p264s3.InterfaceC4436h;
import p290u4.C4881s0;

/* renamed from: s3.z3 */
/* loaded from: classes.dex */
public final class C4530z3 implements InterfaceC4436h {

    /* renamed from: i */
    public static final C4530z3 f17110i = new C4530z3(AbstractC2651u.m10770u());

    /* renamed from: j */
    public static final String f17111j = C4041n0.m15478q0(0);

    /* renamed from: k */
    public static final InterfaceC4436h.a<C4530z3> f17112k = C4520x3.f16980a;

    /* renamed from: h */
    public final AbstractC2651u<a> f17113h;

    /* renamed from: s3.z3$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC4436h {

        /* renamed from: m */
        public static final String f17114m = C4041n0.m15478q0(0);

        /* renamed from: n */
        public static final String f17115n = C4041n0.m15478q0(1);

        /* renamed from: o */
        public static final String f17116o = C4041n0.m15478q0(3);

        /* renamed from: p */
        public static final String f17117p = C4041n0.m15478q0(4);

        /* renamed from: q */
        public static final InterfaceC4436h.a<a> f17118q = C4525y3.f17004a;

        /* renamed from: h */
        public final int f17119h;

        /* renamed from: i */
        public final C4881s0 f17120i;

        /* renamed from: j */
        public final boolean f17121j;

        /* renamed from: k */
        public final int[] f17122k;

        /* renamed from: l */
        public final boolean[] f17123l;

        public a(C4881s0 c4881s0, boolean z10, int[] iArr, boolean[] zArr) {
            int i10 = c4881s0.f18465h;
            this.f17119h = i10;
            boolean z11 = false;
            C4014a.m15195a(i10 == iArr.length && i10 == zArr.length);
            this.f17120i = c4881s0;
            if (z10 && i10 > 1) {
                z11 = true;
            }
            this.f17121j = z11;
            this.f17122k = (int[]) iArr.clone();
            this.f17123l = (boolean[]) zArr.clone();
        }

        /* renamed from: f */
        public static /* synthetic */ a m17949f(Bundle bundle) {
            C4881s0 mo6314a = C4881s0.f18464o.mo6314a((Bundle) C4014a.m15199e(bundle.getBundle(f17114m)));
            return new a(mo6314a, bundle.getBoolean(f17117p, false), (int[]) C2426i.m9681a(bundle.getIntArray(f17115n), new int[mo6314a.f18465h]), (boolean[]) C2426i.m9681a(bundle.getBooleanArray(f17116o), new boolean[mo6314a.f18465h]));
        }

        /* renamed from: b */
        public C4463m1 m17950b(int i10) {
            return this.f17120i.m19444b(i10);
        }

        /* renamed from: c */
        public int m17951c() {
            return this.f17120i.f18467j;
        }

        /* renamed from: d */
        public boolean m17952d() {
            return C3364a.m12517b(this.f17123l, true);
        }

        /* renamed from: e */
        public boolean m17953e(int i10) {
            return this.f17123l[i10];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17121j == aVar.f17121j && this.f17120i.equals(aVar.f17120i) && Arrays.equals(this.f17122k, aVar.f17122k) && Arrays.equals(this.f17123l, aVar.f17123l);
        }

        public int hashCode() {
            return (((((this.f17120i.hashCode() * 31) + (this.f17121j ? 1 : 0)) * 31) + Arrays.hashCode(this.f17122k)) * 31) + Arrays.hashCode(this.f17123l);
        }
    }

    public C4530z3(List<a> list) {
        this.f17113h = AbstractC2651u.m10768p(list);
    }

    /* renamed from: d */
    public static /* synthetic */ C4530z3 m17945d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f17111j);
        return new C4530z3(parcelableArrayList == null ? AbstractC2651u.m10770u() : C4018c.m15267b(a.f17118q, parcelableArrayList));
    }

    /* renamed from: b */
    public AbstractC2651u<a> m17946b() {
        return this.f17113h;
    }

    /* renamed from: c */
    public boolean m17947c(int i10) {
        for (int i11 = 0; i11 < this.f17113h.size(); i11++) {
            a aVar = this.f17113h.get(i11);
            if (aVar.m17952d() && aVar.m17951c() == i10) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4530z3.class != obj.getClass()) {
            return false;
        }
        return this.f17113h.equals(((C4530z3) obj).f17113h);
    }

    public int hashCode() {
        return this.f17113h.hashCode();
    }
}
