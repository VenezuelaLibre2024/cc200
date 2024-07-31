package com.google.android.gms.internal.p375authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import p335x5.C5606g;

/* loaded from: classes.dex */
public final class zbn extends zba {
    public zbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbt zbtVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        Parcel zba = zba();
        zbc.zbd(zba, zbtVar);
        zbc.zbc(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbv zbvVar, C5606g c5606g) {
        Parcel zba = zba();
        zbc.zbd(zba, zbvVar);
        zbc.zbc(zba, c5606g);
        zbb(2, zba);
    }
}
