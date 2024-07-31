package bb;

import java.util.Formatter;

/* renamed from: bb.g */
/* loaded from: classes.dex */
public class C0537g {

    /* renamed from: a */
    public final C0533c f2400a;

    /* renamed from: b */
    public final C0534d[] f2401b;

    public C0537g(C0533c c0533c) {
        this.f2400a = new C0533c(c0533c);
        this.f2401b = new C0534d[(c0533c.m2577e() - c0533c.m2579g()) + 1];
    }

    /* renamed from: a */
    public final C0533c m2616a() {
        return this.f2400a;
    }

    /* renamed from: b */
    public final C0534d m2617b(int i10) {
        return this.f2401b[m2620e(i10)];
    }

    /* renamed from: c */
    public final C0534d m2618c(int i10) {
        C0534d c0534d;
        C0534d c0534d2;
        C0534d m2617b = m2617b(i10);
        if (m2617b != null) {
            return m2617b;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int m2620e = m2620e(i10) - i11;
            if (m2620e >= 0 && (c0534d2 = this.f2401b[m2620e]) != null) {
                return c0534d2;
            }
            int m2620e2 = m2620e(i10) + i11;
            C0534d[] c0534dArr = this.f2401b;
            if (m2620e2 < c0534dArr.length && (c0534d = c0534dArr[m2620e2]) != null) {
                return c0534d;
            }
        }
        return null;
    }

    /* renamed from: d */
    public final C0534d[] m2619d() {
        return this.f2401b;
    }

    /* renamed from: e */
    public final int m2620e(int i10) {
        return i10 - this.f2400a.m2579g();
    }

    /* renamed from: f */
    public final void m2621f(int i10, C0534d c0534d) {
        this.f2401b[m2620e(i10)] = c0534d;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i10 = 0;
            for (C0534d c0534d : this.f2401b) {
                if (c0534d == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i10));
                    i10++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i10), Integer.valueOf(c0534d.m2584c()), Integer.valueOf(c0534d.m2586e()));
                    i10++;
                }
            }
            String formatter2 = formatter.toString();
            formatter.close();
            return formatter2;
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
}
