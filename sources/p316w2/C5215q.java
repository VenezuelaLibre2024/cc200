package p316w2;

import android.location.Location;
import android.os.Build;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w2.q */
/* loaded from: classes.dex */
public class C5215q {
    /* renamed from: a */
    public static boolean m21101a(Location location) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return location.isMock();
        }
        if (i10 >= 18) {
            return location.isFromMockProvider();
        }
        return false;
    }

    /* renamed from: b */
    public static Map<String, Object> m21102b(Location location) {
        if (location == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("latitude", Double.valueOf(location.getLatitude()));
        hashMap.put("longitude", Double.valueOf(location.getLongitude()));
        hashMap.put(Constants.TIMESTAMP, Long.valueOf(location.getTime()));
        hashMap.put("is_mocked", Boolean.valueOf(m21101a(location)));
        if (location.hasAltitude()) {
            hashMap.put("altitude", Double.valueOf(location.getAltitude()));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && location.hasVerticalAccuracy()) {
            hashMap.put("altitude_accuracy", Float.valueOf(location.getVerticalAccuracyMeters()));
        }
        if (location.hasAccuracy()) {
            hashMap.put("accuracy", Double.valueOf(location.getAccuracy()));
        }
        if (location.hasBearing()) {
            hashMap.put("heading", Double.valueOf(location.getBearing()));
        }
        if (i10 >= 26 && location.hasBearingAccuracy()) {
            hashMap.put("heading_accuracy", Float.valueOf(location.getBearingAccuracyDegrees()));
        }
        if (location.hasSpeed()) {
            hashMap.put("speed", Double.valueOf(location.getSpeed()));
        }
        if (i10 >= 26 && location.hasSpeedAccuracy()) {
            hashMap.put("speed_accuracy", Double.valueOf(location.getSpeedAccuracyMetersPerSecond()));
        }
        if (location.getExtras() != null && location.getExtras().containsKey("geolocator_mslAltitude")) {
            hashMap.put("altitude", Double.valueOf(location.getExtras().getDouble("geolocator_mslAltitude")));
        }
        return hashMap;
    }
}
