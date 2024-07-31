package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p320w6.C5337y0;

/* loaded from: classes.dex */
public final class LocationResult extends AbstractC2601a implements ReflectedParcelable {

    /* renamed from: h */
    public final List f4565h;

    /* renamed from: i */
    public static final List f4564i = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new C5337y0();

    public LocationResult(List list) {
        this.f4565h = list;
    }

    /* renamed from: I */
    public Location m5065I() {
        int size = this.f4565h.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f4565h.get(size - 1);
    }

    /* renamed from: J */
    public List<Location> m5066J() {
        return this.f4565h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f4565h.equals(locationResult.f4565h);
        }
        if (this.f4565h.size() != locationResult.f4565h.size()) {
            return false;
        }
        Iterator it = locationResult.f4565h.iterator();
        for (Location location : this.f4565h) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !C2388q.m9592b(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C2388q.m9593c(this.f4565h);
    }

    public String toString() {
        return "LocationResult".concat(String.valueOf(this.f4565h));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10460J(parcel, 1, m5066J(), false);
        C2603c.m10466b(parcel, m10465a);
    }
}
