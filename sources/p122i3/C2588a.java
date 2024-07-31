package p122i3;

import p086fd.InterfaceC1904a;

/* renamed from: i3.a */
/* loaded from: classes.dex */
public final class C2588a<T> implements InterfaceC1904a<T> {

    /* renamed from: c */
    public static final Object f10145c = new Object();

    /* renamed from: a */
    public volatile InterfaceC1904a<T> f10146a;

    /* renamed from: b */
    public volatile Object f10147b = f10145c;

    public C2588a(InterfaceC1904a<T> interfaceC1904a) {
        this.f10146a = interfaceC1904a;
    }

    /* renamed from: a */
    public static <P extends InterfaceC1904a<T>, T> InterfaceC1904a<T> m10351a(P p10) {
        C2591d.m10355b(p10);
        return p10 instanceof C2588a ? p10 : new C2588a(p10);
    }

    /* renamed from: b */
    public static Object m10352b(Object obj, Object obj2) {
        if (!(obj != f10145c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // p086fd.InterfaceC1904a
    public T get() {
        T t10 = (T) this.f10147b;
        Object obj = f10145c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f10147b;
                if (t10 == obj) {
                    t10 = this.f10146a.get();
                    this.f10147b = m10352b(this.f10147b, t10);
                    this.f10146a = null;
                }
            }
        }
        return t10;
    }
}
