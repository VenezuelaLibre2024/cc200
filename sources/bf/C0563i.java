package bf;

import java.util.concurrent.TimeUnit;

/* renamed from: bf.i */
/* loaded from: classes2.dex */
public class C0563i extends C0575u {

    /* renamed from: e */
    public C0575u f2516e;

    public C0563i(C0575u c0575u) {
        if (c0575u == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2516e = c0575u;
    }

    @Override // bf.C0575u
    /* renamed from: a */
    public C0575u mo2878a() {
        return this.f2516e.mo2878a();
    }

    @Override // bf.C0575u
    /* renamed from: b */
    public C0575u mo2879b() {
        return this.f2516e.mo2879b();
    }

    @Override // bf.C0575u
    /* renamed from: c */
    public long mo2880c() {
        return this.f2516e.mo2880c();
    }

    @Override // bf.C0575u
    /* renamed from: d */
    public C0575u mo2881d(long j10) {
        return this.f2516e.mo2881d(j10);
    }

    @Override // bf.C0575u
    /* renamed from: e */
    public boolean mo2882e() {
        return this.f2516e.mo2882e();
    }

    @Override // bf.C0575u
    /* renamed from: f */
    public void mo2883f() {
        this.f2516e.mo2883f();
    }

    @Override // bf.C0575u
    /* renamed from: g */
    public C0575u mo2884g(long j10, TimeUnit timeUnit) {
        return this.f2516e.mo2884g(j10, timeUnit);
    }

    /* renamed from: i */
    public final C0575u m2885i() {
        return this.f2516e;
    }

    /* renamed from: j */
    public final C0563i m2886j(C0575u c0575u) {
        if (c0575u == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2516e = c0575u;
        return this;
    }
}
