package be;

import ae.C0109o;
import p343xd.C5765i;
import td.C4747g;
import td.C4753m;

/* renamed from: be.a */
/* loaded from: classes2.dex */
public final class C0550a implements Comparable<C0550a> {

    /* renamed from: i */
    public static final a f2478i = new a(null);

    /* renamed from: j */
    public static final long f2479j = m2754i(0);

    /* renamed from: k */
    public static final long f2480k;

    /* renamed from: l */
    public static final long f2481l;

    /* renamed from: h */
    public final long f2482h;

    /* renamed from: be.a$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }
    }

    static {
        long m2777e;
        long m2777e2;
        m2777e = C0552c.m2777e(4611686018427387903L);
        f2480k = m2777e;
        m2777e2 = C0552c.m2777e(-4611686018427387903L);
        f2481l = m2777e2;
    }

    public /* synthetic */ C0550a(long j10) {
        this.f2482h = j10;
    }

    /* renamed from: A */
    public static final boolean m2743A(long j10) {
        return (((int) j10) & 1) == 1;
    }

    /* renamed from: B */
    public static final boolean m2744B(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* renamed from: C */
    public static final boolean m2745C(long j10) {
        return j10 == f2480k || j10 == f2481l;
    }

    /* renamed from: D */
    public static final boolean m2746D(long j10) {
        return j10 < 0;
    }

    /* renamed from: E */
    public static final boolean m2747E(long j10) {
        return j10 > 0;
    }

    /* renamed from: F */
    public static final long m2748F(long j10, EnumC0553d enumC0553d) {
        C4753m.m18653f(enumC0553d, "unit");
        if (j10 == f2480k) {
            return Long.MAX_VALUE;
        }
        if (j10 == f2481l) {
            return Long.MIN_VALUE;
        }
        return C0554e.m2784a(m2767x(j10), m2766w(j10), enumC0553d);
    }

    /* renamed from: G */
    public static String m2749G(long j10) {
        int i10;
        long j11;
        StringBuilder sb2;
        int i11;
        int i12;
        String str;
        boolean z10;
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == f2480k) {
            return "Infinity";
        }
        if (j10 == f2481l) {
            return "-Infinity";
        }
        boolean m2746D = m2746D(j10);
        StringBuilder sb3 = new StringBuilder();
        if (m2746D) {
            sb3.append('-');
        }
        long m2756m = m2756m(j10);
        long m2758o = m2758o(m2756m);
        int m2757n = m2757n(m2756m);
        int m2763t = m2763t(m2756m);
        int m2765v = m2765v(m2756m);
        int m2764u = m2764u(m2756m);
        int i13 = 0;
        boolean z11 = m2758o != 0;
        boolean z12 = m2757n != 0;
        boolean z13 = m2763t != 0;
        boolean z14 = (m2765v == 0 && m2764u == 0) ? false : true;
        if (z11) {
            sb3.append(m2758o);
            sb3.append('d');
            i13 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i14 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(m2757n);
            sb3.append('h');
            i13 = i14;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i15 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            sb3.append(m2763t);
            sb3.append('m');
            i13 = i15;
        }
        if (z14) {
            int i16 = i13 + 1;
            if (i13 > 0) {
                sb3.append(' ');
            }
            if (m2765v != 0 || z11 || z12 || z13) {
                i10 = 9;
                j11 = j10;
                sb2 = sb3;
                i11 = m2765v;
                i12 = m2764u;
                str = "s";
                z10 = false;
            } else {
                if (m2764u >= 1000000) {
                    i11 = m2764u / 1000000;
                    i12 = m2764u % 1000000;
                    i10 = 6;
                    z10 = false;
                    str = "ms";
                } else if (m2764u >= 1000) {
                    i11 = m2764u / 1000;
                    i12 = m2764u % 1000;
                    i10 = 3;
                    z10 = false;
                    str = "us";
                } else {
                    sb3.append(m2764u);
                    sb3.append("ns");
                    i13 = i16;
                }
                j11 = j10;
                sb2 = sb3;
            }
            m2751b(j11, sb2, i11, i12, i10, str, z10);
            i13 = i16;
        }
        if (m2746D && i13 > 1) {
            sb3.insert(1, '(').append(')');
        }
        String sb4 = sb3.toString();
        C4753m.m18652e(sb4, "StringBuilder().apply(builderAction).toString()");
        return sb4;
    }

