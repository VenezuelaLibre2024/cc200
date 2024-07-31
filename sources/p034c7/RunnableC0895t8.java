package p034c7;

import android.os.Bundle;
import p108h6.C2394s;

/* renamed from: c7.t8 */
/* loaded from: classes.dex */
public final class RunnableC0895t8 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ Bundle f3596h;

    /* renamed from: i */
    public final /* synthetic */ C0936w7 f3597i;

    public RunnableC0895t8(C0936w7 c0936w7, Bundle bundle) {
        this.f3596h = bundle;
        this.f3597i = c0936w7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0936w7 c0936w7 = this.f3597i;
        Bundle bundle = this.f3596h;
        c0936w7.mo3099i();
        c0936w7.m3155q();
        C2394s.m9619l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        C2394s.m9613f(string);
        C2394s.m9613f(string2);
        C2394s.m9619l(bundle.get("value"));
        if (!c0936w7.f3198a.m3503k()) {
            c0936w7.zzj().m3918F().m3995a("Conditional property not set since app measurement is disabled");
            return;
        }
        C0787lc c0787lc = new C0787lc(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C0705g0 m3767C = c0936w7.mo3096f().m3767C(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c0936w7.mo3105o().m4045y(new C0690f(bundle.getString("app_id"), string2, c0787lc, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c0936w7.mo3096f().m3767C(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), m3767C, bundle.getLong("time_to_live"), c0936w7.mo3096f().m3767C(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
