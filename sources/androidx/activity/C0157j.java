package androidx.activity;

import gd.C2245s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import sd.InterfaceC4569a;
import td.C4753m;

/* renamed from: androidx.activity.j */
/* loaded from: classes.dex */
public final class C0157j {

    /* renamed from: a */
    public final Executor f477a;

    /* renamed from: b */
    public final InterfaceC4569a<C2245s> f478b;

    /* renamed from: c */
    public final Object f479c;

    /* renamed from: d */
    public int f480d;

    /* renamed from: e */
    public boolean f481e;

    /* renamed from: f */
    public boolean f482f;

    /* renamed from: g */
    public final List<InterfaceC4569a<C2245s>> f483g;

    /* renamed from: h */
    public final Runnable f484h;

    public C0157j(Executor executor, InterfaceC4569a<C2245s> interfaceC4569a) {
        C4753m.m18653f(executor, "executor");
        C4753m.m18653f(interfaceC4569a, "reportFullyDrawn");
        this.f477a = executor;
        this.f478b = interfaceC4569a;
        this.f479c = new Object();
        this.f483g = new ArrayList();
        this.f484h = new Runnable() { // from class: androidx.activity.i
            @Override // java.lang.Runnable
            public final void run() {
                C0157j.m602d(C0157j.this);
            }
        };
    }

    /* renamed from: d */
    public static final void m602d(C0157j c0157j) {
        C4753m.m18653f(c0157j, "this$0");
        synchronized (c0157j.f479c) {
            c0157j.f481e = false;
            if (c0157j.f480d == 0 && !c0157j.f482f) {
                c0157j.f478b.invoke();
                c0157j.m603b();
            }
            C2245s c2245s = C2245s.f8873a;
        }
    }

    /* renamed from: b */
    public final void m603b() {
        synchronized (this.f479c) {
            this.f482f = true;
            Iterator<T> it = this.f483g.iterator();
            while (it.hasNext()) {
                ((InterfaceC4569a) it.next()).invoke();
            }
            this.f483g.clear();
            C2245s c2245s = C2245s.f8873a;
        }
    }

    /* renamed from: c */
    public final boolean m604c() {
        boolean z10;
        synchronized (this.f479c) {
            z10 = this.f482f;
        }
        return z10;
    }
}
