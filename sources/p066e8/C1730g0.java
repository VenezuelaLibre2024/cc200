package p066e8;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e8.g0 */
/* loaded from: classes.dex */
public final class C1730g0 {

    /* renamed from: a */
    public final AtomicInteger f6345a = new AtomicInteger();

    /* renamed from: b */
    public final AtomicInteger f6346b = new AtomicInteger();

    /* renamed from: a */
    public int m6802a() {
        return this.f6346b.get();
    }

    /* renamed from: b */
    public int m6803b() {
        return this.f6345a.get();
    }

    /* renamed from: c */
    public void m6804c() {
        this.f6346b.getAndIncrement();
    }

    /* renamed from: d */
    public void m6805d() {
        this.f6345a.getAndIncrement();
    }

    /* renamed from: e */
    public void m6806e() {
        this.f6346b.set(0);
    }
}
