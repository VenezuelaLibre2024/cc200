package p007a5;

import java.util.List;
import p206o5.C3905g0;
import p276t4.C4690b;
import p276t4.C4691c;

/* renamed from: a5.e */
/* loaded from: classes.dex */
public final class C0051e implements InterfaceC0057k {

    /* renamed from: a */
    public final InterfaceC0057k f125a;

    /* renamed from: b */
    public final List<C4691c> f126b;

    public C0051e(InterfaceC0057k interfaceC0057k, List<C4691c> list) {
        this.f125a = interfaceC0057k;
        this.f126b = list;
    }

    @Override // p007a5.InterfaceC0057k
    /* renamed from: a */
    public C3905g0.a<AbstractC0055i> mo177a(C0054h c0054h, C0053g c0053g) {
        return new C4690b(this.f125a.mo177a(c0054h, c0053g), this.f126b);
    }

    @Override // p007a5.InterfaceC0057k
    /* renamed from: b */
    public C3905g0.a<AbstractC0055i> mo178b() {
        return new C4690b(this.f125a.mo178b(), this.f126b);
    }
}
