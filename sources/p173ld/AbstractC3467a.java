package p173ld;

import gd.C2237k;
import gd.C2238l;
import gd.C2245s;
import java.io.Serializable;
import p146jd.InterfaceC3281d;
import p161kd.C3385c;
import td.C4753m;

/* renamed from: ld.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3467a implements InterfaceC3281d<Object>, InterfaceC3471e, Serializable {
    private final InterfaceC3281d<Object> completion;

    public AbstractC3467a(InterfaceC3281d<Object> interfaceC3281d) {
        this.completion = interfaceC3281d;
    }

    public InterfaceC3281d<C2245s> create(Object obj, InterfaceC3281d<?> interfaceC3281d) {
        C4753m.m18653f(interfaceC3281d, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public InterfaceC3281d<C2245s> create(InterfaceC3281d<?> interfaceC3281d) {
        C4753m.m18653f(interfaceC3281d, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC3471e getCallerFrame() {
        InterfaceC3281d<Object> interfaceC3281d = this.completion;
        if (interfaceC3281d instanceof InterfaceC3471e) {
            return (InterfaceC3471e) interfaceC3281d;
        }
        return null;
    }

    public final InterfaceC3281d<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return C3473g.m12924d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p146jd.InterfaceC3281d
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        InterfaceC3281d interfaceC3281d = this;
        while (true) {
            C3474h.m12926b(interfaceC3281d);
            AbstractC3467a abstractC3467a = (AbstractC3467a) interfaceC3281d;
            InterfaceC3281d interfaceC3281d2 = abstractC3467a.completion;
            C4753m.m18650c(interfaceC3281d2);
            try {
                invokeSuspend = abstractC3467a.invokeSuspend(obj);
            } catch (Throwable th) {
                C2237k.a aVar = C2237k.f8865i;
                obj = C2237k.m8966b(C2238l.m8974a(th));
            }
            if (invokeSuspend == C3385c.m12581c()) {
                return;
            }
            C2237k.a aVar2 = C2237k.f8865i;
            obj = C2237k.m8966b(invokeSuspend);
            abstractC3467a.releaseIntercepted();
            if (!(interfaceC3281d2 instanceof AbstractC3467a)) {
                interfaceC3281d2.resumeWith(obj);
                return;
            }
            interfaceC3281d = interfaceC3281d2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }
}
