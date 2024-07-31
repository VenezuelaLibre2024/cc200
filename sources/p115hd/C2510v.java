package p115hd;

import ae.C0100f;
import gd.C2236j;
import gd.C2240n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p343xd.C5767k;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: hd.v */
/* loaded from: classes2.dex */
public class C2510v extends C2509u {
    /* renamed from: A */
    public static final <T> List<T> m9998A(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C4753m.m18653f(collection, "<this>");
        C4753m.m18653f(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C2507s.m9997m(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* renamed from: B */
    public static final <T> List<T> m9999B(Collection<? extends T> collection, T t10) {
        C4753m.m18653f(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    /* renamed from: C */
    public static final <T> T m10000C(Iterable<? extends T> iterable) {
        C4753m.m18653f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m10001D((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* renamed from: D */
    public static final <T> T m10001D(List<? extends T> list) {
        C4753m.m18653f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    /* renamed from: E */
    public static final <T> T m10002E(List<? extends T> list) {
        C4753m.m18653f(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: F */
    public static final <T> List<T> m10003F(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C4753m.m18653f(iterable, "<this>");
        C4753m.m18653f(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> m10010M = m10010M(iterable);
            C2506r.m9996l(m10010M, comparator);
            return m10010M;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m10008K(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C2495i.m9936g(array, comparator);
        return C2495i.m9931b(array);
    }

    /* renamed from: G */
    public static final <T> List<T> m10004G(Iterable<? extends T> iterable, int i10) {
        C4753m.m18653f(iterable, "<this>");
        int i11 = 0;
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Requested element count " + i10 + " is less than zero.").toString());
        }
        if (i10 == 0) {
            return C2502n.m9989e();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return m10008K(iterable);
            }
            if (i10 == 1) {
                return C2501m.m9986b(m10018q(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return C2502n.m9993i(arrayList);
    }

    /* renamed from: H */
    public static final byte[] m10005H(Collection<Byte> collection) {
        C4753m.m18653f(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    /* renamed from: I */
    public static final <T, C extends Collection<? super T>> C m10006I(Iterable<? extends T> iterable, C c10) {
        C4753m.m18653f(iterable, "<this>");
        C4753m.m18653f(c10, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c10.add(it.next());
        }
        return c10;
    }

    /* renamed from: J */
    public static final int[] m10007J(Collection<Integer> collection) {
        C4753m.m18653f(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    /* renamed from: K */
    public static final <T> List<T> m10008K(Iterable<? extends T> iterable) {
        C4753m.m18653f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C2502n.m9993i(m10010M(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C2502n.m9989e();
        }
        if (size != 1) {
            return m10011N(collection);
        }
        return C2501m.m9986b(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: L */
    public static final long[] m10009L(Collection<Long> collection) {
        C4753m.m18653f(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    /* renamed from: M */
    public static final <T> List<T> m10010M(Iterable<? extends T> iterable) {
        C4753m.m18653f(iterable, "<this>");
        return iterable instanceof Collection ? m10011N((Collection) iterable) : (List) m10006I(iterable, new ArrayList());
    }

    /* renamed from: N */
    public static final <T> List<T> m10011N(Collection<? extends T> collection) {
        C4753m.m18653f(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: O */
    public static final <T> Set<T> m10012O(Iterable<? extends T> iterable) {
        C4753m.m18653f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C2494h0.m9930c((Set) m10006I(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C2494h0.m9929b();
        }
        if (size != 1) {
            return (Set) m10006I(iterable, new LinkedHashSet(C2486d0.m9892a(collection.size())));
        }
        return C2492g0.m9928a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* renamed from: P */
    public static final <T> List<List<T>> m10013P(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        int m22906c;
        C4753m.m18653f(iterable, "<this>");
        C2496i0.m9937a(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator m9938b = C2496i0.m9938b(iterable.iterator(), i10, i11, z10, false);
            while (m9938b.hasNext()) {
                arrayList.add((List) m9938b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (true) {
            if (!(i12 >= 0 && i12 < size) || ((m22906c = C5767k.m22906c(i10, size - i12)) < i10 && !z10)) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(m22906c);
            for (int i13 = 0; i13 < m22906c; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    /* renamed from: Q */
    public static final <T, R> List<C2236j<T, R>> m10014Q(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        C4753m.m18653f(iterable, "<this>");
        C4753m.m18653f(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C2503o.m9995k(iterable, 10), C2503o.m9995k(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C2240n.m8977a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: n */
    public static final <T> boolean m10015n(Iterable<? extends T> iterable, T t10) {
        C4753m.m18653f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : m10021t(iterable, t10) >= 0;
    }

    /* renamed from: o */
    public static final <T> List<T> m10016o(Iterable<? extends T> iterable) {
        C4753m.m18653f(iterable, "<this>");
        return (List) m10017p(iterable, new ArrayList());
    }

    /* renamed from: p */
    public static final <C extends Collection<? super T>, T> C m10017p(Iterable<? extends T> iterable, C c10) {
        C4753m.m18653f(iterable, "<this>");
        C4753m.m18653f(c10, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                c10.add(t10);
            }
        }
        return c10;
    }

    /* renamed from: q */
    public static final <T> T m10018q(Iterable<? extends T> iterable) {
        C4753m.m18653f(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m10019r((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: r */
    public static final <T> T m10019r(List<? extends T> list) {
        C4753m.m18653f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    /* renamed from: s */
    public static final <T> T m10020s(List<? extends T> list) {
        C4753m.m18653f(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: t */
    public static final <T> int m10021t(Iterable<? extends T> iterable, T t10) {
        C4753m.m18653f(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                C2502n.m9994j();
            }
            if (C4753m.m18648a(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: u */
    public static final <T, A extends Appendable> A m10022u(Iterable<? extends T> iterable, A a10, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super T, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(iterable, "<this>");
        C4753m.m18653f(a10, "buffer");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        a10.append(charSequence2);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                a10.append(charSequence);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            C0100f.m413a(a10, t10, interfaceC4580l);
        }
        if (i10 >= 0 && i11 > i10) {
            a10.append(charSequence4);
        }
        a10.append(charSequence3);
        return a10;
    }

    /* renamed from: v */
    public static /* synthetic */ Appendable m10023v(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        return m10022u(iterable, appendable, (i11 & 2) != 0 ? ", " : charSequence, (i11 & 4) != 0 ? "" : charSequence2, (i11 & 8) == 0 ? charSequence3 : "", (i11 & 16) != 0 ? -1 : i10, (i11 & 32) != 0 ? "..." : charSequence4, (i11 & 64) != 0 ? null : interfaceC4580l);
    }

    /* renamed from: w */
    public static final <T> String m10024w(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l<? super T, ? extends CharSequence> interfaceC4580l) {
        C4753m.m18653f(iterable, "<this>");
        C4753m.m18653f(charSequence, "separator");
        C4753m.m18653f(charSequence2, "prefix");
        C4753m.m18653f(charSequence3, "postfix");
        C4753m.m18653f(charSequence4, "truncated");
        String sb2 = ((StringBuilder) m10022u(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i10, charSequence4, interfaceC4580l)).toString();
        C4753m.m18652e(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: x */
    public static /* synthetic */ String m10025x(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, InterfaceC4580l interfaceC4580l, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i11 & 32) != 0) {
            interfaceC4580l = null;
        }
        return m10024w(iterable, charSequence, charSequence5, charSequence6, i12, charSequence7, interfaceC4580l);
    }

    /* renamed from: y */
    public static final <T> T m10026y(List<? extends T> list) {
        C4753m.m18653f(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C2502n.m9990f(list));
    }

    /* renamed from: z */
    public static final <T extends Comparable<? super T>> T m10027z(Iterable<? extends T> iterable) {
        C4753m.m18653f(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }
}
