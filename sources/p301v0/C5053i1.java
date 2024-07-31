package p301v0;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import p301v0.C5028a0;
import p301v0.C5087u;

/* renamed from: v0.i1 */
/* loaded from: classes.dex */
public final class C5053i1 {

    /* renamed from: a */
    public static final Class<?> f18962a = m20065B();

    /* renamed from: b */
    public static final AbstractC5068n1<?, ?> f18963b = m20066C(false);

    /* renamed from: c */
    public static final AbstractC5068n1<?, ?> f18964c = m20066C(true);

    /* renamed from: d */
    public static final AbstractC5068n1<?, ?> f18965d = new C5074p1();

    /* renamed from: A */
    public static <UT, UB> UB m20064A(int i10, List<Integer> list, C5028a0.e eVar, UB ub2, AbstractC5068n1<UT, UB> abstractC5068n1) {
        if (eVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (eVar.m19801a(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m20075L(i10, intValue, ub2, abstractC5068n1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.m19801a(intValue2)) {
                    ub2 = (UB) m20075L(i10, intValue2, ub2, abstractC5068n1);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    /* renamed from: B */
    public static Class<?> m20065B() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static AbstractC5068n1<?, ?> m20066C(boolean z10) {
        try {
            Class<?> m20067D = m20067D();
            if (m20067D == null) {
                return null;
            }
            return (AbstractC5068n1) m20067D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static Class<?> m20067D() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    public static <T, FT extends C5087u.b<FT>> void m20068E(AbstractC5075q<FT> abstractC5075q, T t10, T t11) {
        C5087u<FT> mo20440c = abstractC5075q.mo20440c(t11);
        if (mo20440c.m20598n()) {
            return;
        }
        abstractC5075q.mo20441d(t10).m20603u(mo20440c);
    }

    /* renamed from: F */
    public static <T> void m20069F(InterfaceC5064m0 interfaceC5064m0, T t10, T t11, long j10) {
        C5080r1.m20476O(t10, j10, interfaceC5064m0.mo20365a(C5080r1.m20462A(t10, j10), C5080r1.m20462A(t11, j10)));
    }

    /* renamed from: G */
    public static <T, UT, UB> void m20070G(AbstractC5068n1<UT, UB> abstractC5068n1, T t10, T t11) {
        abstractC5068n1.mo20391p(t10, abstractC5068n1.mo20386k(abstractC5068n1.mo20382g(t10), abstractC5068n1.mo20382g(t11)));
    }

    /* renamed from: H */
    public static AbstractC5068n1<?, ?> m20071H() {
        return f18963b;
    }

    /* renamed from: I */
    public static AbstractC5068n1<?, ?> m20072I() {
        return f18964c;
    }

    /* renamed from: J */
    public static void m20073J(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC5096y.class.isAssignableFrom(cls) && (cls2 = f18962a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    public static boolean m20074K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    public static <UT, UB> UB m20075L(int i10, int i11, UB ub2, AbstractC5068n1<UT, UB> abstractC5068n1) {
        if (ub2 == null) {
            ub2 = abstractC5068n1.mo20389n();
        }
        abstractC5068n1.mo20380e(ub2, i10, i11);
        return ub2;
    }

    /* renamed from: M */
    public static AbstractC5068n1<?, ?> m20076M() {
        return f18965d;
    }

    /* renamed from: N */
    public static void m20077N(int i10, List<Boolean> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20337z(i10, list, z10);
    }

    /* renamed from: O */
    public static void m20078O(int i10, List<AbstractC5048h> list, InterfaceC5089u1 interfaceC5089u1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20305O(i10, list);
    }

    /* renamed from: P */
    public static void m20079P(int i10, List<Double> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20303M(i10, list, z10);
    }

    /* renamed from: Q */
    public static void m20080Q(int i10, List<Integer> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20302L(i10, list, z10);
    }

    /* renamed from: R */
    public static void m20081R(int i10, List<Integer> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20336y(i10, list, z10);
    }

    /* renamed from: S */
    public static void m20082S(int i10, List<Long> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20333v(i10, list, z10);
    }

    /* renamed from: T */
    public static void m20083T(int i10, List<Float> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20312a(i10, list, z10);
    }

    /* renamed from: U */
    public static void m20084U(int i10, List<?> list, InterfaceC5089u1 interfaceC5089u1, InterfaceC5047g1 interfaceC5047g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20294D(i10, list, interfaceC5047g1);
    }

    /* renamed from: V */
    public static void m20085V(int i10, List<Integer> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20326o(i10, list, z10);
    }

    /* renamed from: W */
    public static void m20086W(int i10, List<Long> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20301K(i10, list, z10);
    }

    /* renamed from: X */
    public static void m20087X(int i10, List<?> list, InterfaceC5089u1 interfaceC5089u1, InterfaceC5047g1 interfaceC5047g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20295E(i10, list, interfaceC5047g1);
    }

    /* renamed from: Y */
    public static void m20088Y(int i10, List<Integer> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20334w(i10, list, z10);
    }

    /* renamed from: Z */
    public static void m20089Z(int i10, List<Long> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20318g(i10, list, z10);
    }

    /* renamed from: a */
    public static int m20090a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC5057k.m20186V(i10) + AbstractC5057k.m20167C(size) : size * AbstractC5057k.m20194d(i10, true);
    }

    /* renamed from: a0 */
    public static void m20091a0(int i10, List<Integer> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20299I(i10, list, z10);
    }

    /* renamed from: b */
    public static int m20092b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m20093b0(int i10, List<Long> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20293C(i10, list, z10);
    }

    /* renamed from: c */
    public static int m20094c(int i10, List<AbstractC5048h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20186V = size * AbstractC5057k.m20186V(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            m20186V += AbstractC5057k.m20200h(list.get(i11));
        }
        return m20186V;
    }

    /* renamed from: c0 */
    public static void m20095c0(int i10, List<String> list, InterfaceC5089u1 interfaceC5089u1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20322k(i10, list);
    }

    /* renamed from: d */
    public static int m20096d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20098e = m20098e(list);
        int m20186V = AbstractC5057k.m20186V(i10);
        return z10 ? m20186V + AbstractC5057k.m20167C(m20098e) : m20098e + (size * m20186V);
    }

    /* renamed from: d0 */
    public static void m20097d0(int i10, List<Integer> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20292B(i10, list, z10);
    }

    /* renamed from: e */
    public static int m20098e(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5098z) {
            C5098z c5098z = (C5098z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20205l(c5098z.m20735k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20205l(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: e0 */
    public static void m20099e0(int i10, List<Long> list, InterfaceC5089u1 interfaceC5089u1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC5089u1.mo20319h(i10, list, z10);
    }

    /* renamed from: f */
    public static int m20100f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC5057k.m20186V(i10) + AbstractC5057k.m20167C(size * 4) : size * AbstractC5057k.m20206m(i10, 0);
    }

    /* renamed from: g */
    public static int m20101g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m20102h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC5057k.m20186V(i10) + AbstractC5057k.m20167C(size * 8) : size * AbstractC5057k.m20208o(i10, 0L);
    }

    /* renamed from: i */
    public static int m20103i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m20104j(int i10, List<InterfaceC5079r0> list, InterfaceC5047g1 interfaceC5047g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC5057k.m20212s(i10, list.get(i12), interfaceC5047g1);
        }
        return i11;
    }

    /* renamed from: k */
    public static int m20105k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20106l = m20106l(list);
        int m20186V = AbstractC5057k.m20186V(i10);
        return z10 ? m20186V + AbstractC5057k.m20167C(m20106l) : m20106l + (size * m20186V);
    }

    /* renamed from: l */
    public static int m20106l(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5098z) {
            C5098z c5098z = (C5098z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20216w(c5098z.m20735k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20216w(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: m */
    public static int m20107m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int m20108n = m20108n(list);
        return z10 ? AbstractC5057k.m20186V(i10) + AbstractC5057k.m20167C(m20108n) : m20108n + (list.size() * AbstractC5057k.m20186V(i10));
    }

    /* renamed from: n */
    public static int m20108n(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5052i0) {
            C5052i0 c5052i0 = (C5052i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20218y(c5052i0.m20058k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20218y(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: o */
    public static int m20109o(int i10, Object obj, InterfaceC5047g1 interfaceC5047g1) {
        return obj instanceof C5040e0 ? AbstractC5057k.m20165A(i10, (C5040e0) obj) : AbstractC5057k.m20170F(i10, (InterfaceC5079r0) obj, interfaceC5047g1);
    }

    /* renamed from: p */
    public static int m20110p(int i10, List<?> list, InterfaceC5047g1 interfaceC5047g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20186V = AbstractC5057k.m20186V(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            m20186V += obj instanceof C5040e0 ? AbstractC5057k.m20166B((C5040e0) obj) : AbstractC5057k.m20172H((InterfaceC5079r0) obj, interfaceC5047g1);
        }
        return m20186V;
    }

    /* renamed from: q */
    public static int m20111q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20112r = m20112r(list);
        int m20186V = AbstractC5057k.m20186V(i10);
        return z10 ? m20186V + AbstractC5057k.m20167C(m20112r) : m20112r + (size * m20186V);
    }

    /* renamed from: r */
    public static int m20112r(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5098z) {
            C5098z c5098z = (C5098z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20181Q(c5098z.m20735k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20181Q(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: s */
    public static int m20113s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20114t = m20114t(list);
        int m20186V = AbstractC5057k.m20186V(i10);
        return z10 ? m20186V + AbstractC5057k.m20167C(m20114t) : m20114t + (size * m20186V);
    }

    /* renamed from: t */
    public static int m20114t(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5052i0) {
            C5052i0 c5052i0 = (C5052i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20183S(c5052i0.m20058k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20183S(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: u */
    public static int m20115u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int m20186V = AbstractC5057k.m20186V(i10) * size;
        if (list instanceof InterfaceC5046g0) {
            InterfaceC5046g0 interfaceC5046g0 = (InterfaceC5046g0) list;
            while (i11 < size) {
                Object mo19929F = interfaceC5046g0.mo19929F(i11);
                m20186V += mo19929F instanceof AbstractC5048h ? AbstractC5057k.m20200h((AbstractC5048h) mo19929F) : AbstractC5057k.m20185U((String) mo19929F);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                m20186V += obj instanceof AbstractC5048h ? AbstractC5057k.m20200h((AbstractC5048h) obj) : AbstractC5057k.m20185U((String) obj);
                i11++;
            }
        }
        return m20186V;
    }

    /* renamed from: v */
    public static int m20116v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20117w = m20117w(list);
        int m20186V = AbstractC5057k.m20186V(i10);
        return z10 ? m20186V + AbstractC5057k.m20167C(m20117w) : m20117w + (size * m20186V);
    }

    /* renamed from: w */
    public static int m20117w(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5098z) {
            C5098z c5098z = (C5098z) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20188X(c5098z.m20735k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20188X(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: x */
    public static int m20118x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20119y = m20119y(list);
        int m20186V = AbstractC5057k.m20186V(i10);
        return z10 ? m20186V + AbstractC5057k.m20167C(m20119y) : m20119y + (size * m20186V);
    }

    /* renamed from: y */
    public static int m20119y(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5052i0) {
            C5052i0 c5052i0 = (C5052i0) list;
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20190Z(c5052i0.m20058k(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += AbstractC5057k.m20190Z(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* renamed from: z */
    public static <UT, UB> UB m20120z(int i10, List<Integer> list, C5028a0.d<?> dVar, UB ub2, AbstractC5068n1<UT, UB> abstractC5068n1) {
        if (dVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (dVar.m19800a(intValue) != null) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) m20075L(i10, intValue, ub2, abstractC5068n1);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.m19800a(intValue2) == null) {
                    ub2 = (UB) m20075L(i10, intValue2, ub2, abstractC5068n1);
                    it.remove();
                }
            }
        }
        return ub2;
    }
}
