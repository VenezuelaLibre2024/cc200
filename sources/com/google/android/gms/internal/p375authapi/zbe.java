package com.google.android.gms.internal.p375authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p079f6.AbstractC1846f;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p306v5.C5122f;
import p306v5.C5123g;

/* loaded from: classes.dex */
public final class zbe extends AbstractC2361h {
    private final C5123g zba;

    public zbe(Context context, Looper looper, C2352e c2352e, C5123g c5123g, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        super(context, looper, 68, c2352e, aVar, bVar);
        C5122f c5122f = new C5122f(c5123g == null ? C5123g.f19363k : c5123g);
        c5122f.m20796a(zbat.zba());
        this.zba = new C5123g(c5122f);
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbf ? (zbf) queryLocalInterface : new zbf(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.m20800a();
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
