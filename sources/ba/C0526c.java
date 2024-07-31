package ba;

import com.google.android.gms.maps.model.LatLng;
import ga.C2214a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p012aa.InterfaceC0080a;
import p012aa.InterfaceC0081b;
import p068ea.C1762a;
import p068ea.C1763b;
import p083fa.C1887b;

/* renamed from: ba.c */
/* loaded from: classes.dex */
public class C0526c<T extends InterfaceC0081b> extends AbstractC0524a<T> {

    /* renamed from: e */
    public static final C1887b f2348e = new C1887b(1.0d);

    /* renamed from: b */
    public int f2349b = 100;

    /* renamed from: c */
    public final Collection<b<T>> f2350c = new LinkedHashSet();

    /* renamed from: d */
    public final C2214a<b<T>> f2351d = new C2214a<>(0.0d, 1.0d, 0.0d, 1.0d);

    /* renamed from: ba.c$b */
    /* loaded from: classes.dex */
    public static class b<T extends InterfaceC0081b> implements C2214a.a, InterfaceC0080a<T> {

        /* renamed from: a */
        public final T f2352a;

        /* renamed from: b */
        public final C1763b f2353b;

        /* renamed from: c */
        public final LatLng f2354c;

        /* renamed from: d */
        public Set<T> f2355d;

        public b(T t10) {
            this.f2352a = t10;
            LatLng position = t10.getPosition();
            this.f2354c = position;
            this.f2353b = C0526c.f2348e.m7718b(position);
            this.f2355d = Collections.singleton(t10);
        }

        public /* synthetic */ b(InterfaceC0081b interfaceC0081b, a aVar) {
            this(interfaceC0081b);
        }

        @Override // ga.C2214a.a
        /* renamed from: a */
        public C1763b mo2556a() {
            return this.f2353b;
        }

        @Override // p012aa.InterfaceC0080a
        /* renamed from: c */
        public int mo337c() {
            return 1;
        }

        @Override // p012aa.InterfaceC0080a
        /* renamed from: e */
        public Set<T> mo336b() {
            return this.f2355d;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return ((b) obj).f2352a.equals(this.f2352a);
            }
            return false;
        }

        @Override // p012aa.InterfaceC0080a
        public LatLng getPosition() {
            return this.f2354c;
        }

        public int hashCode() {
            return this.f2352a.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ba.InterfaceC0525b
    /* renamed from: b */
    public Set<? extends InterfaceC0080a<T>> mo2546b(float f10) {
        double pow = (this.f2349b / Math.pow(2.0d, (int) f10)) / 256.0d;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        synchronized (this.f2351d) {
            Iterator<b<T>> it = m2554m(this.f2351d, f10).iterator();
            while (it.hasNext()) {
                b<T> next = it.next();
                if (!hashSet.contains(next)) {
                    Collection<b<T>> m8889f = this.f2351d.m8889f(m2552k(next.mo2556a(), pow));
                    if (m8889f.size() == 1) {
                        hashSet2.add(next);
                        hashSet.add(next);
                        hashMap.put(next, Double.valueOf(0.0d));
                    } else {
                        C0530g c0530g = new C0530g(next.f2352a.getPosition());
                        hashSet2.add(c0530g);
                        for (b<T> bVar : m8889f) {
                            Double d10 = (Double) hashMap.get(bVar);
                            Iterator<b<T>> it2 = it;
                            double m2553l = m2553l(bVar.mo2556a(), next.mo2556a());
                            if (d10 != null) {
                                if (d10.doubleValue() < m2553l) {
                                    it = it2;
                                } else {
                                    ((C0530g) hashMap2.get(bVar)).m2564d(bVar.f2352a);
                                }
                            }
                            hashMap.put(bVar, Double.valueOf(m2553l));
                            c0530g.m2563a(bVar.f2352a);
                            hashMap2.put(bVar, c0530g);
                            it = it2;
                        }
                        hashSet.addAll(m8889f);
                        it = it;
                    }
                }
            }
        }
        return hashSet2;
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: c */
    public void mo2547c() {
        synchronized (this.f2351d) {
            this.f2350c.clear();
            this.f2351d.m8885b();
        }
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: d */
    public boolean mo2548d(T t10) {
        boolean remove;
        b<T> bVar = new b<>(t10);
        synchronized (this.f2351d) {
            remove = this.f2350c.remove(bVar);
            if (remove) {
                this.f2351d.m8888e(bVar);
            }
        }
        return remove;
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: g */
    public int mo2549g() {
        return this.f2349b;
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: i */
    public boolean mo2550i(T t10) {
        boolean add;
        b<T> bVar = new b<>(t10);
        synchronized (this.f2351d) {
            add = this.f2350c.add(bVar);
            if (add) {
                this.f2351d.m8884a(bVar);
            }
        }
        return add;
    }

    /* renamed from: k */
    public final C1762a m2552k(C1763b c1763b, double d10) {
        double d11 = d10 / 2.0d;
        double d12 = c1763b.f6519a;
        double d13 = d12 - d11;
        double d14 = d12 + d11;
        double d15 = c1763b.f6520b;
        return new C1762a(d13, d14, d15 - d11, d15 + d11);
    }

    /* renamed from: l */
    public final double m2553l(C1763b c1763b, C1763b c1763b2) {
        double d10 = c1763b.f6519a;
        double d11 = c1763b2.f6519a;
        double d12 = (d10 - d11) * (d10 - d11);
        double d13 = c1763b.f6520b;
        double d14 = c1763b2.f6520b;
        return d12 + ((d13 - d14) * (d13 - d14));
    }

    /* renamed from: m */
    public Collection<b<T>> m2554m(C2214a<b<T>> c2214a, float f10) {
        return this.f2350c;
    }
}
