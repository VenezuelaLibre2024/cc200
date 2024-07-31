package p238q7;

import android.os.Bundle;
import p022b7.C0508a;
import p224p7.InterfaceC4059a;

/* renamed from: q7.c */
/* loaded from: classes.dex */
public final class C4198c implements C0508a.a {

    /* renamed from: a */
    public final /* synthetic */ C4199d f15155a;

    public C4198c(C4199d c4199d) {
        this.f15155a = c4199d;
    }

    @Override // p034c7.InterfaceC0866r7
    /* renamed from: a */
    public final void mo3818a(String str, String str2, Bundle bundle, long j10) {
        InterfaceC4059a.b bVar;
        if (this.f15155a.f15156a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", C4196a.m16185a(str2));
            bVar = this.f15155a.f15157b;
            bVar.mo315a(2, bundle2);
        }
    }
}
