package p353y7;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p354y8.InterfaceC5896b;

/* renamed from: y7.x */
/* loaded from: classes.dex */
public class C5892x<T> implements InterfaceC5896b<Set<T>> {

    /* renamed from: b */
    public volatile Set<T> f21932b = null;

    /* renamed from: a */
    public volatile Set<InterfaceC5896b<T>> f21931a = Collections.newSetFromMap(new ConcurrentHashMap());

    public C5892x(Collection<InterfaceC5896b<T>> collection) {
        this.f21931a.addAll(collection);
    }

    /* renamed from: b */
    public static C5892x<?> m23565b(Collection<InterfaceC5896b<?>> collection) {
        return new C5892x<>((Set) collection);
    }

    /* renamed from: a */
    public synchronized void m23566a(InterfaceC5896b<T> interfaceC5896b) {
        Set set;
        if (this.f21932b == null) {
            set = this.f21931a;
        } else {
            set = this.f21932b;
            interfaceC5896b = (InterfaceC5896b<T>) interfaceC5896b.get();
        }
        set.add(interfaceC5896b);
    }

    @Override // p354y8.InterfaceC5896b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f21932b == null) {
            synchronized (this) {
                if (this.f21932b == null) {
                    this.f21932b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m23568d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f21932b);
    }

    /* renamed from: d */
    public final synchronized void m23568d() {
        Iterator<InterfaceC5896b<T>> it = this.f21931a.iterator();
        while (it.hasNext()) {
            this.f21932b.add(it.next().get());
        }
        this.f21931a = null;
    }
}
