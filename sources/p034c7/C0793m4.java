package p034c7;

/* renamed from: c7.m4 */
/* loaded from: classes.dex */
public final class C0793m4<V> {

    /* renamed from: h */
    public static final Object f3312h = new Object();

    /* renamed from: a */
    public final String f3313a;

    /* renamed from: b */
    public final InterfaceC0765k4<V> f3314b;

    /* renamed from: c */
    public final V f3315c;

    /* renamed from: d */
    public final V f3316d;

    /* renamed from: e */
    public final Object f3317e;

    /* renamed from: f */
    public volatile V f3318f;

    /* renamed from: g */
    public volatile V f3319g;

    public C0793m4(String str, V v10, V v11, InterfaceC0765k4<V> interfaceC0765k4) {
        this.f3317e = new Object();
        this.f3318f = null;
        this.f3319g = null;
        this.f3313a = str;
        this.f3315c = v10;
        this.f3316d = v11;
        this.f3314b = interfaceC0765k4;
    }

    /* renamed from: a */
    public final V m3607a(V v10) {
        synchronized (this.f3317e) {
        }
        if (v10 != null) {
            return v10;
        }
        if (C0751j4.f3194a == null) {
            return this.f3315c;
        }
        synchronized (f3312h) {
            if (C0647c.m3114a()) {
                return this.f3319g == null ? this.f3315c : this.f3319g;
            }
            try {
                for (C0793m4 c0793m4 : C0733i0.m3403z0()) {
                    if (C0647c.m3114a()) {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                    V v11 = null;
                    try {
                        InterfaceC0765k4<V> interfaceC0765k4 = c0793m4.f3314b;
                        if (interfaceC0765k4 != null) {
                            v11 = interfaceC0765k4.zza();
                        }
                    } catch (IllegalStateException unused) {
                    }
                    synchronized (f3312h) {
                        c0793m4.f3319g = v11;
                    }
                }
            } catch (SecurityException unused2) {
            }
            InterfaceC0765k4<V> interfaceC0765k42 = this.f3314b;
            if (interfaceC0765k42 == null) {
                return this.f3315c;
            }
            try {
                return interfaceC0765k42.zza();
            } catch (IllegalStateException unused3) {
                return this.f3315c;
            } catch (SecurityException unused4) {
                return this.f3315c;
            }
        }
    }

    /* renamed from: b */
    public final String m3608b() {
        return this.f3313a;
    }
}
