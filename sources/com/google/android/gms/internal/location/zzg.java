package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p079f6.InterfaceC1853m;
import p125i6.AbstractC2601a;
import p125i6.C2603c;

/* loaded from: classes.dex */
public final class zzg extends AbstractC2601a implements InterfaceC1853m {
    private final Status zzb;
    public static final zzg zza = new zzg(Status.f4470m);
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();

    public zzg(Status status) {
        this.zzb = status;
    }

    @Override // p079f6.InterfaceC1853m
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int m10465a = C2603c.m10465a(parcel);
        C2603c.m10454D(parcel, 1, this.zzb, i10, false);
        C2603c.m10466b(parcel, m10465a);
    }
}
