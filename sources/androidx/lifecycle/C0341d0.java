package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.AbstractC0344f;
import td.C4753m;

/* renamed from: androidx.lifecycle.d0 */
/* loaded from: classes.dex */
public class C0341d0 {

    /* renamed from: a */
    public final C0356l f1693a;

    /* renamed from: b */
    public final Handler f1694b;

    /* renamed from: c */
    public a f1695c;

    /* renamed from: androidx.lifecycle.d0$a */
    /* loaded from: classes.dex */
    public static final class a implements Runnable {

        /* renamed from: h */
        public final C0356l f1696h;

        /* renamed from: i */
        public final AbstractC0344f.a f1697i;

        /* renamed from: j */
        public boolean f1698j;

        public a(C0356l c0356l, AbstractC0344f.a aVar) {
            C4753m.m18653f(c0356l, "registry");
            C4753m.m18653f(aVar, "event");
            this.f1696h = c0356l;
            this.f1697i = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1698j) {
                return;
            }
            this.f1696h.m1833h(this.f1697i);
            this.f1698j = true;
        }
    }

    public C0341d0(InterfaceC0354k interfaceC0354k) {
        C4753m.m18653f(interfaceC0354k, "provider");
        this.f1693a = new C0356l(interfaceC0354k);
        this.f1694b = new Handler();
    }

    /* renamed from: a */
    public AbstractC0344f m1790a() {
        return this.f1693a;
    }

    /* renamed from: b */
    public void m1791b() {
        m1795f(AbstractC0344f.a.ON_START);
    }

    /* renamed from: c */
    public void m1792c() {
        m1795f(AbstractC0344f.a.ON_CREATE);
    }

    /* renamed from: d */
    public void m1793d() {
        m1795f(AbstractC0344f.a.ON_STOP);
        m1795f(AbstractC0344f.a.ON_DESTROY);
    }

    /* renamed from: e */
    public void m1794e() {
        m1795f(AbstractC0344f.a.ON_START);
    }

    /* renamed from: f */
    public final void m1795f(AbstractC0344f.a aVar) {
        a aVar2 = this.f1695c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.f1693a, aVar);
        this.f1695c = aVar3;
        Handler handler = this.f1694b;
        C4753m.m18650c(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }
}
