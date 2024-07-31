package p260s;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p014b.InterfaceC0434a;
import p014b.InterfaceC0435b;

/* renamed from: s.f */
/* loaded from: classes.dex */
public final class C4384f {

    /* renamed from: a */
    public final Object f16097a = new Object();

    /* renamed from: b */
    public final InterfaceC0435b f16098b;

    /* renamed from: c */
    public final InterfaceC0434a f16099c;

    /* renamed from: d */
    public final ComponentName f16100d;

    /* renamed from: e */
    public final PendingIntent f16101e;

    public C4384f(InterfaceC0435b interfaceC0435b, InterfaceC0434a interfaceC0434a, ComponentName componentName, PendingIntent pendingIntent) {
        this.f16098b = interfaceC0435b;
        this.f16099c = interfaceC0434a;
        this.f16100d = componentName;
        this.f16101e = pendingIntent;
    }

    /* renamed from: a */
    public final void m16959a(Bundle bundle) {
        PendingIntent pendingIntent = this.f16101e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    /* renamed from: b */
    public final Bundle m16960b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        m16959a(bundle2);
        return bundle2;
    }

    /* renamed from: c */
    public IBinder m16961c() {
        return this.f16099c.asBinder();
    }

    /* renamed from: d */
    public ComponentName m16962d() {
        return this.f16100d;
    }

    /* renamed from: e */
    public PendingIntent m16963e() {
        return this.f16101e;
    }

    /* renamed from: f */
    public boolean m16964f(Uri uri, Bundle bundle, List<Bundle> list) {
        try {
            return this.f16098b.mo2244Z(this.f16099c, uri, m16960b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
