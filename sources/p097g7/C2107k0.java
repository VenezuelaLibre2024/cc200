package p097g7;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;
import java.util.List;

/* renamed from: g7.k0 */
/* loaded from: classes.dex */
public final class C2107k0 extends AbstractRunnableC2093d0 {

    /* renamed from: h */
    public final /* synthetic */ IBinder f8219h;

    /* renamed from: i */
    public final /* synthetic */ ServiceConnectionC2090c f8220i;

    public C2107k0(ServiceConnectionC2090c serviceConnectionC2090c, IBinder iBinder) {
        this.f8220i = serviceConnectionC2090c;
        this.f8219h = iBinder;
    }

    @Override // p097g7.AbstractRunnableC2093d0
    /* renamed from: b */
    public final void mo5116b() {
        InterfaceC2105j0 interfaceC2105j0;
        List list;
        List list2;
        C2092d c2092d = this.f8220i.f8188h;
        interfaceC2105j0 = c2092d.f8199i;
        c2092d.f8204n = (IInterface) interfaceC2105j0.mo5114a(this.f8219h);
        C2092d.m8310r(this.f8220i.f8188h);
        this.f8220i.f8188h.f8197g = false;
        list = this.f8220i.f8188h.f8194d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        list2 = this.f8220i.f8188h.f8194d;
        list2.clear();
    }
}
