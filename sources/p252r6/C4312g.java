package p252r6;

import android.os.Bundle;

/* renamed from: r6.g */
/* loaded from: classes.dex */
public final class C4312g implements InterfaceC4316k {

    /* renamed from: a */
    public final /* synthetic */ Bundle f15637a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC4306a f15638b;

    public C4312g(AbstractC4306a abstractC4306a, Bundle bundle) {
        this.f15638b = abstractC4306a;
        this.f15637a = bundle;
    }

    @Override // p252r6.InterfaceC4316k
    /* renamed from: a */
    public final int mo16574a() {
        return 1;
    }

    @Override // p252r6.InterfaceC4316k
    /* renamed from: b */
    public final void mo16575b(InterfaceC4308c interfaceC4308c) {
        InterfaceC4308c interfaceC4308c2;
        interfaceC4308c2 = this.f15638b.f15631a;
        interfaceC4308c2.onCreate(this.f15637a);
    }
}
