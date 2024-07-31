package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import p064e6.C1671d;
import p079f6.C1841a;
import p096g6.C2053p;

/* renamed from: g6.c1 */
/* loaded from: classes.dex */
public final class C2008c1 extends AbstractC2050o {

    /* renamed from: e */
    public final /* synthetic */ C2053p.a f8006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2008c1(C2053p.a aVar, C2034j c2034j, C1671d[] c1671dArr, boolean z10, int i10) {
        super(c2034j, c1671dArr, z10, i10);
        this.f8006e = aVar;
    }

    @Override // p096g6.AbstractC2050o
    /* renamed from: d */
    public final void mo8100d(C1841a.b bVar, TaskCompletionSource<Void> taskCompletionSource) {
        InterfaceC2056q interfaceC2056q;
        interfaceC2056q = this.f8006e.f8121a;
        interfaceC2056q.accept(bVar, taskCompletionSource);
    }
}
