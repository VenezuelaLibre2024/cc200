package p096g6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: g6.r0 */
/* loaded from: classes.dex */
public final class C2060r0 extends BroadcastReceiver {

    /* renamed from: a */
    public Context f8131a;

    /* renamed from: b */
    public final AbstractC2057q0 f8132b;

    public C2060r0(AbstractC2057q0 abstractC2057q0) {
        this.f8132b = abstractC2057q0;
    }

    /* renamed from: a */
    public final void m8247a(Context context) {
        this.f8131a = context;
    }

    /* renamed from: b */
    public final synchronized void m8248b() {
        Context context = this.f8131a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f8131a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f8132b.mo8083a();
            m8248b();
        }
    }
}
