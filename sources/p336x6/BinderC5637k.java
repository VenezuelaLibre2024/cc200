package p336x6;

import com.google.android.gms.maps.model.LatLng;
import p336x6.C5629c;
import p352y6.AbstractBinderC5842m;

/* renamed from: x6.k */
/* loaded from: classes.dex */
public final class BinderC5637k extends AbstractBinderC5842m {

    /* renamed from: a */
    public final /* synthetic */ C5629c.i f21082a;

    public BinderC5637k(C5629c c5629c, C5629c.i iVar) {
        this.f21082a = iVar;
    }

    @Override // p352y6.InterfaceC5844n
    /* renamed from: d */
    public final void mo22696d(LatLng latLng) {
        this.f21082a.onMapLongClick(latLng);
    }
}
