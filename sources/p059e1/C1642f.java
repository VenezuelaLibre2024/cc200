package p059e1;

import androidx.lifecycle.AbstractC0343e0;
import sd.InterfaceC4580l;
import td.C4753m;

/* renamed from: e1.f */
/* loaded from: classes.dex */
public final class C1642f<T extends AbstractC0343e0> {

    /* renamed from: a */
    public final Class<T> f6045a;

    /* renamed from: b */
    public final InterfaceC4580l<AbstractC1637a, T> f6046b;

    /* JADX WARN: Multi-variable type inference failed */
    public C1642f(Class<T> cls, InterfaceC4580l<? super AbstractC1637a, ? extends T> interfaceC4580l) {
        C4753m.m18653f(cls, "clazz");
        C4753m.m18653f(interfaceC4580l, "initializer");
        this.f6045a = cls;
        this.f6046b = interfaceC4580l;
    }

    /* renamed from: a */
    public final Class<T> m6519a() {
        return this.f6045a;
    }

    /* renamed from: b */
    public final InterfaceC4580l<AbstractC1637a, T> m6520b() {
        return this.f6046b;
    }
}
