package com.google.android.gms.internal.p375authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;

/* loaded from: classes.dex */
public final class zbk extends zba {
    public zbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbj zbjVar, AuthorizationRequest authorizationRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbjVar);
        zbc.zbc(zba, authorizationRequest);
        zbb(1, zba);
    }
}
