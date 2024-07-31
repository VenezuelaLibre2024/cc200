package je;

import java.util.concurrent.TimeUnit;
import p116he.C2540m0;
import p116he.C2544o0;
import p343xd.C5767k;

/* renamed from: je.l */
/* loaded from: classes2.dex */
public final class C3297l {

    /* renamed from: a */
    public static final String f11494a = C2540m0.m10116e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b */
    public static final long f11495b;

    /* renamed from: c */
    public static final int f11496c;

    /* renamed from: d */
    public static final int f11497d;

    /* renamed from: e */
    public static final long f11498e;

    /* renamed from: f */
    public static AbstractC3292g f11499f;

    /* renamed from: g */
    public static final InterfaceC3294i f11500g;

    /* renamed from: h */
    public static final InterfaceC3294i f11501h;

    static {
        long m10140f;
        int m10139e;
        int m10139e2;
        long m10140f2;
        m10140f = C2544o0.m10140f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f11495b = m10140f;
        m10139e = C2544o0.m10139e("kotlinx.coroutines.scheduler.core.pool.size", C5767k.m22904a(C2540m0.m10112a(), 2), 1, 0, 8, null);
        f11496c = m10139e;
        m10139e2 = C2544o0.m10139e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f11497d = m10139e2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m10140f2 = C2544o0.m10140f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f11498e = timeUnit.toNanos(m10140f2);
        f11499f = C3290e.f11484a;
        f11500g = new C3295j(0);
        f11501h = new C3295j(1);
    }
}
