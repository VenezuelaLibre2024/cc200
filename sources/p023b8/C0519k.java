package p023b8;

import p081f8.C1884m;
import p157k9.InterfaceC3377a;
import p354y8.InterfaceC5895a;
import p354y8.InterfaceC5896b;

/* renamed from: b8.k */
/* loaded from: classes.dex */
public class C0519k {

    /* renamed from: a */
    public final InterfaceC5895a<InterfaceC3377a> f2320a;

    public C0519k(InterfaceC5895a<InterfaceC3377a> interfaceC5895a) {
        this.f2320a = interfaceC5895a;
    }

    /* renamed from: b */
    public static /* synthetic */ void m2501b(C0513e c0513e, InterfaceC5896b interfaceC5896b) {
        ((InterfaceC3377a) interfaceC5896b.get()).m12563a("firebase", c0513e);
        C0515g.m2482f().m2484b("Registering RemoteConfig Rollouts subscriber");
    }

    /* renamed from: c */
    public void m2502c(C1884m c1884m) {
        if (c1884m == null) {
            C0515g.m2482f().m2492k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final C0513e c0513e = new C0513e(c1884m);
            this.f2320a.mo23490a(new InterfaceC5895a.a() { // from class: b8.j
                @Override // p354y8.InterfaceC5895a.a
                /* renamed from: a */
                public final void mo303a(InterfaceC5896b interfaceC5896b) {
                    C0519k.m2501b(C0513e.this, interfaceC5896b);
                }
            });
        }
    }
}
