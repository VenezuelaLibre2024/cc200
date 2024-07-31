package p139j6;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.internal.base.zaf;
import p064e6.C1671d;
import p096g6.InterfaceC2014e;
import p096g6.InterfaceC2044m;
import p108h6.AbstractC2361h;
import p108h6.C2352e;
import p108h6.C2415z;

/* renamed from: j6.e */
/* loaded from: classes.dex */
public final class C3252e extends AbstractC2361h {

    /* renamed from: h */
    public final C2415z f11353h;

    public C3252e(Context context, Looper looper, C2352e c2352e, C2415z c2415z, InterfaceC2014e interfaceC2014e, InterfaceC2044m interfaceC2044m) {
        super(context, looper, 270, c2352e, interfaceC2014e, interfaceC2044m);
        this.f11353h = c2415z;
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C3248a ? (C3248a) queryLocalInterface : new C3248a(iBinder);
    }

    @Override // p108h6.AbstractC2346c
    public final C1671d[] getApiFeatures() {
        return zaf.zab;
    }

    @Override // p108h6.AbstractC2346c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.f11353h.m9651b();
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return 203400000;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p108h6.AbstractC2346c
    public final boolean getUseDynamicLookup() {
        return true;
    }
}
