package bb;

import java.util.Formatter;

/* renamed from: bb.f */
/* loaded from: classes.dex */
public final class C0536f {

    /* renamed from: a */
    public final C0531a f2396a;

    /* renamed from: b */
    public final C0537g[] f2397b;

    /* renamed from: c */
    public C0533c f2398c;

    /* renamed from: d */
    public final int f2399d;

    public C0536f(C0531a c0531a, C0533c c0533c) {
        this.f2396a = c0531a;
        int m2565a = c0531a.m2565a();
        this.f2399d = m2565a;
        this.f2398c = c0533c;
        this.f2397b = new C0537g[m2565a + 2];
    }

    /* renamed from: b */
    public static boolean m2599b(C0534d c0534d, C0534d c0534d2) {
        if (c0534d2 == null || !c0534d2.m2588g() || c0534d2.m2582a() != c0534d.m2582a()) {
            return false;
        }
        c0534d.m2590i(c0534d2.m2584c());
        return true;
    }

    /* renamed from: c */
    public static int m2600c(int i10, int i11, C0534d c0534d) {
        if (c0534d == null || c0534d.m2588g()) {
            return i11;
        }
        if (!c0534d.m2589h(i10)) {
            return i11 + 1;
        }
        c0534d.m2590i(i10);
        return 0;
    }

    /* renamed from: a */
    public final void m2601a(C0537g c0537g) {
        if (c0537g != null) {
            ((C0538h) c0537g).m2622g(this.f2396a);
        }
    }

    /* renamed from: d */
    public final int m2602d() {
        int m2604f = m2604f();
        if (m2604f == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f2399d + 1; i10++) {
            C0534d[] m2619d = this.f2397b[i10].m2619d();
            for (int i11 = 0; i11 < m2619d.length; i11++) {
                if (m2619d[i11] != null && !m2619d[i11].m2588g()) {
                    m2603e(i10, i11, m2619d);
                }
            }
        }
        return m2604f;
    }

    /* renamed from: e */
    public final void m2603e(int i10, int i11, C0534d[] c0534dArr) {
        C0534d c0534d = c0534dArr[i11];
        C0534d[] m2619d = this.f2397b[i10 - 1].m2619d();
        C0537g[] c0537gArr = this.f2397b;
        int i12 = i10 + 1;
        C0534d[] m2619d2 = c0537gArr[i12] != null ? c0537gArr[i12].m2619d() : m2619d;
        C0534d[] c0534dArr2 = new C0534d[14];
        c0534dArr2[2] = m2619d[i11];
        c0534dArr2[3] = m2619d2[i11];
        if (i11 > 0) {
            int i13 = i11 - 1;
            c0534dArr2[0] = c0534dArr[i13];
            c0534dArr2[4] = m2619d[i13];
            c0534dArr2[5] = m2619d2[i13];
        }
        if (i11 > 1) {
            int i14 = i11 - 2;
            c0534dArr2[8] = c0534dArr[i14];
            c0534dArr2[10] = m2619d[i14];
            c0534dArr2[11] = m2619d2[i14];
        }
        if (i11 < c0534dArr.length - 1) {
            int i15 = i11 + 1;
            c0534dArr2[1] = c0534dArr[i15];
            c0534dArr2[6] = m2619d[i15];
            c0534dArr2[7] = m2619d2[i15];
        }
        if (i11 < c0534dArr.length - 2) {
            int i16 = i11 + 2;
            c0534dArr2[9] = c0534dArr[i16];
            c0534dArr2[12] = m2619d[i16];
            c0534dArr2[13] = m2619d2[i16];
        }
        for (int i17 = 0; i17 < 14 && !m2599b(c0534d, c0534dArr2[i17]); i17++) {
        }
    }

    /* renamed from: f */
    public final int m2604f() {
        m2605g();
        return m2606h() + m2607i();
    }

