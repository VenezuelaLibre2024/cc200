package p353y7;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p294u8.C4990a;
import p294u8.InterfaceC4991b;
import p294u8.InterfaceC4992c;
import p294u8.InterfaceC4993d;

/* renamed from: y7.u */
/* loaded from: classes.dex */
public class C5889u implements InterfaceC4993d, InterfaceC4992c {

    /* renamed from: a */
    public final Map<Class<?>, ConcurrentHashMap<InterfaceC4991b<Object>, Executor>> f21925a = new HashMap();

    /* renamed from: b */
    public Queue<C4990a<?>> f21926b = new ArrayDeque();

    /* renamed from: c */
    public final Executor f21927c;

    public C5889u(Executor executor) {
        this.f21927c = executor;
    }

    /* renamed from: h */
    public static /* synthetic */ void m23562h(Map.Entry entry, C4990a c4990a) {
        ((InterfaceC4991b) entry.getKey()).mo8698a(c4990a);
    }

    @Override // p294u8.InterfaceC4993d
    /* renamed from: a */
    public <T> void mo19564a(Class<T> cls, InterfaceC4991b<? super T> interfaceC4991b) {
        mo19565b(cls, this.f21927c, interfaceC4991b);
    }

    @Override // p294u8.InterfaceC4993d
    /* renamed from: b */
    public synchronized <T> void mo19565b(Class<T> cls, Executor executor, InterfaceC4991b<? super T> interfaceC4991b) {
        C5870d0.m23501b(cls);
        C5870d0.m23501b(interfaceC4991b);
        C5870d0.m23501b(executor);
        if (!this.f21925a.containsKey(cls)) {
            this.f21925a.put(cls, new ConcurrentHashMap<>());
        }
        this.f21925a.get(cls).put(interfaceC4991b, executor);
    }

    @Override // p294u8.InterfaceC4992c
    /* renamed from: c */
    public void mo19563c(final C4990a<?> c4990a) {
        C5870d0.m23501b(c4990a);
        synchronized (this) {
            Queue<C4990a<?>> queue = this.f21926b;
            if (queue != null) {
                queue.add(c4990a);
                return;
            }
            for (final Map.Entry<InterfaceC4991b<Object>, Executor> entry : m23564g(c4990a)) {
                entry.getValue().execute(new Runnable() { // from class: y7.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5889u.m23562h(entry, c4990a);
                    }
                });
            }
        }
    }

    @Override // p294u8.InterfaceC4993d
    /* renamed from: d */
    public synchronized <T> void mo19566d(Class<T> cls, InterfaceC4991b<? super T> interfaceC4991b) {
        C5870d0.m23501b(cls);
        C5870d0.m23501b(interfaceC4991b);
        if (this.f21925a.containsKey(cls)) {
            ConcurrentHashMap<InterfaceC4991b<Object>, Executor> concurrentHashMap = this.f21925a.get(cls);
            concurrentHashMap.remove(interfaceC4991b);
            if (concurrentHashMap.isEmpty()) {
                this.f21925a.remove(cls);
            }
        }
    }

    /* renamed from: f */
    public void m23563f() {
        Queue<C4990a<?>> queue;
        synchronized (this) {
            queue = this.f21926b;
            if (queue != null) {
                this.f21926b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<C4990a<?>> it = queue.iterator();
            while (it.hasNext()) {
                mo19563c(it.next());
            }
        }
    }

    /* renamed from: g */
    public final synchronized Set<Map.Entry<InterfaceC4991b<Object>, Executor>> m23564g(C4990a<?> c4990a) {
        ConcurrentHashMap<InterfaceC4991b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f21925a.get(c4990a.m19562b());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }
}
