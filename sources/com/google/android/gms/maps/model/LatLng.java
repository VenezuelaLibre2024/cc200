package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p367z6.C6031r0;

/* loaded from: classes.dex */
public final class LatLng extends AbstractC2601a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new C6031r0();

    /* renamed from: h */
    public final double f4594h;

    /* renamed from: i */
    public final double f4595i;

    public LatLng(double d10, double d11) {
        this.f4595i = (d11 < -180.0d || d11 >= 180.0d) ? ((((d11 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d : d11;
        this.f4594h = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f4594h) == Double.doubleToLongBits(latLng.f4594h) && Double.doubleToLongBits(this.f4595i) == Double.doubleToLongBits(latLng.f4595i);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f4594h);
        long j10 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f4595i);
        return ((((int) j10) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f4594h + "," + this.f4595i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f4594h;
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10478n(parcel, 2, d10);
        C2603c.m10478n(parcel, 3, this.f4595i);
        C2603c.m10466b(parcel, m10465a);
    }
}
