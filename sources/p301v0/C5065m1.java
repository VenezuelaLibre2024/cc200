package p301v0;

import java.util.List;

/* renamed from: v0.m1 */
/* loaded from: classes.dex */
public class C5065m1 extends RuntimeException {

    /* renamed from: h */
    public final List<String> f19028h;

    public C5065m1(InterfaceC5079r0 interfaceC5079r0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f19028h = null;
    }

    /* renamed from: a */
    public C5031b0 m20373a() {
        return new C5031b0(getMessage());
    }
}
