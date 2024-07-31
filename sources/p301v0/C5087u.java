package p301v0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p301v0.C5028a0;
import p301v0.C5037d0;
import p301v0.C5086t1;
import p301v0.C5087u.b;
import p301v0.InterfaceC5079r0;

/* renamed from: v0.u */
/* loaded from: classes.dex */
public final class C5087u<T extends b<T>> {

    /* renamed from: d */
    public static final C5087u f19116d = new C5087u(true);

    /* renamed from: a */
    public final C5056j1<T, Object> f19117a;

    /* renamed from: b */
    public boolean f19118b;

    /* renamed from: c */
    public boolean f19119c;

    /* renamed from: v0.u$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19120a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f19121b;

        static {
            int[] iArr = new int[C5086t1.b.values().length];
            f19121b = iArr;
            try {
                iArr[C5086t1.b.f19086j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19121b[C5086t1.b.f19087k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19121b[C5086t1.b.f19088l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19121b[C5086t1.b.f19089m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19121b[C5086t1.b.f19090n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19121b[C5086t1.b.f19091o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19121b[C5086t1.b.f19092p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19121b[C5086t1.b.f19093q.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19121b[C5086t1.b.f19095s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19121b[C5086t1.b.f19096t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19121b[C5086t1.b.f19094r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19121b[C5086t1.b.f19097u.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19121b[C5086t1.b.f19098v.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19121b[C5086t1.b.f19100x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19121b[C5086t1.b.f19101y.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19121b[C5086t1.b.f19102z.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f19121b[C5086t1.b.f19084A.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f19121b[C5086t1.b.f19099w.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C5086t1.c.values().length];
            f19120a = iArr2;
            try {
                iArr2[C5086t1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f19120a[C5086t1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f19120a[C5086t1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f19120a[C5086t1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f19120a[C5086t1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f19120a[C5086t1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f19120a[C5086t1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f19120a[C5086t1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f19120a[C5086t1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: v0.u$b */
    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        /* renamed from: a */
        int mo20607a();

        /* renamed from: d */
        boolean mo20608d();

        /* renamed from: e */
        C5086t1.b mo20609e();

        /* renamed from: g */
        InterfaceC5079r0.a mo20610g(InterfaceC5079r0.a aVar, InterfaceC5079r0 interfaceC5079r0);

        /* renamed from: j */
        C5086t1.c mo20611j();

