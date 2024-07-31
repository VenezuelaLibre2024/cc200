package bf;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: bf.u */
/* loaded from: classes2.dex */
public class C0575u {

    /* renamed from: d */
    public static final C0575u f2551d = new a();

    /* renamed from: a */
    public boolean f2552a;

    /* renamed from: b */
    public long f2553b;

    /* renamed from: c */
    public long f2554c;

    /* renamed from: bf.u$a */
    /* loaded from: classes2.dex */
    public class a extends C0575u {
        @Override // bf.C0575u
        /* renamed from: d */
        public C0575u mo2881d(long j10) {
            return this;
        }

        @Override // bf.C0575u
        /* renamed from: f */
        public void mo2883f() {
        }

        @Override // bf.C0575u
        /* renamed from: g */
        public C0575u mo2884g(long j10, TimeUnit timeUnit) {
            return this;
        }
    }

    /* renamed from: a */
    public C0575u mo2878a() {
        this.f2552a = false;
        return this;
    }

    /* renamed from: b */
    public C0575u mo2879b() {
        this.f2554c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo2880c() {
        if (this.f2552a) {
            return this.f2553b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C0575u mo2881d(long j10) {
        this.f2552a = true;
        this.f2553b = j10;
        return this;
    }

    /* renamed from: e */
    public boolean mo2882e() {
        return this.f2552a;
    }

    /* renamed from: f */
    public void mo2883f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2552a && this.f2553b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C0575u mo2884g(long j10, TimeUnit timeUnit) {
        if (j10 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f2554c = timeUnit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j10);
    }

    /* renamed from: h */
    public long m2919h() {
        return this.f2554c;
    }
}
