package com.google.android.gms.internal.location;

import android.os.Parcel;
import p320w6.C5322r;

/* loaded from: classes.dex */
public abstract class zzr extends zzb implements zzs {
    public zzr() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    @Override // com.google.android.gms.internal.location.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        C5322r c5322r = (C5322r) zzc.zza(parcel, C5322r.CREATOR);
        zzc.zzb(parcel);
        zzb(c5322r);
        return true;
    }
}
