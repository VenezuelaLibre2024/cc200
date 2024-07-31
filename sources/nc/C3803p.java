package nc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* renamed from: nc.p */
/* loaded from: classes2.dex */
public class C3803p implements InterfaceC3801n {

    /* renamed from: a */
    public final String f13703a;

    /* renamed from: b */
    public final int f13704b;

    /* renamed from: c */
    public final int f13705c;

    /* renamed from: d */
    public final LinkedList<C3798k> f13706d = new LinkedList<>();

    /* renamed from: e */
    public final Set<C3800m> f13707e = new HashSet();

    /* renamed from: f */
    public final Set<C3800m> f13708f = new HashSet();

    /* renamed from: g */
    public final Map<Integer, C3800m> f13709g = new HashMap();

    public C3803p(String str, int i10, int i11) {
        this.f13703a = str;
        this.f13704b = i10;
        this.f13705c = i11;
    }

    @Override // nc.InterfaceC3801n
    /* renamed from: a */
    public synchronized void mo14501a(C3798k c3798k) {
        this.f13706d.add(c3798k);
        Iterator it = new HashSet(this.f13707e).iterator();
        while (it.hasNext()) {
            m14509j((C3800m) it.next());
        }
    }

    @Override // nc.InterfaceC3801n
    /* renamed from: c */
    public synchronized void mo14502c() {
        Iterator<C3800m> it = this.f13707e.iterator();
        while (it.hasNext()) {
            it.next().m14497f();
        }
        Iterator<C3800m> it2 = this.f13708f.iterator();
        while (it2.hasNext()) {
            it2.next().m14497f();
        }
    }

    /* renamed from: f */
    public C3800m m14506f(String str, int i10) {
        return new C3800m(str, i10);
    }

    /* renamed from: g */
    public final synchronized C3798k m14507g(C3800m c3800m) {
        C3798k next;
        C3800m c3800m2;
        ListIterator<C3798k> listIterator = this.f13706d.listIterator();
        do {
            if (!listIterator.hasNext()) {
                return null;
            }
            next = listIterator.next();
            c3800m2 = next.m14490a() != null ? this.f13709g.get(next.m14490a()) : null;
            if (c3800m2 == null) {
                break;
            }
        } while (c3800m2 != c3800m);
        listIterator.remove();
        return next;
    }

    /* renamed from: i */
    public final synchronized void m14505h(C3800m c3800m) {
        HashSet hashSet = new HashSet(this.f13707e);
        this.f13708f.remove(c3800m);
        this.f13707e.add(c3800m);
        if (!c3800m.m14494b() && c3800m.m14495d() != null) {
            this.f13709g.remove(c3800m.m14495d());
        }
        m14509j(c3800m);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            m14509j((C3800m) it.next());
        }
    }

    /* renamed from: j */
    public final synchronized void m14509j(C3800m c3800m) {
        C3798k m14507g = m14507g(c3800m);
        if (m14507g != null) {
            this.f13708f.add(c3800m);
            this.f13707e.remove(c3800m);
            if (m14507g.m14490a() != null) {
                this.f13709g.put(m14507g.m14490a(), c3800m);
            }
            c3800m.m14496e(m14507g);
        }
    }

    @Override // nc.InterfaceC3801n
    public synchronized void start() {
        for (int i10 = 0; i10 < this.f13704b; i10++) {
            C3800m m14506f = m14506f(this.f13703a + i10, this.f13705c);
            m14506f.m14498g(new Runnable() { // from class: nc.o

                /* renamed from: i */
                public final /* synthetic */ C3800m f13702i;

                public /* synthetic */ RunnableC3802o(C3800m m14506f2) {
                    r2 = m14506f2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3803p.this.m14505h(r2);
                }
            });
            this.f13707e.add(m14506f2);
        }
    }
}
