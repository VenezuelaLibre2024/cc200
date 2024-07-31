package p097g7;

/* renamed from: g7.i */
/* loaded from: classes.dex */
public final class C2102i implements InterfaceC2110m {

    /* renamed from: c */
    public static final Object f8214c = new Object();

    /* renamed from: a */
    public volatile InterfaceC2110m f8215a;

    /* renamed from: b */
    public volatile Object f8216b = f8214c;

    public C2102i(InterfaceC2110m interfaceC2110m) {
        this.f8215a = interfaceC2110m;
    }

    /* renamed from: b */
    public static InterfaceC2110m m8323b(InterfaceC2110m interfaceC2110m) {
        return interfaceC2110m instanceof C2102i ? interfaceC2110m : new C2102i(interfaceC2110m);
    }

    @Override // p097g7.InterfaceC2110m
    /* renamed from: a */
    public final Object mo5121a() {
        Object obj = this.f8216b;
        Object obj2 = f8214c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f8216b;
                if (obj == obj2) {
                    obj = this.f8215a.mo5121a();
                    Object obj3 = this.f8216b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f8216b = obj;
                    this.f8215a = null;
                }
            }
        }
        return obj;
    }
}
