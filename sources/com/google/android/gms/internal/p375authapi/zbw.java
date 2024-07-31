package com.google.android.gms.internal.p375authapi;

import android.os.IBinder;
import android.os.Parcel;
import p096g6.InterfaceC2022g;
import p335x5.C5598b;
import p335x5.C5602d;
import p335x5.C5604e;

/* loaded from: classes.dex */
public final class zbw extends zba {
    public zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, C5598b c5598b) {
        Parcel zba = zba();
        zbc.zbd(zba, zbmVar);
        zbc.zbc(zba, c5598b);
        zbb(1, zba);
    }

    public final void zbd(zbp zbpVar, C5602d c5602d, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, zbpVar);
        zbc.zbc(zba, c5602d);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbr zbrVar, C5604e c5604e) {
        Parcel zba = zba();
        zbc.zbd(zba, zbrVar);
        zbc.zbc(zba, c5604e);
        zbb(3, zba);
    }

    public final void zbf(InterfaceC2022g interfaceC2022g, String str) {
        Parcel zba = zba();
        zbc.zbd(zba, interfaceC2022g);
        zba.writeString(str);
        zbb(2, zba);
    }
}
