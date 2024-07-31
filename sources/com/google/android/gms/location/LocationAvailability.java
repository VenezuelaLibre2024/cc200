package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p320w6.C5333w0;
import p320w6.C5338z;

/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractC2601a implements ReflectedParcelable {

    /* renamed from: h */
    public final int f4529h;

    /* renamed from: i */
    public final int f4530i;

    /* renamed from: j */
    public final long f4531j;

    /* renamed from: k */
    public int f4532k;

    /* renamed from: l */
    public final C5338z[] f4533l;

    /* renamed from: m */
    public static final LocationAvailability f4527m = new LocationAvailability(0, 1, 1, 0, null, true);

    /* renamed from: n */
    public static final LocationAvailability f4528n = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C5333w0();

    public LocationAvailability(int i10, int i11, int i12, long j10, C5338z[] c5338zArr, boolean z10) {
        this.f4532k = i10 < 1000 ? 0 : 1000;
        this.f4529h = i11;
        this.f4530i = i12;
        this.f4531j = j10;
        this.f4533l = c5338zArr;
    }

    /* renamed from: I */
    public boolean m5029I() {
        return this.f4532k < 1000;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f4529h == locationAvailability.f4529h && this.f4530i == locationAvailability.f4530i && this.f4531j == locationAvailability.f4531j && this.f4532k == locationAvailability.f4532k && Arrays.equals(this.f4533l, locationAvailability.f4533l)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return C2388q.m9593c(Integer.valueOf(this.f4532k));
    }

    public String toString() {
        return "LocationAvailability[" + m5029I() + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10485u(parcel, 1, this.f4529h);
        C2603c.m10485u(parcel, 2, this.f4530i);
        C2603c.m10489y(parcel, 3, this.f4531j);
        C2603c.m10485u(parcel, 4, this.f4532k);
        C2603c.m10459I(parcel, 5, this.f4533l, i10, false);
        C2603c.m10471g(parcel, 6, m5029I());
        C2603c.m10466b(parcel, m10465a);
    }
}
