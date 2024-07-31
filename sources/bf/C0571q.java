package bf;

/* renamed from: bf.q */
/* loaded from: classes2.dex */
public final class C0571q {

    /* renamed from: a */
    public static C0570p f2547a;

    /* renamed from: b */
    public static long f2548b;

    /* renamed from: a */
    public static void m2915a(C0570p c0570p) {
        if (c0570p.f2545f != null || c0570p.f2546g != null) {
            throw new IllegalArgumentException();
        }
        if (c0570p.f2543d) {
            return;
        }
        synchronized (C0571q.class) {
            long j10 = f2548b;
            if (j10 + 8192 > 65536) {
                return;
            }
            f2548b = j10 + 8192;
            c0570p.f2545f = f2547a;
            c0570p.f2542c = 0;
            c0570p.f2541b = 0;
            f2547a = c0570p;
        }
    }

    /* renamed from: b */
    public static C0570p m2916b() {
        synchronized (C0571q.class) {
            C0570p c0570p = f2547a;
            if (c0570p == null) {
                return new C0570p();
            }
            f2547a = c0570p.f2545f;
            c0570p.f2545f = null;
            f2548b -= 8192;
            return c0570p;
        }
    }
}
