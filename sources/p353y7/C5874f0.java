package p353y7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p294u8.C4990a;
import p294u8.InterfaceC4992c;
import p354y8.InterfaceC5895a;
import p354y8.InterfaceC5896b;

/* renamed from: y7.f0 */
/* loaded from: classes.dex */
public final class C5874f0 implements InterfaceC5869d {

    /* renamed from: a */
    public final Set<C5872e0<?>> f21882a;

    /* renamed from: b */
    public final Set<C5872e0<?>> f21883b;

    /* renamed from: c */
    public final Set<C5872e0<?>> f21884c;

    /* renamed from: d */
    public final Set<C5872e0<?>> f21885d;

    /* renamed from: e */
    public final Set<C5872e0<?>> f21886e;

    /* renamed from: f */
    public final Set<Class<?>> f21887f;

    /* renamed from: g */
    public final InterfaceC5869d f21888g;

    /* renamed from: y7.f0$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC4992c {

        /* renamed from: a */
        public final Set<Class<?>> f21889a;

        /* renamed from: b */
        public final InterfaceC4992c f21890b;

        public a(Set<Class<?>> set, InterfaceC4992c interfaceC4992c) {
            this.f21889a = set;
            this.f21890b = interfaceC4992c;
        }

        @Override // p294u8.InterfaceC4992c
        /* renamed from: c */
        public void mo19563c(C4990a<?> c4990a) {
            if (!this.f21889a.contains(c4990a.m19562b())) {
                throw new C5887s(String.format("Attempting to publish an undeclared event %s.", c4990a));
            }
            this.f21890b.mo19563c(c4990a);
        }
    }

    public C5874f0(C5867c<?> c5867c, InterfaceC5869d interfaceC5869d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C5885q c5885q : c5867c.m23463g()) {
            if (c5885q.m23558e()) {
                boolean m23560g = c5885q.m23560g();
                C5872e0<?> m23556c = c5885q.m23556c();
                if (m23560g) {
                    hashSet4.add(m23556c);
                } else {
                    hashSet.add(m23556c);
                }
            } else if (c5885q.m23557d()) {
                hashSet3.add(c5885q.m23556c());
            } else {
                boolean m23560g2 = c5885q.m23560g();
                C5872e0<?> m23556c2 = c5885q.m23556c();
                if (m23560g2) {
                    hashSet5.add(m23556c2);
                } else {
                    hashSet2.add(m23556c2);
                }
            }
        }
        if (!c5867c.m23467k().isEmpty()) {
            hashSet.add(C5872e0.m23505b(InterfaceC4992c.class));
        }
        this.f21882a = Collections.unmodifiableSet(hashSet);
        this.f21883b = Collections.unmodifiableSet(hashSet2);
        this.f21884c = Collections.unmodifiableSet(hashSet3);
        this.f21885d = Collections.unmodifiableSet(hashSet4);
        this.f21886e = Collections.unmodifiableSet(hashSet5);
        this.f21887f = c5867c.m23467k();
        this.f21888g = interfaceC5869d;
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: a */
    public <T> T mo23492a(C5872e0<T> c5872e0) {
        if (this.f21882a.contains(c5872e0)) {
            return (T) this.f21888g.mo23492a(c5872e0);
        }
        throw new C5887s(String.format("Attempting to request an undeclared dependency %s.", c5872e0));
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: b */
    public <T> InterfaceC5896b<T> mo23493b(C5872e0<T> c5872e0) {
        if (this.f21883b.contains(c5872e0)) {
            return this.f21888g.mo23493b(c5872e0);
        }
        throw new C5887s(String.format("Attempting to request an undeclared dependency Provider<%s>.", c5872e0));
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: c */
    public <T> InterfaceC5896b<T> mo23494c(Class<T> cls) {
        return mo23493b(C5872e0.m23505b(cls));
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: d */
    public <T> Set<T> mo23495d(C5872e0<T> c5872e0) {
        if (this.f21885d.contains(c5872e0)) {
            return this.f21888g.mo23495d(c5872e0);
        }
        throw new C5887s(String.format("Attempting to request an undeclared dependency Set<%s>.", c5872e0));
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: e */
    public <T> InterfaceC5896b<Set<T>> mo23496e(C5872e0<T> c5872e0) {
        if (this.f21886e.contains(c5872e0)) {
            return this.f21888g.mo23496e(c5872e0);
        }
        throw new C5887s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", c5872e0));
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: g */
    public <T> InterfaceC5895a<T> mo23498g(Class<T> cls) {
        return mo23499h(C5872e0.m23505b(cls));
    }

    @Override // p353y7.InterfaceC5869d
    public <T> T get(Class<T> cls) {
        if (!this.f21882a.contains(C5872e0.m23505b(cls))) {
            throw new C5887s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t10 = (T) this.f21888g.get(cls);
        return !cls.equals(InterfaceC4992c.class) ? t10 : (T) new a(this.f21887f, (InterfaceC4992c) t10);
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: h */
    public <T> InterfaceC5895a<T> mo23499h(C5872e0<T> c5872e0) {
        if (this.f21884c.contains(c5872e0)) {
            return this.f21888g.mo23499h(c5872e0);
        }
        throw new C5887s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", c5872e0));
    }
}
