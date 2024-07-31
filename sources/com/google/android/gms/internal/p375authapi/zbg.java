package com.google.android.gms.internal.p375authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p064e6.C1671d;
import p096g6.InterfaceC2014e;
import p096g6.InterfaceC2044m;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p335x5.C5611l;

/* loaded from: classes.dex */
public final class zbg extends AbstractC2361h {
    private final Bundle zba;

    public zbg(Context context, Looper looper, C5611l c5611l, C2352e c2352e, InterfaceC2014e interfaceC2014e, InterfaceC2044m interfaceC2044m) {
        super(context, looper, 219, c2352e, interfaceC2014e, interfaceC2044m);
        this.zba = c5611l.m22611a();
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return queryLocalInterface instanceof zbk ? (zbk) queryLocalInterface : new zbk(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final C1671d[] getApiFeatures() {
        return zbas.zbi;
    }

    @Override // p108h6.AbstractC2346c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    @Override // p108h6.AbstractC2346c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // p108h6.AbstractC2346c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
