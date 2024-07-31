package p193n5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p126i7.AbstractC2630j0;
import p126i7.AbstractC2651u;
import p126i7.C2610b0;
import p126i7.InterfaceC2626h0;
import p193n5.InterfaceC3752s;
import p206o5.InterfaceC3900e;
import p222p5.C4041n0;
import p222p5.C4046r;
import p222p5.InterfaceC4020d;
import p264s3.AbstractC4505u3;
import p264s3.C4463m1;
import p290u4.C4881s0;
import p290u4.InterfaceC4882t;
import p318w4.AbstractC5274n;
import p318w4.InterfaceC5275o;

/* renamed from: n5.a */
/* loaded from: classes.dex */
public class C3731a extends AbstractC3735c {

    /* renamed from: h */
    public final InterfaceC3900e f13289h;

    /* renamed from: i */
    public final long f13290i;

    /* renamed from: j */
    public final long f13291j;

    /* renamed from: k */
    public final long f13292k;

    /* renamed from: l */
    public final int f13293l;

    /* renamed from: m */
    public final int f13294m;

    /* renamed from: n */
    public final float f13295n;

    /* renamed from: o */
    public final float f13296o;

    /* renamed from: p */
    public final AbstractC2651u<a> f13297p;

    /* renamed from: q */
    public final InterfaceC4020d f13298q;

    /* renamed from: r */
    public float f13299r;

    /* renamed from: s */
    public int f13300s;

    /* renamed from: t */
    public int f13301t;

    /* renamed from: u */
    public long f13302u;

    /* renamed from: v */
    public AbstractC5274n f13303v;

    /* renamed from: n5.a$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f13304a;

        /* renamed from: b */
        public final long f13305b;

        public a(long j10, long j11) {
            this.f13304a = j10;
            this.f13305b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f13304a == aVar.f13304a && this.f13305b == aVar.f13305b;
        }

