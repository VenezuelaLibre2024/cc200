package p034c7;

import java.util.concurrent.Callable;
import p108h6.C2394s;

/* renamed from: c7.cc */
/* loaded from: classes.dex */
public final class CallableC0660cc implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ C0871rc f2844a;

    /* renamed from: b */
    public final /* synthetic */ C0968yb f2845b;

    public CallableC0660cc(C0968yb c0968yb, C0871rc c0871rc) {
        this.f2844a = c0871rc;
        this.f2845b = c0968yb;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        C0947x4 m3918F;
        String str;
        if (this.f2845b.m4066M((String) C2394s.m9619l(this.f2844a.f3534h)).m3644y() && C0810n7.m3622e(this.f2844a.f3524C).m3644y()) {
            C0710g5 m4085d = this.f2845b.m4085d(this.f2844a);
            if (m4085d != null) {
                return m4085d.m3240w0();
            }
            m3918F = this.f2845b.zzj().m3919G();
            str = "App info was null when attempting to get app instance id";
        } else {
            m3918F = this.f2845b.zzj().m3918F();
            str = "Analytics storage consent denied. Returning null app instance id";
        }
        m3918F.m3995a(str);
        return null;
    }
}
