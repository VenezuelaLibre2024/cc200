package ge;

import java.util.concurrent.CancellationException;
import p038ce.C1101t0;
import p087fe.InterfaceC1907c;

/* renamed from: ge.a */
/* loaded from: classes2.dex */
public final class C2246a extends CancellationException {

    /* renamed from: h */
    public final transient InterfaceC1907c<?> f8874h;

    public C2246a(InterfaceC1907c<?> interfaceC1907c) {
        super("Flow was aborted, no more elements needed");
        this.f8874h = interfaceC1907c;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (C1101t0.m4575c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
