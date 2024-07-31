package p042d0;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* renamed from: d0.a */
/* loaded from: classes.dex */
public interface InterfaceC1509a extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i10) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(List<Location> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            onLocationChanged(list.get(i10));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(String str, int i10, Bundle bundle) {
    }
}
