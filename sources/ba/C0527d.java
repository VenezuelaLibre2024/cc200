package ba;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p012aa.InterfaceC0080a;
import p012aa.InterfaceC0081b;
import p285u.C4775e;

/* renamed from: ba.d */
/* loaded from: classes.dex */
public class C0527d<T extends InterfaceC0081b> extends AbstractC0524a<T> {

    /* renamed from: b */
    public final InterfaceC0525b<T> f2356b;

    /* renamed from: c */
    public final C4775e<Integer, Set<? extends InterfaceC0080a<T>>> f2357c = new C4775e<>(5);

    /* renamed from: d */
    public final ReadWriteLock f2358d = new ReentrantReadWriteLock();

    /* renamed from: e */
    public final Executor f2359e = Executors.newCachedThreadPool();

    /* renamed from: ba.d$a */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: h */
        public final int f2360h;

        public a(int i10) {
            this.f2360h = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            C0527d.this.m2560l(this.f2360h);
        }
    }

    public C0527d(InterfaceC0525b<T> interfaceC0525b) {
        this.f2356b = interfaceC0525b;
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: b */
    public Set<? extends InterfaceC0080a<T>> mo2546b(float f10) {
        int i10 = (int) f10;
        Set<? extends InterfaceC0080a<T>> m2560l = m2560l(i10);
        int i11 = i10 + 1;
        if (this.f2357c.get(Integer.valueOf(i11)) == null) {
            this.f2359e.execute(new a(i11));
        }
        int i12 = i10 - 1;
        if (this.f2357c.get(Integer.valueOf(i12)) == null) {
            this.f2359e.execute(new a(i12));
        }
        return m2560l;
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: c */
    public void mo2547c() {
        this.f2356b.mo2547c();
        m2559k();
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: d */
    public boolean mo2548d(T t10) {
        boolean mo2548d = this.f2356b.mo2548d(t10);
        if (mo2548d) {
            m2559k();
        }
        return mo2548d;
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: g */
    public int mo2549g() {
        return this.f2356b.mo2549g();
    }

    @Override // ba.InterfaceC0525b
    /* renamed from: i */
    public boolean mo2550i(T t10) {
        boolean mo2550i = this.f2356b.mo2550i(t10);
        if (mo2550i) {
            m2559k();
        }
        return mo2550i;
    }

    /* renamed from: k */
    public final void m2559k() {
        this.f2357c.evictAll();
    }

    /* renamed from: l */
    public final Set<? extends InterfaceC0080a<T>> m2560l(int i10) {
        this.f2358d.readLock().lock();
        Set<? extends InterfaceC0080a<T>> set = this.f2357c.get(Integer.valueOf(i10));
        this.f2358d.readLock().unlock();
        if (set == null) {
            this.f2358d.writeLock().lock();
            set = this.f2357c.get(Integer.valueOf(i10));
            if (set == null) {
                set = this.f2356b.mo2546b(i10);
                this.f2357c.put(Integer.valueOf(i10), set);
            }
            this.f2358d.writeLock().unlock();
        }
        return set;
    }
}
