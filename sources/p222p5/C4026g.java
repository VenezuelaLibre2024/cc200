package p222p5;

/* renamed from: p5.g */
/* loaded from: classes.dex */
public class C4026g {

    /* renamed from: a */
    public final InterfaceC4020d f14480a;

    /* renamed from: b */
    public boolean f14481b;

    public C4026g() {
        this(InterfaceC4020d.f14458a);
    }

    public C4026g(InterfaceC4020d interfaceC4020d) {
        this.f14480a = interfaceC4020d;
    }

    /* renamed from: a */
    public synchronized void m15310a() {
        while (!this.f14481b) {
            wait();
        }
    }

    /* renamed from: b */
    public synchronized void m15311b() {
        boolean z10 = false;
        while (!this.f14481b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: c */
    public synchronized boolean m15312c() {
        boolean z10;
        z10 = this.f14481b;
        this.f14481b = false;
        return z10;
    }

    /* renamed from: d */
    public synchronized boolean m15313d() {
        return this.f14481b;
    }

    /* renamed from: e */
    public synchronized boolean m15314e() {
        if (this.f14481b) {
            return false;
        }
        this.f14481b = true;
        notifyAll();
        return true;
    }
}