        public int hashCode() {
            return (((int) this.f13304a) * 31) + ((int) this.f13305b);
        }
    }

    /* renamed from: n5.a$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC3752s.b {

        /* renamed from: a */
        public final int f13306a;

        /* renamed from: b */
        public final int f13307b;

        /* renamed from: c */
        public final int f13308c;

        /* renamed from: d */
        public final int f13309d;

        /* renamed from: e */
        public final int f13310e;

        /* renamed from: f */
        public final float f13311f;

        /* renamed from: g */
        public final float f13312g;

        /* renamed from: h */
        public final InterfaceC4020d f13313h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int i10, int i11, int i12, float f10) {
            this(i10, i11, i12, 1279, 719, f10, 0.75f, InterfaceC4020d.f14458a);
        }

        public b(int i10, int i11, int i12, int i13, int i14, float f10, float f11, InterfaceC4020d interfaceC4020d) {
            this.f13306a = i10;
            this.f13307b = i11;
            this.f13308c = i12;
            this.f13309d = i13;
            this.f13310e = i14;
            this.f13311f = f10;
            this.f13312g = f11;
            this.f13313h = interfaceC4020d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p193n5.InterfaceC3752s.b
        /* renamed from: a */
        public final InterfaceC3752s[] mo14069a(InterfaceC3752s.a[] aVarArr, InterfaceC3900e interfaceC3900e, InterfaceC4882t.b bVar, AbstractC4505u3 abstractC4505u3) {
            AbstractC2651u m14047B = C3731a.m14047B(aVarArr);
            InterfaceC3752s[] interfaceC3752sArr = new InterfaceC3752s[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                InterfaceC3752s.a aVar = aVarArr[i10];
                if (aVar != null) {
                    int[] iArr = aVar.f13467b;
                    if (iArr.length != 0) {
                        interfaceC3752sArr[i10] = iArr.length == 1 ? new C3753t(aVar.f13466a, iArr[0], aVar.f13468c) : m14070b(aVar.f13466a, iArr, aVar.f13468c, interfaceC3900e, (AbstractC2651u) m14047B.get(i10));
                    }
                }
            }
            return interfaceC3752sArr;
        }

        /* renamed from: b */
        public C3731a m14070b(C4881s0 c4881s0, int[] iArr, int i10, InterfaceC3900e interfaceC3900e, AbstractC2651u<a> abstractC2651u) {
            return new C3731a(c4881s0, iArr, i10, interfaceC3900e, this.f13306a, this.f13307b, this.f13308c, this.f13309d, this.f13310e, this.f13311f, this.f13312g, abstractC2651u, this.f13313h);
        }
    }

    public C3731a(C4881s0 c4881s0, int[] iArr, int i10, InterfaceC3900e interfaceC3900e, long j10, long j11, long j12, int i11, int i12, float f10, float f11, List<a> list, InterfaceC4020d interfaceC4020d) {
        super(c4881s0, iArr, i10);
        InterfaceC3900e interfaceC3900e2;
        long j13;
        if (j12 < j10) {
            C4046r.m15529i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            interfaceC3900e2 = interfaceC3900e;
            j13 = j10;
        } else {
            interfaceC3900e2 = interfaceC3900e;
            j13 = j12;
        }
        this.f13289h = interfaceC3900e2;
        this.f13290i = j10 * 1000;
        this.f13291j = j11 * 1000;
        this.f13292k = j13 * 1000;
        this.f13293l = i11;
        this.f13294m = i12;
        this.f13295n = f10;
        this.f13296o = f11;
        this.f13297p = AbstractC2651u.m10768p(list);
        this.f13298q = interfaceC4020d;
        this.f13299r = 1.0f;
        this.f13301t = 0;
        this.f13302u = -9223372036854775807L;
    }

    /* renamed from: B */
    public static AbstractC2651u<AbstractC2651u<a>> m14047B(InterfaceC3752s.a[] aVarArr) {
        AbstractC2651u.a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            if (aVarArr[i10] == null || aVarArr[i10].f13467b.length <= 1) {
                aVar = null;
            } else {
                aVar = AbstractC2651u.m10766n();
                aVar.mo10749a(new a(0L, 0L));
            }
            arrayList.add(aVar);
        }
        long[][] m14048G = m14048G(aVarArr);
        int[] iArr = new int[m14048G.length];
        long[] jArr = new long[m14048G.length];
        for (int i11 = 0; i11 < m14048G.length; i11++) {
            jArr[i11] = m14048G[i11].length == 0 ? 0L : m14048G[i11][0];
        }
        m14051y(arrayList, jArr);
        AbstractC2651u<Integer> m14049H = m14049H(m14048G);
        for (int i12 = 0; i12 < m14049H.size(); i12++) {
            int intValue = m14049H.get(i12).intValue();
            int i13 = iArr[intValue] + 1;
            iArr[intValue] = i13;
            jArr[intValue] = m14048G[intValue][i13];
            m14051y(arrayList, jArr);
        }
        for (int i14 = 0; i14 < aVarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr[i14] = jArr[i14] * 2;
            }
        }
        m14051y(arrayList, jArr);
        AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            AbstractC2651u.a aVar2 = (AbstractC2651u.a) arrayList.get(i15);
            m10766n.mo10749a(aVar2 == null ? AbstractC2651u.m10770u() : aVar2.m10784k());
        }
        return m10766n.m10784k();
    }

    /* renamed from: G */
    public static long[][] m14048G(InterfaceC3752s.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            InterfaceC3752s.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f13467b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f13467b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    long j10 = aVar.f13466a.m19444b(iArr[i11]).f16502o;
                    long[] jArr2 = jArr[i10];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i11] = j10;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    /* renamed from: H */
    public static AbstractC2651u<Integer> m14049H(long[][] jArr) {
        InterfaceC2626h0 mo10628c = AbstractC2630j0.m10624a().m10629a().mo10628c();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            if (jArr[i10].length > 1) {
                int length = jArr[i10].length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    double d10 = 0.0d;
                    if (i11 >= jArr[i10].length) {
                        break;
                    }
                    if (jArr[i10][i11] != -1) {
                        d10 = Math.log(jArr[i10][i11]);
                    }
                    dArr[i11] = d10;
                    i11++;
                }
                int i12 = length - 1;
                double d11 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d12 = dArr[i13];
                    i13++;
                    mo10628c.put(Double.valueOf(d11 == 0.0d ? 1.0d : (((d12 + dArr[i13]) * 0.5d) - dArr[0]) / d11), Integer.valueOf(i10));
                }
            }
        }
        return AbstractC2651u.m10768p(mo10628c.values());
    }

    /* renamed from: y */
    public static void m14051y(List<AbstractC2651u.a<a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            AbstractC2651u.a<a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.mo10749a(new a(j10, jArr[i10]));
            }
        }
    }

    /* renamed from: A */
    public final int m14052A(long j10, long j11) {
        long m14053C = m14053C(j11);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f13318b; i11++) {
            if (j10 == Long.MIN_VALUE || !mo14091i(i11, j10)) {
                C4463m1 mo14087c = mo14087c(i11);
                if (m14068z(mo14087c, mo14087c.f16502o, m14053C)) {
                    return i11;
                }
                i10 = i11;
            }
        }
        return i10;
    }

    /* renamed from: C */
    public final long m14053C(long j10) {
        long m14057I = m14057I(j10);
        if (this.f13297p.isEmpty()) {
            return m14057I;
        }
        int i10 = 1;
        while (i10 < this.f13297p.size() - 1 && this.f13297p.get(i10).f13304a < m14057I) {
            i10++;
        }
        a aVar = this.f13297p.get(i10 - 1);
        a aVar2 = this.f13297p.get(i10);
        long j11 = aVar.f13304a;
        float f10 = ((float) (m14057I - j11)) / ((float) (aVar2.f13304a - j11));
        return aVar.f13305b + (f10 * ((float) (aVar2.f13305b - r2)));
    }

    /* renamed from: D */
    public final long m14054D(List<? extends AbstractC5274n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        AbstractC5274n abstractC5274n = (AbstractC5274n) C2610b0.m10505d(list);
        long j10 = abstractC5274n.f19972g;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = abstractC5274n.f19973h;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    /* renamed from: E */
    public long m14055E() {
        return this.f13292k;
    }

    /* renamed from: F */
    public final long m14056F(InterfaceC5275o[] interfaceC5275oArr, List<? extends AbstractC5274n> list) {
        int i10 = this.f13300s;
        if (i10 < interfaceC5275oArr.length && interfaceC5275oArr[i10].next()) {
            InterfaceC5275o interfaceC5275o = interfaceC5275oArr[this.f13300s];
            return interfaceC5275o.mo4833b() - interfaceC5275o.mo4832a();
        }
        for (InterfaceC5275o interfaceC5275o2 : interfaceC5275oArr) {
            if (interfaceC5275o2.next()) {
                return interfaceC5275o2.mo4833b() - interfaceC5275o2.mo4832a();
            }
        }
        return m14054D(list);
    }

    /* renamed from: I */
    public final long m14057I(long j10) {
        long mo14783g = ((float) this.f13289h.mo14783g()) * this.f13295n;
        if (this.f13289h.m14780b() == -9223372036854775807L || j10 == -9223372036854775807L) {
            return ((float) mo14783g) / this.f13299r;
        }
        float f10 = (float) j10;
        return (((float) mo14783g) * Math.max((f10 / this.f13299r) - ((float) r2), 0.0f)) / f10;
    }

    /* renamed from: J */
    public final long m14058J(long j10, long j11) {
        if (j10 == -9223372036854775807L) {
            return this.f13290i;
        }
        if (j11 != -9223372036854775807L) {
            j10 -= j11;
        }
        return Math.min(((float) j10) * this.f13296o, this.f13290i);
    }

    /* renamed from: K */
    public boolean m14059K(long j10, List<? extends AbstractC5274n> list) {
        long j11 = this.f13302u;
        return j11 == -9223372036854775807L || j10 - j11 >= 1000 || !(list.isEmpty() || ((AbstractC5274n) C2610b0.m10505d(list)).equals(this.f13303v));
    }

    @Override // p193n5.AbstractC3735c, p193n5.InterfaceC3752s
    /* renamed from: f */
    public void mo14060f() {
        this.f13303v = null;
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: g */
    public int mo14061g() {
        return this.f13300s;
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: j */
    public void mo14062j(long j10, long j11, long j12, List<? extends AbstractC5274n> list, InterfaceC5275o[] interfaceC5275oArr) {
        long mo15272b = this.f13298q.mo15272b();
        long m14056F = m14056F(interfaceC5275oArr, list);
        int i10 = this.f13301t;
        if (i10 == 0) {
            this.f13301t = 1;
            this.f13300s = m14052A(mo15272b, m14056F);
            return;
        }
        int i11 = this.f13300s;
        int mo14085a = list.isEmpty() ? -1 : mo14085a(((AbstractC5274n) C2610b0.m10505d(list)).f19969d);
        if (mo14085a != -1) {
            i10 = ((AbstractC5274n) C2610b0.m10505d(list)).f19970e;
            i11 = mo14085a;
        }
        int m14052A = m14052A(mo15272b, m14056F);
        if (!mo14091i(i11, mo15272b)) {
            C4463m1 mo14087c = mo14087c(i11);
            C4463m1 mo14087c2 = mo14087c(m14052A);
            long m14058J = m14058J(j12, m14056F);
            int i12 = mo14087c2.f16502o;
            int i13 = mo14087c.f16502o;
            if ((i12 > i13 && j11 < m14058J) || (i12 < i13 && j11 >= this.f13291j)) {
                m14052A = i11;
            }
        }
        if (m14052A != i11) {
            i10 = 3;
        }
        this.f13301t = i10;
        this.f13300s = m14052A;
    }

    @Override // p193n5.AbstractC3735c, p193n5.InterfaceC3752s
    /* renamed from: l */
    public void mo14063l() {
        this.f13302u = -9223372036854775807L;
        this.f13303v = null;
    }

    @Override // p193n5.AbstractC3735c, p193n5.InterfaceC3752s
    /* renamed from: m */
    public int mo14064m(long j10, List<? extends AbstractC5274n> list) {
        int i10;
        int i11;
        long mo15272b = this.f13298q.mo15272b();
        if (!m14059K(mo15272b, list)) {
            return list.size();
        }
        this.f13302u = mo15272b;
        this.f13303v = list.isEmpty() ? null : (AbstractC5274n) C2610b0.m10505d(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long m15454e0 = C4041n0.m15454e0(list.get(size - 1).f19972g - j10, this.f13299r);
        long m14055E = m14055E();
        if (m15454e0 < m14055E) {
            return size;
        }
        C4463m1 mo14087c = mo14087c(m14052A(mo15272b, m14054D(list)));
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC5274n abstractC5274n = list.get(i12);
            C4463m1 c4463m1 = abstractC5274n.f19969d;
            if (C4041n0.m15454e0(abstractC5274n.f19972g - j10, this.f13299r) >= m14055E && c4463m1.f16502o < mo14087c.f16502o && (i10 = c4463m1.f16512y) != -1 && i10 <= this.f13294m && (i11 = c4463m1.f16511x) != -1 && i11 <= this.f13293l && i10 < mo14087c.f16512y) {
                return i12;
            }
        }
        return size;
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: p */
    public int mo14065p() {
        return this.f13301t;
    }

    @Override // p193n5.AbstractC3735c, p193n5.InterfaceC3752s
    /* renamed from: q */
    public void mo14066q(float f10) {
        this.f13299r = f10;
    }

    @Override // p193n5.InterfaceC3752s
    /* renamed from: r */
    public Object mo14067r() {
        return null;
    }

    /* renamed from: z */
    public boolean m14068z(C4463m1 c4463m1, int i10, long j10) {
        return ((long) i10) <= j10;
    }
}
