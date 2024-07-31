package p129ia;

import pa.C4104a;

/* renamed from: ia.p */
/* loaded from: classes.dex */
public class C2684p {

    /* renamed from: a */
    public final float f10488a;

    /* renamed from: b */
    public final float f10489b;

    public C2684p(float f10, float f11) {
        this.f10488a = f10;
        this.f10489b = f11;
    }

    /* renamed from: a */
    public static float m10905a(C2684p c2684p, C2684p c2684p2, C2684p c2684p3) {
        float f10 = c2684p2.f10488a;
        float f11 = c2684p2.f10489b;
        return ((c2684p3.f10488a - f10) * (c2684p.f10489b - f11)) - ((c2684p3.f10489b - f11) * (c2684p.f10488a - f10));
    }

    /* renamed from: b */
    public static float m10906b(C2684p c2684p, C2684p c2684p2) {
        return C4104a.m15853a(c2684p.f10488a, c2684p.f10489b, c2684p2.f10488a, c2684p2.f10489b);
    }

    /* renamed from: e */
    public static void m10907e(C2684p[] c2684pArr) {
        C2684p c2684p;
        C2684p c2684p2;
        C2684p c2684p3;
        float m10906b = m10906b(c2684pArr[0], c2684pArr[1]);
        float m10906b2 = m10906b(c2684pArr[1], c2684pArr[2]);
        float m10906b3 = m10906b(c2684pArr[0], c2684pArr[2]);
        if (m10906b2 >= m10906b && m10906b2 >= m10906b3) {
            c2684p = c2684pArr[0];
            c2684p2 = c2684pArr[1];
            c2684p3 = c2684pArr[2];
        } else if (m10906b3 < m10906b2 || m10906b3 < m10906b) {
            c2684p = c2684pArr[2];
            c2684p2 = c2684pArr[0];
            c2684p3 = c2684pArr[1];
        } else {
            c2684p = c2684pArr[1];
            c2684p2 = c2684pArr[0];
            c2684p3 = c2684pArr[2];
        }
        if (m10905a(c2684p2, c2684p, c2684p3) < 0.0f) {
            C2684p c2684p4 = c2684p3;
            c2684p3 = c2684p2;
            c2684p2 = c2684p4;
        }
        c2684pArr[0] = c2684p2;
        c2684pArr[1] = c2684p;
        c2684pArr[2] = c2684p3;
    }

    /* renamed from: c */
    public final float m10908c() {
        return this.f10488a;
    }

    /* renamed from: d */
    public final float m10909d() {
        return this.f10489b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2684p)) {
            return false;
        }
        C2684p c2684p = (C2684p) obj;
        return this.f10488a == c2684p.f10488a && this.f10489b == c2684p.f10489b;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f10488a) * 31) + Float.floatToIntBits(this.f10489b);
    }

    public final String toString() {
        return "(" + this.f10488a + ',' + this.f10489b + ')';
    }
}
