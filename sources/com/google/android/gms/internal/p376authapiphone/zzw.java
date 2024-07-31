package com.google.android.gms.internal.p376authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p064e6.C1671d;
import p064e6.C1683j;
import p096g6.InterfaceC2014e;
import p096g6.InterfaceC2044m;
import p108h6.AbstractC2361h;
import p108h6.C2352e;

/* loaded from: classes.dex */
public final class zzw extends AbstractC2361h {
    public zzw(Context context, Looper looper, C2352e c2352e, InterfaceC2014e interfaceC2014e, InterfaceC2044m interfaceC2044m) {
        super(context, looper, 126, c2352e, interfaceC2014e, interfaceC2044m);
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final C1671d[] getApiFeatures() {
        return zzac.zze;
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return C1683j.f6269a;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // p108h6.AbstractC2346c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
