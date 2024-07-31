package bf;

/* renamed from: bf.g */
/* loaded from: classes2.dex */
public abstract class AbstractC0561g implements InterfaceC0573s {

    /* renamed from: h */
    public final InterfaceC0573s f2514h;

    public AbstractC0561g(InterfaceC0573s interfaceC0573s) {
        if (interfaceC0573s == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f2514h = interfaceC0573s;
    }

    @Override // bf.InterfaceC0573s
    /* renamed from: C0 */
    public void mo2798C0(C0557c c0557c, long j10) {
        this.f2514h.mo2798C0(c0557c, j10);
    }

    @Override // bf.InterfaceC0573s
    /* renamed from: c */
    public C0575u mo2799c() {
        return this.f2514h.mo2799c();
    }

    @Override // bf.InterfaceC0573s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2514h.close();
    }

    @Override // bf.InterfaceC0573s, java.io.Flushable
    public void flush() {
        this.f2514h.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f2514h.toString() + ")";
    }
}
