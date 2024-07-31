package p034c7;

import com.google.android.gms.internal.measurement.zzns;
import p108h6.C2394s;

/* renamed from: c7.a7 */
/* loaded from: classes.dex */
public final class RunnableC0625a7 implements Runnable {

    /* renamed from: h */
    public final /* synthetic */ C0871rc f2761h;

    /* renamed from: i */
    public final /* synthetic */ BinderC0823o6 f2762i;

    public RunnableC0625a7(BinderC0823o6 binderC0823o6, C0871rc c0871rc) {
        this.f2761h = c0871rc;
        this.f2762i = binderC0823o6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0968yb c0968yb;
        C0968yb c0968yb2;
        c0968yb = this.f2762i.f3394a;
        c0968yb.m4097k0();
        c0968yb2 = this.f2762i.f3394a;
        C0871rc c0871rc = this.f2761h;
        c0968yb2.zzl().mo3099i();
        c0968yb2.m4099l0();
        C2394s.m9613f(c0871rc.f3534h);
        C0810n7 m3623f = C0810n7.m3623f(c0871rc.f3524C, (zzns.zza() && c0968yb2.m4078Y().m3281o(C0733i0.f3070Q0)) ? c0871rc.f3529H : 100);
        C0810n7 m4066M = c0968yb2.m4066M(c0871rc.f3534h);
        c0968yb2.zzj().m3918F().m3997c("Setting consent, package, consent", c0871rc.f3534h, m3623f);
        c0968yb2.m4114w(c0871rc.f3534h, m3623f);
        if (m3623f.m3639t(m4066M)) {
            c0968yb2.m4077X(c0871rc);
        }
        if (zzns.zza() && c0968yb2.m4078Y().m3281o(C0733i0.f3070Q0)) {
            C0928w m3928c = C0928w.m3928c(c0871rc.f3530I);
            if (C0928w.f3681f.equals(m3928c)) {
                return;
            }
            c0968yb2.zzj().m3918F().m3997c("Setting DMA consent. package, consent", c0871rc.f3534h, m3928c);
            c0968yb2.m4113v(c0871rc.f3534h, m3928c);
        }
    }
}
