package com.google.android.gms.internal.p375authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p335x5.C5607h;

/* loaded from: classes.dex */
public abstract class zbu extends zbb implements zbv {
    public zbu() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p375authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C5607h c5607h = (C5607h) zbc.zba(parcel, C5607h.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c5607h);
        return true;
    }
}
