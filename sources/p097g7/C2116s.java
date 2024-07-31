package p097g7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: g7.s */
/* loaded from: classes.dex */
public final class C2116s extends C2086a implements InterfaceC2118u {
    public C2116s(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p097g7.InterfaceC2118u
    /* renamed from: B0 */
    public final void mo8335B0(Bundle bundle, InterfaceC2120w interfaceC2120w) {
        Parcel m8287c = m8287c();
        C2112o.m8329c(m8287c, bundle);
        m8287c.writeStrongBinder(interfaceC2120w);
        m8288e(3, m8287c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p097g7.InterfaceC2118u
    /* renamed from: W0 */
    public final void mo8336W0(Bundle bundle, InterfaceC2120w interfaceC2120w) {
        Parcel m8287c = m8287c();
        C2112o.m8329c(m8287c, bundle);
        m8287c.writeStrongBinder(interfaceC2120w);
        m8288e(2, m8287c);
    }
}
