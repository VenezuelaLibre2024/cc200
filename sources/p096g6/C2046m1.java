package p096g6;

import com.google.android.gms.tasks.TaskCompletionSource;
import p064e6.C1671d;
import p079f6.C1841a;
import p096g6.AbstractC2071v;

/* renamed from: g6.m1 */
/* loaded from: classes.dex */
public final class C2046m1 extends AbstractC2071v {

    /* renamed from: d */
    public final /* synthetic */ AbstractC2071v.a f8102d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2046m1(AbstractC2071v.a aVar, C1671d[] c1671dArr, boolean z10, int i10) {
        super(c1671dArr, z10, i10);
        this.f8102d = aVar;
    }

    @Override // p096g6.AbstractC2071v
    /* renamed from: b */
    public final void mo8223b(C1841a.b bVar, TaskCompletionSource taskCompletionSource) {
        InterfaceC2056q interfaceC2056q;
        interfaceC2056q = this.f8102d.f8150a;
        interfaceC2056q.accept(bVar, taskCompletionSource);
    }
}