        /* renamed from: k */
        boolean mo20612k();
    }

    public C5087u() {
        this.f19117a = C5056j1.m20141q(16);
    }

    public C5087u(C5056j1<T, Object> c5056j1) {
        this.f19117a = c5056j1;
        m20602t();
    }

    public C5087u(boolean z10) {
        this(C5056j1.m20141q(0));
        m20602t();
    }

    /* renamed from: A */
    public static void m20580A(AbstractC5057k abstractC5057k, C5086t1.b bVar, Object obj) {
        switch (a.f19121b[bVar.ordinal()]) {
            case 1:
                abstractC5057k.m20260r0(((Double) obj).doubleValue());
                return;
            case 2:
                abstractC5057k.m20268z0(((Float) obj).floatValue());
                return;
            case 3:
                abstractC5057k.m20227H0(((Long) obj).longValue());
                return;
            case 4:
                abstractC5057k.mo20246a1(((Long) obj).longValue());
                return;
            case 5:
                abstractC5057k.mo20225F0(((Integer) obj).intValue());
                return;
            case 6:
                abstractC5057k.mo20266x0(((Long) obj).longValue());
                return;
            case 7:
                abstractC5057k.mo20264v0(((Integer) obj).intValue());
                return;
            case 8:
                abstractC5057k.m20254l0(((Boolean) obj).booleanValue());
                return;
            case 9:
                abstractC5057k.m20222C0((InterfaceC5079r0) obj);
                return;
            case 10:
                abstractC5057k.mo20229J0((InterfaceC5079r0) obj);
                return;
            case 11:
                if (!(obj instanceof AbstractC5048h)) {
                    abstractC5057k.mo20241V0((String) obj);
                    return;
                }
                break;
            case 12:
                if (!(obj instanceof AbstractC5048h)) {
                    abstractC5057k.m20255m0((byte[]) obj);
                    return;
                }
                break;
            case 13:
                abstractC5057k.mo20244Y0(((Integer) obj).intValue());
                return;
            case 14:
                abstractC5057k.m20233N0(((Integer) obj).intValue());
                return;
            case 15:
                abstractC5057k.m20235P0(((Long) obj).longValue());
                return;
            case 16:
                abstractC5057k.m20237R0(((Integer) obj).intValue());
                return;
            case 17:
                abstractC5057k.m20239T0(((Long) obj).longValue());
                return;
            case 18:
                abstractC5057k.m20262t0(obj instanceof C5028a0.c ? ((C5028a0.c) obj).m19799a() : ((Integer) obj).intValue());
                return;
            default:
                return;
        }
        abstractC5057k.mo20258p0((AbstractC5048h) obj);
    }

    /* renamed from: c */
    public static Object m20581c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: d */
    public static int m20582d(C5086t1.b bVar, int i10, Object obj) {
        int m20186V = AbstractC5057k.m20186V(i10);
        if (bVar == C5086t1.b.f19095s) {
            m20186V *= 2;
        }
        return m20186V + m20583e(bVar, obj);
    }

    /* renamed from: e */
    public static int m20583e(C5086t1.b bVar, Object obj) {
        switch (a.f19121b[bVar.ordinal()]) {
            case 1:
                return AbstractC5057k.m20203j(((Double) obj).doubleValue());
            case 2:
                return AbstractC5057k.m20211r(((Float) obj).floatValue());
            case 3:
                return AbstractC5057k.m20218y(((Long) obj).longValue());
            case 4:
                return AbstractC5057k.m20190Z(((Long) obj).longValue());
            case 5:
                return AbstractC5057k.m20216w(((Integer) obj).intValue());
            case 6:
                return AbstractC5057k.m20209p(((Long) obj).longValue());
            case 7:
                return AbstractC5057k.m20207n(((Integer) obj).intValue());
            case 8:
                return AbstractC5057k.m20195e(((Boolean) obj).booleanValue());
            case 9:
                return AbstractC5057k.m20213t((InterfaceC5079r0) obj);
            case 10:
                return obj instanceof C5037d0 ? AbstractC5057k.m20166B((C5037d0) obj) : AbstractC5057k.m20171G((InterfaceC5079r0) obj);
            case 11:
                return obj instanceof AbstractC5048h ? AbstractC5057k.m20200h((AbstractC5048h) obj) : AbstractC5057k.m20185U((String) obj);
            case 12:
                return obj instanceof AbstractC5048h ? AbstractC5057k.m20200h((AbstractC5048h) obj) : AbstractC5057k.m20196f((byte[]) obj);
            case 13:
                return AbstractC5057k.m20188X(((Integer) obj).intValue());
            case 14:
                return AbstractC5057k.m20177M(((Integer) obj).intValue());
            case 15:
                return AbstractC5057k.m20179O(((Long) obj).longValue());
            case 16:
                return AbstractC5057k.m20181Q(((Integer) obj).intValue());
            case 17:
                return AbstractC5057k.m20183S(((Long) obj).longValue());
            case 18:
                return obj instanceof C5028a0.c ? AbstractC5057k.m20205l(((C5028a0.c) obj).m19799a()) : AbstractC5057k.m20205l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: f */
    public static int m20584f(b<?> bVar, Object obj) {
        C5086t1.b mo20609e = bVar.mo20609e();
        int mo20607a = bVar.mo20607a();
        if (!bVar.mo20608d()) {
            return m20582d(mo20609e, mo20607a, obj);
        }
        int i10 = 0;
        List list = (List) obj;
        if (bVar.mo20612k()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i10 += m20583e(mo20609e, it.next());
            }
            return AbstractC5057k.m20186V(mo20607a) + i10 + AbstractC5057k.m20175K(i10);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i10 += m20582d(mo20609e, mo20607a, it2.next());
        }
        return i10;
    }

    /* renamed from: h */
    public static <T extends b<T>> C5087u<T> m20585h() {
        return f19116d;
    }

    /* renamed from: m */
    public static int m20586m(C5086t1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.m20579c();
    }

    /* renamed from: q */
    public static <T extends b<T>> boolean m20587q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.mo20611j() == C5086t1.c.MESSAGE) {
            boolean mo20608d = key.mo20608d();
            Object value = entry.getValue();
            if (mo20608d) {
                Iterator it = ((List) value).iterator();
                while (it.hasNext()) {
                    if (!((InterfaceC5079r0) it.next()).mo20527k()) {
                        return false;
                    }
                }
            } else {
                if (!(value instanceof InterfaceC5079r0)) {
                    if (value instanceof C5037d0) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((InterfaceC5079r0) value).mo20527k()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: r */
    public static boolean m20588r(C5086t1.b bVar, Object obj) {
        C5028a0.m19789a(obj);
        switch (a.f19120a[bVar.m20578b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof AbstractC5048h) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof C5028a0.c);
            case 9:
                return (obj instanceof InterfaceC5079r0) || (obj instanceof C5037d0);
            default:
                return false;
        }
    }

    /* renamed from: w */
    public static <T extends b<T>> C5087u<T> m20589w() {
        return new C5087u<>();
    }

    /* renamed from: z */
    public static void m20590z(AbstractC5057k abstractC5057k, C5086t1.b bVar, int i10, Object obj) {
        if (bVar == C5086t1.b.f19095s) {
            abstractC5057k.m20220A0(i10, (InterfaceC5079r0) obj);
        } else {
            abstractC5057k.mo20242W0(i10, m20586m(bVar, false));
            m20580A(abstractC5057k, bVar, obj);
        }
    }

    /* renamed from: a */
    public void m20591a(T t10, Object obj) {
        List list;
        if (!t10.mo20608d()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m20606y(t10.mo20609e(), obj);
        Object m20594i = m20594i(t10);
        if (m20594i == null) {
            list = new ArrayList();
            this.f19117a.put(t10, list);
        } else {
            list = (List) m20594i;
        }
        list.add(obj);
    }

    /* renamed from: b */
    public C5087u<T> clone() {
        C5087u<T> m20589w = m20589w();
        for (int i10 = 0; i10 < this.f19117a.m20147k(); i10++) {
            Map.Entry<T, Object> m20146j = this.f19117a.m20146j(i10);
            m20589w.m20605x(m20146j.getKey(), m20146j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f19117a.m20149m()) {
            m20589w.m20605x(entry.getKey(), entry.getValue());
        }
        m20589w.f19119c = this.f19119c;
        return m20589w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5087u) {
            return this.f19117a.equals(((C5087u) obj).f19117a);
        }
        return false;
    }

    /* renamed from: g */
    public Iterator<Map.Entry<T, Object>> m20593g() {
        return this.f19119c ? new C5037d0.c(this.f19117a.m20144h().iterator()) : this.f19117a.m20144h().iterator();
    }

    public int hashCode() {
        return this.f19117a.hashCode();
    }

    /* renamed from: i */
    public Object m20594i(T t10) {
        Object obj = this.f19117a.get(t10);
        return obj instanceof C5037d0 ? ((C5037d0) obj).m19831f() : obj;
    }

    /* renamed from: j */
    public int m20595j() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f19117a.m20147k(); i11++) {
            i10 += m20596k(this.f19117a.m20146j(i11));
        }
        Iterator<Map.Entry<T, Object>> it = this.f19117a.m20149m().iterator();
        while (it.hasNext()) {
            i10 += m20596k(it.next());
        }
        return i10;
    }

    /* renamed from: k */
    public final int m20596k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.mo20611j() != C5086t1.c.MESSAGE || key.mo20608d() || key.mo20612k()) {
            return m20584f(key, value);
        }
        boolean z10 = value instanceof C5037d0;
        int mo20607a = entry.getKey().mo20607a();
        return z10 ? AbstractC5057k.m20219z(mo20607a, (C5037d0) value) : AbstractC5057k.m20168D(mo20607a, (InterfaceC5079r0) value);
    }

    /* renamed from: l */
    public int m20597l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f19117a.m20147k(); i11++) {
            Map.Entry<T, Object> m20146j = this.f19117a.m20146j(i11);
            i10 += m20584f(m20146j.getKey(), m20146j.getValue());
        }
        for (Map.Entry<T, Object> entry : this.f19117a.m20149m()) {
            i10 += m20584f(entry.getKey(), entry.getValue());
        }
        return i10;
    }

    /* renamed from: n */
    public boolean m20598n() {
        return this.f19117a.isEmpty();
    }

    /* renamed from: o */
    public boolean m20599o() {
        return this.f19118b;
    }

    /* renamed from: p */
    public boolean m20600p() {
        for (int i10 = 0; i10 < this.f19117a.m20147k(); i10++) {
            if (!m20587q(this.f19117a.m20146j(i10))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.f19117a.m20149m().iterator();
        while (it.hasNext()) {
            if (!m20587q(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s */
    public Iterator<Map.Entry<T, Object>> m20601s() {
        return this.f19119c ? new C5037d0.c(this.f19117a.entrySet().iterator()) : this.f19117a.entrySet().iterator();
    }

    /* renamed from: t */
    public void m20602t() {
        if (this.f19118b) {
            return;
        }
        this.f19117a.mo20152p();
        this.f19118b = true;
    }

    /* renamed from: u */
    public void m20603u(C5087u<T> c5087u) {
        for (int i10 = 0; i10 < c5087u.f19117a.m20147k(); i10++) {
            m20604v(c5087u.f19117a.m20146j(i10));
        }
        Iterator<Map.Entry<T, Object>> it = c5087u.f19117a.m20149m().iterator();
        while (it.hasNext()) {
            m20604v(it.next());
        }
    }

    /* renamed from: v */
    public final void m20604v(Map.Entry<T, Object> entry) {
        C5056j1<T, Object> c5056j1;
        Object m20581c;
        Object m20594i;
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C5037d0) {
            value = ((C5037d0) value).m19831f();
        }
        if (key.mo20608d()) {
            Object m20594i2 = m20594i(key);
            if (m20594i2 == null) {
                m20594i2 = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) m20594i2).add(m20581c(it.next()));
            }
            this.f19117a.put(key, m20594i2);
            return;
        }
        if (key.mo20611j() != C5086t1.c.MESSAGE || (m20594i = m20594i(key)) == null) {
            c5056j1 = this.f19117a;
            m20581c = m20581c(value);
        } else {
            m20581c = key.mo20610g(((InterfaceC5079r0) m20594i).mo20455c(), (InterfaceC5079r0) value).mo20461a();
            c5056j1 = this.f19117a;
        }
        c5056j1.put(key, m20581c);
    }

    /* renamed from: x */
    public void m20605x(T t10, Object obj) {
        if (!t10.mo20608d()) {
            m20606y(t10.mo20609e(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m20606y(t10.mo20609e(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof C5037d0) {
            this.f19119c = true;
        }
        this.f19117a.put(t10, obj);
    }

    /* renamed from: y */
    public final void m20606y(C5086t1.b bVar, Object obj) {
        if (!m20588r(bVar, obj)) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }
}
