package com.google.android.gms.internal.p375authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p335x5.C5600c;

/* loaded from: classes.dex */
public abstract class zbl extends zbb implements zbm {
    public zbl() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p375authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C5600c c5600c = (C5600c) zbc.zba(parcel, C5600c.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c5600c);
        return true;
    }
}
