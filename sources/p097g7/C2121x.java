package p097g7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: g7.x */
/* loaded from: classes.dex */
public final class C2121x extends C2086a implements InterfaceC2123z {
    public C2121x(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p097g7.InterfaceC2123z
    /* renamed from: u */
    public final void mo8338u(Bundle bundle, InterfaceC2089b0 interfaceC2089b0) {
        Parcel m8287c = m8287c();
        C2112o.m8329c(m8287c, bundle);
        m8287c.writeStrongBinder(interfaceC2089b0);
        m8288e(2, m8287c);
    }
}
