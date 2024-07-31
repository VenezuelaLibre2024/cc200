package p034c7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p064e6.C1683j;
import p108h6.AbstractC2346c;

/* renamed from: c7.w4 */
/* loaded from: classes.dex */
public final class C0933w4 extends AbstractC2346c<InterfaceC0821o4> {
    public C0933w4(Context context, Looper looper, AbstractC2346c.a aVar, AbstractC2346c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // p108h6.AbstractC2346c
    public final /* synthetic */ InterfaceC0821o4 createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC0821o4 ? (InterfaceC0821o4) queryLocalInterface : new C0849q4(iBinder);
    }

    @Override // p108h6.AbstractC2346c, p079f6.C1841a.f
    public final int getMinApkVersion() {
        return C1683j.f6269a;
    }

    @Override // p108h6.AbstractC2346c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // p108h6.AbstractC2346c
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
