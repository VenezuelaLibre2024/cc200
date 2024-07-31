package p060e2;

import java.util.HashMap;
import java.util.Map;
import p029c2.AbstractC0592j;
import p029c2.InterfaceC0599q;
import p165l2.C3420p;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public class C1643a {

    /* renamed from: d */
    public static final String f6047d = AbstractC0592j.m2972f("DelayedWorkTracker");

    /* renamed from: a */
    public final C1644b f6048a;

    /* renamed from: b */
    public final InterfaceC0599q f6049b;

    /* renamed from: c */
    public final Map<String, Runnable> f6050c = new HashMap();

    /* renamed from: e2.a$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final /* synthetic */ C3420p f6051h;

        public a(C3420p c3420p) {
            this.f6051h = c3420p;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0592j.m2970c().mo2973a(C1643a.f6047d, String.format("Scheduling work %s", this.f6051h.f12010a), new Throwable[0]);
            C1643a.this.f6048a.mo6168f(this.f6051h);
        }
    }

    public C1643a(C1644b c1644b, InterfaceC0599q interfaceC0599q) {
        this.f6048a = c1644b;
        this.f6049b = interfaceC0599q;
    }

    /* renamed from: a */
    public void m6521a(C3420p c3420p) {
        Runnable remove = this.f6050c.remove(c3420p.f12010a);
        if (remove != null) {
            this.f6049b.mo2985b(remove);
        }
        a aVar = new a(c3420p);
        this.f6050c.put(c3420p.f12010a, aVar);
        this.f6049b.mo2984a(c3420p.m12731a() - System.currentTimeMillis(), aVar);
    }

    /* renamed from: b */
    public void m6522b(String str) {
        Runnable remove = this.f6050c.remove(str);
        if (remove != null) {
            this.f6049b.mo2985b(remove);
        }
    }
}
