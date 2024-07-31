package p116he;

import p146jd.InterfaceC3284g;

/* renamed from: he.k */
/* loaded from: classes2.dex */
public final class C2535k extends RuntimeException {

    /* renamed from: h */
    public final transient InterfaceC3284g f9972h;

    public C2535k(InterfaceC3284g interfaceC3284g) {
        this.f9972h = interfaceC3284g;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f9972h.toString();
    }
}
