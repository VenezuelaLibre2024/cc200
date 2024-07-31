package p038ce;

import java.util.concurrent.CancellationException;
import td.C4753m;

/* renamed from: ce.d2 */
/* loaded from: classes2.dex */
public final class C1031d2 extends CancellationException implements InterfaceC1054i0<C1031d2> {

    /* renamed from: h */
    public final transient InterfaceC1026c2 f3985h;

    public C1031d2(String str, Throwable th, InterfaceC1026c2 interfaceC1026c2) {
        super(str);
        this.f3985h = interfaceC1026c2;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // p038ce.InterfaceC1054i0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1031d2 mo4295a() {
        if (!C1101t0.m4575c()) {
            return null;
        }
        String message = getMessage();
        C4753m.m18650c(message);
        return new C1031d2(message, this, this.f3985h);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C1031d2) {
                C1031d2 c1031d2 = (C1031d2) obj;
                if (!C4753m.m18648a(c1031d2.getMessage(), getMessage()) || !C4753m.m18648a(c1031d2.f3985h, this.f3985h) || !C4753m.m18648a(c1031d2.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (C1101t0.m4575c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        C4753m.m18650c(message);
        int hashCode = ((message.hashCode() * 31) + this.f3985h.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f3985h;
    }
}
