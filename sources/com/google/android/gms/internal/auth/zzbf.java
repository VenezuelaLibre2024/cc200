package com.google.android.gms.internal.auth;

import android.os.Parcel;
import p366z5.C5993c;

/* loaded from: classes.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            C5993c c5993c = (C5993c) zzc.zza(parcel, C5993c.CREATOR);
            zzc.zzb(parcel);
            zzb(c5993c);
        } else {
            if (i10 != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