    /* renamed from: g */
    public final void m2605g() {
        C0537g[] c0537gArr = this.f2397b;
        if (c0537gArr[0] == null || c0537gArr[this.f2399d + 1] == null) {
            return;
        }
        C0534d[] m2619d = c0537gArr[0].m2619d();
        C0534d[] m2619d2 = this.f2397b[this.f2399d + 1].m2619d();
        for (int i10 = 0; i10 < m2619d.length; i10++) {
            if (m2619d[i10] != null && m2619d2[i10] != null && m2619d[i10].m2584c() == m2619d2[i10].m2584c()) {
                for (int i11 = 1; i11 <= this.f2399d; i11++) {
                    C0534d c0534d = this.f2397b[i11].m2619d()[i10];
                    if (c0534d != null) {
                        c0534d.m2590i(m2619d[i10].m2584c());
                        if (!c0534d.m2588g()) {
                            this.f2397b[i11].m2619d()[i10] = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final int m2606h() {
        C0537g[] c0537gArr = this.f2397b;
        if (c0537gArr[0] == null) {
            return 0;
        }
        C0534d[] m2619d = c0537gArr[0].m2619d();
        int i10 = 0;
        for (int i11 = 0; i11 < m2619d.length; i11++) {
            if (m2619d[i11] != null) {
                int m2584c = m2619d[i11].m2584c();
                int i12 = 0;
                for (int i13 = 1; i13 < this.f2399d + 1 && i12 < 2; i13++) {
                    C0534d c0534d = this.f2397b[i13].m2619d()[i11];
                    if (c0534d != null) {
                        i12 = m2600c(m2584c, i12, c0534d);
                        if (!c0534d.m2588g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    /* renamed from: i */
    public final int m2607i() {
        C0537g[] c0537gArr = this.f2397b;
        int i10 = this.f2399d;
        if (c0537gArr[i10 + 1] == null) {
            return 0;
        }
        C0534d[] m2619d = c0537gArr[i10 + 1].m2619d();
        int i11 = 0;
        for (int i12 = 0; i12 < m2619d.length; i12++) {
            if (m2619d[i12] != null) {
                int m2584c = m2619d[i12].m2584c();
                int i13 = 0;
                for (int i14 = this.f2399d + 1; i14 > 0 && i13 < 2; i14--) {
                    C0534d c0534d = this.f2397b[i14].m2619d()[i12];
                    if (c0534d != null) {
                        i13 = m2600c(m2584c, i13, c0534d);
                        if (!c0534d.m2588g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    /* renamed from: j */
    public int m2608j() {
        return this.f2399d;
    }

    /* renamed from: k */
    public int m2609k() {
        return this.f2396a.m2566b();
    }

    /* renamed from: l */
    public int m2610l() {
        return this.f2396a.m2567c();
    }

    /* renamed from: m */
    public C0533c m2611m() {
        return this.f2398c;
    }

    /* renamed from: n */
    public C0537g m2612n(int i10) {
        return this.f2397b[i10];
    }

    /* renamed from: o */
    public C0537g[] m2613o() {
        m2601a(this.f2397b[0]);
        m2601a(this.f2397b[this.f2399d + 1]);
        int i10 = 928;
        while (true) {
            int m2602d = m2602d();
            if (m2602d <= 0 || m2602d >= i10) {
                break;
            }
            i10 = m2602d;
        }
        return this.f2397b;
    }

    /* renamed from: p */
    public void m2614p(C0533c c0533c) {
        this.f2398c = c0533c;
    }

    /* renamed from: q */
    public void m2615q(int i10, C0537g c0537g) {
        this.f2397b[i10] = c0537g;
    }

    public String toString() {
        C0537g[] c0537gArr = this.f2397b;
        C0537g c0537g = c0537gArr[0];
        if (c0537g == null) {
            c0537g = c0537gArr[this.f2399d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < c0537g.m2619d().length; i10++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i10));
                for (int i11 = 0; i11 < this.f2399d + 2; i11++) {
                    C0537g[] c0537gArr2 = this.f2397b;
                    if (c0537gArr2[i11] == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C0534d c0534d = c0537gArr2[i11].m2619d()[i10];
                        if (c0534d == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c0534d.m2584c()), Integer.valueOf(c0534d.m2586e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        formatter.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
