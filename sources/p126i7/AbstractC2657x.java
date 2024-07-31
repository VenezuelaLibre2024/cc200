package p126i7;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import p109h7.C2432o;

/* renamed from: i7.x */
/* loaded from: classes.dex */
public abstract class AbstractC2657x<E> extends AbstractC2647s<E> implements Set<E> {

    /* renamed from: i */
    public transient AbstractC2651u<E> f10398i;

    /* renamed from: k */
    public static int m10818k(int i10) {
        int max = Math.max(i10, 2);
        if (max >= 751619276) {
            C2432o.m9699e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    /* renamed from: m */
    public static <E> AbstractC2657x<E> m10819m(int i10, Object... objArr) {
        if (i10 == 0) {
            return m10822s();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m10823t(obj);
        }
        int m10818k = m10818k(i10);
        Object[] objArr2 = new Object[m10818k];
        int i11 = m10818k - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object m10716a = C2640o0.m10716a(objArr[i14], i14);
            int hashCode = m10716a.hashCode();
            int m10734b = C2645r.m10734b(hashCode);
            while (true) {
                int i15 = m10734b & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = m10716a;
                    objArr2[i15] = m10716a;
                    i12 += hashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(m10716a)) {
                    break;
                }
                m10734b++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new C2662z0(obj3);
        }
        if (m10818k(i13) < m10818k / 2) {
            return m10819m(i13, objArr);
        }
        if (m10828y(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new C2650t0(objArr, i12, objArr2, i11, i13);
    }

    /* renamed from: n */
    public static <E> AbstractC2657x<E> m10820n(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC2657x) && !(collection instanceof SortedSet)) {
            AbstractC2657x<E> abstractC2657x = (AbstractC2657x) collection;
            if (!abstractC2657x.mo10740h()) {
                return abstractC2657x;
            }
        }
        Object[] array = collection.toArray();
        return m10819m(array.length, array);
    }

    /* renamed from: o */
    public static <E> AbstractC2657x<E> m10821o(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? m10819m(eArr.length, (Object[]) eArr.clone()) : m10823t(eArr[0]) : m10822s();
    }

    /* renamed from: s */
    public static <E> AbstractC2657x<E> m10822s() {
        return C2650t0.f10361p;
    }

    /* renamed from: t */
    public static <E> AbstractC2657x<E> m10823t(E e10) {
        return new C2662z0(e10);
    }

    /* renamed from: u */
    public static <E> AbstractC2657x<E> m10824u(E e10, E e11) {
        return m10819m(2, e10, e11);
    }

    /* renamed from: v */
    public static <E> AbstractC2657x<E> m10825v(E e10, E e11, E e12) {
        return m10819m(3, e10, e11, e12);
    }

    /* renamed from: w */
    public static <E> AbstractC2657x<E> m10826w(E e10, E e11, E e12, E e13, E e14) {
        return m10819m(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    /* renamed from: x */
    public static <E> AbstractC2657x<E> m10827x(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        C2432o.m9699e(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return m10819m(length, objArr);
    }

    /* renamed from: y */
    public static boolean m10828y(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @Override // p126i7.AbstractC2647s
    /* renamed from: a */
    public AbstractC2651u<E> mo10741a() {
        AbstractC2651u<E> abstractC2651u = this.f10398i;
        if (abstractC2651u != null) {
            return abstractC2651u;
        }
        AbstractC2651u<E> mo10760p = mo10760p();
        this.f10398i = mo10760p;
        return mo10760p;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC2657x) && mo10762q() && ((AbstractC2657x) obj).mo10762q() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C2660y0.m10834a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C2660y0.m10837d(this);
    }

    @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: j */
    public abstract AbstractC2617d1<E> iterator();

    /* renamed from: p */
    public AbstractC2651u<E> mo10760p() {
        return AbstractC2651u.m10764k(toArray());
    }

    /* renamed from: q */
    public boolean mo10762q() {
        return false;
    }
}
