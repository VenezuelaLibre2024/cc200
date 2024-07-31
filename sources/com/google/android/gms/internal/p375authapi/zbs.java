package com.google.android.gms.internal.p375authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p335x5.C5605f;

/* loaded from: classes.dex */
public abstract class zbs extends zbb implements zbt {
    public zbs() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p375authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C5605f c5605f = (C5605f) zbc.zba(parcel, C5605f.CREATOR);
        zbc.zbb(parcel);
        zbb(status, c5605f);
        return true;
    }
}
