package p155k7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p079f6.C1841a;
import p109h7.C2432o;

/* renamed from: k7.e */
/* loaded from: classes.dex */
public final class C3368e extends AbstractC3369f {

    /* renamed from: k7.e$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {

        /* renamed from: h */
        public final int[] f11747h;

        /* renamed from: i */
        public final int f11748i;

        /* renamed from: j */
        public final int f11749j;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        public a(int[] iArr, int i10, int i11) {
            this.f11747h = iArr;
            this.f11748i = i10;
            this.f11749j = i11;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            C2432o.m9702h(i10, size());
            return Integer.valueOf(this.f11747h[this.f11748i + i10]);
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer set(int i10, Integer num) {
            C2432o.m9702h(i10, size());
            int[] iArr = this.f11747h;
            int i11 = this.f11748i;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) C2432o.m9704j(num)).intValue();
            return Integer.valueOf(i12);
        }

        /* renamed from: c */
        public int[] m12536c() {
            return Arrays.copyOfRange(this.f11747h, this.f11748i, this.f11749j);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C3368e.m12530i(this.f11747h, ((Integer) obj).intValue(), this.f11748i, this.f11749j) != -1;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11747h[this.f11748i + i10] != aVar.f11747h[aVar.f11748i + i10]) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f11748i; i11 < this.f11749j; i11++) {
                i10 = (i10 * 31) + C3368e.m12528g(this.f11747h[i11]);
            }
            return i10;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int m12530i;
            if (!(obj instanceof Integer) || (m12530i = C3368e.m12530i(this.f11747h, ((Integer) obj).intValue(), this.f11748i, this.f11749j)) < 0) {
                return -1;
            }
            return m12530i - this.f11748i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int m12531j;
            if (!(obj instanceof Integer) || (m12531j = C3368e.m12531j(this.f11747h, ((Integer) obj).intValue(), this.f11748i, this.f11749j)) < 0) {
                return -1;
            }
            return m12531j - this.f11748i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f11749j - this.f11748i;
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Integer> subList(int i10, int i11) {
            C2432o.m9708n(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f11747h;
            int i12 = this.f11748i;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f11747h[this.f11748i]);
            int i10 = this.f11748i;
            while (true) {
                i10++;
                if (i10 >= this.f11749j) {
                    sb2.append(']');
                    return sb2.toString();
                }
                sb2.append(", ");
                sb2.append(this.f11747h[i10]);
            }
        }
    }

    /* renamed from: c */
    public static List<Integer> m12524c(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new a(iArr);
    }

    /* renamed from: d */
    public static int m12525d(long j10) {
        int i10 = (int) j10;
        C2432o.m9701g(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    /* renamed from: e */
    public static int m12526e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    /* renamed from: f */
    public static int m12527f(int i10, int i11, int i12) {
        C2432o.m9700f(i11 <= i12, "min (%s) must be less than or equal to max (%s)", i11, i12);
        return Math.min(Math.max(i10, i11), i12);
    }

    /* renamed from: g */
    public static int m12528g(int i10) {
        return i10;
    }

    /* renamed from: h */
    public static int m12529h(int[] iArr, int i10) {
        return m12530i(iArr, i10, 0, iArr.length);
    }

    /* renamed from: i */
    public static int m12530i(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    /* renamed from: j */
    public static int m12531j(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    /* renamed from: k */
    public static int m12532k(long j10) {
        if (j10 > 2147483647L) {
            return C1841a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }

    /* renamed from: l */
    public static int[] m12533l(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).m12536c();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) C2432o.m9704j(array[i10])).intValue();
        }
        return iArr;
    }
}
