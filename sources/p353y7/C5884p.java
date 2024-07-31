package p353y7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: y7.p */
/* loaded from: classes.dex */
public class C5884p {

    /* renamed from: y7.p$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final C5867c<?> f21914a;

        /* renamed from: b */
        public final Set<b> f21915b = new HashSet();

        /* renamed from: c */
        public final Set<b> f21916c = new HashSet();

        public b(C5867c<?> c5867c) {
            this.f21914a = c5867c;
        }

        /* renamed from: a */
        public void m23539a(b bVar) {
            this.f21915b.add(bVar);
        }

        /* renamed from: b */
        public void m23540b(b bVar) {
            this.f21916c.add(bVar);
        }

        /* renamed from: c */
        public C5867c<?> m23541c() {
            return this.f21914a;
        }

        /* renamed from: d */
        public Set<b> m23542d() {
            return this.f21915b;
        }

        /* renamed from: e */
        public boolean m23543e() {
            return this.f21915b.isEmpty();
        }

        /* renamed from: f */
        public boolean m23544f() {
            return this.f21916c.isEmpty();
        }

        /* renamed from: g */
        public void m23545g(b bVar) {
            this.f21916c.remove(bVar);
        }
    }

    /* renamed from: y7.p$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public final C5872e0<?> f21917a;

        /* renamed from: b */
        public final boolean f21918b;

        public c(C5872e0<?> c5872e0, boolean z10) {
            this.f21917a = c5872e0;
            this.f21918b = z10;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f21917a.equals(this.f21917a) && cVar.f21918b == this.f21918b;
        }

        public int hashCode() {
            return ((this.f21917a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f21918b).hashCode();
        }
    }

    /* renamed from: a */
    public static void m23536a(List<C5867c<?>> list) {
        Set<b> m23538c = m23538c(list);
        Set<b> m23537b = m23537b(m23538c);
        int i10 = 0;
        while (!m23537b.isEmpty()) {
            b next = m23537b.iterator().next();
            m23537b.remove(next);
            i10++;
            for (b bVar : next.m23542d()) {
                bVar.m23545g(next);
                if (bVar.m23544f()) {
                    m23537b.add(bVar);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : m23538c) {
            if (!bVar2.m23544f() && !bVar2.m23543e()) {
                arrayList.add(bVar2.m23541c());
            }
        }
        throw new C5886r(arrayList);
    }

    /* renamed from: b */
    public static Set<b> m23537b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.m23544f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public static Set<b> m23538c(List<C5867c<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<C5867c<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (C5885q c5885q : bVar.m23541c().m23463g()) {
                            if (c5885q.m23558e() && (set = (Set) hashMap.get(new c(c5885q.m23556c(), c5885q.m23560g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.m23539a(bVar2);
                                    bVar2.m23540b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C5867c<?> next = it.next();
            b bVar3 = new b(next);
            for (C5872e0<? super Object> c5872e0 : next.m23466j()) {
                c cVar = new c(c5872e0, !next.m23470p());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f21918b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", c5872e0));
                }
                set2.add(bVar3);
            }
        }
    }
}