    /* renamed from: H */
    public static final long m2750H(long j10) {
        long m2776d;
        m2776d = C0552c.m2776d(-m2767x(j10), ((int) j10) & 1);
        return m2776d;
    }

    /* renamed from: b */
    public static final void m2751b(long j10, StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String m451R = C0109o.m451R(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = m451R.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (m451R.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                i15 = ((i15 + 2) / 3) * 3;
            }
            sb2.append((CharSequence) m451R, 0, i15);
            C4753m.m18652e(sb2, "this.append(value, startIndex, endIndex)");
        }
        sb2.append(str);
    }

    /* renamed from: c */
    public static final /* synthetic */ C0550a m2752c(long j10) {
        return new C0550a(j10);
    }

    /* renamed from: h */
    public static int m2753h(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return C4753m.m18656i(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m2746D(j10) ? -i10 : i10;
    }

    /* renamed from: i */
    public static long m2754i(long j10) {
        if (C0551b.m2772a()) {
            if (m2744B(j10)) {
                if (!new C5765i(-4611686018426999999L, 4611686018426999999L).m22903d(m2767x(j10))) {
                    throw new AssertionError(m2767x(j10) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new C5765i(-4611686018427387903L, 4611686018427387903L).m22903d(m2767x(j10))) {
                    throw new AssertionError(m2767x(j10) + " ms is out of milliseconds range");
                }
                if (new C5765i(-4611686018426L, 4611686018426L).m22903d(m2767x(j10))) {
                    throw new AssertionError(m2767x(j10) + " ms is denormalized");
                }
            }
        }
        return j10;
    }

    /* renamed from: l */
    public static boolean m2755l(long j10, Object obj) {
        return (obj instanceof C0550a) && j10 == ((C0550a) obj).m2770I();
    }

    /* renamed from: m */
    public static final long m2756m(long j10) {
        return m2746D(j10) ? m2750H(j10) : j10;
    }

    /* renamed from: n */
    public static final int m2757n(long j10) {
        if (m2745C(j10)) {
            return 0;
        }
        return (int) (m2759p(j10) % 24);
    }

    /* renamed from: o */
    public static final long m2758o(long j10) {
        return m2748F(j10, EnumC0553d.DAYS);
    }

    /* renamed from: p */
    public static final long m2759p(long j10) {
        return m2748F(j10, EnumC0553d.HOURS);
    }

    /* renamed from: q */
    public static final long m2760q(long j10) {
        return (m2743A(j10) && m2769z(j10)) ? m2767x(j10) : m2748F(j10, EnumC0553d.MILLISECONDS);
    }

    /* renamed from: r */
    public static final long m2761r(long j10) {
        return m2748F(j10, EnumC0553d.MINUTES);
    }

    /* renamed from: s */
    public static final long m2762s(long j10) {
        return m2748F(j10, EnumC0553d.SECONDS);
    }

    /* renamed from: t */
    public static final int m2763t(long j10) {
        if (m2745C(j10)) {
            return 0;
        }
        return (int) (m2761r(j10) % 60);
    }

    /* renamed from: u */
    public static final int m2764u(long j10) {
        if (m2745C(j10)) {
            return 0;
        }
        boolean m2743A = m2743A(j10);
        long m2767x = m2767x(j10);
        return (int) (m2743A ? C0552c.m2779g(m2767x % 1000) : m2767x % 1000000000);
    }

    /* renamed from: v */
    public static final int m2765v(long j10) {
        if (m2745C(j10)) {
            return 0;
        }
        return (int) (m2762s(j10) % 60);
    }

    /* renamed from: w */
    public static final EnumC0553d m2766w(long j10) {
        return m2744B(j10) ? EnumC0553d.NANOSECONDS : EnumC0553d.MILLISECONDS;
    }

    /* renamed from: x */
    public static final long m2767x(long j10) {
        return j10 >> 1;
    }

    /* renamed from: y */
    public static int m2768y(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: z */
    public static final boolean m2769z(long j10) {
        return !m2745C(j10);
    }

    /* renamed from: I */
    public final /* synthetic */ long m2770I() {
        return this.f2482h;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(C0550a c0550a) {
        return m2771f(c0550a.m2770I());
    }

    public boolean equals(Object obj) {
        return m2755l(this.f2482h, obj);
    }

    /* renamed from: f */
    public int m2771f(long j10) {
        return m2753h(this.f2482h, j10);
    }

    public int hashCode() {
        return m2768y(this.f2482h);
    }

    public String toString() {
        return m2749G(this.f2482h);
    }
}
