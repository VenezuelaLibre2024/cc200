package p104h2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p029c2.AbstractC0592j;
import p121i2.AbstractC2582c;
import p121i2.C2580a;
import p121i2.C2581b;
import p121i2.C2583d;
import p121i2.C2584e;
import p121i2.C2585f;
import p121i2.C2586g;
import p121i2.C2587h;
import p165l2.C3420p;
import p203o2.InterfaceC3840a;

/* renamed from: h2.d */
/* loaded from: classes.dex */
public class C2285d implements AbstractC2582c.a {

    /* renamed from: d */
    public static final String f9179d = AbstractC0592j.m2972f("WorkConstraintsTracker");

    /* renamed from: a */
    public final InterfaceC2284c f9180a;

    /* renamed from: b */
    public final AbstractC2582c<?>[] f9181b;

    /* renamed from: c */
    public final Object f9182c;

    public C2285d(Context context, InterfaceC3840a interfaceC3840a, InterfaceC2284c interfaceC2284c) {
        Context applicationContext = context.getApplicationContext();
        this.f9180a = interfaceC2284c;
        this.f9181b = new AbstractC2582c[]{new C2580a(applicationContext, interfaceC3840a), new C2581b(applicationContext, interfaceC3840a), new C2587h(applicationContext, interfaceC3840a), new C2583d(applicationContext, interfaceC3840a), new C2586g(applicationContext, interfaceC3840a), new C2585f(applicationContext, interfaceC3840a), new C2584e(applicationContext, interfaceC3840a)};
        this.f9182c = new Object();
    }

    @Override // p121i2.AbstractC2582c.a
    /* renamed from: a */
    public void mo9289a(List<String> list) {
        synchronized (this.f9182c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (m9291c(str)) {
                    AbstractC0592j.m2970c().mo2973a(f9179d, String.format("Constraints met for %s", str), new Throwable[0]);
                    arrayList.add(str);
                }
            }
            InterfaceC2284c interfaceC2284c = this.f9180a;
            if (interfaceC2284c != null) {
                interfaceC2284c.mo2184e(arrayList);
            }
        }
    }

    @Override // p121i2.AbstractC2582c.a
    /* renamed from: b */
    public void mo9290b(List<String> list) {
        synchronized (this.f9182c) {
            InterfaceC2284c interfaceC2284c = this.f9180a;
            if (interfaceC2284c != null) {
                interfaceC2284c.mo2182b(list);
            }
        }
    }

    /* renamed from: c */
    public boolean m9291c(String str) {
        synchronized (this.f9182c) {
            for (AbstractC2582c<?> abstractC2582c : this.f9181b) {
                if (abstractC2582c.m10341d(str)) {
                    AbstractC0592j.m2970c().mo2973a(f9179d, String.format("Work %s constrained by %s", str, abstractC2582c.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void m9292d(Iterable<C3420p> iterable) {
        synchronized (this.f9182c) {
            for (AbstractC2582c<?> abstractC2582c : this.f9181b) {
                abstractC2582c.m10344g(null);
            }
            for (AbstractC2582c<?> abstractC2582c2 : this.f9181b) {
                abstractC2582c2.m10342e(iterable);
            }
            for (AbstractC2582c<?> abstractC2582c3 : this.f9181b) {
                abstractC2582c3.m10344g(this);
            }
        }
    }

    /* renamed from: e */
    public void m9293e() {
        synchronized (this.f9182c) {
            for (AbstractC2582c<?> abstractC2582c : this.f9181b) {
                abstractC2582c.m10343f();
            }
        }
    }
}
