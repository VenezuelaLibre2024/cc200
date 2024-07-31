package gd;

import java.io.Serializable;
import sd.InterfaceC4569a;
import td.C4747g;
import td.C4753m;

/* renamed from: gd.m */
/* loaded from: classes2.dex */
public final class C2239m<T> implements InterfaceC2233g<T>, Serializable {

    /* renamed from: h */
    public InterfaceC4569a<? extends T> f8868h;

    /* renamed from: i */
    public volatile Object f8869i;

    /* renamed from: j */
    public final Object f8870j;

    public C2239m(InterfaceC4569a<? extends T> interfaceC4569a, Object obj) {
        C4753m.m18653f(interfaceC4569a, "initializer");
        this.f8868h = interfaceC4569a;
        this.f8869i = C2243q.f8872a;
        this.f8870j = obj == null ? this : obj;
    }

    public /* synthetic */ C2239m(InterfaceC4569a interfaceC4569a, Object obj, int i10, C4747g c4747g) {
        this(interfaceC4569a, (i10 & 2) != 0 ? null : obj);
    }

    /* renamed from: a */
    public boolean m8976a() {
        return this.f8869i != C2243q.f8872a;
    }

    @Override // gd.InterfaceC2233g
    public T getValue() {
        T t10;
        T t11 = (T) this.f8869i;
        C2243q c2243q = C2243q.f8872a;
        if (t11 != c2243q) {
            return t11;
        }
        synchronized (this.f8870j) {
            t10 = (T) this.f8869i;
            if (t10 == c2243q) {
                InterfaceC4569a<? extends T> interfaceC4569a = this.f8868h;
                C4753m.m18650c(interfaceC4569a);
                t10 = interfaceC4569a.invoke();
                this.f8869i = t10;
                this.f8868h = null;
            }
        }
        return t10;
    }

    public String toString() {
        return m8976a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
