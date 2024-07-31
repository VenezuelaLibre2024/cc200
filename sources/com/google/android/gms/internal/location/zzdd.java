package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
import p108h6.C2349d;
import p108h6.C2388q;
import p125i6.AbstractC2601a;
import p125i6.C2603c;
import p207o6.C3948q;

@Deprecated
/* loaded from: classes.dex */
public final class zzdd extends AbstractC2601a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzde();
    public LocationRequest zza;

    public zzdd(LocationRequest locationRequest, List list, boolean z10, boolean z11, String str, boolean z12, boolean z13, String str2, long j10) {
        WorkSource workSource;
        LocationRequest.C1178a c1178a = new LocationRequest.C1178a(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C2349d c2349d = (C2349d) it.next();
                    C3948q.m14969a(workSource, c2349d.f9588h, c2349d.f9589i);
                }
            }
            c1178a.m5064m(workSource);
        }
        if (z10) {
            c1178a.m5054c(1);
        }
        if (z11) {
            c1178a.m5063l(2);
        }
        if (str != null) {
            c1178a.m5062k(str);
        } else if (str2 != null) {
            c1178a.m5062k(str2);
        }
        if (z12) {
            c1178a.m5061j(true);
        }
        if (z13) {
            c1178a.m5060i(true);
        }
        if (j10 != Long.MAX_VALUE) {
            c1178a.m5056e(j10);
        }
        this.zza = c1178a.m5052a();
    }

    @Deprecated
    public static zzdd zza(String str, LocationRequest locationRequest) {
        return new zzdd(locationRequest, null, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzdd) {
            return C2388q.m9592b(this.zza, ((zzdd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, this.zza, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
