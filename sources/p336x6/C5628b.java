package p336x6;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import p108h6.C2394s;
import p352y6.InterfaceC5818a;
import p367z6.C6038v;

/* renamed from: x6.b */
/* loaded from: classes.dex */
public final class C5628b {

    /* renamed from: a */
    public static InterfaceC5818a f21067a;

    /* renamed from: a */
    public static C5626a m22615a(CameraPosition cameraPosition) {
        C2394s.m9620m(cameraPosition, "cameraPosition must not be null");
        try {
            return new C5626a(m22626l().mo23385Q0(cameraPosition));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: b */
    public static C5626a m22616b(LatLng latLng) {
        C2394s.m9620m(latLng, "latLng must not be null");
        try {
            return new C5626a(m22626l().mo23384O(latLng));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: c */
    public static C5626a m22617c(LatLngBounds latLngBounds, int i10) {
        C2394s.m9620m(latLngBounds, "bounds must not be null");
        try {
            return new C5626a(m22626l().mo23386h(latLngBounds, i10));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: d */
    public static C5626a m22618d(LatLng latLng, float f10) {
        C2394s.m9620m(latLng, "latLng must not be null");
        try {
            return new C5626a(m22626l().mo23389s1(latLng, f10));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: e */
    public static C5626a m22619e(float f10, float f11) {
        try {
            return new C5626a(m22626l().mo23390u1(f10, f11));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: f */
    public static C5626a m22620f(float f10) {
        try {
            return new C5626a(m22626l().zoomBy(f10));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: g */
    public static C5626a m22621g(float f10, Point point) {
        C2394s.m9620m(point, "focus must not be null");
        try {
            return new C5626a(m22626l().mo23388r0(f10, point.x, point.y));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: h */
    public static C5626a m22622h() {
        try {
            return new C5626a(m22626l().zoomIn());
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: i */
    public static C5626a m22623i() {
        try {
            return new C5626a(m22626l().zoomOut());
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: j */
    public static C5626a m22624j(float f10) {
        try {
            return new C5626a(m22626l().mo23387n1(f10));
        } catch (RemoteException e10) {
            throw new C6038v(e10);
        }
    }

    /* renamed from: k */
    public static void m22625k(InterfaceC5818a interfaceC5818a) {
        f21067a = (InterfaceC5818a) C2394s.m9619l(interfaceC5818a);
    }

    /* renamed from: l */
    public static InterfaceC5818a m22626l() {
        return (InterfaceC5818a) C2394s.m9620m(f21067a, "CameraUpdateFactory is not initialized");
    }
}
