package p353y7;

import p354y8.InterfaceC5896b;

/* renamed from: y7.w */
/* loaded from: classes.dex */
public class C5891w<T> implements InterfaceC5896b<T> {

    /* renamed from: c */
    public static final Object f21928c = new Object();

    /* renamed from: a */
    public volatile Object f21929a = f21928c;

    /* renamed from: b */
    public volatile InterfaceC5896b<T> f21930b;

    public C5891w(InterfaceC5896b<T> interfaceC5896b) {
        this.f21930b = interfaceC5896b;
    }

    @Override // p354y8.InterfaceC5896b
    public T get() {
        T t10 = (T) this.f21929a;
        Object obj = f21928c;
        if (t10 == obj) {
            synchronized (this) {
                t10 = (T) this.f21929a;
                if (t10 == obj) {
                    t10 = this.f21930b.get();
                    this.f21929a = t10;
                    this.f21930b = null;
                }
            }
        }
        return t10;
    }
}
