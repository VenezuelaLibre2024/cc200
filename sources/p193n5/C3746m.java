package p193n5;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import p079f6.C1841a;
import p109h7.InterfaceC2433p;
import p126i7.AbstractC2637n;
import p126i7.AbstractC2642p0;
import p126i7.AbstractC2651u;
import p155k7.C3368e;
import p193n5.AbstractC3754u;
import p193n5.C3731a;
import p193n5.C3746m;
import p193n5.C3759z;
import p193n5.InterfaceC3752s;
import p222p5.C4014a;
import p222p5.C4018c;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.AbstractC4505u3;
import p264s3.C4455k3;
import p264s3.C4463m1;
import p264s3.InterfaceC4436h;
import p264s3.InterfaceC4450j3;
import p289u3.C4813e;
import p290u4.C4881s0;
import p290u4.C4885u0;
import p290u4.InterfaceC4882t;

/* renamed from: n5.m */
/* loaded from: classes.dex */
public class C3746m extends AbstractC3754u {

    /* renamed from: k */
    public static final AbstractC2642p0<Integer> f13342k = AbstractC2642p0.m10724a(new Comparator() { // from class: n5.f
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m14109M;
            m14109M = C3746m.m14109M((Integer) obj, (Integer) obj2);
            return m14109M;
        }
    });

    /* renamed from: l */
    public static final AbstractC2642p0<Integer> f13343l = AbstractC2642p0.m10724a(new Comparator() { // from class: n5.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m14110N;
            m14110N = C3746m.m14110N((Integer) obj, (Integer) obj2);
            return m14110N;
        }
    });

    /* renamed from: d */
    public final Object f13344d;

    /* renamed from: e */
    public final Context f13345e;

    /* renamed from: f */
    public final InterfaceC3752s.b f13346f;

    /* renamed from: g */
    public final boolean f13347g;

    /* renamed from: h */
    public d f13348h;

    /* renamed from: i */
    public f f13349i;

    /* renamed from: j */
    public C4813e f13350j;

    /* renamed from: n5.m$b */
    /* loaded from: classes.dex */
    public static final class b extends h<b> implements Comparable<b> {

        /* renamed from: A */
        public final int f13351A;

        /* renamed from: B */
        public final boolean f13352B;

        /* renamed from: C */
        public final boolean f13353C;

        /* renamed from: l */
        public final int f13354l;

        /* renamed from: m */
        public final boolean f13355m;

        /* renamed from: n */
        public final String f13356n;

        /* renamed from: o */
        public final d f13357o;

        /* renamed from: p */
        public final boolean f13358p;

        /* renamed from: q */
        public final int f13359q;

        /* renamed from: r */
        public final int f13360r;

        /* renamed from: s */
        public final int f13361s;

        /* renamed from: t */
        public final boolean f13362t;

        /* renamed from: u */
        public final int f13363u;

        /* renamed from: v */
        public final int f13364v;

        /* renamed from: w */
        public final boolean f13365w;

        /* renamed from: x */
        public final int f13366x;

        /* renamed from: y */
        public final int f13367y;

        /* renamed from: z */
        public final int f13368z;

        public b(int i10, C4881s0 c4881s0, int i11, d dVar, int i12, boolean z10, InterfaceC2433p<C4463m1> interfaceC2433p) {
            super(i10, c4881s0, i11);
            int i13;
            int i14;
            int i15;
            this.f13357o = dVar;
            this.f13356n = C3746m.m14112Q(this.f13446k.f16497j);
            this.f13358p = C3746m.m14105I(i12, false);
            int i16 = 0;
            while (true) {
                int size = dVar.f13535u.size();
                i13 = C1841a.e.API_PRIORITY_OTHER;
                if (i16 >= size) {
                    i14 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                } else {
                    i14 = C3746m.m14099B(this.f13446k, dVar.f13535u.get(i16), false);
                    if (i14 > 0) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
            this.f13360r = i16;
            this.f13359q = i14;
            this.f13361s = C3746m.m14102E(this.f13446k.f16499l, dVar.f13536v);
            C4463m1 c4463m1 = this.f13446k;
            int i17 = c4463m1.f16499l;
            this.f13362t = i17 == 0 || (i17 & 1) != 0;
            this.f13365w = (c4463m1.f16498k & 1) != 0;
            int i18 = c4463m1.f16485F;
            this.f13366x = i18;
            this.f13367y = c4463m1.f16486G;
            int i19 = c4463m1.f16502o;
            this.f13368z = i19;
            this.f13355m = (i19 == -1 || i19 <= dVar.f13538x) && (i18 == -1 || i18 <= dVar.f13537w) && interfaceC2433p.apply(c4463m1);
            String[] m15458g0 = C4041n0.m15458g0();
            int i20 = 0;
            while (true) {
                if (i20 >= m15458g0.length) {
                    i15 = 0;
                    i20 = Integer.MAX_VALUE;
                    break;
                } else {
                    i15 = C3746m.m14099B(this.f13446k, m15458g0[i20], false);
                    if (i15 > 0) {
                        break;
                    } else {
                        i20++;
                    }
                }
            }
            this.f13363u = i20;
            this.f13364v = i15;
            int i21 = 0;
            while (true) {
                if (i21 < dVar.f13539y.size()) {
                    String str = this.f13446k.f16506s;
                    if (str != null && str.equals(dVar.f13539y.get(i21))) {
                        i13 = i21;
                        break;
                    }
                    i21++;
                } else {
                    break;
                }
            }
            this.f13351A = i13;
            this.f13352B = InterfaceC4450j3.m17368k(i12) == 128;
            this.f13353C = InterfaceC4450j3.m17370o(i12) == 64;
            this.f13354l = m14142l(i12, z10);
        }

        /* renamed from: f */
        public static int m14137f(List<b> list, List<b> list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        /* renamed from: i */
        public static AbstractC2651u<b> m14138i(int i10, C4881s0 c4881s0, d dVar, int[] iArr, boolean z10, InterfaceC2433p<C4463m1> interfaceC2433p) {
            AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
            for (int i11 = 0; i11 < c4881s0.f18465h; i11++) {
                m10766n.mo10749a(new b(i10, c4881s0, i11, dVar, iArr[i11], z10, interfaceC2433p));
            }
            return m10766n.m10784k();
        }

        @Override // p193n5.C3746m.h
        /* renamed from: b */
        public int mo14139b() {
            return this.f13354l;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            AbstractC2642p0 mo10700f = (this.f13355m && this.f13358p) ? C3746m.f13342k : C3746m.f13342k.mo10700f();
            AbstractC2637n mo10708f = AbstractC2637n.m10705j().mo10709g(this.f13358p, bVar.f13358p).mo10708f(Integer.valueOf(this.f13360r), Integer.valueOf(bVar.f13360r), AbstractC2642p0.m10725c().mo10700f()).mo10706d(this.f13359q, bVar.f13359q).mo10706d(this.f13361s, bVar.f13361s).mo10709g(this.f13365w, bVar.f13365w).mo10709g(this.f13362t, bVar.f13362t).mo10708f(Integer.valueOf(this.f13363u), Integer.valueOf(bVar.f13363u), AbstractC2642p0.m10725c().mo10700f()).mo10706d(this.f13364v, bVar.f13364v).mo10709g(this.f13355m, bVar.f13355m).mo10708f(Integer.valueOf(this.f13351A), Integer.valueOf(bVar.f13351A), AbstractC2642p0.m10725c().mo10700f()).mo10708f(Integer.valueOf(this.f13368z), Integer.valueOf(bVar.f13368z), this.f13357o.f13518D ? C3746m.f13342k.mo10700f() : C3746m.f13343l).mo10709g(this.f13352B, bVar.f13352B).mo10709g(this.f13353C, bVar.f13353C).mo10708f(Integer.valueOf(this.f13366x), Integer.valueOf(bVar.f13366x), mo10700f).mo10708f(Integer.valueOf(this.f13367y), Integer.valueOf(bVar.f13367y), mo10700f);
            Integer valueOf = Integer.valueOf(this.f13368z);
            Integer valueOf2 = Integer.valueOf(bVar.f13368z);
            if (!C4041n0.m15449c(this.f13356n, bVar.f13356n)) {
                mo10700f = C3746m.f13343l;
            }
            return mo10708f.mo10708f(valueOf, valueOf2, mo10700f).mo10711i();
        }

        /* renamed from: l */
        public final int m14142l(int i10, boolean z10) {
            if (!C3746m.m14105I(i10, this.f13357o.f13401u0)) {
                return 0;
            }
            if (!this.f13355m && !this.f13357o.f13395o0) {
                return 0;
            }
            if (C3746m.m14105I(i10, false) && this.f13355m && this.f13446k.f16502o != -1) {
                d dVar = this.f13357o;
                if (!dVar.f13519E && !dVar.f13518D && (dVar.f13403w0 || !z10)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p193n5.C3746m.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean mo14140c(b bVar) {
            int i10;
            String str;
            int i11;
            d dVar = this.f13357o;
            if ((dVar.f13398r0 || ((i11 = this.f13446k.f16485F) != -1 && i11 == bVar.f13446k.f16485F)) && (dVar.f13396p0 || ((str = this.f13446k.f16506s) != null && TextUtils.equals(str, bVar.f13446k.f16506s)))) {
                d dVar2 = this.f13357o;
                if ((dVar2.f13397q0 || ((i10 = this.f13446k.f16486G) != -1 && i10 == bVar.f13446k.f16486G)) && (dVar2.f13399s0 || (this.f13352B == bVar.f13352B && this.f13353C == bVar.f13353C))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: n5.m$c */
    /* loaded from: classes.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: h */
        public final boolean f13369h;

        /* renamed from: i */
        public final boolean f13370i;

        public c(C4463m1 c4463m1, int i10) {
            this.f13369h = (c4463m1.f16498k & 1) != 0;
            this.f13370i = C3746m.m14105I(i10, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return AbstractC2637n.m10705j().mo10709g(this.f13370i, cVar.f13370i).mo10709g(this.f13369h, cVar.f13369h).mo10711i();
        }
    }

    /* renamed from: n5.m$d */
    /* loaded from: classes.dex */
    public static final class d extends C3759z {

        /* renamed from: A0 */
        @Deprecated
        public static final d f13371A0;

        /* renamed from: B0 */
        public static final String f13372B0;

        /* renamed from: C0 */
        public static final String f13373C0;

        /* renamed from: D0 */
        public static final String f13374D0;

        /* renamed from: E0 */
        public static final String f13375E0;

        /* renamed from: F0 */
        public static final String f13376F0;

        /* renamed from: G0 */
        public static final String f13377G0;

        /* renamed from: H0 */
        public static final String f13378H0;

        /* renamed from: I0 */
        public static final String f13379I0;

        /* renamed from: J0 */
        public static final String f13380J0;

        /* renamed from: K0 */
        public static final String f13381K0;

        /* renamed from: L0 */
        public static final String f13382L0;

        /* renamed from: M0 */
        public static final String f13383M0;

        /* renamed from: N0 */
        public static final String f13384N0;

        /* renamed from: O0 */
        public static final String f13385O0;

        /* renamed from: P0 */
        public static final String f13386P0;

        /* renamed from: Q0 */
        public static final String f13387Q0;

        /* renamed from: R0 */
        public static final String f13388R0;

        /* renamed from: S0 */
        public static final InterfaceC4436h.a<d> f13389S0;

        /* renamed from: z0 */
        public static final d f13390z0;

        /* renamed from: k0 */
        public final boolean f13391k0;

        /* renamed from: l0 */
        public final boolean f13392l0;

        /* renamed from: m0 */
        public final boolean f13393m0;

        /* renamed from: n0 */
        public final boolean f13394n0;

        /* renamed from: o0 */
        public final boolean f13395o0;

        /* renamed from: p0 */
        public final boolean f13396p0;

        /* renamed from: q0 */
        public final boolean f13397q0;

        /* renamed from: r0 */
        public final boolean f13398r0;

        /* renamed from: s0 */
        public final boolean f13399s0;

        /* renamed from: t0 */
        public final boolean f13400t0;

        /* renamed from: u0 */
        public final boolean f13401u0;

        /* renamed from: v0 */
        public final boolean f13402v0;

        /* renamed from: w0 */
        public final boolean f13403w0;

        /* renamed from: x0 */
        public final SparseArray<Map<C4885u0, e>> f13404x0;

        /* renamed from: y0 */
        public final SparseBooleanArray f13405y0;

        /* renamed from: n5.m$d$a */
        /* loaded from: classes.dex */
        public static final class a extends C3759z.a {

            /* renamed from: A */
            public boolean f13406A;

            /* renamed from: B */
            public boolean f13407B;

            /* renamed from: C */
            public boolean f13408C;

            /* renamed from: D */
            public boolean f13409D;

            /* renamed from: E */
            public boolean f13410E;

            /* renamed from: F */
            public boolean f13411F;

            /* renamed from: G */
            public boolean f13412G;

            /* renamed from: H */
            public boolean f13413H;

            /* renamed from: I */
            public boolean f13414I;

            /* renamed from: J */
            public boolean f13415J;

            /* renamed from: K */
            public boolean f13416K;

            /* renamed from: L */
            public boolean f13417L;

            /* renamed from: M */
            public boolean f13418M;

            /* renamed from: N */
            public final SparseArray<Map<C4885u0, e>> f13419N;

            /* renamed from: O */
            public final SparseBooleanArray f13420O;

            @Deprecated
            public a() {
                this.f13419N = new SparseArray<>();
                this.f13420O = new SparseBooleanArray();
                m14195Z();
            }

            public a(Context context) {
                super(context);
                this.f13419N = new SparseArray<>();
                this.f13420O = new SparseBooleanArray();
                m14195Z();
            }

            public a(Bundle bundle) {
                super(bundle);
                m14195Z();
                d dVar = d.f13390z0;
                m14209n0(bundle.getBoolean(d.f13372B0, dVar.f13391k0));
                m14204i0(bundle.getBoolean(d.f13373C0, dVar.f13392l0));
                m14205j0(bundle.getBoolean(d.f13374D0, dVar.f13393m0));
                m14203h0(bundle.getBoolean(d.f13386P0, dVar.f13394n0));
                m14207l0(bundle.getBoolean(d.f13375E0, dVar.f13395o0));
                m14200e0(bundle.getBoolean(d.f13376F0, dVar.f13396p0));
                m14201f0(bundle.getBoolean(d.f13377G0, dVar.f13397q0));
                m14198c0(bundle.getBoolean(d.f13378H0, dVar.f13398r0));
                m14199d0(bundle.getBoolean(d.f13387Q0, dVar.f13399s0));
                m14206k0(bundle.getBoolean(d.f13388R0, dVar.f13400t0));
                m14208m0(bundle.getBoolean(d.f13379I0, dVar.f13401u0));
                m14213r0(bundle.getBoolean(d.f13380J0, dVar.f13402v0));
                m14202g0(bundle.getBoolean(d.f13381K0, dVar.f13403w0));
                this.f13419N = new SparseArray<>();
                m14212q0(bundle);
                this.f13420O = m14196a0(bundle.getIntArray(d.f13385O0));
            }

            public a(d dVar) {
                super(dVar);
                this.f13406A = dVar.f13391k0;
                this.f13407B = dVar.f13392l0;
                this.f13408C = dVar.f13393m0;
                this.f13409D = dVar.f13394n0;
                this.f13410E = dVar.f13395o0;
                this.f13411F = dVar.f13396p0;
                this.f13412G = dVar.f13397q0;
                this.f13413H = dVar.f13398r0;
                this.f13414I = dVar.f13399s0;
                this.f13415J = dVar.f13400t0;
                this.f13416K = dVar.f13401u0;
                this.f13417L = dVar.f13402v0;
                this.f13418M = dVar.f13403w0;
                this.f13419N = m14189Y(dVar.f13404x0);
                this.f13420O = dVar.f13405y0.clone();
            }

            /* renamed from: Y */
            public static SparseArray<Map<C4885u0, e>> m14189Y(SparseArray<Map<C4885u0, e>> sparseArray) {
                SparseArray<Map<C4885u0, e>> sparseArray2 = new SparseArray<>();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
                }
                return sparseArray2;
            }

            @Override // p193n5.C3759z.a
            /* renamed from: X, reason: merged with bridge method [inline-methods] */
            public d mo14190A() {
                return new d(this);
            }

            /* renamed from: Z */
            public final void m14195Z() {
                this.f13406A = true;
                this.f13407B = false;
                this.f13408C = true;
                this.f13409D = false;
                this.f13410E = true;
                this.f13411F = false;
                this.f13412G = false;
                this.f13413H = false;
                this.f13414I = false;
                this.f13415J = true;
                this.f13416K = true;
                this.f13417L = false;
                this.f13418M = true;
            }

            /* renamed from: a0 */
            public final SparseBooleanArray m14196a0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i10 : iArr) {
                    sparseBooleanArray.append(i10, true);
                }
                return sparseBooleanArray;
            }

            /* renamed from: b0 */
            public a m14197b0(C3759z c3759z) {
                super.m14310D(c3759z);
                return this;
            }

            /* renamed from: c0 */
            public a m14198c0(boolean z10) {
                this.f13413H = z10;
                return this;
            }

            /* renamed from: d0 */
            public a m14199d0(boolean z10) {
                this.f13414I = z10;
                return this;
            }

            /* renamed from: e0 */
            public a m14200e0(boolean z10) {
                this.f13411F = z10;
                return this;
            }

            /* renamed from: f0 */
            public a m14201f0(boolean z10) {
                this.f13412G = z10;
                return this;
            }

            /* renamed from: g0 */
            public a m14202g0(boolean z10) {
                this.f13418M = z10;
                return this;
            }

            /* renamed from: h0 */
            public a m14203h0(boolean z10) {
                this.f13409D = z10;
                return this;
            }

            /* renamed from: i0 */
            public a m14204i0(boolean z10) {
                this.f13407B = z10;
                return this;
            }

            /* renamed from: j0 */
            public a m14205j0(boolean z10) {
                this.f13408C = z10;
                return this;
            }

            /* renamed from: k0 */
            public a m14206k0(boolean z10) {
                this.f13415J = z10;
                return this;
            }

            /* renamed from: l0 */
            public a m14207l0(boolean z10) {
                this.f13410E = z10;
                return this;
            }

            /* renamed from: m0 */
            public a m14208m0(boolean z10) {
                this.f13416K = z10;
                return this;
            }

            /* renamed from: n0 */
            public a m14209n0(boolean z10) {
                this.f13406A = z10;
                return this;
            }

            @Override // p193n5.C3759z.a
            /* renamed from: o0, reason: merged with bridge method [inline-methods] */
            public a mo14191E(Context context) {
                super.mo14191E(context);
                return this;
            }

            @Deprecated
            /* renamed from: p0 */
            public a m14211p0(int i10, C4885u0 c4885u0, e eVar) {
                Map<C4885u0, e> map = this.f13419N.get(i10);
                if (map == null) {
                    map = new HashMap<>();
                    this.f13419N.put(i10, map);
                }
                if (map.containsKey(c4885u0) && C4041n0.m15449c(map.get(c4885u0), eVar)) {
                    return this;
                }
                map.put(c4885u0, eVar);
                return this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: q0 */
            public final void m14212q0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(d.f13382L0);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.f13383M0);
                AbstractC2651u m10770u = parcelableArrayList == null ? AbstractC2651u.m10770u() : C4018c.m15267b(C4885u0.f18477m, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.f13384N0);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : C4018c.m15268c(e.f13424o, sparseParcelableArray);
                if (intArray == null || intArray.length != m10770u.size()) {
                    return;
                }
                for (int i10 = 0; i10 < intArray.length; i10++) {
                    m14211p0(intArray[i10], (C4885u0) m10770u.get(i10), (e) sparseArray.get(i10));
                }
            }

            /* renamed from: r0 */
            public a m14213r0(boolean z10) {
                this.f13417L = z10;
                return this;
            }

            @Override // p193n5.C3759z.a
            /* renamed from: s0, reason: merged with bridge method [inline-methods] */
            public a mo14192G(int i10, int i11, boolean z10) {
                super.mo14192G(i10, i11, z10);
                return this;
            }

            @Override // p193n5.C3759z.a
            /* renamed from: t0, reason: merged with bridge method [inline-methods] */
            public a mo14193H(Context context, boolean z10) {
                super.mo14193H(context, z10);
                return this;
            }
        }

        static {
            d mo14190A = new a().mo14190A();
            f13390z0 = mo14190A;
            f13371A0 = mo14190A;
            f13372B0 = C4041n0.m15478q0(1000);
            f13373C0 = C4041n0.m15478q0(1001);
            f13374D0 = C4041n0.m15478q0(1002);
            f13375E0 = C4041n0.m15478q0(1003);
            f13376F0 = C4041n0.m15478q0(1004);
            f13377G0 = C4041n0.m15478q0(1005);
            f13378H0 = C4041n0.m15478q0(1006);
            f13379I0 = C4041n0.m15478q0(1007);
            f13380J0 = C4041n0.m15478q0(1008);
            f13381K0 = C4041n0.m15478q0(1009);
            f13382L0 = C4041n0.m15478q0(1010);
            f13383M0 = C4041n0.m15478q0(1011);
            f13384N0 = C4041n0.m15478q0(1012);
            f13385O0 = C4041n0.m15478q0(1013);
            f13386P0 = C4041n0.m15478q0(1014);
            f13387Q0 = C4041n0.m15478q0(1015);
            f13388R0 = C4041n0.m15478q0(1016);
            f13389S0 = new InterfaceC4436h.a() { // from class: n5.n
                @Override // p264s3.InterfaceC4436h.a
                /* renamed from: a */
                public final InterfaceC4436h mo6314a(Bundle bundle) {
                    C3746m.d m14152M;
                    m14152M = C3746m.d.m14152M(bundle);
                    return m14152M;
                }
            };
        }

        public d(a aVar) {
            super(aVar);
            this.f13391k0 = aVar.f13406A;
            this.f13392l0 = aVar.f13407B;
            this.f13393m0 = aVar.f13408C;
            this.f13394n0 = aVar.f13409D;
            this.f13395o0 = aVar.f13410E;
            this.f13396p0 = aVar.f13411F;
            this.f13397q0 = aVar.f13412G;
            this.f13398r0 = aVar.f13413H;
            this.f13399s0 = aVar.f13414I;
            this.f13400t0 = aVar.f13415J;
            this.f13401u0 = aVar.f13416K;
            this.f13402v0 = aVar.f13417L;
            this.f13403w0 = aVar.f13418M;
            this.f13404x0 = aVar.f13419N;
            this.f13405y0 = aVar.f13420O;
        }

        /* renamed from: E */
        public static boolean m14148E(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: F */
        public static boolean m14149F(SparseArray<Map<C4885u0, e>> sparseArray, SparseArray<Map<C4885u0, e>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !m14150G(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: G */
        public static boolean m14150G(Map<C4885u0, e> map, Map<C4885u0, e> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<C4885u0, e> entry : map.entrySet()) {
                C4885u0 key = entry.getKey();
                if (!map2.containsKey(key) || !C4041n0.m15449c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: I */
        public static d m14151I(Context context) {
            return new a(context).mo14190A();
        }

        /* renamed from: M */
        public static /* synthetic */ d m14152M(Bundle bundle) {
            return new a(bundle).mo14190A();
        }

        /* renamed from: H */
        public a m14170H() {
            return new a();
        }

        /* renamed from: J */
        public boolean m14171J(int i10) {
            return this.f13405y0.get(i10);
        }

        @Deprecated
        /* renamed from: K */
        public e m14172K(int i10, C4885u0 c4885u0) {
            Map<C4885u0, e> map = this.f13404x0.get(i10);
            if (map != null) {
                return map.get(c4885u0);
            }
            return null;
        }

        @Deprecated
        /* renamed from: L */
        public boolean m14173L(int i10, C4885u0 c4885u0) {
            Map<C4885u0, e> map = this.f13404x0.get(i10);
            return map != null && map.containsKey(c4885u0);
        }

        @Override // p193n5.C3759z
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.f13391k0 == dVar.f13391k0 && this.f13392l0 == dVar.f13392l0 && this.f13393m0 == dVar.f13393m0 && this.f13394n0 == dVar.f13394n0 && this.f13395o0 == dVar.f13395o0 && this.f13396p0 == dVar.f13396p0 && this.f13397q0 == dVar.f13397q0 && this.f13398r0 == dVar.f13398r0 && this.f13399s0 == dVar.f13399s0 && this.f13400t0 == dVar.f13400t0 && this.f13401u0 == dVar.f13401u0 && this.f13402v0 == dVar.f13402v0 && this.f13403w0 == dVar.f13403w0 && m14148E(this.f13405y0, dVar.f13405y0) && m14149F(this.f13404x0, dVar.f13404x0);
        }

        @Override // p193n5.C3759z
        public int hashCode() {
            return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f13391k0 ? 1 : 0)) * 31) + (this.f13392l0 ? 1 : 0)) * 31) + (this.f13393m0 ? 1 : 0)) * 31) + (this.f13394n0 ? 1 : 0)) * 31) + (this.f13395o0 ? 1 : 0)) * 31) + (this.f13396p0 ? 1 : 0)) * 31) + (this.f13397q0 ? 1 : 0)) * 31) + (this.f13398r0 ? 1 : 0)) * 31) + (this.f13399s0 ? 1 : 0)) * 31) + (this.f13400t0 ? 1 : 0)) * 31) + (this.f13401u0 ? 1 : 0)) * 31) + (this.f13402v0 ? 1 : 0)) * 31) + (this.f13403w0 ? 1 : 0);
        }
    }

    /* renamed from: n5.m$e */
    /* loaded from: classes.dex */
    public static final class e implements InterfaceC4436h {

        /* renamed from: l */
        public static final String f13421l = C4041n0.m15478q0(0);

        /* renamed from: m */
        public static final String f13422m = C4041n0.m15478q0(1);

        /* renamed from: n */
        public static final String f13423n = C4041n0.m15478q0(2);

        /* renamed from: o */
        public static final InterfaceC4436h.a<e> f13424o = new InterfaceC4436h.a() { // from class: n5.o
            @Override // p264s3.InterfaceC4436h.a
            /* renamed from: a */
            public final InterfaceC4436h mo6314a(Bundle bundle) {
                C3746m.e m14217b;
                m14217b = C3746m.e.m14217b(bundle);
                return m14217b;
            }
        };

        /* renamed from: h */
        public final int f13425h;

        /* renamed from: i */
        public final int[] f13426i;

        /* renamed from: j */
        public final int f13427j;

        /* renamed from: k */
        public final int f13428k;

        public e(int i10, int[] iArr, int i11) {
            this.f13425h = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f13426i = copyOf;
            this.f13427j = iArr.length;
            this.f13428k = i11;
            Arrays.sort(copyOf);
        }

        /* renamed from: b */
        public static /* synthetic */ e m14217b(Bundle bundle) {
            int i10 = bundle.getInt(f13421l, -1);
            int[] intArray = bundle.getIntArray(f13422m);
            int i11 = bundle.getInt(f13423n, -1);
            C4014a.m15195a(i10 >= 0 && i11 >= 0);
            C4014a.m15199e(intArray);
            return new e(i10, intArray, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.f13425h == eVar.f13425h && Arrays.equals(this.f13426i, eVar.f13426i) && this.f13428k == eVar.f13428k;
        }

        public int hashCode() {
            return (((this.f13425h * 31) + Arrays.hashCode(this.f13426i)) * 31) + this.f13428k;
        }
    }

    /* renamed from: n5.m$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public final Spatializer f13429a;

        /* renamed from: b */
        public final boolean f13430b;

        /* renamed from: c */
        public Handler f13431c;

        /* renamed from: d */
        public Spatializer.OnSpatializerStateChangedListener f13432d;

        /* renamed from: n5.m$f$a */
        /* loaded from: classes.dex */
        public class a implements Spatializer.OnSpatializerStateChangedListener {

            /* renamed from: a */
            public final /* synthetic */ C3746m f13433a;

            public a(f fVar, C3746m c3746m) {
                this.f13433a = c3746m;
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
                this.f13433a.m14129P();
            }

            @Override // android.media.Spatializer.OnSpatializerStateChangedListener
            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
                this.f13433a.m14129P();
            }
        }

        public f(Spatializer spatializer) {
            this.f13429a = spatializer;
            this.f13430b = spatializer.getImmersiveAudioLevel() != 0;
        }

        /* renamed from: g */
        public static f m14218g(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new f(audioManager.getSpatializer());
        }

        /* renamed from: a */
        public boolean m14219a(C4813e c4813e, C4463m1 c4463m1) {
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(C4041n0.m15405G(("audio/eac3-joc".equals(c4463m1.f16506s) && c4463m1.f16485F == 16) ? 12 : c4463m1.f16485F));
            int i10 = c4463m1.f16486G;
            if (i10 != -1) {
                channelMask.setSampleRate(i10);
            }
            return this.f13429a.canBeSpatialized(c4813e.m19013b().f18011a, channelMask.build());
        }

        /* renamed from: b */
        public void m14220b(C3746m c3746m, Looper looper) {
            if (this.f13432d == null && this.f13431c == null) {
                this.f13432d = new a(this, c3746m);
                Handler handler = new Handler(looper);
                this.f13431c = handler;
                Spatializer spatializer = this.f13429a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new ExecutorC3749p(handler), this.f13432d);
            }
        }

        /* renamed from: c */
        public boolean m14221c() {
            return this.f13429a.isAvailable();
        }

        /* renamed from: d */
        public boolean m14222d() {
            return this.f13429a.isEnabled();
        }

        /* renamed from: e */
        public boolean m14223e() {
            return this.f13430b;
        }

        /* renamed from: f */
        public void m14224f() {
            Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener = this.f13432d;
            if (onSpatializerStateChangedListener == null || this.f13431c == null) {
                return;
            }
            this.f13429a.removeOnSpatializerStateChangedListener(onSpatializerStateChangedListener);
            ((Handler) C4041n0.m15463j(this.f13431c)).removeCallbacksAndMessages(null);
            this.f13431c = null;
            this.f13432d = null;
        }
    }

    /* renamed from: n5.m$g */
    /* loaded from: classes.dex */
    public static final class g extends h<g> implements Comparable<g> {

        /* renamed from: l */
        public final int f13434l;

        /* renamed from: m */
        public final boolean f13435m;

        /* renamed from: n */
        public final boolean f13436n;

        /* renamed from: o */
        public final boolean f13437o;

        /* renamed from: p */
        public final int f13438p;

        /* renamed from: q */
        public final int f13439q;

        /* renamed from: r */
        public final int f13440r;

        /* renamed from: s */
        public final int f13441s;

        /* renamed from: t */
        public final boolean f13442t;

        public g(int i10, C4881s0 c4881s0, int i11, d dVar, int i12, String str) {
            super(i10, c4881s0, i11);
            int i13;
            int i14 = 0;
            this.f13435m = C3746m.m14105I(i12, false);
            int i15 = this.f13446k.f16498k & (~dVar.f13516B);
            this.f13436n = (i15 & 1) != 0;
            this.f13437o = (i15 & 2) != 0;
            int i16 = C1841a.e.API_PRIORITY_OTHER;
            AbstractC2651u<String> m10771v = dVar.f13540z.isEmpty() ? AbstractC2651u.m10771v("") : dVar.f13540z;
            int i17 = 0;
            while (true) {
                if (i17 >= m10771v.size()) {
                    i13 = 0;
                    break;
                }
                i13 = C3746m.m14099B(this.f13446k, m10771v.get(i17), dVar.f13517C);
                if (i13 > 0) {
                    i16 = i17;
                    break;
                }
                i17++;
            }
            this.f13438p = i16;
            this.f13439q = i13;
            int m14102E = C3746m.m14102E(this.f13446k.f16499l, dVar.f13515A);
            this.f13440r = m14102E;
            this.f13442t = (this.f13446k.f16499l & 1088) != 0;
            int m14099B = C3746m.m14099B(this.f13446k, str, C3746m.m14112Q(str) == null);
            this.f13441s = m14099B;
            boolean z10 = i13 > 0 || (dVar.f13540z.isEmpty() && m14102E > 0) || this.f13436n || (this.f13437o && m14099B > 0);
            if (C3746m.m14105I(i12, dVar.f13401u0) && z10) {
                i14 = 1;
            }
            this.f13434l = i14;
        }

        /* renamed from: f */
        public static int m14225f(List<g> list, List<g> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        /* renamed from: i */
        public static AbstractC2651u<g> m14226i(int i10, C4881s0 c4881s0, d dVar, int[] iArr, String str) {
            AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
            for (int i11 = 0; i11 < c4881s0.f18465h; i11++) {
                m10766n.mo10749a(new g(i10, c4881s0, i11, dVar, iArr[i11], str));
            }
            return m10766n.m10784k();
        }

        @Override // p193n5.C3746m.h
        /* renamed from: b */
        public int mo14139b() {
            return this.f13434l;
        }

        @Override // java.lang.Comparable
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            AbstractC2637n mo10706d = AbstractC2637n.m10705j().mo10709g(this.f13435m, gVar.f13435m).mo10708f(Integer.valueOf(this.f13438p), Integer.valueOf(gVar.f13438p), AbstractC2642p0.m10725c().mo10700f()).mo10706d(this.f13439q, gVar.f13439q).mo10706d(this.f13440r, gVar.f13440r).mo10709g(this.f13436n, gVar.f13436n).mo10708f(Boolean.valueOf(this.f13437o), Boolean.valueOf(gVar.f13437o), this.f13439q == 0 ? AbstractC2642p0.m10725c() : AbstractC2642p0.m10725c().mo10700f()).mo10706d(this.f13441s, gVar.f13441s);
            if (this.f13440r == 0) {
                mo10706d = mo10706d.mo10710h(this.f13442t, gVar.f13442t);
            }
            return mo10706d.mo10711i();
        }

        @Override // p193n5.C3746m.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean mo14140c(g gVar) {
            return false;
        }
    }

    /* renamed from: n5.m$h */
    /* loaded from: classes.dex */
    public static abstract class h<T extends h<T>> {

        /* renamed from: h */
        public final int f13443h;

        /* renamed from: i */
        public final C4881s0 f13444i;

        /* renamed from: j */
        public final int f13445j;

        /* renamed from: k */
        public final C4463m1 f13446k;

        /* renamed from: n5.m$h$a */
        /* loaded from: classes.dex */
        public interface a<T extends h<T>> {
            /* renamed from: a */
            List<T> mo14097a(int i10, C4881s0 c4881s0, int[] iArr);
        }

        public h(int i10, C4881s0 c4881s0, int i11) {
            this.f13443h = i10;
            this.f13444i = c4881s0;
            this.f13445j = i11;
            this.f13446k = c4881s0.m19444b(i11);
        }

        /* renamed from: b */
        public abstract int mo14139b();

        /* renamed from: c */
        public abstract boolean mo14140c(T t10);
    }

    /* renamed from: n5.m$i */
    /* loaded from: classes.dex */
    public static final class i extends h<i> {

        /* renamed from: l */
        public final boolean f13447l;

        /* renamed from: m */
        public final d f13448m;

        /* renamed from: n */
        public final boolean f13449n;

        /* renamed from: o */
        public final boolean f13450o;

        /* renamed from: p */
        public final int f13451p;

        /* renamed from: q */
        public final int f13452q;

        /* renamed from: r */
        public final int f13453r;

        /* renamed from: s */
        public final int f13454s;

        /* renamed from: t */
        public final boolean f13455t;

        /* renamed from: u */
        public final boolean f13456u;

        /* renamed from: v */
        public final int f13457v;

        /* renamed from: w */
        public final boolean f13458w;

        /* renamed from: x */
        public final boolean f13459x;

        /* renamed from: y */
        public final int f13460y;

        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00cc A[EDGE_INSN: B:74:0x00cc->B:61:0x00cc BREAK  A[LOOP:0: B:53:0x00ad->B:72:0x00c9], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(int r5, p290u4.C4881s0 r6, int r7, p193n5.C3746m.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p193n5.C3746m.i.<init>(int, u4.s0, int, n5.m$d, int, int, boolean):void");
        }

        /* renamed from: i */
        public static int m14231i(i iVar, i iVar2) {
            AbstractC2637n mo10709g = AbstractC2637n.m10705j().mo10709g(iVar.f13450o, iVar2.f13450o).mo10706d(iVar.f13454s, iVar2.f13454s).mo10709g(iVar.f13455t, iVar2.f13455t).mo10709g(iVar.f13447l, iVar2.f13447l).mo10709g(iVar.f13449n, iVar2.f13449n).mo10708f(Integer.valueOf(iVar.f13453r), Integer.valueOf(iVar2.f13453r), AbstractC2642p0.m10725c().mo10700f()).mo10709g(iVar.f13458w, iVar2.f13458w).mo10709g(iVar.f13459x, iVar2.f13459x);
            if (iVar.f13458w && iVar.f13459x) {
                mo10709g = mo10709g.mo10706d(iVar.f13460y, iVar2.f13460y);
            }
            return mo10709g.mo10711i();
        }

        /* renamed from: l */
        public static int m14232l(i iVar, i iVar2) {
            AbstractC2642p0 mo10700f = (iVar.f13447l && iVar.f13450o) ? C3746m.f13342k : C3746m.f13342k.mo10700f();
            return AbstractC2637n.m10705j().mo10708f(Integer.valueOf(iVar.f13451p), Integer.valueOf(iVar2.f13451p), iVar.f13448m.f13518D ? C3746m.f13342k.mo10700f() : C3746m.f13343l).mo10708f(Integer.valueOf(iVar.f13452q), Integer.valueOf(iVar2.f13452q), mo10700f).mo10708f(Integer.valueOf(iVar.f13451p), Integer.valueOf(iVar2.f13451p), mo10700f).mo10711i();
        }

        /* renamed from: m */
        public static int m14233m(List<i> list, List<i> list2) {
            return AbstractC2637n.m10705j().mo10708f((i) Collections.max(list, new Comparator() { // from class: n5.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m14231i;
                    m14231i = C3746m.i.m14231i((C3746m.i) obj, (C3746m.i) obj2);
                    return m14231i;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: n5.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m14231i;
                    m14231i = C3746m.i.m14231i((C3746m.i) obj, (C3746m.i) obj2);
                    return m14231i;
                }
            }), new Comparator() { // from class: n5.q
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m14231i;
                    m14231i = C3746m.i.m14231i((C3746m.i) obj, (C3746m.i) obj2);
                    return m14231i;
                }
            }).mo10706d(list.size(), list2.size()).mo10708f((i) Collections.max(list, new Comparator() { // from class: n5.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m14232l;
                    m14232l = C3746m.i.m14232l((C3746m.i) obj, (C3746m.i) obj2);
                    return m14232l;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: n5.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m14232l;
                    m14232l = C3746m.i.m14232l((C3746m.i) obj, (C3746m.i) obj2);
                    return m14232l;
                }
            }), new Comparator() { // from class: n5.r
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m14232l;
                    m14232l = C3746m.i.m14232l((C3746m.i) obj, (C3746m.i) obj2);
                    return m14232l;
                }
            }).mo10711i();
        }

        /* renamed from: n */
        public static AbstractC2651u<i> m14234n(int i10, C4881s0 c4881s0, d dVar, int[] iArr, int i11) {
            int m14100C = C3746m.m14100C(c4881s0, dVar.f13530p, dVar.f13531q, dVar.f13532r);
            AbstractC2651u.a m10766n = AbstractC2651u.m10766n();
            for (int i12 = 0; i12 < c4881s0.f18465h; i12++) {
                int m17413f = c4881s0.m19444b(i12).m17413f();
                m10766n.mo10749a(new i(i10, c4881s0, i12, dVar, iArr[i12], i11, m14100C == Integer.MAX_VALUE || (m17413f != -1 && m17413f <= m14100C)));
            }
            return m10766n.m10784k();
        }

        @Override // p193n5.C3746m.h
        /* renamed from: b */
        public int mo14139b() {
            return this.f13457v;
        }

        /* renamed from: o */
        public final int m14235o(int i10, int i11) {
            if ((this.f13446k.f16499l & 16384) != 0 || !C3746m.m14105I(i10, this.f13448m.f13401u0)) {
                return 0;
            }
            if (!this.f13447l && !this.f13448m.f13391k0) {
                return 0;
            }
            if (C3746m.m14105I(i10, false) && this.f13449n && this.f13447l && this.f13446k.f16502o != -1) {
                d dVar = this.f13448m;
                if (!dVar.f13519E && !dVar.f13518D && (i10 & i11) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // p193n5.C3746m.h
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public boolean mo14140c(i iVar) {
            return (this.f13456u || C4041n0.m15449c(this.f13446k.f16506s, iVar.f13446k.f16506s)) && (this.f13448m.f13394n0 || (this.f13458w == iVar.f13458w && this.f13459x == iVar.f13459x));
        }
    }

    public C3746m(Context context) {
        this(context, new C3731a.b());
    }

    public C3746m(Context context, InterfaceC3752s.b bVar) {
        this(context, d.m14151I(context), bVar);
    }

    public C3746m(Context context, C3759z c3759z, InterfaceC3752s.b bVar) {
        this(c3759z, bVar, context);
    }

    public C3746m(C3759z c3759z, InterfaceC3752s.b bVar, Context context) {
        d mo14190A;
        this.f13344d = new Object();
        this.f13345e = context != null ? context.getApplicationContext() : null;
        this.f13346f = bVar;
        if (c3759z instanceof d) {
            mo14190A = (d) c3759z;
        } else {
            mo14190A = (context == null ? d.f13390z0 : d.m14151I(context)).m14170H().m14197b0(c3759z).mo14190A();
        }
        this.f13348h = mo14190A;
        this.f13350j = C4813e.f17998n;
        boolean z10 = context != null && C4041n0.m15490w0(context);
        this.f13347g = z10;
        if (!z10 && context != null && C4041n0.f14513a >= 32) {
            this.f13349i = f.m14218g(context);
        }
        if (this.f13348h.f13400t0 && context == null) {
            C4046r.m15529i("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    /* renamed from: A */
    public static void m14098A(C4885u0 c4885u0, C3759z c3759z, Map<Integer, C3757x> map) {
        C3757x c3757x;
        for (int i10 = 0; i10 < c4885u0.f18478h; i10++) {
            C3757x c3757x2 = c3759z.f13520F.get(c4885u0.m19452b(i10));
            if (c3757x2 != null && ((c3757x = map.get(Integer.valueOf(c3757x2.m14254b()))) == null || (c3757x.f13484i.isEmpty() && !c3757x2.f13484i.isEmpty()))) {
                map.put(Integer.valueOf(c3757x2.m14254b()), c3757x2);
            }
        }
    }

    /* renamed from: B */
    public static int m14099B(C4463m1 c4463m1, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(c4463m1.f16497j)) {
            return 4;
        }
        String m14112Q = m14112Q(str);
        String m14112Q2 = m14112Q(c4463m1.f16497j);
        if (m14112Q2 == null || m14112Q == null) {
            return (z10 && m14112Q2 == null) ? 1 : 0;
        }
        if (m14112Q2.startsWith(m14112Q) || m14112Q.startsWith(m14112Q2)) {
            return 3;
        }
        return C4041n0.m15428R0(m14112Q2, "-")[0].equals(C4041n0.m15428R0(m14112Q, "-")[0]) ? 2 : 0;
    }

    /* renamed from: C */
    public static int m14100C(C4881s0 c4881s0, int i10, int i11, boolean z10) {
        int i12;
        int i13 = C1841a.e.API_PRIORITY_OTHER;
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            for (int i14 = 0; i14 < c4881s0.f18465h; i14++) {
                C4463m1 m19444b = c4881s0.m19444b(i14);
                int i15 = m19444b.f16511x;
                if (i15 > 0 && (i12 = m19444b.f16512y) > 0) {
                    Point m14101D = m14101D(z10, i10, i11, i15, i12);
                    int i16 = m19444b.f16511x;
                    int i17 = m19444b.f16512y;
                    int i18 = i16 * i17;
                    if (i16 >= ((int) (m14101D.x * 0.98f)) && i17 >= ((int) (m14101D.y * 0.98f)) && i18 < i13) {
                        i13 = i18;
                    }
                }
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L13;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point m14101D(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = p222p5.C4041n0.m15467l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = p222p5.C4041n0.m15467l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p193n5.C3746m.m14101D(boolean, int, int, int, int):android.graphics.Point");
    }

    /* renamed from: E */
    public static int m14102E(int i10, int i11) {
        return (i10 == 0 || i10 != i11) ? Integer.bitCount(i10 & i11) : C1841a.e.API_PRIORITY_OTHER;
    }

    /* renamed from: F */
    public static int m14103F(String str) {
        if (str == null) {
            return 0;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c10 = 4;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: H */
    public static boolean m14104H(C4463m1 c4463m1) {
        String str = c4463m1.f16506s;
        if (str == null) {
            return false;
        }
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c10 = 0;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c10 = 2;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: I */
    public static boolean m14105I(int i10, boolean z10) {
        int m17367G = InterfaceC4450j3.m17367G(i10);
        return m17367G == 4 || (z10 && m17367G == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public /* synthetic */ List m14106J(d dVar, boolean z10, int i10, C4881s0 c4881s0, int[] iArr) {
        return b.m14138i(i10, c4881s0, dVar, iArr, z10, new InterfaceC2433p() { // from class: n5.d
            @Override // p109h7.InterfaceC2433p
            public final boolean apply(Object obj) {
                boolean m14128G;
                m14128G = C3746m.this.m14128G((C4463m1) obj);
                return m14128G;
            }
        });
    }

    /* renamed from: K */
    public static /* synthetic */ List m14107K(d dVar, String str, int i10, C4881s0 c4881s0, int[] iArr) {
        return g.m14226i(i10, c4881s0, dVar, iArr, str);
    }

    /* renamed from: L */
    public static /* synthetic */ List m14108L(d dVar, int[] iArr, int i10, C4881s0 c4881s0, int[] iArr2) {
        return i.m14234n(i10, c4881s0, dVar, iArr2, iArr[i10]);
    }

    /* renamed from: M */
    public static /* synthetic */ int m14109M(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* renamed from: N */
    public static /* synthetic */ int m14110N(Integer num, Integer num2) {
        return 0;
    }

    /* renamed from: O */
    public static void m14111O(AbstractC3754u.a aVar, int[][][] iArr, C4455k3[] c4455k3Arr, InterfaceC3752s[] interfaceC3752sArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < aVar.m14247d(); i12++) {
            int m14248e = aVar.m14248e(i12);
            InterfaceC3752s interfaceC3752s = interfaceC3752sArr[i12];
            if ((m14248e == 1 || m14248e == 2) && interfaceC3752s != null && m14113R(iArr[i12], aVar.m14249f(i12), interfaceC3752s)) {
                if (m14248e == 1) {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i12;
                } else {
                    if (i10 != -1) {
                        z10 = false;
                        break;
                    }
                    i10 = i12;
                }
            }
        }
        z10 = true;
        if (i11 != -1 && i10 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            C4455k3 c4455k3 = new C4455k3(true);
            c4455k3Arr[i11] = c4455k3;
            c4455k3Arr[i10] = c4455k3;
        }
    }

    /* renamed from: Q */
    public static String m14112Q(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* renamed from: R */
    public static boolean m14113R(int[][] iArr, C4885u0 c4885u0, InterfaceC3752s interfaceC3752s) {
        if (interfaceC3752s == null) {
            return false;
        }
        int m19453c = c4885u0.m19453c(interfaceC3752s.mo14086b());
        for (int i10 = 0; i10 < interfaceC3752s.length(); i10++) {
            if (InterfaceC4450j3.m17371p(iArr[m19453c][interfaceC3752s.mo14088d(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    public static void m14126y(AbstractC3754u.a aVar, d dVar, InterfaceC3752s.a[] aVarArr) {
        int m14247d = aVar.m14247d();
        for (int i10 = 0; i10 < m14247d; i10++) {
            C4885u0 m14249f = aVar.m14249f(i10);
            if (dVar.m14173L(i10, m14249f)) {
                e m14172K = dVar.m14172K(i10, m14249f);
                aVarArr[i10] = (m14172K == null || m14172K.f13426i.length == 0) ? null : new InterfaceC3752s.a(m14249f.m19452b(m14172K.f13425h), m14172K.f13426i, m14172K.f13428k);
            }
        }
    }

    /* renamed from: z */
    public static void m14127z(AbstractC3754u.a aVar, C3759z c3759z, InterfaceC3752s.a[] aVarArr) {
        int m14247d = aVar.m14247d();
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < m14247d; i10++) {
            m14098A(aVar.m14249f(i10), c3759z, hashMap);
        }
        m14098A(aVar.m14251h(), c3759z, hashMap);
        for (int i11 = 0; i11 < m14247d; i11++) {
            C3757x c3757x = (C3757x) hashMap.get(Integer.valueOf(aVar.m14248e(i11)));
            if (c3757x != null) {
                aVarArr[i11] = (c3757x.f13484i.isEmpty() || aVar.m14249f(i11).m19453c(c3757x.f13483h) == -1) ? null : new InterfaceC3752s.a(c3757x.f13483h, C3368e.m12533l(c3757x.f13484i));
            }
        }
    }

    /* renamed from: G */
    public final boolean m14128G(C4463m1 c4463m1) {
        boolean z10;
        f fVar;
        f fVar2;
        synchronized (this.f13344d) {
            z10 = !this.f13348h.f13400t0 || this.f13347g || c4463m1.f16485F <= 2 || (m14104H(c4463m1) && (C4041n0.f14513a < 32 || (fVar2 = this.f13349i) == null || !fVar2.m14223e())) || (C4041n0.f14513a >= 32 && (fVar = this.f13349i) != null && fVar.m14223e() && this.f13349i.m14221c() && this.f13349i.m14222d() && this.f13349i.m14219a(this.f13350j, c4463m1));
        }
        return z10;
    }

    /* renamed from: P */
    public final void m14129P() {
        boolean z10;
        f fVar;
        synchronized (this.f13344d) {
            z10 = this.f13348h.f13400t0 && !this.f13347g && C4041n0.f14513a >= 32 && (fVar = this.f13349i) != null && fVar.m14223e();
        }
        if (z10) {
            m14076c();
        }
    }

    /* renamed from: S */
    public InterfaceC3752s.a[] m14130S(AbstractC3754u.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int m14247d = aVar.m14247d();
        InterfaceC3752s.a[] aVarArr = new InterfaceC3752s.a[m14247d];
        Pair<InterfaceC3752s.a, Integer> m14135X = m14135X(aVar, iArr, iArr2, dVar);
        if (m14135X != null) {
            aVarArr[((Integer) m14135X.second).intValue()] = (InterfaceC3752s.a) m14135X.first;
        }
        Pair<InterfaceC3752s.a, Integer> m14131T = m14131T(aVar, iArr, iArr2, dVar);
        if (m14131T != null) {
            aVarArr[((Integer) m14131T.second).intValue()] = (InterfaceC3752s.a) m14131T.first;
        }
        if (m14131T == null) {
            str = null;
        } else {
            Object obj = m14131T.first;
            str = ((InterfaceC3752s.a) obj).f13466a.m19444b(((InterfaceC3752s.a) obj).f13467b[0]).f16497j;
        }
        Pair<InterfaceC3752s.a, Integer> m14133V = m14133V(aVar, iArr, dVar, str);
        if (m14133V != null) {
            aVarArr[((Integer) m14133V.second).intValue()] = (InterfaceC3752s.a) m14133V.first;
        }
        for (int i10 = 0; i10 < m14247d; i10++) {
            int m14248e = aVar.m14248e(i10);
            if (m14248e != 2 && m14248e != 1 && m14248e != 3) {
                aVarArr[i10] = m14132U(m14248e, aVar.m14249f(i10), iArr[i10], dVar);
            }
        }
        return aVarArr;
    }

    /* renamed from: T */
    public Pair<InterfaceC3752s.a, Integer> m14131T(AbstractC3754u.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < aVar.m14247d()) {
                if (2 == aVar.m14248e(i10) && aVar.m14249f(i10).f18478h > 0) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return m14134W(1, aVar, iArr, new h.a() { // from class: n5.l
            @Override // p193n5.C3746m.h.a
            /* renamed from: a */
            public final List mo14097a(int i11, C4881s0 c4881s0, int[] iArr3) {
                List m14106J;
                m14106J = C3746m.this.m14106J(dVar, z10, i11, c4881s0, iArr3);
                return m14106J;
            }
        }, new Comparator() { // from class: n5.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3746m.b.m14137f((List) obj, (List) obj2);
            }
        });
    }

    /* renamed from: U */
    public InterfaceC3752s.a m14132U(int i10, C4885u0 c4885u0, int[][] iArr, d dVar) {
        C4881s0 c4881s0 = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < c4885u0.f18478h; i12++) {
            C4881s0 m19452b = c4885u0.m19452b(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < m19452b.f18465h; i13++) {
                if (m14105I(iArr2[i13], dVar.f13401u0)) {
                    c cVar2 = new c(m19452b.m19444b(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        c4881s0 = m19452b;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (c4881s0 == null) {
            return null;
        }
        return new InterfaceC3752s.a(c4881s0, i11);
    }

    /* renamed from: V */
    public Pair<InterfaceC3752s.a, Integer> m14133V(AbstractC3754u.a aVar, int[][][] iArr, final d dVar, final String str) {
        return m14134W(3, aVar, iArr, new h.a() { // from class: n5.j
            @Override // p193n5.C3746m.h.a
            /* renamed from: a */
            public final List mo14097a(int i10, C4881s0 c4881s0, int[] iArr2) {
                List m14107K;
                m14107K = C3746m.m14107K(C3746m.d.this, str, i10, c4881s0, iArr2);
                return m14107K;
            }
        }, new Comparator() { // from class: n5.h
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3746m.g.m14225f((List) obj, (List) obj2);
            }
        });
    }

    /* renamed from: W */
    public final <T extends h<T>> Pair<InterfaceC3752s.a, Integer> m14134W(int i10, AbstractC3754u.a aVar, int[][][] iArr, h.a<T> aVar2, Comparator<List<T>> comparator) {
        int i11;
        RandomAccess randomAccess;
        AbstractC3754u.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int m14247d = aVar.m14247d();
        int i12 = 0;
        while (i12 < m14247d) {
            if (i10 == aVar3.m14248e(i12)) {
                C4885u0 m14249f = aVar3.m14249f(i12);
                for (int i13 = 0; i13 < m14249f.f18478h; i13++) {
                    C4881s0 m19452b = m14249f.m19452b(i13);
                    List<T> mo14097a = aVar2.mo14097a(i12, m19452b, iArr[i12][i13]);
                    boolean[] zArr = new boolean[m19452b.f18465h];
                    int i14 = 0;
                    while (i14 < m19452b.f18465h) {
                        T t10 = mo14097a.get(i14);
                        int mo14139b = t10.mo14139b();
                        if (zArr[i14] || mo14139b == 0) {
                            i11 = m14247d;
                        } else {
                            if (mo14139b == 1) {
                                randomAccess = AbstractC2651u.m10771v(t10);
                                i11 = m14247d;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t10);
                                int i15 = i14 + 1;
                                while (i15 < m19452b.f18465h) {
                                    T t11 = mo14097a.get(i15);
                                    int i16 = m14247d;
                                    if (t11.mo14139b() == 2 && t10.mo14140c(t11)) {
                                        arrayList2.add(t11);
                                        zArr[i15] = true;
                                    }
                                    i15++;
                                    m14247d = i16;
                                }
                                i11 = m14247d;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i14++;
                        m14247d = i11;
                    }
                }
            }
            i12++;
            aVar3 = aVar;
            m14247d = m14247d;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((h) list.get(i17)).f13445j;
        }
        h hVar = (h) list.get(0);
        return Pair.create(new InterfaceC3752s.a(hVar.f13444i, iArr2), Integer.valueOf(hVar.f13443h));
    }

    /* renamed from: X */
    public Pair<InterfaceC3752s.a, Integer> m14135X(AbstractC3754u.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return m14134W(2, aVar, iArr, new h.a() { // from class: n5.k
            @Override // p193n5.C3746m.h.a
            /* renamed from: a */
            public final List mo14097a(int i10, C4881s0 c4881s0, int[] iArr3) {
                List m14108L;
                m14108L = C3746m.m14108L(C3746m.d.this, iArr2, i10, c4881s0, iArr3);
                return m14108L;
            }
        }, new Comparator() { // from class: n5.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3746m.i.m14233m((List) obj, (List) obj2);
            }
        });
    }

    @Override // p193n5.AbstractC3734b0
    /* renamed from: d */
    public boolean mo14077d() {
        return true;
    }

    @Override // p193n5.AbstractC3734b0
    /* renamed from: f */
    public void mo14079f() {
        f fVar;
        synchronized (this.f13344d) {
            if (C4041n0.f14513a >= 32 && (fVar = this.f13349i) != null) {
                fVar.m14224f();
            }
        }
        super.mo14079f();
    }

    @Override // p193n5.AbstractC3734b0
    /* renamed from: h */
    public void mo14081h(C4813e c4813e) {
        boolean z10;
        synchronized (this.f13344d) {
            z10 = !this.f13350j.equals(c4813e);
            this.f13350j = c4813e;
        }
        if (z10) {
            m14129P();
        }
    }

    @Override // p193n5.AbstractC3754u
    /* renamed from: l */
    public final Pair<C4455k3[], InterfaceC3752s[]> mo14136l(AbstractC3754u.a aVar, int[][][] iArr, int[] iArr2, InterfaceC4882t.b bVar, AbstractC4505u3 abstractC4505u3) {
        d dVar;
        f fVar;
        synchronized (this.f13344d) {
            dVar = this.f13348h;
            if (dVar.f13400t0 && C4041n0.f14513a >= 32 && (fVar = this.f13349i) != null) {
                fVar.m14220b(this, (Looper) C4014a.m15202h(Looper.myLooper()));
            }
        }
        int m14247d = aVar.m14247d();
        InterfaceC3752s.a[] m14130S = m14130S(aVar, iArr, iArr2, dVar);
        m14127z(aVar, dVar, m14130S);
        m14126y(aVar, dVar, m14130S);
        for (int i10 = 0; i10 < m14247d; i10++) {
            int m14248e = aVar.m14248e(i10);
            if (dVar.m14171J(i10) || dVar.f13521G.contains(Integer.valueOf(m14248e))) {
                m14130S[i10] = null;
            }
        }
        InterfaceC3752s[] mo14069a = this.f13346f.mo14069a(m14130S, m14074a(), bVar, abstractC4505u3);
        C4455k3[] c4455k3Arr = new C4455k3[m14247d];
        for (int i11 = 0; i11 < m14247d; i11++) {
            boolean z10 = true;
            if ((dVar.m14171J(i11) || dVar.f13521G.contains(Integer.valueOf(aVar.m14248e(i11)))) || (aVar.m14248e(i11) != -2 && mo14069a[i11] == null)) {
                z10 = false;
            }
            c4455k3Arr[i11] = z10 ? C4455k3.f16424b : null;
        }
        if (dVar.f13402v0) {
            m14111O(aVar, iArr, c4455k3Arr, mo14069a);
        }
        return Pair.create(c4455k3Arr, mo14069a);
    }
}
