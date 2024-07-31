package bf;

/* renamed from: bf.h */
/* loaded from: classes2.dex */
public abstract class AbstractC0562h implements InterfaceC0574t {

    /* renamed from: h */
    public final InterfaceC0574t f2515h;

    public AbstractC0562h(InterfaceC0574t interfaceC0574t) {
        if (interfaceC0574t == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2515h = interfaceC0574t;
    }

    /* renamed from: a */
    public final InterfaceC0574t m2877a() {
        return this.f2515h;
    }

    @Override // bf.InterfaceC0574t
    /* renamed from: c */
    public C0575u mo2801c() {
        return this.f2515h.mo2801c();
    }

    @Override // bf.InterfaceC0574t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2515h.close();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2515h.toString() + ")";
    }
}
