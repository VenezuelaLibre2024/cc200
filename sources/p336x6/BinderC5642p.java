package p336x6;

import com.google.android.gms.internal.maps.zzad;
import p336x6.C5629c;
import p352y6.AbstractBinderC5854s;
import p367z6.C6020m;

/* renamed from: x6.p */
/* loaded from: classes.dex */
public final class BinderC5642p extends AbstractBinderC5854s {

    /* renamed from: a */
    public final /* synthetic */ C5629c.k f21092a;

    public BinderC5642p(C5629c c5629c, C5629c.k kVar) {
        this.f21092a = kVar;
    }

    @Override // p352y6.InterfaceC5856t
    /* renamed from: Z0 */
    public final void mo22701Z0(zzad zzadVar) {
        this.f21092a.onMarkerDragStart(new C6020m(zzadVar));
    }

    @Override // p352y6.InterfaceC5856t
    /* renamed from: a */
    public final void mo22702a(zzad zzadVar) {
        this.f21092a.onMarkerDrag(new C6020m(zzadVar));
    }

    @Override // p352y6.InterfaceC5856t
    /* renamed from: b */
    public final void mo22703b(zzad zzadVar) {
        this.f21092a.onMarkerDragEnd(new C6020m(zzadVar));
    }
}
