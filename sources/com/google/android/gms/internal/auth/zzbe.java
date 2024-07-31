package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import p064e6.C1683j;
import p096g6.InterfaceC2014e;
import p096g6.InterfaceC2044m;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p306v5.C5118b;
import p306v5.C5119c;

/* loaded from: classes.dex */
public final class zzbe extends AbstractC2361h {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C2352e c2352e, C5119c c5119c, InterfaceC2014e interfaceC2014e, InterfaceC2044m interfaceC2044m) {
        super(context, looper, 16, c2352e, interfaceC2014e, interfaceC2044m);
        this.zze = c5119c == null ? new Bundle() : c5119c.m20795a();
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbh(iBinder);
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
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final boolean requiresSignIn() {
        C2352e clientSettings = getClientSettings();
        return (TextUtils.isEmpty(clientSettings.m9520b()) || clientSettings.m9523e(C5118b.f19355a).isEmpty()) ? false : true;
    }

    @Override // p108h6.AbstractC2346c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
