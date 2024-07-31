package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p064e6.C1671d;
import p064e6.C1683j;
import p079f6.AbstractC1846f;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p277t5.C4702k;
import p291u5.AbstractBinderC4898f;

/* loaded from: classes.dex */
public final class zzam extends AbstractC2361h {
    public zzam(Context context, Looper looper, C2352e c2352e, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        super(context, looper, 120, c2352e, aVar, bVar);
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        return AbstractBinderC4898f.m19465c(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final C1671d[] getApiFeatures() {
        return new C1671d[]{C4702k.f17552n};
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return C1683j.f6269a;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // p108h6.AbstractC2346c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
