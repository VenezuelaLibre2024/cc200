package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p064e6.C1671d;
import p079f6.AbstractC1846f;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p278t6.C4709a;

/* loaded from: classes.dex */
public final class zzk extends AbstractC2361h {
    public zzk(Context context, Looper looper, C2352e c2352e, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        super(context, looper, 149, c2352e, aVar, bVar);
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        return queryLocalInterface instanceof zzn ? (zzn) queryLocalInterface : new zzn(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final C1671d[] getApiFeatures() {
        return new C1671d[]{C4709a.f17577h, C4709a.f17578i};
    }

    @Override // p108h6.AbstractC2346c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return bundle;
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    @Override // p108h6.AbstractC2346c
    public final boolean usesClientTelemetry() {
        return true;
    }
}