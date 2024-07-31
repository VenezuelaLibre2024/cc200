package p226p9;

import java.util.concurrent.Executor;
import p368z7.C6075y;

/* renamed from: p9.g0 */
/* loaded from: classes.dex */
public class C4077g0 {

    /* renamed from: a */
    public static C4077g0 f14670a = new C4077g0();

    /* renamed from: b */
    public static Executor f14671b;

    /* renamed from: c */
    public static Executor f14672c;

    /* renamed from: d */
    public static Executor f14673d;

    /* renamed from: e */
    public static Executor f14674e;

    /* renamed from: f */
    public static Executor f14675f;

    /* renamed from: b */
    public static C4077g0 m15718b() {
        return f14670a;
    }

    /* renamed from: d */
    public static void m15719d(Executor executor, Executor executor2) {
        f14671b = C6075y.m24291a(executor, 5);
        f14673d = C6075y.m24291a(executor, 3);
        f14672c = C6075y.m24291a(executor, 2);
        f14674e = C6075y.m24292b(executor);
        f14675f = executor2;
    }

    /* renamed from: a */
    public Executor m15720a() {
        return f14671b;
    }

    /* renamed from: c */
    public Executor m15721c() {
        return f14675f;
    }

    /* renamed from: e */
    public void m15722e(Runnable runnable) {
        f14674e.execute(runnable);
    }

    /* renamed from: f */
    public void m15723f(Runnable runnable) {
        f14671b.execute(runnable);
    }

    /* renamed from: g */
    public void m15724g(Runnable runnable) {
        f14673d.execute(runnable);
    }

    /* renamed from: h */
    public void m15725h(Runnable runnable) {
        f14672c.execute(runnable);
    }
}
