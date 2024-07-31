package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p079f6.AbstractC1846f;
import p108h6.AbstractC2361h;
import p108h6.C2352e;

/* loaded from: classes.dex */
public final class zzy extends AbstractC2361h {
    public zzy(Context context, Looper looper, C2352e c2352e, AbstractC1846f.a aVar, AbstractC1846f.b bVar) {
        super(context, looper, 117, c2352e, aVar, bVar);
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        return queryLocalInterface instanceof zzw ? (zzw) queryLocalInterface : new zzw(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.thirdparty.START");
        return bundle;
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.thirdparty.START";
    }

    @Override // p108h6.AbstractC2346c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
