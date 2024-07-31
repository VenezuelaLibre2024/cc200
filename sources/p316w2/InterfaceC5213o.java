package p316w2;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import p303v2.InterfaceC5101a;

/* renamed from: w2.o */
/* loaded from: classes.dex */
public interface InterfaceC5213o {
    /* renamed from: a */
    default boolean m21097a(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    /* renamed from: b */
    void mo21081b(Activity activity, InterfaceC5221w interfaceC5221w, InterfaceC5101a interfaceC5101a);

    /* renamed from: c */
    boolean mo21082c(int i10, int i11);

    /* renamed from: d */
    void mo21083d(InterfaceC5221w interfaceC5221w, InterfaceC5101a interfaceC5101a);

    /* renamed from: e */
    void mo21084e(InterfaceC5217s interfaceC5217s);

    /* renamed from: f */
    void mo21085f();
}
