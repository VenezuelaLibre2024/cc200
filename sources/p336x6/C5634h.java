package p336x6;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import p108h6.C2394s;
import p252r6.BinderC4309d;
import p352y6.InterfaceC5824d;
import p367z6.C6005e0;
import p367z6.C6038v;

/* renamed from: x6.h */
/* loaded from: classes.dex */
public final class C5634h {

    /* renamed from: a */
    public final InterfaceC5824d f21079a;

    public C5634h(InterfaceC5824d interfaceC5824d) {
        this.f21079a = interfaceC5824d;
    }

    /* renamed from: a */
    public LatLng m22676a(Point point) {
        C2394s.m9619l(point);
        try {
            return this.f21079a.mo23436n0(BinderC4309d.m16572g(point));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public C6005e0 m22677b() {
        try {
            return this.f21079a.mo23435d0();
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public Point m22678c(LatLng latLng) {
        C2394s.m9619l(latLng);
        try {
            return (Point) BinderC4309d.m16571e(this.f21079a.mo23434R(latLng));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }
}
