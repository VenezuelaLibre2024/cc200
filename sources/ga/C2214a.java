package ga;

import ga.C2214a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p068ea.C1762a;
import p068ea.C1763b;

/* renamed from: ga.a */
/* loaded from: classes.dex */
public class C2214a<T extends a> {

    /* renamed from: a */
    public final C1762a f8790a;

    /* renamed from: b */
    public final int f8791b;

    /* renamed from: c */
    public Set<T> f8792c;

    /* renamed from: d */
    public List<C2214a<T>> f8793d;

    /* renamed from: ga.a$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: a */
        C1763b mo2556a();
    }

    public C2214a(double d10, double d11, double d12, double d13) {
        this(new C1762a(d10, d11, d12, d13));
    }

    public C2214a(double d10, double d11, double d12, double d13, int i10) {
        this(new C1762a(d10, d11, d12, d13), i10);
    }

    public C2214a(C1762a c1762a) {
        this(c1762a, 0);
    }

    public C2214a(C1762a c1762a, int i10) {
        this.f8793d = null;
        this.f8790a = c1762a;
        this.f8791b = i10;
    }

    /* renamed from: a */
    public void m8884a(T t10) {
        C1763b mo2556a = t10.mo2556a();
        if (this.f8790a.m7058a(mo2556a.f6519a, mo2556a.f6520b)) {
            m8886c(mo2556a.f6519a, mo2556a.f6520b, t10);
        }
    }

    /* renamed from: b */
    public void m8885b() {
        this.f8793d = null;
        Set<T> set = this.f8792c;
        if (set != null) {
            set.clear();
        }
    }

    /* renamed from: c */
    public final void m8886c(double d10, double d11, T t10) {
        List<C2214a<T>> list = this.f8793d;
        if (list != null) {
            C1762a c1762a = this.f8790a;
            list.get(d11 < c1762a.f6518f ? d10 < c1762a.f6517e ? 0 : 1 : d10 < c1762a.f6517e ? 2 : 3).m8886c(d10, d11, t10);
            return;
        }
        if (this.f8792c == null) {
            this.f8792c = new LinkedHashSet();
        }
        this.f8792c.add(t10);
        if (this.f8792c.size() <= 50 || this.f8791b >= 40) {
            return;
        }
        m8891h();
    }

    /* renamed from: d */
    public final boolean m8887d(double d10, double d11, T t10) {
        List<C2214a<T>> list = this.f8793d;
        int i10 = 0;
        if (list == null) {
            Set<T> set = this.f8792c;
            if (set == null) {
                return false;
            }
            return set.remove(t10);
        }
        C1762a c1762a = this.f8790a;
        if (d11 >= c1762a.f6518f) {
            i10 = d10 < c1762a.f6517e ? 2 : 3;
        } else if (d10 >= c1762a.f6517e) {
            i10 = 1;
        }
        return list.get(i10).m8887d(d10, d11, t10);
    }

    /* renamed from: e */
    public boolean m8888e(T t10) {
        C1763b mo2556a = t10.mo2556a();
        if (this.f8790a.m7058a(mo2556a.f6519a, mo2556a.f6520b)) {
            return m8887d(mo2556a.f6519a, mo2556a.f6520b, t10);
        }
        return false;
    }

    /* renamed from: f */
    public Collection<T> m8889f(C1762a c1762a) {
        ArrayList arrayList = new ArrayList();
        m8890g(c1762a, arrayList);
        return arrayList;
    }

    /* renamed from: g */
    public final void m8890g(C1762a c1762a, Collection<T> collection) {
        if (this.f8790a.m7062e(c1762a)) {
            List<C2214a<T>> list = this.f8793d;
            if (list != null) {
                Iterator<C2214a<T>> it = list.iterator();
                while (it.hasNext()) {
                    it.next().m8890g(c1762a, collection);
                }
            } else if (this.f8792c != null) {
                if (c1762a.m7059b(this.f8790a)) {
                    collection.addAll(this.f8792c);
                    return;
                }
                for (T t10 : this.f8792c) {
                    if (c1762a.m7060c(t10.mo2556a())) {
                        collection.add(t10);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    public final void m8891h() {
        ArrayList arrayList = new ArrayList(4);
        this.f8793d = arrayList;
        C1762a c1762a = this.f8790a;
        arrayList.add(new C2214a(c1762a.f6513a, c1762a.f6517e, c1762a.f6514b, c1762a.f6518f, this.f8791b + 1));
        List<C2214a<T>> list = this.f8793d;
        C1762a c1762a2 = this.f8790a;
        list.add(new C2214a<>(c1762a2.f6517e, c1762a2.f6515c, c1762a2.f6514b, c1762a2.f6518f, this.f8791b + 1));
        List<C2214a<T>> list2 = this.f8793d;
        C1762a c1762a3 = this.f8790a;
        list2.add(new C2214a<>(c1762a3.f6513a, c1762a3.f6517e, c1762a3.f6518f, c1762a3.f6516d, this.f8791b + 1));
        List<C2214a<T>> list3 = this.f8793d;
        C1762a c1762a4 = this.f8790a;
        list3.add(new C2214a<>(c1762a4.f6517e, c1762a4.f6515c, c1762a4.f6518f, c1762a4.f6516d, this.f8791b + 1));
        Set<T> set = this.f8792c;
        this.f8792c = null;
        for (T t10 : set) {
            m8886c(t10.mo2556a().f6519a, t10.mo2556a().f6520b, t10);
        }
    }
}
