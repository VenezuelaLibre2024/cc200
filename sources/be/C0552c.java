package be;

import p343xd.C5765i;
import p343xd.C5767k;
import td.C4753m;

/* renamed from: be.c */
/* loaded from: classes2.dex */
public final class C0552c {
    /* renamed from: d */
    public static final long m2776d(long j10, int i10) {
        return C0550a.m2754i((j10 << 1) + i10);
    }

    /* renamed from: e */
    public static final long m2777e(long j10) {
        return C0550a.m2754i((j10 << 1) + 1);
    }

    /* renamed from: f */
    public static final long m2778f(long j10) {
        return C0550a.m2754i(j10 << 1);
    }

    /* renamed from: g */
    public static final long m2779g(long j10) {
        return j10 * 1000000;
    }

    /* renamed from: h */
    public static final long m2780h(int i10, EnumC0553d enumC0553d) {
        C4753m.m18653f(enumC0553d, "unit");
        return enumC0553d.compareTo(EnumC0553d.SECONDS) <= 0 ? m2778f(C0554e.m2785b(i10, enumC0553d, EnumC0553d.NANOSECONDS)) : m2781i(i10, enumC0553d);
    }

    /* renamed from: i */
    public static final long m2781i(long j10, EnumC0553d enumC0553d) {
        C4753m.m18653f(enumC0553d, "unit");
        EnumC0553d enumC0553d2 = EnumC0553d.NANOSECONDS;
        long m2785b = C0554e.m2785b(4611686018426999999L, enumC0553d2, enumC0553d);
        return new C5765i(-m2785b, m2785b).m22903d(j10) ? m2778f(C0554e.m2785b(j10, enumC0553d, enumC0553d2)) : m2777e(C5767k.m22909f(C0554e.m2784a(j10, enumC0553d, EnumC0553d.MILLISECONDS), -4611686018427387903L, 4611686018427387903L));
    }
}
