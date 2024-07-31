package com.google.android.gms.internal.p377firebaseauthapi;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import p108h6.C2394s;
import p154k6.C3363a;
import p195n7.C3767g;
import p321w7.AbstractC5373i0;
import p321w7.C5350c1;
import p321w7.C5394o0;
import p321w7.C5397p0;
import p321w7.C5415v0;
import p321w7.InterfaceC5424y0;

/* loaded from: classes.dex */
public final class zzace {
    private static final C3363a zza = new C3363a("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzyl zzb;
    private final zzadt zzc;

    public zzace(C3767g c3767g, ScheduledExecutorService scheduledExecutorService) {
        C2394s.m9619l(c3767g);
        Context m14349m = c3767g.m14349m();
        C2394s.m9619l(m14349m);
        this.zzb = new zzyl(new zzacs(c3767g, zzact.zza()));
        this.zzc = new zzadt(m14349m, scheduledExecutorService);
    }

    private static boolean zza(long j10, boolean z10) {
        if (j10 > 0 && z10) {
            return true;
        }
        zza.m12513h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zza(zzafy zzafyVar, zzacc zzaccVar) {
        C2394s.m9619l(zzafyVar);
        this.zzb.zza(zzafyVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzagl zzaglVar, zzacc zzaccVar) {
        this.zzb.zza(zzaglVar, new zzacf((zzacc) C2394s.m9619l(zzaccVar), zza));
    }

    public final void zza(zzags zzagsVar, zzacc zzaccVar) {
        C2394s.m9619l(zzagsVar);
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(zzagsVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzagt zzagtVar, zzacc zzaccVar) {
        C2394s.m9619l(zzagtVar);
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(zzagtVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxw zzxwVar, zzacc zzaccVar) {
        C2394s.m9619l(zzxwVar);
        this.zzb.zza(zzaff.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxx zzxxVar, zzacc zzaccVar) {
        C2394s.m9619l(zzxxVar);
        C2394s.m9613f(zzxxVar.zza());
        C2394s.m9613f(zzxxVar.zzb());
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(zzxxVar.zza(), zzxxVar.zzb(), zzxxVar.zzc(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxy zzxyVar, zzacc zzaccVar) {
        C2394s.m9619l(zzaccVar);
        C2394s.m9619l(zzxyVar);
        C5394o0 c5394o0 = (C5394o0) C2394s.m9619l(zzxyVar.zza());
        this.zzb.zza(C2394s.m9613f(zzxyVar.zzb()), zzadn.zza(c5394o0), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzxz zzxzVar, zzacc zzaccVar) {
        C2394s.m9619l(zzxzVar);
        this.zzb.zza(zzafk.zza(zzxzVar.zzb(), zzxzVar.zza()), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzya zzyaVar, zzacc zzaccVar) {
        C2394s.m9619l(zzyaVar);
        C2394s.m9613f(zzyaVar.zzc());
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(zzyaVar.zzc(), zzyaVar.zza(), zzyaVar.zzd(), zzyaVar.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyb zzybVar, zzacc zzaccVar) {
        C2394s.m9619l(zzybVar);
        C2394s.m9613f(zzybVar.zzb());
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(zzybVar.zzb(), zzybVar.zza(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyc zzycVar, zzacc zzaccVar) {
        C2394s.m9619l(zzycVar);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzd(zzycVar.zza(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyd zzydVar, zzacc zzaccVar) {
        C2394s.m9619l(zzaccVar);
        C2394s.m9619l(zzydVar);
        zzafz zzafzVar = (zzafz) C2394s.m9619l(zzydVar.zza());
        String zzd = zzafzVar.zzd();
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(zzd)) {
            if (!zzafzVar.zze()) {
                this.zzc.zzb(zzacfVar, zzd);
                return;
            }
            this.zzc.zzc(zzd);
        }
        long zzb = zzafzVar.zzb();
        boolean zzf = zzafzVar.zzf();
        if (zza(zzb, zzf)) {
            zzafzVar.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(zzd, zzacfVar, zzb, zzf);
        this.zzb.zza(zzafzVar, this.zzc.zza(zzacfVar, zzd));
    }

    public final void zza(zzye zzyeVar, zzacc zzaccVar) {
        C2394s.m9619l(zzaccVar);
        C2394s.m9619l(zzyeVar);
        this.zzb.zza(zzadn.zza((C5394o0) C2394s.m9619l(zzyeVar.zza())), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyf zzyfVar, zzacc zzaccVar) {
        C2394s.m9619l(zzyfVar);
        C2394s.m9619l(zzyfVar.zza());
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(zzyfVar.zza(), zzyfVar.zzb(), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyg zzygVar, zzacc zzaccVar) {
        C2394s.m9619l(zzygVar);
        this.zzb.zza(zzafd.zza(zzygVar.zza(), zzygVar.zzb(), zzygVar.zzc()), new zzacf(zzaccVar, zza));
    }

    public final void zza(zzyh zzyhVar, zzacc zzaccVar) {
        C2394s.m9619l(zzyhVar);
        C2394s.m9619l(zzaccVar);
        String m21551m = zzyhVar.zzb().m21551m();
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(m21551m)) {
            if (!zzyhVar.zzg()) {
                this.zzc.zzb(zzacfVar, m21551m);
                return;
            }
            this.zzc.zzc(m21551m);
        }
        long zza2 = zzyhVar.zza();
        boolean zzh = zzyhVar.zzh();
        zzagh zza3 = zzagh.zza(zzyhVar.zzd(), zzyhVar.zzb().mo21515b(), zzyhVar.zzb().m21551m(), zzyhVar.zzc(), zzyhVar.zzf(), zzyhVar.zze());
        if (zza(zza2, zzh)) {
            zza3.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(m21551m, zzacfVar, zza2, zzh);
        this.zzb.zza(zza3, this.zzc.zza(zzacfVar, m21551m));
    }

    public final void zza(String str, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(str, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, zzags zzagsVar, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzagsVar);
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(str, zzagsVar, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, long j10, boolean z10, boolean z11, String str4, String str5, boolean z12, zzacc zzaccVar) {
        C2394s.m9614g(str, "idToken should not be empty.");
        C2394s.m9619l(zzaccVar);
        zzacf zzacfVar = new zzacf(zzaccVar, zza);
        if (this.zzc.zzd(str2)) {
            zzadt zzadtVar = this.zzc;
            if (!z10) {
                zzadtVar.zzb(zzacfVar, str2);
                return;
            }
            zzadtVar.zzc(str2);
        }
        zzagj zza2 = zzagj.zza(str, str2, str3, str4, str5, null);
        if (zza(j10, z12)) {
            zza2.zza(new zzaed(this.zzc.zzb()));
        }
        this.zzc.zza(str2, zzacfVar, j10, z12);
        this.zzb.zza(zza2, this.zzc.zza(zzacfVar, str2));
    }

    public final void zza(String str, String str2, String str3, zzacc zzaccVar) {
        C2394s.m9614g(str, "cachedTokenState should not be empty.");
        C2394s.m9614g(str2, "uid should not be empty.");
        C2394s.m9619l(zzaccVar);
        this.zzb.zzb(str, str2, str3, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(str, str2, str3, str4, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, String str2, String str3, String str4, String str5, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9613f(str3);
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(str, str2, str3, str4, str5, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, C5350c1 c5350c1, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(c5350c1);
        C2394s.m9619l(zzaccVar);
        this.zzb.zza(str, c5350c1, new zzacf(zzaccVar, zza));
    }

    public final void zza(String str, AbstractC5373i0 abstractC5373i0, String str2, zzacc zzaccVar) {
        zzyl zzylVar;
        zzaes zza2;
        zzacf zzacfVar;
        C2394s.m9613f(str);
        C2394s.m9619l(abstractC5373i0);
        C2394s.m9619l(zzaccVar);
        if (abstractC5373i0 instanceof C5397p0) {
            C5394o0 m21547a = ((C5397p0) abstractC5373i0).m21547a();
            zzylVar = this.zzb;
            zza2 = zzaet.zza(str, (String) C2394s.m9619l(m21547a.zzc()), (String) C2394s.m9619l(m21547a.m21543L()), str2);
            zzacfVar = new zzacf(zzaccVar, zza);
        } else {
            if (!(abstractC5373i0 instanceof C5415v0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            C5415v0 c5415v0 = (C5415v0) abstractC5373i0;
            zzylVar = this.zzb;
            zza2 = zzaev.zza(str, C2394s.m9613f(c5415v0.m21558c()), str2, C2394s.m9613f(c5415v0.m21557b()));
            zzacfVar = new zzacf(zzaccVar, zza);
        }
        zzylVar.zza(zza2, zzacfVar);
    }

    public final void zza(AbstractC5373i0 abstractC5373i0, String str, String str2, String str3, zzacc zzaccVar) {
        zzaeq zza2;
        C2394s.m9619l(abstractC5373i0);
        C2394s.m9614g(str, "cachedTokenState should not be empty.");
        C2394s.m9619l(zzaccVar);
        if (abstractC5373i0 instanceof C5397p0) {
            C5394o0 m21547a = ((C5397p0) abstractC5373i0).m21547a();
            zza2 = zzaeu.zza(str, (String) C2394s.m9619l(m21547a.zzc()), (String) C2394s.m9619l(m21547a.m21543L()), str2, str3);
        } else {
            if (!(abstractC5373i0 instanceof C5415v0)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            C5415v0 c5415v0 = (C5415v0) abstractC5373i0;
            zza2 = zzaew.zza(str, C2394s.m9613f(str2), C2394s.m9613f(((InterfaceC5424y0) C2394s.m9619l(c5415v0.m21556a())).mo21574c()), C2394s.m9613f(c5415v0.m21558c()), str3);
        }
        this.zzb.zza(zza2, str, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzb(str, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, String str2, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzb(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzb(String str, String str2, String str3, String str4, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzaccVar);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzb(str, str2, str3, str4, new zzacf(zzaccVar, zza));
    }

    public final void zzc(String str, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzc(str, new zzacf(zzaccVar, zza));
    }

    public final void zzc(String str, String str2, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzc(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzd(String str, zzacc zzaccVar) {
        C2394s.m9619l(zzaccVar);
        this.zzb.zze(str, new zzacf(zzaccVar, zza));
    }

    public final void zzd(String str, String str2, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzd(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zze(String str, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzf(str, new zzacf(zzaccVar, zza));
    }

    public final void zze(String str, String str2, zzacc zzaccVar) {
        C2394s.m9613f(str);
        this.zzb.zze(str, str2, new zzacf(zzaccVar, zza));
    }

    public final void zzf(String str, String str2, zzacc zzaccVar) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C2394s.m9619l(zzaccVar);
        this.zzb.zzf(str, str2, new zzacf(zzaccVar, zza));
    }
}
