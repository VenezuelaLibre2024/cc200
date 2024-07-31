package p193n5;

import android.util.Pair;
import java.util.Arrays;
import p222p5.C4041n0;
import p264s3.AbstractC4505u3;
import p264s3.C4455k3;
import p264s3.InterfaceC4450j3;
import p290u4.C4881s0;
import p290u4.C4885u0;
import p290u4.InterfaceC4882t;

/* renamed from: n5.u */
/* loaded from: classes.dex */
public abstract class AbstractC3754u extends AbstractC3734b0 {

    /* renamed from: c */
    public a f13471c;

    /* renamed from: n5.u$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f13472a;

        /* renamed from: b */
        public final String[] f13473b;

        /* renamed from: c */
        public final int[] f13474c;

        /* renamed from: d */
        public final C4885u0[] f13475d;

        /* renamed from: e */
        public final int[] f13476e;

        /* renamed from: f */
        public final int[][][] f13477f;

        /* renamed from: g */
        public final C4885u0 f13478g;

        public a(String[] strArr, int[] iArr, C4885u0[] c4885u0Arr, int[] iArr2, int[][][] iArr3, C4885u0 c4885u0) {
            this.f13473b = strArr;
            this.f13474c = iArr;
            this.f13475d = c4885u0Arr;
            this.f13477f = iArr3;
            this.f13476e = iArr2;
            this.f13478g = c4885u0;
            this.f13472a = iArr.length;
        }

