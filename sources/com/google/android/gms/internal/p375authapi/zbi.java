package com.google.android.gms.internal.p375authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p335x5.C5596a;

/* loaded from: classes.dex */
public abstract class zbi extends zbb implements zbj {
    public zbi() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p375authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C5596a c5596a = (C5596a) zbc.zba(parcel, C5596a.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c5596a);
        return true;
    }
}
