package re;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p079f6.C1841a;
import re.C4347a0;
import se.C4596e;

/* renamed from: re.o */
/* loaded from: classes2.dex */
public final class C4367o {

    /* renamed from: c */
    public Runnable f15954c;

    /* renamed from: d */
    public ExecutorService f15955d;

    /* renamed from: a */
    public int f15952a = 64;

    /* renamed from: b */
    public int f15953b = 5;

    /* renamed from: e */
    public final Deque<C4347a0.a> f15956e = new ArrayDeque();

    /* renamed from: f */
    public final Deque<C4347a0.a> f15957f = new ArrayDeque();

    /* renamed from: g */
    public final Deque<C4347a0> f15958g = new ArrayDeque();

    /* renamed from: a */
    public synchronized void m16783a() {
        Iterator<C4347a0.a> it = this.f15956e.iterator();
        while (it.hasNext()) {
            it.next().m16657n().m16647c();
        }
        Iterator<C4347a0.a> it2 = this.f15957f.iterator();
        while (it2.hasNext()) {
            it2.next().m16657n().m16647c();
        }
        Iterator<C4347a0> it3 = this.f15958g.iterator();
        while (it3.hasNext()) {
            it3.next().m16647c();
        }
    }

    /* renamed from: b */
    public synchronized void m16784b(C4347a0 c4347a0) {
        this.f15958g.add(c4347a0);
    }

    /* renamed from: c */
    public synchronized ExecutorService m16785c() {
        if (this.f15955d == null) {
            this.f15955d = new ThreadPoolExecutor(0, C1841a.e.API_PRIORITY_OTHER, 60L, TimeUnit.SECONDS, new SynchronousQueue(), C4596e.m18088H("OkHttp Dispatcher", false));
        }
        return this.f15955d;
    }

    /* renamed from: d */
    public final <T> void m16786d(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.f15954c;
        }
        if (m16789g() || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* renamed from: e */
    public void m16787e(C4347a0.a aVar) {
        aVar.m16655l().decrementAndGet();
        m16786d(this.f15957f, aVar);
    }

    /* renamed from: f */
    public void m16788f(C4347a0 c4347a0) {
        m16786d(this.f15958g, c4347a0);
    }

    /* renamed from: g */
    public final boolean m16789g() {
        int i10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<C4347a0.a> it = this.f15956e.iterator();
            while (it.hasNext()) {
                C4347a0.a next = it.next();
                if (this.f15957f.size() >= this.f15952a) {
                    break;
                }
                if (next.m16655l().get() < this.f15953b) {
                    it.remove();
                    next.m16655l().incrementAndGet();
                    arrayList.add(next);
                    this.f15957f.add(next);
                }
            }
            z10 = m16790h() > 0;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((C4347a0.a) arrayList.get(i10)).m16656m(m16785c());
        }
        return z10;
    }

    /* renamed from: h */
    public synchronized int m16790h() {
        return this.f15957f.size() + this.f15958g.size();
    }
}
