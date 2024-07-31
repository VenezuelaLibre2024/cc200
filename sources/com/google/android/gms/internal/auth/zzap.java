package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p064e6.C1683j;
import p079f6.AbstractC1846f;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p319w5.C5280d;

/* loaded from: classes.dex */
public final class zzap extends AbstractC2361h {
    private final Bundle zze;

    public zzap(Context context, Looper looper, C2352e c2352e, C5280d c5280d, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        super(context, looper, 128, c2352e, aVar, bVar);
        this.zze = new Bundle();
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        return queryLocalInterface instanceof zzau ? (zzau) queryLocalInterface : new zzau(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return C1683j.f6269a;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    @Override // p108h6.AbstractC2346c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
