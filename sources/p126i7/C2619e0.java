package p126i7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p109h7.C2428k;
import p109h7.C2432o;
import p155k7.C3368e;

/* renamed from: i7.e0 */
/* loaded from: classes.dex */
public final class C2619e0 {
    /* renamed from: a */
    public static <T> List<T> m10585a(Iterable<T> iterable) {
        return (List) iterable;
    }

    /* renamed from: b */
    public static int m10586b(int i10) {
        C2627i.m10619b(i10, "arraySize");
        return C3368e.m12532k(i10 + 5 + (i10 / 10));
    }

    /* renamed from: c */
    public static boolean m10587c(List<?> list, Object obj) {
        if (obj == C2432o.m9704j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return C2613c0.m10521e(list.iterator(), list2.iterator());
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!C2428k.m9688a(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static int m10588d(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m10589e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (C2428k.m9688a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static int m10589e(List<?> list, Object obj) {
        int size = list.size();
        int i10 = 0;
        if (obj == null) {
            while (i10 < size) {
                if (list.get(i10) == null) {
                    return i10;
                }
                i10++;
            }
            return -1;
        }
        while (i10 < size) {
            if (obj.equals(list.get(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    /* renamed from: f */
    public static int m10590f(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return m10591g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (C2428k.m9688a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static int m10591g(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static <E> ArrayList<E> m10592h() {
        return new ArrayList<>();
    }

    /* renamed from: i */
    public static <E> ArrayList<E> m10593i(Iterator<? extends E> it) {
        ArrayList<E> m10592h = m10592h();
        C2613c0.m10517a(m10592h, it);
        return m10592h;
    }

    @SafeVarargs
    /* renamed from: j */
    public static <E> ArrayList<E> m10594j(E... eArr) {
        C2432o.m9704j(eArr);
        ArrayList<E> arrayList = new ArrayList<>(m10586b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
