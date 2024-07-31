package p353y7;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p209o8.InterfaceC3955a;
import p294u8.InterfaceC4992c;
import p294u8.InterfaceC4993d;
import p353y7.C5882n;
import p354y8.InterfaceC5895a;
import p354y8.InterfaceC5896b;

/* renamed from: y7.n */
/* loaded from: classes.dex */
public class C5882n implements InterfaceC5869d, InterfaceC3955a {

    /* renamed from: i */
    public static final InterfaceC5896b<Set<Object>> f21900i = new InterfaceC5896b() { // from class: y7.m
        @Override // p354y8.InterfaceC5896b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: a */
    public final Map<C5867c<?>, InterfaceC5896b<?>> f21901a;

    /* renamed from: b */
    public final Map<C5872e0<?>, InterfaceC5896b<?>> f21902b;

    /* renamed from: c */
    public final Map<C5872e0<?>, C5892x<?>> f21903c;

    /* renamed from: d */
    public final List<InterfaceC5896b<ComponentRegistrar>> f21904d;

    /* renamed from: e */
    public Set<String> f21905e;

    /* renamed from: f */
    public final C5889u f21906f;

    /* renamed from: g */
    public final AtomicReference<Boolean> f21907g;

    /* renamed from: h */
    public final InterfaceC5877i f21908h;

    /* renamed from: y7.n$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final Executor f21909a;

        /* renamed from: b */
        public final List<InterfaceC5896b<ComponentRegistrar>> f21910b = new ArrayList();

        /* renamed from: c */
        public final List<C5867c<?>> f21911c = new ArrayList();

        /* renamed from: d */
        public InterfaceC5877i f21912d = InterfaceC5877i.f21892a;

        public b(Executor executor) {
            this.f21909a = executor;
        }

        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m23530f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: b */
        public b m23531b(C5867c<?> c5867c) {
            this.f21911c.add(c5867c);
            return this;
        }

        /* renamed from: c */
        public b m23532c(final ComponentRegistrar componentRegistrar) {
            this.f21910b.add(new InterfaceC5896b() { // from class: y7.o
                @Override // p354y8.InterfaceC5896b
                public final Object get() {
                    ComponentRegistrar m23530f;
                    m23530f = C5882n.b.m23530f(ComponentRegistrar.this);
                    return m23530f;
                }
            });
            return this;
        }

        /* renamed from: d */
        public b m23533d(Collection<InterfaceC5896b<ComponentRegistrar>> collection) {
            this.f21910b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C5882n m23534e() {
            return new C5882n(this.f21909a, this.f21910b, this.f21911c, this.f21912d);
        }

        /* renamed from: g */
        public b m23535g(InterfaceC5877i interfaceC5877i) {
            this.f21912d = interfaceC5877i;
            return this;
        }
    }

    public C5882n(Executor executor, Iterable<InterfaceC5896b<ComponentRegistrar>> iterable, Collection<C5867c<?>> collection, InterfaceC5877i interfaceC5877i) {
        this.f21901a = new HashMap();
        this.f21902b = new HashMap();
        this.f21903c = new HashMap();
        this.f21905e = new HashSet();
        this.f21907g = new AtomicReference<>();
        C5889u c5889u = new C5889u(executor);
        this.f21906f = c5889u;
        this.f21908h = interfaceC5877i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C5867c.m23462s(c5889u, C5889u.class, InterfaceC4993d.class, InterfaceC4992c.class));
        arrayList.add(C5867c.m23462s(this, InterfaceC3955a.class, new Class[0]));
        for (C5867c<?> c5867c : collection) {
            if (c5867c != null) {
                arrayList.add(c5867c);
            }
        }
        this.f21904d = m23518p(iterable);
        m23522m(arrayList);
    }

    /* renamed from: l */
    public static b m23517l(Executor executor) {
        return new b(executor);
    }