        /* renamed from: a */
        public int m14244a(int i10, int i11, boolean z10) {
            int i12 = this.f13475d[i10].m19452b(i11).f18465h;
            int[] iArr = new int[i12];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                int m14250g = m14250g(i10, i11, i14);
                if (m14250g == 4 || (z10 && m14250g == 3)) {
                    iArr[i13] = i14;
                    i13++;
                }
            }
            return m14245b(i10, i11, Arrays.copyOf(iArr, i13));
        }

        /* renamed from: b */
        public int m14245b(int i10, int i11, int[] iArr) {
            int i12 = 0;
            int i13 = 16;
            String str = null;
            boolean z10 = false;
            int i14 = 0;
            while (i12 < iArr.length) {
                String str2 = this.f13475d[i10].m19452b(i11).m19444b(iArr[i12]).f16506s;
                int i15 = i14 + 1;
                if (i14 == 0) {
                    str = str2;
                } else {
                    z10 |= !C4041n0.m15449c(str, str2);
                }
                i13 = Math.min(i13, InterfaceC4450j3.m17373u(this.f13477f[i10][i11][i12]));
                i12++;
                i14 = i15;
            }
            return z10 ? Math.min(i13, this.f13476e[i10]) : i13;
        }

        /* renamed from: c */
        public int m14246c(int i10, int i11, int i12) {
            return this.f13477f[i10][i11][i12];
        }

        /* renamed from: d */
        public int m14247d() {
            return this.f13472a;
        }

        /* renamed from: e */
        public int m14248e(int i10) {
            return this.f13474c[i10];
        }

        /* renamed from: f */
        public C4885u0 m14249f(int i10) {
            return this.f13475d[i10];
        }

        /* renamed from: g */
        public int m14250g(int i10, int i11, int i12) {
            return InterfaceC4450j3.m17367G(m14246c(i10, i11, i12));
        }

        /* renamed from: h */
        public C4885u0 m14251h() {
            return this.f13478g;
        }
    }

    /* renamed from: i */
    public static int m14241i(InterfaceC4450j3[] interfaceC4450j3Arr, C4881s0 c4881s0, int[] iArr, boolean z10) {
        int length = interfaceC4450j3Arr.length;
        boolean z11 = true;
        int i10 = 0;
        for (int i11 = 0; i11 < interfaceC4450j3Arr.length; i11++) {
            InterfaceC4450j3 interfaceC4450j3 = interfaceC4450j3Arr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < c4881s0.f18465h; i13++) {
                i12 = Math.max(i12, InterfaceC4450j3.m17367G(interfaceC4450j3.mo6372a(c4881s0.m19444b(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    /* renamed from: j */
    public static int[] m14242j(InterfaceC4450j3 interfaceC4450j3, C4881s0 c4881s0) {
        int[] iArr = new int[c4881s0.f18465h];
        for (int i10 = 0; i10 < c4881s0.f18465h; i10++) {
            iArr[i10] = interfaceC4450j3.mo6372a(c4881s0.m19444b(i10));
        }
        return iArr;
    }

    /* renamed from: k */
    public static int[] m14243k(InterfaceC4450j3[] interfaceC4450j3Arr) {
        int length = interfaceC4450j3Arr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = interfaceC4450j3Arr[i10].mo11678w();
        }
        return iArr;
    }

    @Override // p193n5.AbstractC3734b0
    /* renamed from: e */
    public final void mo14078e(Object obj) {
        this.f13471c = (a) obj;
    }

    @Override // p193n5.AbstractC3734b0
    /* renamed from: g */
    public final C3736c0 mo14080g(InterfaceC4450j3[] interfaceC4450j3Arr, C4885u0 c4885u0, InterfaceC4882t.b bVar, AbstractC4505u3 abstractC4505u3) {
        int[] iArr = new int[interfaceC4450j3Arr.length + 1];
        int length = interfaceC4450j3Arr.length + 1;
        C4881s0[][] c4881s0Arr = new C4881s0[length];
        int[][][] iArr2 = new int[interfaceC4450j3Arr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = c4885u0.f18478h;
            c4881s0Arr[i10] = new C4881s0[i11];
            iArr2[i10] = new int[i11];
        }
        int[] m14243k = m14243k(interfaceC4450j3Arr);
        for (int i12 = 0; i12 < c4885u0.f18478h; i12++) {
            C4881s0 m19452b = c4885u0.m19452b(i12);
            int m14241i = m14241i(interfaceC4450j3Arr, m19452b, iArr, m19452b.f18467j == 5);
            int[] m14242j = m14241i == interfaceC4450j3Arr.length ? new int[m19452b.f18465h] : m14242j(interfaceC4450j3Arr[m14241i], m19452b);
            int i13 = iArr[m14241i];
            c4881s0Arr[m14241i][i13] = m19452b;
            iArr2[m14241i][i13] = m14242j;
            iArr[m14241i] = iArr[m14241i] + 1;
        }
        C4885u0[] c4885u0Arr = new C4885u0[interfaceC4450j3Arr.length];
        String[] strArr = new String[interfaceC4450j3Arr.length];
        int[] iArr3 = new int[interfaceC4450j3Arr.length];
        for (int i14 = 0; i14 < interfaceC4450j3Arr.length; i14++) {
            int i15 = iArr[i14];
            c4885u0Arr[i14] = new C4885u0((C4881s0[]) C4041n0.m15406G0(c4881s0Arr[i14], i15));
            iArr2[i14] = (int[][]) C4041n0.m15406G0(iArr2[i14], i15);
            strArr[i14] = interfaceC4450j3Arr[i14].mo6374b();
            iArr3[i14] = interfaceC4450j3Arr[i14].mo17215i();
        }
        a aVar = new a(strArr, iArr3, c4885u0Arr, m14243k, iArr2, new C4885u0((C4881s0[]) C4041n0.m15406G0(c4881s0Arr[interfaceC4450j3Arr.length], iArr[interfaceC4450j3Arr.length])));
        Pair<C4455k3[], InterfaceC3752s[]> mo14136l = mo14136l(aVar, iArr2, m14243k, bVar, abstractC4505u3);
        return new C3736c0((C4455k3[]) mo14136l.first, (InterfaceC3752s[]) mo14136l.second, C3732a0.m14072b(aVar, (InterfaceC3755v[]) mo14136l.second), aVar);
    }

    /* renamed from: l */
    public abstract Pair<C4455k3[], InterfaceC3752s[]> mo14136l(a aVar, int[][][] iArr, int[] iArr2, InterfaceC4882t.b bVar, AbstractC4505u3 abstractC4505u3);
}
