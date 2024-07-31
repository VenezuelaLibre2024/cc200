package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import p079f6.C1841a;
import p096g6.C2034j;
import p096g6.C2053p;

/* renamed from: g6.d1 */
/* loaded from: classes.dex */
public final class C2012d1 extends AbstractC2077x {

    /* renamed from: b */
    public final /* synthetic */ C2053p.a f8012b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2012d1(C2053p.a aVar, C2034j.a aVar2) {
        super(aVar2);
        this.f8012b = aVar;
    }

    @Override // p096g6.AbstractC2077x
    /* renamed from: b */
    public final void mo8107b(C1841a.b bVar, TaskCompletionSource<Boolean> taskCompletionSource) {
        InterfaceC2056q interfaceC2056q;
        interfaceC2056q = this.f8012b.f8122b;
        interfaceC2056q.accept(bVar, taskCompletionSource);
    }
}
