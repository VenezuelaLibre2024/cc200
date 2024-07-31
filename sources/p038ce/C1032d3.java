package p038ce;

import java.util.concurrent.CancellationException;

/* renamed from: ce.d3 */
/* loaded from: classes2.dex */
public final class C1032d3 extends CancellationException implements InterfaceC1054i0<C1032d3> {

    /* renamed from: h */
    public final transient InterfaceC1026c2 f3986h;

    public C1032d3(String str) {
        this(str, null);
    }

    public C1032d3(String str, InterfaceC1026c2 interfaceC1026c2) {
        super(str);
        this.f3986h = interfaceC1026c2;
    }

    @Override // p038ce.InterfaceC1054i0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1032d3 mo4295a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        C1032d3 c1032d3 = new C1032d3(message, this.f3986h);
        c1032d3.initCause(this);
        return c1032d3;
    }
}
