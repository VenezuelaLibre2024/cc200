package p238q7;

import android.os.Bundle;
import p022b7.C0508a;
import p224p7.InterfaceC4059a;

/* renamed from: q7.e */
/* loaded from: classes.dex */
public final class C4200e implements C0508a.a {

    /* renamed from: a */
    public final /* synthetic */ C4201f f15160a;

    public C4200e(C4201f c4201f) {
        this.f15160a = c4201f;
    }

    @Override // p034c7.InterfaceC0866r7
    /* renamed from: a */
    public final void mo3818a(String str, String str2, Bundle bundle, long j10) {
        InterfaceC4059a.b bVar;
        if (str == null || !C4196a.m16190f(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        bVar = this.f15160a.f15161a;
        bVar.mo315a(3, bundle2);
    }
}
