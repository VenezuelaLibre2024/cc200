package p034c7;

import p170l7.InterfaceC3442c;

/* renamed from: c7.h8 */
/* loaded from: classes.dex */
public final class C0727h8 implements InterfaceC3442c<Object> {

    /* renamed from: a */
    public final /* synthetic */ C0856qb f3025a;

    /* renamed from: b */
    public final /* synthetic */ C0936w7 f3026b;

    public C0727h8(C0936w7 c0936w7, C0856qb c0856qb) {
        this.f3025a = c0856qb;
        this.f3026b = c0936w7;
    }

    @Override // p170l7.InterfaceC3442c
    /* renamed from: a */
    public final void mo3296a(Throwable th) {
        this.f3026b.mo3099i();
        this.f3026b.f3703i = false;
        this.f3026b.m3980o0();
        this.f3026b.zzj().m3914B().m3996b("registerTriggerAsync failed with throwable", th);
    }

    @Override // p170l7.InterfaceC3442c
    public final void onSuccess(Object obj) {
        this.f3026b.mo3099i();
        this.f3026b.f3703i = false;
        this.f3026b.m3980o0();
        this.f3026b.zzj().m3913A().m3996b("registerTriggerAsync ran. uri", this.f3025a.f3485h);
    }
}
