package p301v0;

import java.util.Arrays;
import p301v0.InterfaceC5089u1;

/* renamed from: v0.o1 */
/* loaded from: classes.dex */
public final class C5071o1 {

    /* renamed from: f */
    public static final C5071o1 f19032f = new C5071o1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f19033a;

    /* renamed from: b */
    public int[] f19034b;

    /* renamed from: c */
    public Object[] f19035c;

    /* renamed from: d */
    public int f19036d;

    /* renamed from: e */
    public boolean f19037e;

    public C5071o1() {
        this(0, new int[8], new Object[8], true);
    }

    public C5071o1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f19036d = -1;
        this.f19033a = i10;
        this.f19034b = iArr;
        this.f19035c = objArr;
        this.f19037e = z10;
    }

    /* renamed from: c */
    public static boolean m20402c(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m20403d(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static C5071o1 m20404e() {
        return f19032f;
    }

    /* renamed from: h */
    public static int m20405h(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    /* renamed from: i */
    public static int m20406i(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    /* renamed from: k */
    public static C5071o1 m20407k(C5071o1 c5071o1, C5071o1 c5071o12) {
        int i10 = c5071o1.f19033a + c5071o12.f19033a;
        int[] copyOf = Arrays.copyOf(c5071o1.f19034b, i10);
        System.arraycopy(c5071o12.f19034b, 0, copyOf, c5071o1.f19033a, c5071o12.f19033a);
        Object[] copyOf2 = Arrays.copyOf(c5071o1.f19035c, i10);
        System.arraycopy(c5071o12.f19035c, 0, copyOf2, c5071o1.f19033a, c5071o12.f19033a);
        return new C5071o1(i10, copyOf, copyOf2, true);
    }

    /* renamed from: l */
    public static C5071o1 m20408l() {
        return new C5071o1();
    }

    /* renamed from: p */
    public static void m20409p(int i10, Object obj, InterfaceC5089u1 interfaceC5089u1) {
        int m20575a = C5086t1.m20575a(i10);
        int m20576b = C5086t1.m20576b(i10);
        if (m20576b == 0) {
            interfaceC5089u1.mo20327p(m20575a, ((Long) obj).longValue());
            return;
        }
        if (m20576b == 1) {
            interfaceC5089u1.mo20320i(m20575a, ((Long) obj).longValue());
            return;
        }
        if (m20576b == 2) {
            interfaceC5089u1.mo20316e(m20575a, (AbstractC5048h) obj);
            return;
        }
        if (m20576b != 3) {
            if (m20576b != 5) {
                throw new RuntimeException(C5031b0.m19813d());
            }
            interfaceC5089u1.mo20315d(m20575a, ((Integer) obj).intValue());
        } else if (interfaceC5089u1.mo20321j() == InterfaceC5089u1.a.ASCENDING) {
            interfaceC5089u1.mo20331t(m20575a);
            ((C5071o1) obj).m20418q(interfaceC5089u1);
            interfaceC5089u1.mo20298H(m20575a);
        } else {
            interfaceC5089u1.mo20298H(m20575a);
            ((C5071o1) obj).m20418q(interfaceC5089u1);
            interfaceC5089u1.mo20331t(m20575a);
        }
    }

    /* renamed from: a */
    public void m20410a() {
        if (!this.f19037e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public final void m20411b() {
        int i10 = this.f19033a;
        int[] iArr = this.f19034b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f19034b = Arrays.copyOf(iArr, i11);
            this.f19035c = Arrays.copyOf(this.f19035c, i11);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C5071o1)) {
            return false;
        }
        C5071o1 c5071o1 = (C5071o1) obj;
        int i10 = this.f19033a;
        return i10 == c5071o1.f19033a && m20402c(this.f19034b, c5071o1.f19034b, i10) && m20403d(this.f19035c, c5071o1.f19035c, this.f19033a);
    }

    /* renamed from: f */
    public int m20412f() {
        int m20189Y;
        int i10 = this.f19036d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f19033a; i12++) {
            int i13 = this.f19034b[i12];
            int m20575a = C5086t1.m20575a(i13);
            int m20576b = C5086t1.m20576b(i13);
            if (m20576b == 0) {
                m20189Y = AbstractC5057k.m20189Y(m20575a, ((Long) this.f19035c[i12]).longValue());
            } else if (m20576b == 1) {
                m20189Y = AbstractC5057k.m20208o(m20575a, ((Long) this.f19035c[i12]).longValue());
            } else if (m20576b == 2) {
                m20189Y = AbstractC5057k.m20198g(m20575a, (AbstractC5048h) this.f19035c[i12]);
            } else if (m20576b == 3) {
                m20189Y = (AbstractC5057k.m20186V(m20575a) * 2) + ((C5071o1) this.f19035c[i12]).m20412f();
            } else {
                if (m20576b != 5) {
                    throw new IllegalStateException(C5031b0.m19813d());
                }
                m20189Y = AbstractC5057k.m20206m(m20575a, ((Integer) this.f19035c[i12]).intValue());
            }
            i11 += m20189Y;
        }
        this.f19036d = i11;
        return i11;
    }

    /* renamed from: g */
    public int m20413g() {
        int i10 = this.f19036d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f19033a; i12++) {
            i11 += AbstractC5057k.m20174J(C5086t1.m20575a(this.f19034b[i12]), (AbstractC5048h) this.f19035c[i12]);
        }
        this.f19036d = i11;
        return i11;
    }

    public int hashCode() {
        int i10 = this.f19033a;
        return ((((527 + i10) * 31) + m20405h(this.f19034b, i10)) * 31) + m20406i(this.f19035c, this.f19033a);
    }

    /* renamed from: j */
    public void m20414j() {
        this.f19037e = false;
    }

    /* renamed from: m */
    public final void m20415m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f19033a; i11++) {
            C5085t0.m20572c(sb2, i10, String.valueOf(C5086t1.m20575a(this.f19034b[i11])), this.f19035c[i11]);
        }
    }

    /* renamed from: n */
    public void m20416n(int i10, Object obj) {
        m20410a();
        m20411b();
        int[] iArr = this.f19034b;
        int i11 = this.f19033a;
        iArr[i11] = i10;
        this.f19035c[i11] = obj;
        this.f19033a = i11 + 1;
    }

    /* renamed from: o */
    public void m20417o(InterfaceC5089u1 interfaceC5089u1) {
        if (interfaceC5089u1.mo20321j() == InterfaceC5089u1.a.DESCENDING) {
            for (int i10 = this.f19033a - 1; i10 >= 0; i10--) {
                interfaceC5089u1.mo20314c(C5086t1.m20575a(this.f19034b[i10]), this.f19035c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f19033a; i11++) {
            interfaceC5089u1.mo20314c(C5086t1.m20575a(this.f19034b[i11]), this.f19035c[i11]);
        }
    }

    /* renamed from: q */
    public void m20418q(InterfaceC5089u1 interfaceC5089u1) {
        if (this.f19033a == 0) {
            return;
        }
        if (interfaceC5089u1.mo20321j() == InterfaceC5089u1.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f19033a; i10++) {
                m20409p(this.f19034b[i10], this.f19035c[i10], interfaceC5089u1);
            }
            return;
        }
        for (int i11 = this.f19033a - 1; i11 >= 0; i11--) {
            m20409p(this.f19034b[i11], this.f19035c[i11], interfaceC5089u1);
        }
    }
}