    /* renamed from: p */
    public static <T> List<T> m23518p(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m23519q(C5867c c5867c) {
        return c5867c.m23464h().mo319a(new C5874f0(c5867c, this));
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: b */
    public synchronized <T> InterfaceC5896b<T> mo23493b(C5872e0<T> c5872e0) {
        C5870d0.m23502c(c5872e0, "Null interface requested.");
        return (InterfaceC5896b) this.f21902b.get(c5872e0);
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: e */
    public synchronized <T> InterfaceC5896b<Set<T>> mo23496e(C5872e0<T> c5872e0) {
        C5892x<?> c5892x = this.f21903c.get(c5872e0);
        if (c5892x != null) {
            return c5892x;
        }
        return (InterfaceC5896b<Set<T>>) f21900i;
    }

    @Override // p353y7.InterfaceC5869d
    /* renamed from: h */
    public <T> InterfaceC5895a<T> mo23499h(C5872e0<T> c5872e0) {
        InterfaceC5896b<T> mo23493b = mo23493b(c5872e0);
        return mo23493b == null ? C5868c0.m23485e() : mo23493b instanceof C5868c0 ? (C5868c0) mo23493b : C5868c0.m23489i(mo23493b);
    }

    /* renamed from: m */
    public final void m23522m(List<C5867c<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC5896b<ComponentRegistrar>> it = this.f21904d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f21908h.mo18603a(componentRegistrar));
                        it.remove();
                    }
                } catch (C5890v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator<C5867c<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().m23466j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f21905e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f21905e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f21901a.isEmpty()) {
                C5884p.m23536a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f21901a.keySet());
                arrayList2.addAll(list);
                C5884p.m23536a(arrayList2);
            }
            for (final C5867c<?> c5867c : list) {
                this.f21901a.put(c5867c, new C5891w(new InterfaceC5896b() { // from class: y7.l
                    @Override // p354y8.InterfaceC5896b
                    public final Object get() {
                        Object m23519q;
                        m23519q = C5882n.this.m23519q(c5867c);
                        return m23519q;
                    }
                }));
            }
            arrayList.addAll(m23527v(list));
            arrayList.addAll(m23528w());
            m23526u();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        m23525t();
    }

    /* renamed from: n */
    public final void m23523n(Map<C5867c<?>, InterfaceC5896b<?>> map, boolean z10) {
        for (Map.Entry<C5867c<?>, InterfaceC5896b<?>> entry : map.entrySet()) {
            C5867c<?> key = entry.getKey();
            InterfaceC5896b<?> value = entry.getValue();
            if (key.m23468n() || (key.m23469o() && z10)) {
                value.get();
            }
        }
        this.f21906f.m23563f();
    }

    /* renamed from: o */
    public void m23524o(boolean z10) {
        HashMap hashMap;
        if (this.f21907g.compareAndSet(null, Boolean.valueOf(z10))) {
            synchronized (this) {
                hashMap = new HashMap(this.f21901a);
            }
            m23523n(hashMap, z10);
        }
    }

    /* renamed from: t */
    public final void m23525t() {
        Boolean bool = this.f21907g.get();
        if (bool != null) {
            m23523n(this.f21901a, bool.booleanValue());
        }
    }

    /* renamed from: u */
    public final void m23526u() {
        Map map;
        C5872e0<?> m23556c;
        InterfaceC5896b m23485e;
        for (C5867c<?> c5867c : this.f21901a.keySet()) {
            for (C5885q c5885q : c5867c.m23463g()) {
                if (c5885q.m23560g() && !this.f21903c.containsKey(c5885q.m23556c())) {
                    map = this.f21903c;
                    m23556c = c5885q.m23556c();
                    m23485e = C5892x.m23565b(Collections.emptySet());
                } else if (this.f21902b.containsKey(c5885q.m23556c())) {
                    continue;
                } else {
                    if (c5885q.m23559f()) {
                        throw new C5893y(String.format("Unsatisfied dependency for component %s: %s", c5867c, c5885q.m23556c()));
                    }
                    if (!c5885q.m23560g()) {
                        map = this.f21902b;
                        m23556c = c5885q.m23556c();
                        m23485e = C5868c0.m23485e();
                    }
                }
                map.put(m23556c, m23485e);
            }
        }
    }

    /* renamed from: v */
    public final List<Runnable> m23527v(List<C5867c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C5867c<?> c5867c : list) {
            if (c5867c.m23470p()) {
                final InterfaceC5896b<?> interfaceC5896b = this.f21901a.get(c5867c);
                for (C5872e0<? super Object> c5872e0 : c5867c.m23466j()) {
                    if (this.f21902b.containsKey(c5872e0)) {
                        final C5868c0 c5868c0 = (C5868c0) this.f21902b.get(c5872e0);
                        arrayList.add(new Runnable() { // from class: y7.k
                            @Override // java.lang.Runnable
                            public final void run() {
                                C5868c0.this.m23491j(interfaceC5896b);
                            }
                        });
                    } else {
                        this.f21902b.put(c5872e0, interfaceC5896b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    public final List<Runnable> m23528w() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C5867c<?>, InterfaceC5896b<?>> entry : this.f21901a.entrySet()) {
            C5867c<?> key = entry.getKey();
            if (!key.m23470p()) {
                InterfaceC5896b<?> value = entry.getValue();
                for (C5872e0<? super Object> c5872e0 : key.m23466j()) {
                    if (!hashMap.containsKey(c5872e0)) {
                        hashMap.put(c5872e0, new HashSet());
                    }
                    ((Set) hashMap.get(c5872e0)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f21903c.containsKey(entry2.getKey())) {
                final C5892x<?> c5892x = this.f21903c.get(entry2.getKey());
                for (final InterfaceC5896b interfaceC5896b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: y7.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            C5892x.this.m23566a(interfaceC5896b);
                        }
                    });
                }
            } else {
                this.f21903c.put((C5872e0) entry2.getKey(), C5892x.m23565b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }
}
