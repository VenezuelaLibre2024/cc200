package p301v0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p301v0.C5058k0;
import p301v0.C5086t1;
import p301v0.InterfaceC5089u1;

/* renamed from: v0.l */
/* loaded from: classes.dex */
public final class C5060l implements InterfaceC5089u1 {

    /* renamed from: a */
    public final AbstractC5057k f19020a;

    /* renamed from: v0.l$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19021a;

        static {
            int[] iArr = new int[C5086t1.b.values().length];
            f19021a = iArr;
            try {
                iArr[C5086t1.b.f19093q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19021a[C5086t1.b.f19092p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19021a[C5086t1.b.f19090n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19021a[C5086t1.b.f19100x.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19021a[C5086t1.b.f19102z.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19021a[C5086t1.b.f19098v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19021a[C5086t1.b.f19091o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19021a[C5086t1.b.f19088l.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19021a[C5086t1.b.f19101y.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19021a[C5086t1.b.f19084A.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19021a[C5086t1.b.f19089m.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19021a[C5086t1.b.f19094r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C5060l(AbstractC5057k abstractC5057k) {
        AbstractC5057k abstractC5057k2 = (AbstractC5057k) C5028a0.m19790b(abstractC5057k, "output");
        this.f19020a = abstractC5057k2;
        abstractC5057k2.f18997a = this;
    }

    /* renamed from: P */
    public static C5060l m20290P(AbstractC5057k abstractC5057k) {
        C5060l c5060l = abstractC5057k.f18997a;
        return c5060l != null ? c5060l : new C5060l(abstractC5057k);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: A */
    public <K, V> void mo20291A(int i10, C5058k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f19020a.m20250e0()) {
            m20309T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f19020a.mo20242W0(i10, 2);
            this.f19020a.mo20244Y0(C5058k0.m20283b(aVar, entry.getKey(), entry.getValue()));
            C5058k0.m20285e(this.f19020a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: B */
    public void mo20292B(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.mo20243X0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20188X(list.get(i13).intValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.mo20244Y0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: C */
    public void mo20293C(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.m20238S0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20183S(list.get(i13).longValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20239T0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: D */
    public void mo20294D(int i10, List<?> list, InterfaceC5047g1 interfaceC5047g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo20323l(i10, list.get(i11), interfaceC5047g1);
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: E */
    public void mo20295E(int i10, List<?> list, InterfaceC5047g1 interfaceC5047g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo20329r(i10, list.get(i11), interfaceC5047g1);
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: F */
    public void mo20296F(int i10, long j10) {
        this.f19020a.m20238S0(i10, j10);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: G */
    public void mo20297G(int i10, float f10) {
        this.f19020a.m20267y0(i10, f10);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: H */
    public void mo20298H(int i10) {
        this.f19020a.mo20242W0(i10, 4);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: I */
    public void mo20299I(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.m20236Q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20181Q(list.get(i13).intValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20237R0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: J */
    public void mo20300J(int i10, int i11) {
        this.f19020a.m20261s0(i10, i11);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: K */
    public void mo20301K(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.m20226G0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20218y(list.get(i13).longValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20227H0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: L */
    public void mo20302L(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.m20261s0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20205l(list.get(i13).intValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20262t0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: M */
    public void mo20303M(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.m20259q0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20203j(list.get(i13).doubleValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20260r0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: N */
    public void mo20304N(int i10, int i11) {
        this.f19020a.m20236Q0(i10, i11);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: O */
    public void mo20305O(int i10, List<AbstractC5048h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f19020a.mo20257o0(i10, list.get(i11));
        }
    }

    /* renamed from: Q */
    public final <V> void m20306Q(int i10, boolean z10, V v10, C5058k0.a<Boolean, V> aVar) {
        this.f19020a.mo20242W0(i10, 2);
        this.f19020a.mo20244Y0(C5058k0.m20283b(aVar, Boolean.valueOf(z10), v10));
        C5058k0.m20285e(this.f19020a, aVar, Boolean.valueOf(z10), v10);
    }

    /* renamed from: R */
    public final <V> void m20307R(int i10, C5058k0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f19020a.mo20242W0(i10, 2);
            this.f19020a.mo20244Y0(C5058k0.m20283b(aVar, Integer.valueOf(i13), v10));
            C5058k0.m20285e(this.f19020a, aVar, Integer.valueOf(i13), v10);
        }
    }

    /* renamed from: S */
    public final <V> void m20308S(int i10, C5058k0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f19020a.mo20242W0(i10, 2);
            this.f19020a.mo20244Y0(C5058k0.m20283b(aVar, Long.valueOf(j10), v10));
            C5058k0.m20285e(this.f19020a, aVar, Long.valueOf(j10), v10);
        }
    }

    /* renamed from: T */
    public final <K, V> void m20309T(int i10, C5058k0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f19021a[aVar.f19011a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    m20306Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    m20306Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m20307R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m20308S(i10, aVar, map);
                return;
            case 12:
                m20310U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f19011a);
        }
    }

    /* renamed from: U */
    public final <V> void m20310U(int i10, C5058k0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f19020a.mo20242W0(i10, 2);
            this.f19020a.mo20244Y0(C5058k0.m20283b(aVar, str, v10));
            C5058k0.m20285e(this.f19020a, aVar, str, v10);
        }
    }

    /* renamed from: V */
    public final void m20311V(int i10, Object obj) {
        if (obj instanceof String) {
            this.f19020a.mo20240U0(i10, (String) obj);
        } else {
            this.f19020a.mo20257o0(i10, (AbstractC5048h) obj);
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: a */
    public void mo20312a(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.m20267y0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20211r(list.get(i13).floatValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20268z0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: b */
    public void mo20313b(int i10, int i11) {
        this.f19020a.mo20243X0(i10, i11);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: c */
    public final void mo20314c(int i10, Object obj) {
        if (obj instanceof AbstractC5048h) {
            this.f19020a.mo20231L0(i10, (AbstractC5048h) obj);
        } else {
            this.f19020a.mo20230K0(i10, (InterfaceC5079r0) obj);
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: d */
    public void mo20315d(int i10, int i11) {
        this.f19020a.mo20263u0(i10, i11);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: e */
    public void mo20316e(int i10, AbstractC5048h abstractC5048h) {
        this.f19020a.mo20257o0(i10, abstractC5048h);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: f */
    public void mo20317f(int i10, double d10) {
        this.f19020a.m20259q0(i10, d10);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: g */
    public void mo20318g(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.m20234O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20179O(list.get(i13).longValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20235P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: h */
    public void mo20319h(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.mo20245Z0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20190Z(list.get(i13).longValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.mo20246a1(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: i */
    public void mo20320i(int i10, long j10) {
        this.f19020a.mo20265w0(i10, j10);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: j */
    public InterfaceC5089u1.a mo20321j() {
        return InterfaceC5089u1.a.ASCENDING;
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: k */
    public void mo20322k(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC5046g0)) {
            while (i11 < list.size()) {
                this.f19020a.mo20240U0(i10, list.get(i11));
                i11++;
            }
        } else {
            InterfaceC5046g0 interfaceC5046g0 = (InterfaceC5046g0) list;
            while (i11 < list.size()) {
                m20311V(i10, interfaceC5046g0.mo19929F(i11));
                i11++;
            }
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: l */
    public void mo20323l(int i10, Object obj, InterfaceC5047g1 interfaceC5047g1) {
        this.f19020a.m20221B0(i10, (InterfaceC5079r0) obj, interfaceC5047g1);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: m */
    public void mo20324m(int i10, String str) {
        this.f19020a.mo20240U0(i10, str);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: n */
    public void mo20325n(int i10, long j10) {
        this.f19020a.mo20245Z0(i10, j10);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: o */
    public void mo20326o(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.mo20224E0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20216w(list.get(i13).intValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.mo20225F0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: p */
    public void mo20327p(int i10, long j10) {
        this.f19020a.m20226G0(i10, j10);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: q */
    public void mo20328q(int i10, boolean z10) {
        this.f19020a.mo20253k0(i10, z10);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: r */
    public void mo20329r(int i10, Object obj, InterfaceC5047g1 interfaceC5047g1) {
        this.f19020a.mo20228I0(i10, (InterfaceC5079r0) obj, interfaceC5047g1);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: s */
    public void mo20330s(int i10, int i11) {
        this.f19020a.m20232M0(i10, i11);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: t */
    public void mo20331t(int i10) {
        this.f19020a.mo20242W0(i10, 3);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: u */
    public void mo20332u(int i10, int i11) {
        this.f19020a.mo20224E0(i10, i11);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: v */
    public void mo20333v(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.mo20265w0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20209p(list.get(i13).longValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.mo20266x0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: w */
    public void mo20334w(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.m20232M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20177M(list.get(i13).intValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20233N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: x */
    public void mo20335x(int i10, long j10) {
        this.f19020a.m20234O0(i10, j10);
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: y */
    public void mo20336y(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.mo20263u0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20207n(list.get(i13).intValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.mo20264v0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // p301v0.InterfaceC5089u1
    /* renamed from: z */
    public void mo20337z(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f19020a.mo20253k0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f19020a.mo20242W0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            i12 += AbstractC5057k.m20195e(list.get(i13).booleanValue());
        }
        this.f19020a.mo20244Y0(i12);
        while (i11 < list.size()) {
            this.f19020a.m20254l0(list.get(i11).booleanValue());
            i11++;
        }
    }
}
