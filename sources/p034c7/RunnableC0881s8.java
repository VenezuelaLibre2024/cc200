package p034c7;

import android.os.Bundle;
import p108h6.C2394s;

/* renamed from: c7.s8 */
/* loaded from: classes.dex */
public final class RunnableC0881s8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ Bundle f3566h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3567i;

    public RunnableC0881s8(C0936w7 c0936w7, Bundle bundle) {
        this.f3566h = bundle;
        this.f3567i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0936w7 c0936w7 = this.f3567i;
        Bundle bundle = this.f3566h;
        c0936w7.mo3099i();
        c0936w7.m3155q();
        C2394s.m9619l(bundle);
        String m9613f = C2394s.m9613f(bundle.getString("name"));
        if (!c0936w7.f3198a.m3503k()) {
            c0936w7.zzj().m3918F().m3995a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c0936w7.mo3105o().m4045y(new C0690f(bundle.getString("app_id"), "", new C0787lc(m9613f, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c0936w7.mo3096f().m3767C(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
