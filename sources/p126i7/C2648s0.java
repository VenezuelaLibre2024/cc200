package p126i7;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p109h7.C2432o;
import p126i7.AbstractC2653v;

/* renamed from: i7.s0 */
/* loaded from: classes.dex */
public final class C2648s0<K, V> extends AbstractC2653v<K, V> {

    /* renamed from: o */
    public static final AbstractC2653v<Object, Object> f10344o = new C2648s0(null, new Object[0], 0);

    /* renamed from: l */
    public final transient Object f10345l;

    /* renamed from: m */
    public final transient Object[] f10346m;

    /* renamed from: n */
    public final transient int f10347n;

    /* renamed from: i7.s0$a */
    /* loaded from: classes.dex */
    public static class a<K, V> extends AbstractC2657x<Map.Entry<K, V>> {

        /* renamed from: j */
        public final transient AbstractC2653v<K, V> f10348j;

        /* renamed from: k */
        public final transient Object[] f10349k;

        /* renamed from: l */
        public final transient int f10350l;

        /* renamed from: m */
        public final transient int f10351m;

        /* renamed from: i7.s0$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C6188a extends AbstractC2651u<Map.Entry<K, V>> {
            public C6188a() {
            }

            @Override // java.util.List
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i10) {
                C2432o.m9702h(i10, a.this.f10351m);
                int i11 = i10 * 2;
                Object obj = a.this.f10349k[a.this.f10350l + i11];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f10349k[i11 + (a.this.f10350l ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // p126i7.AbstractC2647s
            /* renamed from: h */
            public boolean mo10740h() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f10351m;
            }
        }

        public a(AbstractC2653v<K, V> abstractC2653v, Object[] objArr, int i10, int i11) {
            this.f10348j = abstractC2653v;
            this.f10349k = objArr;
            this.f10350l = i10;
            this.f10351m = i11;
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: b */
        public int mo10736b(Object[] objArr, int i10) {
            return mo10741a().mo10736b(objArr, i10);
        }

        @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f10348j.get(key));
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: h */
        public boolean mo10740h() {
            return true;
        }

        @Override // p126i7.AbstractC2657x, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: j */
        public AbstractC2617d1<Map.Entry<K, V>> iterator() {
            return mo10741a().iterator();
        }

        @Override // p126i7.AbstractC2657x
        /* renamed from: p */
        public AbstractC2651u<Map.Entry<K, V>> mo10760p() {
            return new C6188a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f10351m;
        }
    }

    /* renamed from: i7.s0$b */
    /* loaded from: classes.dex */
    public static final class b<K> extends AbstractC2657x<K> {

        /* renamed from: j */
        public final transient AbstractC2653v<K, ?> f10353j;

        /* renamed from: k */
        public final transient AbstractC2651u<K> f10354k;

        public b(AbstractC2653v<K, ?> abstractC2653v, AbstractC2651u<K> abstractC2651u) {
            this.f10353j = abstractC2653v;
            this.f10354k = abstractC2651u;
        }

        @Override // p126i7.AbstractC2657x, p126i7.AbstractC2647s
        /* renamed from: a */
        public AbstractC2651u<K> mo10741a() {
            return this.f10354k;
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: b */
        public int mo10736b(Object[] objArr, int i10) {
            return mo10741a().mo10736b(objArr, i10);
        }

        @Override // p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.f10353j.get(obj) != null;
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: h */
        public boolean mo10740h() {
            return true;
        }

        @Override // p126i7.AbstractC2657x, p126i7.AbstractC2647s, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: j */
        public AbstractC2617d1<K> iterator() {
            return mo10741a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f10353j.size();
        }
    }

    /* renamed from: i7.s0$c */
    /* loaded from: classes.dex */
    public static final class c extends AbstractC2651u<Object> {

        /* renamed from: j */
        public final transient Object[] f10355j;

        /* renamed from: k */
        public final transient int f10356k;

        /* renamed from: l */
        public final transient int f10357l;

        public c(Object[] objArr, int i10, int i11) {
            this.f10355j = objArr;
            this.f10356k = i10;
            this.f10357l = i11;
        }

        @Override // java.util.List
        public Object get(int i10) {
            C2432o.m9702h(i10, this.f10357l);
            Object obj = this.f10355j[(i10 * 2) + this.f10356k];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // p126i7.AbstractC2647s
        /* renamed from: h */
        public boolean mo10740h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10357l;
        }
    }

    public C2648s0(Object obj, Object[] objArr, int i10) {
        this.f10345l = obj;
        this.f10346m = objArr;
        this.f10347n = i10;
    }

    /* renamed from: l */
    public static <K, V> C2648s0<K, V> m10750l(int i10, Object[] objArr, AbstractC2653v.a<K, V> aVar) {
        if (i10 == 0) {
            return (C2648s0) f10344o;
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            C2627i.m10618a(obj, obj2);
            return new C2648s0<>(null, objArr, 1);
        }
        C2432o.m9706l(i10, objArr.length >> 1);
        Object m10751m = m10751m(objArr, i10, AbstractC2657x.m10818k(i10), 0);
        if (m10751m instanceof Object[]) {
            Object[] objArr2 = (Object[]) m10751m;
            AbstractC2653v.a.C6189a c6189a = (AbstractC2653v.a.C6189a) objArr2[2];
            if (aVar == null) {
                throw c6189a.m10813a();
            }
            aVar.f10383e = c6189a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            m10751m = obj3;
            i10 = intValue;
        }
        return new C2648s0<>(m10751m, objArr, i10);
    }

    /* renamed from: m */
    public static Object m10751m(Object[] objArr, int i10, int i11, int i12) {
        AbstractC2653v.a.C6189a c6189a = null;
        if (i10 == 1) {
            Object obj = objArr[i12];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj2);
            C2627i.m10618a(obj, obj2);
            return null;
        }
        int i13 = i11 - 1;
        int i14 = -1;
        if (i11 <= 128) {
            byte[] bArr = new byte[i11];
            Arrays.fill(bArr, (byte) -1);
            int i15 = 0;
            for (int i16 = 0; i16 < i10; i16++) {
                int i17 = (i16 * 2) + i12;
                int i18 = (i15 * 2) + i12;
                Object obj3 = objArr[i17];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i17 ^ 1];
                Objects.requireNonNull(obj4);
                C2627i.m10618a(obj3, obj4);
                int m10734b = C2645r.m10734b(obj3.hashCode());
                while (true) {
                    int i19 = m10734b & i13;
                    int i20 = bArr[i19] & 255;
                    if (i20 == 255) {
                        bArr[i19] = (byte) i18;
                        if (i15 < i16) {
                            objArr[i18] = obj3;
                            objArr[i18 ^ 1] = obj4;
                        }
                        i15++;
                    } else {
                        if (obj3.equals(objArr[i20])) {
                            int i21 = i20 ^ 1;
                            Object obj5 = objArr[i21];
                            Objects.requireNonNull(obj5);
                            c6189a = new AbstractC2653v.a.C6189a(obj3, obj4, obj5);
                            objArr[i21] = obj4;
                            break;
                        }
                        m10734b = i19 + 1;
                    }
                }
            }
            return i15 == i10 ? bArr : new Object[]{bArr, Integer.valueOf(i15), c6189a};
        }
        if (i11 <= 32768) {
            short[] sArr = new short[i11];
            Arrays.fill(sArr, (short) -1);
            int i22 = 0;
            for (int i23 = 0; i23 < i10; i23++) {
                int i24 = (i23 * 2) + i12;
                int i25 = (i22 * 2) + i12;
                Object obj6 = objArr[i24];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i24 ^ 1];
                Objects.requireNonNull(obj7);
                C2627i.m10618a(obj6, obj7);
                int m10734b2 = C2645r.m10734b(obj6.hashCode());
                while (true) {
                    int i26 = m10734b2 & i13;
                    int i27 = sArr[i26] & 65535;
                    if (i27 == 65535) {
                        sArr[i26] = (short) i25;
                        if (i22 < i23) {
                            objArr[i25] = obj6;
                            objArr[i25 ^ 1] = obj7;
                        }
                        i22++;
                    } else {
                        if (obj6.equals(objArr[i27])) {
                            int i28 = i27 ^ 1;
                            Object obj8 = objArr[i28];
                            Objects.requireNonNull(obj8);
                            c6189a = new AbstractC2653v.a.C6189a(obj6, obj7, obj8);
                            objArr[i28] = obj7;
                            break;
                        }
                        m10734b2 = i26 + 1;
                    }
                }
            }
            return i22 == i10 ? sArr : new Object[]{sArr, Integer.valueOf(i22), c6189a};
        }
        int[] iArr = new int[i11];
        Arrays.fill(iArr, -1);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i10) {
            int i31 = (i29 * 2) + i12;
            int i32 = (i30 * 2) + i12;
            Object obj9 = objArr[i31];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i31 ^ 1];
            Objects.requireNonNull(obj10);
            C2627i.m10618a(obj9, obj10);
            int m10734b3 = C2645r.m10734b(obj9.hashCode());
            while (true) {
                int i33 = m10734b3 & i13;
                int i34 = iArr[i33];
                if (i34 == i14) {
                    iArr[i33] = i32;
                    if (i30 < i29) {
                        objArr[i32] = obj9;
                        objArr[i32 ^ 1] = obj10;
                    }
                    i30++;
                } else {
                    if (obj9.equals(objArr[i34])) {
                        int i35 = i34 ^ 1;
                        Object obj11 = objArr[i35];
                        Objects.requireNonNull(obj11);
                        c6189a = new AbstractC2653v.a.C6189a(obj9, obj10, obj11);
                        objArr[i35] = obj10;
                        break;
                    }
                    m10734b3 = i33 + 1;
                    i14 = -1;
                }
            }
            i29++;
            i14 = -1;
        }
        return i30 == i10 ? iArr : new Object[]{iArr, Integer.valueOf(i30), c6189a};
    }

    /* renamed from: n */
    public static Object m10752n(Object obj, Object[] objArr, int i10, int i11, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i10 == 1) {
            Object obj3 = objArr[i11];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i11 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int m10734b = C2645r.m10734b(obj2.hashCode());
            while (true) {
                int i12 = m10734b & length;
                int i13 = bArr[i12] & 255;
                if (i13 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                m10734b = i12 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int m10734b2 = C2645r.m10734b(obj2.hashCode());
            while (true) {
                int i14 = m10734b2 & length2;
                int i15 = sArr[i14] & 65535;
                if (i15 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                m10734b2 = i14 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int m10734b3 = C2645r.m10734b(obj2.hashCode());
            while (true) {
                int i16 = m10734b3 & length3;
                int i17 = iArr[i16];
                if (i17 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i17])) {
                    return objArr[i17 ^ 1];
                }
                m10734b3 = i16 + 1;
            }
        }
    }

    @Override // p126i7.AbstractC2653v
    /* renamed from: d */
    public AbstractC2657x<Map.Entry<K, V>> mo10753d() {
        return new a(this, this.f10346m, 0, this.f10347n);
    }

    @Override // p126i7.AbstractC2653v
    /* renamed from: e */
    public AbstractC2657x<K> mo10754e() {
        return new b(this, new c(this.f10346m, 0, this.f10347n));
    }

    @Override // p126i7.AbstractC2653v
    /* renamed from: f */
    public AbstractC2647s<V> mo10755f() {
        return new c(this.f10346m, 1, this.f10347n);
    }

    @Override // p126i7.AbstractC2653v, java.util.Map
    public V get(Object obj) {
        V v10 = (V) m10752n(this.f10345l, this.f10346m, this.f10347n, 0, obj);
        if (v10 == null) {
            return null;
        }
        return v10;
    }

    @Override // p126i7.AbstractC2653v
    /* renamed from: h */
    public boolean mo10756h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f10347n;
    }
}
