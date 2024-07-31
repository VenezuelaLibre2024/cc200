package p290u4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p126i7.AbstractC2651u;
import p222p5.C4014a;
import p222p5.C4018c;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.C4050v;
import p264s3.C4463m1;
import p264s3.InterfaceC4436h;

/* renamed from: u4.s0 */
/* loaded from: classes.dex */
public final class C4881s0 implements InterfaceC4436h {

    /* renamed from: m */
    public static final String f18462m = C4041n0.m15478q0(0);

    /* renamed from: n */
    public static final String f18463n = C4041n0.m15478q0(1);

    /* renamed from: o */
    public static final InterfaceC4436h.a<C4881s0> f18464o = C4879r0.f18456a;

    /* renamed from: h */
    public final int f18465h;

    /* renamed from: i */
    public final String f18466i;

    /* renamed from: j */
    public final int f18467j;

    /* renamed from: k */
    public final C4463m1[] f18468k;

    /* renamed from: l */
    public int f18469l;

    public C4881s0(String str, C4463m1... c4463m1Arr) {
        C4014a.m15195a(c4463m1Arr.length > 0);
        this.f18466i = str;
        this.f18468k = c4463m1Arr;
        this.f18465h = c4463m1Arr.length;
        int m15554k = C4050v.m15554k(c4463m1Arr[0].f16506s);
        this.f18467j = m15554k == -1 ? C4050v.m15554k(c4463m1Arr[0].f16505r) : m15554k;
        m19446h();
    }

    public C4881s0(C4463m1... c4463m1Arr) {
        this("", c4463m1Arr);
    }

    /* renamed from: d */
    public static /* synthetic */ C4881s0 m19440d(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f18462m);
        return new C4881s0(bundle.getString(f18463n, ""), (C4463m1[]) (parcelableArrayList == null ? AbstractC2651u.m10770u() : C4018c.m15267b(C4463m1.f16479w0, parcelableArrayList)).toArray(new C4463m1[0]));
    }

    /* renamed from: e */
    public static void m19441e(String str, String str2, String str3, int i10) {
        C4046r.m15524d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    /* renamed from: f */
    public static String m19442f(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    /* renamed from: g */
    public static int m19443g(int i10) {
        return i10 | 16384;
    }

    /* renamed from: b */
    public C4463m1 m19444b(int i10) {
        return this.f18468k[i10];
    }

    /* renamed from: c */
    public int m19445c(C4463m1 c4463m1) {
        int i10 = 0;
        while (true) {
            C4463m1[] c4463m1Arr = this.f18468k;
            if (i10 >= c4463m1Arr.length) {
                return -1;
            }
            if (c4463m1 == c4463m1Arr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4881s0.class != obj.getClass()) {
            return false;
        }
        C4881s0 c4881s0 = (C4881s0) obj;
        return this.f18466i.equals(c4881s0.f18466i) && Arrays.equals(this.f18468k, c4881s0.f18468k);
    }

    /* renamed from: h */
    public final void m19446h() {
        String m19442f = m19442f(this.f18468k[0].f16497j);
        int m19443g = m19443g(this.f18468k[0].f16499l);
        int i10 = 1;
        while (true) {
            C4463m1[] c4463m1Arr = this.f18468k;
            if (i10 >= c4463m1Arr.length) {
                return;
            }
            if (!m19442f.equals(m19442f(c4463m1Arr[i10].f16497j))) {
                C4463m1[] c4463m1Arr2 = this.f18468k;
                m19441e("languages", c4463m1Arr2[0].f16497j, c4463m1Arr2[i10].f16497j, i10);
                return;
            } else {
                if (m19443g != m19443g(this.f18468k[i10].f16499l)) {
                    m19441e("role flags", Integer.toBinaryString(this.f18468k[0].f16499l), Integer.toBinaryString(this.f18468k[i10].f16499l), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public int hashCode() {
        if (this.f18469l == 0) {
            this.f18469l = ((527 + this.f18466i.hashCode()) * 31) + Arrays.hashCode(this.f18468k);
        }
        return this.f18469l;
    }
}
