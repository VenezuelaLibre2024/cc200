package ke;

import gd.C2245s;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p038ce.AbstractC1068l;
import p038ce.C1080o;
import p038ce.InterfaceC1055i1;
import p038ce.InterfaceC1062j3;
import p038ce.InterfaceC1076n;
import p115hd.C2501m;
import p115hd.C2510v;
import p116he.AbstractC2532i0;
import p116he.C2538l0;
import p146jd.InterfaceC3284g;
import sd.InterfaceC4580l;
import sd.InterfaceC4585q;
import td.C4753m;

/* renamed from: ke.a */
/* loaded from: classes2.dex */
public class C3386a<R> extends AbstractC1068l implements InterfaceC3387b, InterfaceC1062j3 {

    /* renamed from: m */
    public static final AtomicReferenceFieldUpdater f11804m = AtomicReferenceFieldUpdater.newUpdater(C3386a.class, Object.class, "state");

    /* renamed from: h */
    public final InterfaceC3284g f11805h;

    /* renamed from: i */
    public List<C3386a<R>.a> f11806i;

    /* renamed from: j */
    public Object f11807j;

    /* renamed from: k */
    public int f11808k;

    /* renamed from: l */
    public Object f11809l;
    private volatile Object state;

    /* renamed from: ke.a$a */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a */
        public final Object f11810a;

        /* renamed from: b */
        public final Object f11811b;

        /* renamed from: c */
        public final InterfaceC4585q<InterfaceC3387b<?>, Object, Object, InterfaceC4580l<Throwable, C2245s>> f11812c;

        /* renamed from: d */
        public Object f11813d;

        /* renamed from: e */
        public int f11814e;

        /* renamed from: f */
        public final /* synthetic */ C3386a<R> f11815f;

        /* renamed from: a */
        public final InterfaceC4580l<Throwable, C2245s> m12587a(InterfaceC3387b<?> interfaceC3387b, Object obj) {
            InterfaceC4585q<InterfaceC3387b<?>, Object, Object, InterfaceC4580l<Throwable, C2245s>> interfaceC4585q = this.f11812c;
            if (interfaceC4585q != null) {
                return interfaceC4585q.mo7159b(interfaceC3387b, this.f11811b, obj);
            }
            return null;
        }

        /* renamed from: b */
        public final void m12588b() {
            Object obj = this.f11813d;
            C3386a<R> c3386a = this.f11815f;
            if (obj instanceof AbstractC2532i0) {
                ((AbstractC2532i0) obj).mo7211o(this.f11814e, null, c3386a.getContext());
                return;
            }
            InterfaceC1055i1 interfaceC1055i1 = obj instanceof InterfaceC1055i1 ? (InterfaceC1055i1) obj : null;
            if (interfaceC1055i1 != null) {
                interfaceC1055i1.dispose();
            }
        }
    }

    @Override // ke.InterfaceC3387b
    /* renamed from: a */
    public boolean mo12582a(Object obj, Object obj2) {
        return m12586h(obj, obj2) == 0;
    }

    @Override // ke.InterfaceC3387b
    /* renamed from: c */
    public void mo12583c(Object obj) {
        this.f11809l = obj;
    }

    @Override // p038ce.AbstractC1072m
    /* renamed from: e */
    public void mo4305e(Throwable th) {
        Object obj;
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11804m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            c2538l0 = C3388c.f11818c;
            if (obj == c2538l0) {
                return;
            } else {
                c2538l02 = C3388c.f11819d;
            }
        } while (!C1080o.m4523a(atomicReferenceFieldUpdater, this, obj, c2538l02));
        List<C3386a<R>.a> list = this.f11806i;
        if (list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((a) it.next()).m12588b();
        }
        c2538l03 = C3388c.f11820e;
        this.f11809l = c2538l03;
        this.f11806i = null;
    }

    /* renamed from: f */
    public final C3386a<R>.a m12584f(Object obj) {
        List<C3386a<R>.a> list = this.f11806i;
        Object obj2 = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).f11810a == obj) {
                obj2 = next;
                break;
            }
        }
        C3386a<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* renamed from: g */
    public final EnumC3389d m12585g(Object obj, Object obj2) {
        EnumC3389d m12589a;
        m12589a = C3388c.m12589a(m12586h(obj, obj2));
        return m12589a;
    }

    @Override // ke.InterfaceC3387b
    public InterfaceC3284g getContext() {
        return this.f11805h;
    }

    /* renamed from: h */
    public final int m12586h(Object obj, Object obj2) {
        boolean m12596h;
        C2538l0 c2538l0;
        C2538l0 c2538l02;
        C2538l0 c2538l03;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11804m;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof InterfaceC1076n) {
                C3386a<R>.a m12584f = m12584f(obj);
                if (m12584f == null) {
                    continue;
                } else {
                    InterfaceC4580l<Throwable, C2245s> m12587a = m12584f.m12587a(this, obj2);
                    if (C1080o.m4523a(atomicReferenceFieldUpdater, this, obj3, m12584f)) {
                        this.f11809l = obj2;
                        m12596h = C3388c.m12596h((InterfaceC1076n) obj3, m12587a);
                        if (m12596h) {
                            return 0;
                        }
                        this.f11809l = null;
                        return 2;
                    }
                }
            } else {
                c2538l0 = C3388c.f11818c;
                if (C4753m.m18648a(obj3, c2538l0) ? true : obj3 instanceof a) {
                    return 3;
                }
                c2538l02 = C3388c.f11819d;
                if (C4753m.m18648a(obj3, c2538l02)) {
                    return 2;
                }
                c2538l03 = C3388c.f11817b;
                if (C4753m.m18648a(obj3, c2538l03)) {
                    if (C1080o.m4523a(atomicReferenceFieldUpdater, this, obj3, C2501m.m9986b(obj))) {
                        return 1;
                    }
                } else {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                    }
                    if (C1080o.m4523a(atomicReferenceFieldUpdater, this, obj3, C2510v.m9999B((Collection) obj3, obj))) {
                        return 1;
                    }
                }
            }
        }
    }

    @Override // sd.InterfaceC4580l
    public /* bridge */ /* synthetic */ C2245s invoke(Throwable th) {
        mo4305e(th);
        return C2245s.f8873a;
    }

    @Override // p038ce.InterfaceC1062j3
    /* renamed from: j */
    public void mo4453j(AbstractC2532i0<?> abstractC2532i0, int i10) {
        this.f11807j = abstractC2532i0;
        this.f11808k = i10;
    }
}
