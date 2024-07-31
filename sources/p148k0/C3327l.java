package p148k0;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC0344f;
import androidx.lifecycle.InterfaceC0350i;
import androidx.lifecycle.InterfaceC0354k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: k0.l */
/* loaded from: classes.dex */
public class C3327l {

    /* renamed from: a */
    public final Runnable f11597a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<InterfaceC3331n> f11598b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<InterfaceC3331n, a> f11599c = new HashMap();

    /* renamed from: k0.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final AbstractC0344f f11600a;

        /* renamed from: b */
        public InterfaceC0350i f11601b;

        public a(AbstractC0344f abstractC0344f, InterfaceC0350i interfaceC0350i) {
            this.f11600a = abstractC0344f;
            this.f11601b = interfaceC0350i;
            abstractC0344f.mo1800a(interfaceC0350i);
        }

        /* renamed from: a */
        public void m12274a() {
            this.f11600a.mo1802c(this.f11601b);
            this.f11601b = null;
        }
    }

    public C3327l(Runnable runnable) {
        this.f11597a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m12264f(InterfaceC3331n interfaceC3331n, InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        if (aVar == AbstractC0344f.a.ON_DESTROY) {
            m12273l(interfaceC3331n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m12265g(AbstractC0344f.b bVar, InterfaceC3331n interfaceC3331n, InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
        if (aVar == AbstractC0344f.a.m1805h(bVar)) {
            m12266c(interfaceC3331n);
            return;
        }
        if (aVar == AbstractC0344f.a.ON_DESTROY) {
            m12273l(interfaceC3331n);
        } else if (aVar == AbstractC0344f.a.m1804c(bVar)) {
            this.f11598b.remove(interfaceC3331n);
            this.f11597a.run();
        }
    }

    /* renamed from: c */
    public void m12266c(InterfaceC3331n interfaceC3331n) {
        this.f11598b.add(interfaceC3331n);
        this.f11597a.run();
    }

    /* renamed from: d */
    public void m12267d(final InterfaceC3331n interfaceC3331n, InterfaceC0354k interfaceC0354k) {
        m12266c(interfaceC3331n);
        AbstractC0344f lifecycle = interfaceC0354k.getLifecycle();
        a remove = this.f11599c.remove(interfaceC3331n);
        if (remove != null) {
            remove.m12274a();
        }
        this.f11599c.put(interfaceC3331n, new a(lifecycle, new InterfaceC0350i() { // from class: k0.k
            @Override // androidx.lifecycle.InterfaceC0350i
            /* renamed from: a */
            public final void mo571a(InterfaceC0354k interfaceC0354k2, AbstractC0344f.a aVar) {
                C3327l.this.m12264f(interfaceC3331n, interfaceC0354k2, aVar);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public void m12268e(final InterfaceC3331n interfaceC3331n, InterfaceC0354k interfaceC0354k, final AbstractC0344f.b bVar) {
        AbstractC0344f lifecycle = interfaceC0354k.getLifecycle();
        a remove = this.f11599c.remove(interfaceC3331n);
        if (remove != null) {
            remove.m12274a();
        }
        this.f11599c.put(interfaceC3331n, new a(lifecycle, new InterfaceC0350i() { // from class: k0.j
            @Override // androidx.lifecycle.InterfaceC0350i
            /* renamed from: a */
            public final void mo571a(InterfaceC0354k interfaceC0354k2, AbstractC0344f.a aVar) {
                C3327l.this.m12265g(bVar, interfaceC3331n, interfaceC0354k2, aVar);
            }
        }));
    }

    /* renamed from: h */
    public void m12269h(Menu menu, MenuInflater menuInflater) {
        Iterator<InterfaceC3331n> it = this.f11598b.iterator();
        while (it.hasNext()) {
            it.next().mo1746c(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void m12270i(Menu menu) {
        Iterator<InterfaceC3331n> it = this.f11598b.iterator();
        while (it.hasNext()) {
            it.next().mo1745b(menu);
        }
    }

    /* renamed from: j */
    public boolean m12271j(MenuItem menuItem) {
        Iterator<InterfaceC3331n> it = this.f11598b.iterator();
        while (it.hasNext()) {
            if (it.next().mo1744a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m12272k(Menu menu) {
        Iterator<InterfaceC3331n> it = this.f11598b.iterator();
        while (it.hasNext()) {
            it.next().mo1747d(menu);
        }
    }

    /* renamed from: l */
    public void m12273l(InterfaceC3331n interfaceC3331n) {
        this.f11598b.remove(interfaceC3331n);
        a remove = this.f11599c.remove(interfaceC3331n);
        if (remove != null) {
            remove.m12274a();
        }
        this.f11597a.run();
    }
}
