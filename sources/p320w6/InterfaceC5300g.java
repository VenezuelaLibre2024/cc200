package p320w6;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;

/* renamed from: w6.g */
/* loaded from: classes.dex */
public interface InterfaceC5300g {
    Task<Location> getLastLocation();

    Task<Void> removeLocationUpdates(AbstractC5312m abstractC5312m);

    Task<Void> requestLocationUpdates(LocationRequest locationRequest, AbstractC5312m abstractC5312m, Looper looper);
}
