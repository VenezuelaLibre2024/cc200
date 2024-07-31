package p264s3;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import p222p5.C4014a;
import p222p5.InterfaceC4020d;

/* renamed from: s3.e3 */
/* loaded from: classes.dex */
public final class C4425e3 {

    /* renamed from: a */
    public final b f16244a;

    /* renamed from: b */
    public final a f16245b;

    /* renamed from: c */
    public final InterfaceC4020d f16246c;

    /* renamed from: d */
    public final AbstractC4505u3 f16247d;

    /* renamed from: e */
    public int f16248e;

    /* renamed from: f */
    public Object f16249f;

    /* renamed from: g */
    public Looper f16250g;

    /* renamed from: h */
    public int f16251h;

    /* renamed from: i */
    public long f16252i = -9223372036854775807L;

    /* renamed from: j */
    public boolean f16253j = true;

    /* renamed from: k */
    public boolean f16254k;

    /* renamed from: l */
    public boolean f16255l;

    /* renamed from: m */
    public boolean f16256m;

    /* renamed from: n */
    public boolean f16257n;

    /* renamed from: s3.e3$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: b */
        void mo17195b(C4425e3 c4425e3);
    }

    /* renamed from: s3.e3$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: y */
        void mo16091y(int i10, Object obj);
    }

    public C4425e3(a aVar, b bVar, AbstractC4505u3 abstractC4505u3, int i10, InterfaceC4020d interfaceC4020d, Looper looper) {
        this.f16245b = aVar;
        this.f16244a = bVar;
        this.f16247d = abstractC4505u3;
        this.f16250g = looper;
        this.f16246c = interfaceC4020d;
        this.f16251h = i10;
    }

    /* renamed from: a */
    public synchronized boolean m17181a(long j10) {
        boolean z10;
        C4014a.m15200f(this.f16254k);
        C4014a.m15200f(this.f16250g.getThread() != Thread.currentThread());
        long mo15272b = this.f16246c.mo15272b() + j10;
        while (true) {
            z10 = this.f16256m;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f16246c.mo15274d();
            wait(j10);
            j10 = mo15272b - this.f16246c.mo15272b();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f16255l;
    }

    /* renamed from: b */
    public boolean m17182b() {
        return this.f16253j;
    }

    /* renamed from: c */
    public Looper m17183c() {
        return this.f16250g;
    }

    /* renamed from: d */
    public int m17184d() {
        return this.f16251h;
    }

    /* renamed from: e */
    public Object m17185e() {
        return this.f16249f;
    }

    /* renamed from: f */
    public long m17186f() {
        return this.f16252i;
    }

    /* renamed from: g */
    public b m17187g() {
        return this.f16244a;
    }

    /* renamed from: h */
    public AbstractC4505u3 m17188h() {
        return this.f16247d;
    }

    /* renamed from: i */
    public int m17189i() {
        return this.f16248e;
    }

    /* renamed from: j */
    public synchronized boolean m17190j() {
        return this.f16257n;
    }

    /* renamed from: k */
    public synchronized void m17191k(boolean z10) {
        this.f16255l = z10 | this.f16255l;
        this.f16256m = true;
        notifyAll();
    }

    /* renamed from: l */
    public C4425e3 m17192l() {
        C4014a.m15200f(!this.f16254k);
        if (this.f16252i == -9223372036854775807L) {
            C4014a.m15195a(this.f16253j);
        }
        this.f16254k = true;
        this.f16245b.mo17195b(this);
        return this;
    }

    /* renamed from: m */
    public C4425e3 m17193m(Object obj) {
        C4014a.m15200f(!this.f16254k);
        this.f16249f = obj;
        return this;
    }

    /* renamed from: n */
    public C4425e3 m17194n(int i10) {
        C4014a.m15200f(!this.f16254k);
        this.f16248e = i10;
        return this;
    }
}
