package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.AbstractC0344f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p200o.C3822c;
import p216p.C3993a;
import p216p.C3994b;
import td.C4747g;
import td.C4753m;

/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public class C0356l extends AbstractC0344f {

    /* renamed from: j */
    public static final a f1728j = new a(null);

    /* renamed from: b */
    public final boolean f1729b;

    /* renamed from: c */
    public C3993a<InterfaceC0352j, b> f1730c;

    /* renamed from: d */
    public AbstractC0344f.b f1731d;

    /* renamed from: e */
    public final WeakReference<InterfaceC0354k> f1732e;

    /* renamed from: f */
    public int f1733f;

    /* renamed from: g */
    public boolean f1734g;

    /* renamed from: h */
    public boolean f1735h;

    /* renamed from: i */
    public ArrayList<AbstractC0344f.b> f1736i;

    /* renamed from: androidx.lifecycle.l$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC0344f.b m1841a(AbstractC0344f.b bVar, AbstractC0344f.b bVar2) {
            C4753m.m18653f(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }
    }

    /* renamed from: androidx.lifecycle.l$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public AbstractC0344f.b f1737a;

        /* renamed from: b */
        public InterfaceC0350i f1738b;

        public b(InterfaceC0352j interfaceC0352j, AbstractC0344f.b bVar) {
            C4753m.m18653f(bVar, "initialState");
            C4753m.m18650c(interfaceC0352j);
            this.f1738b = C0359o.m1845f(interfaceC0352j);
            this.f1737a = bVar;
        }

        /* renamed from: a */
        public final void m1842a(InterfaceC0354k interfaceC0354k, AbstractC0344f.a aVar) {
            C4753m.m18653f(aVar, "event");
            AbstractC0344f.b m1806f = aVar.m1806f();
            this.f1737a = C0356l.f1728j.m1841a(this.f1737a, m1806f);
            InterfaceC0350i interfaceC0350i = this.f1738b;
            C4753m.m18650c(interfaceC0354k);
            interfaceC0350i.mo571a(interfaceC0354k, aVar);
            this.f1737a = m1806f;
        }

        /* renamed from: b */
        public final AbstractC0344f.b m1843b() {
            return this.f1737a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0356l(InterfaceC0354k interfaceC0354k) {
        this(interfaceC0354k, true);
        C4753m.m18653f(interfaceC0354k, "provider");
    }

    public C0356l(InterfaceC0354k interfaceC0354k, boolean z10) {
        this.f1729b = z10;
        this.f1730c = new C3993a<>();
        this.f1731d = AbstractC0344f.b.INITIALIZED;
        this.f1736i = new ArrayList<>();
        this.f1732e = new WeakReference<>(interfaceC0354k);
    }

    @Override // androidx.lifecycle.AbstractC0344f
    /* renamed from: a */
    public void mo1800a(InterfaceC0352j interfaceC0352j) {
        InterfaceC0354k interfaceC0354k;
        C4753m.m18653f(interfaceC0352j, "observer");
        m1831f("addObserver");
        AbstractC0344f.b bVar = this.f1731d;
        AbstractC0344f.b bVar2 = AbstractC0344f.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0344f.b.INITIALIZED;
        }
        b bVar3 = new b(interfaceC0352j, bVar2);
        if (this.f1730c.mo15124h(interfaceC0352j, bVar3) == null && (interfaceC0354k = this.f1732e.get()) != null) {
            boolean z10 = this.f1733f != 0 || this.f1734g;
            AbstractC0344f.b m1830e = m1830e(interfaceC0352j);
            this.f1733f++;
            while (bVar3.m1843b().compareTo(m1830e) < 0 && this.f1730c.contains(interfaceC0352j)) {
                m1838m(bVar3.m1843b());
                AbstractC0344f.a m1808b = AbstractC0344f.a.Companion.m1808b(bVar3.m1843b());
                if (m1808b == null) {
                    throw new IllegalStateException("no event up from " + bVar3.m1843b());
                }
                bVar3.m1842a(interfaceC0354k, m1808b);
                m1837l();
                m1830e = m1830e(interfaceC0352j);
            }
            if (!z10) {
                m1840o();
            }
            this.f1733f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0344f
    /* renamed from: b */
    public AbstractC0344f.b mo1801b() {
        return this.f1731d;
    }

    @Override // androidx.lifecycle.AbstractC0344f
    /* renamed from: c */
    public void mo1802c(InterfaceC0352j interfaceC0352j) {
        C4753m.m18653f(interfaceC0352j, "observer");
        m1831f("removeObserver");
        this.f1730c.mo15125j(interfaceC0352j);
    }

    /* renamed from: d */
    public final void m1829d(InterfaceC0354k interfaceC0354k) {
        Iterator<Map.Entry<InterfaceC0352j, b>> descendingIterator = this.f1730c.descendingIterator();
        C4753m.m18652e(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f1735h) {
            Map.Entry<InterfaceC0352j, b> next = descendingIterator.next();
            C4753m.m18652e(next, "next()");
            InterfaceC0352j key = next.getKey();
            b value = next.getValue();
            while (value.m1843b().compareTo(this.f1731d) > 0 && !this.f1735h && this.f1730c.contains(key)) {
                AbstractC0344f.a m1807a = AbstractC0344f.a.Companion.m1807a(value.m1843b());
                if (m1807a == null) {
                    throw new IllegalStateException("no event down from " + value.m1843b());
                }
                m1838m(m1807a.m1806f());
                value.m1842a(interfaceC0354k, m1807a);
                m1837l();
            }
        }
    }

    /* renamed from: e */
    public final AbstractC0344f.b m1830e(InterfaceC0352j interfaceC0352j) {
        b value;
        Map.Entry<InterfaceC0352j, b> m15126k = this.f1730c.m15126k(interfaceC0352j);
        AbstractC0344f.b bVar = null;
        AbstractC0344f.b m1843b = (m15126k == null || (value = m15126k.getValue()) == null) ? null : value.m1843b();
        if (!this.f1736i.isEmpty()) {
            bVar = this.f1736i.get(r0.size() - 1);
        }
        a aVar = f1728j;
        return aVar.m1841a(aVar.m1841a(this.f1731d, m1843b), bVar);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: f */
    public final void m1831f(String str) {
        if (!this.f1729b || C3822c.m14529g().mo14533b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    /* renamed from: g */
    public final void m1832g(InterfaceC0354k interfaceC0354k) {
        C3994b<InterfaceC0352j, b>.d m15128c = this.f1730c.m15128c();
        C4753m.m18652e(m15128c, "observerMap.iteratorWithAdditions()");
        while (m15128c.hasNext() && !this.f1735h) {
            Map.Entry next = m15128c.next();
            InterfaceC0352j interfaceC0352j = (InterfaceC0352j) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.m1843b().compareTo(this.f1731d) < 0 && !this.f1735h && this.f1730c.contains(interfaceC0352j)) {
                m1838m(bVar.m1843b());
                AbstractC0344f.a m1808b = AbstractC0344f.a.Companion.m1808b(bVar.m1843b());
                if (m1808b == null) {
                    throw new IllegalStateException("no event up from " + bVar.m1843b());
                }
                bVar.m1842a(interfaceC0354k, m1808b);
                m1837l();
            }
        }
    }

    /* renamed from: h */
    public void m1833h(AbstractC0344f.a aVar) {
        C4753m.m18653f(aVar, "event");
        m1831f("handleLifecycleEvent");
        m1836k(aVar.m1806f());
    }

    /* renamed from: i */
    public final boolean m1834i() {
        if (this.f1730c.size() == 0) {
            return true;
        }
        Map.Entry<InterfaceC0352j, b> m15127a = this.f1730c.m15127a();
        C4753m.m18650c(m15127a);
        AbstractC0344f.b m1843b = m15127a.getValue().m1843b();
        Map.Entry<InterfaceC0352j, b> m15129d = this.f1730c.m15129d();
        C4753m.m18650c(m15129d);
        AbstractC0344f.b m1843b2 = m15129d.getValue().m1843b();
        return m1843b == m1843b2 && this.f1731d == m1843b2;
    }

    /* renamed from: j */
    public void m1835j(AbstractC0344f.b bVar) {
        C4753m.m18653f(bVar, "state");
        m1831f("markState");
        m1839n(bVar);
    }

    /* renamed from: k */
    public final void m1836k(AbstractC0344f.b bVar) {
        AbstractC0344f.b bVar2 = this.f1731d;
        if (bVar2 == bVar) {
            return;
        }
        if (!((bVar2 == AbstractC0344f.b.INITIALIZED && bVar == AbstractC0344f.b.DESTROYED) ? false : true)) {
            throw new IllegalStateException(("no event down from " + this.f1731d + " in component " + this.f1732e.get()).toString());
        }
        this.f1731d = bVar;
        if (this.f1734g || this.f1733f != 0) {
            this.f1735h = true;
            return;
        }
        this.f1734g = true;
        m1840o();
        this.f1734g = false;
        if (this.f1731d == AbstractC0344f.b.DESTROYED) {
            this.f1730c = new C3993a<>();
        }
    }

    /* renamed from: l */
    public final void m1837l() {
        this.f1736i.remove(r0.size() - 1);
    }

    /* renamed from: m */
    public final void m1838m(AbstractC0344f.b bVar) {
        this.f1736i.add(bVar);
    }

    /* renamed from: n */
    public void m1839n(AbstractC0344f.b bVar) {
        C4753m.m18653f(bVar, "state");
        m1831f("setCurrentState");
        m1836k(bVar);
    }

    /* renamed from: o */
    public final void m1840o() {
        InterfaceC0354k interfaceC0354k = this.f1732e.get();
        if (interfaceC0354k == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean m1834i = m1834i();
            this.f1735h = false;
            if (m1834i) {
                return;
            }
            AbstractC0344f.b bVar = this.f1731d;
            Map.Entry<InterfaceC0352j, b> m15127a = this.f1730c.m15127a();
            C4753m.m18650c(m15127a);
            if (bVar.compareTo(m15127a.getValue().m1843b()) < 0) {
                m1829d(interfaceC0354k);
            }
            Map.Entry<InterfaceC0352j, b> m15129d = this.f1730c.m15129d();
            if (!this.f1735h && m15129d != null && this.f1731d.compareTo(m15129d.getValue().m1843b()) > 0) {
                m1832g(interfaceC0354k);
            }
        }
    }
}
